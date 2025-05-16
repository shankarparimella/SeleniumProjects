package excelreadwritepackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadWriteProgram {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	try {
		FileOutputStream fw = new FileOutputStream("D:\\@ Selenium\\Test_Case_File.xlsx");
		
		Workbook w = new XSSFWorkbook();
		Sheet s = w.createSheet("Test_Cases");
		
		Row r0 = s.createRow(0);
		r0.createCell(0).setCellValue("TestID");
		r0.createCell(1).setCellValue("Test Title");
		r0.createCell(2).setCellValue("Test Description");
		r0.createCell(3).setCellValue("Expected Result");
		r0.createCell(4).setCellValue("Actual Result");
		r0.createCell(5).setCellValue("Status");
		r0.createCell(6).setCellValue("Comment");
		
		Row r1 = s.createRow(1);
		r1.createCell(0).setCellValue("1");
		r1.createCell(1).setCellValue("Check URL");
		r1.createCell(2).setCellValue("URL should start with https: and end with .com");
		r1.createCell(3).setCellValue("URL should be business URL");
		r1.createCell(4).setCellValue("NA");
		r1.createCell(5).setCellValue("NA");
		r1.createCell(6).setCellValue("NA");
		
		w.write(fw);
		System.out.println("Test Case Template is ready to use\n");
		
		FileInputStream fr = new FileInputStream(new File("D:\\@ Selenium\\Test_Case_File.xlsx"));
		XSSFWorkbook wr = new XSSFWorkbook(fr);
		XSSFSheet sr = wr.getSheetAt(0);
		XSSFCell cell;
		
		for(int i=0; i<=sr.getLastRowNum(); i++)
		{
			cell = sr.getRow(i).getCell(0);
			cell.setCellType(CellType.STRING);
			System.out.print(cell.getStringCellValue()+" | ");

			cell = sr.getRow(i).getCell(1);
			cell.setCellType(CellType.STRING);
			System.out.print(cell.getStringCellValue()+" | ");

			cell = sr.getRow(i).getCell(2);
			cell.setCellType(CellType.STRING);
			System.out.print(cell.getStringCellValue()+" | ");

			cell = sr.getRow(i).getCell(3);
			cell.setCellType(CellType.STRING);
			System.out.print(cell.getStringCellValue()+" | ");

			cell = sr.getRow(i).getCell(4);
			cell.setCellType(CellType.STRING);
			System.out.print(cell.getStringCellValue()+" | ");

			cell = sr.getRow(i).getCell(5);
			cell.setCellType(CellType.STRING);
			System.out.print(cell.getStringCellValue()+" | ");

			cell = sr.getRow(i).getCell(6);
			cell.setCellType(CellType.STRING);
			System.out.println(cell.getStringCellValue()+" | ");
		}
	}
	catch(Exception e){
		System.out.println("Close the file....!");
	}
}
}