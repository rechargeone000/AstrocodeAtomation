package Testcaseoutp;

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

		driver.quit();
	}

	// @Test
	public void courseopen() throws InterruptedException {
		lp.logincase("balmukundsahu2706@gmail.com", "1234567");
		idb.Clickonthecoursetab();
		idb.newtab();

	}

//	@Test
	public void dashboard() throws InterruptedException {

		lp.logincase("balmukundsahu2706@gmail.com", "1234567");
		up.dashboardbtton();

	}

	// @Test
	public void Courses() throws InterruptedException {

		lp.logincase("balmukundsahu2706@gmail.com", "1234567");
		idb.Clickonthecoursetab();
		Thread.sleep(5000);

	}

	// @Test
	public void coursemycourse() throws InterruptedException {
		lp.logincase("balmukundsahu2706@gmail.com", "1234567");
		up.dashboardbtton();
		idb.Clickonthecoursetab();

	}

	// @Test
	public void CoursesMycoursepage() throws InterruptedException {

		lp.logincase("balmukundsahu2706@gmail.com", "1234567");
		up.dashboardbtton();

	}

//	@Test
	public void mypurchessetab() throws InterruptedException {
		lp.logincase("balmukundsahu2706@gmail.com", "1234567");
		up.courses();
		idb.mypurchasebtn();
	}

	//@Test
	public void myCoursecomments() throws InterruptedException {
		lp.logincase("balmukundsahu2706@gmail.com", "1234567");
		up.courses();
		idb.mycoursecomment();

	}
	
	//@Test
	public void favtestinst() throws InterruptedException {
		lp.logincase("balmukundsahu2706@gmail.com", "1234567");
		idb.Clickonthecoursetab();
		idb.favorites();
		
		Thread.sleep(3000);

	}
}