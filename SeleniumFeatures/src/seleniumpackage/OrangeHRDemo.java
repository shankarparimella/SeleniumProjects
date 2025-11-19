package seleniumpackage;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeHRDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		try {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);

		String username = "Admin";
		String password = "admin123";
		String fname = "Shankar";
		String mname = "Raghu";
		String lname = "Parimella";
		
		WebElement usernamee = d.findElement(By.xpath("//input[@placeholder='Username']"));
		usernamee.sendKeys(username);
//		Thread.sleep(1000);
		
		WebElement passworde = d.findElement(By.xpath("//input[@placeholder='Password']"));
		passworde.sendKeys(password);
//		Thread.sleep(1000);

		WebElement login = d.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		Thread.sleep(3000);
		
		WebElement pim = d.findElement(By.xpath("//span[normalize-space()='PIM']"));
		pim.click();
		Thread.sleep(1000);
		
		WebElement addpim = d.findElement(By.xpath("//button[normalize-space()='Add']"));
		addpim.click();
		Thread.sleep(2000);
		
		File f = new File("F:\\Z Images\\3-D Wallpapers\\CARTOONS\\cartoon3.jpg");
		WebElement profilepic = d.findElement(By.cssSelector("input[type=file]"));
		profilepic.sendKeys(f.getAbsolutePath());
		Thread.sleep(2000);
		
		WebElement fnamee = d.findElement(By.xpath("//input[@placeholder='First Name']"));
		fnamee.sendKeys(fname);
//		Thread.sleep(1000);

		WebElement mnamee = d.findElement(By.xpath("//input[@placeholder='Middle Name']"));
		mnamee.sendKeys(mname);
//		Thread.sleep(1000);

		WebElement lnamee = d.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lnamee.sendKeys(lname);
//		Thread.sleep(1000);

		WebElement radio = d.findElement(By.xpath("//span[@class='oxd-switch-input oxd-switch-input--active --label-right']"));
		radio.click();
		Thread.sleep(1000);
		
		WebElement newusername = d.findElement(By.xpath("(//input[contains(@class,'oxd-input oxd-input--active')])[6]"));
		newusername.sendKeys(fname+"."+lname);
		Thread.sleep(1000);
		
		WebElement newpassword = d.findElement(By.xpath("(//input[@type='password'])[1]"));
		newpassword.sendKeys(lname+"@123");
		Thread.sleep(1000);
		
		WebElement newconfirmpassword = d.findElement(By.xpath("(//input[@type='password'])[2]"));
		newconfirmpassword.sendKeys(lname+"@123");
		Thread.sleep(1000);
		
		WebElement save = d.findElement(By.xpath("//button[@type='submit']"));
		save.click();
		Thread.sleep(2000);
		
		WebElement pim2 = d.findElement(By.xpath("//span[normalize-space()='PIM']"));
		pim2.click();
		Thread.sleep(1000);
		
		WebElement searchname = d.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[1]"));
		searchname.sendKeys(lname);
		Thread.sleep(1000);
		
		WebElement search = d.findElement(By.xpath("//button[@type='submit']"));
		search.click();		
		Thread.sleep(1000);
		
		}
	catch(Exception e) {
		System.out.println(e.getMessage());
		}
	}
}
