package testNGPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class FirstClass {
  
	WebDriver driver;
	Actions a;
	Select s;
	String url = "https://biodataking.com/";
	
	@Test
  public void main() {
	  System.out.println("Main Method");
  }
  @BeforeMethod
  public void Registration() throws InterruptedException {
	  a = new Actions(driver);
	  System.out.println("Before Method");
	  //User Details
	  String gender = "Male";
	  String fname = "Shankar";
	  String lname = "Parimella";
	  String religion = "Hindu";
	  String cast = "Padmashali";
	  String date = "17";
	  String month = "Apr";
	  String year = "1987";
	  String lang = "Telugu"; 
	  String country = "India";
	  String mobile = "9004562616";
	  String email = "shankar@gmail.com";
	  String pass = "shankar@1234"; 
	  String location = "sion mumbai";
	  String status = "Widowed";
	  String child = "2";
	  String complexity = "Fair";
	  String height = "5 ft 5 inch";
	  
	  new Select(driver.findElement(By.xpath("//select[@id='register-gender']"))).selectByVisibleText(gender);
	  driver.findElement(By.xpath("//input[@id='reg-fname']")).sendKeys(fname);
	  driver.findElement(By.xpath("//input[@id='reg-lname']")).sendKeys(lname);
	  new Select(driver.findElement(By.xpath("//select[@id='cp-religion']"))).selectByVisibleText(religion);
	  driver.findElement(By.xpath("//input[@id='filter-caste']")).sendKeys(cast);
//	  Thread.sleep(1000);
	  a.moveToElement(driver.findElement(By.xpath("//li[@id='casteId_606']"))).click().perform();
	  driver.findElement(By.xpath("//button[@id='tmc-dob-btn']")).click();
	  new Select(driver.findElement(By.xpath("//select[@id='reg-dob-day']"))).selectByVisibleText(date);
	  new Select(driver.findElement(By.xpath("//select[@id='reg-dob-month']"))).selectByVisibleText(month);
	  new Select(driver.findElement(By.xpath("//select[@id='reg-dob-year']"))).selectByVisibleText(year);
	  driver.findElement(By.xpath("//button[@id='set-dob-btn']")).click();
	  
	  driver.findElement(By.xpath("//input[@id='filter-lang']")).sendKeys(lang);
	  a.moveToElement(driver.findElement(By.xpath("//label[normalize-space()='Telugu']"))).click().perform();
	  new Select(driver.findElement(By.xpath("//select[@id='reg-mobile-ctry']"))).selectByVisibleText(country);
	  driver.findElement(By.xpath("//input[@id='reg-mobile']")).sendKeys(mobile);
	  driver.findElement(By.xpath("//input[@id='reg-email']")).sendKeys(email);
	  driver.findElement(By.xpath("//input[@id='reg-password']")).sendKeys(pass);
	  new Select(driver.findElement(By.xpath("//select[@id='reg-mstatus']"))).selectByVisibleText(status);
	  new Select(driver.findElement(By.xpath("//select[@id='reg-children']"))).selectByVisibleText(child);
	  new Select(driver.findElement(By.xpath("//select[@id='reg-complexion']"))).selectByVisibleText(complexity);
	  new Select(driver.findElement(By.xpath("//select[@id='reg-height']"))).selectByVisibleText(height);
	  
	  driver.findElement(By.xpath("//input[@id='tmc-search-city']")).sendKeys(location);
//	  Thread.sleep(6000);
//	  a.sendKeys(Keys.ARROW_DOWN).click().perform();
//	  a.sendKeys(Keys.ENTER).click().perform();
	  driver.findElement(By.xpath("//input[@id='find']")).click();
	  driver.findElement(By.xpath("//input[@id='basic-info-part-1']")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@id='find']")).click();
	  driver.findElement(By.xpath("//input[@id='basic-info-part-1']")).click();
	  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");
  }

  @BeforeClass
  public void MouseHoverTest() throws InterruptedException {
	  System.out.println("Before Class");
	  a = new Actions(driver);
	  a.moveToElement(driver.findElement(By.xpath("//a[@class='sub-menu-link'][normalize-space()='Register FREE']"))).perform();
	  Thread.sleep(1000);
	  a.moveToElement(driver.findElement(By.xpath("//a[@class='sub-menu-link'][normalize-space()='Profiles eBook']"))).perform();
	  Thread.sleep(1000);
	  a.moveToElement(driver.findElement(By.xpath("//a[@class='sub-menu-link'][normalize-space()='Home']"))).perform();
	  
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class");
  }

  @BeforeTest
  public void LoginFormTest() throws InterruptedException {
	  System.out.println("Before Test");
	  driver.findElement(By.xpath("//a[@id='open-login-modal']")).click();
	  driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Shankar");
	  driver.findElement(By.xpath("//input[@id='userpassword']")).sendKeys("Shankar");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@value='Login']")).click();
	  driver.findElement(By.xpath("//span[@id='close-login-modal']")).click();
	  Thread.sleep(2000);
	  driver.navigate().refresh();
	  
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test");
  }

  @BeforeSuite
  public void Setup() {
	  System.out.println("Before Suite");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get(url);
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterSuite
  public void CloseBrowser() {
	  System.out.println("After Suite");
//	  driver.close();
  }
}