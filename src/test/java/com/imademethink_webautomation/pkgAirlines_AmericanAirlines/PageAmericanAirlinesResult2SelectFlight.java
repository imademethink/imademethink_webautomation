package com.imademethink_webautomation.pkgAirlines_AmericanAirlines;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.imademethink_webautomation.UtilGeneral.ClsGeneralInitTerminateAndOtherUtil;
import com.imademethink_webautomation.pkg0GeneralPageFactory.Page0Abstract;

public class PageAmericanAirlinesResult2SelectFlight extends Page0Abstract {

	//private PageAmericanAirlinesResult0InProgress 	objLocal_PageAmericanAirlinesResult0InProgress = null;
	//private PageAmericanAirlinesResult2SelectFlight	objLocal_PageAmericanAirlinesResult2SelectFlight = null;
	private PageAmericanAirlinesResult3Price		objLocal_PageAmericanAirlinesResult3Price = null;
	//private PageAmericanAirlines99General   	objLocal_PageAmericanAirlinesResult99vGeneral   = null;
	
	public PageAmericanAirlinesResult2SelectFlight(WebDriver driver) {
		super(driver);
		//System.out.println("DEBUG:    PageAmericanAirlinesResult2SelectFlight constructor");
		PageFactory.initElements(driver, this);
		//objLocal_PageAmericanAirlinesResult0InProgress  	= new PageAmericanAirlinesResult0InProgress(driver);
		//objLocal_PageAmericanAirlinesResult2SelectFlight	= new PageAmericanAirlinesResult2SelectFlight(driver);
		objLocal_PageAmericanAirlinesResult3Price			= new PageAmericanAirlinesResult3Price(driver);
		//objLocal_PageAmericanAirlinesResult99General 		= new PageAmericanAirlines99General(driver);
	}

	// public elements so that other class can also access
	@FindBy(css=".step-current")
	public WebElement AmericanAirlines_Result2Page_CurrentStep;
	@FindBy(css=".textBold.nowrap")
	public List<WebElement> AmericanAirlines_lst_Result2Page_ErrorOccured;
	@FindBy(css="#WDSErrorContainer>h1")
	public List<WebElement> AmericanAirlines_lst_Result2Page_Error_Type2_Heading;
	@FindBy(css=".WDSErrorE")
	public WebElement AmericanAirlines_Result2Page_Error_Type2_Text;

    
	// private elements
	@FindBy(css="#fpow_div2>a")
	private WebElement AmericanAirlines_lnk_Result2Page_SelectTheCheapest;
	@FindBy(css="#btnSelect")
	private WebElement AmericanAirlines_lnk_Result2Page_Select;

		// lowest quota
	@FindBy(css="#ffLink00")
	private List<WebElement> AmericanAirlines_lst_lnk_Result2Page_TicketType_ChangableAndRefundable_OR_Standard_OR_Choice;
	@FindBy(css="div[id*='YSTANYCN'][id*='enabled'][style='color: rgb(255, 255, 255); visibility: visible; display: block;']")	
	private List<WebElement> AmericanAirlines_lst_Result2Page_AvailableTicketTable_Choice;
	@FindBy(css="div[id*='YSTAN'][id*='enabled'][style='color: rgb(255, 255, 255); visibility: visible; display: block;']")	
	private List<WebElement> AmericanAirlines_lst_Result2Page_AvailableTicketTable_Standard;
	@FindBy(css="div[id*='YFLEX'][id*='enabled'][style='color: rgb(255, 255, 255); visibility: visible; display: block;']")	
	private List<WebElement> AmericanAirlines_lst_Result2Page_AvailableTicketTable_ChangableAndRefundable;
	
		// medium quota seats - Flexible or Changable & Refundable
	@FindBy(css="#ffLink01")
	private List<WebElement> AmericanAirlines_lst_lnk_Result2Page_TicketType_Flexible_OR_ChangableAndRefundable;
	@FindBy(css="div[id*='YFLEX'][id*='enabled'][style='color: rgb(255, 255, 255); visibility: visible; display: block;']")	
	private List<WebElement> AmericanAirlines_lst_Result2Page_AvailableTicketTable_Flexible_International__OR__ChangeablAndRefundable_Intrastate;
		// highest quota seat - InstantUpgrade or Business Standard
	@FindBy(css="#ffLink02")
	private List<WebElement> AmericanAirlines_lst_lnk_Result2Page_TicketType_InstantUpgradeORBusinessStandard;
	@FindBy(css="div[id*='YUPDOM'][id*='enabled'][style='color: rgb(255, 255, 255); visibility: visible; display: block;']")
	private List<WebElement> AmericanAirlines_lst_Result2Page_AvailableTicketTable_InstantUpgrade_International;
	@FindBy(css="div[id*='JSTAN'][id*='enabled'][style='color: rgb(255, 255, 255); visibility: visible; display: block;']")
	private List<WebElement> AmericanAirlines_lst_Result2Page_AvailableTicketTable_BusinessStandart_Intrastate;
	
	@FindBy(linkText="Start Over")
	private WebElement AmericanAirlines_lnk_Result1Page_StartOverTemp;
		// this is just temporary element, it should ne private element only
	@FindBys({
				@FindBy(className = "site-logo"),
				@FindBy(xpath = "//*[@title='American Airlines - home page']")
	})
	private List<WebElement> AmericanAirlines_lst_btn_HomePage_Temp;
	@FindBy(css="#sortingSelect")
    private WebElement AmericanAirlines_drpdwn_SortType;

	// error message
    @FindBy(css=".errorMessage")
    private List<WebElement> AmericanAirlines_lst_labl_MainPageErrors;
    
    
    // every page object has it's local private wait with fixed 10 sec delay
	private WebDriverWait objWait = new WebDriverWait(this.objWebDriverAbstract, 10);   
    
    
	public boolean AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE1_CASE1(){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;
		
		System.out.println("DEBUG:    Selecting the cheapest option");
		AmericanAirlines_lnk_Result2Page_SelectTheCheapest.click();
		// send dummy keys and insert small delay between clicking on radio buttons
		AmericanAirlines_lnk_Result2Page_SelectTheCheapest.sendKeys("" + Keys.ENTER + Keys.ENTER + Keys.ENTER);
		AmericanAirlines_lnk_Result2Page_Select.click();
		
		objWait.until(ExpectedConditions.textToBePresentInElement(objLocal_PageAmericanAirlinesResult3Price.AmericanAirlines_Result3Page_CurrentStep, "3"));   

		if(objLocal_PageAmericanAirlinesResult3Price.AmericanAirlines_lst_Result3Page_Error_Type2_Heading.size() >0 ){
			String strErrorText = "";
			if (objLocal_PageAmericanAirlinesResult3Price.AmericanAirlines_Result3Page_Error_Type2_Text.isDisplayed()){
				strErrorText = objLocal_PageAmericanAirlinesResult3Price.AmericanAirlines_Result3Page_Error_Type2_Text.getText();
			}
			System.out.println("ERROR:    Error occured in search results for TYPE1_CASE1 - upto select price page: " + strErrorText);
			objSoftAssert.fail("ERROR:    Error occured in search results for TYPE1_CASE1 - upto select price page: " + strErrorText);
			bAmericanAirlines_ThisElementValidationStatus = false;
		}

		return bAmericanAirlines_ThisElementValidationStatus;
	}

	public boolean AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE1_CASE3(){

		System.out.println("DEBUG:    Selecting the first ticket from highest quota type - instant upgrade or business standard");
		if (AmericanAirlines_lst_lnk_Result2Page_TicketType_InstantUpgradeORBusinessStandard.size() == 0){
			System.out.println("DEBUG:    No tickets found for either instant upgrade or business standard quota category");
			return false;
		}
		
		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;
		
		// select first highest quota either instant upgrade (international) or business standard (within america), selecting very first ticket
		if (AmericanAirlines_lst_lnk_Result2Page_TicketType_InstantUpgradeORBusinessStandard.get(0).getText().contains("Instant Upgrade")){
			 AmericanAirlines_lst_Result2Page_AvailableTicketTable_InstantUpgrade_International.get(0).findElement(By.cssSelector("input[id*='radio']")).click();
			 AmericanAirlines_lst_Result2Page_AvailableTicketTable_InstantUpgrade_International.get(0).findElement(By.cssSelector("input[id*='radio']")).sendKeys("" + Keys.ENTER + Keys.ENTER + Keys.ENTER + Keys.ENTER + Keys.ENTER + Keys.ENTER);
		} else
		if (AmericanAirlines_lst_lnk_Result2Page_TicketType_InstantUpgradeORBusinessStandard.get(0).getText().contains("Business Standard")){
			AmericanAirlines_lst_Result2Page_AvailableTicketTable_BusinessStandart_Intrastate.get(0).findElement(By.cssSelector("input[id*='radio']")).click();
			AmericanAirlines_lst_Result2Page_AvailableTicketTable_BusinessStandart_Intrastate.get(0).findElement(By.cssSelector("input[id*='radio']")).sendKeys("" + Keys.ENTER + Keys.ENTER + Keys.ENTER  + Keys.ENTER + Keys.ENTER + Keys.ENTER);   
		}
		
		
		// cancelling everything by clicking on start over
		System.out.println("DEBUG:    Cancelling every thing and starting over");
		AmericanAirlines_lnk_Result1Page_StartOverTemp.click();
		
		try{
			objWait.until(ExpectedConditions.visibilityOfAllElements(AmericanAirlines_lst_btn_HomePage_Temp));
		}catch(Exception e){
			System.out.println("ERROR:    Error occured in search results for TYPE1_CASE3 - unable to startover");
			objSoftAssert.fail("ERROR:    Error occured in search results for TYPE1_CASE3 - unable to startover");
			bAmericanAirlines_ThisElementValidationStatus = false;
		}

		return bAmericanAirlines_ThisElementValidationStatus;
	}

	public boolean AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE1_CASE4(){

		System.out.println("DEBUG:    Selecting the first ticket from highest quota type - instant upgrade or business standard");
		if (AmericanAirlines_lst_lnk_Result2Page_TicketType_InstantUpgradeORBusinessStandard.size() == 0){
			System.out.println("DEBUG:    No tickets found for either instant upgrade or business standard quota category");
			return false;
		}

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;

		// select first highest quota either instant upgrade (international) or business standard (within america), selecting very first ticket
		if (AmericanAirlines_lst_lnk_Result2Page_TicketType_InstantUpgradeORBusinessStandard.get(0).getText().contains("Instant Upgrade")){
			 AmericanAirlines_lst_Result2Page_AvailableTicketTable_InstantUpgrade_International.get(0).click();
			 AmericanAirlines_lst_Result2Page_AvailableTicketTable_InstantUpgrade_International.get(0).sendKeys("" + Keys.ENTER + Keys.ENTER + Keys.ENTER + Keys.ENTER + Keys.ENTER + Keys.ENTER);
		} else
		if (AmericanAirlines_lst_lnk_Result2Page_TicketType_InstantUpgradeORBusinessStandard.get(0).getText().contains("Business Standard")){
			AmericanAirlines_lst_Result2Page_AvailableTicketTable_BusinessStandart_Intrastate.get(0).click();
			AmericanAirlines_lst_Result2Page_AvailableTicketTable_BusinessStandart_Intrastate.get(0).sendKeys("" + Keys.ENTER + Keys.ENTER + Keys.ENTER  + Keys.ENTER + Keys.ENTER + Keys.ENTER);   
		}

		// cancelling everything by clicking on start over
		System.out.println("DEBUG:    Cancelling every thing and starting over");
		AmericanAirlines_lnk_Result1Page_StartOverTemp.click();
		
		try{
			objWait.until(ExpectedConditions.visibilityOfAllElements(AmericanAirlines_lst_btn_HomePage_Temp));
		}catch(Exception e){
			System.out.println("ERROR:    Error occured in search results for TYPE1_CASE4 - unable to startover");
			objSoftAssert.fail("ERROR:    Error occured in search results for TYPE1_CASE4 - unable to startover");
			bAmericanAirlines_ThisElementValidationStatus = false;
		}

		return bAmericanAirlines_ThisElementValidationStatus;
	}
	
	public boolean AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE1_CASE5(){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;

		System.out.println("DEBUG:    Selecting the first ticket with limited seats from highest quota type - instant upgrade or business standard");		
		if (AmericanAirlines_lst_lnk_Result2Page_TicketType_InstantUpgradeORBusinessStandard.size() == 0){
			System.out.println("DEBUG:    No tickets found for either instant upgrade or business standard quota category");
			return true;
		}
	
		// select first highest quota either instant upgrade (international) or business standard (within america), selecting very first ticket
		boolean bAmericanAirlines_LimitedSeatElementFound = false;
		
		if (AmericanAirlines_lst_lnk_Result2Page_TicketType_InstantUpgradeORBusinessStandard.get(0).getText().contains("Instant Upgrade")){
			
			for (int nLocal =0; nLocal < AmericanAirlines_lst_Result2Page_AvailableTicketTable_InstantUpgrade_International.size(); nLocal++ ){
				if(AmericanAirlines_lst_Result2Page_AvailableTicketTable_InstantUpgrade_International.get(nLocal).findElements(By.cssSelector("span[class*='seat']")).size() > 0){
					AmericanAirlines_lst_Result2Page_AvailableTicketTable_InstantUpgrade_International.get(nLocal).findElement(By.cssSelector("input[id*='radio']")).click();
					AmericanAirlines_lst_Result2Page_AvailableTicketTable_InstantUpgrade_International.get(nLocal).findElement(By.cssSelector("input[id*='radio']")).sendKeys("" + Keys.ENTER + Keys.ENTER + Keys.ENTER + Keys.ENTER + Keys.ENTER + Keys.ENTER);
					bAmericanAirlines_LimitedSeatElementFound = true;
					break;
				}}
		} else
		if (AmericanAirlines_lst_lnk_Result2Page_TicketType_InstantUpgradeORBusinessStandard.get(0).getText().contains("Business Standard")){
			
			for (int nLocal =0; nLocal < AmericanAirlines_lst_Result2Page_AvailableTicketTable_BusinessStandart_Intrastate.size(); nLocal++ ){
				if(AmericanAirlines_lst_Result2Page_AvailableTicketTable_BusinessStandart_Intrastate.get(nLocal).findElements(By.cssSelector("span[class*='seat']")).size() > 0){
					AmericanAirlines_lst_Result2Page_AvailableTicketTable_BusinessStandart_Intrastate.get(nLocal).findElement(By.cssSelector("input[id*='radio']")).click();
					AmericanAirlines_lst_Result2Page_AvailableTicketTable_BusinessStandart_Intrastate.get(nLocal).findElement(By.cssSelector("input[id*='radio']")).sendKeys("" + Keys.ENTER + Keys.ENTER + Keys.ENTER + Keys.ENTER + Keys.ENTER + Keys.ENTER);
					bAmericanAirlines_LimitedSeatElementFound = true;
					break;
				}}
		}

		if ( ! bAmericanAirlines_LimitedSeatElementFound){
			System.out.println("DEBUG:    No tickets found for either instant upgrade or business standard quota with type as limited seats"); return true;}
		
		// continuing to price screen
		System.out.println("DEBUG:    Continuing to price selection screen");
		AmericanAirlines_lnk_Result2Page_Select.click();

		objWait.until(ExpectedConditions.textToBePresentInElement(objLocal_PageAmericanAirlinesResult3Price.AmericanAirlines_Result3Page_CurrentStep, "3"));   

		if(objLocal_PageAmericanAirlinesResult3Price.AmericanAirlines_lst_Result3Page_Error_Type2_Heading.size() >0 ){
			String strErrorText = "";
			if (objLocal_PageAmericanAirlinesResult3Price.AmericanAirlines_Result3Page_Error_Type2_Text.isDisplayed()){
				strErrorText = objLocal_PageAmericanAirlinesResult3Price.AmericanAirlines_Result3Page_Error_Type2_Text.getText();
			}
			System.out.println("ERROR:    Error occured in search results for TYPE1_CASE5 - upto select price page: " + strErrorText);
			objSoftAssert.fail("ERROR:    Error occured in search results for TYPE1_CASE5 - upto select price page: " + strErrorText);
			bAmericanAirlines_ThisElementValidationStatus = false;
		}

		return bAmericanAirlines_ThisElementValidationStatus;
	}
	
	public boolean AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE3_CASE1(){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;
		
		System.out.println("DEBUG:    Selecting first ticket from medium quota");
		
//		type_third_01 Sort results by Departure time and book the first ticket from medium quota until payment section
		AmericanAirlines_Sort_Results_By("Departure time");
		String strCurrentTicketSearchMediumQuotaType = AmericanAirlines_lst_lnk_Result2Page_TicketType_Flexible_OR_ChangableAndRefundable.get(0).getText();

		if (! (strCurrentTicketSearchMediumQuotaType.contains("Changeable & Refundable") ||  
			   strCurrentTicketSearchMediumQuotaType.contains("Flexible") || 
			   strCurrentTicketSearchMediumQuotaType.contains("Business Standard") ) ) {
			System.out.println("ERROR:    This medium quota type is not supported: " + strCurrentTicketSearchMediumQuotaType);
			objSoftAssert.fail("ERROR:    This medium quota type is not supported: " + strCurrentTicketSearchMediumQuotaType);
			return false;
		}
		
		AmericanAirlines_lst_Result2Page_AvailableTicketTable_Flexible_International__OR__ChangeablAndRefundable_Intrastate.get(0).
				findElement(By.cssSelector("input[id*='radio']")).click();
		AmericanAirlines_lst_Result2Page_AvailableTicketTable_Flexible_International__OR__ChangeablAndRefundable_Intrastate.get(0).
				findElement(By.cssSelector("input[id*='radio']")).sendKeys("" + Keys.ENTER + Keys.ENTER + Keys.ENTER + Keys.ENTER + Keys.ENTER + Keys.ENTER); 
		
		AmericanAirlines_lnk_Result2Page_Select.click();
		
		objWait.until(ExpectedConditions.textToBePresentInElement(objLocal_PageAmericanAirlinesResult3Price.AmericanAirlines_Result3Page_CurrentStep, "3"));   

		if(objLocal_PageAmericanAirlinesResult3Price.AmericanAirlines_lst_Result3Page_Error_Type2_Heading.size() >0 ){
			String strErrorText = "";
			if (objLocal_PageAmericanAirlinesResult3Price.AmericanAirlines_Result3Page_Error_Type2_Text.isDisplayed()){
				strErrorText = objLocal_PageAmericanAirlinesResult3Price.AmericanAirlines_Result3Page_Error_Type2_Text.getText();
			}
			System.out.println("ERROR:    Error occured in search results for TYPE3_CASE1 - upto select price page: " + strErrorText);
			objSoftAssert.fail("ERROR:    Error occured in search results for TYPE3_CASE1 - upto select price page: " + strErrorText);
			bAmericanAirlines_ThisElementValidationStatus = false;
		}

		return bAmericanAirlines_ThisElementValidationStatus;
	}

	public boolean AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE3_CASE2(){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;
		
		AmericanAirlines_Sort_Results_By("Arrival time");

		System.out.println("DEBUG:    Selecting the cheapest option");
		AmericanAirlines_lnk_Result2Page_SelectTheCheapest.click();
		// send dummy keys and insert small delay between clicking on radio buttons
		AmericanAirlines_lnk_Result2Page_SelectTheCheapest.sendKeys("" + Keys.ENTER + Keys.ENTER + Keys.ENTER);
		AmericanAirlines_lnk_Result2Page_Select.click();
		
		objWait.until(ExpectedConditions.textToBePresentInElement(objLocal_PageAmericanAirlinesResult3Price.AmericanAirlines_Result3Page_CurrentStep, "3"));   

		if(objLocal_PageAmericanAirlinesResult3Price.AmericanAirlines_lst_Result3Page_Error_Type2_Heading.size() >0 ){
			String strErrorText = "";
			if (objLocal_PageAmericanAirlinesResult3Price.AmericanAirlines_Result3Page_Error_Type2_Text.isDisplayed()){
				strErrorText = objLocal_PageAmericanAirlinesResult3Price.AmericanAirlines_Result3Page_Error_Type2_Text.getText();
			}
			System.out.println("ERROR:    Error occured in search results for TYPE3_CASE2 - upto select price page: " + strErrorText);
			objSoftAssert.fail("ERROR:    Error occured in search results for TYPE3_CASE2 - upto select price page: " + strErrorText);
			bAmericanAirlines_ThisElementValidationStatus = false;
		}

		return bAmericanAirlines_ThisElementValidationStatus;
	}
	
	public boolean AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE3_CASE3(){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;
		
		AmericanAirlines_Sort_Results_By("Origin");

		System.out.println("DEBUG:    Selecting first ticket from lowest quota");
		
		String strCurrentTicketSearchLowestQuotaType = AmericanAirlines_lst_lnk_Result2Page_TicketType_ChangableAndRefundable_OR_Standard_OR_Choice.get(0).getText();

		if (strCurrentTicketSearchLowestQuotaType.contains("Choice")){
			AmericanAirlines_lst_lnk_Result2Page_TicketType_Flexible_OR_ChangableAndRefundable.get(0).
				findElement(By.cssSelector("input[id*='radio']")).click();
			AmericanAirlines_lst_lnk_Result2Page_TicketType_Flexible_OR_ChangableAndRefundable.get(0).
				findElement(By.cssSelector("input[id*='radio']")).sendKeys("" + Keys.ENTER + Keys.ENTER + Keys.ENTER + Keys.ENTER + Keys.ENTER + Keys.ENTER);
		}else if (strCurrentTicketSearchLowestQuotaType.contains("Standard")){
			AmericanAirlines_lst_lnk_Result2Page_TicketType_Flexible_OR_ChangableAndRefundable.get(0).
				findElement(By.cssSelector("input[id*='radio']")).click();
			AmericanAirlines_lst_lnk_Result2Page_TicketType_Flexible_OR_ChangableAndRefundable.get(0).
				findElement(By.cssSelector("input[id*='radio']")).sendKeys("" + Keys.ENTER + Keys.ENTER + Keys.ENTER + Keys.ENTER + Keys.ENTER + Keys.ENTER);
		}else if (strCurrentTicketSearchLowestQuotaType.contains("Changeable & Refundable")){
			AmericanAirlines_lst_Result2Page_AvailableTicketTable_Flexible_International__OR__ChangeablAndRefundable_Intrastate.get(0).
				findElement(By.cssSelector("input[id*='radio']")).click();
			AmericanAirlines_lst_Result2Page_AvailableTicketTable_Flexible_International__OR__ChangeablAndRefundable_Intrastate.get(0).
				findElement(By.cssSelector("input[id*='radio']")).sendKeys("" + Keys.ENTER + Keys.ENTER + Keys.ENTER + Keys.ENTER + Keys.ENTER + Keys.ENTER);
		}else{
			System.out.println("ERROR:    This medium quota type is not supported: " + strCurrentTicketSearchLowestQuotaType);
			objSoftAssert.fail("ERROR:    This medium quota type is not supported: " + strCurrentTicketSearchLowestQuotaType);
			return false;
		}
		
		// cancelling everything by clicking on start over
		System.out.println("DEBUG:    Cancelling every thing and starting over");
		AmericanAirlines_lnk_Result1Page_StartOverTemp.click();
		
		try{
			objWait.until(ExpectedConditions.visibilityOfAllElements(AmericanAirlines_lst_btn_HomePage_Temp));
		}catch(Exception e){
			System.out.println("ERROR:    Error occured in search results for TYPE3_CASE3 - unable to startover");
			objSoftAssert.fail("ERROR:    Error occured in search results for TYPE3_CASE3 - unable to startover");
			bAmericanAirlines_ThisElementValidationStatus = false;
		}

		return bAmericanAirlines_ThisElementValidationStatus;		
	}
	
	public boolean AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE3_CASE4(){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;
		
		AmericanAirlines_Sort_Results_By("Destination");

		System.out.println("DEBUG:    Selecting second ticket from lowest quota");
		
		String strCurrentTicketSearchLowestQuotaType = AmericanAirlines_lst_lnk_Result2Page_TicketType_ChangableAndRefundable_OR_Standard_OR_Choice.get(0).getText();

		if (strCurrentTicketSearchLowestQuotaType.contains("Choice")){
			if (AmericanAirlines_lst_lnk_Result2Page_TicketType_Flexible_OR_ChangableAndRefundable.size() <1 ){
				System.out.println("ERROR:    Total count of available tickets is under two for following category: " + "Choice");
				objSoftAssert.fail("ERROR:    Total count of available tickets is under two for following category: " + "Choice");
				return false;
			}
			AmericanAirlines_lst_lnk_Result2Page_TicketType_Flexible_OR_ChangableAndRefundable.get(1).
				findElement(By.cssSelector("input[id*='radio']")).click();
			AmericanAirlines_lst_lnk_Result2Page_TicketType_Flexible_OR_ChangableAndRefundable.get(1).
				findElement(By.cssSelector("input[id*='radio']")).sendKeys("" + Keys.ENTER + Keys.ENTER + Keys.ENTER + Keys.ENTER + Keys.ENTER + Keys.ENTER);
		}else if (strCurrentTicketSearchLowestQuotaType.contains("Standard")){
			if (AmericanAirlines_lst_lnk_Result2Page_TicketType_Flexible_OR_ChangableAndRefundable.size() <1 ){
				System.out.println("ERROR:    Total count of available tickets is under two for following category: " + "Standard");
				objSoftAssert.fail("ERROR:    Total count of available tickets is under two for following category: " + "Standard");
				return false;
			}
			AmericanAirlines_lst_lnk_Result2Page_TicketType_Flexible_OR_ChangableAndRefundable.get(1).
				findElement(By.cssSelector("input[id*='radio']")).click();
			AmericanAirlines_lst_lnk_Result2Page_TicketType_Flexible_OR_ChangableAndRefundable.get(1).
				findElement(By.cssSelector("input[id*='radio']")).sendKeys("" + Keys.ENTER + Keys.ENTER + Keys.ENTER + Keys.ENTER + Keys.ENTER + Keys.ENTER);
		}else if (strCurrentTicketSearchLowestQuotaType.contains("Changeable & Refundable")){
			if (AmericanAirlines_lst_Result2Page_AvailableTicketTable_Flexible_International__OR__ChangeablAndRefundable_Intrastate.size() <1 ){
				System.out.println("ERROR:    Total count of available tickets is under two for following category: " + "Changeable & Refundable");
				objSoftAssert.fail("ERROR:    Total count of available tickets is under two for following category: " + "Changeable & Refundable");
				return false;
			}
			AmericanAirlines_lst_Result2Page_AvailableTicketTable_Flexible_International__OR__ChangeablAndRefundable_Intrastate.get(1).
				findElement(By.cssSelector("input[id*='radio']")).click();
			AmericanAirlines_lst_Result2Page_AvailableTicketTable_Flexible_International__OR__ChangeablAndRefundable_Intrastate.get(1).
				findElement(By.cssSelector("input[id*='radio']")).sendKeys("" + Keys.ENTER + Keys.ENTER + Keys.ENTER + Keys.ENTER + Keys.ENTER + Keys.ENTER);
		}else{
			System.out.println("ERROR:    This medium quota type is not supported: " + strCurrentTicketSearchLowestQuotaType);
			objSoftAssert.fail("ERROR:    This medium quota type is not supported: " + strCurrentTicketSearchLowestQuotaType);
			return false;
		}
		
		AmericanAirlines_lnk_Result2Page_Select.click();
		
		objWait.until(ExpectedConditions.textToBePresentInElement(objLocal_PageAmericanAirlinesResult3Price.AmericanAirlines_Result3Page_CurrentStep, "3"));   

		if(objLocal_PageAmericanAirlinesResult3Price.AmericanAirlines_lst_Result3Page_Error_Type2_Heading.size() >0 ){
			String strErrorText = "";
			if (objLocal_PageAmericanAirlinesResult3Price.AmericanAirlines_Result3Page_Error_Type2_Text.isDisplayed()){
				strErrorText = objLocal_PageAmericanAirlinesResult3Price.AmericanAirlines_Result3Page_Error_Type2_Text.getText();
			}
			System.out.println("ERROR:    Error occured in search results for TYPE3_CASE4 - upto select price page: " + strErrorText);
			objSoftAssert.fail("ERROR:    Error occured in search results for TYPE3_CASE4 - upto select price page: " + strErrorText);
			bAmericanAirlines_ThisElementValidationStatus = false;
		}
		return bAmericanAirlines_ThisElementValidationStatus;		
	}
	
	public boolean AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE3_CASE5(){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= false;
		
		AmericanAirlines_Sort_Results_By("Duration");

		System.out.println("DEBUG:    Selecting last ticket from lowest quota");
		
		String strCurrentTicketSearchLowestQuotaType 			= AmericanAirlines_lst_lnk_Result2Page_TicketType_ChangableAndRefundable_OR_Standard_OR_Choice.
																						get(0).getText();
		boolean 	bAmericanAirlines_ClickableElementFound 	= true;
		WebElement 	AmericanAirlines_OneElementToClick			= null;

		if (strCurrentTicketSearchLowestQuotaType.contains("Choice")){
			for (int nLocal =0; nLocal < AmericanAirlines_lst_Result2Page_AvailableTicketTable_Choice.size(); nLocal++ ){
				if(AmericanAirlines_lst_Result2Page_AvailableTicketTable_Choice.get(nLocal).findElements(By.cssSelector("input[id*='radio']")).size() > 0){
					AmericanAirlines_OneElementToClick = AmericanAirlines_lst_Result2Page_AvailableTicketTable_Choice.get(nLocal).findElement(By.cssSelector("input[id*='radio']"));
					bAmericanAirlines_ThisElementValidationStatus = true;
				}
			}
		}else if (strCurrentTicketSearchLowestQuotaType.contains("Standard")){
			for (int nLocal =0; nLocal < AmericanAirlines_lst_Result2Page_AvailableTicketTable_Standard.size(); nLocal++ ){
				if(AmericanAirlines_lst_Result2Page_AvailableTicketTable_Standard.get(nLocal).findElements(By.cssSelector("input[id*='radio']")).size() > 0){
					AmericanAirlines_OneElementToClick = AmericanAirlines_lst_Result2Page_AvailableTicketTable_Standard.get(nLocal).findElement(By.cssSelector("input[id*='radio']"));
					bAmericanAirlines_ThisElementValidationStatus = true;
				}
			}
		}else if (strCurrentTicketSearchLowestQuotaType.contains("Changeable & Refundable")){
			for (int nLocal =0; nLocal < AmericanAirlines_lst_Result2Page_AvailableTicketTable_ChangableAndRefundable.size(); nLocal++ ){
				if(AmericanAirlines_lst_Result2Page_AvailableTicketTable_ChangableAndRefundable.get(nLocal).findElements(By.cssSelector("input[id*='radio']")).size() > 0){
					AmericanAirlines_OneElementToClick = AmericanAirlines_lst_Result2Page_AvailableTicketTable_ChangableAndRefundable.get(nLocal).findElement(By.cssSelector("input[id*='radio']"));
					bAmericanAirlines_ThisElementValidationStatus = true;
				}
			}
		}else{
			System.out.println("ERROR:    This medium quota type is not supported: " + strCurrentTicketSearchLowestQuotaType);
			objSoftAssert.fail("ERROR:    This medium quota type is not supported: " + strCurrentTicketSearchLowestQuotaType);
			return false;
		}

		if (! bAmericanAirlines_ClickableElementFound){
			System.out.println("DEBUG:    No tickets found in lowest category");
			return false;			
		}
		
		AmericanAirlines_OneElementToClick.click();
		AmericanAirlines_OneElementToClick.sendKeys("" + Keys.ENTER + Keys.ENTER + Keys.ENTER + Keys.ENTER + Keys.ENTER + Keys.ENTER);
				
		AmericanAirlines_lnk_Result2Page_Select.click();				
		objWait.until(ExpectedConditions.textToBePresentInElement(objLocal_PageAmericanAirlinesResult3Price.AmericanAirlines_Result3Page_CurrentStep, "3"));   

		if(objLocal_PageAmericanAirlinesResult3Price.AmericanAirlines_lst_Result3Page_Error_Type2_Heading.size() >0 ){
			String strErrorText = "";
			if (objLocal_PageAmericanAirlinesResult3Price.AmericanAirlines_Result3Page_Error_Type2_Text.isDisplayed()){
				strErrorText = objLocal_PageAmericanAirlinesResult3Price.AmericanAirlines_Result3Page_Error_Type2_Text.getText();
			}
			System.out.println("ERROR:    Error occured in search results for TYPE3_CASE5 - upto select price page: " + strErrorText);
			objSoftAssert.fail("ERROR:    Error occured in search results for TYPE3_CASE5 - upto select price page: " + strErrorText);
			bAmericanAirlines_ThisElementValidationStatus = false;
		}
		return bAmericanAirlines_ThisElementValidationStatus;		
	}
	
	public boolean AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE4_CASE1(){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;
		
		System.out.println("DEBUG:    Selecting the cheapest option");
		AmericanAirlines_lnk_Result2Page_SelectTheCheapest.click();
		// send dummy keys and insert small delay between clicking on radio buttons
		AmericanAirlines_lnk_Result2Page_SelectTheCheapest.sendKeys("" + Keys.ENTER + Keys.ENTER + Keys.ENTER);
		AmericanAirlines_lnk_Result2Page_Select.click();
		
		objWait.until(ExpectedConditions.textToBePresentInElement(objLocal_PageAmericanAirlinesResult3Price.AmericanAirlines_Result3Page_CurrentStep, "3"));   

		if(objLocal_PageAmericanAirlinesResult3Price.AmericanAirlines_lst_Result3Page_Error_Type2_Heading.size() >0 ){
			String strErrorText = "";
			if (objLocal_PageAmericanAirlinesResult3Price.AmericanAirlines_Result3Page_Error_Type2_Text.isDisplayed()){
				strErrorText = objLocal_PageAmericanAirlinesResult3Price.AmericanAirlines_Result3Page_Error_Type2_Text.getText();
			}
			System.out.println("ERROR:    Error occured in search results for TYPE4_CASE1 - upto select price page: " + strErrorText);
			objSoftAssert.fail("ERROR:    Error occured in search results for TYPE4_CASE1 - upto select price page: " + strErrorText);
			bAmericanAirlines_ThisElementValidationStatus = false;
		}

		return bAmericanAirlines_ThisElementValidationStatus;
	}
	
	public boolean AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE4_CASE2(){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= false;
		int nCntr 													= 0;
		String[]   strArrAmericanAirlinesTicketQuotaNames 			
					  = new String[1 + AmericanAirlines_lst_lnk_Result2Page_TicketType_ChangableAndRefundable_OR_Standard_OR_Choice.size()];
		
		for (nCntr =0; nCntr < AmericanAirlines_lst_lnk_Result2Page_TicketType_ChangableAndRefundable_OR_Standard_OR_Choice.size(); nCntr++ ){
			strArrAmericanAirlinesTicketQuotaNames[nCntr] = 
										AmericanAirlines_lst_lnk_Result2Page_TicketType_ChangableAndRefundable_OR_Standard_OR_Choice.get(nCntr).getText();
		}
		strArrAmericanAirlinesTicketQuotaNames[nCntr] = "Cheapest";

		System.out.println("DEBUG:    Selecting ticket from random quota");
		int nTicketQuotaTypeIndex 									= ClsGeneralInitTerminateAndOtherUtil.getPositiveRandomNumberBetweenRange
																			(0,strArrAmericanAirlinesTicketQuotaNames.length - 1);

		String strCurrentTicketSearchLowestQuotaType 				= strArrAmericanAirlinesTicketQuotaNames[nTicketQuotaTypeIndex];
		boolean 	bAmericanAirlines_ClickableElementFound 		= true;
		WebElement 	AmericanAirlines_OneElementToClick				= null;

		System.out.println("DEBUG:    Selecting random ticket from random quota: " + strCurrentTicketSearchLowestQuotaType);

		if (strCurrentTicketSearchLowestQuotaType.contains("Choice")){
			for (int nLocal =0; nLocal < AmericanAirlines_lst_Result2Page_AvailableTicketTable_Choice.size(); nLocal++ ){
				if(AmericanAirlines_lst_Result2Page_AvailableTicketTable_Choice.get(nLocal).findElements(By.cssSelector("input[id*='radio']")).size() > 0){
					AmericanAirlines_OneElementToClick = AmericanAirlines_lst_Result2Page_AvailableTicketTable_Choice.get(nLocal).findElement(By.cssSelector("input[id*='radio']"));
					bAmericanAirlines_ThisElementValidationStatus = true;
				}
			}
		}else if (strCurrentTicketSearchLowestQuotaType.contains("Standard")){
			for (int nLocal =0; nLocal < AmericanAirlines_lst_Result2Page_AvailableTicketTable_Standard.size(); nLocal++ ){
				if(AmericanAirlines_lst_Result2Page_AvailableTicketTable_Standard.get(nLocal).findElements(By.cssSelector("input[id*='radio']")).size() > 0){
					AmericanAirlines_OneElementToClick = AmericanAirlines_lst_Result2Page_AvailableTicketTable_Standard.get(nLocal).findElement(By.cssSelector("input[id*='radio']"));
					bAmericanAirlines_ThisElementValidationStatus = true;
				}
			}
		}else if (strCurrentTicketSearchLowestQuotaType.contains("Changeable & Refundable")){
			for (int nLocal =0; nLocal < AmericanAirlines_lst_Result2Page_AvailableTicketTable_ChangableAndRefundable.size(); nLocal++ ){
				if(AmericanAirlines_lst_Result2Page_AvailableTicketTable_ChangableAndRefundable.get(nLocal).findElements(By.cssSelector("input[id*='radio']")).size() > 0){
					AmericanAirlines_OneElementToClick = AmericanAirlines_lst_Result2Page_AvailableTicketTable_ChangableAndRefundable.get(nLocal).findElement(By.cssSelector("input[id*='radio']"));
					bAmericanAirlines_ThisElementValidationStatus = true;
				}
			}
		}else if (strCurrentTicketSearchLowestQuotaType.contains("Cheapest")){
			AmericanAirlines_OneElementToClick = AmericanAirlines_lnk_Result2Page_SelectTheCheapest;
			bAmericanAirlines_ThisElementValidationStatus = true;
		}

	
		if (! bAmericanAirlines_ClickableElementFound){
			System.out.println("DEBUG:    No tickets found in lowest category");
			return false;			
		}
		
		AmericanAirlines_OneElementToClick.click();
		AmericanAirlines_OneElementToClick.sendKeys("" + Keys.ENTER + Keys.ENTER + Keys.ENTER + Keys.ENTER + Keys.ENTER + Keys.ENTER);
				
		AmericanAirlines_lnk_Result2Page_Select.click();				
		objWait.until(ExpectedConditions.textToBePresentInElement(objLocal_PageAmericanAirlinesResult3Price.AmericanAirlines_Result3Page_CurrentStep, "3"));   

		if(objLocal_PageAmericanAirlinesResult3Price.AmericanAirlines_lst_Result3Page_Error_Type2_Heading.size() >0 ){
			String strErrorText = "";
			if (objLocal_PageAmericanAirlinesResult3Price.AmericanAirlines_Result3Page_Error_Type2_Text.isDisplayed()){
				strErrorText = objLocal_PageAmericanAirlinesResult3Price.AmericanAirlines_Result3Page_Error_Type2_Text.getText();
			}
			System.out.println("ERROR:    Error occured in search results for TYPE4_CASE2 - upto select price page: " + strErrorText);
			objSoftAssert.fail("ERROR:    Error occured in search results for TYPE4_CASE2 - upto select price page: " + strErrorText);
			bAmericanAirlines_ThisElementValidationStatus = false;
		}
		return bAmericanAirlines_ThisElementValidationStatus;
	}
	
	public boolean AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE4_CASE3(){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;
		WebDriverWait objWaitLocal 									= new WebDriverWait(this.objWebDriverAbstract, 60);   

		System.out.println("DEBUG:    Selecting the cheapest option");
		AmericanAirlines_lnk_Result2Page_SelectTheCheapest.click();
		// send dummy keys and insert small delay between clicking on radio buttons
		AmericanAirlines_lnk_Result2Page_SelectTheCheapest.sendKeys("" + Keys.ENTER + Keys.ENTER + Keys.ENTER);

		for (int nMinutes = 0; nMinutes < 20 ; nMinutes++){
				try{   		objWaitLocal.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#zzzzzzzzzzzzzzzzzzzzzzz")));
				}catch(		Exception e){}
				System.out.println("DEBUG:    Time elapsed: " + (nMinutes+1) + " minutes over");
		}

		AmericanAirlines_lnk_Result2Page_Select.click();
		try{   		objWait.until(ExpectedConditions.elementToBeClickable(AmericanAirlines_lnk_Result2Page_Select));
		}catch(		Exception e){}
		
		
		if(objLocal_PageAmericanAirlinesResult3Price.AmericanAirlines_lst_Result3Page_Error_Type2_Heading.size() >0 ){
			String strErrorText = "";
			if (objLocal_PageAmericanAirlinesResult3Price.AmericanAirlines_Result3Page_Error_Type2_Text.isDisplayed()){
				strErrorText = objLocal_PageAmericanAirlinesResult3Price.AmericanAirlines_Result3Page_Error_Type2_Text.getText();
			}
			System.out.println("ERROR:    Error occured in search results for TYPE4_CASE3 - upto select price page: " + strErrorText);
			objSoftAssert.fail("ERROR:    Error occured in search results for TYPE4_CASE3 - upto select price page: " + strErrorText);
			//bAmericanAirlines_ThisElementValidationStatus = false;
		}

		return bAmericanAirlines_ThisElementValidationStatus;
	}
	
	public boolean AmericanAirlines_Validate_EndToEnd_Search_Scenario__Until_Payment_Section(){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;
		
		System.out.println("DEBUG:    Selecting the cheapest option");
		AmericanAirlines_lnk_Result2Page_SelectTheCheapest.click();
		// send dummy keys and insert small delay between clicking on radio buttons
		AmericanAirlines_lnk_Result2Page_SelectTheCheapest.sendKeys("" + Keys.ENTER + Keys.ENTER + Keys.ENTER);
		AmericanAirlines_lnk_Result2Page_Select.click();
		
		objWait.until(ExpectedConditions.textToBePresentInElement(objLocal_PageAmericanAirlinesResult3Price.AmericanAirlines_Result3Page_CurrentStep, "3"));   

		if(objLocal_PageAmericanAirlinesResult3Price.AmericanAirlines_lst_Result3Page_Error_Type2_Heading.size() >0 ){
			String strErrorText = "";
			if (objLocal_PageAmericanAirlinesResult3Price.AmericanAirlines_Result3Page_Error_Type2_Text.isDisplayed()){
				strErrorText = objLocal_PageAmericanAirlinesResult3Price.AmericanAirlines_Result3Page_Error_Type2_Text.getText();
			}
			System.out.println("ERROR:    Error occured in search results for until payment section scenario - upto select price page: " + strErrorText);
			objSoftAssert.fail("ERROR:    Error occured in search results for until payment section scenario - upto select price page: " + strErrorText);
			bAmericanAirlines_ThisElementValidationStatus = false;
		}

		return bAmericanAirlines_ThisElementValidationStatus;
	}

	public boolean AmericanAirlines_Perform_SimpleActivity_and_NavigateToNextPage(){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;
		
		AmericanAirlines_lnk_Result2Page_SelectTheCheapest.click();
		// send dummy keys and insert small delay between clicking on radio buttons
		AmericanAirlines_lnk_Result2Page_SelectTheCheapest.sendKeys("" + Keys.ENTER + Keys.ENTER + Keys.ENTER);
		
		AmericanAirlines_lnk_Result2Page_Select.click();
		
		objWait.until(ExpectedConditions.textToBePresentInElement(objLocal_PageAmericanAirlinesResult3Price.AmericanAirlines_Result3Page_CurrentStep, "3"));   

		if(objLocal_PageAmericanAirlinesResult3Price.AmericanAirlines_lst_Result3Page_Error_Type2_Heading.size() >0 ){
			String strErrorText = "";
			if (objLocal_PageAmericanAirlinesResult3Price.AmericanAirlines_Result3Page_Error_Type2_Text.isDisplayed()){
				strErrorText = objLocal_PageAmericanAirlinesResult3Price.AmericanAirlines_Result3Page_Error_Type2_Text.getText();
			}
			System.out.println("ERROR:    Error occured in performing simple activity - upto select price page: " + strErrorText);
			objSoftAssert.fail("ERROR:    Error occured in performing simple activity - upto select price page: " + strErrorText);
			bAmericanAirlines_ThisElementValidationStatus = false;
		}

		return bAmericanAirlines_ThisElementValidationStatus;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// helper methods
	public void  AmericanAirlines_Sort_Results_By(String strSortBy){
		
		Select AmericanAirlines_drpdwn_Sort_SearchResults = new Select(AmericanAirlines_drpdwn_SortType);
		
		if(! Arrays.asList("Departure time","Arrival time","Origin","Destination","Number of stops","Duration").contains(strSortBy)){
	    	System.out.println("ERROR:    Sorting search results by following type is not supported: " + strSortBy);
			objSoftAssert.fail("ERROR:    Sorting search results by following type is not supported: " + strSortBy);
			return;
	    }else{
			AmericanAirlines_drpdwn_Sort_SearchResults.selectByVisibleText(strSortBy);
	    }
    	System.out.println("DEBUG:    Sorted search results by following type : " + AmericanAirlines_drpdwn_Sort_SearchResults.getFirstSelectedOption().getText());		
	}
	
	
}
