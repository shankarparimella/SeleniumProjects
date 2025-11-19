package datadrivenbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataDrivenTest1POM {

	WebDriver d;
	
	DataDrivenTest1POM(WebDriver d){
		this.d = d;
		PageFactory.initElements(d, this);
	}

@FindBy (xpath = "//button[normalize-space()='Forms']") WebElement formtab;

@FindBy (xpath = "//a[normalize-space()='Login']") WebElement logintab;

@FindBy (xpath = "//input[@id='email']") WebElement username;

@FindBy (xpath = "//input[@id='password']") WebElement password;

@FindBy (xpath = "//input[@value='Login']") WebElement loginbtn;

@FindBy (xpath = "//a[normalize-space()='Register']") WebElement registertab;

@FindBy (xpath = "//input[@id='firstname']") WebElement fname;

@FindBy (xpath = "//input[@id='lastname']") WebElement lname;

@FindBy (xpath = "//input[@id='username']") WebElement newuser;

@FindBy (xpath = "//input[@id='password']") WebElement newpass;

@FindBy (xpath = "//input[@value='Register']") WebElement registerbtn;
/*
@FindBy (xpath = "") WebElement ;

@FindBy (xpath = "") WebElement ;

@FindBy (xpath = "") WebElement ;

@FindBy (xpath = "") WebElement ;

*/
}
