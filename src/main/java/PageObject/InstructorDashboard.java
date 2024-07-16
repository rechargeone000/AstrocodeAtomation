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

		By clockhours = By.xpath("//div[normalize-space()='15']");
		CommonHelp.clickOnElement(clockhours);

	}

	public void Clockthourse2() {

		By addbtn = By.xpath("//div[@class='clockpicker-dial clockpicker-hours']//div[@class='clockpicker-tick'][4]");
		CommonHelp.clickOnElement(addbtn);

	}

	public void clockminutes2() {

		By clockhours = By.xpath("//div[normalize-space()='20']");
		CommonHelp.clickOnElement(clockhours);

	}

	public void certificate() {

		By clockhours = By.xpath("//span[normalize-space()='Certificates']");
		CommonHelp.clickOnElement(clockhours);

	}

	public void certificateList() {

		driver.findElement(By.xpath("//a[@href='/panel/certificates']")).click();
	}

	public void achievement() {

		driver.findElement(By.xpath("//a[normalize-space()='Achievements']")).click();
	}

	public void CertificateValidation() {

		driver.findElement(By.xpath("//a[normalize-space()='Certificate Validation']")).click();
	}

	public void Completioncerticate() {

		driver.findElement(By.xpath("//a[normalize-space()='Completion Certificates']")).click();
	}

	public void TabnFinancial() {

		driver.findElement(By.xpath("//span[normalize-space()='Financial']")).click();
	}

	public void Salesreport() {

		driver.findElement(By.xpath("//a[normalize-space()='Sales report']")).click();
	}

	public void finacsummary() {

		driver.findElement(By.xpath("//a[normalize-space()='Financial summary']")).click();

	}

	public void finacPayout() {

		driver.findElement(By.xpath("//a[normalize-space()='Payout']")).click();

	}

	public void AddWalletMoney() {

		driver.findElement(By.xpath("//li[@class='mt-5 ']//a[normalize-space()='Add Wallet Money']")).click();

	}

	public void AddSubscribe() {

		driver.findElement(By.xpath("//a[normalize-space()='Subscribe']")).click();

	}

	public void Installments() {

		driver.findElement(By.xpath("//a[normalize-space()='Installments']")).click();

	}

	public void support() {
		driver.findElement(By.xpath("//span[normalize-space()='Support']")).click();

	}

	public void supportnew() {

		driver.findElement(By.xpath("//a[@href='/panel/support/new']")).click();
	}

	public void supportCoursesupport() {

		driver.findElement(By.xpath("//a[normalize-space()='Courses support']")).click();
	}

	public void supportnewTickets() {

		driver.findElement(By.xpath("//a[normalize-space()='Tickets']")).click();
	}

	public void supportMarketing() {
		driver.findElement(By.xpath("//span[normalize-space()='Marketing']")).click();

	}

	public void MarkDiscounts() {
		driver.findElement(By.xpath("//a[normalize-space()='Discounts']")).click();

	}

	public void marktPromotions() {
		driver.findElement(By.xpath("//a[normalize-space()='Promotions']")).click();

	}

	public void instructorForums() {
		driver.findElement(By.xpath("//span[normalize-space()='Forums']")).click();

	}

	public void newForumsTopic() {
		driver.findElement(By.xpath("//a[normalize-space()='New Topic']")).click();

	}

	public void ForumsmyTopic() {
		driver.findElement(By.xpath("//a[normalize-space()='My Topics']")).click();

	}

	public void ForumsmyPosts() {
		driver.findElement(By.xpath("//a[normalize-space()='My Posts']")).click();

	}

	public void ForumsmyBookmarks() {
		driver.findElement(By.xpath("//a[normalize-space()='Bookmarks']")).click();

	}

	public void ForumsmyArticles() {
		driver.findElement(By.xpath("//span[normalize-space()='Articles']")).click();

	}

	public void ForumsnewArticles() {
		driver.findElement(By.xpath("//a[normalize-space()='New Article']")).click();

	}

	public void ForumsnewArticlesComments() {
		driver.findElement(By.xpath("//a[normalize-space()='Comments']")).click();

	}

	public void Noticeboard() {
		driver.findElement(By.xpath("//span[normalize-space()='Noticeboard']")).click();

	}

	public void HistoryNoticeboard() {

		driver.findElement(By.xpath("	//a[normalize-space()='History']")).click();
	}

	public void HistoryNoticeboardnew() {

		driver.findElement(By.xpath("//a[normalize-space()='Course Notices']")).click();

	}

	public void newcourseNoticeboardnew() {

		driver.findElement(By.xpath("//a[normalize-space()='New course notice']")).click();

	}

	public void inssNotifications() {

		driver.findElement(By.xpath("//span[normalize-space()='Notifications']")).click();
		// span[normalize-space()='Settings']
	}

	public void inspanelSettings() {

		driver.findElement(By.xpath("//span[normalize-space()='Settings']")).click();

	}

	public void usserpanellogout() {

		driver.findElement(By.xpath("//span[normalize-space()='Log out']")).click();

	}

	public void Profileuser() {

		driver.findElement(By.xpath("//span[normalize-space()='My Profile']")).click();

	}
	
	//profile user get

}