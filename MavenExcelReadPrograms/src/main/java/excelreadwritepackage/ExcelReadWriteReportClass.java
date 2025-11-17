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
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExcelReadWriteReportClass {
	WebDriver d;
	String url = "https://practicetestautomation.com/practice-test-login/", newurl, username, password, timestamp;
	int lc, lr;
	
	FileInputStream fi;
	FileOutputStream fo;
	XSSFWorkbook w;
	XSSFSheet s;
	Row r;
	Cell c;
	
	ExcelReadWriteReportClassPOM p;

	@Given("Open practise website")
	public void open_practise_website() throws InterruptedException {
	d = new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
	d.get(url);
	Thread.sleep(2000);
	}

	@When("Enter credentials into the practise website")
	public void enter_credentials_into_the_practise_website() throws IOException, InterruptedException {
	p = new ExcelReadWriteReportClassPOM(d);
	
	fi = new FileInputStream(new File("D:\\@ Selenium\\Excel Files\\practicetestautomation.xlsx"));
	w = new XSSFWorkbook(fi);
	s = w.getSheetAt(0);
	lr = s.getLastRowNum();
	
	r = s.getRow(0);
	lc = r.getLastCellNum();
	c = r.createCell(lc);
	timestamp = new SimpleDateFormat("dd-MM-yyyy_HH:mm:ss").format(Calendar.getInstance().getTime());
	c.setCellValue(timestamp);
	for(int i = 1; i<=lr; i++) {
		c = s.getRow(i).getCell(0);
		c.setCellType(CellType.STRING);
		username = c.getStringCellValue();
		p.userfield.sendKeys(username);
		
		c = s.getRow(i).getCell(1);
		c.setCellType(CellType.STRING);
		password = c.getStringCellValue();
		p.passfield.sendKeys(password);
		Thread.sleep(1000);
		
		p.submit.click();
		
		newurl = d.getCurrentUrl();

		r = s.getRow(i);
		if(r==null) {
			r = s.createRow(i);
		}
		lc = r.getLastCellNum();
		if(lc==-1) {
			lc = 0;
		}
		c = r.createCell(lc);
		
		if(newurl.equals(url)) {
			System.out.println(username + " - Login Failed");
			c.setCellValue("Failed");
		}else {
			System.out.println(username + " - Login Success");
			c.setCellValue("Passed");
			p.logout.click();
		}
		
		
	}
	}

	@And("Generate the report")
	public void generate_the_report() throws IOException  {
	fo = new FileOutputStream("D:\\@ Selenium\\Excel Files\\practicetestautomation.xlsx");
	w.write(fo);
	}

	@Then("Close the driver")
	public void close_the_driver() {
	d.close();	
	}
}