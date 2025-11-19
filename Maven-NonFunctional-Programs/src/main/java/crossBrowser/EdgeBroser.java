package crossBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class EdgeBroser {
	WebDriver d;
	String url = "https://biodataking.com/";
	Actions a;
	CrossBrowserPOM p;
	
	@Test (priority = 1)
	public void Setup() {
		d= new EdgeDriver();
		d.manage().window().maximize();
		d.get(url);
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test (priority = 2)
	public void LoginFormTest() throws InterruptedException{
		p = new CrossBrowserPOM(d);
		
		p.loginlink.click();
		p.username.sendKeys("Shanakr");
		p.password.sendKeys("shankar@1234");
		p.loginbtn.click();
		Thread.sleep(2000);
		d.navigate().refresh();
	}

	@Test (priority = 3)
	public void MouseHoverTest() throws InterruptedException {
		Thread.sleep(1000);
		p = new CrossBrowserPOM(d);
		a = new Actions(d);
		a.moveToElement(p.loginlink).perform();
		Thread.sleep(1000);
		a.moveToElement(p.register).perform();
		Thread.sleep(1000);
		a.moveToElement(p.ebooks).perform();
		Thread.sleep(1000);
		a.moveToElement(p.home).perform();
	}

}
