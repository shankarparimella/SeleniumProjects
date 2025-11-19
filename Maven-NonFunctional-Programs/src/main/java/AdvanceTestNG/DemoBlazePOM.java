package AdvanceTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoBlazePOM {
	WebDriver d;
	
	DemoBlazePOM(WebDriver d){
		this.d = d;
		PageFactory.initElements(d, this);
		
	}
	
	@FindBy (xpath = "//a[normalize-space()='Samsung galaxy s6']") WebElement galaxys6;
	
	@FindBy (xpath = "//a[normalize-space()='Nokia lumia 1520']") WebElement lumia;
	
	@FindBy (xpath = "//a[normalize-space()='Nexus 6']") WebElement nexus6;
	
	@FindBy (xpath = "//a[normalize-space()='Samsung galaxy s7']") WebElement galaxys7;
	
	@FindBy (xpath = "//a[normalize-space()='Iphone 6 32gb']") WebElement iphone6;
	
	@FindBy (xpath = "//a[normalize-space()='Sony xperia z5']") WebElement xperiaz5;
//	@FindBy (xpath = "") WebElement ;
	
	@FindBy (xpath = "//a[normalize-space()='HTC One M9']") WebElement htcone;
//	@FindBy (xpath = "") WebElement ;
	
	@FindBy (xpath = "//a[normalize-space()='Sony vaio i5']") WebElement vaioi5;
//	@FindBy (xpath = "") WebElement ;
	
	@FindBy (xpath = "//a[normalize-space()='Sony vaio i7']") WebElement vaioi7;

	@FindBy (xpath = "//a[@class='btn btn-success btn-lg']") WebElement addtocart;
	
	@FindBy (xpath = "//button[normalize-space()='Place Order']") WebElement placeorder;
	
	@FindBy (xpath = "//a[normalize-space()='Cart']") WebElement cart;
	
	@FindBy (xpath = "//input[@id='name']") WebElement name;
	
	@FindBy (xpath = "//input[@id='country']") WebElement country;
	
	@FindBy (xpath = "//input[@id='city']") WebElement city;
	
	@FindBy (xpath = "//input[@id='card']") WebElement card;
	
	@FindBy (xpath = "//input[@id='month']") WebElement month;
	
	@FindBy (xpath = "//input[@id='year']") WebElement year;
	
	@FindBy (xpath = "//button[contains(.,'Purchase')]") WebElement purchase;
	
/*	@FindBy (xpath = "") WebElement ;
	
	@FindBy (xpath = "") WebElement ;
	*/

}
