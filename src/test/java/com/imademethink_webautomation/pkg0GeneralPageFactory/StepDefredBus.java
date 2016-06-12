package com.imademethink_webautomation.pkg0GeneralPageFactory;

import com.imademethink_webautomation.pkgTktTravel_redBus.clsredBus;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefredBus extends clsredBus{

	@When("^redBus User validates home page attribute from \"([^\"]*)\" with \"([^\"]*)\"$")
	public void redBus_User_validates_home_page_attribute_from_with(String strHomePageAttribute, String strAttributeExpected) throws Throwable {
		System.out.println("INFO :: User validates home page attribute");
		redBus_Validate_Home_Page_Attributes(strHomePageAttribute, strAttributeExpected);		
	}

	@When("^redBus User validates ticket booking GUI options from \"([^\"]*)\" with \"([^\"]*)\"$")
	public void redBus_User_validates_ticket_booking_GUI_options_from_with(String strCategoryName, String strExpectedGUIOptionsValue) throws Throwable {
		System.out.println("INFO :: User validates ticket booking GUI options");
		redBus_Validate_Ticket_Booking_GUI_Options(strCategoryName, strExpectedGUIOptionsValue);
	}

	@When("^redBus User validates search scenario with \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" with \"([^\"]*)\"$")
	public void redBus_User_validates_search_scenario_with_and_and_search_date_with(String strDepartCityType, String strArriveCityType, String strDateType, String strExpectedSearchResult) throws Throwable {
		System.out.println("INFO :: User validates ticket booking search scenario combination");
		redBus_Validate_Ticket_Booking_Search_Scenario_Combination(strDepartCityType, strArriveCityType, strDateType, strExpectedSearchResult);
	}

    @When("^redBus User performs simple valid bus ticket search with default parameters for one way journey type$")
    public void redBus_User_performs_simple_valid_bus_ticket_search_with_default_parameters_for_one_way_journey_type() throws Throwable {
		System.out.println("INFO :: User performs simple valid bus ticket search with default paramaters for one way journey type");
		redBus_User_Perform_Simple_Valid_Bus_Ticket_Search_With_Default_Paraeters();
    }

    @When("^redBus Basic search result information from \"([^\"]*)\" should be shown$")
    public void redBus_Basic_search_result_information_from_should_be_shown(String strSearchResultInformationIemsToCheck) throws Throwable {
		System.out.println("INFO :: User validates basic search result information_items");
		redBus_Validate_Basic_Search_Result_Information(strSearchResultInformationIemsToCheck);
    }

    @When("^redBus User validates end to end ticket booking case type first from \"([^\"]*)\"$")
    public void redBus_User_validates_end_to_end_ticket_booking_case_type_first_from(String strEndToEndScenarioType01_Case_nn) throws Throwable {
		System.out.println("INFO :: User validates end to end valid bus ticket search TYPE_1 with default paramaters and validates results");
		redBus_User_Validates_End_To_End_Valid_BusTicket_Search__TYPE1__With_Default_Paameters(strEndToEndScenarioType01_Case_nn);
    }

    @When("^redBus User validates end to end ticket booking case type second from \"([^\"]*)\"$")
    public void redBus_User_validates_end_to_end_ticket_booking_case_type_second_from(String strEndToEndScenarioType02_Case_nn) throws Throwable {
		System.out.println("INFO :: User validates end to end valid bus ticket search TYPE_2 with default paramaters and validates results");
		redBus_User_Validates_End_To_End_Valid_BusTicket_Search__TYPE2__With_Default_Paameters(strEndToEndScenarioType02_Case_nn);
    }

    @When("^redBus User validates end to end ticket booking case type third from \"([^\"]*)\"$")
    public void redBus_User_validates_end_to_end_ticket_booking_case_type_third_from(String strEndToEndScenarioType03_Case_nn) throws Throwable {
		System.out.println("INFO :: User validates end to end valid bus ticket search TYPE_3 with default paramaters and validates results");
		redBus_User_Validates_End_To_End_Valid_BusTicket_Search__TYPE3__With_Default_Paameters(strEndToEndScenarioType03_Case_nn);
    }

    @When("^redBus User validates end to end ticket booking case type fourth from \"([^\"]*)\"$")
    public void redBus_User_validates_end_to_end_ticket_booking_case_type_fourth_from(String strEndToEndScenarioType04_Case_nn) throws Throwable {
		System.out.println("INFO :: User validates end to end valid flight search TYPE_4 with default paramaters and validates results");
		redBus_User_Validates_End_To_End_Valid_BusTicket_Search__TYPE4__With_Default_Paameters(strEndToEndScenarioType04_Case_nn);
    }
    
    @When("^redBus User performs simple valid flight search with default parameters for one way flight type until payment section$")
    public void redBus_User_performs_simple_valid_flight_search_with_default_parameters_for_one_way_flight_type_until_payment_section() throws Throwable {
		System.out.println("INFO :: User performs simple valid flight search with default paramaters for one way flight type until payment section");
		redBus_User_Perform_Simple_Valid_BusTicket_Search_With_Default_Paraeters_OneWay_BusTicket_Until_Payment_Section();
    }

    @When("^redBus Use payment type from \"([^\"]*)\"$")
    public void redBus_Use_payment_type_from(String strPaymentMethodType) throws Throwable {
		System.out.println("INFO :: User initiates payment method");
		redBus_User_Initiats_Payment_Method(strPaymentMethodType);
    }
    
    @When("^redBus User validates redBus offers from \"([^\"]*)\"$")
    public void redBus_User_validates_offers_from(String strOfferSection) throws Throwable {
		System.out.println("INFO :: User validates offers from offers section");
		redBus_User_Validates_Offers_From_Offes_Section(strOfferSection);
    }

    @When("^redBus User validates support functionality in \"([^\"]*)\"$")
    public void redBus_User_validates_support_functionality_in(String strSupportFunctionalityTitle) throws Throwable {
		System.out.println("INFO :: User validates offers from offers section");
		redBus_User_Validates_Support_Functionality_In(strSupportFunctionalityTitle);
    }

    @When("^redBus User validates user management case from \"([^\"]*)\"$")
    public void redBus_User_validates_user_management_case_from(String strUserManagementTest) throws Throwable {
		System.out.println("INFO :: User validates user management case");
		redBus_User_Validates_User_Management_Case_From(strUserManagementTest);
    }
    
    @When("^redBus User validates redBus specific other items from \"([^\"]*)\"$")
    public void redBus_User_validates_redBus_specific_other_items_from(String strSpecificOtherItems) throws Throwable {
		System.out.println("INFO :: User validates specific other items");
		redBus_User_Validates_Specific_Other_Items(strSpecificOtherItems);
    }    
    
    @When("^redBus User navigates between different pages by selecting different options from \"([^\"]*)\"$")
    public void redBus_User_navigates_between_different_pages_by_selecting_different_options_from(String strNavigateToThisPage) throws Throwable {
		System.out.println("INFO :: User navigates between different pages by selecting dfferent options");
		redBus_User_Navigates_Between_Different_Pages(strNavigateToThisPage);
    }

	@When("^redBus User validates consistancy of common web elements \"([^\"]*)\"$")
	public void redBus_User_validates_consistancy_of_common_web_elements(String strConsistantElementPageName) throws Throwable {
		System.out.println("INFO :: User validates consistance of common webelemnts");
		redBus_User_Validates_Consistency_of_Common_Web_Elements(strConsistantElementPageName);
	}
    
	@When("^redBus User validates home page other attribute from \"([^\"]*)\" with \"([^\"]*)\"$")
	public void redBus_User_validates_home_page_other_attribute_from_with(String strHomePageOtherItems, String strHomePageOtherItemsExpectedAttribute) throws Throwable {
		System.out.println("INFO :: User validates home page other attributes");
		redBus_User_Validates_Home_Page_Other_Attributes(strHomePageOtherItems,strHomePageOtherItemsExpectedAttribute);
	}
    
    
    
    
    
    
    
    
    
	
	@Given("^redBus website under test \"([^\"]*)\" and short name is \"([^\"]*)\"$")
	public void redBus_website_under_test(String strWebsiteURL, String strWebsiteShortName) throws Throwable {
		System.out.println("INFO :: Initiliazing browser for website: " + strWebsiteURL);
		initilize_General_Supporting_Items("all");
		initilize_Abstact_Page_Object();
		initilize_Specific_Page_Objects_For(strWebsiteShortName);
		redBus_InitilizeForThisWebsiteSpecificItems();
		strCurrentWebsiteUnderTest = strWebsiteShortName;
		objPage0Abstract.navigate_To_URL(strWebsiteURL);
	}
	
	@Then("^redBus Test result should be successful or log the error meessage$")
	public void redBus_Test_result_should_be_successful_or_log_the_error_meessage() throws Throwable {
		System.out.println("INFO :: Validating test results for current scenario");
		redBus_Validate_Test_Result();
	}
	
	@Then("^redbus Quit the test scenario$")
	public void redbus_Quit_the_test_scenario() throws Throwable {
		System.out.println("INFO :: Quitting test and terminating all objects");
		// Terminate order should be same during initializing
		redBus_TerminateForThisWebsiteSpecificItems();
		terminate_Specific_Page_Objects_For(strCurrentWebsiteUnderTest);
	}
	

	
}