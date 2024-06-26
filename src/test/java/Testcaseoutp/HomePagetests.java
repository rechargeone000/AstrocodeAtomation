package Testcaseoutp;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import CommonElements.CommonHelp;
import PageObject.HomePaget;
import PageObject.LoginPage;
import baseclass.BaseTestclass;
import manageUtils.ReadExcel;

public class HomePagetests extends BaseTestclass {

	HomePaget hm;
	LoginPage lp;

	String ExcelFilePath = "C:\\Users\\dell\\eclipse-workspace\\Asttrokautomation\\src\\test\\resources\\data.xlsx";

	@BeforeMethod
	public void launchbrowser() {
		System.out.println("lodconf runned for llll");

		loadConfig();

	}

	@AfterMethod
	public void quitbrowser() {

		driver.quit();
	}

	@Test(alwaysRun = true)
	public void Logoicondesplayed()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		System.out.println("lodconf runned for home1");

		System.out.println("enterd in theLogoicond esplayed ");
		hm = new HomePaget();

		manageUtils.Log.startTestCase("Logoicondesplayed  Logoicondesplayed ");
		
		hm.Logoicon();
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		manageUtils.Log.endTestCase("endtestcase");

		ReadExcel rc = new ReadExcel();
		String Testcasename = ReadExcel.readExcelCell(3, 1);
		String Testcasedescription = ReadExcel.readExcelCell(3, 2);
		String TestCaseresult = ReadExcel.readExcelCell(3, 3);
		System.out.println("test started1");
		rc.startTestcase(Testcasename, "3", 3, Testcasedescription, "pass", "page  is  open");

	}

	@Test(priority = 4)
	public void OnlineCunsultation() throws IOException, EncryptedDocumentException, InvalidFormatException {
		hm = new HomePaget();
		setup();
		hm.onlineconsuatation();
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		ReadExcel rc = new ReadExcel();
		String Testcasename = ReadExcel.readExcelCell(4, 1);
		String Testcasedescription = ReadExcel.readExcelCell(4, 2);
		String TestCaseresult = ReadExcel.readExcelCell(4, 3);
		System.out.println("test started1");

		rc.startTestcase(Testcasename, "4", 4, Testcasedescription, "pass", "page  is  open");
	}

	@Test(priority = 5)
	public void personalizedreport() throws IOException, EncryptedDocumentException, InvalidFormatException {
		hm = new HomePaget();
		setup();

		hm.personalizedreport();
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		ReadExcel rc = new ReadExcel();
		String Testcasename = ReadExcel.readExcelCell(5, 1);
		String Testcasedescription = ReadExcel.readExcelCell(5, 2);
		String TestCaseresult = ReadExcel.readExcelCell(5, 3);
		System.out.println("test started1");

		rc.startTestcase(Testcasename, "5", 5, Testcasedescription, "pass", "page  is  open");

	}

	public void knowmore() throws InterruptedException {

		hm = new HomePaget();
		hm.knowmorebtn();

	}

	// @Test(priority = 6)
	public void viewallfirsthind()
			throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException {
		hm = new HomePaget();
		lp = new LoginPage();
		setup();

		hm.viewallbtnhndi();
		ReadExcel rc = new ReadExcel();
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");

		String Testcasename = ReadExcel.readExcelCell(6, 1);
		String Testcasedescription = ReadExcel.readExcelCell(6, 2);
		String TestCaseresult = ReadExcel.readExcelCell(6, 3);
		rc.startTestcase(Testcasename, "6", 6, Testcasedescription, "hinsi course", "no comment");
		System.out.println("test started1");

		// lp.logincase("mayank@rechargestudio.com", "123456");
		// hm.onlinecourse();

	}

	// @Test(priority = 7)
	public void viewallenglish()
			throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException {
		hm = new HomePaget();
		lp = new LoginPage();
		setup();

		System.out.println("Testcase is started");

		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		ReadExcel rc = new ReadExcel();
		String Testcasename = ReadExcel.readExcelCell(7, 1);
		String TestCaseresult = ReadExcel.readExcelCell(7, 3);
		hm.viewallbtnenglish();
		rc.startTestcase(Testcasename, "7", 7, "description", "pass", "no comment");
	}

	// @Test(priority = 8)
	public void viewallAstro() throws InterruptedException, IOException {

		hm = new HomePaget();
		lp = new LoginPage();
		setup();

		System.out.println("Testcase is started");
		hm.clickonviewallastrbtn();
		hm.viewallAstrologers();
		try {
			ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ReadExcel rc = new ReadExcel();
		String Testcasename = ReadExcel.readExcelCell(8, 1);
		String Testcasedescription = ReadExcel.readExcelCell(8, 2);
		String TestCaseresult = ReadExcel.readExcelCell(8, 3);
		rc.startTestcase(Testcasename, "8", 8, Testcasedescription, "pass", "no comment");

	}

	// @Test(priority = 9)
	public void viewallinstructorrr() throws InterruptedException, IOException {
		try {
			ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		hm = new HomePaget();
		lp = new LoginPage();
		setup();

		hm.viewallbtninstructor();
		ReadExcel rc = new ReadExcel();
		String Testcasename = ReadExcel.readExcelCell(9, 1);
		String Testcasedescription = ReadExcel.readExcelCell(9, 2);
		String TestCaseresult = ReadExcel.readExcelCell(9, 3);
		rc.startTestcase(Testcasename, "9", 9, "instructor", "pass", "no comment");
	}

	// @Test(priority = 10)
	public void contactuspage() throws InterruptedException, IOException {
		hm = new HomePaget();
		setup();

		hm.linkoffooter();
		ReadExcel rc = new ReadExcel();
		String Testcasename = ReadExcel.readExcelCell(10, 1);
		String Testcasedescription = ReadExcel.readExcelCell(10, 2);
		String TestCaseresult = ReadExcel.readExcelCell(10, 3);
		rc.startTestcase(Testcasename, "10", 10, "description", "pass", "comment");

	}

	// @Test(priority = 11)
	public void socialmedialiinksmethos() throws IOException, InterruptedException {
		hm = new HomePaget();
		setup();

		hm.socialmedialinks();
		ReadExcel rc = new ReadExcel();
		String Testcasename = ReadExcel.readExcelCell(10, 1);
		String Testcasedescription = ReadExcel.readExcelCell(10, 2);
		String TestCaseresult = ReadExcel.readExcelCell(10, 3);
		rc.startTestcase(Testcasename, "11", 11, "description", "pass", "comment");
	}

	// @Test(priority = 12)
	public void addresstes() throws IOException {
		hm = new HomePaget();
		setup();

		String adddtext = hm.addresst();
		String actualaddres = "312, 3rd Floor, Vikram Urbane, 25-A Mechanic Nagar Extn. Sch# 54, Indore(MP) 452010";

		Assert.assertEquals(adddtext, actualaddres);
		try {
			ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ReadExcel rc = new ReadExcel();
		String Testcasename = ReadExcel.readExcelCell(12, 1);
		String Testcasedescription = ReadExcel.readExcelCell(12, 2);
		String TestCaseresult = ReadExcel.readExcelCell(12, 3);
		rc.startTestcase(Testcasename, "12", 12, "description", "pass", "comment");
	}

	// @Test(priority = 13)
	public void getintouchEmail() throws IOException {
		setup();

		By emailinput = By.xpath("//input[@placeholder='Enter your email here']");
		By joinbtn = By.xpath("//button[normalize-space()='Join']");
		CommonHelp.enterValues(emailinput, "balmukundsahu@rechargestudio.com");
		CommonHelp.clickOnElement(joinbtn);

		try {
			ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ReadExcel rc = new ReadExcel();
		String Testcasename = ReadExcel.readExcelCell(13, 1);
		String Testcasedescription = ReadExcel.readExcelCell(13, 2);
		String TestCaseresult = ReadExcel.readExcelCell(13, 3);
		rc.startTestcase(Testcasename, "13", 13, "description", "pass", "comment");

	}

}
