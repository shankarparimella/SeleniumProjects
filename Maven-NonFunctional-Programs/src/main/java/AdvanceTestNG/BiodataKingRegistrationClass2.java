package AdvanceTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class BiodataKingRegistrationClass2 {

	WebDriver d;
	String url = "https://biodataking.com/";
	BiodataKingRegistrationPOM p;
	Actions a;
	Action ac1, ac2, ac3;
	
	@Test (priority = 1)
	public void setup() throws InterruptedException{
		d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		d.manage().window().maximize();
		d.get(url);
		Thread.sleep(2000);
	}
	
	@Test (priority = 2)
	public void LoginFormTest() throws InterruptedException {
		String username = "Shankar";
		String password = "Shankar@123";
		
	p = new BiodataKingRegistrationPOM(d);
	p.loginlink.click();
	p.username.sendKeys(username);
	Thread.sleep(1000);	
	p.password.sendKeys(password);
	Thread.sleep(1000);	
	p.loginbtn.click();
	Thread.sleep(2000);	
	d.navigate().refresh();
	Thread.sleep(2000);	
	}
	
	@Test (priority = 3)
	public void MouseHoverTest() throws InterruptedException {
		p = new BiodataKingRegistrationPOM(d);
		a = new Actions(d);
		a.moveToElement(p.loginlink).perform();
		Thread.sleep(1000);
		a.moveToElement(p.register).perform();
		Thread.sleep(1000);
		a.moveToElement(p.ebook).perform();
		Thread.sleep(1000);
		a.moveToElement(p.home).perform();
		Thread.sleep(1000);
		
	}
	
	@Test (priority = 4)
	public void registration() throws Exception {
		  String gender = "Male";
		  String fname = "Shankar";
		  String lname = "Parimella";
		  String religion = "Hindu";
		  String cast = "Padmashali";
		  String date = "17";
		  String month = "Apr";
		  String year = "1987";
		  String language = "Telugu"; 
		  String country = "India";
		  String mobile = "9004562616";
		  String email = "shankar@gmail.com";
		  String pass = "shankar@1234"; 
		  String location = "sion mumbai";
		  String status = "Widowed";
		  String child = "2";
		  String complexity = "Fair";
		  String height = "5 ft 5 inch";
		
		p = new BiodataKingRegistrationPOM(d);
		a = new Actions(d);
		p.register.click();
		new Select(p.gender).selectByVisibleText(gender);
		p.fname.sendKeys(fname);
		p.lname.sendKeys(lname);
		new Select(p.religion).selectByVisibleText(religion);

//		ac1 = a.sendKeys(p.cast, cast).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build();
//		ac1.perform();
		p.cast.sendKeys(cast);
		p.padmashalicast.click();

		Thread.sleep(2000);
		p.dob.click();
		new Select(p.date).selectByVisibleText(date);
		new Select(p.month).selectByVisibleText(month);
		new Select(p.year).selectByVisibleText(year);
		p.setdob.click();
		Thread.sleep(2000);
		
//		ac2 = a.sendKeys(p.lang, language).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build();
//		ac2.perform();
		p.lang.sendKeys(language);
		p.telugulang.click();
		
		Thread.sleep(2000);
		new Select(p.country).selectByVisibleText(country);
		p.mobile.sendKeys(mobile);
		p.email.sendKeys(email);
		p.pass.sendKeys(pass);
		new Select(p.status).selectByVisibleText(status);
		new Select(p.childcount).selectByVisibleText(child);
		new Select(p.complexity).selectByVisibleText(complexity);
		new Select(p.height).selectByVisibleText(height);
		
		ac3 = a.sendKeys(p.location,location).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build();
		ac3.perform();
		Thread.sleep(2000);	
		p.findlocation.click();
		Thread.sleep(2000);	
		p.findlocation.click();
		p.register.click();
//		Thread.sleep(1000);
//		Alert al = d.switchTo().alert();
//		al.accept();
	}
}