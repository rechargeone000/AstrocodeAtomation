package PageObject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import CommonElements.CommonHelp;
import baseclass.BaseTestclass;

public class videoaccesscheckpage extends BaseTestclass {

	public void checkuseronadmin(String studentname) throws InterruptedException {

		By userstab = By.xpath("//span[normalize-space()='Users']");
		By student = By.xpath("//a[normalize-space()='Students']");

		By showresult = By.xpath("//input[@value='Show Results']");
		By studentsearchbox = By.xpath("//input[@name='full_name']");

		By usericonbtn = By.xpath("//i[@class='fa fa-user-shield']");
		CommonHelp.scrollToElementView(userstab);
		CommonHelp.clickOnElement(userstab);
		CommonHelp.clickOnElement(student);

		CommonHelp.enterValues(studentsearchbox, studentname);
		CommonHelp.clickOnElement(showresult);

		CommonHelp.clickOnElement(usericonbtn);

	}

	public void switchwindow() {

		Set<String> allWINDOW = driver.getWindowHandles();

		String parent = driver.getWindowHandle();

		System.out.println(parent + ".......parent....");

		Iterator<String> it1 = allWINDOW.iterator();

		while (it1.hasNext()) {

			String child_window = it1.next();
			System.out.println(child_window + "\".......child and second window....\"");

			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);

				System.out.println(driver.switchTo().window(child_window).getCurrentUrl());
			}

		}

		// driver.switchTo().window(parent);

	}

	public void openlearningpage(String coursenameaccess) throws InterruptedException {

		By coursebtn = By.xpath("//span[@class='font-14 text-dark-blue font-weight-500'][normalize-space()='Courses']");

		By mypurchasesbtn = By.xpath("//a[normalize-space()='My purchases']");
		By courselistname = By.xpath("//h3[@class='webinar-title font-weight-bold font-16 text-dark-blue']");
		By usericonbtn = By.xpath("//i[@class='fa fa-user-shield']");

		CommonHelp.clickOnElement(coursebtn);
		Thread.sleep(2000);
		CommonHelp.clickOnElement(mypurchasesbtn);
		Thread.sleep(2000);

		List<WebElement> corsenamelist = driver.findElements(courselistname);

		int coursecount = corsenamelist.size();
		System.out.println(coursecount);
		for (int i = 0; i <= coursecount; i++) {

			String name = corsenamelist.get(i).getText();
			// System.out.println(name + "....");
			String[] listname = name.split("Expire");
			String cname = listname[0];
			System.out.println(cname);

			if (cname.equals(coursenameaccess)) {
				System.out.println("entered in if");
				System.out.println("cname");
				// System.out.println(corsenamelist.get(i).getAttribute(coursenameaccess));
				corsenamelist.get(i).click();
				Thread.sleep(2000);
				System.out.println("a");

				// driver.findElement(By.xpath("(//div[@class='btn-group dropdown
				// table-actions'])[" + i + "]")).click();
				// driver.findElement(By.xpath("(//div[@class='btn-group dropdown
				// table-actions'])[3]")).click();

				// driver.findElement(By.xpath(
				// "//div[@class='dropdown-menu show']//a[@class='webinar-actions
				// d-block'][normalize-space()='Learning page']"))
				// .click();
				break;

				// System.out.println(name);
			}

			Thread.sleep(2000);

		}

	}

	public void openlearningpageforinstallmentcheck(String coursenameaccess, String main) throws InterruptedException {

		// By coursebtn = By.xpath("//span[@class='font-14 text-dark-blue
		// font-weight-500'][normalize-space()='Courses']");

		By Financialbtn = By.xpath("//span[normalize-space()='Financial']");

		By Installmentbtn = By.xpath("//a[normalize-space()='Installments']");

		By coursetitlename = By.xpath("//h3[@class=\"font-16 text-dark-blue font-weight-bold\"]");

		By mypurchasesbtn = By.xpath("//a[normalize-space()='My purchases']");
		By courselistthreedot = By.xpath("//button[@class='btn-transparent dropdown-toggle']");
		By usericonbtn = By.xpath("//i[@class='fa fa-user-shield']");

		By viewdetails = By.xpath("//a[@class='webinar-actions d-block mt-10'][normalize-space()='View Details']");

		CommonHelp.clickOnElement(Financialbtn);
		Thread.sleep(2000);
		CommonHelp.clickOnElement(Installmentbtn);
		Thread.sleep(2000);

		List<WebElement> corsenamelistdot = driver.findElements(courselistthreedot);
		List<WebElement> corsenamelistname = driver.findElements(coursetitlename);

		int coursetitlecount = corsenamelistname.size();

		int coursecountdot = corsenamelistdot.size();
		System.out.println(coursecountdot);
		for (int i = 0; i <= coursecountdot - 1; i++) {
			String pk = driver.getWindowHandle();
			System.out.println("...afterloop..." + pk);
			String name = corsenamelistname.get(i).getText();
			System.out.println(name + "..and going to click on this course..");

			System.out.println("entered in if");
			corsenamelistdot.get(i).click();
			Thread.sleep(3000);
			System.out.println("trying to click view button");
			try {
				CommonHelp.clickOnElement_JS(viewdetails);
				System.out.println("usingjs to click");
			} catch (Exception e) {
				CommonHelp.clickOnElement_JS(viewdetails);
				System.out.println("using normal webelement to click");

			}
			Thread.sleep(2000);
			videoaccesscheckpage vpp = new videoaccesscheckpage();
			vpp.switchwindow();
			By installamount_firstamount = By.xpath("//tr//td");
			By installmenthalfpaidamount = By.xpath("//tr//td[2]//span");
			List<WebElement> listofinstalment = driver.findElements(By.xpath("//tr//td[2]"));
			String installmenthaldpaidamt = driver.findElement(installmenthalfpaidamount).getText();
			System.out.println(installmenthaldpaidamt + "......installmenthaldpaidamt.......");

			int installcount = listofinstalment.size();
			System.out.println(installcount + "installvalue");

			for (int K = 0; K <= installcount - 1; K++) {
				String instalmentamountvalue = listofinstalment.get(K).getText();

				System.out.println(instalmentamountvalue + "instalmentamountvalue......." + i);

				String fff = instalmentamountvalue.substring(1, 7);

			}

			Set<String> windowHandles = driver.getWindowHandles();

			// Convert to list
			ArrayList<String> windows = new ArrayList<>(windowHandles);
			driver.switchTo().window(windows.get(1));

			// Determine the window to close (e.g., based on index)
			System.out.println("arraylist"+windows);

			for (String handle : driver.getWindowHandles()) {
				if(!handle.equals(main)) {
					
					driver.switchTo().window(handle);
					
					String originalHandle1 = driver.getWindowHandle();

				if (!handle.equals(originalHandle1)) {
					driver.switchTo().window(handle);
					driver.close();
				}
				
				}
			}

		//	driver.switchTo().window(originalHandle);
		}

	}

	public void switchwindowinstall() {

		Set<String> allWINDOW = driver.getWindowHandles();

		String parent = driver.getWindowHandle();
		System.out.println("parent2..");

		Iterator<String> it1 = allWINDOW.iterator();

		while (it1.hasNext()) {

			String child_window = it1.next();

			if (!child_window.equals("C5406255F077A1D387247C8F31EFBD66")) {
				driver.switchTo().window(child_window);

				System.out.println(driver.switchTo().window(child_window).getCurrentUrl());
			}

		}

		// driver.switchTo().window(parent);

	}

}
