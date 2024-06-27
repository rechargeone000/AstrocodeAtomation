package PageObject;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import CommonElements.CommonHelp;
import CommonElements.commonWaits;
import baseclass.BaseTestclass;
import jdk.internal.org.jline.utils.Log;

public class HomePaget extends BaseTestclass {

	By hindicources = By.xpath("//h2[contains(text(),'Hindi Courses')]");

	By selects = By.xpath("//h3[@class=\"mt-5 webinar-title font-weight-bold font-16 text-dark-blue\"]");

	By bulletone = By.xpath("//*[@id=app]/section/div/div/section[1]/div[2]/div[2]/div/span[1]");

	By bulletsecond = By.xpath("//*[@id=\"app\"]/section/div/div/section[1]/div[2]/div[2]/div/span[2]");

	By link1 = By.xpath("//*[@id=\"app\"]/section/div/div/section[1]/div[2]/div[1]/div/div[1]/div/figure/figcaption/a");

	By link3 = By.xpath("//*[@id='app']/section/div/div/section[1]/div[2]/div[1]/div/div[3]/div/figure/figcaption/a");

	By link2 = By.xpath("//*[@id='app']/section/div/div/section[1]/div[2]/div[1]/div/div[2]/div/figure/figcaption/a");

	By firstcard = By
			.xpath("//*[@id=\"app\"]/section/div/div/section[1]/div[2]/div[1]/div/div[1]/div/figure/figcaption/a/h3");

	By Accept_all_cookies = By.xpath("//h2[contains(text(),'Accept all cookies')]");

	By firstbullet1 = By.xpath("//*[@id='app']/section/div/div/section[1]/div[2]/div[2]/div/span[1]");

	By hind_viewallbutton = By.xpath("(//a[contains(text(),'View All')])[1]");

	By englishviewall = By.xpath("(//a[contains(text(),'View All')])[2]");

	By AstroViewAll = By.xpath("(//a[contains(text(),'View All')])[3]");

	By InstructoeViewall = By.xpath("//a[contains(text(),'View All')])[4]");

	By AllHindiCoursesname = By.xpath("//h3[@class=\"mt-5 webinar-title font-weight-bold font-16 text-dark-blue\"]");

	By Allinstructor = By.xpath("//div[@class='row']//div//div[1]//div[3]//a");

	By englishnames = By.xpath("//h3[@class=\"mt-5 webinar-title font-weight-bold font-16 text-dark-blue\"]");

	By astrologers = By.xpath("//div[@class=' teacher-avatar mt-5 position-relative']");

	By instagram = By.xpath("//a[normalize-space()='']//img[@alt='Instagram']");

	By whatsapplink = By.xpath("//img[@alt='Whatsapp']");

	By twitter = By.xpath("//img[@alt='Twitter']");

	By facebook = By.xpath("//img[@alt='Facebook']");

	By pinrest = By.xpath("/html[1]/body[1]/footer[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/a[5]/img[1]");

	By addresshm = By.xpath("//span[contains(text(),'312, 3rd Floor, Vikram Urbane, 25-A Mechanic Nagar')]");
	
	By conultationwithastro = By.linkText("consult-with-astrologers");
	
	public void clickonconultationwithastro() {
		
		driver.findElement(conultationwithastro).click();
	}
	public boolean Logoicon() throws InterruptedException {

		// driver.findElement(firstbullet1).click();

		// Accept_all_cookies.click();}

		By logo = By.xpath("//div[@class='navdesk']//img[@alt='site logo']");
		boolean logovis = driver.findElement(logo).isDisplayed();

		Assert.assertEquals(logovis, true);
		return logovis;

	}

	public void viewallbtnhndi() throws InterruptedException {

		// CommonHelp.clickOnElement_JS(hind_viewallbutton);
		CommonHelp.clickOnElement(hind_viewallbutton);

		// driver.findElement(hind_viewallbutton).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(4000);

		List<WebElement> elements = driver
				.findElements(By.xpath("//h3[@class='mt-5 webinar-title font-weight-bold font-16 text-dark-blue']"));
		int n = elements.size();
		int i;
		for (i = 2; i <= n; i++) {
			driver.findElement(
					By.xpath("(//h3[@class='mt-5 webinar-title font-weight-bold font-16 text-dark-blue'])[" + i + "]"))
					.click();

			Thread.sleep(4000);

			String coursename = driver.findElement(By.xpath("//h1[@class='font-30 course-title text-center py-10']"))
					.getText();

			System.out.println(coursename);
			driver.navigate().back();

		}
		driver.navigate().back();

	}

	public void viewallbtnenglish() throws InterruptedException {

		driver.findElement(englishviewall).click();
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(4000);
		List<WebElement> allname = driver.findElements(englishnames);

		int coursesname = allname.size();
		int i = 0;
		for (i = 1; i <= coursesname; i++) {
			driver.findElement(
					By.xpath("(//h3[@class='mt-5 webinar-title font-weight-bold font-16 text-dark-blue'])[" + i + "]"))
					.click();

			Thread.sleep(4000);

			String coursename = driver.findElement(By.xpath("//h1[@class='font-30 course-title text-center py-10']"))
					.getText();

			System.out.println(coursename);
			driver.navigate().back();

		}
		driver.navigate().back();

	}
	
	public void clickonviewallastrbtn() {
		driver.findElement(AstroViewAll).click();

		
	}

	public void viewallAstrologers() throws InterruptedException {

		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(4000);
		By Astronametext = By.xpath("//h1[@class='font-24 font-weight-bold text-dark-blue']");
		List<WebElement> allname = driver.findElements(astrologers);

		By astronamesoncard = By.xpath("//h3[@class=\"font-16 font-weight-bold text-dark-blue text-left  ml-10\"]");
		int astronumber = driver.findElements(astronamesoncard).size();

		int i = 0;

		for (i = 52; i <= astronumber; i++) {

			By AstroclicBookbtn = By.xpath("//div[@id='reviews']//div[@class='row']//div[" + i
					+ "]//div[1]//div[2]//div[2]//div[2]//div[2]//div[1]//a[1]");

			CommonHelp.clickOnElement_JS(AstroclicBookbtn);

			System.out.println(driver.findElement(Astronametext).getText());

			driver.navigate().back();

		}
		driver.navigate().back();

	}

	public void viewallbtninstructor() throws InterruptedException {
   
		By instructor = By.xpath("(//a[normalize-space()='View All'])[5]");
		By instructtab = By.xpath("//a[@id='content-tab']");
		driver.findElement(instructor).click();
		Thread.sleep(4000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(4000);

		By instructorlist = By.xpath("//div[@class='row']//div//div[1]//div[3]//a[1]");

		List<WebElement> allname = driver.findElements(instructorlist);

		Thread.sleep(4000);
		int coursesname = allname.size();
		System.out.println(coursesname);

		for (int i = 1; i <= coursesname; i++) {

			By newclick = By.xpath("//div[@class='row']//div[" + i + "]//div[1]//div[3]//a[1]");

			CommonHelp.clickOnElement_JS(newclick);

			Thread.sleep(4000);

			driver.navigate().back();

		}
		driver.navigate().back();

	}

	public void onlinecourse() throws InterruptedException {
		System.out.println("enter the  onlinecourse" + driver);
		// Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/section/div/div/div[2]/div/div/div[1]/div/a[1]/div/img"))
				.click();

		List<WebElement> elements = driver
				.findElements(By.xpath("//h3[@class='mt-5 webinar-title font-weight-bold font-16 text-dark-blue']"));
		int n = elements.size();
		int i;
		for (i = 16; i <= n; i++) {
			driver.findElement(
					By.xpath("(//h3[@class='mt-5 webinar-title font-weight-bold font-16 text-dark-blue'])[" + i + "]"))
					.click();

			Thread.sleep(4000);

			String coursename = driver.findElement(By.xpath("//h1[@class='font-30 course-title text-center py-10']"))
					.getText();

			System.out.println(coursename);

			js.executeScript("window.scrollBy(0,500)", "");

		}

	}

	public void onlineconsuatation() {

		By onconsultation = By.xpath("//div[contains(@class,'mt-lg-0 mt-lg-0 cats mobile2')]//a[2]");
		CommonHelp.clickOnElement(onconsultation);
		CommonHelp.scrollToPageDown();
		driver.navigate().back();

	}

	public void knowmorebtn() throws InterruptedException {
		By knowmore = By.xpath("//a[@class='btn btn-primary rounded-pill'][normalize-space()='Know more']");

		commonWaits.waitTillElementVisible(knowmore);

		CommonHelp.clickOnElement(knowmore);

	}

	public void personalizedreport() {

		By personalized = By.xpath("//img[@alt='Personalized <br> Reports']");
		CommonHelp.clickOnElement(personalized);
		CommonHelp.scrollToPageDown();
		driver.navigate().back();
	}

	public void formbutton() throws InterruptedException {

		driver.findElement(By.xpath("//div[contains(@class,'course-img text-center has-video')]//form")).click();
		Thread.sleep(4000);
//		driver.findElement(By.xpath("//input[@id='customer_name']")).sendKeys("mayank");
//		driver.findElement(By.xpath("//input[@id='customer_email']")).sendKeys("mayank@rechargestudio.com");
//		driver.findElement(By.xpath("//input[@id='customer_number']")).sendKeys("918959090959");
//		driver.findElement(By.xpath("//button[@id='paymentSubmit']")).click();
//		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(2000);
	}

	public void playvideofromcoursetab() throws InterruptedException {

		driver.findElement(By.xpath("//a[@id='content-tab']")).click();

		System.out.println("tab has been clicked");
		Thread.sleep(2000);
		// boolean elemb =
		// driver.findElement(By.xpath("//*[@id='files_387']/div[2]/button")).isDisplayed();
		// driver.findElement(By.xpath("//*[@id='files_387']/div[2]/button")).click();

		driver.findElement(By.xpath(
				"//div[@id='files_352']//div//a[@class='course-content-btns btn btn-sm btn-primary'][normalize-space()='Play']"))
				.click();

		String fir = driver.getWindowHandle();
		Set<String> s = driver.getWindowHandles();

		Iterator<String> I1 = s.iterator();
		while (I1.hasNext()) {

			String child_window = I1.next();

			if (!fir.equals(child_window)) {
				driver.switchTo().window(child_window);

				System.out.println(driver.switchTo().window(child_window).getTitle());
				Thread.sleep(4000);
				WebElement ed = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div/div/div/iframe"));
				driver.switchTo().frame(ed);
				Thread.sleep(2000);

				driver.findElement(By.xpath("//button[@class='plyr__control plyr__control--overlaid']")).click();

				// System.out.println(elemb);
//		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("mayank@rechargestudio.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
//		driver.findElement(By.xpath("//*[@id=\"videosAccordion\"]/div/form/button")).click();

				Thread.sleep(5000);
				driver.findElement(By.xpath("//a[@id='play']"));
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"playVideo\"]/div/div/div[1]/button/svg"));
				Thread.sleep(2000);

				driver.findElement(
						By.xpath("//button[@class=\"plyr__controls__item plyr__control plyr__control--pressed\"]"))
						.click();
				// driver.navigate().back();

			}
		}
	}

	public void linkoffooter() throws InterruptedException {

		By listoflinks = By.xpath("(//ul[contains(@class,'ml-10')]//li//p//a[contains(@href,'')])");
		List<WebElement> countlistoflinks = driver.findElements(listoflinks);
		int coun = countlistoflinks.size();
		Actions actions = new Actions(driver);

		System.out.println(coun);
		for (int i = 1; i <= coun; i++) {
			Thread.sleep(3000);
			By links = By.xpath("(//ul[contains(@class,'ml-10')]//li//p//a[contains(@href,'')])[" + i + "]");

			WebElement pagelink = driver.findElement(links);
			System.out.println(pagelink.getText());
			actions.keyDown(Keys.CONTROL).click(pagelink).keyUp(Keys.CONTROL).perform();

			Thread.sleep(2000);
			// driver.navigate().back();

		}

	}

	public void socialmedialinks() throws InterruptedException {
		Actions actions = new Actions(driver);
		WebElement d = driver.findElement(instagram);

		actions.keyDown(Keys.CONTROL).click(d).keyUp(Keys.CONTROL).perform();
		Thread.sleep(2000);
		// CommonHelp.clickOnElement(twitter);
		WebElement twitt = driver.findElement(twitter);
		actions.keyDown(Keys.CONTROL).click(twitt).keyUp(Keys.CONTROL).perform();

		WebElement face = driver.findElement(facebook);
		actions.keyDown(Keys.CONTROL).click(face).keyUp(Keys.CONTROL).perform();

		// driver.navigate().back();
		WebElement pinr = driver.findElement(facebook);
		actions.keyDown(Keys.CONTROL).click(pinr).keyUp(Keys.CONTROL).perform();

	}

	public String addresst() {

		WebElement addretext = driver.findElement(addresshm);
		String add = addretext.getText();
		System.out.println(add);
		return add;

	}

}
