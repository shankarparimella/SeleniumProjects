package extentreportsdemo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class TestBrokenValidLinks extends BaseClass{
	@Test (priority=1)
	public void SEOTest() throws Exception, IOException {
		test = ext.createTest("Test Reports of '"+url+"' website");
		HttpURLConnection htp=null;
		String testurl="";
		
		List<WebElement> sel=d.findElements(By.tagName("a"));
		
		Iterator<WebElement> iter=sel.iterator();
		
		while(iter.hasNext()){
			testurl=iter.next().getAttribute("href");
			
			if(testurl==null || testurl.isEmpty()){
				test.log(Status.FAIL, testurl+" - Anchor tag is missing");
				continue;
			}
			
			if(!testurl.startsWith(url)){
				test.log(Status.FAIL, testurl+" - Incorrect Domain name");
			}

			htp=(HttpURLConnection)(new URL(testurl)).openConnection();
			htp.setRequestMethod("HEAD");
			htp.connect();
			int res=htp.getResponseCode();
			
			if(res>=400){
				test.log(Status.FAIL, testurl+" - is broken link");
			}
			else{
				test.log(Status.PASS, testurl+" - valid link");
			}
		}
		System.out.println("Validation of website is completed");
	}
}