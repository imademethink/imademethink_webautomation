package com.imademethink_webautomation.UtilPayments;

import java.util.List;

import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//import java.awt.event.InputEvent;
//import java.awt.event.KeyEvent;

public class ClsPymentHandlerThirdParty {

	static String strSomeJunkElement			= "zzzzzzzzzzzzzz";

	// public elements for each third party payment service provider
	
	// public element for citrus
    @FindBy(css=".merchantBannerImage")
    public static WebElement ThirdPartyGateway_img_Citrus_MainElement;
        
	// private elements for citrus
	@FindBy(css="#systemp_firstName")
	private static WebElement ThirdPartyGateway_txtbox_Citrus_UserFirstName;
	@FindBy(css="#systemp_lastName")
	private static WebElement ThirdPartyGateway_txtbox_Citrus_UserLastName;
	@FindBy(css="#systemp_Email")
	private static WebElement ThirdPartyGateway_txtbox_Citrus_UserEmail;
	@FindBy(css="#systemp_Mobile")
	private static WebElement ThirdPartyGateway_txtbox_Citrus_UserMobileNumber;
	
	@FindBy(css="#CITRUS_WALLET")
	private static WebElement ThirdPartyGateway_tab_Citrus_CitrusWalletSection;
	@FindBy(css="#CREDIT_CARD")
	private static WebElement ThirdPartyGateway_tab_Citrus_CreditCard;
	@FindBy(css="#DEBIT_CARD")
	private static WebElement ThirdPartyGateway_tab_Citrus_DebitCard;
	@FindBy(css="#NET_BANKING")
	private static WebElement ThirdPartyGateway_tab_Citrus_NetBanking;
	
	@FindBy(css="#creditCardNumber")
	private static WebElement ThirdPartyGateway_txtbox_Citrus_CreditCard_CreditCardNumber;
	@FindBy(css="#creditCardExpiryMonth")
	private static WebElement ThirdPartyGateway_drpdwn_Citrus_CreditCard_MonthSelector;
	@FindBy(css="#creditCardExpiryYear")
	private static WebElement ThirdPartyGateway_drpdwn_Citrus_CreditCard_YearSelector;
	@FindBy(css="#creditCardCVV")
	private static WebElement ThirdPartyGateway_txtbox_Citrus_CreditCard_CVV;
	@FindBy(css="#creditCardHolderName")
	private static WebElement ThirdPartyGateway_txtbox_Citrus_CreditCard_CardHolderName;
	@FindBy(css=".creditCradSection>#creditCardDetails>.btnCenter>.pay")
	private static WebElement ThirdPartyGateway_btn_Citrus_CreditCard_PurchaseNow;
	@FindBy(css="#citruCCFailureMsg")
	private static WebElement ThirdPartyGateway_labl_Citrus_CreditCard_FailureMessage;

	@FindBy(css="#debitCardNumber")
	private static WebElement ThirdPartyGateway_txtbox_Citrus_DebitCard_DebitCardNumber;
	@FindBy(css="#debitCardExpiryMonth")
	private static WebElement ThirdPartyGateway_drpdwn_Citrus_DebitCard_MonthSelector;
	@FindBy(css="#debitCardExpiryYear")
	private static WebElement ThirdPartyGateway_drpdwn_Citrus_DebitCard_YearSelector;
	@FindBy(css="#debitCardCVV")
	private static WebElement ThirdPartyGateway_txtbox_Citrus_DebitCard_CVV;
	@FindBy(css="#debitCardHolderName")
	private static WebElement ThirdPartyGateway_txtbox_Citrus_DebitCard_CardHolderName;
	@FindBy(css=".debitCradSection>#debitCardDetails>.btnCenter>.pay")
	private static WebElement ThirdPartyGateway_btn_Citrus_DebitCard_PurchaseNow;

	@FindBy(css="#bank")
	private static WebElement ThirdPartyGateway_drpdwn_NetBanking_BankSelector;
	@FindBy(css=".netBankingSection>.netBankingBtn")
	private static List<WebElement> ThirdPartyGateway_lst_btn_Citrus_NetVanking_PurchaseNow;
	

	
	// make sure all methods in this class are STATIC only
	// make sure all methods in this class are STATIC only
	
	public static boolean ThirdPartyGateway_Citrus_ValidateCreditCardPayment(
										WebDriver objWebDriver,
										JSONObject objJSON_GoAir_DummyCreditCardDetails){

		WebDriverWait objWait 				= new WebDriverWait(objWebDriver, 10);

		objWebDriver.findElement(By.cssSelector("#CREDIT_CARD")).click();
		
		Select Citrus_drpdwn_ExpiryMonth	= new Select(objWebDriver.findElement(By.cssSelector("#creditCardExpiryMonth")));
		Select Citrus_drpdwn_ExpiryYear		= new Select(objWebDriver.findElement(By.cssSelector("#creditCardExpiryYear")));

		objWebDriver.findElement(By.cssSelector("#systemp_Mobile")).sendKeys(Keys.chord(Keys.CONTROL, "a") + Keys.DELETE + "9822012345");
					objWebDriver.findElement(By.cssSelector("#creditCardNumber")).sendKeys( Keys.chord(Keys.CONTROL, "a") +
							objJSON_GoAir_DummyCreditCardDetails.getString("CreditCardNumber").substring(0, 3) );
					objWebDriver.findElement(By.cssSelector("#creditCardNumber")).sendKeys( Keys.chord(Keys.CONTROL, "a") + Keys.RIGHT + 
							objJSON_GoAir_DummyCreditCardDetails.getString("CreditCardNumber").substring(4, 7) );
					objWebDriver.findElement(By.cssSelector("#creditCardNumber")).sendKeys( Keys.chord(Keys.CONTROL, "a") + Keys.RIGHT + 
							objJSON_GoAir_DummyCreditCardDetails.getString("CreditCardNumber").substring(8, 11) );
					objWebDriver.findElement(By.cssSelector("#creditCardNumber")).sendKeys( Keys.chord(Keys.CONTROL, "a") + Keys.RIGHT + 
							objJSON_GoAir_DummyCreditCardDetails.getString("CreditCardNumber").substring(12, 15) );
		Citrus_drpdwn_ExpiryMonth.selectByVisibleText(objJSON_GoAir_DummyCreditCardDetails.getString("ExpiryMonth_digit"));
		Citrus_drpdwn_ExpiryYear.selectByVisibleText(objJSON_GoAir_DummyCreditCardDetails.getString("ExpiryYear"));
					objWebDriver.findElement(By.cssSelector("#creditCardNumber")).sendKeys( Keys.chord(Keys.CONTROL, "a") +
							objJSON_GoAir_DummyCreditCardDetails.getString("CreditCardNumber").substring(0, 3) );
					objWebDriver.findElement(By.cssSelector("#creditCardNumber")).sendKeys( Keys.chord(Keys.CONTROL, "a") + Keys.RIGHT + 
							objJSON_GoAir_DummyCreditCardDetails.getString("CreditCardNumber").substring(4, 7) );
					objWebDriver.findElement(By.cssSelector("#creditCardNumber")).sendKeys( Keys.chord(Keys.CONTROL, "a") + Keys.RIGHT + 
							objJSON_GoAir_DummyCreditCardDetails.getString("CreditCardNumber").substring(8, 11) );
					objWebDriver.findElement(By.cssSelector("#creditCardNumber")).sendKeys( Keys.chord(Keys.CONTROL, "a") + Keys.RIGHT + 
							objJSON_GoAir_DummyCreditCardDetails.getString("CreditCardNumber").substring(12, 15) );
		objWebDriver.findElement(By.cssSelector("#creditCardCVV")).clear();
		objWebDriver.findElement(By.cssSelector("#creditCardCVV")).sendKeys(objJSON_GoAir_DummyCreditCardDetails.getString("CreditCardCVVnumber") );
					objWebDriver.findElement(By.cssSelector("#creditCardNumber")).sendKeys( Keys.chord(Keys.CONTROL, "a") +
							objJSON_GoAir_DummyCreditCardDetails.getString("CreditCardNumber").substring(0, 3) );
					objWebDriver.findElement(By.cssSelector("#creditCardNumber")).sendKeys( Keys.chord(Keys.CONTROL, "a") + Keys.RIGHT + 
							objJSON_GoAir_DummyCreditCardDetails.getString("CreditCardNumber").substring(4, 7) );
					objWebDriver.findElement(By.cssSelector("#creditCardNumber")).sendKeys( Keys.chord(Keys.CONTROL, "a") + Keys.RIGHT + 
							objJSON_GoAir_DummyCreditCardDetails.getString("CreditCardNumber").substring(8, 11) );
					objWebDriver.findElement(By.cssSelector("#creditCardNumber")).sendKeys( Keys.chord(Keys.CONTROL, "a") + Keys.RIGHT + 
							objJSON_GoAir_DummyCreditCardDetails.getString("CreditCardNumber").substring(12, 15) );
		objWebDriver.findElement(By.cssSelector("#creditCardHolderName")).clear();
		objWebDriver.findElement(By.cssSelector("#creditCardHolderName")).sendKeys(objJSON_GoAir_DummyCreditCardDetails.getString("CardHolderName"));
					objWebDriver.findElement(By.cssSelector("#creditCardNumber")).sendKeys( Keys.chord(Keys.CONTROL, "a") +
							objJSON_GoAir_DummyCreditCardDetails.getString("CreditCardNumber").substring(0, 3) );
					objWebDriver.findElement(By.cssSelector("#creditCardNumber")).sendKeys( Keys.chord(Keys.CONTROL, "a") + Keys.RIGHT + 
							objJSON_GoAir_DummyCreditCardDetails.getString("CreditCardNumber").substring(4, 7) );
					objWebDriver.findElement(By.cssSelector("#creditCardNumber")).sendKeys( Keys.chord(Keys.CONTROL, "a") + Keys.RIGHT + 
							objJSON_GoAir_DummyCreditCardDetails.getString("CreditCardNumber").substring(8, 11) );
					objWebDriver.findElement(By.cssSelector("#creditCardNumber")).sendKeys( Keys.chord(Keys.CONTROL, "a") + Keys.RIGHT + 
							objJSON_GoAir_DummyCreditCardDetails.getString("CreditCardNumber").substring(12, 15) );
		objWebDriver.findElement(By.cssSelector(".creditCradSection>#creditCardDetails>.btnCenter>.pay")).click();
		
		objWait.until(ExpectedConditions.visibilityOf(objWebDriver.findElement(By.cssSelector("#creditCardNumber-error"))));

		return false;
	}
	
	public static boolean ThirdPartyGateway_Citrus_ValidateDebitCardPayment(
										WebDriver objWebDriver,
										JSONObject objJSON_GoAir_DummyDebitCardDetails){

		WebDriverWait objWait 				= new WebDriverWait(objWebDriver, 10);

		objWebDriver.findElement(By.cssSelector("#DEBIT_CARD")).click();
		
		Select Citrus_drpdwn_ExpiryMonth	= new Select(objWebDriver.findElement(By.cssSelector("#debitCardExpiryMonth")));
		Select Citrus_drpdwn_ExpiryYear		= new Select(objWebDriver.findElement(By.cssSelector("#debitCardExpiryYear")));

		objWebDriver.findElement(By.cssSelector("#systemp_Mobile")).sendKeys(Keys.chord(Keys.CONTROL, "a") + Keys.DELETE + "9822012345");
					objWebDriver.findElement(By.cssSelector("#debitCardNumber")).sendKeys( Keys.chord(Keys.CONTROL, "a") +
							objJSON_GoAir_DummyDebitCardDetails.getString("DebitCardNumber").substring(0, 3) );
					objWebDriver.findElement(By.cssSelector("#debitCardNumber")).sendKeys( Keys.chord(Keys.CONTROL, "a") + Keys.RIGHT + 
							objJSON_GoAir_DummyDebitCardDetails.getString("DebitCardNumber").substring(4, 7) );
					objWebDriver.findElement(By.cssSelector("#debitCardNumber")).sendKeys( Keys.chord(Keys.CONTROL, "a") + Keys.RIGHT + 
							objJSON_GoAir_DummyDebitCardDetails.getString("DebitCardNumber").substring(8, 11) );
					objWebDriver.findElement(By.cssSelector("#debitCardNumber")).sendKeys( Keys.chord(Keys.CONTROL, "a") + Keys.RIGHT + 
							objJSON_GoAir_DummyDebitCardDetails.getString("DebitCardNumber").substring(12, 15) );
		Citrus_drpdwn_ExpiryMonth.selectByVisibleText(objJSON_GoAir_DummyDebitCardDetails.getString("ExpiryMonth_digit"));
		Citrus_drpdwn_ExpiryYear.selectByVisibleText(objJSON_GoAir_DummyDebitCardDetails.getString("ExpiryYear"));
					objWebDriver.findElement(By.cssSelector("#debitCardNumber")).sendKeys( Keys.chord(Keys.CONTROL, "a") +
							objJSON_GoAir_DummyDebitCardDetails.getString("DebitCardNumber").substring(0, 3) );
					objWebDriver.findElement(By.cssSelector("#debitCardNumber")).sendKeys( Keys.chord(Keys.CONTROL, "a") + Keys.RIGHT + 
							objJSON_GoAir_DummyDebitCardDetails.getString("DebitCardNumber").substring(4, 7) );
					objWebDriver.findElement(By.cssSelector("#debitCardNumber")).sendKeys( Keys.chord(Keys.CONTROL, "a") + Keys.RIGHT + 
							objJSON_GoAir_DummyDebitCardDetails.getString("DebitCardNumber").substring(8, 11) );
					objWebDriver.findElement(By.cssSelector("#debitCardNumber")).sendKeys( Keys.chord(Keys.CONTROL, "a") + Keys.RIGHT + 
							objJSON_GoAir_DummyDebitCardDetails.getString("DebitCardNumber").substring(12, 15) );
		objWebDriver.findElement(By.cssSelector("#debitCardCVV")).clear();
		objWebDriver.findElement(By.cssSelector("#debitCardCVV")).sendKeys(objJSON_GoAir_DummyDebitCardDetails.getString("DebitCardCVVnumber") );
					objWebDriver.findElement(By.cssSelector("#debitCardNumber")).sendKeys( Keys.chord(Keys.CONTROL, "a") +
							objJSON_GoAir_DummyDebitCardDetails.getString("DebitCardNumber").substring(0, 3) );
					objWebDriver.findElement(By.cssSelector("#debitCardNumber")).sendKeys( Keys.chord(Keys.CONTROL, "a") + Keys.RIGHT + 
							objJSON_GoAir_DummyDebitCardDetails.getString("DebitCardNumber").substring(4, 7) );
					objWebDriver.findElement(By.cssSelector("#debitCardNumber")).sendKeys( Keys.chord(Keys.CONTROL, "a") + Keys.RIGHT + 
							objJSON_GoAir_DummyDebitCardDetails.getString("DebitCardNumber").substring(8, 11) );
					objWebDriver.findElement(By.cssSelector("#debitCardNumber")).sendKeys( Keys.chord(Keys.CONTROL, "a") + Keys.RIGHT + 
							objJSON_GoAir_DummyDebitCardDetails.getString("DebitCardNumber").substring(12, 15) );
		objWebDriver.findElement(By.cssSelector("#debitCardHolderName")).clear();
		objWebDriver.findElement(By.cssSelector("#debitCardHolderName")).sendKeys(objJSON_GoAir_DummyDebitCardDetails.getString("CardHolderName"));
					objWebDriver.findElement(By.cssSelector("#debitCardNumber")).sendKeys( Keys.chord(Keys.CONTROL, "a") +
							objJSON_GoAir_DummyDebitCardDetails.getString("DebitCardNumber").substring(0, 3) );
					objWebDriver.findElement(By.cssSelector("#debitCardNumber")).sendKeys( Keys.chord(Keys.CONTROL, "a") + Keys.RIGHT + 
							objJSON_GoAir_DummyDebitCardDetails.getString("DebitCardNumber").substring(4, 7) );
					objWebDriver.findElement(By.cssSelector("#debitCardNumber")).sendKeys( Keys.chord(Keys.CONTROL, "a") + Keys.RIGHT + 
							objJSON_GoAir_DummyDebitCardDetails.getString("DebitCardNumber").substring(8, 11) );
					objWebDriver.findElement(By.cssSelector("#debitCardNumber")).sendKeys( Keys.chord(Keys.CONTROL, "a") + Keys.RIGHT + 
							objJSON_GoAir_DummyDebitCardDetails.getString("DebitCardNumber").substring(12, 15) );
		objWebDriver.findElement(By.cssSelector(".debitCradSection>#debitCardDetails>.btnCenter>.pay")).click();
		
		objWait.until(ExpectedConditions.visibilityOf(objWebDriver.findElement(By.cssSelector("#debitCardNumber-error"))));

		return false;
	}
	
	
	
	public static boolean ThirdPartyGateway_Citrus_ValidateNetBankingPayment(
										String strBankName,
										WebDriver objWebDriver,
										JSONObject objJSON_GoAir_DummyBankDetails){

		WebDriverWait objWait 					= new WebDriverWait(objWebDriver, 10);

		Select Citrus_drpdwn_NetbankingSelector	= new Select(objWebDriver.findElement(By.cssSelector("#bank")));
		
		objWebDriver.findElement(By.cssSelector("#systemp_Mobile")).sendKeys(Keys.chord(Keys.CONTROL, "a") + Keys.DELETE + "9822012345");
		objWebDriver.findElement(By.cssSelector("#NET_BANKING")).click();
		Citrus_drpdwn_NetbankingSelector.selectByVisibleText(strBankName);
		objWebDriver.findElement(By.cssSelector(".netBankingSection>.netBankingBtn")).findElements(By.cssSelector("button[class='pay']")).get(0).click();
		objWait.until(ExpectedConditions.urlContains("http"));

		return false;
	}	
	
	
		
}
