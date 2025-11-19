package extentreportsdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BaseClass {

	ExtentHtmlReporter ht;
	ExtentReports ext;
	ExtentTest test;
	
	WebDriver d;
	String url = "https://www.google.com/";
	
	
	@BeforeSuite()
	public void setup() throws Exception {
		d = new ChromeDriver();
		d.get(url);
		Thread.sleep(2000);
		
		ht = new ExtentHtmlReporter("./Reports/GoogleHomePage-Report1.html");
		ext = new ExtentReports();
		
		ext.attachReporter(ht);
		ext.setSystemInfo("Domain", "https://biodataking.com/");
		ext.setSystemInfo("Browser name", "Chrome Browser");
		ext.setSystemInfo("QA Name", "Shankar");
		
		ht.config().setReportName("Broken and valid links test report");
		ht.config().setTheme(Theme.DARK);
		
	}
	
	@BeforeMethod()
	public void SetStatusResult(ITestResult it) {
		if(it.getStatus()==ITestResult.SUCCESS) {
			test.log(Status.PASS, MarkupHelper.createLabel(it.getName()+"Test Case Pass", ExtentColor.GREEN));
			test.fail(it.getThrowable());
			
		}else if(it.getStatus()==ITestResult.FAILURE) {
			test.log(Status.FAIL, MarkupHelper.createLabel(it.getName()+"Test Case Fail", ExtentColor.RED));
			test.fail(it.getThrowable());
			}
	}

	@AfterSuite()	
	public void CloseReport() {
		ext.flush();
	}
}