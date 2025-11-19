package datadrivenbasics;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHRMUsingDataDrivenClass {
	WebDriver d;
	String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	OrangeHRMUsingDataDrivenClassPOM p;
	
	@Test (priority = 1)
	public void setup() {
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		d.get(url);
		
	}
	
	@Test (priority = 2)
	public void LoginFormTest() throws Exception {
		p = new OrangeHRMUsingDataDrivenClassPOM(d);
		
		FileInputStream f = new FileInputStream(new File("C:\\Users\\ROHIT AINULE\\Desktop\\Credentials.xlsx"));
	    XSSFWorkbook w=new XSSFWorkbook(f);
	    XSSFSheet s = w.getSheetAt(0);
	    XSSFCell c;
	    
	    for(int i= 1; i<=s.getLastRowNum(); i++) {
	    	c = s.getRow(i).getCell(0);
	    	c.setCellType(CellType.STRING);
	    	p.username.sendKeys(c.getStringCellValue());
  	
	    	c = s.getRow(i).getCell(1);
	    	c.setCellType(CellType.STRING);
	    	p.password.sendKeys(c.getStringCellValue());
//	    	d.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(c.getStringCellValue());
	    	Thread.sleep(1000);
	    	
	    	d.findElement(By.xpath("//button[@type='submit']")).click();
	    }
	}    
	    @Test (priority = 3)
	    public void PIMmethod() throws Exception {
	    	p = new OrangeHRMUsingDataDrivenClassPOM(d);
	    	
	    	p.pimtab.click();
	    	Thread.sleep(2000);
	    	p.addpimbtn.click();
	    	Thread.sleep(1000);
	    	
	    	FileInputStream f = new FileInputStream(new File("C:\\Users\\ROHIT AINULE\\Desktop\\Credentials.xlsx"));
	    	XSSFWorkbook w = new XSSFWorkbook(f);
	    	XSSFSheet s = w.getSheetAt(0);
	    	XSSFCell c;
	    	
	    	for(int i = 1; i<=s.getLastRowNum(); i++) {
		    	Thread.sleep(1000);
	    		c = s.getRow(i).getCell(3);
	    		c.setCellType(CellType.STRING);
	    		p.fname.sendKeys(c.getStringCellValue());
	    		
	    		c = s.getRow(i).getCell(4);
	    		c.setCellType(CellType.STRING);
	    		p.mname.sendKeys(c.getStringCellValue());
	    			
	    		c = s.getRow(i).getCell(5);
	    		c.setCellType(CellType.STRING);
	    		p.lname.sendKeys(c.getStringCellValue());
	    		
		    	Thread.sleep(1000);
	    		c = s.getRow(i).getCell(6);
	    		c.setCellType(CellType.STRING);
	    		p.id.clear();
	    		p.id.sendKeys(c.getStringCellValue());
	    		
	    		c= s.getRow(i).getCell(7);
	    		c.setCellType(CellType.STRING);
	    		File pf = new File(c.getStringCellValue());
	    		WebElement profilepic = d.findElement(By.cssSelector("input[type=file]"));
	    		profilepic.sendKeys(pf.getAbsolutePath());
	    		
	    		p.savebtn.click();
		    	Thread.sleep(1000);
		    	p.pimtab.click();
		    	Thread.sleep(2000);
		    	p.addpimbtn.click();
		    	Thread.sleep(1000);
	    	}
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	   
	}
}
