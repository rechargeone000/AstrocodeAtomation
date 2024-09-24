package Testcaseoutp;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import PageObject.HomePaget;
import PageObject.LoginPage;
import PageObject.videoaccesscheckpage;
import baseclass.BaseTestclass;
import manageUtils.ConvertEx;

public class DiscountsTest extends BaseTestclass {
	
	HomePaget hm;
	LoginPage lp;
	videoaccesscheckpage vp = new videoaccesscheckpage();
	String ExcelFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\data.xlsx";

	@BeforeClass
	public void launchbrowser() {
		String url = "https://www.asttrolok.com";
		// String url = "https://lms.asttrolok.in/";

		loadConfig(url);
		lp = new LoginPage();
		try {
			lp.logincase(prop.getProperty("aduname"), prop.getProperty("adpass"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@AfterClass
	public void quitbrowser() {

		ConvertEx cx = new ConvertEx();
		cx.Genratepdf();
		// driver.quit();

	}
	
	
	
	
	
	
	

}
