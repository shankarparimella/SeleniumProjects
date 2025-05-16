package excelreadwritepackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExcelReadWriteProgramUsingTestNG {
	WebDriver d = new ChromeDriver();
	FileInputStream fi;
	FileOutputStream fo;
	XSSFWorkbook w;
	XSSFSheet s;
	Cell c;
	Row r;
	Alert al;
//	XSSFCell c1;
	String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	String newurl = "";
	
	@Test (priority = 1)
	public void excelread() throws Exception{
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		d.get(url);
		Thread.sleep(2000);
		
		fi = new FileInputStream(new File("D:\\@ Selenium\\Excel Files\\ReadFile.xlsx"));
		w = new XSSFWorkbook(fi);
		s = w.getSheetAt(0);
		int lr = s.getLastRowNum();
		int lastcell;
		
		for(int i=1; i<=lr; i++) {
			c = s.getRow(i).getCell(0);
			c.setCellType(CellType.STRING);
			WebElement username = d.findElement(By.xpath("//input[@name='username']"));
			username.sendKeys(c.getStringCellValue());
			System.out.print(c.getStringCellValue());
			
			c = s.getRow(i).getCell(1);
			c.setCellType(CellType.STRING);
			WebElement password = d.findElement(By.xpath("//input[@type='password']"));
			password.sendKeys(c.getStringCellValue());
			Thread.sleep(1000);
			
			WebElement login = d.findElement(By.xpath("//button[@type='submit']"));
			login.click();
			
			newurl = d.getCurrentUrl();
			
			r = s.getRow(i);
			if(r==null) {
				r=s.createRow(i);
			}
			lastcell = r.getLastCellNum();
			if(lastcell==-1) {
				lastcell=0;
			}
			c = r.createCell(lastcell);
			
			if(url.equals(newurl)) {
				System.out.println(" - Login Failed");
				c.setCellValue("Fail");
			}else {
				System.out.println(" - Login Successfull");
				c.setCellValue("Pass");
				}
			d.navigate().refresh();
			
		fo = new FileOutputStream("D:\\@ Selenium\\Excel Files\\ReadFile.xlsx");
		w.write(fo);
		}
	}
}