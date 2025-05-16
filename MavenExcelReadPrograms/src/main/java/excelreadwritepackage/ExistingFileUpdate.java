package excelreadwritepackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExistingFileUpdate {
	FileInputStream fi;
	FileOutputStream fo;
	XSSFWorkbook w;
	XSSFSheet s;
	
	@Test (priority = 1)
	public void Filedata() throws Exception{
	fi = new FileInputStream(new File("D:\\@ Selenium\\ReadFile.xlsx"));
	w = new XSSFWorkbook(fi);
	s = w.getSheetAt(0);
	}
	
	@Test (priority = 2)
	public void Status() throws Exception{
	Row r = s.getRow(0);
	if(r==null) {
		r = s.createRow(0);
	}
	
	int lastcellnum = r.getLastCellNum();
	if (lastcellnum==-1) {
		lastcellnum=0;
	}
	
	Cell c = r.createCell(lastcellnum);
	c.setCellValue("Status");
	
	
	fo = new FileOutputStream("D:\\@ Selenium\\ReadFile.xlsx");
	w.write(fo);
	
	System.out.println("Excel file updated...");
	}
}