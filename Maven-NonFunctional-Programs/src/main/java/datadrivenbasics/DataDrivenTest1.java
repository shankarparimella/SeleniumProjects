package datadrivenbasics;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataDrivenTest1 {

	WebDriver d;
	String url = "https://www.tutorialspoint.com/selenium/practice/login.php#";
	DataDrivenTest1POM p;
	
	FileInputStream f ;
    XSSFWorkbook w;
    XSSFSheet s;
    XSSFCell c;
    
    @Test (priority=1)
	public void Setup() throws InterruptedException {
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		d.get(url);
		Thread.sleep(2000);
	}

	@Test (priority=2)
	public void LoginTest() throws Exception {
		p = new DataDrivenTest1POM(d);
		
		f = new FileInputStream(new File("C:\\Users\\ROHIT AINULE\\Desktop\\Credentials.xlsx"));
	    w=new XSSFWorkbook(f);
	    s = w.getSheetAt(0);
	    XSSFCell c;
		
		for(int i=1; i<=s.getLastRowNum(); i++) {
			p.formtab.click();
			p.logintab.click();
			
			c = s.getRow(i).getCell(0);
			c.setCellType(CellType.STRING);
			p.username.sendKeys(c.getStringCellValue());
			
			c = s.getRow(i).getCell(1);
			c.setCellType(CellType.STRING);
			p.password.sendKeys(c.getStringCellValue());
			Thread.sleep(2000);
			
			p.loginbtn.click();
		}
	}

	@Test (priority=3)
	public void RegistrationTest() throws Exception {
		
		f = new FileInputStream("C:\\Users\\ROHIT AINULE\\Desktop\\Credentials.xlsx");
		w = new XSSFWorkbook(f);
		s = w.getSheetAt(1);
		
		for(int i=1; i<=s.getLastRowNum(); i++) {
			p.formtab.click();
			p.registertab.click();

			c = s.getRow(i).getCell(0);
			c.setCellType(CellType.STRING);
			p.fname.sendKeys(c.getStringCellValue());
			
			c = s.getRow(i).getCell(1);
			c.setCellType(CellType.STRING);
			p.lname.sendKeys(c.getStringCellValue());
			
			c = s.getRow(i).getCell(2);
			c.setCellType(CellType.STRING);
			p.newuser.sendKeys(c.getStringCellValue());
			
			c = s.getRow(i).getCell(3);
			c.setCellType(CellType.STRING);
			p.newpass.sendKeys(c.getStringCellValue());
			
			Thread.sleep(2000);
			p.registerbtn.click();
		}
	}
}
