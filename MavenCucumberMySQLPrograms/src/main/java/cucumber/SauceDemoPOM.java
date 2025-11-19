package cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoPOM {
	private WebDriver d;
	SauceDemoPOM(WebDriver d){
		this.d = d;
		PageFactory.initElements(d, this);
	}

@FindBy (xpath = "//input[@id='user-name']") WebElement username;

@FindBy (xpath = "//input[@id='password']") WebElement password;

@FindBy (xpath = "//input[@id='login-button']") WebElement loginbtn;

@FindBy (xpath = "//button[@id='add-to-cart-sauce-labs-backpack']") WebElement product1;

@FindBy (xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']") WebElement product2;

@FindBy (xpath = "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']") WebElement product3;

@FindBy (xpath = "//button[@id='add-to-cart-sauce-labs-fleece-jacket']") WebElement product4;

@FindBy (xpath = "//button[@id='add-to-cart-sauce-labs-onesie']") WebElement product5;

@FindBy (xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']") WebElement product6;

@FindBy (xpath = "//a[@class='shopping_cart_link']") WebElement cart;

@FindBy (xpath = "//button[@id='checkout']") WebElement checkoutbtn;

@FindBy (xpath = "//input[@id='first-name']") WebElement firstname;

@FindBy (xpath = "//input[@id='last-name']") WebElement lastname;

@FindBy (xpath = "//input[@id='postal-code']") WebElement zipcode;

@FindBy (xpath = "//input[@id='continue']") WebElement continuebtn;

@FindBy (xpath = "//button[@id='finish']") WebElement finishbtn;

@FindBy (xpath = "//button[@id='back-to-products']") WebElement backhomebtn;
/*
@FindBy (xpath = "") WebElement ;

@FindBy (xpath = "") WebElement ;

@FindBy (xpath = "") WebElement ;

@FindBy (xpath = "") WebElement ;
*/
}
