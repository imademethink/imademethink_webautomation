package com.imademethink_webautomation.pkgTktTravel_cleartrip;

import org.json.JSONObject;

import com.imademethink_webautomation.UserManagement.ClsUserManagement;
import com.imademethink_webautomation.UtilGeneral.ClsGeneralInitTerminateAndOtherUtil;
import com.imademethink_webautomation.UtilSocialPlugin.ClsSocialPlugin;

public class clscleartrip extends ClsUserManagement{

	protected static String 			strURLHomePagecleartrip = "http://www.cleartrip.com";
	protected static String 			strURLMobileAppcleartrip= "http://www.cleartrip.com/mobile";
	protected static String 			strHomePageTitle        = "Book Cheap Air Tickets, Domestic Flight Ticket Booking at Lowest Airfare on Cleartrip. ";
	public static boolean 				bcleartrip_SingleScenarioResultStatus 			= false;
	public String 						strHomePageAttributeGlobal     					= "";
	public String 						strAttributeExpectedGlobal     					= "";
	private String[] 					strArrRandomDepaartAndArriveCityNames_Global;
	private JSONObject 					objJSON_cleartripAdultPassangerDetails 			= new JSONObject();
//	private JSONObject 					objJSON_cleartripInfantPassangerDetails			= new JSONObject();
//	private JSONObject 					objJSON_cleartripChildPassangerDetails			= new JSONObject();
	private JSONObject 					objJSON_cleartrip_DummyCreditCardDetails_VISA 	= new JSONObject();
	private JSONObject 					objJSON_cleartrip_DummyCreditCardDetails_All 	= new JSONObject();
	private JSONObject 					objJSON_cleartrip_DummyBankingDetails_All 	  	= new JSONObject();	

	
	public void cleartrip_InitilizeForThisWebsiteSpecificItems() {

		System.out.println("DEBUG:    Initilize cleartrip website specific items");
		strArrRandomDepaartAndArriveCityNames_Global	= getRandomFlightDepartAndArriveCityNames();
		objJSON_cleartripAdultPassangerDetails 			= getcleartripAdultPassangerDetails();
//		objJSON_cleartripInfantPassangerDetails 		= getcleartripInfantPassangerDetails();
//		objJSON_cleartripChildPassangerDetails			= getcleartripChildPassangerDetails();
		objJSON_cleartrip_DummyCreditCardDetails_VISA 	= getcleartripDummyCardDetails_Visa();
		objJSON_cleartrip_DummyCreditCardDetails_All 	= getcleartripDummyCardDetails_All();
		objJSON_cleartrip_DummyBankingDetails_All		= getcleartripDummyBankingDetails_All();
	}
	
	public void cleartrip_TerminateForThisWebsiteSpecificItems() {

		System.out.println("DEBUG:    Terminate cleartrip website specific items");
		objJSON_cleartripAdultPassangerDetails 			= null;
//		objJSON_cleartripInfantPassangerDetails			= null;
//		objJSON_cleartripChildPassangerDetails			= null;
//		objJSON_cleartrip_DummyCreditCardDetails_Visa 	= null;
		objJSON_cleartrip_DummyCreditCardDetails_All  	= null;
		objJSON_cleartrip_DummyBankingDetails_All		= null;
	}

	public void cleartrip_Validate_Home_Page_Attributes(String strHomePageAttribute, String strAttributeExpected){
		
		System.out.println("DEBUG:    Comparing actual and expected attribute for: " + strHomePageAttribute);
		
		strHomePageAttributeGlobal  				= strHomePageAttribute;
		strAttributeExpectedGlobal  				= strAttributeExpected;
		// do not remove below line
		bcleartrip_SingleScenarioResultStatus 		= false;
		
		switch (strHomePageAttribute) {
				case "home page URL":
					if(		cleartrip_Compare_Main_Page_URL_with_Reference_Home_Page_URL(strCurrentPageURL,strAttributeExpected)   )
						bcleartrip_SingleScenarioResultStatus = true;
					break;
				case "home page title":
					if(		cleartrip_Compare_Main_Page_Title_with_Reference_Home_Page_Title(strCurrentPageTitle,strAttributeExpected)    )
						bcleartrip_SingleScenarioResultStatus = true;
					break;
				case "home page loading time":
					if(		cleartrip_Compare_Actual_and_Reference_HomePage_Load_Time()    )
						bcleartrip_SingleScenarioResultStatus = true;
					break;
					
				case "important home page elements":
					if(		cleartrip_Validate_Important_HomePage_Elements(strAttributeExpected)       )
						bcleartrip_SingleScenarioResultStatus = true;
					break;
						
				case "pop up":
					if(		cleartrip_Popup_Handler(strAttributeExpected)       )
						bcleartrip_SingleScenarioResultStatus = true;
					break;
					
				case "sign up":
					if (strAttributeExpected.contains("NA")){
						System.out.println("DEBUG:    Verification of following attribute is NA: " + strAttributeExpected);
						bcleartrip_SingleScenarioResultStatus = true;
					}
					else if ( cleartrip_Validate_SignUp_Link(strAttributeExpected)		       )
						bcleartrip_SingleScenarioResultStatus = true;
					break;
				case "sign in":
					if (strAttributeExpected.contains("NA")){
						System.out.println("DEBUG:    Verification of following attribute is NA: " + strAttributeExpected);
						bcleartrip_SingleScenarioResultStatus = true;
					}
					else if ( cleartrip_Validate_SignIn_Link(strAttributeExpected)		       )
						bcleartrip_SingleScenarioResultStatus = true;
					break;
			
				case "social plugin facebook":
				case "social plugin twitter":
					if(		cleartrip_SocialPluginHandler(strAttributeExpected)       )
						bcleartrip_SingleScenarioResultStatus = true;
					break;
			
				case "home page other web elements":
					if(		cleartrip_Validate_HomePage_Other_WebElements(strAttributeExpected)       )
						bcleartrip_SingleScenarioResultStatus = true;
					break;
											
				case "mobile app download check":
					if(		cleartrip_Validate_MobileApplication_Links(strAttributeExpected)       )
						bcleartrip_SingleScenarioResultStatus = true;
					break;
				default:
					System.out.println("ERROR:    Unsupported attribute to validate: " + strHomePageAttribute);
					objSoftAssert.fail("ERROR:    Unsupported attribute to validate: " + strHomePageAttribute);
					break;
		}
		
	}

	public void cleartrip_Validate_Ticket_Booking_GUI_Options(String strCategoryName, String strExpectedGUIOptionsValue){

		System.out.println("DEBUG:    Comparing actual and expected elements for: " + strCategoryName);
		
		strHomePageAttributeGlobal  				= strCategoryName;
		strAttributeExpectedGlobal  				= strExpectedGUIOptionsValue;
		// do not remove below line
		bcleartrip_SingleScenarioResultStatus 		= false;
		
		switch (strCategoryName) {
			case "List of names under from city":
				bcleartrip_SingleScenarioResultStatus = 
							objPagecleartripMain.cleartrip_Validate_HomePageGUIElements_for_DepartCityNames(strArrDepartCities);
				break;
			case "List of names under to city":
				bcleartrip_SingleScenarioResultStatus = 
							objPagecleartripMain.cleartrip_Validate_HomePageGUIElements_for_ArriveCityNames(strArrArriveCities);
				break;
			case "Common options for person count":
				bcleartrip_SingleScenarioResultStatus = 
							objPagecleartripMain.cleartrip_Validate_HomePageGUIElements_for_CommonOptionsForPersonCount(strExpectedGUIOptionsValue);
				break;
			case "Onward journey date selection":
				bcleartrip_SingleScenarioResultStatus = 
							objPagecleartripMain.cleartrip_Validate_HomePageGUIElements_for_OnwardJourneyDateSelection(strExpectedGUIOptionsValue);
				break;
			case "Return journey date drop down":
				bcleartrip_SingleScenarioResultStatus = 
							objPagecleartripMain.cleartrip_Validate_HomePageGUIElements_for_ReturnJourneyDateDropDown(strExpectedGUIOptionsValue);
				break;
			case "Multicity journey options":
				bcleartrip_SingleScenarioResultStatus = 
							objPagecleartripMain.cleartrip_Validate_HomePageGUIElements_for_MulticityJourneyOptions(strExpectedGUIOptionsValue);
				break;
			case "Flight+Hotel":
				bcleartrip_SingleScenarioResultStatus = 
							objPagecleartripMain.cleartrip_Validate_HomePageGUIElements_for_FlightandHotel_Package(strExpectedGUIOptionsValue);
				break;
			case "Class of travel":
				bcleartrip_SingleScenarioResultStatus = 
							objPagecleartripMain.cleartrip_Validate_HomePageGUIElements_for_ClassofTravel(strExpectedGUIOptionsValue);
				break;
			case "Invalid city name error check":
				bcleartrip_SingleScenarioResultStatus = 
							objPagecleartripMain.cleartrip_Validate_HomePageGUIElements_for_InvalidCityNameErrorCheck(strExpectedGUIOptionsValue);
				break;
			default:
				System.out.println("ERROR:    Unsupported element to validate: " + strCategoryName);
				objSoftAssert.fail("ERROR:    Unsupported element to validate: " + strCategoryName);
				break;
		}

	}
	
	public void cleartrip_Validate_Ticket_Booking_Search_Scenario_Combination(
			String strDepartCityType, String strArriveCityType, String strDateType, String strExpectedSearchResult){

		System.out.println("DEBUG:    Validating ticket booking search scenario for: ");
		System.out.println("DEBUG:     Depart city type: "+ strDepartCityType);
		System.out.println("DEBUG:     Arrive city type: "+ strArriveCityType);
		System.out.println("DEBUG:     Depart date type: "+ strDateType);

		bcleartrip_SingleScenarioResultStatus = objPagecleartripMain.cleartrip_Validate_Ticket_Booking_Search_Scenario_Combination(
				strDepartCityType, strArriveCityType, strDateType, strExpectedSearchResult, strArrRandomDepaartAndArriveCityNames_Global);
	}	

	public void cleartrip_User_Perform_Simple_Valid_Flight_Search_With_Default_Paraeters(){
		
		System.out.println("DEBUG:    User performs simple valid flight search with default paramaters");
		
		bcleartrip_SingleScenarioResultStatus = 
				objPagecleartripMain.cleartrip_Perform_Simple_Valid_Flight_Search_With_Default_Paramaters(strArrRandomDepaartAndArriveCityNames_Global);
		
		if(bcleartrip_SingleScenarioResultStatus){			System.out.println("RESULT::PASS");}
		else{
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Simple valid flight search step failed");
			objSoftAssert.fail("ERROR:    Simple valid flight search step failed");
		}
	}
	
	public void cleartrip_Validate_Basic_Search_Result_Information(String strSearchResultInformationIemsToCheck){

		System.out.println("DEBUG:    User validates basic search result information for: " + strSearchResultInformationIemsToCheck);
		
		// check result of earlier step
		if (! bcleartrip_SingleScenarioResultStatus){
			System.out.println("ERROR:    Simple valid flight search step failed before proceeding for basic search result information check: " + strSearchResultInformationIemsToCheck);
			objSoftAssert.fail("ERROR:    Simple valid flight search step failed before proceeding for basic search result information check: " + strSearchResultInformationIemsToCheck);
			return;
		}

		bcleartrip_SingleScenarioResultStatus = 
				objPagecleartripResult1SelectFlight.cleartrip_Validate_BasicSearchInformation(strSearchResultInformationIemsToCheck);
		
		if(bcleartrip_SingleScenarioResultStatus){			System.out.println("RESULT::PASS");}
		else{
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Basic search result information check failed");
			objSoftAssert.fail("ERROR:    Basic search result information check failed");
		}
	}

	public void cleartrip_User_Validates_End_To_End_Valid_Flight_Search__TYPE3__With_Default_Paameters(String strEndToEndFlightSearchScenario__TYPE3){
		
		strEndToEndFlightSearchScenario__TYPE3 = strEndToEndFlightSearchScenario__TYPE3.split(" ")[0].trim();
		System.out.println("DEBUG:    User validates end to end flight search scenario for: " + strEndToEndFlightSearchScenario__TYPE3);

		// check result of 
		if (! bcleartrip_SingleScenarioResultStatus){
			System.out.println("ERROR:    Simple valid flight search step failed before proceeding for end to end scenario: " + strEndToEndFlightSearchScenario__TYPE3);
			objSoftAssert.fail("ERROR:    Simple valid flight search step failed before proceeding for end to end scenario: " + strEndToEndFlightSearchScenario__TYPE3);
			return;
		}

		switch(strEndToEndFlightSearchScenario__TYPE3){
		case "type_third_01": 
			// type_third_01 Sort results by airlines in ascending order and book the first ticket until payment section
			if (bcleartrip_SingleScenarioResultStatus)
				{bcleartrip_SingleScenarioResultStatus = 
					objPagecleartripResult1SelectFlight.cleartrip_Validate_EndToEnd_Search_Scenario__TYPE3_CASE1();}
			if (bcleartrip_SingleScenarioResultStatus)
				{bcleartrip_SingleScenarioResultStatus = 
					objPagecleartripResult2SimpleSteps.cleartrip_Validate_EndToEnd_Search_Scenario__TYPE3_CASE1(objJSON_cleartripAdultPassangerDetails);}
			if (bcleartrip_SingleScenarioResultStatus)
				{bcleartrip_SingleScenarioResultStatus = 
					objPagecleartripResult3Payment.cleartrip_Validate_EndToEnd_Search_Scenario__TYPE3_CASE1(objJSON_cleartrip_DummyCreditCardDetails_VISA);}
			break;

		case "type_third_02": 
			// type_third_02 Sort results by airlines in descending order and for second result check baggage information
			if (bcleartrip_SingleScenarioResultStatus)
				{bcleartrip_SingleScenarioResultStatus = 
					objPagecleartripResult1SelectFlight.cleartrip_Validate_EndToEnd_Search_Scenario__TYPE3_CASE2();}
			break;
			
		case "type_third_03":
			// type_third_03 Sort results by departure time in ascending order and for last flight check cash back offer
			if (bcleartrip_SingleScenarioResultStatus)
				{bcleartrip_SingleScenarioResultStatus = 
					objPagecleartripResult1SelectFlight.cleartrip_Validate_EndToEnd_Search_Scenario__TYPE3_CASE3();}
			break;

		case "type_third_04":
			// type_third_04 Sort results by departure time in descending order and modify search for maximum adults
			if (bcleartrip_SingleScenarioResultStatus)
				{bcleartrip_SingleScenarioResultStatus = 
					objPagecleartripResult1SelectFlight.cleartrip_Validate_EndToEnd_Search_Scenario__TYPE3_CASE4();}
			break;

		case "type_third_05":
			//  type_third_05 Sort results by arrival time in ascending order and click on calender and select any date in next month calender
			if (bcleartrip_SingleScenarioResultStatus)
				{bcleartrip_SingleScenarioResultStatus = 
					objPagecleartripResult1SelectFlight.cleartrip_Validate_EndToEnd_Search_Scenario__TYPE3_CASE5();}
			break;
			
		case "type_third_06":
			//  type_third_06 Sort results by arrival time in descending order and uncheck all stops tick box
			if (bcleartrip_SingleScenarioResultStatus)
				{bcleartrip_SingleScenarioResultStatus = 
					objPagecleartripResult1SelectFlight.cleartrip_Validate_EndToEnd_Search_Scenario__TYPE3_CASE6();}
			break;
			
		case "type_third_07":
			//  type_third_07 Sort results by duration in ascending order and for third result check cash back offer in detailed view
			if (bcleartrip_SingleScenarioResultStatus)
				{bcleartrip_SingleScenarioResultStatus = 
					objPagecleartripResult1SelectFlight.cleartrip_Validate_EndToEnd_Search_Scenario__TYPE3_CASE7();}
			break;

		case "type_third_08":
			//  type_third_08 Sort results by any three types in ascending order
			if (bcleartrip_SingleScenarioResultStatus)
				{bcleartrip_SingleScenarioResultStatus = 
					objPagecleartripResult1SelectFlight.cleartrip_Validate_EndToEnd_Search_Scenario__TYPE3_CASE8();}
			break;
			
		case "type_third_09":
			//  type_third_09 Sort results by price in descending order and use any two sliders to refine search
			if (bcleartrip_SingleScenarioResultStatus)
				{bcleartrip_SingleScenarioResultStatus = 
					objPagecleartripResult1SelectFlight.cleartrip_Validate_EndToEnd_Search_Scenario__TYPE3_CASE9();}
			break;
		
		case "type_third_10":
			//  type_third_10 Sort results by price in descending order and use any two sliders to refine search
			if (bcleartrip_SingleScenarioResultStatus)
				{bcleartrip_SingleScenarioResultStatus = 
					objPagecleartripResult1SelectFlight.cleartrip_Validate_EndToEnd_Search_Scenario__TYPE3_CASE10();}
			break;

		case "type_third_11":
			//  type_third_11  Sign in and select any search result and book any ticket with any combination until payment section
			if (bcleartrip_SingleScenarioResultStatus)
				{bcleartrip_SingleScenarioResultStatus = 
					cleartrip_Validate_SignIn();}
			if (bcleartrip_SingleScenarioResultStatus)
				{bcleartrip_SingleScenarioResultStatus = 
					objPagecleartripResult1SelectFlight.cleartrip_Validate_EndToEnd_Search_Scenario__TYPE3_CASE11();}
			if (bcleartrip_SingleScenarioResultStatus)
				{bcleartrip_SingleScenarioResultStatus = 
					cleartrip_Validate_SignOut();}
			break;

		default:
			System.out.println("ERROR:    This end to end flight search scenarion case is not supported: " + strEndToEndFlightSearchScenario__TYPE3);
			break;
		}

		if(bcleartrip_SingleScenarioResultStatus){			System.out.println("RESULT::PASS");}
		else{
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    End to end valid flight search TYPE3 failed");
			objSoftAssert.fail("ERROR:    End to end valid flight search TYPE3 failed");
		}
		
	}
	
	public void cleartrip_User_Perform_Simple_Valid_Flight_Search_With_Default_Paraeters_For_One_Way_Flight_Type_Until_Payment_Section(){

		System.out.println("DEBUG:    User performs simple valid flight search with default paramaters for one way flight type until payment section");

		bcleartrip_SingleScenarioResultStatus = 
				objPagecleartripMain.cleartrip_Perform_Simple_Valid_Flight_Search_With_Default_Paramaters(strArrRandomDepaartAndArriveCityNames_Global);

		if (bcleartrip_SingleScenarioResultStatus){
				bcleartrip_SingleScenarioResultStatus =
					objPagecleartripResult1SelectFlight.cleartrip_Validate_EndToEnd_Search_Scenario__Until_Payment_Section();
		}
		if (bcleartrip_SingleScenarioResultStatus){
				bcleartrip_SingleScenarioResultStatus = 	
					objPagecleartripResult2SimpleSteps.cleartrip_Validate_EndToEnd_Search_Scenario__Until_Payment_Section(objJSON_cleartripAdultPassangerDetails);
		}

		if(bcleartrip_SingleScenarioResultStatus){			System.out.println("RESULT::PASS");}
		else{
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Simple valid flight search step failed");
			objSoftAssert.fail("ERROR:    Simple valid flight search step failed");
		}
		
	}
	
	public void cleartrip_User_Initiats_Payment_Method(String strPaymentMethodType){
		
		if( ! bcleartrip_SingleScenarioResultStatus){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Can not initiate payment processing as earlier step failed");
			objSoftAssert.fail("ERROR:    Can not initiate payment processing as earlier step failed");
			return;
		}

		System.out.println("DEBUG:    Initiating following method of payment: " + strPaymentMethodType);

		if (strPaymentMethodType.contains("Credit_card_type__") ){
			bcleartrip_SingleScenarioResultStatus = objPagecleartripResult3Payment.
					cleartrip_Validate_Payment_Methods_CardPayment(strPaymentMethodType, objJSON_cleartrip_DummyCreditCardDetails_All);}
		
		if (strPaymentMethodType.contains("Debit_card_type__") ){
		bcleartrip_SingleScenarioResultStatus = objPagecleartripResult3Payment.
					cleartrip_Validate_Payment_Methods_CardPayment(strPaymentMethodType, objJSON_cleartrip_DummyCreditCardDetails_All);}

		if (strPaymentMethodType.contains("Netbanking_type") ){
			bcleartrip_SingleScenarioResultStatus = objPagecleartripResult3Payment.
					cleartrip_Validate_Payment_Methods_BankTransfer(strPaymentMethodType, objJSON_cleartrip_DummyBankingDetails_All);}
		
		if (bcleartrip_SingleScenarioResultStatus) 		System.out.println("RESULT::PASS");
	    else {
	    		System.out.println("RESULT::FAIL");
	    		System.out.println("ERROR:    Initiating payment processing failed");
	    		objSoftAssert.fail("ERROR:    Initiating payment processing failed");
	    }
		
	}
	
	public void cleartrip_User_Validates_cleartrip_Offers_From_Offes_Section(String strOfferToCheck){
		
		System.out.println("DEBUG:    User validates following offer: " + strOfferToCheck);

		bcleartrip_SingleScenarioResultStatus = 
				objPagecleartripMain.cleartrip_Validate_This_Offer(strOfferToCheck);
		
		if(bcleartrip_SingleScenarioResultStatus){			System.out.println("RESULT::PASS");}
		else{
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Offer validation step failed");
			objSoftAssert.fail("ERROR:    Offer validation step failed");
		}		
	}
	
	public void cleartrip_User_Validates_Support_Functionality_For(String strSupportFunctionality){
		System.out.println("DEBUG:    User validates following support functionality: " + strSupportFunctionality);

		bcleartrip_SingleScenarioResultStatus = 
				objPagecleartripMain.cleartrip_Validate_This_SupportFunctionality(strSupportFunctionality);
		
		if(bcleartrip_SingleScenarioResultStatus){			System.out.println("RESULT::PASS");}
		else{
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Support functionality step step failed");
			objSoftAssert.fail("ERROR:    Support functionality step step failed");
		}
	}
	
	public void cleartrip_User_Validates_User_Management_Case_From(String strUserManagementTest){
		System.out.println("DEBUG:    User validates user management functionality for: " + strUserManagementTest);

		if (strUserManagementTest.contains("Sign_up__"))			
			bcleartrip_SingleScenarioResultStatus = cleartrip_Validate_SignUp();

		if (strUserManagementTest.contains("Sign_in__"))			
			bcleartrip_SingleScenarioResultStatus = cleartrip_Validate_SignIn();

		if (strUserManagementTest.contains("Edit_profile__"))  		
			bcleartrip_SingleScenarioResultStatus = cleartrip_Validate_EditProfile();
		
		if(bcleartrip_SingleScenarioResultStatus){			System.out.println("RESULT::PASS");}
		else{
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    User management functionality step step failed");
			objSoftAssert.fail("ERROR:    User management functionality step step failed");
		}
	}
	
	public void cleartrip_User_Validates_Specific_Other_Items_From(String strSpecificOtherItems){
		
		System.out.println("DEBUG:    User validates following specific other item: " + strSpecificOtherItems);
		strSpecificOtherItems = strSpecificOtherItems.replace("Validate__", "").trim();

		bcleartrip_SingleScenarioResultStatus = 
				objPagecleartrip99General.cleartrip_Validate_Specific_Other_Items(strSpecificOtherItems);
		
		if(bcleartrip_SingleScenarioResultStatus){			System.out.println("RESULT::PASS");}
		else{
    		System.out.println("RESULT::FAIL");
    		System.out.println("ERROR:    Specific other item functionality validation step failed");
    		objSoftAssert.fail("ERROR:    Specific other item functionality validation step failed");
		}
	}
	
	public void cleartrip_User_Navigates_Between_Different_Pages(String strNavigateToThisPage){
	      
		System.out.println("DEBUG:    User navigates to this page: " + strNavigateToThisPage);

		bcleartrip_SingleScenarioResultStatus = 
						objPagecleartripMain.cleartrip_Perform_SimpleActivity_and_NavigateToThisPage(strNavigateToThisPage);

		if (bcleartrip_SingleScenarioResultStatus) 		System.out.println("RESULT::PASS");
	    else {
	    		System.out.println("RESULT::FAIL");
	    		System.out.println("ERROR:    Support functionality validation step failed");
	    		objSoftAssert.fail("ERROR:    Support functionality validation step failed");
	    }		
	}
	
	public void cleartrip_User_Validates_Consistency_of_Common_Web_Elements(String strConsistantElements){

		if( ! bcleartrip_SingleScenarioResultStatus){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Can not validate consistancy of common web element as earlier step failed");
			objSoftAssert.fail("ERROR:    Can not validate consistancy of common web element as earlier step failed");
			return;
		}

		String[]  strAryOfConsistantWebElements = splitThisString(strConsistantElements," __ ");

		for(String strSingleConsistantWebElement : strAryOfConsistantWebElements ){
			System.out.println("DEBUG:    Validating following consistant web element::" + strSingleConsistantWebElement);

			if ( objPagecleartrip99General.cleartrip_validate_This_Element(strSingleConsistantWebElement) ){
				System.out.println("RESULT::PASS");
			}else{
				bcleartrip_SingleScenarioResultStatus = false;
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Validation failed for following consistant web element: " + strSingleConsistantWebElement);
				objSoftAssert.fail("ERROR:    Validation failed for following consistant web element: " + strSingleConsistantWebElement);
			}
		}
	}
	
	public void cleartrip_User_Validates_Home_Page_Other_Attributes(String strHomePageOtherItems,String strHomePageOtherItemsExpectedAttribute){
		System.out.println("DEBUG:    This is unimplemented for now. Coming soon....");
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void cleartrip_Validate_Test_Result(){
		if (bcleartrip_SingleScenarioResultStatus)
			System.out.println("RESULT::OVERALL PASS for current test scenario");	
		else{
			System.out.println("RESULT::OVERALL *****FAIL***** for current test scenario");		
			objSoftAssert.fail("RESULT::OVERALL *****FAIL***** for current test scenario");
			objSoftAssert.assertAll();  }
	}
	
	
	
	
	
	
	
	// Helper methods
	
	// compare main page url with reference home page URL
	public boolean cleartrip_Compare_Main_Page_URL_with_Reference_Home_Page_URL(String strMainPageURL, String strRefHomePageURL){

		boolean bLocalTestResultStatus = false;
		if (checkStringContains(strMainPageURL,strRefHomePageURL)) {
			System.out.println("RESULT::PASS"); bLocalTestResultStatus = true;
		}else{
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Fail - Tested for: " + strHomePageAttributeGlobal);
			System.out.println("ERROR:    Actual attribute details: " + strCurrentPageURL + "===" + strAttributeExpectedGlobal);
			objSoftAssert.fail("ERROR:    Fail - Tested for: " + strHomePageAttributeGlobal);
		}
		return bLocalTestResultStatus;
	}

	// compare main page title with reference home page title
	public boolean cleartrip_Compare_Main_Page_Title_with_Reference_Home_Page_Title(String strMainPageTitle, String strRefHomePageTitle){

		boolean bLocalTestResultStatus = false;
		if (checkStringContains(strMainPageTitle,strRefHomePageTitle)) {
			System.out.println("RESULT::PASS"); bLocalTestResultStatus = true;
		}else{
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Fail - Tested for: " + strHomePageAttributeGlobal);
			System.out.println("ERROR:    Actual attribute details: " + strCurrentPageTitle + "===" + strAttributeExpectedGlobal);
			objSoftAssert.fail("ERROR:    Fail - Tested for: " + strHomePageAttributeGlobal);
		}
		return bLocalTestResultStatus;
	}

	public boolean cleartrip_Compare_Actual_and_Reference_HomePage_Load_Time(){
		return compare_Actual_and_Reference_HomePage_Load_Time();
	}
	
	public boolean cleartrip_Validate_Important_HomePage_Elements(String strHomePageElementsUnderTest){

		strHomePageElementsUnderTest 	= strHomePageElementsUnderTest.replace("More_button_Options__","");
		String[]  strAryOfWebElements 	= splitThisString(strHomePageElementsUnderTest," __ ");
		boolean bLocalTestResultStatus 	= true;
		
		for(String strSingleWebElement : strAryOfWebElements ){
			System.out.println("DEBUG:    Validating following home page web element::" + strSingleWebElement);

			if ( objPagecleartripMain.cleartrip_validate_This_Element(strSingleWebElement) ){
				System.out.println("RESULT::PASS");
			}else{
				// do not remove below line
				bLocalTestResultStatus = false;
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Validation failed for following web element: " + strSingleWebElement);
				objSoftAssert.fail("ERROR:    Validation failed for following web element: " + strSingleWebElement);
			}
		}
		return bLocalTestResultStatus;
	}
	
	public boolean cleartrip_Validate_SignUp_Link(String strSignUp_Activity){

		return objPagecleartripMain.cleartrip_Validate_SignUp_Link();
	}

	public boolean cleartrip_Validate_SignIn_Link(String strSignIn_Activity){

		return objPagecleartripMain.cleartrip_Validate_SignIn_Link();
	}

	public boolean cleartrip_Validate_SignUp(){

		System.out.println("DEBUG:    Sign up is being validated");

		boolean bLocalTestResultStatus = true;

		if (! objPagecleartripMain.cleartrip_Validate_SignUp("dummy sign up",objJSON_cleartripAdultPassangerDetails)  ){
			bLocalTestResultStatus = false;
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Sign up activity failed");
			objSoftAssert.fail("ERROR:    Sign up activity failed");
		}

		return bLocalTestResultStatus;
	}

	public boolean cleartrip_Validate_SignIn(){
		
		System.out.println("DEBUG:    Sign in is being validated");

		boolean bLocalTestResultStatus = true;
		
		if (! objPagecleartripMain.cleartrip_Validate_SignIn(objJSON_cleartripAdultPassangerDetails)  ){
			bLocalTestResultStatus = false;
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Sign in activity failed");
			objSoftAssert.fail("ERROR:    Sign in activity failed");
		}

		return bLocalTestResultStatus;
	}
	
	public boolean cleartrip_Validate_SignOut(){
		System.out.println("DEBUG:   Sign out is being validated");

		boolean bLocalTestResultStatus = true;
		
		if (! objPagecleartripMain.cleartrip_Validate_SignOut()  ){
			bLocalTestResultStatus = false;
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Sign out activity failed");
			objSoftAssert.fail("ERROR:    Sign out activity failed");
		}

		return bLocalTestResultStatus;
	}	
	
	public boolean cleartrip_Validate_EditProfile(){
		
		System.out.println("DEBUG:    Edit profile is being validated");

		boolean bLocalTestResultStatus = true;
		
		if (! objPagecleartripMain.cleartrip_Validate_EditProfile(objJSON_cleartripAdultPassangerDetails)  ){
			bLocalTestResultStatus = false;
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Edit profile activity failed");
			objSoftAssert.fail("ERROR:    Edit profile activity failed");
		}

		return bLocalTestResultStatus;
	}
	
	public boolean cleartrip_SocialPluginHandler(String strSocialPluginType){
		boolean bLocalTestResultStatus = false;
		
		switch(strSocialPluginType){
		case "social_plugin__ facebook":
			if ( objPagecleartripMain.cleartrip_SocialPlugin_Check_Facebook()    ){
					System.out.println("DEBUG:    Social plugin web element found for Facebook");
					if ( ClsSocialPlugin.social_Plugin_Handler_Facebook(objPropMngr.single_Property_Getter("strSocialPluginActionFacebook"))  )
							{bLocalTestResultStatus = true;}
			}else {
				System.out.println("ERROR:    Social plugin web element NOT found for Facebook");
				objSoftAssert.fail("ERROR:    Social plugin web element NOT found for Facebook");}
			break;
		case "social_plugin__ twitter":
			if ( objPagecleartripMain.cleartrip_SocialPlugin_Check_Twitter()    ){
					System.out.println("DEBUG:    Social plugin web element found for Twitter");
					if ( ClsSocialPlugin.social_Plugin_Handler_Twitter(objPropMngr.single_Property_Getter("strSocialPluginActionTwitter"))    )
							{bLocalTestResultStatus = true;}
			}else {
				System.out.println("ERROR:    Social plugin web element NOT found for Twitter");
				objSoftAssert.fail("ERROR:    Social plugin web element NOT found for Twitter");}
			break;
		case "NA":
		default :
			System.out.println("ERROR:    This social plug in is not supported: " + strSocialPluginType);
			objSoftAssert.fail("ERROR:    This social plug in is not supported: " + strSocialPluginType);
			break;
		}
		return bLocalTestResultStatus;
	}
	
	public boolean cleartrip_Popup_Handler(String strPopupType_and_Action){
		return handle_General_Popup(strPopupType_and_Action);
	}
	
	public boolean cleartrip_Validate_HomePage_Other_WebElements(String strOtherHomePageElementsUnderTest){

		boolean bLocalTestResultStatus = true;
		
		if (strOtherHomePageElementsUnderTest.contains("broken links")){
			if (!check_Broken_Links()){
				bLocalTestResultStatus = false;
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Broken link test failed");
				objSoftAssert.fail("ERROR:    Broken link test failed");}
		}
		if (strOtherHomePageElementsUnderTest.contains("broken images")){
			if (!check_Broken_Images()){
				bLocalTestResultStatus = false;
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Broken images test failed");
				objSoftAssert.fail("ERROR:    Broken images test failed");}
		}
		if (strOtherHomePageElementsUnderTest.contains("all frame title")){
			if (!check_All_Frame_Titles()){
				bLocalTestResultStatus = false;
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Check all frame title test failed");
				objSoftAssert.fail("ERROR:    Check all frame title test failed");}
		}
		
		return bLocalTestResultStatus;
	}

	public boolean cleartrip_Validate_MobileApplication_Links(String strMobileApp_Types){

		boolean bLocalTestResultStatus = true;
		
		if (! ( strMobileApp_Types.contains("ios") ||
		        strMobileApp_Types.contains("android") ||
		        strMobileApp_Types.contains("blackberry") ||
		        strMobileApp_Types.contains("windows"))            ){
					System.out.println("ERROR:    Unsupported mobile application type");
					objSoftAssert.fail("ERROR:    Unsupported mobile application type");	return false; }
		
		if (strMobileApp_Types.contains("ios")){
			if (!cleartrip_Verify_MobileAppWebsite_Navigation_and_Download_Installer(
					strURLMobileAppcleartrip,"ios")){
				bLocalTestResultStatus = false;
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Mobile App webite navigation and download test failed for: " + "ios");
				objSoftAssert.fail("ERROR:    Mobile App webite navigation and download test failed for: " + "ios");}
		}
		if (strMobileApp_Types.contains("android")){
			if (!cleartrip_Verify_MobileAppWebsite_Navigation_and_Download_Installer(
					strURLMobileAppcleartrip,"android")){
				bLocalTestResultStatus = false;
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Mobile App webite navigation and download test failed for: " + "android");
				objSoftAssert.fail("ERROR:    Mobile App webite navigation and download test failed for: " + "android");}
		}
		if (strMobileApp_Types.contains("blackberry")){
			if (!cleartrip_Verify_MobileAppWebsite_Navigation_and_Download_Installer(
					strURLMobileAppcleartrip,"blackberry")){
				bLocalTestResultStatus = false;
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Mobile App webite navigation and download test failed for: " + "blackberry");
				objSoftAssert.fail("ERROR:    Mobile App webite navigation and download test failed for: " + "blackberry");
				}
		}
		if (strMobileApp_Types.contains("windows")){
			if (!cleartrip_Verify_MobileAppWebsite_Navigation_and_Download_Installer(
					strURLMobileAppcleartrip,"windows")){
				bLocalTestResultStatus = false;
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Mobile App webite navigation and download test failed for: " + "windows");
				objSoftAssert.fail("ERROR:    Mobile App webite navigation and download test failed for: " + "windows");}
		}
		
		return bLocalTestResultStatus;
	}
	
	public boolean cleartrip_Compare_Main_Page_Logo_with_Reference_Home_Page_Logo(String strLogoType){
		System.out.println("ERROR:    cleartrip logo is not in any image format so can not be validated");
		objSoftAssert.fail("ERROR:    cleartrip logo is not in any image format so can not be validated");		
		return false;
	}
	

	
	private String[] getRandomFlightDepartAndArriveCityNames(){
		
		String strRandomDepartCityName = strArrDepartCities[ClsGeneralInitTerminateAndOtherUtil.getPositiveRandomNumberBetweenRange(0,strArrDepartCities.length-1)];
		String strRandomArriveCityName = strArrArriveCities[ClsGeneralInitTerminateAndOtherUtil.getPositiveRandomNumberBetweenRange(0,strArrArriveCities.length-1)];
				
		return new String[]{strRandomDepartCityName, strRandomArriveCityName};
	}

	// below list is not complete
	private String [] strArrDepartCities = {
			"Chicago, US - O'Hare (ORD)",
			"Atlanta, US - Hartsfield Jackson (ATL)",
			"Los Angeles, US - Los Angeles (LAX)",
			"Dallas/fort Worth, US - Dallas Ft Worth (DFW)",
			"San Francisco, US - San Francisco (SFO)",
			"Charlotte, US - Charlotte Douglas (CLT)",
			"Phoenix, US - Sky Harbor (PHX)",
			"Houston, US - George Bush Intercontinental (IAH)",
			"Seattle, US - Seattle Tacoma (SEA)",
			"Detroit, US - All airports (DTT)"
	};

	// below list is not complete
	private String [] strArrArriveCities = {
			"Paris, FR - Charles De Gaulle (CDG)",
			"Munich, DE - Munich (MUC)",
			"Berlin, DE - All airports (BER)",
			"Honolulu, US - Honolulu (HNL)",
			"Las Vegas, US - McCarran (LAS)",
			"Venice, IT - Marco Polo (VCE)",
			"Milan, IT - All airports (MIL)",
			"Mumbai, IN - Chatrapati Shivaji Airport (BOM)",
			"New Delhi, IN - Indira Gandhi Airport (DEL)",
			"Hong Kong, CN - Hong Kong (HKG)"
	};
	
	
	
	


}
