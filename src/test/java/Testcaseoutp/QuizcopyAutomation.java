package Testcaseoutp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import CommonElements.CommonHelp;
import PageObject.HomePaget;
import PageObject.LoginPage;
import PageObject.videoaccesscheckpage;
import baseclass.BaseTestclass;
import manageUtils.ConvertEx;
import manageUtils.ReadExcel;

public class QuizcopyAutomation extends BaseTestclass {

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
	public void Quizcopy() throws InterruptedException {

		driver.findElement(By.xpath("//*[@id=\"sidebar-wrapper\"]/ul/li[8]/a/span")).click();
		// driver.findElement(By.xpath("//i[@class=\"fa fa-clone\"]")).click();

		String firstcopycoursename = driver
				.findElement(By.xpath("//table[@class='table table-striped font-14']/tbody/tr[2]/td[1]")).getText();
		System.out.println("before copy " + firstcopycoursename);

		List<WebElement> listofcopybtn = driver.findElements(By.xpath("//i[@class='fa fa-clone']"));

		for (int i = 1; i < listofcopybtn.size(); i++) {

			listofcopybtn.get(i).click();
			break;
		}

		By sdf = By.xpath("//select[@class='js-ajax-webinar_id custom-select']");
		CommonHelp.SelectDropdown(sdf, "TestingCourse1");

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[3]/section/div[2]/div/div/div/div/div[1]/div/button"))
				.click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"sidebar-wrapper\"]/ul/li[8]/a/span")).click();
		Thread.sleep(2000);

		String newcopycoursename = driver
				.findElement(By.xpath("//table[@class='table table-striped font-14']/tbody/tr[2]/td[1]")).getText();
		// String stop = stopName.substring(0, stopName.length() - 4);
		System.out.println("aftercopy............... " + newcopycoursename);
		// String newcopyurl = stop+"copy";

		String beforecoursename = driver
				.findElement(By.xpath("//table[@class=\"table table-striped font-14\"]/tbody/tr[3]/td[1]")).getText();

		System.out.println(beforecoursename);

		if (!firstcopycoursename.equals(newcopycoursename)) {

			String testcasename = "user should be able to copy course by selecting the new course ";
			String testdescription = "user should be able to copy course by selecting the new course ";

			String comment = "User has copied thequiz and change the course and then saved it  ";

			ReadExcel rc = new ReadExcel();
			rc.startTestcase(testcasename, "one", 1, testdescription, "Testcase is passed", comment);

		}

	}
}
