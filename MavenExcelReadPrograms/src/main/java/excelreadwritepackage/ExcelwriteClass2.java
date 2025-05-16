package excelreadwritepackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelwriteClass2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	try
	{
		FileOutputStream fw = new FileOutputStream("D:\\@ Selenium\\WriteFile.xlsx");
		
		Workbook w = new XSSFWorkbook();
		Sheet s = w.createSheet("User1Details");
		
		Row r0 = s.createRow(0);
		r0.createCell(0).setCellValue("UserFirstName1");
		r0.createCell(1).setCellValue("UserLastName1");
		r0.createCell(2).setCellValue("UserAddress1");
		r0.createCell(3).setCellValue("UserStatus1");
		
		Row r1 = s.createRow(1);
		r1.createCell(0).setCellValue("Shanakr");
		r1.createCell(1).setCellValue("Parimella");
		r1.createCell(2).setCellValue("Dombivli");
		r1.createCell(3).setCellValue("Active");
	
		Row r2 = s.createRow(2);
		r2.createCell(0).setCellValue("Jyothi");
		r2.createCell(1).setCellValue("Parimella");
		r2.createCell(2).setCellValue("Dombivli");
		r2.createCell(3).setCellValue("Active");

		w.write(fw);
		System.out.println("Data entered into the EXcel file\n");

		FileInputStream fr = new FileInputStream(new File("D:\\@ Selenium\\WriteFile.xlsx"));
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
			System.out.println(cell.getStringCellValue());
		}
	}
	catch(FileNotFoundException e)
	{
		System.out.println("Close the file....!\n");
	}		
	}
}