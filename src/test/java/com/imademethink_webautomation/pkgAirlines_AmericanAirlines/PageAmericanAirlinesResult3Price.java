package com.imademethink_webautomation.pkgAirlines_AmericanAirlines;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.imademethink_webautomation.pkg0GeneralPageFactory.Page0Abstract;

public class PageAmericanAirlinesResult3Price extends Page0Abstract {

	//private PageAmericanAirlinesResult0InProgress 	objLocal_PageAmericanAirlinesResult0InProgress = null;
	//private PageAmericanAirlinesResult2SelectFlight	objLocal_PageAmericanAirlinesResult2SelectFlight = null;
	//private PageAmericanAirlinesResult3Price		objLocal_PageAmericanAirlinesResult3Price = null;
	private PageAmericanAirlinesResult4PassengerDetail	objLocal_PageAmericanAirlinesResult4PassengerDetail = null;
	//private PageAmericanAirlines99General   	objLocal_PageAmericanAirlinesResult99vGeneral   = null;
	
	public PageAmericanAirlinesResult3Price(WebDriver driver) {
		super(driver);
		//System.out.println("DEBUG:    PageAmericanAirlinesResult3Price constructor");
		PageFactory.initElements(driver, this);
		//objLocal_PageAmericanAirlinesResult0InProgress  	= new PageAmericanAirlinesResult0InProgress(driver);
		//objLocal_PageAmericanAirlinesResult2SelectFlight	= new PageAmericanAirlinesResult2SelectFlight(driver);
		//objLocal_PageAmericanAirlinesResult3Price			= new PageAmericanAirlinesResult3Price(driver);
		objLocal_PageAmericanAirlinesResult4PassengerDetail	= new PageAmericanAirlinesResult4PassengerDetail(driver);
		//objLocal_PageAmericanAirlinesResult99General 		= new PageAmericanAirlines99General(driver);
    }
	
	// public elements so that other class can also access
	@FindBy(css=".step-current")
	public WebElement AmericanAirlines_Result3Page_CurrentStep;
	@FindBy(css=".textBold.nowrap")
	public List<WebElement> AmericanAirlines_lst_Result3Page_ErrorOccured;
	@FindBy(css="#WDSErrorContainer>h1")
	public List<WebElement> AmericanAirlines_lst_Result3Page_Error_Type2_Heading;
	@FindBy(css=".WDSErrorE")
	public WebElement AmericanAirlines_Result3Page_Error_Type2_Text;
	
    // other links
    @FindBy(linkText = "New Phishing Email Alert")
	private WebElement AmericanAirlines_lnk_NewPhishingEmailAlert;
    @FindBy(linkText = "Explore our new AAdvantage Award Map")
	private WebElement AmericanAirlines_lnk_ExploreournewAAdvantageAwardMap;
    @FindBy(linkText = "AA and BA offer customers seamless service to India")
	private WebElement AmericanAirlines_lnk_AAandBA_Offer;
    @FindBy(linkText = "Redeem your miles for hotel stays and car hire")
	private WebElement AmericanAirlines_lnk_RedeemYourMilesForHotel;
    @FindBy(linkText = "Redeem your miles online with your credit card")
	private WebElement AmericanAirlines_lnk_RedeemYourMilesOnline;
    @FindBy(linkText = "See more videos on our YouTube channel")
	private WebElement AmericanAirlines_lnk_MoreVideosOnYoutube;
    
    // private elements
	@FindBy(css="#btnTravellerDetailsFare")
	private WebElement AmericanAirlines_lnk_Result3Page_TravellerDetailsPage;

    // error message
    @FindBy(css=".errorMessage")
    private List<WebElement> AmericanAirlines_lst_labl_MainPageErrors;
    
    
    // every page object has it's local private wait with fixed 10 sec delay
	private WebDriverWait objWait = new WebDriverWait(this.objWebDriverAbstract, 10);
	
    public boolean AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE1_CASE1(){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;

		System.out.println("DEBUG:    Reviewing flight details");
		AmericanAirlines_lnk_Result3Page_TravellerDetailsPage.click();
		
		objWait.until(ExpectedConditions.textToBePresentInElement(objLocal_PageAmericanAirlinesResult4PassengerDetail.AmericanAirlines_Result4Page_CurrentStep, "4"));   

		if(objLocal_PageAmericanAirlinesResult4PassengerDetail.AmericanAirlines_lst_Result4Page_Error_Type2_Heading.size() >0 ){
			String strErrorText = "";
			if (objLocal_PageAmericanAirlinesResult4PassengerDetail.AmericanAirlines_Result4Page_Error_Type2_Text.isDisplayed()){
				strErrorText = objLocal_PageAmericanAirlinesResult4PassengerDetail.AmericanAirlines_Result4Page_Error_Type2_Text.getText();
			}
			System.out.println("ERROR:    Error occured in search results for TYPE1_CASE1 - upto passanger details page: " + strErrorText);
			objSoftAssert.fail("ERROR:    Error occured in search results for TYPE1_CASE1 - upto passanger details page: " + strErrorText);
			bAmericanAirlines_ThisElementValidationStatus = false;
		}

		return bAmericanAirlines_ThisElementValidationStatus;
	}
    
    public boolean AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE3_CASE1(){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;

		System.out.println("DEBUG:    Reviewing flight details");
		AmericanAirlines_lnk_Result3Page_TravellerDetailsPage.click();
		
		objWait.until(ExpectedConditions.textToBePresentInElement(objLocal_PageAmericanAirlinesResult4PassengerDetail.AmericanAirlines_Result4Page_CurrentStep, "4"));   

		if(objLocal_PageAmericanAirlinesResult4PassengerDetail.AmericanAirlines_lst_Result4Page_Error_Type2_Heading.size() >0 ){
			String strErrorText = "";
			if (objLocal_PageAmericanAirlinesResult4PassengerDetail.AmericanAirlines_Result4Page_Error_Type2_Text.isDisplayed()){
				strErrorText = objLocal_PageAmericanAirlinesResult4PassengerDetail.AmericanAirlines_Result4Page_Error_Type2_Text.getText();
			}
			System.out.println("ERROR:    Error occured in search results for TYPE3_CASE1 - upto passanger details page: " + strErrorText);
			objSoftAssert.fail("ERROR:    Error occured in search results for TYPE3_CASE1 - upto passanger details page: " + strErrorText);
			bAmericanAirlines_ThisElementValidationStatus = false;
		}

		return bAmericanAirlines_ThisElementValidationStatus;
	}
    
    public boolean AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE3_CASE2(){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;

		System.out.println("DEBUG:    Reviewing flight details");
		AmericanAirlines_lnk_Result3Page_TravellerDetailsPage.click();
		
		objWait.until(ExpectedConditions.textToBePresentInElement(objLocal_PageAmericanAirlinesResult4PassengerDetail.AmericanAirlines_Result4Page_CurrentStep, "4"));   

		if(objLocal_PageAmericanAirlinesResult4PassengerDetail.AmericanAirlines_lst_Result4Page_Error_Type2_Heading.size() >0 ){
			String strErrorText = "";
			if (objLocal_PageAmericanAirlinesResult4PassengerDetail.AmericanAirlines_Result4Page_Error_Type2_Text.isDisplayed()){
				strErrorText = objLocal_PageAmericanAirlinesResult4PassengerDetail.AmericanAirlines_Result4Page_Error_Type2_Text.getText();
			}
			System.out.println("ERROR:    Error occured in search results for TYPE3_CASE2 - upto passanger details page: " + strErrorText);
			objSoftAssert.fail("ERROR:    Error occured in search results for TYPE3_CASE2 - upto passanger details page: " + strErrorText);
			bAmericanAirlines_ThisElementValidationStatus = false;
		}

		return bAmericanAirlines_ThisElementValidationStatus;
	}
    
    public boolean AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE3_CASE4(){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;

		System.out.println("DEBUG:    Reviewing flight details");
		AmericanAirlines_lnk_Result3Page_TravellerDetailsPage.click();
		
		objWait.until(ExpectedConditions.textToBePresentInElement(objLocal_PageAmericanAirlinesResult4PassengerDetail.AmericanAirlines_Result4Page_CurrentStep, "4"));   

		if(objLocal_PageAmericanAirlinesResult4PassengerDetail.AmericanAirlines_lst_Result4Page_Error_Type2_Heading.size() >0 ){
			String strErrorText = "";
			if (objLocal_PageAmericanAirlinesResult4PassengerDetail.AmericanAirlines_Result4Page_Error_Type2_Text.isDisplayed()){
				strErrorText = objLocal_PageAmericanAirlinesResult4PassengerDetail.AmericanAirlines_Result4Page_Error_Type2_Text.getText();
			}
			System.out.println("ERROR:    Error occured in search results for TYPE3_CASE4 - upto passanger details page: " + strErrorText);
			objSoftAssert.fail("ERROR:    Error occured in search results for TYPE3_CASE4 - upto passanger details page: " + strErrorText);
			bAmericanAirlines_ThisElementValidationStatus = false;
		}

		return bAmericanAirlines_ThisElementValidationStatus;
	}
    
    public boolean AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE3_CASE5(){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;

		System.out.println("DEBUG:    Reviewing flight details");
		AmericanAirlines_lnk_Result3Page_TravellerDetailsPage.click();
		
		objWait.until(ExpectedConditions.textToBePresentInElement(objLocal_PageAmericanAirlinesResult4PassengerDetail.AmericanAirlines_Result4Page_CurrentStep, "4"));   

		if(objLocal_PageAmericanAirlinesResult4PassengerDetail.AmericanAirlines_lst_Result4Page_Error_Type2_Heading.size() >0 ){
			String strErrorText = "";
			if (objLocal_PageAmericanAirlinesResult4PassengerDetail.AmericanAirlines_Result4Page_Error_Type2_Text.isDisplayed()){
				strErrorText = objLocal_PageAmericanAirlinesResult4PassengerDetail.AmericanAirlines_Result4Page_Error_Type2_Text.getText();
			}
			System.out.println("ERROR:    Error occured in search results for TYPE3_CASE5 - upto passanger details page: " + strErrorText);
			objSoftAssert.fail("ERROR:    Error occured in search results for TYPE3_CASE5 - upto passanger details page: " + strErrorText);
			bAmericanAirlines_ThisElementValidationStatus = false;
		}

		return bAmericanAirlines_ThisElementValidationStatus;
	}
    
    public boolean AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE4_CASE1(){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;

		System.out.println("DEBUG:    Reviewing flight details");
		AmericanAirlines_lnk_Result3Page_TravellerDetailsPage.click();
		
		objWait.until(ExpectedConditions.textToBePresentInElement(objLocal_PageAmericanAirlinesResult4PassengerDetail.AmericanAirlines_Result4Page_CurrentStep, "4"));   

		if(objLocal_PageAmericanAirlinesResult4PassengerDetail.AmericanAirlines_lst_Result4Page_Error_Type2_Heading.size() >0 ){
			String strErrorText = "";
			if (objLocal_PageAmericanAirlinesResult4PassengerDetail.AmericanAirlines_Result4Page_Error_Type2_Text.isDisplayed()){
				strErrorText = objLocal_PageAmericanAirlinesResult4PassengerDetail.AmericanAirlines_Result4Page_Error_Type2_Text.getText();
			}
			System.out.println("ERROR:    Error occured in search results for TYPE4_CASE1 - upto passanger details page: " + strErrorText);
			objSoftAssert.fail("ERROR:    Error occured in search results for TYPE4_CASE1 - upto passanger details page: " + strErrorText);
			bAmericanAirlines_ThisElementValidationStatus = false;
		}

		return bAmericanAirlines_ThisElementValidationStatus;
	}
    
    public boolean AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE4_CASE2(){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;

		System.out.println("DEBUG:    Reviewing flight details");
		AmericanAirlines_lnk_Result3Page_TravellerDetailsPage.click();
		
		objWait.until(ExpectedConditions.textToBePresentInElement(objLocal_PageAmericanAirlinesResult4PassengerDetail.AmericanAirlines_Result4Page_CurrentStep, "4"));   

		if(objLocal_PageAmericanAirlinesResult4PassengerDetail.AmericanAirlines_lst_Result4Page_Error_Type2_Heading.size() >0 ){
			String strErrorText = "";
			if (objLocal_PageAmericanAirlinesResult4PassengerDetail.AmericanAirlines_Result4Page_Error_Type2_Text.isDisplayed()){
				strErrorText = objLocal_PageAmericanAirlinesResult4PassengerDetail.AmericanAirlines_Result4Page_Error_Type2_Text.getText();
			}
			System.out.println("ERROR:    Error occured in search results for TYPE4_CASE2 - upto passanger details page: " + strErrorText);
			objSoftAssert.fail("ERROR:    Error occured in search results for TYPE4_CASE2 - upto passanger details page: " + strErrorText);
			bAmericanAirlines_ThisElementValidationStatus = false;
		}

		return bAmericanAirlines_ThisElementValidationStatus;
	}
    
    public boolean AmericanAirlines_Validate_EndToEnd_Search_Scenario__Until_Payment_Section(){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;

		System.out.println("DEBUG:    Reviewing flight details");
		AmericanAirlines_lnk_Result3Page_TravellerDetailsPage.click();
		
		objWait.until(ExpectedConditions.textToBePresentInElement(objLocal_PageAmericanAirlinesResult4PassengerDetail.AmericanAirlines_Result4Page_CurrentStep, "4"));   

		if(objLocal_PageAmericanAirlinesResult4PassengerDetail.AmericanAirlines_lst_Result4Page_Error_Type2_Heading.size() >0 ){
			String strErrorText = "";
			if (objLocal_PageAmericanAirlinesResult4PassengerDetail.AmericanAirlines_Result4Page_Error_Type2_Text.isDisplayed()){
				strErrorText = objLocal_PageAmericanAirlinesResult4PassengerDetail.AmericanAirlines_Result4Page_Error_Type2_Text.getText();
			}
			System.out.println("ERROR:    Error occured in search results for until payment section scenario - upto passanger details page: " + strErrorText);
			objSoftAssert.fail("ERROR:    Error occured in search results for until payment section scenario - upto passanger details page: " + strErrorText);
			bAmericanAirlines_ThisElementValidationStatus = false;
		}

		return bAmericanAirlines_ThisElementValidationStatus;
	}

    public boolean AmericanAirlines_Perform_SimpleActivity_and_NavigateToNextPage(){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;

		AmericanAirlines_lnk_Result3Page_TravellerDetailsPage.click();
		
		objWait.until(ExpectedConditions.textToBePresentInElement(objLocal_PageAmericanAirlinesResult4PassengerDetail.AmericanAirlines_Result4Page_CurrentStep, "4"));   

		if(objLocal_PageAmericanAirlinesResult4PassengerDetail.AmericanAirlines_lst_Result4Page_Error_Type2_Heading.size() >0 ){
			String strErrorText = "";
			if (objLocal_PageAmericanAirlinesResult4PassengerDetail.AmericanAirlines_Result4Page_Error_Type2_Text.isDisplayed()){
				strErrorText = objLocal_PageAmericanAirlinesResult4PassengerDetail.AmericanAirlines_Result4Page_Error_Type2_Text.getText();
			}
			System.out.println("ERROR:    Error occured in performing simple activity - upto passanger details page: " + strErrorText);
			objSoftAssert.fail("ERROR:    Error occured in performing simple activity - upto passanger details page: " + strErrorText);
			bAmericanAirlines_ThisElementValidationStatus = false;
		}

		return bAmericanAirlines_ThisElementValidationStatus;
	}
    
    
    
    
    
    
    
    
    
    
	
}
