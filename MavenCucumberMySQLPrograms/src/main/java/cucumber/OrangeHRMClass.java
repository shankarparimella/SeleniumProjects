package cucumber;

import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRMClass {
	WebDriver d;
	OrangeHRMPOM1 p;
	String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	String username = "Admin";
	String password = "admin123";
	String firstname = "Shankar";
	String lastname = "Parimella";
	String middlename = "Chandrakala";
	String leavetype = "CAN - Personal";
	String fromdate = "2025-04-01";
	String todate = "2025-04-05";
	String comment = "Personal Leaves";

	@Given("Open OrangeHRM1 website") 
	public void open_orange_hrm1_website() throws InterruptedException {
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
		d.get(url);
		Thread.sleep(2000);
	}

	@When("Enter OrangeHRM1 credentials")
	public void enter_orange_hrm1_credentials() {
		p = new OrangeHRMPOM1(d);
		p.username.sendKeys(username);
		p.password.sendKeys(password);
//		d.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
//		d.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
	}

	@And("Submit OrangeHRM1 credentials")
	public void submit_orange_hrm1_credentials() throws InterruptedException {
		p = new OrangeHRMPOM1(d);
		p.loginbtn.click();
		Thread.sleep(1000);
	}

	@Then("User navigated to OrangeHRM1 website")
	public void user_navigated_to_orange_hrm1_website() {
		System.out.println("User navigated to Homepage");
	}

	@When("Open PIM module")
	public void open_pim_module() {
		p = new OrangeHRMPOM1(d);
		p.pimtab.click();
	}

	@And("Click on Add PIM button")
	public void click_on_add_pim_button() throws InterruptedException {
		p = new OrangeHRMPOM1(d);
		p.addpimbtn.click();
		Thread.sleep(1000);
	}

	@When("Enter Employee details")
	public void enter_employee_details() {
		p = new OrangeHRMPOM1(d);
		p.firstname.sendKeys(firstname);
		p.middlename.sendKeys(middlename);
		p.lastname.sendKeys(lastname);
	}

	@And("Select Profile picture")
	public void select_profile_picture() {
		p = new OrangeHRMPOM1(d);
		File f = new File("D:\\@ Selenium\\cartoon3.jpg");
		WebElement profilepic = d.findElement(By.cssSelector("input[type='file']"));
		profilepic.sendKeys(f.getAbsolutePath());
	}

	@Then("Submit Employee details")
	public void submit_employee_details() throws InterruptedException {
		p = new OrangeHRMPOM1(d);
//		p.savebtn.click();
		Thread.sleep(1000);
		p.pimtab.click();
		Thread.sleep(1000);
		p.SearchEmployee.sendKeys(lastname);
		p.Searchbtn.click();
		Thread.sleep(1000);
	}

	@When("Open Leave module")
	public void open_leave_module() {
		p = new OrangeHRMPOM1(d);
		p.leavetab.click();
	}

	@And("Click on Assigne Leave button")
	public void click_on_assigne_leave_button() {
		p = new OrangeHRMPOM1(d);
		p.assignleavebtn.click();
	}

	@When("Enter Leave details")
	public void enter_leave_details() throws InterruptedException {
		p = new OrangeHRMPOM1(d);
		Actions a = new Actions(d);
 		WebElement empname = p.employeename;
		Action ac = a.sendKeys(empname, lastname).pause(Duration.ofSeconds(5)).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build();
		ac.perform();
	}

	@And("Select from and to dates")
	public void select_from_and_to_dates() {
		p = new OrangeHRMPOM1(d);
//		new Select(p.leavetype).selectByVisibleText(leavetype);
		p.fromdate.sendKeys(fromdate);
		p.todate.sendKeys(todate);
		p.comment.sendKeys(comment);
	}

	@Then("Submit Leave details")
	public void submit_leave_details() {
		p = new OrangeHRMPOM1(d);
//		p.assignbtn.click();
	}
}