package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SoucedemoUsingArrays {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Soucedemo project
		try {
		WebDriver d = new ChromeDriver();
		d.get("https://www.saucedemo.com/");
		String url = d.getCurrentUrl();
		String newurl = d.getCurrentUrl();
		System.out.println("Website URL - "+newurl+"\n");
		Thread.sleep(2000);
		
		String a[] = new String[]{"standard_user","locked_out_user","problem_user","performance_glitch_user","error_user","visual_user"};
		
		for(int i=0; i<a.length; i++)
		{
		System.out.print(a[i]);
		WebElement username = d.findElement(By.id("user-name"));
		username.sendKeys(a[i]);
		
		WebElement password = d.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		
		Thread.sleep(1000);
		WebElement login = d.findElement(By.id("login-button"));
		login.click();
		
		Thread.sleep(2000);
		newurl = d.getCurrentUrl();
		if(newurl.equals(url)) {
			System.out.println(" - Login is Failed!\n");	
			d.navigate().refresh();
		}
		else {
		System.out.println(" - Login is Successfull!\n");
		WebElement menu = d.findElement(By.id("react-burger-menu-btn"));
		menu.click();

		Thread.sleep(1000);
		WebElement logout = d.findElement(By.id("logout_sidebar_link"));
		logout.click();

		Thread.sleep(2000);
		}
		}
		System.out.println("All credentials are verified....!");
		}
		catch(Exception e)		{
			System.out.println(e.getMessage());
		}
}
}