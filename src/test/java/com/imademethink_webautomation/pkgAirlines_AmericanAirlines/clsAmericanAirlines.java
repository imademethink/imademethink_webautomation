package com.imademethink_webautomation.pkgAirlines_AmericanAirlines;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import org.json.JSONObject;

import com.imademethink_webautomation.UserManagement.ClsUserManagement;
import com.imademethink_webautomation.UtilGeneral.ClsGeneralInitTerminateAndOtherUtil;
import com.imademethink_webautomation.UtilSocialPlugin.ClsSocialPlugin;

public class clsAmericanAirlines extends ClsUserManagement{

	protected static String 			strURLHomePageAmericanAirlines = "http://www.americanairlines.in";
	protected static String 			strURLMobileAppAmericanAirlines= "https://www.aa.com/i18n/travelInformation/traveltools/apps.jsp";
	protected static String 			strHomePageTitle               = "Airline Tickets and Airline Reservations from American Airlines";
	public static boolean 				bAmericanAirlines_SingleScenarioResultStatus 			= false;
	public String 						strHomePageAttributeGlobal     							= "";
	public String 						strAttributeExpectedGlobal     							= "";
	private String[] 					strArrRandomDepaartAndArriveCityNames_Global;
	private JSONObject 					objJSON_AmericanAirlinesAdultPassangerDetails 			= new JSONObject();
	private JSONObject 					objJSON_AmericanAirlinesInfantPassangerDetails			= new JSONObject();
	private JSONObject 					objJSON_AmericanAirlinesChildPassangerDetails			= new JSONObject();
	private JSONObject 					objJSON_AmericanAirlines_DummyCreditCardDetails_VISA 	= new JSONObject();
	private JSONObject 					objJSON_AmericanAirlines_DummyCreditCardDetails_All 	= new JSONObject();	

	public void AmericanAirlines_InitilizeForThisWebsiteSpecificItems() {

		System.out.println("DEBUG:    Initilize AmericanAirlines website specific items");
		strArrRandomDepaartAndArriveCityNames_Global 			= getRandomFlightDepartAndArriveCityNames();
		objJSON_AmericanAirlinesAdultPassangerDetails 			= getAmericanAirlinesAdultPassangerDetails(ClsGeneralInitTerminateAndOtherUtil.getPositiveRandomNumberBetweenRange(0,4));
		objJSON_AmericanAirlinesInfantPassangerDetails 			= getAmericanAirlinesInfantPassangerDetails(ClsGeneralInitTerminateAndOtherUtil.getPositiveRandomNumberBetweenRange(0,4));
		objJSON_AmericanAirlinesChildPassangerDetails			= getAmericanAirlinesChildPassangerDetails(ClsGeneralInitTerminateAndOtherUtil.getPositiveRandomNumberBetweenRange(0,4));
		objJSON_AmericanAirlines_DummyCreditCardDetails_VISA 	= getAmericanAirlinesDummyCardDetails_VISA();
		objJSON_AmericanAirlines_DummyCreditCardDetails_All 	= getAmericanAirlinesDummyCardDetails_All();
	}
	
	public void AmericanAirlines_TerminateForThisWebsiteSpecificItems() {

		System.out.println("DEBUG:    Terminate AmericanAirlines website specific items");
		objJSON_AmericanAirlinesAdultPassangerDetails 	= null;
		objJSON_AmericanAirlinesInfantPassangerDetails	= null;
		objJSON_AmericanAirlinesChildPassangerDetails	= null;
		objJSON_AmericanAirlines_DummyCreditCardDetails_VISA = null;
		objJSON_AmericanAirlines_DummyCreditCardDetails_All  = null;
	}
	
	public void AmericanAirlines_Validate_Home_Page_Attributes(String strHomePageAttribute, String strAttributeExpected){
		
		System.out.println("DEBUG:    Comparing actual and expected attribute for: " + strHomePageAttribute);
		
		strHomePageAttributeGlobal  				= strHomePageAttribute;
		strAttributeExpectedGlobal  				= strAttributeExpected;
		// do not remove below line
		bAmericanAirlines_SingleScenarioResultStatus = false;

		switch (strHomePageAttribute) {
		case "home page URL":
			if(		AmericanAirlines_Compare_Main_Page_URL_with_Reference_Home_Page_URL(strCurrentPageURL,strAttributeExpected)   )
				bAmericanAirlines_SingleScenarioResultStatus = true;
			break;
		case "home page title":
			if(		AmericanAirlines_Compare_Main_Page_Title_with_Reference_Home_Page_Title(strCurrentPageTitle,strAttributeExpected)    )
				bAmericanAirlines_SingleScenarioResultStatus = true;
			break;
		case "home page logo":
			if(		AmericanAirlines_Compare_Main_Page_Logo_with_Reference_Home_Page_Logo(strAttributeExpected)    )
				bAmericanAirlines_SingleScenarioResultStatus = true;
			break;
		case "home page loading time":
			if(		AmericanAirlines_Compare_Actual_and_Reference_HomePage_Load_Time()    )
				bAmericanAirlines_SingleScenarioResultStatus = true;
			break;
			
		case "important home page elements":
			if(		AmericanAirlines_Validate_Important_HomePage_Elements(strAttributeExpected)       )
				bAmericanAirlines_SingleScenarioResultStatus = true;
			break;
			
		case "pop up":
			if(		AmericanAirlines_Popup_Handler(strAttributeExpected)       )
				bAmericanAirlines_SingleScenarioResultStatus = true;
			break;
			
		case "sign up":
			if (strAttributeExpected.contains("NA")){
				System.out.println("DEBUG:    Verification of following attribute is NA: " + strAttributeExpected);
				bAmericanAirlines_SingleScenarioResultStatus = true;
			}
			else if ( AmericanAirlines_Validate_SignUp(strAttributeExpected)		       )
				bAmericanAirlines_SingleScenarioResultStatus = true;
			break;
		case "sign in":
			if (strAttributeExpected.contains("NA")){
				System.out.println("DEBUG:    Verification of following attribute is NA: " + strAttributeExpected);
				bAmericanAirlines_SingleScenarioResultStatus = true;
			}
			else if ( AmericanAirlines_Validate_SignIn(strAttributeExpected)		       )
				bAmericanAirlines_SingleScenarioResultStatus = true;
			break;

			case "social plugin facebook":
			case "social plugin twitter":
				if(		AmericanAirlines_SocialPluginHandler(strAttributeExpected)       )
					bAmericanAirlines_SingleScenarioResultStatus = true;
				break;

			case "home page other web elements":
				if(		AmericanAirlines_Validate_HomePage_Other_WebElements(strAttributeExpected)       )
					bAmericanAirlines_SingleScenarioResultStatus = true;
				break;
				
				
				
				
			case "mobile app download check":
				if(		AmericanAirlines_Validate_MobileApplication_Links(strAttributeExpected)       )
					bAmericanAirlines_SingleScenarioResultStatus = true;
				break;
				
				
//			case "":
//			System.out.println("DEBUG:    .");
//			bAmericanAirlines_SingleScenarioResultStatus = ;
//			break;
//			case "":
//			System.out.println("DEBUG:    .");
//			bAmericanAirlines_SingleScenarioResultStatus = ;
//			break;
//			case "":
//			System.out.println("DEBUG:    .");
//			bAmericanAirlines_SingleScenarioResultStatus = ;
//			break;
//			case "":
//			System.out.println("DEBUG:    .");
//			bAmericanAirlines_SingleScenarioResultStatus = ;
//			break;
		default:
			System.out.println("ERROR:    Unsupported attribute to validate: " + strHomePageAttribute);
			objSoftAssert.fail("ERROR:    Unsupported attribute to validate: " + strHomePageAttribute);
			break;
		}
		
	}

	public void AmericanAirlines_Validate_Home_Page_Elements(String strCategoryName, String strGUIOptionList){
		
		System.out.println("DEBUG:    Comparing actual and expected elements for category: " + strCategoryName);
		
		strHomePageAttributeGlobal  				= strCategoryName;
		
		// do not remove below line
		bAmericanAirlines_SingleScenarioResultStatus = false;
		
		switch (strCategoryName) {
		case "Book":
			if(		objPageAmericanAirlinesMain.AmericanAirlines_Validate_HomePageElements_for_Book_Category(strGUIOptionList)   )
				bAmericanAirlines_SingleScenarioResultStatus = true;
			break;
		case "My Trips":
			if(		objPageAmericanAirlinesMain.AmericanAirlines_Validate_HomePageElements_for_MyTrips_Category(strGUIOptionList)    )
				bAmericanAirlines_SingleScenarioResultStatus = true;
			break;
		case "Check-In":
			if(		objPageAmericanAirlinesMain.AmericanAirlines_Validate_HomePageElements_for_CheckIn_Category(strGUIOptionList)    )
				bAmericanAirlines_SingleScenarioResultStatus = true;
			break;
		case "Flight Status":
			if(		objPageAmericanAirlinesMain.AmericanAirlines_Validate_HomePageElements_for_FlightStatus_Category(strGUIOptionList)    )
				bAmericanAirlines_SingleScenarioResultStatus = true;
			break;
		default:
			System.out.println("ERROR:    Unsupported home page GUI options to validate: " + strCategoryName);
			break;
		}
		
		if (bAmericanAirlines_SingleScenarioResultStatus) 		System.out.println("RESULT::PASS");
	    else {
	    		System.out.println("RESULT::FAIL");
	    		System.out.println("ERROR:    Following home page element not found: " + strCategoryName);
	    		objSoftAssert.fail("ERROR:    Following home page element not found: " + strCategoryName);
	    }
	}

	public void AmericanAirlines_Validate_Home_Page_Top_Row_Elements(String strSubPageName, String subPageOptionList){
		
		System.out.println("DEBUG:    Comparing actual and expected elements for following top row sub page: " + strSubPageName);
		
		//strHomePageAttributeGlobal  				= strCategoryName;
		
		// do not remove below line
		bAmericanAirlines_SingleScenarioResultStatus = false;
		
		switch (strSubPageName) {
		case "All sub pages common":
			if(		objPageAmericanAirlinesMain.AmericanAirlines_Validate_TopRowSubPageElements_Common(subPageOptionList)   )
				bAmericanAirlines_SingleScenarioResultStatus = true;
			break;
		case "Plan Travel":
			if(		objPageAmericanAirlinesMain.AmericanAirlines_Validate_TopRowSubPageElements_ForPlanTravel(subPageOptionList)    )
				bAmericanAirlines_SingleScenarioResultStatus = true;
			break;
		case "Travel Information":
			if(		objPageAmericanAirlinesMain.AmericanAirlines_Validate_TopRowSubPageElements_ForTravelInformation(subPageOptionList)    )
				bAmericanAirlines_SingleScenarioResultStatus = true;
			break;
		case "AAdvantage":
			if(		objPageAmericanAirlinesMain.AmericanAirlines_Validate_TopRowSubPageElements_ForAAdvantage(subPageOptionList)    )
				bAmericanAirlines_SingleScenarioResultStatus = true;
			break;
		default:
			System.out.println("ERROR:    Unsupported home page GUI options to validate: " + strSubPageName);
			break;
		}
		
		
		
		if (bAmericanAirlines_SingleScenarioResultStatus) 		System.out.println("RESULT::PASS");
	    else {
	    		System.out.println("RESULT::FAIL");
	    		System.out.println("ERROR:    Following home page top row element not found: " + strSubPageName);
	    		objSoftAssert.fail("ERROR:    Following home page top row element not found: " + strSubPageName);
   		}
		
	}
	
	public void AmericanAirlines_Validate_Ticket_Search_Scenario_Combination(
					String strSectionType, String strSearchText, String  strScenarioExpectedResult){
		
		System.out.println("DEBUG:    Verifying ticket search scenario combination for : " + strSectionType + " and " + strSearchText);
	
		if(!  Arrays.asList("Book","My Trips","Check-In","Flight Status").contains(strSectionType)){
			System.out.println("ERROR:    Unsupported ticket search scenario to validate: " + strSectionType);
			return;
	    }

		bAmericanAirlines_SingleScenarioResultStatus = 
				objPageAmericanAirlinesMain.AmericanAirlines_Validate_TicketSearchScenarioFor_BookFlight(   
						strSectionType + "___" + strSearchText, strScenarioExpectedResult);

		if(bAmericanAirlines_SingleScenarioResultStatus){			System.out.println("RESULT::PASS");}
		else{
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Ticket search scenario failed for dollowing section type: " + strSectionType + "" + strSearchText);
			objSoftAssert.fail("ERROR:    Ticket search scenario failed for dollowing section type: " + strSectionType + "" + strSearchText);
		}
	}
	
	public void AmericanAirlines_User_Perform_Simple_Valid_Flight_Search_With_Default_Paraeters(){
	
		System.out.println("DEBUG:    User performs simple valid flight search with default paramaters");
		
		bAmericanAirlines_SingleScenarioResultStatus = 
				objPageAmericanAirlinesMain.AmericanAirlines_Perform_Simple_Valid_Flight_Search(strArrRandomDepaartAndArriveCityNames_Global);
		
		if(bAmericanAirlines_SingleScenarioResultStatus){			System.out.println("RESULT::PASS");}
		else{
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Simple valid flight search step failed");
			objSoftAssert.fail("ERROR:    Simple valid flight search step failed");
		}
	}
	
	public void AmericanAirlines_Validate_Basic_Search_Result_Information(String strSearchResultInformationIemsToCheck){

		System.out.println("DEBUG:    User validates basic search result information for: " + strSearchResultInformationIemsToCheck);
		
		// check result of earlier step
		if (! bAmericanAirlines_SingleScenarioResultStatus){
			System.out.println("ERROR:    Simple valid flight search step failed before proceeding for basic search result information check: " + strSearchResultInformationIemsToCheck);
			objSoftAssert.fail("ERROR:    Simple valid flight search step failed before proceeding for basic search result information check: " + strSearchResultInformationIemsToCheck);
			return;
		}

		bAmericanAirlines_SingleScenarioResultStatus = 
				objPageAmericanAirlinesResult1SelectDate.AmericanAirlines_Validate_BasicSearchInformation(strSearchResultInformationIemsToCheck);
		
		if(bAmericanAirlines_SingleScenarioResultStatus){			System.out.println("RESULT::PASS");}
		else{
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Basic search result information check failed");
			objSoftAssert.fail("ERROR:    Basic search result information check failed");
		}
	}
	
	public void AmericanAirlines_User_Validates_End_To_End_Valid_Flight_Search__TYPE1__With_Default_Paameters(String strEndToEndFlightSearchScenario__TYPE1){
		
		strEndToEndFlightSearchScenario__TYPE1 = strEndToEndFlightSearchScenario__TYPE1.split(" ")[0].trim();
		System.out.println("DEBUG:    User validates end to end flight search scenario for: " + strEndToEndFlightSearchScenario__TYPE1);

		// check result of earlier step
		if (! bAmericanAirlines_SingleScenarioResultStatus){
			System.out.println("ERROR:    Simple valid flight search step failed before proceeding for end to end scenario: " + strEndToEndFlightSearchScenario__TYPE1);
			objSoftAssert.fail("ERROR:    Simple valid flight search step failed before proceeding for end to end scenario: " + strEndToEndFlightSearchScenario__TYPE1);
			return;
		}

		switch(strEndToEndFlightSearchScenario__TYPE1){
		case "type_first_01":
			// "type_first_01 Select first search result and enter user details and continue"
			if (bAmericanAirlines_SingleScenarioResultStatus)
				{bAmericanAirlines_SingleScenarioResultStatus = 
					objPageAmericanAirlinesResult1SelectDate.AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE1_CASE1();}
			if (bAmericanAirlines_SingleScenarioResultStatus)
				{bAmericanAirlines_SingleScenarioResultStatus = 
					objPageAmericanAirlinesResult2SelectFlight.AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE1_CASE1();}
			if (bAmericanAirlines_SingleScenarioResultStatus)
				{bAmericanAirlines_SingleScenarioResultStatus = 
					objPageAmericanAirlinesResult3Price.AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE1_CASE1();}
			if (bAmericanAirlines_SingleScenarioResultStatus)
				{bAmericanAirlines_SingleScenarioResultStatus = 
					objPageAmericanAirlinesResult4PassengerDetail.AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE1_CASE1(objJSON_AmericanAirlinesAdultPassangerDetails);}
			break;

		case "type_first_02":
			// type_first_02 Modify search and book return ticket and select first search result and cancel the same (start over)
			if (bAmericanAirlines_SingleScenarioResultStatus)
				{bAmericanAirlines_SingleScenarioResultStatus = 
						objPageAmericanAirlinesMain.AmericanAirlines_ModifySearch_BookReturnTicket(strArrRandomDepaartAndArriveCityNames_Global);}
			if (bAmericanAirlines_SingleScenarioResultStatus)
				{bAmericanAirlines_SingleScenarioResultStatus = 
					objPageAmericanAirlinesResult1SelectDate.AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE1_CASE2();}
			break;
			
		case "type_first_03":
			// type_first_03 Select first search result from highest quota and cancel the same
			if (bAmericanAirlines_SingleScenarioResultStatus)
				{bAmericanAirlines_SingleScenarioResultStatus = 
					objPageAmericanAirlinesResult1SelectDate.AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE1_CASE3();}
			if (bAmericanAirlines_SingleScenarioResultStatus)
				{bAmericanAirlines_SingleScenarioResultStatus = 
					objPageAmericanAirlinesResult2SelectFlight.AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE1_CASE3();}
			
			break;
			
		case "type_first_04":
			// type_first_04 Navigate to next day and select first search result from Premium quota and cancel the same
			if (bAmericanAirlines_SingleScenarioResultStatus)
				{bAmericanAirlines_SingleScenarioResultStatus = 
					objPageAmericanAirlinesResult1SelectDate.AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE1_CASE4();}
			if (bAmericanAirlines_SingleScenarioResultStatus)
				{bAmericanAirlines_SingleScenarioResultStatus = 
					objPageAmericanAirlinesResult2SelectFlight.AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE1_CASE4();}
			break;

		case "type_first_05":
			//  type_first_05 Select first search result with limited seats and enter user details and continue
			if (bAmericanAirlines_SingleScenarioResultStatus)
				{bAmericanAirlines_SingleScenarioResultStatus = 
					objPageAmericanAirlinesResult1SelectDate.AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE1_CASE5();}
			if (bAmericanAirlines_SingleScenarioResultStatus)
				{bAmericanAirlines_SingleScenarioResultStatus = 
					objPageAmericanAirlinesResult2SelectFlight.AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE1_CASE5();}
			break;
		default:
			System.out.println("ERROR:    This end to end flight search scenarion case is not supported: " + strEndToEndFlightSearchScenario__TYPE1);
			break;
		}

		if(bAmericanAirlines_SingleScenarioResultStatus){			System.out.println("RESULT::PASS");}
		else{
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    End to end valid flight search TYPE1 failed");
			objSoftAssert.fail("ERROR:    End to end valid flight search TYPE1 failed");
		}
		
	}

	public void AmericanAirlines_User_Validates_End_To_End_Valid_Flight_Search__TYPE3__With_Default_Paameters(String strEndToEndFlightSearchScenario__TYPE3){
		
		strEndToEndFlightSearchScenario__TYPE3 = strEndToEndFlightSearchScenario__TYPE3.split(" ")[0].trim();
		System.out.println("DEBUG:    User validates end to end flight search scenario for: " + strEndToEndFlightSearchScenario__TYPE3);

		// check result of 
		if (! bAmericanAirlines_SingleScenarioResultStatus){
			System.out.println("ERROR:    Simple valid flight search step failed before proceeding for end to end scenario: " + strEndToEndFlightSearchScenario__TYPE3);
			objSoftAssert.fail("ERROR:    Simple valid flight search step failed before proceeding for end to end scenario: " + strEndToEndFlightSearchScenario__TYPE3);
			return;
		}

		switch(strEndToEndFlightSearchScenario__TYPE3){
		case "type_third_01":
			// type_third_01 Sort results by Departure time and book the first ticket from medium quota  until payment section
			if (bAmericanAirlines_SingleScenarioResultStatus)
				{bAmericanAirlines_SingleScenarioResultStatus = 
					objPageAmericanAirlinesResult1SelectDate.AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE3_CASE1();}
			if (bAmericanAirlines_SingleScenarioResultStatus)
				{bAmericanAirlines_SingleScenarioResultStatus = 
					objPageAmericanAirlinesResult2SelectFlight.AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE3_CASE1();}
			if (bAmericanAirlines_SingleScenarioResultStatus)
				{bAmericanAirlines_SingleScenarioResultStatus = 
					objPageAmericanAirlinesResult3Price.AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE3_CASE1();}
			if (bAmericanAirlines_SingleScenarioResultStatus)
				{bAmericanAirlines_SingleScenarioResultStatus = 
					objPageAmericanAirlinesResult4PassengerDetail.AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE3_CASE1(objJSON_AmericanAirlinesAdultPassangerDetails);}
			if (bAmericanAirlines_SingleScenarioResultStatus)
				{bAmericanAirlines_SingleScenarioResultStatus = 
						objPageAmericanAirlinesResult5Payment.AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE3_CASE1(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA);}
			break;

		case "type_third_02":
			// type_third_02 Sort results by Arrival time and book the cheapest ticket until payment section
			if (bAmericanAirlines_SingleScenarioResultStatus)
				{bAmericanAirlines_SingleScenarioResultStatus = 
					objPageAmericanAirlinesResult1SelectDate.AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE3_CASE2();}
			if (bAmericanAirlines_SingleScenarioResultStatus)
				{bAmericanAirlines_SingleScenarioResultStatus = 
					objPageAmericanAirlinesResult2SelectFlight.AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE3_CASE2();}
			if (bAmericanAirlines_SingleScenarioResultStatus)
				{bAmericanAirlines_SingleScenarioResultStatus = 
					objPageAmericanAirlinesResult3Price.AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE3_CASE2();}
			if (bAmericanAirlines_SingleScenarioResultStatus)
				{bAmericanAirlines_SingleScenarioResultStatus = 
					objPageAmericanAirlinesResult4PassengerDetail.AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE3_CASE2(objJSON_AmericanAirlinesAdultPassangerDetails);}
			if (bAmericanAirlines_SingleScenarioResultStatus)
				{bAmericanAirlines_SingleScenarioResultStatus = 
					objPageAmericanAirlinesResult5Payment.AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE3_CASE2(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA);}
			break;
			
		case "type_third_03":
			// type_third_03 Sort results by Orgin and book the first ticket from lowst quota and start over
			if (bAmericanAirlines_SingleScenarioResultStatus)
				{bAmericanAirlines_SingleScenarioResultStatus = 
					objPageAmericanAirlinesResult1SelectDate.AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE3_CASE3();}
			if (bAmericanAirlines_SingleScenarioResultStatus)
				{bAmericanAirlines_SingleScenarioResultStatus = 
					objPageAmericanAirlinesResult2SelectFlight.AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE3_CASE3();}
			break;
			
		case "type_third_04":
			// type_third_04 Sort results by Destination and book the second ticket until payment section
			if (bAmericanAirlines_SingleScenarioResultStatus)
				{bAmericanAirlines_SingleScenarioResultStatus = 
					objPageAmericanAirlinesResult1SelectDate.AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE3_CASE4();}
			if (bAmericanAirlines_SingleScenarioResultStatus)
				{bAmericanAirlines_SingleScenarioResultStatus = 
					objPageAmericanAirlinesResult2SelectFlight.AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE3_CASE4();}
			if (bAmericanAirlines_SingleScenarioResultStatus)
				{bAmericanAirlines_SingleScenarioResultStatus = 
					objPageAmericanAirlinesResult3Price.AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE3_CASE4();}
			if (bAmericanAirlines_SingleScenarioResultStatus)
				{bAmericanAirlines_SingleScenarioResultStatus = 
					objPageAmericanAirlinesResult4PassengerDetail.AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE3_CASE4(objJSON_AmericanAirlinesAdultPassangerDetails);}
			if (bAmericanAirlines_SingleScenarioResultStatus)
				{bAmericanAirlines_SingleScenarioResultStatus = 
					objPageAmericanAirlinesResult5Payment.AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE3_CASE4(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA);}
			break;

		case "type_third_05":
			//  type_third_05 Sort results by Durations and book the last ticket from lowest quota until payment section
			if (bAmericanAirlines_SingleScenarioResultStatus)
				{bAmericanAirlines_SingleScenarioResultStatus = 
					objPageAmericanAirlinesResult1SelectDate.AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE3_CASE5();}
			if (bAmericanAirlines_SingleScenarioResultStatus)
				{bAmericanAirlines_SingleScenarioResultStatus = 
					objPageAmericanAirlinesResult2SelectFlight.AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE3_CASE5();}

			if (bAmericanAirlines_SingleScenarioResultStatus)
				{bAmericanAirlines_SingleScenarioResultStatus = 
					objPageAmericanAirlinesResult3Price.AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE3_CASE5();}
			if (bAmericanAirlines_SingleScenarioResultStatus)
				{bAmericanAirlines_SingleScenarioResultStatus = 
					objPageAmericanAirlinesResult4PassengerDetail.AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE3_CASE5(objJSON_AmericanAirlinesAdultPassangerDetails);}
			if (bAmericanAirlines_SingleScenarioResultStatus)
				{bAmericanAirlines_SingleScenarioResultStatus = 
					objPageAmericanAirlinesResult5Payment.AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE3_CASE5(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA);}

			break;
		default:
			System.out.println("ERROR:    This end to end flight search scenarion case is not supported: " + strEndToEndFlightSearchScenario__TYPE3);
			break;
		}

		if(bAmericanAirlines_SingleScenarioResultStatus){			System.out.println("RESULT::PASS");}
		else{
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    End to end valid flight search TYPE3 failed");
			objSoftAssert.fail("ERROR:    End to end valid flight search TYPE3 failed");
		}
		
	}
	
	public void AmericanAirlines_User_Validates_End_To_End_Valid_Flight_Search__TYPE4__With_Default_Paameters(String strEndToEndFlightSearchScenario__TYPE4){
		
		strEndToEndFlightSearchScenario__TYPE4 = strEndToEndFlightSearchScenario__TYPE4.split(" ")[0].trim();
		System.out.println("DEBUG:    User validates end to end flight search scenario for: " + strEndToEndFlightSearchScenario__TYPE4);

		// check result of 
		if (! bAmericanAirlines_SingleScenarioResultStatus){
			System.out.println("ERROR:    Simple valid flight search step failed before proceeding for end to end scenario: " + strEndToEndFlightSearchScenario__TYPE4);
			objSoftAssert.fail("ERROR:    Simple valid flight search step failed before proceeding for end to end scenario: " + strEndToEndFlightSearchScenario__TYPE4);
			return;
		}

		switch(strEndToEndFlightSearchScenario__TYPE4){
		case "type_fourth_01":
			// type_fourth_01 Modify your search and add two infant and handle error message book ticket until payment section
			if (bAmericanAirlines_SingleScenarioResultStatus)
				{bAmericanAirlines_SingleScenarioResultStatus = 
					objPageAmericanAirlinesResult1SelectDate.AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE4_CASE1();}
			if (bAmericanAirlines_SingleScenarioResultStatus)
				{bAmericanAirlines_SingleScenarioResultStatus = 
					objPageAmericanAirlinesResult2SelectFlight.AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE4_CASE1();}
			if (bAmericanAirlines_SingleScenarioResultStatus)
				{bAmericanAirlines_SingleScenarioResultStatus = 
					objPageAmericanAirlinesResult3Price.AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE4_CASE1();}
			if (bAmericanAirlines_SingleScenarioResultStatus)
				{bAmericanAirlines_SingleScenarioResultStatus = 
					objPageAmericanAirlinesResult4PassengerDetail.AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE4_CASE1(
																objJSON_AmericanAirlinesAdultPassangerDetails, objJSON_AmericanAirlinesInfantPassangerDetails);}
			if (bAmericanAirlines_SingleScenarioResultStatus)
				{bAmericanAirlines_SingleScenarioResultStatus = 
						objPageAmericanAirlinesResult5Payment.AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE4_CASE1(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA);}
			break;

		case "type_fourth_02":
			// type_fourth_02 Select first search result and Modify Your Search and add Children and select random seat and reduce flexibility and book the ticket
			if (bAmericanAirlines_SingleScenarioResultStatus)
				{bAmericanAirlines_SingleScenarioResultStatus = 
					objPageAmericanAirlinesResult1SelectDate.AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE4_CASE2();}
			if (bAmericanAirlines_SingleScenarioResultStatus)
				{bAmericanAirlines_SingleScenarioResultStatus = 
					objPageAmericanAirlinesResult2SelectFlight.AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE4_CASE2();}
			if (bAmericanAirlines_SingleScenarioResultStatus)
				{bAmericanAirlines_SingleScenarioResultStatus = 
					objPageAmericanAirlinesResult3Price.AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE4_CASE2();}
			if (bAmericanAirlines_SingleScenarioResultStatus)
				{bAmericanAirlines_SingleScenarioResultStatus = 
					objPageAmericanAirlinesResult4PassengerDetail.AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE4_CASE2(
															objJSON_AmericanAirlinesAdultPassangerDetails, objJSON_AmericanAirlinesChildPassangerDetails);}
			if (bAmericanAirlines_SingleScenarioResultStatus)
				{bAmericanAirlines_SingleScenarioResultStatus = 
					objPageAmericanAirlinesResult5Payment.AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE4_CASE2(objJSON_AmericanAirlines_DummyCreditCardDetails_VISA);}
			break;
			
		case "type_fourth_03":
			// type_fourth_03 Select first search result and select any seat and try to book the ticket after timeout period of ten minutes
			if (bAmericanAirlines_SingleScenarioResultStatus)
				{bAmericanAirlines_SingleScenarioResultStatus = 
					objPageAmericanAirlinesResult1SelectDate.AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE4_CASE3();}
			if (bAmericanAirlines_SingleScenarioResultStatus)
				{bAmericanAirlines_SingleScenarioResultStatus = 
					objPageAmericanAirlinesResult2SelectFlight.AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE4_CASE3();}
			break;
	
		default:
			System.out.println("ERROR:    This end to end flight search scenarion case is not supported: " + strEndToEndFlightSearchScenario__TYPE4);
			break;
		}

		if(bAmericanAirlines_SingleScenarioResultStatus){			System.out.println("RESULT::PASS");}
		else{
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    End to end valid flight search TYPE4 failed");
			objSoftAssert.fail("ERROR:    End to end valid flight search TYPE4 failed");
		}
		
	}
	
	public void AmericanAirlines_User_Perform_Simple_Valid_Flight_Search_With_Default_Paraeters_OneWay_Flight_Until_Payment_Section(){
		
		System.out.println("DEBUG:    User performs simple valid flight search with default paramaters for one way flight until payment section");
		
		bAmericanAirlines_SingleScenarioResultStatus = 
					objPageAmericanAirlinesMain.AmericanAirlines_Perform_Simple_Valid_Flight_Search(strArrRandomDepaartAndArriveCityNames_Global);
		if (bAmericanAirlines_SingleScenarioResultStatus){
				bAmericanAirlines_SingleScenarioResultStatus = 	
					objPageAmericanAirlinesResult1SelectDate.AmericanAirlines_Validate_EndToEnd_Search_Scenario__Until_Payment_Section();
		}
		if (bAmericanAirlines_SingleScenarioResultStatus){
				bAmericanAirlines_SingleScenarioResultStatus = 	
					objPageAmericanAirlinesResult2SelectFlight.AmericanAirlines_Validate_EndToEnd_Search_Scenario__Until_Payment_Section();
		}
		if (bAmericanAirlines_SingleScenarioResultStatus){
				bAmericanAirlines_SingleScenarioResultStatus = 	
					objPageAmericanAirlinesResult3Price.AmericanAirlines_Validate_EndToEnd_Search_Scenario__Until_Payment_Section();
		}
		if (bAmericanAirlines_SingleScenarioResultStatus){
				bAmericanAirlines_SingleScenarioResultStatus = 	
					objPageAmericanAirlinesResult4PassengerDetail.AmericanAirlines_Validate_EndToEnd_Search_Scenario__Until_Payment_Section(
							objJSON_AmericanAirlinesAdultPassangerDetails);
		}

		if(bAmericanAirlines_SingleScenarioResultStatus){			System.out.println("RESULT::PASS");}
		else{
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Simple valid flight search step with default paramaters for one way flight until payment section failed");
			objSoftAssert.fail("ERROR:    Simple valid flight search step with default paramaters for one way flight until payment section failed");
		}
	}
	
	public void AmericanAirlines_User_Initiats_Payment_Method(String strPaymentMethodType){
		
		if( ! bAmericanAirlines_SingleScenarioResultStatus){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Can not initiate payment processing as earlier step failed");
			objSoftAssert.fail("ERROR:    Can not initiate payment processing as earlier step failed");
			return;
		}
		
		System.out.println("DEBUG:    Initiating following method of payment: " + strPaymentMethodType);
		
		if (strPaymentMethodType.contains("Credit_card_type") ){
			bAmericanAirlines_SingleScenarioResultStatus = objPageAmericanAirlinesResult5Payment.
					AmericanAirlines_Validate_Payment_Methods_CardPayment(strPaymentMethodType, objJSON_AmericanAirlines_DummyCreditCardDetails_All);}
		
		if (strPaymentMethodType.contains("Other_payment_options") ){
			bAmericanAirlines_SingleScenarioResultStatus = objPageAmericanAirlinesResult5Payment.
					AmericanAirlines_Validate_Payment_Methods_BankTransfer(strPaymentMethodType, objJSON_AmericanAirlines_DummyCreditCardDetails_All);}
		
		if (bAmericanAirlines_SingleScenarioResultStatus) 		System.out.println("RESULT::PASS");
	    else {
	    		System.out.println("RESULT::FAIL");
	    		System.out.println("ERROR:    Initiating payment processing failed");
	    		objSoftAssert.fail("ERROR:    Initiating payment processing failed");
	    }
		
	}
	
	public void AmericanAirlines_User_Validates_Offers_From_Offes_Section(String strOfferSection){
		
		System.out.println("DEBUG:    User validates following offer from offers section: " + strOfferSection);
		strOfferSection = strOfferSection.replace("tab__", "").trim();

		bAmericanAirlines_SingleScenarioResultStatus = objPageAmericanAirlines99General.
					AmericanAirlines_Validate_OfferSection_For(strOfferSection, strArrRandomDepaartAndArriveCityNames_Global);
		
		if (bAmericanAirlines_SingleScenarioResultStatus) 		System.out.println("RESULT::PASS");
	    else {
	    		System.out.println("RESULT::FAIL");
	    		System.out.println("ERROR:    Offer validation step failed");
	    		objSoftAssert.fail("ERROR:    Offer validation step failed");
	    }
		
	}

	public void AmericanAirlines_User_Validates_Support_Functionality_For(String strSupportFunctionalityTitle){
		
		System.out.println("DEBUG:    User validates following support functionality section: " + strSupportFunctionalityTitle);
		strSupportFunctionalityTitle = strSupportFunctionalityTitle.replace("Support_Functionality__", "").trim();

		bAmericanAirlines_SingleScenarioResultStatus = objPageAmericanAirlines99General.
					AmericanAirlines_Validate_Support_Functionality_For(strSupportFunctionalityTitle);
		
		if (bAmericanAirlines_SingleScenarioResultStatus) 		System.out.println("RESULT::PASS");
	    else {
	    		System.out.println("RESULT::FAIL");
	    		System.out.println("ERROR:    Support functionality validation step failed");
	    		objSoftAssert.fail("ERROR:    Support functionality validation step failed");
	    }
		
	}
	
	public void AmericanAirlines_User_Validates_Specific_Other_Items(String strSpecificOtherItems){
		
		System.out.println("DEBUG:    User validates following specific other items: " + strSpecificOtherItems);
		strSpecificOtherItems = strSpecificOtherItems.replace("Validate__ ", "").trim();

		bAmericanAirlines_SingleScenarioResultStatus = objPageAmericanAirlines99General.
					AmericanAirlines_Validate_Specific_Other_Items(strSpecificOtherItems);
		
		if (bAmericanAirlines_SingleScenarioResultStatus) 		System.out.println("RESULT::PASS");
	    else {
	    		System.out.println("RESULT::FAIL");
	    		System.out.println("ERROR:    Specific other item functionality validation step failed");
	    		objSoftAssert.fail("ERROR:    Specific other item functionality validation step failed");
	    }
		
	}
	
	public void AmericanAirlines_User_Navigates_Between_Different_Pages(String strNavigateToThisPage){
	      
		System.out.println("DEBUG:    User navigates to this page: " + strNavigateToThisPage);

		if ((strNavigateToThisPage.contains("navigate_01") || strNavigateToThisPage.contains("navigate_02") ||
			 strNavigateToThisPage.contains("navigate_03") || strNavigateToThisPage.contains("navigate_04")))
				{bAmericanAirlines_SingleScenarioResultStatus = 
						objPageAmericanAirlinesMain.AmericanAirlines_Perform_SimpleActivity_and_NavigateToNextPage(strArrRandomDepaartAndArriveCityNames_Global);}
		if ((strNavigateToThisPage.contains("navigate_02") || strNavigateToThisPage.contains("navigate_03") ||
			 strNavigateToThisPage.contains("navigate_04")) && bAmericanAirlines_SingleScenarioResultStatus)
				{bAmericanAirlines_SingleScenarioResultStatus = 
						objPageAmericanAirlinesResult1SelectDate.AmericanAirlines_Perform_SimpleActivity_and_NavigateToNextPage();}
		if ((strNavigateToThisPage.contains("navigate_03") || strNavigateToThisPage.contains("navigate_04")) && bAmericanAirlines_SingleScenarioResultStatus)
				{bAmericanAirlines_SingleScenarioResultStatus = 
						objPageAmericanAirlinesResult2SelectFlight.AmericanAirlines_Perform_SimpleActivity_and_NavigateToNextPage();}
		if ( strNavigateToThisPage.contains("navigate_04") && bAmericanAirlines_SingleScenarioResultStatus)
				{bAmericanAirlines_SingleScenarioResultStatus = 
						objPageAmericanAirlinesResult3Price.AmericanAirlines_Perform_SimpleActivity_and_NavigateToNextPage();}
		
		if (bAmericanAirlines_SingleScenarioResultStatus) 		System.out.println("RESULT::PASS");
	    else {
	    		System.out.println("RESULT::FAIL");
	    		System.out.println("ERROR:    Support functionality validation step failed");
	    		objSoftAssert.fail("ERROR:    Support functionality validation step failed");
	    }
		
	}
	
	public void AmericanAirlines_User_Validates_Consistency_of_Common_Web_Elements(String strConsistantElements){

		if( ! bAmericanAirlines_SingleScenarioResultStatus){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Can not validate consistancy of common web element as earlier step failed");
			objSoftAssert.fail("ERROR:    Can not validate consistancy of common web element as earlier step failed");
			return;
		}

		String[]  strAryOfConsistantWebElements = splitThisString(strConsistantElements," __ ");

		for(String strSingleConsistantWebElement : strAryOfConsistantWebElements ){
			System.out.println("DEBUG:    Validating following consistant web element::" + strSingleConsistantWebElement);

			if ( objPageAmericanAirlines99General.AmericanAirlines_validate_This_Element(strSingleConsistantWebElement) ){
				System.out.println("RESULT::PASS");
			}else{
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Validation failed for following consistant web element: " + strSingleConsistantWebElement);
				objSoftAssert.fail("ERROR:    Validation failed for following consistant web element: " + strSingleConsistantWebElement);
			}
		}
	}
	
	public void AmericanAirlines_User_Validates_Home_Page_Other_Attributes(String strHomePageOtherItems,String strHomePageOtherItemsExpectedAttribute){
		System.out.println("DEBUG:    This is unimplemented for now. Coming soon....");
	}
	
	
	
	
	
	
	
	
	
	
	public void AmericanAirlines_Validate_Test_Result(){
		if (bAmericanAirlines_SingleScenarioResultStatus)
			System.out.println("RESULT::OVERALL PASS for current test scenario");	
		else{
			System.out.println("RESULT::OVERALL *****FAIL***** for current test scenario");		
			objSoftAssert.fail("RESULT::OVERALL *****FAIL***** for current test scenario");
			objSoftAssert.assertAll();
		}
	}
	
	
	
	
	
	
	
	// Helper methods
	
	// compare main page url with reference home page URL
	public boolean AmericanAirlines_Compare_Main_Page_URL_with_Reference_Home_Page_URL(String strMainPageURL, String strRefHomePageURL){

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
	public boolean AmericanAirlines_Compare_Main_Page_Title_with_Reference_Home_Page_Title(String strMainPageTitle, String strRefHomePageTitle){

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

	public boolean AmericanAirlines_Compare_Actual_and_Reference_HomePage_Load_Time(){
		return compare_Actual_and_Reference_HomePage_Load_Time();
	}
	
	public boolean AmericanAirlines_Validate_Important_HomePage_Elements(String strHomePageElementsUnderTest){

		String[]  strAryOfWebElements = splitThisString(strHomePageElementsUnderTest," __ ");
		boolean bLocalTestResultStatus = true;
		
		for(String strSingleWebElement : strAryOfWebElements ){
			System.out.println("DEBUG:    Validating following home page web element::" + strSingleWebElement);
			
			if ( objPageAmericanAirlinesMain.AmericanAirlines_validate_This_Element(strSingleWebElement) ){
				System.out.println("RESULT::PASS");
			}else{
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Validation failed for following web element: " + strSingleWebElement);
				objSoftAssert.fail("ERROR:    Validation failed for following web element: " + strSingleWebElement);
				// do not remove below line
				bLocalTestResultStatus = false;
			}
		}
		return bLocalTestResultStatus;
	}
	
	public boolean AmericanAirlines_Validate_SignUp(String strSignUp_Activity){
		// coming soon
		System.out.println("DEBUG:    Sign up is currently not supported");
		return true;
	}
	
	public boolean AmericanAirlines_Validate_SignIn(String strSignIn_Activity){
		// coming soon
		System.out.println("DEBUG:    Sign in is currently not supported");
		return true;
	}
	
	public boolean AmericanAirlines_SocialPluginHandler(String strSocialPluginType){
		boolean bLocalTestResultStatus = false;
		
		switch(strSocialPluginType){
		case "social_plugin__ facebook":
			if ( objPageAmericanAirlinesMain.AmericanAirlines_SocialPlugin_Check_Facebook()    ){
					System.out.println("DEBUG:    Social plugin web element found for Facebook");
					if ( ClsSocialPlugin.social_Plugin_Handler_Facebook(objPropMngr.single_Property_Getter("strSocialPluginActionFacebook"))  )
							{bLocalTestResultStatus = true;}
			}else {System.out.println("DEBUG:    Social plugin web element NOT found for Facebook");}
			break;
		case "social_plugin__ twitter":
			if ( objPageAmericanAirlinesMain.AmericanAirlines_SocialPlugin_Check_Twitter()    ){
					System.out.println("DEBUG:    Social plugin web element found for Twitter");
					if ( ClsSocialPlugin.social_Plugin_Handler_Twitter(objPropMngr.single_Property_Getter("strSocialPluginActionTwitter"))    )
							{bLocalTestResultStatus = true;}
			}else {System.out.println("DEBUG:    Social plugin web element NOT found for Twitter");}
			break;
		case "NA":
		default :
			System.out.println("ERROR:    This social plug in is not supported: " + strSocialPluginType);
			objSoftAssert.fail("ERROR:    This social plug in is not supported: " + strSocialPluginType);
			break;
		}
		return bLocalTestResultStatus;
	}
	
	public boolean AmericanAirlines_Popup_Handler(String strPopupType_and_Action){
		return handle_General_Popup(strPopupType_and_Action);
	}
	
	public boolean AmericanAirlines_Validate_HomePage_Other_WebElements(String strOtherHomePageElementsUnderTest){

		boolean bLocalTestResultStatus = true;
		
		if (strOtherHomePageElementsUnderTest.contains("broken links")){
			if (!check_Broken_Links()){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Broken link test failed");
				objSoftAssert.fail("ERROR:    Broken link test failed");
				bLocalTestResultStatus = false;}
		}
		if (strOtherHomePageElementsUnderTest.contains("broken images")){
			if (!check_Broken_Images()){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Broken images test failed");
				objSoftAssert.fail("ERROR:    Broken images test failed");
				bLocalTestResultStatus = false;}
		}
		if (strOtherHomePageElementsUnderTest.contains("all frame title")){
			if (!check_All_Frame_Titles()){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Check all frame title test failed");
				objSoftAssert.fail("ERROR:    Check all frame title test failed");
				bLocalTestResultStatus = false;}
		}
		
//		// for future tests
//		if (strOtherHomePageElementsUnderTest.contains("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")){
//			if (!check_xxxxxxxxxxxxxxxxxxxxxxxxxx()){
//				System.out.println("RESULT::FAIL");
//				System.out.println("ERROR:    Check xxxxxxxxxxxxxxxxxxxxxxxxx test failed");
//				objSoftAssert.fail("ERROR:    Check xxxxxxxxxxxxxxxxxxxxxxxxx test failed");
//				bLocalTestResultStatus = false;}
//		}
		
		return bLocalTestResultStatus;
	}

	public boolean AmericanAirlines_Validate_MobileApplication_Links(String strMobileApp_Types){

		boolean bLocalTestResultStatus = true;
		
		if (! ( strMobileApp_Types.contains("ios") ||
		        strMobileApp_Types.contains("android") ||
		        strMobileApp_Types.contains("blackberry") ||
		        strMobileApp_Types.contains("windows"))            ){
						 objSoftAssert.fail("ERROR:    Unsupported mobile application type");
						 System.out.println("ERROR:    Unsupported mobile application type");	return false; }
		
		if (strMobileApp_Types.contains("ios")){
			if (!AmericanAirlines_Verify_MobileAppWebsite_Navigation_and_Download_Installer(
					strURLMobileAppAmericanAirlines,"ios")){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Mobile App webite navigation and download test failed for: " + "ios");
				objSoftAssert.fail("ERROR:    Mobile App webite navigation and download test failed for: " + "ios");
				bLocalTestResultStatus = false;}
		}
		if (strMobileApp_Types.contains("android")){
			if (!AmericanAirlines_Verify_MobileAppWebsite_Navigation_and_Download_Installer(
					strURLMobileAppAmericanAirlines,"android")){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Mobile App webite navigation and download test failed for: " + "android");
				objSoftAssert.fail("ERROR:    Mobile App webite navigation and download test failed for: " + "android");
				bLocalTestResultStatus = false;}
		}
		if (strMobileApp_Types.contains("blackberry")){
			if (!AmericanAirlines_Verify_MobileAppWebsite_Navigation_and_Download_Installer(
					strURLMobileAppAmericanAirlines,"blackberry")){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Mobile App webite navigation and download test failed for: " + "blackberry");
				objSoftAssert.fail("ERROR:    Mobile App webite navigation and download test failed for: " + "blackberry");
				bLocalTestResultStatus = false;}
		}
		if (strMobileApp_Types.contains("windows")){
			if (!AmericanAirlines_Verify_MobileAppWebsite_Navigation_and_Download_Installer(
					strURLMobileAppAmericanAirlines,"windows")){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Mobile App webite navigation and download test failed for: " + "windows");
				System.out.println("ERROR:    Mobile App webite navigation and download test failed for: " + "windows");
				bLocalTestResultStatus = false;}
		}
		
		return bLocalTestResultStatus;
	}
	
	public boolean AmericanAirlines_Compare_Main_Page_Logo_with_Reference_Home_Page_Logo(String strLogoType){

		String strImageNameContains = "_reference_logo";
		
		URL objURLMainPageLogo		= null;
		try {objURLMainPageLogo		= new URL(objPageAmericanAirlinesMain.AmericanAirlines_Get_MainPage_Logo_URL());} 
		catch (MalformedURLException e) {
			System.out.println("ERROR:    Unable to fetch main page image through URL"); 
			objSoftAssert.fail("ERROR:    Unable to fetch main page image through URL");			return false;}
		catch (Exception e)             {
			System.out.println("ERROR:    Unable to open main page image URL"); 
			objSoftAssert.fail("ERROR:    Unable to open main page image URL");						return false;}
		
		List<Object> lstGeneralObjects = process_Images_to_Compare(strImageNameContains, objURLMainPageLogo);
		if (! (boolean) lstGeneralObjects.get(0) ) return false;

		// lstGeneralObjects.get(1) is reference image path
		// lstGeneralObjects.get(2) is actual image path
		if (!utility_ImageCompare(lstGeneralObjects.get(1).toString(), 
				                  lstGeneralObjects.get(2).toString())  ){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Logo comparison test failed");
			objSoftAssert.fail("ERROR:    Logo comparison test failed");
			return false;
		}
		return true;
	}
		
	private String[] getRandomFlightDepartAndArriveCityNames(){
		
		String strRandomDepartCityName = strArrDepartCities[ClsGeneralInitTerminateAndOtherUtil.getPositiveRandomNumberBetweenRange(0,strArrDepartCities.length-1)];
		String strRandomArriveCityName = strArrArriveCities[ClsGeneralInitTerminateAndOtherUtil.getPositiveRandomNumberBetweenRange(0,strArrArriveCities.length-1)];
				
		return new String[]{strRandomDepartCityName, strRandomArriveCityName};
	}

	// below list is not complete
	private String [] strArrDepartCities = {
			"Atlanta (ATL), Georgia, USA",
			"Los Angeles (LAX), California, USA",
			"Chicago O'Hare (ORD), Illinois, USA",
			"Dallas/Fort Worth (DFW), Texas, USA",
			"San Francisco (SFO), California, USA",
			"Charlotte (CLT), North Carolina, USA",
			"Phoenix (PHX), Arizona, USA",
			"Houston George Bush (IAH), Texas, USA",
			"Seattle-Tacoma Airport (SEA), Washington, USA",
			"Detroit Metro Wayne Airport (DTT), Michigan, USA"
	};

	// below list is not complete
	private String [] strArrArriveCities = {
			"Paris Charles de Gaulle (CDG), France",
			"Munich (MUC), Germany",
			"Berlin (BER), Germany",
			"Honolulu, Oahu Island (HNL), Hawaii, USA",
			"Las Vegas (LAS), Nevada, USA",
			"Venice (VCE), Italy",
			"Milan (MIL), Italy",
			"Mumbai Chhatrapati Shivaji (BOM), India",
			"Delhi (DEL), India",
			"Hong Kong (HKG), Hong Kong"
	};
	
	
}
