package com.imademethink_webautomation.pkgAirlines_AmericanAirlines;

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

public class PageAmericanAirlinesResult5Payment extends Page0Abstract {

	//private PageAmericanAirlinesResult0InProgress 	objLocal_PageAmericanAirlinesResult0InProgress = null;
	//private PageAmericanAirlinesResult2SelectFlight	objLocal_PageAmericanAirlinesResult2SelectFlight = null;
	//private PageAmericanAirlinesResult3Price		objLocal_PageAmericanAirlinesResult3Price = null;
	//private PageAmericanAirlinesResult4PassengerDetail	objLocal_PageAmericanAirlinesResult4PassengerDetail = null;
	//private PageAmericanAirlinesResult5Payment			objLocal_PageAmericanAirlinesResult5Payment = null;
	//private PageAmericanAirlinesResult6_____comingsoon			objLocal_PageAmericanAirlinesResult6_____comingsoon = null;
	//private PageAmericanAirlines99General   	objLocal_PageAmericanAirlinesResult99vGeneral   = null;

	
	public PageAmericanAirlinesResult5Payment(WebDriver driver) {
		super(driver);
		//System.out.println("DEBUG:    PageAmericanAirlinesResult5Payment constructor");
		PageFactory.initElements(driver, this);
		//objLocal_PageAmericanAirlinesResult0InProgress  	= new PageAmericanAirlinesResult0InProgress(driver);
		//objLocal_PageAmericanAirlinesResult2SelectFlight	= new PageAmericanAirlinesResult2SelectFlight(driver);
		//objLocal_PageAmericanAirlinesResult3Price			= new PageAmericanAirlinesResult3Price(driver);
		//objLocal_PageAmericanAirlinesResult4PassengerDetail	= new PageAmericanAirlinesResult4PassengerDetail(driver);
		//objLocal_PageAmericanAirlinesResult5Payment			= new PageAmericanAirlinesResult5Payment(driver);
		//objLocal_PageAmericanAirlinesResult6_____comingsoon		= new PageAmericanAirlinesResult6_____comingsoon(driver);
		//objLocal_PageAmericanAirlinesResult99General 		= new PageAmericanAirlines99General(driver);
	}

	// public elements so that other class can also access
	@FindBy(css=".step-current")
	public WebElement AmericanAirlines_Result5Page_CurrentStep;
	@FindBy(css=".textBold.nowrap")
	public List<WebElement> AmericanAirlines_lst_Result5Page_ErrorOccured;
	@FindBy(css="#WDSErrorContainer>h1")
	public List<WebElement> AmericanAirlines_lst_Result5Page_Error_Type2_Heading;
	@FindBy(css=".WDSErrorE")
	public WebElement AmericanAirlines_Result5Page_Error_Type2_Text;
	
    // other private elements
	@FindBy(css="#CC")
	private WebElement AmericanAirlines_radiobtn_Result5Page_PurchaseNow;
	@FindBy(css="#PLCC")
	private WebElement AmericanAirlines_radiobtn_Result5Page_OtherPurchaseOption;
	@FindBy(css="#PLCC")
	private WebElement AmericanAirlines_radiobtn_Result5Page_PurchaseLater_OR_BankXfer_OR_OnlineBanking;
	@FindBy(css="#CheckPenaliesBox")
	private WebElement AmericanAirlines_tickbox_Result5Page_WebsiteAgreement_PrivacyPolicy_BaggageCharges;
	@FindBy(css="#CheckPHMSADangerousGoodsNotice")
	private WebElement AmericanAirlines_tickbox_Result5Page_Hazardousmaterialsanddangerousgoodspolicy;
	@FindBy(css="#btnConfirmPurc")
	private WebElement AmericanAirlines_btn_Result5Page_Purchase;
	
	// payment related private elements
	@FindBy(css="#AIR_CC_TYPE")
	private WebElement AmericanAirlines_drpdwn_Result5Page_CardType;
	@FindBy(css="#creditCardEntryField1")
	private WebElement AmericanAirlines_txtbox_Result5Page_CardNumber1;
	@FindBy(css="#creditCardEntryField2")
	private WebElement AmericanAirlines_txtbox_Result5Page_CardNumber2;
	@FindBy(css="#creditCardEntryField3")
	private WebElement AmericanAirlines_txtbox_Result5Page_CardNumber3;
	@FindBy(css="#creditCardEntryField4")
	private WebElement AmericanAirlines_txtbox_Result5Page_CardNumber4;
	@FindBy(css="#CC_DIGIT_CODE_AIR_1")
	private WebElement AmericanAirlines_txtbox_Result5Page_CardCVVnumber;
	@FindBy(css="#CCexpiryDateMonth")
	private WebElement AmericanAirlines_drpdon_Result5Page_CC_ExpiryMonth;
	@FindBy(css="#CCexpiryDateYear")
	private WebElement AmericanAirlines_drpdon_Result5Page_CC_ExpiryYear;
	@FindBy(css="#AIR_CC_NAME_ON_CARD")
	private WebElement AmericanAirlines_txtbox_Result5Page_CardHolderName;
	@FindBy(css="#AIR_CC_ADDRESS_FIRSTLINE")
	private WebElement AmericanAirlines_txtbox_Result5Page_Address1;
	@FindBy(css="#AIR_CC_ADDRESS_SECONDLINE")
	private WebElement AmericanAirlines_txtbox_Result5Page_Address2;
	@FindBy(css="#AIR_CC_ADDRESS_ZIPCODE")
	private WebElement AmericanAirlines_txtbox_Result5Page_PostalorZIPCode;
	@FindBy(css="#AIR_CC_ADDRESS_CITY")
	private WebElement AmericanAirlines_txtbox_Result5Page_City;
	@FindBy(css="#AIR_CC_ADDRESS_STATE")
	private WebElement AmericanAirlines_txtbox_Result5Page_StateORProvience;
	@FindBy(css="#AIR_CC_DROPDOWN_LIST")
	private WebElement AmericanAirlines_drpdon_Result5Page_Country;
	@FindBy(css="#creditCardSingleField")
	private WebElement AmericanAirlines_txtbox_Result5Page_American_Express__Diners_Club__JCB__CardNumber;
	
	
    // every page object has it's local private wait with fixed 10 sec delay
	private WebDriverWait objWait = new WebDriverWait(this.objWebDriverAbstract, 10);   
    
    
    public boolean AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE3_CASE1(JSONObject objJSON_AmericanAirlines_DummyCreditCardDetails_VISA){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;
		Select AmericanAirlines_drpdwn_CardType						= new Select(AmericanAirlines_drpdwn_Result5Page_CardType);
		Select AmericanAirlines_drpdwn_ExpiryMonth					= new Select(AmericanAirlines_drpdon_Result5Page_CC_ExpiryMonth);
		Select AmericanAirlines_drpdwn_ExpiryYear					= new Select(AmericanAirlines_drpdon_Result5Page_CC_ExpiryYear);
		Select AmericanAirlines_drpdwn_Country						= new Select(AmericanAirlines_drpdon_Result5Page_Country);
		
		System.out.println("DEBUG:    Entering the ayment details - VISA payment");
		
		// select purchase now option
		AmericanAirlines_radiobtn_Result5Page_PurchaseNow.click();
		if (! AmericanAirlines_radiobtn_Result5Page_PurchaseNow.isSelected()){
			System.out.println("ERROR:    Unable to select purchase now option for TYPE3_CASE1");
			objSoftAssert.fail("ERROR:    Unable to select purchase now option for TYPE3_CASE1");
			return false;
		}
		
		// fill the payment details
		AmericanAirlines_drpdwn_CardType.selectByVisibleText(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("CardType"));
		AmericanAirlines_txtbox_Result5Page_CardNumber1.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("CreditCardNumber1"));
		AmericanAirlines_txtbox_Result5Page_CardNumber2.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("CreditCardNumber2"));
		AmericanAirlines_txtbox_Result5Page_CardNumber3.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("CreditCardNumber3"));
		AmericanAirlines_txtbox_Result5Page_CardNumber4.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("CreditCardNumber4"));
		AmericanAirlines_txtbox_Result5Page_CardCVVnumber.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("CreditCardCVVnumber"));
		AmericanAirlines_drpdwn_ExpiryMonth.selectByVisibleText(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("ExpiryMonth"));
		AmericanAirlines_drpdwn_ExpiryYear.selectByVisibleText(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("ExpiryYear"));
		AmericanAirlines_txtbox_Result5Page_CardHolderName.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("CardHolderName"));
		AmericanAirlines_txtbox_Result5Page_Address1.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("Address1"));
		AmericanAirlines_txtbox_Result5Page_Address2.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("Address2"));
		AmericanAirlines_txtbox_Result5Page_PostalorZIPCode.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("PostalCode"));
		AmericanAirlines_txtbox_Result5Page_City.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("City"));
		AmericanAirlines_txtbox_Result5Page_StateORProvience.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("StateOrProvince"));
		AmericanAirlines_drpdwn_Country.selectByVisibleText(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("Country"));

		// accept agreement, terms & condition. policy
		AmericanAirlines_tickbox_Result5Page_WebsiteAgreement_PrivacyPolicy_BaggageCharges.click();
		AmericanAirlines_tickbox_Result5Page_Hazardousmaterialsanddangerousgoodspolicy.click();
		
		// click on purchase
		AmericanAirlines_btn_Result5Page_Purchase.click();
		objWait.until(ExpectedConditions.textToBePresentInElement(AmericanAirlines_Result5Page_CurrentStep, "5"));

		// since it is dummy card payment, it will fail
		if(AmericanAirlines_lst_Result5Page_Error_Type2_Heading.size() >0 ){
			String strErrorText = "";
			if (AmericanAirlines_Result5Page_Error_Type2_Text.isDisplayed()){
				strErrorText = AmericanAirlines_Result5Page_Error_Type2_Text.getText();
			}
			objSoftAssert.fail("ERROR:    Error occured in search results for TYPE3_CASE1 - upto payment page: \n" + strErrorText);
			System.out.println("ERROR:    Error occured in search results for TYPE3_CASE1 - upto payment page: \n" + strErrorText);
			//bAmericanAirlines_ThisElementValidationStatus = false;
		}

		return bAmericanAirlines_ThisElementValidationStatus;
	}
    
    public boolean AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE3_CASE2(JSONObject objJSON_AmericanAirlines_DummyCreditCardDetails_VISA){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;
		Select AmericanAirlines_drpdwn_CardType						= new Select(AmericanAirlines_drpdwn_Result5Page_CardType);
		Select AmericanAirlines_drpdwn_ExpiryMonth					= new Select(AmericanAirlines_drpdon_Result5Page_CC_ExpiryMonth);
		Select AmericanAirlines_drpdwn_ExpiryYear					= new Select(AmericanAirlines_drpdon_Result5Page_CC_ExpiryYear);
		Select AmericanAirlines_drpdwn_Country						= new Select(AmericanAirlines_drpdon_Result5Page_Country);
		
		System.out.println("DEBUG:    Entering the payment details - VISA payment");

		// select purchase now option
		AmericanAirlines_radiobtn_Result5Page_PurchaseNow.click();
		if (! AmericanAirlines_radiobtn_Result5Page_PurchaseNow.isSelected()){
			System.out.println("ERROR:    Unable to select purchase now option for TYPE3_CASE2");
			objSoftAssert.fail("ERROR:    Unable to select purchase now option for TYPE3_CASE2");
			return false;
		}
		
		// fill the payment details
		AmericanAirlines_drpdwn_CardType.selectByVisibleText(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("CardType"));
		AmericanAirlines_txtbox_Result5Page_CardNumber1.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("CreditCardNumber1"));
		AmericanAirlines_txtbox_Result5Page_CardNumber2.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("CreditCardNumber2"));
		AmericanAirlines_txtbox_Result5Page_CardNumber3.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("CreditCardNumber3"));
		AmericanAirlines_txtbox_Result5Page_CardNumber4.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("CreditCardNumber4"));
		AmericanAirlines_txtbox_Result5Page_CardCVVnumber.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("CreditCardCVVnumber"));
		AmericanAirlines_drpdwn_ExpiryMonth.selectByVisibleText(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("ExpiryMonth"));
		AmericanAirlines_drpdwn_ExpiryYear.selectByVisibleText(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("ExpiryYear"));
		AmericanAirlines_txtbox_Result5Page_CardHolderName.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("CardHolderName"));
		AmericanAirlines_txtbox_Result5Page_Address1.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("Address1"));
		AmericanAirlines_txtbox_Result5Page_Address2.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("Address2"));
		AmericanAirlines_txtbox_Result5Page_PostalorZIPCode.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("PostalCode"));
		AmericanAirlines_txtbox_Result5Page_City.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("City"));
		AmericanAirlines_txtbox_Result5Page_StateORProvience.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("StateOrProvince"));
		AmericanAirlines_drpdwn_Country.selectByVisibleText(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("Country"));

		// accept agreement, terms & condition. policy
		AmericanAirlines_tickbox_Result5Page_WebsiteAgreement_PrivacyPolicy_BaggageCharges.click();
		AmericanAirlines_tickbox_Result5Page_Hazardousmaterialsanddangerousgoodspolicy.click();
		
		// click on purchase
		AmericanAirlines_btn_Result5Page_Purchase.click();
		objWait.until(ExpectedConditions.textToBePresentInElement(AmericanAirlines_Result5Page_CurrentStep, "5"));

		// since it is dummy card payment, it will fail
		if(AmericanAirlines_lst_Result5Page_Error_Type2_Heading.size() >0 ){
			String strErrorText = "";
			if (AmericanAirlines_Result5Page_Error_Type2_Text.isDisplayed()){
				strErrorText = AmericanAirlines_Result5Page_Error_Type2_Text.getText();
			}
			objSoftAssert.fail("ERROR:    Error occured in search results for TYPE3_CASE2 - upto payment page: \n" + strErrorText);
			System.out.println("ERROR:    Error occured in search results for TYPE3_CASE2 - upto payment page: \n" + strErrorText);
			//bAmericanAirlines_ThisElementValidationStatus = false;
		}

		return bAmericanAirlines_ThisElementValidationStatus;
	}
    
    public boolean AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE3_CASE4(JSONObject objJSON_AmericanAirlines_DummyCreditCardDetails_VISA){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;
		Select AmericanAirlines_drpdwn_CardType						= new Select(AmericanAirlines_drpdwn_Result5Page_CardType);
		Select AmericanAirlines_drpdwn_ExpiryMonth					= new Select(AmericanAirlines_drpdon_Result5Page_CC_ExpiryMonth);
		Select AmericanAirlines_drpdwn_ExpiryYear					= new Select(AmericanAirlines_drpdon_Result5Page_CC_ExpiryYear);
		Select AmericanAirlines_drpdwn_Country						= new Select(AmericanAirlines_drpdon_Result5Page_Country);
		
		System.out.println("DEBUG:    Entering the payment details - VISA payment");

		// select purchase now option
		AmericanAirlines_radiobtn_Result5Page_PurchaseNow.click();
		if (! AmericanAirlines_radiobtn_Result5Page_PurchaseNow.isSelected()){
			System.out.println("ERROR:    Unable to select purchase now option for TYPE3_CASE4");
			objSoftAssert.fail("ERROR:    Unable to select purchase now option for TYPE3_CASE4");
			return false;
		}
		
		// fill the payment details
		AmericanAirlines_drpdwn_CardType.selectByVisibleText(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("CardType"));
		AmericanAirlines_txtbox_Result5Page_CardNumber1.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("CreditCardNumber1"));
		AmericanAirlines_txtbox_Result5Page_CardNumber2.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("CreditCardNumber2"));
		AmericanAirlines_txtbox_Result5Page_CardNumber3.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("CreditCardNumber3"));
		AmericanAirlines_txtbox_Result5Page_CardNumber4.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("CreditCardNumber4"));
		AmericanAirlines_txtbox_Result5Page_CardCVVnumber.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("CreditCardCVVnumber"));
		AmericanAirlines_drpdwn_ExpiryMonth.selectByVisibleText(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("ExpiryMonth"));
		AmericanAirlines_drpdwn_ExpiryYear.selectByVisibleText(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("ExpiryYear"));
		AmericanAirlines_txtbox_Result5Page_CardHolderName.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("CardHolderName"));
		AmericanAirlines_txtbox_Result5Page_Address1.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("Address1"));
		AmericanAirlines_txtbox_Result5Page_Address2.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("Address2"));
		AmericanAirlines_txtbox_Result5Page_PostalorZIPCode.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("PostalCode"));
		AmericanAirlines_txtbox_Result5Page_City.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("City"));
		AmericanAirlines_txtbox_Result5Page_StateORProvience.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("StateOrProvince"));
		AmericanAirlines_drpdwn_Country.selectByVisibleText(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("Country"));

		// accept agreement, terms & condition. policy
		AmericanAirlines_tickbox_Result5Page_WebsiteAgreement_PrivacyPolicy_BaggageCharges.click();
		AmericanAirlines_tickbox_Result5Page_Hazardousmaterialsanddangerousgoodspolicy.click();
		
		// click on purchase
		AmericanAirlines_btn_Result5Page_Purchase.click();
		objWait.until(ExpectedConditions.textToBePresentInElement(AmericanAirlines_Result5Page_CurrentStep, "5"));

		// since it is dummy card payment, it will fail
		if(AmericanAirlines_lst_Result5Page_Error_Type2_Heading.size() >0 ){
			String strErrorText = "";
			if (AmericanAirlines_Result5Page_Error_Type2_Text.isDisplayed()){
				strErrorText = AmericanAirlines_Result5Page_Error_Type2_Text.getText();
			}
			objSoftAssert.fail("ERROR:    Error occured in search results for TYPE3_CASE4 - upto payment page: \n" + strErrorText);
			System.out.println("ERROR:    Error occured in search results for TYPE3_CASE4 - upto payment page: \n" + strErrorText);
			//bAmericanAirlines_ThisElementValidationStatus = false;
		}

		return bAmericanAirlines_ThisElementValidationStatus;
	}
    
    public boolean AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE3_CASE5(JSONObject objJSON_AmericanAirlines_DummyCreditCardDetails_VISA){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;
		Select AmericanAirlines_drpdwn_CardType						= new Select(AmericanAirlines_drpdwn_Result5Page_CardType);
		Select AmericanAirlines_drpdwn_ExpiryMonth					= new Select(AmericanAirlines_drpdon_Result5Page_CC_ExpiryMonth);
		Select AmericanAirlines_drpdwn_ExpiryYear					= new Select(AmericanAirlines_drpdon_Result5Page_CC_ExpiryYear);
		Select AmericanAirlines_drpdwn_Country						= new Select(AmericanAirlines_drpdon_Result5Page_Country);
		
		System.out.println("DEBUG:    Entering the payment details - VISA payment");

		// select purchase now option
		AmericanAirlines_radiobtn_Result5Page_PurchaseNow.click();
		if (! AmericanAirlines_radiobtn_Result5Page_PurchaseNow.isSelected()){
			System.out.println("ERROR:    Unable to select purchase now option for TYPE3_CASE5");
			objSoftAssert.fail("ERROR:    Unable to select purchase now option for TYPE3_CASE5");
			return false;
		}
		
		// fill the payment details
		AmericanAirlines_drpdwn_CardType.selectByVisibleText(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("CardType"));
		AmericanAirlines_txtbox_Result5Page_CardNumber1.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("CreditCardNumber1"));
		AmericanAirlines_txtbox_Result5Page_CardNumber2.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("CreditCardNumber2"));
		AmericanAirlines_txtbox_Result5Page_CardNumber3.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("CreditCardNumber3"));
		AmericanAirlines_txtbox_Result5Page_CardNumber4.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("CreditCardNumber4"));
		AmericanAirlines_txtbox_Result5Page_CardCVVnumber.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("CreditCardCVVnumber"));
		AmericanAirlines_drpdwn_ExpiryMonth.selectByVisibleText(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("ExpiryMonth"));
		AmericanAirlines_drpdwn_ExpiryYear.selectByVisibleText(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("ExpiryYear"));
		AmericanAirlines_txtbox_Result5Page_CardHolderName.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("CardHolderName"));
		AmericanAirlines_txtbox_Result5Page_Address1.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("Address1"));
		AmericanAirlines_txtbox_Result5Page_Address2.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("Address2"));
		AmericanAirlines_txtbox_Result5Page_PostalorZIPCode.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("PostalCode"));
		AmericanAirlines_txtbox_Result5Page_City.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("City"));
		AmericanAirlines_txtbox_Result5Page_StateORProvience.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("StateOrProvince"));
		AmericanAirlines_drpdwn_Country.selectByVisibleText(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("Country"));

		// accept agreement, terms & condition. policy
		AmericanAirlines_tickbox_Result5Page_WebsiteAgreement_PrivacyPolicy_BaggageCharges.click();
		AmericanAirlines_tickbox_Result5Page_Hazardousmaterialsanddangerousgoodspolicy.click();
		
		// click on purchase
		AmericanAirlines_btn_Result5Page_Purchase.click();
		objWait.until(ExpectedConditions.textToBePresentInElement(AmericanAirlines_Result5Page_CurrentStep, "5"));

		// since it is dummy card payment, it will fail
		if(AmericanAirlines_lst_Result5Page_Error_Type2_Heading.size() >0 ){
			String strErrorText = "";
			if (AmericanAirlines_Result5Page_Error_Type2_Text.isDisplayed()){
				strErrorText = AmericanAirlines_Result5Page_Error_Type2_Text.getText();
			}
			objSoftAssert.fail("ERROR:    Error occured in search results for TYPE3_CASE5 - upto payment page: \n" + strErrorText);
			System.out.println("ERROR:    Error occured in search results for TYPE3_CASE5 - upto payment page: \n" + strErrorText);
			//bAmericanAirlines_ThisElementValidationStatus = false;
		}

		return bAmericanAirlines_ThisElementValidationStatus;
	}
    
    public boolean AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE4_CASE1(JSONObject objJSON_AmericanAirlines_DummyCreditCardDetails_VISA){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;
		Select AmericanAirlines_drpdwn_CardType						= new Select(AmericanAirlines_drpdwn_Result5Page_CardType);
		Select AmericanAirlines_drpdwn_ExpiryMonth					= new Select(AmericanAirlines_drpdon_Result5Page_CC_ExpiryMonth);
		Select AmericanAirlines_drpdwn_ExpiryYear					= new Select(AmericanAirlines_drpdon_Result5Page_CC_ExpiryYear);
		Select AmericanAirlines_drpdwn_Country						= new Select(AmericanAirlines_drpdon_Result5Page_Country);
		
		System.out.println("DEBUG:    Entering the payment details - VISA payment");

		// select purchase now option
		AmericanAirlines_radiobtn_Result5Page_PurchaseNow.click();
		if (! AmericanAirlines_radiobtn_Result5Page_PurchaseNow.isSelected()){
			System.out.println("ERROR:    Unable to select purchase now option for TYPE4_CASE1");
			objSoftAssert.fail("ERROR:    Unable to select purchase now option for TYPE4_CASE1");
			return false;
		}
		
		// fill the payment details
		AmericanAirlines_drpdwn_CardType.selectByVisibleText(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("CardType"));
		AmericanAirlines_txtbox_Result5Page_CardNumber1.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("CreditCardNumber1"));
		AmericanAirlines_txtbox_Result5Page_CardNumber2.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("CreditCardNumber2"));
		AmericanAirlines_txtbox_Result5Page_CardNumber3.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("CreditCardNumber3"));
		AmericanAirlines_txtbox_Result5Page_CardNumber4.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("CreditCardNumber4"));
		AmericanAirlines_txtbox_Result5Page_CardCVVnumber.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("CreditCardCVVnumber"));
		AmericanAirlines_drpdwn_ExpiryMonth.selectByVisibleText(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("ExpiryMonth"));
		AmericanAirlines_drpdwn_ExpiryYear.selectByVisibleText(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("ExpiryYear"));
		AmericanAirlines_txtbox_Result5Page_CardHolderName.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("CardHolderName"));
		AmericanAirlines_txtbox_Result5Page_Address1.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("Address1"));
		AmericanAirlines_txtbox_Result5Page_Address2.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("Address2"));
		AmericanAirlines_txtbox_Result5Page_PostalorZIPCode.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("PostalCode"));
		AmericanAirlines_txtbox_Result5Page_City.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("City"));
		AmericanAirlines_txtbox_Result5Page_StateORProvience.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("StateOrProvince"));
		AmericanAirlines_drpdwn_Country.selectByVisibleText(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("Country"));

		// accept agreement, terms & condition. policy
		AmericanAirlines_tickbox_Result5Page_WebsiteAgreement_PrivacyPolicy_BaggageCharges.click();
		AmericanAirlines_tickbox_Result5Page_Hazardousmaterialsanddangerousgoodspolicy.click();
		
		// click on purchase
		AmericanAirlines_btn_Result5Page_Purchase.click();
		objWait.until(ExpectedConditions.textToBePresentInElement(AmericanAirlines_Result5Page_CurrentStep, "5"));

		// since it is dummy card payment, it will fail
		if(AmericanAirlines_lst_Result5Page_Error_Type2_Heading.size() >0 ){
			String strErrorText = "";
			if (AmericanAirlines_Result5Page_Error_Type2_Text.isDisplayed()){
				strErrorText = AmericanAirlines_Result5Page_Error_Type2_Text.getText();
			}
			objSoftAssert.fail("ERROR:    Error occured in search results for TYPE4_CASE1 - upto payment page: \n" + strErrorText);
			System.out.println("ERROR:    Error occured in search results for TYPE4_CASE1 - upto payment page: \n" + strErrorText);
			//bAmericanAirlines_ThisElementValidationStatus = false;
		}

		return bAmericanAirlines_ThisElementValidationStatus;
	}
    
    public boolean AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE4_CASE2(JSONObject objJSON_AmericanAirlines_DummyCreditCardDetails_VISA){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;
		Select AmericanAirlines_drpdwn_CardType						= new Select(AmericanAirlines_drpdwn_Result5Page_CardType);
		Select AmericanAirlines_drpdwn_ExpiryMonth					= new Select(AmericanAirlines_drpdon_Result5Page_CC_ExpiryMonth);
		Select AmericanAirlines_drpdwn_ExpiryYear					= new Select(AmericanAirlines_drpdon_Result5Page_CC_ExpiryYear);
		Select AmericanAirlines_drpdwn_Country						= new Select(AmericanAirlines_drpdon_Result5Page_Country);
		
		System.out.println("DEBUG:    Entering the payment details - VISA payment");

		// select purchase now option
		AmericanAirlines_radiobtn_Result5Page_PurchaseNow.click();
		if (! AmericanAirlines_radiobtn_Result5Page_PurchaseNow.isSelected()){
			System.out.println("ERROR:    Unable to select purchase now option for TYPE4_CASE2");
			objSoftAssert.fail("ERROR:    Unable to select purchase now option for TYPE4_CASE2");
			return false;
		}
		
		// fill the payment details
		AmericanAirlines_drpdwn_CardType.selectByVisibleText(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("CardType"));
		AmericanAirlines_txtbox_Result5Page_CardNumber1.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("CreditCardNumber1"));
		AmericanAirlines_txtbox_Result5Page_CardNumber2.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("CreditCardNumber2"));
		AmericanAirlines_txtbox_Result5Page_CardNumber3.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("CreditCardNumber3"));
		AmericanAirlines_txtbox_Result5Page_CardNumber4.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("CreditCardNumber4"));
		AmericanAirlines_txtbox_Result5Page_CardCVVnumber.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("CreditCardCVVnumber"));
		AmericanAirlines_drpdwn_ExpiryMonth.selectByVisibleText(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("ExpiryMonth"));
		AmericanAirlines_drpdwn_ExpiryYear.selectByVisibleText(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("ExpiryYear"));
		AmericanAirlines_txtbox_Result5Page_CardHolderName.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("CardHolderName"));
		AmericanAirlines_txtbox_Result5Page_Address1.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("Address1"));
		AmericanAirlines_txtbox_Result5Page_Address2.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("Address2"));
		AmericanAirlines_txtbox_Result5Page_PostalorZIPCode.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("PostalCode"));
		AmericanAirlines_txtbox_Result5Page_City.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("City"));
		AmericanAirlines_txtbox_Result5Page_StateORProvience.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("StateOrProvince"));
		AmericanAirlines_drpdwn_Country.selectByVisibleText(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("Country"));

		// accept agreement, terms & condition. policy
		AmericanAirlines_tickbox_Result5Page_WebsiteAgreement_PrivacyPolicy_BaggageCharges.click();
		AmericanAirlines_tickbox_Result5Page_Hazardousmaterialsanddangerousgoodspolicy.click();
		
		// click on purchase
		AmericanAirlines_btn_Result5Page_Purchase.click();
		objWait.until(ExpectedConditions.textToBePresentInElement(AmericanAirlines_Result5Page_CurrentStep, "5"));

		// since it is dummy card payment, it will fail
		if(AmericanAirlines_lst_Result5Page_Error_Type2_Heading.size() >0 ){
			String strErrorText = "";
			if (AmericanAirlines_Result5Page_Error_Type2_Text.isDisplayed()){
				strErrorText = AmericanAirlines_Result5Page_Error_Type2_Text.getText();
			}
			objSoftAssert.fail("ERROR:    Error occured in search results for TYPE4_CASE2 - upto payment page: \n" + strErrorText);
			System.out.println("ERROR:    Error occured in search results for TYPE4_CASE2 - upto payment page: \n" + strErrorText);
			//bAmericanAirlines_ThisElementValidationStatus = false;
		}

		return bAmericanAirlines_ThisElementValidationStatus;
	}
    
    public boolean AmericanAirlines_Validate_Payment_Methods_CardPayment(String strPaymentMethodType,JSONObject objJSON_AmericanAirlines_DummyCreditCardDetails_All){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;
		
		JSONObject objJSON_AmericanAirlines_DummyCreditCardDetails_American_Express = objJSON_AmericanAirlines_DummyCreditCardDetails_All.getJSONObject("American Express");
		JSONObject objJSON_AmericanAirlines_DummyCreditCardDetails_MasterCard 		= objJSON_AmericanAirlines_DummyCreditCardDetails_All.getJSONObject("MasterCard");
		JSONObject objJSON_AmericanAirlines_DummyCreditCardDetails_Diners_Club		= objJSON_AmericanAirlines_DummyCreditCardDetails_All.getJSONObject("Diners Club");
		JSONObject objJSON_AmericanAirlines_DummyCreditCardDetails_VISA				= objJSON_AmericanAirlines_DummyCreditCardDetails_All.getJSONObject("VISA");
		JSONObject objJSON_AmericanAirlines_DummyCreditCardDetails_JCB 				= objJSON_AmericanAirlines_DummyCreditCardDetails_All.getJSONObject("JCB");


		if (strPaymentMethodType.contains("American Express")){
			System.out.println("DEBUG:    Initiating following method of payment: " + "American Express");
//			// select other purchase option
//			AmericanAirlines_radiobtn_Result5Page_OtherPurchaseOption.click();
//			AmericanAirlines_radiobtn_Result5Page_OtherPurchaseOption.sendKeys(""+ Keys.ENTER+ Keys.ENTER+ Keys.ENTER+ Keys.ENTER);
//			// select purchase now option
//			AmericanAirlines_radiobtn_Result5Page_PurchaseNow.click();
//			AmericanAirlines_radiobtn_Result5Page_PurchaseNow.sendKeys(""+ Keys.ENTER+ Keys.ENTER+ Keys.ENTER+ Keys.ENTER);
			
			// fill card deails
			AmericanAirlines_Fill_CardPaymentData_American_Express(objJSON_AmericanAirlines_DummyCreditCardDetails_American_Express);
			
			// accept agreement, terms & condition. policy
			AmericanAirlines_tickbox_Result5Page_WebsiteAgreement_PrivacyPolicy_BaggageCharges.click();
			AmericanAirlines_tickbox_Result5Page_Hazardousmaterialsanddangerousgoodspolicy.click();
			
			// click on purchase
			AmericanAirlines_btn_Result5Page_Purchase.click();
			objWait.until(ExpectedConditions.textToBePresentInElement(AmericanAirlines_Result5Page_CurrentStep, "5"));

			// since it is dummy card payment, it will fail
			if(AmericanAirlines_lst_Result5Page_Error_Type2_Heading.size() >0 ){
				String strErrorText = "";
				if (AmericanAirlines_Result5Page_Error_Type2_Text.isDisplayed()){
					strErrorText = AmericanAirlines_Result5Page_Error_Type2_Text.getText();
				}
				objSoftAssert.fail("ERROR:    Error occured during following card payment processing type: " + "American Express\n" + strErrorText);
				System.out.println("ERROR:    Error occured during following card payment processing type: " + "American Express\n" + strErrorText);
				//bAmericanAirlines_ThisElementValidationStatus = false;
			}
		}
		if (strPaymentMethodType.contains("MasterCard")){
			System.out.println("DEBUG:    Initiating following method of payment: " + "MasterCard");
//			// select other purchase option
//			AmericanAirlines_radiobtn_Result5Page_OtherPurchaseOption.click();
//			AmericanAirlines_radiobtn_Result5Page_OtherPurchaseOption.sendKeys(""+ Keys.ENTER+ Keys.ENTER+ Keys.ENTER+ Keys.ENTER);
//			// select purchase now option
//			AmericanAirlines_radiobtn_Result5Page_PurchaseNow.click();
//			AmericanAirlines_radiobtn_Result5Page_PurchaseNow.sendKeys(""+ Keys.ENTER+ Keys.ENTER+ Keys.ENTER+ Keys.ENTER);
			
			// fill card deails
			AmericanAirlines_Fill_CardPaymentData_MasterCard(objJSON_AmericanAirlines_DummyCreditCardDetails_MasterCard);
			
			// accept agreement, terms & condition. policy
			AmericanAirlines_tickbox_Result5Page_WebsiteAgreement_PrivacyPolicy_BaggageCharges.click();
			AmericanAirlines_tickbox_Result5Page_Hazardousmaterialsanddangerousgoodspolicy.click();
			
			// click on purchase
			AmericanAirlines_btn_Result5Page_Purchase.click();
			objWait.until(ExpectedConditions.textToBePresentInElement(AmericanAirlines_Result5Page_CurrentStep, "5"));

			// since it is dummy card payment, it will fail
			if(AmericanAirlines_lst_Result5Page_Error_Type2_Heading.size() >0 ){
				String strErrorText = "";
				if (AmericanAirlines_Result5Page_Error_Type2_Text.isDisplayed()){
					strErrorText = AmericanAirlines_Result5Page_Error_Type2_Text.getText();
				}
				objSoftAssert.fail("ERROR:    Error occured during following card payment processing type: " + "MasterCard\n" + strErrorText);
				System.out.println("ERROR:    Error occured during following card payment processing type: " + "MasterCard\n" + strErrorText);
				//bAmericanAirlines_ThisElementValidationStatus = false;
			}
		}
		if (strPaymentMethodType.contains("Diners Club")){
			System.out.println("DEBUG:    Initiating following method of payment: " + "Diners Club");
//			// select other purchase option
//			AmericanAirlines_radiobtn_Result5Page_OtherPurchaseOption.click();
//			AmericanAirlines_radiobtn_Result5Page_OtherPurchaseOption.sendKeys(""+ Keys.ENTER+ Keys.ENTER+ Keys.ENTER+ Keys.ENTER);
//			// select purchase now option
//			AmericanAirlines_radiobtn_Result5Page_PurchaseNow.click();
//			AmericanAirlines_radiobtn_Result5Page_PurchaseNow.sendKeys(""+ Keys.ENTER+ Keys.ENTER+ Keys.ENTER+ Keys.ENTER);
			
			// fill card deails
			AmericanAirlines_Fill_CardPaymentData_Diners_Club(objJSON_AmericanAirlines_DummyCreditCardDetails_Diners_Club);
			
			// accept agreement, terms & condition. policy
			AmericanAirlines_tickbox_Result5Page_WebsiteAgreement_PrivacyPolicy_BaggageCharges.click();
			AmericanAirlines_tickbox_Result5Page_Hazardousmaterialsanddangerousgoodspolicy.click();
			
			// click on purchase
			AmericanAirlines_btn_Result5Page_Purchase.click();
			objWait.until(ExpectedConditions.textToBePresentInElement(AmericanAirlines_Result5Page_CurrentStep, "5"));

			// since it is dummy card payment, it will fail
			if(AmericanAirlines_lst_Result5Page_Error_Type2_Heading.size() >0 ){
				String strErrorText = "";
				if (AmericanAirlines_Result5Page_Error_Type2_Text.isDisplayed()){
					strErrorText = AmericanAirlines_Result5Page_Error_Type2_Text.getText();
				}
				objSoftAssert.fail("ERROR:    Error occured during following card payment processing type: " + "Diners Club\n" + strErrorText);
				System.out.println("ERROR:    Error occured during following card payment processing type: " + "Diners Club\n" + strErrorText);
				//bAmericanAirlines_ThisElementValidationStatus = false;
			}
		}
		if (strPaymentMethodType.contains("Visa")){
			System.out.println("DEBUG:    Initiating following method of payment: " + "Visa");
//			// select other purchase option
//			AmericanAirlines_radiobtn_Result5Page_OtherPurchaseOption.click();
//			AmericanAirlines_radiobtn_Result5Page_OtherPurchaseOption.sendKeys(""+ Keys.ENTER+ Keys.ENTER+ Keys.ENTER+ Keys.ENTER);
//			// select purchase now option
//			AmericanAirlines_radiobtn_Result5Page_PurchaseNow.click();
//			AmericanAirlines_radiobtn_Result5Page_PurchaseNow.sendKeys(""+ Keys.ENTER+ Keys.ENTER+ Keys.ENTER+ Keys.ENTER);
			
			// fill card deails
			AmericanAirlines_Fill_CardPaymentData_VISA(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA);
			
			// accept agreement, terms & condition. policy
			AmericanAirlines_tickbox_Result5Page_WebsiteAgreement_PrivacyPolicy_BaggageCharges.click();
			AmericanAirlines_tickbox_Result5Page_Hazardousmaterialsanddangerousgoodspolicy.click();
			
			// click on purchase
			AmericanAirlines_btn_Result5Page_Purchase.click();
			objWait.until(ExpectedConditions.textToBePresentInElement(AmericanAirlines_Result5Page_CurrentStep, "5"));

			// since it is dummy card payment, it will fail
			if(AmericanAirlines_lst_Result5Page_Error_Type2_Heading.size() >0 ){
				String strErrorText = "";
				if (AmericanAirlines_Result5Page_Error_Type2_Text.isDisplayed()){
					strErrorText = AmericanAirlines_Result5Page_Error_Type2_Text.getText();
				}
				objSoftAssert.fail("ERROR:    Error occured during following card payment processing type: " + "Visa\n" + strErrorText);
				System.out.println("ERROR:    Error occured during following card payment processing type: " + "Visa\n" + strErrorText);
				//bAmericanAirlines_ThisElementValidationStatus = false;
			}
		}
		if (strPaymentMethodType.contains("JCB")){
			System.out.println("DEBUG:    Initiating following method of payment: " + "JCB");
//			// select other purchase option
//			AmericanAirlines_radiobtn_Result5Page_OtherPurchaseOption.click();
//			AmericanAirlines_radiobtn_Result5Page_OtherPurchaseOption.sendKeys(""+ Keys.ENTER+ Keys.ENTER+ Keys.ENTER+ Keys.ENTER);
//			// select purchase now option
//			AmericanAirlines_radiobtn_Result5Page_PurchaseNow.click();
//			AmericanAirlines_radiobtn_Result5Page_PurchaseNow.sendKeys(""+ Keys.ENTER+ Keys.ENTER+ Keys.ENTER+ Keys.ENTER);
			
			// fill card deails
			AmericanAirlines_Fill_CardPaymentData_JCB(objJSON_AmericanAirlines_DummyCreditCardDetails_JCB);
			
			// accept agreement, terms & condition. policy
			AmericanAirlines_tickbox_Result5Page_WebsiteAgreement_PrivacyPolicy_BaggageCharges.click();
			AmericanAirlines_tickbox_Result5Page_Hazardousmaterialsanddangerousgoodspolicy.click();
			
			// click on purchase
			AmericanAirlines_btn_Result5Page_Purchase.click();
			objWait.until(ExpectedConditions.textToBePresentInElement(AmericanAirlines_Result5Page_CurrentStep, "5"));

			// since it is dummy card payment, it will fail
			if(AmericanAirlines_lst_Result5Page_Error_Type2_Heading.size() >0 ){
				String strErrorText = "";
				if (AmericanAirlines_Result5Page_Error_Type2_Text.isDisplayed()){
					strErrorText = AmericanAirlines_Result5Page_Error_Type2_Text.getText();
				}
				objSoftAssert.fail("ERROR:    Error occured during following card payment processing type: " + "JCB\n" + strErrorText);
				System.out.println("ERROR:    Error occured during following card payment processing type: " + "JCB\n" + strErrorText);
				//bAmericanAirlines_ThisElementValidationStatus = false;
			}
		}
		return bAmericanAirlines_ThisElementValidationStatus;
	}
        
    public boolean AmericanAirlines_Validate_Payment_Methods_BankTransfer(String strPaymentMethodType,JSONObject objJSON_AmericanAirlines_DummyCreditCardDetails_All){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;
		
		System.out.println("DEBUG:    This feature is on HOLD");
		
		return bAmericanAirlines_ThisElementValidationStatus;
	}
    
    
    
    
    
    
    
    
    // helper methods
	// fill payment details for card type American Express
    private void AmericanAirlines_Fill_CardPaymentData_American_Express(JSONObject objJSON_AmericanAirlines_DummyCreditCardDetails_American_Express){
		Select AmericanAirlines_drpdwn_CardType						= new Select(AmericanAirlines_drpdwn_Result5Page_CardType);
		Select AmericanAirlines_drpdwn_ExpiryMonth					= new Select(AmericanAirlines_drpdon_Result5Page_CC_ExpiryMonth);
		Select AmericanAirlines_drpdwn_ExpiryYear					= new Select(AmericanAirlines_drpdon_Result5Page_CC_ExpiryYear);
		Select AmericanAirlines_drpdwn_Country						= new Select(AmericanAirlines_drpdon_Result5Page_Country);

    	AmericanAirlines_drpdwn_CardType.selectByVisibleText(objJSON_AmericanAirlines_DummyCreditCardDetails_American_Express.getString("CardType"));
    	AmericanAirlines_txtbox_Result5Page_American_Express__Diners_Club__JCB__CardNumber.clear();
    	AmericanAirlines_txtbox_Result5Page_American_Express__Diners_Club__JCB__CardNumber.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_American_Express.getString("CreditCardNumber"));
    	AmericanAirlines_txtbox_Result5Page_CardCVVnumber.clear();
    	AmericanAirlines_txtbox_Result5Page_CardCVVnumber.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_American_Express.getString("CreditCardCVVnumber"));
    	AmericanAirlines_drpdwn_ExpiryMonth.selectByVisibleText(objJSON_AmericanAirlines_DummyCreditCardDetails_American_Express.getString("ExpiryMonth"));
    	AmericanAirlines_drpdwn_ExpiryYear.selectByVisibleText(objJSON_AmericanAirlines_DummyCreditCardDetails_American_Express.getString("ExpiryYear"));
    	AmericanAirlines_txtbox_Result5Page_CardHolderName.clear();
    	AmericanAirlines_txtbox_Result5Page_CardHolderName.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_American_Express.getString("CardHolderName"));
    	AmericanAirlines_txtbox_Result5Page_Address1.clear();
    	AmericanAirlines_txtbox_Result5Page_Address1.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_American_Express.getString("Address1"));
    	AmericanAirlines_txtbox_Result5Page_Address2.clear();
    	AmericanAirlines_txtbox_Result5Page_Address2.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_American_Express.getString("Address2"));
    	AmericanAirlines_txtbox_Result5Page_PostalorZIPCode.clear();
    	AmericanAirlines_txtbox_Result5Page_PostalorZIPCode.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_American_Express.getString("PostalCode"));
    	AmericanAirlines_txtbox_Result5Page_City.clear();
    	AmericanAirlines_txtbox_Result5Page_City.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_American_Express.getString("City"));
    	AmericanAirlines_txtbox_Result5Page_StateORProvience.clear();
    	AmericanAirlines_txtbox_Result5Page_StateORProvience.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_American_Express.getString("StateOrProvince"));
    	AmericanAirlines_drpdwn_Country.selectByVisibleText(objJSON_AmericanAirlines_DummyCreditCardDetails_American_Express.getString("Country"));
    }
    // fill payment details for card type American MasterCard
    private void AmericanAirlines_Fill_CardPaymentData_MasterCard(JSONObject objJSON_AmericanAirlines_DummyCreditCardDetails_MasterCard){
		Select AmericanAirlines_drpdwn_CardType						= new Select(AmericanAirlines_drpdwn_Result5Page_CardType);
		Select AmericanAirlines_drpdwn_ExpiryMonth					= new Select(AmericanAirlines_drpdon_Result5Page_CC_ExpiryMonth);
		Select AmericanAirlines_drpdwn_ExpiryYear					= new Select(AmericanAirlines_drpdon_Result5Page_CC_ExpiryYear);
		Select AmericanAirlines_drpdwn_Country						= new Select(AmericanAirlines_drpdon_Result5Page_Country);

    	AmericanAirlines_drpdwn_CardType.selectByVisibleText(objJSON_AmericanAirlines_DummyCreditCardDetails_MasterCard.getString("CardType"));
    	AmericanAirlines_txtbox_Result5Page_CardNumber1.clear();
    	AmericanAirlines_txtbox_Result5Page_CardNumber1.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_MasterCard.getString("CreditCardNumber1"));
    	AmericanAirlines_txtbox_Result5Page_CardNumber2.clear();
    	AmericanAirlines_txtbox_Result5Page_CardNumber2.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_MasterCard.getString("CreditCardNumber2"));
    	AmericanAirlines_txtbox_Result5Page_CardNumber3.clear();
    	AmericanAirlines_txtbox_Result5Page_CardNumber3.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_MasterCard.getString("CreditCardNumber3"));
    	AmericanAirlines_txtbox_Result5Page_CardNumber4.click();
    	AmericanAirlines_txtbox_Result5Page_CardNumber4.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_MasterCard.getString("CreditCardNumber4"));
    	AmericanAirlines_txtbox_Result5Page_CardCVVnumber.clear();
    	AmericanAirlines_txtbox_Result5Page_CardCVVnumber.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_MasterCard.getString("CreditCardCVVnumber"));
    	AmericanAirlines_drpdwn_ExpiryMonth.selectByVisibleText(objJSON_AmericanAirlines_DummyCreditCardDetails_MasterCard.getString("ExpiryMonth"));
    	AmericanAirlines_drpdwn_ExpiryYear.selectByVisibleText(objJSON_AmericanAirlines_DummyCreditCardDetails_MasterCard.getString("ExpiryYear"));
    	AmericanAirlines_txtbox_Result5Page_CardHolderName.clear();
    	AmericanAirlines_txtbox_Result5Page_CardHolderName.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_MasterCard.getString("CardHolderName"));
    	AmericanAirlines_txtbox_Result5Page_Address1.clear();
    	AmericanAirlines_txtbox_Result5Page_Address1.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_MasterCard.getString("Address1"));
    	AmericanAirlines_txtbox_Result5Page_Address2.clear();
    	AmericanAirlines_txtbox_Result5Page_Address2.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_MasterCard.getString("Address2"));
    	AmericanAirlines_txtbox_Result5Page_PostalorZIPCode.clear();
    	AmericanAirlines_txtbox_Result5Page_PostalorZIPCode.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_MasterCard.getString("PostalCode"));
    	AmericanAirlines_txtbox_Result5Page_City.clear();
    	AmericanAirlines_txtbox_Result5Page_City.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_MasterCard.getString("City"));
    	AmericanAirlines_txtbox_Result5Page_StateORProvience.clear();
    	AmericanAirlines_txtbox_Result5Page_StateORProvience.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_MasterCard.getString("StateOrProvince"));
    	AmericanAirlines_drpdwn_Country.selectByVisibleText(objJSON_AmericanAirlines_DummyCreditCardDetails_MasterCard.getString("Country"));
    }
    // // fill payment details for card type Diners Club
    private void AmericanAirlines_Fill_CardPaymentData_Diners_Club(JSONObject objJSON_AmericanAirlines_DummyCreditCardDetails_Diners_Club){
		Select AmericanAirlines_drpdwn_CardType						= new Select(AmericanAirlines_drpdwn_Result5Page_CardType);
		Select AmericanAirlines_drpdwn_ExpiryMonth					= new Select(AmericanAirlines_drpdon_Result5Page_CC_ExpiryMonth);
		Select AmericanAirlines_drpdwn_ExpiryYear					= new Select(AmericanAirlines_drpdon_Result5Page_CC_ExpiryYear);
		Select AmericanAirlines_drpdwn_Country						= new Select(AmericanAirlines_drpdon_Result5Page_Country);

    	AmericanAirlines_drpdwn_CardType.selectByVisibleText(objJSON_AmericanAirlines_DummyCreditCardDetails_Diners_Club.getString("CardType"));
    	AmericanAirlines_txtbox_Result5Page_American_Express__Diners_Club__JCB__CardNumber.clear();
    	AmericanAirlines_txtbox_Result5Page_American_Express__Diners_Club__JCB__CardNumber.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_Diners_Club.getString("CreditCardNumber"));
    	AmericanAirlines_txtbox_Result5Page_CardCVVnumber.clear();
    	AmericanAirlines_txtbox_Result5Page_CardCVVnumber.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_Diners_Club.getString("CreditCardCVVnumber"));
    	AmericanAirlines_drpdwn_ExpiryMonth.selectByVisibleText(objJSON_AmericanAirlines_DummyCreditCardDetails_Diners_Club.getString("ExpiryMonth"));
    	AmericanAirlines_drpdwn_ExpiryYear.selectByVisibleText(objJSON_AmericanAirlines_DummyCreditCardDetails_Diners_Club.getString("ExpiryYear"));
    	AmericanAirlines_txtbox_Result5Page_CardHolderName.clear();
    	AmericanAirlines_txtbox_Result5Page_CardHolderName.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_Diners_Club.getString("CardHolderName"));
    	AmericanAirlines_txtbox_Result5Page_Address1.clear();
    	AmericanAirlines_txtbox_Result5Page_Address1.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_Diners_Club.getString("Address1"));
    	AmericanAirlines_txtbox_Result5Page_Address2.clear();
    	AmericanAirlines_txtbox_Result5Page_Address2.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_Diners_Club.getString("Address2"));
    	AmericanAirlines_txtbox_Result5Page_PostalorZIPCode.clear();
    	AmericanAirlines_txtbox_Result5Page_PostalorZIPCode.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_Diners_Club.getString("PostalCode"));
    	AmericanAirlines_txtbox_Result5Page_City.clear();
    	AmericanAirlines_txtbox_Result5Page_City.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_Diners_Club.getString("City"));
    	AmericanAirlines_txtbox_Result5Page_StateORProvience.clear();
    	AmericanAirlines_txtbox_Result5Page_StateORProvience.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_Diners_Club.getString("StateOrProvince"));
    	AmericanAirlines_drpdwn_Country.selectByVisibleText(objJSON_AmericanAirlines_DummyCreditCardDetails_Diners_Club.getString("Country"));
    }
    // // fill payment details for card type Visa
    private void AmericanAirlines_Fill_CardPaymentData_VISA(JSONObject objJSON_AmericanAirlines_DummyCreditCardDetails_VISA){
		Select AmericanAirlines_drpdwn_CardType						= new Select(AmericanAirlines_drpdwn_Result5Page_CardType);
		Select AmericanAirlines_drpdwn_ExpiryMonth					= new Select(AmericanAirlines_drpdon_Result5Page_CC_ExpiryMonth);
		Select AmericanAirlines_drpdwn_ExpiryYear					= new Select(AmericanAirlines_drpdon_Result5Page_CC_ExpiryYear);
		Select AmericanAirlines_drpdwn_Country						= new Select(AmericanAirlines_drpdon_Result5Page_Country);

    	AmericanAirlines_drpdwn_CardType.selectByVisibleText(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("CardType"));
    	AmericanAirlines_txtbox_Result5Page_CardNumber1.clear();
    	AmericanAirlines_txtbox_Result5Page_CardNumber1.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("CreditCardNumber1"));
    	AmericanAirlines_txtbox_Result5Page_CardNumber2.clear();
    	AmericanAirlines_txtbox_Result5Page_CardNumber2.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("CreditCardNumber2"));
    	AmericanAirlines_txtbox_Result5Page_CardNumber3.clear();
    	AmericanAirlines_txtbox_Result5Page_CardNumber3.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("CreditCardNumber3"));
    	AmericanAirlines_txtbox_Result5Page_CardNumber4.clear();
    	AmericanAirlines_txtbox_Result5Page_CardNumber4.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("CreditCardNumber4"));
    	AmericanAirlines_txtbox_Result5Page_CardCVVnumber.clear();
    	AmericanAirlines_txtbox_Result5Page_CardCVVnumber.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("CreditCardCVVnumber"));
    	AmericanAirlines_drpdwn_ExpiryMonth.selectByVisibleText(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("ExpiryMonth"));
    	AmericanAirlines_drpdwn_ExpiryYear.selectByVisibleText(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("ExpiryYear"));
    	AmericanAirlines_txtbox_Result5Page_CardHolderName.clear();
    	AmericanAirlines_txtbox_Result5Page_CardHolderName.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("CardHolderName"));
    	AmericanAirlines_txtbox_Result5Page_Address1.clear();
    	AmericanAirlines_txtbox_Result5Page_Address1.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("Address1"));
    	AmericanAirlines_txtbox_Result5Page_Address2.clear();
    	AmericanAirlines_txtbox_Result5Page_Address2.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("Address2"));
    	AmericanAirlines_txtbox_Result5Page_PostalorZIPCode.clear();
    	AmericanAirlines_txtbox_Result5Page_PostalorZIPCode.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("PostalCode"));
    	AmericanAirlines_txtbox_Result5Page_City.clear();
    	AmericanAirlines_txtbox_Result5Page_City.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("City"));
    	AmericanAirlines_txtbox_Result5Page_StateORProvience.clear();
    	AmericanAirlines_txtbox_Result5Page_StateORProvience.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("StateOrProvince"));
    	AmericanAirlines_drpdwn_Country.selectByVisibleText(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA.getString("Country"));
    }
    // fill payment details for card type JCB
    private void AmericanAirlines_Fill_CardPaymentData_JCB(JSONObject objJSON_AmericanAirlines_DummyCreditCardDetails_JCB){
		Select AmericanAirlines_drpdwn_CardType						= new Select(AmericanAirlines_drpdwn_Result5Page_CardType);
		Select AmericanAirlines_drpdwn_ExpiryMonth					= new Select(AmericanAirlines_drpdon_Result5Page_CC_ExpiryMonth);
		Select AmericanAirlines_drpdwn_ExpiryYear					= new Select(AmericanAirlines_drpdon_Result5Page_CC_ExpiryYear);
		Select AmericanAirlines_drpdwn_Country						= new Select(AmericanAirlines_drpdon_Result5Page_Country);

    	AmericanAirlines_drpdwn_CardType.selectByVisibleText(objJSON_AmericanAirlines_DummyCreditCardDetails_JCB.getString("CardType"));
    	AmericanAirlines_txtbox_Result5Page_American_Express__Diners_Club__JCB__CardNumber.clear();
    	AmericanAirlines_txtbox_Result5Page_American_Express__Diners_Club__JCB__CardNumber.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_JCB.getString("CreditCardNumber"));
    	AmericanAirlines_txtbox_Result5Page_CardCVVnumber.clear();
    	AmericanAirlines_txtbox_Result5Page_CardCVVnumber.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_JCB.getString("CreditCardCVVnumber"));
    	AmericanAirlines_drpdwn_ExpiryMonth.selectByVisibleText(objJSON_AmericanAirlines_DummyCreditCardDetails_JCB.getString("ExpiryMonth"));
    	AmericanAirlines_drpdwn_ExpiryYear.selectByVisibleText(objJSON_AmericanAirlines_DummyCreditCardDetails_JCB.getString("ExpiryYear"));
    	AmericanAirlines_txtbox_Result5Page_CardHolderName.clear();
    	AmericanAirlines_txtbox_Result5Page_CardHolderName.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_JCB.getString("CardHolderName"));
    	AmericanAirlines_txtbox_Result5Page_Address1.clear();
    	AmericanAirlines_txtbox_Result5Page_Address1.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_JCB.getString("Address1"));
    	AmericanAirlines_txtbox_Result5Page_Address2.clear();
    	AmericanAirlines_txtbox_Result5Page_Address2.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_JCB.getString("Address2"));
    	AmericanAirlines_txtbox_Result5Page_PostalorZIPCode.clear();
    	AmericanAirlines_txtbox_Result5Page_PostalorZIPCode.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_JCB.getString("PostalCode"));
    	AmericanAirlines_txtbox_Result5Page_City.clear();
    	AmericanAirlines_txtbox_Result5Page_City.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_JCB.getString("City"));
    	AmericanAirlines_txtbox_Result5Page_StateORProvience.clear();
    	AmericanAirlines_txtbox_Result5Page_StateORProvience.sendKeys(objJSON_AmericanAirlines_DummyCreditCardDetails_JCB.getString("StateOrProvince"));
    	AmericanAirlines_drpdwn_Country.selectByVisibleText(objJSON_AmericanAirlines_DummyCreditCardDetails_JCB.getString("Country"));
    }
    
    
    
    
    
    
	
}
