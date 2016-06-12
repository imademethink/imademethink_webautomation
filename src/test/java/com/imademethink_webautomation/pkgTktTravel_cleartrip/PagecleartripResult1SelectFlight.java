package com.imademethink_webautomation.pkgTktTravel_cleartrip;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.By.ByTagName;
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

public class PagecleartripResult1SelectFlight extends Page0Abstract{

	public PagecleartripResult1SelectFlight(WebDriver driver) {
		super(driver);
		//System.out.println("DEBUG:    PagecleartripResult1SelectFlight constructor");
		PageFactory.initElements(driver, this);
		//objLocal_PagecleartripResult2SelectFlight	= new PagecleartripResult2SelectFlight(driver);
		//objLocal_PagecleartripResult3Price		= new PagecleartripResult3Price(driver);
		//objLocal_PagecleartripResult99General 	= new PagecleartripResult99General(driver);
	}
	
	// elements for sorting search results
	@FindBy(css=".sortAsc")
	private List<WebElement> cleartrip_lst_labl_Result1SelectTravelsnSeatPage_SortByIcon_Ascending;
	@FindBy(css=".sortDes")
	private List<WebElement> cleartrip_lst_labl_Result1SelectTravelsnSeatPage_SortByIcon_Descending;
    @FindBy(linkText="Airline")
    private WebElement cleartrip_lnk_SelectFlight_SortBy_Airline;
    @FindBy(linkText="Depart")
    private WebElement cleartrip_lnk_SelectFlight_SortBy_DepartureTime;
    @FindBy(linkText="Arrive")
    private WebElement cleartrip_lnk_SelectFlight_SortBy_ArrivalTime;
    @FindBy(linkText="Duration")
    private WebElement cleartrip_lnk_SelectFlight_SortBy_Duration;
    @FindBy(linkText="Price")
    private WebElement cleartrip_lnk_SelectFlight_SortBy_Price;

    // general search result elements
    @FindBy(linkText="Modify search")
    private List<WebElement> cleartrip_lst_lnk_SelectFlight_GeneralOption_ModifySearch;
    @FindBy(css="#SearchBtn")
	private WebElement cleartrip_btn_SelectFlight_GeneralOption_ModifySearch_SearchFlights;
    @FindBy(css="#Adults")
	private WebElement cleartrip_drpdown_SelectFlight_GeneralOption_ModifySearch_AdultCount;
	@FindBy(css="li[class*='prev']")
	private List<WebElement> cleartrip_lst_btn_SelectFlight_GeneralOption_Calender_PrevMonth;
	@FindBy(css="li[class*='next']")
	private List<WebElement> cleartrip_lst_btn_SelectFlight_GeneralOption_Calender_NextMonth;
	@FindBy(css=".searchSummary")
	private WebElement cleartrip_btn_SelectFlight_GeneralOption_SearchSummary_RouteNames_BookingDetails;
	@FindBy(css="a[title='Flights'][rel='bToolTip']")
	private WebElement cleartrip_btn_SelectFlight_GeneralOption_TopRowIcon_Flights;
	@FindBy(css="a[title='Hotels'][rel='bToolTip']")
	private WebElement cleartrip_btn_SelectFlight_GeneralOption_TopRowIcon_Hotels;
	@FindBy(css="a[title='Packages'][rel='bToolTip']")
	private WebElement cleartrip_btn_SelectFlight_GeneralOption_TopRowIcon_Packages;
	@FindBy(css="a[title='Trains'][rel='bToolTip']")
	private WebElement cleartrip_btn_SelectFlight_GeneralOption_TopRowIcon_Trains;
	@FindBy(css="a[title='Buses'][rel='bToolTip']")
	private WebElement cleartrip_btn_SelectFlight_GeneralOption_TopRowIcon_Buses;
	@FindBy(linkText="Feedback")
	private WebElement cleartrip_lnk_SelectFlight_GeneralOption_TopRowIcon_Feedback;
	@FindBy(css=".resultsCount")
	private List<WebElement> cleartrip_lst_lnk_SelectFlight_GeneralOption_FlightFoundCount;
	@FindBy(linkText="Set a fare alert")
	private WebElement cleartrip_btn_SelectFlight_GeneralOption_SetFairAlert;
	@FindBy(css=".colZero.col4.miniCalendar>h6")
	private List<WebElement> cleartrip_lst_lnk_SelectFlight_GeneralOption_FlexibleDates;
	@FindBy(css=".rangeHandle.left")
	private List<WebElement> cleartrip_btn_SelectFlight_GeneralOption_SliderLeft_Price_DepartureTime_TripDuration_LayOverDuration;
	@FindBy(css=".rangeHandle.right")
	private List<WebElement> cleartrip_btn_SelectFlight_GeneralOption_SliderRight_Price_DepartureTime_TripDuration_LayOverDuration;
	@FindBy(css=".refundable")
	private WebElement cleartrip_tickbox_SelectFlight_GeneralOption_ShowOnlyRefundableFares;
	@FindBy(css="input[name='stops']")
	private List<WebElement> cleartrip_lst_tickbox_SelectFlight_GeneralOption_Stops;
	@FindBy(css="input[name='airlines']")
	private List<WebElement> cleartrip_lst_tickbox_SelectFlight_GeneralOption_VenderAirlines;
	@FindBy(css=".baggageSummary")
	private List<WebElement> cleartrip_lst_labl_SelectFlight_GeneralOption_BaggageInformation;
	@FindBy(css=".baggageSummary>.vendor>.airlineName>.name")
	private List<WebElement> cleartrip_lst_labl_SelectFlight_GeneralOption_BaggageInformation_Vendor;
	@FindBy(css=".baggageValue>strong")
	private List<WebElement> cleartrip_lst_labl_SelectFlight_GeneralOption_BaggageInformation_AllowedWeight;
		
	// elements for individual flight search result bundle
	@FindBy(css=".listItem.nonBundled")
	private List<WebElement> cleartrip_lst_SelectFlight_IndividualFlight_Options;
	
	By cleartrip_ByLinkText_SelectFlight_IndividualFlight_Options_DealsKnowMore 	= new ByLinkText ("Know more");
	By cleartrip_ByCssSelector_SelectFlight_IndividualFlight_Options_MainAirlinesLogo 	= new ByCssSelector ("img[src*='.png']");
	By cleartrip_ByClassName_SelectFlight_IndividualFlight_Options_DepartTime 		= new ByClassName ("depart");
	By cleartrip_ByClassName_SelectFlight_IndividualFlight_Options_ArriveTime 		= new ByClassName ("arrive");
	By cleartrip_ByClassName_SelectFlight_IndividualFlight_Options_Duration 		= new ByClassName ("duration");
	By cleartrip_ByLinkText_SelectFlight_IndividualFlight_Options_FlightItinerary 	= new ByLinkText ("Flight itinerary");
	By cleartrip_ByLinkText_SelectFlight_IndividualFlight_Options_FareRules 		= new ByLinkText ("Fare rules");
	By cleartrip_ByLinkText_SelectFlight_IndividualFlight_Options_BaggageInformation= new ByLinkText ("Baggage Information");
	By cleartrip_ByCssSelector_SelectFlight_IndividualFlight_Options_LayOver 		= new ByCssSelector ("span[title*='layover']");
	By cleartrip_ByClassName_SelectFlight_IndividualFlight_Options_FareValue 		= new ByClassName ("price");
	By cleartrip_ByCssSelector_SelectFlight_IndividualFlight_Options_BookButton		= new ByCssSelector (".price.actionPrice");
	By cleartrip_ByLinkText_SelectFlight_IndividualFlight_Options_MoreInfo			= new ByLinkText ("more info");
	By cleartrip_ByCssSelector_SelectFlight_IndividualFlight_Options_CityNameFromTo	= new ByCssSelector (".itinerary>h1");
	By cleartrip_ByCssSelector_SelectFlight_IndividualFlight_Options_JourneyDate	= new ByTagName ("small");
	By cleartrip_ByCssSelector_SelectFlight_IndividualFlight_Options_AirlineName	= new ByCssSelector (".name");
	By cleartrip_ByCssSelector_SelectFlight_IndividualFlight_Options_FlightNumber	= new ByCssSelector (".flightNumber");
	By cleartrip_ByCssSelector_SelectFlight_IndividualFlight_Options_JourneyClass	= new ByCssSelector (".travelClass");
	By cleartrip_ByCssSelector_SelectFlight_IndividualFlight_Options_IndividualAirlineLogo	= new ByCssSelector (".airLogo.fLeft>img");
	
	// elements on next page i.e. simple steps
	@FindBy(css="#itineraryBtn")
	private WebElement cleartrip_btn_Result2SimpleStepsPage_ContinueButton;
	@FindBy(css=".brand.forceHttp>img")
	private WebElement cleartrip_btn_Result2SimpleStepsPage_GoBackToHomePage;
	
    // searching in progress bar element
    @FindBy(css=".booking")
    private List<WebElement> cleartrip_lst_stripes_SearchResult_Count;
	By cleartrip_ByCssSelector_SelectFlight_IndividualFlight_SearchResultCount		= new ByCssSelector (".booking");

	// elements for calender
	@FindBy(css=".msUnicode")
    private List<WebElement> cleartrip_lst_btn_Result2SimpleStepsPage_CalenderArrow;
	@FindBy(css=".fareCalendar.mainCalendar.srpCalendar")
    private WebElement cleartrip_labl_Result2SimpleStepsPage_Calender;
	By cleartrip_ByCssSelector_SelectFlight_Calender								= new ByCssSelector (".fareCalendar.mainCalendar.srpCalendar");
	By cleartrip_ByCssSelector_SelectFlight_CalenderIndividualDate					= new ByCssSelector (".miniDate.date");

	// elements available on left hand side of search result
	@FindBy(css="input[name='stops']")
    private List<WebElement> cleartrip_lst_tickbox_Result2SimpleStepsPage_NumberOfFlightStops;
	@FindBy(css=".price.rangeSlider>.rangeHandle.left")
    private WebElement cleartrip_btn_slider_Result2SimpleStepsPage_SliderPriceLeft;
	@FindBy(css=".price.rangeSlider>.rangeHandle.right")
    private WebElement cleartrip_btn_slider_Result2SimpleStepsPage_SliderPriceRight;
	@FindBy(css=".departureTime.rangeSlider>.rangeHandle.left")
    private WebElement cleartrip_btn_slider_Result2SimpleStepsPage_SliderDepartureTimeLeft;
	@FindBy(css=".departureTime.rangeSlider>.rangeHandle.right")
    private WebElement cleartrip_btn_slider_Result2SimpleStepsPage_SliderDepartureTimeRight;
	@FindBy(css=".tripDuration.rangeSlider>.rangeHandle.left")
    private WebElement cleartrip_btn_slider_Result2SimpleStepsPage_SliderTripDurationLeft;
	@FindBy(css=".tripDuration.rangeSlider>.rangeHandle.right")
    private WebElement cleartrip_btn_slider_Result2SimpleStepsPage_SliderTripDurationRight;
	@FindBy(css=".layoverDuration.rangeSlider>.rangeHandle.left")
    private WebElement cleartrip_btn_slider_Result2SimpleStepsPage_SliderLayoverDurationLeft;
	@FindBy(css=".layoverDuration.rangeSlider>.rangeHandle.right")
    private WebElement cleartrip_btn_slider_Result2SimpleStepsPage_SliderLayoverDurationRight;
	
    // error message
    @FindBy(id="homeErrorMessage")
    private WebElement cleartrip_labl_MainPageErrors;
    @FindBy(css=".warningMessage>h2")
    private WebElement cleartrip_labl_NoFlightFoundWarningMsg;
    
    // other page elements
    @FindBy(css=".span.span19.truncate")
	private WebElement cleartrip_labl_HomePage_UserSection_Heading;
    
    // other elements
//	@FindBy(css=".fdct_inst>a")
//	private WebElement cleartrip_;	

    // every page object has it's local private wait with fixed 10 sec delay
    private WebDriverWait objWait 		= new WebDriverWait(this.objWebDriverAbstract, 10);   
    private WebDriverWait objWaitShort 	= new WebDriverWait(this.objWebDriverAbstract, 3);

    
	public boolean cleartrip_Validate_BasicSearchInformation(String strSearchResultInformationIemsToCheck){
		
		boolean bcleartrip_ThisElementValidationStatus = false;
		
		if (strSearchResultInformationIemsToCheck.contains("General_options__")){
			bcleartrip_ThisElementValidationStatus =  cleartrip_Validate_BasicSearchInformation_GeneralOptions(strSearchResultInformationIemsToCheck);}
		
		if (strSearchResultInformationIemsToCheck.contains("General_options_individual_flight__")){
			bcleartrip_ThisElementValidationStatus = cleartrip_Validate_BasicSearchInformation_GeneralOptions_Individual_Flight(strSearchResultInformationIemsToCheck);}
		
		if (strSearchResultInformationIemsToCheck.contains("Sortby_options__")){
			bcleartrip_ThisElementValidationStatus = cleartrip_Validate_BasicSearchInformation_GeneralOptions_SortBy(strSearchResultInformationIemsToCheck);}
		
		if (bcleartrip_ThisElementValidationStatus) { /*System.out.println("RESULT::PASS"); */}
		else{
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Atleast one supported element NOT found in Basic search information");
			objSoftAssert.fail("ERROR:    Atleast one supported element NOT found in Basic search information");
		}
		
		return bcleartrip_ThisElementValidationStatus;
	}
	
	public boolean cleartrip_Validate_EndToEnd_Search_Scenario__TYPE3_CASE1(){

		boolean bcleartrip_ThisElementValidationStatus 		= true;
		
		System.out.println("DEBUG:    Booking ticket for first flight search result");
		cleartrip_Sorby_and_SortingType("Airline","ascending");

		// choose first search result
		cleartrip_lst_SelectFlight_IndividualFlight_Options
			.get(0)
			.findElement(cleartrip_ByCssSelector_SelectFlight_IndividualFlight_Options_BookButton)
			.click();

		try{objWait.until(ExpectedConditions.visibilityOf(cleartrip_btn_Result2SimpleStepsPage_ContinueButton));}
		catch(Exception e){
			System.out.println("ERROR:    Error occured in search results for TYPE3_CASE1 - upto simple steps page");
			objSoftAssert.fail("ERROR:    Error occured in search results for TYPE3_CASE1 - upto simple steps page");
			bcleartrip_ThisElementValidationStatus = false;
		}

		return bcleartrip_ThisElementValidationStatus;
	}
	
	public boolean cleartrip_Validate_EndToEnd_Search_Scenario__TYPE3_CASE2(){

		boolean bcleartrip_ThisElementValidationStatus 		= true;
		Actions objActionsBldr_cleartrip_General 			= new Actions(this.objWebDriverAbstract);

		System.out.println("DEBUG:    Checking baggage information for the second search result");
		cleartrip_Sorby_and_SortingType("Airline","descending");

		// mpve mouse to the Book button so that baggage information element is visible
		objActionsBldr_cleartrip_General
			.moveToElement(cleartrip_lst_SelectFlight_IndividualFlight_Options
							.get(1)
							.findElement(cleartrip_ByCssSelector_SelectFlight_IndividualFlight_Options_BookButton))
			.build()
			.perform();
		
		// choose second search result
		cleartrip_lst_SelectFlight_IndividualFlight_Options
			.get(1)
			.findElement(cleartrip_ByLinkText_SelectFlight_IndividualFlight_Options_BaggageInformation)
			.click();

		objWait.until(ExpectedConditions.visibilityOfAllElements(cleartrip_lst_labl_SelectFlight_GeneralOption_BaggageInformation));
		
		for (int nLocal=0; nLocal < cleartrip_lst_labl_SelectFlight_GeneralOption_BaggageInformation.size() ; nLocal++){

			System.out.println("DEBUG:    Baggage summary for vendor : " + 
					cleartrip_lst_labl_SelectFlight_GeneralOption_BaggageInformation_Vendor.get(nLocal).getText());
			System.out.println("DEBUG:     Check-in : " + 
					cleartrip_lst_labl_SelectFlight_GeneralOption_BaggageInformation_AllowedWeight.get(0 + (2 * nLocal)).getText());
			System.out.println("DEBUG:     Cabin    : " + 
					cleartrip_lst_labl_SelectFlight_GeneralOption_BaggageInformation_AllowedWeight.get(1 + (2 * nLocal)).getText());
		}

		return bcleartrip_ThisElementValidationStatus;
	}

	public boolean cleartrip_Validate_EndToEnd_Search_Scenario__TYPE3_CASE3(){

		boolean bcleartrip_ThisElementValidationStatus 		= true;
		Actions objActionsBldr_cleartrip_General 			= new Actions(this.objWebDriverAbstract);
		boolean bCashbackOfferFound							= false;
		
		System.out.println("DEBUG:    Checking cash back offer for the last search result");
		cleartrip_Sorby_and_SortingType("Depart","ascending");

		// move mouse to the Book button so that baggage information element is visible
		objActionsBldr_cleartrip_General
			.moveToElement(cleartrip_lst_SelectFlight_IndividualFlight_Options
							.get(-1 + cleartrip_lst_SelectFlight_IndividualFlight_Options.size())
							.findElement(cleartrip_ByLinkText_SelectFlight_IndividualFlight_Options_DealsKnowMore))
			.build()
			.perform();

		// choose last search result
		cleartrip_lst_SelectFlight_IndividualFlight_Options
			.get( -1 + cleartrip_lst_SelectFlight_IndividualFlight_Options.size())
			.findElement(cleartrip_ByLinkText_SelectFlight_IndividualFlight_Options_DealsKnowMore)
			.click();

		try{objWait.until(ExpectedConditions.numberOfWindowsToBe(2));
		    // cash back offer window available
			String cleartrip_ParentWindowHandle 		= objWebDriverAbstractGeneralUse.getWindowHandle();
			Set<String> cleartrip_set_AllWindowHandles 	= objWebDriverAbstractGeneralUse.getWindowHandles();
			Iterator<String> cleartrip_itr_WindowHandle = cleartrip_set_AllWindowHandles.iterator();
			
			while (cleartrip_itr_WindowHandle.hasNext()){
				objWebDriverAbstractGeneralUse.switchTo().window(cleartrip_itr_WindowHandle.next());
					if (objWebDriverAbstractGeneralUse.getWindowHandle().contains(cleartrip_ParentWindowHandle)) continue;
					
					if(objWebDriverAbstractGeneralUse.getTitle().contains("cashback")) {
						bCashbackOfferFound = true;
						System.out.println("DEBUG:    Cashback offer window title is: " + objWebDriverAbstractGeneralUse.getTitle());
					}
						
					objWebDriverAbstractGeneralUse.close();
			}
			objWebDriverAbstractGeneralUse.switchTo().window(cleartrip_ParentWindowHandle);
		}catch(Exception e){
			bcleartrip_ThisElementValidationStatus = false;
		}

		if (!bcleartrip_ThisElementValidationStatus || !bCashbackOfferFound){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Error occured in search results for TYPE3_CASE3 - upto simple steps page - cash back offer window did not open");
			objSoftAssert.fail("ERROR:    Error occured in search results for TYPE3_CASE3 - upto simple steps page - cash back offer window did not open");
		}

		return bcleartrip_ThisElementValidationStatus;
	}
	
	public boolean cleartrip_Validate_EndToEnd_Search_Scenario__TYPE3_CASE4(){

		boolean bcleartrip_ThisElementValidationStatus 		= true;
		Select objSelect_cleartrip_General					= null;
		
		System.out.println("DEBUG:    Modifying search results for maximum adults count");
		cleartrip_Sorby_and_SortingType("Depart","descending");

		cleartrip_lst_lnk_SelectFlight_GeneralOption_ModifySearch.get(0).click();
		objWait.until(ExpectedConditions.visibilityOf(cleartrip_btn_SelectFlight_GeneralOption_ModifySearch_SearchFlights));

		objSelect_cleartrip_General = new Select (cleartrip_drpdown_SelectFlight_GeneralOption_ModifySearch_AdultCount);
		objSelect_cleartrip_General.selectByIndex(-1 + objSelect_cleartrip_General.getOptions().size());
		cleartrip_btn_SelectFlight_GeneralOption_ModifySearch_SearchFlights.click();

		try{objWaitShort.until(ExpectedConditions.visibilityOf(cleartrip_labl_MainPageErrors));
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Invalid input parameters or no valid search results found");
			objSoftAssert.fail("ERROR:    Invalid input parameters or no valid search results found");
			return false;
		}catch (Exception e){}
		
		// wait for longer time so that all elements to load 
		try{objWait.until(ExpectedConditions.visibilityOfAllElements(cleartrip_lst_stripes_SearchResult_Count));}
		catch (Exception e){
			try{objWait.until(ExpectedConditions.visibilityOfAllElements(cleartrip_lst_stripes_SearchResult_Count));}
			catch (Exception e1){}
		}
	
		if(!bcleartrip_ThisElementValidationStatus){
			if (cleartrip_lst_stripes_SearchResult_Count.size() < 1){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Invalid input parameters or no valid search results found__");
				objSoftAssert.fail("ERROR:    Invalid input parameters or no valid search results found__");
				bcleartrip_ThisElementValidationStatus = false;
			}
		}
		
		return bcleartrip_ThisElementValidationStatus;
	}
	
	public boolean cleartrip_Validate_EndToEnd_Search_Scenario__TYPE3_CASE5(){

		boolean bcleartrip_ThisElementValidationStatus 		= true;
		String strRandomDate								= String.valueOf(ClsGeneralInitTerminateAndOtherUtil.getPositiveRandomNumberBetweenRange(1,28));
		System.out.println("DEBUG:    Searching for random date results in next month calender");
		cleartrip_Sorby_and_SortingType("Arrive","ascending");

		cleartrip_lst_btn_Result2SimpleStepsPage_CalenderArrow.get(1).click();
		objWaitShort.until(ExpectedConditions.visibilityOf(cleartrip_lst_btn_Result2SimpleStepsPage_CalenderArrow.get(1)));

		// when new month calender is loaded, it has to cached freesh so find element starting fresh find element from basic web driver
		for (WebElement cleartrip_OneElement : objWebDriverAbstractGeneralUse
													.findElement(cleartrip_ByCssSelector_SelectFlight_Calender)
													.findElements(cleartrip_ByCssSelector_SelectFlight_CalenderIndividualDate)){
			if(! cleartrip_OneElement.isDisplayed()) continue;
			// select random date
			if (cleartrip_OneElement.getText().contains(strRandomDate)){
				System.out.println("DEBUG:    Searching following next months date for flights: " + cleartrip_OneElement.getText());
				cleartrip_OneElement.click();
				break;
			}
		}

		try{objWaitShort.until(ExpectedConditions.visibilityOf(cleartrip_labl_MainPageErrors));
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Invalid input parameters or no valid search results found");
			objSoftAssert.fail("ERROR:    Invalid input parameters or no valid search results found");
			return false;
		}catch (Exception e){}

		// wait for longer time so that all elements to load 
		try{objWait.until(ExpectedConditions.visibilityOfAllElements(cleartrip_lst_stripes_SearchResult_Count));}
		catch (Exception e){
			try{objWait.until(ExpectedConditions.visibilityOfAllElements(cleartrip_lst_stripes_SearchResult_Count));}
			catch (Exception e1){}
		}
	
		if(!bcleartrip_ThisElementValidationStatus){
			if (cleartrip_lst_stripes_SearchResult_Count.size() < 1){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Invalid input parameters or no valid search results found for next month");
				objSoftAssert.fail("ERROR:    Invalid input parameters or no valid search results found for next month");
				bcleartrip_ThisElementValidationStatus = false;
			}
		}
		
		return bcleartrip_ThisElementValidationStatus;
	}
 	
	public boolean cleartrip_Validate_EndToEnd_Search_Scenario__TYPE3_CASE6(){

		boolean bcleartrip_ThisElementValidationStatus 		= true;
		
		System.out.println("DEBUG:    Unchecking all available stops options after search result");
		cleartrip_Sorby_and_SortingType("Arrive","descending");

		for (WebElement cleartrip_OneElement : cleartrip_lst_tickbox_Result2SimpleStepsPage_NumberOfFlightStops){
			if(cleartrip_OneElement.isDisplayed()) cleartrip_OneElement.click();
		}

		// wait for longer time so that all elements to load 
		try{objWait.until(ExpectedConditions.visibilityOf(cleartrip_labl_NoFlightFoundWarningMsg));}
		catch (Exception e){
			try{objWait.until(ExpectedConditions.visibilityOf(cleartrip_labl_NoFlightFoundWarningMsg));}
			catch (Exception e1){}
		}
		
		if (cleartrip_labl_NoFlightFoundWarningMsg.isDisplayed()){
			System.out.println("DEBUG:    Following warning message observed: " + cleartrip_labl_NoFlightFoundWarningMsg.getText());			
		}else{
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Invalid input parameters or no valid search results found");
			objSoftAssert.fail("ERROR:    Invalid input parameters or no valid search results found");
			bcleartrip_ThisElementValidationStatus =  false;
		}
		
		return bcleartrip_ThisElementValidationStatus;
	}
 	
	public boolean cleartrip_Validate_EndToEnd_Search_Scenario__TYPE3_CASE7(){

		boolean bcleartrip_ThisElementValidationStatus 		= true;
		Actions objActionsBldr_cleartrip_General 			= new Actions(this.objWebDriverAbstract);
		
		System.out.println("DEBUG:    Checking cash back offer for the third search result in detailed view");
		cleartrip_Sorby_and_SortingType("Duration","ascending");

		// move mouse to the Book button so that baggage information element is visible
		objActionsBldr_cleartrip_General
			.moveToElement(cleartrip_lst_SelectFlight_IndividualFlight_Options
							.get(2)
							.findElement(cleartrip_ByLinkText_SelectFlight_IndividualFlight_Options_DealsKnowMore))
			.build()
			.perform();

		// choose third search result
		cleartrip_lst_SelectFlight_IndividualFlight_Options
			.get(2)
			.findElement(cleartrip_ByLinkText_SelectFlight_IndividualFlight_Options_FlightItinerary)
			.click();
		
		// click on cash back deals more info option
		cleartrip_lst_SelectFlight_IndividualFlight_Options
			.get(2)
			.findElement(cleartrip_ByLinkText_SelectFlight_IndividualFlight_Options_MoreInfo)
			.click();
		
		// wait for longer time so that all elements to load 
		try{objWait.until(ExpectedConditions.titleContains("Cleartrip"));}
		catch (Exception e){
			try{objWait.until(ExpectedConditions.titleContains("Cleartrip"));}
			catch (Exception e1){}
		}

		if (objWebDriverAbstractGeneralUse.getTitle().contains("cashback")){
			bcleartrip_ThisElementValidationStatus = true;
			System.out.println("DEBUG:    Cashback offer full title is: " + objWebDriverAbstractGeneralUse.getTitle());
		}else{
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Error occured in search results for TYPE3_CASE7 - upto simple steps page - cash back offer in detailed view");
			objSoftAssert.fail("ERROR:    Error occured in search results for TYPE3_CASE7 - upto simple steps page - cash back offer in detailed view");
		}

		return bcleartrip_ThisElementValidationStatus;
	}

	public boolean cleartrip_Validate_EndToEnd_Search_Scenario__TYPE3_CASE8(){

		boolean bcleartrip_ThisElementValidationStatus 		= true;

		List<String>  cleartrip_lst_String_FilterByOptions = Arrays.asList("Airline","Depart","Arrive","Duration","Price");
		Collections.shuffle(cleartrip_lst_String_FilterByOptions);

		System.out.println("DEBUG:    Sorting results by random three type");
		cleartrip_Sorby_and_SortingType(cleartrip_lst_String_FilterByOptions.get(0),"ascending");
		cleartrip_Sorby_and_SortingType(cleartrip_lst_String_FilterByOptions.get(1),"ascending");
		cleartrip_Sorby_and_SortingType(cleartrip_lst_String_FilterByOptions.get(2),"descending");

		return bcleartrip_ThisElementValidationStatus;
	}
	
	public boolean cleartrip_Validate_EndToEnd_Search_Scenario__TYPE3_CASE9(){

		boolean bcleartrip_ThisElementValidationStatus 		= true;
		Actions objActionsBldr_cleartrip_General 			= new Actions(this.objWebDriverAbstract);

		System.out.println("DEBUG:    Following count of results are found after sliding: " + cleartrip_lst_stripes_SearchResult_Count.size());			

		System.out.println("DEBUG:    Reducing price range of using slider");
		cleartrip_Sorby_and_SortingType("Price","ascending");

		objActionsBldr_cleartrip_General
			.clickAndHold(cleartrip_btn_slider_Result2SimpleStepsPage_SliderPriceRight)
			.moveByOffset(-40, 0)
			.release()
			.build()
			.perform();

		// wait for longer time so that all elements to load 
		try{objWait.until(ExpectedConditions.visibilityOfAllElements(cleartrip_lst_stripes_SearchResult_Count));}
		catch (Exception e){
			try{objWait.until(ExpectedConditions.visibilityOfAllElements(cleartrip_lst_stripes_SearchResult_Count));}
			catch (Exception e1){}
		}
		
		if (cleartrip_lst_stripes_SearchResult_Count.size() > 0){
			System.out.println("DEBUG:    Following count of results are found after sliding: " + cleartrip_lst_stripes_SearchResult_Count.size());			
		}else{
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Invalid input parameters or no valid search results found");
			objSoftAssert.fail("ERROR:    Invalid input parameters or no valid search results found");
			bcleartrip_ThisElementValidationStatus =  false;
		}
		
		return bcleartrip_ThisElementValidationStatus;
	}
 	
	public boolean cleartrip_Validate_EndToEnd_Search_Scenario__TYPE3_CASE10(){

		boolean bcleartrip_ThisElementValidationStatus 		= true;
		Actions objActionsBldr_cleartrip_General 			= new Actions(this.objWebDriverAbstract);

		System.out.println("DEBUG:    Using any two sliders to refine the search");
		cleartrip_Sorby_and_SortingType("Price","descending");

		objActionsBldr_cleartrip_General
			.clickAndHold(cleartrip_btn_slider_Result2SimpleStepsPage_SliderPriceRight)
			.moveByOffset(-40, 0)
			.release()
			.build()
			.perform();
		objActionsBldr_cleartrip_General
			.clickAndHold(cleartrip_btn_slider_Result2SimpleStepsPage_SliderDepartureTimeLeft)
			.moveByOffset(20, 0)
			.release()
			.build()
			.perform();
		
		// wait for longer time so that all elements to load 
		try{objWait.until(ExpectedConditions.visibilityOfAllElements(cleartrip_lst_stripes_SearchResult_Count));}
		catch (Exception e){
			try{objWait.until(ExpectedConditions.visibilityOfAllElements(cleartrip_lst_stripes_SearchResult_Count));}
			catch (Exception e1){}
		}
		
		if (cleartrip_lst_stripes_SearchResult_Count.size() > 0){
			System.out.println("DEBUG:    Following count of results are found after sliding: " + cleartrip_lst_stripes_SearchResult_Count.size());			
		}else{
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Invalid input parameters or no valid search results found");
			objSoftAssert.fail("ERROR:    Invalid input parameters or no valid search results found");
			bcleartrip_ThisElementValidationStatus =  false;
		}
		
		return bcleartrip_ThisElementValidationStatus;
	}
 	
	public boolean cleartrip_Validate_EndToEnd_Search_Scenario__TYPE3_CASE11(){

		boolean bcleartrip_ThisElementValidationStatus 		= true;
		
		System.out.println("DEBUG:    Booking ticket for first flight search result");

		// choose first search result
		cleartrip_lst_SelectFlight_IndividualFlight_Options
			.get(0)
			.findElement(cleartrip_ByCssSelector_SelectFlight_IndividualFlight_Options_BookButton)
			.click();

		// wait for longer time so that all elements to load 
		try{objWait.until(ExpectedConditions.visibilityOf(cleartrip_btn_Result2SimpleStepsPage_ContinueButton));}
		catch (Exception e){
			try{objWait.until(ExpectedConditions.visibilityOf(cleartrip_btn_Result2SimpleStepsPage_ContinueButton));}
			catch (Exception e1){}
		}
		
		if(! cleartrip_btn_Result2SimpleStepsPage_ContinueButton.isDisplayed()){
			System.out.println("ERROR:    Error occured in search results for TYPE3_CASE1 - upto simple steps page");
			objSoftAssert.fail("ERROR:    Error occured in search results for TYPE3_CASE1 - upto simple steps page");
			bcleartrip_ThisElementValidationStatus = false;			
		}else{
			// go back to home page to sign out
			cleartrip_btn_Result2SimpleStepsPage_GoBackToHomePage.click();
			// wait for longer time so that all elements to load 
			try{objWait.until(ExpectedConditions.visibilityOf(cleartrip_labl_HomePage_UserSection_Heading));}
			catch (Exception e){
				try{objWait.until(ExpectedConditions.visibilityOf(cleartrip_labl_HomePage_UserSection_Heading));}
				catch (Exception e1){}
			}
		}

		return bcleartrip_ThisElementValidationStatus;
	}
	
	public boolean cleartrip_Validate_EndToEnd_Search_Scenario__Until_Payment_Section(){
		
		boolean bcleartrip_ThisElementValidationStatus 		= true;
		
		System.out.println("DEBUG:    Booking ticket for first flight search result");

		// choose first search result
		cleartrip_lst_SelectFlight_IndividualFlight_Options
			.get(0)
			.findElement(cleartrip_ByCssSelector_SelectFlight_IndividualFlight_Options_BookButton)
			.click();

		// wait for longer time so that all elements to load 
		try{objWait.until(ExpectedConditions.visibilityOf(cleartrip_btn_Result2SimpleStepsPage_ContinueButton));}
		catch (Exception e){
			try{objWait.until(ExpectedConditions.visibilityOf(cleartrip_btn_Result2SimpleStepsPage_ContinueButton));}
			catch (Exception e1){}
		}
		
		if(! cleartrip_btn_Result2SimpleStepsPage_ContinueButton.isDisplayed()){
			System.out.println("ERROR:    Error occured in search results for TYPE3_CASE1 - upto simple steps page");
			objSoftAssert.fail("ERROR:    Error occured in search results for TYPE3_CASE1 - upto simple steps page");
			bcleartrip_ThisElementValidationStatus = false;			
		}

		return bcleartrip_ThisElementValidationStatus;
	}
	
	
	
	
	

	
	
	
	
	
	// helper methods
	private boolean  cleartrip_Validate_BasicSearchInformation_GeneralOptions(String strSearchResultInformationIemsToCheck){
		
		boolean bcleartrip_ThisElementValidationStatus 		= true;

		strSearchResultInformationIemsToCheck 	= strSearchResultInformationIemsToCheck.replace("General_options__ ", "");
		String[]  strArrGeneralOptionsElements 	= ClsGeneralInitTerminateAndOtherUtil.splitThisString(strSearchResultInformationIemsToCheck," __ ");
		
		for (String strSingleGeneralOptionsElement : strArrGeneralOptionsElements){
			boolean bcleartrip_LocalElementValidationStatus = false;

			switch (strSingleGeneralOptionsElement){
				case "Modify search":
					if(cleartrip_lst_lnk_SelectFlight_GeneralOption_ModifySearch.get(0).isDisplayed()){
						bcleartrip_LocalElementValidationStatus = true;
						// click and unclick the option
						cleartrip_lst_lnk_SelectFlight_GeneralOption_ModifySearch.get(0).click();
							try{objWaitShort.until(ExpectedConditions.visibilityOf(cleartrip_lst_lnk_SelectFlight_GeneralOption_ModifySearch.get(0)));
							}catch (Exception e){/*System.out.println("DEBUG:    This exception to be ignored!");*/}
						cleartrip_lst_lnk_SelectFlight_GeneralOption_ModifySearch.get(0).click();}
							try{objWaitShort.until(ExpectedConditions.visibilityOf(cleartrip_lst_lnk_SelectFlight_GeneralOption_ModifySearch.get(0)));
							}catch (Exception e){/*System.out.println("DEBUG:    This exception to be ignored!");*/}
						break;
				case "List and Calender":
					if(		cleartrip_lst_btn_SelectFlight_GeneralOption_Calender_PrevMonth.get(0).isEnabled() &&
							cleartrip_lst_btn_SelectFlight_GeneralOption_Calender_NextMonth.get(0).isDisplayed()
					  ){
						bcleartrip_LocalElementValidationStatus = true;
						// click and next month then prev month arrow
						cleartrip_lst_btn_SelectFlight_GeneralOption_Calender_NextMonth.get(0).click();
						cleartrip_lst_btn_SelectFlight_GeneralOption_Calender_PrevMonth.get(0).click();
						}
					break;
				case "From To route name":
					if(cleartrip_btn_SelectFlight_GeneralOption_SearchSummary_RouteNames_BookingDetails.findElements(By.cssSelector(".truncate")).size() >0){
						bcleartrip_LocalElementValidationStatus = true;
						System.out.println("DEBUG:    Booking performed for following route: " + 
									cleartrip_btn_SelectFlight_GeneralOption_SearchSummary_RouteNames_BookingDetails.
										findElements(By.cssSelector(".truncate")).get(0).getText());
					}
					break;
				case "Booking day date month passener count":
					if(cleartrip_btn_SelectFlight_GeneralOption_SearchSummary_RouteNames_BookingDetails.findElements(By.cssSelector(".truncate")).size() >0){
						bcleartrip_LocalElementValidationStatus = true;
						System.out.println("DEBUG:    Booking details : " + 
									cleartrip_btn_SelectFlight_GeneralOption_SearchSummary_RouteNames_BookingDetails.
										findElements(By.cssSelector(".truncate")).get(1).getText());
					}
					break;
				case "icon__Flights":
					bcleartrip_LocalElementValidationStatus = cleartrip_btn_SelectFlight_GeneralOption_TopRowIcon_Flights.isDisplayed();
					break;
				case "icon__Hotels":
					bcleartrip_LocalElementValidationStatus = cleartrip_btn_SelectFlight_GeneralOption_TopRowIcon_Hotels.isDisplayed();
					break;
				case "icon__Packages":
					bcleartrip_LocalElementValidationStatus = cleartrip_btn_SelectFlight_GeneralOption_TopRowIcon_Packages.isDisplayed();
					break;
				case "icon_Trains":
					bcleartrip_LocalElementValidationStatus = cleartrip_btn_SelectFlight_GeneralOption_TopRowIcon_Trains.isDisplayed();
					break;
				case "icon__Buses":
					bcleartrip_LocalElementValidationStatus = cleartrip_btn_SelectFlight_GeneralOption_TopRowIcon_Buses.isDisplayed();
					break;
				case "lnk__Feedback":
					bcleartrip_LocalElementValidationStatus = cleartrip_lnk_SelectFlight_GeneralOption_TopRowIcon_Feedback.isDisplayed();
					break;
				case "labl__n_out_of_total_flights":
					bcleartrip_LocalElementValidationStatus = cleartrip_lst_lnk_SelectFlight_GeneralOption_FlightFoundCount.get(1).isDisplayed();
					break;
				case "lnk__Set a fare alert":
					bcleartrip_LocalElementValidationStatus = cleartrip_btn_SelectFlight_GeneralOption_SetFairAlert.isDisplayed();
					break;
				case "labl__Flexible with dates?":
					bcleartrip_LocalElementValidationStatus = cleartrip_lst_lnk_SelectFlight_GeneralOption_FlexibleDates.get(1).isDisplayed();
					break;
				case "slider__Price_Range":
					if (cleartrip_btn_SelectFlight_GeneralOption_SliderLeft_Price_DepartureTime_TripDuration_LayOverDuration.get(0).isDisplayed() && 
						cleartrip_btn_SelectFlight_GeneralOption_SliderRight_Price_DepartureTime_TripDuration_LayOverDuration.get(0).isDisplayed()){
							bcleartrip_LocalElementValidationStatus = true;}
					break;
				case "tick_box__Show only refundable fares":
					bcleartrip_LocalElementValidationStatus = cleartrip_tickbox_SelectFlight_GeneralOption_ShowOnlyRefundableFares.isDisplayed();
					break;
				case "tick_box__Stops":
					if (cleartrip_lst_tickbox_SelectFlight_GeneralOption_Stops.size() > 0){
							bcleartrip_LocalElementValidationStatus = true;}
					break;
				case "tick_box__Airlines":
					if (cleartrip_lst_tickbox_SelectFlight_GeneralOption_VenderAirlines.size() > 0){
							bcleartrip_LocalElementValidationStatus = true;}
					break;
				case "slider__Departure time":
					if (cleartrip_btn_SelectFlight_GeneralOption_SliderLeft_Price_DepartureTime_TripDuration_LayOverDuration.get(1).isDisplayed() && 
						cleartrip_btn_SelectFlight_GeneralOption_SliderRight_Price_DepartureTime_TripDuration_LayOverDuration.get(1).isDisplayed()){
							bcleartrip_LocalElementValidationStatus = true;}
					break;
				case "slider__Trip duration":
					if (cleartrip_btn_SelectFlight_GeneralOption_SliderLeft_Price_DepartureTime_TripDuration_LayOverDuration.get(2).isDisplayed() && 
						cleartrip_btn_SelectFlight_GeneralOption_SliderRight_Price_DepartureTime_TripDuration_LayOverDuration.get(2).isDisplayed()){
							bcleartrip_LocalElementValidationStatus = true;}
					break;
				case "slider__Layover duration":
					if (cleartrip_btn_SelectFlight_GeneralOption_SliderLeft_Price_DepartureTime_TripDuration_LayOverDuration.get(3).isDisplayed() && 
						cleartrip_btn_SelectFlight_GeneralOption_SliderRight_Price_DepartureTime_TripDuration_LayOverDuration.get(3).isDisplayed()){
							bcleartrip_LocalElementValidationStatus = true;}
					break;
				default:
					break;
			}
			if(bcleartrip_LocalElementValidationStatus){
				System.out.println("RESULT::PASS");
				System.out.println("DEBUG:    Following basic search information element for general options is found: " + strSingleGeneralOptionsElement);}
			else{
				bcleartrip_ThisElementValidationStatus = false;
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following basic search information element for general options is NOT found: " + strSingleGeneralOptionsElement);
				objSoftAssert.fail("ERROR:    Following basic search information element for general options is NOT found: " + strSingleGeneralOptionsElement);}
		}
		
		return bcleartrip_ThisElementValidationStatus;
	}
	
	private boolean  cleartrip_Validate_BasicSearchInformation_GeneralOptions_Individual_Flight(String strSearchResultInformationIemsToCheck){
		
		boolean bcleartrip_ThisElementValidationStatus 		= true;

		strSearchResultInformationIemsToCheck 					= strSearchResultInformationIemsToCheck.replace("General_options_individual_flight__ ", "");
		String[]  strArrGeneralOptionsIndividualFlightElements 	= ClsGeneralInitTerminateAndOtherUtil.splitThisString(strSearchResultInformationIemsToCheck," __ ");
		
		// click on the first individual flight result bundle
		WebElement cleartrip_SelectFlight_FirstIndividualFlight_Options = cleartrip_lst_SelectFlight_IndividualFlight_Options.get(0);
		cleartrip_SelectFlight_FirstIndividualFlight_Options.click();

		for (String strSingleGeneralOptionsIndividualFlightElement : strArrGeneralOptionsIndividualFlightElements){
			boolean bcleartrip_LocalElementValidationStatus = false;

			switch (strSingleGeneralOptionsIndividualFlightElement){
				case "lnk__Deals Know more":
					bcleartrip_LocalElementValidationStatus = 
						cleartrip_SelectFlight_FirstIndividualFlight_Options
							.findElement(cleartrip_ByLinkText_SelectFlight_IndividualFlight_Options_DealsKnowMore)
							.isDisplayed();
					break;
				case "img__Airlines_logo_main":
					if (cleartrip_SelectFlight_FirstIndividualFlight_Options
						.findElements(cleartrip_ByCssSelector_SelectFlight_IndividualFlight_Options_MainAirlinesLogo)
						.size() >0)
							bcleartrip_LocalElementValidationStatus = true;
					break;
				case "labl__Depart_time":
					bcleartrip_LocalElementValidationStatus = 
						cleartrip_SelectFlight_FirstIndividualFlight_Options
							.findElement(cleartrip_ByClassName_SelectFlight_IndividualFlight_Options_DepartTime)
							.isDisplayed();
					break;
				case "labl__Arrive_time":
					bcleartrip_LocalElementValidationStatus = 
						cleartrip_SelectFlight_FirstIndividualFlight_Options
							.findElement(cleartrip_ByClassName_SelectFlight_IndividualFlight_Options_ArriveTime)
							.isDisplayed();
					break;
				case "labl_Duration":
					bcleartrip_LocalElementValidationStatus = 
						cleartrip_SelectFlight_FirstIndividualFlight_Options
							.findElement(cleartrip_ByClassName_SelectFlight_IndividualFlight_Options_Duration)
							.isDisplayed();
					break;
				case "lnk__Flight itinerary":
					bcleartrip_LocalElementValidationStatus = 
						cleartrip_SelectFlight_FirstIndividualFlight_Options
							.findElement(cleartrip_ByLinkText_SelectFlight_IndividualFlight_Options_FlightItinerary)
							.isDisplayed();
					break;
				case "lnk__Fare rules":
					bcleartrip_LocalElementValidationStatus = 
						cleartrip_SelectFlight_FirstIndividualFlight_Options
							.findElement(cleartrip_ByLinkText_SelectFlight_IndividualFlight_Options_FareRules)
							.isDisplayed();
					break;
				case "lnk__Baggage Information":
					bcleartrip_LocalElementValidationStatus = 
						cleartrip_SelectFlight_FirstIndividualFlight_Options
							.findElement(cleartrip_ByLinkText_SelectFlight_IndividualFlight_Options_BaggageInformation)
							.isDisplayed();
					break;
				case "img__Long layover optional":
					// this image is optional, sometimes layover may not be observed
					bcleartrip_LocalElementValidationStatus = true;
					if(cleartrip_SelectFlight_FirstIndividualFlight_Options
							.findElements(cleartrip_ByCssSelector_SelectFlight_IndividualFlight_Options_LayOver)
							.size() > 0)
											System.out.println("DEBUG:    Layover is observed");
					break;
				case "labl__Fare value":
					bcleartrip_LocalElementValidationStatus = 
						cleartrip_SelectFlight_FirstIndividualFlight_Options
							.findElement(cleartrip_ByClassName_SelectFlight_IndividualFlight_Options_FareValue)
							.isDisplayed();
					break;
				case "btn__Book":
					bcleartrip_LocalElementValidationStatus = 
						cleartrip_SelectFlight_FirstIndividualFlight_Options
							.findElement(cleartrip_ByCssSelector_SelectFlight_IndividualFlight_Options_BookButton)
							.isDisplayed();
					break;
				case "lnk__Deals more info":
					bcleartrip_LocalElementValidationStatus = 
						cleartrip_SelectFlight_FirstIndividualFlight_Options
							.findElement(cleartrip_ByLinkText_SelectFlight_IndividualFlight_Options_MoreInfo)
							.isDisplayed();
					break;
				case "labl__City Name From and To":
					bcleartrip_LocalElementValidationStatus = 
						cleartrip_SelectFlight_FirstIndividualFlight_Options
							.findElement(cleartrip_ByCssSelector_SelectFlight_IndividualFlight_Options_CityNameFromTo)
							.isDisplayed();
					break;
				case "labl__Journey date":
					bcleartrip_LocalElementValidationStatus = 
						cleartrip_SelectFlight_FirstIndividualFlight_Options
							.findElement(cleartrip_ByCssSelector_SelectFlight_IndividualFlight_Options_CityNameFromTo)
							.findElement(cleartrip_ByCssSelector_SelectFlight_IndividualFlight_Options_JourneyDate)
							.isDisplayed();
					break;
					
					
				case "labl__Airlines name":
					int ncleartrip_SelectFlight_IndividualFlight_Options_Count_AirlineName = 
								cleartrip_SelectFlight_FirstIndividualFlight_Options
										.findElements(cleartrip_ByCssSelector_SelectFlight_IndividualFlight_Options_AirlineName)
										.size();
					if (ncleartrip_SelectFlight_IndividualFlight_Options_Count_AirlineName >0){
							System.out.println("DEBUG:    For conntected flights following count of airlines names observed: " + 
									ncleartrip_SelectFlight_IndividualFlight_Options_Count_AirlineName);
							bcleartrip_LocalElementValidationStatus = true;}
					break;
				case "labl__Flight number":
					int ncleartrip_SelectFlight_IndividualFlight_Options_Count_FlightNumber = 
					cleartrip_SelectFlight_FirstIndividualFlight_Options
							.findElements(cleartrip_ByCssSelector_SelectFlight_IndividualFlight_Options_FlightNumber)
							.size();
					if (ncleartrip_SelectFlight_IndividualFlight_Options_Count_FlightNumber >0){
							System.out.println("DEBUG:    For conntected flights following count of flight numbers observed: " + 
									ncleartrip_SelectFlight_IndividualFlight_Options_Count_FlightNumber);
							bcleartrip_LocalElementValidationStatus = true;}
					break;
				case "labl__Journey class":
					int ncleartrip_SelectFlight_IndividualFlight_Options_Count_JourneyClass = 
					cleartrip_SelectFlight_FirstIndividualFlight_Options
							.findElements(cleartrip_ByCssSelector_SelectFlight_IndividualFlight_Options_JourneyClass)
							.size();
					if (ncleartrip_SelectFlight_IndividualFlight_Options_Count_JourneyClass >0){
							System.out.println("DEBUG:    For conntected flights following count of journey class observed: " + 
									ncleartrip_SelectFlight_IndividualFlight_Options_Count_JourneyClass);
							bcleartrip_LocalElementValidationStatus = true;}
					break;
				case "img__Airlines logo":
					int ncleartrip_SelectFlight_IndividualFlight_Options_Count_AirlinesLogo = 
					cleartrip_SelectFlight_FirstIndividualFlight_Options
							.findElements(cleartrip_ByCssSelector_SelectFlight_IndividualFlight_Options_IndividualAirlineLogo)
							.size();
					if (ncleartrip_SelectFlight_IndividualFlight_Options_Count_AirlinesLogo >0){
							System.out.println("DEBUG:    For conntected flights following count of airline logo observed: " + 
									ncleartrip_SelectFlight_IndividualFlight_Options_Count_AirlinesLogo);
							bcleartrip_LocalElementValidationStatus = true;}
					break;
					
				default:
					break;
			}
			if(bcleartrip_LocalElementValidationStatus){
				bcleartrip_ThisElementValidationStatus = true;
				System.out.println("RESULT::PASS");
				System.out.println("DEBUG:    Following basic search information element for general options individual flight is found: " + strSingleGeneralOptionsIndividualFlightElement);}
			else{
				bcleartrip_ThisElementValidationStatus = false;
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following basic search information element for general options individual flight is NOT found: " + strSingleGeneralOptionsIndividualFlightElement);
				objSoftAssert.fail("ERROR:    Following basic search information element for general options individual flight is NOT found: " + strSingleGeneralOptionsIndividualFlightElement);}
		}

		return bcleartrip_ThisElementValidationStatus;
	}
	
	private boolean  cleartrip_Validate_BasicSearchInformation_GeneralOptions_SortBy(String strSearchResultInformationIemsToCheck){
		
		boolean bcleartrip_ThisElementValidationStatus 		= true;

		strSearchResultInformationIemsToCheck 	= strSearchResultInformationIemsToCheck.replace("Sortby_options__ ", "");
		String[]  strArrSortByElements 			= ClsGeneralInitTerminateAndOtherUtil.splitThisString(strSearchResultInformationIemsToCheck," __ ");
		
		for (String strSortByElement : strArrSortByElements){
			boolean bcleartrip_LocalElementValidationStatus = false;

			switch (strSortByElement){
				case "Airline":
					if(cleartrip_lnk_SelectFlight_SortBy_Airline.isDisplayed()){
						bcleartrip_LocalElementValidationStatus = true;
						// click and unclick the option
						cleartrip_lnk_SelectFlight_SortBy_Airline.click();}
					break;
				case "Depart":
					if(cleartrip_lnk_SelectFlight_SortBy_DepartureTime.isDisplayed()){
						bcleartrip_LocalElementValidationStatus = true;
						// click and unclick the option
						cleartrip_lnk_SelectFlight_SortBy_DepartureTime.click();}
					break;
				case "Arrive":
					if(cleartrip_lnk_SelectFlight_SortBy_ArrivalTime.isDisplayed()){
						bcleartrip_LocalElementValidationStatus = true;
						// click and unclick the option
						cleartrip_lnk_SelectFlight_SortBy_ArrivalTime.click();}
					break;
				case "Duration":
					if(cleartrip_lnk_SelectFlight_SortBy_Duration.isDisplayed()){
						bcleartrip_LocalElementValidationStatus = true;
						// click and unclick the option
						cleartrip_lnk_SelectFlight_SortBy_Duration.click();}
					break;
				case "Price":
					if(cleartrip_lnk_SelectFlight_SortBy_Price.isDisplayed()){
						bcleartrip_LocalElementValidationStatus = true;
						// click and unclick the option
						cleartrip_lnk_SelectFlight_SortBy_Price.click();}
					break;
				default:
					break;
			}
			if(bcleartrip_LocalElementValidationStatus){
				bcleartrip_ThisElementValidationStatus = true;
				System.out.println("RESULT::PASS");
				System.out.println("DEBUG:    Following basic search information element for sorting is found: " + strSortByElement);}
			else{
				bcleartrip_ThisElementValidationStatus = false;
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following basic search information element for sorting is NOT found: " + strSortByElement);
				objSoftAssert.fail("ERROR:    Following basic search information element for sorting is NOT found: " + strSortByElement);}
		}

		return bcleartrip_ThisElementValidationStatus;
	}
	
    private boolean cleartrip_Sorby_and_SortingType(String strSortByOption, String strSortType){
    	
		boolean bSortingByActivitySuccess 	= true;
		System.out.println("DEBUG:    Sorting search results by: " + strSortByOption + " and order by " + strSortType);
		int nRepeatIndex = 1; // 1 for descending
							  // 2 for ascending
		if(strSortType.contains("ascending"))  nRepeatIndex = 2;

		for(int nLocal=0;nLocal < nRepeatIndex; nLocal++){
			// when clicked 1st time, it will be in ascending order
			// when clicked 2nd time, it will be in descending order
			switch (strSortByOption){
			case "Airline":
				cleartrip_lnk_SelectFlight_SortBy_Airline.click();
				break;
			case "Depart":
				cleartrip_lnk_SelectFlight_SortBy_DepartureTime.click();
				break;
			case "Arrive":
				cleartrip_lnk_SelectFlight_SortBy_ArrivalTime.click();
				break;
			case "Duration":
				cleartrip_lnk_SelectFlight_SortBy_Duration.click();
				break;
			case "Price":
				cleartrip_lnk_SelectFlight_SortBy_Price.click();
				break;
			default:
				break;
			}
		}

		if(cleartrip_lst_labl_Result1SelectTravelsnSeatPage_SortByIcon_Ascending.size() > 0)
			objWaitShort.until(ExpectedConditions.visibilityOf(cleartrip_lst_labl_Result1SelectTravelsnSeatPage_SortByIcon_Ascending.get(0)));
		if(cleartrip_lst_labl_Result1SelectTravelsnSeatPage_SortByIcon_Descending.size() > 0)
			objWaitShort.until(ExpectedConditions.visibilityOf(cleartrip_lst_labl_Result1SelectTravelsnSeatPage_SortByIcon_Descending.get(0)));
						
		return bSortingByActivitySuccess;
    }
 

	
	
	
	
	
	
	
}
