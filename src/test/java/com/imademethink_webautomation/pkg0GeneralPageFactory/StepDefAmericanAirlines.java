package com.imademethink_webautomation.pkg0GeneralPageFactory;

import com.imademethink_webautomation.pkgAirlines_AmericanAirlines.clsAmericanAirlines;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefAmericanAirlines extends clsAmericanAirlines{
	
	@When("^AmericanAirlines User validates home page attribute from \"([^\"]*)\" with \"([^\"]*)\"$")
	public void AmericanAirlines_User_validates_home_page_attribute_from_with(String strHomePageAttribute, String strAttributeExpected) throws Throwable {
		System.out.println("INFO :: User validates home page attribute");
		AmericanAirlines_Validate_Home_Page_Attributes(strHomePageAttribute, strAttributeExpected);		
	}

	@When("^AmericanAirlines User validates airlines home page elements from \"([^\"]*)\" with \"([^\"]*)\"$")
	public void AmericanAirlines_User_validates_airlines_home_page_elements_from_with(String strCategoryName, String strGUIOptionList) throws Throwable {
		System.out.println("INFO :: User validates home page elements");
		AmericanAirlines_Validate_Home_Page_Elements(strCategoryName, strGUIOptionList);
	}

    @When("^AmericanAirlines User validates airlines top row sub page \"([^\"]*)\" elements from \"([^\"]*)\"$")
	public void AmericanAirlines_User_validates_airlines_top_row_sub_page_elements_from(String strSubPageName, String subPageOptionList) throws Throwable {
		System.out.println("INFO :: User validates top row sub page elements");
		AmericanAirlines_Validate_Home_Page_Top_Row_Elements(strSubPageName, subPageOptionList);
	}
	
    @When("^AmericanAirlines User validates search scenario for \"([^\"]*)\" and \"([^\"]*)\" with \"([^\"]*)\"$")
    public void AmericanAirlines_User_validates_search_scenario_for_and_with(String strSectionType, String strSearchText, String strScenarioExpectedResult) throws Throwable {
		System.out.println("INFO :: User validates ticket search scenario combination");
		AmericanAirlines_Validate_Ticket_Search_Scenario_Combination(strSectionType, strSearchText, strScenarioExpectedResult);
    }
	
    @When("^AmericanAirlines User performs simple valid flight search with default parameters for one way flight type$")
    public void AmericanAirlines_User_performs_simple_valid_flight_search_with_default_parameters_for_one_way_flight_type() throws Throwable {
		System.out.println("INFO :: User performs simple valid flight search with default paramaters for one way flight type");
		AmericanAirlines_User_Perform_Simple_Valid_Flight_Search_With_Default_Paraeters();
    }

    @When("^AmericanAirlines Basic search result information from \"([^\"]*)\" should be shown$")
    public void AmericanAirlines_Basic_search_result_information_from_should_be_shown(String strSearchResultInformationIemsToCheck) throws Throwable {
		System.out.println("INFO :: User validates basic search result information_items");
		AmericanAirlines_Validate_Basic_Search_Result_Information(strSearchResultInformationIemsToCheck);
    }
	
    @When("^AmericanAirlines User validates end to end ticket booking case type first from \"([^\"]*)\"$")
    public void AmericanAirlines_User_validates_end_to_end_ticket_booking_case_type_first_from(String strEndToEndScenarioType01_Case_nn) throws Throwable {
		System.out.println("INFO :: User validates end to end valid flight search TYPE_1 with default paramaters and validates results");
		AmericanAirlines_User_Validates_End_To_End_Valid_Flight_Search__TYPE1__With_Default_Paameters(strEndToEndScenarioType01_Case_nn);
    }
    
    @When("^AmericanAirlines User validates end to end ticket booking case type third from \"([^\"]*)\"$")
    public void AmericanAirlines_User_validates_end_to_end_ticket_booking_case_type_third_from(String strEndToEndScenarioType03_Case_nn) throws Throwable {
		System.out.println("INFO :: User validates end to end valid flight search TYPE_3 with default paramaters and validates results");
		AmericanAirlines_User_Validates_End_To_End_Valid_Flight_Search__TYPE3__With_Default_Paameters(strEndToEndScenarioType03_Case_nn);
    }
    
    @When("^AmericanAirlines User validates end to end ticket booking case type fourth from \"([^\"]*)\"$")
    public void AmericanAirlines_User_validates_end_to_end_ticket_booking_case_type_fourth_from(String strEndToEndScenarioType04_Case_nn) throws Throwable {
		System.out.println("INFO :: User validates end to end valid flight search TYPE_4 with default paramaters and validates results");
		AmericanAirlines_User_Validates_End_To_End_Valid_Flight_Search__TYPE4__With_Default_Paameters(strEndToEndScenarioType04_Case_nn);
    }
    
    @When("^AmericanAirlines User performs simple valid flight search with default parameters for one way flight type until payment section$")
    public void AmericanAirlines_User_performs_simple_valid_flight_search_with_default_parameters_for_one_way_flight_type_until_payment_section() throws Throwable {
		System.out.println("INFO :: User performs simple valid flight search with default paramaters for one way flight type until payment section");
		AmericanAirlines_User_Perform_Simple_Valid_Flight_Search_With_Default_Paraeters_OneWay_Flight_Until_Payment_Section();
    }

    @When("^AmericanAirlines Use payment type from \"([^\"]*)\"$")
    public void AmericanAirlines_Use_payment_type_from(String strPaymentMethodType) throws Throwable {
		System.out.println("INFO :: User initiates payment method");
		AmericanAirlines_User_Initiats_Payment_Method(strPaymentMethodType);
    }
    
    @When("^AmericanAirlines User validates offers from \"([^\"]*)\"$")
    public void AmericanAirlines_User_validates_offers_from(String strOfferSection) throws Throwable {
		System.out.println("INFO :: User validates offers from offers section");
		AmericanAirlines_User_Validates_Offers_From_Offes_Section(strOfferSection);
    }
    
    @When("^AmericanAirlines User validates support functionality in \"([^\"]*)\"$")
    public void AmericanAirlines_User_validates_support_functionality_in(String strSupportFunctionalityTitle) throws Throwable {
		System.out.println("INFO :: User validates offers from offers section");
		AmericanAirlines_User_Validates_Support_Functionality_For(strSupportFunctionalityTitle);
    }
    
    @When("^AmericanAirlines User validates AmericanAirlines specific other items from \"([^\"]*)\"$")
    public void AmericanAirlines_User_validates_AmericanAirlines_specific_other_items_from(String strSpecificOtherItems) throws Throwable {
		System.out.println("INFO :: User validates specific other items");
		AmericanAirlines_User_Validates_Specific_Other_Items(strSpecificOtherItems);
    }
    
    @When("^AmericanAirlines User navigates between different pages by selecting different options from \"([^\"]*)\"$")
    public void AmericanAirlines_User_navigates_between_different_pages_by_selecting_different_options_from(String strNavigateToThisPage) throws Throwable {
		System.out.println("INFO :: User navigates between different pages by selecting dfferent options");
		AmericanAirlines_User_Navigates_Between_Different_Pages(strNavigateToThisPage);
    }

	@When("^AmericanAirlines User validates consistancy of common web elements \"([^\"]*)\"$")
	public void AmericanAirlines_User_validates_consistancy_of_common_web_elements(String strConsistantElementPageName) throws Throwable {
		System.out.println("INFO :: User validates consistance of common webelemnts");
		AmericanAirlines_User_Validates_Consistency_of_Common_Web_Elements(strConsistantElementPageName);
	}
    
	@When("^AmericanAirlines User validates home page other attribute from \"([^\"]*)\" with \"([^\"]*)\"$")
	public void AmericanAirlines_User_validates_home_page_other_attribute_from_with(String strHomePageOtherItems, String strHomePageOtherItemsExpectedAttribute) throws Throwable {
		System.out.println("INFO :: User validates home page other attributes");
		AmericanAirlines_User_Validates_Home_Page_Other_Attributes(strHomePageOtherItems,strHomePageOtherItemsExpectedAttribute);
	}
    
    
    
    
    
    
    
    
    
	
	@Given("^AmericanAirlines website under test \"([^\"]*)\" and short name is \"([^\"]*)\"$")
	public void AmericanAirlines_website_under_test(String strWebsiteURL, String strWebsiteShortName) throws Throwable {
		System.out.println("INFO :: Initiliazing browser for website: " + strWebsiteURL);
		initilize_General_Supporting_Items("all");
		initilize_Abstact_Page_Object();
		initilize_Specific_Page_Objects_For(strWebsiteShortName);
		AmericanAirlines_InitilizeForThisWebsiteSpecificItems();
		strCurrentWebsiteUnderTest = strWebsiteShortName;
		objPage0Abstract.navigate_To_URL(strWebsiteURL);
	}
	
	@Then("^AmericanAirlines Test result should be successful or log the error meessage$")
	public void AmericanAirlines_Test_result_should_be_successful_or_log_the_error_meessage() throws Throwable {
		System.out.println("INFO :: Validating test results for current scenario");
		AmericanAirlines_Validate_Test_Result();
	}

	@Then("^AmericanAirlines Quit the test scenario$")
	public void AmericanAirlines_Quit_the_test_scenario() throws Throwable {
		System.out.println("INFO :: Quitting test and terminating all objects");
		// Terminate order should be same during initializing 
		AmericanAirlines_TerminateForThisWebsiteSpecificItems();
		terminate_Specific_Page_Objects_For(strCurrentWebsiteUnderTest);
	}
	
	
}