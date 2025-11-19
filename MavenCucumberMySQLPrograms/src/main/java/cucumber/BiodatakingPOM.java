package cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BiodatakingPOM {
	private WebDriver d;
	BiodatakingPOM(WebDriver d){
		this.d = d;
		PageFactory.initElements(d, this);
	}
	
	@FindBy (xpath = "//a[@id='open-login-modal']") WebElement logintab;
	
	@FindBy (xpath = "//input[@id='username']") WebElement email;
	
	@FindBy (xpath = "//input[@id='userpassword']") WebElement password;
	
	@FindBy (xpath = "//input[@value='Login']") WebElement loginbtn;
	
//	@FindBy (xpath = "") WebElement ;
	
}