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
		loadConfig();

	}

	@AfterMethod
	public void quitbrowser() {

		// driver.quit();
	}

	// //@Test(priority=44)
	public void courseopen() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {
		lp.logincase("balmukundsahu2706@gmail.com", "1234567");
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

	// //@Test(priority=45)
	public void dashboard() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {

		lp.logincase("balmukundsahu2706@gmail.com", "1234567");
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

	// //@Test(priority=47)
	public void Courses() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {

		lp.logincase("balmukundsahu2706@gmail.com", "1234567");
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

	// //@Test(priority=47)
	public void coursemycourse() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {
		lp.logincase("balmukundsahu2706@gmail.com", "1234567");
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

	// //@Test(priority=48)
	public void CoursesMycoursepage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {

		lp.logincase("balmukundsahu2706@gmail.com", "1234567");
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

	// //@Test(priority=49)
	public void mypurchessetab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {
		lp.logincase("balmukundsahu2706@gmail.com", "1234567");
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

	// //@Test(priority=50)
	public void myCoursecomments() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {
		lp.logincase("balmukundsahu2706@gmail.com", "1234567");
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

	// //@Test(priority=51)
	public void favtestinst() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {
		lp.logincase("balmukundsahu2706@gmail.com", "1234567");
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

	// //@Test(priority=52)
	public void CoursebundlesTest() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {
		lp.logincase("balmukundsahu2706@gmail.com", "1234567");
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

	// //@Test(priority=53)
	public void NewCoursebundlesTest() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {
		lp.logincase("balmukundsahu2706@gmail.com", "1234567");
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

	// //@Test(priority=54)
	public void MyBundleCoursebundlesTest()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException {
		lp.logincase("balmukundsahu2706@gmail.com", "1234567");
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

	// //@Test(priority=55)
	public void Assigmenttest() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {
		lp.logincase("balmukundsahu2706@gmail.com", "1234567");
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

	// //@Test(priority=56)
	public void myAssigmenttest() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {
		lp.logincase("balmukundsahu2706@gmail.com", "1234567");
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

	// //@Test(priority=57)
	public void StudentAssigmenttest() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {
		lp.logincase("balmukundsahu2706@gmail.com", "1234567");
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

	// //@Test(priority=58)
	public void Meetingtest() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {
		lp.logincase("balmukundsahu2706@gmail.com", "1234567");

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

	// //@Test(priority=59)
	public void reservationmtingtest() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {
		lp.logincase("balmukundsahu2706@gmail.com", "1234567");
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

	// //@Test(priority=59)
	public void requestmeeting() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {
		lp.logincase("balmukundsahu2706@gmail.com", "1234567");
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

	// //@Test(priority = 60)
	public void requestmeetingadd() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {
		lp.logincase("balmukundsahu2706@gmail.com", "1234567");
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
	}

	// //@Test(priority = 61)
	public void certificatetest() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {
		lp.logincase("balmukundsahu2706@gmail.com", "1234567");
		idb.certificate();
		Thread.sleep(2000);

		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(1, 0);
		String testcasename = ReadExcel.readExcelCell(1, 1);
		String Testdescr = ReadExcel.readExcelCell(1, 2);
		String result = ReadExcel.readExcelCell(1, 3);
		String Comments = ReadExcel.readExcelCell(1, 4);
		int indexno = Integer.parseInt(srno);

		ReadExcel rc = new ReadExcel();
	}

	// @Test(priority = 62)
	public void certificateList() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {

		lp.logincase("balmukundsahu2706@gmail.com", "1234567");
		idb.certificate();
		idb.certificateList();

		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(62, 0);
		String testcasename = ReadExcel.readExcelCell(62, 1);
		String Testdescr = ReadExcel.readExcelCell(62, 2);
		String result = ReadExcel.readExcelCell(62, 3);
		String Comments = ReadExcel.readExcelCell(62, 4);
		int indexno = Integer.parseInt(srno);
	}

	// @Test(priority = 63)
	public void certificate() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {

		lp.logincase("balmukundsahu2706@gmail.com", "1234567");
		idb.certificate();
		idb.achievement();

		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(62, 0);
		String testcasename = ReadExcel.readExcelCell(62, 1);
		String Testdescr = ReadExcel.readExcelCell(62, 2);
		String result = ReadExcel.readExcelCell(62, 3);
		String Comments = ReadExcel.readExcelCell(62, 4);
		int indexno = Integer.parseInt(srno);
	}

	@Test
	public void certificateval() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {
		System.out.println("certificate");
		lp.logincase(prop.getProperty("instuser"), prop.getProperty("passworddinst"));
		idb.certificate();

		driver.findElement(By.xpath("//a[normalize-space()='Certificate Validation']")).click();
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(62, 0);
		String testcasename = ReadExcel.readExcelCell(62, 1);
		String Testdescr = ReadExcel.readExcelCell(62, 2);
		String result = ReadExcel.readExcelCell(62, 3);
		String Comments = ReadExcel.readExcelCell(62, 4);
		int indexno = Integer.parseInt(srno);
		//final
	}

}