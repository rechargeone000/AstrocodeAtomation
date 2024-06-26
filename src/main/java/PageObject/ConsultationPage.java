package PageObject;

import org.openqa.selenium.By;

import com.github.dockerjava.api.model.Driver;

import CommonElements.CommonHelp;
import baseclass.BaseTestclass;

public class ConsultationPage extends BaseTestclass {

	HomePaget hp = new HomePaget();

	By Bookbtnfirst = By.xpath("//div[@class='row']//div[1]//div[1]//div[2]//div[2]//div[2]//div[2]//div[1]//a[1]");

	By consultastrologerlink = By.xpath("//*[@id=\"navbarContent\"]/ul/li[2]/a");

	public void consulationpageClicohomelink() {

		// hp.clickonconultationwithastro();
		CommonHelp.clickOnElement(consultastrologerlink);

	}

	public void clickonthebookbtn() {

		By Bookbtn = By.xpath("//div[@class='row']//div[1]//div[1]//div[2]//div[2]//div[2]//div[2]//div[1]//a[1]");
		CommonHelp.clickOnElement_JS(Bookbtn);

	}

	public void selecttime() {

		By mn = By.cssSelector("label[for='slotTime30']");
		CommonHelp.scrollToElementView(mn);
		CommonHelp.clickOnElement_JS(mn);
	}

	public void selectmeetingdate() {

		By meetingdate = (By.xpath("//*[@id=\"plotId\"]/div[2]/div/div/table/tbody/tr/td[30]"));
		CommonHelp.clickOnElement_JS(meetingdate);

	}

	public void reservetime() {

		driver.findElement(By.cssSelector("label[for='availableTime1036']")).click();

	}

	public void paymentform() {
		// input[contains(@placeholder,'Name*')]
		driver.findElement(By.cssSelector("input[placeholder='Name*']")).sendKeys("balmukundsahu");
		driver.findElement(By.xpath("//input[@placeholder='Email*']")).sendKeys("balmukund.sahu@rechargestudio.com");
		driver.findElement(By.xpath("//input[@placeholder='Contact*']")).sendKeys("8602142526");
		driver.findElement(By.xpath("(//button[@type=\"button\"])[10]")).click();

	}
}
