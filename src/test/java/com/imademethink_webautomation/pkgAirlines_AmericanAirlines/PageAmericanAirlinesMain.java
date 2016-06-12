package com.imademethink_webautomation.pkgAirlines_AmericanAirlines;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.imademethink_webautomation.UtilGeneral.ClsGeneralInitTerminateAndOtherUtil;
import com.imademethink_webautomation.pkg0GeneralPageFactory.Page0Abstract;

public class PageAmericanAirlinesMain extends Page0Abstract {

	private PageAmericanAirlinesResult0InProgress 	objLocal_PageAmericanAirlinesResult0InProgress = null;
	private PageAmericanAirlinesResult1SelectDate 	objLocal_PageAmericanAirlinesResult1SelectDate = null;
	//private PageAmericanAirlinesResult2SelectFlight	objLocal_PageAmericanAirlinesResult2SelectFlight = null;
	private PageAmericanAirlines99General   	objLocal_PageAmericanAirlinesResult99General   = null;
	
	public PageAmericanAirlinesMain(WebDriver driver) {
		super(driver);
		//System.out.println("DEBUG:    PageAmericanAirlinesMain constructor");
		PageFactory.initElements(driver, this);
		objLocal_PageAmericanAirlinesResult0InProgress  = new PageAmericanAirlinesResult0InProgress(driver);
		objLocal_PageAmericanAirlinesResult1SelectDate  = new PageAmericanAirlinesResult1SelectDate(driver);
		//objLocal_PageAmericanAirlinesResult2SelectFlight= new PageAmericanAirlinesResult2SelectFlight(driver);
		objLocal_PageAmericanAirlinesResult99General 	= new PageAmericanAirlines99General(driver);
	}

	// home page button
	@FindBys({
	    @FindBy(className = "site-logo"),
	    @FindBy(xpath = "//*[@title='American Airlines - home page']")
    })
	public List<WebElement> AmericanAirlines_lst_btn_HomePage;
	@FindBy(className = "site-logo")
	private WebElement AmericanAirlines_btn_HomePageLogo;
	
	// home page logo
	@FindBy(css="img[alt='American Airlines logo']")
	private WebElement AmericanAirlines_img_HomePageLogo;
	// home page slider
	@FindBy(css="img[alt='Upgrading international travel']")
	private WebElement AmericanAirlines_img_HomePage_Slider1;
	@FindBy(css="img[alt='The 2016 AAdvantage program']")
	private WebElement AmericanAirlines_img_HomePage_Slider2;
	
	// home page top 4 web elements
	@FindBy(id = "menu-plan")
	private WebElement AmericanAirlines_lnk_PlanTravel;
	@FindBy(id = "menu-manage")
	private WebElement AmericanAirlines_lnk_TravelInformation;
	@FindBy(id = "menu-aadvantage")
	private WebElement AmericanAirlines_lnk_AAdvantage;
	@FindBys({
	    @FindBy(css="a[href*='http://oneworld.com']"),
	    @FindBy(xpath="//*[@title='oneworld']"),
	    @FindBy(css="img[src='/content/images/chrome/rebrand/oneworld.png']")
	})
	private List<WebElement> AmericanAirlines_lst_img_OneWorld;

	// language and country selection elements
	@FindBy(id = "language-selector")
	private WebElement AmericanAirlines_lnk_LanguageAndCountry_Element;	
	@FindBy(id = "aa-language-selector")
	private WebElement AmericanAirlines_drpdwn_LanguageSelector_Element;	
	@FindBy(id = "aa-country-selector")
	private WebElement AmericanAirlines_drpdwn_CountrySelector_Element;
	
	// slider images elements
	@FindBy(id = "hero-prev")
	private WebElement btn_AmericanAirlines_ImageSliderNavigateLeft;
	@FindBy(id = "hero-next")
	private WebElement btn_AmericanAirlines_ImageSliderNavigateRight;

	// user utility tabs
	@FindBy(id = "aa-hp-module-tabs-bookFlight%aa-booking-module")
	private WebElement AmericanAirlines_tab_BookTicket;
	@FindBy(id = "aa-hp-module-tabs-changeRes%aa-manageMyTrip")
	private WebElement AmericanAirlines_tab_MyTrips;	
	@FindBy(id = "aa-hp-module-tabs-changeRes%aa-viewReservations")
	private WebElement AmericanAirlines_tab_CheckIn;	
	@FindBy(id = "aa-hp-module-tabs-flightStatus%aa-hp-flightStatus")
	private WebElement AmericanAirlines_tab_FlightStatus;
	
	// quick links elements
	@FindBy(linkText = "My AAdvantage Account")
	private WebElement AmericanAirlines_lnk_MyAAdvantageAccount;
	@FindBy(linkText = "International travel")
	private WebElement AmericanAirlines_lnk_Internationaltravel;
	@FindBy(linkText = "Baggage Information")
	private WebElement AmericanAirlines_lnk_BaggageInformation;
	@FindBy(linkText = "Join AAdvantage Loyalty Program")
	private WebElement AmericanAirlines_lnk_JoinAAdvantageLoyaltyProgram;	

	// explore aadvantage element
	@FindAll({
	    @FindBy(css="img[alt='Explore our AAdvantage® Award Map']"),
	    @FindBy(css="img[src='/content/images/common_ls/en/hp/a/homepage_A1-hilltop-lady-backpack-v1.jpg']")
	})
	private List<WebElement> AmericanAirlines_lst_ExploreAadvantage;
	@FindBy(linkText = "Explore our new Award Map »")
	private WebElement AmericanAirlines_lnk_ExploreAAAdvantage;
	
	// travelling today
	@FindAll({
	    @FindBy(css="img[alt='Travelling today?']"),
	    @FindBy(css="img[src='/content/images/common_ls/en/hp/a/homepage_A1-find-your-way.jpg']")
	})
	private List<WebElement> AmericanAirlines_lst_TravellingToday;
    @FindBy(css="a[href='/i18n/travelInformation/destinationInformation/airportInformation.jsp?locale=en_IN']")
	private WebElement AmericanAirlines_lnk_TravellingTodayLearnMore;
	
	// discover one world alliance
	@FindAll({
	    @FindBy(css="img[alt='Discover the oneworld alliance']"),
	    @FindBy(css="img[src='/content/images/common_ls/en/hp/a/homepage_A1_girls-jumping.jpg']")
	})
	private List<WebElement> AmericanAirlines_lst_DiscoverOneWorldAlliance;
    @FindBy(css="a[href='/intl/in/travelInformation/owAlliance.jsp']")
	private WebElement AmericanAirlines_lnk_DiscoverOneWorldAllianceLearnMore;

	// fly better element
    @FindBy(css="img[src='/content/images/common_ls/en/hp/b/UK-B1-777_v01.jpg']")
	private WebElement AmericanAirlines_img_FlyBetter;
    @FindBy(css="a[href='/intl/in/onboard/newPlanesNewExperience.jsp']")
    private WebElement AmericanAirlines_lnk_FlyBetter;
    
    // other links
    @FindBy(linkText = "New Phishing Email Alert")
	private WebElement AmericanAirlines_lnk_NewPhishingEmailAlert;
    @FindBy(linkText = "Explore our new AAdvantage Award Map")
	private WebElement AmericanAirlines_lnk_ExploreournewAAdvantageAwardMap;
    @FindBy(linkText = "AA and BA offer customers seamless service to India")
	private WebElement AmericanAirlines_lnk_AAandBA_Offer;
    @FindBy(linkText = "Redeem your miles for hotel stays and car hire")
	private WebElement AmericanAirlines_lnk_RedeemYourMilesForHotel;
    @FindBy(linkText = "Redeem your miles online with your credit card")
	private WebElement AmericanAirlines_lnk_RedeemYourMilesOnline;
    @FindBy(linkText = "See more videos on our YouTube channel")
	private WebElement AmericanAirlines_lnk_MoreVideosOnYoutube;
    
    // social plugin details - facebook
    @FindBy(css="a[href='http://facebook.com/AmericanAirlines']")
    private WebElement AmericanAirlines_SocialPlugin_Facebook_lnk;
    @FindBy(css="img[src='/content/images/chrome/rebrand/icon-footer-facebook.png']")
    private WebElement AmericanAirlines_SocialPlugin_Facebook_img;
    @FindBy(css="img[alt='Facebook']")
    private WebElement AmericanAirlines_SocialPlugin_Facebook_name;
   
    // social plugin details - twitter
    @FindBy(css="a[href='http://twitter.com/americanair']")
    private WebElement AmericanAirlines_SocialPlugin_Twitter_lnk;
    @FindBy(css="img[src='/content/images/chrome/rebrand/icon-footer-twitter.png']")
    private WebElement AmericanAirlines_SocialPlugin_Twitter_img;
    @FindBy(css="img[alt='Twitter']")
    private WebElement AmericanAirlines_SocialPlugin_Twitter_name;

    // elements under Book (flight) tab
    @FindBy(css=".radio.pillbox.custombox-wrapper.inline")
	private List<WebElement> AmericanAirlines_lst_BookTicketType_1Way_2Way;	 
    @FindBy(id="aa-redeem-label")
    private WebElement AmericanAirlines_chkbox_RedeemMile;
    @FindBy(id="bookingModule-submit")
    private WebElement AmericanAirlines_btn_Search;
    @FindBy(css="a[title='Refine your search']")
    private WebElement AmericanAirlines_lnk_RefineSearch;
    @FindBy(css=".ui-datepicker-trigger")
	private List<WebElement> AmericanAirlines_lst_Date_Depart_Arrive;	 
    @FindBy(id="flightSearchForm.childPassengerCount")
    private WebElement AmericanAirlines_drpdwn_Children_Count;
    @FindBy(id="flightSearchForm.adultPassengerCount")
    private WebElement AmericanAirlines_drpdwn_Adult_Count;
    @FindBy(id="origin_display")
    private WebElement AmericanAirlines_txtbox_BookFlight_FlightDepartFromCity;
    @FindBy(id="destination_display")
    private WebElement AmericanAirlines_txtbox_BookFlight_FlightArriveToCity;
    @FindBy(css=".ui-datepicker-title")
    private List<WebElement> AmericanAirlines_lst_BookFlight_DropDown_DepartArriveDate;
    @FindBy(css="#aa-leavingOn")
	private WebElement AmericanAirlines_txtbox_Date_Depart;	 
    @FindBy(css="#aa-returningFrom")
	private WebElement AmericanAirlines_txtbox_Date_Arrive;
    @FindBy(css=".inline.aaSC_Target_BookTravel_OneWay_Disable.inactive.disabled")
	private WebElement AmericanAirlines_txtbox_Date_Arrive_disabled;

    @FindBy(css=".ui-datepicker-close.ui-state-default.ui-priority-primary.ui-corner-all")
	private WebElement AmericanAirlines_txtbox_Date_Arrive_Done;
    @FindBy(css=".ui-state-default.ui-state-active")
	private WebElement AmericanAirlines_btn_Date_DepartArrive_ActiveDate;
    
    // home page tabs common elements for my trips tab and check in tab
    @FindBy(css="label[title='Passenger First Name']")
    private List<WebElement> AmericanAirlines_lst_txtbox_PassengerFirstName;
    @FindBy(css="label[title='Passenger Last Name']")
    private List<WebElement> AmericanAirlines_lst_txtbox_PassengerLastName;
    @FindBy(css="label[title*='Booking reference']")
    private List<WebElement> AmericanAirlines_lst_txtbox_Booking_Reference;
    
    // elements under my trips
    @FindBy(linkText = "My Trips")
	private WebElement AmericanAirlines_lnk_MyTrips;
    @FindBy(id="trip-submit")
    private WebElement AmericanAirlines_btn_ManageMyTrip;
    @FindBy(id="prs-submit")
    private WebElement AmericanAirlines_btn_SelectMySeat;
    
    // elements under check in tab
    @FindBy(linkText = "Check-In")
	private WebElement AmericanAirlines_lnk_Check_In;
    @FindBy(css="input[value='Check-In Now']")
    private WebElement AmericanAirlines_btn_CheckIn_CheckInNow_Button;
    
    // elements under flight status
    @FindBy(linkText = "Flight Status")
	private WebElement AmericanAirlines_lnk_Flight_Status;
    @FindBy(css="label[title='Flight Number']")
    private WebElement AmericanAirlines_txtbox_FlightNumber;
    @FindBy(id="gatesTimesSearchForm.originAirport")
    private WebElement AmericanAirlines_txtbox_FlightDepartFrom;
    @FindBy(id="gatesTimesSearchForm.destinationAirport")
    private WebElement AmericanAirlines_txtbox_FlightArriveTo;
    @FindBy(css="select[name='travelDate']")
	private WebElement AmericanAirlines_drpdwn_FlightStatus_TravelDate;
    @FindBy(css="select[name='flightParams.flightDateParams.searchTime']")
 	private WebElement AmericanAirlines_drpdwn_FlightStatus_TravelTime;
    @FindBy(css="input[value='Go']")
 	private WebElement AmericanAirlines_btn_Go;
    

    // elements under top row all sub pages common items
    @FindBy(linkText="Flight status")
    private WebElement AmericanAirlines_lnk_TopRowItemCommon_Flightstatus;
    @FindBy(linkText="Online check-in")
    private WebElement AmericanAirlines_lnk_TopRowItemCommon_OnlineCheckIn;
    @FindBy(linkText="My Trips")
    private WebElement AmericanAirlines_lnk_TopRowItemCommon_MyTrips;
    @FindBy(linkText="Join AAdvantage Loyalty Program")
    private WebElement AmericanAirlines_lnk_TopRowItemCommon_JoinSAdvantageLoyaltyProgram;
    
    // elements under top row sub page plan travel
    @FindBy(linkText="Plan Travel")
    private WebElement AmericanAirlines_lnk_TopRowItem_PlanTravel;
    @FindBy(linkText="Travel Offers")
    private WebElement AmericanAirlines_lnk_TopRowItem_PlanTravel_TravelOffers;
    @FindBy(linkText="Flights")
    private WebElement AmericanAirlines_lnk_TopRowItem_PlanTravel_Flights;
    @FindBy(linkText="Travel Destinations")
    private WebElement AmericanAirlines_lnk_TopRowItem_PlanTravel_TravelDestinations;
    @FindBy(linkText="Gates & Times")
    private WebElement AmericanAirlines_lnk_TopRowItem_PlanTravel_GatesTimes;

    // elements under top row sub page travel information
    @FindBy(linkText="Travel Information")
    private WebElement AmericanAirlines_lnk_TopRowItem_TravelInformation;
    @FindBy(linkText="At the airport")
    private WebElement AmericanAirlines_lnk_TopRowItem_TravelInformation_AtTheAirport;
    @FindBy(linkText="During your flight")
    private WebElement AmericanAirlines_lnk_TopRowItem_TravelInformation_DuringYourFlight;
    @FindBy(linkText="Planes")
    private WebElement AmericanAirlines_lnk_TopRowItem_TravelInformation_Planes;
    @FindBy(linkText="Clubs and lounges")
    private WebElement AmericanAirlines_lnk_TopRowItem_TravelInformation_ClubsLunnges;
    @FindBy(linkText="Baggage")
    private WebElement AmericanAirlines_lnk_TopRowItem_TravelInformation_Baggaage;
    @FindBy(linkText="International travel")
    private WebElement AmericanAirlines_lnk_TopRowItem_TravelInformation_InternationalTravel;
    @FindBy(linkText="Special assistance")
    private WebElement AmericanAirlines_lnk_TopRowItem_TravelInformation_SpecialAssistance;
    @FindBy(linkText="Airline partners")
    private WebElement AmericanAirlines_lnk_TopRowItem_TravelInformation_AirlinePartners;
    @FindBy(partialLinkText="world alliance")
    private WebElement AmericanAirlines_lnk_TopRowItem_TravelInformation_OneworlsAlliance;
    
    // elements under top row sub page a_advantage
    @FindBy(linkText="AAdvantage")
    private WebElement AmericanAirlines_lnk_TopRowItem_AAdvantage;
    @FindBy(linkText="AAdvantage Home")
    private WebElement AmericanAirlines_lnk_TopRowItem_AAdvantage_AAdvantageHome;
    @FindBy(linkText="Elite Status")
    private WebElement AmericanAirlines_lnk_TopRowItem_AAdvantage_EliteStatus;
    @FindBy(linkText="Earn Miles")
    private WebElement AmericanAirlines_lnk_TopRowItem_AAdvantage_EarnMiles;
    @FindBy(linkText="Redeem Miles")
    private WebElement AmericanAirlines_lnk_TopRowItem_AAdvantage_RedeemMiles;
    @FindBy(linkText="Award Travel")
    private WebElement AmericanAirlines_lnk_TopRowItem_AAdvantage_AwardTravel;
    @FindBy(linkText="Buy & Share Miles")
    private WebElement AmericanAirlines_lnk_TopRowItem_AAdvantage_BuyShareMiles;
    
    // error message
    @FindBy(css=".errorMessage")
    private List<WebElement> AmericanAirlines_lst_labl_MainPageErrors;
    
    // every page object has it's local private wait with fixed 10 sec delay
    private WebDriverWait objWait = new WebDriverWait(this.objWebDriverAbstract, 10);   
    

	public boolean AmericanAirlines_validate_This_Element(String strThisElement){

		Actions objActionsBldr_AmericanAirlines_HomePage 			= new Actions(this.objWebDriverAbstract);
		boolean bAmericanAirlines_ThisElementValidationStatus 		= false;
		
		switch (strThisElement){
			case "btn__HOME":
			case "btn__Home":
				if ( AmericanAirlines_lst_btn_HomePage.get(0).isDisplayed()    )     bAmericanAirlines_ThisElementValidationStatus = true;
				break;
			case "lnk__Plan Travel":
				if ( AmericanAirlines_lnk_PlanTravel.isDisplayed()    )     		 bAmericanAirlines_ThisElementValidationStatus = true;
				break;
			case "lnk__Travel Information":
				if ( AmericanAirlines_lnk_TravelInformation.isDisplayed()    )     	 bAmericanAirlines_ThisElementValidationStatus = true;
				break;
			case "lnk__AAdvantage":
				if ( AmericanAirlines_lnk_AAdvantage.isDisplayed()    )     		 bAmericanAirlines_ThisElementValidationStatus = true;
				break;
			case "img__oneworld":
				if ( AmericanAirlines_lst_img_OneWorld.get(0).isDisplayed()    )   	 bAmericanAirlines_ThisElementValidationStatus = true;
				break;
				
			case "drpdwn__Language selection":
				if ( AmericanAirlines_lnk_LanguageAndCountry_Element.isDisplayed() ) {
					objActionsBldr_AmericanAirlines_HomePage.moveToElement(AmericanAirlines_lnk_LanguageAndCountry_Element)
														.click(AmericanAirlines_lnk_LanguageAndCountry_Element)
														.click(AmericanAirlines_drpdwn_LanguageSelector_Element)
														.build()
														.perform();
					String strCurrentLanguageName = new Select(AmericanAirlines_drpdwn_LanguageSelector_Element).getFirstSelectedOption().getText();
					// going back to original position for future tests
					AmericanAirlines_lnk_LanguageAndCountry_Element.click();
					if (   strCurrentLanguageName.contains("English")   )    		bAmericanAirlines_ThisElementValidationStatus = true;
				}
				break;
			case "drpdwn__Country selection":
				if ( AmericanAirlines_lnk_LanguageAndCountry_Element.isDisplayed() ) {
					objActionsBldr_AmericanAirlines_HomePage.moveToElement(AmericanAirlines_lnk_LanguageAndCountry_Element)
														.click(AmericanAirlines_lnk_LanguageAndCountry_Element)
													   	.click(AmericanAirlines_drpdwn_CountrySelector_Element)
													   	.build()
													   	.perform();
					String strCurrentCountryName = new Select(AmericanAirlines_drpdwn_CountrySelector_Element).getFirstSelectedOption().getText();
					// going back to original position for future tests
					AmericanAirlines_lnk_LanguageAndCountry_Element.click();
					if (   strCurrentCountryName.contains("India")   )    			bAmericanAirlines_ThisElementValidationStatus = true;
				}
				break;

			case "slider__Images":
				if ( AmericanAirlines_Slider_Images_Verify() )        				bAmericanAirlines_ThisElementValidationStatus = true;
				break;
			case "btn__Slider Left":
				if ( btn_AmericanAirlines_ImageSliderNavigateLeft.isDisplayed() )   bAmericanAirlines_ThisElementValidationStatus = true;
				break;
			case "btn__Slider Right":
				if ( btn_AmericanAirlines_ImageSliderNavigateRight.isDisplayed() )  bAmericanAirlines_ThisElementValidationStatus = true;
				break;
				
			case "lnk__My AAdvantage Account":
				if ( AmericanAirlines_lnk_MyAAdvantageAccount.isDisplayed() )       bAmericanAirlines_ThisElementValidationStatus = true;
				break;
			case "lnk__International travel":
				if ( AmericanAirlines_lnk_Internationaltravel.isDisplayed() )       bAmericanAirlines_ThisElementValidationStatus = true;
				break;
			case "lnk__Baggage Information":
				if ( AmericanAirlines_lnk_BaggageInformation.isDisplayed() )        bAmericanAirlines_ThisElementValidationStatus = true;
				break;
			case "lnk__Join AAdvantage Loyalty Program":
				if ( AmericanAirlines_lnk_JoinAAdvantageLoyaltyProgram.isDisplayed() ) 	bAmericanAirlines_ThisElementValidationStatus = true;
				break;
				
			case "tab__Book":
				if ( AmericanAirlines_tab_BookTicket.isDisplayed() )        			bAmericanAirlines_ThisElementValidationStatus = true;
				break;
			case "tab__My Trips":
				if ( AmericanAirlines_tab_MyTrips.isDisplayed() )        				bAmericanAirlines_ThisElementValidationStatus = true;
				break;
			case "tab__Check-In":
				if ( AmericanAirlines_tab_CheckIn.isDisplayed() )        				bAmericanAirlines_ThisElementValidationStatus = true;
				break;
			case "tab__Flight Status":
				if ( AmericanAirlines_tab_FlightStatus.isDisplayed() )        			bAmericanAirlines_ThisElementValidationStatus = true;
				break;
				
			case "img__Explore AAdvantage":
				if ( AmericanAirlines_lst_ExploreAadvantage.get(0).isDisplayed() )      bAmericanAirlines_ThisElementValidationStatus = true;
				break;
			case "lnk__Explore our new award map":
				if ( AmericanAirlines_lnk_ExploreAAAdvantage.isDisplayed() )        	bAmericanAirlines_ThisElementValidationStatus = true;
				break;
			case "img__Travelling Today":
				if ( AmericanAirlines_lst_TravellingToday.get(0).isDisplayed() )        bAmericanAirlines_ThisElementValidationStatus = true;
				break;
			case "lnk__Travelling today learn more":
				if ( AmericanAirlines_lnk_TravellingTodayLearnMore.isDisplayed() )      bAmericanAirlines_ThisElementValidationStatus = true;
				break;
			case "img__Discover the oneworld alliance":
				if ( AmericanAirlines_lst_DiscoverOneWorldAlliance.get(0).isDisplayed() )       bAmericanAirlines_ThisElementValidationStatus = true;
				break;
			case "lnk__one world alliance learn more":
				if ( AmericanAirlines_lnk_DiscoverOneWorldAllianceLearnMore.isDisplayed() )     bAmericanAirlines_ThisElementValidationStatus = true;
				break;
				
			case "img__Fly better":
				if ( AmericanAirlines_img_FlyBetter.isDisplayed() )        						bAmericanAirlines_ThisElementValidationStatus = true;
				break;
			case "lnk__Fly better":
				if ( AmericanAirlines_lnk_FlyBetter.isDisplayed() )      						bAmericanAirlines_ThisElementValidationStatus = true;
				break;

			case "lnk__Fishing mail alert":
				if ( AmericanAirlines_lnk_NewPhishingEmailAlert.isDisplayed() )      			bAmericanAirlines_ThisElementValidationStatus = true;
				break;
			case "lnk__Explore AAdvantage map":
				if ( AmericanAirlines_lnk_ExploreournewAAdvantageAwardMap.isDisplayed() )      	bAmericanAirlines_ThisElementValidationStatus = true;
				break;
			case "lnk__AA and BA offer":
				if ( AmericanAirlines_lnk_AAandBA_Offer.isDisplayed() )      					bAmericanAirlines_ThisElementValidationStatus = true;
				break;
			case "lnk__Redeem your miles for hotels":
				if ( AmericanAirlines_lnk_RedeemYourMilesForHotel.isDisplayed() )      			bAmericanAirlines_ThisElementValidationStatus = true;
				break;
			case "lnk__Redeem your miles online":
				if ( AmericanAirlines_lnk_RedeemYourMilesOnline.isDisplayed() )      			bAmericanAirlines_ThisElementValidationStatus = true;
				break;
			case "lnk__See More Video on Youtube":
				if ( AmericanAirlines_lnk_MoreVideosOnYoutube.isDisplayed() )      				bAmericanAirlines_ThisElementValidationStatus = true;
				break;

			case "img__AmericanAirlines logo":
				if ( AmericanAirlines_lst_btn_HomePage.get(0).isDisplayed()    )     			bAmericanAirlines_ThisElementValidationStatus = true;
				break;
			case "lnk__oneworldalliance":
				if ( AmericanAirlines_lst_DiscoverOneWorldAlliance.get(0).isDisplayed() )       bAmericanAirlines_ThisElementValidationStatus = true;
				break;

	    	default:
	    		break;
		}
		
		
		objActionsBldr_AmericanAirlines_HomePage = null;
		return bAmericanAirlines_ThisElementValidationStatus;
		
	}
	
	public boolean AmericanAirlines_Validate_HomePageElements_for_Book_Category(String strGUIOptionListFor_Book){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;
		boolean bSpportedElementFound								= false;
		
		if (strGUIOptionListFor_Book.contains("btn__RETURN")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_lst_BookTicketType_1Way_2Way.get(0).isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "btn__RETURN");
				System.out.println("ERROR:    Following element not found: " + "btn__RETURN");
				bAmericanAirlines_ThisElementValidationStatus = false;}
		}
		if (strGUIOptionListFor_Book.contains("btn__ONE WAY")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_lst_BookTicketType_1Way_2Way.get(1).isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "ONE WAY");
				System.out.println("ERROR:    Following element not found: " + "ONE WAY");
				bAmericanAirlines_ThisElementValidationStatus = false;
		   }else{
			   // click on one way button then click on 2 way button
			   AmericanAirlines_lst_BookTicketType_1Way_2Way.get(1).click();
			   AmericanAirlines_lst_BookTicketType_1Way_2Way.get(0).click();		   }
		}		
		if (strGUIOptionListFor_Book.contains("txtbox__Depart city")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_txtbox_BookFlight_FlightDepartFromCity.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "txtbox__Depart city");
				System.out.println("ERROR:    Following element not found: " + "txtbox__Depart city");
				bAmericanAirlines_ThisElementValidationStatus = false;
			}else{
				// Enter some dummy depart city name
				AmericanAirlines_txtbox_BookFlight_FlightDepartFromCity.sendKeys("Berlin (BER), Germany");			}
		}
		if (strGUIOptionListFor_Book.contains("txtbox__Arrival city")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_txtbox_BookFlight_FlightArriveToCity.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "txtbox__Arrival city");
				System.out.println("ERROR:    Following element not found: " + "txtbox__Arrival city");
				bAmericanAirlines_ThisElementValidationStatus = false;
			}else{
				// Enter some dummy arrive city name
				AmericanAirlines_txtbox_BookFlight_FlightArriveToCity.sendKeys("Milan (MIL), Italy");			}
		}
		if (strGUIOptionListFor_Book.contains("chkbox__Redeem Miles")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_chkbox_RedeemMile.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "chkbox__Redeem Miles");
				System.out.println("ERROR:    Following element not found: " + "chkbox__Redeem Miles");
				bAmericanAirlines_ThisElementValidationStatus = false;
			}else{
				// click on the redeem miles chk box then unclick on same
				AmericanAirlines_chkbox_RedeemMile.click();
				AmericanAirlines_chkbox_RedeemMile.click();			}
		}
		if (strGUIOptionListFor_Book.contains("btn__Search")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_btn_Search.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "btn__Search");
				System.out.println("ERROR:    Following element not found: " + "btn__Search");
				bAmericanAirlines_ThisElementValidationStatus = false;}
		}
		if (strGUIOptionListFor_Book.contains("lnk__Refine Search")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_lnk_RefineSearch.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "lnk__Refine Search");
				System.out.println("ERROR:    Following element not found: " + "lnk__Refine Search");
				bAmericanAirlines_ThisElementValidationStatus = false;}
		}
		if (strGUIOptionListFor_Book.contains("drpdwn__Depart date")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_lst_Date_Depart_Arrive.get(0).isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "drpdwn__Depart date");
				System.out.println("ERROR:    Following element not found: " + "drpdwn__Depart date");
				bAmericanAirlines_ThisElementValidationStatus = false;
			}else{
				// click on date drop down then unclick on same
				AmericanAirlines_lst_Date_Depart_Arrive.get(0).click();
				AmericanAirlines_lst_Date_Depart_Arrive.get(0).click();			}
		}
		if (strGUIOptionListFor_Book.contains("drpdwn__Arrival date")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_lst_Date_Depart_Arrive.get(1).isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "drpdwn__Arrival date");
				System.out.println("ERROR:    Following element not found: " + "drpdwn__Arrival date");
				bAmericanAirlines_ThisElementValidationStatus = false;
			}else{
				// click on date drop down then unclick on same
				AmericanAirlines_lst_Date_Depart_Arrive.get(1).click();
				AmericanAirlines_lst_Date_Depart_Arrive.get(1).click();			}
		}
		if (strGUIOptionListFor_Book.contains("drpdwn__Children count")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_drpdwn_Children_Count.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "drpdwn__Children count");
				System.out.println("ERROR:    Following element not found: " + "drpdwn__Children count");
				bAmericanAirlines_ThisElementValidationStatus = false;
			}else{
				// click on children count drop down then unclick on same
				AmericanAirlines_drpdwn_Children_Count.click();
				AmericanAirlines_drpdwn_Children_Count.click();			}
		}
		if (strGUIOptionListFor_Book.contains("drpdwn__Adult count")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_drpdwn_Adult_Count.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "drpdwn__Adult count");
				System.out.println("ERROR:    Following element not found: " + "drpdwn__Adult count");
				bAmericanAirlines_ThisElementValidationStatus = false;
			}else{
				// click on adult count drop down then unclick on same
				AmericanAirlines_drpdwn_Adult_Count.click();
				AmericanAirlines_drpdwn_Adult_Count.click();			}
		}
		if (strGUIOptionListFor_Book.contains("special__calender from date")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_lst_Date_Depart_Arrive.get(0).isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "special__calender from date");
				System.out.println("ERROR:    Following element not found: " + "special__calender from date");
				bAmericanAirlines_ThisElementValidationStatus = false;
			}else{
				// click on adult count drop down then unclick on same
				AmericanAirlines_lst_Date_Depart_Arrive.get(0).click();
				System.out.println("DEBUG:    Calender found for Book flight depart date for following month and year: " + 
					AmericanAirlines_lst_BookFlight_DropDown_DepartArriveDate.get(0).findElement(By.className("ui-datepicker-month")).getText() + "-" + 
					AmericanAirlines_lst_BookFlight_DropDown_DepartArriveDate.get(0).findElement(By.className("ui-datepicker-year")).getText()  + " " +
					AmericanAirlines_lst_BookFlight_DropDown_DepartArriveDate.get(1).findElement(By.className("ui-datepicker-month")).getText() + "-" +
					AmericanAirlines_lst_BookFlight_DropDown_DepartArriveDate.get(1).findElement(By.className("ui-datepicker-year")).getText()               );
			}
		}
		if (strGUIOptionListFor_Book.contains("special__calender to date")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_lst_Date_Depart_Arrive.get(1).isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "special__calender to date");
				System.out.println("ERROR:    Following element not found: " + "special__calender to date");
				bAmericanAirlines_ThisElementValidationStatus = false;
			}else{
				// click on adult count drop down then unclick on same
				AmericanAirlines_lst_Date_Depart_Arrive.get(1).click();
				System.out.println("DEBUG:    Calender found for Book flight arrive date for following month and year: " + 
					AmericanAirlines_lst_BookFlight_DropDown_DepartArriveDate.get(0).findElement(By.className("ui-datepicker-month")).getText() + "-" + 
					AmericanAirlines_lst_BookFlight_DropDown_DepartArriveDate.get(0).findElement(By.className("ui-datepicker-year")).getText()  + " " +
					AmericanAirlines_lst_BookFlight_DropDown_DepartArriveDate.get(1).findElement(By.className("ui-datepicker-month")).getText() + "-" +
					AmericanAirlines_lst_BookFlight_DropDown_DepartArriveDate.get(1).findElement(By.className("ui-datepicker-year")).getText()               );
			}
		}
		if (strGUIOptionListFor_Book.contains("special__drpdwn Adult count")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_drpdwn_Adult_Count.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "special__drpdwn Adult count");
				System.out.println("ERROR:    Following element not found: " + "special__drpdwn Adult count");
				bAmericanAirlines_ThisElementValidationStatus = false;
			}else{
				// click on adult count drop down then unclick on same
				Select objSelectAdultPersonCount = new Select(AmericanAirlines_drpdwn_Adult_Count);
				System.out.println("DEBUG:    Following number of options found for Adult person count : " +  objSelectAdultPersonCount.getOptions().size());
			}
		}
		if (strGUIOptionListFor_Book.contains("special__drpdwn_Children count")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_drpdwn_Children_Count.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "special__drpdwn_Children count");
				System.out.println("ERROR:    Following element not found: " + "special__drpdwn_Children count");
				bAmericanAirlines_ThisElementValidationStatus = false;
			}else{
				// click on adult count drop down then unclick on same
				Select objSelectChildrePersonCount = new Select(AmericanAirlines_drpdwn_Children_Count);
				System.out.println("DEBUG:    Following number of options found for Children person count : " +  objSelectChildrePersonCount.getOptions().size());
			}
		}
		
		if (!bSpportedElementFound){
			objSoftAssert.fail("ERROR:    Atleast one unsuported element NOT found in following category: " + "Book Flights");
			System.out.println("ERROR:    Atleast one unsuported element NOT found in following category: " + "Book Flights");
			return bSpportedElementFound;
		}
		if (bAmericanAirlines_ThisElementValidationStatus) System.out.println("RESULT::PASS");
		else{
			System.out.println("RESULT::FAIL");
			objSoftAssert.fail("ERROR:    Atleast one supported element NOT found in following category: " + "Book Flights");
			System.out.println("ERROR:    Atleast one supported element NOT found in following category: " + "Book Flights");
		}		

		return bAmericanAirlines_ThisElementValidationStatus;
		
	}
	
	public boolean AmericanAirlines_Validate_HomePageElements_for_MyTrips_Category(String strGUIOptionListFor_MyTrips){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;
		boolean bSpportedElementFound								= false;
		
		// click on My Trips tab to proceed
		AmericanAirlines_lnk_MyTrips.click();
			    
		if (strGUIOptionListFor_MyTrips.contains("txtbox__First name")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_lst_txtbox_PassengerFirstName.get(0).isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "txtbox__First name");
				System.out.println("ERROR:    Following element not found: " + "txtbox__First name");
				bAmericanAirlines_ThisElementValidationStatus = false;
			}else{
				// Enter some dummy text
				AmericanAirlines_lst_txtbox_PassengerFirstName.get(0).sendKeys("Dummy First Name");			}
		}
		if (strGUIOptionListFor_MyTrips.contains("txtbox__Last name")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_lst_txtbox_PassengerLastName.get(0).isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "txtbox__Last name");
				System.out.println("ERROR:    Following element not found: " + "txtbox__Last name");
				bAmericanAirlines_ThisElementValidationStatus = false;
			}else{
				// Enter some dummy text
				AmericanAirlines_lst_txtbox_PassengerLastName.get(0).sendKeys("Dummy Last Name");			}
		}
		if (strGUIOptionListFor_MyTrips.contains("txtbox__Booking ref")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_lst_txtbox_Booking_Reference.get(0).isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "txtbox__Booking ref");
				System.out.println("ERROR:    Following element not found: " + "txtbox__Booking ref");
				bAmericanAirlines_ThisElementValidationStatus = false;
			}else{
				// Enter some dummy text
				AmericanAirlines_lst_txtbox_Booking_Reference.get(0).sendKeys("A0B1C2");		}
		}
		if (strGUIOptionListFor_MyTrips.contains("btn__Manage My Trip")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_btn_ManageMyTrip.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "btn__Manage My Trip");
				System.out.println("ERROR:    Following element not found: " + "btn__Manage My Trip");
				bAmericanAirlines_ThisElementValidationStatus = false;}
		}
		if (strGUIOptionListFor_MyTrips.contains("btn__Select My Seat")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_btn_SelectMySeat.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "btn__Select My Seat");
				System.out.println("ERROR:    Following element not found: " + "btn__Select My Seat");
				bAmericanAirlines_ThisElementValidationStatus = false;}
		}

		if (!bSpportedElementFound){
			objSoftAssert.fail("ERROR:    Atleast one unsupported element NOT found in following category: " + "My Trips");
			System.out.println("ERROR:    Atleast one unsupported element NOT found in following category: " + "My Trips");
			return bSpportedElementFound;
		}
		if (bAmericanAirlines_ThisElementValidationStatus) System.out.println("RESULT::PASS");
		else{
			System.out.println("RESULT::FAIL");
			objSoftAssert.fail("ERROR:    Atleast one supported element NOT found in following category: " + "My Trips");
			System.out.println("ERROR:    Atleast one supported element NOT found in following category: " + "My Trips");
		}
		
		return bAmericanAirlines_ThisElementValidationStatus;
		
	}
	
	public boolean AmericanAirlines_Validate_HomePageElements_for_CheckIn_Category(String strGUIOptionListFor_CheckIn){
		
		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;
		boolean bSpportedElementFound								= false;
		
		// click on Check In tab to proceed
		AmericanAirlines_lnk_Check_In.click();
			    
		if (strGUIOptionListFor_CheckIn.contains("txtbox__First name")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_lst_txtbox_PassengerFirstName.get(1).isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "txtbox__First name");
				System.out.println("ERROR:    Following element not found: " + "txtbox__First name");
				bAmericanAirlines_ThisElementValidationStatus = false;
			}else{
				// Enter some dummy text
				AmericanAirlines_lst_txtbox_PassengerFirstName.get(1).sendKeys("Dummy First Name");			}
		}
		if (strGUIOptionListFor_CheckIn.contains("txtbox__Last name")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_lst_txtbox_PassengerLastName.get(1).isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "txtbox__First name");
				System.out.println("ERROR:    Following element not found: " + "txtbox__Last name");
				bAmericanAirlines_ThisElementValidationStatus = false;
			}else{
				// Enter some dummy text
				AmericanAirlines_lst_txtbox_PassengerLastName.get(1).sendKeys("Dummy Last Name");			}
		}
		if (strGUIOptionListFor_CheckIn.contains("txtbox__Booking ref")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_lst_txtbox_Booking_Reference.get(1).isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "txtbox__Booking ref");
				System.out.println("ERROR:    Following element not found: " + "txtbox__Booking ref");
				bAmericanAirlines_ThisElementValidationStatus = false;
			}else{
				// Enter some dummy text
				AmericanAirlines_lst_txtbox_Booking_Reference.get(1).sendKeys("A0B1C2");		}
		}
		if (strGUIOptionListFor_CheckIn.contains("btn__Check-In Now")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_btn_CheckIn_CheckInNow_Button.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "btn__Check-In Now");
				System.out.println("ERROR:    Following element not found: " + "btn__Check-In Now");
				bAmericanAirlines_ThisElementValidationStatus = false;}
		}

		if (!bSpportedElementFound){
			objSoftAssert.fail("ERROR:    Atleast one unsupported element NOT found in following category: " + "Check In");
			System.out.println("ERROR:    Atleast one unsupported element NOT found in following category: " + "Check In");
			return bSpportedElementFound;
		}
		if (bAmericanAirlines_ThisElementValidationStatus) System.out.println("RESULT::PASS");
		else{
			System.out.println("RESULT::FAIL");
			objSoftAssert.fail("ERROR:    Atleast one supported element NOT found in following category: " + "Check In");
			System.out.println("ERROR:    Atleast one supported element NOT found in following category: " + "Check In");
		}
		
		return bAmericanAirlines_ThisElementValidationStatus;
		
	}
			
	public boolean AmericanAirlines_Validate_HomePageElements_for_FlightStatus_Category(String strGUIOptionListFor_FlightStatus){
		
		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;
		boolean bSpportedElementFound								= false;
		
		// click on flight status tab to proceed
		AmericanAirlines_lnk_Flight_Status.click();

		if (strGUIOptionListFor_FlightStatus.contains("txtbox__Flight Number")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_txtbox_FlightNumber.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "txtbox__Flight Number");
				System.out.println("ERROR:    Following element not found: " + "txtbox__Flight Number");
				bAmericanAirlines_ThisElementValidationStatus = false;
			}else{
				// Enter some dummy flight number
				AmericanAirlines_txtbox_FlightNumber.sendKeys("A100");			}
		}
		if (strGUIOptionListFor_FlightStatus.contains("txtbox__Depart city")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_txtbox_FlightDepartFrom.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "txtbox__Depart city");
				System.out.println("ERROR:    Following element not found: " + "txtbox__Depart city");
				bAmericanAirlines_ThisElementValidationStatus = false;
			}else{
				// Enter some dummy depart city name
				AmericanAirlines_txtbox_FlightDepartFrom.sendKeys("London City (LCY), United Kingdom");			}
		}
		if (strGUIOptionListFor_FlightStatus.contains("txtbox__Arrival city")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_txtbox_FlightArriveTo.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "txtbox__Arrival city");
				System.out.println("ERROR:    Following element not found: " + "txtbox__Arrival city");
				bAmericanAirlines_ThisElementValidationStatus = false;
			}else{
				AmericanAirlines_txtbox_FlightArriveTo.sendKeys("Vancouver (YVR), Canada");			}
		}
		if (strGUIOptionListFor_FlightStatus.contains("drpdwn__Date")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_drpdwn_FlightStatus_TravelDate.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "drpdwn__Date");
				System.out.println("ERROR:    Following element not found: " + "drpdwn__Date");
				bAmericanAirlines_ThisElementValidationStatus = false;
			}else{
			    // click on flight status travel date then unclick on the same
				AmericanAirlines_drpdwn_FlightStatus_TravelDate.click();
				AmericanAirlines_drpdwn_FlightStatus_TravelDate.click();			}
		}
		if (strGUIOptionListFor_FlightStatus.contains("drpdwn__Timing")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_drpdwn_FlightStatus_TravelTime.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "drpdwn__Timing");
				System.out.println("ERROR:    Following element not found: " + "drpdwn__Timing");
				bAmericanAirlines_ThisElementValidationStatus = false;
			}else{
				// click on flight status travel time then unclick on the same
				AmericanAirlines_drpdwn_FlightStatus_TravelTime.click();
				AmericanAirlines_drpdwn_FlightStatus_TravelTime.click();			}
		}
		if (strGUIOptionListFor_FlightStatus.contains("special__calender flight date")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_drpdwn_FlightStatus_TravelDate.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "special__calender flight date");
				System.out.println("ERROR:    Following element not found: " + "special__calender flight date");
				bAmericanAirlines_ThisElementValidationStatus = false;
			}else{
				Select objSelectFlightStatusDate = new Select(AmericanAirlines_drpdwn_FlightStatus_TravelDate);
				System.out.println("DEBUG:    Following number of options found for flght status travel date: " +  objSelectFlightStatusDate.getOptions().size());
			}
		}
		if (strGUIOptionListFor_FlightStatus.contains("special__drpdwn flight time")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_drpdwn_FlightStatus_TravelTime.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "special__drpdwn flight time");
				System.out.println("ERROR:    Following element not found: " + "special__drpdwn flight time");
				bAmericanAirlines_ThisElementValidationStatus = false;
			}else{
				Select objSelectFlightStatusTime = new Select(AmericanAirlines_drpdwn_FlightStatus_TravelTime);
				System.out.println("DEBUG:    Following number of options found for flght status travel time: " +  objSelectFlightStatusTime.getOptions().size());
			}
		}
		
		
		if (!bSpportedElementFound){
			objSoftAssert.fail("ERROR:    Atleast one unsupported element NOT found in following category: " + "Flight Status");
			System.out.println("ERROR:    Atleast one unsupported element NOT found in following category: " + "Flight Status");
			return bSpportedElementFound;
		}
		if (bAmericanAirlines_ThisElementValidationStatus) System.out.println("RESULT::PASS");
		else{
			System.out.println("RESULT::FAIL");
			objSoftAssert.fail("ERROR:    Atleast one supported element NOT found in following category: " + "Flight Status");
			System.out.println("ERROR:    Atleast one supported element NOT found in following category: " + "Flight Status");
		}
		
		return bAmericanAirlines_ThisElementValidationStatus;
	}
	
	public boolean AmericanAirlines_Validate_TopRowSubPageElements_ForPlanTravel(String subPageOptionList){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;
		boolean bSpportedElementFound								= false;

		// click on top row sub page link plan travel to proceed
		AmericanAirlines_lnk_TopRowItem_PlanTravel.click();

		if (subPageOptionList.contains("lnk__Travel Offers")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_lnk_TopRowItem_PlanTravel_TravelOffers.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "lnk__Travel Offers");
				System.out.println("ERROR:    Following element not found: " + "lnk__Travel Offers");
				bAmericanAirlines_ThisElementValidationStatus = false;}
		}
		if (subPageOptionList.contains("lnk__Flights")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_lnk_TopRowItem_PlanTravel_Flights.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "lnk__Flights");
				System.out.println("ERROR:    Following element not found: " + "lnk__Flights");
				bAmericanAirlines_ThisElementValidationStatus = false;}
		}
		if (subPageOptionList.contains("lnk__Travel Destinations")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_lnk_TopRowItem_PlanTravel_TravelDestinations.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "lnk__Travel Destinations");
				System.out.println("ERROR:    Following element not found: " + "lnk__Travel Destinations");
				bAmericanAirlines_ThisElementValidationStatus = false;}
		}
		if (subPageOptionList.contains("lnk__Gates & Times")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_lnk_TopRowItem_PlanTravel_GatesTimes.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "lnk__Gates & Times");
				System.out.println("ERROR:    Following element not found: " + "lnk__Gates & Times");
				bAmericanAirlines_ThisElementValidationStatus = false;}
		}


		if (!bSpportedElementFound){
			objSoftAssert.fail("ERROR:    Atleast one unsupported element NOT found in top row sub page: " + "Plan Travel");
			System.out.println("ERROR:    Atleast one unsupported element NOT found in top row sub page: " + "Plan Travel");
			return bSpportedElementFound;
		}
		if (bAmericanAirlines_ThisElementValidationStatus) System.out.println("RESULT::PASS");
		else{
			System.out.println("RESULT::FAIL");
			objSoftAssert.fail("ERROR:    Atleast one supported element NOT found in top row sub page: " + "Plan Travel");
			System.out.println("ERROR:    Atleast one supported element NOT found in top row sub page: " + "Plan Travel");
		}
		
		return bAmericanAirlines_ThisElementValidationStatus;
	}
	
	public boolean AmericanAirlines_Validate_TopRowSubPageElements_ForTravelInformation(String subPageOptionList){
		
		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;
		boolean bSpportedElementFound								= false;

		// click on top row sub page link travel information to proceed
		AmericanAirlines_lnk_TopRowItem_TravelInformation.click();
	    
		if (subPageOptionList.contains("lnk__At the airport")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_lnk_TopRowItem_TravelInformation_AtTheAirport.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "lnk__At the airport");
				System.out.println("ERROR:    Following element not found: " + "lnk__At the airport");
				bAmericanAirlines_ThisElementValidationStatus = false;}
		}
		if (subPageOptionList.contains("lnk__During the flight")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_lnk_TopRowItem_TravelInformation_DuringYourFlight.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "lnk__During the flight");
				System.out.println("ERROR:    Following element not found: " + "lnk__During the flight");
				bAmericanAirlines_ThisElementValidationStatus = false;}
		}
		if (subPageOptionList.contains("lnk__Planes")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_lnk_TopRowItem_TravelInformation_Planes.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "lnk__Planes");
				System.out.println("ERROR:    Following element not found: " + "lnk__Planes");
				bAmericanAirlines_ThisElementValidationStatus = false;}
		}
		if (subPageOptionList.contains("lnk__Clubs and lounges Destinations")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_lnk_TopRowItem_TravelInformation_ClubsLunnges.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "lnk__Clubs and lounges Destinations");
				System.out.println("ERROR:    Following element not found: " + "lnk__Clubs and lounges Destinations");
				bAmericanAirlines_ThisElementValidationStatus = false;}
		}
		if (subPageOptionList.contains("lnk__Baggage")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_lnk_TopRowItem_TravelInformation_Baggaage.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "lnk__Baggage");
				System.out.println("ERROR:    Following element not found: " + "lnk__Baggage");
				bAmericanAirlines_ThisElementValidationStatus = false;}
		}
		if (subPageOptionList.contains("lnk__International travel")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_lnk_TopRowItem_TravelInformation_InternationalTravel.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "lnk__International travel");
				System.out.println("ERROR:    Following element not found: " + "lnk__International travel");
				bAmericanAirlines_ThisElementValidationStatus = false;}
		}
		if (subPageOptionList.contains("lnk__Special assistance")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_lnk_TopRowItem_TravelInformation_SpecialAssistance.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "lnk__Special assistance");
				System.out.println("ERROR:    Following element not found: " + "lnk__Special assistance");
				bAmericanAirlines_ThisElementValidationStatus = false;}
		}
		if (subPageOptionList.contains("lnk__Airlines partners")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_lnk_TopRowItem_TravelInformation_AirlinePartners.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "lnk__Airlines partners");
				System.out.println("ERROR:    Following element not found: " + "lnk__Airlines partners");
				bAmericanAirlines_ThisElementValidationStatus = false;}
		}
		if (subPageOptionList.contains("lnk__oneworld alliance")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_lnk_TopRowItem_TravelInformation_OneworlsAlliance.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "lnk__oneworld alliance");
				System.out.println("ERROR:    Following element not found: " + "lnk__oneworld alliance");
				bAmericanAirlines_ThisElementValidationStatus = false;}
		}
		
		
		

		if (!bSpportedElementFound){
			objSoftAssert.fail("ERROR:    Atleast one unsupported element NOT found in top row sub page: " + "Plan Travel");
			System.out.println("ERROR:    Atleast one unsupported element NOT found in top row sub page: " + "Plan Travel");
			return bSpportedElementFound;
		}
		if (bAmericanAirlines_ThisElementValidationStatus) System.out.println("RESULT::PASS");
		else{
			System.out.println("RESULT::FAIL");
			objSoftAssert.fail("ERROR:    Atleast one supported element NOT found in top row sub page: " + "Plan Travel");
			System.out.println("ERROR:    Atleast one supported element NOT found in top row sub page: " + "Plan Travel");
		}
		
		return bAmericanAirlines_ThisElementValidationStatus;
	}
	
	public boolean AmericanAirlines_Validate_TopRowSubPageElements_ForAAdvantage(String subPageOptionList){
		
		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;
		boolean bSpportedElementFound								= false;

		// click on top row sub page link travel information to proceed
		AmericanAirlines_lnk_TopRowItem_AAdvantage.click();
	    
		if (subPageOptionList.contains("lnk__AAdvantage Home")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_lnk_TopRowItem_AAdvantage_AAdvantageHome.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "lnk__AAdvantage Home");
				System.out.println("ERROR:    Following element not found: " + "lnk__AAdvantage Home");
				bAmericanAirlines_ThisElementValidationStatus = false;}
		}
		if (subPageOptionList.contains("lnk__Elite Status")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_lnk_TopRowItem_AAdvantage_EliteStatus.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + " lnk__Elite Status");
				System.out.println("ERROR:    Following element not found: " + " lnk__Elite Status");
				bAmericanAirlines_ThisElementValidationStatus = false;}
		}
		if (subPageOptionList.contains("lnk__Earn Miles")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_lnk_TopRowItem_AAdvantage_EarnMiles.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "lnk__Earn Miles");
				System.out.println("ERROR:    Following element not found: " + "lnk__Earn Miles");
				bAmericanAirlines_ThisElementValidationStatus = false;}
		}
		if (subPageOptionList.contains("lnk__Redeem Miles")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_lnk_TopRowItem_AAdvantage_RedeemMiles.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "lnk__Redeem Miles");
				System.out.println("ERROR:    Following element not found: " + "lnk__Redeem Miles");
				bAmericanAirlines_ThisElementValidationStatus = false;}
		}
		if (subPageOptionList.contains("lnk__Award Travel")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_lnk_TopRowItem_AAdvantage_AwardTravel.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "lnk__Award Travel");
				System.out.println("ERROR:    Following element not found: " + "lnk__Award Travel");
				bAmericanAirlines_ThisElementValidationStatus = false;}
		}
		if (subPageOptionList.contains("lnk__Buy & Share Miles")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_lnk_TopRowItem_AAdvantage_BuyShareMiles.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "lnk__Buy & Share Miles");
				System.out.println("ERROR:    Following element not found: " + "lnk__Buy & Share Miles");
				bAmericanAirlines_ThisElementValidationStatus = false;}
		}
		
		

		if (!bSpportedElementFound){
			objSoftAssert.fail("ERROR:    Atleast one unsupported element NOT found in top row sub page: " + "AAdvantage");
			System.out.println("ERROR:    Atleast one unsupported element NOT found in top row sub page: " + "AAdvantage");
			return bSpportedElementFound;
		}
		if (bAmericanAirlines_ThisElementValidationStatus) System.out.println("RESULT::PASS");
		else{
			System.out.println("RESULT::FAIL");
			objSoftAssert.fail("ERROR:    Atleast one supported element NOT found in top row sub page: " + "AAdvantage");
			System.out.println("ERROR:    Atleast one supported element NOT found in top row sub page: " + "AAdvantage");
		}
		
		return bAmericanAirlines_ThisElementValidationStatus;
	}

	public boolean AmericanAirlines_Validate_TopRowSubPageElements_Common(String subPageOptionList){
		
		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;
		boolean bSpportedElementFound								= false;
	    
		// click on top row sub page link plan travel to proceed
		AmericanAirlines_lnk_TopRowItem_PlanTravel.click();
		
		if (subPageOptionList.contains("lnk__Flight Status")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_lnk_TopRowItemCommon_Flightstatus.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "lnk__Flight Status");
				System.out.println("ERROR:    Following element not found: " + "lnk__Flight Status");
				bAmericanAirlines_ThisElementValidationStatus = false;}
		}
		if (subPageOptionList.contains("lnk__Online check-in")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_lnk_TopRowItemCommon_OnlineCheckIn.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "lnk__Online check-in");
				System.out.println("ERROR:    Following element not found: " + "lnk__Online check-in");
				bAmericanAirlines_ThisElementValidationStatus = false;}
		}
		if (subPageOptionList.contains("lnk__My Trips")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_lnk_TopRowItemCommon_MyTrips.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "lnk__My Trips");
				System.out.println("ERROR:    Following element not found: " + "lnk__My Trips");
				bAmericanAirlines_ThisElementValidationStatus = false;}
		}
		if (subPageOptionList.contains("lnk__Join AAdvantage Loyalty Program")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_lnk_TopRowItemCommon_JoinSAdvantageLoyaltyProgram.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "lnk__Join AAdvantage Loyalty Program");
				System.out.println("ERROR:    Following element not found: " + "lnk__Join AAdvantage Loyalty Program");
				bAmericanAirlines_ThisElementValidationStatus = false;}
		}
		
		
		// click on top row sub page link travel information to proceed
		AmericanAirlines_lnk_TopRowItem_TravelInformation.click();
		
		if (subPageOptionList.contains("lnk__Flight Status")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_lnk_TopRowItemCommon_Flightstatus.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "lnk__Flight Status");
				System.out.println("ERROR:    Following element not found: " + "lnk__Flight Status");
				bAmericanAirlines_ThisElementValidationStatus = false;}
		}
		if (subPageOptionList.contains("lnk__Online check-in")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_lnk_TopRowItemCommon_OnlineCheckIn.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "lnk__Online check-in");
				System.out.println("ERROR:    Following element not found: " + "lnk__Online check-in");
				bAmericanAirlines_ThisElementValidationStatus = false;}
		}
		if (subPageOptionList.contains("lnk__My Trips")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_lnk_TopRowItemCommon_MyTrips.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "lnk__My Trips");
				System.out.println("ERROR:    Following element not found: " + "lnk__My Trips");
				bAmericanAirlines_ThisElementValidationStatus = false;}
		}
		if (subPageOptionList.contains("lnk__Join AAdvantage Loyalty Program")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_lnk_TopRowItemCommon_JoinSAdvantageLoyaltyProgram.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "lnk__Join AAdvantage Loyalty Program");
				System.out.println("ERROR:    Following element not found: " + "lnk__Join AAdvantage Loyalty Program");
				bAmericanAirlines_ThisElementValidationStatus = false;}
		}
		
		
		// click on top row sub page link travel information to proceed
		AmericanAirlines_lnk_TopRowItem_AAdvantage.click();
		
		if (subPageOptionList.contains("lnk__Flight Status")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_lnk_TopRowItemCommon_Flightstatus.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "lnk__Flight Status");
				System.out.println("ERROR:    Following element not found: " + "lnk__Flight Status");
				bAmericanAirlines_ThisElementValidationStatus = false;}
		}
		if (subPageOptionList.contains("lnk__Online check-in")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_lnk_TopRowItemCommon_OnlineCheckIn.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "lnk__Online check-in");
				System.out.println("ERROR:    Following element not found: " + "lnk__Online check-in");
				bAmericanAirlines_ThisElementValidationStatus = false;}
		}
		if (subPageOptionList.contains("lnk__My Trips")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_lnk_TopRowItemCommon_MyTrips.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "lnk__My Trips");
				System.out.println("ERROR:    Following element not found: " + "lnk__My Trips");
				bAmericanAirlines_ThisElementValidationStatus = false;}
		}
		if (subPageOptionList.contains("lnk__Join AAdvantage Loyalty Program")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_lnk_TopRowItemCommon_JoinSAdvantageLoyaltyProgram.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "lnk__Join AAdvantage Loyalty Program");
				System.out.println("ERROR:    Following element not found: " + "lnk__Join AAdvantage Loyalty Program");
				bAmericanAirlines_ThisElementValidationStatus = false;}
		}
		
		

		
		

		if (!bSpportedElementFound){
			objSoftAssert.fail("ERROR:    Atleast one unsupported element NOT found in top row sub page: " + "Common items");
			System.out.println("ERROR:    Atleast one unsupported element NOT found in top row sub page: " + "Common items");
			return bSpportedElementFound;
		}
		if (bAmericanAirlines_ThisElementValidationStatus) System.out.println("RESULT::PASS");
		else{
			System.out.println("RESULT::FAIL");
			objSoftAssert.fail("ERROR:    Atleast one supported element NOT found in top row sub page: " + "Common items");
			System.out.println("ERROR:    Atleast one supported element NOT found in top row sub page: " + "Common items");
		}
		
		return bAmericanAirlines_ThisElementValidationStatus;
	}
	
	public boolean AmericanAirlines_Validate_TicketSearchScenarioFor_BookFlight(
										String strSectionTypeAndSearchText, String strScenarioExpectedResult){
			
		Actions objActionsBldr_AmericanAirlines_HomePage 	= new Actions(this.objWebDriverAbstract);
		
	    
		if (strSectionTypeAndSearchText.contains("Book") && strSectionTypeAndSearchText.contains("valid location")){
			// click on Book ticket tab
			AmericanAirlines_tab_BookTicket.click();

//			AmericanAirlines_txtbox_BookFlight_FlightDepartFromCity.sendKeys("Boston Logan (BOS), Massachusetts, USA" + Keys.DOWN + Keys.DOWN + Keys.DOWN + Keys.ENTER);
//			AmericanAirlines_txtbox_BookFlight_FlightArriveToCity.sendKeys("Venice (VCE), Italy" + Keys.DOWN + Keys.DOWN + Keys.DOWN + Keys.ENTER);
//
//			AmericanAirlines_txtbox_Date_Depart.clear();
//			AmericanAirlines_txtbox_Date_Depart.sendKeys(AmericanAirlines_getFormattedFullDatefor_NextFriday() + Keys.RIGHT + Keys.RIGHT + Keys.RIGHT);
//			AmericanAirlines_btn_Date_DepartArrive_ActiveDate.click();
//			
//			AmericanAirlines_txtbox_Date_Arrive.clear();
//			AmericanAirlines_txtbox_Date_Arrive.sendKeys(AmericanAirlines_getFormattedFullDatefor_NextSunday() + Keys.RIGHT + Keys.RIGHT + Keys.RIGHT);
//			AmericanAirlines_btn_Date_DepartArrive_ActiveDate.click();
//			
//			AmericanAirlines_btn_Search.click();
			
			objActionsBldr_AmericanAirlines_HomePage
				.sendKeys(AmericanAirlines_txtbox_BookFlight_FlightDepartFromCity, "Boston Logan (BOS), Massachusetts, USA" + Keys.DOWN + Keys.DOWN + Keys.DOWN + Keys.ENTER)
				.sendKeys(AmericanAirlines_txtbox_BookFlight_FlightArriveToCity, "Venice (VCE), Italy" + Keys.DOWN + Keys.DOWN + Keys.DOWN + Keys.ENTER)
				.sendKeys(AmericanAirlines_txtbox_Date_Depart,Keys.chord(Keys.CONTROL, "a") + Keys.DELETE)
				.sendKeys(AmericanAirlines_txtbox_Date_Depart,AmericanAirlines_getFormattedFullDatefor_NextFriday() + Keys.RIGHT + Keys.RIGHT + Keys.RIGHT)
				.click(AmericanAirlines_btn_Date_DepartArrive_ActiveDate)
				.sendKeys(AmericanAirlines_txtbox_Date_Arrive,Keys.chord(Keys.CONTROL, "a") + Keys.DELETE)
				.sendKeys(AmericanAirlines_txtbox_Date_Arrive,AmericanAirlines_getFormattedFullDatefor_NextSunday() + Keys.RIGHT + Keys.RIGHT + Keys.RIGHT)
				.click(AmericanAirlines_btn_Date_DepartArrive_ActiveDate)
				.click(AmericanAirlines_btn_Search)
				.build()
				.perform();
			
			objWait.until(ExpectedConditions.visibilityOf(objLocal_PageAmericanAirlinesResult0InProgress.AmericanAirlines_labl_FlightSearchInProgress));
			objWait.until(ExpectedConditions.invisibilityOfElementLocated(objLocal_PageAmericanAirlinesResult0InProgress.AmericanAirlines_By_labl_FlightSearchInProgress));
			
			if(objLocal_PageAmericanAirlinesResult0InProgress.AmericanAirlines_lst_btn_MultipleEntryMatch_Continue.size() >0)       {
				objLocal_PageAmericanAirlinesResult0InProgress.AmericanAirlines_lst_btn_MultipleEntryMatch_Continue.get(0).click();
			}

			objWait.until(ExpectedConditions.textToBePresentInElement(objLocal_PageAmericanAirlinesResult1SelectDate.AmericanAirlines_Result1Page_CurrentStep, "1"));   

			if(objLocal_PageAmericanAirlinesResult1SelectDate.AmericanAirlines_lst_Result1Page_ErrorOccured.size() >0 ){
				objSoftAssert.fail("ERROR:    Error occured in search results");
				System.out.println("ERROR:    Error occured in search results");
				return false;
			}
		}
		else if (strSectionTypeAndSearchText.contains("Book") && strSectionTypeAndSearchText.contains("no return city")){
			// click on Book ticket tab
			AmericanAirlines_tab_BookTicket.click();
			objActionsBldr_AmericanAirlines_HomePage
				.sendKeys(AmericanAirlines_txtbox_BookFlight_FlightDepartFromCity, "Los Angeles (LAX), California, USA"+ Keys.DOWN + Keys.DOWN + Keys.DOWN + Keys.ENTER + Keys.TAB + Keys.TAB)
				//.sendKeys(AmericanAirlines_txtbox_Date_Depart, Keys.DELETE)
				.sendKeys(AmericanAirlines_txtbox_Date_Depart,Keys.chord(Keys.CONTROL, "a") + Keys.DELETE)				
				.sendKeys(AmericanAirlines_txtbox_Date_Depart,AmericanAirlines_getFormattedFullDatefor_NextFriday())
				//.sendKeys(AmericanAirlines_txtbox_Date_Arrive, Keys.DELETE)
				.sendKeys(AmericanAirlines_txtbox_Date_Arrive,Keys.chord(Keys.CONTROL, "a") + Keys.DELETE)
				.sendKeys(AmericanAirlines_txtbox_Date_Arrive,AmericanAirlines_getFormattedFullDatefor_NextSunday())
				.click(AmericanAirlines_txtbox_Date_Arrive)
				.click(AmericanAirlines_btn_Search)
				.build()
				.perform();
			objWait.until(ExpectedConditions.visibilityOf(AmericanAirlines_lst_labl_MainPageErrors.get(0)));
			if (! strScenarioExpectedResult.contains(AmericanAirlines_lst_labl_MainPageErrors.get(0).getText())){
				objSoftAssert.fail("ERROR:    Espected result message not observed");
				System.out.println("ERROR:    Espected result message not observed");
				return false;
			}
			System.out.println("DEBUG:    Following error message(s) observed:");
			for (WebElement objSingleErrorMsg : AmericanAirlines_lst_labl_MainPageErrors){
				System.out.println("DEBUG:    " + objSingleErrorMsg.getText());
			}
		}
		else if (strSectionTypeAndSearchText.contains("Book") && strSectionTypeAndSearchText.contains("no date")){
			// click on Book ticket tab
			AmericanAirlines_tab_BookTicket.click();
			objActionsBldr_AmericanAirlines_HomePage
				.sendKeys(AmericanAirlines_txtbox_BookFlight_FlightDepartFromCity, "Los Angeles (LAX), California, USA"+ Keys.DOWN + Keys.DOWN + Keys.DOWN + Keys.ENTER)
				.sendKeys(AmericanAirlines_txtbox_BookFlight_FlightArriveToCity, "Berlin (BER), Germany"               + Keys.DOWN + Keys.DOWN + Keys.DOWN + Keys.ENTER)
				.click(AmericanAirlines_btn_Search)
				.build()
				.perform();
			objWait.until(ExpectedConditions.visibilityOf(AmericanAirlines_lst_labl_MainPageErrors.get(0)));
			if (! strScenarioExpectedResult.contains(AmericanAirlines_lst_labl_MainPageErrors.get(0).getText())){
				objSoftAssert.fail("ERROR:    Expected result message not observed");
				System.out.println("ERROR:    Expected result message not observed");
				return false;
			}
			System.out.println("DEBUG:    Following error message(s) observed:");
			for (WebElement objSingleErrorMsg : AmericanAirlines_lst_labl_MainPageErrors){
				System.out.println("DEBUG:    " + objSingleErrorMsg.getText());
			}
		}
		else if (strSectionTypeAndSearchText.contains("My Trips") && strSectionTypeAndSearchText.contains("invalid text")){
			// click on My Trips tab
			AmericanAirlines_tab_MyTrips.click();	
			objActionsBldr_AmericanAirlines_HomePage
				.sendKeys(AmericanAirlines_lst_txtbox_PassengerFirstName.get(0), "xxxx")
				.sendKeys(AmericanAirlines_lst_txtbox_PassengerLastName.get(0), "xxxx")
				.sendKeys(AmericanAirlines_lst_txtbox_Booking_Reference.get(0), "xxxx" + Keys.TAB)
				.click(AmericanAirlines_btn_ManageMyTrip)
				.build()
				.perform();
			objWait.until(ExpectedConditions.visibilityOf(AmericanAirlines_lst_labl_MainPageErrors.get(0)));
			if (! strScenarioExpectedResult.contains(AmericanAirlines_lst_labl_MainPageErrors.get(0).getText())){
				objSoftAssert.fail("ERROR:    Expected result message not observed");
				System.out.println("ERROR:    Expected result message not observed");
				return false;
			}
			System.out.println("DEBUG:    Following error message(s) observed:");
			for (WebElement objSingleErrorMsg : AmericanAirlines_lst_labl_MainPageErrors){
				objSoftAssert.fail("DEBUG:    " + objSingleErrorMsg.getText());
				System.out.println("DEBUG:    " + objSingleErrorMsg.getText());
			}
		}
		else if (strSectionTypeAndSearchText.contains("Check-In") && strSectionTypeAndSearchText.contains("invalid text")){
			// click on Check-In tab
			AmericanAirlines_tab_CheckIn.click();
			objActionsBldr_AmericanAirlines_HomePage
				.sendKeys(AmericanAirlines_lst_txtbox_PassengerFirstName.get(1), "xxxx")
				.sendKeys(AmericanAirlines_lst_txtbox_PassengerLastName.get(1), "xxxx")
				.sendKeys(AmericanAirlines_lst_txtbox_Booking_Reference.get(1), "xxxx" + Keys.TAB)
				.click(AmericanAirlines_btn_CheckIn_CheckInNow_Button)
				.build()
				.perform();
			objWait.until(ExpectedConditions.visibilityOf(AmericanAirlines_lst_labl_MainPageErrors.get(0)));
			if (! strScenarioExpectedResult.contains(AmericanAirlines_lst_labl_MainPageErrors.get(0).getText())){
				objSoftAssert.fail("ERROR:    Expected result message not observed");
				System.out.println("ERROR:    Expected result message not observed");
				return false;
			}
			System.out.println("DEBUG:    Following error message(s) observed:");
			for (WebElement objSingleErrorMsg : AmericanAirlines_lst_labl_MainPageErrors){
				System.out.println("DEBUG:    " + objSingleErrorMsg.getText());
			}
		}
		else if (strSectionTypeAndSearchText.contains("Flight Status") && strSectionTypeAndSearchText.contains("invalid flight number")){
			// click on Flight Status tab
			AmericanAirlines_tab_FlightStatus.click();
			objActionsBldr_AmericanAirlines_HomePage
				.sendKeys(AmericanAirlines_txtbox_FlightNumber, "x9x9")   //invalid flight number
				.click(AmericanAirlines_btn_Go)
				.build()
				.perform();
			
			objWait.until(ExpectedConditions.visibilityOf(objLocal_PageAmericanAirlinesResult99General.AmericanAirlines_labl_PageHeading_FlightStatus));
			
			if(!strScenarioExpectedResult.contains(objLocal_PageAmericanAirlinesResult0InProgress.AmericanAirlines_lst_labl_SomethingWentWrong.get(1).getText())){
				objSoftAssert.fail("ERROR:    Error occured in search results");
				System.out.println("ERROR:    Error occured in search results");
				return false;
			}
		}
		else if (strSectionTypeAndSearchText.contains("Flight Status") && strSectionTypeAndSearchText.contains("valid flight number")){
			// click on Flight Status tab
			AmericanAirlines_tab_FlightStatus.click();
			objActionsBldr_AmericanAirlines_HomePage
				.sendKeys(AmericanAirlines_txtbox_FlightNumber, "2410")    // valid flight number
				.click(AmericanAirlines_btn_Go)
				.build()
				.perform();
			
			objWait.until(ExpectedConditions.visibilityOf(objLocal_PageAmericanAirlinesResult99General.AmericanAirlines_labl_PageHeading_FlightStatus));
			
			if(objLocal_PageAmericanAirlinesResult0InProgress.AmericanAirlines_lst_labl_SomethingWentWrong.size() > 1){
				objSoftAssert.fail("ERROR:    Error occured in search results");
				System.out.println("ERROR:    Error occured in search results");
				return false;
			}
		}else{
			return false;  // to be on safer side for unhandled user input combination
		}
		return true;		
		
	}
	
	public boolean AmericanAirlines_Perform_Simple_Valid_Flight_Search(String[] strArrRandomDepaartAndArriveCityNames){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;
		Actions objActionsBldr_AmericanAirlines_HomePage 			= new Actions(this.objWebDriverAbstract);
		
		System.out.println("DEBUG:    Depart city:           " + strArrRandomDepaartAndArriveCityNames[0]);
		System.out.println("DEBUG:    Arrive city:           " + strArrRandomDepaartAndArriveCityNames[1]);		
		System.out.println("DEBUG:    Flight type:           " + "One Way");
		System.out.println("DEBUG:    Flight departure date: " + AmericanAirlines_getFormattedFullDatefor_NextFriday());
		System.out.println("DEBUG:    Flight arrive date:    " + "NA");

		
		// click on Book ticket tab
		AmericanAirlines_tab_BookTicket.click();
		//click on one way flight button
		AmericanAirlines_lst_BookTicketType_1Way_2Way.get(1).click();
		objWait.until(ExpectedConditions.visibilityOf(AmericanAirlines_txtbox_Date_Arrive_disabled));
		
		objActionsBldr_AmericanAirlines_HomePage
			.sendKeys(AmericanAirlines_txtbox_BookFlight_FlightDepartFromCity, strArrRandomDepaartAndArriveCityNames[0] + Keys.DOWN + Keys.DOWN + Keys.DOWN + Keys.ENTER)
			.sendKeys(AmericanAirlines_txtbox_BookFlight_FlightArriveToCity,   strArrRandomDepaartAndArriveCityNames[1] + Keys.DOWN + Keys.DOWN + Keys.DOWN + Keys.ENTER)
			.sendKeys(AmericanAirlines_txtbox_Date_Depart,Keys.chord(Keys.CONTROL, "a") + Keys.DELETE)
			.sendKeys(AmericanAirlines_txtbox_Date_Depart,AmericanAirlines_getFormattedFullDatefor_NextFriday() + Keys.RIGHT + Keys.RIGHT + Keys.RIGHT)
			.click(AmericanAirlines_btn_Date_DepartArrive_ActiveDate)
			.click(AmericanAirlines_btn_Search)
			.build()
			.perform();
		
		try{
			objWait.until(ExpectedConditions.visibilityOf(objLocal_PageAmericanAirlinesResult0InProgress.AmericanAirlines_labl_FlightSearchInProgress));
		}catch (Exception e){System.out.println("DEBUG:    This exception to be ignored!");}
		
		if(objLocal_PageAmericanAirlinesResult0InProgress.AmericanAirlines_lst_btn_MultipleEntryMatch_Continue.size() >0)       {
			objLocal_PageAmericanAirlinesResult0InProgress.AmericanAirlines_lst_btn_MultipleEntryMatch_Continue.get(0).click();
		}

		try{objWait.until(ExpectedConditions.invisibilityOfElementLocated(objLocal_PageAmericanAirlinesResult0InProgress.AmericanAirlines_By_labl_FlightSearchInProgress));
		}catch (Exception e){System.out.println("DEBUG:    This exception to be ignored!");}

		objWait.until(ExpectedConditions.textToBePresentInElement(objLocal_PageAmericanAirlinesResult1SelectDate.AmericanAirlines_Result1Page_CurrentStep, "1"));   

		if(objLocal_PageAmericanAirlinesResult1SelectDate.AmericanAirlines_lst_Result1Page_Error_Type2_Heading.size() >0 ){
			String strErrorText = "";
			if (objLocal_PageAmericanAirlinesResult1SelectDate.AmericanAirlines_Result1Page_Error_Type2_Text.isDisplayed()){
				strErrorText = objLocal_PageAmericanAirlinesResult1SelectDate.AmericanAirlines_Result1Page_Error_Type2_Text.getText();
			}
			objSoftAssert.fail("ERROR:    Error occured in search results for simple valid flight search - upto select date page: " + strErrorText);
			System.out.println("ERROR:    Error occured in search results for simple valid flight search - upto select date page: " + strErrorText);
			bAmericanAirlines_ThisElementValidationStatus =  false;
		}

		return bAmericanAirlines_ThisElementValidationStatus;
	}
	
	public boolean AmericanAirlines_Perform_Simple_Valid_Flight_Search_2Way(String[] strArrRandomDepaartAndArriveCityNames){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;
		Actions objActionsBldr_AmericanAirlines_HomePage 			= new Actions(this.objWebDriverAbstract);
		
		System.out.println("DEBUG:    Depart city:           " + strArrRandomDepaartAndArriveCityNames[0]);
		System.out.println("DEBUG:    Arrive city:           " + strArrRandomDepaartAndArriveCityNames[1]);		
		System.out.println("DEBUG:    Flight type:           " + "Two Way");
		System.out.println("DEBUG:    Flight departure date: " + AmericanAirlines_getFormattedFullDatefor_NextFriday());
		System.out.println("DEBUG:    Flight arrive date:    " + AmericanAirlines_getFormattedFullDatefor_NextSunday());

		
		// click on Book ticket tab
		AmericanAirlines_tab_BookTicket.click();
		//click on two way flight button
		AmericanAirlines_lst_BookTicketType_1Way_2Way.get(0).click();
		
		objActionsBldr_AmericanAirlines_HomePage
			.sendKeys(AmericanAirlines_txtbox_BookFlight_FlightDepartFromCity, strArrRandomDepaartAndArriveCityNames[0] + Keys.DOWN + Keys.DOWN + Keys.DOWN + Keys.ENTER)
			.sendKeys(AmericanAirlines_txtbox_BookFlight_FlightArriveToCity,   strArrRandomDepaartAndArriveCityNames[1] + Keys.DOWN + Keys.DOWN + Keys.DOWN + Keys.ENTER)
			.sendKeys(AmericanAirlines_txtbox_Date_Depart,Keys.chord(Keys.CONTROL, "a") + Keys.DELETE)
			.sendKeys(AmericanAirlines_txtbox_Date_Depart,AmericanAirlines_getFormattedFullDatefor_NextFriday() + Keys.RIGHT + Keys.RIGHT + Keys.RIGHT)
			.click(AmericanAirlines_btn_Date_DepartArrive_ActiveDate)
			.sendKeys(AmericanAirlines_txtbox_Date_Arrive,Keys.chord(Keys.CONTROL, "a") + Keys.DELETE)
			.sendKeys(AmericanAirlines_txtbox_Date_Arrive,AmericanAirlines_getFormattedFullDatefor_NextSunday() + Keys.RIGHT + Keys.RIGHT + Keys.RIGHT)
			.click(AmericanAirlines_btn_Date_DepartArrive_ActiveDate)
			.click(AmericanAirlines_btn_Search)
			.build()
			.perform();
		
		try{
			objWait.until(ExpectedConditions.visibilityOf(objLocal_PageAmericanAirlinesResult0InProgress.AmericanAirlines_labl_FlightSearchInProgress));
		}catch (Exception e){System.out.println("DEBUG:    This exception to be ignored!");}
		
		if(objLocal_PageAmericanAirlinesResult0InProgress.AmericanAirlines_lst_btn_MultipleEntryMatch_Continue.size() >0)       {
			objLocal_PageAmericanAirlinesResult0InProgress.AmericanAirlines_lst_btn_MultipleEntryMatch_Continue.get(0).click();
		}

		try{objWait.until(ExpectedConditions.invisibilityOfElementLocated(objLocal_PageAmericanAirlinesResult0InProgress.AmericanAirlines_By_labl_FlightSearchInProgress));
		}catch (Exception e){System.out.println("DEBUG:    This exception to be ignored!");}

		objWait.until(ExpectedConditions.textToBePresentInElement(objLocal_PageAmericanAirlinesResult1SelectDate.AmericanAirlines_Result1Page_CurrentStep, "1"));   

		if(objLocal_PageAmericanAirlinesResult1SelectDate.AmericanAirlines_lst_Result1Page_Error_Type2_Heading.size() >0 ){
			String strErrorText = "";
			if (objLocal_PageAmericanAirlinesResult1SelectDate.AmericanAirlines_Result1Page_Error_Type2_Text.isDisplayed()){
				strErrorText = objLocal_PageAmericanAirlinesResult1SelectDate.AmericanAirlines_Result1Page_Error_Type2_Text.getText();
			}
			objSoftAssert.fail("ERROR:    Error occured in search results for 2 way valid flight search - upto select date page: " + strErrorText);
			System.out.println("ERROR:    Error occured in search results for 2 way valid flight search - upto select date page: " + strErrorText);
			bAmericanAirlines_ThisElementValidationStatus =  false;
		}

		return bAmericanAirlines_ThisElementValidationStatus;
	}
	
	public boolean AmericanAirlines_Perform_SimpleActivity_and_NavigateToNextPage(String[] strArrRandomDepaartAndArriveCityNames){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;
		Actions objActionsBldr_AmericanAirlines_HomePage 			= new Actions(this.objWebDriverAbstract);
		
		System.out.println("DEBUG:    Depart city:           " + strArrRandomDepaartAndArriveCityNames[0]);
		System.out.println("DEBUG:    Arrive city:           " + strArrRandomDepaartAndArriveCityNames[1]);		
		System.out.println("DEBUG:    Flight type:           " + "One Way");
		System.out.println("DEBUG:    Flight departure date: " + AmericanAirlines_getFormattedFullDatefor_NextFriday());
		System.out.println("DEBUG:    Flight arrive date:    " + "NA");
		
		// click on Book ticket tab
		AmericanAirlines_tab_BookTicket.click();
		//click on one way flight button
		AmericanAirlines_lst_BookTicketType_1Way_2Way.get(1).click();
		objWait.until(ExpectedConditions.visibilityOf(AmericanAirlines_txtbox_Date_Arrive_disabled));
		
		objActionsBldr_AmericanAirlines_HomePage
			.sendKeys(AmericanAirlines_txtbox_BookFlight_FlightDepartFromCity, strArrRandomDepaartAndArriveCityNames[0] + Keys.DOWN + Keys.DOWN + Keys.DOWN + Keys.ENTER)
			.sendKeys(AmericanAirlines_txtbox_BookFlight_FlightArriveToCity,   strArrRandomDepaartAndArriveCityNames[1] + Keys.DOWN + Keys.DOWN + Keys.DOWN + Keys.ENTER)
			.sendKeys(AmericanAirlines_txtbox_Date_Depart,Keys.chord(Keys.CONTROL, "a") + Keys.DELETE)
			.sendKeys(AmericanAirlines_txtbox_Date_Depart,AmericanAirlines_getFormattedFullDatefor_NextFriday() + Keys.RIGHT + Keys.RIGHT + Keys.RIGHT)
			.click(AmericanAirlines_btn_Date_DepartArrive_ActiveDate)
			.click(AmericanAirlines_btn_Search)
			.build()
			.perform();
		
		try{
			objWait.until(ExpectedConditions.visibilityOf(objLocal_PageAmericanAirlinesResult0InProgress.AmericanAirlines_labl_FlightSearchInProgress));
		}catch (Exception e){System.out.println("DEBUG:    This exception to be ignored!");}
		
		if(objLocal_PageAmericanAirlinesResult0InProgress.AmericanAirlines_lst_btn_MultipleEntryMatch_Continue.size() >0)       {
			objLocal_PageAmericanAirlinesResult0InProgress.AmericanAirlines_lst_btn_MultipleEntryMatch_Continue.get(0).click();
		}

		try{objWait.until(ExpectedConditions.invisibilityOfElementLocated(objLocal_PageAmericanAirlinesResult0InProgress.AmericanAirlines_By_labl_FlightSearchInProgress));
		}catch (Exception e){System.out.println("DEBUG:    This exception to be ignored!");}

		objWait.until(ExpectedConditions.textToBePresentInElement(objLocal_PageAmericanAirlinesResult1SelectDate.AmericanAirlines_Result1Page_CurrentStep, "1"));   

		if(objLocal_PageAmericanAirlinesResult1SelectDate.AmericanAirlines_lst_Result1Page_Error_Type2_Heading.size() >0 ){
			String strErrorText = "";
			if (objLocal_PageAmericanAirlinesResult1SelectDate.AmericanAirlines_Result1Page_Error_Type2_Text.isDisplayed()){
				strErrorText = objLocal_PageAmericanAirlinesResult1SelectDate.AmericanAirlines_Result1Page_Error_Type2_Text.getText();
			}
			objSoftAssert.fail("ERROR:    Error occured in performing simple activity - upto select date page: " + strErrorText);
			System.out.println("ERROR:    Error occured in performing simple activity - upto select date page: " + strErrorText);
			bAmericanAirlines_ThisElementValidationStatus =  false;
		}

		return bAmericanAirlines_ThisElementValidationStatus;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	// helper methods
	public boolean AmericanAirlines_SocialPlugin_Check_Facebook(){
		
		if (AmericanAirlines_SocialPlugin_Facebook_lnk.isDisplayed() &&
			AmericanAirlines_SocialPlugin_Facebook_img.isDisplayed() &&
			AmericanAirlines_SocialPlugin_Facebook_name.isDisplayed()   ){
			return true;
		}else{			return false;		}
	}
    
	public boolean AmericanAirlines_SocialPlugin_Check_Twitter(){
		
		if (AmericanAirlines_SocialPlugin_Twitter_lnk.isDisplayed() &&
			AmericanAirlines_SocialPlugin_Twitter_img.isDisplayed() &&
			AmericanAirlines_SocialPlugin_Twitter_name.isDisplayed()   ){
			return true;
		}else{			return false;		}
	}
	
	public String AmericanAirlines_Get_MainPage_Logo_URL(){
		return AmericanAirlines_img_HomePageLogo.getAttribute("src");
	}
	
	public String[] AmericanAirlines_Get_MainPage_Slider_URL_Array(){
		return new String[]{
							AmericanAirlines_img_HomePage_Slider1.getAttribute("src"),
							AmericanAirlines_img_HomePage_Slider2.getAttribute("src")    };
	}
	
	public boolean AmericanAirlines_Slider_Images_Verify(){
		
		int nnLocalSliderImagesCount 		=  AmericanAirlines_Get_MainPage_Slider_URL_Array().length;
		boolean bLocalTestResultStatus 		= true;
		System.out.println("DEBUG:    Total count of slider images are: " + nnLocalSliderImagesCount);
		
		for (int nnLocal=0; nnLocal < nnLocalSliderImagesCount; nnLocal++){
			URL objURLMainPageOneSlider		= null;
			try {objURLMainPageOneSlider	= new URL(AmericanAirlines_Get_MainPage_Slider_URL_Array()[nnLocal]);} 
			catch (MalformedURLException e) {
				objSoftAssert.fail("ERROR:    Unable to fetch slider image through URL");
				System.out.println("ERROR:    Unable to fetch slider image through URL"); return false;}
			catch (Exception e)             {System.out.println("ERROR:    Unable to open slider image URL"); return false;}
			
			String strImageNameContains 	= "_reference_slider_image_" + Integer.toString(nnLocal) ;
			
			List<Object> lstGeneralObjects 	= ClsGeneralInitTerminateAndOtherUtil.process_Images_to_Compare(
					strImageNameContains, objURLMainPageOneSlider);
			if (! (boolean) lstGeneralObjects.get(0) ){
				objSoftAssert.fail("ERROR:    Slider image reading writing test failed for current slider image");
				System.out.println("ERROR:    Slider image reading writing test failed for current slider image");
				bLocalTestResultStatus = false;
				continue;
			}
			
			// lstGeneralObjects.get(1) is reference image path
			// lstGeneralObjects.get(2) is actual image path
			if (!ClsGeneralInitTerminateAndOtherUtil.utility_ImageCompare(
					lstGeneralObjects.get(1).toString(), 
					lstGeneralObjects.get(2).toString())   ){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Slider image comparison test failed for current slider image");
				System.out.println("ERROR:    Slider image comparison test failed for current slider image");
				bLocalTestResultStatus = false;
			}
		}
		
		if(bLocalTestResultStatus){	 System.out.println("DEBUG:    Slider images comparison test PASSED for all individual image");
		}else {
			objSoftAssert.fail("ERROR:    Slider images comparison test FAILED for at least one or many individual image");
			System.out.println("ERROR:    Slider images comparison test FAILED for at least one or many individual image");}
		
		return bLocalTestResultStatus;
	}
	
	public String AmericanAirlines_getFormattedFullDatefor_NextFriday(){
		
		int[] nArr_Current_YearMonthDay = ClsGeneralInitTerminateAndOtherUtil.get_NextFriday_YearMonthDay_integerArray();
		
		// americanairlines.in date format is     dd/mm/yyyy
		String strAmericanAirlinesFormattedDate_ddmmyy_Sting =
						String.valueOf(nArr_Current_YearMonthDay[2]) + "/" + 
						String.valueOf(nArr_Current_YearMonthDay[1]) + "/" +
						String.valueOf(nArr_Current_YearMonthDay[0]);
		
		return strAmericanAirlinesFormattedDate_ddmmyy_Sting;
	}
	
	public String AmericanAirlines_getFormattedFullDatefor_NextSunday(){
		
		int[] nArr_Current_YearMonthDay = ClsGeneralInitTerminateAndOtherUtil.get_NextSunday_YearMonthDay_integerArray();
		
		// americanairlines.in date format is     dd/mm/yyyy
		String strAmericanAirlinesFormattedDate_ddmmyy_Sting =
						String.valueOf(nArr_Current_YearMonthDay[2]) + "/" + 
						String.valueOf(nArr_Current_YearMonthDay[1]) + "/" +
						String.valueOf(nArr_Current_YearMonthDay[0]);
		
		return strAmericanAirlinesFormattedDate_ddmmyy_Sting;
	}

	public boolean AmericanAirlines_ModifySearch_BookReturnTicket(String[] strArrRandomDepaartAndArriveCityNames){
		
		boolean bAmericanAirlines_ThisElementValidationStatus = true;
		// go back to main page i.e. modifying search and perform ticket search for two way 
		AmericanAirlines_btn_HomePageLogo.click();
		objWait.until(ExpectedConditions.visibilityOfAllElements(AmericanAirlines_lst_btn_HomePage));
		
		bAmericanAirlines_ThisElementValidationStatus 	= 
				AmericanAirlines_Perform_Simple_Valid_Flight_Search_2Way(strArrRandomDepaartAndArriveCityNames);
		
		return bAmericanAirlines_ThisElementValidationStatus;
	}
	
}
