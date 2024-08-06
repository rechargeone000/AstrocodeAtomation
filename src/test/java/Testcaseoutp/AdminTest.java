package Testcaseoutp;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObject.AdminPage;
import PageObject.LoginPage;
import baseclass.BaseTestclass;

public class AdminTest extends BaseTestclass {

	AdminPage ap = new AdminPage();

	@BeforeMethod
	public void launchbrowser() {

		String url = "https://lms.asttrolok.in";
		loadConfig(url);

	}

	@AfterMethod
	public void quitbrowser() {

		driver.quit();
	}

	@Test
	public void CreateCoursetest() throws InterruptedException {

		LoginPage lp = new LoginPage();
		try {
			lp.logincase("astrolok.vedic@gmail.com", "admin@112211");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ap.Clickothecoursetab();
		Thread.sleep(2000);
		ap.clickonthenewcourse();
		Thread.sleep(2000);
		ap.selelectlangdrop();
		Thread.sleep(2000);
		ap.Title();
		Thread.sleep(2000);
		ap.CourseURL();
		Thread.sleep(2000);
		ap.Instrucktor();
		Thread.sleep(4000);
	}

}
