package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import CommonElements.CommonHelp;
import baseclass.BaseTestclass;

public class OrderCourse extends BaseTestclass {
	By coursed = By.xpath("//ul[@class='cat-dropdown-menu']");
	By cour = By.xpath("//span[@class=\"dropdown-toggle nav-item nav-link\"]");

	public void clickonthecoursehomelibk() throws InterruptedException {

		WebElement df = driver.findElement(cour);

		Actions ac = new Actions(driver);
		ac.moveToElement(df).build().perform();
		CommonHelp.Select_Item_list(coursed, "View All");
		Thread.sleep(4000);

	}

	public void clickontheAstrologycourdrop() throws InterruptedException {

		WebElement df = driver.findElement(cour);

		Actions ac = new Actions(driver);
		ac.moveToElement(df).build().perform();
		CommonHelp.Select_Item_list(coursed, "Astrology");
		Thread.sleep(4000);

	}

	public void clickontheAyurvedacourdrop() throws InterruptedException {

		WebElement df = driver.findElement(cour);

		Actions ac = new Actions(driver);
		ac.moveToElement(df).build().perform();
		CommonHelp.Select_Item_list(coursed, "Ayurveda");
		Thread.sleep(4000);

	}

	public void clickontheNumerologycourdrop() throws InterruptedException {

		WebElement df = driver.findElement(cour);

		Actions ac = new Actions(driver);
		ac.moveToElement(df).build().perform();
		CommonHelp.Select_Item_list(coursed, "Numerology");
		Thread.sleep(4000);

	}

	public void clickonthePalmistrycourdrop() throws InterruptedException {

		WebElement df = driver.findElement(cour);

		Actions ac = new Actions(driver);
		ac.moveToElement(df).build().perform();
		CommonHelp.Select_Item_list(coursed, "Palmistry");
		Thread.sleep(4000);

	}

	public void clickontheViewAllcourdrop() throws InterruptedException {

		WebElement df = driver.findElement(cour);

		Actions ac = new Actions(driver);
		ac.moveToElement(df).build().perform();
		CommonHelp.Select_Item_list(coursed, "Vastu");
		Thread.sleep(4000);

	}

	public void bookfromcentralbookbtn() {

		By bookbtn = By.xpath("//div[contains(@class,'course-img text-center')]//form");

		driver.findElement(bookbtn).click();

	}

	public void startpaybutton() {
		By startbuttonpay = By.xpath("By.xpath(//button[@id='paymentSubmit']");
		driver.findElement(startbuttonpay).click();
	}

	public void addtocartbutton() {
		By addtoCartbutton = By.xpath("//button[@class='mt-20 btn btn-primary js-course-add-to-cart-btn']");
		driver.findElement(addtoCartbutton).click();

	}

	public void bluebuybutton() {
		By bluebuybutton = By
				.xpath("//div[@class=' d-flex flex-column']//button[@type='button'][normalize-space()='Buy now!']");
		driver.findElement(bluebuybutton).click();

	}

	public void checkboxcart() {

		By addcartnumber = By.xpath("//*[@id='app']/div[1]/div/div[2]/div[1]/div[1]/button/span");
		String name = driver.findElement(addcartnumber).getText();
		System.out.println(name);

		// driver.findElement(addcartnumber).click();

	}

	public void gotoaddtocartpage() {
		By popupaddtocart = By.xpath(
				"//div[@class='dropdown-menu show']//a[@class='btn btn-sm btn-primary btn-block mt-50 mt-md-15'][normalize-space()='Go to cart']");

		By carticon = By.xpath("(//button[@id='navbarShopingCart']//*[name()='svg'])[2]");
		 driver.findElement(carticon).click();
		// boolean say =driver.findElement(carticon).isDisplayed();
		//System.out.println(say);
		//CommonHelp.clickOnElement_JS(carticon);
		 
		 driver.findElement(popupaddtocart).click();
		// CommonHelp.clickOnElement_JS(popupaddtocart);

	}

}
