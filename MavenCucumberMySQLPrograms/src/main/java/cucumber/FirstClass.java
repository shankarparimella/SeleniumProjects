package cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstClass {
	WebDriver d = new ChromeDriver();
	String url = "https://biodataking.com/";
	
	@Given("Open Home page")
	public void open_home_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		d.get(url);
		Thread.sleep(2000);
	 }

	@When("Open Login Window")
	public void open_login_window() {
	    // Write code here that turns the phrase above into concrete actions
		d.findElement(By.xpath("//a[@id='open-login-modal']")).click();
	}

	@And("Enter credentials")
	public void enter_credentials() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		d.findElement(By.xpath("//input[@id='username']")).sendKeys("shankar@gmail.com");
		d.findElement(By.xpath("//input[@id='userpassword']")).sendKeys("shankar@123");
		Thread.sleep(2000);
	}

	@Then("Click on Submit button")
	public void click_on_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
		d.findElement(By.xpath("//input[@value='Login']")).click();
	}
}