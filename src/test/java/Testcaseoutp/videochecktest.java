package Testcaseoutp;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObject.HomePaget;
import PageObject.LoginPage;
import PageObject.videoaccesscheckpage;
import baseclass.BaseTestclass;

public class videochecktest extends BaseTestclass {
	HomePaget hm;
	LoginPage lp;
	videoaccesscheckpage vp = new videoaccesscheckpage();

	String ExcelFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\data.xlsx";

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
	public void checkdatauseraccess() throws InterruptedException {
		lp = new LoginPage();

		try {
			lp.logincase(prop.getProperty("aduname"), prop.getProperty("adpass"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		vp.checkuseronadmin("balmukund.sahu@rechargestudio.com");
		vp.switchwindow();
		vp.openlearningpage();

	}

}
