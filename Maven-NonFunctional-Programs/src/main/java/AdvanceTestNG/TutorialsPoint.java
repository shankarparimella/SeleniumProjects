package AdvanceTestNG;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TutorialsPoint {
	WebDriver d;
	String url = "https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php";
	TutorialsPointPOM p;
	
	@Test (priority =1)
	public void setup() {
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.get(url);
		d.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		}
	
	@Test (priority = 2)
	public void LoginFormTest() throws InterruptedException {
		String emailid = "shankar@gmail.com";
		String pass = "shankar@123";
		
		p = new TutorialsPointPOM(d);

		p.formlink.click();
		p.logintab.click();
		p.email.sendKeys(emailid);
		p.password.sendKeys(pass);
		Thread.sleep(2000);
		p.loginbtn.click();
		}
	
	@Test (priority = 3)
	public void Registration() throws InterruptedException {
		String fname = "Shankar";
		String lname = "Parimella";
		String newusername = "shankar123";
		String newpassword = "shankar@123";
		
		p = new TutorialsPointPOM(d);
		
		p.formlink.click();
		p.registertab.click();
		p.fname.sendKeys(fname);
		p.lname.sendKeys(lname);
		p.newusername.sendKeys(newusername);
		p.newpass.sendKeys(newpassword);
		Thread.sleep(2000);
		p.registerbtn.click();
		}
	
	@Test (priority = 4)
	public void PracticeForm() {
		String name = "Shankar";
		String email = "Shankar@gmail.com";
		String mobile = "9004562616";
		String dob = "17-04-1987";
		String subject = "Maths";
		String address = "Dombivli-Thane";
		String state = "Uttar Pradesh";
		String city = "Lucknow";
		
		p = new TutorialsPointPOM(d);
		
		p.formlink.click();
		p.practiceform.click();
		p.name.sendKeys(name);
		p.email.sendKeys(email);
		p.gender.click();
		p.mobile.sendKeys(mobile);
		p.dob.sendKeys(dob);
		p.subject.sendKeys(subject);
		p.hobby1.click();
		p.hobby2.click();
		p.hobby3.click();
		
		File f = new File("F:\\Z Images\\3-D Wallpapers\\CARTOONS\\cartoon3.jpg");
		p.picture.sendKeys(f.getAbsolutePath());
		p.address.sendKeys(address);
		new Select(p.state).selectByVisibleText(state);
		new Select(p.city).selectByVisibleText(city);
		}
	
}