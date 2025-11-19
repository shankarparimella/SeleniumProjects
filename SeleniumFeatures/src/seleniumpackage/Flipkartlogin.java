package seleniumpackage;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkartlogin {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		Scanner sc = new Scanner(System.in);
		String otp;
		
		WebElement login = d.findElement(By.xpath("//a[@href='/account/login?ret=/']"));
		login.click();
		
		WebElement entermobile = d.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']"));
		entermobile.sendKeys("9004562655");
		Thread.sleep(1000);
		
		WebElement requestotp = d.findElement(By.xpath("//button[@class='QqFHMw twnTnD _7Pd1Fp']"));
		requestotp.click();
		Thread.sleep(2000);

		System.out.println("Please enter 6 digit OTP code for verification");
		otp = sc.next();
		Thread.sleep(1000);

		WebElement enterotp1 = d.findElement(By.xpath("(//input[@maxlength='1'])[1]"));
		enterotp1.sendKeys(otp);
		Thread.sleep(1000);

		WebElement verify = d.findElement(By.xpath("//button[normalize-space()='Verify']"));
		verify.click();
		Thread.sleep(2000);
				
	}
}