package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookSignuppage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d = new ChromeDriver();
		d.get("https://www.facebook.com/");
		Thread.sleep(2000);

		WebElement createacc = d.findElement(By.linkText("Create new account"));
		createacc.click();
		Thread.sleep(2000);

		WebElement firstname = d.findElement(By.name("firstname"));
		firstname.sendKeys("Shankar");
		
		WebElement surname = d.findElement(By.name("lastname"));
		surname.sendKeys("Parimella");
		
		WebElement mobile = d.findElement(By.name("reg_email__"));
		mobile.sendKeys("9004562616");

		WebElement newpassword = d.findElement(By.name("reg_passwd__"));
		newpassword.sendKeys("123");
		
		//XPath syntax :- //tagname[@attribute='attribute_value']
		WebElement female = d.findElement(By.xpath("//input[@value='1']"));
		female.click();
		Thread.sleep(1000);

		WebElement male = d.findElement(By.xpath("//input[@value='2']"));
		male.click();
		Thread.sleep(1000);

		WebElement custom = d.findElement(By.xpath("//input[@value='-1']"));
		custom.click();
	}
}