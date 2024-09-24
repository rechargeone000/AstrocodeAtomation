package Testcaseoutp;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import CommonElements.CommonHelp;
import PageObject.LoginPage;
import PageObject.OrderCourse;
import baseclass.BaseTestclass;
import manageUtils.ReadExcel;

public class PaymentsMethods extends BaseTestclass {

	String ExcelFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\data.xlsx";

	@BeforeMethod
	public void launchbrowser() {

		String url = "https://www.asttrolok.com/";
		loadConfig(url);

	}

	@AfterMethod
	public void quitbrowser() {

		// driver.quit();
	}

	@Test
	public void courseselectBynow() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {
//courcess from course dropdown
		OrderCourse oc = new OrderCourse();

		LoginPage lp = new LoginPage();
		try {
			// mukund300@rechargestudio.com
			lp.logincase("mukund300@rechargestudio.com", "123456");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// oc.clickonthecoursehomelibk();
		driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
		Thread.sleep(3000);
		By onlinecourse = By.xpath("//div[contains(@class,'mt-lg-0 mt-lg-0 cats mobile1')]//a[2]");
		CommonHelp.clickOnElement(onlinecourse);

		Thread.sleep(2000);

		By couname = By.xpath("(//div[@class='image-box'])[25]");
		try {
			CommonHelp.clickOnElement(couname);
			System.out.println("trysec");
		} catch (Exception e) {
			CommonHelp.clickOnElement_JS(couname);

		}

		Thread.sleep(5000);

//		By coursett = By
//				.xpath("(//h3[@class=\"mt-5 webinar-title webinartitle font-weight-bold font-16 text-dark-blue\"])[1]");

		// driver.findElement(By.xpath("//h3[normalize-space()='" + coursenamee +
		// "']")).click();
		// String coursenamee = "Astrology Intermediate Level";

		// h3[normalize-space()='Astrology Intermediate Level']

		// oc.bookfromcentralbookbtn();

		By booknowbluw = By.xpath("(//button[contains(text(),'Buy now!')])[2]");

		CommonHelp.clickOnElement_JS(booknowbluw);
		Thread.sleep(5000);

		By StartPayment = By.xpath("//button[contains(text(),'Start Payment')]");
		// CommonHelp.scrollToElementView(StartPayment);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(40,500)");

		Thread.sleep(3000);
		driver.findElement(StartPayment).click();
		Thread.sleep(5000);

		driver.findElement(StartPayment);
		System.out.println("entering in frm");
		Thread.sleep(4000);
		try {

			WebElement frm3 = driver.findElement(By.xpath("//iframe[@class='razorpay-checkout-frame']"));
			driver.switchTo().frame(frm3);
			System.out.println("entered");
			String logoname = driver
					.findElement(By.xpath(
							"//div[@class='max-w-full font-heading text-2xl font-semibold text-on-primary truncate']"))
					.getText();
			System.out.println(logoname);

		} catch (Exception e) {
			System.out.println("frame not found");
		}
		// System.out.println(driver.getCurrentUrl());
		System.out.println("done");

		driver.switchTo().defaultContent();

		String name = driver.findElement(By.xpath("//a[@class='btn btn-primary mt-15']")).getText();
		driver.getCurrentUrl();
		System.out.println(name);

		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		ReadExcel rc = new ReadExcel();

		String Testcasename = ReadExcel.readExcelCell(37, 1);
		String Testcasedescription = ReadExcel.readExcelCell(37, 2);
		String TestCaseresult = ReadExcel.readExcelCell(37, 3);
		String srno = ReadExcel.readExcelCell(37, 0);
		int index = Integer.parseInt(srno);

		rc.startTestcase(Testcasename, srno, index, Testcasedescription, "pass", "page  is  open");
	}

	public void courseselect() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {
		// courcess from course dropdown
		OrderCourse oc = new OrderCourse();

		LoginPage lp = new LoginPage();
		try {
			lp.logincase(prop.getProperty("username"), "123456789");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// oc.clickonthecoursehomelibk();
		driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();

		By onlinecourse = By.xpath("//div[contains(@class,'mt-lg-0 mt-lg-0 cats mobile1')]//a[2]");
		CommonHelp.clickOnElement(onlinecourse);

		Thread.sleep(2000);

		By couname = By.xpath("(//div[@class='image-box'])[5]");
		try {
			CommonHelp.clickOnElement(couname);
			System.out.println("trysec");
		} catch (Exception e) {
			CommonHelp.clickOnElement_JS(couname);

		}

		Thread.sleep(5000);

//				By coursett = By
//						.xpath("(//h3[@class=\"mt-5 webinar-title webinartitle font-weight-bold font-16 text-dark-blue\"])[1]");

		// driver.findElement(By.xpath("//h3[normalize-space()='" + coursenamee +
		// "']")).click();
		// String coursenamee = "Astrology Intermediate Level";

		// h3[normalize-space()='Astrology Intermediate Level']

		// oc.bookfromcentralbookbtn();

		By booknowbluw = By.xpath("(//button[contains(text(),'Buy now!')])[2]");

		By installment = By.xpath("//a[@class='btn btn-outline-primary mt-20']");
		CommonHelp.clickOnElement_JS(booknowbluw);
		Thread.sleep(5000);

		By StartPayment = By.xpath("//button[contains(text(),'Start Payment')]");
		// CommonHelp.scrollToElementView(StartPayment);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(40,500)");

		Thread.sleep(3000);
		driver.findElement(StartPayment).click();
		Thread.sleep(5000);

		driver.findElement(StartPayment);
		System.out.println("entering in frm");
		Thread.sleep(4000);
		try {

			WebElement frm3 = driver.findElement(By.xpath("//iframe[@class='razorpay-checkout-frame']"));
			driver.switchTo().frame(frm3);
			System.out.println("entered");
			String logoname = driver
					.findElement(By.xpath(
							"//div[@class='max-w-full font-heading text-2xl font-semibold text-on-primary truncate']"))
					.getText();
			System.out.println(logoname);

		} catch (Exception e) {
			System.out.println("frame not found");
		}
		// System.out.println(driver.getCurrentUrl());
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

}
