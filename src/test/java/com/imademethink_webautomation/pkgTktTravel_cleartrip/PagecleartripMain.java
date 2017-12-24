package com.imademethink_webautomation.pkgTktTravel_cleartrip;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.imademethink_webautomation.UtilGeneral.ClsGeneralInitTerminateAndOtherUtil;
import com.imademethink_webautomation.pkg0GeneralPageFactory.Page0Abstract;

public class PagecleartripMain extends Page0Abstract {
	
	public PagecleartripMain(WebDriver driver) {
		super(driver);
		//System.out.println("DEBUG:    PagecleartripMain constructor");
		PageFactory.initElements(driver, this);
	}

	// home page button
	@FindBy(css = ".cleartripLogo")
	public WebElement cleartrip_img_HomePage;
	
	// user details section
    @FindBy(css=".span.span19.truncate")
	private WebElement cleartrip_labl_UserSection_Heading;
    @FindBy(id = "SignIn")
	private WebElement cleartrip_lnk_UserSection_SignIn;
    @FindBy(linkText = "Register")
	private WebElement cleartrip_lnk_UserSection_SignUp;
    @FindBy(linkText = "Sign out")
	private WebElement cleartrip_lnk_UserSection_SignOut;
    @FindBy(linkText = "Profile")
	private WebElement cleartrip_lnk_UserSection_Profile;
    @FindBy(linkText = "Edit Profile")
	private WebElement cleartrip_btn_UserSection_EditProfile;
    @FindBy(css = "#profile_streetAddress")
	private WebElement cleartrip_txtbox_UserSection_ProfileAddress;
    @FindBy(css = "button[type='submit']")
	private WebElement cleartrip_lnk_UserSection_ProfileSave;
    @FindBy(css = "#profileFormSuccessMessage")
	private List<WebElement> cleartrip_lst_lnk_UserSection_ProfileSave_Success;
    @FindBy(linkText = "Settings")
	private WebElement cleartrip_lnk_UserSection_Settings;
    @FindBy(css = ".hint")
	private List<WebElement> cleartrip_lst_labl_UserSection_Profile_Hint;    
    @FindBy(linkText = "Change password")
	private WebElement cleartrip_lnk_UserSection_Settings_ChangePassword1;
    
    // elements under flight booking
    @FindBy(id="OneWay")
    private WebElement cleartrip_radiobtn_BookFlight_OneWay;
    @FindBy(id="RoundTrip")
    private WebElement cleartrip_radiobtn_BookFlight_RoundWay;
    @FindBy(id="MultiCity")
    private WebElement cleartrip_radiobtn_BookFlight_MultiCity;
    @FindBy(id="Packages")
    private WebElement cleartrip_radiobtn_BookFlight_FlightandHotel_Package;    
    @FindBy(id="FromTag")
    private WebElement cleartrip_txtbox_BookFlight_FlightDepartFromCity;
    @FindBy(id="ToTag")
    private WebElement cleartrip_txtbox_BookFlight_FlightArriveToCity;
    @FindBy(css = "a[tabindex='-1']")
	private List<WebElement> cleartrip_lst_labl_BookFlight_MatchingCityName;
    @FindBy(id="Adults")
    private WebElement cleartrip_drpdown_BookFlight_Adults;
    @FindBy(id="Childrens")
    private WebElement cleartrip_drpdown_BookFlight_Childrens;
    @FindBy(id="Infants")
    private WebElement cleartrip_drpdown_BookFlight_Infants;
    @FindBy(css = ".depart_date")
	private WebElement cleartrip_txtbox_BookFlight_DepartDate;
    @FindBy(css = ".return_date")
	private WebElement cleartrip_txtbox_BookFlight_ArriveDate;
    @FindBy(css=".icon.ir.datePicker")
    private List<WebElement> cleartrip_lst_drpdown_BookFlight_DepartDate_ArriveDate;
    @FindBy(css=".ui-state-active")
    private WebElement cleartrip_labl_BookFlight_DepartDate_CurrentDate;
    @FindBy(css=".ui-datepicker-month")
    private List<WebElement> cleartrip_lst_labl_BookFlight_DepartDate_CurrentMonth;
    @FindBy(css=".ui-datepicker-year")
    private List<WebElement> cleartrip_lst_labl_BookFlight_DepartDate_CurrentYear;
    @FindBy(id="SearchBtn")
    private WebElement cleartrip_drpdown_BookFlight_SearchFlightButton;
    @FindBy(css=".remove")
    private WebElement cleartrip_btn_MultiCity_RemoveLastCity;
    @FindBy(css="input[id*='FromTag']")
    private List<WebElement> cleartrip_txtbox_BookFlight_MultiCity_DepartCity;
    @FindBy(css="input[id*='ToTag']")
    private List<WebElement> cleartrip_txtbox_BookFlight_MultiCity_ArriveCity;
    @FindBy(id="McAddMore")
    private WebElement cleartrip_btn_MultiCity_AddMore;
    @FindBy(id="Class")
    private List<WebElement> cleartrip_drpdown_ClassOfTravel;
    @FindBy(css=".span.span20.datePicker")
    private List<WebElement> cleartrip_drpdown_Package_DepartDate_ArriveDate;
    @FindBy(id="AirlineAutocomplete")
    private WebElement cleartrip_txtbox_PreferredAirlines;
    @FindBy(id="MoreOptionsLink")
    private WebElement cleartrip_lnk_MoreOptions;

    // elements under more infor option
    @FindBy(css="#moreProductsLink")
    private WebElement cleartrip_lnk_MoreProductsLink;
    @FindBy(linkText="Cancel and change flights")
    private WebElement cleartrip_lnk_MoreProductsLink_CancelAndChangeFlights;
    @FindBy(css=".fadeIn")
    private WebElement cleartrip_labl_MoreProductsLink_CancelAndChangeFlights_Header;
    
	By cleartrip_ByLinkText_MoreProducts_CancelAndChangeFlight 					= new ByLinkText ("Cancel and change flights");
	By cleartrip_ByCssSelector_MoreProducts_CancelAndChangeFlight_Email 		= new ByCssSelector ("#email");
	By cleartrip_ByCssSelector_MoreProducts_CancelAndChangeFlight_Tripid 		= new ByCssSelector ("#tripidSecond");
	By cleartrip_ByCssSelector_MoreProducts_CancelAndChangeFlight_Continue 		= new ByCssSelector ("#registerButton4");
	By cleartrip_ByCssSelector_MoreProducts_CancelAndChangeFlight_ErrorMessage 	= new ByCssSelector ("#errors1>ol>li");
    
    @FindBy(linkText = "Check flight status")
	private WebElement cleartrip_lnk_MoreInfo_CheckFlightStatus;
    @FindBy(linkText = "Check PNR status")
 	private WebElement cleartrip_lnk_MoreInfo_CheckPNRStatus;
    @FindBy(css="#pnr")
 	private WebElement cleartrip_txtbox_MoreInfo_CheckPNRStatus_PNRNumber;
    @FindBy(css="#get_status_button")
 	private WebElement cleartrip_txtbox_MoreInfo_CheckPNRStatus_PNR_Submit;
    @FindBy(css=".errors.lineMessage.ugly.icon>span")
 	private List<WebElement> cleartrip_lst_labl_MoreInfo_CheckPNRStatus_PNR_Error;
    @FindBy(linkText = "Print e-tickets")
 	private WebElement cleartrip_lnk_MoreInfo_PrinteTicket;
    @FindBy(css = "#confirmation_number")
 	private WebElement cleartrip_txtbox_MoreInfo_PrinteTicket_TripId;
    @FindBy(linkText = "Print hotel voucher")
 	private WebElement cleartrip_lnk_MoreInfo_PrintHotelVoucher;

    // tab on left vertical side
    @FindBy(linkText = "Flights")
	private WebElement cleartrip_tab_Flights;
    @FindBy(linkText = "Hotels")
	private WebElement cleartrip_tab_Hotels;
    @FindBy(linkText = "Flight + Hotel")
	private WebElement cleartrip_tab_Packages;
    @FindBy(linkText = "Trains")
	private WebElement cleartrip_tab_Trains;
    @FindBy(linkText = "Buses")
	private WebElement cleartrip_tab_Buses;
    @FindBy(linkText = "Activities")
	private WebElement cleartrip_tab_Activities;
    @FindBy(linkText = "Weekend getaways")
	private WebElement cleartrip_tab_WeekendGetaways;
    @FindBy(linkText = "Mobile")
	private WebElement cleartrip_tab_Mobile;
    @FindBy(linkText = "Manage trips")
	private WebElement cleartrip_tab_ManageTrips;
    @FindBy(linkText = "More")
	private WebElement cleartrip_tab_More;

    // elements for More options
    @FindBy(linkText = "Planner")
	private WebElement cleartrip_tab_More_Planner;
    @FindBy(linkText = "Collections")
	private WebElement cleartrip_tab_More_Collections;
    @FindBy(linkText = "Waytogo")
	private WebElement cleartrip_tab_More_Waytogo;
    @FindBy(linkText = "Air fare calendar")
	private WebElement cleartrip_tab_More_AirFareCalendar;
    @FindBy(linkText = "Air fare graphs")
	private WebElement cleartrip_tab_More_AirFareGraphs;
    @FindBy(linkText = "Air Fare alert")
	private WebElement cleartrip_tab_More_AirFareAlert;

    // other element - top row
    @FindBy(linkText = "Tell us what you think")
	private WebElement cleartrip_lnk_TellUsWhatYouThink;
    @FindBy(css = ".listMenuLink.currencyLink")
	private WebElement cleartrip_btn_Currency;
    @FindBy(css = ".listMenuLink.countryLink")
	private WebElement cleartrip_drpdown_CountrySelection;
    @FindBy(css = ".searchSprite.dealSliderTitle.deals")
	private WebElement cleartrip_lnk_DealsForYou;
    @FindBy(css = ".rewardsBannerImage")
	private WebElement cleartrip_lnk_Rewards;
    
    // error message
    @FindBy(id="homeErrorMessage")
    private WebElement cleartrip_labl_MainPageErrors;
    @FindBy(css = ".warningMessage>h2")
	private WebElement cleartrip_labl_IncorrectInputConditionError;
    @FindBy(css = ".button.primary")
	private WebElement cleartrip_btn_TrySearchingAgain;
    
    // searching in progress bar element
    @FindBy(css=".stripes")
    private List<WebElement> cleartrip_lst_stripes_SearchResultInProgress;
    @FindBy(css=".booking")
    private List<WebElement> cleartrip_lst_stripes_SearchResult_Count;

    // social plugin details - facebook
    @FindBy(css="a[href='http://facebook.com/cleartrip']")
    private WebElement cleartrip_SocialPlugin_Facebook_lnk;
    @FindBy(css="a[title*='Facebook page']")
    private WebElement cleartrip_SocialPlugin_Facebook_name;
   
    // social plugin details - twitter
    @FindBy(css="a[href='http://twitter.com/cleartrip']")
    private WebElement cleartrip_SocialPlugin_Twitter_lnk;
    @FindBy(css="a[title='Follow Cleartrip on Twitter']")
    private WebElement cleartrip_SocialPlugin_Twitter_name;

    // elements under Book (flight) tab
    @FindBy(css=".radio.pillbox.custombox-wrapper.inline")
	private List<WebElement> cleartrip_lst_BookTicketType_1Way_2Way;	 
    @FindBy(id="aa-redeem-label")
    private WebElement cleartrip_chkbox_RedeemMile;
    @FindBy(id="bookingModule-submit")
    private WebElement cleartrip_btn_Search;
    @FindBy(css="a[title='Refine your search']")
    private WebElement cleartrip_lnk_RefineSearch;
    @FindBy(css=".ui-datepicker-trigger")
	private List<WebElement> cleartrip_lst_Date_Depart_Arrive;	 
    @FindBy(id="flightSearchForm.childPassengerCount")
    private WebElement cleartrip_drpdwn_Children_Count;
    @FindBy(id="flightSearchForm.adultPassengerCount")
    private WebElement cleartrip_drpdwn_Adult_Count;
    @FindBy(css=".ui-datepicker-title")
    private List<WebElement> cleartrip_lst_BookFlight_DropDown_DepartArriveDate;
    @FindBy(css="#aa-leavingOn")
	private WebElement cleartrip_txtbox_Date_Depart;	 
    @FindBy(css="#aa-returningFrom")
	private WebElement cleartrip_txtbox_Date_Arrive;
    @FindBy(css=".inline.aaSC_Target_BookTravel_OneWay_Disable.inactive.disabled")
	private WebElement cleartrip_txtbox_Date_Arrive_disabled;

    @FindBy(css=".ui-datepicker-close.ui-state-default.ui-priority-primary.ui-corner-all")
	private WebElement cleartrip_txtbox_Date_Arrive_Done;
    @FindBy(css=".ui-state-default.ui-state-active")
	private WebElement cleartrip_btn_Date_DepartArrive_ActiveDate;
    
    // home page tabs common elements for my trips tab and check in tab
    @FindBy(css="label[title='Passenger First Name']")
    private List<WebElement> cleartrip_lst_txtbox_PassengerFirstName;
    @FindBy(css="label[title='Passenger Last Name']")
    private List<WebElement> cleartrip_lst_txtbox_PassengerLastName;
    @FindBy(css="label[title*='Booking reference']")
    private List<WebElement> cleartrip_lst_txtbox_Booking_Reference;
    
     // elements under deals / offers section
    @FindBy(css=".next.sliderNavigation")
	private WebElement cleartrip_labl_HomePage_DealsOffers_ArrowRight;
    @FindBy(css=".span.span22.truncate")
	private List<WebElement> cleartrip_lst_labl_HomePage_DealsOffers_Heading;
    @FindBy(css=".offerDescription")
	private List<WebElement> cleartrip_lst_labl_HomePage_DealsOffers_Description;
    @FindBy(css=".sliderPagination-item>.active")
	private WebElement cleartrip_labl_HomePage_DealsOffers_SliderActive;
    
    // some junk element
    @FindBy(id="zzzzzzz")
    private WebElement cleartrip_somejunkelement;
    //private String strcleartrip_somejunkelement = "zzzzzzz";
    
    // every page object has it's local private wait with fixed 10 sec delay
    private WebDriverWait objWait 		= new WebDriverWait(this.objWebDriverAbstract, 10);   
    private WebDriverWait objWaitShort 	= new WebDriverWait(this.objWebDriverAbstract, 3);
    

	public boolean cleartrip_validate_This_Element(String strThisElement){

		boolean bcleartrip_ThisElementValidationStatus 		= false;
	
		switch (strThisElement){
			case "btn__HOME":
			case "btn__Home":
			case "lnk__Home":
				if ( cleartrip_img_HomePage.isDisplayed()    )     			bcleartrip_ThisElementValidationStatus = true;
				break;
				
			case "btn__Flights":
				if ( cleartrip_tab_Flights.isDisplayed()    )     		 	bcleartrip_ThisElementValidationStatus = true;
				break;
			case "btn__Hotels":
				if ( cleartrip_tab_Hotels.isDisplayed()    )     	 		bcleartrip_ThisElementValidationStatus = true;
				break;
			case "btn__Flight+Hotel":
				if ( cleartrip_tab_Packages.isDisplayed()    )     		 	bcleartrip_ThisElementValidationStatus = true;
				break;
			case "btn__Trains":
				if ( cleartrip_tab_Trains.isDisplayed()    )   	 			bcleartrip_ThisElementValidationStatus = true;
				break;
			case "btn__Buses":
				if ( cleartrip_tab_Buses.isDisplayed()    )   	 			bcleartrip_ThisElementValidationStatus = true;
				break;
			case "btn__Activities":
				if ( cleartrip_tab_Activities.isDisplayed()    )   	 		bcleartrip_ThisElementValidationStatus = true;
				break;
			case "btn__Weekend_getaways":
				if ( cleartrip_tab_WeekendGetaways.isDisplayed()    )   	bcleartrip_ThisElementValidationStatus = true;
				break;
			case "btn__Mobile":
				if ( cleartrip_tab_Mobile.isDisplayed()    )   	 			bcleartrip_ThisElementValidationStatus = true;
				break;
			case "btn_Manage_trip":
				if ( cleartrip_tab_ManageTrips.isDisplayed()    )   	 	bcleartrip_ThisElementValidationStatus = true;
				break;
			case "btn__More":
				if ( cleartrip_tab_More.isDisplayed()    )   	 			bcleartrip_ThisElementValidationStatus = true;
				break;

			case "Planner":
				cleartrip_tab_More.click();
				if ( cleartrip_tab_More_Planner.isDisplayed()    )   	 	bcleartrip_ThisElementValidationStatus = true;
				cleartrip_tab_More.click();
				break;
			case "Collections":
				cleartrip_tab_More.click();
				if ( cleartrip_tab_More_Collections.isDisplayed()    )   	bcleartrip_ThisElementValidationStatus = true;
				cleartrip_tab_More.click();
				break;
			case "Waytogo":
				cleartrip_tab_More.click();
				if ( cleartrip_tab_More_Waytogo.isDisplayed()    )   	 	bcleartrip_ThisElementValidationStatus = true;
				cleartrip_tab_More.click();
				break;
			case "Air_fare_calendar":
				cleartrip_tab_More.click();
				if ( cleartrip_tab_More_AirFareCalendar.isDisplayed()    )  bcleartrip_ThisElementValidationStatus = true;
				cleartrip_tab_More.click();
				break;
			case "Air_fare_graphs":
				cleartrip_tab_More.click();
				if ( cleartrip_tab_More_AirFareGraphs.isDisplayed()    )   	bcleartrip_ThisElementValidationStatus = true;
				cleartrip_tab_More.click();
				break;
			case "Air_Fare_alert":
				cleartrip_tab_More.click();
				if ( cleartrip_tab_More_AirFareAlert.isDisplayed()    )   	bcleartrip_ThisElementValidationStatus = true;
				cleartrip_tab_More.click();
				break;

			case "lnk__Tell_us_what_you_think":
				if ( cleartrip_lnk_TellUsWhatYouThink.isDisplayed()    )   	bcleartrip_ThisElementValidationStatus = true;
				break;
			case "btn__Currency":
				if ( cleartrip_btn_Currency.isDisplayed()    )   	 		{bcleartrip_ThisElementValidationStatus = true;
					cleartrip_btn_Currency.click();				cleartrip_btn_Currency.click();}
				break;
			case "btn__Country_Selection":
				if ( cleartrip_drpdown_CountrySelection.isDisplayed()    )  {bcleartrip_ThisElementValidationStatus = true;
					cleartrip_drpdown_CountrySelection.click();	cleartrip_drpdown_CountrySelection.click();}
				break;

			case "labl__DEALS":
				if ( cleartrip_lnk_DealsForYou.isDisplayed()    )   	 	bcleartrip_ThisElementValidationStatus = true;
				break;
			case "lnk__Rewards_Know_More":
				if ( cleartrip_lnk_Rewards.isDisplayed()    )   	 		bcleartrip_ThisElementValidationStatus = true;
				break;

	    	default:
	    		break;
		}
		
		return bcleartrip_ThisElementValidationStatus;
		
	}
	
	public boolean cleartrip_Validate_HomePageGUIElements_for_DepartCityNames(String[] strArrDepartCities){

		boolean bcleartrip_ThisElementValidationStatus 		= true;

		for (String strOneDepartCity: strArrDepartCities){
			boolean bOneDepartCityNameFound = false;
			cleartrip_txtbox_BookFlight_FlightDepartFromCity.clear();
			cleartrip_txtbox_BookFlight_FlightDepartFromCity.sendKeys(strOneDepartCity);
			
			try{objWaitShort.until(ExpectedConditions.visibilityOf(cleartrip_somejunkelement));
			}catch (Exception e){/*System.out.println("DEBUG:    This exception to be ignored!");*/}

			for (WebElement objWebEleOneMatchingCityName : cleartrip_lst_labl_BookFlight_MatchingCityName){
				if (objWebEleOneMatchingCityName.getText().trim().contains(strOneDepartCity.trim()) ){
					bOneDepartCityNameFound = true; break;}
			}
			if (bOneDepartCityNameFound){
				System.out.println("RESULT::PASS");
				System.out.println("DEBUG:    Following depart city name is found: " + strOneDepartCity);}
			else{
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following depart city name is NOT found: " + strOneDepartCity);}
		}
		
		return bcleartrip_ThisElementValidationStatus;
	}
	
	public boolean cleartrip_Validate_HomePageGUIElements_for_ArriveCityNames(String[] strArrArriveCities){

		boolean bcleartrip_ThisElementValidationStatus 		= true;

		for (String strOneArriveCity: strArrArriveCities){
			boolean bOneDepartCityNameFound = false;
			cleartrip_txtbox_BookFlight_FlightArriveToCity.clear();
			cleartrip_txtbox_BookFlight_FlightArriveToCity.sendKeys(strOneArriveCity);
			
			try{objWaitShort.until(ExpectedConditions.visibilityOf(cleartrip_somejunkelement));
			}catch (Exception e){/*System.out.println("DEBUG:    This exception to be ignored!");*/}

			for (WebElement objWebEleOneMatchingCityName : cleartrip_lst_labl_BookFlight_MatchingCityName){
				if (objWebEleOneMatchingCityName.getText().trim().contains(strOneArriveCity.trim()) ){
					bOneDepartCityNameFound = true; break;}
			}
			if (bOneDepartCityNameFound){
				System.out.println("RESULT::PASS");
				System.out.println("DEBUG:    Following arrive city name is found: " + strOneArriveCity);}
			else{
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following arrive city name is NOT found: " + strOneArriveCity);}
		}
		
		return bcleartrip_ThisElementValidationStatus;
	}

	public boolean cleartrip_Validate_HomePageGUIElements_for_CommonOptionsForPersonCount(String strExpectedGUIOptionsValue){
		
		boolean bcleartrip_ThisElementValidationStatus = true;
		String[]  strArrPersonCountElements = ClsGeneralInitTerminateAndOtherUtil.splitThisString(strExpectedGUIOptionsValue," __ ");
		
		for (String strPersonCountElements : strArrPersonCountElements){
			boolean bcleartrip_LocalElementValidationStatus = false;
		    
			switch (strPersonCountElements){
				case "drp_dwn__Adults":
					if(cleartrip_drpdown_BookFlight_Adults.isDisplayed()){
						bcleartrip_LocalElementValidationStatus = true;
						// click and unclick the option
						cleartrip_drpdown_BookFlight_Adults.click();	cleartrip_drpdown_BookFlight_Adults.click();}
					break;
				case "drp_dwn__Children":
					if(cleartrip_drpdown_BookFlight_Childrens.isDisplayed()){
						bcleartrip_LocalElementValidationStatus = true;
						// click and unclick the option
						cleartrip_drpdown_BookFlight_Childrens.click();	cleartrip_drpdown_BookFlight_Childrens.click();}
					break;
				case "drp_dwn__Infants":
					if(cleartrip_drpdown_BookFlight_Infants.isDisplayed()){
						bcleartrip_LocalElementValidationStatus = true;
						// click and unclick the option
						cleartrip_drpdown_BookFlight_Infants.click();	cleartrip_drpdown_BookFlight_Infants.click();}
					break;
				default:
					break;
			}
			if(bcleartrip_LocalElementValidationStatus){
				System.out.println("RESULT::PASS");
				System.out.println("DEBUG:    Following person count option is found: " + strPersonCountElements);}
			else{
				bcleartrip_ThisElementValidationStatus = false;
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following person count option is NOT found: " + strPersonCountElements);
				objSoftAssert.fail("ERROR:    Following person count option is NOT found: " + strPersonCountElements);}
		}

		return  bcleartrip_ThisElementValidationStatus;
	}
	
	public boolean cleartrip_Validate_HomePageGUIElements_for_OnwardJourneyDateSelection(String strExpectedGUIOptionsValue){
		
		boolean bcleartrip_ThisElementValidationStatus = true;
		cleartrip_lst_drpdown_BookFlight_DepartDate_ArriveDate.get(0).click();

		String[]  strArrOnwardjourneyDateElements = ClsGeneralInitTerminateAndOtherUtil.splitThisString(strExpectedGUIOptionsValue," __ ");
		
		for (String strOnwardjourneyDateElement : strArrOnwardjourneyDateElements){
			boolean bcleartrip_LocalElementValidationStatus = false;

			switch (strOnwardjourneyDateElement){
				case "Check__current_date_month_year":
					if(		cleartrip_labl_BookFlight_DepartDate_CurrentDate.isDisplayed() && 
							cleartrip_lst_labl_BookFlight_DepartDate_CurrentMonth.get(0).isDisplayed() && 
							cleartrip_lst_labl_BookFlight_DepartDate_CurrentYear.get(0).isDisplayed()){
						bcleartrip_LocalElementValidationStatus = true;
						System.out.println("DEBUG:    Current selected date:  " + cleartrip_labl_BookFlight_DepartDate_CurrentDate.getText());
						System.out.println("DEBUG:    Current selected month: " + cleartrip_lst_labl_BookFlight_DepartDate_CurrentMonth.get(0).getText());
						System.out.println("DEBUG:    Current selected year:  " + cleartrip_lst_labl_BookFlight_DepartDate_CurrentYear.get(0).getText());}
					break;
				case "Check__two_months_drop_down_at_a_time":
					if(		cleartrip_lst_labl_BookFlight_DepartDate_CurrentMonth.get(0).isDisplayed() && 
							cleartrip_lst_labl_BookFlight_DepartDate_CurrentMonth.get(1).isDisplayed() &&
							cleartrip_lst_labl_BookFlight_DepartDate_CurrentYear.get(0).isDisplayed() &&
							cleartrip_lst_labl_BookFlight_DepartDate_CurrentYear.get(1).isDisplayed()){
						bcleartrip_LocalElementValidationStatus = true;
						System.out.println("DEBUG:    Current month:  " + cleartrip_lst_labl_BookFlight_DepartDate_CurrentMonth.get(0).getText());
						System.out.println("DEBUG:    Current year:   " + cleartrip_lst_labl_BookFlight_DepartDate_CurrentYear.get(0).getText());
						System.out.println("DEBUG:    Next month:     " + cleartrip_lst_labl_BookFlight_DepartDate_CurrentMonth.get(1).getText());
						System.out.println("DEBUG:    Next year:      " + cleartrip_lst_labl_BookFlight_DepartDate_CurrentYear.get(1).getText());}
					break;
				default:
					break;
			}
			if(bcleartrip_LocalElementValidationStatus){
				System.out.println("RESULT::PASS");
				System.out.println("DEBUG:    Following onward journey date element option is found: " + strOnwardjourneyDateElement);}
			else{
				bcleartrip_ThisElementValidationStatus = false;
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following onward journey date element option is NOT found: " + strOnwardjourneyDateElement);
				objSoftAssert.fail("ERROR:    Following onward journey date element option is NOT found: " + strOnwardjourneyDateElement);}
		}
		
		return bcleartrip_ThisElementValidationStatus;
	}
	
	public boolean cleartrip_Validate_HomePageGUIElements_for_ReturnJourneyDateDropDown(String strExpectedGUIOptionsValue){
		
		boolean bcleartrip_ThisElementValidationStatus = true;
		cleartrip_radiobtn_BookFlight_RoundWay.click();
		objWaitShort.until(ExpectedConditions.visibilityOf(cleartrip_lst_drpdown_BookFlight_DepartDate_ArriveDate.get(1)));
		cleartrip_lst_drpdown_BookFlight_DepartDate_ArriveDate.get(1).click();

		String[]  strArrOnwardjourneyDateElements = ClsGeneralInitTerminateAndOtherUtil.splitThisString(strExpectedGUIOptionsValue," __ ");
		
		for (String strOnwardjourneyDateElement : strArrOnwardjourneyDateElements){
			boolean bcleartrip_LocalElementValidationStatus = false;

			switch (strOnwardjourneyDateElement){
				case "Check__two_months_drop_down_at_a_time":
					if(		cleartrip_lst_labl_BookFlight_DepartDate_CurrentMonth.get(0).isDisplayed() && 
							cleartrip_lst_labl_BookFlight_DepartDate_CurrentMonth.get(1).isDisplayed() &&
							cleartrip_lst_labl_BookFlight_DepartDate_CurrentYear.get(0).isDisplayed() &&
							cleartrip_lst_labl_BookFlight_DepartDate_CurrentYear.get(1).isDisplayed()){
						bcleartrip_LocalElementValidationStatus = true;
						System.out.println("DEBUG:    Current month:  " + cleartrip_lst_labl_BookFlight_DepartDate_CurrentMonth.get(0).getText());
						System.out.println("DEBUG:    Current year:   " + cleartrip_lst_labl_BookFlight_DepartDate_CurrentYear.get(0).getText());
						System.out.println("DEBUG:    Next month:     " + cleartrip_lst_labl_BookFlight_DepartDate_CurrentMonth.get(1).getText());
						System.out.println("DEBUG:    Next year:      " + cleartrip_lst_labl_BookFlight_DepartDate_CurrentYear.get(1).getText());}
					break;
				default:
					break;
			}
			if(bcleartrip_LocalElementValidationStatus){
				System.out.println("RESULT::PASS");
				System.out.println("DEBUG:    Following round trip journey date element option is found: " + strOnwardjourneyDateElement);}
			else{
				bcleartrip_ThisElementValidationStatus = false;
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following round trip journey date element option is NOT found: " + strOnwardjourneyDateElement);
				objSoftAssert.fail("ERROR:    Following round trip journey date element option is NOT found: " + strOnwardjourneyDateElement);}
		}
		
		return bcleartrip_ThisElementValidationStatus;
	}
	
	public boolean cleartrip_Validate_HomePageGUIElements_for_MulticityJourneyOptions(String strExpectedGUIOptionsValue){
		
		boolean bcleartrip_ThisElementValidationStatus = true;
		cleartrip_radiobtn_BookFlight_MultiCity.click();
		objWaitShort.until(ExpectedConditions.visibilityOf(cleartrip_btn_MultiCity_RemoveLastCity));

		String[]  strArrMultiCityElements = ClsGeneralInitTerminateAndOtherUtil.splitThisString(strExpectedGUIOptionsValue," __ ");
		
		for (String strMultiCityElement : strArrMultiCityElements){
			boolean bcleartrip_LocalElementValidationStatus = false;

			switch (strMultiCityElement){
				case "text_box__each_for_from_and_to_city":
					if(  (cleartrip_txtbox_BookFlight_MultiCity_DepartCity.size() > 0) && 
						 (cleartrip_txtbox_BookFlight_MultiCity_ArriveCity.size() > 0) ){
						bcleartrip_LocalElementValidationStatus = true;
						System.out.println("DEBUG:    Following count of depart city text box found:  " + cleartrip_txtbox_BookFlight_MultiCity_DepartCity.size());
						System.out.println("DEBUG:    Following count of arrive city text box found:  " + cleartrip_txtbox_BookFlight_MultiCity_ArriveCity.size());
					}
					break;
				case "Check__two_months_drop_down_at_a_time":
					if( cleartrip_lst_drpdown_BookFlight_DepartDate_ArriveDate.size() > 2){    //first 2 are not for multicity trip
						bcleartrip_LocalElementValidationStatus = true;
						
						cleartrip_lst_drpdown_BookFlight_DepartDate_ArriveDate.get(2).click();
						if(		cleartrip_lst_labl_BookFlight_DepartDate_CurrentMonth.get(0).isDisplayed() && 
								cleartrip_lst_labl_BookFlight_DepartDate_CurrentMonth.get(1).isDisplayed() &&
								cleartrip_lst_labl_BookFlight_DepartDate_CurrentYear.get(0).isDisplayed() &&
								cleartrip_lst_labl_BookFlight_DepartDate_CurrentYear.get(1).isDisplayed()){
							System.out.println("DEBUG:    Multicity date selector 1");
							System.out.println("DEBUG:    Current month:  " + cleartrip_lst_labl_BookFlight_DepartDate_CurrentMonth.get(0).getText());
							System.out.println("DEBUG:    Current year:   " + cleartrip_lst_labl_BookFlight_DepartDate_CurrentYear.get(0).getText());
							System.out.println("DEBUG:    Next month:     " + cleartrip_lst_labl_BookFlight_DepartDate_CurrentMonth.get(1).getText());
							System.out.println("DEBUG:    Next year:      " + cleartrip_lst_labl_BookFlight_DepartDate_CurrentYear.get(1).getText());}
						cleartrip_lst_drpdown_BookFlight_DepartDate_ArriveDate.get(2).sendKeys(Keys.ESCAPE);

						cleartrip_lst_drpdown_BookFlight_DepartDate_ArriveDate.get(3).click();
						if(		cleartrip_lst_labl_BookFlight_DepartDate_CurrentMonth.get(0).isDisplayed() && 
								cleartrip_lst_labl_BookFlight_DepartDate_CurrentMonth.get(1).isDisplayed() &&
								cleartrip_lst_labl_BookFlight_DepartDate_CurrentYear.get(0).isDisplayed() &&
								cleartrip_lst_labl_BookFlight_DepartDate_CurrentYear.get(1).isDisplayed()){
							System.out.println("DEBUG:    Multicity date selector 2");
							System.out.println("DEBUG:    Current month:  " + cleartrip_lst_labl_BookFlight_DepartDate_CurrentMonth.get(0).getText());
							System.out.println("DEBUG:    Current year:   " + cleartrip_lst_labl_BookFlight_DepartDate_CurrentYear.get(0).getText());
							System.out.println("DEBUG:    Next month:     " + cleartrip_lst_labl_BookFlight_DepartDate_CurrentMonth.get(1).getText());
							System.out.println("DEBUG:    Next year:      " + cleartrip_lst_labl_BookFlight_DepartDate_CurrentYear.get(1).getText());}
						cleartrip_lst_drpdown_BookFlight_DepartDate_ArriveDate.get(3).sendKeys(Keys.ESCAPE);
						
						cleartrip_lst_drpdown_BookFlight_DepartDate_ArriveDate.get(4).click();
						if(		cleartrip_lst_labl_BookFlight_DepartDate_CurrentMonth.get(0).isDisplayed() && 
								cleartrip_lst_labl_BookFlight_DepartDate_CurrentMonth.get(1).isDisplayed() &&
								cleartrip_lst_labl_BookFlight_DepartDate_CurrentYear.get(0).isDisplayed() &&
								cleartrip_lst_labl_BookFlight_DepartDate_CurrentYear.get(1).isDisplayed()){
							System.out.println("DEBUG:    Multicity date selector 3");
							System.out.println("DEBUG:    Current month:  " + cleartrip_lst_labl_BookFlight_DepartDate_CurrentMonth.get(0).getText());
							System.out.println("DEBUG:    Current year:   " + cleartrip_lst_labl_BookFlight_DepartDate_CurrentYear.get(0).getText());
							System.out.println("DEBUG:    Next month:     " + cleartrip_lst_labl_BookFlight_DepartDate_CurrentMonth.get(1).getText());
							System.out.println("DEBUG:    Next year:      " + cleartrip_lst_labl_BookFlight_DepartDate_CurrentYear.get(1).getText());}
						cleartrip_lst_drpdown_BookFlight_DepartDate_ArriveDate.get(4).sendKeys(Keys.ESCAPE);
					}
					break;
				case "btn__Add_one_more":
					if(cleartrip_btn_MultiCity_AddMore.isDisplayed()){
						bcleartrip_LocalElementValidationStatus = true;
						cleartrip_btn_MultiCity_AddMore.click();}
					break;
				case "btn__Remove_last_city":
					if(cleartrip_btn_MultiCity_RemoveLastCity.isDisplayed()){
						bcleartrip_LocalElementValidationStatus = true;
						cleartrip_btn_MultiCity_RemoveLastCity.click();}
					break;
				case "drpdown__class_of_travel":
					if( cleartrip_drpdown_ClassOfTravel.size() >1){
						bcleartrip_LocalElementValidationStatus = true;
						cleartrip_drpdown_ClassOfTravel.get(0).click();}
					break;
				default:
					break;
			}
			if(bcleartrip_LocalElementValidationStatus){
				System.out.println("RESULT::PASS");
				System.out.println("DEBUG:    Following multi city journey element option is found: " + strMultiCityElement);}
			else{
				bcleartrip_ThisElementValidationStatus = false;
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following multi city journey element option is NOT found: " + strMultiCityElement);
				objSoftAssert.fail("ERROR:    Following multi city journey element option is NOT found: " + strMultiCityElement);}
		}
		
		return bcleartrip_ThisElementValidationStatus;
	}
	
	public boolean cleartrip_Validate_HomePageGUIElements_for_FlightandHotel_Package(String strExpectedGUIOptionsValue){
	
		boolean bcleartrip_ThisElementValidationStatus = true;
		cleartrip_radiobtn_BookFlight_FlightandHotel_Package.click();
		objWaitShort.until(ExpectedConditions.urlContains("/packages"));

		String[]  strArrPackagesElements = ClsGeneralInitTerminateAndOtherUtil.splitThisString(strExpectedGUIOptionsValue," __ ");
		for (String strSinglePackageElement : strArrPackagesElements){
			boolean bcleartrip_LocalElementValidationStatus = false;

			switch (strSinglePackageElement){
				case "txt_box__Depart_on":
					if (cleartrip_txtbox_BookFlight_FlightDepartFromCity.isDisplayed()){
						bcleartrip_LocalElementValidationStatus = true;
						cleartrip_txtbox_BookFlight_FlightDepartFromCity.sendKeys("Berlin (BER), Germany");}
					break;
				case "txt_box__Return_on":
					if (cleartrip_txtbox_BookFlight_FlightArriveToCity.isDisplayed()){
						bcleartrip_LocalElementValidationStatus = true;
						cleartrip_txtbox_BookFlight_FlightArriveToCity.sendKeys("Milan (MIL), Italy");}
					break;
				case "Check__two_months_drop_down_at_a_time":
					if( cleartrip_drpdown_Package_DepartDate_ArriveDate.size() > 0){
						bcleartrip_LocalElementValidationStatus = true;
						
						cleartrip_drpdown_Package_DepartDate_ArriveDate.get(0).click();
						if(		cleartrip_lst_labl_BookFlight_DepartDate_CurrentMonth.get(0).isDisplayed() && 
								cleartrip_lst_labl_BookFlight_DepartDate_CurrentMonth.get(1).isDisplayed() &&
								cleartrip_lst_labl_BookFlight_DepartDate_CurrentYear.get(0).isDisplayed() &&
								cleartrip_lst_labl_BookFlight_DepartDate_CurrentYear.get(1).isDisplayed()){
							System.out.println("DEBUG:    Multicity date selector 1");
							System.out.println("DEBUG:    Current month:  " + cleartrip_lst_labl_BookFlight_DepartDate_CurrentMonth.get(0).getText());
							System.out.println("DEBUG:    Current year:   " + cleartrip_lst_labl_BookFlight_DepartDate_CurrentYear.get(0).getText());
							System.out.println("DEBUG:    Next month:     " + cleartrip_lst_labl_BookFlight_DepartDate_CurrentMonth.get(1).getText());
							System.out.println("DEBUG:    Next year:      " + cleartrip_lst_labl_BookFlight_DepartDate_CurrentYear.get(1).getText());}
						//cleartrip_txtbox_BookFlight_FlightDepartFromCity.click();
						cleartrip_drpdown_Package_DepartDate_ArriveDate.get(0).sendKeys("" + Keys.ESCAPE + Keys.ESCAPE+ Keys.ESCAPE+ Keys.ESCAPE+ Keys.ESCAPE+ Keys.ESCAPE+ Keys.ESCAPE);

						cleartrip_drpdown_Package_DepartDate_ArriveDate.get(1).click();
						if(		cleartrip_lst_labl_BookFlight_DepartDate_CurrentMonth.get(0).isDisplayed() && 
								cleartrip_lst_labl_BookFlight_DepartDate_CurrentMonth.get(1).isDisplayed() &&
								cleartrip_lst_labl_BookFlight_DepartDate_CurrentYear.get(0).isDisplayed() &&
								cleartrip_lst_labl_BookFlight_DepartDate_CurrentYear.get(1).isDisplayed()){
							System.out.println("DEBUG:    Multicity date selector 2");
							System.out.println("DEBUG:    Current month:  " + cleartrip_lst_labl_BookFlight_DepartDate_CurrentMonth.get(0).getText());
							System.out.println("DEBUG:    Current year:   " + cleartrip_lst_labl_BookFlight_DepartDate_CurrentYear.get(0).getText());
							System.out.println("DEBUG:    Next month:     " + cleartrip_lst_labl_BookFlight_DepartDate_CurrentMonth.get(1).getText());
							System.out.println("DEBUG:    Next year:      " + cleartrip_lst_labl_BookFlight_DepartDate_CurrentYear.get(1).getText());}
						cleartrip_drpdown_Package_DepartDate_ArriveDate.get(1).sendKeys("" + Keys.ESCAPE + Keys.ESCAPE+ Keys.ESCAPE+ Keys.ESCAPE+ Keys.ESCAPE+ Keys.ESCAPE+ Keys.ESCAPE);
					}
					break;
				default:
					break;
			}
			if(bcleartrip_LocalElementValidationStatus){
				System.out.println("RESULT::PASS");
				System.out.println("DEBUG:    Following flight+hotel package element option is found: " + strSinglePackageElement);}
			else{
				bcleartrip_ThisElementValidationStatus = false;
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following flight+hotel package element option is NOT found: " + strSinglePackageElement);
				objSoftAssert.fail("ERROR:    Following flight+hotel package element option is NOT found: " + strSinglePackageElement);}
		}

		return bcleartrip_ThisElementValidationStatus;
	}
	
	public boolean cleartrip_Validate_HomePageGUIElements_for_ClassofTravel(String strExpectedGUIOptionsValue){
		
		boolean bcleartrip_ThisElementValidationStatus = true;
		cleartrip_lnk_MoreOptions.click();
		objWaitShort.until(ExpectedConditions.visibilityOf(cleartrip_drpdown_ClassOfTravel.get(0)));

		String[]  strArrClassOfTravelElements = ClsGeneralInitTerminateAndOtherUtil.splitThisString(strExpectedGUIOptionsValue," __ ");
		for (String strSingleClassOfTravelElement : strArrClassOfTravelElements){
			boolean bcleartrip_LocalElementValidationStatus = false;

			switch (strSingleClassOfTravelElement){
				case "lnk__More options Class of travel":
					if (cleartrip_drpdown_ClassOfTravel.get(0).isDisplayed()){
						bcleartrip_LocalElementValidationStatus = true;
						Select objSelectClassOfTravel = new Select(cleartrip_drpdown_ClassOfTravel.get(0));
						objSelectClassOfTravel.selectByIndex(1);}
					break;
				case "Airline preference":
					if (cleartrip_txtbox_PreferredAirlines.isDisplayed()){
						bcleartrip_LocalElementValidationStatus = true;
						cleartrip_txtbox_PreferredAirlines.sendKeys("American Airlines (AA)");}
					break;
				default:
					break;
			}
			if(bcleartrip_LocalElementValidationStatus){
				System.out.println("RESULT::PASS");
				System.out.println("DEBUG:    Following flight+hotel package element option is found: " + strSingleClassOfTravelElement);}
			else{
				bcleartrip_ThisElementValidationStatus = false;
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following flight+hotel package element option is NOT found: " + strSingleClassOfTravelElement);
				objSoftAssert.fail("ERROR:    Following flight+hotel package element option is NOT found: " + strSingleClassOfTravelElement);}
		}

		return bcleartrip_ThisElementValidationStatus;
	}
	
	public boolean cleartrip_Validate_HomePageGUIElements_for_InvalidCityNameErrorCheck(String strExpectedGUIOptionsValue){
		
		cleartrip_txtbox_BookFlight_FlightDepartFromCity.sendKeys("zzzzz");
		cleartrip_txtbox_BookFlight_FlightArriveToCity.sendKeys("xxxx");
		cleartrip_lst_drpdown_BookFlight_DepartDate_ArriveDate.get(0).click();
		cleartrip_labl_BookFlight_DepartDate_CurrentDate.click();
		cleartrip_drpdown_BookFlight_SearchFlightButton.click();

		try{objWaitShort.until(ExpectedConditions.visibilityOf(cleartrip_labl_MainPageErrors));
			System.out.println("RESULT::PASS");
			System.out.println("DEBUG:    For invalid city name following error is message shown: " + cleartrip_labl_MainPageErrors.getText());
		}catch (Exception e){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    For invalid city name test, please enter invalid city names");
		}
		
		return true;
	}
	
	public boolean cleartrip_Validate_HomePageElements_for_Book_Category(String strGUIOptionListFor_Book){

		boolean bcleartrip_ThisElementValidationStatus 		= true;
		boolean bSpportedElementFound								= false;
		
		if (strGUIOptionListFor_Book.contains("btn__RETURN")){
			bSpportedElementFound = true;
			if (!  cleartrip_lst_BookTicketType_1Way_2Way.get(0).isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "btn__RETURN");
				System.out.println("ERROR:    Following element not found: " + "btn__RETURN");
				bcleartrip_ThisElementValidationStatus = false;}
		}
		if (strGUIOptionListFor_Book.contains("btn__ONE WAY")){
			bSpportedElementFound = true;
			if (!  cleartrip_lst_BookTicketType_1Way_2Way.get(1).isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "ONE WAY");
				System.out.println("ERROR:    Following element not found: " + "ONE WAY");
				bcleartrip_ThisElementValidationStatus = false;
		   }else{
			   // click on one way button then click on 2 way button
			   cleartrip_lst_BookTicketType_1Way_2Way.get(1).click();
			   cleartrip_lst_BookTicketType_1Way_2Way.get(0).click();		   }
		}		
		if (strGUIOptionListFor_Book.contains("txtbox__Depart city")){
			bSpportedElementFound = true;
			if (!  cleartrip_txtbox_BookFlight_FlightDepartFromCity.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "txtbox__Depart city");
				System.out.println("ERROR:    Following element not found: " + "txtbox__Depart city");
				bcleartrip_ThisElementValidationStatus = false;
			}else{
				// Enter some dummy depart city name
				cleartrip_txtbox_BookFlight_FlightDepartFromCity.sendKeys("Berlin (BER), Germany");			}
		}
		if (strGUIOptionListFor_Book.contains("txtbox__Arrival city")){
			bSpportedElementFound = true;
			if (!  cleartrip_txtbox_BookFlight_FlightArriveToCity.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "txtbox__Arrival city");
				System.out.println("ERROR:    Following element not found: " + "txtbox__Arrival city");
				bcleartrip_ThisElementValidationStatus = false;
			}else{
				// Enter some dummy arrive city name
				cleartrip_txtbox_BookFlight_FlightArriveToCity.sendKeys("Milan (MIL), Italy");			}
		}
		if (strGUIOptionListFor_Book.contains("chkbox__Redeem Miles")){
			bSpportedElementFound = true;
			if (!  cleartrip_chkbox_RedeemMile.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "chkbox__Redeem Miles");
				System.out.println("ERROR:    Following element not found: " + "chkbox__Redeem Miles");
				bcleartrip_ThisElementValidationStatus = false;
			}else{
				// click on the redeem miles chk box then unclick on same
				cleartrip_chkbox_RedeemMile.click();
				cleartrip_chkbox_RedeemMile.click();			}
		}
		if (strGUIOptionListFor_Book.contains("btn__Search")){
			bSpportedElementFound = true;
			if (!  cleartrip_btn_Search.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "btn__Search");
				System.out.println("ERROR:    Following element not found: " + "btn__Search");
				bcleartrip_ThisElementValidationStatus = false;}
		}
		if (strGUIOptionListFor_Book.contains("lnk__Refine Search")){
			bSpportedElementFound = true;
			if (!  cleartrip_lnk_RefineSearch.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "lnk__Refine Search");
				System.out.println("ERROR:    Following element not found: " + "lnk__Refine Search");
				bcleartrip_ThisElementValidationStatus = false;}
		}
		if (strGUIOptionListFor_Book.contains("drpdwn__Depart date")){
			bSpportedElementFound = true;
			if (!  cleartrip_lst_Date_Depart_Arrive.get(0).isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "drpdwn__Depart date");
				System.out.println("ERROR:    Following element not found: " + "drpdwn__Depart date");
				bcleartrip_ThisElementValidationStatus = false;
			}else{
				// click on date drop down then unclick on same
				cleartrip_lst_Date_Depart_Arrive.get(0).click();
				cleartrip_lst_Date_Depart_Arrive.get(0).click();			}
		}
		if (strGUIOptionListFor_Book.contains("drpdwn__Arrival date")){
			bSpportedElementFound = true;
			if (!  cleartrip_lst_Date_Depart_Arrive.get(1).isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "drpdwn__Arrival date");
				System.out.println("ERROR:    Following element not found: " + "drpdwn__Arrival date");
				bcleartrip_ThisElementValidationStatus = false;
			}else{
				// click on date drop down then unclick on same
				cleartrip_lst_Date_Depart_Arrive.get(1).click();
				cleartrip_lst_Date_Depart_Arrive.get(1).click();			}
		}
		if (strGUIOptionListFor_Book.contains("drpdwn__Children count")){
			bSpportedElementFound = true;
			if (!  cleartrip_drpdwn_Children_Count.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "drpdwn__Children count");
				System.out.println("ERROR:    Following element not found: " + "drpdwn__Children count");
				bcleartrip_ThisElementValidationStatus = false;
			}else{
				// click on children count drop down then unclick on same
				cleartrip_drpdwn_Children_Count.click();
				cleartrip_drpdwn_Children_Count.click();			}
		}
		if (strGUIOptionListFor_Book.contains("drpdwn__Adult count")){
			bSpportedElementFound = true;
			if (!  cleartrip_drpdwn_Adult_Count.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "drpdwn__Adult count");
				System.out.println("ERROR:    Following element not found: " + "drpdwn__Adult count");
				bcleartrip_ThisElementValidationStatus = false;
			}else{
				// click on adult count drop down then unclick on same
				cleartrip_drpdwn_Adult_Count.click();
				cleartrip_drpdwn_Adult_Count.click();			}
		}
		if (strGUIOptionListFor_Book.contains("special__calender from date")){
			bSpportedElementFound = true;
			if (!  cleartrip_lst_Date_Depart_Arrive.get(0).isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "special__calender from date");
				System.out.println("ERROR:    Following element not found: " + "special__calender from date");
				bcleartrip_ThisElementValidationStatus = false;
			}else{
				// click on adult count drop down then unclick on same
				cleartrip_lst_Date_Depart_Arrive.get(0).click();
				System.out.println("DEBUG:    Calender found for Book flight depart date for following month and year: " + 
					cleartrip_lst_BookFlight_DropDown_DepartArriveDate.get(0).findElement(By.className("ui-datepicker-month")).getText() + "-" + 
					cleartrip_lst_BookFlight_DropDown_DepartArriveDate.get(0).findElement(By.className("ui-datepicker-year")).getText()  + " " +
					cleartrip_lst_BookFlight_DropDown_DepartArriveDate.get(1).findElement(By.className("ui-datepicker-month")).getText() + "-" +
					cleartrip_lst_BookFlight_DropDown_DepartArriveDate.get(1).findElement(By.className("ui-datepicker-year")).getText()               );
			}
		}
		if (strGUIOptionListFor_Book.contains("special__calender to date")){
			bSpportedElementFound = true;
			if (!  cleartrip_lst_Date_Depart_Arrive.get(1).isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "special__calender to date");
				System.out.println("ERROR:    Following element not found: " + "special__calender to date");
				bcleartrip_ThisElementValidationStatus = false;
			}else{
				// click on adult count drop down then unclick on same
				cleartrip_lst_Date_Depart_Arrive.get(1).click();
				System.out.println("DEBUG:    Calender found for Book flight arrive date for following month and year: " + 
					cleartrip_lst_BookFlight_DropDown_DepartArriveDate.get(0).findElement(By.className("ui-datepicker-month")).getText() + "-" + 
					cleartrip_lst_BookFlight_DropDown_DepartArriveDate.get(0).findElement(By.className("ui-datepicker-year")).getText()  + " " +
					cleartrip_lst_BookFlight_DropDown_DepartArriveDate.get(1).findElement(By.className("ui-datepicker-month")).getText() + "-" +
					cleartrip_lst_BookFlight_DropDown_DepartArriveDate.get(1).findElement(By.className("ui-datepicker-year")).getText()               );
			}
		}
		if (strGUIOptionListFor_Book.contains("special__drpdwn Adult count")){
			bSpportedElementFound = true;
			if (!  cleartrip_drpdwn_Adult_Count.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "special__drpdwn Adult count");
				System.out.println("ERROR:    Following element not found: " + "special__drpdwn Adult count");
				bcleartrip_ThisElementValidationStatus = false;
			}else{
				// click on adult count drop down then unclick on same
				Select objSelectAdultPersonCount = new Select(cleartrip_drpdwn_Adult_Count);
				System.out.println("DEBUG:    Following number of options found for Adult person count : " +  objSelectAdultPersonCount.getOptions().size());
			}
		}
		if (strGUIOptionListFor_Book.contains("special__drpdwn_Children count")){
			bSpportedElementFound = true;
			if (!  cleartrip_drpdwn_Children_Count.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "special__drpdwn_Children count");
				System.out.println("ERROR:    Following element not found: " + "special__drpdwn_Children count");
				bcleartrip_ThisElementValidationStatus = false;
			}else{
				// click on adult count drop down then unclick on same
				Select objSelectChildrePersonCount = new Select(cleartrip_drpdwn_Children_Count);
				System.out.println("DEBUG:    Following number of options found for Children person count : " +  objSelectChildrePersonCount.getOptions().size());
			}
		}
		
		if (!bSpportedElementFound){
			objSoftAssert.fail("ERROR:    Atleast one unsuported element NOT found in following category: " + "Book Flights");
			System.out.println("ERROR:    Atleast one unsuported element NOT found in following category: " + "Book Flights");
			return bSpportedElementFound;
		}
		if (bcleartrip_ThisElementValidationStatus) System.out.println("RESULT::PASS");
		else{
			System.out.println("RESULT::FAIL");
			objSoftAssert.fail("ERROR:    Atleast one supported element NOT found in following category: " + "Book Flights");
			System.out.println("ERROR:    Atleast one supported element NOT found in following category: " + "Book Flights");
		}		

		return bcleartrip_ThisElementValidationStatus;
		
	}
	
	public boolean cleartrip_Validate_Ticket_Booking_Search_Scenario_Combination(
			String strDepartCityType,String strArriveCityType, String strDateType, String strExpectedSearchResult,
			String[] strArrRandomDepaartAndArriveCityNames_Global){
		
		boolean bcleartrip_ThisElementValidationStatus = true;

		// enter depart city
		if (!strDepartCityType.contains("invalid")){
			cleartrip_txtbox_BookFlight_FlightDepartFromCity.sendKeys(strArrRandomDepaartAndArriveCityNames_Global[0]);
		}else{cleartrip_txtbox_BookFlight_FlightDepartFromCity.sendKeys("zzzzz");}
		
		// enter arrive city
		if (!strArriveCityType.contains("invalid")){
			cleartrip_txtbox_BookFlight_FlightArriveToCity.sendKeys(strArrRandomDepaartAndArriveCityNames_Global[1]);
		}else{cleartrip_txtbox_BookFlight_FlightArriveToCity.sendKeys("xxxx");}

		// enter journey date
		if (strDateType.contains("next friday")){
			cleartrip_lst_drpdown_BookFlight_DepartDate_ArriveDate.get(0).click();
			cleartrip_txtbox_BookFlight_DepartDate.sendKeys(cleartrip_getFormattedFullDatefor_NextFriday() + Keys.RIGHT + Keys.RIGHT + Keys.RIGHT + Keys.RIGHT );
		}else if (strDateType.contains("long date from today")){
			cleartrip_lst_drpdown_BookFlight_DepartDate_ArriveDate.get(0).click();
			cleartrip_txtbox_BookFlight_DepartDate.sendKeys(cleartrip_getFormattedFullDatefor_NextYear() + Keys.RIGHT + Keys.RIGHT + Keys.RIGHT + Keys.RIGHT );
		}
		else{ // else just select today's date or default highighted date
			cleartrip_lst_drpdown_BookFlight_DepartDate_ArriveDate.get(0).click();
			cleartrip_labl_BookFlight_DepartDate_CurrentDate.click();
		}
		
		// start searching
		cleartrip_drpdown_BookFlight_SearchFlightButton.click();
		
		// validate expected result
		if (strExpectedSearchResult.contains("error_message__")){
			try{objWaitShort.until(ExpectedConditions.visibilityOf(cleartrip_labl_MainPageErrors));
				System.out.println("RESULT::PASS");
				System.out.println("DEBUG:    For invalid input parameters following error is message shown: " + cleartrip_labl_MainPageErrors.getText());
			}catch (Exception e){
				bcleartrip_ThisElementValidationStatus = false;
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    For invalid input parameters NO valid error message is shown");
			}
		} else if (strExpectedSearchResult.contains("error_message_long_date__")){
			try{objWait.until(ExpectedConditions.visibilityOf(cleartrip_labl_IncorrectInputConditionError));}catch (Exception e){}
			try{objWait.until(ExpectedConditions.visibilityOf(cleartrip_labl_IncorrectInputConditionError));}catch (Exception e){}
			try{objWait.until(ExpectedConditions.visibilityOf(cleartrip_labl_IncorrectInputConditionError));}catch (Exception e){}
			System.out.println("RESULT::PASS");
			System.out.println("DEBUG:    For incorrect input parameters following error is message shown: " + cleartrip_labl_IncorrectInputConditionError.getText());

			if(cleartrip_btn_TrySearchingAgain.isDisplayed()){
				cleartrip_btn_TrySearchingAgain.click();}
			
			try{objWaitShort.until(ExpectedConditions.visibilityOf(cleartrip_somejunkelement));
			}catch (Exception e){/*System.out.println("DEBUG:    This exception to be ignored!");*/}
		}else{
			if (cleartrip_lst_stripes_SearchResultInProgress.get(0).isDisplayed()){
				System.out.println("DEBUG:    Search result progress strip bar is displayed");}
			if (cleartrip_lst_stripes_SearchResultInProgress.get(0).isEnabled()){
				System.out.println("DEBUG:    Search result progress strip bar is enabled");}

			try{objWait.until(ExpectedConditions.visibilityOfAllElements(cleartrip_lst_stripes_SearchResult_Count));}
			catch (Exception e){
				try{objWait.until(ExpectedConditions.visibilityOfAllElements(cleartrip_lst_stripes_SearchResult_Count));}
				catch (Exception e1){}
			}

			System.out.println("RESULT::PASS");
			System.out.println("DEBUG:    For valid input parameters following count of search results shown: " + cleartrip_lst_stripes_SearchResult_Count.size());
		}
		
		return bcleartrip_ThisElementValidationStatus;
	}

	public boolean cleartrip_Perform_Simple_Valid_Flight_Search_With_Default_Paramaters(String[] strArrRandomDepaartAndArriveCityNames){

		boolean bcleartrip_ThisElementValidationStatus 		= true;
		Actions objActionsBldr_cleartrip_HomePage 			= new Actions(this.objWebDriverAbstract);
		
		System.out.println("DEBUG:    Depart city:           " + strArrRandomDepaartAndArriveCityNames[0]);
		System.out.println("DEBUG:    Arrive city:           " + strArrRandomDepaartAndArriveCityNames[1]);		
		System.out.println("DEBUG:    Flight type:           " + "One Way");
		System.out.println("DEBUG:    Flight departure date: " + cleartrip_getFormattedFullDatefor_NextFriday());
		System.out.println("DEBUG:    Flight arrive date:    " + "NA");
		
		// click on one way radio button
		cleartrip_radiobtn_BookFlight_OneWay.click();

		objActionsBldr_cleartrip_HomePage
			.sendKeys(cleartrip_txtbox_BookFlight_FlightDepartFromCity, strArrRandomDepaartAndArriveCityNames[0])
			.sendKeys(cleartrip_txtbox_BookFlight_FlightArriveToCity,   strArrRandomDepaartAndArriveCityNames[1])
			.click(cleartrip_lst_drpdown_BookFlight_DepartDate_ArriveDate.get(0))
			.sendKeys(cleartrip_txtbox_BookFlight_DepartDate, cleartrip_getFormattedFullDatefor_NextFriday() + Keys.RIGHT + Keys.RIGHT + Keys.RIGHT + Keys.RIGHT )
			.click(cleartrip_drpdown_BookFlight_SearchFlightButton)
			.build()
			.perform();
		
		try{objWait.until(ExpectedConditions.visibilityOf(cleartrip_labl_MainPageErrors));
			bcleartrip_ThisElementValidationStatus = false;
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Invalid input parameters or no valid search results found");
			objSoftAssert.fail("ERROR:    Invalid input parameters or no valid search results found");
			return bcleartrip_ThisElementValidationStatus;
		}catch (Exception e){}

		try{objWait.until(ExpectedConditions.visibilityOfAllElements(cleartrip_lst_stripes_SearchResult_Count));}catch (Exception e){}
		try{objWait.until(ExpectedConditions.visibilityOfAllElements(cleartrip_lst_stripes_SearchResult_Count));}catch (Exception e){}

		System.out.println("DEBUG:    Following count of search results shown: " + cleartrip_lst_stripes_SearchResult_Count.size());
		return bcleartrip_ThisElementValidationStatus;
	}
	
	public boolean cleartrip_Validate_This_Offer(String strOfferToCheck){
		
		boolean bcleartrip_ThisElementValidationStatus 		= true;
		boolean bcleartrip_OfferFound 						= false;
		String strcleartrip_OfferHeader						= "";
		int nDealsOffers_SliderCount						= 6;
		int nLocal											= 0;

		// offer_01__ App Offer
		if (strOfferToCheck.contains("offer_01__"))			strcleartrip_OfferHeader = "App Offer";
		// offer_01__ Activities offer
		if (strOfferToCheck.contains("offer_02__"))			strcleartrip_OfferHeader = "Activities offer";
		
		for (nLocal=0; nLocal < nDealsOffers_SliderCount; nLocal++){
			if (cleartrip_lst_labl_HomePage_DealsOffers_Heading.get(nLocal).getText().contains(strcleartrip_OfferHeader.trim())){
				bcleartrip_OfferFound = true;
				break;
			}
			cleartrip_labl_HomePage_DealsOffers_ArrowRight.click();
			try{objWaitShort.until(ExpectedConditions.visibilityOf(cleartrip_somejunkelement));
			}catch (Exception e){/*System.out.println("DEBUG:    This exception to be ignored!");*/}
		}
		
		if(!bcleartrip_OfferFound){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Following offer not found: " + strcleartrip_OfferHeader);
			objSoftAssert.fail("ERROR:    Following offer not found: " + strcleartrip_OfferHeader);
			return bcleartrip_OfferFound;
		}
		
		cleartrip_lst_labl_HomePage_DealsOffers_Heading.get(nLocal).click();
		System.out.println("DEBUG:    Offer description: "+ cleartrip_lst_labl_HomePage_DealsOffers_Description.get(nLocal).getText());			

		// wait for longer time
		try{objWait.until(ExpectedConditions.numberOfWindowsToBe(2));}
		catch(Exception e){
			try{objWait.until(ExpectedConditions.numberOfWindowsToBe(2));}
			catch(Exception e1){
				bcleartrip_ThisElementValidationStatus = false;
			}
		}
		
		if(!bcleartrip_ThisElementValidationStatus){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Offer/ deals separate window did not open for: " + strcleartrip_OfferHeader);
			objSoftAssert.fail("ERROR:    Offer/ deals separate window did not open for: " + strcleartrip_OfferHeader);
			return bcleartrip_ThisElementValidationStatus;
		}

		String cleartrip_ParentWindowHandle 		= objWebDriverAbstractGeneralUse.getWindowHandle();
		Set<String> cleartrip_set_AllWindowHandles 	= objWebDriverAbstractGeneralUse.getWindowHandles();
		Iterator<String> cleartrip_itr_WindowHandle = cleartrip_set_AllWindowHandles.iterator();
		
		while (cleartrip_itr_WindowHandle.hasNext()){
			objWebDriverAbstractGeneralUse.switchTo().window(cleartrip_itr_WindowHandle.next());
				if (objWebDriverAbstractGeneralUse.getWindowHandle().contains(cleartrip_ParentWindowHandle)) continue;
				if(objWebDriverAbstractGeneralUse.getTitle().contains("Cleartrip")) {
					bcleartrip_ThisElementValidationStatus = true;
					System.out.println("DEBUG:    Another window for offer / deal is opened with title: " + objWebDriverAbstractGeneralUse.getTitle());
				}
				objWebDriverAbstractGeneralUse.close();
		}
		objWebDriverAbstractGeneralUse.switchTo().window(cleartrip_ParentWindowHandle);
		
		return bcleartrip_ThisElementValidationStatus;
	}

	public boolean cleartrip_Validate_This_SupportFunctionality(String strSupportFunctionality){
		
		boolean bcleartrip_ThisElementValidationStatus 		= true;
     
		if (strSupportFunctionality.contains("Support_Functionality__ Cancel and change flights")){
			
			System.out.println("DEBUG:    cleartrip Validating Cancel and change flights");
			String strSupportFunctionality_ErrorMessage = "";
			
			cleartrip_lnk_MoreProductsLink.click();
			objWait.until(ExpectedConditions.visibilityOf(cleartrip_lnk_MoreProductsLink_CancelAndChangeFlights));
			cleartrip_lnk_MoreProductsLink_CancelAndChangeFlights.click();
			
	    	// multiple iframe handler
	        List<WebElement> iframeElements = objWebDriverAbstractGeneralUse.findElements(By.tagName("iframe"));
	    	
	    	for (WebElement oneEle: iframeElements){
	    		objWebDriverAbstractGeneralUse.switchTo().frame(oneEle);
	    		
				if (objWebDriverAbstractGeneralUse.findElements(cleartrip_ByCssSelector_MoreProducts_CancelAndChangeFlight_Email).size() < 1 ){
					objWebDriverAbstractGeneralUse.switchTo().defaultContent();
			    	continue;					
				}
				objWebDriverAbstractGeneralUse.findElement(cleartrip_ByCssSelector_MoreProducts_CancelAndChangeFlight_Email).sendKeys("dummy@email.com");
				objWebDriverAbstractGeneralUse.findElement(cleartrip_ByCssSelector_MoreProducts_CancelAndChangeFlight_Tripid).sendKeys("a0b1c2");
				objWebDriverAbstractGeneralUse.findElement(cleartrip_ByCssSelector_MoreProducts_CancelAndChangeFlight_Continue).click();
				new WebDriverWait(objWebDriverAbstractGeneralUse, 5).until(ExpectedConditions
						.visibilityOfAllElementsLocatedBy(cleartrip_ByCssSelector_MoreProducts_CancelAndChangeFlight_ErrorMessage));
				strSupportFunctionality_ErrorMessage = objWebDriverAbstractGeneralUse
						.findElement(cleartrip_ByCssSelector_MoreProducts_CancelAndChangeFlight_ErrorMessage)
						.getText();
	    		objWebDriverAbstractGeneralUse.switchTo().defaultContent();
		    	break;
	    	}

	    	if (! strSupportFunctionality_ErrorMessage.isEmpty()){
				System.out.println("DEBUG:    For invalid input following valid error message observed: " + strSupportFunctionality_ErrorMessage);
	    	}else{
				System.out.println("RESULT::FAIL");
				System.out.println("DEBUG:    For invalid input no error message observed");
				objSoftAssert.fail("DEBUG:    For invalid input no error message observed");
				bcleartrip_ThisElementValidationStatus =  false;	    		
	    	}
		}
		
		if (strSupportFunctionality.contains("Support_Functionality__ Check flight status")){
			
			System.out.println("DEBUG:    cleartrip Validating flight status");
			
			cleartrip_lnk_MoreProductsLink.click();
			objWait.until(ExpectedConditions.visibilityOf(cleartrip_lnk_MoreInfo_CheckFlightStatus));
			cleartrip_lnk_MoreInfo_CheckFlightStatus.click();
			
			// wait for longer time
			try{objWait.until(ExpectedConditions.numberOfWindowsToBe(2));}
			catch(Exception e){
				try{objWait.until(ExpectedConditions.numberOfWindowsToBe(2));}
				catch(Exception e1){
					bcleartrip_ThisElementValidationStatus = false;
				}
			}
			
			if(!bcleartrip_ThisElementValidationStatus){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Check flight status window did not open");
				objSoftAssert.fail("ERROR:    Check flight status window did not open");
				return bcleartrip_ThisElementValidationStatus;
			}

			String cleartrip_ParentWindowHandle 		= objWebDriverAbstractGeneralUse.getWindowHandle();
			Set<String> cleartrip_set_AllWindowHandles 	= objWebDriverAbstractGeneralUse.getWindowHandles();
			Iterator<String> cleartrip_itr_WindowHandle = cleartrip_set_AllWindowHandles.iterator();
			
			while (cleartrip_itr_WindowHandle.hasNext()){
				objWebDriverAbstractGeneralUse.switchTo().window(cleartrip_itr_WindowHandle.next());
					if (objWebDriverAbstractGeneralUse.getWindowHandle().contains(cleartrip_ParentWindowHandle)) continue;
					if(objWebDriverAbstractGeneralUse.getTitle().contains("FlightStats")) {
						bcleartrip_ThisElementValidationStatus = true;
						System.out.println("DEBUG:    Another window for flight status is opened with title: " + objWebDriverAbstractGeneralUse.getTitle());
					}
					objWebDriverAbstractGeneralUse.close();
			}
			objWebDriverAbstractGeneralUse.switchTo().window(cleartrip_ParentWindowHandle);

	    	if (! bcleartrip_ThisElementValidationStatus){
				System.out.println("RESULT::FAIL");
				System.out.println("DEBUG:    Flight status window not found");
				objSoftAssert.fail("DEBUG:    Flight status window not found");
				bcleartrip_ThisElementValidationStatus =  false;	    		
	    	}
		}
		
		if (strSupportFunctionality.contains("Support_Functionality__ Check PNR Status")){
			
			System.out.println("DEBUG:    cleartrip Validating PNR status");

			cleartrip_lnk_MoreProductsLink.click();
			objWait.until(ExpectedConditions.visibilityOf(cleartrip_lnk_MoreInfo_CheckPNRStatus));
			cleartrip_lnk_MoreInfo_CheckPNRStatus.click();
			objWait.until(ExpectedConditions.visibilityOf(cleartrip_txtbox_MoreInfo_CheckPNRStatus_PNRNumber));
			cleartrip_txtbox_MoreInfo_CheckPNRStatus_PNRNumber.sendKeys("1234567890");
			cleartrip_txtbox_MoreInfo_CheckPNRStatus_PNR_Submit.click();
			
			// pnr status takes longest time, so wait
			try{objWait.until(ExpectedConditions.visibilityOf(cleartrip_somejunkelement));
			}catch (Exception e){
				try{objWait.until(ExpectedConditions.visibilityOf(cleartrip_somejunkelement));
				}catch (Exception e1){
					try{objWait.until(ExpectedConditions.visibilityOf(cleartrip_somejunkelement));
					}catch (Exception e2){}}}
			
			if(cleartrip_lst_labl_MoreInfo_CheckPNRStatus_PNR_Error.size() > 0){
				System.out.println("DEBUG:    For invalid input following valid error message observed: " + 
						cleartrip_lst_labl_MoreInfo_CheckPNRStatus_PNR_Error.get(0).getText());
			}else{
				System.out.println("RESULT::FAIL");
				System.out.println("DEBUG:    For invalid PNR number input no error message observed");
				objSoftAssert.fail("DEBUG:    For invalid PNR number input no error message observed");
				bcleartrip_ThisElementValidationStatus =  false;
			}
		}
		
		return bcleartrip_ThisElementValidationStatus;
	}	
	
	public boolean cleartrip_Perform_SimpleActivity_and_NavigateToThisPage(String strNavigateToThisPage){

		boolean bcleartrip_ThisElementValidationStatus 		= true;
		
		if (strNavigateToThisPage.contains("navigate_01")){
			cleartrip_lnk_MoreProductsLink.click();
			objWait.until(ExpectedConditions.visibilityOf(cleartrip_lnk_MoreProductsLink_CancelAndChangeFlights));
			cleartrip_lnk_MoreProductsLink_CancelAndChangeFlights.click();
			objWait.until(ExpectedConditions.visibilityOf(cleartrip_labl_MoreProductsLink_CancelAndChangeFlights_Header));
		}else if(strNavigateToThisPage.contains("navigate_02")){
			cleartrip_lnk_MoreProductsLink.click();
			objWait.until(ExpectedConditions.visibilityOf(cleartrip_lnk_MoreInfo_CheckPNRStatus));
			cleartrip_lnk_MoreInfo_CheckPNRStatus.click();
			objWait.until(ExpectedConditions.visibilityOf(cleartrip_txtbox_MoreInfo_CheckPNRStatus_PNRNumber));
		}else if(strNavigateToThisPage.contains("navigate_03")){
			cleartrip_lnk_MoreProductsLink.click();
			objWait.until(ExpectedConditions.visibilityOf(cleartrip_lnk_MoreInfo_PrinteTicket));
			cleartrip_lnk_MoreInfo_PrinteTicket.click();
			objWait.until(ExpectedConditions.visibilityOf(cleartrip_txtbox_MoreInfo_PrinteTicket_TripId));
		}

		return bcleartrip_ThisElementValidationStatus;
	}
	
	public boolean cleartrip_Validate_SignUp_Link(){
		
		cleartrip_labl_UserSection_Heading.click();
		try{objWait.until(ExpectedConditions.visibilityOf(cleartrip_lnk_UserSection_SignUp));}
		catch(Exception e){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Sign up link not found");
			objSoftAssert.fail("ERROR:    Sign up link not found");
			return false;
		}
		System.out.println("RESULT::PASS");
		System.out.println("DEBUG:    Sign up link found");
		cleartrip_labl_UserSection_Heading.click();

		return true;
	}
		
	public boolean cleartrip_Validate_SignIn_Link(){
		
		cleartrip_labl_UserSection_Heading.click();
		try{objWait.until(ExpectedConditions.visibilityOf(cleartrip_lnk_UserSection_SignIn));}
		catch(Exception e){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Sign in link not found");
			objSoftAssert.fail("ERROR:    Sign in link not found");
			return false;
		}
		System.out.println("RESULT::PASS");
		System.out.println("DEBUG:    Sign in link found");
		cleartrip_labl_UserSection_Heading.click();

		return true;
	}
	
	public boolean cleartrip_Validate_SignUp(String strSignUp_Activity, JSONObject objJSON_cleartripAdultPassangerDetails){
		
		boolean bcleartrip_ThisElementValidationStatus 		= false;
		
		cleartrip_labl_UserSection_Heading.click();
		objWait.until(ExpectedConditions.visibilityOf(cleartrip_lnk_UserSection_SignUp));
		
		if (strSignUp_Activity.contains("dummy sign up") ){
			cleartrip_lnk_UserSection_SignUp.click();
			
	    	// multiple iframe handler
	        List<WebElement> iframeElements = objWebDriverAbstractGeneralUse.findElements(By.tagName("iframe"));
	    	
	    	for (WebElement oneEle: iframeElements){
	    		objWebDriverAbstractGeneralUse.switchTo().frame(oneEle);
	    		
				if (objWebDriverAbstractGeneralUse.findElements(By.cssSelector("#username1")).size() < 1 ){
					objWebDriverAbstractGeneralUse.switchTo().defaultContent();
			    	continue;					
				}
				
				objWebDriverAbstractGeneralUse.findElement(By.cssSelector("#username1")).sendKeys(objJSON_cleartripAdultPassangerDetails.getString("Email"));
				objWebDriverAbstractGeneralUse.findElement(By.cssSelector("#registerButton")).click();
	    		new WebDriverWait(objWebDriverAbstractGeneralUse, 5).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#password")));
	    		objWebDriverAbstractGeneralUse.findElement(By.cssSelector("#password")).sendKeys(objJSON_cleartripAdultPassangerDetails.getString("Password"));
	    		Select objLocalSelect = new Select(objWebDriverAbstractGeneralUse.findElement(By.id("profile_title")));
	    		objLocalSelect.selectByVisibleText(objJSON_cleartripAdultPassangerDetails.getString("Honorifics"));
	    		objWebDriverAbstractGeneralUse.findElement(By.cssSelector("input[selflabel='First Name']")).sendKeys(objJSON_cleartripAdultPassangerDetails.getString("FirstName"));
	    		objWebDriverAbstractGeneralUse.findElement(By.cssSelector("input[selflabel='Last Name']")).sendKeys(objJSON_cleartripAdultPassangerDetails.getString("LastName"));
	    		objWebDriverAbstractGeneralUse.findElement(By.cssSelector(".required.mobile.span")).sendKeys(objJSON_cleartripAdultPassangerDetails.getString("ContactPhone"));
	    		objWebDriverAbstractGeneralUse.findElement(By.cssSelector("#signUpButton")).click();
	    		
	    		objWebDriverAbstractGeneralUse.switchTo().defaultContent();
		    	break;
	    	}

	    	try{objWait.until(ExpectedConditions.titleContains("Your Cleartrip dashboard"));
	    			bcleartrip_ThisElementValidationStatus = true;
	    			cleartrip_labl_UserSection_Heading.click();
	    			objWait.until(ExpectedConditions.visibilityOf(cleartrip_lnk_UserSection_SignOut));
	    			cleartrip_lnk_UserSection_SignOut.click();
	    			System.out.println("RESULT::PASS");
	    			System.out.println("DEBG:    Sign up with dummy user is successful");
	    	}catch(Exception e){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Could not sign up");
				objSoftAssert.fail("ERROR:    Could not sign up");
	    	}
		}
		
		return bcleartrip_ThisElementValidationStatus;
	}
	
	public boolean cleartrip_Validate_SignIn(JSONObject objJSON_cleartripAdultPassangerDetails){
		
		boolean bcleartrip_ThisElementValidationStatus 		= false;
		
		cleartrip_labl_UserSection_Heading.click();
		objWait.until(ExpectedConditions.visibilityOf(cleartrip_lnk_UserSection_SignIn));
		cleartrip_lnk_UserSection_SignIn.click();
		
    	// multiple iframe handler
        List<WebElement> iframeElements = objWebDriverAbstractGeneralUse.findElements(By.tagName("iframe"));
    	
    	for (WebElement oneEle: iframeElements){
    		objWebDriverAbstractGeneralUse.switchTo().frame(oneEle);
    		
			if (objWebDriverAbstractGeneralUse.findElements(By.cssSelector("#email")).size() < 1 ){
				objWebDriverAbstractGeneralUse.switchTo().defaultContent();
		    	continue;					
			}
			
			objWebDriverAbstractGeneralUse.findElement(By.cssSelector("#email")).sendKeys(objJSON_cleartripAdultPassangerDetails.getString("VALIDEmail"));
			objWebDriverAbstractGeneralUse.findElement(By.cssSelector("#password")).sendKeys(objJSON_cleartripAdultPassangerDetails.getString("VALIDPassword"));
			objWebDriverAbstractGeneralUse.findElement(By.cssSelector("#persistent_login")).click();
			objWebDriverAbstractGeneralUse.findElement(By.cssSelector("#signInButton")).click();
    		objWebDriverAbstractGeneralUse.switchTo().defaultContent();
	    	break;
    	}
    	
		// wait for longer time so that all elements to load 
		try{objWait.until(ExpectedConditions.textToBePresentInElement(cleartrip_labl_UserSection_Heading, 
									objJSON_cleartripAdultPassangerDetails.getString("VALIDEmail").trim()));}
		catch (Exception e){
			try{objWait.until(ExpectedConditions.textToBePresentInElement(cleartrip_labl_UserSection_Heading, 
										objJSON_cleartripAdultPassangerDetails.getString("VALIDEmail").trim()));}
			catch (Exception e1){}
		}

		if(cleartrip_labl_UserSection_Heading.getText().contains(objJSON_cleartripAdultPassangerDetails.getString("VALIDEmail").trim())){
			bcleartrip_ThisElementValidationStatus = true;
			System.out.println("RESULT::PASS");
			System.out.println("DEBG:    Sign in with valid user is successful");
		}else{
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Could not sign in");
			objSoftAssert.fail("ERROR:    Could not sign in");			
		}
		
		return bcleartrip_ThisElementValidationStatus;
	}
	
	public boolean cleartrip_Validate_SignOut(){
		
		boolean bcleartrip_ThisElementValidationStatus 		= false;
		
		cleartrip_labl_UserSection_Heading.click();
		objWait.until(ExpectedConditions.visibilityOf(cleartrip_lnk_UserSection_SignOut));
		
		cleartrip_lnk_UserSection_SignOut.click();		
		// wait for longer time so that all elements to load 
		try{objWait.until(ExpectedConditions.textToBePresentInElement(cleartrip_labl_UserSection_Heading, "Your trips"));}
		catch (Exception e){
			try{objWait.until(ExpectedConditions.textToBePresentInElement(cleartrip_labl_UserSection_Heading, "Your trips"));}
			catch (Exception e1){}
		}

		if(cleartrip_labl_UserSection_Heading.getText().contains("Your trips")){
			bcleartrip_ThisElementValidationStatus = true;
			System.out.println("RESULT::PASS");
			System.out.println("DEBG:    Sign out with valid user is successful");			
		}else{
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Could not sign out");
			objSoftAssert.fail("ERROR:    Could not sign out");			
		}
		
		return bcleartrip_ThisElementValidationStatus;
	}

	public boolean cleartrip_Validate_EditProfile(JSONObject objJSON_cleartripAdultPassangerDetails){
		
		boolean bcleartrip_ThisElementValidationStatus 		= true;
		
		if (! cleartrip_Validate_SignIn(objJSON_cleartripAdultPassangerDetails)) return false;
		
		// now edit profile .e.g. change address
		cleartrip_labl_UserSection_Heading.click();
		objWait.until(ExpectedConditions.visibilityOf(cleartrip_lnk_UserSection_Profile));
		cleartrip_lnk_UserSection_Profile.click();
		objWait.until(ExpectedConditions.visibilityOf(cleartrip_btn_UserSection_EditProfile));
		cleartrip_btn_UserSection_EditProfile.click();
		objWait.until(ExpectedConditions.visibilityOf(cleartrip_txtbox_UserSection_ProfileAddress));
		cleartrip_txtbox_UserSection_ProfileAddress
			.sendKeys(	Keys.chord(Keys.CONTROL, "a") + 
						Keys.DELETE + "Address " + 
						ClsGeneralInitTerminateAndOtherUtil.getPositiveRandomNumberBetweenRange(0, 100));
		cleartrip_lst_labl_UserSection_Profile_Hint.get(0).click();
		cleartrip_lst_labl_UserSection_Profile_Hint.get(0).sendKeys("" + Keys.PAGE_DOWN + Keys.PAGE_DOWN + Keys.PAGE_DOWN);
		cleartrip_lnk_UserSection_ProfileSave.click();
		
		// wait for longer time so that all elements to load 
		try{objWait.until(ExpectedConditions.visibilityOfAllElements(cleartrip_lst_lnk_UserSection_ProfileSave_Success) );}
		catch (Exception e){
			try{objWait.until(ExpectedConditions.visibilityOfAllElements(cleartrip_lst_lnk_UserSection_ProfileSave_Success) );}
			catch (Exception e1){}
		}
		
		if(cleartrip_lst_lnk_UserSection_ProfileSave_Success.size() < 1){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Could not update user profile");
			objSoftAssert.fail("ERROR:    Could not update user profile");
			return false;
		}else{
			System.out.println("RESULT::PASS");
			System.out.println("DEBG:    Edit profile is successful");
		}
		
		if (! cleartrip_Validate_SignOut()) return false;

		
		return bcleartrip_ThisElementValidationStatus;
	}
	
	
	
	
	
	
	
	
	
	
	// helper methods
	public boolean cleartrip_SocialPlugin_Check_Facebook(){
		
		if (cleartrip_SocialPlugin_Facebook_lnk.isDisplayed() &&
			cleartrip_SocialPlugin_Facebook_name.isDisplayed()   ){
			return true;
		}else{			return false;		}
	}
    
	public boolean cleartrip_SocialPlugin_Check_Twitter(){
		
		if (cleartrip_SocialPlugin_Twitter_lnk.isDisplayed() &&
			cleartrip_SocialPlugin_Twitter_name.isDisplayed()   ){
			return true;
		}else{			return false;		}
	}
	
	public String cleartrip_getFormattedFullDatefor_NextFriday(){
		
		int[] nArr_Current_YearMonthDay = ClsGeneralInitTerminateAndOtherUtil.get_NextFriday_YearMonthDay_integerArray();
		
		// cleartrip.in date format is     dd/mm/yyyy
		String strcleartripFormattedDate_ddmmyy_Sting =
						String.valueOf(nArr_Current_YearMonthDay[2]) + "\\" + 
						String.valueOf(nArr_Current_YearMonthDay[1]) + "\\" +
						String.valueOf(nArr_Current_YearMonthDay[0]);

		return strcleartripFormattedDate_ddmmyy_Sting;
	}
	
	public String cleartrip_getFormattedFullDatefor_NextSunday(){
		
		int[] nArr_Current_YearMonthDay = ClsGeneralInitTerminateAndOtherUtil.get_NextSunday_YearMonthDay_integerArray();
		
		// cleartrip.in date format is     dd/mm/yyyy
		String strcleartripFormattedDate_ddmmyy_Sting =
						String.valueOf(nArr_Current_YearMonthDay[2]) + "\\" + 
						String.valueOf(nArr_Current_YearMonthDay[1]) + "\\" +
						String.valueOf(nArr_Current_YearMonthDay[0]);
		
		return strcleartripFormattedDate_ddmmyy_Sting;
	}

	public String cleartrip_getFormattedFullDatefor_NextYear(){
		
		int[] nArr_Current_YearMonthDay = ClsGeneralInitTerminateAndOtherUtil.get_NextFriday_YearMonthDay_integerArray();
		
		// cleartrip.in date format is     dd/mm/yyyy
		String strcleartripFormattedDate_ddmmyy_Sting =
						String.valueOf(nArr_Current_YearMonthDay[2]) + "\\" + 
						String.valueOf(nArr_Current_YearMonthDay[1]) + "\\" +
						String.valueOf(nArr_Current_YearMonthDay[0] + 10);
		
		return strcleartripFormattedDate_ddmmyy_Sting;
	}
	
	
	
}
