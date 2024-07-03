package Testcaseoutp;

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

	// @Test(priority=44)
	public void courseopen() throws InterruptedException {
		lp.logincase("balmukundsahu2706@gmail.com", "1234567");
		idb.Clickonthecoursetab();
		idb.newtab();

	}

	// @Test(priority=45)
	public void dashboard() throws InterruptedException {

		lp.logincase("balmukundsahu2706@gmail.com", "1234567");
		up.dashboardbtton();

	}

	// @Test(priority=47)
	public void Courses() throws InterruptedException {

		lp.logincase("balmukundsahu2706@gmail.com", "1234567");
		idb.Clickonthecoursetab();
		Thread.sleep(5000);

	}

	// @Test(priority=47)
	public void coursemycourse() throws InterruptedException {
		lp.logincase("balmukundsahu2706@gmail.com", "1234567");
		up.dashboardbtton();
		idb.Clickonthecoursetab();

	}

	// @Test(priority=48)
	public void CoursesMycoursepage() throws InterruptedException {

		lp.logincase("balmukundsahu2706@gmail.com", "1234567");
		up.dashboardbtton();

	}

	// @Test(priority=49)
	public void mypurchessetab() throws InterruptedException {
		lp.logincase("balmukundsahu2706@gmail.com", "1234567");
		up.courses();
		idb.mypurchasebtn();
	}

	// @Test(priority=50)
	public void myCoursecomments() throws InterruptedException {
		lp.logincase("balmukundsahu2706@gmail.com", "1234567");
		up.courses();
		idb.mycoursecomment();

	}

	// @Test(priority=51)
	public void favtestinst() throws InterruptedException {
		lp.logincase("balmukundsahu2706@gmail.com", "1234567");
		idb.Clickonthecoursetab();
		idb.favorites();

		Thread.sleep(3000);

	}

	// @Test(priority=52)
	public void CoursebundlesTest() throws InterruptedException {
		lp.logincase("balmukundsahu2706@gmail.com", "1234567");
		idb.Coursebundles();
		Thread.sleep(3000);

	}

	// @Test(priority=53)
	public void NewCoursebundlesTest() throws InterruptedException {
		lp.logincase("balmukundsahu2706@gmail.com", "1234567");
		idb.Coursebundles();
		idb.newcoursebndlepage();

	}

	// @Test(priority=54)
	public void MyBundleCoursebundlesTest() throws InterruptedException {
		lp.logincase("balmukundsahu2706@gmail.com", "1234567");
		idb.Coursebundles();
		idb.Mybundlescoursebndlepage();

	}

	// @Test
	public void Assigmenttest() throws InterruptedException {
		lp.logincase("balmukundsahu2706@gmail.com", "1234567");
		up.Assigmentclick();
		Thread.sleep(3000);

	}

	// @Test
	public void myAssigmenttest() throws InterruptedException {
		lp.logincase("balmukundsahu2706@gmail.com", "1234567");
		up.Assigmentclick();
		idb.myAssignments();

	}

//	@Test
	public void StudentAssigmenttest() throws InterruptedException {
		lp.logincase("balmukundsahu2706@gmail.com", "1234567");
		up.Assigmentclick();
		idb.studentAssignments();

	}

//	@Test
	public void Meetingtest() throws InterruptedException {
		lp.logincase("balmukundsahu2706@gmail.com", "1234567");

		idb.meetings();

	}

	// @Test
	public void reservationmtingtest() throws InterruptedException {
		lp.logincase("balmukundsahu2706@gmail.com", "1234567");
		up.meeting();

	}

	// @Test
	public void requestmeeting() throws InterruptedException {
		lp.logincase("balmukundsahu2706@gmail.com", "1234567");
		idb.meetings();

		idb.setting();
	}

	@Test
	public void requestmeetingadd() throws InterruptedException {
		lp.logincase("balmukundsahu2706@gmail.com", "1234567");
		idb.meetings();
		idb.setting();
		idb.settingathreedot();
		idb.addbutton();
		//driver.findElement(By.xpath("//label[@for='timeTwelveSwitch']")).click();
		Thread.sleep(2000);
		idb.Clockthourse();
		Thread.sleep(2000);
 
		idb.clockminutes();
		Thread.sleep(2000);

		//driver.findElement(By.xpath("//label[@for='timeTwelveSwitch']")).click();
	//	Thread.sleep(2000);

		//idb.Clockthourse2();
		//idb.clockminutes2();
		
		//driver.findElement(By.xpath("//textarea[@placeholder='Description (Optional)']")).sendKeys("usertimeexplined");
		//driver.findElement(By.xpath("//button[@id='saveTime']")).click();
		//driver.findElement(By.xpath("//label[@for='timeTwelveSwitch']")).click();
	}

}