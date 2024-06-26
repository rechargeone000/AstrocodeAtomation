package Testcaseoutp;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObject.LoginPage;
import PageObject.OrderCourse;
import baseclass.BaseTestclass;
import manageUtils.ReadExcel;

public class OrderCourseTest extends BaseTestclass {
	String ExcelFilePath = "C:\\Users\\dell\\eclipse-workspace\\Asttrokautomation\\src\\test\\resources\\data.xlsx";

	@BeforeMethod
	public void launchbrowser() {

		loadConfig();

	}

	@AfterMethod
	public void quitbrowser() {

		// driver.quit();
	}

	 @Test(priority=35)
	public void courseselect() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {
//courcess from course dropdown
		OrderCourse oc = new OrderCourse();

		LoginPage lp = new LoginPage();
		try {
			lp.logincase(prop.getProperty("username"), prop.getProperty("password"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		oc.clickonthecoursehomelibk();

		driver.findElement(By.xpath("//h3[normalize-space()='Astrology Intermediate Level']")).click();

		oc.bookfromcentralbookbtn();

		oc.startpaybutton();
		System.out.println("done");
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		ReadExcel rc = new ReadExcel();
		String Testcasename = ReadExcel.readExcelCell(4, 1);
		String Testcasedescription = ReadExcel.readExcelCell(4, 2);
		String TestCaseresult = ReadExcel.readExcelCell(4, 3);
		System.out.println("test started1");

		rc.startTestcase(Testcasename, "4", 4, Testcasedescription, "pass", "page  is  open");
	}

	 @Test(priority=36)
	public void addTocartbutton() throws InterruptedException {

		// item added to the cart

		OrderCourse oc = new OrderCourse();

		LoginPage lp = new LoginPage();
		try {
			lp.logincase(prop.getProperty("username"), prop.getProperty("password"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		oc.clickonthecoursehomelibk();

		driver.findElement(By.xpath("//h3[normalize-space()='Astrology Intermediate Level']")).click();

		oc.addtocartbutton();
		// oc.checkboxcart();
		// added item to the cart
		ReadExcel rc = new ReadExcel();
		String Testcasename = ReadExcel.readExcelCell(3, 1);
		String Testcasedescription = ReadExcel.readExcelCell(3, 2);
		String TestCaseresult = ReadExcel.readExcelCell(3, 3);
		System.out.println("test started1");
		rc.startTestcase(Testcasename, "3", 3, Testcasedescription, "pass", "page  is  open");
	}

	 @Test(priority=36)

	public void gotocartpage() throws EncryptedDocumentException, InvalidFormatException {

		OrderCourse oc = new OrderCourse();

		LoginPage lp = new LoginPage();
		try {
			lp.logincase(prop.getProperty("username"), prop.getProperty("password"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		oc.gotoaddtocartpage();
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		ReadExcel rc = new ReadExcel();
		String Testcasename = ReadExcel.readExcelCell(4, 1);
		String Testcasedescription = ReadExcel.readExcelCell(4, 2);
		String TestCaseresult = ReadExcel.readExcelCell(4, 3);
		System.out.println("test started1");

		rc.startTestcase(Testcasename, "4", 4, Testcasedescription, "pass", "page  is  open");

//	landed on the addtocartpage

	}
	
	

}
