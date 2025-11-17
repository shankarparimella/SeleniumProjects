package excelreadwritepackage;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TutorialsPointClass1 {
	String homeurl = "https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php", SeleniumTutoriallink = "https://www.tutorialspoint.com/selenium/index.htm";
	String newurl;
	WebDriver driver;
	WebDriverWait wait;
	Actions action;
	Action act;
	Alert alert;
	Robot robot;
	Select select;
	TutorialsPointClass1POM p;
	JavascriptExecutor js;
	
	String fullname = "Rahul Raghavendra", email = "RahulRaghavendra@gmail.com", currentaddress = "Sion koliwada Mumbai-4000038", password = "RahulRaghavendra123";
	String firstname = "Rahul", lastname = "Raghavendra", age="5000", salary="50000500005000050000", department="IT"; 
	
	@Given("Open the TutorialsPointClass1 website")
	public void open_the_tutorials_point_class1_website() throws AWTException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		driver.get(homeurl);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.urlToBe(homeurl));
		p = new TutorialsPointClass1POM(driver);
		js = (JavascriptExecutor) driver;
		action = new Actions(driver);
		robot = new Robot();
	}

	@And("Take the inputs from Excel file into TutorialsPointClass1")
	public void take_the_inputs_from_excel_file_into_tutorials_point_class1() {
		System.out.println("Hello TutorialsPoint");
	}

	@When("Automate the forms in TutorialsPointClass1 website")
	public void automate_the_forms_in_tutorials_point_class1_website() throws InterruptedException, AWTException {
/*		p.SeleniumTutoriallink.click();
		Thread.sleep(2000);
		Object[] windowhandle = driver.getWindowHandles().toArray();
		driver.switchTo().window((String) windowhandle[1]);
		driver.close();
		driver.switchTo().window((String) windowhandle[0]);
		p.ElementsAccordion.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(p.TextBoxTab));
		p.TextBoxTab.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(p.FullnameTextbox));
		
		p.FullnameTextbox.sendKeys(fullname);
		p.EmailTextbox.sendKeys(email);
		p.CurrentAddressTextbox.sendKeys(currentaddress);
		p.PasswordTextbox.sendKeys(password);
		Thread.sleep(1000);
		
		p.ElementsAccordion.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(p.CheckBoxTab));
		p.CheckBoxTab.click();
		p.MainLevel1Plusbtn.click();
		Thread.sleep(500);
		p.MainLevel2Plusbtn.click();
		Thread.sleep(500);
		p.SubLevel1Checkbox.click();
		Thread.sleep(500);
		p.SubLevel2Checkbox.click();
		Thread.sleep(500);
		p.SubLevel3Checkbox.click();
		Thread.sleep(500);
		p.SubLevel4Checkbox.click();
		Thread.sleep(1000);
		
		p.RadioButtonTab.click();
		p.YesRadiobtn.click();
		Thread.sleep(500);
		p.ImpressiveRadiobtn.click();
		Thread.sleep(500);
		js.executeScript("arguments[0].removeAttribute('disabled')", p.NoRadiobtn);
		Thread.sleep(500);
		p.NoRadiobtn.click();
		
		p.WebTablesTab.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(p.WebtablesAddbtn));
		p.WebtablesAddbtn.click();
		Thread.sleep(500);
		wait.until(ExpectedConditions.visibilityOfAllElements(p.WebtablesFirstnametextbox));
		p.WebtablesFirstnametextbox.sendKeys(firstname);
		Thread.sleep(500);
		p.WebtablesLastnametextbox.sendKeys(lastname);
		Thread.sleep(500);
		p.WebtablesEmailtextbox.sendKeys(email);
		Thread.sleep(500);
		p.WebtablesAgetextbox.sendKeys(age);
		Thread.sleep(500);
		p.WebtablesSalarytextbox.sendKeys(salary);
		Thread.sleep(500);
		p.WebtablesDepartmenttextbox.sendKeys(department);
		Thread.sleep(500);
		p.WebtablesLoginbtn.click();
		
		p.ElementsAccordion.click();
		p.ButtonsTab.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(p.Clickmebtn));
		p.Clickmebtn.click();
		Thread.sleep(500);
		action.contextClick(p.RightClickmebtn).build().perform();
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		wait.until(ExpectedConditions.visibilityOfAllElements(p.DoubleClickmebtn));
		action.doubleClick(p.DoubleClickmebtn).build().perform();
		
		p.LinksTab.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(p.LinksHome));
		p.LinksHome.click();
		Thread.sleep(500);
		Object[] windowhandle = driver.getWindowHandles().toArray();
		Thread.sleep(500);
		driver.switchTo().window((String) windowhandle[1]);
		driver.close();
		driver.switchTo().window((String) windowhandle[0]);
		Thread.sleep(500);
		wait.until(ExpectedConditions.visibilityOfAllElements(p.LinksCreated));
		p.LinksCreated.click();
		Thread.sleep(500);
		p.LinksNocontent.click();
		Thread.sleep(500);
		p.LinksMoved.click();
		Thread.sleep(500);
		p.LinksBadrequest.click();
		Thread.sleep(500);
		p.LinksUnauthorized.click();
		Thread.sleep(500);
		p.LinksForbidden.click();
		Thread.sleep(500);
		p.LinksNotfound.click();
		Thread.sleep(500);
		
		p.BrokenLinksTab.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(p.BrokenLinksValidLink));
		p.BrokenLinksValidLink.click();
		p.BrokenLinksBrokenlink.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(p.BrokenLinksGobacklink));
		p.BrokenLinksGobacklink.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(p.BrokenLinksValidLink));
		Thread.sleep(1000);	
		
		p.ElementsAccordion.click();
		p.UploadDownloadTab.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(p.Downloadbtn));
		p.Downloadbtn.click();
		p.Choosefilebtn.sendKeys("D:\\@ Selenium\\Pics\\cartoon5.jpg");
		Thread.sleep(1000);	

		
		p.FormsAccordion.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(p.PracticeFormTab));
		p.PracticeFormTab.click();
		p.DateofBirthicon.sendKeys("17-04-1987");
		p.ChoosePicture.sendKeys("D:\\@ Selenium\\Pics\\cartoon5.jpg");
		
		select = new Select(p.SelectStatedropdown);
		select.selectByVisibleText("Uttar Pradesh");
		
		select = new Select(p.SelectCitydropdown);
		select.selectByVisibleText("Agra");
		Thread.sleep(1000);
		
		p.RegiterTab.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(p.RegisterFirstname));
		p.RegisterFirstname.sendKeys(firstname);
		p.RegisterLastname.sendKeys(lastname);
		p.RegisterUsername.sendKeys(email);
		p.RegisterPassword.sendKeys(password);
		p.Registerbtn.click();
		Thread.sleep(1000);
		
		p.BacktoLoginbtn.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(p.LoginEmailtxt));
		p.LoginEmailtxt.sendKeys(email);
		p.LoginPasswordtxt.sendKeys(password);
		p.Loginbtn.click();
		
		p.AlertsFramesWindowsAccordion.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(p.BrowserwindowTab));
		p.BrowserwindowTab.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(p.Newtabbtn));
		p.Newtabbtn.click();
		
		Object[] windowhandles = driver.getWindowHandles().toArray();
		driver.switchTo().window((String) windowhandles[1]);
		Thread.sleep(1000);
		driver.close();
		
		driver.switchTo().window((String) windowhandles[0]);
		wait.until(ExpectedConditions.visibilityOfAllElements(p.Newwindowbtn));
		p.Newwindowbtn.click();
		
		Object[] windowhandles1 = driver.getWindowHandles().toArray();
		driver.switchTo().window((String) windowhandles1[1]);
		Thread.sleep(1000);
		driver.close();
		
		driver.switchTo().window((String) windowhandles1[0]);
		wait.until(ExpectedConditions.visibilityOfAllElements(p.Newwindowmessagebtn));
		p.Newwindowmessagebtn.click();
		
		Object[] windowhandles2 = driver.getWindowHandles().toArray();
		driver.switchTo().window((String) windowhandles2[1]);
		Thread.sleep(1000);
		driver.close();
		
		driver.switchTo().window((String) windowhandles2[0]);
		
		p.AlertsFramesWindowsAccordion.click();
		p.AlertsTab.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(p.Alertbtn));
		p.Alertbtn.click();
		wait.until(ExpectedConditions.alertIsPresent());
		alert = driver.switchTo().alert();
		Thread.sleep(1000);
		alert.accept();
		
		p.Clickmebtn.click();
		wait.until(ExpectedConditions.alertIsPresent());
		alert = driver.switchTo().alert();
		Thread.sleep(1000);
		alert.accept();
		
		p.Clickmeconfirmboxbtn.click();
		wait.until(ExpectedConditions.alertIsPresent());
		alert = driver.switchTo().alert();
		Thread.sleep(1000);
		alert.accept();

		p.Clickmeconfirmboxbtn.click();
		wait.until(ExpectedConditions.alertIsPresent());
		alert = driver.switchTo().alert();
		Thread.sleep(1000);
		alert.dismiss();;
		
		p.Clickmepromptboxbtn.click();
		wait.until(ExpectedConditions.alertIsPresent());
		alert = driver.switchTo().alert();
		alert.sendKeys("Rahul.Raghuvaran");
		Thread.sleep(1000);
		alert.accept();
		
		p.Clickmepromptboxbtn.click();
		wait.until(ExpectedConditions.alertIsPresent());
		alert = driver.switchTo().alert();
		alert.sendKeys("Rahul.Raghuvaran");
		Thread.sleep(1000);
		alert.dismiss();
		
		p.AlertsFramesWindowsAccordion.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(p.FramesTab));
		p.FramesTab.click();
		p.Frame1link.click();
		p.Frame2link.click();
		
		Thread.sleep(1000);
		Object[] windowhandles3 = driver.getWindowHandles().toArray();
		driver.switchTo().window((String) windowhandles3[1]);
		driver.close();
		
		Thread.sleep(1000);
		driver.switchTo().window((String) windowhandles3[2]);
		driver.close();
		
		driver.switchTo().window((String) windowhandles3[0]);
		
		p.NestedFramesTab.click();
		p.NestedFramelink.click();
		Thread.sleep(1000);
		Object[] windowhandles4 = driver.getWindowHandles().toArray();
		driver.switchTo().window((String) windowhandles4[1]);
		driver.close();
		driver.switchTo().window((String) windowhandles4[0]);
		
		
		wait.until(ExpectedConditions.visibilityOfAllElements(p.ModalDialogsTab));
		p.AlertsFramesWindowsAccordion.click();
		p.ModalDialogsTab.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(p.Smallmodalbtn));
		p.Smallmodalbtn.click();
		robot = new Robot();
		robot.mouseMove(1050, 350);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(1000);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		p.Smallmodalclosebtn.click();
		
		Thread.sleep(1000);
		p.Largemodalbtn.click();
		robot.mouseMove(1300, 330);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(1000);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		p.Largemodalclosebtn.click();
		
		
		wait.until(ExpectedConditions.visibilityOfAllElements(p.AccordionTab));
		p.AccordionTab.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(p.WhatisLoremIpsum));
		p.WhatisLoremIpsum.click();
		Thread.sleep(1000);
		p.Whydoweuseit.click();
		Thread.sleep(1000);
		p.WherecanIgetsome.click();
		
		wait.until(ExpectedConditions.visibilityOfAllElements(p.AutoCompleteTab));
		p.AutoCompleteTab.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(p.Autocompleteinput));
		p.Autocompleteinput.sendKeys("Rahul is great");
		Thread.sleep(1000);
		
		p.DatePickerTab.click();
		p.SelectDateinput.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(p.SelectDateYearsfilter));
		p.SelectDateYearsfilter.clear();
		p.SelectDateYearsfilter.sendKeys("1987");
		Thread.sleep(1000);
		
		select = new Select(p.SelectDateMonthfilter);
		select.selectByVisibleText("April");
		p.SelectDate17Dayfilter.click();
		Thread.sleep(1000);
		
		p.SelectDateandTimeinput.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(p.SelectDateTimeYearsfilter));
		p.SelectDateTimeYearsfilter.clear();
		p.SelectDateTimeYearsfilter.sendKeys("1987");
		select = new Select(p.SelectDateTimeMonthfilter);
		select.selectByVisibleText("June");
		p.SelectDateTime02Dayfilter.click();
		p.SelectDateTimeHoursfilter.clear();
		p.SelectDateTimeHoursfilter.sendKeys("11");
		p.SelectDateTimeMinutesfilter.clear();
		p.SelectDateTimeMinutesfilter.sendKeys("22");
		if(p.SelectDateTimeAMPMfilter.getText().equalsIgnoreCase("PM")) {
			p.SelectDateTimeAMPMfilter.click();
		}
		
		p.SliderTab.click();
//		action.moveToElement(p.Slider1).clickAndHold().moveByOffset(0, 10).release();
		act = (Action) action.dragAndDropBy(p.Slider1, 10, 0).build();
		act.perform();
		
		js.executeScript("arguments[0].removeAttribute('disabled')", p.Slider2);
		action.moveToElement(p.Slider2).clickAndHold().moveByOffset(0, 10).release().build().perform();
		
		
		p.ProgressBarTab.click();
		wait.until(ExpectedConditions.elementToBeClickable(p.ProgressbarStartbtn));
		p.ProgressbarStartbtn.click();
		Thread.sleep(5000);
		p.TabsTab.click();
		p.Tab1.click();
		Thread.sleep(500);
		p.Tab2.click();
		Thread.sleep(500);
		p.Tab3.click();
		
		
		Thread.sleep(1000);
		p.TooltipsTab.click();
		action.moveToElement(p.Tooltip1).build().perform();
		Thread.sleep(1000);
		action.moveToElement(p.Tooltip2).build().perform();
		Thread.sleep(1000);
		action.moveToElement(p.Tooltip3).build().perform();
		Thread.sleep(1000);
		action.moveToElement(p.Tooltip4).build().perform();
		Thread.sleep(1000);
*/		
		p.WidgetsAccordion.click();
		p.SelectMenuTab.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(p.Multiselectdropdown));
//		p.Multiselectdropdown.click();
		select = new Select(p.Multiselectdropdown);
		select.selectByVisibleText("Movies, Music & Games");
		select.selectByVisibleText("Electronics & Computers");
		select.selectByVisibleText("Home, Garden & Tools");
		select.selectByVisibleText("Health & Beauty");
		select.selectByVisibleText("Toys, Kids & Baby");
		select.selectByVisibleText("Clothing & Jewelry");
		select.selectByVisibleText("Sports & Outdoors");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	@Then("Close the TutorialsPointClass1 website")
	public void close_the_tutorials_point_class1_website() throws InterruptedException {
	Thread.sleep(4000);	
//	driver.close();
	}
}