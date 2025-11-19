package AdvanceTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BiodataKingClassPOM {
	private WebDriver d;
	BiodataKingClassPOM(WebDriver d){
		this.d = d;
		PageFactory.initElements(d, this);
	}
	
	@FindBy (xpath = "//a[@id='open-login-modal']")
	WebElement loginlink;
	
	@FindBy (xpath = "//input[@id='username']")
	WebElement username;
	
	@FindBy (xpath = "//input[@id='userpassword']")
	WebElement password;
	
	@FindBy (xpath = "//input[@value='Login']")
	WebElement loginbtn;
	
	@FindBy (xpath = "//a[@class='sub-menu-link'][normalize-space()='Register FREE']")
	WebElement register;
	
	@FindBy (xpath = "//a[@class='sub-menu-link'][normalize-space()='Profiles eBook']")
	WebElement ebooks;
	
	@FindBy (xpath = "//a[@class='sub-menu-link'][normalize-space()='Home']")
	WebElement home;
	
}