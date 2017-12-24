package com.imademethink_webautomation.pkgTktTravel_redBus;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.imademethink_webautomation.UtilGeneral.ClsGeneralInitTerminateAndOtherUtil;
import com.imademethink_webautomation.pkg0GeneralPageFactory.Page0Abstract;

public class PageredBusResult1SelectTravelsnSeat extends Page0Abstract{

	public PageredBusResult1SelectTravelsnSeat(WebDriver driver) {
		super(driver);
		//System.out.println("DEBUG:    PageredBusResult1SelectTravelsnSeat constructor");
		PageFactory.initElements(driver, this);
	}
	
	// top row wlwmwnts
	@FindBy(linkText="Home")
	private WebElement redBus_lnk_Result1SelectTravelsnSeatPage_Home;
	@FindBy(linkText="Print/SMS Ticket")
	private WebElement redBus_lnk_Result1SelectTravelsnSeatPage_PrintSMSTicket;
	@FindBy(linkText="Easy Cancel/Refund")
	private WebElement redBus_lnk_Result1SelectTravelsnSeatPage_EasyCancelRefund;
	
	// generall search result elements
	@FindBy(css=".RTCBuses")
	private List<WebElement> redBus_lst_Result1SelectTravelsnSeatPage_GovtBusesGroup;
	@FindBy(css=".PrivateBuses")
	private List<WebElement> redBus_lst_Result1SelectTravelsnSeatPage_PrivateBusesGroup;
	@FindBy(linkText="Modify")
	private WebElement redBus_lnk_Result1SelectTravelsnSeatPage_ModifySearch;
    @FindBy(css="#txtSource")
    private WebElement redBus_txtbox_Result1SelectTravelsnSeatPage_ModifySearch_DepartFromCity;
    @FindBy(css="#txtDestination")
    private WebElement redBus_txtbox_Result1SelectTravelsnSeatPage_ModifySearch_ArriveToCity;
	@FindBy(css="#switchButton")
	private WebElement redBus_btn_Result1SelectTravelsnSeatPage_ModifySearch_ExchangeFromToCity;
	@FindBy(css=".searchBuses")
	private WebElement redBus_btn_Result1SelectTravelsnSeatPage_ModifySearch_SearchBuses;
	@FindBy(css=".SCN.OH.TextCenter")
	private List<WebElement> redBus_lst_lnk_Result1SelectTravelsnSeatPage_OnwardnReturn_RouteName;
	@FindBy(css=".addTripMessage.add")
	private WebElement redBus_lnk_Result1SelectTravelsnSeatPage_BookReturnTicket;
	@FindBy(css=".selectedData.next")
	private List<WebElement> redBus_lst_btn_Result1SelectTravelsnSeatPage_NextDay;
	@FindBy(css=".selectedData.prev")
	private List<WebElement> redBus_lst_btn_Result1SelectTravelsnSeatPage_PrevDay;
    @FindBy(css=".viewSeatsBtn")
    private List<WebElement> redBus_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats;
    @FindBy(css=".icon-Plus_Icon")
    private WebElement redBus_btn_Result1SelectTravelsnSeatPage_GovtBusGroup_Expand;
    @FindBy(css=".icon-Minus_Icon")
    private WebElement redBus_btn_Result1SelectTravelsnSeatPage_GovtBusGroup_Collapse;
    @FindBy(css=".BusName")
    private List<WebElement> redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_Name;
    @FindBy(css=".Duration")
    private List<WebElement> redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_Duration;
    @FindBy(css=".AvailableSeats")
    private List<WebElement> redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_AvailableSeats;
    @FindBy(css=".AvailableWindowSeats")
    private List<WebElement> redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_AvailableWindowSeats;
    @FindBy(css=".ratingStars")
    private List<WebElement> redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_RatingValue;
    @FindBy(css=".numRating")
    private List<WebElement> redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_TotalRating;
    @FindBy(css=".DepartureTime")
    private List<WebElement> redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_DepartureTime;
    @FindBy(css=".ArrivalTime")
    private List<WebElement> redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_ArrivalTime;
    @FindBy(css=".Fare")
    private List<WebElement> redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_FareValue;
    @FindBy(css=".CancellationPolicyLink.icon")
    private List<WebElement> redBus_lst_img_Result1SelectTravelsnSeatPage_IndividualOperator_IconCancellationPolicy;
    @FindBy(css=".PhotosLink.icon")
    private List<WebElement> redBus_lst_img_Result1SelectTravelsnSeatPage_IndividualOperator_IconBusPhotos;
    @FindBy(css=".Mticket.icon")
    private List<WebElement> redBus_lst_img_Result1SelectTravelsnSeatPage_IndividualOperator_IconMticket;
    @FindBy(css=".selectContainer.BPContainer>select")
    private List<WebElement> redBus_lst_drpdown_Result1SelectTravelsnSeatPage_IndividualOperator_SeatSelection_BoardingPoint;
    @FindBy(css=".continueBtn")
    private List<WebElement> redBus_lst_btn_Result1SelectTravelsnSeatPage_IndividualOperator_SeatSelection_Continue;
    @FindBy(css=".no.ancLink")
    private WebElement redBus_btn_Result1SelectTravelsnSeatPage_IndividualOperator_BookReturnTicket_Deny;
    @FindBy(css=".yes.ancLink")
    private WebElement redBus_btn_Result1SelectTravelsnSeatPage_IndividualOperator_BookReturnTicket_Accept;
    @FindBy(css=".available.sleeper")
    private List<WebElement> redBus_lst_img_Result1SelectTravelsnSeatPage_IndividualOperator_SeatSelection_AvailableSeats_Sleeper;
    @FindBy(css=".available.seat")
    private List<WebElement> redBus_lst_img_Result1SelectTravelsnSeatPage_IndividualOperator_SeatSelection_AvailableSeats_Seating;
    @FindBy(css=".seat.ladies")
    private List<WebElement> redBus_lst_img_Result1SelectTravelsnSeatPage_IndividualOperator_SeatSelection_ReservedLadies;
    @FindBy(css=".selected.seat")
    private List<WebElement> redBus_lst_img_Result1SelectTravelsnSeatPage_IndividualOperator_SeatSelection_SelectedSeat;
    @FindBy(css=".seat.booked")
    private List<WebElement> redBus_lst_img_Result1SelectTravelsnSeatPage_IndividualOperator_SeatSelection_SelectedByGents;
    @FindBy(css=".seat.ladiesbooked")
    private List<WebElement> redBus_lst_img_Result1SelectTravelsnSeatPage_IndividualOperator_SeatSelection_SelectedByLadies;
    @FindBy(css=".lable")
    private List<WebElement> redBus_lst_img_Result1SelectTravelsnSeatPage_IndividualOperator_SeatSelection_UpperLowerDeck;
    @FindBy(css="#PHONE")
    private WebElement redBus_txtbox_Result22UserDetailnPaymentPage_UserDetail_ContactPhone;

	By redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats							= new ByCssSelector (".viewSeatsBtn");
	By redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AllSelected						= new ByCssSelector (".selected");
	By redBus_ByCssSelector_lst_Result1SelectTravelsnSeatPage_PerOperatorAvailableSeatsText			= new ByCssSelector (".AvailableSeats");
	By redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSleeper				= new ByCssSelector (".available.sleeper");
	By redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSleeperLadies		= new ByCssSelector (".available.ladies.sleeper");
	By redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSeating				= new ByCssSelector (".available.seat");
	By redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSeatingLadies		= new ByCssSelector (".available.ladies.seat");
	By redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_SectiowiseBusOperatorGroup		= new ByCssSelector (".busItem.clearfix");
	By redBus_ByCssSelector_lst_labl_Result1SelectTravelsnSeatPage_IndividualFare					= new ByCssSelector (".Fare");
	By redBus_ByCssSelector_lst_labl_Result1SelectTravelsnSeatPage_TotalFareValue					= new ByCssSelector (".totalfare");
	By redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_Continue							= new ByCssSelector (".continueBtn");
	By redBus_ByCssSelector_lst_Result1SelectTravelsnSeatPage_UpperDeckSection						= new ByCssSelector (".upperDeck");
	By redBus_ByCssSelector_lst_Result1SelectTravelsnSeatPage_LowerDeckSection						= new ByCssSelector (".lowerDeck");
	By redBus_ByCssSelector_lst_Result1SelectTravelsnSeatPage_CancellationPolicy					= new ByCssSelector (".CancellationPolicyLink.icon");
	By redBus_ByCssSelector_lst_Result1SelectTravelsnSeatPage_mTicketMessage						= new ByCssSelector (".Mticket.icon");
	By redBus_ByCssSelector_lst_Result1SelectTravelsnSeatPage_mTicketMessage_Header					= new ByCssSelector (".Red.XXCN");
	By redBus_ByCssSelector_lst_Result1SelectTravelsnSeatPage_ratingsText							= new ByCssSelector (".ratingsText");
    
	// filtering elements
    @FindBy(css=".filterType")
    private List<WebElement> redBus_lnk_Result1SelectTravelsnSeatPage_FilterBy;
	@FindBy(linkText="Travels")
	private WebElement redBus_lnk_Result1SelectTravelsnSeatPage_FilterBy_Travels;
	@FindBy(linkText="Bus Type")
	private WebElement redBus_lnk_Result1SelectTravelsnSeatPage_FilterBy_BusType;
	@FindBy(linkText="Amenities")
	private WebElement redBus_lnk_Result1SelectTravelsnSeatPage_FilterBy_Amenities;
	@FindBy(linkText="Boarding")
	private WebElement redBus_lnk_Result1SelectTravelsnSeatPage_FilterBy_Boarding;
	@FindBy(linkText="Dropping")
	private WebElement redBus_lnk_Result1SelectTravelsnSeatPage_FilterBy_Dropping;
	@FindBy(linkText="Ratings")
	private WebElement redBus_lnk_Result1SelectTravelsnSeatPage_FilterBy_Ratings;
	@FindBy(css=".filter.Travels>ul>li>label")
	private List<WebElement> redBus_lst_lnk_Result1SelectTravelsnSeatPage_FilterBy_Travels_Items;
	@FindBy(css=".filter.BusType>ul>li>label")
	private List<WebElement> redBus_lst_lnk_Result1SelectTravelsnSeatPage_FilterBy_BusType_Items;
//	@FindBy(css=".filter.Amenities>ul>li>label")
//	private List<WebElement> redBus_lst_lnk_Result1SelectTravelsnSeatPage_FilterBy_Amenities_Items;
	@FindBy(css=".filter.BP>ul>li>label")
	private List<WebElement> redBus_lst_lnk_Result1SelectTravelsnSeatPage_FilterBy_Boarding_Items;
	@FindBy(css=".filter.DP>ul>li>label")
	private List<WebElement> redBus_lst_lnk_Result1SelectTravelsnSeatPage_FilterBy_Dropping_Items;
	@FindBy(css=".filter.Rating>ul>li>label")
	private List<WebElement> redBus_lst_lnk_Result1SelectTravelsnSeatPage_FilterBy_Ratings_Items;
	@FindBy(css=".activeFilter")
	private List<WebElement> redBus_lst_labl_Result1SelectTravelsnSeatPage_FilterBy_Applied_Active_Filter;
	@FindBy(css=".key")
	private List<WebElement> redBus_lst_labl_Result1SelectTravelsnSeatPage_FilterBy_Applied_Active_Filter_Key;
	@FindBy(css=".close")
	private List<WebElement> redBus_lst_labl_Result1SelectTravelsnSeatPage_FilterBy_Applied_Active_Filter_Close;
	
	By redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_CloseFilters			= new ByCssSelector (".close");
    
	// sorting options
	@FindBy(css=".asc")
	private List<WebElement> redBus_lst_labl_Result1SelectTravelsnSeatPage_SortByIcon_Ascending;
	@FindBy(css=".desc")
	private List<WebElement> redBus_lst_labl_Result1SelectTravelsnSeatPage_SortByIcon_Descending;
	@FindBy(css=".gtm_travelsort")
	private WebElement redBus_lst_labl_Result1SelectTravelsnSeatPage_SortBy_Travels;
	@FindBy(css=".gtm_departsort")
	private WebElement redBus_lst_labl_Result1SelectTravelsnSeatPage_SortBy_Depart;
	@FindBy(css=".gtm_arrivesort")
	private WebElement redBus_lst_labl_Result1SelectTravelsnSeatPage_SortBy_Arrive;
	@FindBy(css=".gtm_durationsort")
	private WebElement redBus_lst_labl_Result1SelectTravelsnSeatPage_SortBy_Duration;
	@FindBy(css=".gtm_availableseatsort")
	private WebElement redBus_lst_labl_Result1SelectTravelsnSeatPage_SortBy_Seats;
	@FindBy(css=".gtm_ratingsort")
	private WebElement redBus_lst_labl_Result1SelectTravelsnSeatPage_SortBy_Ratings;
	@FindBy(css=".gtm_faresort")
	private WebElement redBus_lst_labl_Result1SelectTravelsnSeatPage_SortBy_Fare;
	
	
    @FindBy(id="zzzzzzz")
    private WebElement redBus_somejunkelement;

	
    // every page object has it's local private wait with fixed 10 sec delay
    private WebDriverWait objWait 		= new WebDriverWait(this.objWebDriverAbstract, 10);
    private WebDriverWait objWaitShort 	= new WebDriverWait(this.objWebDriverAbstract, 3);

	public boolean redBus_Validate_BasicSearchInformation(String strSearchResultInformationIemsToCheck){
		
		boolean bredBus_ThisElementValidationStatus 		= true;
		boolean bSpportedElementFound						= false;
		strSearchResultInformationIemsToCheck 				= strSearchResultInformationIemsToCheck.replace("General_options__ ", "");
		int nIndividualOperatorCheckCount					= 5;
		

		if (strSearchResultInformationIemsToCheck.contains("Modify option")){
			bSpportedElementFound = true;
			if (!  redBus_lnk_Result1SelectTravelsnSeatPage_ModifySearch.isDisplayed()){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following element not found: " + "Modify option");
				objSoftAssert.fail("ERROR:    Following element not found: " + "Modify option");
				bredBus_ThisElementValidationStatus = false;}
			else{
				// click and unclick the item
				redBus_lnk_Result1SelectTravelsnSeatPage_ModifySearch.click();
				redBus_lnk_Result1SelectTravelsnSeatPage_ModifySearch.click();
			}
		}
		if (strSearchResultInformationIemsToCheck.contains("Exchange from and to city option")){
			bSpportedElementFound = true;
			redBus_lnk_Result1SelectTravelsnSeatPage_ModifySearch.click();
			if (!  redBus_btn_Result1SelectTravelsnSeatPage_ModifySearch_ExchangeFromToCity.isDisplayed()){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following element not found: " + "Exchange from and to city option");
				objSoftAssert.fail("ERROR:    Following element not found: " + "Exchange from and to city option");
				bredBus_ThisElementValidationStatus = false;}
			else{
				// click and unclick the item
				redBus_btn_Result1SelectTravelsnSeatPage_ModifySearch_ExchangeFromToCity.click();
				redBus_btn_Result1SelectTravelsnSeatPage_ModifySearch_ExchangeFromToCity.click();
			}
			redBus_lnk_Result1SelectTravelsnSeatPage_ModifySearch.click();
		}
		if (strSearchResultInformationIemsToCheck.contains("From To route name")){
			bSpportedElementFound = true;
			if (!  redBus_lst_lnk_Result1SelectTravelsnSeatPage_OnwardnReturn_RouteName.get(0).isDisplayed()){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following element not found: " + "From To route name");
				objSoftAssert.fail("ERROR:    Following element not found: " + "From To route name");
				bredBus_ThisElementValidationStatus = false;}
		}
		if (strSearchResultInformationIemsToCheck.contains("Return booking option")){
			bSpportedElementFound = true;
			if (!  redBus_lnk_Result1SelectTravelsnSeatPage_BookReturnTicket.isDisplayed()){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following element not found: " + "Return booking option");
				objSoftAssert.fail("ERROR:    Following element not found: " + "Return booking option");
				bredBus_ThisElementValidationStatus = false;}
		}
		if (strSearchResultInformationIemsToCheck.contains("Next day")){
			bSpportedElementFound = true;
			if (!  redBus_lst_btn_Result1SelectTravelsnSeatPage_NextDay.get(0).isDisplayed()){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following element not found: " + "Next day");
				objSoftAssert.fail("ERROR:    Following element not found: " + "Next day");
				bredBus_ThisElementValidationStatus = false;}
			else{
				// click the item
				redBus_lst_btn_Result1SelectTravelsnSeatPage_NextDay.get(0).click();
			}
		}
		if (strSearchResultInformationIemsToCheck.contains("Previous day")){
			bSpportedElementFound = true;
			if (!  redBus_lst_btn_Result1SelectTravelsnSeatPage_PrevDay.get(0).isDisplayed()){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following element not found: " + "Previous day");
				objSoftAssert.fail("ERROR:    Following element not found: " + "Previous day");
				bredBus_ThisElementValidationStatus = false;}
			else{
				// click the item
				redBus_lst_btn_Result1SelectTravelsnSeatPage_PrevDay.get(0).click();
			}
		}
		if (strSearchResultInformationIemsToCheck.contains("Travels")){
			bSpportedElementFound = true;
			if (!  redBus_lnk_Result1SelectTravelsnSeatPage_FilterBy_Travels.isDisplayed()){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following element not found: " + "Travels");
				objSoftAssert.fail("ERROR:    Following element not found: " + "Travels");
				bredBus_ThisElementValidationStatus = false;}
			else{
				// click and unclick the item
				redBus_lnk_Result1SelectTravelsnSeatPage_FilterBy_Travels.click();
				redBus_lnk_Result1SelectTravelsnSeatPage_FilterBy_Travels.click();
			}
		}
		if (strSearchResultInformationIemsToCheck.contains("Bus Type")){
			bSpportedElementFound = true;
			if (!  redBus_lnk_Result1SelectTravelsnSeatPage_FilterBy_BusType.isDisplayed()){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following element not found: " + "Bus Type");
				objSoftAssert.fail("ERROR:    Following element not found: " + "Bus Type");
				bredBus_ThisElementValidationStatus = false;}
			else{
				// click and unclick the item
				redBus_lnk_Result1SelectTravelsnSeatPage_FilterBy_BusType.click();
				redBus_lnk_Result1SelectTravelsnSeatPage_FilterBy_BusType.click();
			}
		}
		if (strSearchResultInformationIemsToCheck.contains("Amenities")){
			bSpportedElementFound = true;
			if (!  redBus_lnk_Result1SelectTravelsnSeatPage_FilterBy_Amenities.isDisplayed()){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following element not found: " + "Amenities");
				objSoftAssert.fail("ERROR:    Following element not found: " + "Amenities");
				bredBus_ThisElementValidationStatus = false;}
			else{
				// click and unclick the item
				redBus_lnk_Result1SelectTravelsnSeatPage_FilterBy_Amenities.click();
				redBus_lnk_Result1SelectTravelsnSeatPage_FilterBy_Amenities.click();
			}
		}
		if (strSearchResultInformationIemsToCheck.contains("Boarding")){
			bSpportedElementFound = true;
			if (!  redBus_lnk_Result1SelectTravelsnSeatPage_FilterBy_Boarding.isDisplayed()){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following element not found: " + "Boarding");
				objSoftAssert.fail("ERROR:    Following element not found: " + "Boarding");
				bredBus_ThisElementValidationStatus = false;}
			else{
				// click and unclick the item
				redBus_lnk_Result1SelectTravelsnSeatPage_FilterBy_Boarding.click();
				redBus_lnk_Result1SelectTravelsnSeatPage_FilterBy_Boarding.click();
			}
		}
		if (strSearchResultInformationIemsToCheck.contains("Dropping")){
			bSpportedElementFound = true;
			if (!  redBus_lnk_Result1SelectTravelsnSeatPage_FilterBy_Dropping.isDisplayed()){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following element not found: " + "Dropping");
				objSoftAssert.fail("ERROR:    Following element not found: " + "Dropping");
				bredBus_ThisElementValidationStatus = false;}
			else{
				// click and unclick the item
				redBus_lnk_Result1SelectTravelsnSeatPage_FilterBy_Dropping.click();
				redBus_lnk_Result1SelectTravelsnSeatPage_FilterBy_Dropping.click();
			}
		}
		if (strSearchResultInformationIemsToCheck.contains("Ratings")){
			bSpportedElementFound = true;
			if (!  redBus_lnk_Result1SelectTravelsnSeatPage_FilterBy_Ratings.isDisplayed()){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following element not found: " + "Ratings");
				objSoftAssert.fail("ERROR:    Following element not found: " + "Ratings");
				bredBus_ThisElementValidationStatus = false;}
			else{
				// click and unclick the item
				redBus_lnk_Result1SelectTravelsnSeatPage_FilterBy_Ratings.click();
				redBus_lnk_Result1SelectTravelsnSeatPage_FilterBy_Ratings.click();
			}
		}
		if (strSearchResultInformationIemsToCheck.contains("Government bus group options expand and collapse")){
			bSpportedElementFound = true;
			redBus_lnk_Result1SelectTravelsnSeatPage_ModifySearch.click();
			redBus_txtbox_Result1SelectTravelsnSeatPage_ModifySearch_DepartFromCity.sendKeys(""+ Keys.chord(Keys.CONTROL, "a") + Keys.DELETE);
			redBus_txtbox_Result1SelectTravelsnSeatPage_ModifySearch_DepartFromCity.sendKeys("Delhi");
			redBus_txtbox_Result1SelectTravelsnSeatPage_ModifySearch_ArriveToCity.sendKeys("" + Keys.chord(Keys.CONTROL, "a") + Keys.DELETE);
			redBus_txtbox_Result1SelectTravelsnSeatPage_ModifySearch_ArriveToCity.sendKeys("Lucknow");
			redBus_btn_Result1SelectTravelsnSeatPage_ModifySearch_SearchBuses.click();
			// search results are shown after long time so wait for more time
			try{objWait.until(ExpectedConditions.visibilityOfAllElements(redBus_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats));}catch (Exception e){}
			// sometimes 0th element is group of buses e.g. govt corporations so check for the last element
			try{objWait.until(ExpectedConditions.visibilityOf(redBus_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats
									.get(-1 + redBus_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats.size())));

				if(redBus_btn_Result1SelectTravelsnSeatPage_GovtBusGroup_Expand.isDisplayed()){
					// click and unclick the item
					redBus_btn_Result1SelectTravelsnSeatPage_GovtBusGroup_Expand.click();
					redBus_btn_Result1SelectTravelsnSeatPage_GovtBusGroup_Collapse.click();
				}else{
					bredBus_ThisElementValidationStatus = false;
					System.out.println("RESULT::FAIL");
					System.out.println("ERROR:    Following element not found: " + "Government bus group options expand and collapse");
					objSoftAssert.fail("ERROR:    Following element not found: " + "Government bus group options expand and collapse");					
				}
			}catch (Exception e){
				bredBus_ThisElementValidationStatus = false;
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following element not found: " + "Government bus group options search last viewseat button");
				objSoftAssert.fail("ERROR:    Following element not found: " + "Government bus group options search last viewseat button");
			}
		}
		if (strSearchResultInformationIemsToCheck.contains("Travel company name")){
			bSpportedElementFound = true;
			if (!  redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_Name
						.get(-1 + redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_Name.size()).isDisplayed()){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following element not found: " + "Travel company name");
				objSoftAssert.fail("ERROR:    Following element not found: " + "Travel company name");
				bredBus_ThisElementValidationStatus = false;}
			else{
				// print for few operator details
				for (int nLocal=0; nLocal < nIndividualOperatorCheckCount; nLocal++){
					WebElement objWebElementIndividualOperator = redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_Name.get(nLocal);
					System.out.println("DEBUG:    Individual bus operator name: " + objWebElementIndividualOperator.getText());
				}
			}
		}
		if (strSearchResultInformationIemsToCheck.contains("Journey duration")){
			bSpportedElementFound = true;
			if (!  redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_Duration
						.get(-1 + redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_Duration.size()).isDisplayed()){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following element not found: " + "Journey duration");
				objSoftAssert.fail("ERROR:    Following element not found: " + "Journey duration");
				bredBus_ThisElementValidationStatus = false;}
			else{
				// print for few operator details
				for (int nLocal=0; nLocal < nIndividualOperatorCheckCount; nLocal++){
					WebElement objWebElementIndividualOperator = redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_Duration.get(nLocal);
					System.out.println("DEBUG:    Individual bus operator journey duration: " + objWebElementIndividualOperator.getText());
				}
			}
		}
		if (strSearchResultInformationIemsToCheck.contains("Available seat count")){
			bSpportedElementFound = true;
			if (!  redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_AvailableSeats
						.get(-1 + redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_AvailableSeats.size()).isDisplayed()){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following element not found: " + "Available seat count");
				objSoftAssert.fail("ERROR:    Following element not found: " + "Available seat count");
				bredBus_ThisElementValidationStatus = false;}
			else{
				// print for few operator details
				for (int nLocal=0; nLocal < nIndividualOperatorCheckCount; nLocal++){
					WebElement objWebElementIndividualOperator = redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_AvailableSeats.get(nLocal);
					System.out.println("DEBUG:    Individual bus operator available seat count: " + objWebElementIndividualOperator.getText());
				}
			}
		}
		if (strSearchResultInformationIemsToCheck.contains("Window seat count")){
			bSpportedElementFound = true;
			if (!  redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_AvailableWindowSeats
						.get(-1 + redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_AvailableWindowSeats.size()).isDisplayed()){
				// this option is not mandatory in result listing so no need to fail the test
				//System.out.println("RESULT::FAIL");
				System.out.println("DEBUG:    Following element not found: " + "Window seat count");
				//objSoftAssert.fail("ERROR:    Following element not found: " + "Window seat count");
				//bredBus_ThisElementValidationStatus = false;
				}
			else{
				// print for few operator details
				for (int nLocal=0; nLocal < nIndividualOperatorCheckCount; nLocal++){
					WebElement objWebElementIndividualOperator = redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_AvailableWindowSeats.get(nLocal);
					System.out.println("DEBUG:    Individual bus operator window seat count: " + objWebElementIndividualOperator.getText());
				}
			}
		}
		if (strSearchResultInformationIemsToCheck.contains("Rating value")){
			bSpportedElementFound = true;
			if (!  redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_RatingValue
						.get(-1 + redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_RatingValue.size()).isDisplayed()){
				// this option is not mandatory in result listing so no need to fail the test
				//System.out.println("RESULT::FAIL");
				System.out.println("DEBUG:    Following element not found: " + "Rating value");
				//objSoftAssert.fail("ERROR:    Following element not found: " + "Rating value");
				//bredBus_ThisElementValidationStatus = false;
				}
			else{
				// print for few operator details
				for (int nLocal=0; nLocal < nIndividualOperatorCheckCount; nLocal++){
					WebElement objWebElementIndividualOperator = redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_RatingValue.get(nLocal);
					System.out.println("DEBUG:    Individual bus operator Rating value: " + objWebElementIndividualOperator.getAttribute("title"));
				}
			}
		}
		if (strSearchResultInformationIemsToCheck.contains("Total rating")){
			bSpportedElementFound = true;
			if (!  redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_TotalRating
						.get(-1 + redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_TotalRating.size()).isDisplayed()){
				// this option is not mandatory in result listing so no need to fail the test
				//System.out.println("RESULT::FAIL");
				System.out.println("DEBUG:    Following element not found: " + "Total rating");
				//objSoftAssert.fail("ERROR:    Following element not found: " + "Total rating");
				//bredBus_ThisElementValidationStatus = false;
				}
			else{
				// print for few operator details
				for (int nLocal=0; nLocal < nIndividualOperatorCheckCount; nLocal++){
					WebElement objWebElementIndividualOperator = redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_TotalRating.get(nLocal);
					System.out.println("DEBUG:    Individual bus operator Total rating: " + objWebElementIndividualOperator.getText());
				}
			}
		}    
		if (strSearchResultInformationIemsToCheck.contains("Journey start time")){
			bSpportedElementFound = true;
			if (!  redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_DepartureTime
						.get(-1 + redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_DepartureTime.size()).isDisplayed()){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following element not found: " + "Journey start time");
				objSoftAssert.fail("ERROR:    Following element not found: " + "Journey start time");
				bredBus_ThisElementValidationStatus = false;}
			else{
				// print for few operator details
				for (int nLocal=0; nLocal < nIndividualOperatorCheckCount; nLocal++){
					WebElement objWebElementIndividualOperator = redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_DepartureTime.get(nLocal);
					System.out.println("DEBUG:    Individual bus operator Journey start time: " + objWebElementIndividualOperator.getText());
				}
			}
		}
		if (strSearchResultInformationIemsToCheck.contains("Journey end time")){
			bSpportedElementFound = true;
			if (!  redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_ArrivalTime
						.get(-1 + redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_ArrivalTime.size()).isDisplayed()){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following element not found: " + "Journey end time");
				objSoftAssert.fail("ERROR:    Following element not found: " + "Journey end time");
				bredBus_ThisElementValidationStatus = false;}
			else{
				// print for few operator details
				for (int nLocal=0; nLocal < nIndividualOperatorCheckCount; nLocal++){
					WebElement objWebElementIndividualOperator = redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_ArrivalTime.get(nLocal);
					System.out.println("DEBUG:    Individual bus operator Journey end time: " + objWebElementIndividualOperator.getText());
				}
			}
		}
		if (strSearchResultInformationIemsToCheck.contains("Per seat rate")){
			bSpportedElementFound = true;
			if (!  redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_FareValue
						.get(-1 + redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_FareValue.size()).isDisplayed()){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following element not found: " + "Per seat rate");
				objSoftAssert.fail("ERROR:    Following element not found: " + "Per seat rate");
				bredBus_ThisElementValidationStatus = false;}
			else{
				// print for few operator details
				for (int nLocal=0; nLocal < nIndividualOperatorCheckCount; nLocal++){
					WebElement objWebElementIndividualOperator = redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_FareValue.get(nLocal);
					System.out.println("DEBUG:    Individual bus operator Per seat rate: " + objWebElementIndividualOperator.getText());
				}
			}
		}
		if (strSearchResultInformationIemsToCheck.contains("Seat availability")){
			bSpportedElementFound = true;
			if (!  redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_FareValue
						.get(-1 + redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_FareValue.size()).isDisplayed()){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following element not found: " + "Seat availability");
				objSoftAssert.fail("ERROR:    Following element not found: " + "Seat availability");
				bredBus_ThisElementValidationStatus = false;}
			else{
				// print for few operator details
				for (int nLocal=0; nLocal < nIndividualOperatorCheckCount; nLocal++){
					WebElement objWebElementIndividualOperator = redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_FareValue.get(nLocal);
					String strSeatAvailability = objWebElementIndividualOperator.getText();
					if (strSeatAvailability.isEmpty()) 	strSeatAvailability = "No seats available";
					System.out.println("DEBUG:    Individual bus operator Seat availability: " + strSeatAvailability);
				}
			}
		}
		if (strSearchResultInformationIemsToCheck.contains("Sold out")){
			// typically today's few tickets are sold out, so navigate back to today
			boolean bIsItToday = false;
			while (!bIsItToday){
				redBus_lst_btn_Result1SelectTravelsnSeatPage_PrevDay.get(0).click();
				try{objWaitShort.until(ExpectedConditions.visibilityOf(redBus_lst_btn_Result1SelectTravelsnSeatPage_PrevDay.get(0)));
					if(redBus_lst_btn_Result1SelectTravelsnSeatPage_PrevDay.get(0).getAttribute("class").contains("inactive")){
						bIsItToday = true;
					}
				}catch (Exception e){ /* Today has arrived */ bIsItToday = true;}
			}
			// search results are shown after more time so wait for more time
			try{objWait.until(ExpectedConditions.visibilityOfAllElements(redBus_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats));}catch (Exception e){}
			// search results are shown after more time so wait for more time
			try{objWait.until(ExpectedConditions.visibilityOf(redBus_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats
														.get(-1 + redBus_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats.size())));}catch (Exception e){}
			
			bSpportedElementFound = true;
			if (!  redBus_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats
						.get(-1 + redBus_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats.size()).isDisplayed()){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following element not found: " + "Sold out");
				objSoftAssert.fail("ERROR:    Following element not found: " + "Sold out");
				bredBus_ThisElementValidationStatus = false;}
			else{
				// print for few operator details
				int nLocalIndividualOperatorCheckCount = redBus_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats.size();
				for (	int nLocal=nLocalIndividualOperatorCheckCount- nIndividualOperatorCheckCount; 
						nLocal < nLocalIndividualOperatorCheckCount; 
						nLocal++){
					WebElement objWebElementIndividualOperator = redBus_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats.get(nLocal);
					System.out.println("DEBUG:    Individual bus operator Sold out: " + objWebElementIndividualOperator.getText());
				}
			}
		}
		if (strSearchResultInformationIemsToCheck.contains("Hide seat or view seat")){
			bSpportedElementFound = true;
			if (!  redBus_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats
						.get(-1 + redBus_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats.size()).isDisplayed()){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following element not found: " + "Hide seat or view seat");
				objSoftAssert.fail("ERROR:    Following element not found: " + "Hide seat or view seat");
				bredBus_ThisElementValidationStatus = false;}
			else{
				// click on viw seat then click on hide seat
				for (int nLocal=0; nLocal < nIndividualOperatorCheckCount; nLocal++){
					WebElement objWebElementIndividualOperator = redBus_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats.get(nLocal);
					if (! objWebElementIndividualOperator.isDisplayed()) {nIndividualOperatorCheckCount++; continue;}

					// first click on view seat
					objWebElementIndividualOperator.click();

					// seat selection results are shown after more time so wait for more time
					try{objWait.until(ExpectedConditions.visibilityOfAllElements(redBus_lst_btn_Result1SelectTravelsnSeatPage_IndividualOperator_SeatSelection_Continue));}catch (Exception e){}
					try{objWait.until(ExpectedConditions.visibilityOfAllElements(redBus_lst_btn_Result1SelectTravelsnSeatPage_IndividualOperator_SeatSelection_Continue));}catch (Exception e){}
					
					// first click on hide seat
					objWebElementIndividualOperator.click();
				}
			}
		}
		if (strSearchResultInformationIemsToCheck.contains("Cancellation policy")){
			bSpportedElementFound = true;
			if (!  redBus_lst_img_Result1SelectTravelsnSeatPage_IndividualOperator_IconCancellationPolicy
						.get(-1 + redBus_lst_img_Result1SelectTravelsnSeatPage_IndividualOperator_IconCancellationPolicy.size()).isDisplayed()){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following element not found: " + "Cancellation policy");
				objSoftAssert.fail("ERROR:    Following element not found: " + "Cancellation policy");
				bredBus_ThisElementValidationStatus = false;}
		}
		if (strSearchResultInformationIemsToCheck.contains("Bus Photos")){
			bSpportedElementFound = true;
			if (!  redBus_lst_img_Result1SelectTravelsnSeatPage_IndividualOperator_IconBusPhotos
						.get(-1 + redBus_lst_img_Result1SelectTravelsnSeatPage_IndividualOperator_IconBusPhotos.size()).isDisplayed()){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following element not found: " + "Bus Photos");
				objSoftAssert.fail("ERROR:    Following element not found: " + "Bus Photos");
				bredBus_ThisElementValidationStatus = false;}
		}
		if (strSearchResultInformationIemsToCheck.contains("mTicket availability")){
			bSpportedElementFound = true;
			if (!  redBus_lst_img_Result1SelectTravelsnSeatPage_IndividualOperator_IconMticket
						.get(-1 + redBus_lst_img_Result1SelectTravelsnSeatPage_IndividualOperator_IconMticket.size()).isDisplayed()){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following element not found: " + "mTicket availability");
				objSoftAssert.fail("ERROR:    Following element not found: " + "mTicket availability");
				bredBus_ThisElementValidationStatus = false;}
		}
		
		
		if (strSearchResultInformationIemsToCheck.contains("Seat_information__")){

			if (!  redBus_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats
						.get(-1 + redBus_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats.size()).isDisplayed()){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following element not found: " + "Seat_information__");
				objSoftAssert.fail("ERROR:    Following element not found: " + "Seat_information__");
				bredBus_ThisElementValidationStatus = false;}
			else{
				// click on view seat then click on hide seat
				for (int nLocal=0; nLocal < nIndividualOperatorCheckCount; nLocal++){
					
					WebElement objWebElementIndividualOperator = redBus_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats.get(nLocal);
					if (! objWebElementIndividualOperator.isDisplayed()) {nIndividualOperatorCheckCount++; continue;}

					// first click on view seat
					objWebElementIndividualOperator.click();

					// seat selection results are shown after more time so wait for more time
					try{objWait.until(ExpectedConditions.visibilityOfAllElements(redBus_lst_btn_Result1SelectTravelsnSeatPage_IndividualOperator_SeatSelection_Continue));}catch (Exception e){}
					try{objWait.until(ExpectedConditions.visibilityOfAllElements(redBus_lst_btn_Result1SelectTravelsnSeatPage_IndividualOperator_SeatSelection_Continue));}catch (Exception e){}

						// for individual bus operator check intended items
						if (strSearchResultInformationIemsToCheck.contains("Available user seat count")){
							bSpportedElementFound = true;
							if (  redBus_lst_img_Result1SelectTravelsnSeatPage_IndividualOperator_SeatSelection_AvailableSeats_Sleeper.size() >=1 ||
								  redBus_lst_img_Result1SelectTravelsnSeatPage_IndividualOperator_SeatSelection_AvailableSeats_Seating.size() >=1    ){
								// print for few operator details
								System.out.println("DEBUG:    Individual bus operator Available seat count sleeper: " + 
										redBus_lst_img_Result1SelectTravelsnSeatPage_IndividualOperator_SeatSelection_AvailableSeats_Sleeper.size());
								System.out.println("DEBUG:    Individual bus operator Available seat count seating: " + 
										redBus_lst_img_Result1SelectTravelsnSeatPage_IndividualOperator_SeatSelection_AvailableSeats_Seating.size());
							}else{
								System.out.println("RESULT::FAIL");
								System.out.println("ERROR:    Following element not found: " + "Available seat count");
								objSoftAssert.fail("ERROR:    Following element not found: " + "Available seat count");
								bredBus_ThisElementValidationStatus = false;
							}
						}
						if (strSearchResultInformationIemsToCheck.contains("Reserved for ladies")){
							bSpportedElementFound = true;
							if (  redBus_lst_img_Result1SelectTravelsnSeatPage_IndividualOperator_SeatSelection_ReservedLadies.size() >=1    ){
								// print for few operator details
								System.out.println("DEBUG:    Individual bus operator Reserved for ladies: " + 
										redBus_lst_img_Result1SelectTravelsnSeatPage_IndividualOperator_SeatSelection_ReservedLadies.size());
							}else{
								// this option is not mandatory in result listing so no need to fail the test
								//System.out.println("RESULT::FAIL");
								System.out.println("ERROR:    Following element not found: " + "Reserved for ladies");
								//objSoftAssert.fail("ERROR:    Following element not found: " + "Reserved for ladies");
								//bredBus_ThisElementValidationStatus = false;
							}
						}
						if (strSearchResultInformationIemsToCheck.contains("Selected seat")){
							bSpportedElementFound = true;
							if (  redBus_lst_img_Result1SelectTravelsnSeatPage_IndividualOperator_SeatSelection_SelectedSeat.size() >=0    ){
								// print for few operator details
								System.out.println("DEBUG:    Individual bus operator Selected seat: " + 
										redBus_lst_img_Result1SelectTravelsnSeatPage_IndividualOperator_SeatSelection_SelectedSeat.size());
							}else{
								// this option is not mandatory in result listing so no need to fail the test
								//System.out.println("RESULT::FAIL");
								System.out.println("ERROR:    Following element not found: " + "Selected seat");
								//objSoftAssert.fail("ERROR:    Following element not found: " + "Selected seat");
								//bredBus_ThisElementValidationStatus = false;
							}
						}
						if (strSearchResultInformationIemsToCheck.contains("Booked by gents")){
							bSpportedElementFound = true;
							if (  redBus_lst_img_Result1SelectTravelsnSeatPage_IndividualOperator_SeatSelection_SelectedByGents.size() >=1    ){
								// print for few operator details
								System.out.println("DEBUG:    Individual bus operator Booked by gents: " + 
										redBus_lst_img_Result1SelectTravelsnSeatPage_IndividualOperator_SeatSelection_SelectedByGents.size());
							}else{
								// this option is not mandatory in result listing so no need to fail the test
								//System.out.println("RESULT::FAIL");
								System.out.println("ERROR:    Following element not found: " + "Booked by gents");
								//objSoftAssert.fail("ERROR:    Following element not found: " + "Booked by gents");
								//bredBus_ThisElementValidationStatus = false;
							}
						}
						if (strSearchResultInformationIemsToCheck.contains("Booked by ladies")){
							bSpportedElementFound = true;
							if (  redBus_lst_img_Result1SelectTravelsnSeatPage_IndividualOperator_SeatSelection_SelectedByLadies.size() >=1    ){
								// print for few operator details
								System.out.println("DEBUG:    Individual bus operator Booked by ladies: " + 
										redBus_lst_img_Result1SelectTravelsnSeatPage_IndividualOperator_SeatSelection_SelectedByLadies.size());
							}else{
								// this option is not mandatory in result listing so no need to fail the test
								//System.out.println("RESULT::FAIL");
								System.out.println("ERROR:    Following element not found: " + "Booked by ladies");
								//objSoftAssert.fail("ERROR:    Following element not found: " + "Booked by ladies");
								//bredBus_ThisElementValidationStatus = false;
							}
						}
						if (strSearchResultInformationIemsToCheck.contains("Lower and Upper")){
							bSpportedElementFound = true;
							if (  redBus_lst_img_Result1SelectTravelsnSeatPage_IndividualOperator_SeatSelection_UpperLowerDeck.size() >=1    ){
								// print for few operator details
								System.out.println("DEBUG:    Individual bus operator Lower and Upper: " + 
										redBus_lst_img_Result1SelectTravelsnSeatPage_IndividualOperator_SeatSelection_UpperLowerDeck.size());
							}else{
								// this option is not mandatory in result listing so no need to fail the test
								//System.out.println("RESULT::FAIL");
								System.out.println("ERROR:    Following element not found: " + "Lower and Upper");
								//objSoftAssert.fail("ERROR:    Following element not found: " + "Lower and Upper");
								//bredBus_ThisElementValidationStatus = false;
							}
						}					
					
					// first click on hide seat
					objWebElementIndividualOperator.click();

					// wait until the hide seat is closed
					try{objWait.until(ExpectedConditions.visibilityOf(objWebElementIndividualOperator));}catch (Exception e){}
				}
			}			
			
		}
		
		
		
		

		
	
		

		if (!bSpportedElementFound){
			System.out.println("ERROR:    Atleast one unsupported element NOT found in Basic search information");
			objSoftAssert.fail("ERROR:    Atleast one unsupported element NOT found in Basic search information");
			return bSpportedElementFound;
		}
		if (bredBus_ThisElementValidationStatus) {
			System.out.println("RESULT::PASS");
			System.out.println("DEBUG:    All supported elements found in Basic search information");
		}
		else{
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Atleast one supported element NOT found in Basic search information");
			objSoftAssert.fail("ERROR:    Atleast one supported element NOT found in Basic search information");
		}
		
		return bredBus_ThisElementValidationStatus;
	}

	public boolean redBus_Validate_EndToEnd_Search_Scenario__TYPE1_CASE1(){

		boolean bredBus_ThisElementValidationStatus 		= true;

		System.out.println("DEBUG:    Booking ticket for first search result with atleast one seat available");
		System.out.println("                             and select any seat");
		System.out.println("                             and very first boarding point");
		System.out.println("                             and no return ticket");

		// if no private bus operators found then don't book any ticket
		int nredBus_PrivateBusOperatorBuses_Count 	= redBus_Get_PrivateBusOprerator_Bus_Count();
		// >0 means atlease 1 private bus available
		// >1 means atlease 2 private bus available
		if (nredBus_PrivateBusOperatorBuses_Count < 1){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    No private bus oprtator found");
			objSoftAssert.fail("ERROR:    No private bus oprtator found");
			return false;
		}

		// check if atleast single seat is availble for the index (first, second) user wants to book
		int nredBus_FirstPrivateOperatorBusIndex 	= redBus_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats.size() - nredBus_PrivateBusOperatorBuses_Count;
		try{redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_AvailableSeats.get(nredBus_FirstPrivateOperatorBusIndex);
		}catch (Exception e){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Search result bus operator count for private buses is not sufficient");
			objSoftAssert.fail("ERROR:    Search result bus operator count for private buses is not sufficient");
			return false;
		}

		// select seat for this private bus operator bus index and first boarding point and no return ticket
		redBus_SelectAvailableSeat_and_FirstBoardingPoint(0,false,1);

		//wait until the payment section is shown
		try{objWait.until(ExpectedConditions.visibilityOf(redBus_txtbox_Result22UserDetailnPaymentPage_UserDetail_ContactPhone));}catch (Exception e){}
		try{objWait.until(ExpectedConditions.visibilityOf(redBus_txtbox_Result22UserDetailnPaymentPage_UserDetail_ContactPhone));}catch (Exception e){}
		
		return bredBus_ThisElementValidationStatus;
	}

	public boolean redBus_Validate_EndToEnd_Search_Scenario__TYPE1_CASE1_Part2(){

		boolean bredBus_ThisElementValidationStatus 		= true;

		System.out.println("DEBUG:    Booking ticket for first search result with atleast one seat available");
		System.out.println("                             and select any seat");
		System.out.println("                             and very first boarding point");

		// if no private bus operators found then don't book any ticket
		int nredBus_PrivateBusOperatorBuses_Count_Return 	= redBus_Get_PrivateBusOprerator_Bus_Count_Return();
		// >0 means atlease 1 private bus available
		// >1 means atlease 2 private bus available
		if (nredBus_PrivateBusOperatorBuses_Count_Return < 1){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    No private bus oprtator found");
			objSoftAssert.fail("ERROR:    No private bus oprtator found");
			return false;
		}

		// check if atleast single seat is availble for the index (first, second) user wants to book
		int nredBus_FirstPrivateOperatorBusIndex 	= redBus_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats.size() - nredBus_PrivateBusOperatorBuses_Count_Return;
		try{redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_AvailableSeats.get(nredBus_FirstPrivateOperatorBusIndex);
		}catch (Exception e){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Search result bus operator count for private buses is not sufficient");
			objSoftAssert.fail("ERROR:    Search result bus operator count for private buses is not sufficient");
			return false;
		}

		// select seat for this private bus operator bus index and first boarding point and no return ticket
		redBus_SelectAvailableSeat_and_FirstBoardingPoint_Return(0,false);

		//wait until the payment section is shown
		try{objWait.until(ExpectedConditions.visibilityOf(redBus_txtbox_Result22UserDetailnPaymentPage_UserDetail_ContactPhone));}catch (Exception e){}
		try{objWait.until(ExpectedConditions.visibilityOf(redBus_txtbox_Result22UserDetailnPaymentPage_UserDetail_ContactPhone));}catch (Exception e){}
		
		return bredBus_ThisElementValidationStatus;
	}
	
	public boolean redBus_Validate_EndToEnd_Search_Scenario__TYPE1_CASE2(){

		boolean bredBus_ThisElementValidationStatus 		= true;

		System.out.println("DEBUG:    Booking ticket for first search result with atleast one seat available");
		System.out.println("                             and select random seat");
		System.out.println("                             and cancel the same");

		// if no private bus operators found then don't book any ticket
		int nredBus_PrivateBusOperatorBuses_Count 	= redBus_Get_PrivateBusOprerator_Bus_Count();
		// >0 means atlease 1 private bus available
		// >1 means atlease 2 private bus available
		if (nredBus_PrivateBusOperatorBuses_Count < 1){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    No private bus oprtator found");
			objSoftAssert.fail("ERROR:    No private bus oprtator found");
			return false;
		}

		// check if atleast single seat is availble for the index (first, second) user wants to book
		int nredBus_FirstPrivateOperatorBusIndex 	= redBus_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats.size() - nredBus_PrivateBusOperatorBuses_Count;
		try{redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_AvailableSeats.get(nredBus_FirstPrivateOperatorBusIndex);
		}catch (Exception e){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Search result bus operator count for private buses is not sufficient");
			objSoftAssert.fail("ERROR:    Search result bus operator count for private buses is not sufficient");
			return false;
		}

		// select seat for this private bus operator bus index and first boarding point and no return ticket
		redBus_SelectAvailableSeat_Random(0);
		
		// cancel the same by clicking on home link
		redBus_lnk_Result1SelectTravelsnSeatPage_Home.click();
		objWait.until(ExpectedConditions.visibilityOf(redBus_lnk_Result1SelectTravelsnSeatPage_Home));

		return bredBus_ThisElementValidationStatus;
	}
	
	public boolean redBus_Validate_EndToEnd_Search_Scenario__TYPE1_CASE3(){

		boolean bredBus_ThisElementValidationStatus 		= true;
		
		System.out.println("DEBUG:    Booking ticket for third search result");
		System.out.println("                             with atleast one ladies seat available");
		System.out.println("                             and very first boarding point");
		System.out.println("                             and no return ticket");

		// if no private bus operators found then don't book any ticket
		int nredBus_PrivateBusOperatorBuses_Count 	= redBus_Get_PrivateBusOprerator_Bus_Count();
		// >0 means atlease 1 private bus available
		// >1 means atlease 2 private bus available
		if (nredBus_PrivateBusOperatorBuses_Count < 1){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    No private bus oprtator found");
			objSoftAssert.fail("ERROR:    No private bus oprtator found");
			return false;
		}

		// check if atleast single seat is availble for the index (first, second) user wants to book
		int nredBus_FirstPrivateOperatorBusIndex 	= redBus_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats.size() - nredBus_PrivateBusOperatorBuses_Count;
		try{redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_AvailableSeats.get(nredBus_FirstPrivateOperatorBusIndex);
		}catch (Exception e){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Search result bus operator count for private buses is not sufficient");
			objSoftAssert.fail("ERROR:    Search result bus operator count for private buses is not sufficient");
			return false;
		}

		// select seat for this private bus operator bus index and first boarding point and no return ticket
		if(! redBus_SelectAvailableSeat_Ladies_and_FirstBoardingPoint(2)){
			// if no ladies reserved seats available then book normal seats
			// select seat for this private bus operator bus index and first boarding point and no return ticket
			redBus_SelectAvailableSeat_and_FirstBoardingPoint(2,false,1);
		}

		//wait until the payment section is shown
		try{objWait.until(ExpectedConditions.visibilityOf(redBus_txtbox_Result22UserDetailnPaymentPage_UserDetail_ContactPhone));}catch (Exception e){}
		try{objWait.until(ExpectedConditions.visibilityOf(redBus_txtbox_Result22UserDetailnPaymentPage_UserDetail_ContactPhone));}catch (Exception e){}
		
		return bredBus_ThisElementValidationStatus;
	}
	
	public boolean redBus_Validate_EndToEnd_Search_Scenario__TYPE1_CASE4(){

		boolean bredBus_ThisElementValidationStatus 		= true;

		System.out.println("DEBUG:    Booking ticket for first search result with atleast one seat available");
		System.out.println("                             and select ladies and gents seat");
		System.out.println("                             and cancel the same");

		// if no private bus operators found then don't book any ticket
		int nredBus_PrivateBusOperatorBuses_Count 	= redBus_Get_PrivateBusOprerator_Bus_Count();
		// >0 means atlease 1 private bus available
		// >1 means atlease 2 private bus available
		if (nredBus_PrivateBusOperatorBuses_Count < 1){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    No private bus oprtator found");
			objSoftAssert.fail("ERROR:    No private bus oprtator found");
			return false;
		}

		// check if atleast single seat is availble for the index (first, second) user wants to book
		int nredBus_FirstPrivateOperatorBusIndex 	= redBus_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats.size() - nredBus_PrivateBusOperatorBuses_Count;
		try{redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_AvailableSeats.get(nredBus_FirstPrivateOperatorBusIndex);
		}catch (Exception e){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Search result bus operator count for private buses is not sufficient");
			objSoftAssert.fail("ERROR:    Search result bus operator count for private buses is not sufficient");
			return false;
		}

		// select seat for this private bus operator bus index and first boarding point and no return ticket
		redBus_SelectAvailableSeat_LadiesAndGents_and_FirstBoardingPoint(1);
		
		// cancel the same by clicking on home link
		redBus_lnk_Result1SelectTravelsnSeatPage_Home.click();
		objWait.until(ExpectedConditions.visibilityOf(redBus_lnk_Result1SelectTravelsnSeatPage_Home));

		return bredBus_ThisElementValidationStatus;
	}
	
	public boolean redBus_Validate_EndToEnd_Search_Scenario__TYPE1_CASE5(){

		boolean bredBus_ThisElementValidationStatus 		= true;
		
		System.out.println("DEBUG:    Booking ticket for last search result");
		System.out.println("                             with atleast one upper seat available");
		System.out.println("                             and book the ticket until payment section");

		// if no private bus operators found then don't book any ticket
		int nredBus_PrivateBusOperatorBuses_Count 	= redBus_Get_PrivateBusOprerator_Bus_Count();
		// >0 means atlease 1 private bus available
		// >1 means atlease 2 private bus available
		if (nredBus_PrivateBusOperatorBuses_Count < 1){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    No private bus oprtator found");
			objSoftAssert.fail("ERROR:    No private bus oprtator found");
			return false;
		}

		// check if atleast single seat is availble for the index (first, second) user wants to book
		int nredBus_FirstPrivateOperatorBusIndex 	= redBus_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats.size() - nredBus_PrivateBusOperatorBuses_Count;
		try{redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_AvailableSeats.get(nredBus_FirstPrivateOperatorBusIndex);
		}catch (Exception e){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Search result bus operator count for private buses is not sufficient");
			objSoftAssert.fail("ERROR:    Search result bus operator count for private buses is not sufficient");
			return false;
		}

		int nredBus_LastValidPrivateOperatorBusIndex = nredBus_FirstPrivateOperatorBusIndex;
		for (; nredBus_LastValidPrivateOperatorBusIndex < redBus_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats.size(); 
			   nredBus_LastValidPrivateOperatorBusIndex++){
				if(redBus_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats
						.get(nredBus_LastValidPrivateOperatorBusIndex)
						.getText()
						.contains("Sold Out"))
							break;
		}

		nredBus_LastValidPrivateOperatorBusIndex = nredBus_LastValidPrivateOperatorBusIndex - nredBus_FirstPrivateOperatorBusIndex - 1;
		redBus_SelectAvailableSeat_Upper_and_FirstBoardingPoint(nredBus_LastValidPrivateOperatorBusIndex);

		//wait until the payment section is shown
		try{objWait.until(ExpectedConditions.visibilityOf(redBus_txtbox_Result22UserDetailnPaymentPage_UserDetail_ContactPhone));}catch (Exception e){}
		try{objWait.until(ExpectedConditions.visibilityOf(redBus_txtbox_Result22UserDetailnPaymentPage_UserDetail_ContactPhone));}catch (Exception e){}
		
		return bredBus_ThisElementValidationStatus;
	}
	
	public boolean redBus_Validate_EndToEnd_Search_Scenario__TYPE1_CASE6(){

		boolean bredBus_ThisElementValidationStatus 		= true;

		System.out.println("DEBUG:    Booking ticket for first search result from government bus group");
		System.out.println("                             with atleast one lower seat available");
		System.out.println("                             and book the ticket until payment section");

		// if no govt bus operators found then don't book any ticket
		int nredBus_GovtBusOperatorBuses_Count 	= redBus_Get_GovernmentGroupBus_Count();
		if (nredBus_GovtBusOperatorBuses_Count < 1){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    No govt bus oprtator found");
			objSoftAssert.fail("ERROR:    No govt bus oprtator found");
			return false;
		}
		
		// expand govt bus group
		redBus_btn_Result1SelectTravelsnSeatPage_GovtBusGroup_Expand.click();

		// check if atleast single seat is availble for the index (first, second) user wants to book
		try{redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_AvailableSeats.get(0);
		}catch (Exception e){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Search result bus operator count for govt buses is not sufficient");
			objSoftAssert.fail("ERROR:    Search result bus operator count for govt buses is not sufficient");
			return false;
		}

		int nredBus_FirstValidGovtOperatorBusIndex = 0;
		for (; nredBus_FirstValidGovtOperatorBusIndex < nredBus_GovtBusOperatorBuses_Count; 
				nredBus_FirstValidGovtOperatorBusIndex++){
				if(redBus_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats
						.get(nredBus_FirstValidGovtOperatorBusIndex)
						.getText()
						.contains("View Seats"))
							break;
		}

		redBus_SelectAvailableSeat_Lower_and_FirstBoardingPoint(nredBus_FirstValidGovtOperatorBusIndex);

		//wait until the payment section is shown
		try{objWait.until(ExpectedConditions.visibilityOf(redBus_txtbox_Result22UserDetailnPaymentPage_UserDetail_ContactPhone));}catch (Exception e){}
		try{objWait.until(ExpectedConditions.visibilityOf(redBus_txtbox_Result22UserDetailnPaymentPage_UserDetail_ContactPhone));}catch (Exception e){}
		
		return bredBus_ThisElementValidationStatus;
	}
	
	// refer this one
	public boolean redBus_Validate_EndToEnd_Search_Scenario__TYPE2_CASE1(){

		boolean bredBus_ThisElementValidationStatus 		= true;
		
		System.out.println("DEBUG:    Filter search result by first travel company");
		System.out.println("                             and select first search result with atleast one seat available");
		System.out.println("                             and select any seat");
		System.out.println("                             and very first boarding point");
		System.out.println("                             and no return ticket");

		// if no private bus operators found then don't book any ticket
		int nredBus_PrivateBusOperatorBuses_Count 	= redBus_Get_PrivateBusOprerator_Bus_Count();
		// >0 means atlease 1 private bus available
		// >1 means atlease 2 private bus available
		if (nredBus_PrivateBusOperatorBuses_Count < 1){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    No private bus oprtator found");
			objSoftAssert.fail("ERROR:    No private bus oprtator found");
			return false;
		}

		// indexing format = idex__ (starting string)
		//                   seperate indexes by '__' pattern only
		//                    0 means first index
		//                   -1 means last index
		//                   -2 means second last index and so on
		// redBus_FilterBy_and_OptionIndex("Travels","index__0__1__-1");   this is for example
		redBus_FilterBy_and_OptionIndex("Travels","index__0");

		// if no private bus operators found then don't book any ticket
		nredBus_PrivateBusOperatorBuses_Count 	= redBus_Get_PrivateBusOprerator_Bus_Count();
		// >0 means atlease 1 private bus available
		// >1 means atlease 2 private bus available
		if (nredBus_PrivateBusOperatorBuses_Count < 1){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    No private bus oprtator found");
			objSoftAssert.fail("ERROR:    No private bus oprtator found");
			return false;
		}

		// check if atleast single seat is availble for the index (first, second) user wants to book
		int nredBus_FirstPrivateOperatorBusIndex 	= redBus_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats.size() - nredBus_PrivateBusOperatorBuses_Count;
		try{redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_AvailableSeats.get(nredBus_FirstPrivateOperatorBusIndex);
		}catch (Exception e){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Search result bus operator count for private buses is not sufficient");
			objSoftAssert.fail("ERROR:    Search result bus operator count for private buses is not sufficient");
			return false;
		}

		// select seat for this private bus operator bus index and first boarding point and no return ticket
		if( ! redBus_SelectAvailableSeat_and_FirstBoardingPoint(0,false,1)){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Search result bus operator all tickets are sold out");
			objSoftAssert.fail("ERROR:    Search result bus operator all tickets are sold out");
			return false;
		}
		
		//wait until the payment section is shown
		try{objWait.until(ExpectedConditions.visibilityOf(redBus_txtbox_Result22UserDetailnPaymentPage_UserDetail_ContactPhone));}catch (Exception e){}
		try{objWait.until(ExpectedConditions.visibilityOf(redBus_txtbox_Result22UserDetailnPaymentPage_UserDetail_ContactPhone));}catch (Exception e){}
		
		return bredBus_ThisElementValidationStatus;
	}
	
	public boolean redBus_Validate_EndToEnd_Search_Scenario__TYPE2_CASE2(){

		boolean bredBus_ThisElementValidationStatus 		= true;
		
		System.out.println("DEBUG:    Filter search result by any bus type");
		System.out.println("                             and select first search result with atleast one seat available");
		System.out.println("                             and clear the filter list");

		// if no private bus operators found then don't book any ticket
		int nredBus_PrivateBusOperatorBuses_Count 	= redBus_Get_PrivateBusOprerator_Bus_Count();
		// >0 means atlease 1 private bus available
		// >1 means atlease 2 private bus available
		if (nredBus_PrivateBusOperatorBuses_Count < 1){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    No private bus oprtator found");
			objSoftAssert.fail("ERROR:    No private bus oprtator found");
			return false;
		}

		// indexing format = idex__ (starting string)
		//                   seperate indexes by '__' pattern only
		//                    0 means first index
		//                   -1 means last index
		//                   -2 means second last index and so on
		// redBus_FilterBy_and_OptionIndex("Travels","index__0__2__-1__random");   this is for example
		redBus_FilterBy_and_OptionIndex("Bus Type","index__random");

		// if no private bus operators found then don't book any ticket
		nredBus_PrivateBusOperatorBuses_Count 	= redBus_Get_PrivateBusOprerator_Bus_Count();
		// >0 means atlease 1 private bus available
		// >1 means atlease 2 private bus available
		if (nredBus_PrivateBusOperatorBuses_Count < 1){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    No private bus oprtator found");
			objSoftAssert.fail("ERROR:    No private bus oprtator found");
			return false;
		}

		// check if atleast single seat is availble for the index (first, second) user wants to book
		int nredBus_FirstPrivateOperatorBusIndex 	= redBus_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats.size() - nredBus_PrivateBusOperatorBuses_Count;
		try{redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_AvailableSeats.get(nredBus_FirstPrivateOperatorBusIndex);
		}catch (Exception e){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Search result bus operator count for private buses is not sufficient");
			objSoftAssert.fail("ERROR:    Search result bus operator count for private buses is not sufficient");
			return false;
		}

		if( ! redBus_Clear_All_Filters())	bredBus_ThisElementValidationStatus = false;
		
		return bredBus_ThisElementValidationStatus;
	}
		
	public boolean redBus_Validate_EndToEnd_Search_Scenario__TYPE2_CASE3(){

		boolean bredBus_ThisElementValidationStatus 		= true;

		System.out.println("DEBUG:    Filter search result by third travel company name among the list");
		System.out.println("                             and select first search result with atleast one seat available");
		System.out.println("                             and book return ticket");
		System.out.println("                             and select first search result with atleast one seat available");

		// if no private bus operators found then don't book any ticket
		int nredBus_PrivateBusOperatorBuses_Count 	= redBus_Get_PrivateBusOprerator_Bus_Count();
		// >0 means atlease 1 private bus available
		// >1 means atlease 2 private bus available
		if (nredBus_PrivateBusOperatorBuses_Count < 1){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    No private bus oprtator found");
			objSoftAssert.fail("ERROR:    No private bus oprtator found");
			return false;
		}

		// indexing format = idex__ (starting string)
		//                   seperate indexes by '__' pattern only
		//                    0 means first index
		//                   -1 means last index
		//                   -2 means second last index and so on
		// redBus_FilterBy_and_OptionIndex("Travels","index__0__1__-1");   this is for example
		redBus_FilterBy_and_OptionIndex("Travels","index__2");

		// if no private bus operators found then don't book any ticket
		nredBus_PrivateBusOperatorBuses_Count 	= redBus_Get_PrivateBusOprerator_Bus_Count();
		// >0 means atlease 1 private bus available
		// >1 means atlease 2 private bus available
		if (nredBus_PrivateBusOperatorBuses_Count < 1){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    No private bus oprtator found");
			objSoftAssert.fail("ERROR:    No private bus oprtator found");
			return false;
		}

		// check if atleast single seat is availble for the index (first, second) user wants to book
		int nredBus_FirstPrivateOperatorBusIndex 	= redBus_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats.size() - nredBus_PrivateBusOperatorBuses_Count;
		try{redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_AvailableSeats.get(nredBus_FirstPrivateOperatorBusIndex);
		}catch (Exception e){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Search result bus operator count for private buses is not sufficient");
			objSoftAssert.fail("ERROR:    Search result bus operator count for private buses is not sufficient");
			return false;
		}

		// select seat for this private bus operator bus index and first boarding point and intend to book return ticket as well
		if( ! redBus_SelectAvailableSeat_and_FirstBoardingPoint(0,true,1)){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Search result bus operator all tickets are sold out onward journey");
			objSoftAssert.fail("ERROR:    Search result bus operator all tickets are sold out onward journey");
			return false;
		}
		
		//wait until the payment section is shown
		try{objWait.until(ExpectedConditions.visibilityOf(redBus_txtbox_Result22UserDetailnPaymentPage_UserDetail_ContactPhone));}catch (Exception e){}
		try{objWait.until(ExpectedConditions.visibilityOf(redBus_txtbox_Result22UserDetailnPaymentPage_UserDetail_ContactPhone));}catch (Exception e){}
		
		return bredBus_ThisElementValidationStatus;
	}
	
	public boolean redBus_Validate_EndToEnd_Search_Scenario__TYPE2_CASE3_Part2(){

		boolean bredBus_ThisElementValidationStatus 		= true;

		// if no private bus operators found then don't book any ticket
		int nredBus_PrivateBusOperatorBuses_Count_Return 	= redBus_Get_PrivateBusOprerator_Bus_Count_Return();
		// >0 means atlease 1 private bus available
		// >1 means atlease 2 private bus available
		if (nredBus_PrivateBusOperatorBuses_Count_Return < 1){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Return journey - No private bus oprtator found");
			objSoftAssert.fail("ERROR:    Return journey - No private bus oprtator found");
			return false;
		}

		int nredBus_TotalPrivateOperatorBusCount_Return =  this.objWebDriverAbstract.findElement(By.id("returnTrip"))
																.findElement(By.cssSelector(".PrivateBuses"))
																.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats)
																.size();

		// check if atleast single seat is availble for the index (first, second) user wants to book
		int nredBus_FirstPrivateOperatorBusIndex_Return 	= nredBus_TotalPrivateOperatorBusCount_Return - nredBus_PrivateBusOperatorBuses_Count_Return;
		try{redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_AvailableSeats.get(nredBus_FirstPrivateOperatorBusIndex_Return);
		}catch (Exception e){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Return journey - Search result bus operator count for private buses is not sufficient");
			objSoftAssert.fail("ERROR:    Return journey - Search result bus operator count for private buses is not sufficient");
			return false;
		}

		// select seat for this private bus operator bus index and first boarding point and intend to book return ticket as well
		if( ! redBus_SelectAvailableSeat_and_FirstBoardingPoint_Return(0,false)){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Return journey - Search result bus operator all tickets are sold out return journey");
			objSoftAssert.fail("ERROR:    Return journey - Search result bus operator all tickets are sold out return journey");
			return false;
		}

		//wait until the payment section is shown
		try{objWait.until(ExpectedConditions.visibilityOf(redBus_txtbox_Result22UserDetailnPaymentPage_UserDetail_ContactPhone));}catch (Exception e){}
		try{objWait.until(ExpectedConditions.visibilityOf(redBus_txtbox_Result22UserDetailnPaymentPage_UserDetail_ContactPhone));}catch (Exception e){}
		
		return bredBus_ThisElementValidationStatus;
	}
	
	public boolean redBus_Validate_EndToEnd_Search_Scenario__TYPE2_CASE4(){

		boolean bredBus_ThisElementValidationStatus 		= true;

		System.out.println("DEBUG:    Filter search result by first two boarding point among the list");
		System.out.println("                             and select first search result with atleast one seat available");
		System.out.println("                             and select any two seats");

		// if no private bus operators found then don't book any ticket
		int nredBus_PrivateBusOperatorBuses_Count 	= redBus_Get_PrivateBusOprerator_Bus_Count();
		// >0 means atlease 1 private bus available
		// >1 means atlease 2 private bus available
		if (nredBus_PrivateBusOperatorBuses_Count < 1){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    No private bus oprtator found");
			objSoftAssert.fail("ERROR:    No private bus oprtator found");
			return false;
		}

		// indexing format = idex__ (starting string)
		//                   seperate indexes by '__' pattern only
		//                    0 means first index
		//                   -1 means last index
		//                   -2 means second last index and so on
		// redBus_FilterBy_and_OptionIndex("Travels","index__0__1__-1");   this is for example
		redBus_FilterBy_and_OptionIndex("Boarding","index__0__1");

		// if no private bus operators found then don't book any ticket
		nredBus_PrivateBusOperatorBuses_Count 	= redBus_Get_PrivateBusOprerator_Bus_Count();
		// >0 means atlease 1 private bus available
		// >1 means atlease 2 private bus available
		if (nredBus_PrivateBusOperatorBuses_Count < 1){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    No private bus oprtator found");
			objSoftAssert.fail("ERROR:    No private bus oprtator found");
			return false;
		}

		// check if atleast single seat is availble for the index (first, second) user wants to book
		int nredBus_FirstPrivateOperatorBusIndex 	= redBus_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats.size() - nredBus_PrivateBusOperatorBuses_Count;
		try{redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_AvailableSeats.get(nredBus_FirstPrivateOperatorBusIndex);
		}catch (Exception e){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Search result bus operator count for private buses is not sufficient");
			objSoftAssert.fail("ERROR:    Search result bus operator count for private buses is not sufficient");
			return false;
		}

		// select seat for this private bus operator bus index and first boarding point and no return ticket
		if( ! redBus_SelectAvailableSeat_and_FirstBoardingPoint(0,false,2)){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Search result bus operator all tickets are sold out");
			objSoftAssert.fail("ERROR:    Search result bus operator all tickets are sold out");
			return false;
		}
		
		//wait until the payment section is shown
		try{objWait.until(ExpectedConditions.visibilityOf(redBus_txtbox_Result22UserDetailnPaymentPage_UserDetail_ContactPhone));}catch (Exception e){}
		try{objWait.until(ExpectedConditions.visibilityOf(redBus_txtbox_Result22UserDetailnPaymentPage_UserDetail_ContactPhone));}catch (Exception e){}
		
		return bredBus_ThisElementValidationStatus;
	}
	
	public boolean redBus_Validate_EndToEnd_Search_Scenario__TYPE2_CASE5(){

		boolean bredBus_ThisElementValidationStatus 		= true;
		
		System.out.println("DEBUG:    Filter search result by last dropping point among the list");
		System.out.println("                             and select first search result with atleast one seat available");
		System.out.println("                             and select any seat");
		System.out.println("                             and very first boarding point");
		System.out.println("                             and no return ticket");
		
		// if no private bus operators found then don't book any ticket
		int nredBus_PrivateBusOperatorBuses_Count 	= redBus_Get_PrivateBusOprerator_Bus_Count();
		// >0 means atlease 1 private bus available
		// >1 means atlease 2 private bus available
		if (nredBus_PrivateBusOperatorBuses_Count < 1){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    No private bus oprtator found");
			objSoftAssert.fail("ERROR:    No private bus oprtator found");
			return false;
		}

		// indexing format = idex__ (starting string)
		//                   seperate indexes by '__' pattern only
		//                    0 means first index
		//                   -1 means last index
		//                   -2 means second last index and so on
		// redBus_FilterBy_and_OptionIndex("Travels","index__0__1__-1");   this is for example
		redBus_FilterBy_and_OptionIndex("Dropping","index__-1");

		// if no private bus operators found then don't book any ticket
		nredBus_PrivateBusOperatorBuses_Count 	= redBus_Get_PrivateBusOprerator_Bus_Count();
		// >0 means atlease 1 private bus available
		// >1 means atlease 2 private bus available
		if (nredBus_PrivateBusOperatorBuses_Count < 1){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    No private bus oprtator found");
			objSoftAssert.fail("ERROR:    No private bus oprtator found");
			return false;
		}

		// check if atleast single seat is availble for the index (first, second) user wants to book
		int nredBus_FirstPrivateOperatorBusIndex 	= redBus_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats.size() - nredBus_PrivateBusOperatorBuses_Count;
		try{redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_AvailableSeats.get(nredBus_FirstPrivateOperatorBusIndex);
		}catch (Exception e){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Search result bus operator count for private buses is not sufficient");
			objSoftAssert.fail("ERROR:    Search result bus operator count for private buses is not sufficient");
			return false;
		}

		// select seat for this private bus operator bus index and last boarding point and no return ticket
		if( ! redBus_SelectAvailableSeat_and_FirstBoardingPoint(0,false,1)){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Search result bus operator all tickets are sold out");
			objSoftAssert.fail("ERROR:    Search result bus operator all tickets are sold out");
			return false;
		}
		
		//wait until the payment section is shown
		try{objWait.until(ExpectedConditions.visibilityOf(redBus_txtbox_Result22UserDetailnPaymentPage_UserDetail_ContactPhone));}catch (Exception e){}
		try{objWait.until(ExpectedConditions.visibilityOf(redBus_txtbox_Result22UserDetailnPaymentPage_UserDetail_ContactPhone));}catch (Exception e){}
		
		return bredBus_ThisElementValidationStatus;
	}
	
	public boolean redBus_Validate_EndToEnd_Search_Scenario__TYPE2_CASE6(){

		boolean bredBus_ThisElementValidationStatus 		= true;

		System.out.println("DEBUG:    Filter search result by first rating type among the list");
		System.out.println("                             and select first search result");
		System.out.println("                             and check cancellation policy");
		
		// if no private bus operators found then don't book any ticket
		int nredBus_PrivateBusOperatorBuses_Count 	= redBus_Get_PrivateBusOprerator_Bus_Count();
		// >0 means atlease 1 private bus available
		// >1 means atlease 2 private bus available
		if (nredBus_PrivateBusOperatorBuses_Count < 1){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    No private bus oprtator found");
			objSoftAssert.fail("ERROR:    No private bus oprtator found");
			return false;
		}

		// indexing format = idex__ (starting string)
		//                   seperate indexes by '__' pattern only
		//                    0 means first index
		//                   -1 means last index
		//                   -2 means second last index and so on
		// redBus_FilterBy_and_OptionIndex("Travels","index__0__1__-1");   this is for example
		redBus_FilterBy_and_OptionIndex("Ratings","index__0");

		// if no private bus operators found then don't book any ticket
		nredBus_PrivateBusOperatorBuses_Count 	= redBus_Get_PrivateBusOprerator_Bus_Count();
		// >0 means atlease 1 private bus available
		// >1 means atlease 2 private bus available
		if (nredBus_PrivateBusOperatorBuses_Count < 1){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    No private bus oprtator found");
			objSoftAssert.fail("ERROR:    No private bus oprtator found");
			return false;
		}
		
		// check if atleast single seat is availble for the index (first, second) user wants to book
		int nredBus_FirstPrivateOperatorBusIndex 	= redBus_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats.size() - nredBus_PrivateBusOperatorBuses_Count;
		try{redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_AvailableSeats.get(nredBus_FirstPrivateOperatorBusIndex);
		}catch (Exception e){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Search result bus operator count for private buses is not sufficient");
			objSoftAssert.fail("ERROR:    Search result bus operator count for private buses is not sufficient");
			return false;
		}
		
		// check canellation policy 
		if( ! redBus_CheckCancellationPolicyFor(0) ){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Cancellation policy is not visible or not available");
			objSoftAssert.fail("ERROR:    Cancellation policy is not visible or not available");
			return false;
		}
		
		return bredBus_ThisElementValidationStatus;
	}
	
	public boolean redBus_Validate_EndToEnd_Search_Scenario__TYPE2_CASE7(){

		boolean bredBus_ThisElementValidationStatus 		= true;

		System.out.println("DEBUG:    Filter search result by any any three type type");
		System.out.println("                             and confirm search results");
		System.out.println("                             and clear the filter list");

		// expand if govt bus options are shown in a group
		try{if (redBus_btn_Result1SelectTravelsnSeatPage_GovtBusGroup_Expand.isDisplayed()){
					redBus_btn_Result1SelectTravelsnSeatPage_GovtBusGroup_Expand.click();
		}}catch(Exception e){}

		List<String>  redBus_lst_String_FilterByOptions = Arrays.asList("Travels","Bus Type","Boarding","Dropping","Ratings");
		Collections.shuffle(redBus_lst_String_FilterByOptions);
		
		// indexing format = idex__ (starting string)
		//                   seperate indexes by '__' pattern only
		//                    0 means first index
		//                   -1 means last index
		//                   -2 means second last index and so on
		// redBus_FilterBy_and_OptionIndex("Travels","index__0__2__-1__random");   this is for example
		redBus_FilterBy_and_OptionIndex(redBus_lst_String_FilterByOptions.get(0),"index__random");
		redBus_FilterBy_and_OptionIndex(redBus_lst_String_FilterByOptions.get(1),"index__random");
		redBus_FilterBy_and_OptionIndex(redBus_lst_String_FilterByOptions.get(2),"index__random");

		if( ! redBus_Clear_All_Filters())	bredBus_ThisElementValidationStatus = false;
		
		return bredBus_ThisElementValidationStatus;
	}

	public boolean redBus_Validate_EndToEnd_Search_Scenario__TYPE3_CASE1(){

		boolean bredBus_ThisElementValidationStatus 		= true;
		
		System.out.println("DEBUG:    Without any filter sort results by travel company name in ascending order");
		System.out.println("                             and select first search result with atleast one seat available");
		System.out.println("                             and select any seat");
		System.out.println("                             and very first boarding point");
		System.out.println("                             and no return ticket");

		// if no private bus operators found then don't book any ticket
		int nredBus_PrivateBusOperatorBuses_Count 	= redBus_Get_PrivateBusOprerator_Bus_Count();
		// >0 means atlease 1 private bus available
		// >1 means atlease 2 private bus available
		if (nredBus_PrivateBusOperatorBuses_Count < 1){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    No private bus oprtator found");
			objSoftAssert.fail("ERROR:    No private bus oprtator found");
			return false;
		}

		// sorting format = ascending or descending e.g. redBus_Sorby_and_OptionIndex("Travels","ascending");
		redBus_Sorby_and_SortingType("Travels","ascending");

		// if no private bus operators found then don't book any ticket
		nredBus_PrivateBusOperatorBuses_Count 	= redBus_Get_PrivateBusOprerator_Bus_Count();
//		// >0 means atlease 1 private bus available
//		// >1 means atlease 2 private bus available
//		if (nredBus_PrivateBusOperatorBuses_Count < 1){
//			System.out.println("RESULT::FAIL");
//			System.out.println("ERROR:    No private bus oprtator found");
//			objSoftAssert.fail("ERROR:    No private bus oprtator found");
//			return false;
//		}

		// check if atleast single seat is availble for the index (first, second) user wants to book
		int nredBus_FirstPrivateOperatorBusIndex 	= redBus_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats.size() - nredBus_PrivateBusOperatorBuses_Count;
		try{redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_AvailableSeats.get(nredBus_FirstPrivateOperatorBusIndex);
		}catch (Exception e){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Search result bus operator count for private buses is not sufficient");
			objSoftAssert.fail("ERROR:    Search result bus operator count for private buses is not sufficient");
			return false;
		}

		// select seat for this private bus operator bus index and first boarding point and no return ticket
		if( ! redBus_SelectAvailableSeat_and_FirstBoardingPoint(0,false,1)){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Search result bus operator all tickets are sold out");
			objSoftAssert.fail("ERROR:    Search result bus operator all tickets are sold out");
			return false;
		}
		
		//wait until the payment section is shown
		try{objWait.until(ExpectedConditions.visibilityOf(redBus_txtbox_Result22UserDetailnPaymentPage_UserDetail_ContactPhone));}catch (Exception e){}
		try{objWait.until(ExpectedConditions.visibilityOf(redBus_txtbox_Result22UserDetailnPaymentPage_UserDetail_ContactPhone));}catch (Exception e){}
		
		return bredBus_ThisElementValidationStatus;
	}
		
	public boolean redBus_Validate_EndToEnd_Search_Scenario__TYPE3_CASE2(){

		boolean bredBus_ThisElementValidationStatus 		= true;
		System.out.println("DEBUG:    Without any filter sort results by travel company name in descending order");
		System.out.println("                             and select first search result with atleast one seat available");
		System.out.println("                             and check mTicket message");

		// if no private bus operators found then don't book any ticket
		int nredBus_PrivateBusOperatorBuses_Count 	= redBus_Get_PrivateBusOprerator_Bus_Count();
		// >0 means atlease 1 private bus available
		// >1 means atlease 2 private bus available
		if (nredBus_PrivateBusOperatorBuses_Count < 1){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    No private bus oprtator found");
			objSoftAssert.fail("ERROR:    No private bus oprtator found");
			return false;
		}

		// sorting format = ascending or descending e.g. redBus_Sorby_and_OptionIndex("Travels","ascending");
		redBus_Sorby_and_SortingType("Travels","descending");

		// if no private bus operators found then don't book any ticket
		nredBus_PrivateBusOperatorBuses_Count 	= redBus_Get_PrivateBusOprerator_Bus_Count();
//		// >0 means atlease 1 private bus available
//		// >1 means atlease 2 private bus available
//		if (nredBus_PrivateBusOperatorBuses_Count < 1){
//			System.out.println("RESULT::FAIL");
//			System.out.println("ERROR:    No private bus oprtator found");
//			objSoftAssert.fail("ERROR:    No private bus oprtator found");
//			return false;
//		}

		// check if atleast single seat is availble for the index (first, second) user wants to book
		int nredBus_FirstPrivateOperatorBusIndex 	= redBus_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats.size() - nredBus_PrivateBusOperatorBuses_Count;
		try{redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_AvailableSeats.get(nredBus_FirstPrivateOperatorBusIndex);
		}catch (Exception e){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Search result bus operator count for private buses is not sufficient");
			objSoftAssert.fail("ERROR:    Search result bus operator count for private buses is not sufficient");
			return false;
		}

		// check mTicket message 
		if( ! redBus_mTicketMessageFor(0) ){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    mTicket message is not visible or not available");
			objSoftAssert.fail("ERROR:    mTicket message is not visible or not available");
			return false;
		}
		
		return bredBus_ThisElementValidationStatus;
	}
	
	public boolean redBus_Validate_EndToEnd_Search_Scenario__TYPE3_CASE3(){

		boolean bredBus_ThisElementValidationStatus 		= true;

		System.out.println("DEBUG:    Without any filter sort results by departure time in ascending order");
		System.out.println("                             and select second search result with atleast one seat available");
		System.out.println("                             with atleast one ladies seat available");
		System.out.println("                             and very first boarding point");
		System.out.println("                             and no return ticket");
		
		// if no private bus operators found then don't book any ticket
		int nredBus_PrivateBusOperatorBuses_Count 	= redBus_Get_PrivateBusOprerator_Bus_Count();
		// >0 means atlease 1 private bus available
		// >1 means atlease 2 private bus available
		if (nredBus_PrivateBusOperatorBuses_Count < 1){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    No private bus oprtator found");
			objSoftAssert.fail("ERROR:    No private bus oprtator found");
			return false;
		}

		// sorting format = ascending or descending e.g. redBus_Sorby_and_OptionIndex("Travels","ascending");
		redBus_Sorby_and_SortingType("Depart","ascending");

		// if no private bus operators found then don't book any ticket
		nredBus_PrivateBusOperatorBuses_Count 	= redBus_Get_PrivateBusOprerator_Bus_Count();
//		// >0 means atlease 1 private bus available
//		// >1 means atlease 2 private bus available
//		if (nredBus_PrivateBusOperatorBuses_Count < 1){
//			System.out.println("RESULT::FAIL");
//			System.out.println("ERROR:    No private bus oprtator found");
//			objSoftAssert.fail("ERROR:    No private bus oprtator found");
//			return false;
//		}

		// check if atleast single seat is availble for the index (first, second) user wants to book
		int nredBus_FirstPrivateOperatorBusIndex 	= redBus_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats.size() - nredBus_PrivateBusOperatorBuses_Count;
		try{redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_AvailableSeats.get(nredBus_FirstPrivateOperatorBusIndex);
		}catch (Exception e){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Search result bus operator count for private buses is not sufficient");
			objSoftAssert.fail("ERROR:    Search result bus operator count for private buses is not sufficient");
			return false;
		}
		
		// select seat for this private bus operator bus index and first boarding point and no return ticket
		if(! redBus_SelectAvailableSeat_Ladies_and_FirstBoardingPoint(0)){
			// if no ladies reserved seats available then book normal seats
			// select seat for this private bus operator bus index and first boarding point and no return ticket
			redBus_SelectAvailableSeat_and_FirstBoardingPoint(0,false,1);
		}

		//wait until the payment section is shown
		try{objWait.until(ExpectedConditions.visibilityOf(redBus_txtbox_Result22UserDetailnPaymentPage_UserDetail_ContactPhone));}catch (Exception e){}
		try{objWait.until(ExpectedConditions.visibilityOf(redBus_txtbox_Result22UserDetailnPaymentPage_UserDetail_ContactPhone));}catch (Exception e){}
		
		return bredBus_ThisElementValidationStatus;
	}

	public boolean redBus_Validate_EndToEnd_Search_Scenario__TYPE3_CASE4(){

		boolean bredBus_ThisElementValidationStatus 		= true;

		System.out.println("DEBUG:    Without any filter sort results by departure time in descending order");
		System.out.println("                             and sort results by seat count in ascending order");
		
		// if no private bus operators found then don't book any ticket
		int nredBus_PrivateBusOperatorBuses_Count 	= redBus_Get_PrivateBusOprerator_Bus_Count();
		// >0 means atlease 1 private bus available
		// >1 means atlease 2 private bus available
		if (nredBus_PrivateBusOperatorBuses_Count < 1){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    No private bus oprtator found");
			objSoftAssert.fail("ERROR:    No private bus oprtator found");
			return false;
		}

		// sorting format = ascending or descending e.g. redBus_Sorby_and_OptionIndex("Travels","ascending");
		redBus_Sorby_and_SortingType("Depart","descending");
		redBus_Sorby_and_SortingType("Seats","ascending");
		
		return bredBus_ThisElementValidationStatus;
	}
		
	public boolean redBus_Validate_EndToEnd_Search_Scenario__TYPE3_CASE5(){

		boolean bredBus_ThisElementValidationStatus 		= true;

		System.out.println("DEBUG:    Without any filter sort results by seat count in descending order");
		System.out.println("                             and select second search result with atleast fifteen seat available");
		System.out.println("                             and very first boarding point");
		System.out.println("                             and no return ticket");
		
		// if no private bus operators found then don't book any ticket
		int nredBus_PrivateBusOperatorBuses_Count 	= redBus_Get_PrivateBusOprerator_Bus_Count();
		// >0 means atlease 1 private bus available
		// >1 means atlease 2 private bus available
		if (nredBus_PrivateBusOperatorBuses_Count < 1){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    No private bus oprtator found");
			objSoftAssert.fail("ERROR:    No private bus oprtator found");
			return false;
		}

		// sorting format = ascending or descending e.g. redBus_Sorby_and_OptionIndex("Travels","ascending");
		redBus_Sorby_and_SortingType("Ratings","descending");

		// if no private bus operators found then don't book any ticket
		nredBus_PrivateBusOperatorBuses_Count 	= redBus_Get_PrivateBusOprerator_Bus_Count();
		// >0 means atlease 1 private bus available
		// >1 means atlease 2 private bus available
		if (nredBus_PrivateBusOperatorBuses_Count < 2){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    No private bus oprtator found");
			objSoftAssert.fail("ERROR:    No private bus oprtator found");
			return false;
		}

		// check if atleast single seat is availble for the index (first, second) user wants to book
		int nredBus_FirstPrivateOperatorBusIndex 	= redBus_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats.size() - nredBus_PrivateBusOperatorBuses_Count;
		try{redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_AvailableSeats.get(nredBus_FirstPrivateOperatorBusIndex);
		}catch (Exception e){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Search result bus operator count for private buses is not sufficient");
			objSoftAssert.fail("ERROR:    Search result bus operator count for private buses is not sufficient");
			return false;
		}

		// select seat for this private bus operator with mimumim 10 seats available and second index
		if( ! redBus_SelectAvailableSeat_IfMinimumAvailable_and_Index(15,2,nredBus_FirstPrivateOperatorBusIndex)){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Search result bus operator available seats are less than 10 or only one operator with more than 10 seats");
			objSoftAssert.fail("ERROR:    Search result bus operator available seats are less than 10 or only one operator with more than 10 seats");
			return false;
		}

		return bredBus_ThisElementValidationStatus;
	}
	
	public boolean redBus_Validate_EndToEnd_Search_Scenario__TYPE3_CASE6(){

		boolean bredBus_ThisElementValidationStatus 		= true;
		System.out.println("DEBUG:    Without any filter sort results by ratings in ascending order");
		System.out.println("                             and select first search result with atleast one seat available");
		System.out.println("                             and check ratings message");

		// if no private bus operators found then don't book any ticket
		int nredBus_PrivateBusOperatorBuses_Count 	= redBus_Get_PrivateBusOprerator_Bus_Count();
		// >0 means atlease 1 private bus available
		// >1 means atlease 2 private bus available
		if (nredBus_PrivateBusOperatorBuses_Count < 1){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    No private bus oprtator found");
			objSoftAssert.fail("ERROR:    No private bus oprtator found");
			return false;
		}

		// sorting format = ascending or descending e.g. redBus_Sorby_and_OptionIndex("Travels","ascending");
		redBus_Sorby_and_SortingType("Seats","descending");

		// if no private bus operators found then don't book any ticket
		nredBus_PrivateBusOperatorBuses_Count 	= redBus_Get_PrivateBusOprerator_Bus_Count();
//		// >0 means atlease 1 private bus available
//		// >1 means atlease 2 private bus available
//		if (nredBus_PrivateBusOperatorBuses_Count < 1){
//			System.out.println("RESULT::FAIL");
//			System.out.println("ERROR:    No private bus oprtator found");
//			objSoftAssert.fail("ERROR:    No private bus oprtator found");
//			return false;
//		}

		// check if atleast single seat is availble for the index (first, second) user wants to book
		int nredBus_FirstPrivateOperatorBusIndex 	= redBus_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats.size() - nredBus_PrivateBusOperatorBuses_Count;
		try{redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_AvailableSeats.get(nredBus_FirstPrivateOperatorBusIndex);
		}catch (Exception e){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Search result bus operator count for private buses is not sufficient");
			objSoftAssert.fail("ERROR:    Search result bus operator count for private buses is not sufficient");
			return false;
		}

		// check ratings message 
		if( ! redBus_CheckRatingsMessage(0) ){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Ratings message is not visible or not available");
			objSoftAssert.fail("ERROR:    Ratings message is not visible or not available");
			return false;
		}
		
		return bredBus_ThisElementValidationStatus;
	}
		
	public boolean redBus_Validate_EndToEnd_Search_Scenario__TYPE3_CASE7(){

		boolean bredBus_ThisElementValidationStatus 		= true;
		
		System.out.println("DEBUG:    Without any filter sort results by any threetypes in ascending order");

		// if no private bus operators found then don't book any ticket
		int nredBus_PrivateBusOperatorBuses_Count 	= redBus_Get_PrivateBusOprerator_Bus_Count();
		// >0 means atlease 1 private bus available
		// >1 means atlease 2 private bus available
		if (nredBus_PrivateBusOperatorBuses_Count < 1){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    No private bus oprtator found");
			objSoftAssert.fail("ERROR:    No private bus oprtator found");
			return false;
		}

		List<String>  redBus_lst_String_SortByOptions = Arrays.asList("Travels","Depart","Arrive","Duration","Seats","Ratings","Fare");
		Collections.shuffle(redBus_lst_String_SortByOptions);
		// sorting format = ascending or descending e.g. redBus_Sorby_and_OptionIndex("Travels","ascending");
		redBus_Sorby_and_SortingType(redBus_lst_String_SortByOptions.get(0),"ascending");
		redBus_Sorby_and_SortingType(redBus_lst_String_SortByOptions.get(1),"ascending");
		redBus_Sorby_and_SortingType(redBus_lst_String_SortByOptions.get(2),"ascending");
		
		return bredBus_ThisElementValidationStatus;
	}
	
	public boolean redBus_Validate_EndToEnd_Search_Scenario__TYPE3_CASE8(){

		boolean bredBus_ThisElementValidationStatus 		= true;
		 
		System.out.println("DEBUG:    Without any filter sort results by fare value in ascending order");
		System.out.println("                             and select last search result with atleast one seat available");
		System.out.println("                             and check mTicket message");

		// if no private bus operators found then don't book any ticket
		int nredBus_PrivateBusOperatorBuses_Count 	= redBus_Get_PrivateBusOprerator_Bus_Count();
		// >0 means atlease 1 private bus available
		// >1 means atlease 2 private bus available
		if (nredBus_PrivateBusOperatorBuses_Count < 1){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    No private bus oprtator found");
			objSoftAssert.fail("ERROR:    No private bus oprtator found");
			return false;
		}

		// sorting format = ascending or descending e.g. redBus_Sorby_and_OptionIndex("Travels","ascending");
		redBus_Sorby_and_SortingType("Fare","ascending");

		// if no private bus operators found then don't book any ticket
		nredBus_PrivateBusOperatorBuses_Count 	= redBus_Get_PrivateBusOprerator_Bus_Count();
//		// >0 means atlease 1 private bus available
//		// >1 means atlease 2 private bus available
//		if (nredBus_PrivateBusOperatorBuses_Count < 1){
//			System.out.println("RESULT::FAIL");
//			System.out.println("ERROR:    No private bus oprtator found");
//			objSoftAssert.fail("ERROR:    No private bus oprtator found");
//			return false;
//		}

		// check if atleast single seat is availble for the index (first, second) user wants to book
//		int nredBus_FirstPrivateOperatorBusIndex 	= redBus_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats.size() - nredBus_PrivateBusOperatorBuses_Count;
		int nredBus_FirstPrivateOperatorBusIndex 	= redBus_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats.size() - 1;
//		try{redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_AvailableSeats.get(nredBus_FirstPrivateOperatorBusIndex);
		try{redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_AvailableSeats.get(redBus_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats.size() - 1);
		}catch (Exception e){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Search result bus operator count for private buses is not sufficient");
			objSoftAssert.fail("ERROR:    Search result bus operator count for private buses is not sufficient");
			return false;
		}

		// select seat for this private bus operator bus index and first boarding point and no return ticket
		if( ! redBus_SelectAvailableSeat_and_FirstBoardingPoint(nredBus_FirstPrivateOperatorBusIndex,false,1)){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Search result bus operator all tickets are sold out");
			objSoftAssert.fail("ERROR:    Search result bus operator all tickets are sold out");
			return false;
		}
		
		//wait until the payment section is shown
		try{objWait.until(ExpectedConditions.visibilityOf(redBus_txtbox_Result22UserDetailnPaymentPage_UserDetail_ContactPhone));}catch (Exception e){}
		try{objWait.until(ExpectedConditions.visibilityOf(redBus_txtbox_Result22UserDetailnPaymentPage_UserDetail_ContactPhone));}catch (Exception e){}
		
		return bredBus_ThisElementValidationStatus;
	}
	
	public boolean redBus_Validate_EndToEnd_Search_Scenario__TYPE3_CASE9(){

		boolean bredBus_ThisElementValidationStatus 		= true;
		  
		System.out.println("DEBUG:    Sort results by fare value in descending order");
		System.out.println("                             and filter search result by first rating type");
		System.out.println("                             and print first fare value");
		
		// if no private bus operators found then don't book any ticket
		int nredBus_PrivateBusOperatorBuses_Count 	= redBus_Get_PrivateBusOprerator_Bus_Count();
		// >0 means atlease 1 private bus available
		// >1 means atlease 2 private bus available
		if (nredBus_PrivateBusOperatorBuses_Count < 1){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    No private bus oprtator found");
			objSoftAssert.fail("ERROR:    No private bus oprtator found");
			return false;
		}

		// sorting format = ascending or descending e.g. redBus_Sorby_and_OptionIndex("Travels","ascending");
		redBus_Sorby_and_SortingType("Fare","descending");
		
		// indexing format = idex__ (starting string)
		//                   seperate indexes by '__' pattern only
		//                    0 means first index
		//                   -1 means last index
		//                   -2 means second last index and so on
		// redBus_FilterBy_and_OptionIndex("Travels","index__0__2__-1__random");   this is for example
		redBus_FilterBy_and_OptionIndex("Ratings","index__0");
		
		// if no private bus operators found then don't book any ticket
		nredBus_PrivateBusOperatorBuses_Count 	= redBus_Get_PrivateBusOprerator_Bus_Count();
		// >0 means atlease 1 private bus available
		// >1 means atlease 2 private bus available
		if (nredBus_PrivateBusOperatorBuses_Count < 2){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    No private bus oprtator found");
			objSoftAssert.fail("ERROR:    No private bus oprtator found");
			return false;
		}

		// check if atleast single seat is availble for the index (first, second) user wants to book
		int nredBus_FirstPrivateOperatorBusIndex 	= redBus_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats.size() - nredBus_PrivateBusOperatorBuses_Count;
		try{redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_AvailableSeats.get(nredBus_FirstPrivateOperatorBusIndex);
		}catch (Exception e){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Search result bus operator count for private buses is not sufficient");
			objSoftAssert.fail("ERROR:    Search result bus operator count for private buses is not sufficient");
			return false;
		}

//		// select seat for this private bus operator with mimumim 15 seats available and second index
//		if( ! redBus_SelectAvailableSeat_IfMinimumAvailable_and_Index(15,2,nredBus_FirstPrivateOperatorBusIndex)){
//			System.out.println("RESULT::FAIL");
//			System.out.println("ERROR:    Search result bus operator available seats are less than 10 or only one operator with more than 10 seats");
//			objSoftAssert.fail("ERROR:    Search result bus operator available seats are less than 10 or only one operator with more than 10 seats");
//			return false;
//		}


		List<WebElement> objWebElementIndividualPrivateBusOperator 	= 
				redBus_lst_Result1SelectTravelsnSeatPage_PrivateBusesGroup
					.get(0).findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_SectiowiseBusOperatorGroup);
		
		if(objWebElementIndividualPrivateBusOperator
				.get(0)
				.findElement(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats)
				.getText()
				.contains("Sold Out"))		
						{return false;}

		// get the fare value of the first result
		System.out.println("DEBUG:    Fare value of the first result is : " + 
											objWebElementIndividualPrivateBusOperator
													.get(0)
													.findElements(redBus_ByCssSelector_lst_labl_Result1SelectTravelsnSeatPage_IndividualFare)
													.get(0)
													.getText());

		return bredBus_ThisElementValidationStatus;
	}
	
	public boolean redBus_Validate_EndToEnd_Search_Scenario__TYPE4_CASE1(){

		boolean bredBus_ThisElementValidationStatus 		= true;

		System.out.println("DEBUG:    Select first search result");
		System.out.println("                             and select first search result with atleast one seat available");
		System.out.println("                             and book return ticket");

		// if no private bus operators found then don't book any ticket
		int nredBus_PrivateBusOperatorBuses_Count 	= redBus_Get_PrivateBusOprerator_Bus_Count();
		// >0 means atlease 1 private bus available
		// >1 means atlease 2 private bus available
		if (nredBus_PrivateBusOperatorBuses_Count < 1){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    No private bus oprtator found");
			objSoftAssert.fail("ERROR:    No private bus oprtator found");
			return false;
		}

		// if no private bus operators found then don't book any ticket
		nredBus_PrivateBusOperatorBuses_Count 	= redBus_Get_PrivateBusOprerator_Bus_Count();
		// >0 means atlease 1 private bus available
		// >1 means atlease 2 private bus available
		if (nredBus_PrivateBusOperatorBuses_Count < 1){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    No private bus oprtator found");
			objSoftAssert.fail("ERROR:    No private bus oprtator found");
			return false;
		}

		// check if atleast single seat is availble for the index (first, second) user wants to book
		int nredBus_FirstPrivateOperatorBusIndex 	= redBus_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats.size() - nredBus_PrivateBusOperatorBuses_Count;
		try{redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_AvailableSeats.get(nredBus_FirstPrivateOperatorBusIndex);
		}catch (Exception e){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Search result bus operator count for private buses is not sufficient");
			objSoftAssert.fail("ERROR:    Search result bus operator count for private buses is not sufficient");
			return false;
		}

		// select seat for this private bus operator bus index and first boarding point and intend to book return ticket as well
		if( ! redBus_SelectAvailableSeat_and_FirstBoardingPoint(0,true,1)){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Search result bus operator all tickets are sold out onward journey");
			objSoftAssert.fail("ERROR:    Search result bus operator all tickets are sold out onward journey");
			return false;
		}
		
		//wait until the payment section is shown
		try{objWait.until(ExpectedConditions.visibilityOf(redBus_txtbox_Result22UserDetailnPaymentPage_UserDetail_ContactPhone));}catch (Exception e){}
		try{objWait.until(ExpectedConditions.visibilityOf(redBus_txtbox_Result22UserDetailnPaymentPage_UserDetail_ContactPhone));}catch (Exception e){}
		
		return bredBus_ThisElementValidationStatus;
	}
	
	public boolean redBus_Validate_EndToEnd_Search_Scenario__TYPE4_CASE1_Part2(){

		boolean bredBus_ThisElementValidationStatus 		= true;

		// if no private bus operators found then don't book any ticket
		int nredBus_PrivateBusOperatorBuses_Count_Return 	= redBus_Get_PrivateBusOprerator_Bus_Count_Return();
		// >0 means atlease 1 private bus available
		// >1 means atlease 2 private bus available
		if (nredBus_PrivateBusOperatorBuses_Count_Return < 1){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Return journey - No private bus oprtator found");
			objSoftAssert.fail("ERROR:    Return journey - No private bus oprtator found");
			return false;
		}

		int nredBus_TotalPrivateOperatorBusCount_Return =  this.objWebDriverAbstract.findElement(By.id("returnTrip"))
																.findElement(By.cssSelector(".PrivateBuses"))
																.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats)
																.size();

		// check if atleast single seat is availble for the index (first, second) user wants to book
		int nredBus_FirstPrivateOperatorBusIndex_Return 	= nredBus_TotalPrivateOperatorBusCount_Return - nredBus_PrivateBusOperatorBuses_Count_Return;
		try{redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_AvailableSeats.get(nredBus_FirstPrivateOperatorBusIndex_Return);
		}catch (Exception e){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Return journey - Search result bus operator count for private buses is not sufficient");
			objSoftAssert.fail("ERROR:    Return journey - Search result bus operator count for private buses is not sufficient");
			return false;
		}

		// select seat for this private bus operator bus index and first boarding point and intend to book return ticket as well
		if( ! redBus_SelectAvailableSeat_and_FirstBoardingPoint_Return(0,false)){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Return journey - Search result bus operator all tickets are sold out return journey");
			objSoftAssert.fail("ERROR:    Return journey - Search result bus operator all tickets are sold out return journey");
			return false;
		}

		//wait until the payment section is shown
		try{objWait.until(ExpectedConditions.visibilityOf(redBus_txtbox_Result22UserDetailnPaymentPage_UserDetail_ContactPhone));}catch (Exception e){}
		try{objWait.until(ExpectedConditions.visibilityOf(redBus_txtbox_Result22UserDetailnPaymentPage_UserDetail_ContactPhone));}catch (Exception e){}
		
		return bredBus_ThisElementValidationStatus;
	}
	
	public boolean redBus_Validate_EndToEnd_Search_Scenario__TYPE4_CASE2(){

		boolean bredBus_ThisElementValidationStatus 		= true;

		System.out.println("DEBUG:    Use RETURN option and book return ticket");
		
		// click on return link and choose return date
		redBus_lnk_Result1SelectTravelsnSeatPage_BookReturnTicket.click();
		
		return bredBus_ThisElementValidationStatus;
	}

	public boolean redBus_Validate_EndToEnd_Search_Scenario__TYPE4_CASE3(){

		boolean bredBus_ThisElementValidationStatus 		= true;

		System.out.println("DEBUG:    Booking ticket for first search result with atleast one seat available");
		System.out.println("                             and select any seat");
		System.out.println("                             and very first boarding point");
		System.out.println("                             and no return ticket");

		// if no private bus operators found then don't book any ticket
		int nredBus_PrivateBusOperatorBuses_Count 	= redBus_Get_PrivateBusOprerator_Bus_Count();
		// >0 means atlease 1 private bus available
		// >1 means atlease 2 private bus available
		if (nredBus_PrivateBusOperatorBuses_Count < 1){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    No private bus oprtator found");
			objSoftAssert.fail("ERROR:    No private bus oprtator found");
			return false;
		}

		// check if atleast single seat is availble for the index (first, second) user wants to book
		int nredBus_FirstPrivateOperatorBusIndex 	= redBus_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats.size() - nredBus_PrivateBusOperatorBuses_Count;
		try{redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_AvailableSeats.get(nredBus_FirstPrivateOperatorBusIndex);
		}catch (Exception e){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Search result bus operator count for private buses is not sufficient");
			objSoftAssert.fail("ERROR:    Search result bus operator count for private buses is not sufficient");
			return false;
		}

		// select seat for this private bus operator bus index and first boarding point and no return ticket
		redBus_SelectAvailableSeat_and_FirstBoardingPoint(0,false,1);

		//wait until the payment section is shown
		try{objWait.until(ExpectedConditions.visibilityOf(redBus_txtbox_Result22UserDetailnPaymentPage_UserDetail_ContactPhone));}catch (Exception e){}
		try{objWait.until(ExpectedConditions.visibilityOf(redBus_txtbox_Result22UserDetailnPaymentPage_UserDetail_ContactPhone));}catch (Exception e){}
		
		return bredBus_ThisElementValidationStatus;
	}

	public boolean redBus_Validate_EndToEnd_Search_Scenario__Until_Payment_Section(){

		boolean bredBus_ThisElementValidationStatus 		= true;

		// if no private bus operators found then don't book any ticket
		int nredBus_PrivateBusOperatorBuses_Count 	= redBus_Get_PrivateBusOprerator_Bus_Count();
		// >0 means atlease 1 private bus available
		// >1 means atlease 2 private bus available
		if (nredBus_PrivateBusOperatorBuses_Count < 1){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    No private bus oprtator found");
			objSoftAssert.fail("ERROR:    No private bus oprtator found");
			return false;
		}

		// check if atleast single seat is availble for the index (first, second) user wants to book
		int nredBus_FirstPrivateOperatorBusIndex 	= redBus_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats.size() - nredBus_PrivateBusOperatorBuses_Count;
		try{redBus_lst_lnk_Result1SelectTravelsnSeatPage_IndividualOperator_AvailableSeats.get(nredBus_FirstPrivateOperatorBusIndex);
		}catch (Exception e){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Search result bus operator count for private buses is not sufficient");
			objSoftAssert.fail("ERROR:    Search result bus operator count for private buses is not sufficient");
			return false;
		}

		// select seat for this private bus operator bus index and first boarding point and no return ticket
		redBus_SelectAvailableSeat_and_FirstBoardingPoint(0,false,1);

		//wait until the payment section is shown
		try{objWait.until(ExpectedConditions.visibilityOf(redBus_txtbox_Result22UserDetailnPaymentPage_UserDetail_ContactPhone));}catch (Exception e){}
		try{objWait.until(ExpectedConditions.visibilityOf(redBus_txtbox_Result22UserDetailnPaymentPage_UserDetail_ContactPhone));}catch (Exception e){}
		
		return bredBus_ThisElementValidationStatus;
	}	
	
	public boolean redBus_Perform_SimpleActivity_and_NavigateToNextPage(){

		return redBus_Validate_EndToEnd_Search_Scenario__Until_Payment_Section();
	}

	
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	// helper methods
	private int redBus_Get_GovernmentGroupBus_Count(){
		
		return redBus_lst_Result1SelectTravelsnSeatPage_GovtBusesGroup
				.get(0)
				.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats)
				.size();		
	}
		
	@SuppressWarnings("unused")
	private int redBus_Get_GovernmentGroupBus_Count_Return(){
		
		return redBus_lst_Result1SelectTravelsnSeatPage_GovtBusesGroup
				.get(1)
				.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats)
				.size();		
	}
	
	private int redBus_Get_PrivateBusOprerator_Bus_Count(){

		return redBus_lst_Result1SelectTravelsnSeatPage_PrivateBusesGroup
				.get(0)
				.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats)
				.size();		
	}
	
	private int redBus_Get_PrivateBusOprerator_Bus_Count_Return(){

		return redBus_lst_Result1SelectTravelsnSeatPage_PrivateBusesGroup
				.get(1)
				.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats)
				.size();		
	}
		
	private boolean redBus_SelectAvailableSeat_and_FirstBoardingPoint(int nPrivateOperatorBusIndex, boolean bredBus_BookReturnTicket, int nSeatCount){
		
		boolean bSeatSelectionSuccess = true;

		List<WebElement> objWebElementIndividualPrivateBusOperator 	= redBus_lst_Result1SelectTravelsnSeatPage_PrivateBusesGroup
																		.get(0).findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_SectiowiseBusOperatorGroup);
		if(objWebElementIndividualPrivateBusOperator
			.get(nPrivateOperatorBusIndex)
			.findElement(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats)
			.getText()
//			.trim()
			.contains("Sold Out"))		
		{return false;}
		
		// click on view seat button
		objWebElementIndividualPrivateBusOperator
				.get(nPrivateOperatorBusIndex)
				.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats)
				.get(0)
				.click();
		
		// seat selection results are shown after more time so wait for more time
		try{objWait.until(ExpectedConditions.visibilityOfAllElements(redBus_lst_btn_Result1SelectTravelsnSeatPage_IndividualOperator_SeatSelection_Continue));}catch (Exception e){}
		try{objWait.until(ExpectedConditions.visibilityOfAllElements(redBus_lst_btn_Result1SelectTravelsnSeatPage_IndividualOperator_SeatSelection_Continue));}catch (Exception e){}

		// select first boarding point
		Select redBus_drpdown_BoardingPoint = new Select(redBus_lst_drpdown_Result1SelectTravelsnSeatPage_IndividualOperator_SeatSelection_BoardingPoint.get(0));
		redBus_drpdown_BoardingPoint.selectByIndex(1);

		// since the screen scrolls up, need to move it down to make 'continue' button visible
		redBus_lst_lnk_Result1SelectTravelsnSeatPage_OnwardnReturn_RouteName.get(0).sendKeys("" + Keys.PAGE_UP);

		try{
			for (int nLocal =0; nLocal <nSeatCount; nLocal++){
				// book seating seat rather than sleeper since it is cheaper
				// 0th element is always the informational icon which is on right side of seat selection section so select starting from index 1 element
				System.out.println("DEBUG:    Selected following first available seating seat: " + 
						objWebElementIndividualPrivateBusOperator
							.get(nPrivateOperatorBusIndex)
							.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSeating)
							.get(1+nLocal)
							.getAttribute("title"));
	
				int nSelectedSeatCount = 
						objWebElementIndividualPrivateBusOperator
							.get(nPrivateOperatorBusIndex)
							.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AllSelected).size();
				
				while(
					objWebElementIndividualPrivateBusOperator
							.get(nPrivateOperatorBusIndex)
							.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AllSelected).size() <= nSelectedSeatCount)
								{		
									objWebElementIndividualPrivateBusOperator
											.get(nPrivateOperatorBusIndex)
											.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSeating)
											.get(1+nLocal)
											.click();
									redBus_lst_lnk_Result1SelectTravelsnSeatPage_OnwardnReturn_RouteName.get(0).sendKeys("" + Keys.ARROW_UP);
								}
			}
		}catch(Exception e){
			System.out.println("DEBUG:    Selecting sleeper seats as no seating seats are available");
			for (int nLocal =0; nLocal <nSeatCount; nLocal++){
				// book sleeper seat rather than seating since it is costlier
				System.out.println("DEBUG:    Selected following first available sleeper seat: " + 
						objWebElementIndividualPrivateBusOperator
							.get(nPrivateOperatorBusIndex)
							.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSleeper)
							.get(1+nLocal)
							.getAttribute("title"));
	
				int nSelectedSeatCount = 
						objWebElementIndividualPrivateBusOperator
							.get(nPrivateOperatorBusIndex)
							.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AllSelected).size();
				
				while(
					objWebElementIndividualPrivateBusOperator
					.get(nPrivateOperatorBusIndex)
					.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AllSelected).size() <= nSelectedSeatCount)
							{		objWebElementIndividualPrivateBusOperator
										.get(nPrivateOperatorBusIndex)
										.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSleeper)
										.get(1+nLocal)
										.click();
									redBus_lst_lnk_Result1SelectTravelsnSeatPage_OnwardnReturn_RouteName.get(0).sendKeys("" + Keys.ARROW_UP);
							}
			}
		}

		// wait for some time so that selected seat details are shown on screen
		try{objWaitShort.until(ExpectedConditions.visibilityOf(		objWebElementIndividualPrivateBusOperator
																		.get(nPrivateOperatorBusIndex)
																		.findElement(redBus_ByCssSelector_lst_labl_Result1SelectTravelsnSeatPage_TotalFareValue)));
		}catch (Exception e){}
		
		// click on continue	
		objWebElementIndividualPrivateBusOperator
							.get(nPrivateOperatorBusIndex)
							.findElement(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_Continue)
							.click();
		
		// wait until "do you want to book return ticket also?" message
		try{objWait.until(ExpectedConditions.visibilityOf(redBus_btn_Result1SelectTravelsnSeatPage_IndividualOperator_BookReturnTicket_Deny));}catch (Exception e){}

		// select to book return journey
		if(bredBus_BookReturnTicket){
			redBus_btn_Result1SelectTravelsnSeatPage_IndividualOperator_BookReturnTicket_Accept.click();
			try{objWait.until(ExpectedConditions.visibilityOf(redBus_btn_Result1SelectTravelsnSeatPage_IndividualOperator_BookReturnTicket_Accept));}catch (Exception e){}
			try{objWait.until(ExpectedConditions.visibilityOf(redBus_btn_Result1SelectTravelsnSeatPage_IndividualOperator_BookReturnTicket_Accept));}catch (Exception e){}
		}
		// select to book only one way journey
		else{
			if (redBus_btn_Result1SelectTravelsnSeatPage_IndividualOperator_BookReturnTicket_Deny.isDisplayed())
							{redBus_btn_Result1SelectTravelsnSeatPage_IndividualOperator_BookReturnTicket_Deny.click();}
		}	

		return bSeatSelectionSuccess;
	}
	
	private boolean redBus_SelectAvailableSeat_and_FirstBoardingPoint_Return(int nPrivateOperatorBusIndex, boolean bredBus_BookReturnTicket){
		
		boolean bSeatSelectionSuccess = true;
		List<WebElement> objWebElementIndividualPrivateBusOperator 	= 	
				this.objWebDriverAbstract.findElement(By.id("returnTrip"))
						.findElements(By.cssSelector(".PrivateBuses"))
						.get(0)
						.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_SectiowiseBusOperatorGroup);
		
		if(objWebElementIndividualPrivateBusOperator
			.get(nPrivateOperatorBusIndex)
			.findElement(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats)
			.getText()
//			.trim()
			.contains("Sold Out"))
		{return false;}
		
		// click on view seat button
		objWebElementIndividualPrivateBusOperator
				.get(nPrivateOperatorBusIndex)
				.findElement(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats)
				.click();
		
		// seat selection results are shown after more time so wait for more time
		try{objWait.until(ExpectedConditions.visibilityOfAllElements(redBus_lst_btn_Result1SelectTravelsnSeatPage_IndividualOperator_SeatSelection_Continue));}catch (Exception e){}
		try{objWait.until(ExpectedConditions.visibilityOfAllElements(redBus_lst_btn_Result1SelectTravelsnSeatPage_IndividualOperator_SeatSelection_Continue));}catch (Exception e){}

		// select first boarding point
		Select redBus_drpdown_BoardingPoint = new Select(redBus_lst_drpdown_Result1SelectTravelsnSeatPage_IndividualOperator_SeatSelection_BoardingPoint.get(1));
		redBus_drpdown_BoardingPoint.selectByIndex(1);

		// since the screen scrolls up, need to move it down to make 'continue' button visible
		redBus_lst_lnk_Result1SelectTravelsnSeatPage_OnwardnReturn_RouteName.get(0).sendKeys("" + Keys.PAGE_UP);

		try{
			// book seating seat rather than sleeper since it is cheaper
			// 0th element is always the informational icon which is on right side of seat selection section so select starting from index 1 element
			System.out.println("DEBUG:    Selected following first available seating seat: " + 
					objWebElementIndividualPrivateBusOperator
						.get(nPrivateOperatorBusIndex)
						.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSeating)
						.get(1)
						.getAttribute("title"));

			int nSelectedSeatCount = 
					objWebElementIndividualPrivateBusOperator
						.get(nPrivateOperatorBusIndex)
						.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AllSelected).size();
			
			while(
				objWebElementIndividualPrivateBusOperator
						.get(nPrivateOperatorBusIndex)
						.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AllSelected).size() <= nSelectedSeatCount)
							{		
								objWebElementIndividualPrivateBusOperator
										.get(nPrivateOperatorBusIndex)
										.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSeating)
										.get(1)
										.click();
								redBus_lst_lnk_Result1SelectTravelsnSeatPage_OnwardnReturn_RouteName.get(0).sendKeys("" + Keys.ARROW_UP);
							}
		}catch(Exception e){
			System.out.println("DEBUG:    Selecting sleeper seats as no seating seats are available");
			// book sleeper seat rather than seating since it is costlier
			System.out.println("DEBUG:    Selected following first available sleeper seat: " + 
					objWebElementIndividualPrivateBusOperator
						.get(nPrivateOperatorBusIndex)
						.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSleeper)
						.get(1)
						.getAttribute("title"));

			int nSelectedSeatCount = 
					objWebElementIndividualPrivateBusOperator
						.get(nPrivateOperatorBusIndex)
						.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AllSelected).size();
			
			while(
				objWebElementIndividualPrivateBusOperator
				.get(nPrivateOperatorBusIndex)
				.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AllSelected).size() <= nSelectedSeatCount)
						{		objWebElementIndividualPrivateBusOperator
									.get(nPrivateOperatorBusIndex)
									.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSleeper)
									.get(1)
									.click();
								redBus_lst_lnk_Result1SelectTravelsnSeatPage_OnwardnReturn_RouteName.get(0).sendKeys("" + Keys.ARROW_UP);
						}
		}

		// wait for some time so that selected seat details are shown on screen
		try{objWaitShort.until(ExpectedConditions.visibilityOf(		objWebElementIndividualPrivateBusOperator
																		.get(nPrivateOperatorBusIndex)
																		.findElement(redBus_ByCssSelector_lst_labl_Result1SelectTravelsnSeatPage_TotalFareValue)));
		}catch (Exception e){}
		
		// click on continue	
		objWebElementIndividualPrivateBusOperator
							.get(nPrivateOperatorBusIndex)
							.findElement(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_Continue)
							.click();

		// bredBus_BookReturnTicket is not required, but maintained for coding practice
		
		return bSeatSelectionSuccess;
	}
	
	private boolean redBus_CheckCancellationPolicyFor(int nPrivateOperatorBusIndex){
		
		boolean bSeatSelectionSuccess = false;

		List<WebElement> objWebElementIndividualPrivateBusOperator 	= redBus_lst_Result1SelectTravelsnSeatPage_PrivateBusesGroup
																		.get(0).findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_SectiowiseBusOperatorGroup);
		// click on cancellation policy icon
		objWebElementIndividualPrivateBusOperator
				.get(nPrivateOperatorBusIndex)
				.findElement(redBus_ByCssSelector_lst_Result1SelectTravelsnSeatPage_CancellationPolicy)
				.click();

		WebDriver objWebDriverAbstractTemp 	= this.objWebDriverAbstract;
        List<WebElement> iframeElements 	= objWebDriverAbstractTemp.findElements(By.tagName("iframe"));
    	
    	for (WebElement oneEle: iframeElements){
    		objWebDriverAbstractTemp.switchTo().frame(oneEle);
    		
    		// check for column headers
			if (objWebDriverAbstractTemp.findElements(By.cssSelector("th[align='left'][scope='col']")).size() > 1 ){
				objWebDriverAbstractTemp.switchTo().defaultContent();
				objWebDriverAbstractTemp.findElements(By.cssSelector(".modalClose")).get(1).click();
				bSeatSelectionSuccess = true;
		    	break;
			}
    		objWebDriverAbstractTemp.switchTo().defaultContent();
    	}
		
		// seat selection results are shown after more time so wait for more time
		try{objWait.until(ExpectedConditions.visibilityOfAllElements(redBus_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats));}catch (Exception e){}
		try{objWait.until(ExpectedConditions.visibilityOfAllElements(redBus_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats));}catch (Exception e){}

		return bSeatSelectionSuccess;
	}
	
	private boolean redBus_mTicketMessageFor(int nPrivateOperatorBusIndex){
		
		boolean bSeatSelectionSuccess = false;

		List<WebElement> objWebElementIndividualPrivateBusOperator 	= redBus_lst_Result1SelectTravelsnSeatPage_PrivateBusesGroup
																		.get(0).findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_SectiowiseBusOperatorGroup);
		// click on mTicket icon
		objWebElementIndividualPrivateBusOperator
				.get(nPrivateOperatorBusIndex)
				.findElement(redBus_ByCssSelector_lst_Result1SelectTravelsnSeatPage_mTicketMessage)
				.click();
		
		WebDriver objWebDriverAbstractTemp 			= this.objWebDriverAbstract;
		String redBus_ParentWindowHandle 			= objWebDriverAbstractTemp.getWindowHandle();
		Set<String> redBus_set_AllWindowHandles 	= objWebDriverAbstractTemp.getWindowHandles();
		Iterator<String> redBus_itr_WindowHandle 	= redBus_set_AllWindowHandles.iterator();
		
		while (redBus_itr_WindowHandle.hasNext()){
				objWebDriverAbstractTemp.switchTo().window(redBus_itr_WindowHandle.next());
				if (objWebDriverAbstractTemp.getWindowHandle().contains(redBus_ParentWindowHandle)) continue;
				try{objWait.until(ExpectedConditions.titleContains("mTicket"));}catch(Exception e){}
				
				if(objWebDriverAbstractTemp.getTitle().contains("mTicket")){
					if(objWebDriverAbstractTemp.findElements(redBus_ByCssSelector_lst_Result1SelectTravelsnSeatPage_mTicketMessage_Header).size() > 0){
						bSeatSelectionSuccess = true;
					}
				}
				objWebDriverAbstractTemp.close();
		}

		objWebDriverAbstractTemp.switchTo().window(redBus_ParentWindowHandle);

		return bSeatSelectionSuccess;
	}
	
	private boolean redBus_CheckRatingsMessage(int nPrivateOperatorBusIndex){
		
		boolean bSeatSelectionSuccess 	= false;
		
		List<WebElement> objWebElementIndividualPrivateBusOperator 	= redBus_lst_Result1SelectTravelsnSeatPage_PrivateBusesGroup
																		.get(0).findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_SectiowiseBusOperatorGroup);

		WebElement redBud_OneElement = 	objWebElementIndividualPrivateBusOperator
												.get(nPrivateOperatorBusIndex)
												.findElement(redBus_ByCssSelector_lst_Result1SelectTravelsnSeatPage_ratingsText);

		if (redBud_OneElement.getText().contains("No Ratings")) return false;
		
		// click on ratings
		redBud_OneElement.click();

		// check the ratings message
		WebDriver objWebDriverAbstractTemp 	= this.objWebDriverAbstract;
        List<WebElement> iframeElements 	= objWebDriverAbstractTemp.findElements(By.tagName("iframe"));
    	
    	for (WebElement oneEle: iframeElements){
    		objWebDriverAbstractTemp.switchTo().frame(oneEle);
	
    		// check for column headers
			if (objWebDriverAbstractTemp.findElements(By.cssSelector(".XXLarge.XCN")).size() > 0 ){
				objWebDriverAbstractTemp.switchTo().defaultContent();
				objWebDriverAbstractTemp.findElements(By.cssSelector(".modalClose")).get(1).click();
				bSeatSelectionSuccess = true;
		    	break;
			}
    		objWebDriverAbstractTemp.switchTo().defaultContent();
    	}
    	
		// seat selection results are shown after more time so wait for more time
		try{objWait.until(ExpectedConditions.visibilityOfAllElements(redBus_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats));}catch (Exception e){}
		try{objWait.until(ExpectedConditions.visibilityOfAllElements(redBus_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats));}catch (Exception e){}

		return bSeatSelectionSuccess;
	}
	
	private boolean redBus_SelectAvailableSeat_Random(int nPrivateOperatorBusIndex){
		
		boolean bSeatSelectionSuccess = true;

		List<WebElement> objWebElementIndividualPrivateBusOperator 	= redBus_lst_Result1SelectTravelsnSeatPage_PrivateBusesGroup
																		.get(0).findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_SectiowiseBusOperatorGroup);
		// click on view seat button
		objWebElementIndividualPrivateBusOperator
				.get(nPrivateOperatorBusIndex).
				findElement(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats)
				.click();
		
		// seat selection results are shown after more time so wait for more time
		try{objWait.until(ExpectedConditions.visibilityOfAllElements(redBus_lst_btn_Result1SelectTravelsnSeatPage_IndividualOperator_SeatSelection_Continue));}catch (Exception e){}
		try{objWait.until(ExpectedConditions.visibilityOfAllElements(redBus_lst_btn_Result1SelectTravelsnSeatPage_IndividualOperator_SeatSelection_Continue));}catch (Exception e){}

		try{
			
			int nRandomIndex = ClsGeneralInitTerminateAndOtherUtil.getPositiveRandomNumberBetweenRange
					(1, 
					 (-1 + objWebElementIndividualPrivateBusOperator
					 .get(nPrivateOperatorBusIndex)
					 .findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSeating).size()));

			// book seating seat rather than sleeper since it is cheaper
			// 0th element is always the informational icon which is on right side of seat selection section so select starting from index 1 element
			System.out.println("DEBUG:    Selected following random available seating seat: " + 
					objWebElementIndividualPrivateBusOperator
						.get(nPrivateOperatorBusIndex)
						.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSeating)
						.get(nRandomIndex)
						.getAttribute("title"));

			int nSelectedSeatCount = 
					objWebElementIndividualPrivateBusOperator
						.get(nPrivateOperatorBusIndex)
						.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AllSelected).size();
			
			while(
				objWebElementIndividualPrivateBusOperator
						.get(nPrivateOperatorBusIndex)
						.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AllSelected).size() <= nSelectedSeatCount)
							{		
								objWebElementIndividualPrivateBusOperator
										.get(nPrivateOperatorBusIndex)
										.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSeating)
										.get(nRandomIndex)
										.click();
								redBus_lst_lnk_Result1SelectTravelsnSeatPage_OnwardnReturn_RouteName.get(0).sendKeys("" + Keys.ARROW_UP);
							}
		}catch(Exception e){
			System.out.println("DEBUG:    Selecting sleeper seats as no seating seats are available");
			int nRandomIndex = ClsGeneralInitTerminateAndOtherUtil.getPositiveRandomNumberBetweenRange
					(1, 
					 (-1 + objWebElementIndividualPrivateBusOperator
					 .get(nPrivateOperatorBusIndex)
					 .findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSleeper).size()));

			// book sleeper seat rather than seating since it is costlier
			System.out.println("DEBUG:    Selected following random available sleeper seat: " + 
					objWebElementIndividualPrivateBusOperator
						.get(nPrivateOperatorBusIndex)
						.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSleeper)
						.get(nRandomIndex)
						.getAttribute("title"));

			int nSelectedSeatCount = 
					objWebElementIndividualPrivateBusOperator
						.get(nPrivateOperatorBusIndex)
						.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AllSelected).size();
			
			while(
				objWebElementIndividualPrivateBusOperator
				.get(nPrivateOperatorBusIndex)
				.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AllSelected).size() <= nSelectedSeatCount)
						{		objWebElementIndividualPrivateBusOperator
									.get(nPrivateOperatorBusIndex)
									.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSleeper)
									.get(nRandomIndex)
									.click();
								redBus_lst_lnk_Result1SelectTravelsnSeatPage_OnwardnReturn_RouteName.get(0).sendKeys("" + Keys.ARROW_UP);
						}
		}

		// wait for some time so that selected seat details are shown on screen
		try{objWaitShort.until(ExpectedConditions.visibilityOf(		objWebElementIndividualPrivateBusOperator
																		.get(nPrivateOperatorBusIndex)
																		.findElement(redBus_ByCssSelector_lst_labl_Result1SelectTravelsnSeatPage_TotalFareValue)));
		}catch (Exception e){}

		return bSeatSelectionSuccess;
	}
    
	private boolean redBus_SelectAvailableSeat_Ladies_and_FirstBoardingPoint(int nPrivateOperatorBusIndex){
		
		boolean bSeatSelectionSuccess = true;

		List<WebElement> objWebElementIndividualPrivateBusOperator 	= redBus_lst_Result1SelectTravelsnSeatPage_PrivateBusesGroup
																		.get(0).findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_SectiowiseBusOperatorGroup);
		// click on view seat button
		objWebElementIndividualPrivateBusOperator
				.get(nPrivateOperatorBusIndex).
				findElement(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats)
				.click();
		
		// seat selection results are shown after more time so wait for more time
		try{objWait.until(ExpectedConditions.visibilityOfAllElements(redBus_lst_btn_Result1SelectTravelsnSeatPage_IndividualOperator_SeatSelection_Continue));}catch (Exception e){}
		try{objWait.until(ExpectedConditions.visibilityOfAllElements(redBus_lst_btn_Result1SelectTravelsnSeatPage_IndividualOperator_SeatSelection_Continue));}catch (Exception e){}

		// select first boarding point
		Select redBus_drpdown_BoardingPoint = new Select(redBus_lst_drpdown_Result1SelectTravelsnSeatPage_IndividualOperator_SeatSelection_BoardingPoint.get(0));
		redBus_drpdown_BoardingPoint.selectByIndex(1);

		// since the screen scrolls up, need to move it down to make 'continue' button visible
		redBus_lst_lnk_Result1SelectTravelsnSeatPage_OnwardnReturn_RouteName.get(0).sendKeys("" + Keys.PAGE_UP);

		try{
			// book seating seat rather than sleeper since it is cheaper
			// 0th element is always the informational icon which is on right side of seat selection section so select starting from index 1 element
			System.out.println("DEBUG:    Selected following ladies available seating seat: " + 
					objWebElementIndividualPrivateBusOperator
						.get(nPrivateOperatorBusIndex)
						.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSeatingLadies)
						.get(0)
						.getAttribute("title"));

			int nSelectedSeatCount = 
					objWebElementIndividualPrivateBusOperator
						.get(nPrivateOperatorBusIndex)
						.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AllSelected).size();
			
			while(
				objWebElementIndividualPrivateBusOperator
						.get(nPrivateOperatorBusIndex)
						.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AllSelected).size() <= nSelectedSeatCount)
							{		
								objWebElementIndividualPrivateBusOperator
										.get(nPrivateOperatorBusIndex)
										.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSeatingLadies)
										.get(0)
										.click();
								redBus_lst_lnk_Result1SelectTravelsnSeatPage_OnwardnReturn_RouteName.get(0).sendKeys("" + Keys.ARROW_UP);
							}
		}catch(Exception e){
			System.out.println("DEBUG:    Selecting sleeper seats as no seating ladies seats are available");
			try{
				// book sleeper seat rather than seating since it is costlier
				System.out.println("DEBUG:    Selected following ladies available sleeper seat: " + 
						objWebElementIndividualPrivateBusOperator
							.get(nPrivateOperatorBusIndex)
							.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSleeperLadies)
							.get(0)
							.getAttribute("title"));

				int nSelectedSeatCount = 
						objWebElementIndividualPrivateBusOperator
							.get(nPrivateOperatorBusIndex)
							.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AllSelected).size();
				
				while(
					objWebElementIndividualPrivateBusOperator
					.get(nPrivateOperatorBusIndex)
					.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AllSelected).size() <= nSelectedSeatCount)
							{		objWebElementIndividualPrivateBusOperator
										.get(nPrivateOperatorBusIndex)
										.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSleeperLadies)
										.get(0)
										.click();
									redBus_lst_lnk_Result1SelectTravelsnSeatPage_OnwardnReturn_RouteName.get(0).sendKeys("" + Keys.ARROW_UP);
							}
			}catch(Exception e1){
				System.out.println("DEBUG:    No sleeper ladies seats are available. Check for normal seats again.");
				// click on hide seat button
				objWebElementIndividualPrivateBusOperator
						.get(nPrivateOperatorBusIndex).
						findElement(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats)
						.click();
				return false;
			}
		}

		// wait for some time so that selected seat details are shown on screen
		try{objWaitShort.until(ExpectedConditions.visibilityOf(		objWebElementIndividualPrivateBusOperator
																		.get(nPrivateOperatorBusIndex)
																		.findElement(redBus_ByCssSelector_lst_labl_Result1SelectTravelsnSeatPage_TotalFareValue)));
		}catch (Exception e){}
		
		// click on continue	
		objWebElementIndividualPrivateBusOperator
							.get(nPrivateOperatorBusIndex)
							.findElement(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_Continue)
							.click();
		
		// wait until "do you want to book return ticket also?" message
		try{objWait.until(ExpectedConditions.visibilityOf(redBus_btn_Result1SelectTravelsnSeatPage_IndividualOperator_BookReturnTicket_Deny));}catch (Exception e){}

		// select to book only one way journey
		redBus_btn_Result1SelectTravelsnSeatPage_IndividualOperator_BookReturnTicket_Deny.click();

		return bSeatSelectionSuccess;
	}
    
	private boolean redBus_SelectAvailableSeat_LadiesAndGents_and_FirstBoardingPoint(int nPrivateOperatorBusIndex){
		
		boolean bSeatSelectionSuccess = true;

		List<WebElement> objWebElementIndividualPrivateBusOperator 	= redBus_lst_Result1SelectTravelsnSeatPage_PrivateBusesGroup
																		.get(0).findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_SectiowiseBusOperatorGroup);
		// click on view seat button
		objWebElementIndividualPrivateBusOperator
				.get(nPrivateOperatorBusIndex).
				findElement(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats)
				.click();
		
		// seat selection results are shown after more time so wait for more time
		try{objWait.until(ExpectedConditions.visibilityOfAllElements(redBus_lst_btn_Result1SelectTravelsnSeatPage_IndividualOperator_SeatSelection_Continue));}catch (Exception e){}
		try{objWait.until(ExpectedConditions.visibilityOfAllElements(redBus_lst_btn_Result1SelectTravelsnSeatPage_IndividualOperator_SeatSelection_Continue));}catch (Exception e){}

		// select first boarding point
		Select redBus_drpdown_BoardingPoint = new Select(redBus_lst_drpdown_Result1SelectTravelsnSeatPage_IndividualOperator_SeatSelection_BoardingPoint.get(0));
		redBus_drpdown_BoardingPoint.selectByIndex(1);

		// since the screen scrolls up, need to move it down to make 'continue' button visible
		redBus_lst_lnk_Result1SelectTravelsnSeatPage_OnwardnReturn_RouteName.get(0).sendKeys("" + Keys.PAGE_UP);

		try{
			// book seating seat rather than sleeper since it is cheaper
			// 0th element is always the informational icon which is on right side of seat selection section so select starting from index 1 element
			System.out.println("DEBUG:    Selected following ladies available seating seat: " + 
					objWebElementIndividualPrivateBusOperator
						.get(nPrivateOperatorBusIndex)
						.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSeatingLadies)
						.get(0)
						.getAttribute("title"));
			System.out.println("DEBUG:    Selected following gents available seating seat: " + 
					objWebElementIndividualPrivateBusOperator
						.get(nPrivateOperatorBusIndex)
						.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSeating)
						.get(1)
						.getAttribute("title"));
			
			int nSelectedSeatCount = 
					objWebElementIndividualPrivateBusOperator
						.get(nPrivateOperatorBusIndex)
						.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AllSelected).size();
			
			while(
				objWebElementIndividualPrivateBusOperator
						.get(nPrivateOperatorBusIndex)
						.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AllSelected).size() <= nSelectedSeatCount)
							{		
								objWebElementIndividualPrivateBusOperator
										.get(nPrivateOperatorBusIndex)
										.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSeatingLadies)
										.get(0)
										.click();
								objWebElementIndividualPrivateBusOperator
										.get(nPrivateOperatorBusIndex)
										.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSeating)
										.get(1)
										.click();
								redBus_lst_lnk_Result1SelectTravelsnSeatPage_OnwardnReturn_RouteName.get(0).sendKeys("" + Keys.ARROW_UP);
							}
		}catch(Exception e){
			//System.out.println("DEBUG:    Selecting sleeper seats as no seating ladies seats are available");
			try{
				// book sleeper seat rather than seating since it is costlier
				System.out.println("DEBUG:    Selected following ladies available sleeper seat: " + 
						objWebElementIndividualPrivateBusOperator
							.get(nPrivateOperatorBusIndex)
							.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSleeperLadies)
							.get(0)
							.getAttribute("title"));
				System.out.println("DEBUG:    Selected following gents available sleeper seat: " + 
						objWebElementIndividualPrivateBusOperator
							.get(nPrivateOperatorBusIndex)
							.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSleeper)
							.get(1)
							.getAttribute("title"));

				int nSelectedSeatCount = 
						objWebElementIndividualPrivateBusOperator
							.get(nPrivateOperatorBusIndex)
							.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AllSelected).size();
				
				while(
					objWebElementIndividualPrivateBusOperator
						.get(nPrivateOperatorBusIndex)
						.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AllSelected).size() <= nSelectedSeatCount)
							{
									objWebElementIndividualPrivateBusOperator
										.get(nPrivateOperatorBusIndex)
										.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSleeperLadies)
										.get(0)
										.click();
									objWebElementIndividualPrivateBusOperator
										.get(nPrivateOperatorBusIndex)
										.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSleeper)
										.get(1)
										.click();
									redBus_lst_lnk_Result1SelectTravelsnSeatPage_OnwardnReturn_RouteName.get(0).sendKeys("" + Keys.ARROW_UP);
							}
			}catch(Exception e1){
				// check if seating seats are available, if not then go for sleeper
				By redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSeatingORSleeper = null;
				if( objWebElementIndividualPrivateBusOperator
							.get(nPrivateOperatorBusIndex)
							.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSeating).size() > 2){
					redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSeatingORSleeper = 
							redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSeating;
				}else{
					redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSeatingORSleeper = 
							redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSleeper;
				}
				
				// 0th element is always the informational icon which is on right side of seat selection section so select starting from index 1 element
				System.out.println("DEBUG:    Selected following general available seating seat: " + 
						objWebElementIndividualPrivateBusOperator
							.get(nPrivateOperatorBusIndex)
							.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSeatingORSleeper)
							.get(1)
							.getAttribute("title") + " and " +
						objWebElementIndividualPrivateBusOperator
							.get(nPrivateOperatorBusIndex)
							.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSeatingORSleeper)
							.get(2)
							.getAttribute("title"));
				
				int nSelectedSeatCount = 
						objWebElementIndividualPrivateBusOperator
							.get(nPrivateOperatorBusIndex)
							.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AllSelected).size();
				
				while(
					objWebElementIndividualPrivateBusOperator
							.get(nPrivateOperatorBusIndex)
							.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AllSelected).size() <= nSelectedSeatCount)
								{
									objWebElementIndividualPrivateBusOperator
											.get(nPrivateOperatorBusIndex)
											.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSeatingORSleeper)
											.get(1)
											.click();
									objWebElementIndividualPrivateBusOperator
											.get(nPrivateOperatorBusIndex)
											.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSeatingORSleeper)
											.get(2)
											.click();
									redBus_lst_lnk_Result1SelectTravelsnSeatPage_OnwardnReturn_RouteName.get(0).sendKeys("" + Keys.ARROW_UP);
								}
				}
		}

		// wait for some time so that selected seat details are shown on screen
		try{objWaitShort.until(ExpectedConditions.visibilityOf(		objWebElementIndividualPrivateBusOperator
																		.get(nPrivateOperatorBusIndex)
																		.findElement(redBus_ByCssSelector_lst_labl_Result1SelectTravelsnSeatPage_TotalFareValue)));
		}catch (Exception e){}
		
		// click on continue	
		objWebElementIndividualPrivateBusOperator
							.get(nPrivateOperatorBusIndex)
							.findElement(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_Continue)
							.click();
		
		// wait until "do you want to book return ticket also?" message
		try{objWait.until(ExpectedConditions.visibilityOf(redBus_btn_Result1SelectTravelsnSeatPage_IndividualOperator_BookReturnTicket_Deny));}catch (Exception e){}

		// select to book only one way journey
		redBus_btn_Result1SelectTravelsnSeatPage_IndividualOperator_BookReturnTicket_Deny.click();

		return bSeatSelectionSuccess;
	}
    
	private boolean redBus_SelectAvailableSeat_Upper_and_FirstBoardingPoint(int nPrivateOperatorBusIndex){
		
		boolean bSeatSelectionSuccess = true;

		List<WebElement> objWebElementIndividualPrivateBusOperator 	= redBus_lst_Result1SelectTravelsnSeatPage_PrivateBusesGroup
																		.get(0).findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_SectiowiseBusOperatorGroup);
		// click on view seat button
		objWebElementIndividualPrivateBusOperator
				.get(nPrivateOperatorBusIndex)
				.findElement(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats)
				.click();
		
		// seat selection results are shown after more time so wait for more time
		try{objWait.until(ExpectedConditions.visibilityOfAllElements(redBus_lst_btn_Result1SelectTravelsnSeatPage_IndividualOperator_SeatSelection_Continue));}catch (Exception e){}
		try{objWait.until(ExpectedConditions.visibilityOfAllElements(redBus_lst_btn_Result1SelectTravelsnSeatPage_IndividualOperator_SeatSelection_Continue));}catch (Exception e){}

		// select first boarding point
		Select redBus_drpdown_BoardingPoint = new Select(redBus_lst_drpdown_Result1SelectTravelsnSeatPage_IndividualOperator_SeatSelection_BoardingPoint.get(0));
		redBus_drpdown_BoardingPoint.selectByIndex(1);

		// since the screen scrolls up, need to move it down to make 'continue' button visible
		redBus_lst_lnk_Result1SelectTravelsnSeatPage_OnwardnReturn_RouteName.get(0).sendKeys("" + Keys.PAGE_UP);

		By redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSeatingORSleeper = null;
		boolean bIsSleeperSeatBoked = false;
		
		// check if sleeper seats are available, if not then go for seating
		if( objWebElementIndividualPrivateBusOperator
				.get(nPrivateOperatorBusIndex)
				.findElements(redBus_ByCssSelector_lst_Result1SelectTravelsnSeatPage_UpperDeckSection).size() > 0){

			if (objWebElementIndividualPrivateBusOperator
					.get(nPrivateOperatorBusIndex)
					.findElements(redBus_ByCssSelector_lst_Result1SelectTravelsnSeatPage_UpperDeckSection)
					.get(0)
					.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSleeper)
					.size() >1){
									bIsSleeperSeatBoked = true;
									redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSeatingORSleeper = 
											redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSleeper;
									System.out.println("DEBUG:    Selected following upper available seat: " + 
											objWebElementIndividualPrivateBusOperator
												.get(nPrivateOperatorBusIndex)
												.findElements(redBus_ByCssSelector_lst_Result1SelectTravelsnSeatPage_UpperDeckSection)
												.get(0)
												.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSeatingORSleeper)
												.get(0)
												.getAttribute("title"));
									
									int nSelectedSeatCount = 
											objWebElementIndividualPrivateBusOperator
												.get(nPrivateOperatorBusIndex)
												.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AllSelected).size();
									while(
											objWebElementIndividualPrivateBusOperator
													.get(nPrivateOperatorBusIndex)
													.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AllSelected).size() <= nSelectedSeatCount)
														{
															objWebElementIndividualPrivateBusOperator
																.get(nPrivateOperatorBusIndex)
																.findElements(redBus_ByCssSelector_lst_Result1SelectTravelsnSeatPage_UpperDeckSection)
																.get(0)
																.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSeatingORSleeper)
																.get(0)
																.click();
															redBus_lst_lnk_Result1SelectTravelsnSeatPage_OnwardnReturn_RouteName.get(0).sendKeys("" + Keys.ARROW_UP);
														}
			}		
		}
		
		if(! bIsSleeperSeatBoked){
			redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSeatingORSleeper = 
					redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSeating;

			// since the screen scrolls up, need to move it down to make 'continue' button visible
			redBus_lst_lnk_Result1SelectTravelsnSeatPage_OnwardnReturn_RouteName.get(0).sendKeys("" + Keys.DOWN + Keys.DOWN);

			// 0th element is always the informational icon which is on right side of seat selection section so select starting from index 1 element
			System.out.println("DEBUG:    Selected following general available seating seat: " + 
					objWebElementIndividualPrivateBusOperator
						.get(nPrivateOperatorBusIndex)
						.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSeatingORSleeper)
						.get(1)
						.getAttribute("title"));
			
			int nSelectedSeatCount = 
					objWebElementIndividualPrivateBusOperator
						.get(nPrivateOperatorBusIndex)
						.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AllSelected).size();
			
			while(
				objWebElementIndividualPrivateBusOperator
						.get(nPrivateOperatorBusIndex)
						.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AllSelected).size() <= nSelectedSeatCount)
							{
								objWebElementIndividualPrivateBusOperator
										.get(nPrivateOperatorBusIndex)
										.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSeatingORSleeper)
										.get(1)
										.click();
							}
			// since the screen scrolls up, need to move it down to make 'continue' button visible
			redBus_lst_lnk_Result1SelectTravelsnSeatPage_OnwardnReturn_RouteName.get(0).sendKeys("" + Keys.PAGE_DOWN);
		}
		
		// wait for some time so that selected seat details are shown on screen
		try{objWaitShort.until(ExpectedConditions.visibilityOf(		objWebElementIndividualPrivateBusOperator
																		.get(nPrivateOperatorBusIndex)
																		.findElement(redBus_ByCssSelector_lst_labl_Result1SelectTravelsnSeatPage_TotalFareValue)));
		}catch (Exception e){}
		
		// click on continue	
		objWebElementIndividualPrivateBusOperator
							.get(nPrivateOperatorBusIndex)
							.findElement(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_Continue)
							.click();
		
		// wait until "do you want to book return ticket also?" message
		try{objWait.until(ExpectedConditions.visibilityOf(redBus_btn_Result1SelectTravelsnSeatPage_IndividualOperator_BookReturnTicket_Deny));}catch (Exception e){}

		// select to book only one way journey
		redBus_btn_Result1SelectTravelsnSeatPage_IndividualOperator_BookReturnTicket_Deny.click();

		return bSeatSelectionSuccess;
	}

	private boolean redBus_SelectAvailableSeat_Lower_and_FirstBoardingPoint(int nGovtOperatorBusIndex){

		boolean bSeatSelectionSuccess = true;
		
		List<WebElement> objWebElementIndividualGovtBusOperator 	= redBus_lst_Result1SelectTravelsnSeatPage_GovtBusesGroup
																		.get(0).findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_SectiowiseBusOperatorGroup);
		// click on view seat button
		objWebElementIndividualGovtBusOperator
				.get(nGovtOperatorBusIndex + 1)		// for govt buses 0th element is just a header
				.findElement(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats)
				.click();
		
		// seat selection results are shown after more time so wait for more time
		try{objWait.until(ExpectedConditions.visibilityOf(redBus_btn_Result1SelectTravelsnSeatPage_GovtBusGroup_Collapse));}catch (Exception e){}
		
		// select first boarding point
		Select redBus_drpdown_BoardingPoint = new Select(redBus_lst_drpdown_Result1SelectTravelsnSeatPage_IndividualOperator_SeatSelection_BoardingPoint.get(0));
		redBus_drpdown_BoardingPoint.selectByIndex(1);

		// since the screen scrolls up, need to move it down to make 'continue' button visible
		redBus_lst_lnk_Result1SelectTravelsnSeatPage_OnwardnReturn_RouteName.get(0).sendKeys("" + Keys.PAGE_UP);

		By redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSeatingORSleeper = null;
		boolean bIsSleeperSeatBoked = false;
		
		// check if sleeper seats are available, if not then go for seating
		if( objWebElementIndividualGovtBusOperator
				.get(nGovtOperatorBusIndex + 1)
				.findElements(redBus_ByCssSelector_lst_Result1SelectTravelsnSeatPage_LowerDeckSection).size() > 0){

			if (objWebElementIndividualGovtBusOperator
					.get(nGovtOperatorBusIndex + 1)
					.findElements(redBus_ByCssSelector_lst_Result1SelectTravelsnSeatPage_LowerDeckSection)
					.get(0)
					.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSleeper)
					.size() >1){
									bIsSleeperSeatBoked = true;
									redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSeatingORSleeper = 
											redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSleeper;
									System.out.println("DEBUG:    Selected following lower available seat: " + 
											objWebElementIndividualGovtBusOperator
												.get(nGovtOperatorBusIndex + 1)
												.findElements(redBus_ByCssSelector_lst_Result1SelectTravelsnSeatPage_LowerDeckSection)
												.get(0)
												.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSeatingORSleeper)
												.get(0)
												.getAttribute("title"));
									
									int nSelectedSeatCount = 
											objWebElementIndividualGovtBusOperator
												.get(nGovtOperatorBusIndex + 1)
												.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AllSelected).size();
									while(
											objWebElementIndividualGovtBusOperator
													.get(nGovtOperatorBusIndex + 1)
													.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AllSelected).size() <= nSelectedSeatCount)
														{
															objWebElementIndividualGovtBusOperator
																.get(nGovtOperatorBusIndex + 1)
																.findElements(redBus_ByCssSelector_lst_Result1SelectTravelsnSeatPage_LowerDeckSection)
																.get(0)
																.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSeatingORSleeper)
																.get(0)
																.click();
															redBus_lst_lnk_Result1SelectTravelsnSeatPage_OnwardnReturn_RouteName.get(0).sendKeys("" + Keys.ARROW_UP);
														}
			}		
		}
		
		if(! bIsSleeperSeatBoked){
			// sleeper seats are NOT available, go for seating seats
			redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSeatingORSleeper = 
					redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSeating;

			// 0th element is always the informational icon which is on right side of seat selection section so select starting from index 1 element
			System.out.println("DEBUG:    Selected following general available seating seat: " + 
					objWebElementIndividualGovtBusOperator
						.get(nGovtOperatorBusIndex + 1)
						.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSeatingORSleeper)
						.get(1)
						.getAttribute("title"));
			
			int nSelectedSeatCount = 
					objWebElementIndividualGovtBusOperator
						.get(nGovtOperatorBusIndex + 1)
						.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AllSelected).size();
			
			while(
					objWebElementIndividualGovtBusOperator
						.get(nGovtOperatorBusIndex + 1)
						.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AllSelected).size() <= nSelectedSeatCount)
							{
									objWebElementIndividualGovtBusOperator
										.get(nGovtOperatorBusIndex + 1)
										.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_AvailableSeatsSeatingORSleeper)
										.get(1)
										.click();
							}
			// since the screen scrolls up, need to move it down to make 'continue' button visible
			redBus_lst_lnk_Result1SelectTravelsnSeatPage_OnwardnReturn_RouteName.get(0).sendKeys("" + Keys.UP);
		}
		
		// wait for some time so that selected seat details are shown on screen
		try{objWaitShort.until(ExpectedConditions.visibilityOf(		objWebElementIndividualGovtBusOperator
																		.get(nGovtOperatorBusIndex + 1)
																		.findElement(redBus_ByCssSelector_lst_labl_Result1SelectTravelsnSeatPage_TotalFareValue)));
		}catch (Exception e){}
		
		// click on continue	
		objWebElementIndividualGovtBusOperator
							.get(nGovtOperatorBusIndex + 1)
							.findElement(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_Continue)
							.click();
		
		// wait until "do you want to book return ticket also?" message
		try{objWait.until(ExpectedConditions.visibilityOf(redBus_btn_Result1SelectTravelsnSeatPage_IndividualOperator_BookReturnTicket_Deny));}catch (Exception e){}

		// select to book only one way journey
		redBus_btn_Result1SelectTravelsnSeatPage_IndividualOperator_BookReturnTicket_Deny.click();

		return bSeatSelectionSuccess;
	}
    
    private boolean redBus_FilterBy_and_OptionIndex(String strFilterByOption, String strFilterOptionIndexs){
    	
		// indexing format = idex__ (starting string)
		//                   seperate indexes by '__' pattern only
		//                   -1 means last index
		//                   -2 means second last index and so on
    	
		boolean bFilterByActivitySuccess 	= true;
		int nActiveFilters 					= redBus_lst_labl_Result1SelectTravelsnSeatPage_FilterBy_Applied_Active_Filter.size();
		System.out.println("DEBUG:    Filtering search results by: " + strFilterByOption);
		
		WebElement redBus_lnk_Result1SelectTravelsnSeatPage_FilterBy_Common 				= null;
		List<WebElement> redBus_lnk_Result1SelectTravelsnSeatPage_FilterBy_Common_Items 	= null;
		int nCommonFilter_OptionsCount = 0;
		
		switch (strFilterByOption){
		case "Travels":
			redBus_lnk_Result1SelectTravelsnSeatPage_FilterBy_Common = 
					redBus_lnk_Result1SelectTravelsnSeatPage_FilterBy_Travels;
			redBus_lnk_Result1SelectTravelsnSeatPage_FilterBy_Common_Items = 
					redBus_lst_lnk_Result1SelectTravelsnSeatPage_FilterBy_Travels_Items;
			nCommonFilter_OptionsCount = redBus_lst_lnk_Result1SelectTravelsnSeatPage_FilterBy_Travels_Items.size();
			break;
		case "Bus Type":
			redBus_lnk_Result1SelectTravelsnSeatPage_FilterBy_Common = 
					redBus_lnk_Result1SelectTravelsnSeatPage_FilterBy_BusType;
			redBus_lnk_Result1SelectTravelsnSeatPage_FilterBy_Common_Items = 
					redBus_lst_lnk_Result1SelectTravelsnSeatPage_FilterBy_BusType_Items;
			nCommonFilter_OptionsCount = redBus_lst_lnk_Result1SelectTravelsnSeatPage_FilterBy_BusType_Items.size();
			break;
		case "Amenities":
//			redBus_lnk_Result1SelectTravelsnSeatPage_FilterBy_Common = 
//					redBus_lnk_Result1SelectTravelsnSeatPage_FilterBy_Amenities;
//			redBus_lnk_Result1SelectTravelsnSeatPage_FilterBy_Common_Items = 
//					redBus_lst_lnk_Result1SelectTravelsnSeatPage_FilterBy_Amenities_Items;
//			nCommonFilter_OptionsCount = redBus_lst_lnk_Result1SelectTravelsnSeatPage_FilterBy_Amenities_Items.size();
			System.out.println("ERROR:    Following filter option is not yesupported: " + strFilterByOption);
			nCommonFilter_OptionsCount = 0;
			break;
		case "Boarding":
			redBus_lnk_Result1SelectTravelsnSeatPage_FilterBy_Common = 
					redBus_lnk_Result1SelectTravelsnSeatPage_FilterBy_Boarding;
			redBus_lnk_Result1SelectTravelsnSeatPage_FilterBy_Common_Items = 
					redBus_lst_lnk_Result1SelectTravelsnSeatPage_FilterBy_Boarding_Items;
			nCommonFilter_OptionsCount = redBus_lst_lnk_Result1SelectTravelsnSeatPage_FilterBy_Boarding_Items.size();
			break;
		case "Dropping":
			redBus_lnk_Result1SelectTravelsnSeatPage_FilterBy_Common = 
					redBus_lnk_Result1SelectTravelsnSeatPage_FilterBy_Dropping;
			redBus_lnk_Result1SelectTravelsnSeatPage_FilterBy_Common_Items = 
					redBus_lst_lnk_Result1SelectTravelsnSeatPage_FilterBy_Dropping_Items;
			nCommonFilter_OptionsCount = redBus_lst_lnk_Result1SelectTravelsnSeatPage_FilterBy_Dropping_Items.size();
			break;
		case "Ratings":
			redBus_lnk_Result1SelectTravelsnSeatPage_FilterBy_Common = 
					redBus_lnk_Result1SelectTravelsnSeatPage_FilterBy_Ratings;
			redBus_lnk_Result1SelectTravelsnSeatPage_FilterBy_Common_Items = 
					redBus_lst_lnk_Result1SelectTravelsnSeatPage_FilterBy_Ratings_Items;
			nCommonFilter_OptionsCount = redBus_lst_lnk_Result1SelectTravelsnSeatPage_FilterBy_Ratings_Items.size();
			break;
		default:
			break;
		}
		
		if(0 == nCommonFilter_OptionsCount){
			System.out.println("ERROR:    No options to filter for this filter type: " + strFilterByOption);
			return false;
		}
		
		// click on filter type to open it
		redBus_lnk_Result1SelectTravelsnSeatPage_FilterBy_Common.click();
		
		strFilterOptionIndexs 				= strFilterOptionIndexs.replace("index__", "");

		if (strFilterOptionIndexs.trim().contains("random")){
			int nFilterIndexRandom 			= ClsGeneralInitTerminateAndOtherUtil
													.getPositiveRandomNumberBetweenRange
														(0, 
														 redBus_lnk_Result1SelectTravelsnSeatPage_FilterBy_Common_Items.size() -1);
			
			strFilterOptionIndexs 			= strFilterOptionIndexs.replace("random", Integer.toString(nFilterIndexRandom));
		}

		String[] strArrFilterOptionIndexs 	= ClsGeneralInitTerminateAndOtherUtil.splitThisString(strFilterOptionIndexs,"__");
	    Integer[] nArrFilterOptionsIndexes	= new Integer[strArrFilterOptionIndexs.length];
	    
	    for(int nLocal=0; nLocal < nArrFilterOptionsIndexes.length ; nLocal++){
	    	int nIndexToClick = Integer.parseInt(strArrFilterOptionIndexs[nLocal].trim());
	    	if (nIndexToClick < 0){
	    		nIndexToClick = redBus_lnk_Result1SelectTravelsnSeatPage_FilterBy_Common_Items.size() - 1;
	    	}
	    	if (nIndexToClick >= redBus_lnk_Result1SelectTravelsnSeatPage_FilterBy_Common_Items.size()){
	    		nIndexToClick = redBus_lnk_Result1SelectTravelsnSeatPage_FilterBy_Common_Items.size() - 1;
	    	}
	    	// finally click oh the error free index option
	    	// if it exceeds the max index available, then it will click the last item only
	    	// if it is negative, redBus_lnk_Result1SelectTravelsnSeatPage_FilterBy_Common_Items
	    	if (redBus_lst_labl_Result1SelectTravelsnSeatPage_FilterBy_Applied_Active_Filter_Key.size() == 0){
		    	redBus_lnk_Result1SelectTravelsnSeatPage_FilterBy_Common_Items.get(nIndexToClick).click();
	    	}else{
	    		for(int nLocalKey=0; nLocalKey < redBus_lst_labl_Result1SelectTravelsnSeatPage_FilterBy_Applied_Active_Filter_Key.size() ; nLocalKey++){
	    			if (! redBus_lst_labl_Result1SelectTravelsnSeatPage_FilterBy_Applied_Active_Filter_Key
	    					.get(nLocalKey)
	    					.getText()
	    					.contains(redBus_lnk_Result1SelectTravelsnSeatPage_FilterBy_Common_Items.get(nIndexToClick).getText().trim()) ){
	    				redBus_lnk_Result1SelectTravelsnSeatPage_FilterBy_Common_Items.get(nIndexToClick).click();
	    				//break;
	    			}
	    		}
	    	}
	    }

	    // need to wait longer for next step to succeed
		objWait.until(ExpectedConditions.visibilityOfAllElements(redBus_lst_labl_Result1SelectTravelsnSeatPage_FilterBy_Applied_Active_Filter));
		objWait.until(ExpectedConditions.visibilityOfAllElements(redBus_lst_labl_Result1SelectTravelsnSeatPage_FilterBy_Applied_Active_Filter));
	    
		if (redBus_lst_labl_Result1SelectTravelsnSeatPage_FilterBy_Applied_Active_Filter.size() <= nActiveFilters){
			bFilterByActivitySuccess = false;
			System.out.println("ERROR:    Unable to apply filter for: " + strFilterByOption);
		}
		
		// click on filter type to close it
		redBus_lnk_Result1SelectTravelsnSeatPage_FilterBy_Common.click();
		
		return bFilterByActivitySuccess;
    }

    private boolean redBus_Clear_All_Filters(){

		objWait.until(ExpectedConditions.visibilityOfAllElements(redBus_lst_labl_Result1SelectTravelsnSeatPage_FilterBy_Applied_Active_Filter));

		for (int nLocal=-1 + redBus_lst_labl_Result1SelectTravelsnSeatPage_FilterBy_Applied_Active_Filter_Close.size(); nLocal>=0 ; nLocal-- ){
			redBus_lst_labl_Result1SelectTravelsnSeatPage_FilterBy_Applied_Active_Filter_Close.get(nLocal).click();
		}
		
    	if (redBus_lst_labl_Result1SelectTravelsnSeatPage_FilterBy_Applied_Active_Filter_Close.size() > 0)   		return false;
    	else     		return true;
    }
    
    private boolean redBus_Sorby_and_SortingType(String strSortByOption, String strSortType){
    	
		boolean bSortingByActivitySuccess 	= true;
		System.out.println("DEBUG:    Sorting search results by: " + strSortByOption + " and order by " + strSortType);
		int nRepeatIndex = 1; // 1 for descending
							  // 2 for ascending
		if(strSortType.contains("ascending"))  nRepeatIndex = 2;

		for(int nLocal=0;nLocal < nRepeatIndex; nLocal++){
			// when clicked 1st time, it will be in descending order
			// when clicked 2nd time, it will be in ascending order
			switch (strSortByOption){
			case "Travels":
				redBus_lst_labl_Result1SelectTravelsnSeatPage_SortBy_Travels.click();
				break;
			case "Depart":
				redBus_lst_labl_Result1SelectTravelsnSeatPage_SortBy_Depart.click();
				break;
			case "Arrive":
				redBus_lst_labl_Result1SelectTravelsnSeatPage_SortBy_Arrive.click();
				break;
			case "Duration":
				redBus_lst_labl_Result1SelectTravelsnSeatPage_SortBy_Duration.click();
				break;
			case "Seats":
				redBus_lst_labl_Result1SelectTravelsnSeatPage_SortBy_Seats.click();
				break;
			case "Ratings":
				redBus_lst_labl_Result1SelectTravelsnSeatPage_SortBy_Ratings.click();
				break;
			case "Fare":
				redBus_lst_labl_Result1SelectTravelsnSeatPage_SortBy_Fare.click();
				break;
			default:
				break;
			}
		}

		if(redBus_lst_labl_Result1SelectTravelsnSeatPage_SortByIcon_Ascending.size() > 0)
			objWaitShort.until(ExpectedConditions.visibilityOf(redBus_lst_labl_Result1SelectTravelsnSeatPage_SortByIcon_Ascending.get(0)));
		if(redBus_lst_labl_Result1SelectTravelsnSeatPage_SortByIcon_Descending.size() > 0)
			objWaitShort.until(ExpectedConditions.visibilityOf(redBus_lst_labl_Result1SelectTravelsnSeatPage_SortByIcon_Descending.get(0)));
		
//		try{objWaitShort.until(ExpectedConditions.visibilityOf(redBus_lst_labl_Result1SelectTravelsnSeatPage_SortByIcon_Ascending));}catch(Exception e){}
//		try{objWaitShort.until(ExpectedConditions.visibilityOf(redBus_lst_labl_Result1SelectTravelsnSeatPage_SortByIcon_Descending));}catch(Exception e){}
						
		return bSortingByActivitySuccess;
    }
 
	private boolean redBus_SelectAvailableSeat_IfMinimumAvailable_and_Index(int nMinSeatCount, int nPrivateOperatorBusIndex, int nredBus_FirstPrivateOperatorBusIndex){
		
		boolean bSeatSelectionSuccess 	= true;
		int nLocal 						= 0;
		boolean bIndexFound 			= false;
		List<WebElement> objWebElementIndividualPrivateBusOperator 	
										= redBus_lst_Result1SelectTravelsnSeatPage_PrivateBusesGroup
												.get(0).findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_SectiowiseBusOperatorGroup);

		for (nLocal = nredBus_FirstPrivateOperatorBusIndex;
			 nLocal < redBus_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats.size();
			 nLocal++){

			WebElement redBus_OneElement = objWebElementIndividualPrivateBusOperator
												.get(nLocal)
												.findElement(redBus_ByCssSelector_lst_Result1SelectTravelsnSeatPage_PerOperatorAvailableSeatsText);
			
			System.out.println("DEBUG:    # of total seats available for this operator: " + redBus_OneElement.getText());						if (  Integer.parseInt(redBus_OneElement.getText().trim())   >  nMinSeatCount) {
						nPrivateOperatorBusIndex = nPrivateOperatorBusIndex - 1;
						if (0 == nPrivateOperatorBusIndex){
							// at this 'nLocal' index every criteria matches
							bIndexFound = true;
							break;
						}				
			}	
		}
	
		if (! bIndexFound) return false;
		
		System.out.println("DEBUG:    Found matching index of operator having minimum seat count " + nMinSeatCount + " and it is the nth operaor i.e. " + nPrivateOperatorBusIndex);
		// click on view seat button
		objWebElementIndividualPrivateBusOperator
				.get(nLocal)
				.findElement(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats)
				.click();
		
		// seat selection results are shown after more time so wait for more time
		try{objWait.until(ExpectedConditions.visibilityOfAllElements(redBus_lst_btn_Result1SelectTravelsnSeatPage_IndividualOperator_SeatSelection_Continue));}catch (Exception e){}
		try{objWait.until(ExpectedConditions.visibilityOfAllElements(redBus_lst_btn_Result1SelectTravelsnSeatPage_IndividualOperator_SeatSelection_Continue));}catch (Exception e){}

		// select first boarding point
		Select redBus_drpdown_BoardingPoint = new Select(redBus_lst_drpdown_Result1SelectTravelsnSeatPage_IndividualOperator_SeatSelection_BoardingPoint.get(0));
		redBus_drpdown_BoardingPoint.selectByIndex(1);

		return bSeatSelectionSuccess;
	}
    
    
    
    

}
