package seleniumfeatures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabNavigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
 		d.get("https://biodataking.com/");
		Thread.sleep(2000);
		String parenttab = d.getWindowHandle();
		
		d.switchTo().newWindow(WindowType.TAB);		
		d.navigate().to("https://www.canva.com/");
		Thread.sleep(1000);
		String canvas = d.getWindowHandle();
		
		d.switchTo().newWindow(WindowType.TAB);
		d.navigate().to("https://www.flipkart.com/");
		Thread.sleep(1000);
		String flipkart = d.getWindowHandle();
//		d.get("https://www.canva.com/");
		
		d.switchTo().window(parenttab);
		Thread.sleep(1000);
		d.switchTo().window(flipkart);
		Thread.sleep(1000);
		d.switchTo().window(canvas);

	}
}