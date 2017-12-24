package com.imademethink_webautomation.pkgAirlines_GoAir;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.imademethink_webautomation.UtilGeneral.ClsGeneralInitTerminateAndOtherUtil;
import com.imademethink_webautomation.pkg0GeneralPageFactory.Page0Abstract;

public class PageGoAir0PlanMyTrip extends Page0Abstract{

	public PageGoAir0PlanMyTrip(WebDriver driver) {
		super(driver);
		//System.out.println("DEBUG:    PageGoAir0PlanMyTrip constructor");
		PageFactory.initElements(driver, this);
	}

	// plan my trip main element
	@FindBy(linkText = "Plan my trip")
	private WebElement GoAir_hover_PlanMyTrip;
	@FindBy(css=".cms-top-title")
	private WebElement GoAir_labl_PlanMyTrip_SubOptionHeading;
	@FindBy(css=".Logo-Map>a")
	private WebElement GoAir_labl_PlanMyTrip_GroupBookings_SubElement;
	
	
	// plan my trip sub elements
	@FindBy(linkText = "Manage Booking")
	private WebElement GoAir_lnk_PlanMyTrip_Manage_Booking;
	@FindBy(linkText = "Web Check-In")
	private WebElement GoAir_lnk_PlanMyTrip_WebCheckIn;
	@FindBy(linkText = "Flight Status")
	private WebElement GoAir_lnk_PlanMyTrip_FlightStatus;
	@FindBy(linkText = "Travel Guide")
	private WebElement GoAir_lnk_PlanMyTrip_TravelGuide;
	@FindBy(linkText = "Route Map")
	private WebElement GoAir_lnk_PlanMyTrip_RouteMap;
	@FindBy(linkText = "Group Bookings")
	private WebElement GoAir_lnk_PlanMyTrip_GroupBookings;
	@FindBy(linkText = "Flight Schedule")
	private WebElement GoAir_lnk_PlanMyTrip_FlightSchedule;
	@FindBy(linkText="Charters")
	private WebElement GoAir_lnk_PlanMyTrip_Charters;
	
	// elements under manage booking sub option
	@FindBy(css = "#LastName")
	private WebElement GoAir_PlanMyTrip_ManageBooking_LastName;
	@FindBy(css = "#PNR")
	private WebElement GoAir_PlanMyTrip_ManageBooking_PNR;
	@FindBy(css = "#submit-button")
	private WebElement GoAir_PlanMyTrip_ManageBooking_RetrieveBooking;
	
	// elements under web check in sub option
	@FindBy(css = "#lastName")
	private WebElement GoAir_PlanMyTrip_WebCheckIn_LastName;
	@FindBy(css = "#bookingCode")
	private WebElement GoAir_PlanMyTrip_WebCheckIn_PNR;
	@FindBy(css = "#acceptTerms")
	private WebElement GoAir_PlanMyTrip_WebCheckIn_PermissionCheck;
	@FindBy(css = "#btnLogin")
	private WebElement GoAir_PlanMyTrip_ManageBooking_Continue;
	
	// elements under flight status sub option
	@FindBy(css = "#flightDateSelect")
	private List<WebElement> GoAir_PlanMyTrip_FlightStatus_FlightDateSelect;
	@FindBy(css = ".flight-destination-type.flightstatus-row>label")
	private List<WebElement> GoAir_PlanMyTrip_FlightStatus_DepartureAndArrival;
	@FindBy(css = ".data-flightid-320")
	private WebElement GoAir_PlanMyTrip_FlightStatus_FlightNumber;
	@FindBy(css = ".data-bycity-320")
	private WebElement GoAir_PlanMyTrip_FlightStatus_ByCity;
	@FindBy(css = "#Criteria_FlightId")
	private List<WebElement> GoAir_PlanMyTrip_FlightStatus_FlightCode;
	@FindBy(css = ".fixed-footer-submit-button.submit-button")
	private List<WebElement> GoAir_PlanMyTrip_FlightStatus_ShowAll;
	
	// elements under travel guide sub option
	@FindBy(tagName = "a")
	private List<WebElement> GoAir_PlanMyTrip_TravelGuide_AllLinks;
	
	// elements under route map sub option
	@FindBy(css = ".menu-page-content>div>p>object>embed")
	private WebElement GoAir_PlanMyTrip_RouteMap_ShockwaveEmbedededImage;
	
	// elements under group booking sub option
	@FindBy(css = "#loginUserName")
	private WebElement GoAir_PlanMyTrip_GroupBooking_LoginUserName;
	@FindBy(css = "#loginUserPassword")
	private WebElement GoAir_PlanMyTrip_GroupBooking_Password;
	@FindBy(css = "#login")
	private List<WebElement> GoAir_lst_btn_PlanMyTrip_GroupBooking_Login;
	
	// elements under flight schedule
	@FindBy(css = ".download-schedule")
	private WebElement GoAir_PlanMyTrip_FlightSchedule_DownloadFullSchedule;
	@FindBy(css = ".airport")
	private List<WebElement> GoAir_lst_lnk_FlightSchedule_CityNames;

	// elements under charters
	@FindBy(css = ".menu-page-content>div>p>span>a>span")
	private WebElement GoAir_PlanMyTrip_Charters_contactemailid;
	
	
    // every page object has it's local private wait with fixed 10 sec delay
	private WebDriverWait objWait = new WebDriverWait(this.objWebDriverAbstract, 10); 
    

	public boolean GoAir_Validate_PlanMyTripSubPageElements_for_ManageBooking(String strGUIOptionListForManageBooking){

		boolean bGoAir_ThisElementValidationStatus 		= true;
		boolean bSpportedElementFound					= false;
		Actions GoAir_actn_bldr_PagePlanMyTrip 			= new Actions(this.objWebDriverAbstract);
		
		// mouse hover on plan my trip and click on manage bookg to proceed
		GoAir_actn_bldr_PagePlanMyTrip
						.moveToElement(GoAir_hover_PlanMyTrip)
						.click(GoAir_lnk_PlanMyTrip_Manage_Booking)
						.build()
						.perform();
		
		objWait.until(ExpectedConditions.textToBePresentInElement(GoAir_labl_PlanMyTrip_SubOptionHeading, "Manage Booking"));
			
		if (strGUIOptionListForManageBooking.contains("txtbox__Last name")){
			bSpportedElementFound = true;
			if (!  GoAir_PlanMyTrip_ManageBooking_LastName.isDisplayed()   ) {
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "txtbox__Last name");
				System.out.println("ERROR:    Following element not found: " + "txtbox__Last name");
				bGoAir_ThisElementValidationStatus = false;}
			else{
				// send some dummy text
				GoAir_PlanMyTrip_ManageBooking_LastName.sendKeys("dummy last name");
			}
		}
		if (strGUIOptionListForManageBooking.contains("txtbox__PNR")){
			bSpportedElementFound = true;
			if (!  GoAir_PlanMyTrip_ManageBooking_PNR.isDisplayed()   ) {
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "txtbox__PNR");
				System.out.println("ERROR:    Following element not found: " + "txtbox__PNR");
				bGoAir_ThisElementValidationStatus = false;}
			else{
				// send some dummy text
				GoAir_PlanMyTrip_ManageBooking_PNR.sendKeys("A0B1C2");
			}
		}		
		if (strGUIOptionListForManageBooking.contains("btn__Retrieve booking")){
			bSpportedElementFound = true;
			if (!  GoAir_PlanMyTrip_ManageBooking_RetrieveBooking.isDisplayed()) {
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "btn__Retrieve booking");
				System.out.println("ERROR:    Following element not found: " + "btn__Retrieve booking");
				bGoAir_ThisElementValidationStatus = false;}
			else{
				// click on element
				GoAir_PlanMyTrip_ManageBooking_RetrieveBooking.click();
			}
		}
		
		
		if (!bSpportedElementFound){
			objSoftAssert.fail("ERROR:    Atleast one unsuported element NOT found in following category: " + "Manage Bookings");
			System.out.println("ERROR:    Atleast one unsuported element NOT found in following category: " + "Manage Bookings");
			return bSpportedElementFound;
		}
		if (bGoAir_ThisElementValidationStatus) System.out.println("RESULT::PASS");
		else{
			System.out.println("RESULT::FAIL");
			objSoftAssert.fail("ERROR:    Atleast one supported element NOT found in following category: " + "Manage Bookings");
			System.out.println("ERROR:    Atleast one supported element NOT found in following category: " + "Manage Bookings");
		}
		
		return bGoAir_ThisElementValidationStatus;
	}
    
	public boolean GoAir_Validate_PlanMyTripSubPageElements_for_WebCheckIn(String strGUIOptionListForWebCheckIn){

		boolean bGoAir_ThisElementValidationStatus 		= true;
		boolean bSpportedElementFound					= false;
		Actions GoAir_actn_bldr_PagePlanMyTrip 			= new Actions(this.objWebDriverAbstract);
		
		// mouse hover on plan my trip and click on manage bookg to proceed
		GoAir_actn_bldr_PagePlanMyTrip
						.moveToElement(GoAir_hover_PlanMyTrip)
						.click(GoAir_lnk_PlanMyTrip_WebCheckIn)
						.build()
						.perform();
		
		objWait.until(ExpectedConditions.textToBePresentInElement(GoAir_labl_PlanMyTrip_SubOptionHeading, "Web Check-in"));
		
		if (strGUIOptionListForWebCheckIn.contains("txtbox__Last name")){
			bSpportedElementFound = true;
			if (!  GoAir_PlanMyTrip_WebCheckIn_LastName.isDisplayed()   ) {
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "txtbox__Last name");
				System.out.println("ERROR:    Following element not found: " + "txtbox__Last name");
				bGoAir_ThisElementValidationStatus = false;}
			else{
				// send some dummy text
				GoAir_PlanMyTrip_WebCheckIn_LastName.sendKeys("dummy last name");
			}
		}
		if (strGUIOptionListForWebCheckIn.contains("txtbox__PNR")){
			bSpportedElementFound = true;
			if (!  GoAir_PlanMyTrip_WebCheckIn_PNR.isDisplayed()   ) {
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "txtbox__PNR");
				System.out.println("ERROR:    Following element not found: " + "txtbox__PNR");
				bGoAir_ThisElementValidationStatus = false;}
			else{
				// send some dummy text
				GoAir_PlanMyTrip_WebCheckIn_PNR.sendKeys("A0B1C2");
			}
		}		
		if (strGUIOptionListForWebCheckIn.contains("tickbox__Permission box")){
			bSpportedElementFound = true;
			if (!  GoAir_PlanMyTrip_WebCheckIn_PermissionCheck.isDisplayed()) {
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "tickbox__Permission box");
				System.out.println("ERROR:    Following element not found: " + "tickbox__Permission box");
				bGoAir_ThisElementValidationStatus = false;}
			else{
				// click on element
				GoAir_PlanMyTrip_WebCheckIn_PermissionCheck.click();
			}
		}
		if (strGUIOptionListForWebCheckIn.contains("btn__Continue")){
			bSpportedElementFound = true;
			if (!  GoAir_PlanMyTrip_ManageBooking_Continue.isDisplayed()) {
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "btn__Continue");
				System.out.println("ERROR:    Following element not found: " + "btn__Continue");
				bGoAir_ThisElementValidationStatus = false;}
			else{
				// click on element
				GoAir_PlanMyTrip_ManageBooking_Continue.click();
			}
		}
		
		
		
		if (!bSpportedElementFound){
			objSoftAssert.fail("ERROR:    Atleast one unsuported element NOT found in following category: " + "Manage Bookings");
			System.out.println("ERROR:    Atleast one unsuported element NOT found in following category: " + "Manage Bookings");
			return bSpportedElementFound;
		}
		if (bGoAir_ThisElementValidationStatus) System.out.println("RESULT::PASS");
		else{
			System.out.println("RESULT::FAIL");
			objSoftAssert.fail("ERROR:    Atleast one supported element NOT found in following category: " + "Manage Bookings");
			System.out.println("ERROR:    Atleast one supported element NOT found in following category: " + "Manage Bookings");
		}
		
		return bGoAir_ThisElementValidationStatus;
	}
	
	public boolean GoAir_Validate_PlanMyTripSubPageElements_for_FlightStatus(String strGUIOptionListForFlightStatus){

		boolean bGoAir_ThisElementValidationStatus 		= true;
		boolean bSpportedElementFound					= false;
		Actions GoAir_actn_bldr_PagePlanMyTrip 			= new Actions(this.objWebDriverAbstract);
		
		// mouse hover on plan my trip and click on manage bookg to proceed
		GoAir_actn_bldr_PagePlanMyTrip
						.moveToElement(GoAir_hover_PlanMyTrip)
						.click(GoAir_lnk_PlanMyTrip_FlightStatus)
						.build()
						.perform();
		
		objWait.until(ExpectedConditions.textToBePresentInElement(GoAir_labl_PlanMyTrip_SubOptionHeading, "Flight Status"));
		
		if (strGUIOptionListForFlightStatus.contains("drpdwn__Flight date")){
			bSpportedElementFound = true;
			if (!  GoAir_PlanMyTrip_FlightStatus_FlightDateSelect.get(0).isDisplayed()   ) {
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "drpdwn__Flight date");
				System.out.println("ERROR:    Following element not found: " + "drpdwn__Flight date");
				bGoAir_ThisElementValidationStatus = false;}
			else{
				// click and unclick the same
				GoAir_PlanMyTrip_FlightStatus_FlightDateSelect.get(0).click();
				GoAir_PlanMyTrip_FlightStatus_FlightDateSelect.get(0).click();
			}
		}
		if (strGUIOptionListForFlightStatus.contains("btn__Departure")){
			bSpportedElementFound = true;
			if (!  GoAir_PlanMyTrip_FlightStatus_DepartureAndArrival.get(0).isDisplayed()   ) {
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "btn__Departure");
				System.out.println("ERROR:    Following element not found: " + "btn__Departure");
				bGoAir_ThisElementValidationStatus = false;}
			else{
				// click on element
				GoAir_PlanMyTrip_FlightStatus_DepartureAndArrival.get(0).click();
			}
		}		
		if (strGUIOptionListForFlightStatus.contains("btn__Arrival")){
			bSpportedElementFound = true;
			if (!  GoAir_PlanMyTrip_FlightStatus_DepartureAndArrival.get(1).isDisplayed()   ) {
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "btn__Arrival");
				System.out.println("ERROR:    Following element not found: " + "btn__Arrival");
				bGoAir_ThisElementValidationStatus = false;}
			else{
				// click on element
				GoAir_PlanMyTrip_FlightStatus_DepartureAndArrival.get(1).click();
			}
		}
		if (strGUIOptionListForFlightStatus.contains("btn__Flight Number")){
			bSpportedElementFound = true;
			if (!  GoAir_PlanMyTrip_FlightStatus_FlightNumber.isDisplayed()) {
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "btn__Flight Number");
				System.out.println("ERROR:    Following element not found: " + "btn__Flight Number");
				bGoAir_ThisElementValidationStatus = false;}
			else{
				// click on element
				GoAir_PlanMyTrip_FlightStatus_FlightNumber.click();
			}
		}
		if (strGUIOptionListForFlightStatus.contains("drpdwn__Flight code")){
			bSpportedElementFound = true;
			if (!  GoAir_PlanMyTrip_FlightStatus_FlightCode.get(0).isDisplayed()) {
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "drpdwn__Flight code");
				System.out.println("ERROR:    Following element not found: " + "drpdwn__Flight code");
				bGoAir_ThisElementValidationStatus = false;}
			else{
				// first click on flight number so flight code option is available
				GoAir_PlanMyTrip_FlightStatus_FlightNumber.click();
				// click and unclick on element
				GoAir_PlanMyTrip_FlightStatus_FlightCode.get(0).click();
				GoAir_PlanMyTrip_FlightStatus_FlightCode.get(0).click();
			}
		}
		if (strGUIOptionListForFlightStatus.contains("btn__By City")){
			bSpportedElementFound = true;
			if (!  GoAir_PlanMyTrip_FlightStatus_ByCity.isDisplayed()) {
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "btn__By City");
				System.out.println("ERROR:    Following element not found: " + "btn__By City");
				bGoAir_ThisElementValidationStatus = false;}
			else{
				// click on element
				GoAir_PlanMyTrip_FlightStatus_ByCity.click();
			}
		}
		if (strGUIOptionListForFlightStatus.contains("btn__SHOW ALL")){
			bSpportedElementFound = true;
			if (!  GoAir_PlanMyTrip_FlightStatus_ShowAll.get(0).isDisplayed()) {
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "btn__SHOW ALL");
				System.out.println("ERROR:    Following element not found: " + "btn__SHOW ALL");
				bGoAir_ThisElementValidationStatus = false;}
			else{
				// click on element
				GoAir_PlanMyTrip_FlightStatus_ShowAll.get(0).click();
			}
		}
		
		
		
		
		
		
		if (!bSpportedElementFound){
			objSoftAssert.fail("ERROR:    Atleast one unsuported element NOT found in following category: " + "Flight Status");
			System.out.println("ERROR:    Atleast one unsuported element NOT found in following category: " + "Flight Status");
			return bSpportedElementFound;
		}
		if (bGoAir_ThisElementValidationStatus) System.out.println("RESULT::PASS");
		else{
			System.out.println("RESULT::FAIL");
			objSoftAssert.fail("ERROR:    Atleast one supported element NOT found in following category: " + "Flight Status");
			System.out.println("ERROR:    Atleast one supported element NOT found in following category: " + "Flight Status");
		}
		
		return bGoAir_ThisElementValidationStatus;
	}
	
	public boolean GoAir_Validate_PlanMyTripSubPageElements_for_TravelGuide(String strGUIOptionListForTravelGuide){

		boolean bGoAir_ThisElementValidationStatus 		= true;
		Actions GoAir_actn_bldr_PagePlanMyTrip 			= new Actions(this.objWebDriverAbstract);
		
		// mouse hover on plan my trip and click on travel guide to proceed
		GoAir_actn_bldr_PagePlanMyTrip
						.moveToElement(GoAir_hover_PlanMyTrip)
						.click(GoAir_lnk_PlanMyTrip_TravelGuide)
						.build()
						.perform();
		
		objWait.until(ExpectedConditions.textToBePresentInElement(GoAir_labl_PlanMyTrip_SubOptionHeading, "Travel Guide"));
		
		int nFoundCityCount				= 0;
		strGUIOptionListForTravelGuide 	= strGUIOptionListForTravelGuide.replace("lnk__", "");
		String[] strArrCityNames 		= ClsGeneralInitTerminateAndOtherUtil.splitThisString(strGUIOptionListForTravelGuide, " __ ");
		String strCityNamesTemp			= Arrays.toString(strArrCityNames).replace("[", "").replace("]", "");
			   // converting user input city names to lower case since since web link url for citie is in lower case
		       strCityNamesTemp 		= strCityNamesTemp.toLowerCase().replace("[", "").replace("]", "").replace(" ", "");
		String[] strArrCityNamesFinal   = strCityNamesTemp.split(",");
				
		for (WebElement GoAirOneCityLink : GoAir_PlanMyTrip_TravelGuide_AllLinks){
				String strGoAirOneCityName 	= GoAirOneCityLink.getAttribute("href");
				if (   null == strGoAirOneCityName) continue;
				if ( ! strGoAirOneCityName.startsWith("https://www.goair.in/menu/plan-my-trip/travel-guide/")) continue;
				
				strGoAirOneCityName 		= strGoAirOneCityName.replace("https://www.goair.in/menu/plan-my-trip/travel-guide/", "");
				strGoAirOneCityName 		= strGoAirOneCityName.substring(0, strGoAirOneCityName.indexOf("-"));
				
				if (Arrays.asList(strArrCityNamesFinal).contains(strGoAirOneCityName)){
					System.out.println("DEBUG:    Correponding web link is found for following city: " + strGoAirOneCityName);
					nFoundCityCount++;
				}
		}
		
		if (nFoundCityCount == strArrCityNamesFinal.length) System.out.println("RESULT::PASS");
		else{
			System.out.println("RESULT::FAIL");
			objSoftAssert.fail("ERROR:    Atleast one supported element NOT found in following category: " + "Travel Guide");
			System.out.println("ERROR:    Atleast one supported element NOT found in following category: " + "Travel Guide");
		}
		
		return bGoAir_ThisElementValidationStatus;
	}
	
	public boolean GoAir_Validate_PlanMyTripSubPageElements_for_RouteMap(String strGUIOptionListForRouteMap){

		boolean bGoAir_ThisElementValidationStatus 		= true;
		boolean bSpportedElementFound					= false;
		Actions GoAir_actn_bldr_PagePlanMyTrip 			= new Actions(this.objWebDriverAbstract);
		
		// mouse hover on plan my trip and click on route map to proceed
		GoAir_actn_bldr_PagePlanMyTrip
						.moveToElement(GoAir_hover_PlanMyTrip)
						.click(GoAir_lnk_PlanMyTrip_RouteMap)
						.build()
						.perform();
		
		objWait.until(ExpectedConditions.textToBePresentInElement(GoAir_labl_PlanMyTrip_SubOptionHeading, "Route Map"));
		
		if (strGUIOptionListForRouteMap.contains("labl__Route Map")){
			bSpportedElementFound = true;
			if (!  GoAir_labl_PlanMyTrip_SubOptionHeading.getText().contains("Route Map")  ) {
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "labl__Route Map");
				System.out.println("ERROR:    Following element not found: " + "labl__Route Map");
				bGoAir_ThisElementValidationStatus = false;}
		}
		if (strGUIOptionListForRouteMap.contains("img_shockwave adobe image")){
			bSpportedElementFound = true;
			if (!  GoAir_PlanMyTrip_RouteMap_ShockwaveEmbedededImage.isDisplayed()   ) {
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "img_shockwave adobe image");
				System.out.println("ERROR:    Following element not found: " + "img_shockwave adobe image");
				bGoAir_ThisElementValidationStatus = false;}
			else{
				try{
					// perform context right click on element
					GoAir_actn_bldr_PagePlanMyTrip
						.contextClick(GoAir_PlanMyTrip_RouteMap_ShockwaveEmbedededImage)
						.moveByOffset(1, 1)
						.click()
						.build()
						.perform();		
				}catch (Exception e){
					System.out.println("ERROR:    Exception generated during context clicking on shockwave adobe image");
				}
			}
		}
		
		
		
		
		if (!bSpportedElementFound){
			objSoftAssert.fail("ERROR:    Atleast one unsuported element NOT found in following category: " + "Flight Status");
			System.out.println("ERROR:    Atleast one unsuported element NOT found in following category: " + "Flight Status");
			return bSpportedElementFound;
		}
		if (bGoAir_ThisElementValidationStatus) System.out.println("RESULT::PASS");
		else{
			System.out.println("RESULT::FAIL");
			objSoftAssert.fail("ERROR:    Atleast one supported element NOT found in following category: " + "Flight Status");
			System.out.println("ERROR:    Atleast one supported element NOT found in following category: " + "Flight Status");
		}
		
		return bGoAir_ThisElementValidationStatus;
	}
	
	public boolean GoAir_Validate_PlanMyTripSubPageElements_for_GroupBookings(String strGUIOptionListForGroupBookings){

		boolean bGoAir_ThisElementValidationStatus 		= true;
		boolean bSpportedElementFound					= false;
		Actions GoAir_actn_bldr_PagePlanMyTrip 			= new Actions(this.objWebDriverAbstract);
		
		// mouse hover on plan my trip and click on group bookings to proceed
		GoAir_actn_bldr_PagePlanMyTrip
						.moveToElement(GoAir_hover_PlanMyTrip)
						.click(GoAir_lnk_PlanMyTrip_GroupBookings)
						.build()
						.perform();
		
		objWait.until(ExpectedConditions.visibilityOf(GoAir_labl_PlanMyTrip_GroupBookings_SubElement));
		
		if (strGUIOptionListForGroupBookings.contains("txtbox__Username")){
			bSpportedElementFound = true;
			if (!  GoAir_PlanMyTrip_GroupBooking_LoginUserName.isDisplayed()   ) {
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "txtbox__Username");
				System.out.println("ERROR:    Following element not found: " + "txtbox__Username");
				bGoAir_ThisElementValidationStatus = false;}
			else{
				// send dummy text
				GoAir_PlanMyTrip_GroupBooking_LoginUserName.sendKeys("dummy user name");
			}
		}
		if (strGUIOptionListForGroupBookings.contains("txtbox__Password")){
			bSpportedElementFound = true;
			if (!  GoAir_PlanMyTrip_GroupBooking_Password.isDisplayed()   ) {
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "txtbox__Password");
				System.out.println("ERROR:    Following element not found: " + "txtbox__Password");
				bGoAir_ThisElementValidationStatus = false;}
			else{
				// send dummy password
				GoAir_PlanMyTrip_GroupBooking_Password.sendKeys("A0B1C2");
			}
		}		
		if (strGUIOptionListForGroupBookings.contains("btn__Login")){
			bSpportedElementFound = true;
			if (!  GoAir_lst_btn_PlanMyTrip_GroupBooking_Login.get(1).isDisplayed()   ) {
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "btn__Login");
				System.out.println("ERROR:    Following element not found: " + "btn__Login");
				bGoAir_ThisElementValidationStatus = false;}
			else{
				// click on element
				GoAir_lst_btn_PlanMyTrip_GroupBooking_Login.get(1).click();
			}
		}
		
		
		
		
		
		
		if (!bSpportedElementFound){
			objSoftAssert.fail("ERROR:    Atleast one unsuported element NOT found in following category: " + "Group Bookings");
			System.out.println("ERROR:    Atleast one unsuported element NOT found in following category: " + "Group Bookings");
			return bSpportedElementFound;
		}
		if (bGoAir_ThisElementValidationStatus) System.out.println("RESULT::PASS");
		else{
			System.out.println("RESULT::FAIL");
			objSoftAssert.fail("ERROR:    Atleast one supported element NOT found in following category: " + "Group Bookings");
			System.out.println("ERROR:    Atleast one supported element NOT found in following category: " + "Group Bookings");
		}
		
		return bGoAir_ThisElementValidationStatus;
	}
	
	public boolean GoAir_Validate_PlanMyTripSubPageElements_for_FlightSchedule(String strGUIOptionListForFlightSchedule){

		boolean bGoAir_ThisElementValidationStatus 		= true;
		boolean bSpportedElementFound					= false;
		Actions GoAir_actn_bldr_PagePlanMyTrip 			= new Actions(this.objWebDriverAbstract);
		
		// mouse hover on plan my trip and click on flight schedule to proceed
		GoAir_actn_bldr_PagePlanMyTrip
						.moveToElement(GoAir_hover_PlanMyTrip)
						.click(GoAir_lnk_PlanMyTrip_FlightSchedule)
						.build()
						.perform();
		
		objWait.until(ExpectedConditions.textToBePresentInElement(GoAir_labl_PlanMyTrip_SubOptionHeading, "Flight schedule"));

		
		if ( (   strGUIOptionListForFlightSchedule.contains("lnk__Jaipur")   ||   
				 strGUIOptionListForFlightSchedule.contains("lnk__Goa")      ||
				 strGUIOptionListForFlightSchedule.contains("lnk__Mumbai") 
				 )){
					bSpportedElementFound = true;
					for (WebElement GoairOneCityLink : GoAir_lst_lnk_FlightSchedule_CityNames){
						if (null == GoairOneCityLink.getText()) continue;
						
						String strOneLityLink = GoairOneCityLink.getText();
						if (strOneLityLink.contains("Jaipur")  ||
							strOneLityLink.contains("Goa")     ||
							strOneLityLink.contains("Mumbai")    ){
							System.out.println("DEBUG:    Found flight schedule match for following city: " + GoairOneCityLink.getText());
								bGoAir_ThisElementValidationStatus = true;
						}
					}
		}
		if (strGUIOptionListForFlightSchedule.contains("btn__Download Full Schedule")){
			bSpportedElementFound = true;
			if (!  GoAir_PlanMyTrip_FlightSchedule_DownloadFullSchedule.isDisplayed()   ) {
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "btn__Download Full Schedule");
				System.out.println("ERROR:    Following element not found: " + "btn__Download Full Schedule");
				bGoAir_ThisElementValidationStatus = false;}
			else{
				// click and unclick the same
				GoAir_PlanMyTrip_FlightSchedule_DownloadFullSchedule.click();
			}
		}
		

		
		
		
		if (!bSpportedElementFound){
			objSoftAssert.fail("ERROR:    Atleast one unsuported element NOT found in following category: " + "Flight Schedule");
			System.out.println("ERROR:    Atleast one unsuported element NOT found in following category: " + "Flight Schedule");
			return bSpportedElementFound;
		}
		if (bGoAir_ThisElementValidationStatus) System.out.println("RESULT::PASS");
		else{
			System.out.println("RESULT::FAIL");
			objSoftAssert.fail("ERROR:    Atleast one supported element NOT found in following category: " + "Flight Schedule");
			System.out.println("ERROR:    Atleast one supported element NOT found in following category: " + "Flight Schedule");
		}
		
		return bGoAir_ThisElementValidationStatus;
	}
	
	public boolean GoAir_Validate_PlanMyTripSubPageElements_for_Charters(String strGUIOptionListForCharters){

		boolean bGoAir_ThisElementValidationStatus 		= true;
		boolean bSpportedElementFound					= false;
		Actions GoAir_actn_bldr_PagePlanMyTrip 			= new Actions(this.objWebDriverAbstract);
		
		// mouse hover on plan my trip and click on charters to proceed
		GoAir_actn_bldr_PagePlanMyTrip
						.moveToElement(GoAir_hover_PlanMyTrip)
						.click(GoAir_lnk_PlanMyTrip_Charters)
						.build()
						.perform();
		
		objWait.until(ExpectedConditions.textToBePresentInElement(GoAir_labl_PlanMyTrip_SubOptionHeading, "Charters"));

		if (strGUIOptionListForCharters.contains("labl__groupdesk@goair.in")){
			bSpportedElementFound = true;
			if (!  GoAir_PlanMyTrip_Charters_contactemailid.getText().contains("groupdesk@goair.in")   ) {
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "labl__groupdesk@goair.in");
				System.out.println("ERROR:    Following element not found: " + "labl__groupdesk@goair.in");
				bGoAir_ThisElementValidationStatus = false;}
		}
		

		
		
		
		if (!bSpportedElementFound){
			objSoftAssert.fail("ERROR:    Atleast one unsuported element NOT found in following category: " + "Charters");
			System.out.println("ERROR:    Atleast one unsuported element NOT found in following category: " + "Charters");
			return bSpportedElementFound;
		}
		if (bGoAir_ThisElementValidationStatus) System.out.println("RESULT::PASS");
		else{
			System.out.println("RESULT::FAIL");
			objSoftAssert.fail("ERROR:    Atleast one supported element NOT found in following category: " + "Charters");
			System.out.println("ERROR:    Atleast one supported element NOT found in following category: " + "Charters");
		}
		
		return bGoAir_ThisElementValidationStatus;
	}
	
	
	
}
