package cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BiodatakingClass {
	WebDriver d;
	BiodatakingPOM p;
	String url = "https://biodataking.com/";
	
	@Given("Open Biodataking website")
	public void open_biodataking_website() throws InterruptedException {
		try {
//	d = new FirefoxDriver();
	d = new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
	d.get(url);
	Thread.sleep(2000);
		}catch(Exception e){
			System.out.println(e.getMessage());}
	}

	@When("Enter Biodataking credentials")
	public void enter_biodataking_credentials() throws InterruptedException {
		p = new BiodatakingPOM(d);
		
		p.logintab.click();
		p.email.sendKeys("Shankar");
		p.password.sendKeys("Shankar@123");
		Thread.sleep(2000);
	}

	@And("Click on Biodataking login button")
	public void click_on_biodataking_login_button() {
		p.loginbtn.click();
	}
	
	@Then("Check is Biodataking login successful")
	public void check_is_biodataking_login_successful() {
		System.out.println("Login is not successful");
	}
}	