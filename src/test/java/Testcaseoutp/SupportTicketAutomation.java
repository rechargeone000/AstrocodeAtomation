package Testcaseoutp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObject.HomePaget;
import PageObject.LoginPage;
import PageObject.videoaccesscheckpage;
import baseclass.BaseTestclass;
import manageUtils.ConvertEx;

public class SupportTicketAutomation extends BaseTestclass {

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

	@Test
	public void Testpage() throws InterruptedException {

		lp.logincase("balmukundsahu@rechargestudio.com", "123456789");

		driver.findElement(By.xpath("//span[@class='font-14 text-dark-blue font-weight-500'][normalize-space()='Support']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='New']")).click();
		driver.findElement(By.xpath("//input[@name='title']")).sendKeys("ticket101");
		
		
		

	}
}
