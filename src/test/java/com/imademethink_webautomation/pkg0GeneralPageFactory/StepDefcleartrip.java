package com.imademethink_webautomation.pkg0GeneralPageFactory;

import com.imademethink_webautomation.pkgTktTravel_cleartrip.clscleartrip;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefcleartrip extends clscleartrip{

	@When("^cleartrip User validates home page attribute from \"([^\"]*)\" with \"([^\"]*)\"$")
	public void cleartrip_User_validates_home_page_attribute_from_with(String strHomePageAttribute, String strAttributeExpected) throws Throwable {
		System.out.println("INFO :: User validates home page attribute");
		cleartrip_Validate_Home_Page_Attributes(strHomePageAttribute, strAttributeExpected);		
	}

	@When("^cleartrip User validates ticket booking GUI options from \"([^\"]*)\" with \"([^\"]*)\"$")
	public void cleartrip_User_validates_ticket_booking_GUI_options_from_with(String strCategoryName, String strExpectedGUIOptionsValue) throws Throwable {
		System.out.println("INFO :: User validates ticket booking GUI options");
		cleartrip_Validate_Ticket_Booking_GUI_Options(strCategoryName, strExpectedGUIOptionsValue);
	}

	@When("^cleartrip User validates search scenario with \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" with \"([^\"]*)\"$")
	public void cleartrip_User_validates_search_scenario_with_and_and_search_date_with(String strDepartCityType, String strArriveCityType, String strDateType, String strExpectedSearchResult) throws Throwable {
		System.out.println("INFO :: User validates ticket booking search scenario combination");
		cleartrip_Validate_Ticket_Booking_Search_Scenario_Combination(strDepartCityType, strArriveCityType, strDateType, strExpectedSearchResult);
	}
	
    @When("^cleartrip User performs simple valid flight search with default parameters for one way flight type$")
    public void cleartrip_User_performs_simple_valid_flight_search_with_default_parameters_for_one_way_flight_type() throws Throwable {
		System.out.println("INFO :: User performs simple valid flight search with default paramaters for one way flight type");
		cleartrip_User_Perform_Simple_Valid_Flight_Search_With_Default_Paraeters();
    }

    @When("^cleartrip Basic search result information from \"([^\"]*)\" should be shown$")
    public void cleartrip_Basic_search_result_information_from_should_be_shown(String strSearchResultInformationIemsToCheck) throws Throwable {
		System.out.println("INFO :: User validates basic search result information_items");
		cleartrip_Validate_Basic_Search_Result_Information(strSearchResultInformationIemsToCheck);
    }

    @When("^cleartrip User validates end to end ticket booking case type third from \"([^\"]*)\"$")
    public void cleartrip_User_validates_end_to_end_ticket_booking_case_type_third_from(String strEndToEndScenarioType03_Case_nn) throws Throwable {
		System.out.println("INFO :: User validates end to end valid flight search TYPE_3 with default paramaters and validates results");
		cleartrip_User_Validates_End_To_End_Valid_Flight_Search__TYPE3__With_Default_Paameters(strEndToEndScenarioType03_Case_nn);
    }

    @When("^cleartrip User performs simple valid flight search with default parameters for one way flight type until payment section$")
    public void cleartrip_User_performs_simple_valid_flight_search_with_default_parameters_for_one_way_flight_type_until_payment_section() throws Throwable {
		System.out.println("INFO :: User performs simple valid flight search with default paramaters for one way flight type until payment section");
		cleartrip_User_Perform_Simple_Valid_Flight_Search_With_Default_Paraeters_For_One_Way_Flight_Type_Until_Payment_Section();
    }

    @When("^cleartrip Use payment type from \"([^\"]*)\"$")
    public void cleartrip_Use_payment_type_from(String strPaymentMethodType) throws Throwable {
		System.out.println("INFO :: User initiates payment method");
		cleartrip_User_Initiats_Payment_Method(strPaymentMethodType);
    }

    @When("^cleartrip User validates cleartrip offers from \"([^\"]*)\"$")
    public void cleartrip_User_validates_offers_from(String strOfferSection) throws Throwable {
		System.out.println("INFO :: User validates offers from offers section");
		cleartrip_User_Validates_cleartrip_Offers_From_Offes_Section(strOfferSection);
    }
    
    @When("^cleartrip User validates support functionality from \"([^\"]*)\"$")
    public void cleartrip_User_validates_support_functionality_from(String strSupportFunctionalityTitle) throws Throwable {
		System.out.println("INFO :: User validates offers from offers section");
		cleartrip_User_Validates_Support_Functionality_For(strSupportFunctionalityTitle);
    }
    
    @When("^cleartrip User validates user management case from \"([^\"]*)\"$")
    public void cleartrip_User_validates_user_management_case_from(String strUserManagementTest) throws Throwable {
		System.out.println("INFO :: User validates user management case");
		cleartrip_User_Validates_User_Management_Case_From(strUserManagementTest);
    }

    @When("^cleartrip User validates cleartrip specific other items from \"([^\"]*)\"$")
    public void cleartrip_User_validates_cleartrip_specific_other_items_from(String strSpecificOtherItems) throws Throwable {
		System.out.println("INFO :: User validates specific other items");
		cleartrip_User_Validates_Specific_Other_Items_From(strSpecificOtherItems);
    }

    @When("^cleartrip User navigates between different pages by selecting different options from \"([^\"]*)\"$")
    public void cleartrip_User_navigates_between_different_pages_by_selecting_different_options_from(String strNavigateToThisPage) throws Throwable {
		System.out.println("INFO :: User navigates between different pages by selecting dfferent options");
		cleartrip_User_Navigates_Between_Different_Pages(strNavigateToThisPage);
    }
            
	@When("^cleartrip User validates consistancy of common web elements \"([^\"]*)\"$")
	public void cleartrip_User_validates_consistancy_of_common_web_elements(String strConsistantElementPageName) throws Throwable {
		System.out.println("INFO :: User validates consistance of common webelemnts");
		cleartrip_User_Validates_Consistency_of_Common_Web_Elements(strConsistantElementPageName);
	}
    
	@When("^cleartrip User validates home page other attribute from \"([^\"]*)\" with \"([^\"]*)\"$")
	public void cleartrip_User_validates_home_page_other_attribute_from_with(String strHomePageOtherItems, String strHomePageOtherItemsExpectedAttribute) throws Throwable {
		System.out.println("INFO :: User validates home page other attributes");
		cleartrip_User_Validates_Home_Page_Other_Attributes(strHomePageOtherItems,strHomePageOtherItemsExpectedAttribute);
	}
    
    
    
    
    
    
    
    
    
	
	@Given("^cleartrip website under test \"([^\"]*)\" and short name is \"([^\"]*)\"$")
	public void cleartrip_website_under_test(String strWebsiteURL, String strWebsiteShortName) throws Throwable {
		System.out.println("INFO :: Initiliazing browser for website: " + strWebsiteURL);
		initilize_General_Supporting_Items("all");
		initilize_Abstact_Page_Object();
		initilize_Specific_Page_Objects_For(strWebsiteShortName);
		cleartrip_InitilizeForThisWebsiteSpecificItems();
		strCurrentWebsiteUnderTest = strWebsiteShortName;
		objPage0Abstract.navigate_To_URL(strWebsiteURL);
	}
	
	@Then("^cleartrip Test result should be successful or log the error meessage$")
	public void cleartrip_Test_result_should_be_successful_or_log_the_error_meessage() throws Throwable {
		System.out.println("INFO :: Validating test results for current scenario");
		cleartrip_Validate_Test_Result();
	}

	@Then("^cleartrip Quit the test scenario$")
	public void cleartrip_Quit_the_test_scenario() throws Throwable {
		System.out.println("INFO :: Quitting test and terminating all objects");
		// Terminate order should be same during initializing 
		cleartrip_TerminateForThisWebsiteSpecificItems();
		terminate_Specific_Page_Objects_For(strCurrentWebsiteUnderTest);
	}		
	
}
