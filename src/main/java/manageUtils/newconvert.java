package manageUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;


	public class newconvert {

	    public static void main(String[] args) throws InvalidFormatException {
	        String inputDir = "your_excel_directory"; // Replace with your directory path
	        String outputDir = "output_pdf_directory"; // Replace with your desired output directory
	        File dir = new File(inputDir);

	        // Filter for Excel files (xls or xlsx)
	        FilenameFilter excelFilter = (file, fileName) -> fileName.endsWith(".xls") || fileName.endsWith(".xlsx");

	        for (File excelFile : dir.listFiles(excelFilter)) {
	            String pdfFilePath = outputDir + File.separator + excelFile.getName() + ".pdf";
	            try {
	                convertExcelToPdf(excelFile.getAbsolutePath(), pdfFilePath);
	                System.out.println("Converted " + excelFile.getName() + " to PDF successfully!");
	            } catch (IOException | DocumentException e) {
	                e.printStackTrace();
	            }
	        }
	    }

	    public static void convertExcelToPdf(String excelFilePath, String pdfFilePath) throws IOException, DocumentException, InvalidFormatException {
	        XSSFWorkbook workbook = new XSSFWorkbook(new File(excelFilePath));
	        XSSFSheet sheet = workbook.getSheetAt(0); // Assuming first sheet

	        Document document = new Document(PageSize.A4);
	        PdfWriter.getInstance(document, new FileOutputStream(pdfFilePath));
	        document.open();

	        PdfPTable table = new PdfPTable(sheet.getLastRowNum()); // Get number of columns

	        for (int i = 0; i <= sheet.getLastRowNum(); i++) {
	            XSSFRow row = sheet.getRow(i);
	            if (row == null) {
	                continue;
	            }

	            for (int j = 0; j < row.getLastCellNum(); j++) {
	                String cellValue = "";
	                if (row.getCell(j) != null) {
	                    cellValue = row.getCell(j).getStringCellValue();
	                }
	                table.addCell(new Phrase(cellValue));
	            }
	        }

	        document.add(table);
	        document.close();
	        workbook.close();
	    }
	}


