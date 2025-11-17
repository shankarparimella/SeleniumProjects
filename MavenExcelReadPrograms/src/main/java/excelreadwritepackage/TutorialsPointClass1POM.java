package excelreadwritepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TutorialsPointClass1POM {
	private WebDriver driver;
	TutorialsPointClass1POM(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath = "//a[@title='back to Selenium Tutorial']") WebElement SeleniumTutoriallink;
	
	@FindBy (xpath = "//button[normalize-space()='Elements']") WebElement ElementsAccordion;
	
	@FindBy (xpath = "//button[normalize-space()='Forms']") WebElement FormsAccordion;
	
	@FindBy (xpath = "//button[normalize-space()='Alerts, Frames & Windows']") WebElement AlertsFramesWindowsAccordion;
	
	@FindBy (xpath = "//button[normalize-space()='Widgets']") WebElement WidgetsAccordion;
	
	@FindBy (xpath = "//button[normalize-space()='Interaction']") WebElement InteractionAccordion;
	
	
	@FindBy (xpath = "//a[normalize-space()='Text Box']") WebElement TextBoxTab;
	
	@FindBy (xpath = "//a[normalize-space()='Check Box']") WebElement CheckBoxTab;
	
	@FindBy (xpath = "//a[normalize-space()='Radio Button']") WebElement RadioButtonTab;
	
	@FindBy (xpath = "//a[normalize-space()='Web Tables']") WebElement WebTablesTab;
	
	@FindBy (xpath = "//a[normalize-space()='Buttons']") WebElement ButtonsTab;
	
	@FindBy (xpath = "//a[normalize-space()='Links']") WebElement LinksTab;
	
	@FindBy (xpath = "//a[normalize-space()='Broken Links - Images']") WebElement BrokenLinksTab;
	
	@FindBy (xpath = "//a[normalize-space()='Upload and Download']") WebElement UploadDownloadTab;
	
	@FindBy (xpath = "//a[normalize-space()='Dynamic Properties']") WebElement DynamicPropertiesTab;
	
	@FindBy (xpath = "//a[normalize-space()='Practice Form']") WebElement PracticeFormTab;
	
	@FindBy (xpath = "//a[normalize-space()='Login']") WebElement LoginformTab;
	
	@FindBy (xpath = "//a[normalize-space()='Register']") WebElement RegiterTab;
	
	@FindBy (xpath = "//a[normalize-space()='Browser Windows']") WebElement BrowserwindowTab;
	
	@FindBy (xpath = "//a[normalize-space()='Alerts']") WebElement AlertsTab;
	
	@FindBy (xpath = "//a[normalize-space()='Frames']") WebElement FramesTab;
	
	@FindBy (xpath = "//a[normalize-space()='Nested Frames']") WebElement NestedFramesTab;
	
	@FindBy (xpath = "//a[normalize-space()='Modal Dialogs']") WebElement ModalDialogsTab;
	
	@FindBy (xpath = "//a[normalize-space()='Accordion']") WebElement AccordionTab;
	
	@FindBy (xpath = "//a[normalize-space()='Auto Complete']") WebElement AutoCompleteTab;
	
	@FindBy (xpath = "//a[normalize-space()='Date Picker']") WebElement DatePickerTab;
	
	@FindBy (xpath = "//a[normalize-space()='Slider']") WebElement SliderTab;
	
	@FindBy (xpath = "//a[normalize-space()='Progress Bar']") WebElement ProgressBarTab;
	
	@FindBy (xpath = "//a[normalize-space()='Tabs']") WebElement TabsTab;
	
	@FindBy (xpath = "//a[normalize-space()='Tool Tips']") WebElement TooltipsTab;
	
	@FindBy (xpath = "//a[normalize-space()='Menu']") WebElement MenuTab;
	
	@FindBy (xpath = "//a[normalize-space()='Select Menu']") WebElement SelectMenuTab;
	
	@FindBy (xpath = "//a[normalize-space()='Scoll Top']") WebElement ScollTopTab;
	
	@FindBy (xpath = "//a[normalize-space()='Scoll Down']") WebElement ScrollDownTab;
	
	@FindBy (xpath = "//a[normalize-space()='Horizontal Scroll']") WebElement HorizontalScrollTab;
	
	@FindBy (xpath = "//a[normalize-space()='Sortable']") WebElement SortableTab;
	
	@FindBy (xpath = "//a[normalize-space()='Selectable']") WebElement SelectableTab;
	
	@FindBy (xpath = "//a[normalize-space()='Resizable']") WebElement ResizableTab;
	
	@FindBy (xpath = "//a[normalize-space()='Droppable']") WebElement DroppableTab;
	
	@FindBy (xpath = "//a[normalize-space()='Dragabble']") WebElement DraggableTab;
	
	
	@FindBy (xpath = "//input[@id='fullname']") WebElement FullnameTextbox;
	
	@FindBy (xpath = "//input[@id='email']") WebElement EmailTextbox;
	
	@FindBy (xpath = "//textarea[@id='address']") WebElement CurrentAddressTextbox;
	
	@FindBy (xpath = "//input[@id='password']") WebElement PasswordTextbox;
	
	@FindBy (xpath = "//input[@value='Submit']") WebElement TextboxSubmitbtn;
	
	@FindBy (xpath = "(//span[contains(@class,'plus')])[1]") WebElement MainLevel1Plusbtn;
	
	@FindBy (xpath = "(//span[contains(@class,'plus')])[4]") WebElement MainLevel2Plusbtn;
	
	@FindBy (xpath = "//input[@id='c_bs_1']") WebElement MainLevel1Checkbox;
	
	@FindBy (xpath = "//input[@id='c_bs_2']") WebElement MainLevel2Checkbox;
	
	@FindBy (xpath = "//input[@id='c_bf_1']") WebElement SubLevel1Checkbox;
	
	@FindBy (xpath = "//input[@id='c_bf_2']") WebElement SubLevel2Checkbox;
	
	@FindBy (xpath = "//input[@id='c_bf_3']") WebElement SubLevel3Checkbox;
	
	@FindBy (xpath = "//input[@id='c_bf_4']") WebElement SubLevel4Checkbox;
	
	@FindBy (xpath = "//input[@value='igottwo']") WebElement YesRadiobtn;
	
	@FindBy (xpath = "//input[@value='igotthree']") WebElement ImpressiveRadiobtn;
	
	@FindBy (xpath = "//input[@name='inlineRadioOptions']") WebElement NoRadiobtn;
	
	@FindBy (xpath = "//button[normalize-space()='Add']") WebElement WebtablesAddbtn;
	
	@FindBy (xpath = "//input[@placeholder='First Name']") WebElement WebtablesFirstnametextbox;
	
	@FindBy (xpath = "//input[@placeholder='Last Name']") WebElement WebtablesLastnametextbox;
	
	@FindBy (xpath = "//input[@placeholder='Enter Email']") WebElement WebtablesEmailtextbox;
	
	@FindBy (xpath = "//input[@placeholder='Enter Age']") WebElement WebtablesAgetextbox;
	
	@FindBy (xpath = "//input[@placeholder='Enter Salary']") WebElement WebtablesSalarytextbox;
	
	@FindBy (xpath = "//input[@placeholder='Enter Department']") WebElement WebtablesDepartmenttextbox;
	
	@FindBy (xpath = "//input[@value='Login']") WebElement WebtablesLoginbtn;
	
	@FindBy (xpath = "//button[normalize-space()='Click Me']") WebElement Clickmebtn;
	
	@FindBy (xpath = "//button[normalize-space()='Right Click Me']") WebElement RightClickmebtn;
	
	@FindBy (xpath = "//button[normalize-space()='Double Click Me']") WebElement DoubleClickmebtn;
	
	@FindBy (xpath = "//a[normalize-space()='Home']") WebElement LinksHome;
	
	@FindBy (xpath = "//a[normalize-space()='HomewPWPU']") WebElement LinksHomewPWPU;
	
	@FindBy (xpath = "//a[@id='created']") WebElement LinksCreated;
	
	@FindBy (xpath = "//a[@id='no-content']") WebElement LinksNocontent;
	
	@FindBy (xpath = "//a[@id='moved']") WebElement LinksMoved;
	
	@FindBy (xpath = "//a[@id='bad-request']") WebElement LinksBadrequest;
	
	@FindBy (xpath = "//a[@id='unauthorized']") WebElement LinksUnauthorized;
	
	@FindBy (xpath = "//a[@id='forbidden']") WebElement LinksForbidden;
	
	@FindBy (xpath = "//a[@id='not-found']") WebElement LinksNotfound;
	
	@FindBy (xpath = "//a[normalize-space()='Click Here for Valid Link']") WebElement BrokenLinksValidLink;
	
	@FindBy (xpath = "//a[normalize-space()='Click Here for Broken Link']") WebElement BrokenLinksBrokenlink;
	
	@FindBy (xpath = "//a[normalize-space()='Go Back']") WebElement BrokenLinksGobacklink;
	
	@FindBy (xpath = "//a[@id='downloadButton']") WebElement Downloadbtn;
	
	@FindBy (xpath = "//input[contains(@type,'file')]") WebElement Choosefilebtn;
	
	@FindBy (xpath = "//input[@id='dob']") WebElement DateofBirthicon;
	
	@FindBy (xpath = "//input[@id='picture']") WebElement ChoosePicture;
	
	@FindBy (xpath = "//select[@id='state']") WebElement SelectStatedropdown;
	
	@FindBy (xpath = "//select[@id='city']") WebElement SelectCitydropdown;
	
	@FindBy (xpath = "//input[@id='firstname']") WebElement RegisterFirstname;
	
	@FindBy (xpath = "//input[@id='lastname']") WebElement RegisterLastname;
	
	@FindBy (xpath = "//input[@id='username']") WebElement RegisterUsername;
	
	@FindBy (xpath = "//input[@id='password']") WebElement RegisterPassword;
	
	@FindBy (xpath = "//input[@value='Register']") WebElement Registerbtn;
	
	@FindBy (xpath = "//a[@class='btn btn-primary ms-4'][contains(.,'Back to Login')]") WebElement BacktoLoginbtn;
	
	@FindBy (xpath = "//input[@id='email']") WebElement LoginEmailtxt;
	
	@FindBy (xpath = "//input[@id='password']") WebElement LoginPasswordtxt;
	
	@FindBy (xpath = "//input[@value='Login']") WebElement Loginbtn;
	
	@FindBy (xpath = "//button[@title='New Tab']") WebElement Newtabbtn;
	
	@FindBy (xpath = "//button[normalize-space()='New Window']") WebElement Newwindowbtn;
	
	@FindBy (xpath = "//button[normalize-space()='New Window Message']") WebElement Newwindowmessagebtn;
	
	@FindBy (xpath = "//button[normalize-space()='Alert']") WebElement Alertbtn;
	
	@FindBy (xpath = "//button[@onclick='myMessage()']") WebElement Clickmeafter5secbtn;
	
	@FindBy (xpath = "//button[@onclick='myDesk()']") WebElement Clickmeconfirmboxbtn;
	
	@FindBy (xpath = "//button[@onclick='myPromp()']") WebElement Clickmepromptboxbtn;
	
	@FindBy (xpath = "//a[contains(.,'Selenium Tutorial')]") WebElement Frame1link;
	
	@FindBy (xpath = "//a[contains(.,'Selenium Tutorial')]") WebElement Frame2link;
	
	@FindBy (xpath = "//a[@title='back to Selenium Tutorial']") WebElement NestedFramelink;
	
	@FindBy (xpath = "//button[normalize-space()='Small Modal']") WebElement Smallmodalbtn;
	
	@FindBy (xpath = "(//button[contains(.,'Close')])[1]") WebElement Smallmodalclosebtn;
	
	@FindBy (xpath = "//button[normalize-space()='Large Modal']") WebElement Largemodalbtn;
	
	@FindBy (xpath = "(//button[contains(.,'Close')])[2]") WebElement Largemodalclosebtn;
	
	@FindBy (xpath = "//button[normalize-space()='What is Lorem Ipsum?']") WebElement WhatisLoremIpsum;
	
	@FindBy (xpath = "//button[normalize-space()='Why do we use it?']") WebElement Whydoweuseit;
	
	@FindBy (xpath = "//button[normalize-space()='Where can I get some?']") WebElement WherecanIgetsome;
	
	@FindBy (xpath = "//input[@id='tags']") WebElement Autocompleteinput;
	
	@FindBy (xpath = "//input[@id='datetimepicker1']") WebElement SelectDateinput;
	
	@FindBy (xpath = "//input[@id='datetimepicker2']") WebElement SelectDateandTimeinput;
	
	@FindBy (xpath = "(//input[contains(@class,'numInput cur-year')])[1]") WebElement SelectDateYearsfilter;
	
	@FindBy (xpath = "(//select[@class='flatpickr-monthDropdown-months'])[1]") WebElement SelectDateMonthfilter;
	
	@FindBy (xpath = "//span[contains(@aria-label,'April 17, 1987')]") WebElement SelectDate17Dayfilter;
	
	@FindBy (xpath = "(//input[contains(@class,'numInput cur-year')])[2]") WebElement SelectDateTimeYearsfilter;
	
	@FindBy (xpath = "(//select[@class='flatpickr-monthDropdown-months'])[2]") WebElement SelectDateTimeMonthfilter;
	
	@FindBy (xpath = "//span[@aria-label='June 2, 1987']") WebElement SelectDateTime02Dayfilter;
	
	@FindBy (xpath = "(//input[contains(@aria-label,'Hour')])[2]") WebElement SelectDateTimeHoursfilter;
	
	@FindBy (xpath = "(//input[contains(@aria-label,'Minute')])[2]") WebElement SelectDateTimeMinutesfilter;
	
	@FindBy (xpath = "(//span[@class='flatpickr-am-pm'])[2]") WebElement SelectDateTimeAMPMfilter;
	
	@FindBy (xpath = "//input[@id='ageInputId']") WebElement Slider1;
	
	@FindBy (xpath = "//input[@id='disabledRange']") WebElement Slider2;
	
	@FindBy (xpath = "//button[@id='startProgressTimer']") WebElement ProgressbarStartbtn;
	
	@FindBy (xpath = "//button[@id='nav-home-tab']") WebElement Tab1;
	
	@FindBy (xpath = "//button[@id='nav-profile-tab']") WebElement Tab2;
	
	@FindBy (xpath = "//button[@id='nav-contact-tab']") WebElement Tab3;
	
	@FindBy (xpath = "//button[@title='Tooltip on top']") WebElement Tooltip1;
	
	@FindBy (xpath = "//button[@title='Tooltip on right']") WebElement Tooltip2;
	
	@FindBy (xpath = "//button[@title='Tooltip on bottom']") WebElement Tooltip3;
	
	@FindBy (xpath = "//button[@title='Tooltip on left']") WebElement Tooltip4;
	
	@FindBy (xpath = "(//span[contains(.,'Please select...')])[2]") WebElement Multiselectdropdown;
	
	@FindBy (xpath = "//select[@id='inputGroupSelect03']") WebElement Singleselectdropdown;
	/*
	@FindBy (xpath = "") WebElement ;
	
	@FindBy (xpath = "") WebElement ;
	
	@FindBy (xpath = "") WebElement ;
	
	@FindBy (xpath = "") WebElement ;
	
	@FindBy (xpath = "") WebElement ;
	
	@FindBy (xpath = "") WebElement ;
	
	@FindBy (xpath = "") WebElement ;
	
	@FindBy (xpath = "") WebElement ;
	
	@FindBy (xpath = "") WebElement ;
	
	@FindBy (xpath = "") WebElement ;
	
	@FindBy (xpath = "") WebElement ;
	
	@FindBy (xpath = "") WebElement ;
	
	@FindBy (xpath = "") WebElement ;
	
	@FindBy (xpath = "") WebElement ;
	
	@FindBy (xpath = "") WebElement ;
	
	*/
	}
