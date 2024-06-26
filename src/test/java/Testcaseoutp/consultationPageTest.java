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
import manageUtils.ReadExcel;

public class consultationPageTest extends BaseTestclass {
	String ExcelFilePath = "C:\\Users\\dell\\eclipse-workspace\\Asttrokautomation\\src\\test\\resources\\data.xlsx";

	ConsultationPage cp = new ConsultationPage();

	HomePaget hm = new HomePaget();
	LoginPage lp = new LoginPage();

	@BeforeMethod
	public void launchbrowser() {

		loadConfig();

	}

	@AfterMethod
	public void quitbrowser() {

		 driver.quit();
	}

	@Test(priority = 32)
	public void consultationAstrolisttest() {
		System.out.println("first");

		try {
			lp.logincase(prop.getProperty("userrrr"), prop.getProperty("passss"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cp.consulationpageClicohomelink();

		System.out.println("Astrologer lis is shown");
		ReadExcel rc = new ReadExcel();
		String Testcasename = ReadExcel.readExcelCell(3, 1);
		String Testcasedescription = ReadExcel.readExcelCell(3, 2);
		String TestCaseresult = ReadExcel.readExcelCell(3, 3);
		System.out.println("test started1");
		rc.startTestcase(Testcasename, "3", 3, Testcasedescription, "pass", "page  is  open");

	}

	@Test(priority = 33)
	public void bookConsultation() throws InterruptedException {

		try {
			lp.logincase(prop.getProperty("userrrr"), prop.getProperty("passss"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cp.consulationpageClicohomelink();
		cp.clickonthebookbtn();
		ReadExcel rc = new ReadExcel();
		String Testcasename = ReadExcel.readExcelCell(3, 1);
		String Testcasedescription = ReadExcel.readExcelCell(3, 2);
		String TestCaseresult = ReadExcel.readExcelCell(3, 3);
		System.out.println("test started1");
		rc.startTestcase(Testcasename, "3", 3, Testcasedescription, "pass", "page  is  open");
	}

	@Test(priority = 33)
	public void select() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {

		try {
			lp.logincase(prop.getProperty("username"), prop.getProperty("password"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cp.consulationpageClicohomelink();

		cp.clickonthebookbtn();
		cp.selecttime();
		cp.selectmeetingdate();
		cp.reservetime();
		Thread.sleep(4000);
		cp.paymentform();
		Thread.sleep(3000);
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		ReadExcel rc = new ReadExcel();
		String Testcasename = ReadExcel.readExcelCell(4, 1);
		String Testcasedescription = ReadExcel.readExcelCell(4, 2);
		String TestCaseresult = ReadExcel.readExcelCell(4, 3);
		System.out.println("test started1");

		rc.startTestcase(Testcasename, "4", 4, Testcasedescription, "pass", "page  is  open");

	}

}
