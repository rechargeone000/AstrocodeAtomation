package PageObject;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
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

		Thread.sleep(9000);

	}

	public void switchwindow() {

		Set<String> allWINDOW = driver.getWindowHandles();

		String parent = driver.getWindowHandle();

		Iterator<String> it1 = allWINDOW.iterator();

		while (it1.hasNext()) {

			String child_window = it1.next();

			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);

				System.out.println(driver.switchTo().window(child_window).getCurrentUrl());
			}

		}

		// driver.switchTo().window(parent);

	}

	public void openlearningpage() throws InterruptedException {

		By coursebtn = By.xpath("//span[@class='font-14 text-dark-blue font-weight-500'][normalize-space()='Courses']");

		By mypurchasesbtn = By.xpath("//a[normalize-space()='My purchases']");
		By courselistname = By.xpath("//h3[@class='webinar-title font-weight-bold font-16 text-dark-blue']");

		CommonHelp.clickOnElement(coursebtn);
		Thread.sleep(2000);
		CommonHelp.clickOnElement(mypurchasesbtn);
		Thread.sleep(2000);

		List<WebElement> corsenamelist = driver.findElements(courselistname);

		int coursecount = corsenamelist.size();
		System.out.println(coursecount);
		for (int i = 1; i < coursecount; i++) {

		String name = corsenamelist.get(i).getText();
		System.out.println(name);
		

		}

	}

	
	
	
	
	
}
