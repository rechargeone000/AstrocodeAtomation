package PageObject;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import CommonElements.CommonDropDowns;
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

		By discounttype = By.xpath("//select[@name='source']");
		By disper = By.xpath("//input[@placeholder='0']");

		By minorder = By.xpath("//input[@placeholder='discount minimum order placeholder']");
		By usabletimes = By.xpath(
				"//input[@placeholder='Maximum times that the coupon could be used (Leave it blank for \"1\" time.)']");

		By CoupanCodee = By.xpath("//input[@name='code']");

		By Calender = By.xpath("//input[@name='expired_at']");

		By Tbl = By.xpath("(//table[@class=\"table-condensed\"])[1]");

		By savebtn = By.xpath("//button[@class='btn btn-primary']");

		By sourcetype = By.xpath("//select[@name='source']");

		CommonHelp.scrollToElementView(coupantab);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		CommonHelp.clickOnElement(coupantab);
		CommonHelp.clickOnElement(coupannew);
		CommonHelp.enterValues(Title, "percentAstroAutom10");
		// CommonHelp.selectdropdownbyindex(discounttype, 0);
		CommonHelp.selectdropdownbyindex(sourcetype, 1);

		By Course = By.xpath("//input[@placeholder='Search for a Course']");
		driver.findElement(Course).click();

		By searchbox = By.xpath("//input[@placeholder='Search for a Course']");
		driver.findElement(searchbox).sendKeys("astro");
		// String text = driver.findElement(list).getText();

		// CommonHelp.clickOnElement_JS(list);
		// ul[@class="select2-results__options"]/li
		// WebElement countryUL =
		// driver.findElement(By.xpath("//ul[@class='select2-results__options']"));
		// List<WebElement> countriesList = countryUL.findElements(By.tagName("li"));

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String name = driver.findElement(By.xpath("(//ul[@class='select2-results__options']//li)[1]")).getText();
		System.out.println(name);
		driver.findElement(By.xpath("(//ul[@class='select2-results__options']//li)[1]")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonHelp.enterValues(disper, "10");
		CommonHelp.enterValues(minorder, "1");
		CommonHelp.enterValues(CoupanCodee, "coupen10");
		CommonHelp.enterValues(usabletimes, "2");
		CommonHelp.scrollToElementView(Calender);

		driver.findElement(Calender).click();
		// CommonDropDowns.DropDownSelectByTable("9", Tbl);
		driver.findElement(By.xpath("//button[normalize-space()='Apply']")).click();
		CommonHelp.clickOnElement(savebtn);
	}

	public void discounts() {

		By discounttab = By.xpath("//span[normalize-space()='Course Discounts']");

	}

	public void Discount() throws InterruptedException {
		By discounttab = By.xpath("//span[normalize-space()='Course Discounts']");

		By discountnew = By.xpath("//a[@href='/admin/financial/special_offers/new']");

		By coursediscoutname = By.xpath("//input[@placeholder='Write a unique title...']");

		By Discounttype = By.xpath("//select[@name='type']");

		By discounttype = By.xpath("//select[@name='source']");
		By disper = By.xpath("//input[@placeholder='0']");

		By minorder = By.xpath("//input[@placeholder='discount minimum order placeholder']");
		By usabletimes = By.xpath(
				"//input[@placeholder='Maximum times that the coupon could be used (Leave it blank for \"1\" time.)']");

		By CoupanCode = By.xpath("//input[@name='code']");

		By Calender = By.xpath("//input[@name='expired_at']");

		By Tbl = By.xpath("(//table[@class=\"table-condensed\"])[1]");

		By savebtn = By.xpath("//button[@class='btn btn-primary']");

		By sourcetype = By.xpath("//select[@name='source']");

		CommonHelp.scrollToElementView(discounttab);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		CommonHelp.clickOnElement(discounttab);
		CommonHelp.clickOnElement(discountnew);
		CommonHelp.enterValues(coursediscoutname, "10percentAstroAutom");
		By classss = By.xpath("//span[contains(text(),'Search and Select Class')]");
//		driver.findElement(classss).click();

		By searchbox = By.xpath("//input[@class=\"select2-search__field\"]");

		By listelm = By.xpath("//ul[@class='select2-results__options']//li");

		String text = "Astro Shiromani";
		searchdrpdowncourse(classss, searchbox, listelm, text);

	}

	public void searchdrpdowncourse(By mainsearch, By searchbox1, By Listwebelem, String text)
			throws InterruptedException {

		driver.findElement(mainsearch).click();

		driver.findElement(searchbox1).sendKeys("astro");
		Thread.sleep(4000);
		List<WebElement> name = driver.findElements(Listwebelem);
		int s1 = name.size();
		for (int i = 1; i < s1; i++) {

			String astroname = name.get(i).getText();
			System.out.println(astroname);
			if (astroname == text) {
				name.get(i).click();

			}
		}
		driver.findElement(By.xpath("(//ul[@class='select2-results__options']//li)[1]")).click();

	}

	public void newtabuser() {

		By usertab = By.xpath("//span[normalize-space()='Users']");

		By usernew = By.xpath("//a[@href='/admin/users/create']");
		
		
	
		

		
		
		
		
	}

}
