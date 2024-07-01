package PageObject;

import org.openqa.selenium.By;

import CommonElements.CommonHelp;
import baseclass.BaseTestclass;

public class InstructorDashboard extends BaseTestclass {
	By home = By.xpath("//a[normalize-space()='Home']");
	By instructorname = By.xpath("//h3[@class='font-16 font-weight-bold text-center']");
	By pendingmeetiing = By.xpath("//span[normalize-space()='Pending meetings']");
	By pendingmeeting = By.xpath("//span[normalize-space()='Pending meetings']");

	By coursetab = By.xpath("//span[@class='font-14 text-dark-blue font-weight-500'][normalize-space()='Courses']");

	By Course_new = By.xpath("//a[@href='/panel/webinars/new'][normalize-space()='New']");

	public void Clickonhome() {

		CommonHelp.clickOnElement_JS(home);

	}

	public void mypurchasebtn() {

		By purchasetab = By.xpath("//a[normalize-space()='My purchases']");
		CommonHelp.clickOnElement(purchasetab);
	}

	public void Clickonthecoursetab() {

		CommonHelp.clickOnElement(coursetab);

	}

	public void newtab() {

		CommonHelp.clickOnElement(Course_new);
	}

	public void mycorsepage() {
		By.xpath("//a[normalize-space()='My courses']");

		CommonHelp.clickOnElement(Course_new);

	}

	public void invitedcorsepage() {
		By Invotedcourse = By.xpath("//a[normalize-space()='Invited courses']");

		CommonHelp.clickOnElement(Invotedcourse);

	}

	public void mycoursecomment() {

		By mycoursecomm = By.xpath("//a[normalize-space()='My course comments']");
		CommonHelp.clickOnElement(mycoursecomm);
	}

	public void myComments() {

		By mycoursecomm = By.xpath("//a[normalize-space()='My course comments']");
		CommonHelp.clickOnElement(mycoursecomm);
	}

	public void mycomments() {

		By mycom = By.xpath("//a[normalize-space()='My comments']");
		CommonHelp.clickOnElement(mycom);

	}

	public void favorites() {

		By favr = By.xpath("//a[normalize-space()='Favorites']");
		CommonHelp.clickOnElement(favr);

	}

}