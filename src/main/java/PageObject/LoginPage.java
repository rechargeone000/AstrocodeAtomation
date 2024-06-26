package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import CommonElements.CommonHelp;
import baseclass.BaseTestclass;

public class LoginPage extends BaseTestclass {

	// IndexPage ip;
	public By adminlogut = By.xpath("//span[normalize-space()='Logout']");


	By invaldtext = By.xpath("//div[@class='invalid-feedback']");

	By loginconfirmtion = By.xpath("//span[@class='font-16 user-name ml-10 text-dark-blue font-14']");

	By hometext = By.xpath("//a[contains(text(),'Home')]");
	By loginbtnnn = By.xpath("//a[@class='py-5 px-10 mr-10 text-dark-blue font-14']");

	By userenter = By.xpath("//input[@name='username']");

	By enpass = By.xpath("//input[@name='password']");

	By loggbtn = By.xpath("//button[contains(text(),'Login')]");

	public By homelink = By.xpath("//a[normalize-space()='Home']");

	public By navbtnl = By.xpath("//a[@class='d-none d-lg-flex btn btn-sm btn-primary nav-start-a-live-btn']");

	public void logincase(String username1, String password1) throws InterruptedException {

		CommonHelp.clickOnElement_JS(loginbtnnn);

		Thread.sleep(2000);
		driver.findElement(userenter).sendKeys(username1);
		driver.findElement(enpass).sendKeys(password1);

		WebElement loginbelowbtntop = driver.findElement(loggbtn);
		Thread.sleep(2000);
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click();", loginbelowbtntop);

		// driver.findElement(By.xpath("//*[@id=\"navbarContent\"]/ul/li[1]/a")).click();

	}
	
	public void adminlogout() {
		
		driver.findElement(adminlogut).click();
	}

	public String geterrortext() {
		String errortext = driver.findElement(invaldtext).getText();
		return errortext;

	}

	public String loginconfirmationtext() throws InterruptedException {
//		 = hometext.getText();
		String hometextname = driver.findElement(hometext).getText();
		System.out.println(hometextname);
		driver.findElement((hometext)).click();
		Thread.sleep(4000);
		String usersname = driver.findElement(loginconfirmtion).getText();
		return usersname;

	}

}
