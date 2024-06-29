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

	public void Clickonthecoursetab() {

		CommonHelp.clickOnElement(coursetab);

	}

	public void newtab() {

		CommonHelp.clickOnElement(Course_new);
	}

}
