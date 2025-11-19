package seleniumfeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdownlist {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://biodataking.com/");
		Thread.sleep(2000);
		Actions ac = new Actions(d);
		
		WebElement gender = d.findElement(By.xpath("//select[@id='register-gender']"));
		Select s1 = new Select(gender);
		s1.selectByVisibleText("Male");
		Thread.sleep(1000);
		
		WebElement fname = d.findElement(By.xpath("//input[@id='reg-fname']"));
		fname.sendKeys("Shankar");
		Thread.sleep(1000);
		
		WebElement lname = d.findElement(By.xpath("//input[@id='reg-lname']"));
		lname.sendKeys("Parimella");
		Thread.sleep(1000);

		WebElement religion = d.findElement(By.xpath("//select[@id='cp-religion']"));
		Select s2 = new Select(religion);
		s2.selectByVisibleText("Hindu");
		Thread.sleep(1000);
		
		WebElement cast = d.findElement(By.xpath("//input[@id='filter-caste']"));
		cast.sendKeys("Padmashali");
		Thread.sleep(1000);
		
		WebElement castlist = d.findElement(By.xpath("//li[@id='casteId_606']"));
		ac.moveToElement(castlist).click().perform();		
		Thread.sleep(1000);

		WebElement dob = d.findElement(By.xpath("//button[@id='tmc-dob-btn']"));
		dob.click();
		Thread.sleep(1000);
		
		WebElement date = d.findElement(By.xpath("//select[@id='reg-dob-day']"));
		Select sdate = new Select(date);
		sdate.selectByVisibleText("17");
		Thread.sleep(1000);
		
		WebElement month = d.findElement(By.xpath("//select[@id='reg-dob-month']"));
		Select smonth = new Select(month);
		smonth.selectByVisibleText("Apr");
		Thread.sleep(1000);

		WebElement year = d.findElement(By.xpath("//select[@id='reg-dob-year']"));
		Select syear = new Select(year);
		syear.selectByVisibleText("1987");
		Thread.sleep(1000);

		WebElement set = d.findElement(By.xpath("//button[@id='set-dob-btn']"));
		set.click();
		Thread.sleep(1000);
		
		WebElement lang = d.findElement(By.xpath("//input[@id='filter-lang']"));
		lang.sendKeys("Telugu");
		Thread.sleep(1000);
		
		WebElement langlist = d.findElement(By.xpath("//li[@id='langId_53']"));
		ac.moveToElement(langlist).click().perform();		
		Thread.sleep(1000);

		WebElement mobile = d.findElement(By.xpath("//input[@id='reg-mobile']"));
		mobile.sendKeys("9004562616");
		Thread.sleep(1000);

		WebElement email = d.findElement(By.xpath("//input[@id='reg-email']"));
		email.sendKeys("shankar@gmail.com");
		Thread.sleep(1000);

		WebElement pass = d.findElement(By.xpath("//input[@id='reg-password']"));
		pass.sendKeys("shankar@1234");
		Thread.sleep(1000);

		WebElement mstatus = d.findElement(By.xpath("//select[@id='reg-mstatus']"));
		Select smstatus = new Select(mstatus);
		smstatus.selectByVisibleText("Divorced");
		Thread.sleep(1000);
		
		WebElement children = d.findElement(By.xpath("//select[@id='reg-children']"));
		Select schildren = new Select(children);
		schildren.selectByVisibleText("2");
		Thread.sleep(1000);

		WebElement complexion = d.findElement(By.xpath("//select[@id='reg-complexion']"));
		Select scomplexion = new Select(complexion);
		scomplexion.selectByVisibleText("Fair");
		Thread.sleep(1000);
		
		WebElement height = d.findElement(By.xpath("//select[@id='reg-height']"));
		Select sheight = new Select(height);
		sheight.selectByVisibleText("5 ft 5 inch");
		Thread.sleep(1000);
		
		WebElement city = d.findElement(By.xpath("//input[@id='tmc-search-city']"));
		city.sendKeys("Thane-Dombivli");
		Thread.sleep(6000);
		
		WebElement find = d.findElement(By.xpath("//input[@id='find']"));
		find.click();
		Thread.sleep(1000);

		WebElement registerbtn = d.findElement(By.xpath("//input[@id='basic-info-part-1']"));
		registerbtn.click();
	}
}