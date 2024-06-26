package Testcaseoutp;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclass.BaseTestclass;
import manageUtils.ConvertEx;
import manageUtils.ReadExcel;

public class InstructorPanel extends BaseTestclass {

	
	@Test
	public void test() {
		
		ReadExcel rc = new ReadExcel();
		//String Testcasename = ReadExcel.readExcelCell(14, 1);
		//String Testcasedescription = ReadExcel.readExcelCell(14, 2);
		//String TestCaseresult = ReadExcel.readExcelCell(3, 3);
		//System.out.println("test started1");
		rc.startTestcase("nam", "18", 18, "mma", "printing from InstructorPanel","firs");
		
		
		ConvertEx cp = new ConvertEx();
		cp.Genratepdf();
	}
}