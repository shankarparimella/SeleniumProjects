package datadrivenbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMUsingDataDrivenClassPOM {

	WebDriver d;
	
	OrangeHRMUsingDataDrivenClassPOM(WebDriver d){
		this.d = d;
		PageFactory.initElements(d, this);
	}
	
	@FindBy (xpath = "//input[@placeholder='Username']") WebElement username;

	@FindBy (xpath = "//input[@placeholder='Password']") WebElement password;

	@FindBy (xpath = "//span[normalize-space()='PIM']") WebElement pimtab;

	@FindBy (xpath = "//button[normalize-space()='Add']") WebElement addpimbtn;

	@FindBy (xpath = "//input[@placeholder='First Name']") WebElement fname;

	@FindBy (xpath = "//input[@placeholder='Middle Name']") WebElement mname;

	@FindBy (xpath = "//input[@placeholder='Last Name']") WebElement lname;
	
//	@FindBy (xpath = "//input[contains(@class,'oxd-input oxd-input--focus')]") WebElement id;
	@FindBy (css = ".oxd-input.oxd-input--focus") 	WebElement id;
	
	@FindBy (xpath = "//span[@class='oxd-switch-input oxd-switch-input--active --label-right']") WebElement radiobtn;

	@FindBy (xpath = "(//input[contains(@class,'oxd-input oxd-input--active')])[6]") WebElement newusername;

	@FindBy (xpath = "(//input[@type='password'])[1]") WebElement newpassword;

	@FindBy (xpath = "(//input[@type='password'])[2]") WebElement newconfirmpassword;

	@FindBy (xpath = "//button[@type='submit']") WebElement savebtn;

	@FindBy (xpath = "(//input[@placeholder='Type for hints...'])[1]") WebElement entername;

	@FindBy (xpath = "//button[@type='submit']") WebElement searchbtn;
/*
	@FindBy (xpath = "") WebElement ;

	@FindBy (xpath = "") WebElement ;

	@FindBy (xpath = "") WebElement ;
*/
}
