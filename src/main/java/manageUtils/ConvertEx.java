package manageUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.itextpdf.text.Anchor;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class ConvertEx {

	/**
	 * @param args
	 * @throws Exception
	 */
	private static String FILE = System.getProperty("user.dir") + "\\src\\test\\resources\\Astroreport.pdf";

	private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD);
	private static Font redFont = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.NORMAL, BaseColor.RED);
	private static Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 16, Font.BOLD);
	private static Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD);
	// Find out number of columns in the excel
	private static int numberOfColumns;

	public void Genratepdf() {
		System.out.println(FILE);
		String excelFile = System.getProperty("user.dir") + "\\src\\test\\resources\\Astroreport.xlsx";

		File xlsFile = new File(excelFile);

		Workbook workbook;
		try {

			workbook = loadSpreadSheet(xlsFile);

			readSpreadSheet(workbook);
			// SendMail s = new SendMail();
			// Header h= new Header("Header", "SHopkirana");

		} catch (FileNotFoundException e) {
			System.err.println("Excel File (or) PDF File is already opened. Please close the file");
			System.exit(1);
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void readSpreadSheet(Workbook workbook) throws IOException, DocumentException {

		Document document = new Document();
		PdfWriter.getInstance(document, new FileOutputStream(FILE));
		document.open();
		// HeaderAndFooterPdfPageEventHelper event = new
		// HeaderAndFooterPdfPageEventHelper();
		addMetaData(document);
		addTitlePage(document);
		// PdfWriter.Set

		Anchor anchor = new Anchor("Detailed Test Results: ", catFont);
		anchor.setName("Detailed Test Results:");

		// Second parameter is the number of the chapter
		Chapter catPart = new Chapter(new Paragraph(anchor), 1);

		Paragraph subPara = new Paragraph("Astrolok", subFont);
		// Paragraph subPara = new Paragraph("PICKER", subFont);
		// Paragraph subPara = new Paragraph("Itemmaster", subFont);
		Section subCatPart = catPart.addSection(subPara);
		addEmptyLine(subPara, 5);

		Sheet sheet = workbook.getSheetAt(0);

		// Iterate through each rows from first sheet
		Iterator<Row> rowIterator = sheet.iterator();

		int temp = 0;
		boolean flag = true;
		PdfPTable table = null;

		while (rowIterator.hasNext()) {
			Row row = rowIterator.next();
			int cellNumber = 0;

			if (flag) {
				table = new PdfPTable(row.getLastCellNum());
				System.out.println(table + "count");
				flag = false;
			}

			// For each row, iterate through each columns
			Iterator<Cell> cellIterator = row.cellIterator();
			while (cellIterator.hasNext()) {
				Cell cell = cellIterator.next();

				switch (cell.getCellType()) {
				case STRING:
					if (temp == 0) {
						numberOfColumns = row.getLastCellNum();
						PdfPCell c1 = new PdfPCell(new Phrase(cell.getStringCellValue()));
						c1.setHorizontalAlignment(Element.ALIGN_CENTER);
						table.addCell(c1);
						table.setHeaderRows(1);

					} else {
						cellNumber = checkEmptyCellAndAddCellContentToPDFTable(cellNumber, cell, table);
					}
					cellNumber++;
					break;

				case NUMERIC:
					cellNumber = checkEmptyCellAndAddCellContentToPDFTable(cellNumber, cell, table);
					cellNumber++;
					break;
				}
			}
			temp = 1;
			if (numberOfColumns != cellNumber) {
				for (int i = 0; i < (numberOfColumns - cellNumber); i++) {
					table.addCell(" ");
				}
			}
		}

		// PdfWriter write = new
		subCatPart.add(table);

		// Now add all this to the document
		document.add(catPart);
		document.close();
	}

	private static int checkEmptyCellAndAddCellContentToPDFTable(int cellNumber, Cell cell, PdfPTable table) {
		if (cellNumber == cell.getColumnIndex()) {
			if (cell.getCellType() == CellType.NUMERIC) {
				table.addCell(Double.toString(cell.getNumericCellValue()));
			}
			if (cell.getCellType() == CellType.STRING) {
				table.addCell(cell.getStringCellValue());
			}

		} else {
			while (cellNumber < cell.getColumnIndex()) {

				table.addCell(" ");
				cellNumber++;

			}
			if (cellNumber == cell.getColumnIndex()) {
				if (cell.getCellType() == CellType.NUMERIC) {
					table.addCell(Double.toString(cell.getNumericCellValue()));
				}
				if (cell.getCellType() == CellType.STRING) {
					table.addCell(cell.getStringCellValue());
				}

			}
			cellNumber = cell.getColumnIndex();
		}

		return cellNumber;
	}

	// iText allows to add metadata to the PDF which can be viewed in your Adobe
	// Reader
	// under File -> Properties
	private static void addMetaData(Document document) {
		document.addTitle("Automation Report");
		document.addSubject("Automation Report Cms,DeliveryApp,PO_GR_IR,Picker,ItemMaster");
		document.addKeywords("Automation Report Cms,DeliveryApp,PO_GR_IR,Picker,ItemMaster");
		document.addSubject("Automation Report Picker");
		document.addKeywords("Automation Report Picker");
		document.addAuthor("Balmukund sahu");
		document.addCreator("Balmukund sahu");
		// HeaderAndFooterPdfPageEventHelper event= new
		// HeaderAndFooterPdfPageEventHelper();

	}

	private static void addTitlePage(Document document) throws DocumentException, IOException {
		Paragraph preface = new Paragraph();
		// We add one empty line
		addEmptyLine(preface, 1);
		// Lets write a big header
		preface.add(new Paragraph("Automation Test  Report ", catFont));
//		preface.add(new Paragraph("Automation Test  Report for picker", catFont));
//		preface.add(new Paragraph("Automation Test  Report for Item Matser", catFont));

		addEmptyLine(preface, 1);
		// Will create: Report generated by: name, date
		preface.add(new Paragraph("Report generated by: " + "Balmukund Sahu" + ", " + new Date(), smallBold));
		addEmptyLine(preface, 3);
		preface.add(new Paragraph("This  Test Report and TestCase Result ", smallBold));
//		preface.add(new Paragraph(
//				"This  Test Report describes Picker TestCase Result ",
//				smallBold));
//		preface.add(new Paragraph(
//				"This  Test Report describes ItemMaster TestCase Result ",
//				smallBold));
		// document describes how many Testcases is passed or failed for backend
		// purchaseorder
		// This Test Report describes Purchase Request creation functionality we can
		// check how many Testcase pass of fail.
		addEmptyLine(preface, 1);

		preface.add(new Paragraph("First Version of Automation Report  ;-).", redFont));

		document.add(preface);

		// Start a new page
		document.newPage();

	}

	private static void addEmptyLine(Paragraph paragraph, int number) {
		for (int i = 0; i < number; i++) {
			paragraph.add(new Paragraph(" "));
		}
	}

	private static Workbook loadSpreadSheet(File xlsFile) throws Exception {
		HSSFWorkbook workbook = null;

		String ext = getFileExtension(xlsFile.getName());
		if (ext.equalsIgnoreCase("xlsx")) {
			InputStream pkg = new FileInputStream(xlsFile);
			workbook = new HSSFWorkbook(pkg);
			pkg.close();
		} else if (ext.equalsIgnoreCase("xls")) {
			InputStream xlsFIS = new FileInputStream(xlsFile);
			workbook = new HSSFWorkbook(xlsFIS);
			xlsFIS.close();
		} else {
			throw new Exception("FILE EXTENSION NOT RECOGNIZED");
		}
		return workbook;
	}

	private static String getFileExtension(String fileName) {
		String ext = "";
		int mid = fileName.lastIndexOf(".");
		ext = fileName.substring(mid + 1, fileName.length());
		System.out.println("File Extension --" + ext);
		return ext;
	}

}
