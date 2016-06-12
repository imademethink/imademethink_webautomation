package com.imademethink_webautomation.pkgAirlines_GoAir;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.imademethink_webautomation.pkg0GeneralPageFactory.Page0Abstract;

public class PageGoAirResult2SelectDate extends Page0Abstract{

	//private PageGoAirResult0InProgress 					objLocal_PageGoAirResult0InProgress = null;
	private PageGoAirResult3ServicesAndPassengerDetail 	objLocal_PageGoAirResult3ServicesAndPassengerDetail = null;
	//private PageGoAirResult4SeatAssignment 				objLocal_PageGoAirResult4SeatAssignment = null;
	//private PageGoAirResult5Payment 					objLocal_PageGoAirResult5Payment = null;
	//private PageGoAir99General 					objLocal_PageGoAirResult99General = null;

	public PageGoAirResult2SelectDate(WebDriver driver) {
		super(driver);
		//System.out.println("DEBUG:    PageGoAirResult2SelectDate constructor");
		PageFactory.initElements(driver, this);
		//objLocal_PageGoAirResult0InProgress					= new PageGoAirResult0InProgress(driver);
		objLocal_PageGoAirResult3ServicesAndPassengerDetail	= new PageGoAirResult3ServicesAndPassengerDetail(driver);
		//objLocal_PageGoAirResult4SeatAssignment				= new PageGoAirResult4SeatAssignment(driver);
		//objLocal_PageGoAirResult5Payment  					= new PageGoAirResult5Payment(driver);
		//objLocal_PageGoAirResult99General					= new PageGoAir99General(driver);
	}

	// public elements so that other class can also access
	@FindBy(css="div[class='step active']")
	public WebElement GoAir_Result2Page_CurrentStep;
	
	@FindBy(css=".textBold.nowrap")
	public List<WebElement> GoAir_lst_Result2Page_ErrorOccured;
	@FindBy(css="#WDSErrorContainer>h1")
	public List<WebElement> GoAir_lst_Result2Page_Error_Type2_Heading;
	@FindBy(css=".WDSErrorE")
	public WebElement GoAir_Result2Page_Error_Type2_Text;
	
	
	// private elements
	@FindBy(css=".fdct_inst>a")
	private WebElement GoAir_Result2Page_BaggageCharges;	
	@FindBy(css=".tableRecapWide>tbody>tr>td")
	private List<WebElement> GoAir_lst_Result2Page_ShortSummaryItems;
	@FindAll({
	    @FindBy(css=".fdct_bgrd"),
	    @FindBy(css=".fdct_bgrd_selectedDate"),
	    @FindBy(css=".fdct_bgrd_lowestPrice")
	})
	private List<WebElement> GoAir_lst_Result2Page_WeeklyFlightTable;
	@FindBy(css=".fdct_bgrd_selectedDate")
	private List<WebElement> GoAir_lst_Result2Page_CurrentlySelected;
	@FindBy(css=".tableFDCT>tbody>tr")
	private List<WebElement> GoAir_lst_Result2Page_WeeklyFlightTableRows;
	@FindBy(css="#openNewSearchButton")
	private WebElement GoAir_lnk_Result2Page_ChangeSearch;
	@FindBy(id="closeNewSearchButton")
	private WebElement GoAir_btn_Result2Page_ChangeSearch_Popup_Close;
	private String strGoAir_btn_Result2Page_ChangeSearch_Popup_CloseLocator = "closeNewSearchButton";
	@FindBy(css=".radio>label")
	private List<WebElement> GoAir_lst_btn_Result2Page_ChangeSearch_Popup_Return_OneWay;
	@FindBy(css=".button.button-next")
	private List<WebElement> GoAir_lst_btn_Result2Page_ChangeSearch_Popup_BookNow;
	@FindBy(css="input[id*='returnDate']")
	private List<WebElement> GoAir_lst_btn_Result2Page_ChangeSearch_Popup_ReturnDate;
	
	@FindAll({
	    @FindBy(id="DepartureDate"),
	    @FindBy(id="DepartureCity"),
	    @FindBy(id="ArrivalCity"),
	    @FindBy(id="nrOfAdults"),
	    @FindBy(id="nrOfChildren"),
	    @FindBy(id="nrOfInfants"),
	})
	private List<WebElement> GoAir_lst_labl_Result2Page_ShortSummary;
    @FindBy(id="DepartureDate")
    private WebElement GoAir_labl_Result2Page_ShortSummary_DepartDate;
    @FindBy(id="DepartureCity")
    private WebElement GoAir_labl_Result2Page_ShortSummary_DepartCity;
    @FindBy(id="ArrivalCity")
    private WebElement GoAir_labl_Result2Page_ShortSummary_ArriveCity;
    @FindBy(id="nrOfAdults")
    private WebElement GoAir_labl_Result2Page_ShortSummary_PersonCount_Adult;
    @FindBy(id="nrOfChildren")
    private WebElement GoAir_labl_Result2Page_ShortSummary_PersonCount_Children;
    @FindBy(id="nrOfInfants")
	private WebElement GoAir_labl_Result2Page_ShortSummary_PersonCount_Infant;
    @FindBy(className="prevday")
    private WebElement GoAir_lnk_Result2Page_PrevDay;
    @FindBy(className="nextday")
	private WebElement GoAir_lnk_Result2Page_NextDay;
    @FindBy(css=".nav-Economy")
    private WebElement GoAir_tab_Result2Page_PassengerClass_Economy;
    @FindBy(css=".nav-Business")
	private WebElement GoAir_tab_Result2Page_PassengerClass_Business;
    @FindBy(css=".flight-info-depart-arrive-container.sort-header.sort-asc")
	// index 0 is for business class and index 1 is for economy class
    private List<WebElement> GoAir_lst_labl_Result2Page_ResultTable_ColumnHeading_DepartureArrival;
    @FindBy(css="span[data-sortoption='flightduration']")
	// index 0 is for business class and index 1 is for economy class
    private List<WebElement> GoAir_lst_labl_Result2Page_ResultTable_ColumnHeading_Duration;
    @FindBy(css="span[data-sortoption='stops']")
	// index 0 is for business class and index 1 is for economy class
    private List<WebElement> GoAir_lst_labl_Result2Page_ResultTable_ColumnHeading_Stops;
	@FindBy(linkText = "GoValue")
	private WebElement GoAir_labl_Result2Page_ResultTable_ColumnHeading_GoValue;
 	@FindBy(linkText = "GoPromo")
 	private WebElement GoAir_labl_Result2Page_ResultTable_ColumnHeading_GoPromo;
	@FindBy(linkText = "GoSmart")
	private WebElement GoAir_labl_Result2Page_ResultTable_ColumnHeading_GoSmart;
	@FindBy(linkText = "GoLite")
	private WebElement GoAir_labl_Result2Page_ResultTable_ColumnHeading_GoLite;
	@FindBy(linkText = "GoBusiness")
	private WebElement GoAir_labl_Result2Page_ResultTable_ColumnHeading_GoBusiness;
	@FindBy(css="#btnBack")
	private WebElement GoAir_btn_Result2Page_GoBack;
	@FindBy(css="#btnProceedWithBookingMain")
	private WebElement GoAir_lnk_Result2Page_Continue;
	@FindBy(linkText="Chat with Holiday Expert")
	private WebElement GoAir_lnk_Result2Page_ChatWithExpert;
	@FindBy(id="YourBasket-OutBound")
	private WebElement GoAir_lnk_Result2Page_BookingSummaryHeading_OutBoundDetails;
	@FindBy(id="YourBasket-InBound")
	private WebElement GoAir_lnk_Result2Page_BookingSummaryHeading_InBoundDetails;
	@FindBy(css=".total-price")
	private WebElement GoAir_lnk_Result2Page_TotalTicketPrice;
	@FindBy(css=".booking-YourBasketArrow")
	private WebElement GoAir_lnk_Result2Page_TaxBreakDown;
	@FindBy(css="div[class='Price hover-price lowest selected']")
	private WebElement GoAir_labl_Result2Page_ResultTable_LowestPriceSelected;
	@FindBy(css=".Flight-Info-Head>.flight-info-depart-arrive-container>.Flight-Info-Departure")
	private List<WebElement> GoAir_lst_btn_Result2Page_DepartureArrivalSorting_Business_Economy;
	@FindBy(css=".Flight-Info-Prices.faretype-header.fare-type-header-outbound-GoValue.sort-header")
	private WebElement GoAir_btn_Result2Page_GoValueSorting;
	@FindBy(css=".Flight-Info-Prices.faretype-header.fare-type-header-outbound-GoPromo.sort-header")
	private WebElement GoAir_btn_Result2Page_GoPromoSorting;
	@FindBy(css=".Flight-Info-Prices.faretype-header.fare-type-header-outbound-GoSmart.sort-header")
	private WebElement GoAir_btn_Result2Page_GoSmartSorting;
	@FindBy(css=".Flight-Info-Prices.faretype-header.fare-type-header-outbound-GoLite.sort-header")
	private WebElement GoAir_btn_Result2Page_GoLiteSorting;
	@FindBy(css=".Flight-Info-Prices.faretype-header.fare-type-header-outbound-GoBusiness.sort-header")
	private WebElement GoAir_btn_Result2Page_GoBusinessSorting;
	@FindBy(css="#selectTravelDates>h2")
	private WebElement GoAir_labl_Result2Page_Selecttraveldates;
	@FindBy(css="#Economy-outbound")
	private WebElement GoAir_lnk_Result2Page_ResultTable_EconomyOutboundItems;
	@FindBy(css="#Business-outbound")
	private WebElement GoAir_lnk_Result2Page_ResultTable_BusinessOutboundItems;
	@FindBy(css="span[data-sortoption='flightduration']")
 	private List<WebElement> GoAir_lst_labl_Result2Page_DurationSort_Business_Economy;
 	@FindBy(css="span[data-sortoption='stops']")
 	private List<WebElement> GoAir_lst_labl_Result2Page_NumberOfStopsSort_Business_Economy;
	

    // every page object has it's local private wait with fixed 10 sec delay
    private WebDriverWait objWait = new WebDriverWait(this.objWebDriverAbstract, 10);   
		
		
	public boolean GoAir_Validate_BasicSearchInformation(String strSearchResultInformationIemsToCheck){
		
		boolean bGoAir_ThisElementValidationStatus 		= true;
		boolean bSpportedElementFound					= false;
		strSearchResultInformationIemsToCheck 			= strSearchResultInformationIemsToCheck.replace("General_options__ ", ""); 
	    
		if (strSearchResultInformationIemsToCheck.contains("pop up__book return ticket")){
			bSpportedElementFound = true;
			// This item is already valiated
		}
		if (strSearchResultInformationIemsToCheck.contains("btn__Change search")){
			bSpportedElementFound = true;
			if (!  GoAir_lnk_Result2Page_ChangeSearch.isDisplayed()){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following element not found: " + "btn__Change search");
				objSoftAssert.fail("ERROR:    Following element not found: " + "btn__Change search");
				bGoAir_ThisElementValidationStatus = false;}
		}
		if (strSearchResultInformationIemsToCheck.contains("pop_up__Change search")){
			bSpportedElementFound = true;
			GoAir_lnk_Result2Page_ChangeSearch.click();
			try{
				objWait.until(ExpectedConditions.visibilityOf(GoAir_btn_Result2Page_ChangeSearch_Popup_Close));
				GoAir_btn_Result2Page_ChangeSearch_Popup_Close.click();
				objWait.until(ExpectedConditions.invisibilityOfElementLocated( By.id(GoAir_btn_Result2Page_ChangeSearch_Popup_Close.getAttribute("id"))  ));
			}catch(Exception e){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following element not found: " + "pop_up__Change search");
				objSoftAssert.fail("ERROR:    Following element not found: " + "pop_up__Change search");
				bGoAir_ThisElementValidationStatus = false;
			}
		}		
		if (strSearchResultInformationIemsToCheck.contains("labl__Short Summary")){
			bSpportedElementFound = true;
			if (!  GoAir_lst_labl_Result2Page_ShortSummary.get(0).isDisplayed()){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following element not found: " + "labl__Short Summary");
				objSoftAssert.fail("ERROR:    Following element not found: " + "labl__Short Summary");
				bGoAir_ThisElementValidationStatus = false;}
			else{
				System.out.println("DEBUG:    Actual short summary:");
				System.out.println("DEBUG:     Actual depart date:        " + GoAir_labl_Result2Page_ShortSummary_DepartDate.getText());
				System.out.println("DEBUG:     Actual depart city:        " + GoAir_labl_Result2Page_ShortSummary_DepartCity.getText());
				System.out.println("DEBUG:     Actual arrive city:        " + GoAir_labl_Result2Page_ShortSummary_ArriveCity.getText());
				System.out.println("DEBUG:     Actual person count adult: " + GoAir_labl_Result2Page_ShortSummary_PersonCount_Adult.getText());
				System.out.println("DEBUG:     person count children:     " + GoAir_labl_Result2Page_ShortSummary_PersonCount_Children.getText());
				System.out.println("DEBUG:     person count infant:       " + GoAir_labl_Result2Page_ShortSummary_PersonCount_Infant.getText());
			}
		}
		if (strSearchResultInformationIemsToCheck.contains("lnk__Prev day") || strSearchResultInformationIemsToCheck.contains("lnk__Next day")){
			bSpportedElementFound = true;
			if (!  (GoAir_lnk_Result2Page_PrevDay.isDisplayed()  || GoAir_lnk_Result2Page_NextDay.isDisplayed())  ){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following element not found: " + "lnk__Prev day or tab__Business");
				objSoftAssert.fail("ERROR:    Following element not found: " + "lnk__Prev day or tab__Business");
				bGoAir_ThisElementValidationStatus = false;}
		}
		if (strSearchResultInformationIemsToCheck.contains("tab__Economy") || strSearchResultInformationIemsToCheck.contains("tab__Business")){
			bSpportedElementFound = true;
			if (!  (GoAir_tab_Result2Page_PassengerClass_Economy.isDisplayed()  || GoAir_tab_Result2Page_PassengerClass_Business.isDisplayed())  ){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following element not found: " + "tab__Economy or tab__Business");
				objSoftAssert.fail("ERROR:    Following element not found: " + "tab__Economy or tab__Business");
				bGoAir_ThisElementValidationStatus = false;}
		}
		if (strSearchResultInformationIemsToCheck.contains("labl__Departure Arrival")){
			bSpportedElementFound = true;
			if (!  GoAir_lst_labl_Result2Page_ResultTable_ColumnHeading_DepartureArrival.get(1).isDisplayed()){
				// above index 0 is for business class and index 1 is for economy class (default)
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following element not found: " + "labl__Departure Arrival ");
				objSoftAssert.fail("ERROR:    Following element not found: " + "labl__Departure Arrival ");
				bGoAir_ThisElementValidationStatus = false;}
		}
		if (strSearchResultInformationIemsToCheck.contains("labl__Duration")){
			bSpportedElementFound = true;
			if (!  GoAir_lst_labl_Result2Page_ResultTable_ColumnHeading_Duration.get(1).isDisplayed()){
				// above index 0 is for business class and index 1 is for economy class (default)
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following element not found: " + "labl__Duration");
				objSoftAssert.fail("ERROR:    Following element not found: " + "labl__Duration");
				bGoAir_ThisElementValidationStatus = false;}
		}
		if (strSearchResultInformationIemsToCheck.contains("labl__Stops")){
			bSpportedElementFound = true;
			if (!  GoAir_lst_labl_Result2Page_ResultTable_ColumnHeading_Stops.get(1).isDisplayed()){
				// above index 0 is for business class and index 1 is for economy class (default)
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following element not found: " + "labl__Stops");
				objSoftAssert.fail("ERROR:    Following element not found: " + "labl__Stops");
				bGoAir_ThisElementValidationStatus = false;}
		}
		if (strSearchResultInformationIemsToCheck.contains("labl__Ticket Fare Types")){
			bSpportedElementFound = true;
			GoAir_tab_Result2Page_PassengerClass_Economy.click();
			if( !	(
					GoAir_labl_Result2Page_ResultTable_ColumnHeading_GoValue.isDisplayed() &&
				 	GoAir_labl_Result2Page_ResultTable_ColumnHeading_GoPromo.isDisplayed() &&
					GoAir_labl_Result2Page_ResultTable_ColumnHeading_GoSmart.isDisplayed() &&
					GoAir_labl_Result2Page_ResultTable_ColumnHeading_GoLite.isDisplayed()
				)	){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following element not found: " + "Econoy Ticket Fare Types");
				objSoftAssert.fail("ERROR:    Following element not found: " + "Econoy Ticket Fare Types");
				bGoAir_ThisElementValidationStatus = false;
			}
			
			GoAir_tab_Result2Page_PassengerClass_Business.click();
			if( !	(
					GoAir_labl_Result2Page_ResultTable_ColumnHeading_GoBusiness.isDisplayed()
				)	){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following element not found: " + "Business Ticket Fare Types");
				objSoftAssert.fail("ERROR:    Following element not found: " + "Business Ticket Fare Types");
				bGoAir_ThisElementValidationStatus = false;
			}			
		}
		if (strSearchResultInformationIemsToCheck.contains("btn__Go back")){
			bSpportedElementFound = true;
			if (!  GoAir_btn_Result2Page_GoBack.isDisplayed()){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following element not found: " + "btn__Go back");
				objSoftAssert.fail("ERROR:    Following element not found: " + "btn__Go back");
				bGoAir_ThisElementValidationStatus = false;}
		}
		if (strSearchResultInformationIemsToCheck.contains("btn__Continue")){
			bSpportedElementFound = true;
			if (!  GoAir_lnk_Result2Page_Continue.isDisplayed()){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following element not found: " + "btn__Continue");
				objSoftAssert.fail("ERROR:    Following element not found: " + "btn__Continue");
				bGoAir_ThisElementValidationStatus = false;}
		}
		if (strSearchResultInformationIemsToCheck.contains("lnk__Chat with expert")){
			bSpportedElementFound = true;
			if (!  GoAir_lnk_Result2Page_ChatWithExpert.isDisplayed()){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following element not found: " + "lnk__Chat with expert");
				objSoftAssert.fail("ERROR:    Following element not found: " + "lnk__Chat with expert");
				bGoAir_ThisElementValidationStatus = false;}
		}
		if (strSearchResultInformationIemsToCheck.contains("labl__Booking Summary")){
			bSpportedElementFound = true;
			if (!  GoAir_lnk_Result2Page_BookingSummaryHeading_OutBoundDetails.findElements(By.className("header")).get(0).isDisplayed()){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following element not found: " + "labl__Booking Summary Outound Summary");
				objSoftAssert.fail("ERROR:    Following element not found: " + "labl__Booking Summary Outound Summary");
				bGoAir_ThisElementValidationStatus = false;}
			else{
				List<WebElement> GoAir_ElementList = GoAir_lnk_Result2Page_BookingSummaryHeading_OutBoundDetails.findElements(By.className("value"));
				System.out.println("DEBUG:    Booking summary for outbound flight:");
				System.out.println("DEBUG:     Flight:    " + GoAir_ElementList.get(2).getText());
				System.out.println("DEBUG:     Departing: " + GoAir_ElementList.get(3).getText());
				System.out.println("DEBUG:     Arrival:   " + GoAir_ElementList.get(4).getText());
				System.out.println("DEBUG:     Fare Type: " + GoAir_ElementList.get(5).getText());
			}
			if ( GoAir_lnk_Result2Page_BookingSummaryHeading_InBoundDetails.findElements(By.className("header")).size() ==  0){
				System.out.println("DEBUG:    Following element will not be available in one way flight : " + "labl__Booking Summary Inound Summary");}
		}
		if (strSearchResultInformationIemsToCheck.contains("labl__Total price")){
			bSpportedElementFound = true;
			if (!  GoAir_lnk_Result2Page_TotalTicketPrice.isDisplayed()){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following element not found: " + "labl__Total price");
				objSoftAssert.fail("ERROR:    Following element not found: " + "labl__Total price");
				bGoAir_ThisElementValidationStatus = false;}
			else{
				System.out.println("DEBUG:    Total ticket price :" + GoAir_lnk_Result2Page_TotalTicketPrice.getText() );
			}
		}
		if (strSearchResultInformationIemsToCheck.contains("lnk__Show full Tax breakdown")){
			bSpportedElementFound = true;
			if (!  GoAir_lnk_Result2Page_TaxBreakDown.isDisplayed()){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following element not found: " + "lnk__Show full Tax breakdown");
				objSoftAssert.fail("ERROR:    Following element not found: " + "lnk__Show full Tax breakdown");
				bGoAir_ThisElementValidationStatus = false;}
			else{
				// click on element
				GoAir_lnk_Result2Page_TaxBreakDown.click();
				// un-click on element
				GoAir_lnk_Result2Page_TaxBreakDown.click();
			}
		}
		if (strSearchResultInformationIemsToCheck.contains("hoover__Any fare details hoover")){
			bSpportedElementFound = true;
			if (!  GoAir_labl_Result2Page_ResultTable_LowestPriceSelected.isDisplayed()){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following element not found: " + "hoover__Any fare details hoover");
				objSoftAssert.fail("ERROR:    Following element not found: " + "hoover__Any fare details hoover");
				bGoAir_ThisElementValidationStatus = false;}
			else{

			}
		}

		
		

		if (!bSpportedElementFound){
			System.out.println("ERROR:    Atleast one unsupported element NOT found in Basic search information");
			objSoftAssert.fail("ERROR:    Atleast one unsupported element NOT found in Basic search information");
			return bSpportedElementFound;
		}
		if (bGoAir_ThisElementValidationStatus) System.out.println("RESULT::PASS");
		else{
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Atleast one supported element NOT found in Basic search information");
			objSoftAssert.fail("ERROR:    Atleast one supported element NOT found in Basic search information");
		}
		
		return bGoAir_ThisElementValidationStatus;
	}
	
	public boolean GoAir_Common_Scenario_Continue_On_Date_Selection_Page(){

		boolean bGoAir_ThisElementValidationStatus 		= true;
		
		System.out.println("DEBUG:    Booking ticket for default highlighted date with no passanger changes");
		GoAir_lnk_Result2Page_Continue.click();
		
		objWait.until(ExpectedConditions.textToBePresentInElement(
				objLocal_PageGoAirResult3ServicesAndPassengerDetail.GoAir_Result3Page_CurrentStep.findElement(By.className("number")), "3"));
		
		return bGoAir_ThisElementValidationStatus;
	}
	
	public boolean GoAir_Validate_EndToEnd_Search_Scenario__TYPE1_CASE1(){

		return GoAir_Common_Scenario_Continue_On_Date_Selection_Page();
	}	
	
	public boolean GoAir_Validate_EndToEnd_Search_Scenario__TYPE1_CASE2(String strReturnJourneyDate){

		//  Modify search and book return ticket and select first search result and cancel the same
		boolean bGoAir_ThisElementValidationStatus 		= true;

		System.out.println("DEBUG:    Modifying search and booking return ticket");
		GoAir_lnk_Result2Page_ChangeSearch.click();
		objWait.until(ExpectedConditions.visibilityOf(GoAir_btn_Result2Page_ChangeSearch_Popup_Close));
		
		GoAir_lst_btn_Result2Page_ChangeSearch_Popup_Return_OneWay.get(0).click();
		GoAir_lst_btn_Result2Page_ChangeSearch_Popup_ReturnDate.get(0).sendKeys(Keys.chord(Keys.CONTROL, "a") + Keys.DELETE + strReturnJourneyDate );
		
		GoAir_lst_btn_Result2Page_ChangeSearch_Popup_BookNow.get(0).click();
		objWait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(strGoAir_btn_Result2Page_ChangeSearch_Popup_CloseLocator)));
		
		GoAir_lnk_Result2Page_Continue.click();
		objWait.until(ExpectedConditions.textToBePresentInElement(
				objLocal_PageGoAirResult3ServicesAndPassengerDetail.GoAir_Result3Page_CurrentStep.findElement(By.className("number")), "3"));

		return bGoAir_ThisElementValidationStatus;
	}
	
	public boolean GoAir_Validate_EndToEnd_Search_Scenario__TYPE1_CASE3(){

		return GoAir_Common_Scenario_Continue_On_Date_Selection_Page();
	}	

	public boolean GoAir_Validate_EndToEnd_Search_Scenario__TYPE1_CASE4(){

		boolean bGoAir_ThisElementValidationStatus 		= true;

		System.out.println("DEBUG:    Booking ticket from premium or business quota");
		GoAir_tab_Result2Page_PassengerClass_Business.click();
		GoAir_lnk_Result2Page_Continue.click();

		objWait.until(ExpectedConditions.textToBePresentInElement(
				objLocal_PageGoAirResult3ServicesAndPassengerDetail.GoAir_Result3Page_CurrentStep.findElement(By.className("number")), "3"));
		
		return bGoAir_ThisElementValidationStatus;
	}

	public boolean GoAir_Validate_EndToEnd_Search_Scenario__TYPE1_CASE5(){

		boolean bGoAir_ThisElementValidationStatus 		= true;

		System.out.println("DEBUG:    Navigating to next day and booking ticket from premium or business quota");
		GoAir_lnk_Result2Page_NextDay.click();
		objWait.until(ExpectedConditions.textToBePresentInElement(GoAir_Result2Page_CurrentStep.findElement(By.className("number")), "2"));

		GoAir_tab_Result2Page_PassengerClass_Business.click();
		GoAir_lnk_Result2Page_Continue.click();

		objWait.until(ExpectedConditions.textToBePresentInElement(
				objLocal_PageGoAirResult3ServicesAndPassengerDetail.GoAir_Result3Page_CurrentStep.findElement(By.className("number")), "3"));
		
		return bGoAir_ThisElementValidationStatus;
	}
	
	public boolean GoAir_Validate_EndToEnd_Search_Scenario__TYPE3_CASE1(){

		boolean bGoAir_ThisElementValidationStatus 		= true;
		
		System.out.println("DEBUG:    Sorting economy quota results by departure time in ascending order and selecting first ticket from results");
		GoAir_lst_btn_Result2Page_DepartureArrivalSorting_Business_Economy.get(1).click();

		List<WebElement> GoAir_AvailableFlightDetails = 
							GoAir_lnk_Result2Page_ResultTable_EconomyOutboundItems.findElements(By.cssSelector(".Availability-Flight"));
		List<WebElement> GoAir_AvailableFlightDetails_FirstFlight = 
							GoAir_AvailableFlightDetails.get(0).findElements(By.cssSelector("div[class*='Flight-Info-Prices legcount']"));
		for (WebElement GoAir_OneElement: GoAir_AvailableFlightDetails_FirstFlight){
			if( GoAir_OneElement.findElements(By.cssSelector("input[type='radio']")).size() >0    ){
				GoAir_OneElement.findElement(By.cssSelector("input[type='radio']")).click();
				break;}
		}
		
		GoAir_lnk_Result2Page_Continue.click();

		objWait.until(ExpectedConditions.textToBePresentInElement(
				objLocal_PageGoAirResult3ServicesAndPassengerDetail.GoAir_Result3Page_CurrentStep.findElement(By.className("number")), "3"));

		return bGoAir_ThisElementValidationStatus;
	}	
	
	public boolean GoAir_Validate_EndToEnd_Search_Scenario__TYPE3_CASE2(){

		boolean bGoAir_ThisElementValidationStatus 		= true;
		
		System.out.println("DEBUG:    Sorting economy quota results by GoSmart in descending order and selecting last ticket from results");
		GoAir_btn_Result2Page_GoSmartSorting.click();
		// clicking other place to remove the mouse hover by earlier comment i.e. click on GoSmart
		GoAir_labl_Result2Page_Selecttraveldates.click();

		List<WebElement> GoAir_AvailableFlightDetails = 
							GoAir_lnk_Result2Page_ResultTable_EconomyOutboundItems.findElements(By.cssSelector(".Availability-Flight"));
		List<WebElement> GoAir_AvailableFlightDetails_FirstFlight = 
							GoAir_AvailableFlightDetails.get(GoAir_AvailableFlightDetails.size() - 1).findElements(By.cssSelector("div[class*='Flight-Info-Prices legcount']"));
		for (WebElement GoAir_OneElement: GoAir_AvailableFlightDetails_FirstFlight){
			if( GoAir_OneElement.findElements(By.cssSelector("input[type='radio']")).size() >0    ){
				GoAir_OneElement.findElement(By.cssSelector("input[type='radio']")).click();
				break;}
		}
		
		GoAir_lnk_Result2Page_Continue.click();

		objWait.until(ExpectedConditions.textToBePresentInElement(
				objLocal_PageGoAirResult3ServicesAndPassengerDetail.GoAir_Result3Page_CurrentStep.findElement(By.className("number")), "3"));

		return bGoAir_ThisElementValidationStatus;
	}
	
	public boolean GoAir_Validate_EndToEnd_Search_Scenario__TYPE3_CASE3(){

		boolean bGoAir_ThisElementValidationStatus 		= true;

		System.out.println("DEBUG:    Sorting economy quota results by duration in ascending order and selecting first ticket from results");
		GoAir_lst_labl_Result2Page_DurationSort_Business_Economy.get(1).click();

		List<WebElement> GoAir_AvailableFlightDetails = 
							GoAir_lnk_Result2Page_ResultTable_EconomyOutboundItems.findElements(By.cssSelector(".Availability-Flight"));
		List<WebElement> GoAir_AvailableFlightDetails_FirstFlight = 
							GoAir_AvailableFlightDetails.get(0).findElements(By.cssSelector("div[class*='Flight-Info-Prices legcount']"));
		for (WebElement GoAir_OneElement: GoAir_AvailableFlightDetails_FirstFlight){
			if( GoAir_OneElement.findElements(By.cssSelector("input[type='radio']")).size() >0    ){
				GoAir_OneElement.findElement(By.cssSelector("input[type='radio']")).click();
				break;}
		}
		
		GoAir_lnk_Result2Page_Continue.click();

		objWait.until(ExpectedConditions.textToBePresentInElement(
				objLocal_PageGoAirResult3ServicesAndPassengerDetail.GoAir_Result3Page_CurrentStep.findElement(By.className("number")), "3"));

		return bGoAir_ThisElementValidationStatus;
	}

	public boolean GoAir_Validate_EndToEnd_Search_Scenario__TYPE3_CASE4(){

		boolean bGoAir_ThisElementValidationStatus 		= true;

		System.out.println("DEBUG:    For next day sorting economy quota results by duration in descending order and selecting first ticket from results");
		GoAir_lnk_Result2Page_NextDay.click();
		objWait.until(ExpectedConditions.textToBePresentInElement(GoAir_Result2Page_CurrentStep.findElement(By.className("number")), "2"));
		
		GoAir_lst_labl_Result2Page_DurationSort_Business_Economy.get(1).click();
		// clicking other place to have soe delay after first sorting
		GoAir_labl_Result2Page_Selecttraveldates.click();
		GoAir_lst_labl_Result2Page_DurationSort_Business_Economy.get(1).click();

		List<WebElement> GoAir_AvailableFlightDetails = 
							GoAir_lnk_Result2Page_ResultTable_EconomyOutboundItems.findElements(By.cssSelector(".Availability-Flight"));
		List<WebElement> GoAir_AvailableFlightDetails_FirstFlight = 
							GoAir_AvailableFlightDetails.get(0).findElements(By.cssSelector("div[class*='Flight-Info-Prices legcount']"));
		for (WebElement GoAir_OneElement: GoAir_AvailableFlightDetails_FirstFlight){
			if( GoAir_OneElement.findElements(By.cssSelector("input[type='radio']")).size() >0    ){
				GoAir_OneElement.findElement(By.cssSelector("input[type='radio']")).click();
				break;}
		}
		
		GoAir_lnk_Result2Page_Continue.click();

		objWait.until(ExpectedConditions.textToBePresentInElement(
				objLocal_PageGoAirResult3ServicesAndPassengerDetail.GoAir_Result3Page_CurrentStep.findElement(By.className("number")), "3"));

		return bGoAir_ThisElementValidationStatus;
	}
	
	public boolean GoAir_Validate_EndToEnd_Search_Scenario__TYPE3_CASE5(){

		boolean bGoAir_ThisElementValidationStatus 		= true;

		System.out.println("DEBUG:    Sorting economy quota results by # of stop in ascending order and go to next day and selecting first ticket from results");		
		GoAir_lst_labl_Result2Page_NumberOfStopsSort_Business_Economy.get(1).click();
		// clicking other place to have to delay after first sorting
		GoAir_labl_Result2Page_Selecttraveldates.click();
		
		GoAir_lnk_Result2Page_NextDay.click();
		objWait.until(ExpectedConditions.textToBePresentInElement(GoAir_Result2Page_CurrentStep.findElement(By.className("number")), "2"));

		List<WebElement> GoAir_AvailableFlightDetails = 
							GoAir_lnk_Result2Page_ResultTable_EconomyOutboundItems.findElements(By.cssSelector(".Availability-Flight"));
		List<WebElement> GoAir_AvailableFlightDetails_FirstFlight = 
							GoAir_AvailableFlightDetails.get(0).findElements(By.cssSelector("div[class*='Flight-Info-Prices legcount']"));
		for (WebElement GoAir_OneElement: GoAir_AvailableFlightDetails_FirstFlight){
			if( GoAir_OneElement.findElements(By.cssSelector("input[type='radio']")).size() >0    ){
				GoAir_OneElement.findElement(By.cssSelector("input[type='radio']")).click();
				break;}
		}
		
		GoAir_lnk_Result2Page_Continue.click();

		objWait.until(ExpectedConditions.textToBePresentInElement(
				objLocal_PageGoAirResult3ServicesAndPassengerDetail.GoAir_Result3Page_CurrentStep.findElement(By.className("number")), "3"));

		return bGoAir_ThisElementValidationStatus;
		
	}
	
	public boolean GoAir_Validate_EndToEnd_Search_Scenario__TYPE3_CASE6(){

		boolean bGoAir_ThisElementValidationStatus 		= true;
		
		System.out.println("DEBUG:    Sorting economy quota results by # of stop in descending order and go to next day and selecting first ticket from results");		
		GoAir_lst_labl_Result2Page_NumberOfStopsSort_Business_Economy.get(1).click();
		// clicking other place to have to delay after first sorting
		GoAir_labl_Result2Page_Selecttraveldates.click();
		GoAir_lst_labl_Result2Page_NumberOfStopsSort_Business_Economy.get(1).click();
		
		GoAir_lnk_Result2Page_NextDay.click();
		objWait.until(ExpectedConditions.textToBePresentInElement(GoAir_Result2Page_CurrentStep.findElement(By.className("number")), "2"));

		List<WebElement> GoAir_AvailableFlightDetails = 
							GoAir_lnk_Result2Page_ResultTable_EconomyOutboundItems.findElements(By.cssSelector(".Availability-Flight"));
		List<WebElement> GoAir_AvailableFlightDetails_FirstFlight = 
							GoAir_AvailableFlightDetails.get(GoAir_AvailableFlightDetails.size() -1).findElements(By.cssSelector("div[class*='Flight-Info-Prices legcount']"));
		for (WebElement GoAir_OneElement: GoAir_AvailableFlightDetails_FirstFlight){
			if( GoAir_OneElement.findElements(By.cssSelector("input[type='radio']")).size() >0    ){
				GoAir_OneElement.findElement(By.cssSelector("input[type='radio']")).click();
				break;}
		}
		
		GoAir_lnk_Result2Page_Continue.click();

		objWait.until(ExpectedConditions.textToBePresentInElement(
				objLocal_PageGoAirResult3ServicesAndPassengerDetail.GoAir_Result3Page_CurrentStep.findElement(By.className("number")), "3"));

		return bGoAir_ThisElementValidationStatus;
		
	}
	
	public boolean GoAir_Validate_EndToEnd_Search_Scenario__TYPE3_CASE7(){

		boolean bGoAir_ThisElementValidationStatus 		= true;
		
		System.out.println("DEBUG:    Sorting economy quota results by non sold out category of price in ascending order and change search");
		String strNonSoldOutSortCategoryType = "";

		List<WebElement> GoAir_AvailableFlightDetails = 
				GoAir_lnk_Result2Page_ResultTable_EconomyOutboundItems.findElements(By.cssSelector(".Availability-Flight"));
		List<WebElement> GoAir_AvailableFlightDetails_FirstFlight = 
				GoAir_AvailableFlightDetails.get(0).findElements(By.cssSelector("div[class*='Flight-Info-Prices legcount']"));
		for (WebElement GoAir_OneElement: GoAir_AvailableFlightDetails_FirstFlight){
			if( GoAir_OneElement.findElements(By.cssSelector("input[type='radio']")).size() >0    ){
				strNonSoldOutSortCategoryType = 
							GoAir_OneElement.findElement(By.cssSelector("div[class*='hover-price']")).getAttribute("data-sortoption");
				//break;
			}
		}
		
		if (strNonSoldOutSortCategoryType.isEmpty() ){
			System.out.println("DEBUG:    Non sold out category of price is NOT found or ALL tickets are available");
			System.out.println("DEBUG:    So sorting by GoSmart");
			GoAir_btn_Result2Page_GoSmartSorting.click();
		}else{
			System.out.println("DEBUG:    Non sold out category of price found is: " + strNonSoldOutSortCategoryType);
			System.out.println("DEBUG:    So sorting by the same");
			switch (strNonSoldOutSortCategoryType){
				case "GoValue":			GoAir_btn_Result2Page_GoValueSorting.click();	break;
				case "GoPromo":			GoAir_btn_Result2Page_GoPromoSorting.click();	break;
				case "GoSmart":			GoAir_btn_Result2Page_GoSmartSorting.click();	break;
				case "GoLite":			GoAir_btn_Result2Page_GoLiteSorting.click();	break;
				default:																break;
			}
		}
		
		// just add some delay
		GoAir_labl_Result2Page_Selecttraveldates.click();
		GoAir_labl_Result2Page_Selecttraveldates.click();
		GoAir_labl_Result2Page_Selecttraveldates.click();
		GoAir_labl_Result2Page_Selecttraveldates.click();
		GoAir_labl_Result2Page_Selecttraveldates.click();
		
		GoAir_lnk_Result2Page_ChangeSearch.click();
		try{
			objWait.until(ExpectedConditions.visibilityOf(GoAir_btn_Result2Page_ChangeSearch_Popup_Close));
			GoAir_btn_Result2Page_ChangeSearch_Popup_Close.click();
			objWait.until(ExpectedConditions.invisibilityOfElementLocated( By.id(GoAir_btn_Result2Page_ChangeSearch_Popup_Close.getAttribute("id"))  ));
		}catch(Exception e){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Following element not found: " + "pop_up__Change search");
			objSoftAssert.fail("ERROR:    Following element not found: " + "pop_up__Change search");
			bGoAir_ThisElementValidationStatus = false;
		}

		return bGoAir_ThisElementValidationStatus;
	}
	
	public boolean GoAir_Validate_EndToEnd_Search_Scenario__TYPE3_CASE8(){

		boolean bGoAir_ThisElementValidationStatus 		= true;
		
		System.out.println("DEBUG:    Sorting business quota results by GoBusiness in descending order and book first ticket until payment section");
		GoAir_tab_Result2Page_PassengerClass_Business.click();
		objWait.until(ExpectedConditions.visibilityOf(GoAir_btn_Result2Page_GoBusinessSorting));
		GoAir_lst_labl_Result2Page_DurationSort_Business_Economy.get(0).click();
		
		List<WebElement> GoAir_AvailableFlightDetails = 
							GoAir_lnk_Result2Page_ResultTable_BusinessOutboundItems.findElements(By.cssSelector(".Availability-Flight"));
		List<WebElement> GoAir_AvailableFlightDetails_FirstFlight = 
							GoAir_AvailableFlightDetails.get(0).findElements(By.cssSelector("div[class*='Flight-Info-Prices legcount']"));
		for (WebElement GoAir_OneElement: GoAir_AvailableFlightDetails_FirstFlight){
			if( GoAir_OneElement.findElements(By.cssSelector("input[type='radio']")).size() >0    ){
				GoAir_OneElement.findElement(By.cssSelector("input[type='radio']")).click();
				break;}
		}
		
		GoAir_lnk_Result2Page_Continue.click();

		objWait.until(ExpectedConditions.textToBePresentInElement(
				objLocal_PageGoAirResult3ServicesAndPassengerDetail.GoAir_Result3Page_CurrentStep.findElement(By.className("number")), "3"));

		return bGoAir_ThisElementValidationStatus;
		
	}	
	
	public boolean GoAir_Common_Continue_On_DateSelectionPage(){

		return GoAir_Common_Scenario_Continue_On_Date_Selection_Page();
	}	

	
	
	
	
	
	
	
}
