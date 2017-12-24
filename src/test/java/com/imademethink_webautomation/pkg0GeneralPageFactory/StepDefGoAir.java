package com.imademethink_webautomation.pkg0GeneralPageFactory;

import com.imademethink_webautomation.pkgAirlines_GoAir.clsGoAir;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefGoAir extends clsGoAir{
	
	@When("^GoAir User validates home page attribute from \"([^\"]*)\" with \"([^\"]*)\"$")
	public void GoAir_User_validates_home_page_attribute_from_with(String strHomePageAttribute, String strAttributeExpected) throws Throwable {
		System.out.println("INFO :: User validates home page attribute");
		GoAir_Validate_Home_Page_Attributes(strHomePageAttribute, strAttributeExpected);
	}

	@When("^GoAir User validates airlines home page elements from \"([^\"]*)\" with \"([^\"]*)\" with <expected GUI options value>$")
	public void GoAir_User_validates_airlines_home_page_elements_from_with_with_expected_GUI_options_value(String strCategoryName, String strGUIOptionList) throws Throwable {
		System.out.println("INFO :: User validates home page attribute");
		GoAir_Validate_Home_Page_Elements_GUI_Options(strCategoryName, strGUIOptionList);
	}

	@When("^GoAir User validates airlines Plan my trip sub page elements from \"([^\"]*)\" with \"([^\"]*)\"$")
	public void GoAir_User_validates_airlines_Plan_my_trip_sub_page_elements_from_with(String strCategoryName, String strGUIOptionList) throws Throwable {
		System.out.println("INFO :: User validates Plan my trip sub page elements");
		GoAir_Validate_Plan_my_trip_sub_page_elements(strCategoryName, strGUIOptionList);
	}	

	@When("^GoAir User validates airlines Promotions sub page elements from \"([^\"]*)\" with \"([^\"]*)\"$")
	public void GoAir_User_validates_airlines_Promotions_sub_page_elements_from_with(String strCategoryName, String strGUIOptionList) throws Throwable {
		System.out.println("INFO :: User validates Promotions sub page elements");
		GoAir_Validate_Promotions_sub_page_elements(strCategoryName, strGUIOptionList);
	}
	
	@When("^GoAir User validates airlines Services page elements from \"([^\"]*)\" with \"([^\"]*)\"$")
	public void GoAir_User_validates_airlines_Services_page_elements_from_with(String strCategoryName, String strGUIOptionList) throws Throwable {
		System.out.println("INFO :: User validates Services sub page elements");
		GoAir_Validate_Services_sub_page_elements(strCategoryName, strGUIOptionList);
	}

	@When("^GoAir User validates airlines GoBusiness sub page elements for \"([^\"]*)\"$")
	public void GoAir_User_validates_airlines_GoBusiness_sub_page_elements_for(String strGUIOptionList) throws Throwable {
		System.out.println("INFO :: User validates Go business sub page elements");
		GoAir_Validate_Go_Business_sub_page_elements(strGUIOptionList);
	}

	@When("^GoAir User validates airlines GoHolidays sub page elements for \"([^\"]*)\"$")
	public void GoAir_User_validates_airlines_GoHolidays_sub_page_elements_for(String strGUIOptionList) throws Throwable {
		System.out.println("INFO :: User validates Go Holidays sub page elements");
		GoAir_Validate_Go_Holidays_sub_page_elements(strGUIOptionList);
	}

	@When("^GoAir User validates airlines Careers sub page elements for \"([^\"]*)\"$")
	public void GoAir_User_validates_airlines_Careers_sub_page_elements_for(String strGUIOptionList) throws Throwable {
		System.out.println("INFO :: User validates Careers sub page elements");
		GoAir_Validate_Careers_sub_page_elements(strGUIOptionList);
	}

    @When("^GoAir User performs simple valid flight search with default parameters for one way flight type$")
    public void GoAir_User_performs_simple_valid_flight_search_with_default_parameters_for_one_way_flight_type() throws Throwable {
		System.out.println("INFO :: User performs simple valid flight search with default paramaters for one way flight type");
		GoAir_User_Perform_Simple_Valid_Flight_Search_With_Default_Paraeters_For_One_Way_Flight_Type_Until_Payment_Section();
    }

    @When("^GoAir Basic search result information from \"([^\"]*)\" should be shown$")
    public void GoAir_Basic_search_result_information_from_should_be_shown(String strSearchResultInformationIemsToCheck) throws Throwable {
		System.out.println("INFO :: User validates basic search result information_items");
		GoAir_Validate_Basic_Search_Result_Information(strSearchResultInformationIemsToCheck);
    }
    
    @When("^GoAir User validates end to end ticket booking case type first from \"([^\"]*)\"$")
    public void GoAir_User_validates_end_to_end_ticket_booking_case_type_first_from(String strEndToEndScenarioType01_Case_nn) throws Throwable {
		System.out.println("INFO :: User validates end to end valid flight search TYPE_1 with default paramaters and validates results");
		GoAir_User_Validates_End_To_End_Valid_Flight_Search__TYPE1__With_Default_Paameters(strEndToEndScenarioType01_Case_nn);
    }
    
    @When("^GoAir User validates end to end ticket booking case type third from \"([^\"]*)\"$")
    public void GoAir_User_validates_end_to_end_ticket_booking_case_type_third_from(String strEndToEndScenarioType03_Case_nn) throws Throwable {
		System.out.println("INFO :: User validates end to end valid flight search TYPE_3 with default paramaters and validates results");
		GoAir_User_Validates_End_To_End_Valid_Flight_Search__TYPE3__With_Default_Paameters(strEndToEndScenarioType03_Case_nn);
    }

	@When("^GoAir User performs simple valid flight search with default parameters until payment section$")
	public void GoAir_User_performs_simple_valid_flight_search_with_default_parameters_until_payment_section() throws Throwable {
		System.out.println("INFO :: User performs simple valid flight search with default paramaters until payment section$");
		GoAir_User_Perform_Simple_Valid_Flight_Search_With_Default_Paraeters_Until_Payment_Section$();
	}
	
	@When("^GoAir Use payment type from \"([^\"]*)\"$")
	public void GoAir_Use_payment_type_from(String strPaymentMethodType) throws Throwable {
		System.out.println("INFO :: User initiates payment method");
		GoAir_User_Initiats_Payment_Method(strPaymentMethodType);
	}
	
	@When("^GoAir User validates GoAir offers from \"([^\"]*)\"$")
	public void GoAir_User_validates_GoAir_offers_from(String strOfferToCheck) throws Throwable {
		System.out.println("INFO :: User validates GoAir offer");
		GoAir_User_Validates_Offers(strOfferToCheck);
	}  
    
	@When("^GoAir User validates support functionality from \"([^\"]*)\"$")
	public void GoAir_User_validates_support_functionality_from(String strSupportFunctionality) throws Throwable {
		System.out.println("INFO :: User validates GoAir support functionality");
		GoAir_User_Validates_SupportFunctionality(strSupportFunctionality);
	}

	@When("^GoAir User validates GoAir specific other items from \"([^\"]*)\"$")
	public void GoAir_User_validates_GoAir_specific_other_items_from(String strSpecificOtherItems) throws Throwable {
		System.out.println("INFO :: User validates specific other items");
		GoAir_User_Validates_Specific_Other_Items(strSpecificOtherItems);
	}
    
    @When("^GoAir User navigates between different pages by selecting different options from \"([^\"]*)\"$")
    public void GoAir_User_navigates_between_different_pages_by_selecting_different_options_from(String strNavigateToThisPage) throws Throwable {
		System.out.println("INFO :: User navigates between different pages by selecting dfferent options");
		GoAir_User_Navigates_Between_Different_Pages(strNavigateToThisPage);
    }

	@When("^GoAir User validates consistancy of common web elements \"([^\"]*)\"$")
	public void GoAir_User_validates_consistancy_of_common_web_elements(String strConsistantElementPageName) throws Throwable {
		System.out.println("INFO :: User validates consistance of common webelemnts");
		GoAir_User_Validates_Consistency_of_Common_Web_Elements(strConsistantElementPageName);
	}
    
	@When("^GoAir User validates home page other attribute from \"([^\"]*)\" with \"([^\"]*)\"$")
	public void GoAir_User_validates_home_page_other_attribute_from_with(String strHomePageOtherItems, String strHomePageOtherItemsExpectedAttribute) throws Throwable {
		System.out.println("INFO :: User validates home page other attributes");
		GoAir_User_Validates_Home_Page_Other_Attributes(strHomePageOtherItems,strHomePageOtherItemsExpectedAttribute);
	}

    
    
    
    
	
	
	
	
	
	
	




	
	@Given("^GoAir website under test \"([^\"]*)\" and short name is \"([^\"]*)\"$")
	public void GoAir_website_under_test(String strWebsiteURL, String strWebsiteShortName) throws Throwable {
		System.out.println("INFO :: Initiliazing browser for website: " + strWebsiteURL);
		initilize_General_Supporting_Items("all");
		initilize_Abstact_Page_Object();
		initilize_Specific_Page_Objects_For(strWebsiteShortName);
		GoAir_InitilizeForThisWebsiteSpecificItems();
		strCurrentWebsiteUnderTest = strWebsiteShortName;
		objPage0Abstract.navigate_To_URL(strWebsiteURL);
	}
	
	@Then("^GoAir Test result should be successful or log the error meessage$")
	public void GoAir_Test_result_should_be_successful_or_log_the_error_meessage() throws Throwable {
		System.out.println("INFO :: Validating test results for current scenario");
		GoAir_Validate_Test_Result();
	}

	@Then("^GoAir Quit the test scenario$")
	public void GoAir_Quit_the_test_scenario() throws Throwable {
		System.out.println("INFO :: Quitting test and terminating all objects");
		// Terminate order should be same during initializing 
		GoAir_TerminateForThisWebsiteSpecificItems();
		terminate_Specific_Page_Objects_For(strCurrentWebsiteUnderTest);
	}
	
}
