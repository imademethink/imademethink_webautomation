package com.imademethink_webautomation.pkgAirlines_GoAir;

import java.util.List;

import org.json.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.imademethink_webautomation.UtilGeneral.ClsGeneralInitTerminateAndOtherUtil;
import com.imademethink_webautomation.UtilPayments.ClsPymentHandlerThirdParty;
import com.imademethink_webautomation.pkg0GeneralPageFactory.Page0Abstract;


public class PageGoAirResult5Payment extends Page0Abstract{

	//private PageGoAirResult0InProgress 					objLocal_PageGoAirResult0InProgress = null;
	//private PageGoAirResult2SelectDate 					objLocal_PageGoAirResult2SelectDate = null;
	//private PageGoAirResult3ServicesAndPassengerDetail 	objLocal_PageGoAirResult2ServicesAndPassengerDetail = null;
	//private PageGoAirResult4SeatAssignment 				objLocal_PageGoAirResult3SeatAssignment = null;
	//private PageGoAir99General 						objLocal_PageGoAirResult99General = null;
	
	public PageGoAirResult5Payment(WebDriver driver) {
		super(driver);
		//System.out.println("DEBUG:    PageGoAirResult5Payment constructor");
		PageFactory.initElements(driver, this);
		//objLocal_PageGoAirResult0InProgress					= new PageGoAirResult0InProgress(driver);
		//objLocal_PageGoAirResult2SelectDate					= new PageGoAirResult2SelectDate(driver);
		//objLocal_PageGoAirResult2ServicesAndPassengerDetail	= new PageGoAirResult3ServicesAndPassengerDetail(driver);
		//objLocal_PageGoAirResult3SeatAssignment				= new PageGoAirResult4SeatAssignment(driver);
		//objLocal_PageGoAirResult99General						= new PageGoAir99General(driver);
	}
	
	
	
	// public elements so that other class can also access
	@FindBy(css="div[class='step active']")
	public WebElement GoAir_Result5Page_CurrentStep;
	
	@FindBy(css=".textBold.nowrap")
	public List<WebElement> GoAir_lst_Result5Page_ErrorOccured;
	@FindBy(css="#WDSErrorContainer>h1")
	public List<WebElement> GoAir_lst_Result5Page_Error_Type2_Heading;
	@FindBy(css=".WDSErrorE")
	public WebElement GoAir_Result5Page_Error_Type2_Text;
	
    // other private elements
	@FindBy(css="#CC")
	private WebElement GoAir_radiobtn_Result5Page_PurchaseNow;
	@FindBy(css="#PLCC")
	private WebElement GoAir_radiobtn_Result5Page_OtherPurchaseOption;
	@FindBy(css="#PLCC")
	private WebElement GoAir_radiobtn_Result5Page_PurchaseLater_OR_BankXfer_OR_OnlineBanking;
	@FindBy(css="#CheckPenaliesBox")
	private WebElement GoAir_tickbox_Result5Page_WebsiteAgreement_PrivacyPolicy_BaggageCharges;
	@FindBy(css="#CheckPHMSADangerousGoodsNotice")
	private WebElement GoAir_tickbox_Result5Page_Hazardousmaterialsanddangerousgoodspolicy;
	@FindBy(css="#btnConfirmPurc")
	private WebElement GoAir_btn_Result5Page_Purchase;
	@FindBy(css="#btnPurchaseNow")
	public WebElement GoAir_btn_Result5Page_NoVoucher_ConfirmPurchase;
	
	// payment related private elements
	@FindBy(css="#ccCardType")
	private WebElement GoAir_drpdwn_Result5Page_CardType_Credit;
	@FindBy(css="#dcCardType")
	private WebElement GoAir_drpdwn_Result5Page_CardType_Debit;
	
	@FindBy(css="#cardNumber")
	private WebElement GoAir_txtbox_Result5Page_CardNumber;
	@FindBy(css="#cardName")
	private WebElement GoAir_txtbox_Result5Page_CardHolderName;
	@FindBy(css="#expiryMonth")
	private WebElement GoAir_drpdwn_Result5Page_CC_ExpiryMonth;
	@FindBy(css="#expiryYear")
	private WebElement GoAir_drpdwn_Result5Page_CC_ExpiryYear;
	@FindBy(css="#cvv")
	private WebElement GoAir_txtbox_Result5Page_CardCVVnumber;
	//@FindBy(css=".payBtnSpan")
	@FindBy(css="#btn-makePayment")
	private WebElement GoAir_btn_Result5Page_ProceedPayment;
	@FindBy(css="#btn-paymentCancel")
	private WebElement GoAir_btn_Result5Page_ProceedPayment_Popup_CancelPayment;
	
	@FindBy(css="#AIR_CC_ADDRESS_FIRSTLINE")
	private WebElement GoAir_txtbox_Result5Page_Address1;
	@FindBy(css="#AIR_CC_ADDRESS_SECONDLINE")
	private WebElement GoAir_txtbox_Result5Page_Address2;
	@FindBy(css="#AIR_CC_ADDRESS_ZIPCODE")
	private WebElement GoAir_txtbox_Result5Page_PostalorZIPCode;
	@FindBy(css="#AIR_CC_ADDRESS_CITY")
	private WebElement GoAir_txtbox_Result5Page_City;
	@FindBy(css="#AIR_CC_ADDRESS_STATE")
	private WebElement GoAir_txtbox_Result5Page_StateORProvience;
	@FindBy(css="#AIR_CC_DROPDOWN_LIST")
	private WebElement GoAir_drpdwn_Result5Page_Country;
	@FindBy(css="#creditCardSingleField")
	private WebElement GoAir_txtbox_Result5Page_Amex__Diners_Club__JCB__CardNumber;
	@FindBy(css="#creditCardEntryField1")
	private WebElement GoAir_txtbox_Result5Page_CardNumber1;
	@FindBy(css="#creditCardEntryField2")
	private WebElement GoAir_txtbox_Result5Page_CardNumber2;
	@FindBy(css="#creditCardEntryField3")
	private WebElement GoAir_txtbox_Result5Page_CardNumber3;
	@FindBy(css="#creditCardEntryField4")
	private WebElement GoAir_txtbox_Result5Page_CardNumber4;

	// other element
	@FindBy(css=".merchantBannerImage")
	private WebElement ThirdPartyGateway_img_Citrus_MainElement_Check;
	
	
    // every page object has it's local private wait with fixed 10 sec delay
	private WebDriverWait objWait = new WebDriverWait(this.objWebDriverAbstract, 10);   
    
	
    public boolean GoAir_Validate_Payment_Methods_CardPayment(String strPaymentMethodType,JSONObject objJSON_GoAir_DummyCreditCardDetails_All){
    	
		boolean bGoAir_ThisElementValidationStatus 		= true;
		
		JSONObject objJSON_GoAir_DummyCreditCardDetails_Visa			= objJSON_GoAir_DummyCreditCardDetails_All.getJSONObject("Visa");
		JSONObject objJSON_GoAir_DummyCreditCardDetails_Amex 			= objJSON_GoAir_DummyCreditCardDetails_All.getJSONObject("Amex");
		JSONObject objJSON_GoAir_DummyCreditCardDetails_Master_Card 	= objJSON_GoAir_DummyCreditCardDetails_All.getJSONObject("Master Card");
		JSONObject objJSON_GoAir_DummyCreditCardDetails_RuPay			= objJSON_GoAir_DummyCreditCardDetails_All.getJSONObject("RuPay");
		JSONObject objJSON_GoAir_DummyCreditCardDetails_Maestro_Card	= objJSON_GoAir_DummyCreditCardDetails_All.getJSONObject("Maestro Card");

		if (strPaymentMethodType.contains("Credit_card_type")){

			GoAir_btn_Result5Page_NoVoucher_ConfirmPurchase.click();
			objWait.until(ExpectedConditions.visibilityOf(ThirdPartyGateway_img_Citrus_MainElement_Check));
			JSONObject objJSON_GoAir_DummyCreditCardDetails = null;
			
			strPaymentMethodType 			= strPaymentMethodType.replace("Credit_card_type__", "").trim();
			String[]  strAryOfPayMentType 	= ClsGeneralInitTerminateAndOtherUtil.splitThisString(strPaymentMethodType," __ ");
			
			for(String strSinglePaymentType : strAryOfPayMentType ){
					System.out.println("DEBUG:    Validating following credit card payment method: " + strSinglePaymentType);
					if(strSinglePaymentType.contains("Visa")){
						System.out.println("DEBUG:    Initiating following method of card payment: " + "Visa");
						objJSON_GoAir_DummyCreditCardDetails = objJSON_GoAir_DummyCreditCardDetails_Visa;}
					if(strSinglePaymentType.contains("Amex")){
						System.out.println("DEBUG:    Initiating following method of card payment: " + "Amex");
						objJSON_GoAir_DummyCreditCardDetails = objJSON_GoAir_DummyCreditCardDetails_Amex;}
					if(strSinglePaymentType.contains("Master Card")){
						System.out.println("DEBUG:    Initiating following method of card payment: " + "Master Card");
						objJSON_GoAir_DummyCreditCardDetails = objJSON_GoAir_DummyCreditCardDetails_Master_Card;}
						
					ClsPymentHandlerThirdParty.ThirdPartyGateway_Citrus_ValidateCreditCardPayment(
																			(WebDriver) this.objWebDriverAbstract,
																			objJSON_GoAir_DummyCreditCardDetails);
					
					// since it is dummy card payment, it will fail
					System.out.println("ERROR:    Error occured during this credit card payment processing type");
					objSoftAssert.fail("ERROR:    Error occured during this credit card payment processing type");
			}
		}
		
		if (strPaymentMethodType.contains("Debit_card_type")){

			GoAir_btn_Result5Page_NoVoucher_ConfirmPurchase.click();
			objWait.until(ExpectedConditions.visibilityOf(ThirdPartyGateway_img_Citrus_MainElement_Check));
			JSONObject objJSON_GoAir_DummyDebitCardDetails = null;
			
			strPaymentMethodType 			= strPaymentMethodType.replace("Debit_card_type__", "").trim();
			String[]  strAryOfPayMentType 	= ClsGeneralInitTerminateAndOtherUtil.splitThisString(strPaymentMethodType," __ ");

			for(String strSinglePaymentType : strAryOfPayMentType ){
					System.out.println("DEBUG:    Validating following debit card payment method: " + strSinglePaymentType);
					if(strSinglePaymentType.contains("Visa")){
						System.out.println("DEBUG:    Initiating following method of card payment: " + "Visa");
						objJSON_GoAir_DummyDebitCardDetails = objJSON_GoAir_DummyCreditCardDetails_Visa;}
					if(strSinglePaymentType.contains("RuPay")){
						System.out.println("DEBUG:    Initiating following method of card payment: " + "RuPay");
						objJSON_GoAir_DummyDebitCardDetails = objJSON_GoAir_DummyCreditCardDetails_RuPay;}
					if(strSinglePaymentType.contains("Maestro Card")){
						System.out.println("DEBUG:    Initiating following method of card payment: " + "Maestro Card");
						objJSON_GoAir_DummyDebitCardDetails = objJSON_GoAir_DummyCreditCardDetails_Maestro_Card;}
						
					ClsPymentHandlerThirdParty.ThirdPartyGateway_Citrus_ValidateDebitCardPayment(
																			(WebDriver) this.objWebDriverAbstract,
																			objJSON_GoAir_DummyDebitCardDetails);
					
					// since it is dummy card payment, it will fail
					System.out.println("ERROR:    Error occured during this debit card payment processing type");
					objSoftAssert.fail("ERROR:    Error occured during this debit card payment processing type");
			}			
		}

		return bGoAir_ThisElementValidationStatus;
	}
    
    public boolean GoAir_Validate_Payment_Methods_BankTransfer(String strPaymentMethodType,JSONObject objJSON_GoAir_DummyBankingDetails_All){
    	
		boolean bGoAir_ThisElementValidationStatus 		= true;
		
		JSONObject objJSON_GoAir_dummyBankDetails_SBI_Bank					= objJSON_GoAir_DummyBankingDetails_All.getJSONObject("SBI Bank");
		JSONObject objJSON_GoAir_DummyBankDetails_Axis_Corporation_Bank 	= objJSON_GoAir_DummyBankingDetails_All.getJSONObject("Axis Corporation Bank");
		JSONObject objJSON_GoAir_DummyBankDetails_ICICI_Bank 				= objJSON_GoAir_DummyBankingDetails_All.getJSONObject("ICICI Bank");
		JSONObject objJSON_GoAir_DummyBankDetails_HDFC_Bank					= objJSON_GoAir_DummyBankingDetails_All.getJSONObject("HDFC Bank");

		if (strPaymentMethodType.contains("Netbanking_type")){

			GoAir_btn_Result5Page_NoVoucher_ConfirmPurchase.click();
			objWait.until(ExpectedConditions.visibilityOf(ThirdPartyGateway_img_Citrus_MainElement_Check));
			JSONObject objJSON_GoAir_DummyNetbankingDetails = null;
			
			strPaymentMethodType 			= strPaymentMethodType.replace("Netbanking_type_top_banks__", "").trim();
			String[]  strAryOfPayMentType 	= ClsGeneralInitTerminateAndOtherUtil.splitThisString(strPaymentMethodType," __ ");
			
			for(String strSinglePaymentType : strAryOfPayMentType ){
					String strBankName = "";
					System.out.println("DEBUG:    Validating following netbanking payment method: " + strSinglePaymentType);
					if(strSinglePaymentType.contains("SBI Bank")){
						System.out.println("DEBUG:    Initiating following method of netbanking: " + "SBI Bank");
						objJSON_GoAir_DummyNetbankingDetails = objJSON_GoAir_dummyBankDetails_SBI_Bank; strBankName = "SBI Bank";}
					if(strSinglePaymentType.contains("Axis Corporate Bank")){
						System.out.println("DEBUG:    Initiating following method of netbanking: " + "Axis Corporate Bank");
						objJSON_GoAir_DummyNetbankingDetails = objJSON_GoAir_DummyBankDetails_Axis_Corporation_Bank; strBankName = "Axis Corporate Bank";}
					if(strSinglePaymentType.contains("ICICI Bank")){
						System.out.println("DEBUG:    Initiating following method of netbanking: " + "ICICI Bank");
						objJSON_GoAir_DummyNetbankingDetails = objJSON_GoAir_DummyBankDetails_ICICI_Bank; strBankName = "ICICI Bank";}
					if(strSinglePaymentType.contains("HDFC Bank")){
						System.out.println("DEBUG:    Initiating following method of netbanking: " + "HDFC Bank");
						objJSON_GoAir_DummyNetbankingDetails = objJSON_GoAir_DummyBankDetails_HDFC_Bank; strBankName = "HDFC Bank";}
						
					ClsPymentHandlerThirdParty.ThirdPartyGateway_Citrus_ValidateNetBankingPayment(
																			strBankName,
																			(WebDriver) this.objWebDriverAbstract,
																			objJSON_GoAir_DummyNetbankingDetails);
					
					// since it is dummy account id, it will fail
					System.out.println("ERROR:    Error occured during this netbanking payment processing type");
					objSoftAssert.fail("ERROR:    Error occured during this netbanking payment processing type");
			}			
		}

		return bGoAir_ThisElementValidationStatus;
	}
    

    
    
    
    
   
	
	
}
