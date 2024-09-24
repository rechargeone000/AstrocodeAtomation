package Testcaseoutp;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import PageObject.IndexPage;
import PageObject.LoginPage;
import PageObject.SignUp_page;
import baseclass.BaseTestclass;
import manageUtils.ReadExcel;
import manageUtils.dataprovider1;

public class SignUpTest extends BaseTestclass {

	SignUp_page sp;
	// IndexPage ip;
	LoginPage lp = new LoginPage();
	String ExcelFilePath = "C:\\Users\\dell\\eclipse-workspace\\Asttrokautomation\\src\\test\\resources\\data.xlsx";

	@Test(priority = 1)
	public void resgisteraton() throws InterruptedException, EncryptedDocumentException, InvalidFormatException {

		ReadExcel.setUpExcel(ExcelFilePath, "Signup");

		String name = ReadExcel.readExcelCell(1, 1);
		String number = ReadExcel.readExcelCell(1, 2);
		String emaile = ReadExcel.readExcelCell(1, 3);
		String passwordd = ReadExcel.readExcelCell(1, 4);
		String conpassword = ReadExcel.readExcelCell(1, 5);
		sp = new SignUp_page();
		System.out.println("enter n signup");
		sp.clickonregbtn(name, number, emaile, passwordd, conpassword);

		ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		ReadExcel rc = new ReadExcel();
		String Testcasename = ReadExcel.readExcelCell(4, 1);
		String TestCaseresult = ReadExcel.readExcelCell(4, 3);
		rc.startTestcase(Testcasename, "18", 18, "description", TestCaseresult, "no comment");
	}

	public void maincheck() {
		sp = new SignUp_page();

		// System.out.println("test");
		// sp.check();

	}

//	@Test(priority = 2)
	public void deleteuser() throws IOException {
		sp = new SignUp_page();

		try {
			System.out.println("name");
			//sp.deletetheuser();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			ReadExcel.setUpExcel(ExcelFilePath, "Testcases");
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch blocks
			e.printStackTrace();
		}
		ReadExcel rc = new ReadExcel();
		String Testcasename = ReadExcel.readExcelCell(4, 1);
		String TestCaseresult = ReadExcel.readExcelCell(4, 3);
		rc.startTestcase(Testcasename, "18", 18, "description", TestCaseresult, "no comment");
	}

}
