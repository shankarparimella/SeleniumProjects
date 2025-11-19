package seleniumfeatures;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DisabledFieldEnabled {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		d.get("https://proposalfinder.com/create-wedding-profile");
		Thread.sleep(2000);
		
		d.findElement(By.xpath("(//input[@value='Edit'])[1]")).click();
		Thread.sleep(2000);
		
		JavascriptExecutor j = (JavascriptExecutor)d;
		
		WebElement gender = d.findElement(By.xpath("//select[@id='cp-gender']"));
		j.executeScript("arguments[0].removeAttribute('disabled')", gender);
		
		Select s1 = new Select(gender);
		s1.selectByVisibleText("Male");
		
		WebElement relegion = d.findElement(By.xpath("(//select[@id='cp-religion'])[1]"));
		j.executeScript("arguments[0].removeAttribute('disabled')", relegion);
		Thread.sleep(1000);
		
		Select s2 = new Select(relegion);
		s2.selectByVisibleText("Hindu");
		
		WebElement cast = d.findElement(By.xpath("(//select[@id='cp-caste'])[1]"));
		j.executeScript("arguments[0].removeAttribute('disabled')", cast);
		Thread.sleep(1000);
		
		Select s3 = new Select(cast);
		s3.selectByVisibleText("Agri");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}