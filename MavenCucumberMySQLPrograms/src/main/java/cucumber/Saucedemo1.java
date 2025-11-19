package cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Saucedemo1 {
	WebDriver d = new ChromeDriver();
	String url = "https://www.saucedemo.com/";
	String newurl = "https://www.saucedemo.com/";
	
	@Given("Open Saucedemo1 website")
	public void open_saucedemo1_website() throws InterruptedException {
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
		d.get(url);
		Thread.sleep(2000);
	}

	@When("^Enter Saucedemo1 credentials (.*) (.*)$")
	public void enter_saucedemo1_credentials_username_password(String username, String password) throws InterruptedException {
		d.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
		d.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		Thread.sleep(2000);		
		System.out.print(username+" - ");
	}

	@And("Submit Saucedemo1 credentials")
	public void submit_saucedemo1_credentials() throws InterruptedException {
		d.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(2000);		
	}

	@Then("Check is login successful")
	public void check_is_login_successful() {
		newurl = d.getCurrentUrl();
		if(newurl.equals(url)){
			System.out.println("Login is Failed");
		}else {
			System.out.println("Login is successful");
		}
	}
}