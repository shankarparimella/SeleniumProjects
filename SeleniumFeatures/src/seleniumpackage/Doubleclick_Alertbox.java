package seleniumpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick_Alertbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
/*		d.get("https://only-testing-blog.blogspot.com/2014/09/selectable.html");
		Thread.sleep(2000);
		Actions a = new Actions(d);

		WebElement btn = d.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		a.doubleClick(btn).perform();
		Thread.sleep(1000);
		
		Alert al = d.switchTo().alert();
		al.accept();*/
		
		d.get("https://www.demoblaze.com/");
		Thread.sleep(2000);
		Actions a = new Actions(d);
		String id="abc";

		WebElement signuplink = d.findElement(By.xpath("//a[@id='signin2']"));
		signuplink.click();
		
		
		WebElement susername = d.findElement(By.xpath("//input[@id='sign-username']"));
		susername.sendKeys(id);
		WebElement spassword = d.findElement(By.xpath("//input[@id='sign-password']"));
		susername.sendKeys(id);
		Thread.sleep(1000);
		WebElement signupbtn = d.findElement(By.xpath("//button[contains(.,'Sign up')]"));
		signupbtn.click();
		
		Alert al = d.switchTo().alert();
		Thread.sleep(1000);
		al.accept();

	}
}