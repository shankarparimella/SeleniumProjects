package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		try {
		WebDriver d = new ChromeDriver();
		d.get("https://mv-i.github.io/me/projects/login/dummy.html");
		Thread.sleep(2000);
		String url = d.getCurrentUrl();
		String newurl = d.getCurrentUrl();
		
		String username[] = new String[]{"Shankar","Parimella","Jyothi","Girish","Mitesh"};
		String password[] = new String[]{"Shankar@123","Parimella@123","Jyothi@123","Girish@123","Mitesh@123"};
		
 		for(int i=0; i<username.length; i++) {
		WebElement email = d.findElement(By.xpath("//input[@id='loginUsernameEmail']"));
		email.sendKeys(username[i]);
		
		WebElement pass = d.findElement(By.xpath("//input[@id='loginPassword']"));
		pass.sendKeys(password[i]);
		//button[@id='u_0_5_xP']
		
		Thread.sleep(2000);
		WebElement signin = d.findElement(By.className("form__button"));
		signin.click();
		
		newurl = d.getCurrentUrl();
		
		if(newurl.equals(url)){
			System.out.println(username[i]+" - Login Failed");
			d.navigate().refresh();
		}
		else {
			System.out.println(username[i]+" - Login Successful");
			Thread.sleep(2000);
			WebElement signout = d.findElement(By.linkText(" Sign Out "));
			signin.click();			
			Thread.sleep(2000);
		}
		}}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}