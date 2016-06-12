package com.imademethink_webautomation.pkgAirlines_GoAir;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.json.JSONObject;

import com.imademethink_webautomation.UserManagement.ClsUserManagement;
import com.imademethink_webautomation.UtilGeneral.ClsGeneralInitTerminateAndOtherUtil;
import com.imademethink_webautomation.UtilSocialPlugin.ClsSocialPlugin;

public class clsGoAir extends ClsUserManagement{

	protected static String 			strURLHomePageGoAir 			= "http://www.goair.in";
	protected static String 			strURLMobileAppGoAir			= "";
	protected static String 			strHomePageTitle               	= "Cheapest Domestic Flight Tickets | Lowest/Cheap Air Tickets India - GoAir";
	public static boolean 				bGoAir_SingleScenarioResultStatus = false;
	public String 						strHomePageAttributeGlobal     	= "";
	public String 						strAttributeExpectedGlobal     	= "";
	private String[] 					strArrRandomDepaartAndArriveCityNames_Global;
	private JSONObject 					objJSON_GoAirAdultPassangerDetails 			= new JSONObject();
//	private JSONObject 					objJSON_GoAirInfantPassangerDetails			= new JSONObject();
//	private JSONObject 					objJSON_GoAirChildPassangerDetails			= new JSONObject();
//	private JSONObject 					objJSON_GoAir_DummyCreditCardDetails_Visa 	= new JSONObject();
	private JSONObject 					objJSON_GoAir_DummyCreditCardDetails_All 	= new JSONObject();	
	private JSONObject 					objJSON_GoAir_DummyBankingDetails_All 	  	= new JSONObject();	


	public void GoAir_InitilizeForThisWebsiteSpecificItems() {

		System.out.println("DEBUG:    Initilize GoAir website specific items");
		strArrRandomDepaartAndArriveCityNames_Global= getRandomFlightDepartAndArriveCityNames();
		objJSON_GoAirAdultPassangerDetails 			= getGoAirAdultPassangerDetails();
//		objJSON_GoAirInfantPassangerDetails 		= getGoAirInfantPassangerDetails();
//		objJSON_GoAirChildPassangerDetails			= getGoAirChildPassangerDetails();
//		objJSON_GoAir_DummyCreditCardDetails_Visa 	= getGoAirDummyCardDetails_Visa();
		objJSON_GoAir_DummyCreditCardDetails_All 	= getGoAirDummyCardDetails_All();
		objJSON_GoAir_DummyBankingDetails_All		= getGoAirDummyBankingDetails_All();
	}
	
	public void GoAir_TerminateForThisWebsiteSpecificItems() {

		System.out.println("DEBUG:    Terminate GoAir website specific items");
		objJSON_GoAirAdultPassangerDetails 			= null;
//		objJSON_GoAirInfantPassangerDetails			= null;
//		objJSON_GoAirChildPassangerDetails			= null;
//		objJSON_GoAir_DummyCreditCardDetails_Visa 	= null;
		objJSON_GoAir_DummyCreditCardDetails_All  	= null;
		objJSON_GoAir_DummyBankingDetails_All		= null;
	}
	
	public void GoAir_Validate_Home_Page_Attributes(String strHomePageAttribute, String strAttributeExpected){
		
		System.out.println("DEBUG:    Comparing actual and expected attribute for: " + strHomePageAttribute);
		
		strHomePageAttributeGlobal  				= strHomePageAttribute;
		strAttributeExpectedGlobal  				= strAttributeExpected;
		// do not remove below line
		bGoAir_SingleScenarioResultStatus 			= false;

		switch (strHomePageAttribute) {
			case "home page URL":
				if(		GoAir_Compare_Main_Page_URL_with_Reference_Home_Page_URL(strCurrentPageURL,strAttributeExpected)   )
					bGoAir_SingleScenarioResultStatus = true;
				break;
			case "home page title":
				if(		GoAir_Compare_Main_Page_Title_with_Reference_Home_Page_Title(strCurrentPageTitle,strAttributeExpected)    )
					bGoAir_SingleScenarioResultStatus = true;
				break;
			case "home page logo":
				if(		GoAir_Compare_Main_Page_Logo_with_Reference_Home_Page_Logo(strAttributeExpected)    )
					bGoAir_SingleScenarioResultStatus = true;
				break;
			case "home page loading time":
				if(		GoAir_Compare_Actual_and_Reference_HomePage_Load_Time()    )
					bGoAir_SingleScenarioResultStatus = true;
				break;
				
			case "important home page elements":
				if(		GoAir_Validate_Important_HomePage_Elements(strAttributeExpected)       )
					bGoAir_SingleScenarioResultStatus = true;
				break;
					
			case "pop up":
				if(		GoAir_Popup_Handler(strAttributeExpected)       )
					bGoAir_SingleScenarioResultStatus = true;
				break;
				
			case "sign up":
				if (strAttributeExpected.contains("NA")){
					System.out.println("DEBUG:    Verification of following attribute is NA: " + strAttributeExpected);
					bGoAir_SingleScenarioResultStatus = true;
				}
				else if ( GoAir_Validate_SignUp(strAttributeExpected)		       )
					bGoAir_SingleScenarioResultStatus = true;
				break;
			case "sign in":
				if (strAttributeExpected.contains("NA")){
					System.out.println("DEBUG:    Verification of following attribute is NA: " + strAttributeExpected);
					bGoAir_SingleScenarioResultStatus = true;
				}
				else if ( GoAir_Validate_SignIn(strAttributeExpected)		       )
					bGoAir_SingleScenarioResultStatus = true;
				break;
		
			case "social plugin facebook":
			case "social plugin twitter":
			case "social plugin googleplus":
			case "social plugin instagram":
				if(		GoAir_SocialPluginHandler(strAttributeExpected)       )
					bGoAir_SingleScenarioResultStatus = true;
				break;
		
			case "home page other web elements":
				if(		GoAir_Validate_HomePage_Other_WebElements(strAttributeExpected)       )
					bGoAir_SingleScenarioResultStatus = true;
				break;
										
			case "mobile app download check":
				if(		GoAir_Validate_MobileApplication_Links(strAttributeExpected)       )
					bGoAir_SingleScenarioResultStatus = true;
				break;

		default:
			System.out.println("ERROR:    Unsupported attribute to validate: " + strHomePageAttribute);
			objSoftAssert.fail("ERROR:    Unsupported attribute to validate: " + strHomePageAttribute);
			break;
		}
		
	}

	public void GoAir_Validate_Home_Page_Elements_GUI_Options(String strCategoryName, String strGUIOptionList){
		
		System.out.println("DEBUG:    Comparing actual and expected elements for: " + strCategoryName);
		
		strHomePageAttributeGlobal  				= strCategoryName;
		strAttributeExpectedGlobal  				= strGUIOptionList;
		// do not remove below line
		bGoAir_SingleScenarioResultStatus 			= false;

		switch (strCategoryName) {
			case "Book Flight":
				if(		objPageGoAirMain.GoAir_Validate_HomePageGUIElements_for_BookFlight(strGUIOptionList) )
					bGoAir_SingleScenarioResultStatus = true;
				break;
			case "Web Check-in":
				if(		objPageGoAirMain.GoAir_Validate_HomePageGUIElements_for_WebCheckIn(strGUIOptionList)    )
					bGoAir_SingleScenarioResultStatus = true;
				break;
			case "Manage Bookings":
				if(		objPageGoAirMain.GoAir_Validate_HomePageGUIElements_for_ManageBooking(strGUIOptionList)    )
					bGoAir_SingleScenarioResultStatus = true;
				break;
			case "Flight Status":
				if(		objPageGoAirMain.GoAir_Validate_HomePageGUIElements_for_FlightStatus(strGUIOptionList)   )
					bGoAir_SingleScenarioResultStatus = true;
				break;
			case "Flight Schedule":
			case "Route Map":
				if(		objPageGoAirMain.GoAir_Validate_HomePageGUIElements_for_FlightScheduleOrRouteMap(strGUIOptionList)    )
					bGoAir_SingleScenarioResultStatus = true;
				break;
			case "Bottom options bar":
				if(		objPageGoAirMain.GoAir_Validate_HomePageGUIElements_for_BottomOtionsBar(strGUIOptionList)    )
					bGoAir_SingleScenarioResultStatus = true;
				break;
			default:
				System.out.println("ERROR:    Unsupported element to validate: " + strCategoryName);
				objSoftAssert.fail("ERROR:    Unsupported element to validate: " + strCategoryName);
				break;
		}
		
	}
	
	public void GoAir_Validate_Plan_my_trip_sub_page_elements(String strCategoryName, String strGUIOptionList){
		
		System.out.println("DEBUG:    Comparing actual and expected elements for: " + strCategoryName);
		
		strHomePageAttributeGlobal  				= strCategoryName;
		strAttributeExpectedGlobal  				= strGUIOptionList;
		// do not remove below line
		bGoAir_SingleScenarioResultStatus 			= false;

		switch (strCategoryName) {
			case "Manage Bookings":
				if(		objPageGoAirPage0PlanMyTrip.GoAir_Validate_PlanMyTripSubPageElements_for_ManageBooking(strGUIOptionList) )
					bGoAir_SingleScenarioResultStatus = true;
				break;
			case "Web Check-In":
				if(		objPageGoAirPage0PlanMyTrip.GoAir_Validate_PlanMyTripSubPageElements_for_WebCheckIn(strGUIOptionList) )
					bGoAir_SingleScenarioResultStatus = true;
				break;
			case "Flight Status":
				if(		objPageGoAirPage0PlanMyTrip.GoAir_Validate_PlanMyTripSubPageElements_for_FlightStatus(strGUIOptionList) )
					bGoAir_SingleScenarioResultStatus = true;
				break;
			case "Travel Guide":
				if(		objPageGoAirPage0PlanMyTrip.GoAir_Validate_PlanMyTripSubPageElements_for_TravelGuide(strGUIOptionList) )
					bGoAir_SingleScenarioResultStatus = true;
				break;
			case "Route Map":
				if(		objPageGoAirPage0PlanMyTrip.GoAir_Validate_PlanMyTripSubPageElements_for_RouteMap(strGUIOptionList) )
					bGoAir_SingleScenarioResultStatus = true;
				break;
			case "Group Bookings":
				if(		objPageGoAirPage0PlanMyTrip.GoAir_Validate_PlanMyTripSubPageElements_for_GroupBookings(strGUIOptionList) )
					bGoAir_SingleScenarioResultStatus = true;
				break;
			case "Flight Schedule":
				if(		objPageGoAirPage0PlanMyTrip.GoAir_Validate_PlanMyTripSubPageElements_for_FlightSchedule(strGUIOptionList) )
					bGoAir_SingleScenarioResultStatus = true;
				break;
			case "Charters":
				if(		objPageGoAirPage0PlanMyTrip.GoAir_Validate_PlanMyTripSubPageElements_for_Charters(strGUIOptionList) )
					bGoAir_SingleScenarioResultStatus = true;
				break;
			default:
				System.out.println("ERROR:    Unsupported element to validate: " + strCategoryName);
				objSoftAssert.fail("ERROR:    Unsupported element to validate: " + strCategoryName);
				break;
		}
	}
	
	public void GoAir_Validate_Promotions_sub_page_elements(String strCategoryName, String strGUIOptionList){
		
		System.out.println("DEBUG:    Comparing actual and expected elements for: " + strCategoryName);
		
		strHomePageAttributeGlobal  				= strCategoryName;
		strAttributeExpectedGlobal  				= strGUIOptionList;
		// do not remove below line
		bGoAir_SingleScenarioResultStatus 			= false;

		switch (strCategoryName) {
			case "Defence Promotion":
				if(		objPageGoAirPage1Promotions.GoAir_Validate_PromotionsSubPageElements_for_DefencePromotion(strGUIOptionList) )
					bGoAir_SingleScenarioResultStatus = true;
				break;
			case "Additional Flight":
				if(		objPageGoAirPage1Promotions.GoAir_Validate_PromotionsSubPageElements_for_AdditionalFlight(strGUIOptionList) )
					bGoAir_SingleScenarioResultStatus = true;
				break;
			default:
				System.out.println("ERROR:    Unsupported element to validate: " + strCategoryName);
				objSoftAssert.fail("ERROR:    Unsupported element to validate: " + strCategoryName);
				break;
		}
	}

	public void GoAir_Validate_Services_sub_page_elements(String strCategoryName, String strGUIOptionList){
		
		System.out.println("DEBUG:    Comparing actual and expected elements for: " + strCategoryName);
		
		strHomePageAttributeGlobal  				= strCategoryName;
		strAttributeExpectedGlobal  				= strGUIOptionList;
		// do not remove below line
		bGoAir_SingleScenarioResultStatus 			= false;

		switch (strCategoryName) {
			case "SMS Services":
				if(		objPageGoAirPage2Services.GoAir_Validate_ServicesSubPageElements_for_SMSServices(strGUIOptionList) )
					bGoAir_SingleScenarioResultStatus = true;
				break;
			case "Inflight Menu":
				if(		objPageGoAirPage2Services.GoAir_Validate_ServicesSubPageElements_for_InflightMenu(strGUIOptionList) )
					bGoAir_SingleScenarioResultStatus = true;
				break;
			case "Priority Check-in":
				if(		objPageGoAirPage2Services.GoAir_Validate_ServicesSubPageElements_for_PriorityCheckIn(strGUIOptionList) )
					bGoAir_SingleScenarioResultStatus = true;
				break;
			case "Pre-Book Seats":
				if(		objPageGoAirPage2Services.GoAir_Validate_ServicesSubPageElements_for_PreBookSeats(strGUIOptionList) )
					bGoAir_SingleScenarioResultStatus = true;
				break;
			default:
				System.out.println("ERROR:    Unsupported element to validate: " + strCategoryName);
				objSoftAssert.fail("ERROR:    Unsupported element to validate: " + strCategoryName);
				break;
		}
	}

	public void GoAir_Validate_Go_Business_sub_page_elements(String strGUIOptionList){
		
		System.out.println("DEBUG:    Comparing actual and expected elements for: " + "Go Business");
		
		strAttributeExpectedGlobal  		= strGUIOptionList;
		// do not remove below line
		bGoAir_SingleScenarioResultStatus 	= false;

		bGoAir_SingleScenarioResultStatus 	= objPageGoAir99General.GoAir_Validate_GoBusinessSubPageElements(strGUIOptionList);

	}
	
	public void GoAir_Validate_Go_Holidays_sub_page_elements(String strGUIOptionList){
		
		System.out.println("DEBUG:    Comparing actual and expected elements for: " + "Go Holidays");
		
		strAttributeExpectedGlobal  		= strGUIOptionList;
		// do not remove below line
		bGoAir_SingleScenarioResultStatus 	= false;

		bGoAir_SingleScenarioResultStatus 	= objPageGoAir99General.GoAir_Validate_GoHolidaysSubPageElements(strGUIOptionList);

	}
	
	public void GoAir_Validate_Careers_sub_page_elements(String strGUIOptionList){
		
		System.out.println("DEBUG:    Comparing actual and expected elements for: " + "Careers");
		
		strAttributeExpectedGlobal  		= strGUIOptionList;
		// do not remove below line
		bGoAir_SingleScenarioResultStatus 	= false;

		bGoAir_SingleScenarioResultStatus 	= objPageGoAir99General.GoAir_Validate_CareersSubPageElements(strGUIOptionList);
	}

	public void GoAir_User_Perform_Simple_Valid_Flight_Search_With_Default_Paraeters_For_One_Way_Flight_Type_Until_Payment_Section(){
		
		System.out.println("DEBUG:    User performs simple valid flight search with default paramaters");
		
		bGoAir_SingleScenarioResultStatus = 
				objPageGoAirMain.GoAir_Perform_Simple_Valid_Flight_Search_With_Default_Paramaters(strArrRandomDepaartAndArriveCityNames_Global);
		
		if(bGoAir_SingleScenarioResultStatus){			System.out.println("RESULT::PASS");}
		else{
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Simple valid flight search step failed");
			objSoftAssert.fail("ERROR:    Simple valid flight search step failed");
		}
	}
	
	public void GoAir_Validate_Basic_Search_Result_Information(String strSearchResultInformationIemsToCheck){

		System.out.println("DEBUG:    User validates basic search result information for: " + strSearchResultInformationIemsToCheck);
		
		// check result of earlier step
		if (! bGoAir_SingleScenarioResultStatus){
			System.out.println("ERROR:    Simple valid flight search step failed before proceeding for basic search result information check: " + strSearchResultInformationIemsToCheck);
			objSoftAssert.fail("ERROR:    Simple valid flight search step failed before proceeding for basic search result information check: " + strSearchResultInformationIemsToCheck);
			return;
		}

		bGoAir_SingleScenarioResultStatus = 
				objPageGoAirResult2SelectDate.GoAir_Validate_BasicSearchInformation(strSearchResultInformationIemsToCheck);
		
		if(bGoAir_SingleScenarioResultStatus){			System.out.println("RESULT::PASS");}
		else{
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Basic search result information check failed");
			objSoftAssert.fail("ERROR:    Basic search result information check failed");
		}
	}

	public void GoAir_User_Validates_End_To_End_Valid_Flight_Search__TYPE1__With_Default_Paameters(String strEndToEndFlightSearchScenario__TYPE1){
		
		strEndToEndFlightSearchScenario__TYPE1 = strEndToEndFlightSearchScenario__TYPE1.split(" ")[0].trim();
		System.out.println("DEBUG:    User validates end to end flight search scenario for: " + strEndToEndFlightSearchScenario__TYPE1);

		// check result of earlier step
		if (! bGoAir_SingleScenarioResultStatus){
			System.out.println("ERROR:    Simple valid flight search step failed before proceeding for end to end scenario: " + strEndToEndFlightSearchScenario__TYPE1);
			objSoftAssert.fail("ERROR:    Simple valid flight search step failed before proceeding for end to end scenario: " + strEndToEndFlightSearchScenario__TYPE1);
			return;
		}
		
		switch(strEndToEndFlightSearchScenario__TYPE1){
		case "type_first_01":
			// "type_first_01 type_first_01 Select first search result and enter user details and continue
			if (bGoAir_SingleScenarioResultStatus)
				{bGoAir_SingleScenarioResultStatus = 
					objPageGoAirResult2SelectDate.GoAir_Validate_EndToEnd_Search_Scenario__TYPE1_CASE1();}
			if (bGoAir_SingleScenarioResultStatus)
				{bGoAir_SingleScenarioResultStatus = 
						objPageGoAirResult3ServicesAndPassengerDetail.GoAir_Validate_EndToEnd_Search_Scenario__TYPE1_CASE1(objJSON_GoAirAdultPassangerDetails);}
			break;

		case "type_first_02":
			// type_first_02 Modify search and book return ticket and select first search result and cancel the same
			if (bGoAir_SingleScenarioResultStatus)
				{bGoAir_SingleScenarioResultStatus = 
				objPageGoAirResult2SelectDate.GoAir_Validate_EndToEnd_Search_Scenario__TYPE1_CASE2(objPageGoAirMain.GoAir_getFormattedFullDatefor_NextSunday());}
			if (bGoAir_SingleScenarioResultStatus)
				{bGoAir_SingleScenarioResultStatus = 
						objPageGoAirResult3ServicesAndPassengerDetail.GoAir_Validate_EndToEnd_Search_Scenario__TYPE1_CASE2();}
			break;
			
		case "type_first_03":
			// type_first_03 Select first search result and select special seat and book the ticket until payment section
			if (bGoAir_SingleScenarioResultStatus)
				{bGoAir_SingleScenarioResultStatus = 
					objPageGoAirResult2SelectDate.GoAir_Validate_EndToEnd_Search_Scenario__TYPE1_CASE3();}
			if (bGoAir_SingleScenarioResultStatus)
				{bGoAir_SingleScenarioResultStatus = 
					objPageGoAirResult3ServicesAndPassengerDetail.GoAir_Validate_EndToEnd_Search_Scenario__TYPE1_CASE3(objJSON_GoAirAdultPassangerDetails);}
			if (bGoAir_SingleScenarioResultStatus)
				{bGoAir_SingleScenarioResultStatus = 
						objPageGoAirResult4SeatAssignment.GoAir_Validate_EndToEnd_Search_Scenario__TYPE1_CASE3();}
			break;
			
		case "type_first_04":
			// type_first_04 Select first search result from Premium quota and cancel the same
			if (bGoAir_SingleScenarioResultStatus)
				{bGoAir_SingleScenarioResultStatus = 
					objPageGoAirResult2SelectDate.GoAir_Validate_EndToEnd_Search_Scenario__TYPE1_CASE4();}
			if (bGoAir_SingleScenarioResultStatus)
				{bGoAir_SingleScenarioResultStatus = 
					objPageGoAirResult3ServicesAndPassengerDetail.GoAir_Validate_EndToEnd_Search_Scenario__TYPE1_CASE4();}
			break;

		case "type_first_05":
			//  type_first_05 Navigate to next day and select first search result from Premium quota and cancel the same
			if (bGoAir_SingleScenarioResultStatus)
				{bGoAir_SingleScenarioResultStatus = 
					objPageGoAirResult2SelectDate.GoAir_Validate_EndToEnd_Search_Scenario__TYPE1_CASE5();}
			if (bGoAir_SingleScenarioResultStatus)
				{bGoAir_SingleScenarioResultStatus = 
					objPageGoAirResult3ServicesAndPassengerDetail.GoAir_Validate_EndToEnd_Search_Scenario__TYPE1_CASE5();}
			break;
		default:
			System.out.println("ERROR:    This end to end flight search scenarion case is not supported: " + strEndToEndFlightSearchScenario__TYPE1);
			break;
		}

		if(bGoAir_SingleScenarioResultStatus){			System.out.println("RESULT::PASS");}
		else{
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    End to end valid flight search TYPE1 failed");
			objSoftAssert.fail("ERROR:    End to end valid flight search TYPE1 failed");
		}
		
	}

	public void GoAir_User_Validates_End_To_End_Valid_Flight_Search__TYPE3__With_Default_Paameters(String strEndToEndFlightSearchScenario__TYPE3){
		
		strEndToEndFlightSearchScenario__TYPE3 = strEndToEndFlightSearchScenario__TYPE3.split(" ")[0].trim();
		System.out.println("DEBUG:    User validates end to end flight search scenario for: " + strEndToEndFlightSearchScenario__TYPE3);

		// check result of 
		if (! bGoAir_SingleScenarioResultStatus){
			System.out.println("ERROR:    Simple valid flight search step failed before proceeding for end to end scenario: " + strEndToEndFlightSearchScenario__TYPE3);
			objSoftAssert.fail("ERROR:    Simple valid flight search step failed before proceeding for end to end scenario: " + strEndToEndFlightSearchScenario__TYPE3);
			return;
		}
		
		switch(strEndToEndFlightSearchScenario__TYPE3){
		case "type_third_01":
			// type_third_01 Sort results by departure time in ascending order and book the first ticket until payment section
			if (bGoAir_SingleScenarioResultStatus)
				{bGoAir_SingleScenarioResultStatus = 
					objPageGoAirResult2SelectDate.GoAir_Validate_EndToEnd_Search_Scenario__TYPE3_CASE1();}
			if (bGoAir_SingleScenarioResultStatus)
				{bGoAir_SingleScenarioResultStatus = 
					objPageGoAirResult3ServicesAndPassengerDetail.GoAir_Validate_EndToEnd_Search_Scenario__TYPE3_CASE1(objJSON_GoAirAdultPassangerDetails);}
			if (bGoAir_SingleScenarioResultStatus)
				{bGoAir_SingleScenarioResultStatus = 
					objPageGoAirResult4SeatAssignment.GoAir_Validate_EndToEnd_Search_Scenario__TYPE3_CASE1();}
			break;

		case "type_third_02":
			// type_third_02 Sort results by GoSmart in descending order and book last ticket from until payment section
			if (bGoAir_SingleScenarioResultStatus)
				{bGoAir_SingleScenarioResultStatus = 
					objPageGoAirResult2SelectDate.GoAir_Validate_EndToEnd_Search_Scenario__TYPE3_CASE2();}
			if (bGoAir_SingleScenarioResultStatus)
				{bGoAir_SingleScenarioResultStatus = 
					objPageGoAirResult3ServicesAndPassengerDetail.GoAir_Validate_EndToEnd_Search_Scenario__TYPE3_CASE2(objJSON_GoAirAdultPassangerDetails);}
			if (bGoAir_SingleScenarioResultStatus)
				{bGoAir_SingleScenarioResultStatus = 
					objPageGoAirResult4SeatAssignment.GoAir_Validate_EndToEnd_Search_Scenario__TYPE3_CASE2();}
			break;
			
		case "type_third_03":
			// type_third_03 Sort results by duration in ascending order and book first ticket and choose middle seat
			if (bGoAir_SingleScenarioResultStatus)
				{bGoAir_SingleScenarioResultStatus = 
					objPageGoAirResult2SelectDate.GoAir_Validate_EndToEnd_Search_Scenario__TYPE3_CASE3();}
			if (bGoAir_SingleScenarioResultStatus)
				{bGoAir_SingleScenarioResultStatus = 
					objPageGoAirResult3ServicesAndPassengerDetail.GoAir_Validate_EndToEnd_Search_Scenario__TYPE3_CASE3(objJSON_GoAirAdultPassangerDetails);}
			if (bGoAir_SingleScenarioResultStatus)
				{bGoAir_SingleScenarioResultStatus = 
					objPageGoAirResult4SeatAssignment.GoAir_Validate_EndToEnd_Search_Scenario__TYPE3_CASE3();}
			break;
			
		case "type_third_04":
			// type_third_04 For next day sort results by duration in descending order and enter user details
			if (bGoAir_SingleScenarioResultStatus)
				{bGoAir_SingleScenarioResultStatus = 
					objPageGoAirResult2SelectDate.GoAir_Validate_EndToEnd_Search_Scenario__TYPE3_CASE4();}
			if (bGoAir_SingleScenarioResultStatus)
				{bGoAir_SingleScenarioResultStatus = 
					objPageGoAirResult3ServicesAndPassengerDetail.GoAir_Validate_EndToEnd_Search_Scenario__TYPE3_CASE4(objJSON_GoAirAdultPassangerDetails);}
			break;

		case "type_third_05":
			//  type_third_05 Sort results by stops in ascending order and go to next day book first ticket until payment section
			if (bGoAir_SingleScenarioResultStatus)
				{bGoAir_SingleScenarioResultStatus = 
					objPageGoAirResult2SelectDate.GoAir_Validate_EndToEnd_Search_Scenario__TYPE3_CASE5();}
			if (bGoAir_SingleScenarioResultStatus)
				{bGoAir_SingleScenarioResultStatus = 
					objPageGoAirResult3ServicesAndPassengerDetail.GoAir_Validate_EndToEnd_Search_Scenario__TYPE3_CASE5(objJSON_GoAirAdultPassangerDetails);}
			if (bGoAir_SingleScenarioResultStatus)
				{bGoAir_SingleScenarioResultStatus = 
					objPageGoAirResult4SeatAssignment.GoAir_Validate_EndToEnd_Search_Scenario__TYPE3_CASE5();}
			break;
			
		case "type_third_06":
			//  type_third_06 Sort results by stops in descending order and book last ticket and choose seat from highest quota
			if (bGoAir_SingleScenarioResultStatus)
				{bGoAir_SingleScenarioResultStatus = 
					objPageGoAirResult2SelectDate.GoAir_Validate_EndToEnd_Search_Scenario__TYPE3_CASE6();}
			if (bGoAir_SingleScenarioResultStatus)
				{bGoAir_SingleScenarioResultStatus = 
					objPageGoAirResult3ServicesAndPassengerDetail.GoAir_Validate_EndToEnd_Search_Scenario__TYPE3_CASE6(objJSON_GoAirAdultPassangerDetails);}
			if (bGoAir_SingleScenarioResultStatus)
				{bGoAir_SingleScenarioResultStatus = 
					objPageGoAirResult4SeatAssignment.GoAir_Validate_EndToEnd_Search_Scenario__TYPE3_CASE6();}
			break;
			
		case "type_third_07":
			//  type_third_07 Sort results by non sold out category of price in ascending order and change search
			if (bGoAir_SingleScenarioResultStatus)
				{bGoAir_SingleScenarioResultStatus = 
					objPageGoAirResult2SelectDate.GoAir_Validate_EndToEnd_Search_Scenario__TYPE3_CASE7();}
			break;

		case "type_third_08":
			//  type_third_08 Sort business class results by price in descending order and book first ticket until payment section
			if (bGoAir_SingleScenarioResultStatus)
				{bGoAir_SingleScenarioResultStatus = 
					objPageGoAirResult2SelectDate.GoAir_Validate_EndToEnd_Search_Scenario__TYPE3_CASE8();}
			if (bGoAir_SingleScenarioResultStatus)
				{bGoAir_SingleScenarioResultStatus = 
					objPageGoAirResult3ServicesAndPassengerDetail.GoAir_Validate_EndToEnd_Search_Scenario__TYPE3_CASE6(objJSON_GoAirAdultPassangerDetails);}
			if (bGoAir_SingleScenarioResultStatus)
				{bGoAir_SingleScenarioResultStatus = 
					objPageGoAirResult4SeatAssignment.GoAir_Validate_EndToEnd_Search_Scenario__TYPE3_CASE8();}
			break;

		default:
			System.out.println("ERROR:    This end to end flight search scenarion case is not supported: " + strEndToEndFlightSearchScenario__TYPE3);
			break;
		}

		if(bGoAir_SingleScenarioResultStatus){			System.out.println("RESULT::PASS");}
		else{
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    End to end valid flight search TYPE3 failed");
			objSoftAssert.fail("ERROR:    End to end valid flight search TYPE3 failed");
		}
		
	}
	
	public void GoAir_User_Perform_Simple_Valid_Flight_Search_With_Default_Paraeters_Until_Payment_Section$(){
		
		System.out.println("DEBUG:    User performs simple valid flight search with default paramaters until payment section");
		
		bGoAir_SingleScenarioResultStatus = 
				objPageGoAirMain.GoAir_Perform_Simple_Valid_Flight_Search_2Way(strArrRandomDepaartAndArriveCityNames_Global);

		if (bGoAir_SingleScenarioResultStatus){
				bGoAir_SingleScenarioResultStatus = 	
						objPageGoAirResult2SelectDate.GoAir_Common_Continue_On_DateSelectionPage();
		}
		if (bGoAir_SingleScenarioResultStatus){
				bGoAir_SingleScenarioResultStatus = 	
						objPageGoAirResult3ServicesAndPassengerDetail.GoAir_Validate_Common_Passenger_Details_Filling_Scenario(objJSON_GoAirAdultPassangerDetails);
		}
		if (bGoAir_SingleScenarioResultStatus){
			bGoAir_SingleScenarioResultStatus = 	
					objPageGoAirResult4SeatAssignment.GoAir_Validate_Skip_Seat_Selection_Scenario();
		}

		if(bGoAir_SingleScenarioResultStatus){			System.out.println("RESULT::PASS");}
		else{
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Simple valid flight search step failed");
			objSoftAssert.fail("ERROR:    Simple valid flight search step failed");
		}
		
	}
	
	public void GoAir_User_Initiats_Payment_Method(String strPaymentMethodType){
		
		if( ! bGoAir_SingleScenarioResultStatus){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Can not initiate payment processing as earlier step failed");
			objSoftAssert.fail("ERROR:    Can not initiate payment processing as earlier step failed");
			return;
		}

		System.out.println("DEBUG:    Initiating following method of payment: " + strPaymentMethodType);

		if (strPaymentMethodType.contains("Credit_card_type") ){
			bGoAir_SingleScenarioResultStatus = objPageGoAirResult5Payment.
					GoAir_Validate_Payment_Methods_CardPayment(strPaymentMethodType, objJSON_GoAir_DummyCreditCardDetails_All);}
		
		if (strPaymentMethodType.contains("Debit_card_type") ){
		bGoAir_SingleScenarioResultStatus = objPageGoAirResult5Payment.
					GoAir_Validate_Payment_Methods_CardPayment(strPaymentMethodType, objJSON_GoAir_DummyCreditCardDetails_All);}

		if (strPaymentMethodType.contains("Netbanking_type") ){
			bGoAir_SingleScenarioResultStatus = objPageGoAirResult5Payment.
					GoAir_Validate_Payment_Methods_BankTransfer(strPaymentMethodType, objJSON_GoAir_DummyBankingDetails_All);}
		
		if (bGoAir_SingleScenarioResultStatus) 		System.out.println("RESULT::PASS");
	    else {
	    		System.out.println("RESULT::FAIL");
	    		System.out.println("ERROR:    Initiating payment processing failed");
	    		objSoftAssert.fail("ERROR:    Initiating payment processing failed");
	    }
		
	}
	
	public void GoAir_User_Validates_Offers(String strOfferToCheck){
		
		System.out.println("DEBUG:    User validates following offer: " + strOfferToCheck);

		bGoAir_SingleScenarioResultStatus = 
				objPageGoAirMain.GoAir_Validate_This_Offer(strOfferToCheck);
		
		if(bGoAir_SingleScenarioResultStatus){			System.out.println("RESULT::PASS");}
		else{
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Offer validation step failed");
			objSoftAssert.fail("ERROR:    Offer validation step failed");
		}		
	}
	
	public void GoAir_User_Validates_SupportFunctionality(String strSupportFunctionality){
		System.out.println("DEBUG:    User validates following supportFunctionality: " + strSupportFunctionality);

		bGoAir_SingleScenarioResultStatus = 
				objPageGoAirMain.GoAir_Validate_This_SupportFunctionality(strSupportFunctionality);
		
		if(bGoAir_SingleScenarioResultStatus){			System.out.println("RESULT::PASS");}
		else{
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Support functionality step step failed");
			objSoftAssert.fail("ERROR:    Support functionality step step failed");
		}
	}
	
	public void GoAir_User_Validates_Specific_Other_Items(String strSpecificOtherItems){
		
		System.out.println("DEBUG:    User validates following specific other item: " + strSpecificOtherItems);
		strSpecificOtherItems = strSpecificOtherItems.replace("Validate__", "").trim();

		bGoAir_SingleScenarioResultStatus = 
				objPageGoAir99General.GoAir_Validate_Specific_Other_Item(strSpecificOtherItems);
		
		if(bGoAir_SingleScenarioResultStatus){			System.out.println("RESULT::PASS");}
		else{
    		System.out.println("RESULT::FAIL");
    		System.out.println("ERROR:    Specific other item functionality validation step failed");
    		objSoftAssert.fail("ERROR:    Specific other item functionality validation step failed");
		}
	}
	
	public void GoAir_User_Navigates_Between_Different_Pages(String strNavigateToThisPage){
	      
		System.out.println("DEBUG:    User navigates to this page: " + strNavigateToThisPage);

		bGoAir_SingleScenarioResultStatus = 
						objPageGoAirMain.GoAir_Perform_SimpleActivity_and_NavigateToThisPage(strNavigateToThisPage);

		if (bGoAir_SingleScenarioResultStatus) 		System.out.println("RESULT::PASS");
	    else {
	    		System.out.println("RESULT::FAIL");
	    		System.out.println("ERROR:    Support functionality validation step failed");
	    		objSoftAssert.fail("ERROR:    Support functionality validation step failed");
	    }		
	}
	
	public void GoAir_User_Validates_Consistency_of_Common_Web_Elements(String strConsistantElements){

		if( ! bGoAir_SingleScenarioResultStatus){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Can not validate consistancy of common web element as earlier step failed");
			objSoftAssert.fail("ERROR:    Can not validate consistancy of common web element as earlier step failed");
			return;
		}

		String[]  strAryOfConsistantWebElements = splitThisString(strConsistantElements," __ ");

		for(String strSingleConsistantWebElement : strAryOfConsistantWebElements ){
			System.out.println("DEBUG:    Validating following consistant web element::" + strSingleConsistantWebElement);

			if ( objPageGoAir99General.GoAir_validate_This_Element(strSingleConsistantWebElement) ){
				System.out.println("RESULT::PASS");
			}else{
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Validation failed for following consistant web element: " + strSingleConsistantWebElement);
				objSoftAssert.fail("ERROR:    Validation failed for following consistant web element: " + strSingleConsistantWebElement);
			}
		}
	}
	
	public void GoAir_User_Validates_Home_Page_Other_Attributes(String strHomePageOtherItems,String strHomePageOtherItemsExpectedAttribute){
		System.out.println("DEBUG:    This is unimplemented for now. Coming soon....");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void GoAir_Validate_Test_Result(){
		if (bGoAir_SingleScenarioResultStatus)
			System.out.println("RESULT::OVERALL PASS for current test scenario");	
		else{
			System.out.println("RESULT::OVERALL *****FAIL***** for current test scenario");		
			objSoftAssert.fail("RESULT::OVERALL *****FAIL***** for current test scenario");
			objSoftAssert.assertAll();  }
	}
	
	
	
	
	
	
	
	// Helper methods
	
	// compare main page url with reference home page URL
	public boolean GoAir_Compare_Main_Page_URL_with_Reference_Home_Page_URL(String strMainPageURL, String strRefHomePageURL){

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
	public boolean GoAir_Compare_Main_Page_Title_with_Reference_Home_Page_Title(String strMainPageTitle, String strRefHomePageTitle){

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

	public boolean GoAir_Compare_Actual_and_Reference_HomePage_Load_Time(){
		return compare_Actual_and_Reference_HomePage_Load_Time();
	}
	
	public boolean GoAir_Validate_Important_HomePage_Elements(String strHomePageElementsUnderTest){

		String[]  strAryOfWebElements = splitThisString(strHomePageElementsUnderTest," __ ");
		boolean bLocalTestResultStatus = true;
		
		for(String strSingleWebElement : strAryOfWebElements ){
			System.out.println("DEBUG:    Validating following home page web element::" + strSingleWebElement);
			
			if ( objPageGoAirMain.GoAir_validate_This_Element(strSingleWebElement) ){
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
	
	public boolean GoAir_Validate_SignUp(String strSignUp_Activity){
		// coming soon
		System.out.println("DEBUG:    Sign up is currently not supported");
		return true;
	}
	
	public boolean GoAir_Validate_SignIn(String strSignIn_Activity){
		// coming soon
		System.out.println("DEBUG:    Sign in is currently not supported");
		return true;
	}
	
	public boolean GoAir_SocialPluginHandler(String strSocialPluginType){
		boolean bLocalTestResultStatus = false;
		
		switch(strSocialPluginType){
		case "social_plugin__ facebook":
			if ( objPageGoAirMain.GoAir_SocialPlugin_Check_Facebook()    ){
					System.out.println("DEBUG:    Social plugin web element found for Facebook");
					if ( ClsSocialPlugin.social_Plugin_Handler_Facebook(objPropMngr.single_Property_Getter("strSocialPluginActionFacebook"))  )
							{bLocalTestResultStatus = true;}
			}else {
				System.out.println("ERROR:    Social plugin web element NOT found for Facebook");
				objSoftAssert.fail("ERROR:    Social plugin web element NOT found for Facebook");}
			break;
		case "social_plugin__ twitter":
			if ( objPageGoAirMain.GoAir_SocialPlugin_Check_Twitter()    ){
					System.out.println("DEBUG:    Social plugin web element found for Twitter");
					if ( ClsSocialPlugin.social_Plugin_Handler_Twitter(objPropMngr.single_Property_Getter("strSocialPluginActionTwitter"))    )
							{bLocalTestResultStatus = true;}
			}else {
				System.out.println("ERROR:    Social plugin web element NOT found for Twitter");
				objSoftAssert.fail("ERROR:    Social plugin web element NOT found for Twitter");}
			break;
		case "social_plugin__ googleplus":
			if ( objPageGoAirMain.GoAir_SocialPlugin_Check_Googleplus()    ){
				System.out.println("DEBUG:    Social plugin web element found for Googleplus");
				if ( ClsSocialPlugin.social_Plugin_Handler_Twitter(objPropMngr.single_Property_Getter("strSocialPluginActionGoogleplus"))    )
						{bLocalTestResultStatus = true;}
			}else {
				System.out.println("ERROR:    Social plugin web element NOT found for Googleplus");
				objSoftAssert.fail("ERROR:    Social plugin web element NOT found for Googleplus");}
			break;
		case "social_plugin__ instagram":
			if ( objPageGoAirMain.GoAir_SocialPlugin_Check_Instagram()    ){
				System.out.println("DEBUG:    Social plugin web element found for Instagram");
				if ( ClsSocialPlugin.social_Plugin_Handler_Twitter(objPropMngr.single_Property_Getter("strSocialPluginActionInstagram"))    )
						{bLocalTestResultStatus = true;}
			}else {
				System.out.println("ERROR:    Social plugin web element NOT found for Instagram");
				objSoftAssert.fail("ERROR:    Social plugin web element NOT found for Instagram");}
			break;
		case "NA":
		default :
			System.out.println("ERROR:    This social plug in is not supported: " + strSocialPluginType);
			objSoftAssert.fail("ERROR:    This social plug in is not supported: " + strSocialPluginType);
			break;
		}
		return bLocalTestResultStatus;
	}
	
	public boolean GoAir_Popup_Handler(String strPopupType_and_Action){
		return handle_General_Popup(strPopupType_and_Action);
	}
	
	public boolean GoAir_Validate_HomePage_Other_WebElements(String strOtherHomePageElementsUnderTest){

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

	public boolean GoAir_Validate_MobileApplication_Links(String strMobileApp_Types){

		boolean bLocalTestResultStatus = true;
		
		if (! ( strMobileApp_Types.contains("ios") ||
		        strMobileApp_Types.contains("android") ||
		        strMobileApp_Types.contains("blackberry") ||
		        strMobileApp_Types.contains("windows"))            ){
					System.out.println("ERROR:    Unsupported mobile application type");
					objSoftAssert.fail("ERROR:    Unsupported mobile application type");	return false; }
		
		if (strMobileApp_Types.contains("ios")){
			if (!GoAir_Verify_MobileAppWebsite_Navigation_and_Download_Installer(
					strURLMobileAppGoAir,"ios")){
				bLocalTestResultStatus = false;
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Mobile App webite navigation and download test failed for: " + "ios");
				objSoftAssert.fail("ERROR:    Mobile App webite navigation and download test failed for: " + "ios");}
		}
		if (strMobileApp_Types.contains("android")){
			if (!GoAir_Verify_MobileAppWebsite_Navigation_and_Download_Installer(
					strURLMobileAppGoAir,"android")){
				bLocalTestResultStatus = false;
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Mobile App webite navigation and download test failed for: " + "android");
				objSoftAssert.fail("ERROR:    Mobile App webite navigation and download test failed for: " + "android");}
		}
		if (strMobileApp_Types.contains("blackberry")){
			if (!GoAir_Verify_MobileAppWebsite_Navigation_and_Download_Installer(
					strURLMobileAppGoAir,"blackberry")){
				bLocalTestResultStatus = false;
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Mobile App webite navigation and download test failed for: " + "blackberry");
				objSoftAssert.fail("ERROR:    Mobile App webite navigation and download test failed for: " + "blackberry");
				}
		}
		if (strMobileApp_Types.contains("windows")){
			if (!GoAir_Verify_MobileAppWebsite_Navigation_and_Download_Installer(
					strURLMobileAppGoAir,"windows")){
				bLocalTestResultStatus = false;
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Mobile App webite navigation and download test failed for: " + "windows");
				objSoftAssert.fail("ERROR:    Mobile App webite navigation and download test failed for: " + "windows");}
		}
		
		return bLocalTestResultStatus;
	}
	
	public boolean GoAir_Compare_Main_Page_Logo_with_Reference_Home_Page_Logo(String strLogoType){

		String strImageNameContains = "_reference_logo";
		
		URL objURLMainPageLogo		= null;
		try {objURLMainPageLogo		= new URL(objPageGoAirMain.GoAir_Get_MainPage_Logo_URL());} 
		catch (MalformedURLException e) {
			System.out.println("ERROR:    Unable to fetch main page image through URL");
			objSoftAssert.fail("ERROR:    Unable to fetch main page image through URL"); return false;}
		catch (Exception e)             {
			System.out.println("ERROR:    Unable to open main page image URL");
			objSoftAssert.fail("ERROR:    Unable to open main page image URL"); return false;}
				
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
	private String[] getRandomFlightDepartAndArriveCityNames(){
		
		String[][] strRandomDepartArriveCityName = {
				{"Chandigarh",	"Goa"},
				{"Mumbai (Terminal 1B)","Bengaluru"},
				{"Goa",			"Jaipur"},
				{"Mumbai (Terminal 1B)","Chennai"},
				{"Mumbai (Terminal 1B)","Jaipur"},
				{"Bengaluru",	"Mumbai (Terminal 1A)"},
				{"Chandigarh",	"Ahmedabad"},
				{"Bengaluru",	"Pune"},
				{"Goa",			"Chennai"},
				{"Bengaluru",	"Goa"},
				{"Chandigarh",	"Bengaluru"},
				{"Chandigarh",	"Chennai"},
				{"Goa",			"Bengaluru"},
				{"Mumbai (Terminal 1B)","Goa"},
				{"Goa",			"Kolkata"},
				{"Bengaluru",	"Jaipur"}
		};
		
		int nRandomIndex = ClsGeneralInitTerminateAndOtherUtil.getPositiveRandomNumberBetweenRange(0, strRandomDepartArriveCityName.length-1);
		return new String[]{strRandomDepartArriveCityName[nRandomIndex][0], 
							strRandomDepartArriveCityName[nRandomIndex][1]};
//		return new String[]{"Mumbai (Terminal 1B)","New Delhi (Terminal 1D)"};
//		return new String[]{"Chandigarh","Chennai"};
	}
	
	
	
	
	
	
	
	
	
	
}

