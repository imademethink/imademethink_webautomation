package com.imademethink_webautomation.UtilPayments;

import org.json.JSONObject;

import com.imademethink_webautomation.UtilGeneral.ClsGeneralInitTerminateAndOtherUtil;
import com.imademethink_webautomation.UtilWebDriver.ClsUtilWebDriver;

public class ClsUtilPymentData extends ClsUtilWebDriver{

// ==================================================
	public static class dummyCardDetails_VISA{
		public final static String   	strCardType			= "Visa";
		public final static String   	strCreditCardNumber1= "4012";
		public final static String   	strCreditCardNumber2= "8888";
		public final static String   	strCreditCardNumber3= "8888";
		public final static String   	strCreditCardNumber4= Integer.toString(ClsGeneralInitTerminateAndOtherUtil.getPositiveRandomNumberBetweenRange(1000,9999));
		public final static String   	strCreditCardCVVnumber = Integer.toString(ClsGeneralInitTerminateAndOtherUtil.getPositiveRandomNumberBetweenRange(100,999));	
		public final static String   	strCreditCardNumber	= "4556335841537129";
		public final static String   	strCreditCardNumberExtended	= "4556 3358 4153 7129";
		public final static String   	strExpiryMonth		= "Jan";
		public final static String   	strExpiryMonth_digit= "01";
		public final static String   	strExpiryMonth_Mix 	= "Feb (02)";
		public final static String   	strExpiryYear		= "2019";
		public final static String   	strCardHolderName	= ClsGeneralInitTerminateAndOtherUtil.getRandomFirstName() + " " +  ClsGeneralInitTerminateAndOtherUtil.getRandomSecondName();
		public final static String   	strAddress1		    = "address 1";
		public final static String   	strAddress2		    = "address 2";
		public final static String   	strCity		        = "Los Angeles";
		public final static String   	strStateOrProvince	= "CA";
		public final static String   	strPostalCode		= "90017";
		public final static String   	strCountry			= "United States Of America";
	}
	public static class dummyCardDetails_American_Express{
		public final static String   	strCardType			= "American Express";		// for American Airlines
		public final static String   	strCardType2		= "Amex";					// for GoAir
		public final static String   	strCreditCardNumber	= "377647957052908";
		public final static String   	strCreditCardNumberExtended	= "3776 479570 52908";
		public final static String   	strCreditCardCVVnumber = Integer.toString(ClsGeneralInitTerminateAndOtherUtil.getPositiveRandomNumberBetweenRange(1000,9999));	
		public final static String   	strExpiryMonth		= "Jan";
		public final static String   	strExpiryMonth_digit= "01";
		public final static String   	strExpiryYear		= "2019";
		public final static String   	strExpiryYear_YY	= "19";
		public final static String   	strCardHolderName	= ClsGeneralInitTerminateAndOtherUtil.getRandomFirstName() + " " +  ClsGeneralInitTerminateAndOtherUtil.getRandomSecondName();
		public final static String   	strAddress1		    = "address 1";
		public final static String   	strAddress2		    = "address 2";
		public final static String   	strCity		        = "Los Angeles";
		public final static String   	strStateOrProvince	= "CA";
		public final static String   	strPostalCode		= "90017";
		public final static String   	strCountry			= "United States";
	}
	public static class dummyCardDetails_MasterCard{
		public final static String   	strCardType			= "MasterCard";				// for American Airlines
		public final static String   	strCardType2		= "Master Card";			// for GoAir
		public final static String   	strCreditCardNumber1= "5598";
		public final static String   	strCreditCardNumber2= "2404";
		public final static String   	strCreditCardNumber3= "1324";
		public final static String   	strCreditCardNumber4= Integer.toString(ClsGeneralInitTerminateAndOtherUtil.getPositiveRandomNumberBetweenRange(1000,9999));
		public final static String   	strCreditCardCVVnumber = Integer.toString(ClsGeneralInitTerminateAndOtherUtil.getPositiveRandomNumberBetweenRange(100,999));		
		public final static String   	strCreditCardNumber	= "5125186519599258"; 
		public final static String   	strCreditCardNumberExtended	= "5125 1865 1959 9258"; 
		public final static String   	strExpiryMonth		= "Jan";
		public final static String   	strExpiryMonth_Mix 	= "Feb (02)";		
		public final static String   	strExpiryMonth_digit= "01";
		public final static String   	strExpiryYear		= "2019";
		public final static String   	strCardHolderName	= ClsGeneralInitTerminateAndOtherUtil.getRandomFirstName() + " " +  ClsGeneralInitTerminateAndOtherUtil.getRandomSecondName();
		public final static String   	strAddress1		    = "address 1";
		public final static String   	strAddress2		    = "address 2";
		public final static String   	strCity		        = "Los Angeles";
		public final static String   	strStateOrProvince	= "CA";
		public final static String   	strPostalCode		= "90017";
		public final static String   	strCountry			= "United States Of America";
	}
	public static class dummyCardDetails_Diners_Club{
		public final static String   	strCardType			= "Diners Club";
		public final static String   	strCreditCardNumber	= "36885331175259";
		public final static String   	strCreditCardNumberExtended= "3688 533117 5259";
		public final static String   	strCreditCardCVVnumber = Integer.toString(ClsGeneralInitTerminateAndOtherUtil.getPositiveRandomNumberBetweenRange(100,999));		
		public final static String   	strExpiryMonth		= "Jan";
		public final static String   	strExpiryMonth_digit= "01";
		public final static String   	strExpiryYear		= "2019";
		public final static String   	strCardHolderName	= ClsGeneralInitTerminateAndOtherUtil.getRandomFirstName() + " " +  ClsGeneralInitTerminateAndOtherUtil.getRandomSecondName();
		public final static String   	strAddress1		    = "address 1";
		public final static String   	strAddress2		    = "address 2";
		public final static String   	strCity		        = "Los Angeles";
		public final static String   	strStateOrProvince	= "CA";
		public final static String   	strPostalCode		= "90017";
		public final static String   	strCountry			= "United States Of America";
	}
	public static class dummyCardDetails_JCB{
		public final static String   	strCardType			= "JCB";
		public final static String   	strCreditCardNumber	= "3096391967376940";
		public final static String   	strCreditCardNumberExtended	= "3096 3919 6737 6940";
		public final static String   	strCreditCardCVVnumber = Integer.toString(ClsGeneralInitTerminateAndOtherUtil.getPositiveRandomNumberBetweenRange(100,999));;		
		public final static String   	strExpiryMonth		= "Jan";
		public final static String   	strExpiryMonth_digit= "01";
		public final static String   	strExpiryYear		= "2019";
		public final static String   	strCardHolderName	= ClsGeneralInitTerminateAndOtherUtil.getRandomFirstName() + " " +  ClsGeneralInitTerminateAndOtherUtil.getRandomSecondName();
		public final static String   	strAddress1		    = "address 1";
		public final static String   	strAddress2		    = "address 2";
		public final static String   	strCity		        = "Los Angeles";
		public final static String   	strStateOrProvince	= "CA";
		public final static String   	strPostalCode		= "90017";
		public final static String   	strCountry			= "United States Of America";
	}	
	public static class dummyCardDetails_RuPay{
		public final static String   	strCardType			= "RuPay";				// for RuPay
		public final static String   	strCreditCardNumber	= "6081100000032000";
		public final static String   	strCreditCardNumberExtended	= "6081 1000 0003 2000";
		public final static String   	strCreditCardCVVnumber = Integer.toString(ClsGeneralInitTerminateAndOtherUtil.getPositiveRandomNumberBetweenRange(100,999));		
		public final static String   	strExpiryMonth		= "Jan";
		public final static String   	strExpiryMonth_digit= "01";
		public final static String   	strExpiryYear		= "2019";
		public final static String   	strCardHolderName	= ClsGeneralInitTerminateAndOtherUtil.getRandomFirstName() + " " +  ClsGeneralInitTerminateAndOtherUtil.getRandomSecondName();
	}
	public static class dummyCardDetails_Mastero_Card{
		public final static String   	strCardType			= "Maestro Card";				// for MasterO
		public final static String   	strCreditCardNumber	= "5018529692350389";
		public final static String   	strCreditCardNumberExtended	= "5018 5296 9235 0389";
		public final static String   	strCreditCardCVVnumber = Integer.toString(ClsGeneralInitTerminateAndOtherUtil.getPositiveRandomNumberBetweenRange(100,999));		
		public final static String   	strExpiryMonth		= "Jan";
		public final static String   	strExpiryMonth_digit= "01";
		public final static String   	strExpiryYear		= "2019";
		public final static String   	strCardHolderName	= ClsGeneralInitTerminateAndOtherUtil.getRandomFirstName() + " " +  ClsGeneralInitTerminateAndOtherUtil.getRandomSecondName();
	}
	
	public static class dummyBankingDetails_State_Bank_Of_India{
		public final static String   	strBankName		= "SBI Bank";
		public final static String   	strCustomerId	= "0000";
		public final static String   	strPassword		= "a0b1c2";
	}	
	public static class dummyBankingDetails_Axis_Corporate_Bank{
		public final static String   	strBankName		= "Axis Corporate Bank";
		public final static String   	strCustomerId	= "0000";
		public final static String   	strPassword		= "a0b1c2";
	}	
	public static class dummyBankingDetails_ICICI_Bank{
		public final static String   	strBankName		= "ICICI Bank";
		public final static String   	strCustomerId	= "0000";
		public final static String   	strPassword		= "a0b1c2";
	}	
	public static class dummyBankingDetails_HDFC_Bank{
		public final static String   	strBankName		= "HDFC Bank";
		public final static String   	strCustomerId	= "0000";
		public final static String   	strPassword		= "a0b1c2";
	}	
	
	
	
	


	// =========================================================================================================
	public JSONObject getredBusDummyCardDetails_Visa(){
		JSONObject objJSON_redBus_dummyCardDetails_Visa = new JSONObject();

		objJSON_redBus_dummyCardDetails_Visa.put("CardHolderName",   	dummyCardDetails_VISA.strCardHolderName);
		objJSON_redBus_dummyCardDetails_Visa.put("CreditCardNumber1",   dummyCardDetails_VISA.strCreditCardNumber1);
		objJSON_redBus_dummyCardDetails_Visa.put("CreditCardNumber2",   dummyCardDetails_VISA.strCreditCardNumber2);
		objJSON_redBus_dummyCardDetails_Visa.put("CreditCardNumber3",   dummyCardDetails_VISA.strCreditCardNumber3);
		objJSON_redBus_dummyCardDetails_Visa.put("CreditCardNumber4",   dummyCardDetails_VISA.strCreditCardNumber4);
		objJSON_redBus_dummyCardDetails_Visa.put("CreditCardCVVnumber",	dummyCardDetails_VISA.strCreditCardCVVnumber);
		objJSON_redBus_dummyCardDetails_Visa.put("DebitCardNumber",   	dummyCardDetails_VISA.strCreditCardNumber);
		objJSON_redBus_dummyCardDetails_Visa.put("DebitCardCVVnumber",	dummyCardDetails_VISA.strCreditCardCVVnumber);
		objJSON_redBus_dummyCardDetails_Visa.put("ExpiryMonthMix",   	dummyCardDetails_VISA.strExpiryMonth_Mix);
		objJSON_redBus_dummyCardDetails_Visa.put("ExpiryYear",   		dummyCardDetails_VISA.strExpiryYear);

		return objJSON_redBus_dummyCardDetails_Visa;		
	}
	public JSONObject getredBusDummyCreditCardDetails_Amex(){
		JSONObject objJSON_redBus_DummyCreditCardDetails_Amex = new JSONObject();
		
		objJSON_redBus_DummyCreditCardDetails_Amex.put("CreditCardNumber",   dummyCardDetails_American_Express.strCreditCardNumber);
		objJSON_redBus_DummyCreditCardDetails_Amex.put("ExpiryMonth",  		dummyCardDetails_American_Express.strExpiryMonth);
		objJSON_redBus_DummyCreditCardDetails_Amex.put("ExpiryYear",   		dummyCardDetails_American_Express.strExpiryYear);
		objJSON_redBus_DummyCreditCardDetails_Amex.put("CreditCardCVVnumber",	dummyCardDetails_American_Express.strCreditCardCVVnumber);
		objJSON_redBus_DummyCreditCardDetails_Amex.put("CardHolderName",   	dummyCardDetails_American_Express.strCardHolderName);
		objJSON_redBus_DummyCreditCardDetails_Amex.put("ExpiryMonthDigit",   	dummyCardDetails_American_Express.strExpiryMonth_digit);
		objJSON_redBus_DummyCreditCardDetails_Amex.put("ExpiryYear_YY",   		dummyCardDetails_American_Express.strExpiryYear_YY);		
		

		return objJSON_redBus_DummyCreditCardDetails_Amex;
	}
	public JSONObject getredBusDummyCreditCardDetails_Master_Card(){
		JSONObject objJSON_redBus_DummyCreditCardDetails_Master_Card = new JSONObject();

		objJSON_redBus_DummyCreditCardDetails_Master_Card.put("CardHolderName",   	dummyCardDetails_MasterCard.strCardHolderName);
		objJSON_redBus_DummyCreditCardDetails_Master_Card.put("CreditCardNumber1",	dummyCardDetails_MasterCard.strCreditCardNumber1);
		objJSON_redBus_DummyCreditCardDetails_Master_Card.put("CreditCardNumber2",	dummyCardDetails_MasterCard.strCreditCardNumber2);
		objJSON_redBus_DummyCreditCardDetails_Master_Card.put("CreditCardNumber3",	dummyCardDetails_MasterCard.strCreditCardNumber3);
		objJSON_redBus_DummyCreditCardDetails_Master_Card.put("CreditCardNumber4",	dummyCardDetails_MasterCard.strCreditCardNumber4);
		objJSON_redBus_DummyCreditCardDetails_Master_Card.put("CreditCardCVVnumber",	dummyCardDetails_MasterCard.strCreditCardCVVnumber);
		objJSON_redBus_DummyCreditCardDetails_Master_Card.put("DebitCardNumber",   	dummyCardDetails_MasterCard.strCreditCardNumber);
		objJSON_redBus_DummyCreditCardDetails_Master_Card.put("DebitCardCVVnumber", dummyCardDetails_MasterCard.strCreditCardCVVnumber);		
		objJSON_redBus_DummyCreditCardDetails_Master_Card.put("ExpiryMonth",   		dummyCardDetails_MasterCard.strExpiryMonth);
		objJSON_redBus_DummyCreditCardDetails_Master_Card.put("ExpiryMonthMix",   	dummyCardDetails_MasterCard.strExpiryMonth_Mix);
		objJSON_redBus_DummyCreditCardDetails_Master_Card.put("ExpiryYear",   		dummyCardDetails_MasterCard.strExpiryYear);

		return objJSON_redBus_DummyCreditCardDetails_Master_Card;		
	}
	public JSONObject getredBusDummyDebitCardDetails_RuPay(){
		JSONObject objJSON_redBus_DummyDebitCardDetails_RuPay = new JSONObject();

		objJSON_redBus_DummyDebitCardDetails_RuPay.put("CardHolderName",   		dummyCardDetails_RuPay.strCardHolderName);
		objJSON_redBus_DummyDebitCardDetails_RuPay.put("DebitCardNumber",   	dummyCardDetails_RuPay.strCreditCardNumber);
		objJSON_redBus_DummyDebitCardDetails_RuPay.put("DebitCardCVVnumber", 	dummyCardDetails_RuPay.strCreditCardCVVnumber);		
		objJSON_redBus_DummyDebitCardDetails_RuPay.put("ExpiryMonth",   		dummyCardDetails_RuPay.strExpiryMonth);
		objJSON_redBus_DummyDebitCardDetails_RuPay.put("ExpiryYear",   			dummyCardDetails_RuPay.strExpiryYear);

		return objJSON_redBus_DummyDebitCardDetails_RuPay;		
	}
	public JSONObject getredBusDummyDebitCardDetails_Mastero_Card(){
		JSONObject objJSON_redBus_DummyDebitCardDetails_Maestro_Card = new JSONObject();

		objJSON_redBus_DummyDebitCardDetails_Maestro_Card.put("CardHolderName",   		dummyCardDetails_Mastero_Card.strCardHolderName);
		objJSON_redBus_DummyDebitCardDetails_Maestro_Card.put("DebitCardNumber",   		dummyCardDetails_Mastero_Card.strCreditCardNumber);
		objJSON_redBus_DummyDebitCardDetails_Maestro_Card.put("DebitCardCVVnumber", 	dummyCardDetails_Mastero_Card.strCreditCardCVVnumber);		
		objJSON_redBus_DummyDebitCardDetails_Maestro_Card.put("ExpiryMonth",   			dummyCardDetails_Mastero_Card.strExpiryMonth);
		objJSON_redBus_DummyDebitCardDetails_Maestro_Card.put("ExpiryYear",   			dummyCardDetails_Mastero_Card.strExpiryYear);

		return objJSON_redBus_DummyDebitCardDetails_Maestro_Card;		
	}
	
	public JSONObject getredBusDummyCardDetails_All(){
		JSONObject objJSON_redBus_dummyCardDetails_VISA				= getredBusDummyCardDetails_Visa();
		JSONObject objJSON_redBus_DummyCreditCardDetails_Amex		= getredBusDummyCreditCardDetails_Amex();
		JSONObject objJSON_redBus_DummyCreditCardDetails_Master_Card = getredBusDummyCreditCardDetails_Master_Card();
		JSONObject objJSON_redBus_DummyDebitCardDetails_RuPay 		= getredBusDummyDebitCardDetails_RuPay();
		JSONObject objJSON_redBus_DummyDebitCardDetails_Mastero_Card= getredBusDummyDebitCardDetails_Mastero_Card();
		
		JSONObject objJSON_redBus_DummyCreditCardDetails_All = new JSONObject();
		objJSON_redBus_DummyCreditCardDetails_All.put("Visa", 		objJSON_redBus_dummyCardDetails_VISA);
		objJSON_redBus_DummyCreditCardDetails_All.put("Amex",		objJSON_redBus_DummyCreditCardDetails_Amex);
		objJSON_redBus_DummyCreditCardDetails_All.put("Master Card", objJSON_redBus_DummyCreditCardDetails_Master_Card);
		objJSON_redBus_DummyCreditCardDetails_All.put("RuPay", 		objJSON_redBus_DummyDebitCardDetails_RuPay);
		objJSON_redBus_DummyCreditCardDetails_All.put("Maestro Card", 	objJSON_redBus_DummyDebitCardDetails_Mastero_Card);

		return objJSON_redBus_DummyCreditCardDetails_All;
	}

	
	public JSONObject getredBusDummyBankDetails_SBI_Bank(){
		JSONObject objJSON_redBus_dummyBankDetails_SBI_Bank = new JSONObject();

		objJSON_redBus_dummyBankDetails_SBI_Bank.put("Bank Name",		dummyBankingDetails_State_Bank_Of_India.strBankName);
		objJSON_redBus_dummyBankDetails_SBI_Bank.put("CustomerId",		dummyBankingDetails_State_Bank_Of_India.strCustomerId);
		objJSON_redBus_dummyBankDetails_SBI_Bank.put("Password",		dummyBankingDetails_State_Bank_Of_India.strPassword);

		return objJSON_redBus_dummyBankDetails_SBI_Bank;		
	}
	public JSONObject getredBusDummyBankDetails_Axis_Corporation_Bank(){
		JSONObject objJSON_redBus_dummyBankDetails_Axis_Corporation_Bank = new JSONObject();

		objJSON_redBus_dummyBankDetails_Axis_Corporation_Bank.put("Bank Name",	dummyBankingDetails_Axis_Corporate_Bank.strBankName);
		objJSON_redBus_dummyBankDetails_Axis_Corporation_Bank.put("CustomerId",	dummyBankingDetails_Axis_Corporate_Bank.strCustomerId);
		objJSON_redBus_dummyBankDetails_Axis_Corporation_Bank.put("Password",	dummyBankingDetails_Axis_Corporate_Bank.strPassword);

		return objJSON_redBus_dummyBankDetails_Axis_Corporation_Bank;		
	}
	public JSONObject getredBusDummyBankDetails_ICICI_Bank(){
		JSONObject objJSON_redBus_dummyBankDetails_ICICI_Bank = new JSONObject();

		objJSON_redBus_dummyBankDetails_ICICI_Bank.put("Bank Name",		dummyBankingDetails_ICICI_Bank.strBankName);
		objJSON_redBus_dummyBankDetails_ICICI_Bank.put("CustomerId",	dummyBankingDetails_ICICI_Bank.strCustomerId);
		objJSON_redBus_dummyBankDetails_ICICI_Bank.put("Password",		dummyBankingDetails_ICICI_Bank.strPassword);

		return objJSON_redBus_dummyBankDetails_ICICI_Bank;		
	}
	public JSONObject getredBusDummyBankDetails_HDFC_Bank(){
		JSONObject objJSON_redBus_dummyBankDetails_HDFC_Bank = new JSONObject();

		objJSON_redBus_dummyBankDetails_HDFC_Bank.put("Bank Name",		dummyBankingDetails_HDFC_Bank.strBankName);
		objJSON_redBus_dummyBankDetails_HDFC_Bank.put("CustomerId",		dummyBankingDetails_HDFC_Bank.strCustomerId);
		objJSON_redBus_dummyBankDetails_HDFC_Bank.put("Password",		dummyBankingDetails_HDFC_Bank.strPassword);

		return objJSON_redBus_dummyBankDetails_HDFC_Bank;		
	}
	
	public JSONObject getredBusDummyBankingDetails_All(){
		
		JSONObject objJSON_redBus_dummyBankDetails_SBI_Bank					= getredBusDummyBankDetails_SBI_Bank();
		JSONObject objJSON_redBus_DummyBankDetails_Axis_Corporation_Bank	= getredBusDummyBankDetails_Axis_Corporation_Bank();
		JSONObject objJSON_redBus_DummyBankDetails_ICICI_Bank				= getredBusDummyBankDetails_ICICI_Bank();
		JSONObject objJSON_redBus_DummyBankDetails_HDFC_Bank				= getredBusDummyBankDetails_HDFC_Bank();
		
		JSONObject objJSON_redBus_DummyCreditCardDetails_All = new JSONObject();
		objJSON_redBus_DummyCreditCardDetails_All.put("SBI Bank", 				objJSON_redBus_dummyBankDetails_SBI_Bank);
		objJSON_redBus_DummyCreditCardDetails_All.put("Axis Corporation Bank",	objJSON_redBus_DummyBankDetails_Axis_Corporation_Bank);
		objJSON_redBus_DummyCreditCardDetails_All.put("ICICI Bank", 			objJSON_redBus_DummyBankDetails_ICICI_Bank);
		objJSON_redBus_DummyCreditCardDetails_All.put("HDFC Bank", 				objJSON_redBus_DummyBankDetails_HDFC_Bank);

		return objJSON_redBus_DummyCreditCardDetails_All;
	}

	// =========================================================================================================
	public JSONObject getcleartripDummyCardDetails_Visa(){
		JSONObject objJSON_cleartrip_dummyCardDetails_Visa = new JSONObject();

		objJSON_cleartrip_dummyCardDetails_Visa.put("CardType",				dummyCardDetails_VISA.strCardType);
		objJSON_cleartrip_dummyCardDetails_Visa.put("CreditCardNumber",	dummyCardDetails_VISA.strCreditCardNumber);
		objJSON_cleartrip_dummyCardDetails_Visa.put("CreditCardNumberExtended",	dummyCardDetails_VISA.strCreditCardNumberExtended);
		objJSON_cleartrip_dummyCardDetails_Visa.put("CreditCardCVVnumber",	dummyCardDetails_VISA.strCreditCardCVVnumber);		
		objJSON_cleartrip_dummyCardDetails_Visa.put("DebitCardNumber",	dummyCardDetails_VISA.strCreditCardNumber);
		objJSON_cleartrip_dummyCardDetails_Visa.put("DebitCardNumberExtended",	dummyCardDetails_VISA.strCreditCardNumberExtended);
		objJSON_cleartrip_dummyCardDetails_Visa.put("DebitCardCVVnumber",	dummyCardDetails_VISA.strCreditCardCVVnumber);		
		objJSON_cleartrip_dummyCardDetails_Visa.put("ExpiryMonth_digit",  	dummyCardDetails_VISA.strExpiryMonth_digit);
		objJSON_cleartrip_dummyCardDetails_Visa.put("ExpiryYear",   		dummyCardDetails_VISA.strExpiryYear);
		objJSON_cleartrip_dummyCardDetails_Visa.put("CardHolderName",   	dummyCardDetails_VISA.strCardHolderName);

		return objJSON_cleartrip_dummyCardDetails_Visa;		
	}
	public JSONObject getcleartripDummyCreditCardDetails_Amex(){
		JSONObject objJSON_cleartrip_DummyCreditCardDetails_Amex = new JSONObject();

		objJSON_cleartrip_DummyCreditCardDetails_Amex.put("CardType",			dummyCardDetails_American_Express.strCardType2);
		objJSON_cleartrip_DummyCreditCardDetails_Amex.put("CreditCardNumber",   dummyCardDetails_American_Express.strCreditCardNumber);
		objJSON_cleartrip_DummyCreditCardDetails_Amex.put("CreditCardNumberExtended",   dummyCardDetails_American_Express.strCreditCardNumberExtended);
		objJSON_cleartrip_DummyCreditCardDetails_Amex.put("CreditCardCVVnumber",dummyCardDetails_American_Express.strCreditCardCVVnumber);		
		objJSON_cleartrip_DummyCreditCardDetails_Amex.put("DebitCardNumber",   dummyCardDetails_American_Express.strCreditCardNumber);
		objJSON_cleartrip_DummyCreditCardDetails_Amex.put("DebitCardNumberExtended",   dummyCardDetails_American_Express.strCreditCardNumberExtended);
		objJSON_cleartrip_DummyCreditCardDetails_Amex.put("DebitCardCVVnumber",dummyCardDetails_American_Express.strCreditCardCVVnumber);		
		objJSON_cleartrip_DummyCreditCardDetails_Amex.put("ExpiryMonth_digit",  dummyCardDetails_American_Express.strExpiryMonth_digit);
		objJSON_cleartrip_DummyCreditCardDetails_Amex.put("ExpiryYear",   		dummyCardDetails_American_Express.strExpiryYear);
		objJSON_cleartrip_DummyCreditCardDetails_Amex.put("CardHolderName",   	dummyCardDetails_American_Express.strCardHolderName);
		objJSON_cleartrip_DummyCreditCardDetails_Amex.put("Address1",   		dummyCardDetails_American_Express.strAddress1);
		objJSON_cleartrip_DummyCreditCardDetails_Amex.put("City",   		dummyCardDetails_American_Express.strCity);
		objJSON_cleartrip_DummyCreditCardDetails_Amex.put("State",   		dummyCardDetails_American_Express.strStateOrProvince);
		objJSON_cleartrip_DummyCreditCardDetails_Amex.put("Pin",   			dummyCardDetails_American_Express.strPostalCode);
		objJSON_cleartrip_DummyCreditCardDetails_Amex.put("Country",   		dummyCardDetails_American_Express.strCountry);
		
		return objJSON_cleartrip_DummyCreditCardDetails_Amex;
	}
	public JSONObject getcleartripDummyCreditCardDetails_Master_Card(){
		JSONObject objJSON_cleartrip_DummyCreditCardDetails_Master_Card = new JSONObject();

		objJSON_cleartrip_DummyCreditCardDetails_Master_Card.put("CardType",			dummyCardDetails_MasterCard.strCardType2);
		objJSON_cleartrip_DummyCreditCardDetails_Master_Card.put("CreditCardNumber",   	dummyCardDetails_MasterCard.strCreditCardNumber);
		objJSON_cleartrip_DummyCreditCardDetails_Master_Card.put("CreditCardNumberExtended",   	dummyCardDetails_MasterCard.strCreditCardNumberExtended);
		objJSON_cleartrip_DummyCreditCardDetails_Master_Card.put("CreditCardCVVnumber", dummyCardDetails_MasterCard.strCreditCardCVVnumber);		
		objJSON_cleartrip_DummyCreditCardDetails_Master_Card.put("DebitCardNumber",   	dummyCardDetails_MasterCard.strCreditCardNumber);
		objJSON_cleartrip_DummyCreditCardDetails_Master_Card.put("DebitCardNumberExtended",   	dummyCardDetails_MasterCard.strCreditCardNumberExtended);
		objJSON_cleartrip_DummyCreditCardDetails_Master_Card.put("DebitCardCVVnumber", dummyCardDetails_MasterCard.strCreditCardCVVnumber);		
		objJSON_cleartrip_DummyCreditCardDetails_Master_Card.put("ExpiryMonth_digit",   dummyCardDetails_MasterCard.strExpiryMonth_digit);
		objJSON_cleartrip_DummyCreditCardDetails_Master_Card.put("ExpiryYear",   		dummyCardDetails_MasterCard.strExpiryYear);
		objJSON_cleartrip_DummyCreditCardDetails_Master_Card.put("CardHolderName",   	dummyCardDetails_MasterCard.strCardHolderName);

		return objJSON_cleartrip_DummyCreditCardDetails_Master_Card;		
	}
	public JSONObject getcleartripDummyCreditCardDetails_RuPay(){
		JSONObject objJSON_cleartrip_DummyCreditCardDetails_RuPay = new JSONObject();

		objJSON_cleartrip_DummyCreditCardDetails_RuPay.put("CardType",				dummyCardDetails_RuPay.strCardType);
		objJSON_cleartrip_DummyCreditCardDetails_RuPay.put("CreditCardNumber",   	dummyCardDetails_RuPay.strCreditCardNumber);
		objJSON_cleartrip_DummyCreditCardDetails_RuPay.put("CreditCardNumberExtended",   	dummyCardDetails_RuPay.strCreditCardNumberExtended);
		objJSON_cleartrip_DummyCreditCardDetails_RuPay.put("CreditCardCVVnumber", 	dummyCardDetails_RuPay.strCreditCardCVVnumber);		
		objJSON_cleartrip_DummyCreditCardDetails_RuPay.put("DebitCardNumber",   	dummyCardDetails_RuPay.strCreditCardNumber);
		objJSON_cleartrip_DummyCreditCardDetails_RuPay.put("DebitCardNumberExtended",   	dummyCardDetails_RuPay.strCreditCardNumberExtended);
		objJSON_cleartrip_DummyCreditCardDetails_RuPay.put("DebitCardCVVnumber", 	dummyCardDetails_RuPay.strCreditCardCVVnumber);		
		objJSON_cleartrip_DummyCreditCardDetails_RuPay.put("ExpiryMonth_digit",   	dummyCardDetails_RuPay.strExpiryMonth_digit);
		objJSON_cleartrip_DummyCreditCardDetails_RuPay.put("ExpiryYear",   			dummyCardDetails_RuPay.strExpiryYear);
		objJSON_cleartrip_DummyCreditCardDetails_RuPay.put("CardHolderName",   		dummyCardDetails_RuPay.strCardHolderName);

		return objJSON_cleartrip_DummyCreditCardDetails_RuPay;		
	}
	public JSONObject getcleartripDummyCreditCardDetails_Diners_Club(){
		JSONObject objJSON_cleartrip_DummyCreditCardDetails_Diners_Club = new JSONObject();

		objJSON_cleartrip_DummyCreditCardDetails_Diners_Club.put("CardType",				dummyCardDetails_Diners_Club.strCardType);
		objJSON_cleartrip_DummyCreditCardDetails_Diners_Club.put("CreditCardNumber",   	dummyCardDetails_Diners_Club.strCreditCardNumber);
		objJSON_cleartrip_DummyCreditCardDetails_Diners_Club.put("CreditCardNumberExtended",   	dummyCardDetails_Diners_Club.strCreditCardNumberExtended);
		objJSON_cleartrip_DummyCreditCardDetails_Diners_Club.put("CreditCardCVVnumber", 	dummyCardDetails_Diners_Club.strCreditCardCVVnumber);		
		objJSON_cleartrip_DummyCreditCardDetails_Diners_Club.put("DebitCardNumber",   	dummyCardDetails_Diners_Club.strCreditCardNumber);
		objJSON_cleartrip_DummyCreditCardDetails_Diners_Club.put("DebitCardNumberExtended",   	dummyCardDetails_Diners_Club.strCreditCardNumberExtended);
		objJSON_cleartrip_DummyCreditCardDetails_Diners_Club.put("DebitCardCVVnumber", 	dummyCardDetails_Diners_Club.strCreditCardCVVnumber);		
		objJSON_cleartrip_DummyCreditCardDetails_Diners_Club.put("ExpiryMonth_digit",   	dummyCardDetails_Diners_Club.strExpiryMonth_digit);
		objJSON_cleartrip_DummyCreditCardDetails_Diners_Club.put("ExpiryYear",   			dummyCardDetails_Diners_Club.strExpiryYear);
		objJSON_cleartrip_DummyCreditCardDetails_Diners_Club.put("CardHolderName",   		dummyCardDetails_Diners_Club.strCardHolderName);

		return objJSON_cleartrip_DummyCreditCardDetails_Diners_Club;		
	}
	public JSONObject getcleartripDummyCreditCardDetails_Mastero_Card(){
		JSONObject objJSON_cleartrip_DummyCreditCardDetails_Maestro_Card = new JSONObject();

		objJSON_cleartrip_DummyCreditCardDetails_Maestro_Card.put("CardType",				dummyCardDetails_Mastero_Card.strCardType);
		objJSON_cleartrip_DummyCreditCardDetails_Maestro_Card.put("CreditCardNumber",   	dummyCardDetails_Mastero_Card.strCreditCardNumber);
		objJSON_cleartrip_DummyCreditCardDetails_Maestro_Card.put("CreditCardNumberExtended",   	dummyCardDetails_Mastero_Card.strCreditCardNumberExtended);
		objJSON_cleartrip_DummyCreditCardDetails_Maestro_Card.put("CreditCardCVVnumber", 	dummyCardDetails_Mastero_Card.strCreditCardCVVnumber);		
		objJSON_cleartrip_DummyCreditCardDetails_Maestro_Card.put("DebitCardNumber",   	dummyCardDetails_Mastero_Card.strCreditCardNumber);
		objJSON_cleartrip_DummyCreditCardDetails_Maestro_Card.put("DebitCardNumberExtended",   	dummyCardDetails_Mastero_Card.strCreditCardNumberExtended);
		objJSON_cleartrip_DummyCreditCardDetails_Maestro_Card.put("DebitCardCVVnumber", 	dummyCardDetails_Mastero_Card.strCreditCardCVVnumber);		
		objJSON_cleartrip_DummyCreditCardDetails_Maestro_Card.put("ExpiryMonth_digit",   	dummyCardDetails_Mastero_Card.strExpiryMonth_digit);
		objJSON_cleartrip_DummyCreditCardDetails_Maestro_Card.put("ExpiryYear",   			dummyCardDetails_Mastero_Card.strExpiryYear);
		objJSON_cleartrip_DummyCreditCardDetails_Maestro_Card.put("CardHolderName",   		dummyCardDetails_Mastero_Card.strCardHolderName);

		return objJSON_cleartrip_DummyCreditCardDetails_Maestro_Card;		
	}
	
	public JSONObject getcleartripDummyCardDetails_All(){
		JSONObject objJSON_cleartrip_dummyCardDetails_VISA					= getcleartripDummyCardDetails_Visa();
		JSONObject objJSON_cleartrip_DummyCreditCardDetails_Amex			= getcleartripDummyCreditCardDetails_Amex();
		JSONObject objJSON_cleartrip_DummyCreditCardDetails_Master_Card 	= getcleartripDummyCreditCardDetails_Master_Card();
		JSONObject objJSON_cleartrip_DummyCreditCardDetails_RuPay 			= getcleartripDummyCreditCardDetails_RuPay();
		JSONObject objJSON_cleartrip_DummyCreditCardDetails_Mastero_Card	= getcleartripDummyCreditCardDetails_Mastero_Card();
		JSONObject objJSON_cleartrip_DummyCreditCardDetails_Diners_Club_card= getcleartripDummyCreditCardDetails_Diners_Club();
		
		JSONObject objJSON_cleartrip_DummyCreditCardDetails_All = new JSONObject();
		objJSON_cleartrip_DummyCreditCardDetails_All.put("Visa", 		objJSON_cleartrip_dummyCardDetails_VISA);
		objJSON_cleartrip_DummyCreditCardDetails_All.put("Amex",		objJSON_cleartrip_DummyCreditCardDetails_Amex);
		objJSON_cleartrip_DummyCreditCardDetails_All.put("Master Card", objJSON_cleartrip_DummyCreditCardDetails_Master_Card);
		objJSON_cleartrip_DummyCreditCardDetails_All.put("RuPay", 		objJSON_cleartrip_DummyCreditCardDetails_RuPay);
		objJSON_cleartrip_DummyCreditCardDetails_All.put("Maestro Card",objJSON_cleartrip_DummyCreditCardDetails_Mastero_Card);
		objJSON_cleartrip_DummyCreditCardDetails_All.put("Diners Club", objJSON_cleartrip_DummyCreditCardDetails_Diners_Club_card);

		return objJSON_cleartrip_DummyCreditCardDetails_All;
	}

	
	public JSONObject getcleartripDummyBankDetails_SBI_Bank(){
		JSONObject objJSON_cleartrip_dummyBankDetails_SBI_Bank = new JSONObject();
		
		objJSON_cleartrip_dummyBankDetails_SBI_Bank.put("Bank Name",				dummyBankingDetails_State_Bank_Of_India.strBankName);
		objJSON_cleartrip_dummyBankDetails_SBI_Bank.put("CustomerId",				dummyBankingDetails_State_Bank_Of_India.strCustomerId);
		objJSON_cleartrip_dummyBankDetails_SBI_Bank.put("Password",					dummyBankingDetails_State_Bank_Of_India.strPassword);

		return objJSON_cleartrip_dummyBankDetails_SBI_Bank;		
	}
	public JSONObject getcleartripDummyBankDetails_Axis_Corporation_Bank(){
		JSONObject objJSON_cleartrip_dummyBankDetails_Axis_Corporation_Bank = new JSONObject();

		objJSON_cleartrip_dummyBankDetails_Axis_Corporation_Bank.put("Bank Name",			dummyBankingDetails_Axis_Corporate_Bank.strBankName);
		objJSON_cleartrip_dummyBankDetails_Axis_Corporation_Bank.put("CustomerId",			dummyBankingDetails_Axis_Corporate_Bank.strCustomerId);
		objJSON_cleartrip_dummyBankDetails_Axis_Corporation_Bank.put("Password",			dummyBankingDetails_Axis_Corporate_Bank.strPassword);

		return objJSON_cleartrip_dummyBankDetails_Axis_Corporation_Bank;		
	}
	public JSONObject getcleartripDummyBankDetails_ICICI_Bank(){
		JSONObject objJSON_cleartrip_dummyBankDetails_ICICI_Bank = new JSONObject();

		objJSON_cleartrip_dummyBankDetails_ICICI_Bank.put("Bank Name",				dummyBankingDetails_ICICI_Bank.strBankName);
		objJSON_cleartrip_dummyBankDetails_ICICI_Bank.put("CustomerId",				dummyBankingDetails_ICICI_Bank.strCustomerId);
		objJSON_cleartrip_dummyBankDetails_ICICI_Bank.put("Password",				dummyBankingDetails_ICICI_Bank.strPassword);

		return objJSON_cleartrip_dummyBankDetails_ICICI_Bank;		
	}
	public JSONObject getcleartripDummyBankDetails_HDFC_Bank(){
		JSONObject objJSON_cleartrip_dummyBankDetails_HDFC_Bank = new JSONObject();

		objJSON_cleartrip_dummyBankDetails_HDFC_Bank.put("Bank Name",				dummyBankingDetails_HDFC_Bank.strBankName);
		objJSON_cleartrip_dummyBankDetails_HDFC_Bank.put("CustomerId",				dummyBankingDetails_HDFC_Bank.strCustomerId);
		objJSON_cleartrip_dummyBankDetails_HDFC_Bank.put("Password",				dummyBankingDetails_HDFC_Bank.strPassword);

		return objJSON_cleartrip_dummyBankDetails_HDFC_Bank;		
	}
	
	public JSONObject getcleartripDummyBankingDetails_All(){
		
		JSONObject objJSON_cleartrip_dummyBankDetails_SBI_Bank					= getcleartripDummyBankDetails_SBI_Bank();
		JSONObject objJSON_cleartrip_DummyBankDetails_Axis_Corporation_Bank		= getcleartripDummyBankDetails_Axis_Corporation_Bank();
		JSONObject objJSON_cleartrip_DummyBankDetails_ICICI_Bank				= getcleartripDummyBankDetails_ICICI_Bank();
		JSONObject objJSON_cleartrip_DummyBankDetails_HDFC_Bank					= getcleartripDummyBankDetails_HDFC_Bank();
		
		JSONObject objJSON_cleartrip_DummyCreditCardDetails_All = new JSONObject();
		objJSON_cleartrip_DummyCreditCardDetails_All.put("SBI Bank", 				objJSON_cleartrip_dummyBankDetails_SBI_Bank);
		objJSON_cleartrip_DummyCreditCardDetails_All.put("Axis Corporation Bank",	objJSON_cleartrip_DummyBankDetails_Axis_Corporation_Bank);
		objJSON_cleartrip_DummyCreditCardDetails_All.put("ICICI Bank", 				objJSON_cleartrip_DummyBankDetails_ICICI_Bank);
		objJSON_cleartrip_DummyCreditCardDetails_All.put("HDFC Bank", 				objJSON_cleartrip_DummyBankDetails_HDFC_Bank);

		return objJSON_cleartrip_DummyCreditCardDetails_All;
	}	

	// =========================================================================================================
	public JSONObject getGoAirDummyCardDetails_Visa(){
		JSONObject objJSON_GoAir_dummyCardDetails_Visa = new JSONObject();

		objJSON_GoAir_dummyCardDetails_Visa.put("CardType",				dummyCardDetails_VISA.strCardType);
		objJSON_GoAir_dummyCardDetails_Visa.put("CreditCardNumber",	dummyCardDetails_VISA.strCreditCardNumber);
		objJSON_GoAir_dummyCardDetails_Visa.put("CreditCardNumberExtended",	dummyCardDetails_VISA.strCreditCardNumberExtended);
		objJSON_GoAir_dummyCardDetails_Visa.put("CreditCardCVVnumber",	dummyCardDetails_VISA.strCreditCardCVVnumber);		
		objJSON_GoAir_dummyCardDetails_Visa.put("DebitCardNumber",	dummyCardDetails_VISA.strCreditCardNumber);
		objJSON_GoAir_dummyCardDetails_Visa.put("DebitCardNumberExtended",	dummyCardDetails_VISA.strCreditCardNumberExtended);
		objJSON_GoAir_dummyCardDetails_Visa.put("DebitCardCVVnumber",	dummyCardDetails_VISA.strCreditCardCVVnumber);		
		objJSON_GoAir_dummyCardDetails_Visa.put("ExpiryMonth_digit",  	dummyCardDetails_VISA.strExpiryMonth_digit);
		objJSON_GoAir_dummyCardDetails_Visa.put("ExpiryYear",   		dummyCardDetails_VISA.strExpiryYear);
		objJSON_GoAir_dummyCardDetails_Visa.put("CardHolderName",   	dummyCardDetails_VISA.strCardHolderName);

		return objJSON_GoAir_dummyCardDetails_Visa;		
	}
	public JSONObject getGoAirDummyCreditCardDetails_Amex(){
		JSONObject objJSON_GoAir_DummyCreditCardDetails_Amex = new JSONObject();

		objJSON_GoAir_DummyCreditCardDetails_Amex.put("CardType",			dummyCardDetails_American_Express.strCardType2);
		objJSON_GoAir_DummyCreditCardDetails_Amex.put("CreditCardNumber",   dummyCardDetails_American_Express.strCreditCardNumber);
		objJSON_GoAir_DummyCreditCardDetails_Amex.put("CreditCardNumberExtended",   dummyCardDetails_American_Express.strCreditCardNumberExtended);
		objJSON_GoAir_DummyCreditCardDetails_Amex.put("CreditCardCVVnumber",dummyCardDetails_American_Express.strCreditCardCVVnumber);		
		objJSON_GoAir_DummyCreditCardDetails_Amex.put("DebitCardNumber",   dummyCardDetails_American_Express.strCreditCardNumber);
		objJSON_GoAir_DummyCreditCardDetails_Amex.put("DebitCardNumberExtended",   dummyCardDetails_American_Express.strCreditCardNumberExtended);
		objJSON_GoAir_DummyCreditCardDetails_Amex.put("DebitCardCVVnumber",dummyCardDetails_American_Express.strCreditCardCVVnumber);		
		objJSON_GoAir_DummyCreditCardDetails_Amex.put("ExpiryMonth_digit",  dummyCardDetails_American_Express.strExpiryMonth_digit);
		objJSON_GoAir_DummyCreditCardDetails_Amex.put("ExpiryYear",   		dummyCardDetails_American_Express.strExpiryYear);
		objJSON_GoAir_DummyCreditCardDetails_Amex.put("CardHolderName",   	dummyCardDetails_American_Express.strCardHolderName);

		return objJSON_GoAir_DummyCreditCardDetails_Amex;
	}
	public JSONObject getGoAirDummyCreditCardDetails_Master_Card(){
		JSONObject objJSON_GoAir_DummyCreditCardDetails_Master_Card = new JSONObject();

		objJSON_GoAir_DummyCreditCardDetails_Master_Card.put("CardType",			dummyCardDetails_MasterCard.strCardType2);
		objJSON_GoAir_DummyCreditCardDetails_Master_Card.put("CreditCardNumber",   	dummyCardDetails_MasterCard.strCreditCardNumber);
		objJSON_GoAir_DummyCreditCardDetails_Master_Card.put("CreditCardNumberExtended",   	dummyCardDetails_MasterCard.strCreditCardNumberExtended);
		objJSON_GoAir_DummyCreditCardDetails_Master_Card.put("CreditCardCVVnumber", dummyCardDetails_MasterCard.strCreditCardCVVnumber);		
		objJSON_GoAir_DummyCreditCardDetails_Master_Card.put("DebitCardNumber",   	dummyCardDetails_MasterCard.strCreditCardNumber);
		objJSON_GoAir_DummyCreditCardDetails_Master_Card.put("DebitCardNumberExtended",   	dummyCardDetails_MasterCard.strCreditCardNumberExtended);
		objJSON_GoAir_DummyCreditCardDetails_Master_Card.put("DebitCardCVVnumber", dummyCardDetails_MasterCard.strCreditCardCVVnumber);		
		objJSON_GoAir_DummyCreditCardDetails_Master_Card.put("ExpiryMonth_digit",   dummyCardDetails_MasterCard.strExpiryMonth_digit);
		objJSON_GoAir_DummyCreditCardDetails_Master_Card.put("ExpiryYear",   		dummyCardDetails_MasterCard.strExpiryYear);
		objJSON_GoAir_DummyCreditCardDetails_Master_Card.put("CardHolderName",   	dummyCardDetails_MasterCard.strCardHolderName);

		return objJSON_GoAir_DummyCreditCardDetails_Master_Card;		
	}
	public JSONObject getGoAirDummyCreditCardDetails_RuPay(){
		JSONObject objJSON_GoAir_DummyCreditCardDetails_RuPay = new JSONObject();

		objJSON_GoAir_DummyCreditCardDetails_RuPay.put("CardType",				dummyCardDetails_RuPay.strCardType);
		objJSON_GoAir_DummyCreditCardDetails_RuPay.put("CreditCardNumber",   	dummyCardDetails_RuPay.strCreditCardNumber);
		objJSON_GoAir_DummyCreditCardDetails_RuPay.put("CreditCardNumberExtended",   	dummyCardDetails_RuPay.strCreditCardNumberExtended);
		objJSON_GoAir_DummyCreditCardDetails_RuPay.put("CreditCardCVVnumber", 	dummyCardDetails_RuPay.strCreditCardCVVnumber);		
		objJSON_GoAir_DummyCreditCardDetails_RuPay.put("DebitCardNumber",   	dummyCardDetails_RuPay.strCreditCardNumber);
		objJSON_GoAir_DummyCreditCardDetails_RuPay.put("DebitCardNumberExtended",   	dummyCardDetails_RuPay.strCreditCardNumberExtended);
		objJSON_GoAir_DummyCreditCardDetails_RuPay.put("DebitCardCVVnumber", 	dummyCardDetails_RuPay.strCreditCardCVVnumber);		
		objJSON_GoAir_DummyCreditCardDetails_RuPay.put("ExpiryMonth_digit",   	dummyCardDetails_RuPay.strExpiryMonth_digit);
		objJSON_GoAir_DummyCreditCardDetails_RuPay.put("ExpiryYear",   			dummyCardDetails_RuPay.strExpiryYear);
		objJSON_GoAir_DummyCreditCardDetails_RuPay.put("CardHolderName",   		dummyCardDetails_RuPay.strCardHolderName);

		return objJSON_GoAir_DummyCreditCardDetails_RuPay;		
	}
	public JSONObject getGoAirDummyCreditCardDetails_Mastero_Card(){
		JSONObject objJSON_GoAir_DummyCreditCardDetails_Maestro_Card = new JSONObject();

		objJSON_GoAir_DummyCreditCardDetails_Maestro_Card.put("CardType",				dummyCardDetails_Mastero_Card.strCardType);
		objJSON_GoAir_DummyCreditCardDetails_Maestro_Card.put("CreditCardNumber",   	dummyCardDetails_Mastero_Card.strCreditCardNumber);
		objJSON_GoAir_DummyCreditCardDetails_Maestro_Card.put("CreditCardNumberExtended",   	dummyCardDetails_Mastero_Card.strCreditCardNumberExtended);
		objJSON_GoAir_DummyCreditCardDetails_Maestro_Card.put("CreditCardCVVnumber", 	dummyCardDetails_Mastero_Card.strCreditCardCVVnumber);		
		objJSON_GoAir_DummyCreditCardDetails_Maestro_Card.put("DebitCardNumber",   	dummyCardDetails_Mastero_Card.strCreditCardNumber);
		objJSON_GoAir_DummyCreditCardDetails_Maestro_Card.put("DebitCardNumberExtended",   	dummyCardDetails_Mastero_Card.strCreditCardNumberExtended);
		objJSON_GoAir_DummyCreditCardDetails_Maestro_Card.put("DebitCardCVVnumber", 	dummyCardDetails_Mastero_Card.strCreditCardCVVnumber);		
		objJSON_GoAir_DummyCreditCardDetails_Maestro_Card.put("ExpiryMonth_digit",   	dummyCardDetails_Mastero_Card.strExpiryMonth_digit);
		objJSON_GoAir_DummyCreditCardDetails_Maestro_Card.put("ExpiryYear",   			dummyCardDetails_Mastero_Card.strExpiryYear);
		objJSON_GoAir_DummyCreditCardDetails_Maestro_Card.put("CardHolderName",   		dummyCardDetails_Mastero_Card.strCardHolderName);

		return objJSON_GoAir_DummyCreditCardDetails_Maestro_Card;		
	}
	
	public JSONObject getGoAirDummyCardDetails_All(){
		JSONObject objJSON_GoAir_dummyCardDetails_VISA				= getGoAirDummyCardDetails_Visa();
		JSONObject objJSON_GoAir_DummyCreditCardDetails_Amex		= getGoAirDummyCreditCardDetails_Amex();
		JSONObject objJSON_GoAir_DummyCreditCardDetails_Master_Card = getGoAirDummyCreditCardDetails_Master_Card();
		JSONObject objJSON_GoAir_DummyCreditCardDetails_RuPay 		= getGoAirDummyCreditCardDetails_RuPay();
		JSONObject objJSON_GoAir_DummyCreditCardDetails_Mastero_Card= getGoAirDummyCreditCardDetails_Mastero_Card();
		
		JSONObject objJSON_GoAir_DummyCreditCardDetails_All = new JSONObject();
		objJSON_GoAir_DummyCreditCardDetails_All.put("Visa", 		objJSON_GoAir_dummyCardDetails_VISA);
		objJSON_GoAir_DummyCreditCardDetails_All.put("Amex",		objJSON_GoAir_DummyCreditCardDetails_Amex);
		objJSON_GoAir_DummyCreditCardDetails_All.put("Master Card", objJSON_GoAir_DummyCreditCardDetails_Master_Card);
		objJSON_GoAir_DummyCreditCardDetails_All.put("RuPay", 		objJSON_GoAir_DummyCreditCardDetails_RuPay);
		objJSON_GoAir_DummyCreditCardDetails_All.put("Maestro Card", 	objJSON_GoAir_DummyCreditCardDetails_Mastero_Card);

		return objJSON_GoAir_DummyCreditCardDetails_All;
	}
	
	
	public JSONObject getGoAirDummyBankDetails_SBI_Bank(){
		JSONObject objJSON_GoAir_dummyBankDetails_SBI_Bank = new JSONObject();
		
		objJSON_GoAir_dummyBankDetails_SBI_Bank.put("Bank Name",				dummyBankingDetails_State_Bank_Of_India.strBankName);
		objJSON_GoAir_dummyBankDetails_SBI_Bank.put("CustomerId",				dummyBankingDetails_State_Bank_Of_India.strCustomerId);
		objJSON_GoAir_dummyBankDetails_SBI_Bank.put("Password",					dummyBankingDetails_State_Bank_Of_India.strPassword);

		return objJSON_GoAir_dummyBankDetails_SBI_Bank;		
	}
	public JSONObject getGoAirDummyBankDetails_Axis_Corporation_Bank(){
		JSONObject objJSON_GoAir_dummyBankDetails_Axis_Corporation_Bank = new JSONObject();

		objJSON_GoAir_dummyBankDetails_Axis_Corporation_Bank.put("Bank Name",			dummyBankingDetails_Axis_Corporate_Bank.strBankName);
		objJSON_GoAir_dummyBankDetails_Axis_Corporation_Bank.put("CustomerId",			dummyBankingDetails_Axis_Corporate_Bank.strCustomerId);
		objJSON_GoAir_dummyBankDetails_Axis_Corporation_Bank.put("Password",			dummyBankingDetails_Axis_Corporate_Bank.strPassword);

		return objJSON_GoAir_dummyBankDetails_Axis_Corporation_Bank;		
	}
	public JSONObject getGoAirDummyBankDetails_ICICI_Bank(){
		JSONObject objJSON_GoAir_dummyBankDetails_ICICI_Bank = new JSONObject();

		objJSON_GoAir_dummyBankDetails_ICICI_Bank.put("Bank Name",				dummyBankingDetails_ICICI_Bank.strBankName);
		objJSON_GoAir_dummyBankDetails_ICICI_Bank.put("CustomerId",				dummyBankingDetails_ICICI_Bank.strCustomerId);
		objJSON_GoAir_dummyBankDetails_ICICI_Bank.put("Password",				dummyBankingDetails_ICICI_Bank.strPassword);

		return objJSON_GoAir_dummyBankDetails_ICICI_Bank;		
	}
	public JSONObject getGoAirDummyBankDetails_HDFC_Bank(){
		JSONObject objJSON_GoAir_dummyBankDetails_HDFC_Bank = new JSONObject();

		objJSON_GoAir_dummyBankDetails_HDFC_Bank.put("Bank Name",				dummyBankingDetails_HDFC_Bank.strBankName);
		objJSON_GoAir_dummyBankDetails_HDFC_Bank.put("CustomerId",				dummyBankingDetails_HDFC_Bank.strCustomerId);
		objJSON_GoAir_dummyBankDetails_HDFC_Bank.put("Password",				dummyBankingDetails_HDFC_Bank.strPassword);

		return objJSON_GoAir_dummyBankDetails_HDFC_Bank;		
	}
	
	public JSONObject getGoAirDummyBankingDetails_All(){
		
		JSONObject objJSON_GoAir_dummyBankDetails_SBI_Bank					= getGoAirDummyBankDetails_SBI_Bank();
		JSONObject objJSON_GoAir_DummyBankDetails_Axis_Corporation_Bank		= getGoAirDummyBankDetails_Axis_Corporation_Bank();
		JSONObject objJSON_GoAir_DummyBankDetails_ICICI_Bank				= getGoAirDummyBankDetails_ICICI_Bank();
		JSONObject objJSON_GoAir_DummyBankDetails_HDFC_Bank					= getGoAirDummyBankDetails_HDFC_Bank();
		
		JSONObject objJSON_GoAir_DummyCreditCardDetails_All = new JSONObject();
		objJSON_GoAir_DummyCreditCardDetails_All.put("SBI Bank", 				objJSON_GoAir_dummyBankDetails_SBI_Bank);
		objJSON_GoAir_DummyCreditCardDetails_All.put("Axis Corporation Bank",	objJSON_GoAir_DummyBankDetails_Axis_Corporation_Bank);
		objJSON_GoAir_DummyCreditCardDetails_All.put("ICICI Bank", 				objJSON_GoAir_DummyBankDetails_ICICI_Bank);
		objJSON_GoAir_DummyCreditCardDetails_All.put("HDFC Bank", 				objJSON_GoAir_DummyBankDetails_HDFC_Bank);

		return objJSON_GoAir_DummyCreditCardDetails_All;
	}
	
	// =========================================================================================================	
	public JSONObject getAmericanAirlinesDummyCardDetails_VISA(){
		JSONObject objJSON_AmericanAirlines_dummyCardDetails_VISA = new JSONObject();

		objJSON_AmericanAirlines_dummyCardDetails_VISA.put("CardType",			dummyCardDetails_VISA.strCardType);
		objJSON_AmericanAirlines_dummyCardDetails_VISA.put("CreditCardNumber1",   dummyCardDetails_VISA.strCreditCardNumber1);
		objJSON_AmericanAirlines_dummyCardDetails_VISA.put("CreditCardNumber2",   dummyCardDetails_VISA.strCreditCardNumber2);
		objJSON_AmericanAirlines_dummyCardDetails_VISA.put("CreditCardNumber3",   dummyCardDetails_VISA.strCreditCardNumber3);
		objJSON_AmericanAirlines_dummyCardDetails_VISA.put("CreditCardNumber4",   dummyCardDetails_VISA.strCreditCardNumber4);
		objJSON_AmericanAirlines_dummyCardDetails_VISA.put("CreditCardCVVnumber", dummyCardDetails_VISA.strCreditCardCVVnumber);		
		objJSON_AmericanAirlines_dummyCardDetails_VISA.put("ExpiryMonth",   		dummyCardDetails_VISA.strExpiryMonth);
		objJSON_AmericanAirlines_dummyCardDetails_VISA.put("ExpiryYear",   		dummyCardDetails_VISA.strExpiryYear);
		objJSON_AmericanAirlines_dummyCardDetails_VISA.put("CardHolderName",   	dummyCardDetails_VISA.strCardHolderName);
		objJSON_AmericanAirlines_dummyCardDetails_VISA.put("Address1",   			dummyCardDetails_VISA.strAddress1);
		objJSON_AmericanAirlines_dummyCardDetails_VISA.put("Address2",   			dummyCardDetails_VISA.strAddress2);
		objJSON_AmericanAirlines_dummyCardDetails_VISA.put("City",   				dummyCardDetails_VISA.strCity);
		objJSON_AmericanAirlines_dummyCardDetails_VISA.put("StateOrProvince",   	dummyCardDetails_VISA.strStateOrProvince);
		objJSON_AmericanAirlines_dummyCardDetails_VISA.put("PostalCode",   		dummyCardDetails_VISA.strPostalCode);
		objJSON_AmericanAirlines_dummyCardDetails_VISA.put("Country",   			dummyCardDetails_VISA.strCountry);

		return objJSON_AmericanAirlines_dummyCardDetails_VISA;		
	}
	public JSONObject getAmericanAirlinesdummyCardDetails_American_Express(){
		JSONObject objJSON_AmericanAirlines_dummyCardDetails_American_Express = new JSONObject();

		objJSON_AmericanAirlines_dummyCardDetails_American_Express.put("CardType",			dummyCardDetails_American_Express.strCardType);
		objJSON_AmericanAirlines_dummyCardDetails_American_Express.put("CreditCardNumber",   	dummyCardDetails_American_Express.strCreditCardNumber);
		objJSON_AmericanAirlines_dummyCardDetails_American_Express.put("CreditCardCVVnumber", dummyCardDetails_American_Express.strCreditCardCVVnumber);		
		objJSON_AmericanAirlines_dummyCardDetails_American_Express.put("ExpiryMonth",   		dummyCardDetails_American_Express.strExpiryMonth);
		objJSON_AmericanAirlines_dummyCardDetails_American_Express.put("ExpiryYear",   		dummyCardDetails_American_Express.strExpiryYear);
		objJSON_AmericanAirlines_dummyCardDetails_American_Express.put("CardHolderName",   	dummyCardDetails_American_Express.strCardHolderName);
		objJSON_AmericanAirlines_dummyCardDetails_American_Express.put("Address1",   			dummyCardDetails_American_Express.strAddress1);
		objJSON_AmericanAirlines_dummyCardDetails_American_Express.put("Address2",   			dummyCardDetails_American_Express.strAddress2);
		objJSON_AmericanAirlines_dummyCardDetails_American_Express.put("City",   				dummyCardDetails_American_Express.strCity);
		objJSON_AmericanAirlines_dummyCardDetails_American_Express.put("StateOrProvince",   	dummyCardDetails_American_Express.strStateOrProvince);
		objJSON_AmericanAirlines_dummyCardDetails_American_Express.put("PostalCode",   		dummyCardDetails_American_Express.strPostalCode);
		objJSON_AmericanAirlines_dummyCardDetails_American_Express.put("Country",   			dummyCardDetails_American_Express.strCountry);

		return objJSON_AmericanAirlines_dummyCardDetails_American_Express;
	}
	public JSONObject getAmericanAirlinesdummyCardDetails_MasterCard(){
		JSONObject objJSON_AmericanAirlines_dummyCardDetails_MasterCard = new JSONObject();

		objJSON_AmericanAirlines_dummyCardDetails_MasterCard.put("CardType",				dummyCardDetails_MasterCard.strCardType);
		objJSON_AmericanAirlines_dummyCardDetails_MasterCard.put("CreditCardNumber1",   	dummyCardDetails_MasterCard.strCreditCardNumber1);
		objJSON_AmericanAirlines_dummyCardDetails_MasterCard.put("CreditCardNumber2",   	dummyCardDetails_MasterCard.strCreditCardNumber2);
		objJSON_AmericanAirlines_dummyCardDetails_MasterCard.put("CreditCardNumber3",   	dummyCardDetails_MasterCard.strCreditCardNumber3);
		objJSON_AmericanAirlines_dummyCardDetails_MasterCard.put("CreditCardNumber4",   	dummyCardDetails_MasterCard.strCreditCardNumber4);
		objJSON_AmericanAirlines_dummyCardDetails_MasterCard.put("CreditCardCVVnumber", 	dummyCardDetails_MasterCard.strCreditCardCVVnumber);		
		objJSON_AmericanAirlines_dummyCardDetails_MasterCard.put("ExpiryMonth",   		dummyCardDetails_MasterCard.strExpiryMonth);
		objJSON_AmericanAirlines_dummyCardDetails_MasterCard.put("ExpiryYear",   			dummyCardDetails_MasterCard.strExpiryYear);
		objJSON_AmericanAirlines_dummyCardDetails_MasterCard.put("CardHolderName",   		dummyCardDetails_MasterCard.strCardHolderName);
		objJSON_AmericanAirlines_dummyCardDetails_MasterCard.put("Address1",   			dummyCardDetails_MasterCard.strAddress1);
		objJSON_AmericanAirlines_dummyCardDetails_MasterCard.put("Address2",   			dummyCardDetails_MasterCard.strAddress2);
		objJSON_AmericanAirlines_dummyCardDetails_MasterCard.put("City",   				dummyCardDetails_MasterCard.strCity);
		objJSON_AmericanAirlines_dummyCardDetails_MasterCard.put("StateOrProvince",   	dummyCardDetails_MasterCard.strStateOrProvince);
		objJSON_AmericanAirlines_dummyCardDetails_MasterCard.put("PostalCode",   			dummyCardDetails_MasterCard.strPostalCode);
		objJSON_AmericanAirlines_dummyCardDetails_MasterCard.put("Country",   			dummyCardDetails_MasterCard.strCountry);

		return objJSON_AmericanAirlines_dummyCardDetails_MasterCard;		
	}
	public JSONObject getAmericanAirlinesdummyCardDetails_Diners_Club(){
		JSONObject objJSON_AmericanAirlines_dummyCardDetails_Diners_Club = new JSONObject();

		objJSON_AmericanAirlines_dummyCardDetails_Diners_Club.put("CardType",				dummyCardDetails_Diners_Club.strCardType);
		objJSON_AmericanAirlines_dummyCardDetails_Diners_Club.put("CreditCardNumber",   	dummyCardDetails_Diners_Club.strCreditCardNumber);
		objJSON_AmericanAirlines_dummyCardDetails_Diners_Club.put("CreditCardCVVnumber", 	dummyCardDetails_Diners_Club.strCreditCardCVVnumber);		
		objJSON_AmericanAirlines_dummyCardDetails_Diners_Club.put("ExpiryMonth",   		dummyCardDetails_Diners_Club.strExpiryMonth);
		objJSON_AmericanAirlines_dummyCardDetails_Diners_Club.put("ExpiryYear",   		dummyCardDetails_Diners_Club.strExpiryYear);
		objJSON_AmericanAirlines_dummyCardDetails_Diners_Club.put("CardHolderName",   	dummyCardDetails_Diners_Club.strCardHolderName);
		objJSON_AmericanAirlines_dummyCardDetails_Diners_Club.put("Address1",   			dummyCardDetails_Diners_Club.strAddress1);
		objJSON_AmericanAirlines_dummyCardDetails_Diners_Club.put("Address2",   			dummyCardDetails_Diners_Club.strAddress2);
		objJSON_AmericanAirlines_dummyCardDetails_Diners_Club.put("City",   				dummyCardDetails_Diners_Club.strCity);
		objJSON_AmericanAirlines_dummyCardDetails_Diners_Club.put("StateOrProvince",   	dummyCardDetails_Diners_Club.strStateOrProvince);
		objJSON_AmericanAirlines_dummyCardDetails_Diners_Club.put("PostalCode",   		dummyCardDetails_Diners_Club.strPostalCode);
		objJSON_AmericanAirlines_dummyCardDetails_Diners_Club.put("Country",   			dummyCardDetails_Diners_Club.strCountry);

		return objJSON_AmericanAirlines_dummyCardDetails_Diners_Club;
	}
	public JSONObject getAmericanAirlinesdummyCardDetails_JCB(){
		JSONObject objJSON_AmericanAirlines_dummyCardDetails_JCB = new JSONObject();

		objJSON_AmericanAirlines_dummyCardDetails_JCB.put("CardType",				dummyCardDetails_JCB.strCardType);
		objJSON_AmericanAirlines_dummyCardDetails_JCB.put("CreditCardNumber",   	dummyCardDetails_JCB.strCreditCardNumber);
		objJSON_AmericanAirlines_dummyCardDetails_JCB.put("CreditCardCVVnumber", 	dummyCardDetails_JCB.strCreditCardCVVnumber);		
		objJSON_AmericanAirlines_dummyCardDetails_JCB.put("ExpiryMonth",   		dummyCardDetails_JCB.strExpiryMonth);
		objJSON_AmericanAirlines_dummyCardDetails_JCB.put("ExpiryYear",   		dummyCardDetails_JCB.strExpiryYear);
		objJSON_AmericanAirlines_dummyCardDetails_JCB.put("CardHolderName",   	dummyCardDetails_JCB.strCardHolderName);
		objJSON_AmericanAirlines_dummyCardDetails_JCB.put("Address1",   			dummyCardDetails_JCB.strAddress1);
		objJSON_AmericanAirlines_dummyCardDetails_JCB.put("Address2",   			dummyCardDetails_JCB.strAddress2);
		objJSON_AmericanAirlines_dummyCardDetails_JCB.put("City",   				dummyCardDetails_JCB.strCity);
		objJSON_AmericanAirlines_dummyCardDetails_JCB.put("StateOrProvince",   	dummyCardDetails_JCB.strStateOrProvince);
		objJSON_AmericanAirlines_dummyCardDetails_JCB.put("PostalCode",   		dummyCardDetails_JCB.strPostalCode);
		objJSON_AmericanAirlines_dummyCardDetails_JCB.put("Country",   			dummyCardDetails_JCB.strCountry);

		return objJSON_AmericanAirlines_dummyCardDetails_JCB;		
	}

	public JSONObject getAmericanAirlinesDummyCardDetails_All(){
		JSONObject objJSON_AmericanAirlines_dummyCardDetails_VISA				= getAmericanAirlinesDummyCardDetails_VISA();
		JSONObject objJSON_AmericanAirlines_dummyCardDetails_American_Express 	= getAmericanAirlinesdummyCardDetails_American_Express();
		JSONObject objJSON_AmericanAirlines_dummyCardDetails_MasterCard 		= getAmericanAirlinesdummyCardDetails_MasterCard();
		JSONObject objJSON_AmericanAirlines_dummyCardDetails_Diners_Club		= getAmericanAirlinesdummyCardDetails_Diners_Club();
		JSONObject objJSON_AmericanAirlines_dummyCardDetails_JCB 				= getAmericanAirlinesdummyCardDetails_JCB();
		
		JSONObject objJSON_AmericanAirlines_DummyCreditCardDetails_All = new JSONObject();
		objJSON_AmericanAirlines_DummyCreditCardDetails_All.put("VISA", 			objJSON_AmericanAirlines_dummyCardDetails_VISA);
		objJSON_AmericanAirlines_DummyCreditCardDetails_All.put("American Express", objJSON_AmericanAirlines_dummyCardDetails_American_Express);
		objJSON_AmericanAirlines_DummyCreditCardDetails_All.put("MasterCard", 		objJSON_AmericanAirlines_dummyCardDetails_MasterCard);
		objJSON_AmericanAirlines_DummyCreditCardDetails_All.put("Diners Club", 		objJSON_AmericanAirlines_dummyCardDetails_Diners_Club);
		objJSON_AmericanAirlines_DummyCreditCardDetails_All.put("JCB", 				objJSON_AmericanAirlines_dummyCardDetails_JCB);

		return objJSON_AmericanAirlines_DummyCreditCardDetails_All;
	}

	// =========================================================================================================	
	
	
	
}
