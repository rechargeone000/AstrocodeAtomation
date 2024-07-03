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
	By favr = By.xpath("//a[normalize-space()='Favorites']");
	By purchasetab = By.xpath("//a[normalize-space()='My purchases']");
	By Invotedcourse = By.xpath("//a[normalize-space()='Invited courses']");
	By newcourses = By.xpath("//a[normalize-space()='My courses']");
	By mycoursecomm = By.xpath("//a[normalize-space()='My course comments']");

	public void Clickonhome() {

		CommonHelp.clickOnElement_JS(home);

	}

	public void mypurchasebtn() {

		CommonHelp.clickOnElement(purchasetab);
	}

	public void Clickonthecoursetab() {

		CommonHelp.clickOnElement(coursetab);

	}

	public void newtab() {

		CommonHelp.clickOnElement(Course_new);
	}

	public void mycorsepage() {

		CommonHelp.clickOnElement(Course_new);

	}

	public void invitedcorsepage() {

		CommonHelp.clickOnElement(Invotedcourse);

	}

	public void mycoursecomment() {

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

		CommonHelp.clickOnElement(favr);

	}

	public void Coursebundles() {

		By CourseBundles = By.xpath("//span[normalize-space()='Course Bundles']");
		CommonHelp.clickOnElement(CourseBundles);
	}

	public void newcoursebndlepage() {

		By newbunpage = By.xpath("//a[@href='/panel/bundles/new']");
		CommonHelp.clickOnElement(newbunpage);
	}

	public void Mybundlescoursebndlepage() {

		By newbunpage = By.xpath("//a[normalize-space()='My Bundles']");
		CommonHelp.clickOnElement(newbunpage);
	}

	public void myAssignments() {

		By Myasignments = By.xpath("//a[normalize-space()='Assignments']");

		CommonHelp.clickOnElement(Myasignments);
	}

	public void Assignments() {

		By asignments = By.xpath("//a[normalize-space()='My Assignments']");

		CommonHelp.clickOnElement(asignments);
	}

	public void studentAssignments() {

		By studeasignments = By.xpath("//a[normalize-space()='Students Assignments']");

		CommonHelp.clickOnElement(studeasignments);
	}

	public void meetings() {

		By studeasignments = By.xpath("//span[normalize-space()='Meetings']");

		CommonHelp.clickOnElement(studeasignments);
	}

	public void requestmeet() {

		By request = By.xpath("//a[normalize-space()='Requests']");

		CommonHelp.clickOnElement(request);
	}

	public void setting() {
		By settng = By.xpath("//a[@href='/panel/meetings/settings']");
		CommonHelp.clickOnElement(settng);

	}

	public void settingathreedot() {
		By settng = By.xpath(
				"//tbody/tr[@id='saturdayTimeSheet']/td[@class='text-right align-middle']/div[@class='btn-group dropdown table-actions']/button[1]//*[name()='svg']//*[name()='circle'][1]");
		CommonHelp.clickOnElement(settng);

	}

	public void addbutton() {

		By addbtn = By.xpath("//div[@class='dropdown-menu show']");
		CommonHelp.clickOnElement(addbtn);
	}

	public void Clockthourse() {

		By addbtn = By.xpath("//div[@class='clockpicker-dial clockpicker-hours']//div[@class='clockpicker-tick'][2]");
		CommonHelp.clickOnElement(addbtn);

	}

	public void clockminutes() {

		By clockhours = By.xpath("//div[normalize-space()='12']");
		CommonHelp.clickOnElement(clockhours);

	}
	public void Clockthourse2() {

		By addbtn = By.xpath("//div[@class='clockpicker-dial clockpicker-hours']//div[@class='clockpicker-tick'][4]");
		CommonHelp.clickOnElement(addbtn);

	}

	public void clockminutes2() {

		By clockhours = By.xpath("//div[normalize-space()='55']");
		CommonHelp.clickOnElement(clockhours);

	}
}