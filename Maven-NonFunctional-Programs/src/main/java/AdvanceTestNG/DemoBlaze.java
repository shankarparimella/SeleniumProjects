package AdvanceTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoBlaze {

	WebDriver d;
	String url = "https://www.demoblaze.com/";
	DemoBlazePOM p;
	Alert al;
	
	@Test (priority = 1)
	public void setup() {
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.get(url);
		d.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
	}
	
	@Test (priority = 2)
	public void addtocart() throws InterruptedException {
		p = new DemoBlazePOM(d);
		Thread.sleep(2000);
		
		p.galaxys6.click();
		p.addtocart.click();
		Thread.sleep(2000);
		al = d.switchTo().alert();
		al.accept();
		
		Thread.sleep(2000);
		d.navigate().to(url);
		p.lumia.click();
		p.addtocart.click();
		Thread.sleep(2000);
		al = d.switchTo().alert();
		al.accept();
		
		Thread.sleep(2000);
		d.navigate().to(url);
		p.nexus6.click();
		p.addtocart.click();
		Thread.sleep(2000);
		al = d.switchTo().alert();
		al.accept();
		
		Thread.sleep(2000);
		d.navigate().to(url);
		p.galaxys7.click();
		p.addtocart.click();
		Thread.sleep(2000);
		al = d.switchTo().alert();
		al.accept();
		
		Thread.sleep(1000);
		d.navigate().to(url);
		p.iphone6.click();
		p.addtocart.click();
		Thread.sleep(1000);
		al = d.switchTo().alert();
		al.accept();
		
		Thread.sleep(1000);
		d.navigate().to(url);
		p.xperiaz5.click();
		p.addtocart.click();
		Thread.sleep(1000);
		al = d.switchTo().alert();
		al.accept();
		
		Thread.sleep(1000);
		d.navigate().to(url);
		p.htcone.click();
		p.addtocart.click();
		Thread.sleep(1000);
		al = d.switchTo().alert();
		al.accept();
		
		Thread.sleep(1000);
		d.navigate().to(url);
		p.vaioi5.click();
		p.addtocart.click();
		Thread.sleep(1000);
		al = d.switchTo().alert();
		al.accept();
		
		Thread.sleep(1000);
		d.navigate().to(url);
		p.vaioi7.click();
		p.addtocart.click();
		Thread.sleep(1000);
		al = d.switchTo().alert();
		al.accept();
		
		}
	@Test (priority = 3)
	public void Purchase() throws InterruptedException {
		p = new DemoBlazePOM(d);
		String name= "Shankar";
		String country = "India";
		String city = "Mumbai";
		String card = "12345678901234";
		String month = "April";
		String year = "2025";
		
		p.cart.click();
		Thread.sleep(1000);
		p.placeorder.click();
		Thread.sleep(1000);
		p.name.sendKeys(name);
		p.country.sendKeys(country);
		p.city.sendKeys(city);
		p.card.sendKeys(card);
		p.month.sendKeys(month);
		p.year.sendKeys(year);
		Thread.sleep(2000);
		p.purchase.click();
		
		}
}