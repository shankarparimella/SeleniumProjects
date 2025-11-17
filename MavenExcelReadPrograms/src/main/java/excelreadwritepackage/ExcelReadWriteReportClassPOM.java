package excelreadwritepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExcelReadWriteReportClassPOM {
	private WebDriver d;
	ExcelReadWriteReportClassPOM(WebDriver d){
		this.d = d;
		PageFactory.initElements(d, this);
	}
	
@FindBy (xpath="//input[@id='username']") WebElement userfield;

@FindBy (xpath = "//input[@id='password']") WebElement passfield;

@FindBy (xpath = "//button[@id='submit']") WebElement submit;

@FindBy (xpath = "//a[contains(.,'Log out')]") WebElement logout;
}
