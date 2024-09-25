
package Testcaseoutp;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import CommonElements.CommonHelp;
import PageObject.HomePaget;
import PageObject.LoginPage;
import PageObject.videoaccesscheckpage;
import baseclass.BaseTestclass;
import manageUtils.ConvertEx;
import manageUtils.ReadExcel;

public class AmountCheckforcoursess extends BaseTestclass {

	HomePaget hm;
	LoginPage lp;
	videoaccesscheckpage vp = new videoaccesscheckpage();
	int index;
	int c;
	String ExcelFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\data.xlsx";

	@BeforeClass
	public void launchbrowser() throws InterruptedException {

		String url = "https:www.asttrolok.com/";
		loadConfig(url);
		lp = new LoginPage();

		lp.logincase(prop.getProperty("aduname"), prop.getProperty("adpass"));

	}

	@AfterClass
	public void quitbrowser() {
		ConvertEx cv = new ConvertEx();
		cv.Genratepdf();
		driver.quit();
	}

	@Test(dataProvider = "data-provider")
	public void checkdatauseraccess(String email) throws InterruptedException {
		System.out.println(index);
		String main = driver.getWindowHandle();
		// System.out.println("main..." + main);
		vp.checkuseronadmin(email);
		vp.switchwindow();

		List<WebElement> entry = driver.findElements(By.xpath("//table[@class='table text-center custom-table']//tr"));
		int count = entry.size();
		System.out.println(count);
		String data[] = new String[count];
		String data1[] = new String[count];
		int size = 0;
		System.out.println(".." + size);
		index = index + 1;
		c = c + 1;
		for (int i = 0; i < count; i++) {
			data[i] = entry.get(i).getText();

			// System.out.println(data[i]);
			size = data.length;
			String[] parts = data[i].split(" ");

			// Check if we have more than 4 parts
			if (parts.length > 4) {
				// Concatenate only the first four parts
				StringBuilder result = new StringBuilder();
				for (int k = 0; k < 4; k++) {
					result.append(parts[k]);
					if (k < 3) {
						result.append(" "); // Add space between words
					}
				}
				data1[i] = result.toString();
				System.out.println(result.toString()); // Output: "Astro Shiromani 2024 50,000"
			} else {
				// If less than or equal to 4 parts, print the original string
				System.out.println(data[i]);
			}

		}

		System.out.println("started");
		for (int n = 1; n < size; n++) {
			for (int j = n + 1; j < size; j++) {

				// if (data1[n].equals(data1[j])) {
				if (data1[j].startsWith("Astromani")) {
					System.out.println("......double...." + data1[j]);
					String[] partsdata = data1[j].split(" ");
					String amountofastro;
					for (int p = 0; p < partsdata.length; p++) {

						System.out.println( +p+"payment amount from astrolok..."+partsdata[2]);
						//amountofastro =amountofastro
					}
					
					
					ReadExcel rc = new ReadExcel();
					String srno = Integer.toString(c);
					String Testcasename = email;
					String Testcasedescription = data1[j];
					String TestCaseresult = "astromani is duplicate";

					System.out.println("................................................." + index);
					rc.startTestcase(Testcasename, srno, index, Testcasedescription, TestCaseresult, "duplicate");
					break;
				} else {
					if (data1[j].startsWith("House lord")) {
						ReadExcel rc = new ReadExcel();
						String srno = Integer.toString(c);
						String Testcasename = email;
						String Testcasedescription = data1[j];
						String TestCaseresult = "other is duplicate";
						index = index + 1;
						System.out.println("................................................." + index);
						rc.startTestcase(Testcasename, srno, index, Testcasedescription, "pass", "page  is  open");

					}
					System.out.println(
							"...........................................................................double...."
									+ data1[j]);
				}
				// } else {

				// System.out.println("....no double entry found");
				// }
			}

		}

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

//	@DataProvider(name = "data-provider")
//	public Object[][] dpMethod() {
//		return new Object[][] { { "prernaksharma17@gmail.com" },{"balmukund.sahu@rechargestudio.com"},{"balmukundsahu2706@gmail.com"}};
//	}

	@DataProvider(name = "data-provider")
	public Object[][] getCredentials() {

		String fileName = System.getProperty("user.dir") + "\\src\\test\\resources\\Seleniumreport.xlsx";

		String sheetName = "Ashtromani";

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
