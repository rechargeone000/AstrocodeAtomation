package Testcaseoutp;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObject.AdminPage;
import PageObject.LoginPage;
import baseclass.BaseTestclass;
import manageUtils.ReadExcel;

public class AdminTest extends BaseTestclass {

	AdminPage ap = new AdminPage();
	String ExcelFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\data.xlsx";

	@BeforeMethod
	public void launchbrowser() {

		String url = "https://lms.asttrolok.in";
		loadConfig(url);

	}

	@AfterMethod
	public void quitbrowser() {

		driver.quit();
	}

	// @Test(priority=1)
	public void CreateCoursetest() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {

		LoginPage lp = new LoginPage();
		try {
			lp.logincase("astrolok.vedic@gmail.com", "admin@112211");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ap.Clickothecoursetab();
		Thread.sleep(2000);
		ap.clickonthenewcourse();
		Thread.sleep(2000);
		ap.selelectlangdrop();
		Thread.sleep(2000);
		ap.Title();
		Thread.sleep(2000);
		ap.CourseURL();
		Thread.sleep(2000);
		ap.Instrucktor();
		// ap.uploadpath();
		Thread.sleep(4000);

		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(1, 0);
		String testcasename = ReadExcel.readExcelCell(1, 1);
		String Testdescr = ReadExcel.readExcelCell(1, 2);
		String result = ReadExcel.readExcelCell(1, 3);
		String Comments = ReadExcel.readExcelCell(1, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();

		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);
	}

//	@Test(priority=2)

	public void Coupancode() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {

		LoginPage lp = new LoginPage();
		try {
			lp.logincase("astrolok.vedic@gmail.com", "admin@112211");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();//
		}
		ap.Coupancode();
		Thread.sleep(30000);

		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(1, 0);
		String testcasename = ReadExcel.readExcelCell(1, 1);
		String Testdescr = ReadExcel.readExcelCell(1, 2);
		String result = ReadExcel.readExcelCell(1, 3);
		String Comments = ReadExcel.readExcelCell(1, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();

		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);
	}

	@Test
	public void discounnt() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {
		LoginPage lp = new LoginPage();
		try {
			lp.logincase("astrolok.vedic@gmail.com", "admin@112211");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();//
		}
		ap.Discount();
		Thread.sleep(2000);
		ReadExcel rc = new ReadExcel();

		// rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);
	}

	@Test
	public void UsersTest() {

	}

}
