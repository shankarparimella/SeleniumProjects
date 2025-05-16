package excelreadwritepackage;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelwriteClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try
		{
		FileOutputStream f = new FileOutputStream("D:\\@ Selenium\\WriteFile.xlsx");
		
		Workbook w = new XSSFWorkbook();
		Sheet s = w.createSheet("Credentials");
		
		Row r0 = s.createRow(0); 
		r0.createCell(0).setCellValue("UserName");
		r0.createCell(1).setCellValue("Password");
		r0.createCell(2).setCellValue("Status");
		
		Row r1 = s.createRow(1);
		r1.createCell(0).setCellValue("Shankar");
		r1.createCell(1).setCellValue("shankar@123");
		r1.createCell(2).setCellValue("Active");
		
		Row r2 = s.createRow(2);
		r2.createCell(0).setCellValue("Jyothi");
		r2.createCell(1).setCellValue("Jyothi@123");
		r2.createCell(2).setCellValue("InActive");

		w.write(f);
		System.out.println("Data entered into the Excel");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Excel File is Open, pls close the file and try again....!");
		}
	}
}