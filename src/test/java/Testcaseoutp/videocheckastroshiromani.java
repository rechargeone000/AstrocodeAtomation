package Testcaseoutp;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import CommonElements.CommonHelp;
import PageObject.HomePaget;
import PageObject.LoginPage;
import PageObject.videoaccesscheckpage;
import baseclass.BaseTestclass;
import manageUtils.NewExcecode;
import manageUtils.ReadExcel;

public class videocheckastroshiromani extends BaseTestclass {
	HomePaget hm;
	LoginPage lp;
	videoaccesscheckpage vp = new videoaccesscheckpage();

	String ExcelFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\data.xlsx";
public    int index ;
	@BeforeClass
	public void launchbrowser() {

		String url = "https://www.asttrolok.com/";
		loadConfig(url);
		lp = new LoginPage();

		try {
			lp.logincase(prop.getProperty("aduname"), prop.getProperty("adpass"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@AfterClass
	public void quitbrowser() {

		// driver.quit();
	}

	@Test(dataProvider = "data-provider")
	public void checkdatauseraccess(String email) throws InterruptedException {
		String main = driver.getWindowHandle();
		System.out.println("main..." + main);
		
		vp.checkuseronadmin(email);
		vp.switchwindow();
		vp.openlearningpage("Astro Shiromani 2024 ");
		// vp.switchwindow();
		Thread.sleep(3000);
		System.out.println("start");

		// ..........................................section

		driver.findElement(By.xpath("//div[@class='rounded-lg shadow-sm']//form")).click();

		driver.findElement(By.xpath("(//span[@class='chapter-icon bg-gray300 mr-10'])[1]")).click();
		System.out.println("clicked on the vdo");

		try {

			// js.executeScript("arguments[0].style.display = 'block';", videoPlayer);

			// String nm =
			// driver.findElement(By.xpath("//div[@aria-label='Duration']")).getText();
			// System.out.println(nm);
			Thread.sleep(2000);
			System.out.println("finding");

					String paynowbtn =	driver.findElement(By.xpath("//a[@class='btn btn-primary mt-15']")).getText();
//					
//					String accessdenied =	driver.findElement(By.xpath("//h2[@class='font-20 text-dark-blue']")).getText();
					System.out.println(paynowbtn);
//					System.out.println(accessdenied);

		} catch (Exception e) {
			System.out.println("video is playing");

		}

		System.out.println("entering into loop");
		List<WebElement> k = driver
				.findElements(By.xpath("//span[@class='font-weight-bold font-14 text-dark-blue d-block']"));
		int sectionnumbersum = k.size();
		int sectionnumber = sectionnumbersum - 1;
		System.out.println(sectionnumbersum);

		for (int i = 1; i < sectionnumbersum; i++) {

			String sectionname = k.get(i).getText();
			System.out.println(sectionname);

		}
		int coloumvalue = 0;
		// .........................topic
		List<WebElement> topic = driver.findElements(
				By.xpath("//span[@class='font-weight-bold font-14 text-dark-blue d-block']//following-sibling::span"));
		int topnum = k.size();
		System.out.println(topnum);
		for (int i = 0; i < topnum; i++) {

			String topicname = topic.get(i).getText();
			String[] topvalue = topicname.split(" ");
			System.out.println("value0f..i..." + i);
			System.out.println(topvalue[0]);
			String topvideovalue = topvalue[0];
			int newvlaue = Integer.parseInt(topvideovalue);
			if (newvlaue <= 0) {

				coloumvalue = i;
				break;

			}
		}
		// System.out.println("topnum...."+topnum);

		// ............playeattrbute...........

		// boolean playbtn = driver.findElement(By.xpath("//button[@class='plyr__control
		// plyr__control--overlaid']")).isDisplayed();

		By time = By.xpath("//div[@class='plyr__controls__item plyr__time--current plyr__time']");

		// ...........................................................
		// driver.findElement(By.xpath("(//span[@class='font-weight-bold font-14
		// text-dark-blue d-block'])[1]")).click();

		// System.out.println("cousercontent " + text);

		Thread.sleep(5000);
		// driver.findElement(By.xpath("(//span[@class='chapter-icon bg-gray300
		// mr-10'])[3]")).click();
		int sectionclickvalue = coloumvalue;
		// driver.findElement(By.xpath("//span[@class='font-weight-bold font-14
		// text-dark-blue d-block'])[1]")).click();
		By videoelement = By
				.xpath("(//span[@class='font-weight-bold font-14 text-dark-blue d-block'])[" + sectionclickvalue + "]");
		CommonHelp.scrollToElementView(videoelement);
		Thread.sleep(3000);
		driver.findElement(By
				.xpath("(//span[@class='font-weight-bold font-14 text-dark-blue d-block'])[" + sectionclickvalue + "]"))
				.click();

		driver.findElement(By.xpath("(//span[@class='chapter-icon bg-gray300 mr-10'])[10]")).click();

		try {
			// WebElement frm = driver.findElement(By.xpath("//iframe[@loading='lazy']"));
			// driver.switchTo().frame(frm);
			By elem = By.xpath("//a[@class='btn btn-primary mt-15']");
			// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='btn
			// btn-primary mt-15']")));
			 boolean paynowbtn = driver.findElement(By.xpath("//a[@class='btn btn-primary mt-15']")).isDisplayed();
//				
//				String accessdenied =	driver.findElement(By.xpath("//h2[@class='font-20 text-dark-blue']")).getText();
			 System.out.println(paynowbtn);
//				System.out.println(accessdenied);

			// String nm =
			// driver.findElement(By.xpath("//div[@aria-label='Duration']")).getText();
			System.out.println("newcode");

		} catch (Exception e) {
			System.out.println("video is working ");
			ReadExcel rc = new ReadExcel();
			String srno = "1";
			String Testcasename = "";
			String Testcasedescription = "video is playing";
			String TestCaseresult = "pass";
			index =index+1;
         System.out.println("................................................."+index);
			rc.startTestcase(Testcasename, srno, index, Testcasedescription, "pass", "page  is  open");

		}

		try {
			System.out.println("displayed");
			// driver.findElement(By.xpath("//button[@class='plyr__control
			// plyr__control--overlaid']")).click();
			// driver.findElement(By.xpath("//button[@class='plyr__controls__item
			// plyr__control plyr__control--pressed']")).click();
			System.out.println("displayed");
			// driver.switchTo().defaultContent();

		} catch (Exception e) {
			System.out.println("not found video control");

		}
		driver.close();
		driver.switchTo().window(main);

		Set<String> allWINDOW = driver.getWindowHandles();

		String parent = driver.getWindowHandle();
		System.out.println("parent" + parent);

		Iterator<String> it1 = allWINDOW.iterator();
		int a = 1;
		while (it1.hasNext()) {

			String child_window = it1.next();

			if (!child_window.equals(parent)) {

				driver.switchTo().window(main);

			}

		}

		String originalHandle = driver.getWindowHandle();

		// Do something to open new tabs

		for (String handle : driver.getWindowHandles()) {
			if (!handle.equals(originalHandle)) {
				driver.switchTo().window(handle);
				driver.close();
			}
		}

		driver.switchTo().window(originalHandle);

	}

	//@DataProvider(name = "data-provider")
//	public Object[][] dpMethod() {
//		return new Object[][] { 
//			{"balmukundsahu2706@gmail.com"},{"dhanraj24sp@gmail.com"}
//			
//
//		};
//	}
	
	//String fileName = "C:\\Users\\dell\\eclipse-workspace\\Asttrokautomation\\src\\test\\resources\\Seleniumreport.xlsx";
	

//Class --> LoginPageTest,HomePagetests Test Case--> loginTest, wishListTest, orderHistoryandDetailsTest

	@DataProvider(name = "data-provider")
	public Object[][] getCredentials() {
		// Totals rows count
		String fileName = System.getProperty("user.dir") + "\\src\\test\\resources\\Seleniumreport.xlsx";

		String sheetName = "shiromani";

		String[][] data = null;

		try {

			FileInputStream fis = new FileInputStream(fileName);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheet(sheetName);
			XSSFRow row = sheet.getRow(0);
			int noOfRows = sheet.getPhysicalNumberOfRows();
			int noOfCols = row.getLastCellNum();
			Cell cell;
			data = new String[noOfRows - 1][noOfCols];

			for (int i = 1; i < noOfRows; i++) {
				for (int j = 0; j < noOfCols; j++) {
					row = sheet.getRow(i);
					cell = row.getCell(j);

					data[i - 1][j] = cell.getStringCellValue();

				}
			}
		} catch (Exception e) {
			System.out.println("The exception is: " + e.getMessage());
		}
		return data;
	}
}
