package Testcaseoutp;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.testng.Assert;
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

		lp.logincase(prop.getProperty("username"), prop.getProperty("password"));
		// lp.userlogout();
		lp.getstudentnametext();
		String email = lp.clickonseting();

		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");

		String no = ReadExcel.readExcelCell(1, 0);
		String testcasename = ReadExcel.readExcelCell(1, 1);
		String Testdescription = ReadExcel.readExcelCell(1, 2);
		String valid = ReadExcel.readExcelCell(1, 3);
		ReadExcel rc = new ReadExcel();

		if (true) {
			System.out.println(email);
			Assert.assertEquals(email, prop.getProperty("username"));
			rc.startTestcase(testcasename, no, 1, Testdescription, "pass", "none");

		} else {

			rc.startTestcase(testcasename, no, 1, Testdescription, "fail", "user is diffrent");

		}

	}

	@Test(priority = 2)
	public void loginTestmethodinvalid()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		lp = new LoginPage();

		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		lp.logincase(prop.getProperty("invalidusername"), prop.getProperty("inavalidpass"));
		// lp.userlogout();
		String no = ReadExcel.readExcelCell(1, 0);
		String testcasename = ReadExcel.readExcelCell(1, 1);
		String Testdescription = ReadExcel.readExcelCell(1, 2);
		String valid = ReadExcel.readExcelCell(1, 3);
		ReadExcel rc = new ReadExcel();

		if (true) {
			String errortext = driver.findElement(By.xpath("//div[@class='invalid-feedback']")).getText();
			Assert.assertEquals(errortext, "The password or username is incorrect");
			rc.startTestcase(testcasename, no, 2, Testdescription, "pass", "withinvalid");

		} else {

			rc.startTestcase(testcasename, no, 2, Testdescription, "fail", "withinvalid");

		}

	}

	// @Test(priority = 3)
	public void loginforAdmintest() throws IOException, EncryptedDocumentException, InvalidFormatException {

		lp = new LoginPage();

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
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");

		String no = ReadExcel.readExcelCell(3, 0);
		String testcasename = ReadExcel.readExcelCell(3, 1);
		String result = ReadExcel.readExcelCell(3, 2);
		String valid = ReadExcel.readExcelCell(3, 3);
		ReadExcel rc = new ReadExcel();

		if (valid.equalsIgnoreCase("admin"))

		{

			rc.startTestcase(testcasename, no, 3, "admin is  logged  in", "pass", "admin");

		} else {

			rc.startTestcase(testcasename, "4", 3, "user should not be logged in", "fail", "admin");

		}

	}

	@Test(priority = 3)
	public void secondtest() {

		System.out.println(driver.getTitle());

	}

}
