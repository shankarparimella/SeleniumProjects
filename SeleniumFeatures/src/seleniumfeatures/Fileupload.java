package seleniumfeatures;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://the-internet.herokuapp.com/upload"); 
		Thread.sleep(2000);

		File f = new File("D:\\System Information File.nfo");
		WebElement browse = d.findElement(By.xpath("//input[@id='file-upload']"));
		browse.sendKeys(f.getAbsolutePath());
		Thread.sleep(2000);
		
		WebElement upload = d.findElement(By.xpath("//input[@id='file-submit']"));
		upload.click();
	}
}