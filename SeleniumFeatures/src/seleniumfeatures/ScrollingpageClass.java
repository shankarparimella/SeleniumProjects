package seleniumfeatures;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingpageClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://biodataking.com/");
		Thread.sleep(2000);
		
		Actions a = new Actions(d);
		for(int i=1; i<=20; i++)
		{
			a.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(100);
		}

	}
}