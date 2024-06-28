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
	//String ExcelFilePath = "C:\\Users\\dell\\eclipse-workspace\\Asttrokautomation\\src\\test\\resources\\data.xlsx";
	String ExcelFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\data.xlsx";
	@BeforeMethod
	public void launchbrowser() {
		
			loadConfig();
		

	}

	@AfterMethod
	public void quitbrowser() {

		driver.quit();
	}

	 @Test(priority = 15)
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
		String Testcasename = ReadExcel.readExcelCell(15, 1);
		String Testcasedescription = ReadExcel.readExcelCell(15, 2);
		String TestCaseresult = ReadExcel.readExcelCell(15, 3);
		System.out.println("test started1");
		rc.startTestcase(Testcasename, "3", 15, Testcasedescription, "pass", "page  is  open");

	}

	 @Test(priority = 16)
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
		String Testcasename = ReadExcel.readExcelCell(16, 1);
		String Testcasedescription = ReadExcel.readExcelCell(16, 2);
		String TestCaseresult = ReadExcel.readExcelCell(16, 3);
		System.out.println("test started1");
		rc.startTestcase(Testcasename, "16", 16, Testcasedescription, "pass", "page  is  open");

	}

	@Test(priority = 17)
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
		String Testcasename = ReadExcel.readExcelCell(17, 1);
		String Testcasedescription = ReadExcel.readExcelCell(17, 2);
		String TestCaseresult = ReadExcel.readExcelCell(17, 3);
		rc.startTestcase(Testcasename, "17", 17, Testcasedescription, "pass", "page  is  open");

	}

	 @Test(priority = 18)
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
		rc.startTestcase(Testcasename, "18", 18, Testcasedescription, "pass", "page  is  open");

	}

	@Test(priority = 19)
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
		String Testcasename = ReadExcel.readExcelCell(18, 1);
		String Testcasedescription = ReadExcel.readExcelCell(14, 2);
		String TestCaseresult = ReadExcel.readExcelCell(3, 3);
		System.out.println("test started1");
		rc.startTestcase(Testcasename, "19", 19, Testcasedescription, "pass", "page  is  open");
	}

	 @Test(priority = 20)
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
		String Testcasename = ReadExcel.readExcelCell(20, 1);
		String Testcasedescription = ReadExcel.readExcelCell(20, 2);
		String TestCaseresult = ReadExcel.readExcelCell(20, 3);
		System.out.println("test started1");
		rc.startTestcase(Testcasename, "20", 20, Testcasedescription, "pass", "page  is  open");
	}

	@Test(priority = 21)

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
		String Testcasename = ReadExcel.readExcelCell(21, 1);
		String Testcasedescription = ReadExcel.readExcelCell(21, 2);
		String TestCaseresult = ReadExcel.readExcelCell(21, 3);
		System.out.println("test started1");
		rc.startTestcase(Testcasename, "21", 21, Testcasedescription, "pass", "page  is  open");
	}

	@Test(priority = 22)
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
		String Testcasename = ReadExcel.readExcelCell(22, 1);
		String Testcasedescription = ReadExcel.readExcelCell(22, 2);
		String TestCaseresult = ReadExcel.readExcelCell(22, 3);
		System.out.println("test started1");
		rc.startTestcase(Testcasename, "22", 22, Testcasedescription, "pass", "page  is  open");
	}

	 @Test(priority = 23)

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

		rc.startTestcase(Testcasename, "23", 23, Testcasedescription, "pass", "page  is  open");
	}

	@Test(priority = 24)
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
		String Testcasename = ReadExcel.readExcelCell(24, 1);
		String Testcasedescription = ReadExcel.readExcelCell(24, 2);
		String result = ReadExcel.readExcelCell(24, 3);
		String TestCaseresult = ReadExcel.readExcelCell(24, 3);
		String Comments = ReadExcel.readExcelCell(24, 3);

		rc.startTestcase(Testcasename, "24", 24, Testcasedescription, result, Comments);

	}

	 @Test(priority = 25)

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
		rc.startTestcase(Testcasename, "25", 25, Testcasedescription, "pass", "page  is  open");

	}

	 @Test(priority = 26)
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
		rc.startTestcase(Testcasename, "26", 26, Testcasedescription, "pass", "page  is  open");

	}

	@Test(priority = 27)
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
		String Comments = ReadExcel.readExcelCell(26, 3);

		ReadExcel rc = new ReadExcel();
		rc.startTestcase(Testcasename, "27", 27, Testcasedescription, TestCaseresult, Comments);
	}

	@Test(priority = 28)
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

		String Testcasename = ReadExcel.readExcelCell(28, 1);
		String Testcasedescription = ReadExcel.readExcelCell(28, 2);
		String TestCaseresult = ReadExcel.readExcelCell(28, 3);
		ReadExcel rc = new ReadExcel();
		rc.startTestcase(Testcasename, "28", 28, Testcasedescription, TestCaseresult, "page  is  open");
	}

	@Test(priority = 29)
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

		String Testcasename = ReadExcel.readExcelCell(29, 1);
		String Testcasedescription = ReadExcel.readExcelCell(29, 2);
		String TestCaseresult = ReadExcel.readExcelCell(29, 3);
		ReadExcel rc = new ReadExcel();
		rc.startTestcase(Testcasename, "29", 29, Testcasedescription, TestCaseresult, "page  is  open");
	}

	@Test(priority = 30)
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

		String Testcasename = ReadExcel.readExcelCell(30, 1);
		String Testcasedescription = ReadExcel.readExcelCell(30, 2);
		String TestCaseresult = ReadExcel.readExcelCell(30, 3);
		ReadExcel rc = new ReadExcel();
		rc.startTestcase(Testcasename, "30", 30, Testcasedescription, TestCaseresult, "page  is  open");
	}

	@Test(priority = 31)
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

		String Testcasename = ReadExcel.readExcelCell(31, 1);
		String Testcasedescription = ReadExcel.readExcelCell(31, 2);
		String TestCaseresult = ReadExcel.readExcelCell(31, 3);
		ReadExcel rc = new ReadExcel();
		rc.startTestcase(Testcasename, "31", 31, Testcasedescription, TestCaseresult, "page  is  open");
	}

	@Test(priority = 32)
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

		String Testcasename = ReadExcel.readExcelCell(32, 1);
		String Testcasedescription = ReadExcel.readExcelCell(32, 2);
		String TestCaseresult = ReadExcel.readExcelCell(32, 3);
		ReadExcel rc = new ReadExcel();
		rc.startTestcase(Testcasename, "32", 32, Testcasedescription, TestCaseresult, "page  is  open");
	}

	@Test(priority = 33)
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

		String Testcasename = ReadExcel.readExcelCell(33, 1);
		String Testcasedescription = ReadExcel.readExcelCell(33, 2);
		String TestCaseresult = ReadExcel.readExcelCell(33, 3);
		ReadExcel rc = new ReadExcel();
		rc.startTestcase(Testcasename, "33", 33, Testcasedescription, TestCaseresult, "page  is  open");
	}

	@Test(priority = 34)
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

		String Testcasename = ReadExcel.readExcelCell(34, 1);
		String Testcasedescription = ReadExcel.readExcelCell(34, 2);
		String TestCaseresult = ReadExcel.readExcelCell(34, 3);
		ReadExcel rc = new ReadExcel();
		rc.startTestcase(Testcasename, "34", 34, Testcasedescription, TestCaseresult, "page  is  open");
	}

	@Test(priority = 35)
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

		String Testcasename = ReadExcel.readExcelCell(35, 1);
		String Testcasedescription = ReadExcel.readExcelCell(35, 2);
		String TestCaseresult = ReadExcel.readExcelCell(35, 3);
		ReadExcel rc = new ReadExcel();
		rc.startTestcase(Testcasename, "35", 35, Testcasedescription, TestCaseresult, "page  is  open");
	}

	@Test(priority = 36)
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

		String Testcasename = ReadExcel.readExcelCell(36, 1);
		String Testcasedescription = ReadExcel.readExcelCell(36, 2);
		String TestCaseresult = ReadExcel.readExcelCell(36, 3);
		ReadExcel rc = new ReadExcel();
		rc.startTestcase(Testcasename, "36", 36, Testcasedescription, TestCaseresult, "page  is  open");

	}

}