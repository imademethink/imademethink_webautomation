package com.imademethink_webautomation.pkgTktTravel_cleartrip;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.imademethink_webautomation.pkg0GeneralPageFactory.Page0Abstract;

public class Pagecleartrip99General extends Page0Abstract{

	public Pagecleartrip99General(WebDriver driver) {
		super(driver);
		//System.out.println("DEBUG:    Pagecleartrip99General constructor");
		PageFactory.initElements(driver, this);
	}

	// consistent elements
	@FindBy(css = ".cleartripLogo")
	public WebElement cleartrip_img_HomePage;
	@FindBy(css = ".swSearchField")
	public WebElement cleartrip_txtbox_Homepage_FindCities;	
    @FindBy(css=".span.span19.truncate")
	private WebElement cleartrip_labl_UserSection_Heading;
    @FindBy(id = "SignIn")
	private WebElement cleartrip_lnk_UserSection_SignIn;
    @FindBy(linkText = "Register")
	private WebElement cleartrip_lnk_UserSection_SignUp;
    @FindBy(linkText = "About Us")
	private WebElement cleartrip_lnk_UserSection_AboutUs;
    
    
	// elements for specific items
    @FindBy(linkText="Cheap air tickets")
    private WebElement cleartrip_lnk_Homepage_Cheapairtickets;
    @FindBy(linkText="Flight tickets")
    private WebElement cleartrip_lnk_Homepage_Flighttickets;
    @FindBy(linkText="India Hotels")
    private WebElement cleartrip_lnk_Homepage_Indiahotels;
    @FindBy(linkText="IRCTC Railway Reservation")
    private WebElement cleartrip_lnk_Homepage_IRCTCRailwayReservation;
    @FindBy(linkText="Cheap Domestic Air Tickets")
    private WebElement cleartrip_lnk_Homepage_CheapDomesticAirTickets;
    @FindBy(linkText="Domestic Flights")
    private WebElement cleartrip_lnk_Homepage_DomesticFlights;
    @FindBy(linkText="Travel guide")
    private WebElement cleartrip_lnk_Homepage_Travelguide;
    @FindBy(linkText="Holiday Packages")
    private WebElement cleartrip_lnk_Homepage_HolidayPackages;
    @FindBy(linkText="Bus Booking")
	private WebElement cleartrip_lnk_Homepage_BusBooking;
	@FindBy(css = ".productIcon.flights")
	public WebElement cleartrip_img_HomePage_Icon_Flights;
	@FindBy(css = ".productIcon.hotels")
	public WebElement cleartrip_img_HomePage_Icon_Hotels;
	@FindBy(css = ".productIcon.packages")
	public WebElement cleartrip_img_HomePage_Icon_Packages;
	@FindBy(css = ".productIcon.trains")
	public WebElement cleartrip_img_HomePage_Icon_Trains;
	@FindBy(css = ".productIcon.buses")
	public WebElement cleartrip_img_HomePage_Icon_Buses;
	
    // every page object has it's local private wait with fixed 10 sec delay
    private WebDriverWait objWait 		= new WebDriverWait(this.objWebDriverAbstract, 10);   
    @SuppressWarnings("unused")
	private WebDriverWait objWaitShort 	= new WebDriverWait(this.objWebDriverAbstract, 3);

    
	private boolean cleartrip_Validate_SpecificOtherItem_Cheapairtickets(){
		
		boolean bcleartrip_ThisElementValidationStatus 	= true;
		
		cleartrip_lnk_Homepage_Cheapairtickets.click();
		objWait.until(ExpectedConditions.urlContains("cleartrip"));
		
		if(! objWebDriverAbstractGeneralUse.getCurrentUrl().contains("http://www.cleartrip.com")){
			bcleartrip_ThisElementValidationStatus 		= false;
			System.out.println("RESULT::FAIL" + 
			objWebDriverAbstractGeneralUse.getCurrentUrl());
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Following specific item validation failed : " + "Cheap air tickets");
			objSoftAssert.fail("ERROR:    Following specific item validation failed : " + "Cheap air tickets");
		}
		return bcleartrip_ThisElementValidationStatus;
	}
	
	private boolean cleartrip_Validate_SpecificOtherItem_Flighttickets(){
		
		boolean bcleartrip_ThisElementValidationStatus 	= true;
		
		cleartrip_lnk_Homepage_Flighttickets.click();
		objWait.until(ExpectedConditions.urlContains("cleartrip"));
		
		if(! objWebDriverAbstractGeneralUse.getCurrentUrl().contains("http://www.cleartrip.com/flights")){
			bcleartrip_ThisElementValidationStatus 		= false;
			System.out.println("RESULT::FAIL" + 
			objWebDriverAbstractGeneralUse.getCurrentUrl());
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Following specific item validation failed : " + "Flight tickets");
			objSoftAssert.fail("ERROR:    Following specific item validation failed : " + "Flight tickets");
		}
		return bcleartrip_ThisElementValidationStatus;
	}

	private boolean cleartrip_Validate_SpecificOtherItem_Indiahotels(){
		
		boolean bcleartrip_ThisElementValidationStatus 	= true;
		
		cleartrip_lnk_Homepage_Indiahotels.click();
		objWait.until(ExpectedConditions.urlContains("cleartrip"));
		
		if(! objWebDriverAbstractGeneralUse.getCurrentUrl().contains("http://www.cleartrip.com/hotels/india")){
			bcleartrip_ThisElementValidationStatus 		= false;
			System.out.println("RESULT::FAIL" + 
			objWebDriverAbstractGeneralUse.getCurrentUrl());
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Following specific item validation failed : " + "India hotels");
			objSoftAssert.fail("ERROR:    Following specific item validation failed : " + "India hotels");
		}
		return bcleartrip_ThisElementValidationStatus;
	}	

	private boolean cleartrip_Validate_SpecificOtherItem_IRCTCRailwayReservation(){
		
		boolean bcleartrip_ThisElementValidationStatus 	= true;
		
		cleartrip_lnk_Homepage_IRCTCRailwayReservation.click();
		objWait.until(ExpectedConditions.urlContains("cleartrip"));
		
		if(! objWebDriverAbstractGeneralUse.getCurrentUrl().contains("http://www.cleartrip.com/trains")){
			bcleartrip_ThisElementValidationStatus 		= false;
			System.out.println("RESULT::FAIL" + 
			objWebDriverAbstractGeneralUse.getCurrentUrl());
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Following specific item validation failed : " + "IRCTC Railway Reservation");
			objSoftAssert.fail("ERROR:    Following specific item validation failed : " + "IRCTC Railway Reservation");
		}
		return bcleartrip_ThisElementValidationStatus;
	}	

	private boolean cleartrip_Validate_SpecificOtherItem_CheapDomesticAirTickets(){
		
		boolean bcleartrip_ThisElementValidationStatus 	= true;
		
		cleartrip_lnk_Homepage_CheapDomesticAirTickets.click();
		objWait.until(ExpectedConditions.urlContains("cleartrip"));

		if(! objWebDriverAbstractGeneralUse.getCurrentUrl().contains("http://www.cleartrip.com/flight-tickets/cheap-flight-air-tickets-domestic.html")){
			bcleartrip_ThisElementValidationStatus 		= false;
			System.out.println("RESULT::FAIL" + 
			objWebDriverAbstractGeneralUse.getCurrentUrl());
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Following specific item validation failed : " + "Cheap Domestic Air Tickets");
			objSoftAssert.fail("ERROR:    Following specific item validation failed : " + "Cheap Domestic Air Tickets");
		}
		return bcleartrip_ThisElementValidationStatus;
	}	

	private boolean cleartrip_Validate_SpecificOtherItem_DomesticFlights(){
		
		boolean bcleartrip_ThisElementValidationStatus 	= true;
		
		cleartrip_lnk_Homepage_DomesticFlights.click();
		objWait.until(ExpectedConditions.urlContains("cleartrip"));

		if(! objWebDriverAbstractGeneralUse.getCurrentUrl().contains("http://www.cleartrip.com/flight-schedule/flight-schedules-domestic.html")){
			bcleartrip_ThisElementValidationStatus 		= false;
			System.out.println("RESULT::FAIL" + 
			objWebDriverAbstractGeneralUse.getCurrentUrl());
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Following specific item validation failed : " + "Domestic Flights");
			objSoftAssert.fail("ERROR:    Following specific item validation failed : " + "Domestic Flights");
		}
		return bcleartrip_ThisElementValidationStatus;
	}
	
	private boolean cleartrip_Validate_SpecificOtherItem_Travelguide(){
		
		boolean bcleartrip_ThisElementValidationStatus 	= true;
		
		cleartrip_lnk_Homepage_Travelguide.click();
		objWait.until(ExpectedConditions.urlContains("cleartrip"));

		if(! objWebDriverAbstractGeneralUse.getCurrentUrl().contains("http://www.cleartrip.com/smallworld")){
			bcleartrip_ThisElementValidationStatus 		= false;
			System.out.println("RESULT::FAIL" + 
			objWebDriverAbstractGeneralUse.getCurrentUrl());
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Following specific item validation failed : " + "Travel guide");
			objSoftAssert.fail("ERROR:    Following specific item validation failed : " + "Travel guide");
		}
		return bcleartrip_ThisElementValidationStatus;
	}
	
	private boolean cleartrip_Validate_SpecificOtherItem_HolidayPackages(){
		
		boolean bcleartrip_ThisElementValidationStatus 	= true;
		
		cleartrip_lnk_Homepage_HolidayPackages.click();
		objWait.until(ExpectedConditions.urlContains("cleartrip"));

		if(! objWebDriverAbstractGeneralUse.getCurrentUrl().contains("http://www.cleartrip.com/tourism/packages")){
			bcleartrip_ThisElementValidationStatus 		= false;
			System.out.println("RESULT::FAIL" + 
			objWebDriverAbstractGeneralUse.getCurrentUrl());
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Following specific item validation failed : " + "Holiday Packages");
			objSoftAssert.fail("ERROR:    Following specific item validation failed : " + "Holiday Packages");
		}
		return bcleartrip_ThisElementValidationStatus;
	}
	
	private boolean cleartrip_Validate_SpecificOtherItem_BusBooking(){
		
		boolean bcleartrip_ThisElementValidationStatus 	= true;
		
		cleartrip_lnk_Homepage_BusBooking.click();
		objWait.until(ExpectedConditions.urlContains("cleartrip"));

		if(! objWebDriverAbstractGeneralUse.getCurrentUrl().contains("http://www.cleartrip.com/tourism/bus")){
			bcleartrip_ThisElementValidationStatus 		= false;
			System.out.println("RESULT::FAIL" + 
			objWebDriverAbstractGeneralUse.getCurrentUrl());
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Following specific item validation failed : " + "Bus Booking");
			objSoftAssert.fail("ERROR:    Following specific item validation failed : " + "Bus Booking");
		}
		return bcleartrip_ThisElementValidationStatus;
	}

    public boolean cleartrip_Validate_Specific_Other_Items(String strSpecificOtherItems){

		boolean bcleartrip_ThisElementValidationStatus 		= true;
	      
		switch(strSpecificOtherItems){
		case "Cheap air tickets":
			bcleartrip_ThisElementValidationStatus = cleartrip_Validate_SpecificOtherItem_Cheapairtickets();
			break;
		case "Flight tickets":
			bcleartrip_ThisElementValidationStatus = cleartrip_Validate_SpecificOtherItem_Flighttickets();
			break;
		case "India hotels":
			bcleartrip_ThisElementValidationStatus = cleartrip_Validate_SpecificOtherItem_Indiahotels();
			break;
		case "IRCTC Railway Reservation":
			bcleartrip_ThisElementValidationStatus = cleartrip_Validate_SpecificOtherItem_IRCTCRailwayReservation();
			break;
		case "Cheap Domestic Air Tickets":
			bcleartrip_ThisElementValidationStatus = cleartrip_Validate_SpecificOtherItem_CheapDomesticAirTickets();
			break;
		case "Domestic Flights":
			bcleartrip_ThisElementValidationStatus = cleartrip_Validate_SpecificOtherItem_DomesticFlights();
			break;
		case "Travel guide":
			bcleartrip_ThisElementValidationStatus = cleartrip_Validate_SpecificOtherItem_Travelguide();
			break;
		case "Holiday Packages":
			bcleartrip_ThisElementValidationStatus = cleartrip_Validate_SpecificOtherItem_HolidayPackages();
			break;
		case "Bus Booking":
			bcleartrip_ThisElementValidationStatus = cleartrip_Validate_SpecificOtherItem_BusBooking();
			break;
		default :
			bcleartrip_ThisElementValidationStatus = false;
			System.out.println("ERROR:    Unsupported specific other item to validate: " + strSpecificOtherItems);
			objSoftAssert.fail("ERROR:    Unsupported specific other item to validate: " + strSpecificOtherItems);
			break;
		}

		return bcleartrip_ThisElementValidationStatus;
    }

	public boolean cleartrip_validate_This_Element(String strThisElement){
		
		boolean bcleartrip_ThisElementValidationStatus 		= false;

		switch (strThisElement){
			case "btn__HOME":
			case "btn__Home":
				bcleartrip_ThisElementValidationStatus = cleartrip_img_HomePage.isDisplayed();
				break;
			case "txtbox_Find Cities":
				bcleartrip_ThisElementValidationStatus = cleartrip_txtbox_Homepage_FindCities.isDisplayed();
				break;
			case "lnk__Sign Up":
				cleartrip_labl_UserSection_Heading.click();
				bcleartrip_ThisElementValidationStatus = cleartrip_lnk_UserSection_SignUp.isDisplayed();
				cleartrip_labl_UserSection_Heading.click();
				break;
			case "lnk__Sign In":
				cleartrip_labl_UserSection_Heading.click();
				bcleartrip_ThisElementValidationStatus = cleartrip_lnk_UserSection_SignIn.isDisplayed();
				cleartrip_labl_UserSection_Heading.click();
				break;
			case "lnk__About Us":
				bcleartrip_ThisElementValidationStatus = cleartrip_lnk_UserSection_AboutUs.isDisplayed();
				break;
			case "icon_Transportbooking icons":
				if (   	cleartrip_img_HomePage_Icon_Flights.isDisplayed() &&
						cleartrip_img_HomePage_Icon_Hotels.isDisplayed() &&
						cleartrip_img_HomePage_Icon_Packages.isDisplayed() &&
						cleartrip_img_HomePage_Icon_Trains.isDisplayed() &&
						cleartrip_img_HomePage_Icon_Buses.isDisplayed()
						)
					bcleartrip_ThisElementValidationStatus = true;
				break;

	    	default:
				objSoftAssert.fail("ERROR:    Unsupported common webelement to validate: " + strThisElement);
				System.out.println("ERROR:    Unsupported common webelement to validate: " + strThisElement);
	    		break;
		}
		
		return bcleartrip_ThisElementValidationStatus;
	}

	
	
	
	
	
}
