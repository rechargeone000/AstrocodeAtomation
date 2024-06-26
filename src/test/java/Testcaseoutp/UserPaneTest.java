package Testcaseoutp;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObject.LoginPage;
import PageObject.UserPanel;
import baseclass.BaseTestclass;
import jdk.internal.org.jline.utils.Log;
import manageUtils.ReadExcel;

public class UserPaneTest extends BaseTestclass {

	UserPanel up = new UserPanel();
	LoginPage lp = new LoginPage();
	String ExcelFilePath = "C:\\Users\\dell\\eclipse-workspace\\Asttrokautomation\\src\\test\\resources\\data.xlsx";

	@BeforeMethod
	public void launchbrowser() {
		
			loadConfig();
		

	}

	@AfterMethod
	public void quitbrowser() {

		driver.quit();
	}

	// @Test(priority = 14)
	public void checklearningPage() throws InterruptedException, IOException {
		up = new UserPanel();
		lp = new LoginPage();

		Thread.sleep(4000);
		try {

			lp.logincase(prop.getProperty("userrrr"), prop.getProperty("passss"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		up.dashboardbtton();
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
		String Testcasename = ReadExcel.readExcelCell(14, 1);
		String Testcasedescription = ReadExcel.readExcelCell(14, 2);
		String TestCaseresult = ReadExcel.readExcelCell(14, 3);
		System.out.println("test started1");
		rc.startTestcase(Testcasename, "3", 3, Testcasedescription, "pass", "page  is  open");

	}

	// @Test(priority = 15)
	public void coursespagetest() throws InterruptedException, IOException {
		up = new UserPanel();
		lp = new LoginPage();
		setup();
		lp.logincase(prop.getProperty("userrrr"), prop.getProperty("passss"));

		up.courses();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		String Testcasename = ReadExcel.readExcelCell(15, 1);
		String Testcasedescription = ReadExcel.readExcelCell(15, 2);
		String TestCaseresult = ReadExcel.readExcelCell(15, 3);
		System.out.println("test started1");
		rc.startTestcase(Testcasename, "3", 15, Testcasedescription, "pass", "page  is  open");

	}

	// @Test(priority = 16)
	public void purchasesection() throws InterruptedException, IOException {
		up = new UserPanel();
		lp = new LoginPage();
		setup();
		System.out.println("login with base");
		lp.logincase(prop.getProperty("userrrr"), prop.getProperty("passss"));

		up.dashboardbtton();
		up.courses();
		up.mypurchssection();
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
		String Testcasename = ReadExcel.readExcelCell(14, 1);
		String Testcasedescription = ReadExcel.readExcelCell(14, 2);
		String TestCaseresult = ReadExcel.readExcelCell(3, 3);
		System.out.println("test started1");
		rc.startTestcase(Testcasename, "16", 16, Testcasedescription, "pass", "page  is  open");

	}

	// @Test(priority = 17)
	public void mycomments() {
		up = new UserPanel();
		lp = new LoginPage();
		setup();
		try {
			lp.logincase(prop.getProperty("userrrr"), prop.getProperty("passss"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		up.dashboardbtton();
		up.courses();
		up.mycomments();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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
		String Testcasename = ReadExcel.readExcelCell(14, 1);
		String Testcasedescription = ReadExcel.readExcelCell(14, 2);
		String TestCaseresult = ReadExcel.readExcelCell(3, 3);
		System.out.println("test started1");
		rc.startTestcase(Testcasename, "16", 16, Testcasedescription, "pass", "page  is  open");

	}

	// @Test(priority = 18)
	public void favoritesection() throws InterruptedException {
		up = new UserPanel();
		lp = new LoginPage();

		lp.logincase(prop.getProperty("userrrr"), prop.getProperty("passss"));

		up.dashboardbtton();
		up.courses();
		up.Favorite();
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
		String Testcasename = ReadExcel.readExcelCell(14, 1);
		String Testcasedescription = ReadExcel.readExcelCell(14, 2);
		String TestCaseresult = ReadExcel.readExcelCell(3, 3);
		System.out.println("test started1");
		rc.startTestcase(Testcasename, "18", 18, Testcasedescription, "pass", "page  is  open");
	}

	// @Test(priority = 19)
	public void Assignmentpage() {
		up = new UserPanel();
		lp = new LoginPage();

		try {
			lp.logincase(prop.getProperty("userrrr"), prop.getProperty("passss"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		up.Assigmentclick();
		up.myAssigmentclick();
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
		String Testcasename = ReadExcel.readExcelCell(14, 1);
		String Testcasedescription = ReadExcel.readExcelCell(14, 2);
		String TestCaseresult = ReadExcel.readExcelCell(3, 3);
		System.out.println("test started1");
		rc.startTestcase(Testcasename, "18", 18, Testcasedescription, "pass", "page  is  open");
	}

	// @Test(priority = 20)

	public void quizzes() {
		up = new UserPanel();

		lp = new LoginPage();

		try {
			lp.logincase(prop.getProperty("userrrr"), prop.getProperty("passss"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		up.quizsection();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		String Testcasename = ReadExcel.readExcelCell(14, 1);
		String Testcasedescription = ReadExcel.readExcelCell(14, 2);
		String TestCaseresult = ReadExcel.readExcelCell(3, 3);
		System.out.println("test started1");
		rc.startTestcase(Testcasename, "18", 18, Testcasedescription, "pass", "page  is  open");
	}

//	@Test(priority = 21)
	public void notparticpated() {
		up = new UserPanel();

		lp = new LoginPage();
		try {
			lp.logincase(prop.getProperty("userrrr"), prop.getProperty("passss"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// TODO Auto-generated catch block
		up.quizclickparti();
		up.notparticipeted();

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
		String Testcasename = ReadExcel.readExcelCell(14, 1);
		String Testcasedescription = ReadExcel.readExcelCell(14, 2);
		String TestCaseresult = ReadExcel.readExcelCell(3, 3);
		System.out.println("test started1");
		rc.startTestcase(Testcasename, "18", 18, Testcasedescription, "pass", "page  is  open");
	}

	// @Test(priority = 22)

	public void Financialsummary()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		up = new UserPanel();

		lp = new LoginPage();
		lp.logincase(prop.getProperty("userrrr"), prop.getProperty("passss"));
		up.financial();
		up.Financialsummary();
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String Testcasename = ReadExcel.readExcelCell(14, 1);
		String Testcasedescription = ReadExcel.readExcelCell(14, 2);
		String TestCaseresult = ReadExcel.readExcelCell(3, 3);
		ReadExcel rc = new ReadExcel();

		rc.startTestcase(Testcasename, "18", 18, Testcasedescription, "pass", "page  is  open");
	}

	// @Test(priority = 23)
	public void installmentpage() {

		up = new UserPanel();

		lp = new LoginPage();

		try {
			lp.logincase(prop.getProperty("userrrr"), prop.getProperty("passss"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		up.financial();
		try {
			up.installment();
			// up.payupcomoing();

			up.clickpayupcombutton();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// TODO Auto-generated catch block

		ReadExcel rc = new ReadExcel();
		String Testcasename = ReadExcel.readExcelCell(14, 1);
		String Testcasedescription = ReadExcel.readExcelCell(14, 2);
		String TestCaseresult = ReadExcel.readExcelCell(3, 3);
		System.out.println("test started1");

		rc.startTestcase(Testcasename, "18", 18, Testcasedescription, "pass", "page  is  open");

	}

	// @Test(priority = 24)

	public void viewdeatails() {

		up = new UserPanel();

		lp = new LoginPage();

		try {
			lp.logincase(prop.getProperty("userrrr"), prop.getProperty("passss"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		up.financial();
		try {
			up.installment();
			up.viewdetails();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// TODO Auto-generated catch block

		String Testcasename = ReadExcel.readExcelCell(14, 1);
		String Testcasedescription = ReadExcel.readExcelCell(14, 2);
		String TestCaseresult = ReadExcel.readExcelCell(3, 3);
		ReadExcel rc = new ReadExcel();
		rc.startTestcase(Testcasename, "23", 23, Testcasedescription, "pass", "page  is  open");

	}

	// @Test(priority = 25)
	public void supporttest() {
		try {
			lp.logincase(prop.getProperty("userrrr"), prop.getProperty("passss"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		up.suporttabuser();
		ReadExcel rc = new ReadExcel();
		String Testcasename = ReadExcel.readExcelCell(14, 1);
		String Testcasedescription = ReadExcel.readExcelCell(14, 2);
		String TestCaseresult = ReadExcel.readExcelCell(3, 3);
		rc.startTestcase(Testcasename, "23", 23, Testcasedescription, "pass", "page  is  open");

	}

	// @Test(priority = 26)
	public void supporttabew() throws EncryptedDocumentException, InvalidFormatException {
		up = new UserPanel();
		lp = new LoginPage();
		try {
			lp.logincase(prop.getProperty("userrrr"), prop.getProperty("passss"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		up.suporttabuser();
		up.newtab();
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");

		String Testcasename = ReadExcel.readExcelCell(26, 1);
		String Testcasedescription = ReadExcel.readExcelCell(26, 2);
		String TestCaseresult = ReadExcel.readExcelCell(26, 3);
		ReadExcel rc = new ReadExcel();
		rc.startTestcase(Testcasename, "26", 26, Testcasedescription, TestCaseresult, "page  is  open");
	}

	@Test(priority = 26)
	public void Incustomersupport() throws EncryptedDocumentException, InvalidFormatException {
		up = new UserPanel();
		lp = new LoginPage();
		try {
			lp.logincase(prop.getProperty("userrrr"), prop.getProperty("passss"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		up.suporttabuser();
		up.indcustomersupport();
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");

		String Testcasename = ReadExcel.readExcelCell(26, 1);
		String Testcasedescription = ReadExcel.readExcelCell(26, 2);
		String TestCaseresult = ReadExcel.readExcelCell(26, 3);
		ReadExcel rc = new ReadExcel();
		rc.startTestcase(Testcasename, "26", 26, Testcasedescription, TestCaseresult, "page  is  open");
	}

	@Test(priority = 27)
	public void ticketcustom() throws EncryptedDocumentException, InvalidFormatException {
		up = new UserPanel();
		lp = new LoginPage();
		try {
			lp.logincase(prop.getProperty("userrrr"), prop.getProperty("passss"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		up.suporttabuser();
		up.ticket();
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");

		String Testcasename = ReadExcel.readExcelCell(26, 1);
		String Testcasedescription = ReadExcel.readExcelCell(26, 2);
		String TestCaseresult = ReadExcel.readExcelCell(26, 3);
		ReadExcel rc = new ReadExcel();
		rc.startTestcase(Testcasename, "26", 26, Testcasedescription, TestCaseresult, "page  is  open");
	}

	@Test(priority = 27)
	public void ticketcusto() throws EncryptedDocumentException, InvalidFormatException {
		up = new UserPanel();
		lp = new LoginPage();
		try {
			lp.logincase(prop.getProperty("userrrr"), prop.getProperty("passss"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		up.suporttabuser();
		up.ticket();
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");

		String Testcasename = ReadExcel.readExcelCell(26, 1);
		String Testcasedescription = ReadExcel.readExcelCell(26, 2);
		String TestCaseresult = ReadExcel.readExcelCell(26, 3);
		ReadExcel rc = new ReadExcel();
		rc.startTestcase(Testcasename, "26", 26, Testcasedescription, TestCaseresult, "page  is  open");
	}

	@Test(priority = 28)
	public void Forumtab() throws EncryptedDocumentException, InvalidFormatException {
		up = new UserPanel();
		lp = new LoginPage();
		try {
			lp.logincase(prop.getProperty("userrrr"), prop.getProperty("passss"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		up.Forum();
		up.newtopic();
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");

		String Testcasename = ReadExcel.readExcelCell(26, 1);
		String Testcasedescription = ReadExcel.readExcelCell(26, 2);
		String TestCaseresult = ReadExcel.readExcelCell(26, 3);
		ReadExcel rc = new ReadExcel();
		rc.startTestcase(Testcasename, "26", 26, Testcasedescription, TestCaseresult, "page  is  open");
	}

	@Test(priority = 29)
	public void Forumtabnewtopics() throws EncryptedDocumentException, InvalidFormatException {
		up = new UserPanel();
		lp = new LoginPage();
		try {
			lp.logincase(prop.getProperty("userrrr"), prop.getProperty("passss"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		up.Forum();
		up.newtopics();
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");

		String Testcasename = ReadExcel.readExcelCell(26, 1);
		String Testcasedescription = ReadExcel.readExcelCell(26, 2);
		String TestCaseresult = ReadExcel.readExcelCell(26, 3);
		ReadExcel rc = new ReadExcel();
		rc.startTestcase(Testcasename, "26", 26, Testcasedescription, TestCaseresult, "page  is  open");
	}

	@Test(priority = 28)
	public void Forumtabnewtopics1() throws EncryptedDocumentException, InvalidFormatException {
		up = new UserPanel();
		lp = new LoginPage();
		try {
			lp.logincase(prop.getProperty("userrrr"), prop.getProperty("passss"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		up.Forum();
		up.newtopic();
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");

		String Testcasename = ReadExcel.readExcelCell(26, 1);
		String Testcasedescription = ReadExcel.readExcelCell(26, 2);
		String TestCaseresult = ReadExcel.readExcelCell(26, 3);
		ReadExcel rc = new ReadExcel();
		rc.startTestcase(Testcasename, "26", 26, Testcasedescription, TestCaseresult, "page  is  open");
	}

	@Test(priority = 29)
	public void ForumtabnewPost() throws EncryptedDocumentException, InvalidFormatException {
		up = new UserPanel();
		lp = new LoginPage();
		try {
			lp.logincase(prop.getProperty("userrrr"), prop.getProperty("passss"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		up.Forum();
		up.Mypostds();
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");

		String Testcasename = ReadExcel.readExcelCell(26, 1);
		String Testcasedescription = ReadExcel.readExcelCell(26, 2);
		String TestCaseresult = ReadExcel.readExcelCell(26, 3);
		ReadExcel rc = new ReadExcel();
		rc.startTestcase(Testcasename, "26", 26, Testcasedescription, TestCaseresult, "page  is  open");
	}

	@Test(priority = 29)
	public void bookmarkspage() throws EncryptedDocumentException, InvalidFormatException {
		up = new UserPanel();
		lp = new LoginPage();
		try {
			lp.logincase(prop.getProperty("userrrr"), prop.getProperty("passss"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		up.Forum();
		up.bookmarks();
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");

		String Testcasename = ReadExcel.readExcelCell(26, 1);
		String Testcasedescription = ReadExcel.readExcelCell(26, 2);
		String TestCaseresult = ReadExcel.readExcelCell(26, 3);
		ReadExcel rc = new ReadExcel();
		rc.startTestcase(Testcasename, "26", 26, Testcasedescription, TestCaseresult, "page  is  open");
	}

	@Test(priority = 30)
	public void logoutpageuser() {

		up.logoutpageuser();
		try {
			ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String Testcasename = ReadExcel.readExcelCell(26, 1);
		String Testcasedescription = ReadExcel.readExcelCell(26, 2);
		String TestCaseresult = ReadExcel.readExcelCell(26, 3);
		ReadExcel rc = new ReadExcel();
		rc.startTestcase(Testcasename, "26", 26, Testcasedescription, TestCaseresult, "page  is  open");

	}

}