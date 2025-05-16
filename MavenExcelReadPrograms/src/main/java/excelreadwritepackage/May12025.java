package excelreadwritepackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class May12025 {
	WebDriver d;
	String url = "https://practicetestautomation.com/practice-test-login/", newurl, userid, timeStamp;
	int lc, lr;
	FileInputStream fi;
	FileOutputStream fo;
	XSSFWorkbook w;
	XSSFSheet s;
	Row r;
	Cell c;
	
	@Given("Open tutorialspoint website on 1st May")
	public void open_swaglab_website_on_1st_may() throws InterruptedException {
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		d.get(url);
		Thread.sleep(2000);
	}

	@When("Enter tutorialspoint Excel credentials")
	public void enter_swaglab_excel_credentials() throws IOException, InterruptedException {
		fi = new FileInputStream(new File("D:\\@ Selenium\\Excel Files\\practicetestautomation.xlsx"));
		w = new XSSFWorkbook(fi);
		s = w.getSheetAt(0);
		lr = s.getLastRowNum();
		timeStamp = new SimpleDateFormat("dd-MM-yyyy_HH:mm:ss").format(Calendar.getInstance().getTime());
		r=s.getRow(0);
		lc=r.getLastCellNum();
		c=r.createCell(lc);
		c.setCellValue("Status On"+timeStamp);
		
		for(int i=1; i<=lr; i++) {
			c = s.getRow(i).getCell(0);
			c.setCellType(CellType.STRING);
			userid = c.getStringCellValue();
			d.findElement(By.xpath("//input[@id='username']")).sendKeys(c.getStringCellValue());
			
			c = s.getRow(i).getCell(1);
			c.setCellType(CellType.STRING);
			d.findElement(By.xpath("//input[@id='password']")).sendKeys(c.getStringCellValue());
			Thread.sleep(1000);
			
			d.findElement(By.xpath("//button[@id='submit']")).click();
			newurl = d.getCurrentUrl();
			Thread.sleep(1000);
			
			r=s.getRow(i);
			if(r==null) {
				r=s.createRow(i);
			}
			lc=r.getLastCellNum();
			if(lc==-1) {
				lc=0;
			}
			c=r.createCell(lc);
			
			if(newurl.endsWith(url)) {
				System.out.println(userid+" - Login Failed");
				c.setCellValue("Fail");
			}else {
				System.out.println(userid+" - Login Passed" );
				c.setCellValue("Pass");
				d.findElement(By.xpath("//a[contains(.,'Log out')]")).click();
			}
			d.navigate().refresh();
		}
	}

	@And("Validate tutorialspoint Excel credentials")
	public void validate_swaglab_excel_credentials() {
		System.out.println("Validated all credentials");
	}

	@Then("Update the result in Excel file")
	public void update_the_result_in_excel_file() throws IOException {
		fo = new FileOutputStream("D:\\@ Selenium\\Excel Files\\practicetestautomation.xlsx");
		w.write(fo);
	}
}
