package Testcaseoutp;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
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
		// driver.quit();
	}
	@Test(dataProvider = "data-provider")
	public void checkdatauseraccess(String email) throws InterruptedException {
		String main = driver.getWindowHandle();
		System.out.println("main..." + main);
		vp.checkuseronadmin(email);
		vp.switchwindow();
		vp.openlearningpage("Astromani 2024 ");
		vp.switchwindow();
		Thread.sleep(15000);
//..........................................section
		try {
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[@class=\"chapter-icon bg-gray300 mr-10\"])[4]")).click();
			
			WebElement frm = driver.findElement(By.xpath("//iframe[@loading='lazy']"));
			driver.switchTo().frame(frm);
			WebElement video_p = driver.findElement(By.xpath("//div[@class='plyr__controls']"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript(
					"arguments[0].addEventListener('mousemove', function() {clearTimeout(this.hideControlsTimeout);});",
					video_p);
			String nm = driver.findElement(By.xpath("//div[@aria-label='Duration']")).getText();
			System.out.println(nm);
		} catch (Exception e) {
			System.out.println("framenotfound");
		}
		try {
			System.out.println("displayed");
			// driver.findElement(By.xpath("//button[@class='plyr__control
			// plyr__control--overlaid']")).click();
			driver.findElement(By.xpath("//button[@class='plyr__controls__item plyr__control plyr__control--pressed']"))
					.click();
			System.out.println("displayed");
			driver.switchTo().defaultContent();
		} catch (Exception e) {
			System.out.println("not found");
		}
		List<WebElement> k = driver
				.findElements(By.xpath("//span[@class='font-weight-bold font-14 text-dark-blue d-block']"));
		int sectionnumbersum = k.size();
		int sectionnumber =sectionnumbersum-10;
		System.out.println(sectionnumbersum);
		for (int i = 0; i < sectionnumbersum; i++) {
			String sectionname = k.get(i).getText();
			System.out.println(sectionname);
		}
		// .........................topic
		List<WebElement> topic = driver.findElements(
				By.xpath("//span[@class='font-weight-bold font-14 text-dark-blue d-block']//following-sibling::span"));
		int topnum = k.size();
		for (int i = 0; i < topnum; i++) {
			String topicname = topic.get(i).getText();
			System.out.println(topicname);
		}
		// System.out.println("topnum...."+topnum);
		// ............playeattrbute...........
		// boolean playbtn = driver.findElement(By.xpath("//button[@class='plyr__control
		// plyr__control--overlaid']")).isDisplayed();
		By time = By.xpath("//div[@class='plyr__controls__item plyr__time--current plyr__time']");
//...........................................................
		driver.findElement(By.xpath("(//span[@class='font-weight-bold font-14 text-dark-blue d-block'])[1]")).click();
		// System.out.println("cousercontent " + text);
		Thread.sleep(5000);
		// driver.findElement(By.xpath("(//span[@class='chapter-icon bg-gray300
		// mr-10'])[3]")).click();
		driver.findElement(
				By.xpath("(//span[@class='font-weight-bold font-14 text-dark-blue d-block'])[" + sectionnumber + "]"))
				.click();
		driver.findElement(By.xpath("(//span[@class='chapter-icon bg-gray300 mr-10'])[30]")).click();
		Set<String> allWINDOW = driver.getWindowHandles();
		String parent = driver.getWindowHandle();
		System.out.println("parent" + parent);
		Iterator<String> it1 = allWINDOW.iterator();
		int a = 1;
		while (it1.hasNext()) {
			String child_window = it1.next();
			if (!child_window.equals(parent)) {
				driver.switchTo().window(main);
			}
		}
	}
	@DataProvider(name = "data-provider")
	public Object[][] dpMethod() {
		return new Object[][] { { "balmukund.sahu@rechargestudio.com" } };
	}
}
