package com.imademethink_webautomation.pkgAirlines_GoAir;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
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

public class PageGoAirMain extends Page0Abstract{

	private PageGoAirResult0InProgress 					objLocal_PageGoAirResult0InProgress = null;
	private PageGoAirResult2SelectDate 					objLocal_PageGoAirResult2SelectDate = null;
//	private PageGoAirResult3ServicesAndPassengerDetail 	objLocal_PageGoAirResult3ServicesAndPassengerDetail = null;
//	private PageGoAirResult4SeatAssignment 				objLocal_PageGoAirResult4SeatAssignment = null;
//	private PageGoAirResult5Payment 					objLocal_PageGoAirResult5Payment = null;
//	private PageGoAir99General 					objLocal_PageGoAirResult99General = null;
	
	public PageGoAirMain(WebDriver driver) {
		super(driver);
		//System.out.println("DEBUG:    PageGoAirMain constructor");
		PageFactory.initElements(driver, this);
		objLocal_PageGoAirResult0InProgress					= new PageGoAirResult0InProgress(driver);
		objLocal_PageGoAirResult2SelectDate					= new PageGoAirResult2SelectDate(driver);
//		objLocal_PageGoAirResult3ServicesAndPassengerDetail	= new PageGoAirResult3ServicesAndPassengerDetail(driver);
//		objLocal_PageGoAirResult4SeatAssignment				= new PageGoAirResult4SeatAssignment(driver);
//		objLocal_PageGoAirResult5Payment  					= new PageGoAirResult5Payment(driver);
//		objLocal_PageGoAirResult99General					= new PageGoAir99General(driver);
	}

	// home page logo
	@FindBy(css="link[href='/upload/touchlogo.png']")
	private WebElement GoAir_img_HomePageLogo;
	
	// home page buttons
	@FindBy(className = "home,item,active,actfrst")
	private WebElement GoAir_btn_HomePage;
	@FindBy(linkText = "Plan my trip")
	private WebElement GoAir_hover_Plan_my_trip;
	@FindBy(linkText = "GoBusiness")
	private WebElement GoAir_btn_GoBusiness;
	@FindBy(linkText = "GoHolidays")
	private WebElement GoAir_btn_GoHolidays;
	@FindBy(linkText = "Careers")
	private WebElement GoAir_btn_Careers;
	@FindBy(linkText = "Promotions")
	private WebElement GoAir_hover_Promotions;
	@FindBy(linkText = "Services")
	private WebElement GoAir_hover_Services;
	@FindBy(linkText = "About Us")
	private WebElement GoAir_hover_About_Us;
	@FindBy(linkText = "Partner Login")
	private WebElement GoAir_btn_Partner_Login;
	@FindBy(css = "a[href='/manage/manage-booking']")
	private WebElement GoAir_hover_Manage_booking_under_Plan_my_trip;

	// home page slider elements (images, corresponding highlight button)
	@FindBy(className = "slides,slides-book")
	private WebElement GoAir_img_HomePage_SliderTotal;
	@FindBy(className = "slider-paging")
	private WebElement GoAir_SliderImageSelector;

	// user utility tabs
	@FindBy(linkText = "Book Flights")
	private WebElement GoAir_tab_Book_Flights;	
	@FindBy(linkText = "Web Check-in")
	private WebElement GoAir_tab_Web_Check_in;
	@FindBy(linkText = "Manage Booking")
	private WebElement GoAir_tab_Manage_Booking;
	@FindBy(linkText = "Flight Status")
	private WebElement GoAir_tab_Flight_Status;
	@FindBy(linkText = "Flight Schedule")
	private WebElement GoAir_tab_Flight_Schedule;
	@FindBy(linkText = "Route Map")
	private WebElement GoAir_tab_Route_Map;
	@FindBy(linkText="Flight Schedule")
	private WebElement GoAir_tab_FlightSchedule;
	@FindBy(linkText="Route Map")
	private WebElement GoAir_tab_RouteMap;
	
	// elements under bottom options bar
	@FindBy(css="#footer-book-btn")
	private WebElement GoAir_btn_BottomOptionsBar_BookFlights;
	@FindBy(css="#footer-check-in-btn")
	private WebElement GoAir_btn_BottomOptionsBar_WebCheckIn;
	@FindBy(css="#manage-booking-btn")
	private WebElement GoAir_btn_BottomOptionsBar_ManageBooking;
	@FindBy(css="#flight-status-btn")
	private List<WebElement> GoAir_lst_btn_BottomOptionsBar_FlightStatus_or_FlightSchedule;
	@FindBy(css="#route-map-btn")
	private WebElement GoAir_btn_BottomOptionsBar_RouteMap;
	
	// elements under Web check in tab
	@FindBy(id = "txtLastNameCheckinsearchBoxUserControlCheckinBox")
	private WebElement GoAir_txtbox_WebCheckIn_LastName;
	@FindBy(id = "pnrCheckinsearchBoxUserControlCheckinBox")
	private WebElement GoAir_txtbox_WebCheckIn_PNRnumber;
	@FindBy(id = "acceptTermssearchBoxUserControlCheckinBox")
	private WebElement GoAir_tickbox_WebCheckIn_PermissionBox;
	@FindBy(id = "btnLogIn")
	private WebElement GoAir_btn_WebCheckIn_Login;
	@FindBy(css="div[class='divError']")
    private WebElement GoAir_labl_WebCheckIn_Error;
	
	// elements under manage booking tab
	@FindBy(id = "txtLastNameManagesearchBoxUserControlManageBox")
	private WebElement GoAir_txtbox_ManageBooking_LastName;
	@FindBy(id = "pnrManagesearchBoxUserControlManageBox")
	private WebElement GoAir_txtbox_ManageBooking_PNRnumber;
	@FindBy(css="input[value='Retrieve booking']")
	private List<WebElement> GoAir_lst_btn_ManageBooking_RetrieveBooking;
	@FindBy(css="div[style*='red']")
    private WebElement GoAir_labl_ManageBooking_Error;
	

	// elements under flight status tab
	@FindBy(id = "flightDateSelect")
	private WebElement GoAir_drpdwn_FlightStatus_FlightDate;
	@FindBy(css="#flight-destinationtype-searchBoxUserControlFlightStatuspart>label")
    private List<WebElement> GoAir_lst_btn_FlightStatus_DepartureArrival;
    @FindBy(css=".data-flightid-searchBoxUserControlFlightStatuspart")
    private WebElement GoAir_btn_FlightStatus_FlightNumber;
    @FindBy(css=".data-bycity-searchBoxUserControlFlightStatuspart")
    private WebElement GoAir_btn_FlightStatus_ByCity;
    @FindBy(id = "Criteria_FlightId")
	private List<WebElement> GoAir_lst_drpdwn_FlightStatus_FlightCode;
    @FindBy(css="input[value='SHOW ALL']")
    private WebElement GoAir_btn_FlightStatus_ShowAll;
    @FindBy(css=".fixed-footer-submit-button.submit-button")
    private List<WebElement> GoAir_lst_btn_FlightStatus_ShowAll_Inside_FlightStatus_Tab;
    @FindBy(css=".flight-status")
    private WebElement GoAir_labl_FlightStatus_Actual;
    
    
	// home page elements / attributes
	@FindBy(className = "slide,slide-offer")
	private List<WebElement> GoAir_lst_Slider_Fare_Offers_Verify_Total_Elements;
	@FindBy(css="img[src='/upload/Banners/Excess-Baggage.jpg']")
	private WebElement GoAir_img_Carry_More_for_Less; 
	@FindBy(css="img[src='/upload/Banners/prebook.png']")
	private WebElement GoAir_img_Pre_Book_Preferred_Seats;
	@FindBy(css="a[href='/bottom-menu/smart-sme']")
	private WebElement GoAir_btn_Smart_SME;

	// other tabs below smart SME
	@FindBy(linkText = "Air Inclusive Deals")
	private WebElement GoAir_tab_Air_Inclusive_Deals;
	@FindBy(linkText = "Honeymoon")
	private WebElement GoAir_tab_Honeymoon;
	@FindBy(linkText = "Hill Station")
	private WebElement GoAir_tab_Hill_Station;
	@FindBy(linkText = "Popular")
	private WebElement GoAir_tab_Popular;
	@FindBy(linkText = "Beaches")
	private WebElement GoAir_tab_Beaches;

	// elements for various GUI options
	@FindBy(id = "rdRoundTripsearchBoxUserControlCriteriaBox")
	private List<WebElement> GoAir_lst_btn_BookFlights_Return;
	@FindBy(id = "rdOnewaysearchBoxUserControlCriteriaBox")
	private List<WebElement> GoAir_lst_btn_BookFlights_OneWay;
	@FindBy(id = "rdOnewaysearchBoxUserControlCriteriaBox")
	private WebElement GoAir_btn_BookFlights_OneWay;
	@FindBy(css = ".group>a>span")
	private List<WebElement> GoAir_lst_tab_BookFlights_lst_labl_GroupBooking;
	@FindBy(id = "adultssearchBoxUserControlCriteriaBox")
	private WebElement GoAir_tab_BookFlights_txtbox_AdultPersonCount;
	@FindBy(id = "childrensearchBoxUserControlCriteriaBox")
	private WebElement GoAir_tab_BookFlights_txtbox_ChildrenPersonCount;
	@FindBy(id = "infantssearchBoxUserControlCriteriaBox")
	private WebElement GoAir_tab_BookFlights_txtbox_InfantCount;
	@FindBy(id = "promo-selectsearchBoxUserControlCriteriaBox")
	private WebElement GoAir_tab_BookFlights_drpdwn_SelectPromo;
	@FindBy(css = ".btn.btn-submit")
	private WebElement GoAir_tab_BookFlights_btn_BookNow;
	@FindBy(id = "departureCitysearchBoxUserControlCriteriaBox")
	private WebElement GoAir_tab_BookFlights_drpdwn_DepartCity;
	@FindBy(id = "toCitysearchBoxUserControlCriteriaBox")
	private WebElement GoAir_tab_BookFlights_drpdwn_ArriveCity;
	@FindBy(className = "arrow-up")
	private List<WebElement> GoAir_lst_tab_BookFlights_lst_UpArrows;
	@FindBy(className = "arrow-down")
	private List<WebElement> GoAir_lst_tab_BookFlights_lst_DownArrows;
	@FindBy(css = "#departureDatesearchBoxUserControlCriteriaBox")
	private WebElement GoAir_txtbox_BookFlights_DepartDate;
	@FindBy(css = "#returnDatesearchBoxUserControlCriteriaBox")
	private WebElement GoAir_txtbox_BookFlights_ArriveDate;
	@FindBy(css = ".ui-datepicker-trigger")
	private List<WebElement> GoAir_tab_BookFlights_DateIcon;
	@FindBy(className = "ui-datepicker-month")
	private WebElement GoAir_drpdwn_BookFlights_DepartDate_Month;
	@FindBy(className = "ui-datepicker-year")
	private WebElement GoAir_drpdwn_BookFlights_DepartDate_Year;
	private String strJunkElementId = "xxxxxxxxxxxxxjunk_elementxxxxxxxxxxxxxx";
	
	// other links
    @FindBy(css = ".top-bar>ul>li")
    private List <WebElement> GoAir_lst_labl_CustomerCareTotalLine;
    @FindBy(css = ".footer-col>div>p")
    private List <WebElement> GoAir_lst_labl_SupportFunctionality;
    
    // elements for offers sliders
    @FindBy(css = ".slide.slide-offer>h2>small")
	private List<WebElement> GoAir_lst_labl_OfferText_Currancy;
    @FindBy(css = ".slide.slide-offer>h2")
    private List<WebElement> GoAir_lst_labl_OfferText_Fare_Text;
    @FindBy(css = ".slide.slide-offer>h4")
    private List<WebElement> GoAir_lst_labl_OfferText_Fare_Route;
    @FindBy(css = ".slide.slide-offer>p")
    private List<WebElement> GoAir_lst_labl_OfferText_Fare_PromotionalFare;
    @FindBy(css = ".slide.slide-offer")
	private List<WebElement> GoAir_lst_btn_OfferText_BookNow;

    // elements for honeymoon section
    @FindBy(css = "div[class='tf-cndl-pLst tf-clearfix tf-cndl-pLst-DESTINATIONS']")
	private List<WebElement> GoAir_lst_lnk_DealsSection;

    
    // element for spport functionality
    @FindBy(css = "marquee[style*='color']")
	private WebElement GoAir_labl_Checking_Counter_Advice;

    // social plugin details - facebook
    @FindBy(css="a[href='https://www.facebook.com/GoAir']")
    private WebElement GoAir_SocialPlugin_Facebook_lnk;
    @FindBy(css="img[src='/upload/Icon/fb_icon_original.jpg']")
    private WebElement GoAir_SocialPlugin_Facebook_img;
   
    // social plugin details - twitter
    @FindBy(css="a[href='https://twitter.com/goairlinesindia']")
    private WebElement GoAir_SocialPlugin_Twitter_lnk;
    @FindBy(css="img[src='/upload/Icon/twit_icon_original.jpg']")
    private WebElement GoAir_SocialPlugin_Twitter_img;
					
    // social plugin details - googleplus
    @FindBy(css="a[href='https://plus.google.com/+goair/posts']")
    private WebElement GoAir_SocialPlugin_Googleplus_lnk;
    @FindBy(css="img[src='/upload/Icon/google_plus.png']")
    private WebElement GoAir_SocialPlugin_Googleplus_img;
						   
    // social plugin details - instagram
    @FindBy(css="a[href='https://www.instagram.com/goairlinesindia/']")
    private WebElement GoAir_SocialPlugin_Instagram_lnk;
    @FindBy(css="img[src='/upload/Icon/instagram_new_original.jpg']")
    private WebElement GoAir_SocialPlugin_Instagram_img;

    // other elements
	@FindBy(css = "zzzzzzzzzzzzzzzzzzzzz")
	private WebElement GoAir_SomeJunkElement;

    
    
    // every page object has it's local private wait with fixed 10 sec delay
	private WebDriverWait objWait 				= new WebDriverWait(this.objWebDriverAbstract, 10);
	private WebDriverWait objWaitShort 			= new WebDriverWait(this.objWebDriverAbstract, 4);
	private WebDriverWait objWaitOfferSlider 	= new WebDriverWait(this.objWebDriverAbstract, 7);
	
    
	public boolean GoAir_validate_This_Element(String strThisElement){

		Actions GoAir_actn_bldr_HomePage 				= new Actions(this.objWebDriverAbstract);
		boolean bGoAir_ThisElementValidationStatus 		= false;
		
		switch (strThisElement){
			case "btn__HOME":
			case "btn__Home":
				if ( GoAir_btn_HomePage.isDisplayed()    )     	bGoAir_ThisElementValidationStatus = true;
				break;
			case "hover__Plan my trip":
				if ( GoAir_hover_Plan_my_trip.isDisplayed()    ){
					    // perform mouse hover
						GoAir_actn_bldr_HomePage.moveToElement(GoAir_hover_Plan_my_trip)
												.build()
												.perform();
					bGoAir_ThisElementValidationStatus = true;
				}
				break;
			case "btn__GoBusiness":
				if ( GoAir_btn_GoBusiness.isDisplayed()    )     		bGoAir_ThisElementValidationStatus = true;
				break;	
			case "btn__GoHolidays":
				if ( GoAir_btn_GoHolidays.isDisplayed()    )     		bGoAir_ThisElementValidationStatus = true;
				break;	
			case "btn__Careers":
				if ( GoAir_btn_Careers.isDisplayed()    )     		 	bGoAir_ThisElementValidationStatus = true;
				break;
			case "hover__Promotions":
				if ( GoAir_hover_Promotions.isDisplayed()    ){
					    // perform mouse hover
						GoAir_actn_bldr_HomePage.moveToElement(GoAir_hover_Promotions)
												.build()
												.perform();
					bGoAir_ThisElementValidationStatus = true;
				}
				break;
			case "hover__Services":
				if ( GoAir_hover_Services.isDisplayed()    ){
					    // perform mouse hover
						GoAir_actn_bldr_HomePage.moveToElement(GoAir_hover_Services)
												.build()
												.perform();
					bGoAir_ThisElementValidationStatus = true;
				}
				break;
			case "hover__About Us":
				if ( GoAir_hover_About_Us.isDisplayed()    ){
					    // perform mouse hover
						GoAir_actn_bldr_HomePage.moveToElement(GoAir_hover_About_Us)
												.build()
												.perform();
					bGoAir_ThisElementValidationStatus = true;
				}
				break;
			case "btn__Partner Login":
				if ( GoAir_btn_Partner_Login.isDisplayed()    )     	bGoAir_ThisElementValidationStatus = true;
				break;

			case "slider__Images":
				if ( GoAir_Slider_Images_Verify() )        				bGoAir_ThisElementValidationStatus = true;
				break;
			case "btn__Slider Selector":
				if ( GoAir_MainPage_Slider_ButtonVerify() )   			bGoAir_ThisElementValidationStatus = true;
				break;

			case "tab__Book Flights":
				if ( GoAir_tab_Book_Flights.isDisplayed() )        		bGoAir_ThisElementValidationStatus = true;
				break;
			case "tab__Web Check-in":
				if ( GoAir_tab_Web_Check_in.isDisplayed() )        		bGoAir_ThisElementValidationStatus = true;
				break;
			case "tab__Manage Booking":
				if ( GoAir_tab_Manage_Booking.isDisplayed() )        	bGoAir_ThisElementValidationStatus = true;
				break;
			case "tab__Flight Status":
				if ( GoAir_tab_Flight_Status.isDisplayed() )        	bGoAir_ThisElementValidationStatus = true;
				break;
			case "tab__Flight Schedule":
				if ( GoAir_tab_Flight_Schedule.isDisplayed() )        	bGoAir_ThisElementValidationStatus = true;
				break;
			case "tab__Route Map":
				if ( GoAir_tab_Route_Map.isDisplayed() )        		bGoAir_ThisElementValidationStatus = true;
				break;

			case "slider__fare offer sliders":
				if ( GoAir_Slider_Fare_Offers_Verify() )        		bGoAir_ThisElementValidationStatus = true;
				break;
			case "img__Carry More for less":
				if ( GoAir_img_Carry_More_for_Less.isDisplayed() )    	bGoAir_ThisElementValidationStatus = true;
				break; 
			case "img__Pre book preferred seats":
				if ( GoAir_img_Pre_Book_Preferred_Seats.isDisplayed() ) bGoAir_ThisElementValidationStatus = true;
				break;
			case "btn__Smart SME":
				if ( GoAir_btn_Smart_SME.isDisplayed() )        		bGoAir_ThisElementValidationStatus = true;
				break;

			case "tab__Air Inclusive Deals":
				if ( GoAir_tab_Air_Inclusive_Deals.isDisplayed() ){
					 GoAir_tab_Air_Inclusive_Deals.click(); 			bGoAir_ThisElementValidationStatus = true;
				}
				break;
			case "tab__Honeymoon":
				if ( GoAir_tab_Honeymoon.isDisplayed() ){
					 GoAir_tab_Honeymoon.click(); 						bGoAir_ThisElementValidationStatus = true;
				}
				break;
			case "tab__Hill Station":
				if ( GoAir_tab_Hill_Station.isDisplayed() ){
					 GoAir_tab_Hill_Station.click(); 					bGoAir_ThisElementValidationStatus = true;
				}
				break;
			case "tab__Popular":
				if ( GoAir_tab_Popular.isDisplayed() ){
					 GoAir_tab_Popular.click(); 						bGoAir_ThisElementValidationStatus = true;
				}
				break;
			case "tab__Beaches":
				if ( GoAir_tab_Beaches.isDisplayed() ){
					 GoAir_tab_Beaches.click(); 						bGoAir_ThisElementValidationStatus = true;
				}
				break;

			case "labl__GoAir Customer Care":
				if ( GoAir_lst_labl_CustomerCareTotalLine.get(0).getText().contains("GoAir Customer Care"))
																		bGoAir_ThisElementValidationStatus = true;
				break;
			case "labl__Call: 092 - 2322 - 2111/020 - 2566 - 2111":
				if ( GoAir_lst_labl_CustomerCareTotalLine.get(0).getText().contains("Call: 092 - 2322 - 2111/020 - 2566 - 2111"))      		
																		bGoAir_ThisElementValidationStatus = true;
				break;
			case "labl__Fog Helpline:":
				if ( GoAir_lst_labl_CustomerCareTotalLine.get(0).getText().contains("Fog Helpline:"))      		
																		bGoAir_ThisElementValidationStatus = true;
				break;
			case "labl__020 - 6689 - 5050":
				if ( GoAir_lst_labl_CustomerCareTotalLine.get(0).getText().contains("020 - 6689 - 5050"))      		
																		bGoAir_ThisElementValidationStatus = true;
				break;
//			case "":
//				if ( .isDisplayed() )      						bGoAir_ThisElementValidationStatus = true;
//				break;
	    	default:
	    		break;
		}
		
		
		GoAir_actn_bldr_HomePage = null;
		return bGoAir_ThisElementValidationStatus;
		
	}
	
	public boolean GoAir_Validate_HomePageGUIElements_for_BookFlight(String strGUIOptionListForBookFlights){

		boolean bGoAir_ThisElementValidationStatus 		= true;
		boolean bSpportedElementFound					= false;
		
		if (strGUIOptionListForBookFlights.contains("btn__Return")){
			bSpportedElementFound = true;
			if (  GoAir_lst_btn_BookFlights_Return.size() == 0) {
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "btn__Return");
				System.out.println("ERROR:    Following element not found: " + "btn__Return");
				bGoAir_ThisElementValidationStatus = false;}
		}
		if (strGUIOptionListForBookFlights.contains("btn__One way")){
			bSpportedElementFound = true;
			if (  GoAir_lst_btn_BookFlights_OneWay.size() == 0) {
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "btn__One way");
				System.out.println("ERROR:    Following element not found: " + "btn__One way");
				bGoAir_ThisElementValidationStatus = false;}
		}		
		if (strGUIOptionListForBookFlights.contains("labl__Group bookings")){
			bSpportedElementFound = true;
			if (!  GoAir_lst_tab_BookFlights_lst_labl_GroupBooking.get(0).isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "labl__Group bookings");
				System.out.println("ERROR:    Following element not found: " + "labl__Group bookings");
				bGoAir_ThisElementValidationStatus = false;}
		}
		if (strGUIOptionListForBookFlights.contains("txtbox__Adult count")){
			bSpportedElementFound = true;
			if (!  GoAir_tab_BookFlights_txtbox_AdultPersonCount.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "txtbox__Adult count");
				System.out.println("ERROR:    Following element not found: " + "txtbox__Adult count");
				bGoAir_ThisElementValidationStatus = false;}
			else{
				// send some dummy person count
				GoAir_tab_BookFlights_txtbox_AdultPersonCount.sendKeys("2");
			}
		}
		if (strGUIOptionListForBookFlights.contains("txtbox__Children count")){
			bSpportedElementFound = true;
			if (!  GoAir_tab_BookFlights_txtbox_ChildrenPersonCount.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "txtbox__Children count");
				System.out.println("ERROR:    Following element not found: " + "txtbox__Children count");
				bGoAir_ThisElementValidationStatus = false;}
			else{
				// send some dummy person count
				GoAir_tab_BookFlights_txtbox_ChildrenPersonCount.sendKeys("2");	
			}
		}
		if (strGUIOptionListForBookFlights.contains("txtbox__Infant count")){
			bSpportedElementFound = true;
			if (!  GoAir_tab_BookFlights_txtbox_InfantCount.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "txtbox__Infant count");
				System.out.println("ERROR:    Following element not found: " + "txtbox__Infant count");
				bGoAir_ThisElementValidationStatus = false;}
			else{
				// send some dummy person count
				GoAir_tab_BookFlights_txtbox_InfantCount.sendKeys("2");	
			}
		}
		if (strGUIOptionListForBookFlights.contains("drpdwn__Select promo")){
			bSpportedElementFound = true;
			if (!  GoAir_tab_BookFlights_drpdwn_SelectPromo.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "drpdwn__Select promo");
				System.out.println("ERROR:    Following element not found: " + "drpdwn__Select promo");
				bGoAir_ThisElementValidationStatus = false;}
			else{
				// click and unclick the same
				GoAir_tab_BookFlights_drpdwn_SelectPromo.click();
				GoAir_tab_BookFlights_drpdwn_SelectPromo.click();	
			}
		}
		if (strGUIOptionListForBookFlights.contains("btn__Book Now")){
			bSpportedElementFound = true;
			if (!  GoAir_tab_BookFlights_btn_BookNow.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "btn__Book Now");
				System.out.println("ERROR:    Following element not found: " + "btn__Book Now");
				bGoAir_ThisElementValidationStatus = false;
			}
		}
		if (strGUIOptionListForBookFlights.contains("drpdwn__From city")){
			bSpportedElementFound = true;
			if (!  GoAir_tab_BookFlights_drpdwn_DepartCity.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "drpdwn__From city");
				System.out.println("ERROR:    Following element not found: " + "drpdwn__From city");
				bGoAir_ThisElementValidationStatus = false;}
			else{
				// click and unclick the same
				GoAir_tab_BookFlights_drpdwn_DepartCity.click();
				GoAir_tab_BookFlights_drpdwn_DepartCity.click();
			}
		}
		if (strGUIOptionListForBookFlights.contains("drpdwn__To city")){
			bSpportedElementFound = true;
			if (!  GoAir_tab_BookFlights_drpdwn_ArriveCity.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "drpdwn__To city");
				System.out.println("ERROR:    Following element not found: " + "drpdwn__To city");
				bGoAir_ThisElementValidationStatus = false;}
			else{
				// click and unclick the same
				GoAir_tab_BookFlights_drpdwn_ArriveCity.click();
				GoAir_tab_BookFlights_drpdwn_ArriveCity.click();
			}
		}		
		if (strGUIOptionListForBookFlights.contains("btn__Adult count arrows")){
			bSpportedElementFound = true;
			if (!  (GoAir_lst_tab_BookFlights_lst_UpArrows.get(0).isDisplayed() && GoAir_lst_tab_BookFlights_lst_DownArrows.get(0).isDisplayed())){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "btn__Adult count arrows");
				System.out.println("ERROR:    Following element not found: " + "btn__Adult count arrows");
				bGoAir_ThisElementValidationStatus = false;}
			else{
				// click and unclick the same 
				GoAir_tab_BookFlights_txtbox_AdultPersonCount.sendKeys("2");
				GoAir_lst_tab_BookFlights_lst_UpArrows.get(0).click() ;	
			}
		}
		if (strGUIOptionListForBookFlights.contains("btn__Children count arrows")){
			bSpportedElementFound = true;
			if (!  (GoAir_lst_tab_BookFlights_lst_UpArrows.get(1).isDisplayed() && GoAir_lst_tab_BookFlights_lst_DownArrows.get(1).isDisplayed())){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "btn__Children count arrows");
				System.out.println("ERROR:    Following element not found: " + "btn__Children count arrows");
				bGoAir_ThisElementValidationStatus = false;}
			else{
				// click and unclick the same 
				GoAir_tab_BookFlights_txtbox_ChildrenPersonCount.sendKeys("2");
				GoAir_lst_tab_BookFlights_lst_UpArrows.get(1).click() ;	
			}
		}
		if (strGUIOptionListForBookFlights.contains("btn__Infant count arrows")){
			bSpportedElementFound = true;
			if (!  (GoAir_lst_tab_BookFlights_lst_UpArrows.get(2).isDisplayed() && GoAir_lst_tab_BookFlights_lst_DownArrows.get(2).isDisplayed())){

				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "btn__Infant count arrows");
				System.out.println("ERROR:    Following element not found: " + "btn__Infant count arrows");
				bGoAir_ThisElementValidationStatus = false;}
			else{
				// click and unclick the same 
				GoAir_tab_BookFlights_txtbox_InfantCount.sendKeys("2");
				GoAir_lst_tab_BookFlights_lst_UpArrows.get(2).click() ;	
			}
		}
		if (strGUIOptionListForBookFlights.contains("drpdwn__Depart date")){
			bSpportedElementFound = true;
			if (!  GoAir_tab_BookFlights_DateIcon.get(0).isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "drpdwn__Depart date");
				System.out.println("ERROR:    Following element not found: " + "drpdwn__Depart date");
				bGoAir_ThisElementValidationStatus = false;}
			else{
				// click and unclick the same
				GoAir_tab_BookFlights_DateIcon.get(0).click() ;	
				GoAir_tab_BookFlights_DateIcon.get(0).click() ;	
			}
		}
		if (strGUIOptionListForBookFlights.contains("drpdwn__Arrive date")){
			bSpportedElementFound = true;
			if (!  GoAir_tab_BookFlights_DateIcon.get(0).isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "drpdwn__Arrive date");
				System.out.println("ERROR:    Following element not found: " + "drpdwn__Arrive date");
				bGoAir_ThisElementValidationStatus = false;}
			else{
				// click and unclick the same
				GoAir_tab_BookFlights_DateIcon.get(1).click() ;	
				GoAir_tab_BookFlights_DateIcon.get(1).click() ;	
			}
		}
		if (strGUIOptionListForBookFlights.contains("special__from city name list")){
			bSpportedElementFound = true;
			if (!  GoAir_tab_BookFlights_drpdwn_DepartCity.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "special__from city name list");
				System.out.println("ERROR:    Following element not found: " + "special__from city name list");
				bGoAir_ThisElementValidationStatus = false;}
			else{
				// click on from city drop down and count number of options
				Select objSelectFromCityList = new Select(GoAir_tab_BookFlights_drpdwn_DepartCity);
				System.out.println("DEBUG:    Following number of options found for from city list : " +  objSelectFromCityList.getOptions().size());
			}
		}
		if (strGUIOptionListForBookFlights.contains("special__to city name list")){
			bSpportedElementFound = true;
			if (!  GoAir_tab_BookFlights_drpdwn_ArriveCity.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "special__to city name list");
				System.out.println("ERROR:    Following element not found: " + "special__to city name list");
				bGoAir_ThisElementValidationStatus = false;}
			else{
				// click on to city drop down and count number of options
				Select objSelectToCityList = new Select(GoAir_tab_BookFlights_drpdwn_ArriveCity);
				System.out.println("DEBUG:    Following number of options found for to city list : " +  objSelectToCityList.getOptions().size());
			}
		}
		if (strGUIOptionListForBookFlights.contains("special__select promo list")){
			bSpportedElementFound = true;
			if (!  GoAir_tab_BookFlights_drpdwn_SelectPromo.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "special__select promo list");
				System.out.println("ERROR:    Following element not found: " + "special__select promo list");
				bGoAir_ThisElementValidationStatus = false;}
			else{
				// click on promo list drop down and count number of options
				Select objSelectPromo = new Select(GoAir_tab_BookFlights_drpdwn_SelectPromo);
				System.out.println("DEBUG:    Following number of options found for promo list: " +  objSelectPromo.getOptions().size());
			}
		}
		if (strGUIOptionListForBookFlights.contains("special__select promo list")){
			bSpportedElementFound = true;
			if (!  GoAir_tab_BookFlights_drpdwn_SelectPromo.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "special__select promo list");
				System.out.println("ERROR:    Following element not found: " + "special__select promo list");
				bGoAir_ThisElementValidationStatus = false;}
			else{
				// click on promo list drop down and count number of options
				Select objSelectPromo = new Select(GoAir_tab_BookFlights_drpdwn_SelectPromo);
				System.out.println("DEBUG:    Following number of options found for promo list: " +  objSelectPromo.getOptions().size());
			}
		}
		if (strGUIOptionListForBookFlights.contains("special__select promo list")){
			bSpportedElementFound = true;
			if (!  GoAir_tab_BookFlights_drpdwn_SelectPromo.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "special__select promo list");
				System.out.println("ERROR:    Following element not found: " + "special__select promo list");
				bGoAir_ThisElementValidationStatus = false;}
			else{
				// click on promo list drop down and count number of options
				Select objSelectPromo = new Select(GoAir_tab_BookFlights_drpdwn_SelectPromo);
				System.out.println("DEBUG:    Following number of options found for promo list: " +  objSelectPromo.getOptions().size());
			}
		}
		if (strGUIOptionListForBookFlights.contains("special__calender depart date")){
			bSpportedElementFound = true;
			if (!  GoAir_tab_BookFlights_DateIcon.get(0).isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "special__calender depart date");
				System.out.println("ERROR:    Following element not found: " + "special__calender depart date");
				bGoAir_ThisElementValidationStatus = false;}
			else{
				// click on calender depart date element
				GoAir_tab_BookFlights_DateIcon.get(0).click();
				// from date drop down and count number of options
				Select objSelectDepartDate_Month_Year = null;
				objSelectDepartDate_Month_Year = new Select(GoAir_drpdwn_BookFlights_DepartDate_Month);
				System.out.println("DEBUG:    Following number of options found for calender depart date _MONTH_ : " +  objSelectDepartDate_Month_Year.getOptions().size());
				objSelectDepartDate_Month_Year = new Select(GoAir_drpdwn_BookFlights_DepartDate_Year);
				System.out.println("DEBUG:    Following number of options found for calender depart date _YEAR_ : " +  objSelectDepartDate_Month_Year.getOptions().size());
			}
		}
		if (strGUIOptionListForBookFlights.contains("special__calender arrive date")){
			bSpportedElementFound = true;
			if (!  GoAir_tab_BookFlights_DateIcon.get(0).isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "special__calender arrive date");
				System.out.println("ERROR:    Following element not found: " + "special__calender arrive date");
				bGoAir_ThisElementValidationStatus = false;}
			else{
				// click on calender arrive date element
				GoAir_tab_BookFlights_DateIcon.get(1).click();
				// from date drop down and count number of options
				Select objSelectDepartDate_Month_Year = null;
				objSelectDepartDate_Month_Year = new Select(GoAir_drpdwn_BookFlights_DepartDate_Month);
				System.out.println("DEBUG:    Following number of options found for calender depart date _MONTH_ : " +  objSelectDepartDate_Month_Year.getOptions().size());
				objSelectDepartDate_Month_Year = new Select(GoAir_drpdwn_BookFlights_DepartDate_Year);
				System.out.println("DEBUG:    Following number of options found for calender depart date _YEAR_ : " +  objSelectDepartDate_Month_Year.getOptions().size());
			}
		}



		
		
		
		if (!bSpportedElementFound){
			objSoftAssert.fail("ERROR:    Atleast one unsuported element NOT found in following category: " + "Book Flights");
			System.out.println("ERROR:    Atleast one unsuported element NOT found in following category: " + "Book Flights");
			return bSpportedElementFound;
		}
		if (bGoAir_ThisElementValidationStatus) System.out.println("RESULT::PASS");
		else{
			System.out.println("RESULT::FAIL");
			objSoftAssert.fail("ERROR:    Atleast one supported element NOT found in following category: " + "Book Flights");
			System.out.println("ERROR:    Atleast one supported element NOT found in following category: " + "Book Flights");
		}		

		
		return bGoAir_ThisElementValidationStatus;
		
	}
	
	public boolean GoAir_Validate_HomePageGUIElements_for_WebCheckIn(String strGUIOptionListForWebCheckIn){

		boolean bGoAir_ThisElementValidationStatus 		= true;
		boolean bSpportedElementFound					= false;

		// click on Web Check in tab to proceed
		GoAir_tab_Web_Check_in.click();
		
		if (strGUIOptionListForWebCheckIn.contains("txtbox__Last name")){
			bSpportedElementFound = true;
			if (!  GoAir_txtbox_WebCheckIn_LastName.isDisplayed()) {
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "txtbox__Last name");
				System.out.println("ERROR:    Following element not found: " + "txtbox__Last name");
				bGoAir_ThisElementValidationStatus = false;}
			else{
				// enter some dummy text
				GoAir_txtbox_WebCheckIn_LastName.sendKeys("dummy name");	}
		}
		if (strGUIOptionListForWebCheckIn.contains("txtbox__PNR")){
			bSpportedElementFound = true;
			if (!  GoAir_txtbox_WebCheckIn_PNRnumber.isDisplayed()) {
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "txtbox__PNR");
				System.out.println("ERROR:    Following element not found: " + "txtbox__PNR");
				bGoAir_ThisElementValidationStatus = false;}
			else{
				 // enter some dummy text
				GoAir_txtbox_WebCheckIn_PNRnumber.sendKeys("A0B1C2");	}
		}		
		if (strGUIOptionListForWebCheckIn.contains("tickbox__Permission box")){
			bSpportedElementFound = true;
			if (!  GoAir_tickbox_WebCheckIn_PermissionBox.isDisplayed()) {
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "tickbox__Permission box");
				System.out.println("ERROR:    Following element not found: " + "tickbox__Permission box");
				bGoAir_ThisElementValidationStatus = false;}
			else{
				 // tick and untick the same
				GoAir_tickbox_WebCheckIn_PermissionBox.click();
				GoAir_tickbox_WebCheckIn_PermissionBox.click();	}
		}
		if (strGUIOptionListForWebCheckIn.contains("btn__Login")){
			bSpportedElementFound = true;
			if (!  GoAir_btn_WebCheckIn_Login.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "btn__Login");
				System.out.println("ERROR:    Following element not found: " + "btn__Login");
				bGoAir_ThisElementValidationStatus = false;}
		}
		
		
		
		
		
		if (!bSpportedElementFound){
			objSoftAssert.fail("ERROR:    Atleast one unsuported element NOT found in following category: " + "Book Flights");
			System.out.println("ERROR:    Atleast one unsuported element NOT found in following category: " + "Book Flights");
			return bSpportedElementFound;
		}
		if (bGoAir_ThisElementValidationStatus) System.out.println("RESULT::PASS");
		else{
			System.out.println("RESULT::FAIL");
			objSoftAssert.fail("ERROR:    Atleast one supported element NOT found in following category: " + "Book Flights");
			System.out.println("ERROR:    Atleast one supported element NOT found in following category: " + "Book Flights");
		}		

		
		return bGoAir_ThisElementValidationStatus;
		
	}

	public boolean GoAir_Validate_HomePageGUIElements_for_ManageBooking(String strGUIOptionListForWebCheckIn){

		boolean bGoAir_ThisElementValidationStatus 		= true;
		boolean bSpportedElementFound					= false;
		
		// click on manage booking tab to proceed
		GoAir_tab_Manage_Booking.click();
		
		if (strGUIOptionListForWebCheckIn.contains("txtbox__Last name")){
			bSpportedElementFound = true;
			if (!  GoAir_txtbox_ManageBooking_LastName.isDisplayed()) {
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "txtbox__Last name");
				System.out.println("ERROR:    Following element not found: " + "txtbox__Last name");
				bGoAir_ThisElementValidationStatus = false;}
			else{
				// enter some dummy text
				GoAir_txtbox_ManageBooking_LastName.sendKeys("dummy name");	}
		}
		if (strGUIOptionListForWebCheckIn.contains("txtbox__PNR")){
			bSpportedElementFound = true;
			if (!  GoAir_txtbox_ManageBooking_PNRnumber.isDisplayed()) {
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "txtbox__PNR");
				System.out.println("ERROR:    Following element not found: " + "txtbox__PNR");
				bGoAir_ThisElementValidationStatus = false;}
			else{
				 // enter some dummy text
				GoAir_txtbox_ManageBooking_PNRnumber.sendKeys("A0B1C2");	}
		}		
		if (strGUIOptionListForWebCheckIn.contains("btn__Retrieve booking")){
			bSpportedElementFound = true;
			if (!  GoAir_lst_btn_ManageBooking_RetrieveBooking.get(0).isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "btn__Retrieve booking");
				System.out.println("ERROR:    Following element not found: " + "btn__Retrieve booking");
				bGoAir_ThisElementValidationStatus = false;}
		}
		
		
		
		
		
		if (!bSpportedElementFound){
			objSoftAssert.fail("ERROR:    Atleast one unsuported element NOT found in following category: " + "Web Check-In");
			System.out.println("ERROR:    Atleast one unsuported element NOT found in following category: " + "Web Check-In");
			return bSpportedElementFound;
		}
		if (bGoAir_ThisElementValidationStatus) System.out.println("RESULT::PASS");
		else{
			System.out.println("RESULT::FAIL");
			objSoftAssert.fail("ERROR:    Atleast one supported element NOT found in following category: " + "Web Check-In");
			System.out.println("ERROR:    Atleast one supported element NOT found in following category: " + "Web Check-In");
		}
		
		return bGoAir_ThisElementValidationStatus;
		
	}
	
	public boolean GoAir_Validate_HomePageGUIElements_for_FlightStatus(String strGUIOptionListForWebCheckIn){

		boolean bGoAir_ThisElementValidationStatus 		= true;
		boolean bSpportedElementFound					= false;

		// click on flight status tab to proceed
		GoAir_tab_Flight_Status.click();
		
		if (strGUIOptionListForWebCheckIn.contains("drpdwn__Flight date")){
			bSpportedElementFound = true;
			if (!  GoAir_drpdwn_FlightStatus_FlightDate.isDisplayed()) {
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "btn__Departure");
				System.out.println("ERROR:    Following element not found: " + "drpdwn__Flight date");
				bGoAir_ThisElementValidationStatus = false;}
			else{
				// click on flight date drop down and count number of options
				Select objSelectFlightDate = new Select(GoAir_drpdwn_FlightStatus_FlightDate);
				System.out.println("DEBUG:    Following number of options found for flight date list : " +  objSelectFlightDate.getOptions().size());
			}
		}
		if (strGUIOptionListForWebCheckIn.contains("btn__Departure")){
			bSpportedElementFound = true;
			if (!  GoAir_lst_btn_FlightStatus_DepartureArrival.get(0).isDisplayed()) {
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "btn__Departure");
				System.out.println("ERROR:    Following element not found: " + "btn__Departure");
				bGoAir_ThisElementValidationStatus = false;}
		}
		if (strGUIOptionListForWebCheckIn.contains("btn__Arrival")){
			bSpportedElementFound = true;
			if (!  GoAir_lst_btn_FlightStatus_DepartureArrival.get(1).isDisplayed()) {
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "btn__Arrival");
				System.out.println("ERROR:    Following element not found: " + "btn__Arrival");
				bGoAir_ThisElementValidationStatus = false;}
		}		
		if (strGUIOptionListForWebCheckIn.contains("btn__Flight Number")){
			bSpportedElementFound = true;
			if (!  GoAir_btn_FlightStatus_FlightNumber.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "btn__Flight Number");
				System.out.println("ERROR:    Following element not found: " + "btn__Flight Number");
				bGoAir_ThisElementValidationStatus = false;}
		}
		if (strGUIOptionListForWebCheckIn.contains("btn__By City")){
			bSpportedElementFound = true;
			if (!  GoAir_btn_FlightStatus_ByCity.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "btn__By City");
				System.out.println("ERROR:    Following element not found: " + "btn__By City");
				bGoAir_ThisElementValidationStatus = false;}
		}
		if (strGUIOptionListForWebCheckIn.contains("drpdwn__Flight code")){
			bSpportedElementFound = true;
			if (!  GoAir_lst_drpdwn_FlightStatus_FlightCode.get(0).isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "drpdwn__Flight code");
				System.out.println("ERROR:    Following element not found: " + "drpdwn__Flight code");
				bGoAir_ThisElementValidationStatus = false;}
			else{
				Select objSelectFlightCode = new Select(GoAir_lst_drpdwn_FlightStatus_FlightCode.get(0) );
				System.out.println("DEBUG:    Following number of options found for flght number dropdown: " +  objSelectFlightCode.getOptions().size());
			}
		}
		if (strGUIOptionListForWebCheckIn.contains("btn__SHOW ALL")){
			bSpportedElementFound = true;
			if (!  GoAir_btn_FlightStatus_ShowAll.isDisplayed()){
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "btn__SHOW ALL");
				System.out.println("ERROR:    Following element not found: " + "btn__SHOW ALL");
				bGoAir_ThisElementValidationStatus = false;}
		}
		
		
		
		
		
		
		
		if (!bSpportedElementFound){
			objSoftAssert.fail("ERROR:    Atleast one unsuported element NOT found in following category: " + "Book Flights");
			System.out.println("ERROR:    Atleast one unsuported element NOT found in following category: " + "Book Flights");
			return bSpportedElementFound;
		}
		if (bGoAir_ThisElementValidationStatus) System.out.println("RESULT::PASS");
		else{
			System.out.println("RESULT::FAIL");
			objSoftAssert.fail("ERROR:    Atleast one supported element NOT found in following category: " + "Book Flights");
			System.out.println("ERROR:    Atleast one supported element NOT found in following category: " + "Book Flights");
		}		

		return bGoAir_ThisElementValidationStatus;		
	}
		
	public boolean GoAir_Validate_HomePageGUIElements_for_FlightScheduleOrRouteMap(String strGUIOptionListForFlightScheduleOrRouteMap){

		boolean bGoAir_ThisElementValidationStatus 		= true;
		boolean bSpportedElementFound					= false;
		
		if (strGUIOptionListForFlightScheduleOrRouteMap.contains("btn__Flight Schedule")){
			bSpportedElementFound = true;
			if (!  GoAir_tab_FlightSchedule.isDisplayed()) {
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "btn__Flight Schedule");
				System.out.println("ERROR:    Following element not found: " + "btn__Flight Schedule");
				bGoAir_ThisElementValidationStatus = false;}
		}
		if (strGUIOptionListForFlightScheduleOrRouteMap.contains("btn__Route Map")){
			bSpportedElementFound = true;
			if (!  GoAir_tab_RouteMap.isDisplayed()) {
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "btn__Route Map");
				System.out.println("ERROR:    Following element not found: " + "btn__Route Map");
				bGoAir_ThisElementValidationStatus = false;}
		}
		
		if (!bSpportedElementFound){
			objSoftAssert.fail("ERROR:    Atleast one unsuported element NOT found in following category: " + "Flight Schedule or Route Map");
			System.out.println("ERROR:    Atleast one unsuported element NOT found in following category: " + "Flight Schedule or Route Map");
			return bSpportedElementFound;
		}
		if (bGoAir_ThisElementValidationStatus) System.out.println("RESULT::PASS");
		else{
			System.out.println("RESULT::FAIL");
			objSoftAssert.fail("ERROR:    Atleast one supported element NOT found in following category: " + "Flight Schedule or Route Map");
			System.out.println("ERROR:    Atleast one supported element NOT found in following category: " + "Flight Schedule or Route Map");
		}		

		return bGoAir_ThisElementValidationStatus;		
	}
	
	public boolean GoAir_Validate_HomePageGUIElements_for_BottomOtionsBar(String strBottomOptionsBar){

		boolean bGoAir_ThisElementValidationStatus 		= true;
		boolean bSpportedElementFound					= false;
		
		if (strBottomOptionsBar.contains("btn__BOOK FLIGHTS")){
			bSpportedElementFound = true;
			if (!  GoAir_btn_BottomOptionsBar_BookFlights.isDisplayed()) {
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "btn__BOOK FLIGHTS");
				System.out.println("ERROR:    Following element not found: " + "btn__BOOK FLIGHTS");
				bGoAir_ThisElementValidationStatus = false;}
			else{
				// click and unclick the same
				GoAir_btn_BottomOptionsBar_BookFlights.click() ;	
			}
		}
		if (strBottomOptionsBar.contains("btn__WEB CHEC-IN")){
			bSpportedElementFound = true;
			if (!  GoAir_btn_BottomOptionsBar_WebCheckIn.isDisplayed()) {
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "btn__WEB CHEC-IN");
				System.out.println("ERROR:    Following element not found: " + "btn__WEB CHEC-IN");
				bGoAir_ThisElementValidationStatus = false;}
			else{
				// click and unclick the same
				GoAir_btn_BottomOptionsBar_WebCheckIn.click() ;	
			}
		}
		if (strBottomOptionsBar.contains("btn__MANAGE BOOKING")){
			bSpportedElementFound = true;
			if (!  GoAir_btn_BottomOptionsBar_ManageBooking.isDisplayed()) {
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "btn__MANAGE BOOKING");
				System.out.println("ERROR:    Following element not found: " + "btn__MANAGE BOOKING");
				bGoAir_ThisElementValidationStatus = false;}
			else{
				// click and unclick the same
				GoAir_btn_BottomOptionsBar_ManageBooking.click() ;	
			}
		}
		if (strBottomOptionsBar.contains("btn__FLIGHT STATUS")){
			bSpportedElementFound = true;
			if (!  GoAir_lst_btn_BottomOptionsBar_FlightStatus_or_FlightSchedule.get(0).isDisplayed()) {
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "btn__FLIGHT STATUS");
				System.out.println("ERROR:    Following element not found: " + "btn__FLIGHT STATUS");
				bGoAir_ThisElementValidationStatus = false;}
			else{
				// click and unclick the same
				GoAir_lst_btn_BottomOptionsBar_FlightStatus_or_FlightSchedule.get(0).click();
			}
		}
		if (strBottomOptionsBar.contains("btn__FLIGHT SCHEDULE")){
			bSpportedElementFound = true;
			if (!  GoAir_lst_btn_BottomOptionsBar_FlightStatus_or_FlightSchedule.get(1).isDisplayed()) {
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "btn__FLIGHT SCHEDULE");
				System.out.println("ERROR:    Following element not found: " + "btn__FLIGHT SCHEDULE");
				bGoAir_ThisElementValidationStatus = false;}
		}
		if (strBottomOptionsBar.contains("btn__ROUTE MAP")){
			bSpportedElementFound = true;
			if (!  GoAir_btn_BottomOptionsBar_RouteMap.isDisplayed()) {
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "btn__ROUTE MAP");
				System.out.println("ERROR:    Following element not found: " + "btn__ROUTE MAP");
				bGoAir_ThisElementValidationStatus = false;}
		}
		
		
		
		if (!bSpportedElementFound){
			objSoftAssert.fail("ERROR:    Atleast one unsuported element NOT found in following category: " + "Flight Schedule or Route Map");
			System.out.println("ERROR:    Atleast one unsuported element NOT found in following category: " + "Flight Schedule or Route Map");
			return bSpportedElementFound;
		}
		if (bGoAir_ThisElementValidationStatus) System.out.println("RESULT::PASS");
		else{
			System.out.println("RESULT::FAIL");
			objSoftAssert.fail("ERROR:    Atleast one supported element NOT found in following category: " + "Flight Schedule or Route Map");
			System.out.println("ERROR:    Atleast one supported element NOT found in following category: " + "Flight Schedule or Route Map");
		}		

		return bGoAir_ThisElementValidationStatus;		
	}	
	
	public boolean GoAir_Perform_Simple_Valid_Flight_Search_With_Default_Paramaters(String[] strArrRandomDepaartAndArriveCityNames){

		boolean bGoAir_ThisElementValidationStatus 		= true;
		Select GoAir_drpdwn_DepartCity 					= new Select(GoAir_tab_BookFlights_drpdwn_DepartCity);
		Select GoAir_drpdwn_ArriveCity 					= new Select(GoAir_tab_BookFlights_drpdwn_ArriveCity);

		System.out.println("DEBUG:    Depart city:           " + strArrRandomDepaartAndArriveCityNames[0]);
		System.out.println("DEBUG:    Arrive city:           " + strArrRandomDepaartAndArriveCityNames[1]);		
		System.out.println("DEBUG:    Flight type:           " + "One Way");
		System.out.println("DEBUG:    Flight departure date: " + GoAir_getFormattedFullDatefor_NextFriday());
		System.out.println("DEBUG:    Flight arrive date:    " + "NA");

		// click on Book Flights tab
		GoAir_tab_Book_Flights.click();
		//click on one way flight button and accept the pop up of book return ticket
		if (! GoAir_Click_OneWayFlight_and_Accept_Book_Return_Ticket_Alert()) return false;
		
		//objWait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("rdRoundTripsearchBoxUserControlCriteriaBox")));

		GoAir_drpdwn_DepartCity.selectByVisibleText(strArrRandomDepaartAndArriveCityNames[0]);
		try{objWaitShort.until(ExpectedConditions.visibilityOfElementLocated(By.id(strJunkElementId)) );}
		catch (Exception e){ /* System.out.println("DEBUG:    This exception to be ignored!"); */}  // this is to wait for depart city drop down to be ready with fresh list
		GoAir_drpdwn_ArriveCity.selectByVisibleText(strArrRandomDepaartAndArriveCityNames[1]);
		GoAir_txtbox_BookFlights_DepartDate.sendKeys(Keys.chord(Keys.CONTROL, "a") + Keys.DELETE + GoAir_getFormattedFullDatefor_NextFriday());
		
		GoAir_tab_BookFlights_btn_BookNow.click();
		try{objWait.until(ExpectedConditions.invisibilityOfElementLocated(objLocal_PageGoAirResult0InProgress.GoAir_By_img_FlightSearchInProgress));}
		catch (Exception e){System.out.println("DEBUG:    This exception to be ignored!");}

		objWait.until(ExpectedConditions.textToBePresentInElement(
				objLocal_PageGoAirResult2SelectDate.GoAir_Result2Page_CurrentStep.findElement(By.className("number")), "2"));

		return bGoAir_ThisElementValidationStatus;
	}
	
	public boolean GoAir_Perform_Simple_Valid_Flight_Search_2Way(String[] strArrRandomDepaartAndArriveCityNames){

		boolean bGoAir_ThisElementValidationStatus 		= true;
		Select GoAir_drpdwn_DepartCity 					= new Select(GoAir_tab_BookFlights_drpdwn_DepartCity);
		Select GoAir_drpdwn_ArriveCity 					= new Select(GoAir_tab_BookFlights_drpdwn_ArriveCity);

		System.out.println("DEBUG:    Depart city:           " + strArrRandomDepaartAndArriveCityNames[0]);
		System.out.println("DEBUG:    Arrive city:           " + strArrRandomDepaartAndArriveCityNames[1]);		
		System.out.println("DEBUG:    Flight type:           " + "Two Way");
		System.out.println("DEBUG:    Flight departure date: " + GoAir_getFormattedFullDatefor_NextFriday());
		System.out.println("DEBUG:    Flight arrive date:    " + GoAir_getFormattedFullDatefor_NextSunday());

		// click on Book Flights tab
		GoAir_tab_Book_Flights.click();

		GoAir_drpdwn_DepartCity.selectByVisibleText(strArrRandomDepaartAndArriveCityNames[0]);
		try{objWaitShort.until(ExpectedConditions.visibilityOfElementLocated(By.id(strJunkElementId)) );}
		catch (Exception e){ /* System.out.println("DEBUG:    This exception to be ignored!"); */}  // this is to wait for depart city drop down to be ready with fresh list
		GoAir_drpdwn_ArriveCity.selectByVisibleText(strArrRandomDepaartAndArriveCityNames[1]);
		
		GoAir_txtbox_BookFlights_DepartDate.sendKeys(Keys.chord(Keys.CONTROL, "a") + Keys.DELETE + GoAir_getFormattedFullDatefor_NextFriday());
		GoAir_txtbox_BookFlights_ArriveDate.sendKeys(Keys.chord(Keys.CONTROL, "a") + Keys.DELETE + GoAir_getFormattedFullDatefor_NextSunday());

		GoAir_tab_BookFlights_btn_BookNow.click();

		try{objWait.until(ExpectedConditions.invisibilityOfElementLocated(objLocal_PageGoAirResult0InProgress.GoAir_By_img_FlightSearchInProgress));}
		catch (Exception e){System.out.println("DEBUG:    This exception to be ignored!");}

		objWait.until(ExpectedConditions.textToBePresentInElement(
				objLocal_PageGoAirResult2SelectDate.GoAir_Result2Page_CurrentStep.findElement(By.className("number")), "2"));

		return bGoAir_ThisElementValidationStatus;
	}
	
	public boolean GoAir_Validate_This_Offer(String strOfferToCheck){
		
		boolean bGoAir_ThisElementValidationStatus 		= true;

		if (strOfferToCheck.contains("offer_01")){
			// offer_01__ Verify special fare offers from image sliders
			try{
				for (int nLocal=0; nLocal< 3 ; nLocal++){
					if (GoAir_lst_labl_OfferText_Fare_Route.get(nLocal).getText() != ""){
						System.out.println("DEBUG:    Details for special fare offer:");
						System.out.println("DEBUG:     Promo type" + GoAir_lst_labl_OfferText_Fare_PromotionalFare.get(nLocal).getText() );
						System.out.println("DEBUG:     Route     " + GoAir_lst_labl_OfferText_Fare_Route.get(nLocal).getText() );
						System.out.println("DEBUG:     Fare      " + GoAir_lst_labl_OfferText_Fare_Text.get(nLocal).getText()
																		.replace("\n", "")
																		.replace("\r", "")
																		.replace("Fares as low as", "")
																		.substring(1) );
						System.out.println("DEBUG:     Offer still valid");
					}
				}
				try{objWaitOfferSlider.until(ExpectedConditions.visibilityOf((GoAir_SomeJunkElement)));}
				catch (Exception e){}
				
				for (int nLocal=0; nLocal< 3 ; nLocal++){
					if (GoAir_lst_labl_OfferText_Fare_Route.get(nLocal).getText() != ""){
						System.out.println("DEBUG:    Details for special fare offer:");
						System.out.println("DEBUG:     Promo type" + GoAir_lst_labl_OfferText_Fare_PromotionalFare.get(nLocal).getText() );
						System.out.println("DEBUG:     Route     " + GoAir_lst_labl_OfferText_Fare_Route.get(nLocal).getText() );
						System.out.println("DEBUG:     Fare      " + GoAir_lst_labl_OfferText_Fare_Text.get(nLocal).getText()
																		.replace("\n", "")
																		.replace("\r", "")
																		.replace("Fares as low as", "")
																		.substring(1) );
						System.out.println("DEBUG:     Offer still valid");
					}
				}
				try{objWaitOfferSlider.until(ExpectedConditions.visibilityOf((GoAir_SomeJunkElement)));}
				catch (Exception e){}
				
				for (int nLocal=0; nLocal< 3 ; nLocal++){
					if (GoAir_lst_labl_OfferText_Fare_Route.get(nLocal).getText() != ""){
						System.out.println("DEBUG:    Details for special fare offer:");
						System.out.println("DEBUG:     Promo type" + GoAir_lst_labl_OfferText_Fare_PromotionalFare.get(nLocal).getText() );
						System.out.println("DEBUG:     Route     " + GoAir_lst_labl_OfferText_Fare_Route.get(nLocal).getText() );
						System.out.println("DEBUG:     Fare      " + GoAir_lst_labl_OfferText_Fare_Text.get(nLocal).getText()
																		.replace("\n", "")
																		.replace("\r", "")
																		.replace("Fares as low as", "")
																		.substring(1) );
						System.out.println("DEBUG:     Offer still valid");
					}
				}
			}catch (Exception e){
				System.out.println("ERROR:    Spacial fare offer elements check failed for some element.");
			}
		}else if (strOfferToCheck.contains("offer_02")){
			// offer_02__ Verify first Honeymoon deal
			GoAir_tab_Honeymoon.click();
			
			WebElement GoAir_lnk_DealsSection_HomeyMoon = GoAir_lst_lnk_DealsSection.get(1);
			
			for (WebElement GoAir_OneElement : GoAir_lnk_DealsSection_HomeyMoon.findElements(By.cssSelector("div[class='tf-cndl-prod']")) ){
					System.out.println("DEBUG:    Details for honeymoon section:");
					System.out.println("DEBUG:     Offer name:  " + GoAir_OneElement.findElement(By.cssSelector("div[class='tf-cndl-pttl']")).getText() );
					System.out.println("DEBUG:     Offer price: " + GoAir_OneElement.findElement(By.cssSelector("div[class='tf-cndl-prcD']")).getText() );
					System.out.println("DEBUG:     Offer valid: " + GoAir_OneElement.findElement(By.cssSelector("div[class='tf-cndl-pact']")).isDisplayed() );
			}
		}
		
		return bGoAir_ThisElementValidationStatus;
	}

	public boolean GoAir_Validate_This_SupportFunctionality(String strSupportFunctionality){
		
		boolean bGoAir_ThisElementValidationStatus 		= true;

		if (strSupportFunctionality.contains("labl__GoAir Customer Care numbers")){
			System.out.println("DEBUG:    GoAir customer care number: " + 
										GoAir_lst_labl_SupportFunctionality.get(0).getText() + " " +
										GoAir_lst_labl_SupportFunctionality.get(1).getText());
		}
		if (strSupportFunctionality.contains("labl__Tele Check-in")){
			System.out.println("DEBUG:    GoAir tele check in number: " + 
										GoAir_lst_labl_SupportFunctionality.get(2).getText() + " " +
										GoAir_lst_labl_SupportFunctionality.get(3).getText());
		}
		if (strSupportFunctionality.contains("labl__GoAir Marquee scrolling text user checkin advice")){
			System.out.println("DEBUG:    GoAir Passenger check in time advice scrolling text: " + 
										GoAir_labl_Checking_Counter_Advice.getText());
		}
		if (strSupportFunctionality.contains("Support_Functionality__ lnk__Validate Web Check-in")){
			System.out.println("DEBUG:    GoAir Validating web check for wrong input value"); 
			GoAir_tab_Web_Check_in.click();				
			GoAir_txtbox_WebCheckIn_LastName.sendKeys("ABCD");
			GoAir_txtbox_WebCheckIn_PNRnumber.sendKeys("A0B1C3");
			GoAir_tickbox_WebCheckIn_PermissionBox.click();
			GoAir_btn_WebCheckIn_Login.click();
			
			try{
					objWait.until(ExpectedConditions.visibilityOf((GoAir_labl_WebCheckIn_Error)));
					System.out.println("DEBUG:    GoAir web check test for wrong input value was successful"); 
			}catch (Exception e){
					bGoAir_ThisElementValidationStatus = false;
					System.out.println("DEBUG:    GoAir web check in test for wrong input value was NOT successful");
					objSoftAssert.fail("DEBUG:    GoAir web check in test for wrong input value was NOT successful");
			}
			GoAir_btn_HomePage.click();
		}
		if (strSupportFunctionality.contains("Support_Functionality__ lnk__Manage Bookings")){
			System.out.println("DEBUG:    GoAir Validating manage booking for wrong input value"); 
			GoAir_tab_Manage_Booking.click();

			GoAir_txtbox_ManageBooking_LastName.sendKeys("ABCD");
			GoAir_txtbox_ManageBooking_PNRnumber.sendKeys("A0B1C3");
			GoAir_lst_btn_ManageBooking_RetrieveBooking.get(0).click();

			try{
					objWait.until(ExpectedConditions.visibilityOf((GoAir_labl_ManageBooking_Error)));
					System.out.println("DEBUG:    GoAir web check test for wrong input value was successful"); 
			}catch (Exception e){
					bGoAir_ThisElementValidationStatus = false;
					System.out.println("DEBUG:    GoAir manage booking test for wrong input value was NOT successful");
					objSoftAssert.fail("DEBUG:    GoAir manage booking test for wrong input value was NOT successful");
			}
			GoAir_btn_HomePage.click();
		}
		if (strSupportFunctionality.contains("Support_Functionality__ lnk__Flight Status")){
			System.out.println("DEBUG:    GoAir Validating flight status for some flights");
			GoAir_tab_Flight_Status.click();
			GoAir_btn_FlightStatus_ShowAll.click();
			objWait.until(ExpectedConditions.visibilityOf(GoAir_lst_btn_FlightStatus_ShowAll_Inside_FlightStatus_Tab.get(0)));
			Select objSelect_FlightStatus_FlightCode 	= new Select(GoAir_lst_drpdwn_FlightStatus_FlightCode.get(0) );
			int nFlightStatus_FlightCount 				= objSelect_FlightStatus_FlightCode.getAllSelectedOptions().size();
			
			for (; nFlightStatus_FlightCount < 5; nFlightStatus_FlightCount++){
				
				Select objSelect_FlightStatus_FlightCode_Temp 	
														= new Select(GoAir_lst_drpdwn_FlightStatus_FlightCode.get(0) );
				objSelect_FlightStatus_FlightCode_Temp.selectByIndex(nFlightStatus_FlightCount);
				String strFlightCode 					= objSelect_FlightStatus_FlightCode_Temp.getFirstSelectedOption().getText();
				GoAir_lst_btn_FlightStatus_ShowAll_Inside_FlightStatus_Tab.get(0).click();
				objWait.until(ExpectedConditions.visibilityOf(GoAir_labl_FlightStatus_Actual));
				String strFlightStatus 					= GoAir_labl_FlightStatus_Actual.getText();
				objWait.until(ExpectedConditions.visibilityOf(GoAir_lst_drpdwn_FlightStatus_FlightCode.get(0)));
				
				System.out.println("DEBUG:     " + strFlightCode);
				System.out.println("DEBUG:     " + strFlightStatus);
			}
		}
		
		return bGoAir_ThisElementValidationStatus;
	}
	
	public boolean GoAir_Perform_SimpleActivity_and_NavigateToThisPage(String strNavigateToThisPage){

		boolean bGoAir_ThisElementValidationStatus 		= true;
		Actions GoAir_actn_bldr_HomePage 				= new Actions(this.objWebDriverAbstract);

		if (strNavigateToThisPage.contains("navigate_01")){
			GoAir_actn_bldr_HomePage.moveToElement(GoAir_hover_Plan_my_trip).build().perform();
			GoAir_hover_Manage_booking_under_Plan_my_trip.click();
		    objWait.until(ExpectedConditions.titleContains("Manage Booking"));
		}else if(strNavigateToThisPage.contains("navigate_02")){
			GoAir_btn_GoBusiness.click();
		    objWait.until(ExpectedConditions.titleContains("Business"));
		}else if(strNavigateToThisPage.contains("navigate_03")){
			GoAir_hover_Promotions.click();
		    objWait.until(ExpectedConditions.titleContains("Promotions"));
		}else if(strNavigateToThisPage.contains("navigate_04")){
			GoAir_hover_Services.click();
		    objWait.until(ExpectedConditions.titleContains("Services"));
		}

		return bGoAir_ThisElementValidationStatus;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public boolean GoAir_SocialPlugin_Check_Facebook(){
		
		if (GoAir_SocialPlugin_Facebook_lnk.isDisplayed() &&
			GoAir_SocialPlugin_Facebook_img.isDisplayed()    ){
			return true;
		}else{			return false;		}
	}
    
	public boolean GoAir_SocialPlugin_Check_Twitter(){
		
		if (GoAir_SocialPlugin_Twitter_lnk.isDisplayed() &&
			GoAir_SocialPlugin_Twitter_img.isDisplayed()    ){
			return true;
		}else{			return false;		}
	}
	
	public boolean GoAir_SocialPlugin_Check_Googleplus(){
		
		if (GoAir_SocialPlugin_Googleplus_lnk.isDisplayed() &&
			GoAir_SocialPlugin_Googleplus_img.isDisplayed()    ){
			return true;
		}else{			return false;		}
	}
    
	public boolean GoAir_SocialPlugin_Check_Instagram(){
		
		if (GoAir_SocialPlugin_Instagram_lnk.isDisplayed() &&
			GoAir_SocialPlugin_Instagram_img.isDisplayed()    ){
			return true;
		}else{			return false;		}
	}
	
	public String GoAir_Get_MainPage_Logo_URL(){
		return GoAir_img_HomePageLogo.getAttribute("href");
	}
	
	public boolean GoAir_MainPage_Slider_ButtonVerify(){
		
		for (WebElement eleOneSliderButton :  GoAir_SliderImageSelector.findElements(By.cssSelector("a[href='#']")  )){
			if (! eleOneSliderButton.isDisplayed()  ) return false;
		}
		return true;		
	}
	
	public boolean GoAir_Slider_Fare_Offers_Verify(){
		
		boolean bLocalTestResultStatus 		= false;

		for (WebElement eleOneSliderButton :  GoAir_lst_Slider_Fare_Offers_Verify_Total_Elements ){
			if (eleOneSliderButton.getText() != null   ){
				if ( eleOneSliderButton.getText().contains("Promotional fares") || 
					 eleOneSliderButton.getText().contains("Book now")
					)
					bLocalTestResultStatus = true;
			}
		}
		return bLocalTestResultStatus;
	}
	
	public String[] GoAir_Get_MainPage_Slider_URL_Array(){
		return new String[]{
				GoAir_img_HomePage_SliderTotal.findElements(By.cssSelector("img[src*='/upload/Banners/']")).get(0).getAttribute("src"),
				GoAir_img_HomePage_SliderTotal.findElements(By.cssSelector("img[src*='/upload/Banners/']")).get(1).getAttribute("src"),
				GoAir_img_HomePage_SliderTotal.findElements(By.cssSelector("img[src*='/upload/Banners/']")).get(2).getAttribute("src"),
				GoAir_img_HomePage_SliderTotal.findElements(By.cssSelector("img[src*='/upload/Banners/']")).get(3).getAttribute("src")	};			
	}
	
	public boolean GoAir_Slider_Images_Verify(){
		
		int nnLocalSliderImagesCount 		=  GoAir_Get_MainPage_Slider_URL_Array().length;
		boolean bLocalTestResultStatus 		= true;
		System.out.println("DEBUG:    Total count of slider images are: " + nnLocalSliderImagesCount);
		
		for (int nnLocal=0; nnLocal < nnLocalSliderImagesCount; nnLocal++){
			URL objURLMainPageOneSlider		= null;
			try {objURLMainPageOneSlider	= new URL(GoAir_Get_MainPage_Slider_URL_Array()[nnLocal]);} 
			catch (MalformedURLException e) {
				objSoftAssert.fail("ERROR:    Unable to fetch slider image through URL");
				System.out.println("ERROR:    Unable to fetch slider image through URL"); return false;}
			catch (Exception e)             {
				objSoftAssert.fail("ERROR:    Unable to open slider image URL");
				System.out.println("ERROR:    Unable to open slider image URL"); return false;}
			
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
	
	public Boolean GoAir_AcceptAndClose_BookRoundTrip_Popup(){
		Alert alert = this.objWebDriverAbstract.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		return true;
	}
	
	public String GoAir_getFormattedFullDatefor_NextFriday(){
		
		int[] nArr_Current_YearMonthDay = ClsGeneralInitTerminateAndOtherUtil.get_NextFriday_YearMonthDay_integerArray();
		
		// goair.in date format is     dd/mm/yyyy
		String strGoAirFormattedDate_ddmmyy_Sting =
						String.valueOf(nArr_Current_YearMonthDay[2]) + "/" + 
						String.valueOf(nArr_Current_YearMonthDay[1]) + "/" +
						String.valueOf(nArr_Current_YearMonthDay[0]);
		
		return strGoAirFormattedDate_ddmmyy_Sting;
	}
	
	public String GoAir_getFormattedFullDatefor_NextSunday(){
		
		int[] nArr_Current_YearMonthDay = ClsGeneralInitTerminateAndOtherUtil.get_NextSunday_YearMonthDay_integerArray();
		
		// goair.in date format is     dd/mm/yyyy
		String strGoAirFormattedDate_ddmmyy_Sting =
						String.valueOf(nArr_Current_YearMonthDay[2]) + "/" + 
						String.valueOf(nArr_Current_YearMonthDay[1]) + "/" +
						String.valueOf(nArr_Current_YearMonthDay[0]);
		
		return strGoAirFormattedDate_ddmmyy_Sting;
	}

	private boolean GoAir_Click_OneWayFlight_and_Accept_Book_Return_Ticket_Alert(){

		Point GoAir_point_BookFlights_OneWay_Btn 		= GoAir_btn_BookFlights_OneWay.getLocation();
		Robot GoAir_robot_HomePage 						= null;
		try {					GoAir_robot_HomePage 	= new Robot();}
		catch (Exception e) { System.out.println("ERROR:    Exception caused during book return ticket alert handling"); return false;}
		
		GoAir_robot_HomePage.mouseMove(GoAir_point_BookFlights_OneWay_Btn.getX(),GoAir_point_BookFlights_OneWay_Btn.getY()+ nnVerticalPixelOffsetCount_Firefox);
		GoAir_robot_HomePage.mousePress(InputEvent.BUTTON1_MASK);
		GoAir_robot_HomePage.mouseRelease(InputEvent.BUTTON1_MASK);
		
		objWait.until(ExpectedConditions.alertIsPresent());
		
	    Alert objAlert_GoAir_HomePage 					= this.objWebDriverAbstract.switchTo().alert();
	    System.out.println("DEBUG:    Book return ticket alert is acceped with message: " + objAlert_GoAir_HomePage.getText());
	    objAlert_GoAir_HomePage.accept();
	    objWaitShort.until(ExpectedConditions.not(ExpectedConditions.alertIsPresent()));
	    return true;
	}
	
	public boolean GoAir_ModifySearch_BookReturnTicket(String[] strArrRandomDepaartAndArriveCityNames){
		
		boolean bGoAir_ThisElementValidationStatus = true;
//		// go back to main page i.e. modifying search and perform ticket search for two way 
//		GoAir_btn_HomePageLogo.click();
//		objWait.until(ExpectedConditions.visibilityOfAllElements(GoAir_lst_btn_HomePage));
//		
//		bGoAir_ThisElementValidationStatus 	= 
//				GoAir_Perform_Simple_Valid_Flight_Search_2Way(strArrRandomDepaartAndArriveCityNames);
//		
		return bGoAir_ThisElementValidationStatus;
	}
	
	
	
	
	
	
	
	
	

}
