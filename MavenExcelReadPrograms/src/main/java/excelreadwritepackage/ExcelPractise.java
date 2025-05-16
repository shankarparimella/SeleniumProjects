package excelreadwritepackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExcelPractise {
	WebDriver d;
	String url = "https://app.bugbug.io/sign-up/", newurl;

@Given("Open BugBug website")
public void open_bug_bug_website() throws InterruptedException {
	d = new ChromeDriver();
	d.manage().window().maximize();;
	d.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
	d.get(url);
	Thread.sleep(2000);
}

@When("^Enter BugBug website login credentials (.*) and (.*)$")
public void enter_bug_bug_website_login_credentials(String Emailp, String passp) throws InterruptedException {
	d.findElement(By.xpath("//input[@name='email']")).sendKeys(Emailp);
	d.findElement(By.xpath("//input[@name='password1']")).sendKeys(passp);
	Thread.sleep(2000);
	d.findElement(By.xpath("(//div[contains(.,'Create account')])[10]")).click();
	Thread.sleep(2000);
	
}

@And("Validate the BugBug website login")
public void validate_the_bug_bug_website_login() {
	newurl = d.getCurrentUrl();
	if(newurl.endsWith(url)) {
		System.out.println("Login Failed");
	}else {
		System.out.println("Login Passed");
	}
}

@Then("Update the validation status")
public void update_the_validation_status() {
	System.out.println("Validation of given credentials is completed....!");
}
}