package cucumber;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AnthologyClass {
	
	WebDriver d = new ChromeDriver();
	String url = "https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php";
	AnthologyPOM p = new AnthologyPOM(d);
	
	String fname = "Shankar";
	String email = "shankar@gmail.com";
	String mobile = "9876543210";
	String dob = "17-04-1987";
	String subject = "Automation Tester";
	String address = "Dombivli";
	String state = "Haryana";
	String city = "Agra";
	
	@Given("Open Anthology website")
	public void open_anthology_website() throws InterruptedException {
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		d.get(url);
		Thread.sleep(2000);
	}

	@When("Click on Contact Us")
	public void click_on_contact_us() {
		p.firstname.sendKeys(fname);
	}

	@And("Open Sales Enquiry form")
	public void open_sales_enquiry_form() throws InterruptedException {
		p.email.sendKeys(email);
	}

	@When("Enter first name and last name")
	public void enter_first_name_and_last_name() {
		p.gender.click();
	}

	@And("Enter email address")
	public void enter_email_address() {
		p.mobile.sendKeys(mobile);
	}

	@When("Enter business phone")
	public void enter_business_phone() {
		p.dob.sendKeys(dob);
	}

	@And("Enter title and role")
	public void enter_title_and_role() {
		p.subject.sendKeys(subject);
	}

	@When("Enter industry")
	public void enter_industry() {
		p.hobby1.click();
		p.hobby2.click();
		p.hobby3.click();
	}

	@And("Enter country")
	public void enter_country() {
		File f = new File("F:\\Z Images\\3-D Wallpapers\\CARTOONS\\cartoon3.jpg");
		p.picture.sendKeys(f.getAbsolutePath());
	}

	@When("Enter industry description")
	public void enter_industry_description() {
		p.address.sendKeys(address);
	}

	@And("Enter interest")
	public void enter_interest() {
		new Select(p.state).selectByVisibleText(state);
	}

	@When("Enter help")
	public void enter_help() {
		new Select(p.city).selectByVisibleText(city);
	}

	@And("Select radio button")
	public void select_radio_button() {

	}

	@Then("Click on Contact Us button")
	public void click_on_contact_us_button() {

	}
}