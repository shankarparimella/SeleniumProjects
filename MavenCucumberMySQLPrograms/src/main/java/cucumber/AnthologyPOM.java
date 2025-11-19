package cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AnthologyPOM {
	private WebDriver d;
	
	AnthologyPOM(WebDriver d){
		this.d = d;
		PageFactory.initElements(d, this);
	}
	
	@FindBy (xpath = "//button[normalize-space()='Forms']") WebElement formtab;

	@FindBy (xpath = "//button[normalize-space()='Forms']") WebElement practisetab;

	@FindBy (xpath = "//input[@id='name']") WebElement firstname;

	@FindBy (xpath = "") WebElement lastname;

	@FindBy (xpath = "//input[@id='email']") WebElement email;

	@FindBy (xpath = "//input[@id='gender']") WebElement gender;

	@FindBy (xpath = "//input[@id='mobile']") WebElement mobile;

	@FindBy (xpath = "//input[@id='dob']") WebElement dob;

	@FindBy (xpath = "//input[@id='subjects']") WebElement subject;

	@FindBy (xpath = "//input[@id='hobbies']") WebElement hobby1;

	@FindBy (xpath = "//div[7]//div[1]//div[1]//div[2]//input[1]") WebElement hobby2;

	@FindBy (xpath = "//div[7]//div[1]//div[1]//div[3]//input[1]") WebElement hobby3;

	@FindBy (xpath = "//input[@id='picture']") WebElement picture;

	@FindBy (xpath = "//textarea[@id='picture']") WebElement address;

	@FindBy (xpath = "//select[@id='state']") WebElement state;

	@FindBy (xpath = "//select[@id='city']") WebElement city;
/*
	@FindBy (xpath = "") WebElement ;

	@FindBy (xpath = "") WebElement ;
*/
}
