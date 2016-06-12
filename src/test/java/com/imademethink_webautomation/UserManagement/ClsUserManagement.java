package com.imademethink_webautomation.UserManagement;

import org.json.JSONObject;

import com.imademethink_webautomation.UtilGeneral.ClsGeneralInitTerminateAndOtherUtil;
import com.imademethink_webautomation.UtilPayments.ClsUtilPymentData;

public class ClsUserManagement extends ClsUtilPymentData{


	//	cleartrip
	// 	rakeshranatktflightcleartrip1@yandex.com / *********
	
	

	// redBus - adult passanger
	public static class redBus_AdultPassangerDetails{
		public final static String 		strArrName 							= ClsGeneralInitTerminateAndOtherUtil.getRandomFirstName() + " " +
															  				  ClsGeneralInitTerminateAndOtherUtil.getRandomSecondName();
		public final static String   	strGender							= "M";
		public final static String 		strArrAge							= ClsGeneralInitTerminateAndOtherUtil.getRandomAge_Adult();
		public final static String 		strArrEmail							= ClsGeneralInitTerminateAndOtherUtil.getRandomEmailId();
		public final static String 		strArrContactPhone					= ClsGeneralInitTerminateAndOtherUtil.getRandomMobileNumber_IN();
		public final static String 		strArrContactPhoneAlternate			= ClsGeneralInitTerminateAndOtherUtil.getRandomMobileNumber_IN();
		public final static String 		strArrAddress						= ClsGeneralInitTerminateAndOtherUtil.getRandomAddress_IN();
		public final static String 		strArrGovtIdValue_DrivingLicence	= ClsGeneralInitTerminateAndOtherUtil.getRandomDrivingLicenceValue_IN();
		public final static String 		strArrAddress2						= ClsGeneralInitTerminateAndOtherUtil.getRandomAddress_IN();
		public final static String 		strArrLandmark						= ClsGeneralInitTerminateAndOtherUtil.getRandomAddress_IN();
		public final static String 		strArrCityName						= "Mumbai";
		public final static String 		strArrAreaName						= "Dombivali";
		public final static String 		strArrPinCode						= "421201";
		public final static String 		strArrPassword						= ClsGeneralInitTerminateAndOtherUtil.getRandomString(8);
	}
	public JSONObject getredBusAdultPassangerDetails(){
		JSONObject objJSON_redBusAdultPassangerDetails = new JSONObject();
		objJSON_redBusAdultPassangerDetails.put("FullName",   						redBus_AdultPassangerDetails.strArrName);
		objJSON_redBusAdultPassangerDetails.put("Gender",   						redBus_AdultPassangerDetails.strGender);
		objJSON_redBusAdultPassangerDetails.put("Age",    							redBus_AdultPassangerDetails.strArrAge);
		objJSON_redBusAdultPassangerDetails.put("Email",   							redBus_AdultPassangerDetails.strArrEmail);
		objJSON_redBusAdultPassangerDetails.put("ContactPhone",						redBus_AdultPassangerDetails.strArrContactPhone);
		objJSON_redBusAdultPassangerDetails.put("ContactPhoneAlternate",			redBus_AdultPassangerDetails.strArrContactPhoneAlternate);
		objJSON_redBusAdultPassangerDetails.put("Address",							redBus_AdultPassangerDetails.strArrAddress);
		objJSON_redBusAdultPassangerDetails.put("GovtIdValue_DrivingLicence",		redBus_AdultPassangerDetails.strArrGovtIdValue_DrivingLicence);
		objJSON_redBusAdultPassangerDetails.put("Address2",							redBus_AdultPassangerDetails.strArrAddress2);
		objJSON_redBusAdultPassangerDetails.put("LandMark",							redBus_AdultPassangerDetails.strArrLandmark);
		objJSON_redBusAdultPassangerDetails.put("CityName",							redBus_AdultPassangerDetails.strArrCityName);
		objJSON_redBusAdultPassangerDetails.put("AreaName",							redBus_AdultPassangerDetails.strArrAreaName);
		objJSON_redBusAdultPassangerDetails.put("Pincode",							redBus_AdultPassangerDetails.strArrPinCode);
		objJSON_redBusAdultPassangerDetails.put("Password",							redBus_AdultPassangerDetails.strArrPassword);
		
		return objJSON_redBusAdultPassangerDetails;		
	}
	
	//=================================================================================================================
	
	// cleartrip - adult passanger
	private static String str_cleartrip_VALIDUserEmail		= "rakeshranatktflightcleartrip1@yandex.com";
	private static String str_cleartrip_VALIDUserPwd		= "iluiluilu";
	
	public static class cleartrip_AdultPassangerDetails{
		public final static String   	strHonorifics		= "Mr";
		public final static String 		strArrFirstName 	= ClsGeneralInitTerminateAndOtherUtil.getRandomFirstName();
		public final static String 		strArrLstName 		= ClsGeneralInitTerminateAndOtherUtil.getRandomSecondName();
		public final static String 		strArrBirthDate		= ClsGeneralInitTerminateAndOtherUtil.getRandomBirthDate();
		public final static String 		strArrBirthMonth	= ClsGeneralInitTerminateAndOtherUtil.getRandomBirthMonth();
		public final static String 		strArrBirthYear		= ClsGeneralInitTerminateAndOtherUtil.getRandomBirthYear_Adult();
		public final static String 		strArrVisaType		= "Business";
		public final static String 		strArrEmail			= ClsGeneralInitTerminateAndOtherUtil.getRandomEmailId();
		public final static String 		strArrEmailConfirm	= strArrEmail;
		public final static String 		strArrContactPhone	= ClsGeneralInitTerminateAndOtherUtil.getRandomMobileNumber_IN();
		public final static String 		strArrPwd			= ClsGeneralInitTerminateAndOtherUtil.getRandomPassword();
		public final static String 		strArrVALIDEmail	= str_cleartrip_VALIDUserEmail;
		public final static String 		strArrVALIDPwd		= str_cleartrip_VALIDUserPwd;
	}
	public JSONObject getcleartripAdultPassangerDetails(){
		JSONObject objJSON_cleartripAdultPassangerDetails = new JSONObject();
		objJSON_cleartripAdultPassangerDetails.put("Honorifics",		cleartrip_AdultPassangerDetails.strHonorifics);
		objJSON_cleartripAdultPassangerDetails.put("FirstName",   		cleartrip_AdultPassangerDetails.strArrFirstName);
		objJSON_cleartripAdultPassangerDetails.put("LastName",    		cleartrip_AdultPassangerDetails.strArrLstName);
		objJSON_cleartripAdultPassangerDetails.put("BirthDate",    		cleartrip_AdultPassangerDetails.strArrBirthDate);
		objJSON_cleartripAdultPassangerDetails.put("BirthMonth",   		cleartrip_AdultPassangerDetails.strArrBirthMonth);
		objJSON_cleartripAdultPassangerDetails.put("BirthYear",   		cleartrip_AdultPassangerDetails.strArrBirthYear);
		objJSON_cleartripAdultPassangerDetails.put("VisaType",   		cleartrip_AdultPassangerDetails.strArrVisaType);
		objJSON_cleartripAdultPassangerDetails.put("Email",   			cleartrip_AdultPassangerDetails.strArrEmail);
		objJSON_cleartripAdultPassangerDetails.put("EmailConfirm",		cleartrip_AdultPassangerDetails.strArrEmailConfirm);
		objJSON_cleartripAdultPassangerDetails.put("ContactPhone",		cleartrip_AdultPassangerDetails.strArrContactPhone);
		objJSON_cleartripAdultPassangerDetails.put("Password",			cleartrip_AdultPassangerDetails.strArrPwd);
		objJSON_cleartripAdultPassangerDetails.put("VALIDEmail",   		cleartrip_AdultPassangerDetails.strArrVALIDEmail);
		objJSON_cleartripAdultPassangerDetails.put("VALIDPassword",		cleartrip_AdultPassangerDetails.strArrVALIDPwd);		
		return objJSON_cleartripAdultPassangerDetails;		
	}

	// cleartrip - infant passanger
	public static class cleartrip_InfantPassangerDetails{
		public final static String 		strArrFirstName 	= ClsGeneralInitTerminateAndOtherUtil.getRandomFirstName();
		public final static String 		strArrLstName 		= ClsGeneralInitTerminateAndOtherUtil.getRandomSecondName();
		public final static String 		strArrBirthDate		= ClsGeneralInitTerminateAndOtherUtil.getRandomBirthDate();
		public final static String 		strArrBirthMonth	= ClsGeneralInitTerminateAndOtherUtil.getRandomBirthMonth();
		public final static String 		strArrBirthYear		= ClsGeneralInitTerminateAndOtherUtil.getRandomBirthYear_Infant();
	}
	public JSONObject getcleartripInfantPassangerDetails(){
		JSONObject objJSON_cleartripInfantPassangerDetails = new JSONObject();
		objJSON_cleartripInfantPassangerDetails.put("FirstName",   		cleartrip_InfantPassangerDetails.strArrFirstName);
		objJSON_cleartripInfantPassangerDetails.put("LastName",    		cleartrip_InfantPassangerDetails.strArrLstName);
		objJSON_cleartripInfantPassangerDetails.put("BirthDate",    	cleartrip_InfantPassangerDetails.strArrBirthDate);
		objJSON_cleartripInfantPassangerDetails.put("BirthMonth",   	cleartrip_InfantPassangerDetails.strArrBirthMonth);
		objJSON_cleartripInfantPassangerDetails.put("BirthYear",   		cleartrip_InfantPassangerDetails.strArrBirthYear);
		return objJSON_cleartripInfantPassangerDetails;		
	}
	
	// cleartrip - child passanger
	public static class cleartrip_ChildPassangerDetails{
		public final static String 		strArrFirstName 	= ClsGeneralInitTerminateAndOtherUtil.getRandomFirstName();
		public final static String 		strArrLstName 		= ClsGeneralInitTerminateAndOtherUtil.getRandomSecondName();
		public final static String 		strArrBirthDate		= ClsGeneralInitTerminateAndOtherUtil.getRandomBirthDate();
		public final static String 		strArrBirthMonth	= ClsGeneralInitTerminateAndOtherUtil.getRandomBirthMonth();
		public final static String 		strArrBirthYear		= ClsGeneralInitTerminateAndOtherUtil.getRandomBirthYear_Child();
	}
	public JSONObject getcleartripChildPassangerDetails(){
		JSONObject objJSON_cleartripChildPassangerDetails = new JSONObject();
		objJSON_cleartripChildPassangerDetails.put("FirstName",   		cleartrip_ChildPassangerDetails.strArrFirstName);
		objJSON_cleartripChildPassangerDetails.put("LastName",    		cleartrip_ChildPassangerDetails.strArrLstName);
		objJSON_cleartripChildPassangerDetails.put("BirthDate",    		cleartrip_ChildPassangerDetails.strArrBirthDate);
		objJSON_cleartripChildPassangerDetails.put("BirthMonth",   		cleartrip_ChildPassangerDetails.strArrBirthMonth);
		objJSON_cleartripChildPassangerDetails.put("BirthYear",   		cleartrip_ChildPassangerDetails.strArrBirthYear);
		return objJSON_cleartripChildPassangerDetails;		
	}
	
	//=================================================================================================================
	
	// GoAir - adult passanger
	public static class GoAir_AdultPassangerDetails{
		public final static String   	strHonorifics		= "Mr";
		public final static String 		strArrFirstName 	= ClsGeneralInitTerminateAndOtherUtil.getRandomFirstName();
		public final static String 		strArrLstName 		= ClsGeneralInitTerminateAndOtherUtil.getRandomSecondName();
		public final static String 		strArrEmail			= ClsGeneralInitTerminateAndOtherUtil.getRandomEmailId();
		public final static String 		strArrEmailConfirm	= strArrEmail;
		public final static String 		strArrContactPhone	= ClsGeneralInitTerminateAndOtherUtil.getRandomMobileNumber_IN();
	}
	public JSONObject getGoAirAdultPassangerDetails(){
		JSONObject objJSON_GoAirAdultPassangerDetails = new JSONObject();
		objJSON_GoAirAdultPassangerDetails.put("Honorifics",		GoAir_AdultPassangerDetails.strHonorifics);
		objJSON_GoAirAdultPassangerDetails.put("FirstName",   		GoAir_AdultPassangerDetails.strArrFirstName);
		objJSON_GoAirAdultPassangerDetails.put("LastName",    		GoAir_AdultPassangerDetails.strArrLstName);
		objJSON_GoAirAdultPassangerDetails.put("Email",   			GoAir_AdultPassangerDetails.strArrEmail);
		objJSON_GoAirAdultPassangerDetails.put("EmailConfirm",		GoAir_AdultPassangerDetails.strArrEmailConfirm);
		objJSON_GoAirAdultPassangerDetails.put("ContactPhone",		GoAir_AdultPassangerDetails.strArrContactPhone);
		return objJSON_GoAirAdultPassangerDetails;		
	}

	// GoAir - infant passanger
	public static class GoAir_InfantPassangerDetails{
		public final static String 		strArrFirstName 	= ClsGeneralInitTerminateAndOtherUtil.getRandomFirstName();
		public final static String 		strArrLstName 		= ClsGeneralInitTerminateAndOtherUtil.getRandomSecondName();
		public final static String 		strArrBirthDate		= ClsGeneralInitTerminateAndOtherUtil.getRandomBirthDate();
		public final static String 		strArrBirthMonth	= ClsGeneralInitTerminateAndOtherUtil.getRandomBirthMonth();
		public final static String 		strArrBirthYear		= ClsGeneralInitTerminateAndOtherUtil.getRandomBirthYear_Infant();
	}
	public JSONObject getGoAirInfantPassangerDetails(){
		JSONObject objJSON_GoAirInfantPassangerDetails = new JSONObject();
		objJSON_GoAirInfantPassangerDetails.put("FirstName",   		GoAir_InfantPassangerDetails.strArrFirstName);
		objJSON_GoAirInfantPassangerDetails.put("LastName",    		GoAir_InfantPassangerDetails.strArrLstName);
		objJSON_GoAirInfantPassangerDetails.put("BirthDate",    	GoAir_InfantPassangerDetails.strArrBirthDate);
		objJSON_GoAirInfantPassangerDetails.put("BirthMonth",   	GoAir_InfantPassangerDetails.strArrBirthMonth);
		objJSON_GoAirInfantPassangerDetails.put("BirthYear",   		GoAir_InfantPassangerDetails.strArrBirthYear);
		return objJSON_GoAirInfantPassangerDetails;		
	}
	
	// GoAir - child passanger
	public static class GoAir_ChildPassangerDetails{
		public final static String 		strArrFirstName 	= ClsGeneralInitTerminateAndOtherUtil.getRandomFirstName();
		public final static String 		strArrLstName 		= ClsGeneralInitTerminateAndOtherUtil.getRandomSecondName();
		public final static String 		strArrBirthDate		= ClsGeneralInitTerminateAndOtherUtil.getRandomBirthDate();
		public final static String 		strArrBirthMonth	= ClsGeneralInitTerminateAndOtherUtil.getRandomBirthMonth();
		public final static String 		strArrBirthYear		= ClsGeneralInitTerminateAndOtherUtil.getRandomBirthYear_Child();
	}
	public JSONObject getGoAirChildPassangerDetails(){
		JSONObject objJSON_GoAirChildPassangerDetails = new JSONObject();
		objJSON_GoAirChildPassangerDetails.put("FirstName",   		GoAir_ChildPassangerDetails.strArrFirstName);
		objJSON_GoAirChildPassangerDetails.put("LastName",    		GoAir_ChildPassangerDetails.strArrLstName);
		objJSON_GoAirChildPassangerDetails.put("BirthDate",    		GoAir_ChildPassangerDetails.strArrBirthDate);
		objJSON_GoAirChildPassangerDetails.put("BirthMonth",   		GoAir_ChildPassangerDetails.strArrBirthMonth);
		objJSON_GoAirChildPassangerDetails.put("BirthYear",   		GoAir_ChildPassangerDetails.strArrBirthYear);
		return objJSON_GoAirChildPassangerDetails;		
	}
	
	//=================================================================================================================
	// AmericanAirlines - adult passanger
	public static class AmericanAirlines_AdultPassangerDetails{
		public final static String   	strHonorifics		= "Mr";
		public final static String   	strGender			= "Male";
		public final static String[] 	strArrFirstName 	= {"Ajay",	"Bijoy", 	"Siva",		"Rana", "Soham"};
		public final static String[] 	strArrLstName 		= {"Mule",	"Dey", 		"Mahadevan","Sing", "Sharma"};
		public final static String[] 	strArrBirthDate		= {"2",		"22", 		"1", 		"27", 	"10"};
		public final static String[] 	strArrBirthMonth	= {"4",		"6", 		"10", 		"2", 	"5"};
		public final static String[] 	strArrBirthYear		= {"1991",	"1981", 	"1985", 	"1990",	"1965"};
		public final static String[] 	strArrEmail			= {"ajay241991mule@yahoo.com","bijoy2261981dey@in.com", "sivamahadevan1101981@gmail.com", "ranasing2721990@vdo.com", "sohan1051965sharma@in.com"};
		public final static String[] 	strArrEmailConfirm	= strArrEmail;
		public final static String   	strPhoneCountryCode	= "IN";
		public final static String[] 	strArrContactPhone	= {"9822012345", "9869012345", "9869012345", "9869012345", "9869012345"};
	}
	public JSONObject getAmericanAirlinesAdultPassangerDetails(int nIndex){
		JSONObject objJSON_AmericanAirlinesAdultPassangerDetails = new JSONObject();
		objJSON_AmericanAirlinesAdultPassangerDetails.put("Honorifics",			AmericanAirlines_AdultPassangerDetails.strHonorifics);
		objJSON_AmericanAirlinesAdultPassangerDetails.put("Gender",    			AmericanAirlines_AdultPassangerDetails.strGender);
		objJSON_AmericanAirlinesAdultPassangerDetails.put("FirstName",   		AmericanAirlines_AdultPassangerDetails.strArrFirstName[nIndex]);
		objJSON_AmericanAirlinesAdultPassangerDetails.put("LastName",    		AmericanAirlines_AdultPassangerDetails.strArrLstName[nIndex]);
		objJSON_AmericanAirlinesAdultPassangerDetails.put("BirthDate",    		AmericanAirlines_AdultPassangerDetails.strArrBirthDate[nIndex]);
		objJSON_AmericanAirlinesAdultPassangerDetails.put("BirthMonth",   		AmericanAirlines_AdultPassangerDetails.strArrBirthMonth[nIndex]);
		objJSON_AmericanAirlinesAdultPassangerDetails.put("BirthYear",   		AmericanAirlines_AdultPassangerDetails.strArrBirthYear[nIndex]);
		objJSON_AmericanAirlinesAdultPassangerDetails.put("Email",   			AmericanAirlines_AdultPassangerDetails.strArrEmail[nIndex]);
		objJSON_AmericanAirlinesAdultPassangerDetails.put("EmailConfirm",		AmericanAirlines_AdultPassangerDetails.strArrEmailConfirm[nIndex]);
		objJSON_AmericanAirlinesAdultPassangerDetails.put("PhoneCountryCode", 	AmericanAirlines_AdultPassangerDetails.strPhoneCountryCode);
		objJSON_AmericanAirlinesAdultPassangerDetails.put("ContactPhone",		AmericanAirlines_AdultPassangerDetails.strArrContactPhone[nIndex]);
		return objJSON_AmericanAirlinesAdultPassangerDetails;		
	}
	
	// AmericanAirlines - infant passanger
	public static class AmericanAirlines_InfantPassangerDetails{
		public final static String   	strGender			= "Male";
		public final static String[] 	strArrFirstName 	= {"Vijay",	"Sujoy", 		"Shivesh",	"Maharana", "Rohan"};
		public final static String[] 	strArrLstName 		= {"Sule",	"Mukharjee", 	"Vasudev",	"Singh", 	"Sharmaji"};
		public final static String[] 	strArrBirthDate		= {"2",		"22", 			"1", 		"27", 		"10"};
		public final static String[] 	strArrBirthMonth	= {"4",		"6", 			"10", 		"2", 		"5"};
		public final static String[] 	strArrBirthYear		= { Integer.toString(-1 + nCurrentYear_YYYY) ,	Integer.toString(-1 + nCurrentYear_YYYY), 	Integer.toString(-1 + nCurrentYear_YYYY), 	Integer.toString(-1 + nCurrentYear_YYYY),	Integer.toString(-1 + nCurrentYear_YYYY)};
	}
	public JSONObject getAmericanAirlinesInfantPassangerDetails(int nIndex){
		JSONObject objJSON_AmericanAirlinesInfantPassangerDetails = new JSONObject();
		objJSON_AmericanAirlinesInfantPassangerDetails.put("Gender",    		AmericanAirlines_InfantPassangerDetails.strGender);
		objJSON_AmericanAirlinesInfantPassangerDetails.put("FirstName",   		AmericanAirlines_InfantPassangerDetails.strArrFirstName[nIndex]);
		objJSON_AmericanAirlinesInfantPassangerDetails.put("LastName",    		AmericanAirlines_InfantPassangerDetails.strArrLstName[nIndex]);
		objJSON_AmericanAirlinesInfantPassangerDetails.put("BirthDate",    		AmericanAirlines_InfantPassangerDetails.strArrBirthDate[nIndex]);
		objJSON_AmericanAirlinesInfantPassangerDetails.put("BirthMonth",   		AmericanAirlines_InfantPassangerDetails.strArrBirthMonth[nIndex]);
		objJSON_AmericanAirlinesInfantPassangerDetails.put("BirthYear",   		AmericanAirlines_InfantPassangerDetails.strArrBirthYear[nIndex]);
		return objJSON_AmericanAirlinesInfantPassangerDetails;		
	}
	
	// AmericanAirlines - child passanger
	public static class AmericanAirlines_ChildPassangerDetails{
		public final static String   	strHonorifics		= "Mr";
		public final static String   	strGender			= "Male";
		public final static String[] 	strArrFirstName 	= {"Peter",	"Suma", 	"Rohan",	"Zulelal", 	"Manoj"};
		public final static String[] 	strArrLstName 		= {"Reddy",	"Roses", 	"Kasliwal",	"Yadav", 	"Raina"};
		public final static String[] 	strArrBirthDate		= {"2",		"22", 		"1", 		"27", 		"20"};
		public final static String[] 	strArrBirthMonth	= {"5",		"10", 		"1", 		"5", 		"9"};
		public final static String[] 	strArrBirthYear		= { Integer.toString(-9 + nCurrentYear_YYYY) ,	Integer.toString(-8 + nCurrentYear_YYYY), 	Integer.toString(-8 + nCurrentYear_YYYY), 	Integer.toString(-7 + nCurrentYear_YYYY),	Integer.toString(-8 + nCurrentYear_YYYY)};
	}
	public JSONObject getAmericanAirlinesChildPassangerDetails(int nIndex){
		JSONObject objJSON_AmericanAirlinesChildPassangerDetails = new JSONObject();
		objJSON_AmericanAirlinesChildPassangerDetails.put("Honorifics",			AmericanAirlines_ChildPassangerDetails.strHonorifics);
		objJSON_AmericanAirlinesChildPassangerDetails.put("Gender",    			AmericanAirlines_ChildPassangerDetails.strGender);
		objJSON_AmericanAirlinesChildPassangerDetails.put("FirstName",   		AmericanAirlines_ChildPassangerDetails.strArrFirstName[nIndex]);
		objJSON_AmericanAirlinesChildPassangerDetails.put("LastName",    		AmericanAirlines_ChildPassangerDetails.strArrLstName[nIndex]);
		objJSON_AmericanAirlinesChildPassangerDetails.put("BirthDate",    		AmericanAirlines_ChildPassangerDetails.strArrBirthDate[nIndex]);
		objJSON_AmericanAirlinesChildPassangerDetails.put("BirthMonth",   		AmericanAirlines_ChildPassangerDetails.strArrBirthMonth[nIndex]);
		objJSON_AmericanAirlinesChildPassangerDetails.put("BirthYear",   		AmericanAirlines_ChildPassangerDetails.strArrBirthYear[nIndex]);
		return objJSON_AmericanAirlinesChildPassangerDetails;		
	}
	
	
	
	
}




