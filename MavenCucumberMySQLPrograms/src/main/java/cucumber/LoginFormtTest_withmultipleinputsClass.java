package cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFormtTest_withmultipleinputsClass {
	WebDriver d;
	String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

	@Given("Will open Orange HRM login page")
	public void will_open_orange_hrm_login_page() throws InterruptedException {
		d = new ChromeDriver();
	    d.manage().window().maximize();
	    d.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
	    d.get(url);
	    Thread.sleep(2000);
	}

	@When("^Will enter (.*) and (.*)$")
	public void will_enter_username_and_password(String username, String password) throws InterruptedException {
		d.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
		d.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
	    Thread.sleep(2000);
		
	}

	@And("Will submit credentials")
	public void will_submit_credentials() throws InterruptedException {
	    d.findElement(By.xpath("//button[@type='submit']")).click();
	    Thread.sleep(2000);

	}

	@Then("Will display home page")
	public void will_display_home_page() {
		System.out.println("Home page is displayed");
	}

}