package excelreadwritepackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class May32025 {
	WebDriver d;
	String url = "https://www.saucedemo.com/", newurl="", userid;
	
	@Given("Open swaglab website")
	public void open_swaglab_website() throws InterruptedException {
	d = new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
	d.get(url);
	Thread.sleep(2000);
	}

	@When("^Enter swaglab credentials(.*)and(.*)$")
	public void enter_swaglab_credentials(String Username, String Password) throws InterruptedException {
		userid = Username;
		d.findElement(By.xpath("//input[@id='user-name']")).sendKeys(Username);
		d.findElement(By.xpath("//input[@id='password']")).sendKeys(Password);
		Thread.sleep(1000);
		d.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(1000);
	}

	@And("Validate swaglab credentials")
	public void validate_swaglab_credentials() {
		newurl = d.getCurrentUrl();
		if(newurl.equals(url)) {
			System.out.println(userid+" - Login Failed");
		}else {
			System.out.println(userid+" - Login Successful");
		}
	}

	@Then("Show the result")
	public void show_the_result() {
//		d.navigate().refresh();
	}
}