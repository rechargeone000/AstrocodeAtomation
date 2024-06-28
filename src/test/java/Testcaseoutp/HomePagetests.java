package Testcaseoutp;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import CommonElements.CommonHelp;
import PageObject.HomePaget;
import PageObject.LoginPage;
import baseclass.BaseTestclass;
import manageUtils.ReadExcel;

public class HomePagetests extends BaseTestclass {

	HomePaget hm;
	LoginPage lp;

	String ExcelFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\data.xlsx";

	@BeforeMethod
	public void launchbrowser() {

		loadConfig();

	}

	@AfterMethod
	public void quitbrowser() {

		driver.quit();
	}

//	@Test(alwaysRun = true, priority = 4)
	public void Logoicondesplayed()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		hm = new HomePaget();

		boolean sts = hm.Logoicon();
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		// manageUtils.Log.endTestCase("endtestcase");

		String srno = ReadExcel.readExcelCell(4, 0);
		int indexno = Integer.parseInt(srno);
		String testcasename = ReadExcel.readExcelCell(4, 1);
		String Testdescr = ReadExcel.readExcelCell(4, 2);
		String result = ReadExcel.readExcelCell(4, 3);
		String Comments = ReadExcel.readExcelCell(4, 4);
		ReadExcel rc = new ReadExcel();
		if (sts == true) {
			rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);
		} else {
			rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);

		}
	}

	@Test(priority = 5)
	public void OnlineCunsultation() throws IOException, EncryptedDocumentException, InvalidFormatException {
		hm = new HomePaget();
		setup();
		hm.onlineconsuatation();
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");

		String srno = ReadExcel.readExcelCell(5, 0);
		int indexno = Integer.parseInt(srno);
		String testcasename = ReadExcel.readExcelCell(5, 1);
		String Testdescr = ReadExcel.readExcelCell(5, 2);
		String result = ReadExcel.readExcelCell(5, 3);
		String Comments = ReadExcel.readExcelCell(5, 4);
		ReadExcel rc = new ReadExcel();
		String consulturl = driver.getCurrentUrl();

		if (consulturl.equalsIgnoreCase("https://www.asttrolok.com/consult-with-astrologers")) {
			rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);
		} else {

			rc.startTestcase(testcasename, srno, indexno, Testdescr, "fail", Comments);

		}
	}

	@Test(priority = 6)
	public void personalizedreport() throws IOException, EncryptedDocumentException, InvalidFormatException {
		hm = new HomePaget();
		setup();

		hm.personalizedreport();
		// String Stext = hm.persolizedtext();
		// System.out.println(Stext);
		String tecxt = "Get Your Personalized Kundali for Only ₹1500 ₹299/- Act Now to Transform your life!";

		String srno = ReadExcel.readExcelCell(6, 0);
		int indexno = Integer.parseInt(srno);
		String testcasename = ReadExcel.readExcelCell(6, 1);
		String Testdescr = ReadExcel.readExcelCell(6, 2);
		String result = ReadExcel.readExcelCell(6, 3);
		String Comments = ReadExcel.readExcelCell(6, 4);

		ReadExcel rc = new ReadExcel();
		if (true) {
			rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);
		} else {
			rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);
		}

	}

	public void knowmore() throws InterruptedException {

		hm = new HomePaget();
		hm.knowmorebtn();

	}

	@Test(priority = 7)
	public void viewallfirsthind()
			throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException {
		hm = new HomePaget();
		lp = new LoginPage();
		setup();

		//hm.viewallbtnhndi();
		ReadExcel rc = new ReadExcel();
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(7, 0);
		int indexno = Integer.parseInt(srno);
		String testcasename = ReadExcel.readExcelCell(7, 1);
		String Testdescr = ReadExcel.readExcelCell(7, 2);
		String result = ReadExcel.readExcelCell(7, 3);
		String Comments = ReadExcel.readExcelCell(7, 4);
		if (true) {
			rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);
		} else {
			rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);
		}
	}

	@Test(priority = 8)
	public void viewallenglish()
			throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException {
		hm = new HomePaget();
		lp = new LoginPage();
		setup();

		ReadExcel rc = new ReadExcel();
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");

		String srno = ReadExcel.readExcelCell(8, 0);
		int indexno = Integer.parseInt(srno);
		String testcasename = ReadExcel.readExcelCell(8, 1);
		String Testdescr = ReadExcel.readExcelCell(8, 2);
		String result = ReadExcel.readExcelCell(8, 3);
		String Comments = ReadExcel.readExcelCell(8, 4);
	//	hm.viewallbtnenglish();
		if (true) {
			rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);
		} else {
			rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);
		}
	}

	@Test(priority = 9)
	public void viewallAstro()
			throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException {

		hm = new HomePaget();
		lp = new LoginPage();
		setup();

		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		hm.clickonviewallastrbtn();
	//	hm.viewallAstrologers();
		ReadExcel rc = new ReadExcel();

		String srno = ReadExcel.readExcelCell(9, 0);
		int indexno = Integer.parseInt(srno);
		String testcasename = ReadExcel.readExcelCell(9, 1);
		String Testdescr = ReadExcel.readExcelCell(9, 2);
		String result = ReadExcel.readExcelCell(9, 3);
		String Comments = ReadExcel.readExcelCell(9, 4);
		if (true) {
			rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);
		} else {
			rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);
		}

	}

	@Test(priority = 10)
	public void viewallinstructorrr() throws InterruptedException, IOException {
		try {
			ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		hm = new HomePaget();
		lp = new LoginPage();

		//hm.viewallbtninstructor();
		ReadExcel rc = new ReadExcel();

		String srno = ReadExcel.readExcelCell(10, 0);
		int indexno = Integer.parseInt(srno);
		String testcasename = ReadExcel.readExcelCell(10, 1);
		String Testdescr = ReadExcel.readExcelCell(10, 2);
		String result = ReadExcel.readExcelCell(10, 3);
		String Comments = ReadExcel.readExcelCell(10, 4);
	
		if (true) {
			rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);
		} else {
			rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);
		}
	}

	@Test(priority = 11)
	public void contactuspage()
			throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException {
		hm = new HomePaget();
		setup();

		hm.linkoffooter();
		ReadExcel rc = new ReadExcel();
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");

		String srno = ReadExcel.readExcelCell(11, 0);
		int indexno = Integer.parseInt(srno);
		String testcasename = ReadExcel.readExcelCell(11, 1);
		String Testdescr = ReadExcel.readExcelCell(11, 2);
		String result = ReadExcel.readExcelCell(11, 3);
		String Comments = ReadExcel.readExcelCell(11, 4);
		hm.viewallbtnenglish();
		if (true) {
			rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);
		} else {
			rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);
		}
	}

	@Test(priority = 12)
	public void socialmedialiinksmethos()
			throws IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException {
		hm = new HomePaget();

		hm.socialmedialinks();
		ReadExcel rc = new ReadExcel();
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(12, 0);
		int indexno = Integer.parseInt(srno);
		String testcasename = ReadExcel.readExcelCell(12, 1);
		String Testdescr = ReadExcel.readExcelCell(12, 2);
		String result = ReadExcel.readExcelCell(12, 3);
		String Comments = ReadExcel.readExcelCell(12, 4);
		if (true) {
			rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);
		} else {
			rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);
		}
	}

	@Test(priority = 13)
	public void addresstes() throws IOException, EncryptedDocumentException, InvalidFormatException {
		hm = new HomePaget();

		String adddtext = hm.addresst();
		String actualaddres = "312, 3rd Floor, Vikram Urbane, 25-A Mechanic Nagar Extn. Sch# 54, Indore(MP) 452010";

		Assert.assertEquals(adddtext, actualaddres);
		ReadExcel rc = new ReadExcel();
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(13, 0);
		int indexno = Integer.parseInt(srno);
		String testcasename = ReadExcel.readExcelCell(13, 1);
		String Testdescr = ReadExcel.readExcelCell(13, 2);
		String result = ReadExcel.readExcelCell(13, 3);
		String Comments = ReadExcel.readExcelCell(13, 4);
		if (adddtext.equalsIgnoreCase(actualaddres)) {
			rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);
		} else {
			rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);
		}
	}

	@Test(priority = 14)
	public void getintouchEmail() throws IOException, EncryptedDocumentException, InvalidFormatException {
		setup();

		By emailinput = By.xpath("//input[@placeholder='Enter your email here']");
		By joinbtn = By.xpath("//button[normalize-space()='Join']");
		CommonHelp.enterValues(emailinput, "balmukundsahu@rechargestudio.com");
		CommonHelp.clickOnElement(joinbtn);

		ReadExcel rc = new ReadExcel();
		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		String srno = ReadExcel.readExcelCell(14, 0);
		int indexno = Integer.parseInt(srno);
		String testcasename = ReadExcel.readExcelCell(14, 1);
		String Testdescr = ReadExcel.readExcelCell(14, 2);
		String result = ReadExcel.readExcelCell(14, 3);
		String Comments = ReadExcel.readExcelCell(14, 4);

		rc.startTestcase(testcasename, srno, indexno, Testdescr, result, Comments);

	}

}
