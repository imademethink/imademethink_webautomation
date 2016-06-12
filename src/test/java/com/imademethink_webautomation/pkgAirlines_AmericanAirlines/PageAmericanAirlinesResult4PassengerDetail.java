package com.imademethink_webautomation.pkgAirlines_AmericanAirlines;

import java.util.List;

import org.json.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.imademethink_webautomation.pkg0GeneralPageFactory.Page0Abstract;

public class PageAmericanAirlinesResult4PassengerDetail extends Page0Abstract {

	//private PageAmericanAirlinesResult0InProgress 	objLocal_PageAmericanAirlinesResult0InProgress = null;
	//private PageAmericanAirlinesResult2SelectFlight	objLocal_PageAmericanAirlinesResult2SelectFlight = null;
	//private PageAmericanAirlinesResult3Price		objLocal_PageAmericanAirlinesResult3Price = null;
	//private PageAmericanAirlinesResult4PassengerDetail	objLocal_PageAmericanAirlinesResult4PassengerDetail = null;
	private PageAmericanAirlinesResult5Payment			objLocal_PageAmericanAirlinesResult5Payment = null;
	//private PageAmericanAirlines99General   	objLocal_PageAmericanAirlinesResult99vGeneral   = null;
	
	public PageAmericanAirlinesResult4PassengerDetail(WebDriver driver) {
		super(driver);
		//System.out.println("DEBUG:    PageAmericanAirlinesResult4PassengerDetail constructor");
		PageFactory.initElements(driver, this);
		//objLocal_PageAmericanAirlinesResult0InProgress  	= new PageAmericanAirlinesResult0InProgress(driver);
		//objLocal_PageAmericanAirlinesResult2SelectFlight	= new PageAmericanAirlinesResult2SelectFlight(driver);
		//objLocal_PageAmericanAirlinesResult3Price			= new PageAmericanAirlinesResult3Price(driver);
		//objLocal_PageAmericanAirlinesResult4PassengerDetail	= new PageAmericanAirlinesResult4PassengerDetail(driver);
		objLocal_PageAmericanAirlinesResult5Payment			= new PageAmericanAirlinesResult5Payment(driver);
		//objLocal_PageAmericanAirlinesResult99General 		= new PageAmericanAirlines99General(driver);
	}

	
	// public elements so that other class can also access
	@FindBy(css=".step-current")
	public WebElement AmericanAirlines_Result4Page_CurrentStep;
	@FindBy(css=".textBold.nowrap")
	public List<WebElement> AmericanAirlines_lst_Result4Page_ErrorOccured;
	@FindBy(css="#WDSErrorContainer>h1")
	public List<WebElement> AmericanAirlines_lst_Result4Page_Error_Type2_Heading;
	@FindBy(css=".WDSErrorE")
	public WebElement AmericanAirlines_Result4Page_Error_Type2_Text;
    
	// private elements
	@FindBy(css="#TITLE_1")
	private WebElement AmericanAirlines_drpdwn_Result4Page_Passanger1_TitleorHonerifics;
	@FindBy(css="#TITLE_2")
	private WebElement AmericanAirlines_drpdwn_Result4Page_Passanger1_TitleorHonerifics_Child;
	@FindBy(css="#FIRST_NAME_1")
	private WebElement AmericanAirlines_txtbox_Result4Page_Passanger1_FirstName;
	@FindBy(css="#INFANT_FIRST_NAME_1")
	private WebElement AmericanAirlines_txtbox_Result4Page_Passanger1_FirstName_Infant;
	@FindBy(css="#FIRST_NAME_2")
	private WebElement AmericanAirlines_txtbox_Result4Page_Passanger1_FirstName_Child;
	@FindBy(css="#LAST_NAME_1")
	private WebElement AmericanAirlines_txtbox_Result4Page_Passanger1_LastName;
	@FindBy(css="#INFANT_LAST_NAME_1")
	private WebElement AmericanAirlines_txtbox_Result4Page_Passanger1_LastName_Infant;
	@FindBy(css="#LAST_NAME_2")
	private WebElement AmericanAirlines_txtbox_Result4Page_Passanger1_LastName_Child;
	@FindBy(css="#IDENTITY_DOCUMENT_GENDER_1_PSPT_BK_GLOBAL_DEFAULT_1")
	private WebElement AmericanAirlines_drpdwn_Result4Page_Passanger1_Gender;
	@FindBy(css="#INFANT_IDENTITY_DOCUMENT_GENDER_1_PSPT_BK_GLOBAL_DEFAULT_1")
	private WebElement AmericanAirlines_drpdwn_Result4Page_Passanger1_Gender_Infant;
	@FindBy(css="#IDENTITY_DOCUMENT_GENDER_2_PSPT_BK_GLOBAL_DEFAULT_1")
	private WebElement AmericanAirlines_drpdwn_Result4Page_Passanger1_Gender_Child;
	@FindBy(css="#paxDobDay_1")
	private WebElement AmericanAirlines_drpdwn_Result4Page_Passanger1_Birthdate;
	@FindBy(css="#infantDobDay_1")
	private WebElement AmericanAirlines_drpdwn_Result4Page_Passanger1_Birthdate_Infant;
	@FindBy(css="#paxDobDay_2")
	private WebElement AmericanAirlines_drpdwn_Result4Page_Passanger1_Birthdate_Child;
	@FindBy(css="#paxDobMonth_1")
	private WebElement AmericanAirlines_drpdwn_Result4Page_Passanger1_BirthMonth;
	@FindBy(css="#infantDobMonth_1")
	private WebElement AmericanAirlines_drpdwn_Result4Page_Passanger1_BirthMonth_Infant;
	@FindBy(css="#paxDobMonth_2")
	private WebElement AmericanAirlines_drpdwn_Result4Page_Passanger1_BirthMonth_Child;
	@FindBy(css="#paxDobYear_1")
	private WebElement AmericanAirlines_txtbox_Result4Page_Passanger1_BirthYear;
	@FindBy(css="#infantDobYear_1")
	private WebElement AmericanAirlines_txtbox_Result4Page_Passanger1_BirthYear_Infant;
	@FindBy(css="#paxDobYear_2")
	private WebElement AmericanAirlines_txtbox_Result4Page_Passanger1_BirthYear_Child;
	@FindBy(css="#CONTACT_POINT_EMAIL_1")
	private WebElement AmericanAirlines_txtbox_Result4Page_Passanger1_Email;
	@FindBy(css="#CONTACT_POINT_EMAIL_2")
	private WebElement AmericanAirlines_txtbox_Result4Page_Passanger1_EmailConfirm;
	@FindBy(css="#countryPhoneCodeSelect")
	private WebElement AmericanAirlines_drpdwn_Result4Page_Passanger1_PhoneCountryCode;
	@FindBy(css="#CONTACT_POINT_HOME_PHONE")
	private WebElement AmericanAirlines_txtbox_Result4Page_Passanger1_ContactPhoneNumber;
	@FindBy(css="#btnPurchaseAlpi")
	private WebElement AmericanAirlines_btn_Result4Page_Purchase;
	
	@FindBy(css="#btnPurchaseAPIS")
	private WebElement AmericanAirlines_btn_Result4Page_ContinueOnDHSPage;
	

   // every page object has it's local private wait with fixed 10 sec delay
	private WebDriverWait objWait = new WebDriverWait(this.objWebDriverAbstract, 10);  
    
    public boolean AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE1_CASE1(JSONObject objJSON_AmericanAirlinesAdultPassangerDetails){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;

		System.out.println("DEBUG:    Entering the passanger details");
		// fill the user details
		AmericanAirlines_drpdwn_Result4Page_Passanger1_TitleorHonerifics.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("Honorifics").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_FirstName.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("FirstName").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_LastName.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("LastName").toString());
		AmericanAirlines_drpdwn_Result4Page_Passanger1_Gender.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("Gender").toString());
		AmericanAirlines_drpdwn_Result4Page_Passanger1_Birthdate.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("BirthDate").toString());
		AmericanAirlines_drpdwn_Result4Page_Passanger1_BirthMonth.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("BirthMonth").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_BirthYear.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("BirthYear").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_Email.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("Email").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_EmailConfirm.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("EmailConfirm").toString());
		AmericanAirlines_drpdwn_Result4Page_Passanger1_PhoneCountryCode.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("PhoneCountryCode").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_ContactPhoneNumber.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("ContactPhone").toString());
		
		AmericanAirlines_btn_Result4Page_Purchase.click();
		objWait.until(ExpectedConditions.textToBePresentInElement(AmericanAirlines_Result4Page_CurrentStep, "4"));   
		
		// this is intermediate screen button before going to payment screen
		AmericanAirlines_btn_Result4Page_ContinueOnDHSPage.click();
		objWait.until(ExpectedConditions.textToBePresentInElement(objLocal_PageAmericanAirlinesResult5Payment.AmericanAirlines_Result5Page_CurrentStep, "5"));

		if(objLocal_PageAmericanAirlinesResult5Payment.AmericanAirlines_lst_Result5Page_Error_Type2_Heading.size() >0 ){
			String strErrorText = "";
			if (objLocal_PageAmericanAirlinesResult5Payment.AmericanAirlines_Result5Page_Error_Type2_Text.isDisplayed()){
				strErrorText = objLocal_PageAmericanAirlinesResult5Payment.AmericanAirlines_Result5Page_Error_Type2_Text.getText();
			}
			System.out.println("ERROR:    Error occured in search results for TYPE1_CASE1 - upto payment page: " + strErrorText);
			objSoftAssert.fail("ERROR:    Error occured in search results for TYPE1_CASE1 - upto payment page: " + strErrorText);
			bAmericanAirlines_ThisElementValidationStatus = false;
		}

		return bAmericanAirlines_ThisElementValidationStatus;
	}
    
    public boolean AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE3_CASE1(JSONObject objJSON_AmericanAirlinesAdultPassangerDetails){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;

		System.out.println("DEBUG:    Entering the passanger details");
		// fill the user details
		AmericanAirlines_drpdwn_Result4Page_Passanger1_TitleorHonerifics.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("Honorifics").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_FirstName.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("FirstName").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_LastName.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("LastName").toString());
		AmericanAirlines_drpdwn_Result4Page_Passanger1_Gender.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("Gender").toString());
		AmericanAirlines_drpdwn_Result4Page_Passanger1_Birthdate.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("BirthDate").toString());
		AmericanAirlines_drpdwn_Result4Page_Passanger1_BirthMonth.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("BirthMonth").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_BirthYear.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("BirthYear").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_Email.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("Email").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_EmailConfirm.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("EmailConfirm").toString());
		AmericanAirlines_drpdwn_Result4Page_Passanger1_PhoneCountryCode.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("PhoneCountryCode").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_ContactPhoneNumber.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("ContactPhone").toString());
		
		AmericanAirlines_btn_Result4Page_Purchase.click();
		objWait.until(ExpectedConditions.textToBePresentInElement(AmericanAirlines_Result4Page_CurrentStep, "4"));   
		
		// this is intermediate screen button before going to payment screen
		AmericanAirlines_btn_Result4Page_ContinueOnDHSPage.click();
		objWait.until(ExpectedConditions.textToBePresentInElement(objLocal_PageAmericanAirlinesResult5Payment.AmericanAirlines_Result5Page_CurrentStep, "5"));

		if(objLocal_PageAmericanAirlinesResult5Payment.AmericanAirlines_lst_Result5Page_Error_Type2_Heading.size() >0 ){
			String strErrorText = "";
			if (objLocal_PageAmericanAirlinesResult5Payment.AmericanAirlines_Result5Page_Error_Type2_Text.isDisplayed()){
				strErrorText = objLocal_PageAmericanAirlinesResult5Payment.AmericanAirlines_Result5Page_Error_Type2_Text.getText();
			}
			System.out.println("ERROR:    Error occured in search results for TYPE3_CASE1 - upto payment page: " + strErrorText);
			objSoftAssert.fail("ERROR:    Error occured in search results for TYPE3_CASE1 - upto payment page: " + strErrorText);
			bAmericanAirlines_ThisElementValidationStatus = false;
		}

		return bAmericanAirlines_ThisElementValidationStatus;
	}
    
    public boolean AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE3_CASE2(JSONObject objJSON_AmericanAirlinesAdultPassangerDetails){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;

		System.out.println("DEBUG:    Entering the passanger details");
		// fill the user details
		AmericanAirlines_drpdwn_Result4Page_Passanger1_TitleorHonerifics.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("Honorifics").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_FirstName.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("FirstName").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_LastName.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("LastName").toString());
		AmericanAirlines_drpdwn_Result4Page_Passanger1_Gender.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("Gender").toString());
		AmericanAirlines_drpdwn_Result4Page_Passanger1_Birthdate.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("BirthDate").toString());
		AmericanAirlines_drpdwn_Result4Page_Passanger1_BirthMonth.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("BirthMonth").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_BirthYear.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("BirthYear").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_Email.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("Email").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_EmailConfirm.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("EmailConfirm").toString());
		AmericanAirlines_drpdwn_Result4Page_Passanger1_PhoneCountryCode.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("PhoneCountryCode").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_ContactPhoneNumber.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("ContactPhone").toString());
		
		AmericanAirlines_btn_Result4Page_Purchase.click();
		objWait.until(ExpectedConditions.textToBePresentInElement(AmericanAirlines_Result4Page_CurrentStep, "4"));   
		
		// this is intermediate screen button before going to payment screen
		AmericanAirlines_btn_Result4Page_ContinueOnDHSPage.click();
		objWait.until(ExpectedConditions.textToBePresentInElement(objLocal_PageAmericanAirlinesResult5Payment.AmericanAirlines_Result5Page_CurrentStep, "5"));

		if(objLocal_PageAmericanAirlinesResult5Payment.AmericanAirlines_lst_Result5Page_Error_Type2_Heading.size() >0 ){
			String strErrorText = "";
			if (objLocal_PageAmericanAirlinesResult5Payment.AmericanAirlines_Result5Page_Error_Type2_Text.isDisplayed()){
				strErrorText = objLocal_PageAmericanAirlinesResult5Payment.AmericanAirlines_Result5Page_Error_Type2_Text.getText();
			}
			System.out.println("ERROR:    Error occured in search results for TYPE3_CASE2 - upto payment page: " + strErrorText);
			objSoftAssert.fail("ERROR:    Error occured in search results for TYPE3_CASE2 - upto payment page: " + strErrorText);
			bAmericanAirlines_ThisElementValidationStatus = false;
		}

		return bAmericanAirlines_ThisElementValidationStatus;
	}
    
    public boolean AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE3_CASE4(JSONObject objJSON_AmericanAirlinesAdultPassangerDetails){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;

		System.out.println("DEBUG:    Entering the passanger details");
		// fill the user details
		AmericanAirlines_drpdwn_Result4Page_Passanger1_TitleorHonerifics.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("Honorifics").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_FirstName.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("FirstName").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_LastName.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("LastName").toString());
		AmericanAirlines_drpdwn_Result4Page_Passanger1_Gender.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("Gender").toString());
		AmericanAirlines_drpdwn_Result4Page_Passanger1_Birthdate.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("BirthDate").toString());
		AmericanAirlines_drpdwn_Result4Page_Passanger1_BirthMonth.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("BirthMonth").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_BirthYear.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("BirthYear").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_Email.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("Email").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_EmailConfirm.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("EmailConfirm").toString());
		AmericanAirlines_drpdwn_Result4Page_Passanger1_PhoneCountryCode.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("PhoneCountryCode").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_ContactPhoneNumber.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("ContactPhone").toString());
		
		AmericanAirlines_btn_Result4Page_Purchase.click();
		objWait.until(ExpectedConditions.textToBePresentInElement(AmericanAirlines_Result4Page_CurrentStep, "4"));   
		
		// this is intermediate screen button before going to payment screen
		AmericanAirlines_btn_Result4Page_ContinueOnDHSPage.click();
		objWait.until(ExpectedConditions.textToBePresentInElement(objLocal_PageAmericanAirlinesResult5Payment.AmericanAirlines_Result5Page_CurrentStep, "5"));

		if(objLocal_PageAmericanAirlinesResult5Payment.AmericanAirlines_lst_Result5Page_Error_Type2_Heading.size() >0 ){
			String strErrorText = "";
			if (objLocal_PageAmericanAirlinesResult5Payment.AmericanAirlines_Result5Page_Error_Type2_Text.isDisplayed()){
				strErrorText = objLocal_PageAmericanAirlinesResult5Payment.AmericanAirlines_Result5Page_Error_Type2_Text.getText();
			}
			System.out.println("ERROR:    Error occured in search results for TYPE3_CASE4 - upto payment page: " + strErrorText);
			objSoftAssert.fail("ERROR:    Error occured in search results for TYPE3_CASE4 - upto payment page: " + strErrorText);
			bAmericanAirlines_ThisElementValidationStatus = false;
		}

		return bAmericanAirlines_ThisElementValidationStatus;
	}
    
    public boolean AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE3_CASE5(JSONObject objJSON_AmericanAirlinesAdultPassangerDetails){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;

		System.out.println("DEBUG:    Entering the passanger details");
		// fill the user details
		AmericanAirlines_drpdwn_Result4Page_Passanger1_TitleorHonerifics.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("Honorifics").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_FirstName.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("FirstName").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_LastName.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("LastName").toString());
		AmericanAirlines_drpdwn_Result4Page_Passanger1_Gender.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("Gender").toString());
		AmericanAirlines_drpdwn_Result4Page_Passanger1_Birthdate.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("BirthDate").toString());
		AmericanAirlines_drpdwn_Result4Page_Passanger1_BirthMonth.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("BirthMonth").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_BirthYear.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("BirthYear").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_Email.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("Email").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_EmailConfirm.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("EmailConfirm").toString());
		AmericanAirlines_drpdwn_Result4Page_Passanger1_PhoneCountryCode.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("PhoneCountryCode").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_ContactPhoneNumber.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("ContactPhone").toString());
		
		AmericanAirlines_btn_Result4Page_Purchase.click();
		objWait.until(ExpectedConditions.textToBePresentInElement(AmericanAirlines_Result4Page_CurrentStep, "4"));   
		
		// this is intermediate screen button before going to payment screen
		AmericanAirlines_btn_Result4Page_ContinueOnDHSPage.click();
		objWait.until(ExpectedConditions.textToBePresentInElement(objLocal_PageAmericanAirlinesResult5Payment.AmericanAirlines_Result5Page_CurrentStep, "5"));

		if(objLocal_PageAmericanAirlinesResult5Payment.AmericanAirlines_lst_Result5Page_Error_Type2_Heading.size() >0 ){
			String strErrorText = "";
			if (objLocal_PageAmericanAirlinesResult5Payment.AmericanAirlines_Result5Page_Error_Type2_Text.isDisplayed()){
				strErrorText = objLocal_PageAmericanAirlinesResult5Payment.AmericanAirlines_Result5Page_Error_Type2_Text.getText();
			}
			System.out.println("ERROR:    Error occured in search results for TYPE3_CASE5 - upto payment page: " + strErrorText);
			objSoftAssert.fail("ERROR:    Error occured in search results for TYPE3_CASE5 - upto payment page: " + strErrorText);
			bAmericanAirlines_ThisElementValidationStatus = false;
		}

		return bAmericanAirlines_ThisElementValidationStatus;
	}

    public boolean AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE4_CASE1(
    				JSONObject objJSON_AmericanAirlinesAdultPassangerDetails, 
    				JSONObject objJSON_AmericanAirlinesInfantPassangerDetails){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;

		System.out.println("DEBUG:    Entering the adult passanger details");
		// fill the user details
		AmericanAirlines_drpdwn_Result4Page_Passanger1_TitleorHonerifics.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("Honorifics").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_FirstName.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("FirstName").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_LastName.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("LastName").toString());
		AmericanAirlines_drpdwn_Result4Page_Passanger1_Gender.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("Gender").toString());
		AmericanAirlines_drpdwn_Result4Page_Passanger1_Birthdate.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("BirthDate").toString());
		AmericanAirlines_drpdwn_Result4Page_Passanger1_BirthMonth.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("BirthMonth").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_BirthYear.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("BirthYear").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_Email.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("Email").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_EmailConfirm.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("EmailConfirm").toString());
		AmericanAirlines_drpdwn_Result4Page_Passanger1_PhoneCountryCode.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("PhoneCountryCode").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_ContactPhoneNumber.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("ContactPhone").toString());
		
		System.out.println("DEBUG:    Entering the infant passanger details");
		AmericanAirlines_txtbox_Result4Page_Passanger1_FirstName_Infant.sendKeys(objJSON_AmericanAirlinesInfantPassangerDetails.get("FirstName").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_LastName_Infant.sendKeys(objJSON_AmericanAirlinesInfantPassangerDetails.get("LastName").toString());
		AmericanAirlines_drpdwn_Result4Page_Passanger1_Gender_Infant.sendKeys(objJSON_AmericanAirlinesInfantPassangerDetails.get("Gender").toString());
		AmericanAirlines_drpdwn_Result4Page_Passanger1_Birthdate_Infant.sendKeys(objJSON_AmericanAirlinesInfantPassangerDetails.get("BirthDate").toString());
		AmericanAirlines_drpdwn_Result4Page_Passanger1_BirthMonth_Infant.sendKeys(objJSON_AmericanAirlinesInfantPassangerDetails.get("BirthMonth").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_BirthYear_Infant.sendKeys(objJSON_AmericanAirlinesInfantPassangerDetails.get("BirthYear").toString());

		
		AmericanAirlines_btn_Result4Page_Purchase.click();
		objWait.until(ExpectedConditions.textToBePresentInElement(AmericanAirlines_Result4Page_CurrentStep, "4"));   
		
		// this is intermediate screen button before going to payment screen
		AmericanAirlines_btn_Result4Page_ContinueOnDHSPage.click();
		objWait.until(ExpectedConditions.textToBePresentInElement(objLocal_PageAmericanAirlinesResult5Payment.AmericanAirlines_Result5Page_CurrentStep, "5"));

		if(objLocal_PageAmericanAirlinesResult5Payment.AmericanAirlines_lst_Result5Page_Error_Type2_Heading.size() >0 ){
			String strErrorText = "";
			if (objLocal_PageAmericanAirlinesResult5Payment.AmericanAirlines_Result5Page_Error_Type2_Text.isDisplayed()){
				strErrorText = objLocal_PageAmericanAirlinesResult5Payment.AmericanAirlines_Result5Page_Error_Type2_Text.getText();
			}
			System.out.println("ERROR:    Error occured in search results for TYPE4_CASE1 - upto payment page: " + strErrorText);
			objSoftAssert.fail("ERROR:    Error occured in search results for TYPE4_CASE1 - upto payment page: " + strErrorText);
			bAmericanAirlines_ThisElementValidationStatus = false;
		}

		return bAmericanAirlines_ThisElementValidationStatus;
	}
    
    public boolean AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE4_CASE2(
    				JSONObject objJSON_AmericanAirlinesAdultPassangerDetails, 
    				JSONObject objJSON_AmericanAirlinesChildPassangerDetails){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;

		System.out.println("DEBUG:    Entering the adult passanger details");
		// fill the user details
		AmericanAirlines_drpdwn_Result4Page_Passanger1_TitleorHonerifics.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("Honorifics").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_FirstName.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("FirstName").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_LastName.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("LastName").toString());
		AmericanAirlines_drpdwn_Result4Page_Passanger1_Gender.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("Gender").toString());
		AmericanAirlines_drpdwn_Result4Page_Passanger1_Birthdate.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("BirthDate").toString());
		AmericanAirlines_drpdwn_Result4Page_Passanger1_BirthMonth.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("BirthMonth").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_BirthYear.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("BirthYear").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_Email.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("Email").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_EmailConfirm.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("EmailConfirm").toString());
		AmericanAirlines_drpdwn_Result4Page_Passanger1_PhoneCountryCode.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("PhoneCountryCode").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_ContactPhoneNumber.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("ContactPhone").toString());
		
		System.out.println("DEBUG:    Entering the child passanger details");
		AmericanAirlines_drpdwn_Result4Page_Passanger1_TitleorHonerifics_Child.sendKeys(objJSON_AmericanAirlinesChildPassangerDetails.get("Honorifics").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_FirstName_Child.sendKeys(objJSON_AmericanAirlinesChildPassangerDetails.get("FirstName").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_LastName_Child.sendKeys(objJSON_AmericanAirlinesChildPassangerDetails.get("LastName").toString());
		AmericanAirlines_drpdwn_Result4Page_Passanger1_Gender_Child.sendKeys(objJSON_AmericanAirlinesChildPassangerDetails.get("Gender").toString());
		AmericanAirlines_drpdwn_Result4Page_Passanger1_Birthdate_Child.sendKeys(objJSON_AmericanAirlinesChildPassangerDetails.get("BirthDate").toString());
		AmericanAirlines_drpdwn_Result4Page_Passanger1_BirthMonth_Child.sendKeys(objJSON_AmericanAirlinesChildPassangerDetails.get("BirthMonth").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_BirthYear_Child.sendKeys(objJSON_AmericanAirlinesChildPassangerDetails.get("BirthYear").toString());
	
		
		AmericanAirlines_btn_Result4Page_Purchase.click();
		objWait.until(ExpectedConditions.textToBePresentInElement(AmericanAirlines_Result4Page_CurrentStep, "4"));   
		
		// this is intermediate screen button before going to payment screen
		AmericanAirlines_btn_Result4Page_ContinueOnDHSPage.click();
		objWait.until(ExpectedConditions.textToBePresentInElement(objLocal_PageAmericanAirlinesResult5Payment.AmericanAirlines_Result5Page_CurrentStep, "5"));

		if(objLocal_PageAmericanAirlinesResult5Payment.AmericanAirlines_lst_Result5Page_Error_Type2_Heading.size() >0 ){
			String strErrorText = "";
			if (objLocal_PageAmericanAirlinesResult5Payment.AmericanAirlines_Result5Page_Error_Type2_Text.isDisplayed()){
				strErrorText = objLocal_PageAmericanAirlinesResult5Payment.AmericanAirlines_Result5Page_Error_Type2_Text.getText();
			}
			System.out.println("ERROR:    Error occured in search results for TYPE4_CASE2 - upto payment page: " + strErrorText);
			objSoftAssert.fail("ERROR:    Error occured in search results for TYPE4_CASE2 - upto payment page: " + strErrorText);
			bAmericanAirlines_ThisElementValidationStatus = false;
		}

		return bAmericanAirlines_ThisElementValidationStatus;
	}
    
    public boolean AmericanAirlines_Validate_EndToEnd_Search_Scenario__Until_Payment_Section(JSONObject objJSON_AmericanAirlinesAdultPassangerDetails){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;

		System.out.println("DEBUG:    Entering the passanger details");
		// fill the user details
		AmericanAirlines_drpdwn_Result4Page_Passanger1_TitleorHonerifics.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("Honorifics").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_FirstName.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("FirstName").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_LastName.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("LastName").toString());
		AmericanAirlines_drpdwn_Result4Page_Passanger1_Gender.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("Gender").toString());
		AmericanAirlines_drpdwn_Result4Page_Passanger1_Birthdate.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("BirthDate").toString());
		AmericanAirlines_drpdwn_Result4Page_Passanger1_BirthMonth.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("BirthMonth").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_BirthYear.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("BirthYear").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_Email.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("Email").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_EmailConfirm.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("EmailConfirm").toString());
		AmericanAirlines_drpdwn_Result4Page_Passanger1_PhoneCountryCode.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("PhoneCountryCode").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_ContactPhoneNumber.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("ContactPhone").toString());
		
		AmericanAirlines_btn_Result4Page_Purchase.click();
		objWait.until(ExpectedConditions.textToBePresentInElement(AmericanAirlines_Result4Page_CurrentStep, "4"));   
		
		// this is intermediate screen button before going to payment screen
		AmericanAirlines_btn_Result4Page_ContinueOnDHSPage.click();
		objWait.until(ExpectedConditions.textToBePresentInElement(objLocal_PageAmericanAirlinesResult5Payment.AmericanAirlines_Result5Page_CurrentStep, "5"));

		if(objLocal_PageAmericanAirlinesResult5Payment.AmericanAirlines_lst_Result5Page_Error_Type2_Heading.size() >0 ){
			String strErrorText = "";
			if (objLocal_PageAmericanAirlinesResult5Payment.AmericanAirlines_Result5Page_Error_Type2_Text.isDisplayed()){
				strErrorText = objLocal_PageAmericanAirlinesResult5Payment.AmericanAirlines_Result5Page_Error_Type2_Text.getText();
			}
			System.out.println("ERROR:    Error occured in search results for until payment section - upto payment page: " + strErrorText);
			objSoftAssert.fail("ERROR:    Error occured in search results for until payment section - upto payment page: " + strErrorText);
			bAmericanAirlines_ThisElementValidationStatus = false;
		}

		return bAmericanAirlines_ThisElementValidationStatus;
	}
    
    public boolean AmericanAirlines_Perform_SimpleActivity_and_NavigateToNextPage(JSONObject objJSON_AmericanAirlinesAdultPassangerDetails){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;

		// fill the user details
		AmericanAirlines_drpdwn_Result4Page_Passanger1_TitleorHonerifics.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("Honorifics").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_FirstName.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("FirstName").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_LastName.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("LastName").toString());
		AmericanAirlines_drpdwn_Result4Page_Passanger1_Gender.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("Gender").toString());
		AmericanAirlines_drpdwn_Result4Page_Passanger1_Birthdate.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("BirthDate").toString());
		AmericanAirlines_drpdwn_Result4Page_Passanger1_BirthMonth.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("BirthMonth").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_BirthYear.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("BirthYear").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_Email.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("Email").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_EmailConfirm.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("EmailConfirm").toString());
		AmericanAirlines_drpdwn_Result4Page_Passanger1_PhoneCountryCode.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("PhoneCountryCode").toString());
		AmericanAirlines_txtbox_Result4Page_Passanger1_ContactPhoneNumber.sendKeys(objJSON_AmericanAirlinesAdultPassangerDetails.get("ContactPhone").toString());
		
		AmericanAirlines_btn_Result4Page_Purchase.click();
		objWait.until(ExpectedConditions.textToBePresentInElement(AmericanAirlines_Result4Page_CurrentStep, "4"));   
		
		// this is intermediate screen button before going to payment screen
		AmericanAirlines_btn_Result4Page_ContinueOnDHSPage.click();
		objWait.until(ExpectedConditions.textToBePresentInElement(objLocal_PageAmericanAirlinesResult5Payment.AmericanAirlines_Result5Page_CurrentStep, "5"));

		if(objLocal_PageAmericanAirlinesResult5Payment.AmericanAirlines_lst_Result5Page_Error_Type2_Heading.size() >0 ){
			String strErrorText = "";
			if (objLocal_PageAmericanAirlinesResult5Payment.AmericanAirlines_Result5Page_Error_Type2_Text.isDisplayed()){
				strErrorText = objLocal_PageAmericanAirlinesResult5Payment.AmericanAirlines_Result5Page_Error_Type2_Text.getText();
			}
			System.out.println("ERROR:    Error occured in performing simple activity - upto payment page: " + strErrorText);
			objSoftAssert.fail("ERROR:    Error occured in performing simple activity - upto payment page: " + strErrorText);
			bAmericanAirlines_ThisElementValidationStatus = false;
		}

		return bAmericanAirlines_ThisElementValidationStatus;
	}
    
    
    
    
    
    
    
	
}
