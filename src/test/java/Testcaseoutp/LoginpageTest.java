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
	// String ExcelFilePath =
	// "C:\\Users\\dell\\eclipse-workspace\\Asttrokautomation\\src\\test\\resources\\data.xlsx";

	String ExcelFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\data.xlsx";

	@BeforeMethod
	public void launchbrowser() {
		loadConfig();
		System.out.println(ExcelFilePath);
	}

	@AfterMethod
	public void quitbrowser() {

		driver.quit();
	}

	@Test(priority = 1)
	public void loginTestmethod()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		lp = new LoginPage();

		// lp.logincase(prop.getProperty("username"), prop.getProperty("password"));
		// lp.clickonhomelink();

		// lp.userlogout();
		// lp.getstudentnametext();
		// String email = lp.clickonseting();

		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(1, 0);
		String testcasename = ReadExcel.readExcelCell(1, 1);
		String Testdescr = ReadExcel.readExcelCell(1, 2);
		String result = ReadExcel.readExcelCell(1, 3);
		String Comments = ReadExcel.readExcelCell(1, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();

		// System.out.println(email);
		// Assert.assertEquals(email, prop.getProperty("username"));
		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);

	}

	// @Test(priority = 2)
	public void loginTestmethodinvalid()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		lp = new LoginPage();
		lp.logincase(prop.getProperty("invalidusername"), prop.getProperty("inavalidpass"));

		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");

		// lp.userlogout();
		String srno = ReadExcel.readExcelCell(3, 0);
		String testcasename = ReadExcel.readExcelCell(3, 1);
		String Testdescr = ReadExcel.readExcelCell(3, 2);
		String result = ReadExcel.readExcelCell(3, 3);
		String Comments = ReadExcel.readExcelCell(3, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();
		By worngcred = By.xpath("//div[@class='invalid-feedback']");
		String errortext = driver.findElement(worngcred).getText();

		if (true) {
			Assert.assertEquals(errortext, "The password or username is incorrect.");

			rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);

		} else {

			rc.startTestcase(testcasename, srno, indexno, Testdescr, result, result);

		}

	}

	// @Test(priority = 3)
	public void loginforAdmintest() throws IOException, EncryptedDocumentException, InvalidFormatException {

		lp = new LoginPage();

		try {
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

		String srno = ReadExcel.readExcelCell(3, 0);
		String testcasename = ReadExcel.readExcelCell(3, 1);
		String Testdescr = ReadExcel.readExcelCell(3, 2);
		String result = ReadExcel.readExcelCell(3, 3);
		String Comments = ReadExcel.readExcelCell(3, 4);
		ReadExcel rc = new ReadExcel();

		if (true)

		{

			rc.startTestcase(testcasename, srno, 3, Testdescr, result, Comments);

		} else {

			rc.startTestcase(testcasename, srno, 3, Testdescr, result, Comments);

		}

	}

}