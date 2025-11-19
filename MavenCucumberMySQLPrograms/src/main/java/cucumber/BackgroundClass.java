package cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundClass {
	WebDriver d;
	String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

@Given("Open OrangeHRM login page")
public void open_OrangeHRM_login_page() throws Exception {
	d = new ChromeDriver();
	d.get(url);
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
	Thread.sleep(2000);
}

@When("Enter OrangeHRM credentials")
public void enter_OrangeHRM_credentials() throws Exception {
	d.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	d.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	Thread.sleep(2000);
}

@And("Click on OrangeHRM login button")
public void click_on_OrangeHRM_login_button() throws Exception {
	d.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(2000);
}

@Then("Navigated to Home page")
public void navigated_to_home_page() {
	System.out.println("Home page is diplayed");
}

@When("Click on Welcome link")
public void click_on_welcome_link() throws Exception {
	d.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
	Thread.sleep(2000);
}

@Then("Click on logout button")
public void click_on_logout_button() throws Exception {
	WebElement logout = d.findElement(By.xpath("//a[normalize-space()='Logout']"));
	
	if(logout.isDisplayed()) {
		System.out.println("Logout button is displayed");
		logout.click();
	}else {
		System.out.println("Logout button is not displayed");
	}
	Thread.sleep(2000);
}

@When("Click on Dashboard link")
public void click_on_dashboard_link() {
	d.findElement(By.xpath("(//span[contains(.,'Dashboard')])[1]")).click();
	
}

@Then("Verify quicklaunch toolbar")
public void verify_quicklaunch_toolbar() throws Exception {
	WebElement quicklaunch = d.findElement(By.xpath("//p[contains(.,'Quick Launch')]"));
	
	if(quicklaunch.isDisplayed()) {
		System.out.println("Quicklaunch section is displayed");
	}else {
		System.out.println("Quicklaunch section is not displayed");
	}
	Thread.sleep(2000);
}	
}