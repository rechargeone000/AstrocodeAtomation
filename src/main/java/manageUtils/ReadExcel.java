package manageUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReadExcel {

	private static XSSFSheet WorkSheet;
	private static XSSFWorkbook WorkBook;
	private XSSFRow SheetRow;
	private XSSFCell RowCell;
	private static DataFormatter format = new DataFormatter();
	String filename1 = "Backend_PO_Result";
	String fileName = System.getProperty("user.dir")+"\\src\\test\\resources\\Seleniumreport.xlsx";

	// String
	// fileName="C:\\Users\\SK\\Desktop\\SKBACKEND\\SKBACKEND-PO\\test-output\\TestCaseResult\\Poresult.xls";
	// creating an instance of HSSFWorkbook class
	static HSSFWorkbook workbook = new HSSFWorkbook();
	// invoking creatSheet() method and passing the name of the sheet to be created
	static HSSFSheet sheet = workbook.createSheet("BackendPO");
	HSSFRow rowhead = sheet.createRow((short) 0);

	public static XSSFSheet setUpExcel(String ExcelFilePath, String sheetName)
			throws EncryptedDocumentException, InvalidFormatException {

		try {

			FileInputStream pestream = new FileInputStream(new File(ExcelFilePath));
			Workbook WorkBook = WorkbookFactory.create(pestream);
			WorkSheet = (XSSFSheet) WorkBook.getSheet(sheetName);
			int rowCount = sheet.getLastRowNum();
			Row row = sheet.createRow(++rowCount);

			int columnCount = 0;
			pestream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return WorkSheet;
	}

	public void startTestcase(String TestcaseName, String TestcaseNo, int rowindexx, String TestcaseDescription,
			String Result, String comment) {
		FileOutputStream fileOut = null;
		rowhead.createCell(0).setCellValue("TestcaseNo");
		rowhead.createCell(1).setCellValue("TestcaseName");
		rowhead.createCell(2).setCellValue("TestcaseDescription");
		rowhead.createCell(3).setCellValue("Result");
		rowhead.createCell(4).setCellValue("Comment");
		short a = (short) (rowindexx);
		HSSFRow rowindexx1 = sheet.createRow((short) a);

		rowindexx1.createCell(0).setCellValue(TestcaseNo);
		rowindexx1.createCell(1).setCellValue(TestcaseName);
		rowindexx1.createCell(2).setCellValue(TestcaseDescription);
		rowindexx1.createCell(3).setCellValue(Result);
		rowindexx1.createCell(4).setCellValue(comment);

		try {
			fileOut = new FileOutputStream(fileName);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			workbook.write(fileOut);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// closing the Stream
		try {
			fileOut.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// closing the workbook
		try {
			workbook.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static String readExcelCell(int i, int j) {
		try {
			String CellData = null;

			Cell cell = WorkSheet.getRow(i).getCell(j);
			if (cell != null) {
				switch (cell.getCellType()) {
				case STRING:
					CellData = cell.getRichStringCellValue().getString();
					break;
				case NUMERIC:
					CellData = format.formatCellValue(cell).toString();
//	    			int intCellData= (int) cell.getNumericCellValue();
//	    			CellData= String.valueOf(intCellData);
					break;
				case BLANK:
					CellData = cell.toString();
				}
			} else {
				CellData = cell.toString();
			}
			return CellData;

		} catch (Exception e) {
			// TODO: handle exception
			return "";
		}
	}

}
