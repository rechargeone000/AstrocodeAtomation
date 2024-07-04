package Testcaseoutp;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import CommonElements.CommonHelp;
import PageObject.ConsultationPage;
import PageObject.HomePaget;
import PageObject.LoginPage;
import baseclass.BaseTestclass;
import manageUtils.Log;
import manageUtils.ReadExcel;

public class consultationPageTest extends BaseTestclass {
	String ExcelFilePath = "C:\\Users\\dell\\eclipse-workspace\\Asttrokautomation\\src\\test\\resources\\data.xlsx";

	ConsultationPage cp = new ConsultationPage();

	HomePaget hm = new HomePaget();
	LoginPage lp = new LoginPage();

	@BeforeMethod
	public void launchbrowser() {

		loadConfig();
		Log.info("browser has launched");
	}

	@AfterMethod
	public void quitbrowser() {

		driver.quit();
		Log.info("browser has closed");
	}

	@Test(priority = 32)
	public void consultationAstrolisttest() {
		Log.info("consultationAstrolisttest is started");

		try {
			lp.logincase(prop.getProperty("userrrr"), prop.getProperty("passss"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cp.consulationpageClicohomelink();
		Log.info("consultationAstrolisttest is closed");

		System.out.println("Astrologer lis is shown");
		
		ReadExcel rc = new ReadExcel();
		String Testcasename = ReadExcel.readExcelCell(3, 1);
		String Testcasedescription = ReadExcel.readExcelCell(3, 2);
		String TestCaseresult = ReadExcel.readExcelCell(3, 3);
		rc.startTestcase(Testcasename, "3", 3, Testcasedescription, "pass", "page  is  open");

	}

	@Test(priority = 33)
	public void bookConsultation() throws InterruptedException {
		Log.info("bookConsultation is started");
		try {
			lp.logincase(prop.getProperty("userrrr"), prop.getProperty("passss"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cp.consulationpageClicohomelink();
		cp.clickonthebookbtn();
		Log.info("bookConsultation is closed");
		ReadExcel rc = new ReadExcel();
		String Testcasename = ReadExcel.readExcelCell(3, 1);
		String Testcasedescription = ReadExcel.readExcelCell(3, 2);
		String TestCaseresult = ReadExcel.readExcelCell(3, 3);
		System.out.println("test started1");
		rc.startTestcase(Testcasename, "3", 3, Testcasedescription, "pass", "page  is  open");
	}

	@Test(priority = 33)
	public void select() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {
		Log.info("select is started");
		try {
			lp.logincase(prop.getProperty("username"), prop.getProperty("password"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cp.consulationpageClicohomelink();

		cp.clickonthebookbtn();
		Log.info("cickedon the book button ");
		cp.selecttime();
		Log.info("cickedon the select the book time 30 min ");

		cp.selectmeetingdate();
		Log.info("cickedon the select the meeting time ");
		cp.reservetime();
		Log.info("cickedon the select the reservetime time ");

		Thread.sleep(4000);
		cp.paymentform();
		Log.info("cickedon paymentform is filled ");
		Thread.sleep(3000);
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		ReadExcel rc = new ReadExcel();
		String Testcasename = ReadExcel.readExcelCell(4, 1);
		String Testcasedescription = ReadExcel.readExcelCell(4, 2);
		String TestCaseresult = ReadExcel.readExcelCell(4, 3);
		
		Log.info("select is started");
		rc.startTestcase(Testcasename, "4", 4, Testcasedescription, "pass", "page  is  open");

	}

}
