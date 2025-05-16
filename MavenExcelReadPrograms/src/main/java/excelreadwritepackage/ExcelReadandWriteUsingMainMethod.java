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
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelReadandWriteUsingMainMethod {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String loginurl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		String homeurl = "";
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		d.get(loginurl);
		Thread.sleep(2000);
		
		FileInputStream fi = new FileInputStream(new File("D:\\@ Selenium\\Java Programs\\Kshitij Sir Programs\\Exel Read and Write Programs\\Credentials.xlsx"));
		XSSFWorkbook w = new XSSFWorkbook(fi);
		XSSFSheet sh = w.getSheetAt(0);
		Row r;
		Cell c;
		XSSFCell cell;
		int lastcell;
		
		for(int i=1; i<=sh.getLastRowNum(); i++) {
			cell = sh.getRow(i).getCell(0);
			cell.setCellType(CellType.STRING);
			System.out.print(cell.getStringCellValue());
			d.findElement(By.xpath("//input[@name='username']")).sendKeys(cell.getStringCellValue());
			
			cell = sh.getRow(i).getCell(1);
			cell.setCellType(CellType.STRING);
			d.findElement(By.xpath("//input[@type='password']")).sendKeys(cell.getStringCellValue());
			
			d.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(2000);
			
//			WebElement invalid = d.findElement(By.xpath("//p[contains(.,'Invalid credentials')]"));
			
			r = sh.getRow(i);
			if(r==null) {
				r=sh.createRow(i);
			}
			
			lastcell = r.getLastCellNum();
			if(lastcell==-1) {
				lastcell=0;
			}
			c=r.createCell(lastcell);
			homeurl = d.getCurrentUrl();
			
//			if(invalid.isDisplayed())
			if(homeurl.equals(loginurl))
			{
				System.out.println(" - Login Failed");
				c.setCellValue("Failed");
				}else {
					System.out.println(" - Login Passed");
					c.setCellValue("Passed");
				}
			FileOutputStream fo = new FileOutputStream("D:\\@ Selenium\\Java Programs\\Kshitij Sir Programs\\Exel Read and Write Programs\\Credentials.xlsx");
			w.write(fo);
		}
	}
}