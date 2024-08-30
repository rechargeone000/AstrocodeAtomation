package Testcaseoutp;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
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

	@BeforeClass
	public void launchbrowser() {

		String url = "https://www.asttrolok.com/";
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

		driver.quit();
	}

	@Test (dataProvider= "data-provider")
	public void checkdatauseraccess(String email) throws InterruptedException {
	

		
		vp.checkuseronadmin(email);
		vp.switchwindow();
		vp.openlearningpage("Astrology Basic Level ");
		//vp.switchwindow();
		Thread.sleep(4000);
		String text = driver
				.findElement(By.xpath("(//span[@class=\"font-weight-bold font-14 text-dark-blue d-block\"])[1]"))
				.getText();

		System.out.println("cousercontent " + text);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[@class=\"chapter-icon bg-gray300 mr-10\"])[3]")).click();
		
		
		driver.close();
		//vp.switchwindow();

	}

	
	
	 @DataProvider (name = "data-provider")
     public Object[][] dpMethod(){
	 return new Object[][] {{"balmukund.sahu@rechargestudio.com"} };
     }
}
