package com.imademethink_webautomation.pkgAirlines_GoAir;

import java.util.List;

import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.imademethink_webautomation.pkg0GeneralPageFactory.Page0Abstract;

public class PageGoAirResult3ServicesAndPassengerDetail extends Page0Abstract{

	//private PageGoAirResult0InProgress 					objLocal_PageGoAirResult0InProgress = null;
	//private PageGoAirResult2SelectDate 					objLocal_PageGoAirResult2SelectDate = null;
	private PageGoAirResult4SeatAssignment 				objLocal_PageGoAirResult4SeatAssignment = null;
	//private PageGoAirResult5Payment 					objLocal_PageGoAirResult5Payment = null;
	//private PageGoAir99General 					objLocal_PageGoAirResult99General = null;
	
	public PageGoAirResult3ServicesAndPassengerDetail(WebDriver driver) {
		super(driver);
		//System.out.println("DEBUG:    PageGoAirResult3ServicesAndPassengerDetail constructor");
		PageFactory.initElements(driver, this);
		//objLocal_PageGoAirResult0InProgress					= new PageGoAirResult0InProgress(driver);
		//objLocal_PageGoAirResult2SelectDate					= new PageGoAirResult2SelectDate(driver);
		objLocal_PageGoAirResult4SeatAssignment				= new PageGoAirResult4SeatAssignment(driver);
		//objLocal_PageGoAirResult5Payment  					= new PageGoAirResult5Payment(driver);
		//objLocal_PageGoAirResult99General					= new PageGoAir99General(driver);
	}

	// public elements so that other class can also access
	@FindBy(css="div[class='step active']")
	public WebElement GoAir_Result3Page_CurrentStep;
	// below element is strictly prvate
	@FindBy(css="div[class='step active']")
	private WebElement GoAir_Result2Page_CurrentStep;

	@FindBy(css=".textBold.nowrap")
	public List<WebElement> GoAir_lst_Result3Page_ErrorOccured;
	@FindBy(css="#WDSErrorContainer>h1")
	public List<WebElement> GoAir_lst_Result3Page_Error_Type2_Heading;
	@FindBy(css=".WDSErrorE")
	public WebElement GoAir_Result3Page_Error_Type2_Text;
    
	// private elements
	@FindBy(css=".myTest.title.type-passenger")
	private WebElement GoAir_drpdwn_Result3Page_Passanger1_TitleorHonerifics;
	@FindBy(css="input[name='firstName1ADT']")
	private WebElement GoAir_txtbox_Result3Page_Passanger1_FirstName;
	@FindBy(css="input[name='firstName1INF']")
	private WebElement GoAir_txtbox_Result3Page_Passanger1_FirstName_Infant;
	@FindBy(css="input[name='firstName1CHD']")
	private WebElement GoAir_txtbox_Result3Page_Passanger1_FirstName_Child;
	@FindBy(css="input[name='surName1ADT']")
	private WebElement GoAir_txtbox_Result3Page_Passanger1_LastName;
	@FindBy(css="input[name='surName1INF']")
	private WebElement GoAir_txtbox_Result3Page_Passanger1_LastName_Infant;
	@FindBy(css="input[name='surName1CHD']")
	private WebElement GoAir_txtbox_Result3Page_Passanger1_LastName_Child;
	@FindBy(css=".myTest.birthDay.day.infant.birthdatedropdown")
	private WebElement GoAir_drpdwn_Result3Page_Passanger1_Birthdate_Infant;
	@FindBy(css=".myTest.birthDay.day.child.birthdatedropdown")
	private WebElement GoAir_drpdwn_Result3Page_Passanger1_Birthdate_Child;
	@FindBy(css=".myTest.birthMonth.month.infant.birthdatedropdown")
	private WebElement GoAir_drpdwn_Result3Page_Passanger1_BirthMonth_Infant;
	@FindBy(css=".myTest.birthMonth.month.child.birthdatedropdown")
	private WebElement GoAir_drpdwn_Result3Page_Passanger1_BirthMonth_Child;
	@FindBy(css=".myTest.birthYear.year.infant.birthdatedropdown.type-passenger")
	private WebElement GoAir_txtbox_Result3Page_Passanger1_BirthYear_Infant;
	@FindBy(css=".myTest.birthYear.year.child.birthdatedropdown.type-passenger")
	private WebElement GoAir_txtbox_Result3Page_Passanger1_BirthYear_Child;
	@FindBy(css="#Booking_BookingContact_Email")
	private WebElement GoAir_txtbox_Result3Page_Passanger1_Email;
	@FindBy(css="input[name='Booking.BookingContact.ConfirmEmail']")
	private WebElement GoAir_txtbox_Result3Page_Passanger1_EmailConfirm;
	@FindBy(css="input[name='Booking.BookingContact.CellPhoneNumber']")
	private WebElement GoAir_txtbox_Result3Page_Passanger1_ContactPhoneNumber;
	@FindBy(css="#btnPurchaseAlpi")
	private WebElement GoAir_btn_Result3Page_Purchase;
	@FindBy(css="#AcceptedTerms")
	private WebElement GoAir_tickbox_Result3Page_AcceptTermsandConditions;
	@FindBy(css="input[value='Continue']")
	private WebElement GoAir_lnk_Result3Page_Continue;
	@FindBy(css=".ssr-reminders-continue.button.button-next")
	private WebElement GoAir_btn_Result3Page_PreBookItemsRemider;
	@FindBy(css=".button.button-back")
	public List<WebElement> GoAir_lst_btn_Result3Page_GoBack;
	//this element should be strictly private
	@FindBy(id="YourBasket-OutBound")
	private WebElement GoAir_lnk_Result2Page_BookingSummaryHeading_OutBoundDetails;
	
	

   // every page object has it's local private wait with fixed 10 sec delay
	private WebDriverWait objWait = new WebDriverWait(this.objWebDriverAbstract, 10);  
    
    public boolean GoAir_Validate_Common_Passenger_Details_Filling_Scenario(JSONObject objJSON_GoAirAdultPassangerDetails){

		boolean bGoAir_ThisElementValidationStatus 		= true;

		System.out.println("DEBUG:    Entering the passanger details accept terms and conditions no pre book items");
		// fill the user details
		GoAir_drpdwn_Result3Page_Passanger1_TitleorHonerifics.sendKeys(objJSON_GoAirAdultPassangerDetails.get("Honorifics").toString());
		GoAir_txtbox_Result3Page_Passanger1_FirstName.sendKeys(objJSON_GoAirAdultPassangerDetails.get("FirstName").toString());
		GoAir_txtbox_Result3Page_Passanger1_LastName.sendKeys(objJSON_GoAirAdultPassangerDetails.get("LastName").toString());
		GoAir_txtbox_Result3Page_Passanger1_Email.sendKeys(objJSON_GoAirAdultPassangerDetails.get("Email").toString());
		GoAir_txtbox_Result3Page_Passanger1_EmailConfirm.sendKeys(objJSON_GoAirAdultPassangerDetails.get("EmailConfirm").toString());
		GoAir_txtbox_Result3Page_Passanger1_ContactPhoneNumber.sendKeys(objJSON_GoAirAdultPassangerDetails.get("ContactPhone").toString());
		
		GoAir_tickbox_Result3Page_AcceptTermsandConditions.click();
		GoAir_lnk_Result3Page_Continue.click();
		objWait.until(ExpectedConditions.visibilityOf(GoAir_btn_Result3Page_PreBookItemsRemider));
		
		// this is intermediate screen button before going to seat assignment section
		GoAir_btn_Result3Page_PreBookItemsRemider.click();
		objWait.until(ExpectedConditions.textToBePresentInElement(objLocal_PageGoAirResult4SeatAssignment.GoAir_Result4Page_CurrentStep, "4"));

		return bGoAir_ThisElementValidationStatus;
	}
    
    public boolean GoAir_Validate_EndToEnd_Search_Scenario__TYPE1_CASE1(JSONObject objJSON_GoAirAdultPassangerDetails){

    	return GoAir_Validate_Common_Passenger_Details_Filling_Scenario(objJSON_GoAirAdultPassangerDetails);
	}
    
    public boolean GoAir_Validate_EndToEnd_Search_Scenario__TYPE1_CASE2(){

		boolean bGoAir_ThisElementValidationStatus 		= true;

		System.out.println("DEBUG:    Cancelling the ticket booking");
		GoAir_lst_btn_Result3Page_GoBack.get(0).click();
		objWait.until(ExpectedConditions.textToBePresentInElement(GoAir_Result2Page_CurrentStep, "2"));

		return bGoAir_ThisElementValidationStatus;
	}
    
    public boolean GoAir_Validate_EndToEnd_Search_Scenario__TYPE1_CASE3(JSONObject objJSON_GoAirAdultPassangerDetails){

       	return GoAir_Validate_Common_Passenger_Details_Filling_Scenario(objJSON_GoAirAdultPassangerDetails);
   	}
    
    public boolean GoAir_Validate_EndToEnd_Search_Scenario__TYPE1_CASE4(){

		boolean bGoAir_ThisElementValidationStatus 		= true;

		if(GoAir_lnk_Result2Page_BookingSummaryHeading_OutBoundDetails.findElements(By.className("value")).get(5).getText().contains("GoBusiness")){
			System.out.println("DEBUG:    Selected ticket from premium or business category");
		}else{
			System.out.println("DEBUG:    Selected ticket is NOT from premium or business category");
			return false;
		}

		System.out.println("DEBUG:    Cancelling the ticket booking");
		GoAir_lst_btn_Result3Page_GoBack.get(0).click();
		objWait.until(ExpectedConditions.textToBePresentInElement(GoAir_Result2Page_CurrentStep, "2"));

		return bGoAir_ThisElementValidationStatus;
	}
    
    public boolean GoAir_Validate_EndToEnd_Search_Scenario__TYPE1_CASE5(){

		boolean bGoAir_ThisElementValidationStatus 		= true;

		if(GoAir_lnk_Result2Page_BookingSummaryHeading_OutBoundDetails.findElements(By.className("value")).get(5).getText().contains("GoBusiness")){
			System.out.println("DEBUG:    Selected ticket from premium or business category");
		}else{
			System.out.println("DEBUG:    Selected ticket is NOT from premium or business category");
			return false;
		}

		System.out.println("DEBUG:    Cancelling the ticket booking");
		GoAir_lst_btn_Result3Page_GoBack.get(0).click();
		objWait.until(ExpectedConditions.textToBePresentInElement(GoAir_Result2Page_CurrentStep, "2"));

		return bGoAir_ThisElementValidationStatus;
	}
    
    public boolean GoAir_Validate_EndToEnd_Search_Scenario__TYPE3_CASE1(JSONObject objJSON_GoAirAdultPassangerDetails){

       	return GoAir_Validate_Common_Passenger_Details_Filling_Scenario(objJSON_GoAirAdultPassangerDetails);
   	}
 
    public boolean GoAir_Validate_EndToEnd_Search_Scenario__TYPE3_CASE2(JSONObject objJSON_GoAirAdultPassangerDetails){

       	return GoAir_Validate_Common_Passenger_Details_Filling_Scenario(objJSON_GoAirAdultPassangerDetails);
   	}
    
    public boolean GoAir_Validate_EndToEnd_Search_Scenario__TYPE3_CASE3(JSONObject objJSON_GoAirAdultPassangerDetails){

       	return GoAir_Validate_Common_Passenger_Details_Filling_Scenario(objJSON_GoAirAdultPassangerDetails);
   	}
    
    public boolean GoAir_Validate_EndToEnd_Search_Scenario__TYPE3_CASE4(JSONObject objJSON_GoAirAdultPassangerDetails){

       	return GoAir_Validate_Common_Passenger_Details_Filling_Scenario(objJSON_GoAirAdultPassangerDetails);
	}

    public boolean GoAir_Validate_EndToEnd_Search_Scenario__TYPE3_CASE5(JSONObject objJSON_GoAirAdultPassangerDetails){

       	return GoAir_Validate_Common_Passenger_Details_Filling_Scenario(objJSON_GoAirAdultPassangerDetails);
	}
   
    public boolean GoAir_Validate_EndToEnd_Search_Scenario__TYPE3_CASE6(JSONObject objJSON_GoAirAdultPassangerDetails){

       	return GoAir_Validate_Common_Passenger_Details_Filling_Scenario(objJSON_GoAirAdultPassangerDetails);
	}
   
    public boolean GoAir_Validate_EndToEnd_Search_Scenario__TYPE3_CASE8(JSONObject objJSON_GoAirAdultPassangerDetails){

       	return GoAir_Validate_Common_Passenger_Details_Filling_Scenario(objJSON_GoAirAdultPassangerDetails);
	}
    
    
    
    
   	
	
	
}
