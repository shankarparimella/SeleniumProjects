package cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SauceDemoClass {
	WebDriver d = new ChromeDriver();
	String url = "https://www.saucedemo.com/";
	SauceDemoPOM p = new SauceDemoPOM(d);
	
	String username = "standard_user";
	String password = "secret_sauce";
	String firstname = "Shankar";
	String lastname = "Parimella";
	String zipcode = "412022";
	
	@Given("Open SauceDemo website")
	public void open_sauce_demo_website() throws InterruptedException {
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		d.get(url);
		Thread.sleep(2000);
	}

	@When("Enter SauceDemo credentials")
	public void enter_SauceDemo_credentials() throws InterruptedException {
		p.username.sendKeys(username);
		p.password.sendKeys(password);
		Thread.sleep(2000);
	}

	@And("Submit SauceDemo credentials")
	public void submit_SauceDemo_credentials() {
		p.loginbtn.click();
	}

	@When("Add all products into Cart")
	public void add_all_products_into_cart() throws InterruptedException {
		p.product1.click();
		p.product2.click();
		p.product3.click();
		p.product4.click();
		p.product5.click();
		p.product6.click();
		Thread.sleep(2000);
	}

	@And("Check products added in the Cart")
	public void check_products_added_in_the_cart() throws InterruptedException {
		p.cart.click();
		Thread.sleep(2000);
	}

	@When("Click on Checout")
	public void click_on_checout() throws InterruptedException {
		p.checkoutbtn.click();
		Thread.sleep(2000);
	}

	@And("Enter user details")
	public void enter_user_details() throws InterruptedException {
		p.firstname.sendKeys(firstname);
		p.lastname.sendKeys(lastname);
		p.zipcode.sendKeys(zipcode);
		Thread.sleep(2000);
	}

	@When("Click on Continue")
	public void click_on_continue() throws InterruptedException {
		p.continuebtn.click();
		Thread.sleep(2000);
	}

	@And("Click on Finish")
	public void click_on_finish() throws InterruptedException {
		p.finishbtn.click();
		Thread.sleep(2000);
	}

	@Then("Click on Back Home")
	public void click_on_back_home() throws InterruptedException {
		p.backhomebtn.click();
		Thread.sleep(2000);
	}
}