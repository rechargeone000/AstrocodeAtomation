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

public class Astrosiromani24 extends BaseTestclass {

	String ExcelFilePath = "C:\\Users\\dell\\eclipse-workspace\\Asttrokautomation\\src\\test\\resources\\data.xlsx";

	@BeforeMethod
	public void launchbrowser() {

		String url = "https://lms.asttrolok.in";
		loadConfig(url);

	}

	@AfterMethod
	public void quitbrowser() {

		 driver.quit();
	}

	@Test(priority = 37)
	public void courseselect() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {
		// courcess from course dropdown
		OrderCourse oc = new OrderCourse();

		LoginPage lp = new LoginPage();
//		try {
//		//	lp.logincase(prop.getProperty("username"), prop.getProperty("password"));
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		oc.clickonthecoursehomelibk();

		driver.findElement(By.xpath("//h3[normalize-space()='Astromani 2024']")).click();
		// Thread.sleep(null)e
		driver.findElement(By.xpath("//a[@class=\"btn-get-started scrollto\"]")).click();

		driver.findElement(By.xpath("//div[@class='rounded-lg shadow-sm']//form")).click();
		driver.findElement(By.xpath("//input[@id='customer_name']")).sendKeys("balmukund sahu");
		driver.findElement(By.xpath("//input[@id='customer_email']")).sendKeys("balmukund.sahu@rechargestudio.com");

		driver.findElement(By.xpath("//input[@id='customer_number']")).sendKeys("8602142526");

		
		oc.bookfromcentralbookbtn();

		//oc.startpaybutton();
		System.out.println("done");
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		ReadExcel rc = new ReadExcel();
		String Testcasename = ReadExcel.readExcelCell(37, 1);
		String Testcasedescription = ReadExcel.readExcelCell(37, 2);
		String TestCaseresult = ReadExcel.readExcelCell(37, 3);
		System.out.println("test started1");

		rc.startTestcase(Testcasename, "37", 37, Testcasedescription, "pass", "page  is  open");
	}

//	@Test(priority = 38)
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

		driver.findElement(By.xpath("//h3[normalize-space()='Astromani 2024']")).click();
		// Thread.sleep(null)
		driver.findElement(By.xpath("//a[@class=\"btn-get-started scrollto\"]")).click();

		oc.addtocartbutton();
		// oc.checkboxcart();
		// added item to the cart
		ReadExcel rc = new ReadExcel();
		String Testcasename = ReadExcel.readExcelCell(38, 1);
		String Testcasedescription = ReadExcel.readExcelCell(38, 2);
		String TestCaseresult = ReadExcel.readExcelCell(38, 3);
		rc.startTestcase(Testcasename, "38", 38, Testcasedescription, "pass", "page  is  open");
	}

	//@Test(priority = 39)

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

//		landed on the addtocartpage

	}

}
