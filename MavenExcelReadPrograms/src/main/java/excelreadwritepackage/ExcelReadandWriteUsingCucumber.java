package excelreadwritepackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExcelReadandWriteUsingCucumber {
	WebDriver d;
	XSSFWorkbook w;
	XSSFSheet s;
	Row r;
	Cell c;
	FileInputStream fi;
	FileOutputStream fo;
	String url = "https://quickxpertinfotech.com/login", newurl, username;
	int lr, lc;
	WebElement email, password, login;
	
	@Given("Setup login page")
	public void setup_login_page() throws InterruptedException {
	    d = new ChromeDriver();
//	    d.manage().window().maximize();
	    d.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
	    d.get(url);
	    Thread.sleep(2000);
	}

	@And("Enter excel credentials")
	public void enter_excel_credentials() throws Exception {
		fi = new FileInputStream(new File("D:\\@ Selenium\\Excel Files\\ReadFile.xlsx"));
		w = new XSSFWorkbook(fi);
		s = w.getSheetAt(0);
		lr = s.getLastRowNum();
		String timeStamp = new SimpleDateFormat("dd-MM-yyyy_HH:mm:ss").format(Calendar.getInstance().getTime());
		
		r=s.getRow(0);
		lc = r.getLastCellNum();
		c=r.createCell(lc);
		c.setCellValue(timeStamp);

		for(int i=1; i<=lr; i++) {
			email = d.findElement(By.xpath("(//input[@type='email'])[1]"));
			password = d.findElement(By.xpath("//input[@type='password']"));
			login = d.findElement(By.xpath("//button[@name='submit']"));

			c = s.getRow(i).getCell(0);
			c.setCellType(CellType.STRING);
			email.sendKeys(c.getStringCellValue());
			username = c.getStringCellValue();
			
			c = s.getRow(i).getCell(1);
			c.setCellType(CellType.STRING);
			password.sendKeys(c.getStringCellValue());			
		    Thread.sleep(1000);
			
			login.click();
		    Thread.sleep(1000);
		    
			newurl = d.getCurrentUrl();
			
			r=s.getRow(i);
			if(r==null) {
				r=s.createRow(i);
			}
			lc = r.getLastCellNum();
			if(lc==-1) {
				lc=0;
			}
			c=r.createCell(lc);
			
			if(newurl.equals(url)) {
				System.out.println(username+" - Login is Failed");
				c.setCellValue("Failee");
			}else {
				System.out.println(username+" - Login is Passed");
				c.setCellValue("Passee");
			}
		    d.navigate().refresh();
		}
	}
	@When("Validate the excel credentials")
	public void validate_the_excel_credentials() {
		System.out.println("Validated all credentials from Excel file");
	}

	@Then("Update the excel file")
	public void update_the_excel_file() throws Exception {
		fo = new FileOutputStream("D:\\@ Selenium\\Excel Files\\ReadFile.xlsx");
		w.write(fo);
	}
}