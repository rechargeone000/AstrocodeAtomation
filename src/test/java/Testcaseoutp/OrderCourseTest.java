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
	// String ExcelFilePath =
	// "C:\\Users\\dell\\eclipse-workspace\\Asttrokautomation\\src\\test\\resources\\data.xlsx";
	String ExcelFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\data.xlsx";

	@BeforeMethod
	public void launchbrowser() {

		String url = "https://lms.asttrolok.in";
		loadConfig(url);

	}

	@AfterMethod
	public void quitbrowser() {

		driver.quit();
	}

	// @Test(priority = 37)
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

		String coursenamee = "Astrology Intermediate Level";

		driver.findElement(By.xpath("//h3[normalize-space()='" + coursenamee + "']")).click();

		// h3[normalize-space()='Astrology Intermediate Level']

		oc.bookfromcentralbookbtn();

		// oc.startpaybutton();
		System.out.println("done");
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		ReadExcel rc = new ReadExcel();

		String Testcasename = ReadExcel.readExcelCell(37, 1);
		String Testcasedescription = ReadExcel.readExcelCell(37, 2);
		String TestCaseresult = ReadExcel.readExcelCell(37, 3);
		String srno = ReadExcel.readExcelCell(37, 0);
		int index = Integer.parseInt(srno);

		rc.startTestcase(Testcasename, srno, index, Testcasedescription, "pass", "page  is  open");
	}

	// @Test(priority = 38)
	public void addTocartbutton() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {

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
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		ReadExcel rc = new ReadExcel();
		String Testcasename = ReadExcel.readExcelCell(38, 1);
		String Testcasedescription = ReadExcel.readExcelCell(38, 2);
		String TestCaseresult = ReadExcel.readExcelCell(38, 3);
		String srno = ReadExcel.readExcelCell(37, 0);
		int index = Integer.parseInt(srno);
		rc.startTestcase(Testcasename, srno, index, Testcasedescription, "pass", "page  is  open");
	}

	// @Test(priority = 39)

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
		String Testcasename = ReadExcel.readExcelCell(39, 1);
		String Testcasedescription = ReadExcel.readExcelCell(39, 2);
		String TestCaseresult = ReadExcel.readExcelCell(39, 3);
		String srno = ReadExcel.readExcelCell(39, 0);
		int index = Integer.parseInt(srno);

		rc.startTestcase(Testcasename, srno, index, Testcasedescription, "pass", "page  is  open");

//	landed on the addtocartpage

	}

	@Test
	public void Completeorderdetails() throws InterruptedException {

		OrderCourse oc = new OrderCourse();

		LoginPage lp = new LoginPage();
		try {
			lp.logincase(prop.getProperty("username"), prop.getProperty("password"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			oc.clickonthecoursehomelibk();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String coursenamee = "Astrology Intermediate Level";

		driver.findElement(By.xpath("//h3[normalize-space()='" + coursenamee + "']")).click();

		// h3[normalize-space()='Astrology Intermediate Level']

		oc.bookfromcentralbookbtn();

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		oc.addtocartbutton();

		Thread.sleep(4000);
	}

}
