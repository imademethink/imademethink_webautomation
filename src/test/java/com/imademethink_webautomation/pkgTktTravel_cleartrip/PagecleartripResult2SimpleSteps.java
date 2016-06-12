package com.imademethink_webautomation.pkgTktTravel_cleartrip;

import java.util.List;

import org.json.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.imademethink_webautomation.pkg0GeneralPageFactory.Page0Abstract;

public class PagecleartripResult2SimpleSteps extends Page0Abstract{
	
	public PagecleartripResult2SimpleSteps(WebDriver driver) {
		super(driver);
		//System.out.println("DEBUG:    PagecleartripResult2SimpleSteps constructor");
		PageFactory.initElements(driver, this);
		//objLocal_PagecleartripResult2SelectFlight	= new PagecleartripResult2SelectFlight(driver);
		//objLocal_PagecleartripResult3Price		= new PagecleartripResult3Price(driver);
		//objLocal_PagecleartripResult99General 	= new PagecleartripResult99General(driver);
	}
	
	// general elements
	@FindBy(css=".steps>.stepNum")
	private List<WebElement> cleartrip_lst_labl_Result2SimpleStepsPage_SimpleSteps_Stage;
	@FindBy(css="#itineraryBtn")
	private WebElement cleartrip_btn_Result2SimpleStepsPage_Iterniery_ContinueButton;
	@FindBy(css="#username")
	private WebElement cleartrip_txtbox_Result2SimpleStepsPage_EmailAddress_UserName;
	@FindBy(css="#subscribe_newsletter")
	private WebElement cleartrip_tickbox_Result2SimpleStepsPage_EmailAddress_NewsLatterSubscribe;
	@FindBy(css="#LoginContinueBtn_1")
	private WebElement cleartrip_btn_Result2SimpleStepsPage_EmailAddress_ContinueButton;
	@FindBy(css="#AdultTitle1")
	private WebElement cleartrip_drpdown_Result2SimpleStepsPage_TravellersDetail_Honorifics;
	@FindBy(css="#AdultFname1")
	private WebElement cleartrip_txtbox_Result2SimpleStepsPage_TravellersDetail_FirstName;
	@FindBy(css="#AdultLname1")
	private WebElement cleartrip_txtbox_Result2SimpleStepsPage_TravellersDetail_LastName;
	@FindBy(css="#AdultDobDay1")
	private WebElement cleartrip_drpdown_Result2SimpleStepsPage_TravellersDetail_BirthDate;
	@FindBy(css="#AdultDobMonth1")
	private WebElement cleartrip_drpdown_Result2SimpleStepsPage_TravellersDetail_BirthMonth;
	@FindBy(css="#AdultDobYear1")
	private WebElement cleartrip_drpdown_Result2SimpleStepsPage_TravellersDetail_BirthYear;
	@FindBy(css="#AdultVisaType1")
	private WebElement cleartrip_drpdown_Result2SimpleStepsPage_TravellersDetail_VisaType;
	@FindBy(css="#mobileNumber")
	private WebElement cleartrip_txtbox_Result2SimpleStepsPage_TravellersDetail_MobileNumber;
	@FindBy(css="#travellerBtn")
	private WebElement cleartrip_btn_Result2SimpleStepsPage_TravellersDetail_Continue;
	
	
    // every page object has it's local private wait with fixed 10 sec delay
    private WebDriverWait objWait 		= new WebDriverWait(this.objWebDriverAbstract, 10);


    private boolean cleartrip_Common_Activity_EnterSimpleUserDetails(JSONObject objJSON_cleartripAdultPassangerDetails){
    	
		boolean bcleartrip_ThisElementValidationStatus 		= true;
		Select clearTrip_drpdwn_General 					= null;
		
		System.out.println("DEBUG:    Completing user data formalities");
		
		cleartrip_btn_Result2SimpleStepsPage_Iterniery_ContinueButton.click();
		objWait.until(ExpectedConditions.visibilityOf(cleartrip_lst_labl_Result2SimpleStepsPage_SimpleSteps_Stage.get(0)));

		System.out.println("DEBUG:    Entering the passanger details");
		cleartrip_txtbox_Result2SimpleStepsPage_EmailAddress_UserName.sendKeys(objJSON_cleartripAdultPassangerDetails.get("Email").toString());
		cleartrip_tickbox_Result2SimpleStepsPage_EmailAddress_NewsLatterSubscribe.click();
		cleartrip_btn_Result2SimpleStepsPage_EmailAddress_ContinueButton.click();
		try{objWait.until(ExpectedConditions.visibilityOf(cleartrip_lst_labl_Result2SimpleStepsPage_SimpleSteps_Stage.get(0)));}catch(Exception e){}
		objWait.until(ExpectedConditions.visibilityOf(cleartrip_lst_labl_Result2SimpleStepsPage_SimpleSteps_Stage.get(0)));
		
		clearTrip_drpdwn_General = new Select(cleartrip_drpdown_Result2SimpleStepsPage_TravellersDetail_Honorifics);
		clearTrip_drpdwn_General.selectByValue(objJSON_cleartripAdultPassangerDetails.get("Honorifics").toString().trim());
		cleartrip_txtbox_Result2SimpleStepsPage_TravellersDetail_FirstName.sendKeys(objJSON_cleartripAdultPassangerDetails.get("FirstName").toString());
		cleartrip_txtbox_Result2SimpleStepsPage_TravellersDetail_LastName.sendKeys(objJSON_cleartripAdultPassangerDetails.get("LastName").toString());
		clearTrip_drpdwn_General = new Select(cleartrip_drpdown_Result2SimpleStepsPage_TravellersDetail_BirthDate);
		clearTrip_drpdwn_General.selectByValue(objJSON_cleartripAdultPassangerDetails.get("BirthDate").toString().trim());
		clearTrip_drpdwn_General = new Select(cleartrip_drpdown_Result2SimpleStepsPage_TravellersDetail_BirthMonth);
		clearTrip_drpdwn_General.selectByValue(objJSON_cleartripAdultPassangerDetails.get("BirthMonth").toString().trim());
		clearTrip_drpdwn_General = new Select(cleartrip_drpdown_Result2SimpleStepsPage_TravellersDetail_BirthYear);
		clearTrip_drpdwn_General.selectByValue(objJSON_cleartripAdultPassangerDetails.get("BirthYear").toString().trim());
		clearTrip_drpdwn_General = new Select(cleartrip_drpdown_Result2SimpleStepsPage_TravellersDetail_VisaType);
		clearTrip_drpdwn_General.selectByValue(objJSON_cleartripAdultPassangerDetails.get("VisaType").toString().trim());
		cleartrip_txtbox_Result2SimpleStepsPage_TravellersDetail_MobileNumber.sendKeys(objJSON_cleartripAdultPassangerDetails.get("ContactPhone").toString());
		cleartrip_btn_Result2SimpleStepsPage_TravellersDetail_Continue.click();
		objWait.until(ExpectedConditions.visibilityOf(cleartrip_lst_labl_Result2SimpleStepsPage_SimpleSteps_Stage.get(0)));

		return bcleartrip_ThisElementValidationStatus;    	
    }
	
	public boolean cleartrip_Validate_EndToEnd_Search_Scenario__TYPE3_CASE1(JSONObject objJSON_cleartripAdultPassangerDetails){

		return cleartrip_Common_Activity_EnterSimpleUserDetails(objJSON_cleartripAdultPassangerDetails);
	}
	
	public boolean cleartrip_Validate_EndToEnd_Search_Scenario__Until_Payment_Section(JSONObject objJSON_cleartripAdultPassangerDetails){
		
		return cleartrip_Common_Activity_EnterSimpleUserDetails(objJSON_cleartripAdultPassangerDetails);
	}
	
	
	
	
	
}
