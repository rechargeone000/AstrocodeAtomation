package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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

	public void Instrucktor() {

		By Instructordrop = By.xpath("(//span[@class=\"select2-selection__rendered\"])[1]");
		By searchbox = By.xpath("//input[@role='searchbox']");
		By list = By.xpath("//ul[@class='select2-results__options']/li");

		driver.findElement(Instructordrop).click();

		driver.findElement(searchbox).sendKeys("alok");
		String text =driver.findElement(list).getText();
		
		//CommonHelp.clickOnElement_JS(list);

	 CommonHelp.Select_Item_list(list, "Mr.Alok Khandelwal");
		
		driver.findElement(By.xpath("//input[@name='seo_description']")).sendKeys("test");

	}

}
