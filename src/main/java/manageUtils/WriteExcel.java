package manageUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcel {
	public void startTestcase1(String TestcaseName, String TestcaseNo, int rowindexx, String TestcaseDiscription,
			String Result, String comment) throws IOException, EncryptedDocumentException, InvalidFormatException {

	
		String fileName = System.getProperty("user.dir")+"\\src\\test\\resources\\Seleniumreport.xlsx";


		FileInputStream inputStream = new FileInputStream(new File(fileName));
		Workbook workbook = WorkbookFactory.create(inputStream);
		Sheet sheet = workbook.getSheetAt(0);
		Row rowhead = sheet.createRow((short) 0);

		// Sheet sheet = workbook.getSheetAt(0);

		rowhead.createCell(0).setCellValue("TestcaseNo");
		rowhead.createCell(1).setCellValue("TestcaseName");
		rowhead.createCell(2).setCellValue("TestcaseDiscription");
		rowhead.createCell(3).setCellValue("Result");
		rowhead.createCell(4).setCellValue("Comment");
		short a = (short) (rowindexx);
		Row rowindexx1 = sheet.createRow((short) a);

		rowindexx1.createCell(0).setCellValue(TestcaseNo);
		rowindexx1.createCell(1).setCellValue(TestcaseName);
		rowindexx1.createCell(2).setCellValue(TestcaseDiscription);
		rowindexx1.createCell(3).setCellValue(Result);
		rowindexx1.createCell(4).setCellValue(comment);

		inputStream.close();

		FileOutputStream outputStream = new FileOutputStream(fileName);
		workbook.write(outputStream);
		workbook.close();
		outputStream.close();

	}
}
