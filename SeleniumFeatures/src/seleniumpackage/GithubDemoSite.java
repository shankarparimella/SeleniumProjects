package seleniumpackage;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GithubDemoSite {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		String url = "https://qavbox.github.io/demo/";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		driver.get(url);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Alert alert;
		Actions actions = new Actions(driver);
		Action action;
		Select select;
		Robot robot = new Robot();
		wait.until(ExpectedConditions.urlToBe(url));
		
		String Parentwindow, Chilewindow;
		Object[] windowhandles;
		
//		--------------SignUp Form Start------------------
		
		driver.findElement(By.xpath("//a[normalize-space()='SignUp Form']")).click();
		wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElement(By.xpath("//input[@id='username']"))));
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Rahul");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Rahul.Roi@gmail.com");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='tel']")).sendKeys("9876543210");
		Thread.sleep(500);

		js.executeScript("arguments[0].removeAttribute('disabled')", driver.findElement(By.xpath("//input[@id='fax']")));
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='fax']")).sendKeys("123456789");
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//input[@name='datafile']")).sendKeys("D:\\@ Selenium\\Test Files\\Test-Textfile.txt");
		Thread.sleep(500);
		
		select = new Select(driver.findElement(By.xpath("//select[@name='sgender']")));
		select.selectByVisibleText("Male");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@value='one']")).click();
		driver.findElement(By.xpath("//div[9]//input[1]")).click();
		driver.findElement(By.xpath("//div[9]//input[2]")).click();
		driver.findElement(By.xpath("//div[9]//input[3]")).click();
		driver.findElement(By.xpath("//div[9]//input[4]")).click();
		driver.findElement(By.xpath("//div[9]//input[5]")).click();
		driver.findElement(By.xpath("//div[9]//input[6]")).click();
		driver.findElement(By.xpath("//div[9]//input[7]")).click();
		Thread.sleep(500);

		driver.findElement(By.xpath("//input[@id='submit']")).click();

//		--------------SignUp Form End------------------
		
//		--------------Alerts Start------------------
/*		
		driver.findElement(By.xpath("//a[normalize-space()='Alerts']")).click();
		wait.until(ExpectedConditions.urlToBe("https://qavbox.github.io/demo/alerts/"));
		
		driver.findElement(By.xpath("//input[@name='commit']")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(1000);
		alert = driver.switchTo().alert();
		alert.accept();
		
		driver.findElement(By.xpath("//input[@id='delayalert']")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(1000);
		alert = driver.switchTo().alert();
		alert.accept();
		
		driver.findElement(By.xpath("//input[@id='prompt']")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(1000);
		alert = driver.switchTo().alert();
		alert.sendKeys("Rahul Roi");
		Thread.sleep(1000);
		alert.accept();
		
		driver.findElement(By.xpath("//input[@id='confirm']")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(1000);
		alert = driver.switchTo().alert();
		alert.accept();
		
		driver.findElement(By.xpath("//input[@id='confirm']")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(1000);
		alert = driver.switchTo().alert();
		alert.dismiss();

//		--------------Alerts End------------------


//		--------------Links Start------------------
/*		
		driver.findElement(By.xpath("//a[normalize-space()='Links']")).click();
		wait.until(ExpectedConditions.urlToBe("https://qavbox.github.io/demo/links/"));
		
		Parentwindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		windowhandles = driver.getWindowHandles().toArray();
		driver.switchTo().window((String ) windowhandles[1]);
		
		wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElement(By.xpath("//input[@id='g4072-fullname']"))));
		driver.findElement(By.xpath("//input[@id='g4072-fullname']")).sendKeys("Rahul");
		driver.findElement(By.xpath("//input[@id='g4072-email']")).sendKeys("rahul@gmail.com");
		driver.findElement(By.xpath("//input[@id='g4072-phonenumber']")).sendKeys("9876543210");
		
		select = new Select(driver.findElement(By.xpath("//select[@id='g4072-gender']")));
		select.selectByVisibleText("Female");
		
		driver.findElement(By.xpath("//input[@id='g4072-yearsofexperience-2']")).click();
		driver.findElement(By.xpath("//input[@id='g4072-skills-Functional testing']")).click();
		driver.findElement(By.xpath("//input[@id='g4072-skills-Automation testing']")).click();
		driver.findElement(By.xpath("//input[@id='g4072-skills-API testing']")).click();
		driver.findElement(By.xpath("//input[@id='g4072-skills-DB testing']")).click();

		select = new Select(driver.findElement(By.xpath("//select[@id='g4072-qatools']")));
		select.selectByVisibleText("Appium");
		driver.findElement(By.xpath("//textarea[@id='contact-form-comment-g4072-otherdetails']")).sendKeys("Switching windows or tabs");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[normalize-space()='Submit!']")).click();
		
		driver.switchTo().window(Parentwindow);
		wait.until(ExpectedConditions.urlToBe("https://qavbox.github.io/demo/links/"));
		
//		---------------Console window behaving differently---------------
		
//		driver.findElement(By.xpath("//input[@name='multiple']")).click();
//		wait.until(ExpectedConditions.urlContains("https://qavalidation.com/about-me/"));
//		driver.manage().window().maximize();
//		wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElement(By.xpath("//input[@id='the7-search']"))));
//		driver.findElement(By.xpath("//input[@id='the7-search']")).sendKeys("Switching windows or tabs");
//		Thread.sleep(500);
//		driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M11.7,10.3')]")).click();
		
		driver.findElement(By.xpath("//input[@value='Download']")).click();

//		--------------Links End------------------

*/		
//		--------------DragnDrop Start------------------
/*		
		driver.findElement(By.xpath("//a[normalize-space()='DragnDrop']")).click();
		wait.until(ExpectedConditions.urlToBe("https://qavbox.github.io/demo/dragndrop/"));
		
		actions.dragAndDrop(driver.findElement(By.xpath("//p[normalize-space()='Drag me to my target']")), driver.findElement(By.xpath("//div[@id='droppable']")));
		actions.build().perform();
		WebElement slider = driver.findElement(By.xpath("//input[@value='0']"));
		slider.clear();
//		actions.dragAndDropBy(slider, 0, 30).build().perform();
//		actions.moveToElement(slider).clickAndHold().moveByOffset(0, 10).release().build().perform();
*/
//		--------------DragnDrop End------------------
		
//		--------------Auto Suggestions Start------------------
/*		
		driver.findElement(By.xpath("//a[normalize-space()='Auto Suggestions']")).click();
		wait.until(ExpectedConditions.urlToBe("https://qavbox.github.io/demo/autosuggestion/"));
		
		driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys("India");
 		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
*/		
//		--------------Auto Suggestions End------------------
		
	}
}