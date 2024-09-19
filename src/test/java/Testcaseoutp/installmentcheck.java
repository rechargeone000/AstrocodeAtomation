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

public class installmentcheck extends BaseTestclass {
	HomePaget hm;
	LoginPage lp;
	videoaccesscheckpage vp = new videoaccesscheckpage();

	String ExcelFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\data.xlsx";
	public int index;
 
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
		vp.openlearningpageforinstallmentcheck("Astro Shiromani 2024 ", main);
		// vp.switchwindow();
		Thread.sleep(3000);
		System.out.println("start");
		// driver.switchTo().window(main);

		// ..........................................section

	}

	// @DataProvider(name = "data-provider")
//		public Object[][] dpMethod() {
//			return new Object[][] { 
//				{"balmukundsahu2706@gmail.com"},{"dhanraj24sp@gmail.com"}
//				
	//
//			};
//		}

	// String fileName =
	// "C:\\Users\\dell\\eclipse-workspace\\Asttrokautomation\\src\\test\\resources\\Seleniumreport.xlsx";

	// Class --> LoginPageTest,HomePagetests Test Case--> loginTest, wishListTest,
	// orderHistoryandDetailsTest

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
