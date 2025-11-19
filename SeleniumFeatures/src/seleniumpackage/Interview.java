package seleniumpackage;

import java.awt.Desktop.Action;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Interview {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
/*		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		d.get("https://biodataking.com/signup");
		
		WebElement register = d.findElement(By.xpath("//a[@class='sub-menu-link'][normalize-space()='Register FREE']"));
		register.click();
		Thread.sleep(1000);
		WebElement religion = d.findElement(By.xpath("//select[@id='cp-religion']"));
//		jain.click();
//		Thread.sleep(1000);
		Select s = new Select(religion);
		s.selectByVisibleText("Jain");
		
		WebElement subr = d.findElement(By.xpath("//select[@id='cp-caste']"));
		Select s1 = new Select(subr);
		s1.selectByVisibleText("Gujarati Jain");
		
//		new Select(more).selectByVisibleText("Linux");
		Thread.sleep(3000);
----------------------------------------------------------------------------------------------------------------------------
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		d.get("https://biodataking.com/");
		Thread.sleep(2000);
		
		Actions a = new Actions(d);
		a.moveToElement(d.findElement(By.xpath("//a[@id='open-login-modal']"))).perform();
		Thread.sleep(1000);
		
		a.moveToElement(d.findElement(By.xpath("//a[@class='sub-menu-link'][normalize-space()='Register FREE']"))).perform();
		Thread.sleep(1000);
		
		a.moveToElement(d.findElement(By.xpath("//a[@class='sub-menu-link'][normalize-space()='Profiles eBook']"))).perform();
		Thread.sleep(1000);
		
		d.findElement(By.xpath("//a[@class='sub-menu-link'][normalize-space()='Register FREE']")).click();

		WebElement religion = d.findElement(By.xpath("//select[@id='cp-religion']"));
		Select s = new Select(religion);
		s.selectByIndex(2);
		
		Thread.sleep(1000);
		WebElement cast = d.findElement(By.xpath("//select[@id='cp-caste']"));
		Select ss = new Select(cast);
		ss.selectByVisibleText("Jain");

		Thread.sleep(2000);
		d.close();
		----------------------------------------------------------------------------------------------------------------------------
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		String url = "https://www.shine.com/registration/";
		d.get(url);
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");;
		d.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");;
		d.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		d.findElement(By.xpath("(//span[contains(.,'PIM')])[1]")).click();
		Thread.sleep(1000);
		
//		d.findElement(By.xpath("//button[normalize-space()='Add']")).click();
		File image = new File("D:\\@ Selenium\\shankarparimellacoverletter.docx");
		d.findElement(By.xpath("//input[@type='file']")).sendKeys(image.getAbsolutePath());
		
---------------------------------------------------------------------------------------------------------------------------------------		
//Find the output of below code

int a = 0, b = 1;
for(int i=0; i<5; i++) {
	System.out.println(a +" ");
	int next = a+b;
	a = b;
	b = next;
---------------------------------------------------------------------------------------------------------------------------------------		

// Find the duplicate records in below sentence.
		
		String s = "bluebirds are songbirds named for the males bright blue featherss";
		char c, d;
		int count=0;
		
		for(int i=0; i<s.length(); i++) {
			c = s.charAt(i);
			for(int j=1; j<s.length(); j++) {
				d = s.charAt(j);
				if(c==d) {
					count = count+1;
				}
			}
			System.out.println(c+" occured "+ count + " times");
			count=0;
		}
---------------------------------------------------------------------------------------------------------------------------------------		
*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}