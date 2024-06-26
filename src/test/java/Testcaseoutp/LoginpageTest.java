package Testcaseoutp;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import CommonElements.CommonHelp;
import PageObject.LoginPage;
import baseclass.BaseTestclass;
import manageUtils.ConvertEx;
import manageUtils.Log;
import manageUtils.ReadExcel;

public class LoginpageTest extends BaseTestclass {

	LoginPage lp;
	String ExcelFilePath = "C:\\Users\\dell\\eclipse-workspace\\Asttrokautomation\\src\\test\\resources\\data.xlsx";

	@BeforeMethod
	public void launchbrowser() {
		loadConfig();
		System.out.println("lodconf runned");

	}

	@AfterMethod
	public void quitbrowser() {

		driver.quit();
	}

	@Test(priority = 1)
	public void loginTestmethod()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		lp = new LoginPage();
		System.out.println("lodconf runned for login");

		// extent.createTest("loginTestcases");
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");

		// String valid = ReadExcel.readExcelCell(1, 3);

		lp.logincase(prop.getProperty("username"), prop.getProperty("password"));
		driver.findElement(By.xpath("//span[normalize-space()='Log out']")).click();

		String no = ReadExcel.readExcelCell(1, 0);
		String testcasename = ReadExcel.readExcelCell(1, 1);
		String Testdescription = ReadExcel.readExcelCell(1, 2);
		String valid = ReadExcel.readExcelCell(1, 3);
		System.out.println("valid value is showing " + valid);
		if (valid.equalsIgnoreCase("valid")) {
			System.out.println("entered into the if ");

			ReadExcel rc = new ReadExcel();
			rc.startTestcase(testcasename, no, 1, Testdescription, "pass", "none");

		} else {
			Thread.sleep(4000);
			driver.findElement(lp.homelink).click();

			driver.findElement(lp.navbtnl).click();

			ReadExcel.readExcelCell(0, 0);
			ReadExcel rc = new ReadExcel();

			rc.startTestcase(testcasename, no, 1, " logged  in", "fail", "user");

		}

	}

	@Test(priority = 2)
	public void loginforAdmintest() throws IOException {

		System.out.println("loginforAdmintest");
		manageUtils.Log.startTestCase("loginTest started");

		lp = new LoginPage();
		try {
			ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// String valid = ReadExcel.readExcelCell(1, 3);

		manageUtils.Log.info("clicked on the login button");
		manageUtils.Log.info("Login is Sucess for admin");

		try {
			// lp.logincase("balmukund.sahu@rechargestudio.com","123456");
			lp.logincase(prop.getProperty("aduname"), prop.getProperty("adpass"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonHelp.scrollToElementView(lp.adminlogut);
		lp.adminlogout();
		Log.endTestCase("testcase is closed");

		String s = driver.getCurrentUrl();
		{
			String S1 = "https://www.asttrolok.com/login";
			if (s != S1) {
				driver.get(S1);

			}

		}

		String no = ReadExcel.readExcelCell(2, 0);
		String testcasename = ReadExcel.readExcelCell(2, 1);
		String result = ReadExcel.readExcelCell(2, 2);
		String valid = ReadExcel.readExcelCell(2, 3);
		ReadExcel rc = new ReadExcel();

		if (valid.equalsIgnoreCase("admin"))

		{

			rc.startTestcase(testcasename, no, 2, "admin is  logged  in", "pass", "admin");
			System.out.println("trying to click on the admin");
			// By adlogout = By.xpath("//span[normalize-space()='Logout']");
			// CommonHelp.clickOnElement_JS(adlogout);

		} else {

			rc.startTestcase(testcasename, "4", 2, "user should not be logged in", "fail", "admin");

		}

	}

	public void getdata() {
		ConvertEx bc = new ConvertEx();
		bc.Genratepdf();

	}

	@Test(priority = 3)
	public void secondtest() {

		System.out.println(driver.getTitle());

	}

}
