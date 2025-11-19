package seleniumfeatures;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumFeaturesPractise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		try {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://the-internet.herokuapp.com/upload");
		String herotab = d.getWindowHandle();
		Thread.sleep(2000); 
		
		d.switchTo().newWindow(WindowType.TAB);
		d.navigate().to("https://www.google.com/");
		Thread.sleep(1000);
		String gmailtab = d.getWindowHandle();
//		Actions a = new Actions(d);
		
		WebElement newaccount = d.findElement(By.xpath("//a[contains(@aria-label,'Gmail')]"));
		newaccount.click();
		
		d.switchTo().newWindow(WindowType.TAB);
		d.navigate().to("https://www.facebook.com/");
		String facebooktab = d.getWindowHandle();
		Thread.sleep(1000);

		d.switchTo().window(gmailtab);
		Thread.sleep(1000);

		d.switchTo().window(facebooktab);
		Thread.sleep(1000);
		
		d.switchTo().window(herotab);
		Thread.sleep(1000);
		
//		WebElement upload = d.findElement(By.xpath("//input[@id='file-submit']"));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}