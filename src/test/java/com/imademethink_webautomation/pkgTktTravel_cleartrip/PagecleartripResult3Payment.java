package com.imademethink_webautomation.pkgTktTravel_cleartrip;

import java.util.List;

import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.imademethink_webautomation.UtilGeneral.ClsGeneralInitTerminateAndOtherUtil;
import com.imademethink_webautomation.pkg0GeneralPageFactory.Page0Abstract;

public class PagecleartripResult3Payment extends Page0Abstract{

	public PagecleartripResult3Payment(WebDriver driver) {
		super(driver);
		//System.out.println("DEBUG:    PagecleartripResult3Payment constructor");
		PageFactory.initElements(driver, this);
		//objLocal_PagecleartripResult2SelectFlight	= new PagecleartripResult2SelectFlight(driver);
		//objLocal_PagecleartripResult3Price		= new PagecleartripResult3Price(driver);
		//objLocal_PagecleartripResult99General 	= new PagecleartripResult99General(driver);
	}
	
	// payment related elements
	@FindBy(linkText="Credit Card")
	private WebElement cleartrip_tab_Result3PaymentPage_CreditCard;
	@FindBy(linkText="Debit Card")
	private WebElement cleartrip_tab_Result3PaymentPage_DebitCard;
	@FindBy(linkText="Net Banking")
	private WebElement cleartrip_tab_Result3PaymentPage_NetBanking;
	
	// elements for credit card
	@FindBy(css=".creditCardNumber")
	private WebElement cleartrip_txtbox_Result3PaymentPage_CreditCard_CardNumber;
	@FindBy(css="#CcExpirationMonth")
	private WebElement cleartrip_drpdown_Result3PaymentPage_CreditCard_Expiry_MM;
	@FindBy(css="#CcExpirationYear")
	private WebElement cleartrip_drpdown_Result3PaymentPage_CreditCard_Expiry_YYYY;
	@FindBy(css="#BillName")
	private List<WebElement> cleartrip_lst_txtbox_Result3PaymentPage_CreditCard_CardHolderName;
	@FindBy(css="#cvvCode")
	private WebElement cleartrip_txtbox_Result3PaymentPage_CreditCard_CardCVVNumber;
	@FindBy(css="#paymentSubmit")
	private WebElement cleartrip_btn_Result3PaymentPage_CreditCard_PaymentSubmit;
	@FindBy(css="#billAddress")
	private WebElement cleartrip_txtbox_Result3PaymentPage_CreditCard_Amex_Address;
	@FindBy(css="#billCity")
	private WebElement cleartrip_txtbox_Result3PaymentPage_CreditCard_Amex_AddressCity;
	@FindBy(css="#billState")
	private WebElement cleartrip_txtbox_Result3PaymentPage_CreditCard_Amex_AddressState;
	@FindBy(css="#billPin")
	private WebElement cleartrip_txtbox_Result3PaymentPage_CreditCard_Amex_AddressStatePin;
	@FindBy(css="#billCountry")
	private WebElement cleartrip_txtbox_Result3PaymentPage_CreditCard_Amex_AddressStateCountry;
	@FindBy(css="a[tabindex='-1']")
	private List<WebElement> cleartrip_lst_labl_Result3PaymentPage_CreditCard_Amex_AddressStateCountry_AutoComplete;
	
	// elements for debit card
	@FindBy(css="#debitCardNumberDisp")
	private WebElement cleartrip_txtbox_Result3PaymentPage_DebitCard_CardNumber;
	@FindBy(css="#DcExpirationMonth")
	private WebElement cleartrip_drpdown_Result3PaymentPage_DebitCard_Expiry_MM;
	@FindBy(css="#DcExpirationYear")
	private WebElement cleartrip_drpdown_Result3PaymentPage_DebitCard_Expiry_YYYY;
	@FindBy(css="#BillName")
	private List<WebElement> cleartrip_lst_txtbox_Result3PaymentPage_DebitCard_CardHolderName;
	@FindBy(css="#cvvCodeDc")
	private WebElement cleartrip_txtbox_Result3PaymentPage_DebitCard_CardCVVNumber;
	@FindBy(css="#paymentSubmit")
	private WebElement cleartrip_btn_Result3PaymentPage_DebitCard_PaymentSubmit;

	// elements for netbanking
	@FindBy(css="#transferBank")
	private WebElement cleartrip_drpdown_Result3PaymentPage_NetBanking_BankSelector;
	@FindBy(css="#paymentSubmit")
	private WebElement cleartrip_btn_Result3PaymentPage_NetBanking_PaymentSubmit;
	
	// elements for payment error
	By cleartrip_ByCssSelector_SelectResult3PaymentPage_PaymentErrorBlock 	= new ByCssSelector (".baseMessage");
	@FindBy(css="#retryButton")
	private List<WebElement> cleartrip_lst_btn_Result3PaymentPage_PaymentRetry;
	
	// some junk element
	@FindBy(css = "zzzzzzzzzzzzzzzzzzzzz")
	private WebElement cleartrip_SomeJunkElement;

	
    // every page object has it's local private wait with fixed 10 sec delay
    private WebDriverWait objWait 		= new WebDriverWait(this.objWebDriverAbstract, 10);
		
	public boolean cleartrip_Validate_EndToEnd_Search_Scenario__TYPE3_CASE1(JSONObject objJSON_cleartrip_DummyCreditCardDetails_VISA){

		boolean bcleartrip_ThisElementValidationStatus 		= true;
		Select clearTrip_drpdwn_General 					= null;
		
		System.out.println("DEBUG:    Entering payment details for VISA type credit card");
		
		cleartrip_txtbox_Result3PaymentPage_CreditCard_CardNumber.sendKeys(objJSON_cleartrip_DummyCreditCardDetails_VISA.get("CreditCardNumber").toString());
		clearTrip_drpdwn_General = new Select(cleartrip_drpdown_Result3PaymentPage_CreditCard_Expiry_MM);
		clearTrip_drpdwn_General.selectByValue(objJSON_cleartrip_DummyCreditCardDetails_VISA.get("ExpiryMonth_digit").toString().trim());
		clearTrip_drpdwn_General = new Select(cleartrip_drpdown_Result3PaymentPage_CreditCard_Expiry_YYYY);
		clearTrip_drpdwn_General.selectByValue(objJSON_cleartrip_DummyCreditCardDetails_VISA.get("ExpiryYear").toString().trim());
		cleartrip_lst_txtbox_Result3PaymentPage_CreditCard_CardHolderName.get(0).sendKeys(objJSON_cleartrip_DummyCreditCardDetails_VISA.get("CardHolderName").toString());
		cleartrip_txtbox_Result3PaymentPage_CreditCard_CardCVVNumber.sendKeys(objJSON_cleartrip_DummyCreditCardDetails_VISA.get("CreditCardCVVnumber").toString());
		cleartrip_btn_Result3PaymentPage_CreditCard_PaymentSubmit.click();

		System.out.println("DEBUG:    This test will fail for dummy credit cards");
		
		// wait for longer time
		try{objWait.until(ExpectedConditions.invisibilityOfElementLocated(cleartrip_ByCssSelector_SelectResult3PaymentPage_PaymentErrorBlock));} catch(Exception e){}
		try{objWait.until(ExpectedConditions.invisibilityOfElementLocated(cleartrip_ByCssSelector_SelectResult3PaymentPage_PaymentErrorBlock));}
		catch(Exception e){
			System.out.println("ERROR:    Error occured in search results for TYPE3_CASE1 - upto after payment page");
			objSoftAssert.fail("ERROR:    Error occured in search results for TYPE3_CASE1 - upto after payment page");
			// this scenario will fail for dummy credit card
			//bcleartrip_ThisElementValidationStatus = false;
		}

		return bcleartrip_ThisElementValidationStatus;
	}
	
    public boolean cleartrip_Validate_Payment_Methods_CardPayment(String strPaymentMethodType,JSONObject objJSON_cleartrip_DummyCreditCardDetails_All){

		boolean bcleartrip_ThisElementValidationStatus 		= true;
		Select clearTrip_drpdwn_General 					= null;
		//Actions objActionsBldr_cleartrip_General 			= new Actions(this.objWebDriverAbstract);

		JSONObject objJSON_cleartrip_DummyCreditCardDetails_Visa			= objJSON_cleartrip_DummyCreditCardDetails_All.getJSONObject("Visa");
		JSONObject objJSON_cleartrip_DummyCreditCardDetails_Amex 			= objJSON_cleartrip_DummyCreditCardDetails_All.getJSONObject("Amex");
		JSONObject objJSON_cleartrip_DummyCreditCardDetails_Master_Card 	= objJSON_cleartrip_DummyCreditCardDetails_All.getJSONObject("Master Card");
		JSONObject objJSON_cleartrip_DummyCreditCardDetails_RuPay			= objJSON_cleartrip_DummyCreditCardDetails_All.getJSONObject("RuPay");
		JSONObject objJSON_cleartrip_DummyCreditCardDetails_Maestro_Card	= objJSON_cleartrip_DummyCreditCardDetails_All.getJSONObject("Maestro Card");
		JSONObject objJSON_cleartrip_DummyCreditCardDetails_Diners_Club_Card= objJSON_cleartrip_DummyCreditCardDetails_All.getJSONObject("Diners Club");

		if (strPaymentMethodType.contains("Credit_card_type")){

			JSONObject objJSON_cleartrip_DummyCreditCardDetails = null;
			
			strPaymentMethodType 			= strPaymentMethodType.replace("Credit_card_type__", "").trim();
			String[]  strAryOfPayMentType 	= ClsGeneralInitTerminateAndOtherUtil.splitThisString(strPaymentMethodType," __ ");
			
			for(String strSinglePaymentType : strAryOfPayMentType ){
					cleartrip_tab_Result3PaymentPage_CreditCard.click();
					
					System.out.println("DEBUG:    Validating following credit card payment method: " + strSinglePaymentType);
					if(strSinglePaymentType.contains("Visa")){
						System.out.println("DEBUG:    Initiating following method of card payment: " + "Visa");
						objJSON_cleartrip_DummyCreditCardDetails = objJSON_cleartrip_DummyCreditCardDetails_Visa;}
					if(strSinglePaymentType.contains("Amex")){
						System.out.println("DEBUG:    Initiating following method of card payment: " + "Amex");
						objJSON_cleartrip_DummyCreditCardDetails = objJSON_cleartrip_DummyCreditCardDetails_Amex;}
					if(strSinglePaymentType.contains("Master Card")){
						System.out.println("DEBUG:    Initiating following method of card payment: " + "Master Card");
						objJSON_cleartrip_DummyCreditCardDetails = objJSON_cleartrip_DummyCreditCardDetails_Master_Card;}
					if(strSinglePaymentType.contains("Diners Club")){
						System.out.println("DEBUG:    Initiating following method of card payment: " + "Diners Club");
						objJSON_cleartrip_DummyCreditCardDetails = objJSON_cleartrip_DummyCreditCardDetails_Diners_Club_Card;}
					
					cleartrip_txtbox_Result3PaymentPage_CreditCard_CardNumber.sendKeys(objJSON_cleartrip_DummyCreditCardDetails.get("CreditCardNumber").toString());
					clearTrip_drpdwn_General = new Select(cleartrip_drpdown_Result3PaymentPage_CreditCard_Expiry_MM);
					clearTrip_drpdwn_General.selectByValue(objJSON_cleartrip_DummyCreditCardDetails.get("ExpiryMonth_digit").toString().trim());
					clearTrip_drpdwn_General = new Select(cleartrip_drpdown_Result3PaymentPage_CreditCard_Expiry_YYYY);
					clearTrip_drpdwn_General.selectByValue(objJSON_cleartrip_DummyCreditCardDetails.get("ExpiryYear").toString().trim());
					cleartrip_lst_txtbox_Result3PaymentPage_CreditCard_CardHolderName.get(0).sendKeys(objJSON_cleartrip_DummyCreditCardDetails.get("CardHolderName").toString());
					cleartrip_txtbox_Result3PaymentPage_CreditCard_CardCVVNumber.sendKeys(objJSON_cleartrip_DummyCreditCardDetails.get("CreditCardCVVnumber").toString());
					
					if(strSinglePaymentType.contains("Amex")){
						cleartrip_txtbox_Result3PaymentPage_CreditCard_Amex_Address.sendKeys(objJSON_cleartrip_DummyCreditCardDetails.get("Address1").toString());
						cleartrip_txtbox_Result3PaymentPage_CreditCard_Amex_AddressCity.sendKeys(objJSON_cleartrip_DummyCreditCardDetails.get("City").toString());
						cleartrip_txtbox_Result3PaymentPage_CreditCard_Amex_AddressState.sendKeys(objJSON_cleartrip_DummyCreditCardDetails.get("State").toString());
						cleartrip_txtbox_Result3PaymentPage_CreditCard_Amex_AddressStatePin.sendKeys(objJSON_cleartrip_DummyCreditCardDetails.get("Pin").toString());

//						objActionsBldr_cleartrip_General
//							.sendKeys(cleartrip_txtbox_Result3PaymentPage_CreditCard_Amex_AddressStateCountry,
//												"" + Keys.chord(Keys.CONTROL, "a") + Keys.DELETE + Keys.TAB + Keys.TAB + Keys.TAB + Keys.TAB + Keys.TAB + Keys.TAB	
//											       + Keys.TAB + Keys.TAB + Keys.TAB + Keys.TAB + Keys.TAB + Keys.TAB)
//							.sendKeys(cleartrip_txtbox_Result3PaymentPage_CreditCard_Amex_AddressStateCountry, objJSON_cleartrip_DummyCreditCardDetails.get("Country").toString().trim())
//							.sendKeys(cleartrip_txtbox_Result3PaymentPage_CreditCard_Amex_AddressStateCountry, "" + Keys.RIGHT + Keys.DOWN + Keys.DOWN + Keys.DOWN + Keys.DOWN)
//							.sendKeys(cleartrip_txtbox_Result3PaymentPage_CreditCard_Amex_AddressStateCountry, "" + Keys.RIGHT + Keys.DOWN + Keys.DOWN + Keys.DOWN + Keys.DOWN)
//							.build()
//							.perform();
//						
//						objActionsBldr_cleartrip_General
//							.moveToElement(cleartrip_lst_labl_Result3PaymentPage_CreditCard_Amex_AddressStateCountry_AutoComplete.get(0))
//							.click(cleartrip_lst_labl_Result3PaymentPage_CreditCard_Amex_AddressStateCountry_AutoComplete.get(0))
//							.build()
//							.perform();
//							
						
					}
					cleartrip_btn_Result3PaymentPage_CreditCard_PaymentSubmit.click();
					System.out.println("DEBUG:    This test will fail for dummy credit cards");

					// wait for longer time
					try{objWait.until(ExpectedConditions.invisibilityOfElementLocated(cleartrip_ByCssSelector_SelectResult3PaymentPage_PaymentErrorBlock));} 
					catch(Exception e){}
					try{objWait.until(ExpectedConditions.invisibilityOfElementLocated(cleartrip_ByCssSelector_SelectResult3PaymentPage_PaymentErrorBlock));}
					catch(Exception e){
						System.out.println("ERROR:    Error occured in validate payment method: credit card payment");
						objSoftAssert.fail("ERROR:    Error occured in validate payment method: credit card payment");
						// this scenario will fail for dummy credit card
						//bcleartrip_ThisElementValidationStatus = false;
					}
					if (cleartrip_lst_btn_Result3PaymentPage_PaymentRetry.size() > 0){
						if(cleartrip_lst_btn_Result3PaymentPage_PaymentRetry.get(0).isDisplayed()) 
							cleartrip_lst_btn_Result3PaymentPage_PaymentRetry.get(0).click();						
					}
					
					// wait for long longer time, this will take time
					try{objWait.until(ExpectedConditions.visibilityOf(cleartrip_txtbox_Result3PaymentPage_CreditCard_CardNumber));} 
					catch(Exception e){
						try{objWait.until(ExpectedConditions.visibilityOf(cleartrip_txtbox_Result3PaymentPage_CreditCard_CardNumber));} 
						catch(Exception e1){
							try{objWait.until(ExpectedConditions.visibilityOf(cleartrip_txtbox_Result3PaymentPage_CreditCard_CardNumber));} 
							catch(Exception e2){}
						}
					}
			}
		}
		
		if (strPaymentMethodType.contains("Debit_card_type")){

			JSONObject objJSON_cleartrip_DummyDebitCardDetails = null;
			
			strPaymentMethodType 			= strPaymentMethodType.replace("Debit_card_type__", "").trim();
			String[]  strAryOfPayMentType 	= ClsGeneralInitTerminateAndOtherUtil.splitThisString(strPaymentMethodType," __ ");
			

			for(String strSinglePaymentType : strAryOfPayMentType ){
					cleartrip_tab_Result3PaymentPage_DebitCard.click();
					
					System.out.println("DEBUG:    Validating following debit card payment method: " + strSinglePaymentType);
					if(strSinglePaymentType.contains("Visa")){
						System.out.println("DEBUG:    Initiating following method of card payment: " + "Visa");
						objJSON_cleartrip_DummyDebitCardDetails = objJSON_cleartrip_DummyCreditCardDetails_Visa;}
					if(strSinglePaymentType.contains("RuPay")){
						System.out.println("DEBUG:    Initiating following method of card payment: " + "RuPay");
						objJSON_cleartrip_DummyDebitCardDetails = objJSON_cleartrip_DummyCreditCardDetails_RuPay;}
					if(strSinglePaymentType.contains("Maestro Card")){
						System.out.println("DEBUG:    Initiating following method of card payment: " + "Maestro Card");
						objJSON_cleartrip_DummyDebitCardDetails = objJSON_cleartrip_DummyCreditCardDetails_Maestro_Card;}
						
					cleartrip_txtbox_Result3PaymentPage_DebitCard_CardNumber.sendKeys(objJSON_cleartrip_DummyDebitCardDetails.get("DebitCardNumber").toString());
					clearTrip_drpdwn_General = new Select(cleartrip_drpdown_Result3PaymentPage_DebitCard_Expiry_MM);
					clearTrip_drpdwn_General.selectByValue(objJSON_cleartrip_DummyDebitCardDetails.get("ExpiryMonth_digit").toString().trim());
					clearTrip_drpdwn_General = new Select(cleartrip_drpdown_Result3PaymentPage_DebitCard_Expiry_YYYY);
					clearTrip_drpdwn_General.selectByValue(objJSON_cleartrip_DummyDebitCardDetails.get("ExpiryYear").toString().trim());
					cleartrip_lst_txtbox_Result3PaymentPage_DebitCard_CardHolderName.get(1).sendKeys(objJSON_cleartrip_DummyDebitCardDetails.get("CardHolderName").toString());
					cleartrip_txtbox_Result3PaymentPage_DebitCard_CardCVVNumber.sendKeys(objJSON_cleartrip_DummyDebitCardDetails.get("DebitCardCVVnumber").toString());
					cleartrip_btn_Result3PaymentPage_DebitCard_PaymentSubmit.click();

					System.out.println("DEBUG:    This test will fail for dummy debit cards");
					
					// wait for longer time
					try{objWait.until(ExpectedConditions.invisibilityOfElementLocated(cleartrip_ByCssSelector_SelectResult3PaymentPage_PaymentErrorBlock));} 
					catch(Exception e){}
					try{objWait.until(ExpectedConditions.invisibilityOfElementLocated(cleartrip_ByCssSelector_SelectResult3PaymentPage_PaymentErrorBlock));}
					catch(Exception e){
						System.out.println("ERROR:    Error occured in validate payment method: debit card payment");
						objSoftAssert.fail("ERROR:    Error occured in validate payment method: debit card payment");
						// this scenario will fail for dummy debit card
						//bcleartrip_ThisElementValidationStatus = false;
					}
					if (cleartrip_lst_btn_Result3PaymentPage_PaymentRetry.size() > 0){
						if(cleartrip_lst_btn_Result3PaymentPage_PaymentRetry.get(0).isDisplayed()) 
							cleartrip_lst_btn_Result3PaymentPage_PaymentRetry.get(0).click();						
					}
					
					// wait for long longer time, this will take time
					try{objWait.until(ExpectedConditions.visibilityOf(cleartrip_txtbox_Result3PaymentPage_CreditCard_CardNumber));} 
					catch(Exception e){
						try{objWait.until(ExpectedConditions.visibilityOf(cleartrip_txtbox_Result3PaymentPage_CreditCard_CardNumber));} 
						catch(Exception e1){
							try{objWait.until(ExpectedConditions.visibilityOf(cleartrip_txtbox_Result3PaymentPage_CreditCard_CardNumber));} 
							catch(Exception e2){}
						}
					}
			}
		}

		return bcleartrip_ThisElementValidationStatus;
	}
    
    public boolean cleartrip_Validate_Payment_Methods_BankTransfer(String strPaymentMethodType,JSONObject objJSON_cleartrip_DummyBankingDetails_All){
    	
		boolean bcleartrip_ThisElementValidationStatus 		= true;
		
		JSONObject objJSON_cleartrip_dummyBankDetails_SBI_Bank					= objJSON_cleartrip_DummyBankingDetails_All.getJSONObject("SBI Bank");
		JSONObject objJSON_cleartrip_DummyBankDetails_Axis_Corporation_Bank 	= objJSON_cleartrip_DummyBankingDetails_All.getJSONObject("Axis Corporation Bank");
		JSONObject objJSON_cleartrip_DummyBankDetails_ICICI_Bank 				= objJSON_cleartrip_DummyBankingDetails_All.getJSONObject("ICICI Bank");
		JSONObject objJSON_cleartrip_DummyBankDetails_HDFC_Bank					= objJSON_cleartrip_DummyBankingDetails_All.getJSONObject("HDFC Bank");

		if (strPaymentMethodType.contains("Netbanking_type")){

			@SuppressWarnings("unused")
			JSONObject objJSON_cleartrip_DummyNetbankingDetails = null;
			
			strPaymentMethodType 			= strPaymentMethodType.replace("Netbanking_type_top_banks__", "").trim();
			String[]  strAryOfPayMentType 	= ClsGeneralInitTerminateAndOtherUtil.splitThisString(strPaymentMethodType," __ ");

			for(String strSinglePaymentType : strAryOfPayMentType ){
					cleartrip_tab_Result3PaymentPage_NetBanking.click();
					String strBankName = "";
					System.out.println("DEBUG:    Validating following netbanking payment method: " + strSinglePaymentType);
					if(strSinglePaymentType.contains("SBI Bank")){
						System.out.println("DEBUG:    Initiating following method of netbanking: " + "SBI Bank");
						objJSON_cleartrip_DummyNetbankingDetails = objJSON_cleartrip_dummyBankDetails_SBI_Bank; strBankName = "State Bank of India";}
					if(strSinglePaymentType.contains("Axis Corporate Bank")){
						System.out.println("DEBUG:    Initiating following method of netbanking: " + "Axis Corporate Bank");
						objJSON_cleartrip_DummyNetbankingDetails = objJSON_cleartrip_DummyBankDetails_Axis_Corporation_Bank; strBankName = "Axis Bank";}
					if(strSinglePaymentType.contains("ICICI Bank")){
						System.out.println("DEBUG:    Initiating following method of netbanking: " + "ICICI Bank");
						objJSON_cleartrip_DummyNetbankingDetails = objJSON_cleartrip_DummyBankDetails_ICICI_Bank; strBankName = "ICICI Bank";}
					if(strSinglePaymentType.contains("HDFC Bank")){
						System.out.println("DEBUG:    Initiating following method of netbanking: " + "HDFC Bank");
						objJSON_cleartrip_DummyNetbankingDetails = objJSON_cleartrip_DummyBankDetails_HDFC_Bank; strBankName = "HDFC Bank";}
					
					Select onjSelect_cleartrip_drpdwn_NetbankingSelector	= new Select(cleartrip_drpdown_Result3PaymentPage_NetBanking_BankSelector);
					onjSelect_cleartrip_drpdwn_NetbankingSelector.selectByVisibleText(strBankName);
					cleartrip_btn_Result3PaymentPage_NetBanking_PaymentSubmit.click();
					
					objWait.until(ExpectedConditions.urlContains("http"));
					try{objWait.until(ExpectedConditions.visibilityOf(cleartrip_SomeJunkElement) );}catch(Exception e){};
					
					System.out.println("DEBUG:    This test will fail for dummy bank accounts");
					System.out.println("ERROR:    Error occured in validate payment method: netbanking payment");
					objSoftAssert.fail("ERROR:    Error occured in validate payment method: netbanking payment");
					// this scenario will fail for dummy bank accounts
					//bcleartrip_ThisElementValidationStatus = false;
			}
		}

		return bcleartrip_ThisElementValidationStatus;
	}
    

	
	
	
	
	
}
