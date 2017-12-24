package com.imademethink_webautomation.pkgTktTravel_redBus;

import java.util.List;

import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.imademethink_webautomation.UtilGeneral.ClsGeneralInitTerminateAndOtherUtil;
import com.imademethink_webautomation.pkg0GeneralPageFactory.Page0Abstract;


public class PageredBusResult2UserDetailnPayment extends Page0Abstract{

	public PageredBusResult2UserDetailnPayment(WebDriver driver) {
		super(driver);
		//System.out.println("DEBUG:    PageredBusResult2UserDetailnPayment constructor");
		PageFactory.initElements(driver, this);
	}
	

	// user details element
    @FindBy(css="#NAME1")
    private WebElement redBus_txtbox_Result2UserDetailnPaymentPage_UserDetail_Name;
    @FindBy(css="#male1")
    private WebElement redBus_radiobtn_Result2UserDetailnPaymentPage_UserDetail_GenderMale;
    @FindBy(css="#AGE1")
    private WebElement redBus_txtbox_Result2UserDetailnPaymentPage_UserDetail_Age;
    @FindBy(css="#EMAILID")
    private WebElement redBus_txtbox_Result2UserDetailnPaymentPage_UserDetail_ContactEmail;
    @FindBy(css="#PHONE")
    private WebElement redBus_txtbox_Result2UserDetailnPaymentPage_UserDetail_ContactPhone;
    @FindBy(css="#ALTPHONE")
    private WebElement redBus_txtbox_Result2UserDetailnPaymentPage_UserDetail_ContactPhoneAlternate;
    @FindBy(css="#PRIADDR")
    private WebElement redBus_txtbox_Result2UserDetailnPaymentPage_UserDetail_Address;
    @FindBy(css="#TYPEID")
    private WebElement redBus_drpdown_Result2UserDetailnPaymentPage_UserDetail_GovtIdType;
    @FindBy(css="#IDVALUE")
    private WebElement redBus_txtbox_Result2UserDetailnPaymentPage_UserDetail_GovtIdValue;
    @FindBy(css="#PPKEY")
    private WebElement redBus_txtbox_Result2UserDetailnPaymentPage_UserDetail_IdName;
   
    
	// payment related elements	
    @FindBy(css="#CREDITCARD")
    private WebElement redBus_tab_Result2UserDetailnPaymentPage_Payment_CreditCard;
    @FindBy(css="#DEBITCARD")
    private WebElement redBus_tab_Result2UserDetailnPaymentPage_Payment_DebitCard;
    @FindBy(css="#NETBANKING")
    private WebElement redBus_tab_Result2UserDetailnPaymentPage_Payment_NetBanking;
    @FindBy(css="#HOMEDELIVERY")
    private WebElement redBus_tab_Result2UserDetailnPaymentPage_Payment_CashOnDelivery;
    @FindBy(css="#PAYUMONEY")
    private WebElement redBus_tab_Result2UserDetailnPaymentPage_Payment_PayUMoney;
    @FindBy(css="#VISA")
    private WebElement redBus_tab_Result2UserDetailnPaymentPage_Payment_CreditCard_radiobtn_NonAmex;
    @FindBy(css="#AMERICANEXPRESS")
    private WebElement redBus_tab_Result2UserDetailnPaymentPage_Payment_CreditCard_radiobtn_Amex;
    @FindBy(css="#makepayment")
    private WebElement redBus_btn_Result2UserDetailnPaymentPage_Payment_BookNow;
    @FindBy(css="#btn_custDataContinue")
    private WebElement redBus_btn_Result2UserDetailnPaymentPage_Payment_ContinueGovtBus;
    @FindBy(css=".timer")
    private WebElement redBus_btn_Result2UserDetailnPaymentPage_Payment_BookingTimeout;
    
	By redBus_ByCssSelector_btn_Result2UserDetailnPaymentPage_Payment_ContinueGovtBus	= new ByCssSelector ("#btn_custDataContinue");

	//elements for credit card
    @FindBy(css="#CCARD_HOLDER_NAME")
    private WebElement redBus_tab_Result2UserDetailnPaymentPage_Payment_CreditCard_CardHoldeName;
    @FindBy(css="#cardNoSep0")
    private WebElement redBus_tab_Result2UserDetailnPaymentPage_Payment_CreditCard_Group1;
    @FindBy(css="#cardNoSep1")
    private WebElement redBus_tab_Result2UserDetailnPaymentPage_Payment_CreditCard_Group2;
    @FindBy(css="#cardNoSep2")
    private WebElement redBus_tab_Result2UserDetailnPaymentPage_Payment_CreditCard_Group3;
    @FindBy(css="#cardNoSep3")
    private WebElement redBus_tab_Result2UserDetailnPaymentPage_Payment_CreditCard_Group4;
    @FindBy(css="#CEXPMONTH")
    private WebElement redBus_tab_Result2UserDetailnPaymentPage_Payment_CreditCard_MM;
    @FindBy(css="#CEXPYEAR")
    private WebElement redBus_tab_Result2UserDetailnPaymentPage_Payment_CreditCard_YYYY;
    @FindBy(css="#CCVV")
    private WebElement redBus_tab_Result2UserDetailnPaymentPage_Payment_CreditCard_CVV;
    @FindBy(css="input[placeholder='XXX'][id='CCVV']")
    private WebElement redBus_tab_Result2UserDetailnPaymentPage_Payment_CreditCardPaymentErrorRecovered;
    
    //elements for american express page
    @FindBy(css="#CardNumber")
    private WebElement redBus_btn_Result2UserDetailnPaymentPage_Payment_Amex_Cardnumber;
    @FindBy(css="#CardMonth")
    private WebElement redBus_btn_Result2UserDetailnPaymentPage_Payment_Amex_CardExpMM;
    @FindBy(css="#CardYear")
    private WebElement redBus_btn_Result2UserDetailnPaymentPage_Payment_Amex_CardExpYY;
    @FindBy(css="#Securecode")
    private WebElement redBus_btn_Result2UserDetailnPaymentPage_Payment_Amex_CardCVV;
    @FindBy(css="#Paybutton")
    private WebElement redBus_btn_Result2UserDetailnPaymentPage_Payment_Amex_PayButton;
    @FindBy(css="input[name='cancelButtonImage']")
    private WebElement redBus_btn_Result2UserDetailnPaymentPage_Payment_Amex_Cancel;
    
	//elements for debit card
    @FindBy(css="#DCARD_HOLDER_NAME")
    private WebElement redBus_tab_Result2UserDetailnPaymentPage_Payment_DebitCard_CardHoldeName;
    @FindBy(css="#DCARDNO")
    private WebElement redBus_tab_Result2UserDetailnPaymentPage_Payment_DebitCardNumber;
    @FindBy(css="#DEXPMONTH")
    private WebElement redBus_tab_Result2UserDetailnPaymentPage_Payment_DebitCard_MM;
    @FindBy(css="#DEXPYEAR")
    private WebElement redBus_tab_Result2UserDetailnPaymentPage_Payment_DebitCard_YYYY;
    @FindBy(css="#DCVV")
    private WebElement redBus_tab_Result2UserDetailnPaymentPage_Payment_DebitCard_CVV;
    @FindBy(css="input[placeholder='XXX'][id='DCVV']")
    private WebElement redBus_tab_Result2UserDetailnPaymentPage_Payment_DebitCardPaymentErrorRecovered;
    
    // elements for net banking
    @FindBy(css="#bankname")
    private WebElement redBus_tab_Result2UserDetailnPaymentPage_Payment_NetBanking_BankName;    
    @FindBy(css=".optStyle>option")
    private WebElement redBus_tab_Result2UserDetailnPaymentPage_Payment_NetBanking_BankName___2;
    
    // elements for cash on delivery
    @FindBy(css="#address1")
    private WebElement redBus_tab_Result2UserDetailnPaymentPage_Payment_CashOnDelivery_Address1;
    @FindBy(css="#address2")
    private WebElement redBus_tab_Result2UserDetailnPaymentPage_Payment_CashOnDelivery_Address2;
    @FindBy(css="#contactno")
    private WebElement redBus_tab_Result2UserDetailnPaymentPage_Payment_CashOnDelivery_ContactPhone;
    @FindBy(css="#landmark")
    private WebElement redBus_tab_Result2UserDetailnPaymentPage_Payment_CashOnDelivery_Landmark;
    @FindBy(css="#hdcity")
    private WebElement redBus_tab_Result2UserDetailnPaymentPage_Payment_CashOnDelivery_CityName;
    @FindBy(css="#hdarea")
    private WebElement redBus_tab_Result2UserDetailnPaymentPage_Payment_CashOnDelivery_AreaName;
    @FindBy(css="#pincode")
    private WebElement redBus_tab_Result2UserDetailnPaymentPage_Payment_CashOnDelivery_Pincode;
    @FindBy(css=".Red.TextSemiBold.tickCongrat.tickconfirmMsg")
    private List<WebElement> redBus_tab_Result2UserDetailnPaymentPage_Payment_CashOnDelivery_Success;
    
    
    
    
    // some junk element
	@FindBy(id="zzzzzzz")
	private WebElement redBus_somejunkelement;
	
    // every page object has it's local private wait with fixed 10 sec delay
    private WebDriverWait objWait 		= new WebDriverWait(this.objWebDriverAbstract, 10);   
	    
	// common methods
    private void redBus_Validate_Common_Scenario_EnterUserDetails(JSONObject objJSON_redBusAdultPassangerDetails){
    	
		Select redBus_drpdwn_GovtIdType		= new Select(redBus_drpdown_Result2UserDetailnPaymentPage_UserDetail_GovtIdType);

    	System.out.println("DEBUG:    Entering the passanger details");
		// fill the user details
		redBus_txtbox_Result2UserDetailnPaymentPage_UserDetail_Name.sendKeys(objJSON_redBusAdultPassangerDetails.get("FullName").toString());
		redBus_radiobtn_Result2UserDetailnPaymentPage_UserDetail_GenderMale.click();
		redBus_txtbox_Result2UserDetailnPaymentPage_UserDetail_Age.sendKeys(objJSON_redBusAdultPassangerDetails.get("Age").toString());
		redBus_txtbox_Result2UserDetailnPaymentPage_UserDetail_ContactEmail.sendKeys(objJSON_redBusAdultPassangerDetails.get("Email").toString());
		redBus_txtbox_Result2UserDetailnPaymentPage_UserDetail_ContactPhone.sendKeys(objJSON_redBusAdultPassangerDetails.get("ContactPhone").toString());
		
		if(redBus_txtbox_Result2UserDetailnPaymentPage_UserDetail_ContactPhoneAlternate.isDisplayed())
			redBus_txtbox_Result2UserDetailnPaymentPage_UserDetail_ContactPhoneAlternate.sendKeys(objJSON_redBusAdultPassangerDetails.get("ContactPhoneAlternate").toString());
		if(redBus_txtbox_Result2UserDetailnPaymentPage_UserDetail_Address.isDisplayed())
			redBus_txtbox_Result2UserDetailnPaymentPage_UserDetail_Address.sendKeys(objJSON_redBusAdultPassangerDetails.get("Address").toString());
		if(redBus_drpdown_Result2UserDetailnPaymentPage_UserDetail_GovtIdType.isDisplayed())
			redBus_drpdwn_GovtIdType.selectByIndex(1);
		if(redBus_txtbox_Result2UserDetailnPaymentPage_UserDetail_GovtIdValue.isDisplayed())
			redBus_txtbox_Result2UserDetailnPaymentPage_UserDetail_GovtIdValue.sendKeys(objJSON_redBusAdultPassangerDetails.get("GovtIdValue_DrivingLicence").toString());
		if(redBus_txtbox_Result2UserDetailnPaymentPage_UserDetail_IdName.isDisplayed())
			redBus_txtbox_Result2UserDetailnPaymentPage_UserDetail_IdName.click();
    }

    private boolean redBus_Validate_Common_Scenario_SelectDefaultPaymentMethod(){
    	
    	boolean bredBus_ThisElementValidationStatus 		= true;
    	
    	System.out.println("DEBUG:    Selecting default payment method: " + "PayUMoney");
    	redBus_tab_Result2UserDetailnPaymentPage_Payment_PayUMoney.click();
		redBus_btn_Result2UserDetailnPaymentPage_Payment_BookNow.click();

		// payment gateway loading takes time so wait for longer time
		try{objWait.until(ExpectedConditions.titleContains("PayUMoney"));} catch(Exception e){}

		try{objWait.until(ExpectedConditions.titleContains("PayUMoney"));}
		catch(Exception e){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Error occured in search results for TYPE1_CASE3 - upto payment gateway page");
			objSoftAssert.fail("ERROR:    Error occured in search results for TYPE1_CASE3 - upto payment gateway page");
			bredBus_ThisElementValidationStatus = false;
		}

		return bredBus_ThisElementValidationStatus;	
    }
    
	// main methods
    public boolean redBus_Validate_EndToEnd_Search_Scenario__TYPE1_CASE1(JSONObject objJSON_redBusAdultPassangerDetails){

		redBus_Validate_Common_Scenario_EnterUserDetails(objJSON_redBusAdultPassangerDetails);
		
		return redBus_Validate_Common_Scenario_SelectDefaultPaymentMethod();
	}
    
    public boolean redBus_Validate_EndToEnd_Search_Scenario__TYPE1_CASE3(JSONObject objJSON_redBusAdultPassangerDetails){

		redBus_Validate_Common_Scenario_EnterUserDetails(objJSON_redBusAdultPassangerDetails);
		
		return redBus_Validate_Common_Scenario_SelectDefaultPaymentMethod();
	}

    public boolean redBus_Validate_EndToEnd_Search_Scenario__TYPE1_CASE5(JSONObject objJSON_redBusAdultPassangerDetails){

		redBus_Validate_Common_Scenario_EnterUserDetails(objJSON_redBusAdultPassangerDetails);
		
		return redBus_Validate_Common_Scenario_SelectDefaultPaymentMethod();
	}
	
    public boolean redBus_Validate_EndToEnd_Search_Scenario__TYPE1_CASE6(JSONObject objJSON_redBusAdultPassangerDetails){

		redBus_Validate_Common_Scenario_EnterUserDetails(objJSON_redBusAdultPassangerDetails);
		
		if (redBus_btn_Result2UserDetailnPaymentPage_Payment_BookNow.isDisplayed()){
			return redBus_Validate_Common_Scenario_SelectDefaultPaymentMethod();
		}
		
		if (! redBus_btn_Result2UserDetailnPaymentPage_Payment_ContinueGovtBus.isDisplayed()){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Error occured in search results for TYPE1_CASE6 - upto payment gateway page");
			objSoftAssert.fail("ERROR:    Error occured in search results for TYPE1_CASE6 - upto payment gateway page");
			return false;
		}
		redBus_btn_Result2UserDetailnPaymentPage_Payment_ContinueGovtBus.click();
		
		objWait.until(ExpectedConditions.invisibilityOfElementLocated(redBus_ByCssSelector_btn_Result2UserDetailnPaymentPage_Payment_ContinueGovtBus));
		objWait.until(ExpectedConditions.invisibilityOfElementLocated(redBus_ByCssSelector_btn_Result2UserDetailnPaymentPage_Payment_ContinueGovtBus));

		
		return true;
	}
	
    public boolean redBus_Validate_EndToEnd_Search_Scenario__TYPE2_CASE1(JSONObject objJSON_redBusAdultPassangerDetails){

		redBus_Validate_Common_Scenario_EnterUserDetails(objJSON_redBusAdultPassangerDetails);
		
		return redBus_Validate_Common_Scenario_SelectDefaultPaymentMethod();
	}
    
    public boolean redBus_Validate_EndToEnd_Search_Scenario__TYPE2_CASE5(JSONObject objJSON_redBusAdultPassangerDetails){

		redBus_Validate_Common_Scenario_EnterUserDetails(objJSON_redBusAdultPassangerDetails);
		
		return redBus_Validate_Common_Scenario_SelectDefaultPaymentMethod();
	}
    
    public boolean redBus_Validate_EndToEnd_Search_Scenario__TYPE3_CASE1(JSONObject objJSON_redBusAdultPassangerDetails){

		redBus_Validate_Common_Scenario_EnterUserDetails(objJSON_redBusAdultPassangerDetails);
		
		return redBus_Validate_Common_Scenario_SelectDefaultPaymentMethod();
	}
    
    public boolean redBus_Validate_EndToEnd_Search_Scenario__TYPE3_CASE2(JSONObject objJSON_redBusAdultPassangerDetails){

		redBus_Validate_Common_Scenario_EnterUserDetails(objJSON_redBusAdultPassangerDetails);
		
		return redBus_Validate_Common_Scenario_SelectDefaultPaymentMethod();
	}	
	
    public boolean redBus_Validate_EndToEnd_Search_Scenario__TYPE3_CASE8(JSONObject objJSON_redBusAdultPassangerDetails){

		redBus_Validate_Common_Scenario_EnterUserDetails(objJSON_redBusAdultPassangerDetails);
		
		return redBus_Validate_Common_Scenario_SelectDefaultPaymentMethod();
	}	
	
    public boolean redBus_Validate_EndToEnd_Search_Scenario__TYPE4_CASE3(JSONObject objJSON_redBusAdultPassangerDetails){

    	boolean bTimeout = false;
    	
    	while (! bTimeout){
    		
    		try{
    			objWait.until(ExpectedConditions.visibilityOf(redBus_btn_Result2UserDetailnPaymentPage_Payment_BookingTimeout));
    			try{objWait.until(ExpectedConditions.visibilityOf(redBus_somejunkelement));}
    			catch (Exception e){}

    			System.out.println("DEBUG:    Time Remaining " + redBus_btn_Result2UserDetailnPaymentPage_Payment_BookingTimeout.getText());
    			if (! redBus_btn_Result2UserDetailnPaymentPage_Payment_BookingTimeout.isDisplayed()){
    				bTimeout = true;
    			}
    		} 
    		catch(Exception e){}    		
    	}
    	
    	System.out.println("DEBUG:    Ticket booking after cetain timeout period is not allowed.");
    	
		return true;
	}	

    public boolean redBus_Validate_Payment_Methods_CardPayment(
    		String strPaymentMethodType,
    		JSONObject objJSON_redBus_DummyCreditCardDetails_All,
    		JSONObject objJSON_redBusAdultPassangerDetails){

		boolean bredBus_ThisElementValidationStatus 		= true;
		Select redBus_drpdwn_General 						= null;

		JSONObject objJSON_redBus_DummyCreditCardDetails_Visa			= objJSON_redBus_DummyCreditCardDetails_All.getJSONObject("Visa");
		JSONObject objJSON_redBus_DummyCreditCardDetails_Amex 			= objJSON_redBus_DummyCreditCardDetails_All.getJSONObject("Amex");
		JSONObject objJSON_redBus_DummyCreditCardDetails_Master_Card 	= objJSON_redBus_DummyCreditCardDetails_All.getJSONObject("Master Card");
		JSONObject objJSON_redBus_DummyDebitCardDetails_Mastero_Card 	= objJSON_redBus_DummyCreditCardDetails_All.getJSONObject("Maestro Card");
		
		redBus_Validate_Common_Scenario_EnterUserDetails(objJSON_redBusAdultPassangerDetails);
		
		if (strPaymentMethodType.contains("Credit_card_type")){

			JSONObject objJSON_redBus_DummyCreditCardDetails = null;
			
			strPaymentMethodType 			= strPaymentMethodType.replace("Credit_card_type__", "").trim();
			String[]  strAryOfPayMentType 	= ClsGeneralInitTerminateAndOtherUtil.splitThisString(strPaymentMethodType," __ ");
			
			for(String strSinglePaymentType : strAryOfPayMentType ){
				redBus_tab_Result2UserDetailnPaymentPage_Payment_CreditCard.click();
					
					System.out.println("DEBUG:    Validating following credit card payment method: " + strSinglePaymentType);
					if(strSinglePaymentType.contains("VISA")){
						System.out.println("DEBUG:    Initiating following method of card payment: " + "VISA");
						objJSON_redBus_DummyCreditCardDetails = objJSON_redBus_DummyCreditCardDetails_Visa;}
					if(strSinglePaymentType.contains("Amex")){
						System.out.println("DEBUG:    Initiating following method of card payment: " + "Amex");
						objJSON_redBus_DummyCreditCardDetails = objJSON_redBus_DummyCreditCardDetails_Amex;}
					if(strSinglePaymentType.contains("MasterCard")){
						System.out.println("DEBUG:    Initiating following method of card payment: " + "MasterCard");
						objJSON_redBus_DummyCreditCardDetails = objJSON_redBus_DummyCreditCardDetails_Master_Card;}
					
					if(strSinglePaymentType.contains("Amex")){
						redBus_tab_Result2UserDetailnPaymentPage_Payment_CreditCard_radiobtn_Amex.click();
						redBus_btn_Result2UserDetailnPaymentPage_Payment_BookNow.click();
						
						try{objWait.until(ExpectedConditions.visibilityOf(redBus_btn_Result2UserDetailnPaymentPage_Payment_Amex_Cancel));} 
						catch(Exception e){
							try{objWait.until(ExpectedConditions.visibilityOf(redBus_btn_Result2UserDetailnPaymentPage_Payment_Amex_Cancel));}
							catch(Exception e1){}
						}
						
						redBus_btn_Result2UserDetailnPaymentPage_Payment_Amex_Cardnumber
								.sendKeys(objJSON_redBus_DummyCreditCardDetails.get("CreditCardNumber").toString());
						redBus_btn_Result2UserDetailnPaymentPage_Payment_Amex_CardExpMM
								.sendKeys(objJSON_redBus_DummyCreditCardDetails.get("ExpiryMonthDigit").toString());
						redBus_btn_Result2UserDetailnPaymentPage_Payment_Amex_CardExpYY
								.sendKeys(objJSON_redBus_DummyCreditCardDetails.get("ExpiryYear_YY").toString());
						redBus_btn_Result2UserDetailnPaymentPage_Payment_Amex_CardCVV
								.sendKeys(objJSON_redBus_DummyCreditCardDetails.get("CreditCardCVVnumber").toString());
						redBus_btn_Result2UserDetailnPaymentPage_Payment_Amex_PayButton.click();
						
						System.out.println("DEBUG:    This test will fail for dummy credit cards");
						// wait for longer time
						try{objWait.until(ExpectedConditions.visibilityOf(redBus_tab_Result2UserDetailnPaymentPage_Payment_CreditCard_radiobtn_Amex));} 
						catch(Exception e){
							try{objWait.until(ExpectedConditions.visibilityOf(redBus_tab_Result2UserDetailnPaymentPage_Payment_CreditCard_radiobtn_Amex));}
							catch(Exception e1){}
						}					    
					}else{
						redBus_tab_Result2UserDetailnPaymentPage_Payment_CreditCard_radiobtn_NonAmex.click();
						
						redBus_tab_Result2UserDetailnPaymentPage_Payment_CreditCard_CardHoldeName
								.sendKeys(objJSON_redBus_DummyCreditCardDetails.get("CardHolderName").toString());
						redBus_tab_Result2UserDetailnPaymentPage_Payment_CreditCard_Group1
								.sendKeys(objJSON_redBus_DummyCreditCardDetails.get("CreditCardNumber1").toString());
						redBus_tab_Result2UserDetailnPaymentPage_Payment_CreditCard_Group2
								.sendKeys(objJSON_redBus_DummyCreditCardDetails.get("CreditCardNumber2").toString());
						redBus_tab_Result2UserDetailnPaymentPage_Payment_CreditCard_Group3
								.sendKeys(objJSON_redBus_DummyCreditCardDetails.get("CreditCardNumber3").toString());
						redBus_tab_Result2UserDetailnPaymentPage_Payment_CreditCard_Group4
								.sendKeys(objJSON_redBus_DummyCreditCardDetails.get("CreditCardNumber4").toString() + Keys.TAB + Keys.PAGE_DOWN);
						redBus_drpdwn_General = new Select(redBus_tab_Result2UserDetailnPaymentPage_Payment_CreditCard_MM);
						redBus_drpdwn_General.selectByIndex(2);
						redBus_drpdwn_General = new Select(redBus_tab_Result2UserDetailnPaymentPage_Payment_CreditCard_YYYY);
						redBus_drpdwn_General.selectByIndex(3);
						redBus_tab_Result2UserDetailnPaymentPage_Payment_CreditCard_CVV
								.sendKeys(objJSON_redBus_DummyCreditCardDetails.get("CreditCardCVVnumber").toString().trim());
						redBus_btn_Result2UserDetailnPaymentPage_Payment_BookNow.click();
					
						System.out.println("DEBUG:    This test will fail for dummy credit cards");
						// wait for longer time
						try{objWait.until(ExpectedConditions.visibilityOf(redBus_tab_Result2UserDetailnPaymentPage_Payment_CreditCardPaymentErrorRecovered));} 
						catch(Exception e){
							try{objWait.until(ExpectedConditions.visibilityOf(redBus_tab_Result2UserDetailnPaymentPage_Payment_CreditCardPaymentErrorRecovered));}
							catch(Exception e1){}
						}
					}
					
					if (! redBus_tab_Result2UserDetailnPaymentPage_Payment_CreditCardPaymentErrorRecovered.isDisplayed()){
						System.out.println("ERROR:    Error occured in validate payment method: credit card payment");
						objSoftAssert.fail("ERROR:    Error occured in validate payment method: credit card payment");
						// this scenario will fail for dummy credit card
						//bredBus_ThisElementValidationStatus = false;
					}					
			}
		}
		
		if (strPaymentMethodType.contains("Debit_card_type")){

			JSONObject objJSON_redBus_DummyDebitCardDetails = null;
			
			strPaymentMethodType 			= strPaymentMethodType.replace("Debit_card_type__", "").trim();
			String[]  strAryOfPayMentType 	= ClsGeneralInitTerminateAndOtherUtil.splitThisString(strPaymentMethodType," __ ");
			
			for(String strSinglePaymentType : strAryOfPayMentType ){
				redBus_tab_Result2UserDetailnPaymentPage_Payment_DebitCard.click();
					
					System.out.println("DEBUG:    Validating following debit card payment method: " + strSinglePaymentType);
					if(strSinglePaymentType.contains("VISA")){
						System.out.println("DEBUG:    Initiating following method of card payment: " + "VISA");
						objJSON_redBus_DummyDebitCardDetails = objJSON_redBus_DummyCreditCardDetails_Visa;}
					if(strSinglePaymentType.contains("MasterCard")){
						System.out.println("DEBUG:    Initiating following method of card payment: " + "MasterCard");
						objJSON_redBus_DummyDebitCardDetails = objJSON_redBus_DummyCreditCardDetails_Master_Card;}
					if(strSinglePaymentType.contains("Mastero")){
						System.out.println("DEBUG:    Initiating following method of card payment: " + "Mastero");
						objJSON_redBus_DummyDebitCardDetails = objJSON_redBus_DummyDebitCardDetails_Mastero_Card;}
					
					redBus_tab_Result2UserDetailnPaymentPage_Payment_DebitCard_CardHoldeName
							.sendKeys(objJSON_redBus_DummyDebitCardDetails.get("CardHolderName").toString());
					redBus_tab_Result2UserDetailnPaymentPage_Payment_DebitCardNumber
							.sendKeys(objJSON_redBus_DummyDebitCardDetails.get("DebitCardNumber").toString() + Keys.TAB + Keys.PAGE_DOWN);
					redBus_drpdwn_General = new Select(redBus_tab_Result2UserDetailnPaymentPage_Payment_DebitCard_MM);
					redBus_drpdwn_General.selectByIndex(2);
					redBus_drpdwn_General = new Select(redBus_tab_Result2UserDetailnPaymentPage_Payment_DebitCard_YYYY);
					redBus_drpdwn_General.selectByIndex(3);
					redBus_tab_Result2UserDetailnPaymentPage_Payment_DebitCard_CVV
							.sendKeys(objJSON_redBus_DummyDebitCardDetails.get("DebitCardCVVnumber").toString().trim());
					redBus_btn_Result2UserDetailnPaymentPage_Payment_BookNow.click();
				
					System.out.println("DEBUG:    This test will fail for dummy debit cards");
					// wait for longer time
					try{objWait.until(ExpectedConditions.visibilityOf(redBus_tab_Result2UserDetailnPaymentPage_Payment_DebitCardPaymentErrorRecovered));} 
					catch(Exception e){
						try{objWait.until(ExpectedConditions.visibilityOf(redBus_tab_Result2UserDetailnPaymentPage_Payment_DebitCardPaymentErrorRecovered));}
						catch(Exception e1){}
					}

					if (! redBus_tab_Result2UserDetailnPaymentPage_Payment_DebitCardPaymentErrorRecovered.isDisplayed()){
						System.out.println("ERROR:    Error occured in validate payment method: debit card payment");
						objSoftAssert.fail("ERROR:    Error occured in validate payment method: debit card payment");
						// this scenario will fail for dummy debit card
						//bredBus_ThisElementValidationStatus = false;
					}
			}
		}

		return bredBus_ThisElementValidationStatus;
	}
    
    public boolean redBus_Validate_Payment_Methods_BankTransfer(
    		String strPaymentMethodType,
    		JSONObject objJSON_redBus_DummyBankingDetails_All,
    		JSONObject objJSON_redBusAdultPassangerDetails){
    	
		boolean bredBus_ThisElementValidationStatus 		= true;
		Select redBus_drpdwn_General 						= null;
		
		JSONObject objJSON_redBus_dummyBankDetails_SBI_Bank					= objJSON_redBus_DummyBankingDetails_All.getJSONObject("SBI Bank");
		JSONObject objJSON_redBus_DummyBankDetails_Axis_Corporation_Bank 	= objJSON_redBus_DummyBankingDetails_All.getJSONObject("Axis Corporation Bank");
		JSONObject objJSON_redBus_DummyBankDetails_ICICI_Bank 				= objJSON_redBus_DummyBankingDetails_All.getJSONObject("ICICI Bank");
		JSONObject objJSON_redBus_DummyBankDetails_HDFC_Bank				= objJSON_redBus_DummyBankingDetails_All.getJSONObject("HDFC Bank");

		redBus_Validate_Common_Scenario_EnterUserDetails(objJSON_redBusAdultPassangerDetails);

		if (strPaymentMethodType.contains("Netbanking_type")){

			@SuppressWarnings("unused")
			JSONObject objJSON_redBus_DummyNetbankingDetails = null;
			
			strPaymentMethodType 			= strPaymentMethodType.replace("Netbanking_type_top_banks__", "").trim();
			String[]  strAryOfPayMentType 	= ClsGeneralInitTerminateAndOtherUtil.splitThisString(strPaymentMethodType," __ ");

			for(String strSinglePaymentType : strAryOfPayMentType ){
				redBus_tab_Result2UserDetailnPaymentPage_Payment_NetBanking.click();
				redBus_tab_Result2UserDetailnPaymentPage_Payment_NetBanking.sendKeys("" + Keys.PAGE_DOWN);
					String strBankName = "";
					@SuppressWarnings("unused")
					int nBankNameIndex = 0;
					
					System.out.println("DEBUG:    Validating following netbanking payment method: " + strSinglePaymentType);
					if(strSinglePaymentType.contains("SBI Bank")){
						System.out.println("DEBUG:    Initiating following method of netbanking: " + "SBI Bank");
						objJSON_redBus_DummyNetbankingDetails = objJSON_redBus_dummyBankDetails_SBI_Bank; strBankName = "State Bank of India (SBI)"; nBankNameIndex = 6;}
					if(strSinglePaymentType.contains("Axis Corporate Bank")){
						System.out.println("DEBUG:    Initiating following method of netbanking: " + "Axis Bank");
						objJSON_redBus_DummyNetbankingDetails = objJSON_redBus_DummyBankDetails_Axis_Corporation_Bank; strBankName = "Axis Bank"; nBankNameIndex = 1;}
					if(strSinglePaymentType.contains("ICICI Bank")){
						System.out.println("DEBUG:    Initiating following method of netbanking: " + "ICICI Bank");
						objJSON_redBus_DummyNetbankingDetails = objJSON_redBus_DummyBankDetails_ICICI_Bank; strBankName = "ICICI Bank"; nBankNameIndex = 4;}
					if(strSinglePaymentType.contains("HDFC Bank")){
						System.out.println("DEBUG:    Initiating following method of netbanking: " + "HDFC Bank");
						objJSON_redBus_DummyNetbankingDetails = objJSON_redBus_DummyBankDetails_HDFC_Bank; strBankName = "HDFC Bank"; nBankNameIndex = 3;}
					
					redBus_drpdwn_General = new Select(redBus_tab_Result2UserDetailnPaymentPage_Payment_NetBanking_BankName);
					redBus_drpdwn_General.selectByVisibleText(strBankName);

					redBus_btn_Result2UserDetailnPaymentPage_Payment_BookNow.click();
					
					objWait.until(ExpectedConditions.urlContains("http"));
					try{objWait.until(ExpectedConditions.visibilityOf(redBus_somejunkelement) );}
					catch(Exception e){
						try{objWait.until(ExpectedConditions.visibilityOf(redBus_somejunkelement) );}
						catch(Exception e1){};};
					
					System.out.println("DEBUG:    This test will fail for dummy bank accounts");
					System.out.println("ERROR:    Error occured in validate payment method: netbanking payment");
					objSoftAssert.fail("ERROR:    Error occured in validate payment method: netbanking payment");
					// this scenario will fail for dummy bank accounts
					//bredBus_ThisElementValidationStatus = false;
			}
		}

		return bredBus_ThisElementValidationStatus;
	}
    
    public boolean redBus_Validate_Payment_Methods_CashOnDelivery(String strPaymentMethodType,JSONObject objJSON_redBusAdultPassangerDetails){
    	
		boolean bredBus_ThisElementValidationStatus 		= true;
		Select redBus_drpdwn_General 						= null;

		redBus_Validate_Common_Scenario_EnterUserDetails(objJSON_redBusAdultPassangerDetails);
		
		redBus_tab_Result2UserDetailnPaymentPage_Payment_CashOnDelivery.click();
		
		redBus_tab_Result2UserDetailnPaymentPage_Payment_CashOnDelivery_Address1
			.sendKeys(objJSON_redBusAdultPassangerDetails.get("Address").toString());
		redBus_tab_Result2UserDetailnPaymentPage_Payment_CashOnDelivery_Address2
			.sendKeys(objJSON_redBusAdultPassangerDetails.get("Address2").toString());
		redBus_tab_Result2UserDetailnPaymentPage_Payment_CashOnDelivery_ContactPhone
			.sendKeys(objJSON_redBusAdultPassangerDetails.get("ContactPhoneAlternate").toString());
		redBus_tab_Result2UserDetailnPaymentPage_Payment_CashOnDelivery_Landmark
			.sendKeys(objJSON_redBusAdultPassangerDetails.get("LandMark").toString());
		redBus_drpdwn_General = new Select(redBus_tab_Result2UserDetailnPaymentPage_Payment_CashOnDelivery_CityName);
		redBus_drpdwn_General.selectByIndex(1);
		redBus_drpdwn_General = new Select(redBus_tab_Result2UserDetailnPaymentPage_Payment_CashOnDelivery_AreaName);
		redBus_drpdwn_General.selectByIndex(1);
		redBus_tab_Result2UserDetailnPaymentPage_Payment_CashOnDelivery_Pincode
			.sendKeys(objJSON_redBusAdultPassangerDetails.get("Pincode").toString());

		redBus_btn_Result2UserDetailnPaymentPage_Payment_BookNow.click();
				
		try{objWait.until(ExpectedConditions.visibilityOfAllElements(redBus_tab_Result2UserDetailnPaymentPage_Payment_CashOnDelivery_Success) );}
		catch(Exception e){
			try{objWait.until(ExpectedConditions.visibilityOfAllElements(redBus_tab_Result2UserDetailnPaymentPage_Payment_CashOnDelivery_Success) );}
			catch(Exception e1){};};

		if (redBus_tab_Result2UserDetailnPaymentPage_Payment_CashOnDelivery_Success.size() < 1){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Error occured in validate payment method: cash on delivery");
			objSoftAssert.fail("ERROR:    Error occured in validate payment method: cash on delivery");
			bredBus_ThisElementValidationStatus = false;			
		}else{
			System.out.println("DEBUG:    Cash on delivery sussess message: " + redBus_tab_Result2UserDetailnPaymentPage_Payment_CashOnDelivery_Success.get(0).getText());			
		}
			
			
		return bredBus_ThisElementValidationStatus;
	}
    
	public boolean redBus_Perform_SimpleActivity_and_NavigateToNextPage(JSONObject objJSON_redBusAdultPassangerDetails){

		redBus_Validate_Common_Scenario_EnterUserDetails(objJSON_redBusAdultPassangerDetails);
		
		return redBus_Validate_Common_Scenario_SelectDefaultPaymentMethod();
	}
	
	
	
	

}
