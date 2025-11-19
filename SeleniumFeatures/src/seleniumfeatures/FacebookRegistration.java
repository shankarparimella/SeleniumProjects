package seleniumfeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver d = new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.manage().window().maximize();
		Thread.sleep(2000);
		Actions ac = new Actions(d);
		
		WebElement cna = d.findElement(By.linkText("Create new account"));
//		cna.click();
//		ac.contextClick(cna).perform();
		Thread.sleep(1000);
//		WebElement nw = d.findElement(By.linkText("Open link in new tab"));
//		nw.click();
		ac.contextClick(cna).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
//		ac.sendKeys(Keys.ARROW_DOWN).build().perform();
//		ac.sendKeys(Keys.ENTER).build().perform();

		
	}
}