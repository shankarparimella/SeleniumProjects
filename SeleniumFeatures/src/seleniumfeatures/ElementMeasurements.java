package seleniumfeatures;


import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementMeasurements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d = new ChromeDriver();
		d.get("https://biodataking.com/");
		d.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement login = d.findElement(By.xpath("//a[@id='open-login-modal']"));
		Point p;
		p = login.getLocation();
		
		int xcord = p.getX();
		int ycord = p.getY();
		
		System.out.println("X-coordinates - "+xcord);
		System.out.println("Y-coordinates - "+ycord);
		
		int height = login.getSize().height;
		int width = login.getSize().width;

		System.out.println("Height - "+height);
		System.out.println("Width - "+width);
	}
}