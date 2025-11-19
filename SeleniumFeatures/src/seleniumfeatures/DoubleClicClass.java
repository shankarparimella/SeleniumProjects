package seleniumfeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClicClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.canva.com/en_in/");
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		WebElement tile = driver.findElement(By.xpath("//div[@aria-label='Docs']"));
		action.moveToElement(tile).perform();
		Thread.sleep(1000);
//		action.moveByOffset(10000, 10000).perform();
		action.scrollByAmount(0, 2000).perform();

		
	}
}