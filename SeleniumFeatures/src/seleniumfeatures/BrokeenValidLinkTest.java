package seleniumfeatures;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokeenValidLinkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		WebDriver d = new ChromeDriver();
		HttpURLConnection htp = null;
		
		String homeurl = "https://only-testing-blog.blogspot.com/";
		String testurl = "";
		int res;
		
		d.get(homeurl);
		Thread.sleep(2000);
		
		List<WebElement> sel = d.findElements(By.tagName("a"));
		Iterator<WebElement> iter = sel.iterator();
		
		while(iter.hasNext()) {
			testurl = iter.next().getAttribute("href");
			
			//Anchor tag is specified or not 
			if(testurl==null || testurl.isEmpty()) {
				System.out.println(testurl+" Anchor tag is not defined");
				continue;
			}
			
			//domain test
			if(!testurl.startsWith(testurl)) {
				System.out.println(testurl+"Domain name is incorrect");
			}
			//Broken & valid Link Test 
			htp=(HttpURLConnection)(new URL(testurl)).openConnection();
			htp.setRequestMethod("HEAD");
			htp.connect();
		res= htp.getResponseCode();
		
		if(res>=400)
		{
			System.out.println(testurl+" is broken link because reponse code is :- "+res);
		}
		else
		{
			System.out.println(testurl+" is valid link");
		}
		System.out.println("*****Validation of website is completed*****");
		}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}