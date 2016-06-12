package com.imademethink_webautomation.pkgTktTravel_redBus;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.json.JSONObject;

import com.imademethink_webautomation.UserManagement.ClsUserManagement;
import com.imademethink_webautomation.UtilGeneral.ClsGeneralInitTerminateAndOtherUtil;

public class clsredBus extends ClsUserManagement{

	protected static String 			strURLHomePageredBus 			= "https://www.redbus.in/";
	protected static String 			strURLMobileAppredBus			= "http://www.redbus.in/mobile.aspx";
	protected static String 			strHomePageTitle     			= "redBus : Online Bus Ticket Booking, Book Volvo AC Bus Tickets, Reservation";
	public static boolean 				bredBus_SingleScenarioResultStatus = false;
	public String 						strHomePageAttributeGlobal     	= "";
	public String 						strAttributeExpectedGlobal     	= "";
	private String[] 					strArrRandomDepaartAndArriveCityNames_Global;
	private String[] 					strArrRandomCityNames_Global;
	
	private JSONObject 					objJSON_redBusAdultPassangerDetails 		= new JSONObject();
//	private JSONObject 					objJSON_redBusInfantPassangerDetails		= new JSONObject();
//	private JSONObject 					objJSON_redBusChildPassangerDetails			= new JSONObject();
//	private JSONObject 					objJSON_redBus_DummyCreditCardDetails_VISA 	= new JSONObject();
	private JSONObject 					objJSON_redBus_DummyCreditCardDetails_All 	= new JSONObject();
	private JSONObject 					objJSON_redBus_DummyBankingDetails_All 		= new JSONObject();	

	public void redBus_InitilizeForThisWebsiteSpecificItems() {

		System.out.println("DEBUG:    Initilize redBus website specific items");
		strArrRandomDepaartAndArriveCityNames_Global 	= getRandomDepartAndArriveCityNames();
		strArrRandomCityNames_Global					= getRandomCityNames();
		objJSON_redBusAdultPassangerDetails 			= getredBusAdultPassangerDetails();
//		objJSON_redBus_DummyCreditCardDetails_VISA 		= getredBusDummyCardDetails_Visa();
		objJSON_redBus_DummyCreditCardDetails_All 		= getredBusDummyCardDetails_All();
		objJSON_redBus_DummyBankingDetails_All 			= getredBusDummyBankingDetails_All();
	}
	
	public void redBus_TerminateForThisWebsiteSpecificItems() {

		System.out.println("DEBUG:    Terminate redBus website specific items");
		objJSON_redBusAdultPassangerDetails 	= null;
//		objJSON_redBusInfantPassangerDetails	= null;
//		objJSON_redBusChildPassangerDetails		= null;
//		objJSON_redBus_DummyCreditCardDetails_VISA = null;
		objJSON_redBus_DummyCreditCardDetails_All  = null;
		objJSON_redBus_DummyBankingDetails_All	= null;
	}
	
	public void redBus_Validate_Home_Page_Attributes(String strHomePageAttribute, String strAttributeExpected){
		
		System.out.println("DEBUG:    Comparing actual and expected attribute for: " + strHomePageAttribute);
		
		strHomePageAttributeGlobal  				= strHomePageAttribute;
		strAttributeExpectedGlobal  				= strAttributeExpected;
		// do not remove below line
		bredBus_SingleScenarioResultStatus 			= false;

		switch (strHomePageAttribute) {
			case "home page URL":
				if(		redBus_Compare_Main_Page_URL_with_Reference_Home_Page_URL(strCurrentPageURL,strAttributeExpected)   )
					bredBus_SingleScenarioResultStatus = true;
				break;
			case "home page title":
				if(		redBus_Compare_Main_Page_Title_with_Reference_Home_Page_Title(strCurrentPageTitle,strAttributeExpected)    )
					bredBus_SingleScenarioResultStatus = true;
				break;
			case "home page logo":
				if(		redBus_Compare_Main_Page_Logo_with_Reference_Home_Page_Logo(strAttributeExpected)    )
					bredBus_SingleScenarioResultStatus = true;
				break;
			case "home page loading time":
				if(		redBus_Compare_Actual_and_Reference_HomePage_Load_Time()    )
					bredBus_SingleScenarioResultStatus = true;
				break;
				
			case "important home page elements":
				if(		redBus_Validate_Important_HomePage_Elements(strAttributeExpected)       )
					bredBus_SingleScenarioResultStatus = true;
				break;
				
			case "pop up":
				if(		redBus_Popup_Handler(strAttributeExpected)       )
					bredBus_SingleScenarioResultStatus = true;
				break;
				
			case "sign up":
				if (strAttributeExpected.contains("NA")){
					System.out.println("DEBUG:    Verification of following attribute is NA: " + strAttributeExpected);
					bredBus_SingleScenarioResultStatus = true;
				}
				else if ( redBus_Validate_SignUp_Link(strAttributeExpected)		       )
					bredBus_SingleScenarioResultStatus = true;
				break;
		case "sign in":
			if (strAttributeExpected.contains("NA")){
				System.out.println("DEBUG:    Verification of following attribute is NA: " + strAttributeExpected);
				bredBus_SingleScenarioResultStatus = true;
			}
			else if ( redBus_Validate_SignIn_Link(strAttributeExpected)		       )
				bredBus_SingleScenarioResultStatus = true;
			break;

			case "social plugin facebook":
			case "social plugin twitter":
				if(		redBus_SocialPluginHandler(strAttributeExpected)       )
					bredBus_SingleScenarioResultStatus = true;
				break;

			case "home page other web elements":
				if(		redBus_Validate_HomePage_Other_WebElements(strAttributeExpected)       )
					bredBus_SingleScenarioResultStatus = true;
				break;
				
				
			case "mobile app download check":
				if(		redBus_Validate_MobileApplication_Links(strAttributeExpected)       )
					bredBus_SingleScenarioResultStatus = true;
				break;
		default:
			System.out.println("ERROR:    Unsupported attribute to validate: " + strHomePageAttribute);
			objSoftAssert.fail("ERROR:    Unsupported attribute to validate: " + strHomePageAttribute);
			break;
		}
		
	}

	public void redBus_Validate_Ticket_Booking_GUI_Options(String strCategoryName, String strExpectedGUIOptionsValue){

		System.out.println("DEBUG:    Comparing actual and expected elements for: " + strCategoryName);
		
		strHomePageAttributeGlobal  				= strCategoryName;
		strAttributeExpectedGlobal  				= strExpectedGUIOptionsValue;
		// do not remove below line
		bredBus_SingleScenarioResultStatus 		= false;
		
		switch (strCategoryName) {
			case "List of names under from city":
				bredBus_SingleScenarioResultStatus = 
							objPageredBusMain.redBus_Validate_HomePageGUIElements_for_DepartCityNames(strArrRandomCityNames_Global);
				break;
			case "List of names under to city":
				bredBus_SingleScenarioResultStatus = 
						objPageredBusMain.redBus_Validate_HomePageGUIElements_for_ArriveCityNames(strArrRandomCityNames_Global);
				break;
			case "Onward journey date selection":
				bredBus_SingleScenarioResultStatus = 
							objPageredBusMain.redBus_Validate_HomePageGUIElements_for_OnwardJourneyDateSelection(strExpectedGUIOptionsValue);
				break;
			case "Return journey date drop down":
				bredBus_SingleScenarioResultStatus = 
							objPageredBusMain.redBus_Validate_HomePageGUIElements_for_ReturnJourneyDateDropDown(strExpectedGUIOptionsValue);
				break;
			case "Invalid city name error check":
				bredBus_SingleScenarioResultStatus = 
							objPageredBusMain.redBus_Validate_HomePageGUIElements_for_InvalidCityNameErrorCheck(strExpectedGUIOptionsValue);
				break;
			default:
				System.out.println("ERROR:    Unsupported element to validate: " + strCategoryName);
				objSoftAssert.fail("ERROR:    Unsupported element to validate: " + strCategoryName);
				break;
		}

	}

	public void redBus_Validate_Ticket_Booking_Search_Scenario_Combination(
			String strDepartCityType, String strArriveCityType, String strDateType, String strExpectedSearchResult){

		System.out.println("DEBUG:    Validating ticket booking search scenario for: ");
		System.out.println("DEBUG:     Depart city type: "+ strDepartCityType);
		System.out.println("DEBUG:     Arrive city type: "+ strArriveCityType);
		System.out.println("DEBUG:     Depart date type: "+ strDateType);

		bredBus_SingleScenarioResultStatus = objPageredBusMain.redBus_Validate_Ticket_Booking_Search_Scenario_Combination(
				strDepartCityType, strArriveCityType, strDateType, strExpectedSearchResult, strArrRandomDepaartAndArriveCityNames_Global);
	}
	
	public void redBus_Validate_Home_Page_Elements(String strCategoryName, String strGUIOptionList){
		
		System.out.println("DEBUG:    Comparing actual and expected elements for category: " + strCategoryName);
		
		strHomePageAttributeGlobal  				= strCategoryName;
		
		// do not remove below line
		bredBus_SingleScenarioResultStatus = false;
		
		switch (strCategoryName) {
//		case "Book":
//			if(		objPageredBusMain.redBus_Validate_HomePageElements_for_Book_Category(strGUIOptionList)   )
//				bredBus_SingleScenarioResultStatus = true;
//			break;
//		case "My Trips":
//			if(		objPageredBusMain.redBus_Validate_HomePageElements_for_MyTrips_Category(strGUIOptionList)    )
//				bredBus_SingleScenarioResultStatus = true;
//			break;
//		case "Check-In":
//			if(		objPageredBusMain.redBus_Validate_HomePageElements_for_CheckIn_Category(strGUIOptionList)    )
//				bredBus_SingleScenarioResultStatus = true;
//			break;
		default:
			System.out.println("ERROR:    Unsupported home page GUI options to validate: " + strCategoryName);
			break;
		}
		
		if (bredBus_SingleScenarioResultStatus) 		System.out.println("RESULT::PASS");
	    else {
	    		System.out.println("RESULT::FAIL");
	    		System.out.println("ERROR:    Following home page element not found: " + strCategoryName);
	    		objSoftAssert.fail("ERROR:    Following home page element not found: " + strCategoryName);
	    }
	}
	
	public void redBus_User_Perform_Simple_Valid_Bus_Ticket_Search_With_Default_Paraeters(){
	
		System.out.println("DEBUG:    User performs simple valid bus ticket search with default paramaters");
		
		bredBus_SingleScenarioResultStatus = 
				objPageredBusMain.redBus_Perform_Simple_Valid_BusTicket_Search(strArrRandomDepaartAndArriveCityNames_Global);
		
		if(bredBus_SingleScenarioResultStatus){			System.out.println("RESULT::PASS");}
		else{
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Simple valid bus ticket search step failed");
			objSoftAssert.fail("ERROR:    Simple valid bus ticket search step failed");
		}
	}
	
	public void redBus_Validate_Basic_Search_Result_Information(String strSearchResultInformationIemsToCheck){

		System.out.println("DEBUG:    User validates basic search result information for: " + strSearchResultInformationIemsToCheck);
		
		// check result of earlier step
		if (! bredBus_SingleScenarioResultStatus){
			System.out.println("ERROR:    Simple valid bus ticket search step failed before proceeding for basic search result information check: " + strSearchResultInformationIemsToCheck);
			objSoftAssert.fail("ERROR:    Simple valid bus ticket search step failed before proceeding for basic search result information check: " + strSearchResultInformationIemsToCheck);
			return;
		}

		bredBus_SingleScenarioResultStatus = 
				objPageredBusResult1SelectTravelsnSeat.redBus_Validate_BasicSearchInformation(strSearchResultInformationIemsToCheck);
		
		if(bredBus_SingleScenarioResultStatus){			System.out.println("RESULT::PASS");}
		else{
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Basic search result information check failed");
			objSoftAssert.fail("ERROR:    Basic search result information check failed");
		}
	}
	
	public void redBus_User_Validates_End_To_End_Valid_BusTicket_Search__TYPE1__With_Default_Paameters(String strEndToEndBusTicketSearchScenario__TYPE1){
		
		strEndToEndBusTicketSearchScenario__TYPE1 = strEndToEndBusTicketSearchScenario__TYPE1.split(" ")[0].trim();
		System.out.println("DEBUG:    User validates end to end bus ticket search scenario for: " + strEndToEndBusTicketSearchScenario__TYPE1);

		// check result of earlier step
		if (! bredBus_SingleScenarioResultStatus){
			System.out.println("ERROR:    Simple valid bus ticket search step failed before proceeding for end to end scenario: " + strEndToEndBusTicketSearchScenario__TYPE1);
			objSoftAssert.fail("ERROR:    Simple valid bus ticket search step failed before proceeding for end to end scenario: " + strEndToEndBusTicketSearchScenario__TYPE1);
			return;
		}
		
		switch(strEndToEndBusTicketSearchScenario__TYPE1){
		case "type_first_01":
			// "type_first_01 Select first search result with atleast one seat available and select seat and very first boarding point and no return ticket and enter user details and continue"
			if (bredBus_SingleScenarioResultStatus)
				{bredBus_SingleScenarioResultStatus = 
					objPageredBusResult1SelectTravelsnSeat.redBus_Validate_EndToEnd_Search_Scenario__TYPE1_CASE1();}
			if (bredBus_SingleScenarioResultStatus)
				{bredBus_SingleScenarioResultStatus = 
					objPageredBusResult2UserDetailnPayment.redBus_Validate_EndToEnd_Search_Scenario__TYPE1_CASE1(objJSON_redBusAdultPassangerDetails);}
			break;

		case "type_first_02":
			// type_first_02 Select first search result and select random seat and cancel the same
			if (bredBus_SingleScenarioResultStatus)
				{bredBus_SingleScenarioResultStatus = 
						objPageredBusResult1SelectTravelsnSeat.redBus_Validate_EndToEnd_Search_Scenario__TYPE1_CASE2();}
			break;
			
		case "type_first_03":
			// type_first_03 Select third search result and select ladies seat and book the ticket until payment section
			if (bredBus_SingleScenarioResultStatus)
				{bredBus_SingleScenarioResultStatus = 
					objPageredBusResult1SelectTravelsnSeat.redBus_Validate_EndToEnd_Search_Scenario__TYPE1_CASE3();}
			if (bredBus_SingleScenarioResultStatus)
				{bredBus_SingleScenarioResultStatus = 
					objPageredBusResult2UserDetailnPayment.redBus_Validate_EndToEnd_Search_Scenario__TYPE1_CASE3(objJSON_redBusAdultPassangerDetails);}
			break;
			
		case "type_first_04":
			// type_first_04 Select first search result and select ladies and gents seat and cancel the same
			if (bredBus_SingleScenarioResultStatus)
				{bredBus_SingleScenarioResultStatus = 
					objPageredBusResult1SelectTravelsnSeat.redBus_Validate_EndToEnd_Search_Scenario__TYPE1_CASE4();}
			break;

		case "type_first_05":
			//  type_first_05 Select last search result and select any upper seat and book the ticket until payment section
			if (bredBus_SingleScenarioResultStatus)
				{bredBus_SingleScenarioResultStatus = 
					objPageredBusResult1SelectTravelsnSeat.redBus_Validate_EndToEnd_Search_Scenario__TYPE1_CASE5();}
			if (bredBus_SingleScenarioResultStatus)
				{bredBus_SingleScenarioResultStatus = 
					objPageredBusResult2UserDetailnPayment.redBus_Validate_EndToEnd_Search_Scenario__TYPE1_CASE5(objJSON_redBusAdultPassangerDetails);}
			break;
			
			case "type_first_06":
			//  type_first_06 Select first search result from government bus group and select any lower seat and book the ticket until payment section
			if (bredBus_SingleScenarioResultStatus)
				{bredBus_SingleScenarioResultStatus = 
					objPageredBusResult1SelectTravelsnSeat.redBus_Validate_EndToEnd_Search_Scenario__TYPE1_CASE6();}
			if (bredBus_SingleScenarioResultStatus)
				{bredBus_SingleScenarioResultStatus = 
					objPageredBusResult2UserDetailnPayment.redBus_Validate_EndToEnd_Search_Scenario__TYPE1_CASE6(objJSON_redBusAdultPassangerDetails);}
			break;

		default:
			System.out.println("ERROR:    This end to end bus ticket search scenarion case is not supported: " + strEndToEndBusTicketSearchScenario__TYPE1);
			break;
		}

		if(bredBus_SingleScenarioResultStatus){			System.out.println("RESULT::PASS");}
		else{
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    End to end valid bus ticket search TYPE1 failed");
			objSoftAssert.fail("ERROR:    End to end valid bus ticket search TYPE1 failed");
		}
		
	}
	
	public void redBus_User_Validates_End_To_End_Valid_BusTicket_Search__TYPE2__With_Default_Paameters(String strEndToEndBusTicketSearchScenario__TYPE2){
		
		strEndToEndBusTicketSearchScenario__TYPE2 = strEndToEndBusTicketSearchScenario__TYPE2.split(" ")[0].trim();
		System.out.println("DEBUG:    User validates end to end bus ticket search scenario for: " + strEndToEndBusTicketSearchScenario__TYPE2);

		// check result of earlier step
		if (! bredBus_SingleScenarioResultStatus){
			System.out.println("ERROR:    Simple valid bus ticket search step failed before proceeding for end to end scenario: " + strEndToEndBusTicketSearchScenario__TYPE2);
			objSoftAssert.fail("ERROR:    Simple valid bus ticket search step failed before proceeding for end to end scenario: " + strEndToEndBusTicketSearchScenario__TYPE2);
			return;
		}

		switch(strEndToEndBusTicketSearchScenario__TYPE2){
		case "type_second_01":
		// type_first_01 Filter search result by first travel company name among the list and select first result and book the ticket until payment section
			if (bredBus_SingleScenarioResultStatus)
				{bredBus_SingleScenarioResultStatus = 
					objPageredBusResult1SelectTravelsnSeat.redBus_Validate_EndToEnd_Search_Scenario__TYPE2_CASE1();}
			if (bredBus_SingleScenarioResultStatus)
				{bredBus_SingleScenarioResultStatus = 
					objPageredBusResult2UserDetailnPayment.redBus_Validate_EndToEnd_Search_Scenario__TYPE2_CASE1(objJSON_redBusAdultPassangerDetails);}
			break;

		case "type_second_02":
			// type_first_02 Filter search result by any bus type option and select first result among the list and clear the filter list
			if (bredBus_SingleScenarioResultStatus)
				{bredBus_SingleScenarioResultStatus = 
					objPageredBusResult1SelectTravelsnSeat.redBus_Validate_EndToEnd_Search_Scenario__TYPE2_CASE2();}
			break;
			
		case "type_second_03":
			// type_first_03 Filter search result by second amenities type among the list and select first result and book return ticket and choose first result
			if (bredBus_SingleScenarioResultStatus)
				{bredBus_SingleScenarioResultStatus = 
					objPageredBusResult1SelectTravelsnSeat.redBus_Validate_EndToEnd_Search_Scenario__TYPE2_CASE3();}
			// return ticket booking
			if (bredBus_SingleScenarioResultStatus)
				{bredBus_SingleScenarioResultStatus = 
					objPageredBusMain.redBus_Perform_Simple_Valid_BusTicket_Search_Return(strArrRandomDepaartAndArriveCityNames_Global);}
			if (bredBus_SingleScenarioResultStatus)
				{bredBus_SingleScenarioResultStatus = 
					objPageredBusResult1SelectTravelsnSeat.redBus_Validate_EndToEnd_Search_Scenario__TYPE2_CASE3_Part2();}
			break;
			
		case "type_second_04":
			// type_first_04 Filter search result by first two boarding point among the list and and select first result book two ticket
			if (bredBus_SingleScenarioResultStatus)
				{bredBus_SingleScenarioResultStatus = 
					objPageredBusResult1SelectTravelsnSeat.redBus_Validate_EndToEnd_Search_Scenario__TYPE2_CASE4();}
			break;

		case "type_second_05":
			//  type_first_05 Filter search result by last dropping point among the list and select second result book the ticket until payment section
			if (bredBus_SingleScenarioResultStatus)
				{bredBus_SingleScenarioResultStatus = 
					objPageredBusResult1SelectTravelsnSeat.redBus_Validate_EndToEnd_Search_Scenario__TYPE2_CASE5();}
			if (bredBus_SingleScenarioResultStatus)
				{bredBus_SingleScenarioResultStatus = 
					objPageredBusResult2UserDetailnPayment.redBus_Validate_EndToEnd_Search_Scenario__TYPE2_CASE5(objJSON_redBusAdultPassangerDetails);}
			break;
			
		case "type_second_06":
			//  type_first_06 Filter search result by first rating type among the list and check cancellation policy for the first result
			if (bredBus_SingleScenarioResultStatus)
				{bredBus_SingleScenarioResultStatus = 
					objPageredBusResult1SelectTravelsnSeat.redBus_Validate_EndToEnd_Search_Scenario__TYPE2_CASE6();}
			break;

		case "type_second_07":
			//  type_first_06 Filter search result by any three type and confirm search results and clear the filter list
			if (bredBus_SingleScenarioResultStatus)
				{bredBus_SingleScenarioResultStatus = 
					objPageredBusResult1SelectTravelsnSeat.redBus_Validate_EndToEnd_Search_Scenario__TYPE2_CASE7();}
			break;			
			
		default:
			System.out.println("ERROR:    This end to end bus ticket search scenarion case is not supported: " + strEndToEndBusTicketSearchScenario__TYPE2);
			break;
		}

		if(bredBus_SingleScenarioResultStatus){			System.out.println("RESULT::PASS");}
		else{
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    End to end valid bus ticket search TYPE2 failed");
			objSoftAssert.fail("ERROR:    End to end valid bus ticket search TYPE2 failed");
		}
		
	}

	public void redBus_User_Validates_End_To_End_Valid_BusTicket_Search__TYPE3__With_Default_Paameters(String strEndToEndBusTicketSearchScenario__TYPE3){
		
		strEndToEndBusTicketSearchScenario__TYPE3 = strEndToEndBusTicketSearchScenario__TYPE3.split(" ")[0].trim();
		System.out.println("DEBUG:    User validates end to end bus ticket search scenario for: " + strEndToEndBusTicketSearchScenario__TYPE3);

		// check result of 
		if (! bredBus_SingleScenarioResultStatus){
			System.out.println("ERROR:    Simple valid bus ticket search step failed before proceeding for end to end scenario: " + strEndToEndBusTicketSearchScenario__TYPE3);
			objSoftAssert.fail("ERROR:    Simple valid bus ticket search step failed before proceeding for end to end scenario: " + strEndToEndBusTicketSearchScenario__TYPE3);
			return;
		}

		switch(strEndToEndBusTicketSearchScenario__TYPE3){
		case "type_third_01":
		// type_third_01 Without any filter sort results by travel company name in ascending order and book the first ticket until payment section
			if (bredBus_SingleScenarioResultStatus)
				{bredBus_SingleScenarioResultStatus = 
					objPageredBusResult1SelectTravelsnSeat.redBus_Validate_EndToEnd_Search_Scenario__TYPE3_CASE1();}
			break;

		case "type_third_02":
			// type_third_02 Without any filter sort results by travel company name in descending order and check mTicket message
			if (bredBus_SingleScenarioResultStatus)
				{bredBus_SingleScenarioResultStatus = 
					objPageredBusResult1SelectTravelsnSeat.redBus_Validate_EndToEnd_Search_Scenario__TYPE3_CASE2();}
			break;
			
		case "type_third_03":
			// type_third_03 Without any filter sort results by departure time in ascending order and book second ticket and ladies seat
			if (bredBus_SingleScenarioResultStatus)
				{bredBus_SingleScenarioResultStatus = 
					objPageredBusResult1SelectTravelsnSeat.redBus_Validate_EndToEnd_Search_Scenario__TYPE3_CASE3();}
			break;
			
		case "type_third_04":
			// type_third_04 Without any filter sort results by departure time in descending order and sort results by seat count in ascending order
			if (bredBus_SingleScenarioResultStatus)
				{bredBus_SingleScenarioResultStatus = 
					objPageredBusResult1SelectTravelsnSeat.redBus_Validate_EndToEnd_Search_Scenario__TYPE3_CASE4();}
			break;
			
		case "type_third_05":
			// type_third_05 Without any filter sort results by seat count in ascending order and book ticket where min fifteen seats available
			if (bredBus_SingleScenarioResultStatus)
				{bredBus_SingleScenarioResultStatus = 
					objPageredBusResult1SelectTravelsnSeat.redBus_Validate_EndToEnd_Search_Scenario__TYPE3_CASE5();}
			break;

		case "type_third_06":
			// type_third_026 Without any filter sort results by ratings in ascending order and check ratings message
			if (bredBus_SingleScenarioResultStatus)
				{bredBus_SingleScenarioResultStatus = 
					objPageredBusResult1SelectTravelsnSeat.redBus_Validate_EndToEnd_Search_Scenario__TYPE3_CASE6();}
			break;

		case "type_third_07":
			// type_third_07 Without any filter sort results by any threetypes in ascending order
			if (bredBus_SingleScenarioResultStatus)
				{bredBus_SingleScenarioResultStatus = 
					objPageredBusResult1SelectTravelsnSeat.redBus_Validate_EndToEnd_Search_Scenario__TYPE3_CASE7();}
			break;

		case "type_third_08":
			// type_third_08 Without any filter sort results by fare value in ascending order and book the last ticket until payment section
			if (bredBus_SingleScenarioResultStatus)
				{bredBus_SingleScenarioResultStatus = 
					objPageredBusResult1SelectTravelsnSeat.redBus_Validate_EndToEnd_Search_Scenario__TYPE3_CASE8();}
			if (bredBus_SingleScenarioResultStatus)
				{bredBus_SingleScenarioResultStatus = 
					objPageredBusResult2UserDetailnPayment.redBus_Validate_EndToEnd_Search_Scenario__TYPE3_CASE8(objJSON_redBusAdultPassangerDetails);}
			break;

		case "type_third_09":
			// type_third_09 Sort results by fare value in descending order and filter search result by first rating type and print first fare value
			if (bredBus_SingleScenarioResultStatus)
				{bredBus_SingleScenarioResultStatus = 
					objPageredBusResult1SelectTravelsnSeat.redBus_Validate_EndToEnd_Search_Scenario__TYPE3_CASE9();}
			break;

		default:
			System.out.println("ERROR:    This end to end bus ticket search scenarion case is not supported: " + strEndToEndBusTicketSearchScenario__TYPE3);
			break;
		}

		if(bredBus_SingleScenarioResultStatus){			System.out.println("RESULT::PASS");}
		else{
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    End to end valid bus ticket search TYPE3 failed");
			objSoftAssert.fail("ERROR:    End to end valid bus ticket search TYPE3 failed");
		}
		
	}
	
	public void redBus_User_Validates_End_To_End_Valid_BusTicket_Search__TYPE4__With_Default_Paameters(String strEndToEndBusTicketSearchScenario__TYPE4){
		
		strEndToEndBusTicketSearchScenario__TYPE4 = strEndToEndBusTicketSearchScenario__TYPE4.split(" ")[0].trim();
		System.out.println("DEBUG:    User validates end to end bus ticket search scenario for: " + strEndToEndBusTicketSearchScenario__TYPE4);

		// check result of 
		if (! bredBus_SingleScenarioResultStatus){
			System.out.println("ERROR:    Simple valid bus ticket search step failed before proceeding for end to end scenario: " + strEndToEndBusTicketSearchScenario__TYPE4);
			objSoftAssert.fail("ERROR:    Simple valid bus ticket search step failed before proceeding for end to end scenario: " + strEndToEndBusTicketSearchScenario__TYPE4);
			return;
		}

		switch(strEndToEndBusTicketSearchScenario__TYPE4){
		case "type_fourth_01":
			// type_fourth_01 Select first search result and select any seat and book a return ticket using RETURN option
			if (bredBus_SingleScenarioResultStatus)
				{bredBus_SingleScenarioResultStatus = 
					objPageredBusResult1SelectTravelsnSeat.redBus_Validate_EndToEnd_Search_Scenario__TYPE4_CASE1();}
			// return ticket booking
			if (bredBus_SingleScenarioResultStatus)
				{bredBus_SingleScenarioResultStatus = 
					objPageredBusMain.redBus_Perform_Simple_Valid_BusTicket_Search_Return(strArrRandomDepaartAndArriveCityNames_Global);}
			if (bredBus_SingleScenarioResultStatus)
				{bredBus_SingleScenarioResultStatus = 
					objPageredBusResult1SelectTravelsnSeat.redBus_Validate_EndToEnd_Search_Scenario__TYPE4_CASE1_Part2();}
			break;

		case "type_fourth_02":
			// type_fourth_02 Use RETURN option and book return ticket
			if (bredBus_SingleScenarioResultStatus)
				{bredBus_SingleScenarioResultStatus = 
					objPageredBusResult1SelectTravelsnSeat.redBus_Validate_EndToEnd_Search_Scenario__TYPE4_CASE2();}
			if (bredBus_SingleScenarioResultStatus)
				{bredBus_SingleScenarioResultStatus = 
					objPageredBusMain.redBus_Perform_Simple_Valid_BusTicket_Search_OnwardANDReturn_Part2(strArrRandomDepaartAndArriveCityNames_Global);}
			if (bredBus_SingleScenarioResultStatus)
				{bredBus_SingleScenarioResultStatus = 
					objPageredBusResult1SelectTravelsnSeat.redBus_Validate_EndToEnd_Search_Scenario__TYPE1_CASE1();}
			if (bredBus_SingleScenarioResultStatus)
				{bredBus_SingleScenarioResultStatus = 
					objPageredBusResult1SelectTravelsnSeat.redBus_Validate_EndToEnd_Search_Scenario__TYPE1_CASE1_Part2();}
			break;
			
		case "type_fourth_03":
			// type_fourth_03 Select first search result and select any seat and try to book the ticket after timeout period of ten minutes
			if (bredBus_SingleScenarioResultStatus)
				{bredBus_SingleScenarioResultStatus = 
					objPageredBusResult1SelectTravelsnSeat.redBus_Validate_EndToEnd_Search_Scenario__TYPE4_CASE3();}
			if (bredBus_SingleScenarioResultStatus)
				{bredBus_SingleScenarioResultStatus = 
					objPageredBusResult2UserDetailnPayment.redBus_Validate_EndToEnd_Search_Scenario__TYPE4_CASE3(objJSON_redBusAdultPassangerDetails);}
			break;

		case "type_fourth_04":
			// type_fourth_04 Sign in and select any search result and book any ticket with any combination until payment section
			System.out.println("DEBUG:    This is not yet implemented");
			bredBus_SingleScenarioResultStatus = true;
			break;
	
		default:
			System.out.println("ERROR:    This end to end bus ticket search scenarion case is not supported: " + strEndToEndBusTicketSearchScenario__TYPE4);
			break;
		}

		if(bredBus_SingleScenarioResultStatus){			System.out.println("RESULT::PASS");}
		else{
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    End to end valid bus ticket search TYPE4 failed");
			objSoftAssert.fail("ERROR:    End to end valid bus ticket search TYPE4 failed");
		}
		
	}
	
	public void redBus_User_Perform_Simple_Valid_BusTicket_Search_With_Default_Paraeters_OneWay_BusTicket_Until_Payment_Section(){
		
		System.out.println("DEBUG:    User performs simple valid flight search with default paramaters for one way flight type until payment section");

		bredBus_SingleScenarioResultStatus = 
					objPageredBusMain.redBus_Perform_Simple_Valid_BusTicket_Search(strArrRandomDepaartAndArriveCityNames_Global);
		if (bredBus_SingleScenarioResultStatus){
				bredBus_SingleScenarioResultStatus = 	
					objPageredBusResult1SelectTravelsnSeat.redBus_Validate_EndToEnd_Search_Scenario__Until_Payment_Section();
		}

		if(bredBus_SingleScenarioResultStatus){			System.out.println("RESULT::PASS");}
		else{
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Simple valid bus ticket search step with default paramaters for one way bus ticket until payment section failed");
			objSoftAssert.fail("ERROR:    Simple valid bus ticket search step with default paramaters for one way bus ticket until payment section failed");
		}
	}

	public void redBus_User_Initiats_Payment_Method(String strPaymentMethodType){
		
		if( ! bredBus_SingleScenarioResultStatus){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Can not initiate payment processing as earlier step failed");
			objSoftAssert.fail("ERROR:    Can not initiate payment processing as earlier step failed");
			return;
		}
		
		System.out.println("DEBUG:    Initiating following method of payment: " + strPaymentMethodType);

		if (strPaymentMethodType.contains("Credit_card_type") ){
			bredBus_SingleScenarioResultStatus = objPageredBusResult2UserDetailnPayment.
				redBus_Validate_Payment_Methods_CardPayment(strPaymentMethodType, objJSON_redBus_DummyCreditCardDetails_All, objJSON_redBusAdultPassangerDetails);}
	
		if (strPaymentMethodType.contains("Debit_card_type") ){
		bredBus_SingleScenarioResultStatus = objPageredBusResult2UserDetailnPayment.
				redBus_Validate_Payment_Methods_CardPayment(strPaymentMethodType, objJSON_redBus_DummyCreditCardDetails_All, objJSON_redBusAdultPassangerDetails);}

		if (strPaymentMethodType.contains("Netbanking_type") ){
			bredBus_SingleScenarioResultStatus = objPageredBusResult2UserDetailnPayment.
				redBus_Validate_Payment_Methods_BankTransfer(strPaymentMethodType, objJSON_redBus_DummyBankingDetails_All, objJSON_redBusAdultPassangerDetails);}
		
		if (strPaymentMethodType.contains("Cash_on_delivery") ){
			bredBus_SingleScenarioResultStatus = objPageredBusResult2UserDetailnPayment.
				redBus_Validate_Payment_Methods_CashOnDelivery(strPaymentMethodType, objJSON_redBusAdultPassangerDetails);}
		
		if (bredBus_SingleScenarioResultStatus) 		System.out.println("RESULT::PASS");
	    else {
	    		System.out.println("RESULT::FAIL");
	    		System.out.println("ERROR:    Initiating payment processing failed");
	    		objSoftAssert.fail("ERROR:    Initiating payment processing failed");
	    }
		
	}
	
	public void redBus_User_Validates_Offers_From_Offes_Section(String strOfferSection){
		
		System.out.println("DEBUG:    User validates following offer from offers section: " + strOfferSection);
		strOfferSection = strOfferSection.replace("tab__", "").trim();

		bredBus_SingleScenarioResultStatus = objPageredBus99General.
					redBus_Validate_OfferSection_For(strOfferSection, strArrRandomDepaartAndArriveCityNames_Global);
		
		if (bredBus_SingleScenarioResultStatus) 		System.out.println("RESULT::PASS");
	    else {
	    		System.out.println("RESULT::FAIL");
	    		System.out.println("ERROR:    Offer validation step failed");
	    		objSoftAssert.fail("ERROR:    Offer validation step failed");
	    }
		
	}

	public void redBus_User_Validates_Support_Functionality_In(String strSupportFunctionalityTitle){
		
		System.out.println("DEBUG:    User validates following support functionality section: " + strSupportFunctionalityTitle);
		strSupportFunctionalityTitle = strSupportFunctionalityTitle.replace("Support_Functionality__", "").trim();

		bredBus_SingleScenarioResultStatus = objPageredBus99General.
					redBus_Validate_Support_Functionality_For(strSupportFunctionalityTitle);
		
		if (bredBus_SingleScenarioResultStatus) 		System.out.println("RESULT::PASS");
	    else {
	    		System.out.println("RESULT::FAIL");
	    		System.out.println("ERROR:    Support functionality validation step failed");
	    		objSoftAssert.fail("ERROR:    Support functionality validation step failed");
	    }
		
	}
	
	public void redBus_User_Validates_Specific_Other_Items(String strSpecificOtherItems){
		
		System.out.println("DEBUG:    User validates following specific other items: " + strSpecificOtherItems);
		strSpecificOtherItems = strSpecificOtherItems.replace("Validate__ ", "").trim();

		bredBus_SingleScenarioResultStatus = objPageredBus99General.
					redBus_Validate_Specific_Other_Items(strSpecificOtherItems);
		
		if (bredBus_SingleScenarioResultStatus) 		System.out.println("RESULT::PASS");
	    else {
	    		System.out.println("RESULT::FAIL");
	    		System.out.println("ERROR:    Specific other item functionality validation step failed");
	    		objSoftAssert.fail("ERROR:    Specific other item functionality validation step failed");
	    }
	}
	
	public void redBus_User_Navigates_Between_Different_Pages(String strNavigateToThisPage){

		System.out.println("DEBUG:    User navigates to this page: " + strNavigateToThisPage);

		// navigate_01 Print/SMS ticket screen
		if (strNavigateToThisPage.contains("navigate_01"))
			{bredBus_SingleScenarioResultStatus = 
					objPageredBusMain.redBus_Perform_SimpleActivity_and_NavigateToNextPage("navigate_01");}

		// navigate_02 EasyCancel/Refund screen
		if (strNavigateToThisPage.contains("navigate_02"))
			{bredBus_SingleScenarioResultStatus = 
					objPageredBusMain.redBus_Perform_SimpleActivity_and_NavigateToNextPage("navigate_02");}

		// navigate_03 Any ticket booking result screen
		if (strNavigateToThisPage.contains("navigate_03"))
		{
			bredBus_SingleScenarioResultStatus = 
				objPageredBusMain.redBus_Perform_Simple_Valid_BusTicket_Search(strArrRandomDepaartAndArriveCityNames_Global);
			
//			if(bredBus_SingleScenarioResultStatus){
//					bredBus_SingleScenarioResultStatus = 
//							objPageredBusMain.redBus_Perform_SimpleActivity_and_NavigateToNextPage("navigate_03");}
		}

		// navigate_04 Any ticket booking confirm and customer information provider screen
		if (strNavigateToThisPage.contains("navigate_04"))
		{
			bredBus_SingleScenarioResultStatus = 
				objPageredBusMain.redBus_Perform_Simple_Valid_BusTicket_Search(strArrRandomDepaartAndArriveCityNames_Global);
			if(bredBus_SingleScenarioResultStatus){
				bredBus_SingleScenarioResultStatus = 
						objPageredBusResult1SelectTravelsnSeat.redBus_Perform_SimpleActivity_and_NavigateToNextPage();}
//			if(bredBus_SingleScenarioResultStatus){
//					bredBus_SingleScenarioResultStatus = 
//							objPageredBusMain.redBus_Perform_SimpleActivity_and_NavigateToNextPage("navigate_04");}
		}

		// navigate_05 About us screen
		if (strNavigateToThisPage.contains("navigate_05"))
		{bredBus_SingleScenarioResultStatus = 
				objPageredBusMain.redBus_Perform_SimpleActivity_and_NavigateToNextPage("navigate_05");}

		// navigate_06 redBus on Mobile screen
		if (strNavigateToThisPage.contains("navigate_06"))
		{bredBus_SingleScenarioResultStatus = 
				objPageredBusMain.redBus_Perform_SimpleActivity_and_NavigateToNextPage("navigate_06");}

		// navigate_07 Track_My_Bus screen
		if (strNavigateToThisPage.contains("navigate_07"))
		{bredBus_SingleScenarioResultStatus = 
				objPageredBusMain.redBus_Perform_SimpleActivity_and_NavigateToNextPage("navigate_07");}


		if (bredBus_SingleScenarioResultStatus) 		System.out.println("RESULT::PASS");
	    else {
	    		System.out.println("RESULT::FAIL");
	    		System.out.println("ERROR:    Support functionality validation step failed");
	    		objSoftAssert.fail("ERROR:    Support functionality validation step failed");
	    }
	}
	
	public void redBus_User_Validates_Consistency_of_Common_Web_Elements(String strConsistantElements){

		if( ! bredBus_SingleScenarioResultStatus){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Can not validate consistancy of common web element as earlier step failed");
			objSoftAssert.fail("ERROR:    Can not validate consistancy of common web element as earlier step failed");
			return;
		}

		String[]  strAryOfConsistantWebElements = splitThisString(strConsistantElements," __ ");

		for(String strSingleConsistantWebElement : strAryOfConsistantWebElements ){
			System.out.println("DEBUG:    Validating following consistant web element::" + strSingleConsistantWebElement);

			bredBus_SingleScenarioResultStatus = objPageredBus99General.redBus_validate_This_Element(strSingleConsistantWebElement);

			if ( bredBus_SingleScenarioResultStatus )	System.out.println("RESULT::PASS");
			else{
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Validation failed for following consistant web element: " + strSingleConsistantWebElement);
				objSoftAssert.fail("ERROR:    Validation failed for following consistant web element: " + strSingleConsistantWebElement);
			}
		}
	}
	
	public void redBus_User_Validates_Home_Page_Other_Attributes(String strHomePageOtherItems,String strHomePageOtherItemsExpectedAttribute){
		System.out.println("DEBUG:    This is unimplemented for now. Coming soon....");
	}
	
	
	
	
	
	
	
	
	
	
	public void redBus_Validate_Test_Result(){
		if (bredBus_SingleScenarioResultStatus)
			System.out.println("RESULT::OVERALL PASS for current test scenario");	
		else{
			System.out.println("RESULT::OVERALL *****FAIL***** for current test scenario");		
			objSoftAssert.fail("RESULT::OVERALL *****FAIL***** for current test scenario");
			objSoftAssert.assertAll();
		}
	}
	
	
	
	
	
	
	
	// Helper methods
	
	// compare main page url with reference home page URL
	public boolean redBus_Compare_Main_Page_URL_with_Reference_Home_Page_URL(String strMainPageURL, String strRefHomePageURL){

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
	public boolean redBus_Compare_Main_Page_Title_with_Reference_Home_Page_Title(String strMainPageTitle, String strRefHomePageTitle){

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

	public boolean redBus_Compare_Actual_and_Reference_HomePage_Load_Time(){
		return compare_Actual_and_Reference_HomePage_Load_Time();
	}
	
	public boolean redBus_Validate_Important_HomePage_Elements(String strHomePageElementsUnderTest){

		String[]  strAryOfWebElements = splitThisString(strHomePageElementsUnderTest," __ ");
		boolean bLocalTestResultStatus = true;
		
		for(String strSingleWebElement : strAryOfWebElements ){
			System.out.println("DEBUG:    Validating following home page web element::" + strSingleWebElement);
			
			if ( objPageredBusMain.redBus_validate_This_Element(strSingleWebElement) ){
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
	
	public boolean redBus_Validate_SignUp_Link(String strSignUp_Activity){

		return objPageredBusMain.redBus_Validate_SignUp_Link();
	}

	public boolean redBus_Validate_SignIn_Link(String strSignIn_Activity){

		return objPageredBusMain.redBus_Validate_SignIn_Link();
	}
	
	public boolean redBus_Validate_SignUp(String strSignUp_Activity){

		System.out.println("DEBUG:    Sign up is being validated");

		boolean bLocalTestResultStatus = true;

		if (! objPageredBusMain.redBus_Validate_SignUp("dummy sign up",objJSON_redBusAdultPassangerDetails)  ){
			bLocalTestResultStatus = false;
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Sign up activity failed");
			objSoftAssert.fail("ERROR:    Sign up activity failed");
		}

		return bLocalTestResultStatus;
	}
	
	public boolean redBus_Validate_SignIn(String strSignIn_Activity){

		System.out.println("DEBUG:    Sign in is being validated");

		boolean bLocalTestResultStatus = true;
		
		if (! objPageredBusMain.redBus_Validate_SignIn(objJSON_redBusAdultPassangerDetails)  ){
			bLocalTestResultStatus = false;
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Sign in activity failed");
			objSoftAssert.fail("ERROR:    Sign in activity failed");
		}

		return bLocalTestResultStatus;
	}	

	public boolean redBus_Validate_EditProfile(){
		
		System.out.println("DEBUG:    Edit profile is being validated");

		boolean bLocalTestResultStatus = true;
		
		if (! objPageredBusMain.redBus_Validate_EditProfile(objJSON_redBusAdultPassangerDetails)  ){
			bLocalTestResultStatus = false;
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Edit profile activity failed");
			objSoftAssert.fail("ERROR:    Edit profile activity failed");
		}

		return bLocalTestResultStatus;
	}

	public boolean redBus_Validate_SignOut(){
		System.out.println("DEBUG:   Sign out is being validated");

		boolean bLocalTestResultStatus = true;
		
		if (! objPageredBusMain.redBus_Validate_SignOut()  ){
			bLocalTestResultStatus = false;
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Sign out activity failed");
			objSoftAssert.fail("ERROR:    Sign out activity failed");
		}

		return bLocalTestResultStatus;
	}
	
	public void redBus_User_Validates_User_Management_Case_From(String strUserManagementTest){
		System.out.println("DEBUG:    User validates user management functionality for: " + strUserManagementTest);

		if (strUserManagementTest.contains("Sign_up__"))			
			bredBus_SingleScenarioResultStatus = redBus_Validate_SignUp(strUserManagementTest);

		if (strUserManagementTest.contains("Sign_in__"))			
			bredBus_SingleScenarioResultStatus = redBus_Validate_SignIn(strUserManagementTest);

		if (strUserManagementTest.contains("Edit_profile__"))  		
			bredBus_SingleScenarioResultStatus = redBus_Validate_EditProfile();
		
		if(bredBus_SingleScenarioResultStatus){			System.out.println("RESULT::PASS");}
		else{
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    User management functionality step step failed");
			objSoftAssert.fail("ERROR:    User management functionality step step failed");
		}
	}
		
	public boolean redBus_SocialPluginHandler(String strSocialPluginType){
		boolean bLocalTestResultStatus = false;
		
		switch(strSocialPluginType){
		case "social_plugin__ facebook":
			System.out.println("ERROR:    Social plugin for Facebook is not available for redBus");
			break;
		case "social_plugin__ twitter":
			System.out.println("ERROR:    Social plugin for Twitter is not available for redBus");
			break;
		case "NA":
		default :
			System.out.println("ERROR:    This social plug in is not supported: " + strSocialPluginType);
			objSoftAssert.fail("ERROR:    This social plug in is not supported: " + strSocialPluginType);
			break;
		}
		return bLocalTestResultStatus;
	}
	
	public boolean redBus_Popup_Handler(String strPopupType_and_Action){
		return handle_General_Popup(strPopupType_and_Action);
	}
	
	public boolean redBus_Validate_HomePage_Other_WebElements(String strOtherHomePageElementsUnderTest){

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
		
		return bLocalTestResultStatus;
	}

	public boolean redBus_Validate_MobileApplication_Links(String strMobileApp_Types){

		boolean bLocalTestResultStatus = true;
		
		if (! ( strMobileApp_Types.contains("ios") ||
		        strMobileApp_Types.contains("android") ||
		        strMobileApp_Types.contains("blackberry") ||
		        strMobileApp_Types.contains("windows"))            ){
						 objSoftAssert.fail("ERROR:    Unsupported mobile application type");
						 System.out.println("ERROR:    Unsupported mobile application type");	return false; }
		
		if (strMobileApp_Types.contains("ios")){
			if (!redBus_Verify_MobileAppWebsite_Navigation_and_Download_Installer(
					strURLMobileAppredBus,"ios")){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Mobile App webite navigation and download test failed for: " + "ios");
				objSoftAssert.fail("ERROR:    Mobile App webite navigation and download test failed for: " + "ios");
				bLocalTestResultStatus = false;}
		}
		if (strMobileApp_Types.contains("android")){
			if (!redBus_Verify_MobileAppWebsite_Navigation_and_Download_Installer(
					strURLMobileAppredBus,"android")){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Mobile App webite navigation and download test failed for: " + "android");
				objSoftAssert.fail("ERROR:    Mobile App webite navigation and download test failed for: " + "android");
				bLocalTestResultStatus = false;}
		}
		if (strMobileApp_Types.contains("windows")){
			if (!redBus_Verify_MobileAppWebsite_Navigation_and_Download_Installer(
					strURLMobileAppredBus,"windows")){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Mobile App webite navigation and download test failed for: " + "windows");
				System.out.println("ERROR:    Mobile App webite navigation and download test failed for: " + "windows");
				bLocalTestResultStatus = false;}
		}
		
		return bLocalTestResultStatus;
	}
	
	public boolean redBus_Compare_Main_Page_Logo_with_Reference_Home_Page_Logo(String strLogoType){

		String strImageNameContains = "_reference_logo";
		
		URL objURLMainPageLogo		= null;
		
		try {objURLMainPageLogo		= new URL(objPageredBusMain.redBus_Get_MainPage_Logo_URL());} 
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


	// below list is not complete
	private String[] getRandomDepartAndArriveCityNames(){
		
		String[][] strRandomDepartArriveCityName = {
				{"Mumbai",		"Nasik"},
				{"Hyderabad",	"Ananthapur"},
				{"Bangalore",	"Mysore"},
				{"Bangalore",	"Hubli"},
				{"Ahmedabad",	"Surat"},
				{"Lucknow",		"Delhi"},
				{"Chennai",		"Coimbatore"},
				{"Kochi",		"Thiruvananthapuram"},
				{"Hyderabad",	"Vizag"},
				{"Kolkata",		"Durgapur"},
				{"Goa",			"Mumbai"},
				{"Mumbai",		"Pune"},
				{"Goa",			"Hyderabad"},
				{"Kolkata",		"Bhubaneswar"},
				{"Chennai",		"Madurai"},
				{"Delhi",		"Lucknow"}
		};
		
		int nRandomIndex = ClsGeneralInitTerminateAndOtherUtil.getPositiveRandomNumberBetweenRange(0, strRandomDepartArriveCityName.length-1);
		return new String[]{strRandomDepartArriveCityName[nRandomIndex][0], 
						strRandomDepartArriveCityName[nRandomIndex][1]};

//		return new String[]{"Goa","Hyderabad"};
//		return new String[]{"Lucknow","Delhi"};
//		return new String[]{"Mumbai","Pune"};
//		return new String[]{"Kolkata","Durgapur"};

		
	}

	private String[] getRandomCityNames(){
		
		String[] strRandomCityName =
				{"Mumbai",		"Hyderabad",
				"Bangalore", 	"Ahmedabad", 
				"Lucknow",		"Chennai",
				"Kochi",		"Kolkata"};
		return strRandomCityName;
	}

	
	

}
