package PageObject;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import CommonElements.CommonHelp;
import baseclass.BaseTestclass;

public class UserPanel extends BaseTestclass {

	By dashbtnuserpnl = By.xpath("//a[@class='d-none d-lg-flex btn btn-sm btn-primary nav-start-a-live-btn']");

	By threedot1 = By.xpath(
			"//div[@class='owl-stage']//div[1]//div[1]//div[1]//div[1]//div[2]//div[1]//div[1]//button[1]//*[name()='svg']");

	By courses = By.xpath("//span[@class='font-14 text-dark-blue font-weight-500'][normalize-space()='Courses']");
	By Assignment = By.xpath("//span[normalize-space()='Assignments']");

	By meeting = By.xpath("//span[normalize-space()='Meetings']");

	By homebtn = By.xpath("//a[normalize-space()='Home']");

	By supportab = By.xpath("//span[normalize-space()='Support']");

	public void dashboardbtton() {
		driver.findElement(homebtn).click();

		driver.findElement(dashbtnuserpnl).click();

	}

	public void mypurchssection() {
		// By threedot =
		// By.xpath("//div[@class='content']//div[1]//div[1]//div[2]//div[1]//div[1]//button[1]//*[name()='svg']//*[name()='circle'][1]");
		List<WebElement> elem = driver
				.findElements(By.xpath("//h3[@class='webinar-title font-weight-bold font-16 text-dark-blue']"));

		int s = elem.size();
		for (int i = 1; i <= s; i++) {
			By coursecard = By
					.xpath("(//h3[@class='webinar-title font-weight-bold font-16 text-dark-blue'])[" + i + "]");
			driver.findElement(coursecard).click();
			driver.navigate().back();

		}

	}

	public void courses() {

		driver.findElement(courses).click();
		driver.findElement(By.xpath("//a[normalize-space()='My purchases']")).click();

	}

	public void mycomments() {

		driver.findElement(By.xpath("//a[normalize-space()='My comments']")).click();

	}

	public void openvideofrompurchase() {

		driver.findElement(
				By.xpath("//div[@class='content']//div[1]//div[1]//div[2]//div[1]//div[1]//button[1]//*[name()='svg']"))
				.click();

	}

	public void Favorite() {

		driver.findElement(By.xpath("//a[normalize-space()='Favorites']")).click();

		try {
			// String favcourse = driver.findElement(By.xpath("//h3[@class='font-16
			// text-dark-blue font-weight-bold']")).getText();
			System.out.println("testdata Favorite");

		} catch (Exception e) {
			String truef = driver.findElement(By.xpath("//h2[@class='text-dark-blue']")).getText();
			System.out.println(truef);
			System.out.println("completed");

		}

	}

	public void Assigmentclick() {

		driver.findElement(By.xpath("//span[normalize-space()='Assignments']")).click();
	}

	public void myAssigmentclick() {

		driver.findElement(By.xpath("//a[normalize-space()='My Assignments']")).click();
	}

	public void meeting() {
		By meetings = By.xpath("//span[normalize-space()='Meetings']");
		By reservation = By.xpath("//a[normalize-space()='My reservations']");
		driver.findElement(meetings).click();
		driver.findElement(reservation).click();
	}

	public void quizsection() {
		By quizes = By.xpath("//span[normalize-space()='Quizzes']");
		By myresult = By.xpath("//a[normalize-space()='My results']");
		CommonHelp.clickOnElement(quizes);
		CommonHelp.clickOnElement(myresult);

	}

	public void quizclickparti() {

		By quizes = By.xpath("//span[normalize-space()='Quizzes']");
		CommonHelp.clickOnElement(quizes);
	}

	public void notparticipeted() {

		By quiznotparticipeted = By.xpath("//a[normalize-space()='Not Participated']");
		CommonHelp.clickOnElement(quiznotparticipeted);

	}

	public void financial() {
		By financial = By.xpath("//span[normalize-space()='Financial']");
		CommonHelp.clickOnElement(financial);

	}

	public void Financialsummary() {
		By financial = By.xpath("//a[normalize-space()='Financial summary']");
		CommonHelp.clickOnElement(financial);

	}

	public void addwalletmoney() {
		By addwalletmoney = By.xpath("//a[normalize-space()='Add Wallet Money']");
		CommonHelp.clickOnElement(addwalletmoney);

	}

	public void installment() throws InterruptedException {

		By intsalmentuser = By.xpath("//a[normalize-space()='Installments']");
		By threeinstal = By
				.xpath("//div[@class='content']//div[1]//div[1]//div[2]//div[1]//div[2]//button[1]//*[name()='svg']");

		CommonHelp.clickOnElement(intsalmentuser);
		CommonHelp.clickOnElement(threeinstal);
		Thread.sleep(2000);

	}

	public void payupcomoing() {
		By payupcoming = By.xpath(
				"//div[@x-placement='bottom-start']//a[@class='webinar-actions d-block mt-10'][normalize-space()='Pay Upcoming Part']");
		CommonHelp.clickOnElement(payupcoming);

	}

	public void clickpayupcombutton() {

		By payupcbutton = By.xpath(
				"//div[contains(@class,'show')]//a[@class='webinar-actions d-block mt-10'][normalize-space()='Pay Upcoming Part']");
		CommonHelp.clickOnElement_JS(payupcbutton);

	}

	public void viewdetails() {

		By Viewdeatails = By.xpath(
				"//div[@x-placement='bottom-start']//a[@class='webinar-actions d-block mt-10'][normalize-space()='View Details']");
		CommonHelp.clickOnElement_JS(Viewdeatails);

	}

	public void suporttabuser() {

		driver.findElement(supportab).click();
	}

	public void newtab() {

		By supnew = By.xpath("//a[normalize-space()='New']");
		driver.findElement(supnew).click();
	}

	public void indcustomersupport() {

		By CustomerSupport = By.xpath("//a[normalize-space()='Courses support']");
		driver.findElement(CustomerSupport).click();
	}

	public void ticket() {

		By ticketele = By.xpath("//a[normalize-space()='Tickets']");
		driver.findElement(ticketele).click();

	}

	public void Forum() {

		By Forum = By.xpath("//span[normalize-space()='Forums']");
		driver.findElement(Forum).click();

	}

	public void newtopic() {

		By newfirsttopic = By.xpath("//a[normalize-space()='New Topic']");
		driver.findElement(newfirsttopic).click();

	}

	public void Mypostds() {

		By Myposts = By.xpath("//a[normalize-space()='My Posts']");
		driver.findElement(Myposts).click();
	}

	public void newtopics() {

		By newTtopics = By.xpath("//a[normalize-space()='My Topics']");
		driver.findElement(newTtopics).click();
	}

	
	public void bookmarks() {
		
		
		By bookmarks = By.xpath("//a[normalize-space()='Bookmarks']");
		driver.findElement(bookmarks).click();

		
	}
	
	public void logoutpageuser() {
		
	By logout = By.xpath("//span[normalize-space()='Log out']");
	driver.findElement(logout).click();
}
}