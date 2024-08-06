package Testcaseoutp;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObject.InstructorDashboard;
import PageObject.LoginPage;
import PageObject.UserPanel;
import baseclass.BaseTestclass;
import manageUtils.ConvertEx;
import manageUtils.ReadExcel;

public class InstructorPanelTest extends BaseTestclass {

	String ExcelFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\data.xlsx";
	InstructorDashboard idb = new InstructorDashboard();
	LoginPage lp = new LoginPage();
	UserPanel up = new UserPanel();

	@BeforeMethod
	public void launchbrowser() {
		
		String usrl = "https://lms.asttrolok.in/";
		loadConfig(usrl);

	}

	@AfterMethod
	public void quitbrowser() {

		driver.quit();
	}

	@Test(priority = 44)
	public void courseopen() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {
		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));
		idb.Clickonthecoursetab();
		idb.newtab();
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(44, 0);
		String testcasename = ReadExcel.readExcelCell(44, 1);
		String Testdescr = ReadExcel.readExcelCell(44, 2);
		String result = ReadExcel.readExcelCell(44, 3);
		String Comments = ReadExcel.readExcelCell(44, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();

		// System.out.println(email);
		// Assert.assertEquals(email, prop.getProperty("username"));
		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);
	}

	@Test(priority = 45)
	public void dashboard() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {

		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));
		up.dashboardbtton();
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(45, 0);
		String testcasename = ReadExcel.readExcelCell(45, 1);
		String Testdescr = ReadExcel.readExcelCell(45, 2);
		String result = ReadExcel.readExcelCell(45, 3);
		String Comments = ReadExcel.readExcelCell(45, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();

		// System.out.println(email);
		// Assert.assertEquals(email, prop.getProperty("username"));
		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);

	}

	@Test(priority = 47)
	public void Courses() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {

		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));
		idb.Clickonthecoursetab();
		Thread.sleep(5000);
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(46, 0);
		String testcasename = ReadExcel.readExcelCell(46, 1);
		String Testdescr = ReadExcel.readExcelCell(46, 2);
		String result = ReadExcel.readExcelCell(46, 3);
		String Comments = ReadExcel.readExcelCell(46, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();

		// System.out.println(email);
		// Assert.assertEquals(email, prop.getProperty("username"));
		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);
	}

	@Test(priority = 47)
	public void coursemycourse() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {
		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));
		up.dashboardbtton();
		idb.Clickonthecoursetab();
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(47, 0);
		String testcasename = ReadExcel.readExcelCell(47, 1);
		String Testdescr = ReadExcel.readExcelCell(47, 2);
		String result = ReadExcel.readExcelCell(47, 3);
		String Comments = ReadExcel.readExcelCell(47, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();

		// System.out.println(email);
		// Assert.assertEquals(email, prop.getProperty("username"));
		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);

	}

	@Test(priority = 48)
	public void CoursesMycoursepage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {

		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));
		up.dashboardbtton();
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(48, 0);
		String testcasename = ReadExcel.readExcelCell(48, 1);
		String Testdescr = ReadExcel.readExcelCell(48, 2);
		String result = ReadExcel.readExcelCell(48, 3);
		String Comments = ReadExcel.readExcelCell(48, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();

		// System.out.println(email);
		// Assert.assertEquals(email, prop.getProperty("username"));
		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);
	}

	@Test(priority = 49)
	public void mypurchessetab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {
		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));
		up.courses();
		idb.mypurchasebtn();
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(49, 0);
		String testcasename = ReadExcel.readExcelCell(49, 1);
		String Testdescr = ReadExcel.readExcelCell(49, 2);
		String result = ReadExcel.readExcelCell(49, 3);
		String Comments = ReadExcel.readExcelCell(49, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();

		// System.out.println(email);
		// Assert.assertEquals(email, prop.getProperty("username"));
		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);
	}

	@Test(priority = 50)
	public void myCoursecomments() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {
		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));
		up.courses();
		idb.mycoursecomment();
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(50, 0);
		String testcasename = ReadExcel.readExcelCell(50, 1);
		String Testdescr = ReadExcel.readExcelCell(50, 2);
		String result = ReadExcel.readExcelCell(50, 3);
		String Comments = ReadExcel.readExcelCell(50, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();

		// System.out.println(email);
		// Assert.assertEquals(email, prop.getProperty("username"));
		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);
	}

	@Test(priority = 51)
	public void favtestinst() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {
		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));
		idb.Clickonthecoursetab();
		idb.favorites();
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(51, 0);
		String testcasename = ReadExcel.readExcelCell(51, 1);
		String Testdescr = ReadExcel.readExcelCell(51, 2);
		String result = ReadExcel.readExcelCell(51, 3);
		String Comments = ReadExcel.readExcelCell(51, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();

		// System.out.println(email);
		// Assert.assertEquals(email, prop.getProperty("username"));
		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);

	}

	@Test(priority = 52)
	public void CoursebundlesTest() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {
		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));
		idb.Coursebundles();
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(52, 0);
		String testcasename = ReadExcel.readExcelCell(52, 1);
		String Testdescr = ReadExcel.readExcelCell(52, 2);
		String result = ReadExcel.readExcelCell(52, 3);
		String Comments = ReadExcel.readExcelCell(52, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();

		// System.out.println(email);
		// Assert.assertEquals(email, prop.getProperty("username"));
		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);
		Thread.sleep(3000);

	}

	@Test(priority = 53)
	public void NewCoursebundlesTest() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {
		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));
		idb.Coursebundles();
		idb.newcoursebndlepage();
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(53, 0);
		String testcasename = ReadExcel.readExcelCell(53, 1);
		String Testdescr = ReadExcel.readExcelCell(53, 2);
		String result = ReadExcel.readExcelCell(53, 3);
		String Comments = ReadExcel.readExcelCell(53, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();

		// System.out.println(email);
		// Assert.assertEquals(email, prop.getProperty("username"));
		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);
	}

	@Test(priority = 54)
	public void MyBundleCoursebundlesTest()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException {
		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));
		idb.Coursebundles();
		idb.Mybundlescoursebndlepage();
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(54, 0);
		String testcasename = ReadExcel.readExcelCell(54, 1);
		String Testdescr = ReadExcel.readExcelCell(54, 2);
		String result = ReadExcel.readExcelCell(54, 3);
		String Comments = ReadExcel.readExcelCell(54, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();

		// System.out.println(email);
		// Assert.assertEquals(email, prop.getProperty("username"));
		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);
	}

	@Test(priority = 55)
	public void Assigmenttest() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {
		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));
		up.Assigmentclick();
		Thread.sleep(3000);
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(55, 0);
		String testcasename = ReadExcel.readExcelCell(55, 1);
		String Testdescr = ReadExcel.readExcelCell(55, 2);
		String result = ReadExcel.readExcelCell(55, 3);
		String Comments = ReadExcel.readExcelCell(55, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();

		// System.out.println(email);
		// Assert.assertEquals(email, prop.getProperty("username"));
		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);
	}

	@Test(priority = 56)
	public void myAssigmenttest() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {
		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));
		up.Assigmentclick();
		idb.myAssignments();
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(56, 0);
		String testcasename = ReadExcel.readExcelCell(56, 1);
		String Testdescr = ReadExcel.readExcelCell(56, 2);
		String result = ReadExcel.readExcelCell(56, 3);
		String Comments = ReadExcel.readExcelCell(56, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();

		// System.out.println(email);
		// Assert.assertEquals(email, prop.getProperty("username"));
		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);
	}

	@Test(priority = 57)
	public void StudentAssigmenttest() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {
		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));
		up.Assigmentclick();
		idb.studentAssignments();
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(57, 0);
		String testcasename = ReadExcel.readExcelCell(57, 1);
		String Testdescr = ReadExcel.readExcelCell(57, 2);
		String result = ReadExcel.readExcelCell(57, 3);
		String Comments = ReadExcel.readExcelCell(57, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();

		// System.out.println(email);
		// Assert.assertEquals(email, prop.getProperty("username"));
		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);
	}

	@Test(priority = 58)
	public void Meetingtest() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {
		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));

		idb.meetings();
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(58, 0);
		String testcasename = ReadExcel.readExcelCell(58, 1);
		String Testdescr = ReadExcel.readExcelCell(58, 2);
		String result = ReadExcel.readExcelCell(58, 3);
		String Comments = ReadExcel.readExcelCell(58, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();

		// System.out.println(email);
		// Assert.assertEquals(email, prop.getProperty("username"));
		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);
	}

	@Test(priority = 59)
	public void reservationmtingtest() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {
		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));
		up.meeting();
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(59, 0);
		String testcasename = ReadExcel.readExcelCell(59, 1);
		String Testdescr = ReadExcel.readExcelCell(59, 2);
		String result = ReadExcel.readExcelCell(59, 3);
		String Comments = ReadExcel.readExcelCell(59, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();

		// System.out.println(email);
		// Assert.assertEquals(email, prop.getProperty("username"));
		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);
	}

	@Test(priority = 59)
	public void requestmeeting() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {
		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));
		idb.meetings();

		idb.setting();
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(59, 0);
		String testcasename = ReadExcel.readExcelCell(59, 1);
		String Testdescr = ReadExcel.readExcelCell(59, 2);
		String result = ReadExcel.readExcelCell(59, 3);
		String Comments = ReadExcel.readExcelCell(59, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();

		// System.out.println(email);
		// Assert.assertEquals(email, prop.getProperty("username"));
		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);
	}

	@Test(priority = 60)
	public void requestmeetingadd() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {
		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));
		idb.meetings();
		idb.setting();
		idb.settingathreedot();
		idb.addbutton();
		// driver.findElement(By.xpath("//label[@for='timeTwelveSwitch']")).click();
		Thread.sleep(2000);
		idb.Clockthourse();
		Thread.sleep(2000);

		idb.clockminutes();

		driver.findElement(By.xpath("//label[@for='timeTwelveSwitch']")).click();
		Thread.sleep(2000);

		idb.Clockthourse2();
		Thread.sleep(2000);
		idb.clockminutes2();
		driver.findElement(By.xpath("//label[@for='timeTwelveSwitch']")).click();

		driver.findElement(By.xpath("//button[@id='saveTime']")).click();

		Boolean ab = driver.findElement(By.xpath("//span[@class='inner-time text-gray font-12']")).isDisplayed();
		Thread.sleep(2000);
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

	@Test(priority = 61)
	public void certificatetest() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {
		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));
		idb.certificate();
		Thread.sleep(2000);

		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(61, 0);
		String testcasename = ReadExcel.readExcelCell(61, 1);
		String Testdescr = ReadExcel.readExcelCell(61, 2);
		String result = ReadExcel.readExcelCell(61, 3);
		String Comments = ReadExcel.readExcelCell(61, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();
		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);

	}

	@Test(priority = 62)
	public void certificateList() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {

		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));
		idb.certificate();
		idb.certificateList();

		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(62, 0);
		String testcasename = ReadExcel.readExcelCell(62, 1);
		String Testdescr = ReadExcel.readExcelCell(62, 2);
		String result = ReadExcel.readExcelCell(62, 3);
		String Comments = ReadExcel.readExcelCell(62, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();
		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);

	}

	@Test(priority = 63)
	public void certificate() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {

		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));
		idb.certificate();
		// idb.achievement();

		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(63, 0);
		String testcasename = ReadExcel.readExcelCell(63, 1);
		String Testdescr = ReadExcel.readExcelCell(63, 2);
		String result = ReadExcel.readExcelCell(63, 3);
		String Comments = ReadExcel.readExcelCell(63, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();
		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);

	}

	@Test(priority = 64)
	public void certificateval() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {
		System.out.println("certificate");
		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));
		idb.certificate();

		driver.findElement(By.xpath("//a[normalize-space()='Certificate Validation']")).click();
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(64, 0);
		String testcasename = ReadExcel.readExcelCell(64, 1);
		String Testdescr = ReadExcel.readExcelCell(64, 2);
		String result = ReadExcel.readExcelCell(64, 3);
		String Comments = ReadExcel.readExcelCell(64, 4);
		int indexno = Integer.parseInt(srno);
		// final

		ReadExcel rc = new ReadExcel();
		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);

	}

	@Test(priority = 65)
	public void comletioncertificatetest()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException {

		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));
		idb.certificate();
		idb.Completioncerticate();

		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(65, 0);
		String testcasename = ReadExcel.readExcelCell(65, 1);
		String Testdescr = ReadExcel.readExcelCell(65, 2);
		String result = ReadExcel.readExcelCell(65, 3);
		String Comments = ReadExcel.readExcelCell(65, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();
		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);

	}

	@Test(priority = 66)
	public void comletionTabnFinancial()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException {

		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));
		idb.TabnFinancial();

		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(66, 0);
		String testcasename = ReadExcel.readExcelCell(66, 1);
		String Testdescr = ReadExcel.readExcelCell(66, 2);
		String result = ReadExcel.readExcelCell(66, 3);
		String Comments = ReadExcel.readExcelCell(66, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();
		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);

	}

	@Test(priority = 67)
	public void comletionSalesreportl()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException {

		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));
		idb.TabnFinancial();
		idb.Salesreport();

		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(67, 0);
		String testcasename = ReadExcel.readExcelCell(67, 1);
		String Testdescr = ReadExcel.readExcelCell(67, 2);
		String result = ReadExcel.readExcelCell(67, 3);
		String Comments = ReadExcel.readExcelCell(67, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();
		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);

	}

	@Test(priority = 68)
	public void FinSalesreportl() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {

		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));
		idb.TabnFinancial();
		idb.Salesreport();

		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(68, 0);
		String testcasename = ReadExcel.readExcelCell(68, 1);
		String Testdescr = ReadExcel.readExcelCell(68, 2);
		String result = ReadExcel.readExcelCell(68, 3);
		String Comments = ReadExcel.readExcelCell(68, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();
		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);

	}

	@Test(priority = 69)
	public void Finfinacsummary() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {

		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));
		idb.TabnFinancial();
		idb.finacsummary();

		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(69, 0);
		String testcasename = ReadExcel.readExcelCell(69, 1);
		String Testdescr = ReadExcel.readExcelCell(69, 2);
		String result = ReadExcel.readExcelCell(69, 3);
		String Comments = ReadExcel.readExcelCell(69, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();
		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);

	}

	@Test(priority = 70)
	public void Articles() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {

		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));
		idb.ForumsmyArticles();

		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(70, 0);
		String testcasename = ReadExcel.readExcelCell(70, 1);
		String Testdescr = ReadExcel.readExcelCell(70, 2);
		String result = ReadExcel.readExcelCell(70, 3);
		String Comments = ReadExcel.readExcelCell(70, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();
		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);

	}

	@Test(priority = 71)
	public void FinfinfinacPayout() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {

		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));
		idb.TabnFinancial();
		idb.finacPayout();
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(71, 0);
		String testcasename = ReadExcel.readExcelCell(71, 1);
		String Testdescr = ReadExcel.readExcelCell(71, 2);
		String result = ReadExcel.readExcelCell(71, 3);
		String Comments = ReadExcel.readExcelCell(71, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();
		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);

	}

	@Test(priority = 72)
	public void FinfinAddWalletMoney() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {

		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));
		idb.TabnFinancial();
		idb.AddWalletMoney();
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(72, 0);
		String testcasename = ReadExcel.readExcelCell(72, 1);
		String Testdescr = ReadExcel.readExcelCell(72, 2);
		String result = ReadExcel.readExcelCell(72, 3);
		String Comments = ReadExcel.readExcelCell(72, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();
		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);

	}

	@Test(priority = 73)
	public void FinfinAddSubscribe() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {

		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));
		idb.TabnFinancial();
		idb.AddSubscribe();
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(73, 0);
		String testcasename = ReadExcel.readExcelCell(73, 1);
		String Testdescr = ReadExcel.readExcelCell(73, 2);
		String result = ReadExcel.readExcelCell(73, 3);
		String Comments = ReadExcel.readExcelCell(73, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();
		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);

	}

	@Test(priority = 74)
	public void FinfinInstallments() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {

		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));

		idb.TabnFinancial();
		idb.Installments();
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(74, 0);
		String testcasename = ReadExcel.readExcelCell(74, 1);
		String Testdescr = ReadExcel.readExcelCell(74, 2);
		String result = ReadExcel.readExcelCell(74, 3);
		String Comments = ReadExcel.readExcelCell(74, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();
		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);

	}

	@Test(priority = 75)
	public void support() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {

		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));

		idb.support();
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(75, 0);
		String testcasename = ReadExcel.readExcelCell(75, 1);
		String Testdescr = ReadExcel.readExcelCell(75, 2);
		String result = ReadExcel.readExcelCell(75, 3);
		String Comments = ReadExcel.readExcelCell(75, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();
		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);

	}

	@Test(priority = 76)
	public void supportnewtest() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {

		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));

		idb.support();
		idb.supportnew();
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(76, 0);
		String testcasename = ReadExcel.readExcelCell(76, 1);
		String Testdescr = ReadExcel.readExcelCell(76, 2);
		String result = ReadExcel.readExcelCell(76, 3);
		String Comments = ReadExcel.readExcelCell(76, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();
		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);

	}

	@Test(priority = 77)
	public void supportnewscourseupporttest()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException {

		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));

		idb.support();
		idb.supportCoursesupport();
		;
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(77, 0);
		String testcasename = ReadExcel.readExcelCell(77, 1);
		String Testdescr = ReadExcel.readExcelCell(77, 2);
		String result = ReadExcel.readExcelCell(77, 3);
		String Comments = ReadExcel.readExcelCell(77, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();
		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);

	}

	@Test(priority = 78)
	public void supportnewTicketsttest()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException {

		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));

		idb.support();
		idb.supportnewTickets();
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(78, 0);
		String testcasename = ReadExcel.readExcelCell(78, 1);
		String Testdescr = ReadExcel.readExcelCell(78, 2);
		String result = ReadExcel.readExcelCell(78, 3);
		String Comments = ReadExcel.readExcelCell(78, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();
		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);

	}

	@Test(priority = 79)
	public void supportMarketingtest() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {

		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));

		idb.supportMarketing();
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(79, 0);
		String testcasename = ReadExcel.readExcelCell(79, 1);
		String Testdescr = ReadExcel.readExcelCell(79, 2);
		String result = ReadExcel.readExcelCell(79, 3);
		String Comments = ReadExcel.readExcelCell(79, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();
		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);

	}

	@Test(priority = 80)
	public void sMarketingMarkDiscountstest()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException {

		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));

		idb.supportMarketing();
		idb.MarkDiscounts();
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(80, 0);
		String testcasename = ReadExcel.readExcelCell(80, 1);
		String Testdescr = ReadExcel.readExcelCell(80, 2);
		String result = ReadExcel.readExcelCell(80, 3);
		String Comments = ReadExcel.readExcelCell(80, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();
		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);

	}

	@Test(priority = 81)
	public void marktPromotionss() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {

		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));

		idb.supportMarketing();
		idb.marktPromotions();
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(81, 0);
		String testcasename = ReadExcel.readExcelCell(81, 1);
		String Testdescr = ReadExcel.readExcelCell(81, 2);
		String result = ReadExcel.readExcelCell(81, 3);
		String Comments = ReadExcel.readExcelCell(81, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();
		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);

	}

	@Test(priority = 82)
	public void forum() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {

		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));

		idb.instructorForums();

		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(82, 0);
		String testcasename = ReadExcel.readExcelCell(82, 1);
		String Testdescr = ReadExcel.readExcelCell(82, 2);
		String result = ReadExcel.readExcelCell(82, 3);
		String Comments = ReadExcel.readExcelCell(82, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();
		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);

	}

	@Test(priority = 83)
	public void forumnewForumsTopic() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {

		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));
		idb.instructorForums();
		idb.ForumsmyTopic();

		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(83, 0);
		String testcasename = ReadExcel.readExcelCell(83, 1);
		String Testdescr = ReadExcel.readExcelCell(83, 2);
		String result = ReadExcel.readExcelCell(83, 3);
		String Comments = ReadExcel.readExcelCell(83, 4);
		int indexno = Integer.parseInt(srno);

	}

	@Test(priority = 84)
	public void forumnewBookmark() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {

		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));
		idb.instructorForums();
		idb.ForumsmyBookmarks();

		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(84, 0);
		String testcasename = ReadExcel.readExcelCell(84, 1);
		String Testdescr = ReadExcel.readExcelCell(84, 2);
		String result = ReadExcel.readExcelCell(84, 3);
		String Comments = ReadExcel.readExcelCell(84, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();
		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);

	}

	@Test(priority = 85)
	public void Articlesnewart() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {

		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));
		idb.ForumsmyArticles();
		idb.ForumsnewArticles();

		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(85, 0);
		String testcasename = ReadExcel.readExcelCell(85, 1);
		String Testdescr = ReadExcel.readExcelCell(85, 2);
		String result = ReadExcel.readExcelCell(85, 3);
		String Comments = ReadExcel.readExcelCell(85, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();
		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);

	}

	@Test(priority = 86)
	public void ArticlComments() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {

		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));
		idb.ForumsmyArticles();
		idb.ForumsnewArticlesComments();

		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(86, 0);
		String testcasename = ReadExcel.readExcelCell(86, 1);
		String Testdescr = ReadExcel.readExcelCell(86, 2);
		String result = ReadExcel.readExcelCell(86, 3);
		String Comments = ReadExcel.readExcelCell(86, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();
		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);

	}

	@Test(priority = 87)
	public void Noticeboardtest() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {

		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));

		idb.Noticeboard();
		;

		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(87, 0);
		String testcasename = ReadExcel.readExcelCell(87, 1);
		String Testdescr = ReadExcel.readExcelCell(87, 2);
		String result = ReadExcel.readExcelCell(87, 3);
		String Comments = ReadExcel.readExcelCell(87, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();
		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);

	}

	@Test(priority = 88)
	public void Noticeboardtesto() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {

		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));

		idb.Noticeboard();

		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(88, 0);
		String testcasename = ReadExcel.readExcelCell(88, 1);
		String Testdescr = ReadExcel.readExcelCell(88, 2);
		String result = ReadExcel.readExcelCell(88, 3);
		String Comments = ReadExcel.readExcelCell(88, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();
		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);

	}

	@Test(priority = 89)
	public void Noticeboardhistorytesto()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException {

		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));

		idb.Noticeboard();
		idb.HistoryNoticeboardnew();

		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(89, 0);
		String testcasename = ReadExcel.readExcelCell(89, 1);
		String Testdescr = ReadExcel.readExcelCell(89, 2);
		String result = ReadExcel.readExcelCell(89, 3);
		String Comments = ReadExcel.readExcelCell(89, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();
		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);

	}

	@Test(priority = 90)
	public void Noticeboardhistorytest()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException {

		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));

		idb.Noticeboard();
		idb.HistoryNoticeboard();

		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(90, 0);
		String testcasename = ReadExcel.readExcelCell(90, 1);
		String Testdescr = ReadExcel.readExcelCell(90, 2);
		String result = ReadExcel.readExcelCell(90, 3);
		String Comments = ReadExcel.readExcelCell(90, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();
		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);

	}

	@Test(priority = 91)
	public void Noticeboarnewcourse() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {

		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));

		idb.Noticeboard();
		idb.newcourseNoticeboardnew();
		;

		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(91, 0);
		String testcasename = ReadExcel.readExcelCell(91, 1);
		String Testdescr = ReadExcel.readExcelCell(91, 2);
		String result = ReadExcel.readExcelCell(91, 3);
		String Comments = ReadExcel.readExcelCell(91, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();
		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);

	}

	@Test(priority = 92)
	public void Noticeboarnewcoursenot()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException {

		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));

		idb.Noticeboard();
		idb.newcourseNoticeboardnew();
		;

		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(92, 0);
		String testcasename = ReadExcel.readExcelCell(92, 1);
		String Testdescr = ReadExcel.readExcelCell(92, 2);
		String result = ReadExcel.readExcelCell(92, 3);
		String Comments = ReadExcel.readExcelCell(92, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();
		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);

	}

	@Test(priority = 93)
	public void Noticeboarcourse() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {

		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));

		idb.Noticeboard();
		idb.HistoryNoticeboardnew();

		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(93, 0);
		String testcasename = ReadExcel.readExcelCell(93, 1);
		String Testdescr = ReadExcel.readExcelCell(93, 2);
		String result = ReadExcel.readExcelCell(93, 3);
		String Comments = ReadExcel.readExcelCell(93, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();
		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);

	}

	@Test(priority = 94)
	public void notificationinst() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {

		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));

		idb.Noticeboard();
		idb.inssNotifications();

		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(94, 0);
		String testcasename = ReadExcel.readExcelCell(94, 1);
		String Testdescr = ReadExcel.readExcelCell(94, 2);
		String result = ReadExcel.readExcelCell(94, 3);
		String Comments = ReadExcel.readExcelCell(94, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();
		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);

	}

	@Test(priority = 95)
	public void inspanelSettingstest() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {

		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));

		idb.inspanelSettings();

		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(95, 0);
		String testcasename = ReadExcel.readExcelCell(95, 1);
		String Testdescr = ReadExcel.readExcelCell(95, 2);
		String result = ReadExcel.readExcelCell(95, 3);
		String Comments = ReadExcel.readExcelCell(95, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();
		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);

	}

	@Test(priority = 96)
	public void Profileusertest() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {

		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));

		idb.Profileuser();

		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(96, 0);
		String testcasename = ReadExcel.readExcelCell(96, 1);
		String Testdescr = ReadExcel.readExcelCell(96, 2);
		String result = ReadExcel.readExcelCell(96, 3);
		String Comments = ReadExcel.readExcelCell(96, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();
		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);

	}

	@Test(priority = 97)
	public void logout() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {

		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));

		idb.usserpanellogout();

		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(97, 0);
		String testcasename = ReadExcel.readExcelCell(97, 1);
		String Testdescr = ReadExcel.readExcelCell(97, 2);
		String result = ReadExcel.readExcelCell(97, 3);
		String Comments = ReadExcel.readExcelCell(97, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();
		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);

	}

	@Test(priority = 98)
	public void profilename() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {

		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));

		idb.getprofilenametitle();

		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(98, 0);
		String testcasename = ReadExcel.readExcelCell(98, 1);
		String Testdescr = ReadExcel.readExcelCell(98, 2);
		String result = ReadExcel.readExcelCell(98, 3);
		String Comments = ReadExcel.readExcelCell(98, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();
		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);

	}

	@Test(priority = 99)
	public void checkuser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {

		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));

		idb.checkprofile();

		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(99, 0);
		String testcasename = ReadExcel.readExcelCell(99, 1);
		String Testdescr = ReadExcel.readExcelCell(99, 2);
		String result = ReadExcel.readExcelCell(99, 3);
		String Comments = ReadExcel.readExcelCell(99, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();
		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);

	}

}