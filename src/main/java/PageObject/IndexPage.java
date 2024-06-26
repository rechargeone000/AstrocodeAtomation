package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.BaseTestclass;

public class IndexPage extends BaseTestclass {

	By loginbelowbtn = By.xpath("//a[@href='/login'])[3]");

	public void acceptallcookes() {

	}



	public void loginbtnmiddlescreen() {
		Boolean trv = driver.findElement((loginbelowbtn)).isDisplayed();
		System.out.println((trv));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click();", loginbelowbtn);

	}

}
