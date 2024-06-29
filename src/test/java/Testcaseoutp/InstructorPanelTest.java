package Testcaseoutp;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObject.InstructorDashboard;
import PageObject.LoginPage;
import baseclass.BaseTestclass;
import manageUtils.ConvertEx;
import manageUtils.ReadExcel;

public class InstructorPanelTest extends BaseTestclass {

	String ExcelFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\data.xlsx";
	InstructorDashboard idb = new InstructorDashboard();
	LoginPage lp = new LoginPage();

	@BeforeMethod
	public void launchbrowser() {
		loadConfig();

	}

	@AfterMethod
	public void quitbrowser() {

		driver.quit();
	}

	@Test
	public void courseopen() throws InterruptedException {
		lp.logincase("balmukundsahu2706@gmail.com", "1234567");
		idb.Clickonthecoursetab();
		idb.newtab();

	}
	
	

}