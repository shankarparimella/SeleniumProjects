package seleniumpackage;

import java.util.concurrent.TimeUnit;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProposalfinderClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "https://proposalfinder.com/create-wedding-profile";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		driver.get(url);
		Select select;
		
		WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(30));
		
		select = new Select(driver.findElement(By.xpath("//select[@id='register-gender']")));
		select.selectByVisibleText("Male");
		driver.findElement(By.xpath("//input[@id='reg-fname']")).sendKeys("Rahul");
		driver.findElement(By.xpath("//input[@id='reg-lname']")).sendKeys("Roi");
		select = new Select(driver.findElement(By.xpath("//div[@class='right-wrapper']//select[@id='cp-religion']")));
		select.selectByVisibleText("Hindu");
//		select = new Select(driver.findElement(By.xpath("//div[@class='right-wrapper']//select[@id='cp-caste']")));
//		select.selectByVisibleText("");
//		select = new Select(driver.findElement(By.xpath("//button[@id='tmc-dob-btn']")));
//		select.selectByVisibleText("");

		driver.findElement(By.xpath("//input[@id='filter-lang']")).sendKeys("Telugu");
		driver.findElement(By.xpath("//input[@id='reg-mobile']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[@id='reg-email']")).sendKeys("rahul@gmail.com");
		driver.findElement(By.xpath("//input[@id='reg-password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@id='tmc-search-city']")).sendKeys("Mumbai");
				
		select = new Select(driver.findElement(By.xpath("//select[@id='reg-mstatus']")));
		select.selectByVisibleText("Divorced");
		select = new Select(driver.findElement(By.xpath("//select[@id='reg-children']")));
		select.selectByVisibleText("2");
		select = new Select(driver.findElement(By.xpath("//select[@id='reg-complexion']")));
		select.selectByVisibleText("Fair");
		select = new Select(driver.findElement(By.xpath("//select[@id='reg-height']")));
		select.selectByVisibleText("5 ft 5 inch");
	}
}