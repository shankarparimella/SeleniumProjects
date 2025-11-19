package seleniumfeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d = new ChromeDriver();
		d.get("https://only-testing-blog.blogspot.com/2014/09/drag-and-drop.html");
		d.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement drag = d.findElement(By.xpath("//p[normalize-space()='Drag me to my target']"));
		WebElement drop = d.findElement(By.xpath("//div[@id='dropdiv']"));
		
		Actions a = new Actions(d);
		a.dragAndDrop(drag, drop).build().perform();
	}
}