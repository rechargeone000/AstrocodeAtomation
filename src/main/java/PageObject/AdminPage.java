package PageObject;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import CommonElements.CommonHelp;
import baseclass.BaseTestclass;

public class AdminPage extends BaseTestclass {

	By course = By.xpath("//span[normalize-space()='Courses']");

	By coursenew = By.xpath("//a[@href='/admin/webinars/create']");

	By languagedropd = By.xpath("//select[@name='lang']");

	By CourseType = By.xpath("//select[@name='type']");

	By Title = By.xpath("//div[@class='form-group mt-15']//input[@name='title']");

	By courseUrl = By.xpath("//input[@name='slug']");

	public void Clickothecoursetab() {

		CommonHelp.clickOnElement(course);

	}

	public void clickonthenewcourse() {

		CommonHelp.clickOnElement(coursenew);

	}

	public void selelectlangdrop() {

		CommonHelp.selectdropdownbyindex(languagedropd, 1);

	}

	public void Title() {

		driver.findElement(Title).sendKeys("newcousre1");

	}

	public void CourseURL() {

		driver.findElement(courseUrl).sendKeys("newcousre1");
	}

	public void Instrucktor() throws InterruptedException {

		By Instructordrop = By.xpath("(//span[@class=\"select2-selection__rendered\"])[1]");
		By searchbox = By.xpath("//input[@role='searchbox']");
		By list = By.xpath("//ul[@class='select2-results__options']/li");

		driver.findElement(Instructordrop).click();

		driver.findElement(searchbox).sendKeys("alok");
		// String text = driver.findElement(list).getText();

		// CommonHelp.clickOnElement_JS(list);
		// ul[@class="select2-results__options"]/li
		// WebElement countryUL =
		// driver.findElement(By.xpath("//ul[@class='select2-results__options']"));
		// List<WebElement> countriesList = countryUL.findElements(By.tagName("li"));

		Thread.sleep(4000);
		String name = driver.findElement(By.xpath("//ul[@class='select2-results__options']//li")).getText();
		System.out.println(name);
		driver.findElement(By.xpath("//ul[@class='select2-results__options']//li")).click();

//		for (WebElement li : countriesList) {
//			System.out.println(li.getText());
//			if (li.getText().equals("Mr.Alok Khandelwal")) {
//				li.click();
//			}
		// CommonHelp.Select_Item_list(list, "Mr.Alok Khandelwal");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='seo_description']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@id='thumbnail']")).sendKeys("/store/1/Blog thumbnails/01.jpg");
		driver.findElement(By.xpath("//input[@id='cover_image']")).sendKeys("/store/1/Blog thumbnails/01.jpg");
		
		
		driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys("test");
		
		driver.findElement(By.xpath("//div[@class='form-group mt-15']//input[@name='capacity']")).sendKeys("100");
		
		driver.findElement(By.xpath("//input[@name='access_days']")).sendKeys("120");

		driver.findElement(By.xpath("//input[@placeholder='Enter 0 for Free']")).sendKeys("14");
		
		By slist = By.xpath("//select[@id='categories']");
		
		CommonHelp.selectdropdownbyindex(slist, 2);
		
		driver.findElement(By.xpath("//input[@name='order']")).sendKeys("30");
		
		driver.findElement(By.xpath("//input[@name='course_rate']")).sendKeys("4");

		driver.findElement(By.xpath("//textarea[@name='message_for_reviewer']")).sendKeys("test");
		
		
		driver.findElement(By.xpath("//button[@id='saveAndPublish']")).click();
		
		
	}
	
	
	
	
	
	
	
	
	

	public void uploadpath() throws InterruptedException {

		driver.findElement(By.xpath("(//button[@data-input='thumbnail'])[1]")).click();
		driver.findElement(By.xpath("//button[@data-input='thumbnail']//i[@class=\"fa fa-upload\"]")).click();
		Thread.sleep(5000);

		Set<String> Alwindo = driver.getWindowHandles();
		String currentwin = driver.getWindowHandle();
		for (String x : Alwindo) {

			if (x != currentwin) {

				driver.switchTo().window(x);
			}
		}

		By uploadnewframe = By.xpath("//a[@class='fab-button fab-toggle']");
		driver.findElement(By.xpath("//div[normalize-space()='Blog thumbnails']")).click();

		driver.findElement(By.xpath("//div[normalize-space()='01.jpg']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-action='use']")).click();
		Thread.sleep(2000);

		Thread.sleep(2000);

	}
	
	
	
	public void Coupancode() {
		
		By coupantab = By.xpath("//span[normalize-space()='Coupons']");
		
		By coupannew = By.xpath("//a[@href='/admin/financial/discounts/new']");
		
		By Title = By.xpath("//input[@name='title']");
		
		
		CommonHelp.clickOnElement(coupantab);
		CommonHelp.clickOnElement(coupannew);
		CommonHelp.clickOnElement(Title);


		
		
		
	}
	
	
	
	
	
	
}
