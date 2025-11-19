package seleniumpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlaze {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.demoblaze.com/");
		Thread.sleep(2000);
		String id="abc";

		WebElement signuplink = d.findElement(By.xpath("//a[@id='signin2']"));
		signuplink.click();
		Thread.sleep(1000);
	
		WebElement susername = d.findElement(By.xpath("//input[@id='sign-username']"));
		susername.sendKeys(id);
		WebElement spassword = d.findElement(By.xpath("//input[@id='sign-password']"));
		spassword.sendKeys(id);
		Thread.sleep(1000);
		WebElement signupbtn = d.findElement(By.xpath("//button[contains(.,'Sign up')]"));
		signupbtn.click();
		Thread.sleep(2000);
		
		Alert al1 = d.switchTo().alert();
		al1.accept();
		Thread.sleep(1000);

		WebElement sclose = d.findElement(By.xpath("(//button[contains(.,'Close')])[2]"));
		sclose.click();
		Thread.sleep(1000);
		
		WebElement loginlink = d.findElement(By.xpath("//a[@id='login2']"));
		loginlink.click();
		Thread.sleep(1000);
	
		WebElement lusername = d.findElement(By.xpath("//input[@id='loginusername']"));
		lusername.sendKeys(id);
		WebElement lpassword = d.findElement(By.xpath("//input[@id='loginpassword']"));
		lpassword.sendKeys(id);
		Thread.sleep(1000);
		WebElement loginbtn = d.findElement(By.xpath("//button[contains(.,'Log in')]"));
		loginbtn.click();
		Thread.sleep(2000);
		
		Alert al2 = d.switchTo().alert();
		al2.accept();
		Thread.sleep(1000);

		WebElement lclose = d.findElement(By.xpath("(//button[@type='button'][contains(.,'Close')])[3]"));
		lclose.click();

	}
}