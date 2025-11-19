package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ParkingCostCalculator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.shino.de/parkcalc/");
		Thread.sleep(2000);
		
		String parenttab = d.getWindowHandle();
		
		WebElement parkinglot = d.findElement(By.xpath("//select[@id='ParkingLot']"));
		parkinglot.click();
		Thread.sleep(1000);
		Select s = new Select(parkinglot);
		s.selectByVisibleText("Short-Term Parking");
		
		WebElement startdate = d.findElement(By.xpath("//tbody/tr[2]/td[2]/a[1]/img[1]"));
		startdate.click();
		Thread.sleep(1000);
		
		for(String child:d.getWindowHandles())
		{
			d.switchTo().window(child);
		}
		
		WebElement month = d.findElement(By.xpath("//select[@name='MonthSelector']"));
		Select sm = new Select(month);
		sm.selectByVisibleText("April");
		Thread.sleep(1000);
		
		WebElement year = d.findElement(By.linkText("<"));
		year.click();
		Thread.sleep(1000);

		WebElement date = d.findElement(By.linkText("10"));
		date.click();
		Thread.sleep(1000);
		
		d.switchTo().window(parenttab);

		WebElement enddate = d.findElement(By.xpath("(//img[@alt='Pick a date'])[2]"));
		enddate.click();
		Thread.sleep(1000);
		
		for(String child:d.getWindowHandles())
		{
			d.switchTo().window(child);
		}
		
		WebElement endmonth = d.findElement(By.xpath("//select[@name='MonthSelector']"));
		Select sem = new Select(endmonth);
		sem.selectByVisibleText("April");
		Thread.sleep(1000);
		
		WebElement endyear = d.findElement(By.linkText("<"));
		endyear.click();
		Thread.sleep(1000);

		WebElement endday = d.findElement(By.linkText("11"));
		endday.click();
		Thread.sleep(1000);

		d.switchTo().window(parenttab);
		
		WebElement starttime = d.findElement(By.xpath("//input[@id='StartingTime']"));
		starttime.clear();
		starttime.sendKeys("1:00");
		Thread.sleep(1000);

		WebElement endtime = d.findElement(By.xpath("//input[@id='LeavingTime']"));
		endtime.clear();
		endtime.sendKeys("5:00");
		Thread.sleep(1000);

		WebElement startampm = d.findElement(By.xpath("//tbody/tr[2]/td[2]/input[4]"));
		startampm.click();
		Thread.sleep(1000);

		WebElement endampm = d.findElement(By.xpath("//tbody/tr[3]/td[2]/input[4]"));
		endampm.click();
		Thread.sleep(1000);
		
		WebElement calculate = d.findElement(By.xpath("//input[@name='Submit']"));
		calculate.click();
		Thread.sleep(1000);

	}
}