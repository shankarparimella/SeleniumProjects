package excelreadwritepackage;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TutorialsPointClass {
	String practiceurl = "https://www.tutorialspoint.com/selenium/practice/dragabble.php";
	String PracticeExpectedtitle = "Selenium Practice - Draggable", HomeExpectedtitle = "Selenium Tutorial"; 
	WebDriver driver;
	WebDriverWait wait;
	FileInputStream fi;
	FileOutputStream fo;
	XSSFWorkbook w;
	XSSFSheet s;
	Row r;
	Cell c;
	int cn, rn;
	TutorialsPointPOM p;
	Alert alt;
	Actions actions;
	JavascriptExecutor js;
	
	String Name = "Shankar", Lastname = "Rao", Email = "shankar@gmail.com", Mobile = "9998887770", DoB = "17-04-1987", Subjects = "English, Hindi, Marathi, Telugu", CurrentAddress = "Sion-Koliwada", State = "Uttar Pradesh", City = "Agra", LoginPassword = "Shankar@123";
	String Parentwindow, BrowsersNewTab, SelectDateValue = "2025-07-16 12:00";
	
	@Given("Connect to the TutorialsPoint Website")
	public void connect_to_the_tutorials_point_website() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		driver.get(practiceurl);
		Thread.sleep(2000);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		String PracticeCurrenttitle = driver.getTitle();
		System.out.println(PracticeCurrenttitle);
		Parentwindow = driver.getWindowHandle();
	}

	@And("Validate the sections in the forms")
	public void validate_the_sections_in_the_forms() throws InterruptedException {
		p = new TutorialsPointPOM(driver);
		actions = new Actions(driver);
/*		wait.until(ExpectedConditions.visibilityOfAllElements(p.SeleniumTutorial));
//		****Rework on below commented code****
		p.SeleniumTutorial.click();
		Object[] windowhandles = driver.getWindowHandles().toArray();
		Thread.sleep(1000);
		driver.switchTo().window((String) windowhandles[0]);
		Thread.sleep(1000);
*/
		p.ElementsAccordion.click();
//		****Text Box tab automation****
//		wait.until(ExpectedConditions.invisibilityOfAllElements(p.Textboxtab));
		wait.until(ExpectedConditions.visibilityOfAllElements(p.Textboxtab));
		p.Textboxtab.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(p.Fullnametextbox));
		p.Fullnametextbox.sendKeys("Shankar");
		p.Emailtextbox.sendKeys("Shankar@gmail.com");
		p.Currentaddresstextbox.sendKeys("Sion Koliwada, Antop Hill Church, Mumbai-400037, Maharashtra");
		p.Passwordtextbox.sendKeys("Shankar@123");
		Thread.sleep(1000);
		p.TextboxSubmitbtn.click();
		
//		****Check Box tab automation****
		p.ElementsAccordion.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(p.Checkboxtab));
		p.Checkboxtab.click();
		
		p.CBMainL1.click();
		Thread.sleep(500);
		p.CBSubL1.click();
		Thread.sleep(500);
		p.CBSubL2.click();
		
		p.CBMainL2.click();
		Thread.sleep(500);
		p.CBSubL3.click();
		Thread.sleep(500);
		p.CBSubL4.click();
		Thread.sleep(1000);
		
//		****Radio Button tab automation****
		p.ElementsAccordion.click();
		p.Radiobuttontab.click();
		Thread.sleep(1000);
		
		p.YesRadiobutton.click();
		p.ImpressiveRadiobutton.click();
		Thread.sleep(1000);
		
//		****Web Tables tab automation****
		p.ElementsAccordion.click();
		p.Webtablestab.click();
		Thread.sleep(500);
		p.TableAddbtn.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(p.TableFirstname));
		p.TableFirstname.sendKeys("Shankar");
		Thread.sleep(500);
		p.TableLastname.sendKeys("Acharya");
		Thread.sleep(500);
		p.TableEmail.sendKeys("ShankarAcharya@gmail.com");
		Thread.sleep(500);
		p.TableAge.sendKeys("4000");
		Thread.sleep(500);
		p.TableSalary.sendKeys("100001234567890123456");
		Thread.sleep(500);
		p.TableDepartment.sendKeys("IT");
		Thread.sleep(1000);
		p.TableLoginbtn.click();
		
		Thread.sleep(1000);
		
//		****Buttons tab automation****
		p.ElementsAccordion.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(p.Buttonstab));
		p.Buttonstab.click();
		Thread.sleep(500);
		p.Clickmebtn.click();
		Thread.sleep(1000);
		
		Actions a = new Actions(driver);
//		a.contextClick(p.RightClickmebtn).build().perform();
//		Thread.sleep(1000);
		a.doubleClick(p.DoubleClickmebtn).build().perform();
		Thread.sleep(1000);
		
//		****Links tab automation****
		wait.until(ExpectedConditions.visibilityOfAllElements(p.Linkstab));
		p.Linkstab.click();
		Thread.sleep(500);
		p.LinkCreadted.click();
		Thread.sleep(500);
		p.LinkNocontent.click();
		Thread.sleep(500);
		p.LinkMoved.click();
		Thread.sleep(500);
		p.LinkBadrequest.click();
		Thread.sleep(500);
		p.LinkUnauthorized.click();
		Thread.sleep(500);
		p.LinkForbidden.click();
		Thread.sleep(500);
		p.LinkNotfound.click();
		Thread.sleep(500);
		
//		****BrokenLinks tab automation****
		wait.until(ExpectedConditions.visibilityOfAllElements(p.Brokenlinkstab));
		p.Brokenlinkstab.click();
		Thread.sleep(1000);
		
		p.ClickHereforValidLink.click();
		p.ClickHereforBrokenLink.click();
		Thread.sleep(1000);
		p.ClickHereforGoBack.click();
		Thread.sleep(1000);
		
//		****Upload and Download automation****
		p.ElementsAccordion.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(p.Uploaddownloadtab));
		p.Uploaddownloadtab.click();
		Thread.sleep(500);
		
		p.Downloadbtn.click();
//		p.Choosefilebtn.click();
		
//		WebElement choosefile = driver.findElement(By.xpath("//input[@type='file']"));
		p.FileType.sendKeys("D:\\@ Selenium\\Test Files\\Test-Wordfile.docx");
		
		Thread.sleep(1000);
		
//		****Form automation****
		p.FormsAccordion.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(p.PracticeFormTab));
		p.PracticeFormTab.click();
		
		p.Nametxt.sendKeys(Name);
		p.Emailtextbox.sendKeys(Email);
		p.Maleradio.click();
		p.Mobiletxt.sendKeys(Mobile);
		p.DoBbtn.sendKeys(DoB);
		p.Subjecttxt.sendKeys(Subjects);
		p.SportsCheckbox.click();
		p.ReadingCheckbox.click();
		p.MusicCheckbox.click();
		p.Browsbtn.sendKeys("D:\\@ Selenium\\Pics\\cartoon3.jpg");
		p.CurrectAddresstxt.sendKeys(CurrentAddress);
		
		Select s1 = new Select(p.Statedrop);
		s1.selectByVisibleText(State);
		Select s2 = new Select(p.Citydrop);
		s2.selectByVisibleText(City);
		
		Thread.sleep(1000);
		
		p.FormsAccordion.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(p.LoginTab));
		p.LoginTab.click();
		
		p.LoginEmailtxt.sendKeys(Email);
		p.LoginPasswordtxt.sendKeys(LoginPassword);
		Thread.sleep(500);
		p.Loginbtn.click();
		
		Thread.sleep(1000);
		
//		****Registration Form Automation****
		p.FormsAccordion.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(p.RegisterTab));
		p.RegisterTab.click();
		
		p.RegisterFirstnametxt.sendKeys(Name);
		p.RegisterLastnametxt.sendKeys(Lastname);
		p.RegisterUsernametxt.sendKeys(Email);
		p.RegisterPasswordtxt.sendKeys(LoginPassword);
		Thread.sleep(500);
		p.Registerbtn.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(p.BacktoLoginbtn));
		p.BacktoLoginbtn.click();
		
		Thread.sleep(1000);

//		****Rework on below commented code****
//		
//		p.AlertsAccordion.click();
//		p.BrowsersWindowsTab.click();
//		
//		p.BrowsersNewTab.click();
//		Thread.sleep(1000);
//		
//		Object[] Windowhandle1 = driver.getWindowHandles().toArray();
//		driver.switchTo().window((String) Windowhandle1[0]);
//		Thread.sleep(1000);
//		
//		driver.switchTo().window((String) windowhandles1[1]);
//		driver.close();
//		
//		driver.switchTo().window(Parentwindow);
//		driver.switchTo().window((String) windowhandles1[0]);
//		p.BrowsersNewWindow.click();
//		
//		driver.switchTo().window(Parentwindow);
//		driver.switchTo().window((String) windowhandles1[0]);
//		Thread.sleep(1000);
//		
//		p.BrowsersNewWindowMessage.click();
//		driver.switchTo().window(Parentwindow);
//		driver.switchTo().window((String) windowhandles1[0]);
//		Thread.sleep(1000);
		
//		****Alerts Automation****
		p.AlertsAccordion.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(p.AlertsTab));
		p.AlertsTab.click();
		p.Alertboxbtn.click();
		Thread.sleep(500);
		wait.until(ExpectedConditions.alertIsPresent());
		alt = driver.switchTo().alert();
		alt.accept();
		
		p.Alertbox5secbtn.click();
//		Thread.sleep(6000);
		wait.until(ExpectedConditions.alertIsPresent());
		alt = driver.switchTo().alert();
		Thread.sleep(500);
		alt.accept();
		Thread.sleep(500);
		
		p.AlertConfirmboxbtn.click();
//		Thread.sleep(1000);
		wait.until(ExpectedConditions.alertIsPresent());
		alt = driver.switchTo().alert();
		Thread.sleep(500);
		alt.accept();
		Thread.sleep(500);
		p.AlertConfirmboxbtn.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.alertIsPresent());
		alt = driver.switchTo().alert();
		Thread.sleep(500);
		alt.dismiss();
		Thread.sleep(500);
		
		p.AlertPromptboxbtn.click();
//		Thread.sleep(1000);
		wait.until(ExpectedConditions.alertIsPresent());
		alt = driver.switchTo().alert();
		Thread.sleep(500);
		alt.dismiss();
		Thread.sleep(500);
		p.AlertPromptboxbtn.click();
		wait.until(ExpectedConditions.alertIsPresent());
		alt = driver.switchTo().alert();
		Thread.sleep(500);
		alt.accept();
		Thread.sleep(500);

//		****Frames Automation****
		p.AlertsAccordion.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(p.FrameTab));
		p.FrameTab.click();
		Thread.sleep(1000);
		p.Frame1SeleniumTutorial.click();
		Thread.sleep(500);
		p.Frame2SeleniumTutorial.click();
		Thread.sleep(500);

		p.NestedFrameTab.click();
		Thread.sleep(500);
		p.NestedFrame1SeleniumTutorial.click();
		Thread.sleep(500);
		
		Object[] windowhandles2 = driver.getWindowHandles().toArray();
		driver.switchTo().window((String) windowhandles2[3]);
		driver.close();

		driver.switchTo().window((String) windowhandles2[2]);
		driver.close();

		driver.switchTo().window((String) windowhandles2[1]);
		driver.close();

		driver.switchTo().window((String) windowhandles2[0]);

		
//		****Below code is unsuccessful****
//		p.AlertsAccordion.click();
//		p.ModalDialogsTab.click();
//		p.SmallModel.click();
//		Thread.sleep(1000);
//		
//		Set<String> windowhandles = driver.getWindowHandles();
//		for (String handle: windowhandles) {
//		    if (!handle.equals(Parentwindow)) {
//		        driver.switchTo().window(handle);
//		        break;
//		    }
//		}
//		driver.close();
//		driver.switchTo().window(Parentwindow);
//		
//		p.LargeModel.click();
//		Thread.sleep(1000);
		

//		****Accordions Automation****
		p.WidgetsAccordion.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(p.AccordionTab));
		p.AccordionTab.click();
		Thread.sleep(500);
		p.AccordionLoremIpsum.click();
		Thread.sleep(500);
		p.AccordionGetSome.click();
		Thread.sleep(500);
		p.AccordionUseIt.click();
		Thread.sleep(1000);
		
		p.WidgetsAccordion.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(p.AutoCompleteTab));
		p.AutoCompleteTab.click();
		p.AutoCompleteTag.sendKeys(Name);
		Thread.sleep(1000);

//		****Datefields Automation****
		p.WidgetsAccordion.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(p.DatePickerTab));
		p.DatePickerTab.click();
		p.SelectDateField.click();
		Thread.sleep(1000);
		
//		p.SelectYear1.sendKeys("2000");
		Select month1 = new Select(p.SelectMonth1);
		month1.selectByVisibleText("January");
		p.SelectDate1.click();

		p.SelectDateTimeField.click();
		Thread.sleep(1000);
		
		Select Month2 = new Select(p.SelectMonth2);
		Month2.selectByVisibleText("February");
		p.SelectDate2.click();

		
		p.WidgetsAccordion.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(p.SliderTab));
		p.SliderTab.click();
		
		Actions moveslider = new Actions(driver);
//		****Alternate Code****
//		actions = moveslider.dragAndDropBy(p.SliderField, 40, 0).build();
//		actions.perform();
		
//		****Alternate Code****
//		new Actions(driver).dragAndDropBy(p.SliderField, 20, 0).perform();
		
//		****Alternate Code****
		int numberofpixels = 5;
		moveslider.moveToElement(p.SliderField).clickAndHold().moveByOffset(0, numberofpixels).release().perform();
		
		Thread.sleep(1000);

//		****ProgressBar Automation****
		p.WidgetsAccordion.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(p.ProgressBarTab));
		p.ProgressBarTab.click();
		p.ProgressBarStartbtn.click();
		Thread.sleep(4000);
//		String progressbarvalue = p.ProgressBarStriped.getText();
//		System.out.println(progressbarvalue);
		Thread.sleep(1000);

//		****Menu Tabs Automation****
		p.WidgetsAccordion.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(p.TabsTab));
		p.TabsTab.click();
		p.HomeTab.click();
		Thread.sleep(1000);
		p.ProfileTab.click();
		Thread.sleep(1000);
		p.ContactTab.click();
		
		Thread.sleep(1000);

//		****Tool-tips Automation****
		p.WidgetsAccordion.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(p.TooltipsTab));
		p.TooltipsTab.click();
		actions.moveToElement(p.TooltipOnTop);
		actions.build().perform();
		Thread.sleep(1000);
		actions.moveToElement(p.TooltipOnRight).build().perform();
		Thread.sleep(1000);
		actions.moveToElement(p.TooltipOnBottom).build().perform();
		Thread.sleep(1000);
		actions.moveToElement(p.TooltipOnLeft).build().perform();
		Thread.sleep(1000);

		p.WidgetsAccordion.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(p.MenuTab));
		p.MenuTab.click();
		actions.moveToElement(p.MenuNavbar).build().perform();
		Thread.sleep(1000);

//		****Select Menu Automation****
		p.WidgetsAccordion.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(p.SelectMenuTab));
		p.SelectMenuTab.click();
		p.MultiSelectMenu.click();
//		wait.until(ExpectedConditions.elementToBeSelected(p.MultiSelectValue1));
		wait.until(ExpectedConditions.visibilityOfAllElements(p.MultiSelectValue1));
		p.MultiSelectValue1.click();
//		p.MultiSelectMenu.sendKeys(Keys.ESCAPE);

		Select singleselect = new Select(p.SingleSelectMenu);
		singleselect.selectByVisibleText("Ms.");
		p.SingleSelectMenu.sendKeys(Keys.ESCAPE);

//		****Alternate Code****
//		p.MultiSelectValue2.click();
//		p.MultiSelectValue3.click();
//		p.MultiSelectValue4.click();
//		p.MultiSelectValue5.click();
//		p.MultiSelectValue6.click();
		
//		Select dropdownlist = new Select(p.MultiSelectMenu);
//		dropdownlist.selectByIndex(0);
//		dropdownlist.selectByVisibleText("Books");
//		dropdownlist.selectByValue("Books");
		
//		p.MultiSelectMenu.click();
//		List<WebElement> dropdownlist = p.MultiSelectMenu.findElements(By.xpath("//div[@tabindex]"));
//		dropdownlist.get(0).click();
		
//		Select multiselect = new Select(p.MultiSelectMenu);
//		multiselect.selectByVisibleText("Clothing & Jewelry");
		Thread.sleep(1000);


//		****ScrollBar Automation****
		p.WidgetsAccordion.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(p.ScrollTopTab));
		p.ScrollTopTab.click();
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(1000);
		p.JumpTopbtn.click();
		Thread.sleep(1000);

		p.WidgetsAccordion.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(p.ScrollDownTab));
		p.ScrollDownTab.click();
		p.Jumpdownbtn.click();
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-1000)", "");
		Thread.sleep(1000);

//		****Rework on below commented code****
		
		p.WidgetsAccordion.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(p.HorizontalScrollTab));
		p.HorizontalScrollTab.click();
		p.ScrollWindow.click();
//		driver.switchTo().frame(p.ScrollWindow);
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(100, 100)", "");
		Thread.sleep(1000);


//		****Sorting Automation****
		p.InteractionAccordion.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(p.SortableTab));
		p.SortableTab.click();
		p.SortableListTab.click();
		actions.dragAndDrop(p.SortableList2, p.SortableList1).build().perform();
		Thread.sleep(1000);
		actions.dragAndDrop(p.SortableList3, p.SortableList1).build().perform();
		Thread.sleep(1000);
		actions.dragAndDrop(p.SortableList3, p.SortableList2).build().perform();
		Thread.sleep(1000);

		wait.until(ExpectedConditions.visibilityOfAllElements(p.SortableGridTab));
		p.SortableGridTab.click();
		actions.dragAndDrop(p.Thumbnail6, p.Thumbnail1).build().perform();
		Thread.sleep(500);
		actions.dragAndDrop(p.Thumbnail5, p.Thumbnail1).build().perform();
		Thread.sleep(500);
		actions.dragAndDrop(p.Thumbnail4, p.Thumbnail1).build().perform();
		Thread.sleep(500);
		actions.dragAndDrop(p.Thumbnail3, p.Thumbnail1).build().perform();
		Thread.sleep(500);
		actions.dragAndDrop(p.Thumbnail2, p.Thumbnail1).build().perform();
		Thread.sleep(1000);

		p.InteractionAccordion.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(p.SelectableTab));
		p.SelectableTab.click();
		p.SelectableListItem1.click();
		Thread.sleep(500);
		p.SelectableListItem2.click();
		Thread.sleep(500);
		p.SelectableListItem3.click();
		Thread.sleep(500);
		p.SelectableListItem4.click();
		Thread.sleep(500);
		p.SelectableListItem5.click();
		Thread.sleep(500);
		p.SelectableListItem6.click();
		Thread.sleep(1000);
		
		wait.until(ExpectedConditions.visibilityOfAllElements(p.SelectableGridTab));
		p.SelectableGridTab.click();
		p.Gridbtn1.click();
		Thread.sleep(500);
		p.Gridbtn2.click();
		Thread.sleep(500);
		p.Gridbtn3.click();
		Thread.sleep(500);
		p.Gridbtn4.click();
		Thread.sleep(500);
		p.Gridbtn5.click();
		Thread.sleep(500);
		p.Gridbtn6.click();

		p.InteractionAccordion.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(p.ResizableTab));
		p.ResizableTab.click();
		
//		****Below Codes not worked****
//		actions.dragAndDropBy(p.ResizableSection1, 100, 10).build().perform();
		
//		actions.moveToElement(p.ResizableSection1, width, 1);
//		actions.clickAndHold(p.ResizableSection1).moveByOffset(10, 10).release();
//		actions.build().perform();
		
//		WebElement ResizableSection1 = driver.findElement(By.cssSelector("//div[contains(@class,'both selector')]"));
//		actions.clickAndHold(ResizableSection1)
//		.dragAndDropBy(ResizableSection1, 100, 100)
//		.release()
//		.perform();

		
//		Dimension dim1 = new Dimension(100, 100);
//		driver.switchTo().frame(p.ResizableSection1);
//		driver.manage().window().setSize(dim1);
	
//		****Drag and Drop Automation****
		p.InteractionAccordion.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(p.DroppableTab));
		p.DroppableTab.click();
		Thread.sleep(1000);
		actions.dragAndDrop(p.SimpleDragmeelement, p.SimpleDrophereelment).build().perform();
		Thread.sleep(1000);

		p.AcceptChildTab.click();
		Thread.sleep(500);
		actions.dragAndDrop(p.AcceptDragmeelement, p.AcceptDrophereelment).build().perform();
		Thread.sleep(1000);

		p.PreventChildTab.click();
		Thread.sleep(1000);
		p.RevertDroppableChildTab.click();

		p.InteractionAccordion.click();
		p.DraggableTab.click();
		Thread.sleep(1000);
		actions.dragAndDropBy(p.Dragmearoundelement, 100, 100).build().perform();
		Thread.sleep(1000);
		p.AxisChildTab.click();
		Thread.sleep(500);
		actions.dragAndDropBy(p.Xaxiselement, 100, 100).build().perform();
		Thread.sleep(500);
		actions.dragAndDropBy(p.Yaxiselement, 100, 100).build().perform();
		Thread.sleep(1000);
		p.ContainerChildTab.click();
		Thread.sleep(500);
		actions.dragAndDropBy(p.ContainerDraggableelement, 100, 100).build().perform();
		
		
	}

	@When("Update the result in the report")
	public void update_the_result_in_the_report() {
		
	}

	@Then("Close the driver and browser")
	public void close_the_driver_and_browser() {
		
	}
}