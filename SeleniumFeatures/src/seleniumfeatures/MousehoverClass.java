package seleniumfeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
       
public class MousehoverClass {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.canva.com/en_in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
				
		String arr[] = new String[]{"//div[@aria-label='Docs']","//div[@aria-label='Whiteboards']","//div[@aria-label='Presentations']","//div[@aria-label='Social']","//div[@aria-label='Videos']","//div[@aria-label='Prints']","//div[@aria-label='Websites']","//div[@aria-label='Instagram posts']","//div[@aria-label='Brochures']","//div[@aria-label='Photo editor']"};
		Actions ac = new Actions(driver);
		
		for(int i=0; i<arr.length; i++) {
		WebElement tile = driver.findElement(By.xpath(arr[i]));
		ac.moveToElement(tile).perform();
		ac.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		if(i==7){
		WebElement arrow = driver.findElement(By.xpath("//div[@class='_8RKGUQ']//span[@class='lslDOg NA_Img dkWypw lmfTqA']//*[name()='svg']"));
		arrow.click();
		}
		}
		System.out.println("Hovered mouse pointer on all available Tiles");
	}
}