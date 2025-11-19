package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumClass1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver d = new ChromeDriver();
		d.get("https://www.saucedemo.com/");
//		d.manage().window().maximize();
		Thread.sleep(2000);
		String url = d.getCurrentUrl();
		System.out.println("Website URL is - "+url);
		String t = d.getTitle();
//		System.out.println("Page Title is - "+t);

		WebElement username = d.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		
		WebElement password = d.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		
		Thread.sleep(1000);
		WebElement login = d.findElement(By.id("login-button"));
		login.click();

		Thread.sleep(1000);
		t = d.getTitle();
		if(t.equals("Swag Labs")){
		System.out.println("Using credentials \nLogin is Successfull....!");
		}
		else {
			System.out.println("Using credentials \\nLogin is Failed....!");
		}
		
	}
}