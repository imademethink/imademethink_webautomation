package com.imademethink_webautomation.pkgTktTravel_redBus;

import java.util.List;

import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.imademethink_webautomation.UtilGeneral.ClsGeneralInitTerminateAndOtherUtil;
import com.imademethink_webautomation.pkg0GeneralPageFactory.Page0Abstract;

public class PageredBusMain extends Page0Abstract{

	public PageredBusMain(WebDriver driver) {
		super(driver);
		//System.out.println("DEBUG:    PageredBusMain constructor");
		PageFactory.initElements(driver, this);
	}
	
	// home page elements
	@FindBy(linkText="Home")	
	private WebElement redBus_lnk_HomePage_Home;
	@FindBy(linkText="BUSES")
	private WebElement redBus_lnk_HomePage_Buses;
	@FindBy(linkText="HOTELS")
	private WebElement redBus_lnk_HomePage_Hotels;
	@FindBy(css=".RB.aWrapper")
	private WebElement redBus_lnk_HomePage_Promotional_Side_Image;
	@FindBy(css="img[alt='TrackMyBus']")
	private WebElement redBus_img_TrackMyBus;
	@FindBy(css=".ibibogroup")
	private WebElement redBus_lnk_HomePage_ibibogroup;
	@FindBy(css=".goibibo")
	private WebElement redBus_lnk_HomePage_goibibo;
	@FindBy(linkText="Print/SMS Ticket")
	private WebElement redBus_lnk_HomePage_PrintorSMS_Ticket;
	@FindBy(linkText="Easy Cancel/Refund")
	private WebElement redBus_lnk_HomePage_EasyCancelorRefund;
	@FindBy(css=".icon-call.icon-master")
	private WebElement redBus_lnk_HomePage_TollFreeNumber;
    @FindBy(css="#txtSource")
    private WebElement redBus_txtbox_HomePage_BusDepartFromCity;
    @FindBy(css="#txtDestination")
    private WebElement redBus_txtbox_HomePage_BusArriveToCity;
    @FindBy(css=".autoFill>li")
    private List<WebElement> redBus_lst_labl_HomePage_MatchingCityName;
    @FindBy(css="#txtOnwardCalendar")
    private WebElement redBus_drpdown_HomePage_DepartCalender;
    @FindBy(css="#txtReturnCalendar")
    private WebElement redBus_drpdown_HomePage_ArriveCalender;
    @FindBy(css=".monthTitle")
    private List<WebElement> redBus_lst_labl_HomePage_DepartArrive_Calender_MonthnYear;
    @FindBy(css=".current.day")
    private List<WebElement> redBus_lst_labl_HomePage_DepartArrive_Calender_CurrentDay;
    @FindBy(css=".monthTable.first")
    private List<WebElement> redBus_lst_labl_HomePage_DepartArrive_Calender_MonthTable_First;
    @FindBy(css=".monthTable.last")
    private List<WebElement> redBus_lst_labl_HomePage_DepartArrive_Calender_MonthTable_Last;
    @FindBy(css=".next>button")
    private List<WebElement> redBus_lst_labl_HomePage_DepartArrive_Calender_MontTable_NextArrow;
    @FindBy(css=".prev>button")
    private List<WebElement> redBus_lst_labl_HomePage_DepartArrive_Calender_MontTable_PrevArrow;
    @FindBy(css="#searchBtn")
    private WebElement redBus_btn_HomePage_SearchBuses;
    @FindBy(css=".viewSeatsBtn")
    private List<WebElement> redBus_lst_btn_ResultPage_ViewSeats;
    @FindBy(linkText = "About redBus")
	private WebElement redBus_lnk_HomePage_AboutredBus;
    @FindBy(linkText = "redBus on Mobile")
	private WebElement redBus_lnk_HomePage_redBusOnMobile;
    @FindBy(css = ".clearfix.carousel.carousel-border>a>img")
	private WebElement redBus_img_HomePage_TrackMyBus;
    
	By redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats							= new ByCssSelector (".viewSeatsBtn");

	// home page logo
	@FindBy(css="img[src='assets/images/logo/redbus_logo.png']")
	private WebElement redBus_img_HomePageLogo;

	// sign up and sign in
    @FindBy(linkText = "Sign Up / Sign In")
	private WebElement redBus_lnk_UserSection_SignUpSignIn;
    
    // home page tabs common elements for my trips tab and check in tab
    @FindBy(css="label[title='Passenger First Name']")
    private List<WebElement> redBus_lst_txtbox_PassengerFirstName;
    @FindBy(css="label[title='Passenger Last Name']")
    private List<WebElement> redBus_lst_txtbox_PassengerLastName;
    @FindBy(css="label[title*='Booking reference']")
    private List<WebElement> redBus_lst_txtbox_Booking_Reference;   
    
    // other page elements
    @FindBy(css="#ctl00_ContentHolder_TBTIN")
	private WebElement redBus_txtbox_PrintorSMSTicketPage_TicketNumber;
    @FindBy(css="#ctl00_ContentHolder_TBTicketNo")
	private WebElement redBus_txtbox_EasyCancelorRefundPage_TicketNumber;
    @FindBy(linkText = "Our Story")
	private WebElement redBus_lnk_AboutredBusPage_OurStory;
    @FindBy(css="#smsTXTBOX")
	private WebElement redBus_txtbox_redBusOnMobilePage_EnterMobileNumber;
    @FindBy(css=".MB1.swt.fade-effect.OP1>img")
	private WebElement redBus_img_TrackMyBusPage_TrackingLogo;
    
    // error message
    @FindBy(css=".errorMessage")
    private List<WebElement> redBus_lst_labl_MainPageErrors;
    @FindBy(css=".errorMessageFixed")
    private List<WebElement> redBus_lst_labl_MainPageErrors_InvalidCity;
    @FindBy(css=".TextBold")
    private List<WebElement> redBus_lst_labl_MainPageErrors_LongJourneyDate;
    @FindBy(css=".submitRemindMe")
    private List<WebElement> redBus_lst_labl_ReturnBookingNotOpenedYet;

    // some junk element
    @FindBy(id="zzzzzzz")
    private WebElement redBus_somejunkelement;
    //private String strcleartrip_somejunkelement = "zzzzzzz";

    // every page object has it's local private wait with fixed 10 sec delay
    private WebDriverWait objWait 		= new WebDriverWait(this.objWebDriverAbstract, 10);
    private WebDriverWait objWaitShort 	= new WebDriverWait(this.objWebDriverAbstract, 3);

	public boolean redBus_validate_This_Element(String strThisElement){

		boolean bredBus_ThisElementValidationStatus 		= false;
				
		switch (strThisElement){
			case "btn__HOME":
			case "btn__Home":
				bredBus_ThisElementValidationStatus 	= redBus_lnk_HomePage_Home.isDisplayed();
				break;

			case "lnk__BUSES":
				bredBus_ThisElementValidationStatus 	= redBus_lnk_HomePage_Buses.isDisplayed();
				break;
			case "lnk_HOTELS":
				bredBus_ThisElementValidationStatus		= redBus_lnk_HomePage_Hotels.isDisplayed();
				break;
			case "img__Promotional_side_image":
				bredBus_ThisElementValidationStatus		= redBus_lnk_HomePage_Promotional_Side_Image.isDisplayed();
				break;

			case "btn__Track_My_Bus_Learn_More":
				bredBus_ThisElementValidationStatus		= redBus_img_TrackMyBus.isDisplayed();
				break;
			case "labl__ibibo_Group":
				bredBus_ThisElementValidationStatus		= redBus_lnk_HomePage_ibibogroup.isEnabled();
				break;
			case "labl__goibibo":
				bredBus_ThisElementValidationStatus		= redBus_lnk_HomePage_goibibo.isEnabled();
				break;
			case "lnk__Print/SMS_Ticket":
				bredBus_ThisElementValidationStatus		= redBus_lnk_HomePage_PrintorSMS_Ticket.isDisplayed();
				break;
			case "lnk__EasyCancel/Refund":
				bredBus_ThisElementValidationStatus		= redBus_lnk_HomePage_EasyCancelorRefund.isDisplayed();
				break;
			case "drpdwn_Toll_Number_list":
				bredBus_ThisElementValidationStatus		= redBus_lnk_HomePage_TollFreeNumber.isDisplayed();
				break;
	    	default:
	    		break;
		}
		
		return bredBus_ThisElementValidationStatus;
		
	}
	
	public boolean redBus_Validate_HomePageGUIElements_for_DepartCityNames(String[] strArrDepartCities){

		boolean bredBus_ThisElementValidationStatus 		= true;
		int nredBus_MaxCityCountCheck 						= 0;
		for (String strOneDepartCity: strArrDepartCities){
			if (nredBus_MaxCityCountCheck++ > 2) break;
			
			boolean bOneDepartCityNameFound = false;
			redBus_txtbox_HomePage_BusDepartFromCity.clear();
			redBus_txtbox_HomePage_BusDepartFromCity.sendKeys(strOneDepartCity);
			
			try{objWaitShort.until(ExpectedConditions.visibilityOf(redBus_somejunkelement));
			}catch (Exception e){/*System.out.println("DEBUG:    This exception to be ignored!");*/}

			for (WebElement objWebEleOneMatchingCityName : redBus_lst_labl_HomePage_MatchingCityName){
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
		
		return bredBus_ThisElementValidationStatus;
	}
	
	public boolean redBus_Validate_HomePageGUIElements_for_ArriveCityNames(String[] strArrArriveCities){

		boolean bredBus_ThisElementValidationStatus 		= true;
		int nredBus_MaxCityCountCheck 						= 0;
		for (String strOneArriveCity: strArrArriveCities){
			if (nredBus_MaxCityCountCheck++ > 2) break;
			
			boolean bOneArriveCityNameFound = false;
			redBus_txtbox_HomePage_BusArriveToCity.clear();
			redBus_txtbox_HomePage_BusArriveToCity.sendKeys(strOneArriveCity);
			
			try{objWaitShort.until(ExpectedConditions.visibilityOf(redBus_somejunkelement));
			}catch (Exception e){/*System.out.println("DEBUG:    This exception to be ignored!");*/}

			for (WebElement objWebEleOneMatchingCityName : redBus_lst_labl_HomePage_MatchingCityName){
				if (objWebEleOneMatchingCityName.getText().trim().contains(strOneArriveCity.trim()) ){
					bOneArriveCityNameFound = true; break;}
			}
			if (bOneArriveCityNameFound){
				System.out.println("RESULT::PASS");
				System.out.println("DEBUG:    Following arrive city name is found: " + strOneArriveCity);}
			else{
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following arrive city name is NOT found: " + strOneArriveCity);}
		}
		
		return bredBus_ThisElementValidationStatus;
	}
	
	public boolean redBus_Validate_HomePageGUIElements_for_OnwardJourneyDateSelection(String strExpectedGUIOptionsValue){

		boolean bredBus_ThisElementValidationStatus = true;
		redBus_drpdown_HomePage_DepartCalender.click();

		String[]  strArrOnwardjourneyDateElements = ClsGeneralInitTerminateAndOtherUtil.splitThisString(strExpectedGUIOptionsValue," __ ");
		
		for (String strOnwardjourneyDateElement : strArrOnwardjourneyDateElements){
			boolean bredBus_LocalElementValidationStatus = false;

			switch (strOnwardjourneyDateElement){
				case "Check__current_date_month_year":
					if(     redBus_lst_labl_HomePage_DepartArrive_Calender_MonthnYear.get(2).isDisplayed() &&
							redBus_lst_labl_HomePage_DepartArrive_Calender_CurrentDay.get(1).isDisplayed()
					   ){
						System.out.println("DEBUG:    Current selected date is:  " + redBus_lst_labl_HomePage_DepartArrive_Calender_CurrentDay.get(1).getText());
						System.out.println("DEBUG:    Current selected month is: " + redBus_lst_labl_HomePage_DepartArrive_Calender_MonthnYear.get(2).getText().split("")[0]);
						System.out.println("DEBUG:    Current selected year is:  " + redBus_lst_labl_HomePage_DepartArrive_Calender_MonthnYear.get(3).getText().split("")[1]);
						bredBus_LocalElementValidationStatus = true;}
					break;
				case "Check__two_months_drop_down_at_a_time":
					if(     redBus_lst_labl_HomePage_DepartArrive_Calender_MonthnYear.get(2).isDisplayed() &&
							redBus_lst_labl_HomePage_DepartArrive_Calender_MonthnYear.get(3).isDisplayed()
					   ){
						bredBus_LocalElementValidationStatus = true;
						System.out.println("DEBUG:    Current month:  " + redBus_lst_labl_HomePage_DepartArrive_Calender_MonthnYear.get(2).getText().split(" ")[0]);
						System.out.println("DEBUG:    Current year:   " + redBus_lst_labl_HomePage_DepartArrive_Calender_MonthnYear.get(2).getText().split(" ")[1]);
						System.out.println("DEBUG:    Next month:     " + redBus_lst_labl_HomePage_DepartArrive_Calender_MonthnYear.get(3).getText().split(" ")[0]);
						System.out.println("DEBUG:    Next year:      " + redBus_lst_labl_HomePage_DepartArrive_Calender_MonthnYear.get(3).getText().split(" ")[1]);}
					break;
				default:
					break;
			}
			if(bredBus_LocalElementValidationStatus){
				System.out.println("RESULT::PASS");
				System.out.println("DEBUG:    Following onward journey date element option is found: " + strOnwardjourneyDateElement);}
			else{
				bredBus_ThisElementValidationStatus = false;
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following onward journey date element option is NOT found: " + strOnwardjourneyDateElement);
				objSoftAssert.fail("ERROR:    Following onward journey date element option is NOT found: " + strOnwardjourneyDateElement);}
		}
		
		return bredBus_ThisElementValidationStatus;
	}
		
	public boolean redBus_Validate_HomePageGUIElements_for_ReturnJourneyDateDropDown(String strExpectedGUIOptionsValue){
		
		boolean bredBus_ThisElementValidationStatus = true;
		redBus_drpdown_HomePage_ArriveCalender.click();

		String[]  strArrReturnjourneyDateElements = ClsGeneralInitTerminateAndOtherUtil.splitThisString(strExpectedGUIOptionsValue," __ ");
		
		for (String strReturnjourneyDateElement : strArrReturnjourneyDateElements){
			boolean bredBus_LocalElementValidationStatus = false;

			switch (strReturnjourneyDateElement){
				case "Check__two_months_drop_down_at_a_time":
					if(     redBus_lst_labl_HomePage_DepartArrive_Calender_MonthnYear.get(2).isDisplayed() &&
							redBus_lst_labl_HomePage_DepartArrive_Calender_MonthnYear.get(3).isDisplayed()
					   ){
						bredBus_LocalElementValidationStatus = true;
						System.out.println("DEBUG:    Current month:  " + redBus_lst_labl_HomePage_DepartArrive_Calender_MonthnYear.get(2).getText().split(" ")[0]);
						System.out.println("DEBUG:    Current year:   " + redBus_lst_labl_HomePage_DepartArrive_Calender_MonthnYear.get(2).getText().split(" ")[1]);
						System.out.println("DEBUG:    Next month:     " + redBus_lst_labl_HomePage_DepartArrive_Calender_MonthnYear.get(3).getText().split(" ")[0]);
						System.out.println("DEBUG:    Next year:      " + redBus_lst_labl_HomePage_DepartArrive_Calender_MonthnYear.get(3).getText().split(" ")[1]);}
					break;
				default:
					break;
			}
			if(bredBus_LocalElementValidationStatus){
				System.out.println("RESULT::PASS");
				System.out.println("DEBUG:    Following return journey date element option is found: " + strReturnjourneyDateElement);}
			else{
				bredBus_ThisElementValidationStatus = false;
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following return journey date element option is NOT found: " + strReturnjourneyDateElement);
				objSoftAssert.fail("ERROR:    Following return journey date element option is NOT found: " + strReturnjourneyDateElement);}
		}
		
		return bredBus_ThisElementValidationStatus;
	}
	
	public boolean redBus_Validate_HomePageGUIElements_for_InvalidCityNameErrorCheck(String strExpectedGUIOptionsValue){
	    
	    redBus_txtbox_HomePage_BusDepartFromCity.sendKeys("000000000");
	    redBus_txtbox_HomePage_BusArriveToCity.sendKeys("1111111");
	    redBus_drpdown_HomePage_DepartCalender.click();
	    redBus_lst_labl_HomePage_DepartArrive_Calender_CurrentDay.get(1).click();
	    redBus_btn_HomePage_SearchBuses.click();

		try{objWaitShort.until(ExpectedConditions.visibilityOf(redBus_lst_labl_MainPageErrors_InvalidCity.get(1)));
			System.out.println("RESULT::PASS");
			System.out.println("DEBUG:    For invalid city name following error is message shown: " + redBus_lst_labl_MainPageErrors_InvalidCity.get(0).getText());
		}catch (Exception e){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    For invalid city name test, please enter invalid city names");
		}
		
		return true;
	}
	
	public boolean redBus_Validate_Ticket_Booking_Search_Scenario_Combination(
			String strDepartCityType,String strArriveCityType, String strDateType, String strExpectedSearchResult,
			String[] strArrRandomDepaartAndArriveCityNames_Global){
		
		boolean bredBus_ThisElementValidationStatus = true;

		// enter depart city
		if (!strDepartCityType.contains("invalid")){
			redBus_txtbox_HomePage_BusDepartFromCity.sendKeys(strArrRandomDepaartAndArriveCityNames_Global[0] + Keys.TAB);
		}else{redBus_txtbox_HomePage_BusDepartFromCity.sendKeys("00000000000"+ Keys.TAB);}

		// enter arrive city
		if (!strArriveCityType.contains("invalid")){
			redBus_txtbox_HomePage_BusArriveToCity.sendKeys(strArrRandomDepaartAndArriveCityNames_Global[1] + Keys.TAB);
		}else{redBus_txtbox_HomePage_BusArriveToCity.sendKeys("1111111111" + Keys.TAB);}
		
		redBus_drpdown_HomePage_DepartCalender.click();
		// enter journey date
		if (strDateType.contains("next friday")){
			String strMonthOnNextFriday 		= redBus_getFormattedFullDatefor_NextFriday().split("/")[1];
			String strCurrentMonth_perredBus 	= redBus_lst_labl_HomePage_DepartArrive_Calender_MonthnYear.get(2).getText().split(" ")[0];
					if (strCurrentMonth_perredBus.contains(strMonthOnNextFriday)){
						// next friday occurs in current month
						String strDayToBeSelected 	= redBus_getFormattedFullDatefor_NextFriday().split("/")[0].trim();
						strDayToBeSelected 			= strDayToBeSelected.replaceFirst("^0+(?!$)", "");   //remove leading zeros per redBus calender format date
						List<WebElement> redBus_lst_labl_Dates = redBus_lst_labl_HomePage_DepartArrive_Calender_MonthTable_First
													.get(1)
													.findElements(By.cssSelector("td[class*='day']"));
						for (WebElement redBus_labl_SingleDate : redBus_lst_labl_Dates){
							if (redBus_labl_SingleDate.getText().trim().equals(strDayToBeSelected)){
								redBus_labl_SingleDate.click();
								break;}}}
					else{
						// next friday occurs in next month
						String strDayToBeSelected 	= redBus_getFormattedFullDatefor_NextFriday().split("/")[0].trim();
						strDayToBeSelected 			= strDayToBeSelected.replaceFirst("^0+(?!$)", "");   //remove leading zeros per redBus calender format date
						List<WebElement> redBus_lst_labl_Dates = redBus_lst_labl_HomePage_DepartArrive_Calender_MonthTable_Last
													.get(1)
													.findElements(By.cssSelector("td[class*='day']"));
						for (WebElement redBus_labl_SingleDate : redBus_lst_labl_Dates){
							if (redBus_labl_SingleDate.getText().trim().equals(strDayToBeSelected)){
								redBus_labl_SingleDate.click();
								break;}}}
		}else if (strDateType.contains("long date from today")){
			// navigate until the date is ery far from current date when the ticket bookings are not opened yet
			for (int nn=0; nn< 10; nn++){
				redBus_lst_labl_HomePage_DepartArrive_Calender_MontTable_NextArrow.get(3).click();
			}
			
		    redBus_lst_labl_HomePage_DepartArrive_Calender_MonthTable_First.get(1).findElements(By.cssSelector("td[class*='day']")).get(7).click();
		}else{ // else just select today's date or default highighted date
			redBus_lst_labl_HomePage_DepartArrive_Calender_CurrentDay.get(1).click();
		}
		
		// start searching
		redBus_btn_HomePage_SearchBuses.click();

		// validate expected result
		if (strExpectedSearchResult.contains("error_message__")){
			boolean bredBusLocalExceptionStatus = false;
			try{objWaitShort.until(ExpectedConditions.visibilityOf(redBus_lst_labl_MainPageErrors_InvalidCity.get(0)));
				System.out.println("RESULT::PASS");
				System.out.println("DEBUG:    For invalid input parameters following correct error is message shown: " + 
													redBus_lst_labl_MainPageErrors_InvalidCity.get(0).getText() + " " +
													redBus_lst_labl_MainPageErrors_InvalidCity.get(1).getText());
				return true;
			}catch (Exception e){bredBusLocalExceptionStatus = true;}
			
			try{objWaitShort.until(ExpectedConditions.visibilityOf(redBus_lst_labl_MainPageErrors_InvalidCity.get(1)));
				System.out.println("RESULT::PASS");
				System.out.println("DEBUG:    For invalid input parameters following correct error is message shown: " + 
													redBus_lst_labl_MainPageErrors_InvalidCity.get(0).getText() + " " +
													redBus_lst_labl_MainPageErrors_InvalidCity.get(1).getText());
				return true;
			}catch (Exception e){bredBusLocalExceptionStatus = true;}
			
			if(bredBusLocalExceptionStatus){
				bredBus_ThisElementValidationStatus = false;
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    For invalid input parameters NO valid error message is shown");				
			}
		}
		else if (strExpectedSearchResult.contains("error_message_long_date__")){
			try{objWaitShort.until(ExpectedConditions.visibilityOf(redBus_lst_labl_MainPageErrors_LongJourneyDate.get(0)));
				System.out.println("RESULT::PASS");
				System.out.println("DEBUG:    For far date input parameters following correct error is message shown: " + 
												redBus_lst_labl_MainPageErrors_LongJourneyDate.get(0).getText() + " " + 
												redBus_lst_labl_MainPageErrors_LongJourneyDate.get(1).getText());
			}catch (Exception e){
				bredBus_ThisElementValidationStatus = false;
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    For far date input parameters NO valid error message is shown");
			}
		}
		else{
			// search results are shown after long time so wait for more time
			try{objWait.until(ExpectedConditions.visibilityOfAllElements(redBus_lst_btn_ResultPage_ViewSeats));}catch (Exception e){}
			
			// sometimes 0th element is group of buses e.g. govt corporations so check for the last element
			try{objWait.until(ExpectedConditions.visibilityOf(redBus_lst_btn_ResultPage_ViewSeats.get(-1 + redBus_lst_btn_ResultPage_ViewSeats.size())));
				System.out.println("RESULT::PASS");
				System.out.println("DEBUG:    For valid input parameters following count of results are shown: " + redBus_lst_btn_ResultPage_ViewSeats.size());
			}catch (Exception e){
				bredBus_ThisElementValidationStatus = false;
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    For valid input parameters NO results found");
			}
		}
		
		return bredBus_ThisElementValidationStatus;
	}
	
	public boolean redBus_Perform_Simple_Valid_BusTicket_Search(String[] strArrRandomDepaartAndArriveCityNames){

		boolean bredBus_ThisElementValidationStatus 		= false;
		
		System.out.println("DEBUG:    Depart city:           " + strArrRandomDepaartAndArriveCityNames[0]);
		System.out.println("DEBUG:    Arrive city:           " + strArrRandomDepaartAndArriveCityNames[1]);		
		System.out.println("DEBUG:    Journey type:          " + "One Way");
		System.out.println("DEBUG:    Bus departure date:    " + redBus_getFormattedFullDatefor_NextFriday());
		System.out.println("DEBUG:    Bus arrive date:       " + "NA");
		
		// enter depart city
		redBus_txtbox_HomePage_BusDepartFromCity.sendKeys(strArrRandomDepaartAndArriveCityNames[0] + Keys.TAB);
		
		// enter arrive city
		redBus_txtbox_HomePage_BusArriveToCity.sendKeys(strArrRandomDepaartAndArriveCityNames[1] + Keys.TAB);
		// click on date selection dropdown and select intended date
		redBus_drpdown_HomePage_DepartCalender.click();		
		String strMonthOnNextFriday 		= redBus_getFormattedFullDatefor_NextFriday().split("/")[1];
		String strCurrentMonth_perredBus 	= redBus_lst_labl_HomePage_DepartArrive_Calender_MonthnYear.get(2).getText().split(" ")[0];
		if (strCurrentMonth_perredBus.contains(strMonthOnNextFriday)){
			// next friday occurs in current month
			String strDayToBeSelected 	= redBus_getFormattedFullDatefor_NextFriday().split("/")[0].trim();
			strDayToBeSelected 			= strDayToBeSelected.replaceFirst("^0+(?!$)", "");   //remove leading zeros per redBus calender format date
			List<WebElement> redBus_lst_labl_Dates = redBus_lst_labl_HomePage_DepartArrive_Calender_MonthTable_First
																	.get(1)
																	.findElements(By.cssSelector("td[class*='day']"));
			for (WebElement redBus_labl_SingleDate : redBus_lst_labl_Dates){
				if (redBus_labl_SingleDate.getText().trim().equals(strDayToBeSelected)){
					redBus_labl_SingleDate.click();
					break;}}
		}
		else{
			// next friday occurs in next month
			String strDayToBeSelected 	= redBus_getFormattedFullDatefor_NextFriday().split("/")[0].trim();
			strDayToBeSelected 			= strDayToBeSelected.replaceFirst("^0+(?!$)", "");   //remove leading zeros per redBus calender format date
			List<WebElement> redBus_lst_labl_Dates = redBus_lst_labl_HomePage_DepartArrive_Calender_MonthTable_Last
																	.get(1)
																	.findElements(By.cssSelector("td[class*='day']"));
			for (WebElement redBus_labl_SingleDate : redBus_lst_labl_Dates){
				if (redBus_labl_SingleDate.getText().trim().equals(strDayToBeSelected)){
					redBus_labl_SingleDate.click();	
					break;}}
		}

		// start searching
		redBus_btn_HomePage_SearchBuses.click();
		
		// search results are shown after more time so wait for more time
		try{objWait.until(ExpectedConditions.visibilityOfAllElements(redBus_lst_btn_ResultPage_ViewSeats));}catch (Exception e){}
		
		// sometimes 0th element is group of buses e.g. govt corporations so check for the last element
		try{objWait.until(ExpectedConditions.visibilityOf(redBus_lst_btn_ResultPage_ViewSeats
													.get(-1 + redBus_lst_btn_ResultPage_ViewSeats.size())));
			bredBus_ThisElementValidationStatus = true;
			System.out.println("RESULT::PASS");
			System.out.println("DEBUG:    For valid input parameters following count of results are shown: " + redBus_lst_btn_ResultPage_ViewSeats.size());
		}catch (Exception e){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    For valid input parameters NO results found");
		}
		
		return bredBus_ThisElementValidationStatus;
	}
	
	public boolean redBus_Perform_Simple_Valid_BusTicket_Search_Return(String[] strArrRandomDepaartAndArriveCityNames){

		boolean bredBus_ThisElementValidationStatus 		= false;

		System.out.println("DEBUG:    Depart city:           " + strArrRandomDepaartAndArriveCityNames[1]);
		System.out.println("DEBUG:    Arrive city:           " + strArrRandomDepaartAndArriveCityNames[0]);		
		System.out.println("DEBUG:    Journey type:          " + "Two Way");
		System.out.println("DEBUG:    Bus departure date:    " + redBus_getFormattedFullDatefor_NextFriday());
		System.out.println("DEBUG:    Bus arrive date:       " + redBus_getFormattedFullDatefor_NextSunday());

		// date selection
		String strMonthOnNextSunday 		= redBus_getFormattedFullDatefor_NextSunday().split("/")[1];
		String strCurrentMonth_perredBus 	= redBus_lst_labl_HomePage_DepartArrive_Calender_MonthnYear.get(2).getText().split(" ")[0];
		if (strCurrentMonth_perredBus.contains(strMonthOnNextSunday)){
			// next sunday occurs in current month
			String strDayToBeSelected 	= redBus_getFormattedFullDatefor_NextSunday().split("/")[0].trim();
			strDayToBeSelected 			= strDayToBeSelected.replaceFirst("^0+(?!$)", "");   //remove leading zeros per redBus calender format date
			List<WebElement> redBus_lst_labl_Dates = redBus_lst_labl_HomePage_DepartArrive_Calender_MonthTable_First
																	.get(3)
																	.findElements(By.cssSelector("td[class*='day']"));
			for (WebElement redBus_labl_SingleDate : redBus_lst_labl_Dates){
				if (redBus_labl_SingleDate.getText().trim().equals(strDayToBeSelected)){
					redBus_labl_SingleDate.click();
					break;}}
		}
		else{
			// next sunday occurs in next month
			String strDayToBeSelected 	= redBus_getFormattedFullDatefor_NextSunday().split("/")[0].trim();
			strDayToBeSelected 			= strDayToBeSelected.replaceFirst("^0+(?!$)", "");   //remove leading zeros per redBus calender format date
			List<WebElement> redBus_lst_labl_Dates = redBus_lst_labl_HomePage_DepartArrive_Calender_MonthTable_Last
																	.get(3)
																	.findElements(By.cssSelector("td[class*='day']"));
			for (WebElement redBus_labl_SingleDate : redBus_lst_labl_Dates){
				if (redBus_labl_SingleDate.getText().trim().equals(strDayToBeSelected)){
					redBus_labl_SingleDate.click();	
					break;}}
		}

		// wait for longer duration for confirmation
		try{objWait.until(ExpectedConditions.visibilityOfAllElements(redBus_lst_labl_ReturnBookingNotOpenedYet));}catch (Exception e){}
		try{
			objWait.until(ExpectedConditions.visibilityOfAllElements(redBus_lst_labl_ReturnBookingNotOpenedYet));
			if (redBus_lst_labl_ReturnBookingNotOpenedYet.size() > 0){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    For the return date  bookings are not yet opened");
				objSoftAssert.fail("ERROR:    For the return date  bookings are not yet opened");
				return false;
			}
		}
		catch (Exception e){}
		
		// search results are shown after more time so wait for more time
		try{objWait.until(ExpectedConditions.visibilityOfAllElements(redBus_lst_btn_ResultPage_ViewSeats));}catch (Exception e){}
		try{objWait.until(ExpectedConditions.visibilityOfAllElements(redBus_lst_btn_ResultPage_ViewSeats));}catch (Exception e){}
		// sometimes 0th element is group of buses e.g. govt corporations so check for the last element
		try{objWait.until(ExpectedConditions.visibilityOf(redBus_lst_btn_ResultPage_ViewSeats
													.get(-1 + redBus_lst_btn_ResultPage_ViewSeats.size())));
			bredBus_ThisElementValidationStatus = true;
			System.out.println("RESULT::PASS");
			System.out.println("DEBUG:    For valid input parameters following count of results are shown: " + redBus_lst_btn_ResultPage_ViewSeats.size());
		}catch (Exception e){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    For valid input parameters NO results found");
		}
		
		return bredBus_ThisElementValidationStatus;
	}
	
	public boolean redBus_Perform_Simple_Valid_BusTicket_Search_OnwardANDReturn_Part2(String[] strArrRandomDepaartAndArriveCityNames){

		boolean bredBus_ThisElementValidationStatus 		= false;

		System.out.println("DEBUG:    Depart city:           " + strArrRandomDepaartAndArriveCityNames[1]);
		System.out.println("DEBUG:    Arrive city:           " + strArrRandomDepaartAndArriveCityNames[0]);		
		System.out.println("DEBUG:    Journey type:          " + "Two Way");
		System.out.println("DEBUG:    Bus departure date:    " + redBus_getFormattedFullDatefor_NextFriday());
		System.out.println("DEBUG:    Bus arrive date:       " + redBus_getFormattedFullDatefor_NextSunday());

		// date selection
		String strMonthOnNextSunday 		= redBus_getFormattedFullDatefor_NextSunday().split("/")[1];
		String strCurrentMonth_perredBus 	= redBus_lst_labl_HomePage_DepartArrive_Calender_MonthnYear.get(4).getText().split(" ")[0];
		if (strCurrentMonth_perredBus.contains(strMonthOnNextSunday)){
			// next sunday occurs in current month
			String strDayToBeSelected 	= redBus_getFormattedFullDatefor_NextSunday().split("/")[0].trim();
			strDayToBeSelected 			= strDayToBeSelected.replaceFirst("^0+(?!$)", "");   //remove leading zeros per redBus calender format date
			List<WebElement> redBus_lst_labl_Dates = redBus_lst_labl_HomePage_DepartArrive_Calender_MonthTable_First
																	.get(2)
																	.findElements(By.cssSelector("td[class*='day']"));
			for (WebElement redBus_labl_SingleDate : redBus_lst_labl_Dates){
				if (redBus_labl_SingleDate.getText().trim().equals(strDayToBeSelected)){
					redBus_labl_SingleDate.click();
					break;}}
		}
		else{
			// next sunday occurs in next month
			String strDayToBeSelected 	= redBus_getFormattedFullDatefor_NextSunday().split("/")[0].trim();
			strDayToBeSelected 			= strDayToBeSelected.replaceFirst("^0+(?!$)", "");   //remove leading zeros per redBus calender format date
			List<WebElement> redBus_lst_labl_Dates = redBus_lst_labl_HomePage_DepartArrive_Calender_MonthTable_Last
																	.get(2)
																	.findElements(By.cssSelector("td[class*='day']"));
			for (WebElement redBus_labl_SingleDate : redBus_lst_labl_Dates){
				if (redBus_labl_SingleDate.getText().trim().equals(strDayToBeSelected)){
					redBus_labl_SingleDate.click();	
					break;}}
		}

		// wait for longer duration for confirmation
		try{objWait.until(ExpectedConditions.visibilityOfAllElements(redBus_lst_labl_ReturnBookingNotOpenedYet));}catch (Exception e){}
		try{
			objWait.until(ExpectedConditions.visibilityOfAllElements(redBus_lst_labl_ReturnBookingNotOpenedYet));
			if (redBus_lst_labl_ReturnBookingNotOpenedYet.size() > 0){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    For the return date  bookings are not yet opened");
				objSoftAssert.fail("ERROR:    For the return date  bookings are not yet opened");
				return false;
			}
		}
		catch (Exception e){}
		
		// search results are shown after more time so wait for more time
		try{objWait.until(ExpectedConditions.visibilityOfAllElements(redBus_lst_btn_ResultPage_ViewSeats));}catch (Exception e){}
//		try{objWait.until(ExpectedConditions.visibilityOfAllElements(redBus_lst_btn_ResultPage_ViewSeats));}catch (Exception e){}

		// sometimes 0th element is group of buses e.g. govt corporations so check for the last element
		try{objWait.until(ExpectedConditions.visibilityOf(this.objWebDriverAbstract.findElement(By.id("onwardTrip"))
													.findElement(By.cssSelector(".PrivateBuses"))
													.findElements(redBus_ByCssSelector_lst_btn_Result1SelectTravelsnSeatPage_ViewSeats)
//													.get(-1 + redBus_lst_btn_ResultPage_ViewSeats.size())));
													.get(0)));
			bredBus_ThisElementValidationStatus = true;
			System.out.println("RESULT::PASS");
			System.out.println("DEBUG:    For valid input parameters following count of results are shown: " + redBus_lst_btn_ResultPage_ViewSeats.size());
		}catch (Exception e){
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    For valid input parameters NO results found");
		}

		return bredBus_ThisElementValidationStatus;
	}
	
	public boolean redBus_Perform_SimpleActivity_and_NavigateToNextPage(String strNavigateToThisPage){

		boolean bredBus_ThisElementValidationStatus 		= false;
	      
		switch (strNavigateToThisPage){
			case "navigate_01":
				// Print/SMS ticket screen
				redBus_lnk_HomePage_PrintorSMS_Ticket.click();
				objWait.until(ExpectedConditions.visibilityOf(redBus_txtbox_PrintorSMSTicketPage_TicketNumber));
				bredBus_ThisElementValidationStatus = redBus_txtbox_PrintorSMSTicketPage_TicketNumber.isDisplayed();
				break;
			case "navigate_02":
				// EasyCancel/Refund screen
				redBus_lnk_HomePage_EasyCancelorRefund.click();
				objWait.until(ExpectedConditions.visibilityOf(redBus_txtbox_EasyCancelorRefundPage_TicketNumber));
				bredBus_ThisElementValidationStatus = redBus_txtbox_EasyCancelorRefundPage_TicketNumber.isDisplayed();
				break;
			case "navigate_03":
			case "navigate_04":
				// no activity
				break;
			case "navigate_05":
				// About us screen
				redBus_lnk_HomePage_AboutredBus.click();
				objWait.until(ExpectedConditions.visibilityOf(redBus_lnk_AboutredBusPage_OurStory));
				bredBus_ThisElementValidationStatus = redBus_lnk_AboutredBusPage_OurStory.isDisplayed();
				break;
			case "navigate_06":
				// redBus on Mobile screen
				redBus_lnk_HomePage_redBusOnMobile.click();
				objWait.until(ExpectedConditions.visibilityOf(redBus_txtbox_redBusOnMobilePage_EnterMobileNumber));
				bredBus_ThisElementValidationStatus = redBus_txtbox_redBusOnMobilePage_EnterMobileNumber.isDisplayed();
				break;
			case "navigate_07":
				// redBus on Mobile screen
				redBus_img_HomePage_TrackMyBus.click();
				objWait.until(ExpectedConditions.visibilityOf(redBus_img_TrackMyBusPage_TrackingLogo));
				bredBus_ThisElementValidationStatus = redBus_img_TrackMyBusPage_TrackingLogo.isDisplayed();
				break;
	    	default:
	    		break;
		}
	
		
		return bredBus_ThisElementValidationStatus;
	}
	
	public boolean redBus_Validate_SignUp_Link(){
		
		boolean bredBus_ThisElementValidationStatus 		= false;
		
		redBus_lnk_UserSection_SignUpSignIn.click();
		
        List<WebElement> iframeElements 	= objWebDriverAbstractGeneralUse.findElements(By.tagName("iframe"));
    	
    	for (WebElement oneEle: iframeElements){
    		objWebDriverAbstractGeneralUse.switchTo().frame(oneEle);
    		
			if (objWebDriverAbstractGeneralUse.findElements(By.cssSelector(".action-button.signup-screen.signup-btn")).size() > 0 ){
				objWebDriverAbstractGeneralUse.switchTo().defaultContent();
				objWebDriverAbstractGeneralUse.findElement(By.cssSelector(".modalCloseSmall")).click();
				bredBus_ThisElementValidationStatus = true;
		    	break;
			}
			objWebDriverAbstractGeneralUse.switchTo().defaultContent();
    	}
		
		if(bredBus_ThisElementValidationStatus){
			System.out.println("RESULT::PASS");
			System.out.println("DEBG:    Sign up link found");			
		}else{
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Sign up link not found");
			objSoftAssert.fail("ERROR:    Sign up link not found");
		}

		return bredBus_ThisElementValidationStatus;
	}
	
	public boolean redBus_Validate_SignIn_Link(){
		
		boolean bredBus_ThisElementValidationStatus 		= false;
		
		redBus_lnk_UserSection_SignUpSignIn.click();
		
        List<WebElement> iframeElements 	= objWebDriverAbstractGeneralUse.findElements(By.tagName("iframe"));
    	
    	for (WebElement oneEle: iframeElements){
    		objWebDriverAbstractGeneralUse.switchTo().frame(oneEle);
    		
			if (objWebDriverAbstractGeneralUse.findElements(By.linkText("SIGN IN")).size() > 0 ){
				objWebDriverAbstractGeneralUse.switchTo().defaultContent();
				objWebDriverAbstractGeneralUse.findElement(By.cssSelector(".modalCloseSmall")).click();
				bredBus_ThisElementValidationStatus = true;
		    	break;
			}
			objWebDriverAbstractGeneralUse.switchTo().defaultContent();
    	}
		
		if(bredBus_ThisElementValidationStatus){
			System.out.println("RESULT::PASS");
			System.out.println("DEBG:    Sign in link found");			
		}else{
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Sign in link not found");
			objSoftAssert.fail("ERROR:    Sign in link not found");
		}

		return bredBus_ThisElementValidationStatus;
	}
	
	public boolean redBus_Validate_SignUp(String strSignUp_Activity, JSONObject objJSON_redBusAdultPassangerDetails){
		
		boolean bredBus_ThisElementValidationStatus 		= true;
		
		redBus_lnk_UserSection_SignUpSignIn.click();
		String strSignUpErrorMessage = "";
		
        List<WebElement> iframeElements 	= objWebDriverAbstractGeneralUse.findElements(By.tagName("iframe"));
    	
    	for (WebElement oneEle: iframeElements){
    		objWebDriverAbstractGeneralUse.switchTo().frame(oneEle);
    		
			if (objWebDriverAbstractGeneralUse.findElements(By.cssSelector(".action-button.signup-screen.signup-btn")).size() > 0 ){
				objWebDriverAbstractGeneralUse.findElement(By.cssSelector(".action-button.signup-screen.signup-btn")).click();
				
				objWaitShort.until(ExpectedConditions.visibilityOf(objWebDriverAbstractGeneralUse.findElement(By.cssSelector("#emailID"))));
				objWebDriverAbstractGeneralUse.findElement(By.cssSelector("#emailID"))
					.sendKeys(objJSON_redBusAdultPassangerDetails.get("Email").toString() + Keys.TAB);
				objWebDriverAbstractGeneralUse.findElements(By.cssSelector("#password")).get(1)
					.sendKeys(objJSON_redBusAdultPassangerDetails.get("Password").toString() + Keys.TAB);
				objWebDriverAbstractGeneralUse.findElement(By.cssSelector("#createAccountLink")).click();

				objWaitShort.until(ExpectedConditions.visibilityOf(objWebDriverAbstractGeneralUse.findElement(By.cssSelector("#mobileNo"))));
				objWebDriverAbstractGeneralUse.findElement(By.cssSelector("#mobileNo"))
					.sendKeys(objJSON_redBusAdultPassangerDetails.get("ContactPhone").toString());
				objWebDriverAbstractGeneralUse.findElement(By.cssSelector("#sendOTP")).click();

				try{objWaitShort.until(ExpectedConditions.visibilityOf(objWebDriverAbstractGeneralUse.findElement(By.cssSelector("#otp"))));				
					objWebDriverAbstractGeneralUse.findElement(By.cssSelector("#otp"))
						.sendKeys("123456");
					objWebDriverAbstractGeneralUse.findElement(By.cssSelector("#verifyUser")).click();
					// check for error message
					objWait.until(ExpectedConditions.visibilityOf(objWebDriverAbstractGeneralUse.findElement(By.cssSelector(".server-error.server-error-active.error"))));
	
					strSignUpErrorMessage = 
							objWebDriverAbstractGeneralUse.findElement(By.cssSelector(".server-error.server-error-active.error")).getText();
				}catch(Exception e1){
					// this mobile number already exists
					strSignUpErrorMessage = 
							objWebDriverAbstractGeneralUse.findElement(By.cssSelector(".server-error.server-error-active.error")).getText();
				}
				objWebDriverAbstractGeneralUse.switchTo().defaultContent();
				bredBus_ThisElementValidationStatus = true;
		    	break;
			}
			objWebDriverAbstractGeneralUse.switchTo().defaultContent();
    	}

		objWebDriverAbstractGeneralUse.findElement(By.cssSelector(".modalCloseSmall")).click();

		System.out.println("DEBUG:    This test will fail for invalid OTP");
		System.out.println("ERROR:    Error message shown is: " + strSignUpErrorMessage);
		objSoftAssert.fail("ERROR:    Error message shown is: " + strSignUpErrorMessage);

		return bredBus_ThisElementValidationStatus;
	}

	public boolean redBus_Validate_SignIn(JSONObject objJSON_redBusAdultPassangerDetails){
		
		System.out.println("DEBG:    This is not yet implemented. Coming soon.");		
		return false;
	}
	
	public boolean redBus_Validate_SignOut(){
		
		System.out.println("DEBG:    This is not yet implemented. Coming soon.");		
		return false;
	}

	public boolean redBus_Validate_EditProfile(JSONObject objJSON_redBusAdultPassangerDetails){
		
		System.out.println("DEBG:    This is not yet implemented. Coming soon.");		
		return false;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	// helper methods	
	public String redBus_Get_MainPage_Logo_URL(){
		return redBus_img_HomePageLogo.getAttribute("src");
	}
	
	public String redBus_getFormattedFullDatefor_NextFriday(){
		
		String[] strArr_Current_YearMonthDay = ClsGeneralInitTerminateAndOtherUtil.get_NextFriday_YearMonthDay_stringArray();
		
		// redBus.in date format is     dd/mmm/yyyy
		String strredBusFormattedDate_ddmmyy_Sting =
				strArr_Current_YearMonthDay[2] + "/" + 
				strArr_Current_YearMonthDay[1].substring(0, 3) + "/" +	// consider first 3 letters only
				strArr_Current_YearMonthDay[0];

		return strredBusFormattedDate_ddmmyy_Sting;
	}
	
	public String redBus_getFormattedFullDatefor_NextSunday(){
		
		String[] strArr_Current_YearMonthDay = ClsGeneralInitTerminateAndOtherUtil.get_NextSunday_YearMonthDay_stringArray();
		
		// redBus.in date format is     dd/mmm/yyyy
		String strredBusFormattedDate_ddmmyy_Sting =
				strArr_Current_YearMonthDay[2] + "/" + 
				strArr_Current_YearMonthDay[1].substring(0, 3) + "/" +	// consider first 3 letters only
				strArr_Current_YearMonthDay[0];

		return strredBusFormattedDate_ddmmyy_Sting;
	}
	
	
	
	
	
	
	
}
