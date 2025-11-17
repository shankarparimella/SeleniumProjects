package excelreadwritepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TutorialsPointPOM {
	private WebDriver driver;
	TutorialsPointPOM(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//input[@type='file']") WebElement FileType;

	@FindBy (xpath = "//a[@title='back to Selenium Tutorial']") WebElement SeleniumTutorial;
	
	@FindBy (xpath = "//button[normalize-space()='Elements']") WebElement ElementsAccordion;
	
	@FindBy (xpath = "//a[normalize-space()='Text Box']") WebElement Textboxtab;
	
	@FindBy (xpath = "//a[normalize-space()='Check Box']") WebElement Checkboxtab;
	
	@FindBy (xpath = "//a[normalize-space()='Radio Button']") WebElement Radiobuttontab;
	
	@FindBy (xpath = "//a[normalize-space()='Web Tables']") WebElement Webtablestab;
	
	@FindBy (xpath = "//a[normalize-space()='Buttons']") WebElement Buttonstab;
	
	@FindBy (xpath = "//a[normalize-space()='Links']") WebElement Linkstab;
	
	@FindBy (xpath = "//a[normalize-space()='Broken Links - Images']") WebElement Brokenlinkstab;
	
	@FindBy (xpath = "//a[normalize-space()='Upload and Download']") WebElement Uploaddownloadtab;
	
	@FindBy (xpath = "//a[normalize-space()='Dynamic Properties']") WebElement Dynamicpropertytab;
	
	@FindBy (xpath = "//input[@id='fullname']") WebElement Fullnametextbox;
	
	@FindBy (xpath = "//input[@id='email']") WebElement Emailtextbox;
	
	@FindBy (xpath = "//textarea[@id='address']") WebElement Currentaddresstextbox;
	
	@FindBy (xpath = "//input[@id='password']") WebElement Passwordtextbox;
	
	@FindBy (xpath = "//input[@value='Submit']") WebElement TextboxSubmitbtn;
	
	@FindBy (xpath = "(//span[@class='plus'])[1]") WebElement CBMainL1;
	
	@FindBy (xpath = "//input[@id='c_bf_1']") WebElement CBSubL1;
	
	@FindBy (xpath = "//input[@id='c_bf_2']") WebElement CBSubL2;
	
	@FindBy (xpath = "(//span[@class='plus'])[3]") WebElement CBMainL2;
	
	@FindBy (xpath = "//input[@id='c_bf_3']") WebElement CBSubL3;
	
	@FindBy (xpath = "//input[@id='c_bf_4']") WebElement CBSubL4;
	
	@FindBy (xpath = "//input[@value='igottwo']") WebElement YesRadiobutton;
	
	@FindBy (xpath = "//input[@value='igotthree']") WebElement ImpressiveRadiobutton;
	
	@FindBy (xpath = "//button[contains(.,'Add')]") WebElement TableAddbtn;
	
	@FindBy (xpath = "//input[@placeholder='First Name']") WebElement TableFirstname;
	
	@FindBy (xpath = "//input[@placeholder='Last Name']") WebElement TableLastname;
	
	@FindBy (xpath = "//input[@placeholder='Enter Email']") WebElement TableEmail;
	
	@FindBy (xpath = "//input[@placeholder='Enter Age']") WebElement TableAge;
	
	@FindBy (xpath = "//input[@placeholder='Enter Salary']") WebElement TableSalary;
	
	@FindBy (xpath = "//input[@placeholder='Enter Department']") WebElement TableDepartment;
	
	@FindBy (xpath = "//input[@value='Login']") WebElement TableLoginbtn;
	
	@FindBy (xpath = "//button[normalize-space()='Click Me']") WebElement Clickmebtn;
	
	@FindBy (xpath = "//button[normalize-space()='Right Click Me']") WebElement RightClickmebtn;
	
	@FindBy (xpath = "//button[normalize-space()='Double Click Me']") WebElement DoubleClickmebtn;
	
	@FindBy (xpath = "//a[@id='created']") WebElement LinkCreadted;
	
	@FindBy (xpath = "//a[@id='no-content']") WebElement LinkNocontent;
	
	@FindBy (xpath = "//a[@id='moved']") WebElement LinkMoved;
	
	@FindBy (xpath = "//a[@id='bad-request']") WebElement LinkBadrequest;
	
	@FindBy (xpath = "//a[@id='unauthorized']") WebElement LinkUnauthorized;
	
	@FindBy (xpath = "//a[@id='forbidden']") WebElement LinkForbidden;
	
	@FindBy (xpath = "//a[@id='not-found']") WebElement LinkNotfound;
	
	@FindBy (xpath = "//a[normalize-space()='Click Here for Valid Link']") WebElement ClickHereforValidLink;
	
	@FindBy (xpath = "//a[normalize-space()='Click Here for Broken Link']") WebElement ClickHereforBrokenLink;
	
	@FindBy (xpath = "//a[normalize-space()='Go Back']") WebElement ClickHereforGoBack;
	
	@FindBy (xpath = "//a[@id='downloadButton']") WebElement Downloadbtn;
	
	@FindBy (xpath = "//input[@id='uploadFile']") WebElement Choosefilebtn;
	
	@FindBy (xpath = "//button[normalize-space()='Forms']") WebElement FormsAccordion;
	
	@FindBy (xpath = "//a[normalize-space()='Practice Form']") WebElement PracticeFormTab;
	
	@FindBy (xpath = "//input[@id='name']") WebElement Nametxt;
	
	@FindBy (xpath = "//input[@id='email']") WebElement Emailtxt;
	
	@FindBy (xpath = "//input[@id='gender']") WebElement Maleradio;
	
	@FindBy (xpath = "//input[@id='mobile']") WebElement Mobiletxt;

	@FindBy (xpath = "//input[@id='dob']") WebElement DoBbtn;

//	@FindBy (xpath = "") WebElement ;

//	@FindBy (xpath = "") WebElement ;

	@FindBy (xpath = "//input[@id='subjects']") WebElement Subjecttxt;

	@FindBy (xpath = "//input[@id='hobbies']") WebElement SportsCheckbox;

	@FindBy (xpath = "(//input[@type='checkbox'])[2]") WebElement ReadingCheckbox;

	@FindBy (xpath = "(//input[@type='checkbox'])[3]") WebElement MusicCheckbox;

	@FindBy (xpath = "//input[@type='file']") WebElement Browsbtn;

	@FindBy (xpath = "//textarea[@name='picture']") WebElement CurrectAddresstxt;

	@FindBy (xpath = "//select[@id='state']") WebElement Statedrop;

	@FindBy (xpath = "//select[@id='city']") WebElement Citydrop;

	@FindBy (xpath = "//a[normalize-space()='Login']") WebElement LoginTab;

	@FindBy (xpath = "//input[@id='email']") WebElement LoginEmailtxt;

	@FindBy (xpath = "//input[@id='password']") WebElement LoginPasswordtxt;

	@FindBy (xpath = "//input[@value='Login']") WebElement Loginbtn;

	@FindBy (xpath = "//a[normalize-space()='Register']") WebElement RegisterTab;

	@FindBy (xpath = "//input[@id='firstname']") WebElement RegisterFirstnametxt;

	@FindBy (xpath = "//input[@id='lastname']") WebElement RegisterLastnametxt;

	@FindBy (xpath = "//input[@id='username']") WebElement RegisterUsernametxt;

	@FindBy (xpath = "//input[@id='password']") WebElement RegisterPasswordtxt;

	@FindBy (xpath = "//input[@type='submit']") WebElement Registerbtn;
	
	@FindBy (xpath = "//a[@type='submit']") WebElement BacktoLoginbtn;
	
	@FindBy (xpath = "//button[normalize-space()='Alerts, Frames & Windows']") WebElement AlertsAccordion;

	@FindBy (xpath = "//a[normalize-space()='Browser Windows']") WebElement BrowsersWindowsTab;

	@FindBy (xpath = "//button[@title='New Tab']") WebElement BrowsersNewTab;

	@FindBy (xpath = "//button[normalize-space()='New Window']") WebElement BrowsersNewWindow;

	@FindBy (xpath = "//button[normalize-space()='New Window Message']") WebElement BrowsersNewWindowMessage;

	@FindBy (xpath = "//a[normalize-space()='Alerts']") WebElement AlertsTab;

	@FindBy (xpath = "//button[normalize-space()='Alert']") WebElement Alertboxbtn;

	@FindBy (xpath = "//button[@onclick='myMessage()']") WebElement Alertbox5secbtn;

	@FindBy (xpath = "//button[@onclick='myDesk()']") WebElement AlertConfirmboxbtn;

	@FindBy (xpath = "//button[@onclick='myPromp()']") WebElement AlertPromptboxbtn;

	@FindBy (xpath = "//a[@href='frames.php']") WebElement FrameTab;

	@FindBy (xpath = "//a[contains(@title,'back to Selenium Tutorial')]") WebElement Frame1SeleniumTutorial;

	@FindBy (xpath = "//a[contains(@title,'back to Selenium Tutorial')]") WebElement Frame2SeleniumTutorial;

	@FindBy (xpath = "//a[normalize-space()='Nested Frames']") WebElement NestedFrameTab;

	@FindBy (xpath = "//a[@title='back to Selenium Tutorial']") WebElement NestedFrame1SeleniumTutorial;

	@FindBy (xpath = "//a[contains(.,'Modal Dialogs')]") WebElement ModalDialogsTab;

	@FindBy (xpath = "//button[normalize-space()='Small Modal']") WebElement SmallModel;

	@FindBy (xpath = "//button[normalize-space()='Large Modal']") WebElement SmallModelpopup;

	@FindBy (xpath = "//button[normalize-space()='Large Modal']") WebElement LargeModel;

	@FindBy (xpath = "(//button[@class='btn btn-primary'])[4]") WebElement LargeModelpopup;

	@FindBy (xpath = "//button[normalize-space()='Widgets']") WebElement WidgetsAccordion;

	@FindBy (xpath = "//a[normalize-space()='Accordion']") WebElement AccordionTab;

	@FindBy (xpath = "//button[normalize-space()='What is Lorem Ipsum?']") WebElement AccordionLoremIpsum;

	@FindBy (xpath = "//button[normalize-space()='Why do we use it?']") WebElement AccordionUseIt;

	@FindBy (xpath = "//button[normalize-space()='Where can I get some?']") WebElement AccordionGetSome;

	@FindBy (xpath = "//a[normalize-space()='Auto Complete']") WebElement AutoCompleteTab;

	@FindBy (xpath = "//input[@id='tags']") WebElement AutoCompleteTag;

	@FindBy (xpath = "//a[normalize-space()='Date Picker']") WebElement DatePickerTab;

	@FindBy (xpath = "//input[@id='datetimepicker1']") WebElement SelectDateField;

	@FindBy (xpath = "(//input[@class='numInput cur-year'])[1]") WebElement SelectYear1;

	@FindBy (xpath = "(//select[contains(@aria-label,'Month')])[1]") WebElement SelectMonth1;

	@FindBy (xpath = "(//span[@class='flatpickr-day'][contains(.,'17')])[1]") WebElement SelectDate1;

	@FindBy (xpath = "//input[@id='datetimepicker2']") WebElement SelectDateTimeField;
	
	@FindBy (xpath = "(//select[@class='flatpickr-monthDropdown-months'])[2]") WebElement SelectMonth2;

	@FindBy (xpath = "//span[@aria-label='February 18, 2025']") WebElement SelectDate2;

	@FindBy (xpath = "//a[normalize-space()='Slider']") WebElement SliderTab;

	@FindBy (xpath = "//input[@id='ageInputId']") WebElement SliderField;

	@FindBy (xpath = "//a[normalize-space()='Progress Bar']") WebElement ProgressBarTab;

	@FindBy (xpath = "//button[@id='startProgressTimer']") WebElement ProgressBarStartbtn;
	
	@FindBy (xpath = "//div[@class='progress active progress-striped']") WebElement ProgressBarStriped;
	
	@FindBy (xpath = "//a[normalize-space()='Tabs']") WebElement TabsTab;

	@FindBy (xpath = "//button[@id='nav-home-tab']") WebElement HomeTab;

	@FindBy (xpath = "//button[@id='nav-profile-tab']") WebElement ProfileTab;

	@FindBy (xpath = "//button[@id='nav-contact-tab']") WebElement ContactTab;

	@FindBy (xpath = "//a[normalize-space()='Tool Tips']") WebElement TooltipsTab;

	@FindBy (xpath = "//button[@title='Tooltip on top']") WebElement Tooltip;

	@FindBy (xpath = "//button[@title='Tooltip on top']") WebElement TooltipOnTop;

	@FindBy (xpath = "//button[@title='Tooltip on right']") WebElement TooltipOnRight;

	@FindBy (xpath = "//button[@title='Tooltip on bottom']") WebElement TooltipOnBottom;

	@FindBy (xpath = "//button[@title='Tooltip on left']") WebElement TooltipOnLeft;

	@FindBy (xpath = "//a[normalize-space()='Menu']") WebElement MenuTab;

	@FindBy (xpath = "//a[@class='navbar-brand']") WebElement MenuNavbar;

	@FindBy (xpath = "//a[@role='button']") WebElement MenuDropdown;

	@FindBy (xpath = "//a[normalize-space()='Select Menu']") WebElement SelectMenuTab;

	@FindBy (xpath = "(//span[contains(.,'Please select...')])[2]") WebElement MultiSelectMenu;

	@FindBy (xpath = "//div[@tabindex='0']") WebElement MultiSelectValue1;
	
//	@FindBy (xpath = "//div[@tabindex='1']") WebElement MultiSelectValue2;
//
//	@FindBy (xpath = "//div[@tabindex='2']") WebElement MultiSelectValue3;
//
//	@FindBy (xpath = "//div[@tabindex='3']") WebElement MultiSelectValue4;
//
//	@FindBy (xpath = "//div[@tabindex='4']") WebElement MultiSelectValue5;
//
//	@FindBy (xpath = "//div[@tabindex='5']") WebElement MultiSelectValue6;

	@FindBy (xpath = "//select[@id='inputGroupSelect03']") WebElement SingleSelectMenu;

	@FindBy (xpath = "//a[normalize-space()='Scoll Top']") WebElement ScrollTopTab;

	@FindBy (xpath = "//button[@id='btn-back-to-top']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]") WebElement JumpTopbtn;

	@FindBy (xpath = "//a[normalize-space()='Scoll Down']") WebElement ScrollDownTab;

	@FindBy (xpath = "//a[@class='scrollDown btn btn-primary btn-floating btn-lg']") WebElement Jumpdownbtn;

	@FindBy (xpath = "//a[normalize-space()='Horizontal Scroll']") WebElement HorizontalScrollTab;

//	@FindBy (xpath = "//div[@class='horizan-scroll']//p//img") WebElement ScrollWindow;
	
	@FindBy (xpath = "//img[@src='images/001.jpg']") WebElement ScrollWindow;

//	@FindBy (xpath = "(//p[contains(@class,'text-justify')])[1]") WebElement ScrollWindow;

	@FindBy (xpath = "//button[normalize-space()='Interaction']") WebElement InteractionAccordion;

	@FindBy (xpath = "//a[normalize-space()='Sortable']") WebElement SortableTab;

	@FindBy (xpath = "//button[@id='nav-home-tab']") WebElement SortableListTab;

	@FindBy (xpath = "//button[@id='nav-profile-tab']") WebElement SortableGridTab;

	@FindBy (xpath = "//td[normalize-space()='1']//span[@class='glyphicon glyphicon-move']//*[name()='svg']") WebElement SortableList1;

	@FindBy (xpath = "//td[normalize-space()='2']//span[@class='glyphicon glyphicon-move']//*[name()='svg']") WebElement SortableList2;

	@FindBy (xpath = "//td[normalize-space()='3']//span[@class='glyphicon glyphicon-move']//*[name()='svg']") WebElement SortableList3;

	@FindBy (xpath = "//h3[normalize-space()='Thumbnail label 1']") WebElement Thumbnail1;

	@FindBy (xpath = "//h3[normalize-space()='Thumbnail label 2']") WebElement Thumbnail2;

	@FindBy (xpath = "//h3[normalize-space()='Thumbnail label 3']") WebElement Thumbnail3;

	@FindBy (xpath = "//h3[normalize-space()='Thumbnail label 4']") WebElement Thumbnail4;

	@FindBy (xpath = "//h3[normalize-space()='Thumbnail label 5']") WebElement Thumbnail5;

	@FindBy (xpath = "//h3[normalize-space()='Thumbnail label 6']") WebElement Thumbnail6;

	@FindBy (xpath = "//a[normalize-space()='Selectable']") WebElement SelectableTab;

	@FindBy (xpath = "//button[@id='nav-home-tab']") WebElement SelectableListTab;

	@FindBy (xpath = "//button[@id='nav-profile-tab']") WebElement SelectableGridTab;

	@FindBy (xpath = "//li[contains(text(),'It is a long established fact that a reader will b')]") WebElement SelectableListItem1;

	@FindBy (xpath = "//li[contains(text(),'Many desktop publishing packages and web page edit')]") WebElement SelectableListItem2;

	@FindBy (xpath = "//li[contains(text(),'sometimes by accident, sometimes on purpose (injec')]") WebElement SelectableListItem3;

	@FindBy (xpath = "//li[contains(text(),'Richard McClintock, a Latin professor at Hampden-S')]") WebElement SelectableListItem4;

	@FindBy (xpath = "//div[@id='nav-home']//li[5]") WebElement SelectableListItem5;

	@FindBy (xpath = "//div[@id='nav-home']//li[6]") WebElement SelectableListItem6;

	@FindBy (xpath = "//li[normalize-space()='1']") WebElement Gridbtn1;

	@FindBy (xpath = "//li[normalize-space()='2']") WebElement Gridbtn2;

	@FindBy (xpath = "//li[normalize-space()='3']") WebElement Gridbtn3;

	@FindBy (xpath = "//li[normalize-space()='4']") WebElement Gridbtn4;

	@FindBy (xpath = "//li[normalize-space()='5']") WebElement Gridbtn5;

	@FindBy (xpath = "//li[normalize-space()='6']") WebElement Gridbtn6;

	@FindBy (xpath = "//a[normalize-space()='Resizable']") WebElement ResizableTab;

	@FindBy (xpath = "//div[@class='both selector']") WebElement ResizableSection1;

	@FindBy (xpath = "//div[@class='flex-box']//div[contains(text(),'It is a long established fact that a reader will b')]") WebElement ResizableSection2;

	@FindBy (xpath = "//a[normalize-space()='Droppable']") WebElement DroppableTab;

	@FindBy (xpath = "//button[@id='nav-home-tab']") WebElement SimpleChildTab;

	@FindBy (xpath = "//div[@id='draggable']") WebElement SimpleDragmeelement;

	@FindBy (xpath = "//div[@id='droppable']") WebElement SimpleDrophereelment;

	@FindBy (xpath = "//body//main//button[2]") WebElement AcceptChildTab;

	@FindBy (xpath = "//div[@id='div2']") WebElement AcceptDragmeelement;

	@FindBy (xpath = "//div[@id='div1']") WebElement AcceptDrophereelment;

	@FindBy (xpath = "//body//main//button[3]") WebElement PreventChildTab;

	@FindBy (xpath = "//body//main//button[4]") WebElement RevertDroppableChildTab;

	@FindBy (xpath = "//a[normalize-space()='Dragabble']") WebElement DraggableTab;

	@FindBy (xpath = "//button[@id='nav-home-tab']") WebElement SimpleChildTab2;

	@FindBy (xpath = "//div[@id='draggables']") WebElement Dragmearoundelement;

	@FindBy (xpath = "//body//main//button[2]") WebElement AxisChildTab;

	@FindBy (xpath = "//div[@id='div_element']") WebElement Xaxiselement;

	@FindBy (xpath = "//div[@id='div_elementy']") WebElement Yaxiselement;

	@FindBy (xpath = "//body//main//button[3]") WebElement ContainerChildTab;

	@FindBy (xpath = "//div[@id='intro']") WebElement ContainerDraggableelement;
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
