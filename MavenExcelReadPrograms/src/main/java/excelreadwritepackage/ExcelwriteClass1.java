package excelreadwritepackage;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelwriteClass1 {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		try
		{
		FileOutputStream f = new FileOutputStream("D:\\@ Selenium\\WriteFile.xlsx");
		
		Workbook w = new XSSFWorkbook();
		Sheet s = w.createSheet("Login_Credentials");
		
		Row r0 = s.createRow(0);
		r0.createCell(0).setCellValue("Username");
		r0.createCell(1).setCellValue("Password");
		r0.createCell(2).setCellValue("Status");
		
		Row r1 = s.createRow(1);
		r1.createCell(0).setCellValue("ShankarP");
		r1.createCell(1).setCellValue("shankar@123");
		r1.createCell(2).setCellValue("Active");

		w.write(f);
		System.out.println("File Updated");
		}
		catch(FileNotFoundException e)
		{ System.out.println("Close the file....!");}
	}
}