package com.imademethink_webautomation.pkgAirlines_AmericanAirlines;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.imademethink_webautomation.pkg0GeneralPageFactory.Page0Abstract;

public class PageAmericanAirlines99General extends Page0Abstract {

	public PageAmericanAirlines99General(WebDriver driver) {
		super(driver);
		//System.out.println("DEBUG:    PageAmericanAirlines99General constructor");
		PageFactory.initElements(driver, this);
	}

	// This page contains general elements for non ticket booking pages

	// home page button and other elements
    @FindBy(css = ".site-logo")
	private WebElement AmericanAirlines_btn_HomePage;
    @FindBy(css = "img[src*='aa-logo.png']")
	private WebElement AmericanAirlines_img_AAlogo;

    // home page top row items
	@FindBy(id = "menu-plan")
	private WebElement AmericanAirlines_lnk_PlanTravel;
	@FindBy(id = "menu-manage")
	private WebElement AmericanAirlines_lnk_TravelInformation;
	@FindBy(id = "menu-aadvantage")
	private WebElement AmericanAirlines_lnk_AAdvantage;
	@FindBy(css = ".close-bar")
	private WebElement AmericanAirlines_lnk_TopRowItem_CloseBar;
	
	// elements under travel information
    @FindBy(linkText="At the airport")
    private WebElement AmericanAirlines_lnk_TravelInformation_AtTheAirport;
    @FindBy(linkText="During your flight")
    private WebElement AmericanAirlines_lnk_TravelInformation_DuringYourFlight;
    @FindBy(linkText="Planes")
    private WebElement AmericanAirlines_lnk_TravelInformation_Planes;
	
	// elements under travel information
    @FindBy(linkText="AAdvantage Home")
    private WebElement AmericanAirlines_lnk_AAdvantage_AAdvantageHome;
    @FindBy(linkText="Earn Miles")
    private WebElement AmericanAirlines_lnk_AAdvantage_EarnMiles;
    @FindBy(linkText="Redeem Miles")
    private WebElement AmericanAirlines_lnk_AAdvantage_RedeemMiles;

    // elements for flights status functionality
	@FindBy(css="#aa-content-frame>h1")
	public WebElement AmericanAirlines_labl_PageHeading_FlightStatus;

	// other elements
    @FindBy(linkText="Travel Offers")
    private WebElement AmericanAirlines_lnk_TopRowItem_PlanTravel_TravelOffers;

    // offers section
    @FindBy(css="a[href='#travel']")
    private WebElement AmericanAirlines_btn_OffersSection_BookTravel;
    @FindBy(css="a[href='#award']")
    private WebElement AmericanAirlines_btn_OffersSection_AwardTravel;
    @FindBy(css="a[href='#trip']")
    private WebElement AmericanAirlines_btn_OffersSection_ManageMyTrip;
    @FindBy(css="a[href='#checkin']")
    private WebElement AmericanAirlines_btn_OffersSection_OnlineCheckIn;
    @FindBy(css="a[href='#fs']")
    private WebElement AmericanAirlines_btn_OffersSection_FlightStatus;
    @FindBy(css=".warningTabAcceptBtn")
    private List<WebElement> AmericanAirlines_lst_btn_OffersSection_Continue;

    // offer section - book travel
    @FindBy(css="#origin1")
    private WebElement AmericanAirlines_btn_OffersSection_BookTravel_FromCityName;
    @FindBy(css="#destination1")
    private WebElement AmericanAirlines_btn_OffersSection_BookTravel_ToCityName;
    @FindBy(css="#date1Local")
    private WebElement AmericanAirlines_btn_OffersSection_BookTravel_FromCity_DateInvoke;
    @FindBy(css="#date2Local")
    private WebElement AmericanAirlines_btn_OffersSection_BookTravel_ToCity_DateInvoke;
    @FindBy(css=".ui-datepicker-group-last>.ui-datepicker-calendar>tbody>tr")
    private List<WebElement> AmericanAirlines_lst_lnk_OffersSection_BookTravel_DateGrid_FromCity_ToCity;
    @FindBy(css=".ui-datepicker-close")
    private WebElement AmericanAirlines_btn_OffersSection_BookTravel_DateGrid_Close;
    @FindBy(css="div[id='srcBtn']")
    private WebElement AmericanAirlines_btn_OffersSection_BookTravel_FindFlights;
	@FindBy(css=".step-current")
	public WebElement AmericanAirlines_Result1Page_CurrentStep;

    // offer section - award travel
    @FindBy(css="input[id='aa-srcBtnInput']")
    private List<WebElement> AmericanAirlines_lst_btn_OffersSection_AwardTravel_FindFlights;
    @FindBy(css="#aadvantage-logo")
    private WebElement AmericanAirlines_btn_OffersSection_AwardTravel_AAlogo;
    @FindBy(css="#aa-origin1")
    private WebElement AmericanAirlines_btn_OffersSection_AwardTravel_FromCityName;
    @FindBy(css="#aa-destination1")
    private WebElement AmericanAirlines_btn_OffersSection_AwardTravel_ToCityName;
    @FindBy(css="#aa-date1")
    private WebElement AmericanAirlines_btn_OffersSection_AwardTravel_FromCity_DateInvoke;
    @FindBy(css="#aa-date2")
    private WebElement AmericanAirlines_btn_OffersSection_AwardTravel_ToCity_DateInvoke;
    @FindBy(css=".ui-datepicker-group-last>.ui-datepicker-calendar>tbody>tr")
    private List<WebElement> AmericanAirlines_lst_lnk_OffersSection_AwardTravel_DateGrid_FromCity_ToCity;

    // offer section - manage my trip
    @FindBy(css="#reservationNr")
    private WebElement AmericanAirlines_txtbox_OffersSection_ManageMyTrip_ReservationNumber;
    @FindBy(css="#lastname")
    private WebElement AmericanAirlines_txtbox_OffersSection_ManageMyTrip_LastName;
    @FindBy(css="#trip-submit")
    private WebElement AmericanAirlines_btn_OffersSection_ManageMyTrip_ManageMyTrip;
    
    // offer section - online check in
    @FindBy(css="#findReservationForm-firstName")
    private WebElement AmericanAirlines_txtbox_OffersSection_OnlineCheckin_FirstName;
    @FindBy(css="#findReservationForm-lastName")
    private WebElement AmericanAirlines_txtbox_OffersSection_OnlineCheckin_LastName;
    @FindBy(css="#findReservationForm-recordLocator")
    private WebElement AmericanAirlines_txtbox_OffersSection_OnlineCheckin_ReservationNumber;
    @FindBy(css="#findReservationForm-submit")
    private WebElement AmericanAirlines_btn_OffersSection_OnlineCheckin_Submit;
    
    // offer section - flight status
    @FindBy(css="#gatesTimesForm-originAirport")
    private WebElement AmericanAirlines_drpdown_OffersSection_FlightStatus_FromCity;
    @FindBy(css="#gatesTimesForm-destinationAirport")
    private WebElement AmericanAirlines_drpdown_OffersSection_FlightStatus_ToCity;
    @FindBy(css="#gatesTimesForm-submit")
    private WebElement AmericanAirlines_btn_OffersSection_FlightStatus_Submit;
      
    // offer sectiob - common item
    @FindBy(css="#errorMsg")
    private WebElement AmericanAirlines_btn_OffersSection_ErrorMessage;
    @FindBy(css="img[src*='oneworld.png']")
    private WebElement AmericanAirlines_img_oneWorldAlliance;
    		
    // items under about us section
    @FindBy(linkText="Social Media")
    private WebElement AmericanAirlines_lnk_SupportFunctionality_AboutUs_SocialMedia;
    @FindBy(linkText="oneworld Alliance")
    private WebElement AmericanAirlines_lnk_SupportFunctionality_AboutUs_oneworldAlliance;
    @FindBy(linkText="Corporate Responsibility")
    private WebElement AmericanAirlines_lnk_SupportFunctionality_AboutUs_CorporateResponsibility;

    // items under customer service
    @FindBy(linkText="Reservations & General Enquiries")
    private WebElement AmericanAirlines_lnk_SupportFunctionality_CustomerService_Reservations;
    @FindBy(linkText="Customer Relations")
    private WebElement AmericanAirlines_lnk_SupportFunctionality_CustomerService_CustomerRelations;
    @FindBy(linkText="Refunds")
    private WebElement AmericanAirlines_lnk_SupportFunctionality_CustomerService_Refunds;
    @FindBy(linkText="Delayed & Lost Baggage")
    private WebElement AmericanAirlines_lnk_SupportFunctionality_CustomerService_DelayedandLostBaggage;
    
    // items under More
    @FindBy(linkText="Copyright")
    private WebElement AmericanAirlines_lnk_SupportFunctionality_More_Copyright;
    @FindBy(linkText="Privacy Policy")
    private WebElement AmericanAirlines_lnk_SupportFunctionality_More_PrivacyPolicy;

    
    
	
    // every page object has it's local private wait with fixed 10 sec delay
	private WebDriverWait objWait 		= new WebDriverWait(this.objWebDriverAbstract, 10);
	private WebDriverWait objWaitShort 	= new WebDriverWait(this.objWebDriverAbstract, 3);
	
	
    public boolean AmericanAirlines_Validate_OfferSection_For(String strOfferSection, String[] strArrRandomDepaartAndArriveCityNames_Global){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;
		
		// navigate to offers section
		AmericanAirlines_lnk_PlanTravel.click();
		AmericanAirlines_lnk_TopRowItem_PlanTravel_TravelOffers.click();
		objWait.until(ExpectedConditions.titleContains("Special Offers"));

		switch(strOfferSection){
			case "Book Travel":
				bAmericanAirlines_ThisElementValidationStatus = AmericanAirlines_Validate_OfferSection_BookTravel(strArrRandomDepaartAndArriveCityNames_Global);
				break;
			case "Award Travel":
				bAmericanAirlines_ThisElementValidationStatus = AmericanAirlines_Validate_OfferSection_AwardTravel(strArrRandomDepaartAndArriveCityNames_Global);
				break;
			case "Manage My Trip":
				bAmericanAirlines_ThisElementValidationStatus = AmericanAirlines_Validate_OfferSection_ManageMyTrip();
				break;
			case "Online Check-In":
				bAmericanAirlines_ThisElementValidationStatus = AmericanAirlines_Validate_OfferSection_OnlineCheckIn();
				break;
			case "Flight Status":
				bAmericanAirlines_ThisElementValidationStatus = AmericanAirlines_Validate_OfferSection_ManageFlightStatus();
				break;
			default :
				bAmericanAirlines_ThisElementValidationStatus = false;
				System.out.println("ERROR:    Unsupported offer section to validate: " + strOfferSection);
				objSoftAssert.fail("ERROR:    Unsupported offer section to validate: " + strOfferSection);
				break;
		}

		return bAmericanAirlines_ThisElementValidationStatus;
	}

    public boolean AmericanAirlines_Validate_Support_Functionality_For(String strSupportFunctionalityTitle){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;

		switch(strSupportFunctionalityTitle){
			case "Items under About Us":
				bAmericanAirlines_ThisElementValidationStatus = AmericanAirlines_Validate_SupportFunctionality_AboutUs();
				break;
			case "Items under Customer Service":
				bAmericanAirlines_ThisElementValidationStatus = AmericanAirlines_Validate_SupportFunctionality_CustomerServive();
				break;
			case "Items under More":
				bAmericanAirlines_ThisElementValidationStatus = AmericanAirlines_Validate_SupportFunctionality_More();
				break;
			default :
				bAmericanAirlines_ThisElementValidationStatus = false;
				System.out.println("ERROR:    Unsupported support functionality to validate: " + strSupportFunctionalityTitle);
				objSoftAssert.fail("ERROR:    Unsupported support functionality to validate: " + strSupportFunctionalityTitle);
				break;
		}

		return bAmericanAirlines_ThisElementValidationStatus;
	}

    public boolean AmericanAirlines_Validate_Specific_Other_Items(String strSpecificOtherItems){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;

    	if (strSpecificOtherItems.contains("Home page top items")){
    		
    		if(     AmericanAirlines_lnk_PlanTravel.isDisplayed() &&
    				AmericanAirlines_lnk_TravelInformation.isDisplayed() &&
    				AmericanAirlines_lnk_AAdvantage.isDisplayed()
    		  ){
    			AmericanAirlines_lnk_PlanTravel.click();
    			objWait.until(ExpectedConditions.visibilityOf(AmericanAirlines_lnk_TopRowItem_CloseBar) );
    			AmericanAirlines_lnk_TopRowItem_CloseBar.click();
    			System.out.println("DEBUG:    Home page top items found.");
    		   }
    		else{
    			bAmericanAirlines_ThisElementValidationStatus = false;
				System.out.println("ERROR:    Validation of home page top items failed.");
				objSoftAssert.fail("ERROR:    Validation of home page top items failed.");
    		}
    		return bAmericanAirlines_ThisElementValidationStatus;
    	}

		switch(strSpecificOtherItems){
		case "lnk__Travel Information sub items":
			bAmericanAirlines_ThisElementValidationStatus = AmericanAirlines_Validate_SpecificOtherItem_TravelInformation();
			break;
		case "lnk__AAdvantage sub items":
			bAmericanAirlines_ThisElementValidationStatus = AmericanAirlines_Validate_SpecificOtherItem_AAdvantageSubItems();
			break;
		case "lnk__oneworldalliance URL":
			if( AmericanAirlines_img_oneWorldAlliance.isDisplayed()) {AmericanAirlines_img_oneWorldAlliance.click();}
			else {bAmericanAirlines_ThisElementValidationStatus = false;}
			break;
		default :
			bAmericanAirlines_ThisElementValidationStatus = false;
			System.out.println("ERROR:    Unsupported specific other item to validate: " + strSpecificOtherItems);
			objSoftAssert.fail("ERROR:    Unsupported specific other item to validate: " + strSpecificOtherItems);
			break;
		}

		return bAmericanAirlines_ThisElementValidationStatus;
    }

	public boolean AmericanAirlines_validate_This_Element(String strThisElement){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= false;

		switch (strThisElement){
			case "btn__HOME":
			case "btn__Home":
				if ( AmericanAirlines_btn_HomePage.isDisplayed()    )     			bAmericanAirlines_ThisElementValidationStatus = true;
				break;
			case "lnk__Plan Travel":
				if ( AmericanAirlines_lnk_PlanTravel.isDisplayed()    )     		bAmericanAirlines_ThisElementValidationStatus = true;
				break;
			case "lnk__Travel Information":
				if ( AmericanAirlines_lnk_TravelInformation.isDisplayed()    )     	bAmericanAirlines_ThisElementValidationStatus = true;
				break;
			case "lnk__AAdvantage":
				if ( AmericanAirlines_lnk_AAdvantage.isDisplayed()    )     		bAmericanAirlines_ThisElementValidationStatus = true;
				break;
			case "img__AmericanAirlines logo":
				if ( AmericanAirlines_img_AAlogo.isDisplayed()    )     			bAmericanAirlines_ThisElementValidationStatus = true;
				break;
			case "lnk__oneworldalliance":
				if ( AmericanAirlines_img_oneWorldAlliance.isDisplayed() )   		bAmericanAirlines_ThisElementValidationStatus = true;
				break;

	    	default:
				objSoftAssert.fail("ERROR:    Unsupported common webelement to validate: " + strThisElement);
				System.out.println("ERROR:    Unsupported common webelement to validate: " + strThisElement);
	    		break;
		}
		
		return bAmericanAirlines_ThisElementValidationStatus;
	}
	

    
    
    
    
    
    
    
    
    
    
    
    // helper methods
    private boolean AmericanAirlines_Validate_OfferSection_BookTravel(String[] strArrRandomDepaartAndArriveCityNames){
    	
		AmericanAirlines_btn_OffersSection_BookTravel.click();
		
		AmericanAirlines_btn_OffersSection_BookTravel_FromCityName.clear();
		AmericanAirlines_btn_OffersSection_BookTravel_FromCityName.sendKeys(strArrRandomDepaartAndArriveCityNames[0] + Keys.DOWN + Keys.DOWN + Keys.DOWN);

		AmericanAirlines_btn_OffersSection_BookTravel_ToCityName.clear();
		AmericanAirlines_btn_OffersSection_BookTravel_ToCityName.sendKeys(strArrRandomDepaartAndArriveCityNames[1] + Keys.DOWN + Keys.DOWN + Keys.DOWN);
		
		AmericanAirlines_btn_OffersSection_BookTravel_FromCity_DateInvoke.click();
		AmericanAirlines_lst_lnk_OffersSection_BookTravel_DateGrid_FromCity_ToCity.get(1)
										.findElements(By.cssSelector("a[class='ui-state-default']")).get(4).click();
		
		AmericanAirlines_btn_OffersSection_BookTravel_ToCity_DateInvoke.click();
		AmericanAirlines_lst_lnk_OffersSection_BookTravel_DateGrid_FromCity_ToCity.get(1)
										.findElements(By.cssSelector("a[class='ui-state-default']")).get(6).click();
		
		AmericanAirlines_btn_OffersSection_BookTravel_FindFlights.click();
		
		objWait.until(ExpectedConditions.textToBePresentInElement(AmericanAirlines_Result1Page_CurrentStep, "1"));    		
    	
    	return true;
    }
    
    private boolean AmericanAirlines_Validate_OfferSection_AwardTravel(String[] strArrRandomDepaartAndArriveCityNames){

    	AmericanAirlines_btn_OffersSection_AwardTravel.click();
    	AmericanAirlines_lst_btn_OffersSection_Continue.get(1).click();
    	objWaitShort.until(ExpectedConditions.visibilityOf(AmericanAirlines_btn_OffersSection_AwardTravel_AAlogo));
		
		AmericanAirlines_btn_OffersSection_AwardTravel_FromCityName.clear();
		AmericanAirlines_btn_OffersSection_AwardTravel_FromCityName.sendKeys(strArrRandomDepaartAndArriveCityNames[0] + Keys.DOWN + Keys.DOWN + Keys.DOWN);

		AmericanAirlines_btn_OffersSection_AwardTravel_ToCityName.clear();
		AmericanAirlines_btn_OffersSection_AwardTravel_ToCityName.sendKeys(strArrRandomDepaartAndArriveCityNames[1] + Keys.DOWN + Keys.DOWN + Keys.DOWN);
		
		AmericanAirlines_btn_OffersSection_AwardTravel_FromCity_DateInvoke.click();
		AmericanAirlines_lst_lnk_OffersSection_AwardTravel_DateGrid_FromCity_ToCity.get(1)
										.findElements(By.cssSelector("a[class='ui-state-default']")).get(4).click();
		
		AmericanAirlines_btn_OffersSection_AwardTravel_ToCity_DateInvoke.click();
		AmericanAirlines_lst_lnk_OffersSection_AwardTravel_DateGrid_FromCity_ToCity.get(1)
										.findElements(By.cssSelector("a[class='ui-state-default']")).get(6).click();
		
	    try{objWaitShort.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("zzzzzzzzzzzzzzzz")));}
	    catch(Exception e){}
	    AmericanAirlines_lst_btn_OffersSection_AwardTravel_FindFlights.get(0).click();
		//AmericanAirlines_lst_btn_OffersSection_AwardTravel_FindFlights.get(0).click();
		
		// wat for another window to load
	    try{objWaitShort.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("zzzzzzzzzzzzzzzz")));}
	    catch(Exception e){}
	    
		// handle additional window
		String strMainWindowHandle        	= this.objWebDriverAbstract.getWindowHandle();
		Set<String> strSetWindowHandles 	= this.objWebDriverAbstract.getWindowHandles();
		if (strSetWindowHandles.size() <= 1){
			System.out.println("ERROR:    Award travel seperate window did not open");
			objSoftAssert.fail("ERROR:    Award travel seperate window did not open");
			return false;
		}
		
		Iterator<String> strIteratorPopup 	= strSetWindowHandles.iterator();
		while ( strIteratorPopup.hasNext() ) {
		    String strCurrentWindowHandle 	= strIteratorPopup.next();
		    if(strMainWindowHandle.contains(strCurrentWindowHandle)) continue;

		    // switch to another window
		    this.objWebDriverAbstract.switchTo().window(strCurrentWindowHandle);
		    this.objWebDriverAbstract.manage().window().maximize();
		    // just some delay so that another window loads
		    try{objWaitShort.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("zzzzzzzzzzzzzzzz")));}
		    catch(Exception e){}

		    // if the search results are to be corrected then correct them by clicking on continue
		    if ( this.objWebDriverAbstract.findElements(By.cssSelector("input[class='aa-btn aa-btn-primary']")).size() > 0){
		    	String strCityName_Code = "";

		    	strCityName_Code = strArrRandomDepaartAndArriveCityNames[0];
		    	strCityName_Code = strCityName_Code.substring(strCityName_Code.indexOf("(")+1,strCityName_Code.indexOf(")"));
		    	this.objWebDriverAbstract.findElement(By.cssSelector("input[id*='originAirport']")).sendKeys(Keys.chord(Keys.CONTROL, "a") + Keys.DELETE);
		    	this.objWebDriverAbstract.findElement(By.cssSelector("input[id*='originAirport']")).sendKeys(strCityName_Code);
		    	
		    	strCityName_Code = strArrRandomDepaartAndArriveCityNames[1];
		    	strCityName_Code = strCityName_Code.substring(strCityName_Code.indexOf("(")+1,strCityName_Code.indexOf(")"));
		    	this.objWebDriverAbstract.findElement(By.cssSelector("input[id*='destinationAirport']")).sendKeys(Keys.chord(Keys.CONTROL, "a") + Keys.DELETE);
   		    	this.objWebDriverAbstract.findElement(By.cssSelector("input[id*='destinationAirport']")).sendKeys(strCityName_Code);

		    	// if the search results are to be corrected then correct them by clicking on continue
		    	this.objWebDriverAbstract.findElements(By.cssSelector("input[class='aa-btn aa-btn-primary']")).get(0).click();
		    }

		    // just some delay so that another window loads with award travel milage content
		    try {objWait.until(ExpectedConditions.visibilityOfAllElements(this.objWebDriverAbstract.findElements(By.cssSelector(".legend_w3"))));}
		    catch(Exception e){}
		    try {objWait.until(ExpectedConditions.visibilityOfAllElements(this.objWebDriverAbstract.findElements(By.cssSelector(".legend_w3"))));}
		    catch(Exception e){}

	    	this.objWebDriverAbstract.close();
	    	
	    	break;    		    
		}
		this.objWebDriverAbstract.switchTo().window(strMainWindowHandle);
    	
    	return true;
    }
    
    private boolean AmericanAirlines_Validate_OfferSection_ManageMyTrip(){
    	
		AmericanAirlines_btn_OffersSection_ManageMyTrip.click();
		
	    AmericanAirlines_txtbox_OffersSection_ManageMyTrip_ReservationNumber.sendKeys("A0B2C3");
	    AmericanAirlines_txtbox_OffersSection_ManageMyTrip_LastName.sendKeys("XYZW");
	    AmericanAirlines_btn_OffersSection_ManageMyTrip_ManageMyTrip.click();
		
		objWait.until(ExpectedConditions.visibilityOf(AmericanAirlines_btn_OffersSection_ErrorMessage));
    	
    	return true;
    }
    
    private boolean AmericanAirlines_Validate_OfferSection_OnlineCheckIn(){
    	
		AmericanAirlines_btn_OffersSection_OnlineCheckIn.click();
		AmericanAirlines_lst_btn_OffersSection_Continue.get(0).click();
		
		AmericanAirlines_txtbox_OffersSection_OnlineCheckin_FirstName.sendKeys("ABCD");
		AmericanAirlines_txtbox_OffersSection_OnlineCheckin_LastName.sendKeys("XYZW");
		AmericanAirlines_txtbox_OffersSection_OnlineCheckin_ReservationNumber.sendKeys("A0B1C2");
		AmericanAirlines_btn_OffersSection_OnlineCheckin_Submit.click();
		
		objWait.until(ExpectedConditions.visibilityOf(AmericanAirlines_btn_OffersSection_ErrorMessage));
    	return true;
    }

    private boolean AmericanAirlines_Validate_OfferSection_ManageFlightStatus(){
    	
		AmericanAirlines_btn_OffersSection_FlightStatus.click();
		AmericanAirlines_lst_btn_OffersSection_Continue.get(2).click();
		Select AmericanAirlinesFromCity = new Select(AmericanAirlines_drpdown_OffersSection_FlightStatus_FromCity);
		Select AmericanAirlinesToCity 	= new Select(AmericanAirlines_drpdown_OffersSection_FlightStatus_ToCity);

		AmericanAirlinesFromCity.selectByVisibleText("Denver (DEN) Colorado, USA");
		AmericanAirlinesToCity.selectByVisibleText("San Francisco (SFO) California, USA");
    	AmericanAirlines_btn_OffersSection_FlightStatus_Submit.click();

		// wat for another window to load
	    try{objWaitShort.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("zzzzzzzzzzzzzzzz")));}
	    catch(Exception e){}
	    
		// handle additional window
		String strMainWindowHandle        	= this.objWebDriverAbstract.getWindowHandle();
		Set<String> strSetWindowHandles 	= this.objWebDriverAbstract.getWindowHandles();
		if (strSetWindowHandles.size() <= 1){
			System.out.println("ERROR:    Flight Status seperate window did not open");
			objSoftAssert.fail("ERROR:    Flight Status seperate window did not open");
			return false;
		}

		Iterator<String> strIteratorPopup 	= strSetWindowHandles.iterator();
		while ( strIteratorPopup.hasNext() ) {
		    String strCurrentWindowHandle 	= strIteratorPopup.next();
		    if(strMainWindowHandle.contains(strCurrentWindowHandle)) continue;

		    // switch to another window
		    this.objWebDriverAbstract.switchTo().window(strCurrentWindowHandle);
		    this.objWebDriverAbstract.manage().window().maximize();
		    // just some delay so that another window loads
		    try{objWaitShort.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("zzzzzzzzzzzzzzzz")));}
		    catch(Exception e){}
		    
		    // proceed for search
		    this.objWebDriverAbstract.findElement(By.cssSelector("#flightSchedulesSearchButton")).click();
		    // check search result (table headers) to be shown
		    objWaitShort.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("th[class='header']")));

	    	this.objWebDriverAbstract.close();		    	
	    	break;    		    
		}
		this.objWebDriverAbstract.switchTo().window(strMainWindowHandle);
    	return true;
    }

    private boolean AmericanAirlines_Validate_SupportFunctionality_AboutUs(){
    	
    	// Social media
        AmericanAirlines_lnk_SupportFunctionality_AboutUs_SocialMedia.click();
        objWait.until(ExpectedConditions.visibilityOf(AmericanAirlines_btn_HomePage));
        
        if( this.objWebDriverAbstract.findElements(By.cssSelector(".no_bottom_margin>a")).size() > 0){
        	System.out.println("DEBUG:    Following social media items observed");
            for (WebElement AmericanAirlines_OneElement : this.objWebDriverAbstract.findElements(By.cssSelector(".no_bottom_margin>a"))){
            	System.out.println("DEBUG:     " + AmericanAirlines_OneElement.getAttribute("href"));
            }
        }else{System.out.println("DEBUG:    No Social media items observed");}
        AmericanAirlines_btn_HomePage.click();
        objWait.until(ExpectedConditions.visibilityOf(AmericanAirlines_btn_HomePage));

        //one world alliance
        if (AmericanAirlines_lnk_SupportFunctionality_AboutUs_oneworldAlliance.isDisplayed()){
        	System.out.println("DEBUG:    One world alliance image found");
        }else{System.out.println("DEBUG:    One world alliance image NOT found");}

        //one corporate resposibility
        if (AmericanAirlines_lnk_SupportFunctionality_AboutUs_CorporateResponsibility.isDisplayed()){
        	System.out.println("DEBUG:    Corporate responsibility link found");
        }else{System.out.println("DEBUG:    Corporate responsibility link NOT found");}
        
        return true;
    }
    
    private boolean AmericanAirlines_Validate_SupportFunctionality_CustomerServive(){

    	// reservation and general enquiries
    	AmericanAirlines_lnk_SupportFunctionality_CustomerService_Reservations.click();
        objWait.until(ExpectedConditions.visibilityOf(AmericanAirlines_btn_HomePage));
        if( this.objWebDriverAbstract.getTitle().contains("Customer Service") ){
        	System.out.println("DEBUG:    Reservations page found");
        }else{System.out.println("DEBUG:    Reservations page NOT found");}
        AmericanAirlines_btn_HomePage.click();
        objWait.until(ExpectedConditions.visibilityOf(AmericanAirlines_btn_HomePage));

        // customer relation
        AmericanAirlines_lnk_SupportFunctionality_CustomerService_CustomerRelations.click();
        objWait.until(ExpectedConditions.visibilityOf(AmericanAirlines_btn_HomePage));
        if( this.objWebDriverAbstract.getTitle().contains("Customer Service") ){
        	System.out.println("DEBUG:    Customer relation page found");
        }else{System.out.println("DEBUG:    Customer relation page NOT found");}
        AmericanAirlines_btn_HomePage.click();
        objWait.until(ExpectedConditions.visibilityOf(AmericanAirlines_btn_HomePage));

        // refunds
        AmericanAirlines_lnk_SupportFunctionality_CustomerService_Refunds.click();
        objWait.until(ExpectedConditions.visibilityOf(AmericanAirlines_btn_HomePage));
        if( this.objWebDriverAbstract.getTitle().contains("Customer Service") ){
        	System.out.println("DEBUG:    Refunds page found");
        }else{System.out.println("DEBUG:    Refunds page NOT found");}
        AmericanAirlines_btn_HomePage.click();
        objWait.until(ExpectedConditions.visibilityOf(AmericanAirlines_btn_HomePage));
        
        // delayed and lost baggage
        AmericanAirlines_lnk_SupportFunctionality_CustomerService_DelayedandLostBaggage.click();
        objWait.until(ExpectedConditions.visibilityOf(AmericanAirlines_btn_HomePage));
        if( this.objWebDriverAbstract.getTitle().contains("Customer Service") ){
        	System.out.println("DEBUG:    Delayed and lost baggage page found");
        }else{System.out.println("DEBUG:    Delayed and lost baggage NOT found");}
        
        return true;
    }
    
    private boolean AmericanAirlines_Validate_SupportFunctionality_More(){

    	// copyright
        AmericanAirlines_lnk_SupportFunctionality_More_Copyright.click();
        objWait.until(ExpectedConditions.visibilityOf(AmericanAirlines_btn_HomePage));
        if( this.objWebDriverAbstract.getTitle().contains("Copyright") ){
        	System.out.println("DEBUG:    Copyight page found");
        }else{System.out.println("DEBUG:    Copyight page NOT found");}
        AmericanAirlines_btn_HomePage.click();
        objWait.until(ExpectedConditions.visibilityOf(AmericanAirlines_btn_HomePage));
	    try {objWait.until(ExpectedConditions.visibilityOfAllElements(this.objWebDriverAbstract.findElements(By.className("site-logo"))));}
	    catch(Exception e){}
	    
        // privacy policy
        AmericanAirlines_lnk_SupportFunctionality_More_PrivacyPolicy.click();
	    try {objWait.until(ExpectedConditions.visibilityOfAllElements(this.objWebDriverAbstract.findElements(By.className("site-logo"))));}
	    catch(Exception e){}
        if( this.objWebDriverAbstract.getTitle().contains("Privacy policy") ){
        	System.out.println("DEBUG:    Privacy policy page found");
        }else{System.out.println("DEBUG:    Privacy policy page NOT found");}

        return true;
    }
    
    private boolean AmericanAirlines_Validate_SpecificOtherItem_TravelInformation(){

    	AmericanAirlines_lnk_TravelInformation.click();
    	objWait.until(ExpectedConditions.visibilityOf(AmericanAirlines_lnk_TravelInformation_AtTheAirport));
    	AmericanAirlines_lnk_TravelInformation_AtTheAirport.click();
    	objWait.until(ExpectedConditions.titleContains("At the airport"));
    	this.objWebDriverAbstract.navigate().back();
       	objWait.until(ExpectedConditions.visibilityOf(AmericanAirlines_lnk_TravelInformation));
           	
    	AmericanAirlines_lnk_TravelInformation.click();
    	objWait.until(ExpectedConditions.visibilityOf(AmericanAirlines_lnk_TravelInformation_DuringYourFlight));
    	AmericanAirlines_lnk_TravelInformation_DuringYourFlight.click();
    	objWait.until(ExpectedConditions.titleContains("During your flight"));
    	this.objWebDriverAbstract.navigate().back();
       	objWait.until(ExpectedConditions.visibilityOf(AmericanAirlines_lnk_TravelInformation));
      
       	AmericanAirlines_lnk_TravelInformation.click();
    	objWait.until(ExpectedConditions.visibilityOf(AmericanAirlines_lnk_TravelInformation_Planes));
    	AmericanAirlines_lnk_TravelInformation_Planes.click();
    	objWait.until(ExpectedConditions.titleContains("Planes"));
    	this.objWebDriverAbstract.navigate().back();
       	objWait.until(ExpectedConditions.visibilityOf(AmericanAirlines_lnk_TravelInformation));
       	
       	System.out.println("DEBUG:    Following specific other item found: " + "TravelInformation");

    	return true;
    }

    private boolean AmericanAirlines_Validate_SpecificOtherItem_AAdvantageSubItems(){

    	AmericanAirlines_lnk_AAdvantage.click();
    	objWait.until(ExpectedConditions.visibilityOf(AmericanAirlines_lnk_AAdvantage_AAdvantageHome));
    	AmericanAirlines_lnk_AAdvantage_AAdvantageHome.click();
    	objWait.until(ExpectedConditions.titleContains("AAdvantage"));
    	this.objWebDriverAbstract.navigate().back();
       	objWait.until(ExpectedConditions.visibilityOf(AmericanAirlines_lnk_AAdvantage));

       	AmericanAirlines_lnk_AAdvantage.click();
    	objWait.until(ExpectedConditions.visibilityOf(AmericanAirlines_lnk_AAdvantage_EarnMiles));
    	AmericanAirlines_lnk_AAdvantage_EarnMiles.click();
    	objWait.until(ExpectedConditions.titleContains("Earn Miles"));
    	this.objWebDriverAbstract.navigate().back();
       	objWait.until(ExpectedConditions.visibilityOf(AmericanAirlines_lnk_AAdvantage));       	
       	
       	AmericanAirlines_lnk_AAdvantage.click();
    	objWait.until(ExpectedConditions.visibilityOf(AmericanAirlines_lnk_AAdvantage_RedeemMiles));
    	AmericanAirlines_lnk_AAdvantage_RedeemMiles.click();
    	objWait.until(ExpectedConditions.titleContains("Redeem miles"));
    	this.objWebDriverAbstract.navigate().back();
       	objWait.until(ExpectedConditions.visibilityOf(AmericanAirlines_lnk_AAdvantage));
       	
       	System.out.println("DEBUG:    Following specific other item found: " + "Aadvantage");

    	return true;
    }
    
    
    
    
	
	
}
