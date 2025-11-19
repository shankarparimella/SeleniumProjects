package cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMPOM1 {
	private WebDriver d;
	OrangeHRMPOM1(WebDriver d){
		this.d = d;
		PageFactory.initElements(d, this);
	}
@FindBy (xpath = "//input[@placeholder='Username']") WebElement username;

@FindBy (xpath = "//input[@placeholder='Password']") WebElement password;

@FindBy (xpath = "//button[@type='submit']") WebElement loginbtn;

@FindBy (xpath = "//span[normalize-space()='PIM']") WebElement pimtab;

@FindBy (xpath = "//button[normalize-space()='Add']") WebElement addpimbtn;

@FindBy (xpath = "//input[@placeholder='First Name']") WebElement firstname;

@FindBy (xpath = "//input[@placeholder='Middle Name']") WebElement middlename;

@FindBy (xpath = "//input[@placeholder='Last Name']") WebElement lastname;

//@FindBy (xpath = "//img[@class='employee-image']") WebElement picture;

@FindBy (xpath = "//button[@type='submit']") WebElement savebtn;

@FindBy (xpath = "(//input[contains(@placeholder,'Type for hints...')])[1]") WebElement SearchEmployee;

@FindBy (xpath = "//button[@type='submit']") WebElement Searchbtn;

//@FindBy (xpath = "") WebElement ;

@FindBy (xpath = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Leave']") WebElement leavetab;

@FindBy (xpath = "//a[normalize-space()='Assign Leave']") WebElement assignleavebtn;

@FindBy (xpath = "//input[@placeholder='Type for hints...']") WebElement employeename;

@FindBy (xpath = "//div[@class='oxd-select-text-input'][contains(.,'-- Select --')]") WebElement leavetype;

@FindBy (xpath = "(//input[@placeholder='yyyy-dd-mm'])[1]") WebElement fromdate;

@FindBy (xpath = "(//input[@placeholder='yyyy-dd-mm'])[2]") WebElement todate;

//@FindBy (xpath = "//i[@class='oxd-icon bi-caret-up-fill oxd-select-text--arrow']") WebElement duration;

@FindBy (xpath = "//textarea[contains(@class,'oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical')]") WebElement comment;

@FindBy (xpath = "//button[@type='submit']") WebElement assignbtn;
/*
@FindBy (xpath = "") WebElement ;

@FindBy (xpath = "") WebElement ;

@FindBy (xpath = "") WebElement ;

@FindBy (xpath = "") WebElement ;

@FindBy (xpath = "") WebElement ;

@FindBy (xpath = "") WebElement ;

@FindBy (xpath = "") WebElement ;

@FindBy (xpath = "") WebElement ;

@FindBy (xpath = "") WebElement ;

@FindBy (xpath = "") WebElement ;

@FindBy (xpath = "") WebElement ;
*/
}
