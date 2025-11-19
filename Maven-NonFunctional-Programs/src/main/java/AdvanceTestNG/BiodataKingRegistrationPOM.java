package AdvanceTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BiodataKingRegistrationPOM {

	private WebDriver d;
	
	BiodataKingRegistrationPOM(WebDriver d){
		this.d = d;
		PageFactory.initElements(d, this);
	}
	
	@FindBy (xpath = "//a[@id='open-login-modal']") WebElement loginlink;
	
	@FindBy (xpath = "//input[@id='username']") WebElement username;
	
	@FindBy (xpath = "//input[@id='userpassword']") WebElement password;
	
	@FindBy (xpath = "//input[@value='Login']") WebElement loginbtn;
	
	@FindBy (xpath = "//a[@class='sub-menu-link'][normalize-space()='Register FREE']") WebElement register;
	
	@FindBy (xpath  = "//a[@class='sub-menu-link'][normalize-space()='Profiles eBook']") WebElement ebook;
	
	@FindBy (xpath = "//a[@class='sub-menu-link'][normalize-space()='Home']") WebElement home;
	
	@FindBy (xpath = "//select[@id='register-gender']") WebElement gender;
	
	@FindBy (xpath = "//input[@id='reg-fname']") WebElement fname;

	@FindBy (xpath = "//input[@id='reg-lname']") WebElement lname;
	
	@FindBy(xpath = "//li[contains(@id,'langId_53')]") WebElement telugulang;

	@FindBy (xpath = "//select[@id='cp-religion']") WebElement religion;

	@FindBy (xpath = "//input[@id='filter-caste']") WebElement cast;
	
	@FindBy(xpath = "//li[@id='casteId_606']") WebElement padmashalicast;

	@FindBy (xpath = "//button[@id='tmc-dob-btn']") WebElement dob;

	@FindBy (xpath = "//select[@id='reg-dob-day']") WebElement date;

	@FindBy (xpath = "//select[@id='reg-dob-month']") WebElement month;

	@FindBy (xpath = "//select[@id='reg-dob-year']") WebElement year;

	@FindBy (xpath = "//button[@id='set-dob-btn']") WebElement setdob;

	@FindBy (xpath = "//input[@id='filter-lang']") WebElement lang;

	@FindBy (xpath = "//select[@id='reg-mobile-ctry']") WebElement country;

	@FindBy (xpath = "//input[@id='reg-mobile']") WebElement mobile;

	@FindBy (xpath = "//input[@id='reg-email']") WebElement email;

	@FindBy (xpath = "//input[@id='reg-password']") WebElement pass;

	@FindBy (xpath = "//select[@id='reg-mstatus']") WebElement status;

	@FindBy (xpath = "//select[@id='reg-children']") WebElement childcount;

	@FindBy (xpath = "//select[@id='reg-complexion']") WebElement complexity;

	@FindBy (xpath = "//select[@id='reg-height']") WebElement height;

	@FindBy (xpath = "//input[@id='tmc-search-city']") WebElement location;

	@FindBy (xpath = "//input[@id='find']") WebElement findlocation;

	@FindBy (xpath = "//input[@id='basic-info-part-1']") WebElement submit;

//	@FindBy (xpath = ) WebElement ;
//
//	@FindBy (xpath = ) WebElement ;
//
//	@FindBy (xpath = ) WebElement ;

}
