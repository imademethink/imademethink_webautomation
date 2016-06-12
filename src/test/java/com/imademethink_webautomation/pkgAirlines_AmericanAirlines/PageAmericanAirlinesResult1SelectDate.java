package com.imademethink_webautomation.pkgAirlines_AmericanAirlines;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.imademethink_webautomation.pkg0GeneralPageFactory.Page0Abstract;

public class PageAmericanAirlinesResult1SelectDate extends Page0Abstract {

	private PageAmericanAirlinesResult2SelectFlight	objLocal_PageAmericanAirlinesResult2SelectFlight = null;
	//private PageAmericanAirlines99General   	objLocal_PageAmericanAirlinesResult99General   = null;

	public PageAmericanAirlinesResult1SelectDate(WebDriver driver) {
		super(driver);
		//System.out.println("DEBUG:    PageAmericanAirlinesResult1SelectDate constructor");
		PageFactory.initElements(driver, this);
		objLocal_PageAmericanAirlinesResult2SelectFlight= new PageAmericanAirlinesResult2SelectFlight(driver);
		//objLocal_PageAmericanAirlinesResult99General 	= new PageAmericanAirlines99General(driver);
	}

	// public elements so that other class can also access
	@FindBy(css=".step-current")
	public WebElement AmericanAirlines_Result1Page_CurrentStep;
	@FindBy(css=".textBold.nowrap")
	public List<WebElement> AmericanAirlines_lst_Result1Page_ErrorOccured;
	@FindBy(css="#WDSErrorContainer>h1")
	public List<WebElement> AmericanAirlines_lst_Result1Page_Error_Type2_Heading;
	@FindBy(css=".WDSErrorE")
	public WebElement AmericanAirlines_Result1Page_Error_Type2_Text;
	
	
	// private elements
	@FindBy(css=".fdct_inst>a")
	private WebElement AmericanAirlines_Result1Page_BaggageCharges;	
	@FindBy(css=".tableRecapWide>tbody>tr>td")
	private List<WebElement> AmericanAirlines_lst_Result1Page_ShortSummaryItems;
	@FindAll({
	    @FindBy(css=".fdct_bgrd"),
	    @FindBy(css=".fdct_bgrd_selectedDate"),
	    @FindBy(css=".fdct_bgrd_lowestPrice")
	})
	private List<WebElement> AmericanAirlines_lst_Result1Page_WeeklyFlightTable;
	@FindBy(css=".fdct_bgrd_selectedDate")
	private List<WebElement> AmericanAirlines_lst_Result1Page_CurrentlySelected;
	@FindBy(css=".tableFDCT>tbody>tr")
	private List<WebElement> AmericanAirlines_lst_Result1Page_WeeklyFlightTableRows;
	@FindBy(linkText="Start Over")
	private WebElement AmericanAirlines_lnk_Result1Page_StartOver;
	@FindBy(css="#btnSelect")
	private WebElement AmericanAirlines_lnk_Result1Page_Select;
			// this is just temporary element, it should ne private element only
	@FindBys({
	    @FindBy(className = "site-logo"),
	    @FindBy(xpath = "//*[@title='American Airlines - home page']")
    })
	private List<WebElement> AmericanAirlines_lst_btn_HomePage_Temp;
	@FindBy(css="#openModifySearchLink>a")
	private WebElement AmericanAirlines_btn_Result1Page_ModifyYourSearch;
	@FindBy(css="#btnModifyModif")
	private WebElement AmericanAirlines_btn_Result1Page_ModifyYourSearch_SearchAgain;
	@FindBy(css="#modifyTitle")
	private WebElement AmericanAirlines_labl_Result1Page_ModifyYourSearch_Header;
	@FindBy(css="#FIELD_INFANTS_NUMBER")
	private WebElement AmericanAirlines_drpdwn_Result1Page_Infants;
	@FindBy(css="#FIELD_CHD_NUMBER")
	private WebElement AmericanAirlines_drpdwn_Result1Page_Children;
	@FindBy(css="#DATE_RANGE_VALUE_1")
	private List<WebElement> AmericanAirlines_lst_Result1Page_FlightRangeFlexibility;
	
	
	
    // every page object has it's local private wait with fixed 10 sec delay
    private WebDriverWait objWait = new WebDriverWait(this.objWebDriverAbstract, 10);   
    

	public boolean AmericanAirlines_Validate_BasicSearchInformation(String strSearchResultInformationIemsToCheck){
		
		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;
		boolean bSpportedElementFound								= false;
		strSearchResultInformationIemsToCheck 						= strSearchResultInformationIemsToCheck.replace("General_options__ ", ""); 
	    
		if (strSearchResultInformationIemsToCheck.contains("labl__Short Summary") || strSearchResultInformationIemsToCheck.contains("btn__Modify Your Search")){
			bSpportedElementFound = true;
			if (!  (AmericanAirlines_lst_Result1Page_ShortSummaryItems.size() != 0)){
					System.out.println("RESULT::FAIL");
					System.out.println("ERROR:    Following element not found: " + "labl__Short Summary or btn__Modify Your Search");
					objSoftAssert.fail("ERROR:    Following element not found: " + "labl__Short Summary or btn__Modify Your Search");
					bAmericanAirlines_ThisElementValidationStatus = false;}
			else{
				System.out.println("DEBUG:    Short summary details");
				for (WebElement AmericanAirlines_OneElement : AmericanAirlines_lst_Result1Page_ShortSummaryItems){
					if (null != AmericanAirlines_OneElement){
						if ( AmericanAirlines_OneElement.isDisplayed() ){
							if (null != AmericanAirlines_OneElement.getText() ){
								System.out.println("DEBUG:     " + AmericanAirlines_OneElement.getText());} } } }
			}
		}
		if (strSearchResultInformationIemsToCheck.contains("lnk__baggage charges")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_Result1Page_BaggageCharges.isDisplayed()){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following element not found: " + "lnk__baggage charges");
				objSoftAssert.fail("ERROR:    Following element not found: " + "lnk__baggage charges");
				bAmericanAirlines_ThisElementValidationStatus = false;}
		}
		if (strSearchResultInformationIemsToCheck.contains("labl__Flight results table for seven days")){
			bSpportedElementFound = true;
			if (!  (AmericanAirlines_lst_Result1Page_WeeklyFlightTable.size() >0) ){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following element not found: " + "labl__Flight results table for seven days");
				objSoftAssert.fail("ERROR:    Following element not found: " + "labl__Flight results table for seven days");
				bAmericanAirlines_ThisElementValidationStatus = false;}
			else{
				System.out.println("DEBUG:    Flight Result table for a week");
				for (WebElement AmericanAirlines_OneElement : AmericanAirlines_lst_Result1Page_WeeklyFlightTable){
					if (null != AmericanAirlines_OneElement){
						if ( AmericanAirlines_OneElement.isDisplayed() ){
							if (null != AmericanAirlines_OneElement.getText() ){
								System.out.println("DEBUG:     " + AmericanAirlines_OneElement.getText().replace("\r", " ").replace("\n", " ") );} } } }
				System.out.println("DEBUG:    Currently selected flight details: " + 
						AmericanAirlines_lst_Result1Page_CurrentlySelected.get(0).getText().replace("\r", " ").replace("\n", " ") );
			}
		}
		if (strSearchResultInformationIemsToCheck.contains("radiobtn__Flight selection")){
			bSpportedElementFound = true;
			if (!  (AmericanAirlines_lst_Result1Page_WeeklyFlightTable.size() >0) ){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following element not found: " + "radiobtn__Flight selection");
				objSoftAssert.fail("ERROR:    Following element not found: " + "radiobtn__Flight selection");
				bAmericanAirlines_ThisElementValidationStatus = false;}
			else{
				for (WebElement AmericanAirlines_OneElement : AmericanAirlines_lst_Result1Page_WeeklyFlightTable){
					if (null != AmericanAirlines_OneElement){
						if ( AmericanAirlines_OneElement.isDisplayed() ){
							WebElement AmericanAirlines_InternalElement = AmericanAirlines_OneElement.findElement(By.cssSelector("span[style='visibility: visible; display: block;']"));
							if (AmericanAirlines_InternalElement.isDisplayed()) {
								AmericanAirlines_InternalElement.click();
								// send dummy keys and insert small delay between clicking on radio buttons 
								AmericanAirlines_InternalElement.sendKeys("" + Keys.ENTER + Keys.ENTER + Keys.ENTER + Keys.ENTER + Keys.ENTER);
			    } } } }
			}
		}
		if (strSearchResultInformationIemsToCheck.contains("lnk__Start Over")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_lnk_Result1Page_StartOver.isDisplayed() ){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following element not found: " + "lnk__Start Over");
				objSoftAssert.fail("ERROR:    Following element not found: " + "lnk__Start Over");
				bAmericanAirlines_ThisElementValidationStatus = false;}
		}
		if (strSearchResultInformationIemsToCheck.contains("btn__SELECT")){
			bSpportedElementFound = true;
			if (!  AmericanAirlines_lnk_Result1Page_Select.isDisplayed() ){
				System.out.println("RESULT::FAIL");
				System.out.println("ERROR:    Following element not found: " + "btn__SELECT");
				objSoftAssert.fail("ERROR:    Following element not found: " + "btn__SELECT");
				bAmericanAirlines_ThisElementValidationStatus = false;}
			else{
				// click on he select button
				AmericanAirlines_lnk_Result1Page_Select.click();
			}
		}

		
		

		if (!bSpportedElementFound){
			System.out.println("ERROR:    Atleast one unsupported element NOT found in Basic search information");
			objSoftAssert.fail("ERROR:    Atleast one unsupported element NOT found in Basic search information");
			return bSpportedElementFound;
		}
		if (bAmericanAirlines_ThisElementValidationStatus) System.out.println("RESULT::PASS");
		else{
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Atleast one supported element NOT found in Basic search information");
			objSoftAssert.fail("ERROR:    Atleast one supported element NOT found in Basic search information");
		}
		
		return bAmericanAirlines_ThisElementValidationStatus;
	}
	
	public boolean AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE1_CASE1(){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;
		
		System.out.println("DEBUG:    Booking ticket for default highlighted date with no passanger changes");
		AmericanAirlines_lnk_Result1Page_Select.click();
		objWait.until(ExpectedConditions.textToBePresentInElement(objLocal_PageAmericanAirlinesResult2SelectFlight.AmericanAirlines_Result2Page_CurrentStep, "2"));   

		if(objLocal_PageAmericanAirlinesResult2SelectFlight.AmericanAirlines_lst_Result2Page_Error_Type2_Heading.size() >0 ){
			String strErrorText = "";
			if (objLocal_PageAmericanAirlinesResult2SelectFlight.AmericanAirlines_Result2Page_Error_Type2_Text.isDisplayed()){
				strErrorText = objLocal_PageAmericanAirlinesResult2SelectFlight.AmericanAirlines_Result2Page_Error_Type2_Text.getText();
			}
			System.out.println("ERROR:    Error occured in search results for TYPE1_CASE1 - upto select flight page: " + strErrorText);
			objSoftAssert.fail("ERROR:    Error occured in search results for TYPE1_CASE1 - upto select flight page: " + strErrorText);
			bAmericanAirlines_ThisElementValidationStatus = false;
		}

		return bAmericanAirlines_ThisElementValidationStatus;
	}	
	
	public boolean AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE1_CASE2(){

		//   Modify search and book return ticket and select first search result and cancel the same
		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;
	
		// short summary details
		System.out.println("DEBUG:    Short summary details");
		for (WebElement AmericanAirlines_OneElement : AmericanAirlines_lst_Result1Page_ShortSummaryItems){
			if (null != AmericanAirlines_OneElement){
				if ( AmericanAirlines_OneElement.isDisplayed() ){
					if (null != AmericanAirlines_OneElement.getText() ){
						System.out.println("DEBUG:     " + AmericanAirlines_OneElement.getText());} } } }		
		System.out.println("DEBUG:    Currently selected flight details: \n" + 
				"DEBUG:    " + AmericanAirlines_lst_Result1Page_CurrentlySelected.get(0).getText().replace("\r", " ").replace("\n", " ") + "\n" + 
				"DEBUG:    " + AmericanAirlines_lst_Result1Page_CurrentlySelected.get(1).getText().replace("\r", " ").replace("\n", " ") );

		
		// select first result for departing flight
		System.out.println("DEBUG:    Selecting the first result from departing option");
		AmericanAirlines_lst_Result1Page_WeeklyFlightTableRows.get(1).findElement(By.cssSelector("span[style='visibility: visible; display: block;']")).click();
		try{
			objWait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div[class='loadingDialogContainer']")) );
		}catch (Exception e){System.out.println("DEBUG:    This exception to be ignored!");}
		
		
		// select first result for arriving flight
		System.out.println("DEBUG:    Selecting the first result from arriving option");
		AmericanAirlines_lst_Result1Page_WeeklyFlightTableRows.get(4).findElement(By.cssSelector("span[style='visibility: visible; display: block;']")).click();
		try{
			objWait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div[class='loadingDialogContainer']")) );
		}catch (Exception e){System.out.println("DEBUG:    This exception to be ignored!");}

		
		// cancelling everything by clicking on start over
		System.out.println("DEBUG:    Cancelling every thing and starting over");
		AmericanAirlines_lnk_Result1Page_StartOver.click();
		
		try{
			objWait.until(ExpectedConditions.visibilityOfAllElements(AmericanAirlines_lst_btn_HomePage_Temp));
		}catch(Exception e){
			System.out.println("ERROR:    Error occured in search results for TYPE1_CASE2 - unable to startover");
			objSoftAssert.fail("ERROR:    Error occured in search results for TYPE1_CASE2 - unable to startover");
			bAmericanAirlines_ThisElementValidationStatus = false;
		}

		return bAmericanAirlines_ThisElementValidationStatus;
	}
	
	public boolean AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE1_CASE3(){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;
		
		System.out.println("DEBUG:    Booking ticket for default highlighted date with no passanger changes");
		AmericanAirlines_lnk_Result1Page_Select.click();
		objWait.until(ExpectedConditions.textToBePresentInElement(objLocal_PageAmericanAirlinesResult2SelectFlight.AmericanAirlines_Result2Page_CurrentStep, "2"));   

		if(objLocal_PageAmericanAirlinesResult2SelectFlight.AmericanAirlines_lst_Result2Page_Error_Type2_Heading.size() >0 ){
			String strErrorText = "";
			if (objLocal_PageAmericanAirlinesResult2SelectFlight.AmericanAirlines_Result2Page_Error_Type2_Text.isDisplayed()){
				strErrorText = objLocal_PageAmericanAirlinesResult2SelectFlight.AmericanAirlines_Result2Page_Error_Type2_Text.getText();
			}
			System.out.println("ERROR:    Error occured in search results for TYPE1_CASE3 - upto select flight page: " + strErrorText);
			objSoftAssert.fail("ERROR:    Error occured in search results for TYPE1_CASE3 - upto select flight page: " + strErrorText);
			bAmericanAirlines_ThisElementValidationStatus = false;
		}

		return bAmericanAirlines_ThisElementValidationStatus;
	}

	public boolean AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE1_CASE4(){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;
		
		// short summary details
		System.out.println("DEBUG:    Short summary details");
		for (WebElement AmericanAirlines_OneElement : AmericanAirlines_lst_Result1Page_ShortSummaryItems){
			if (null != AmericanAirlines_OneElement){
				if ( AmericanAirlines_OneElement.isDisplayed() ){
					if (null != AmericanAirlines_OneElement.getText() ){
						System.out.println("DEBUG:     " + AmericanAirlines_OneElement.getText());} } } }		
		System.out.println("DEBUG:    Currently selected flight details: \n" + 
				"DEBUG:    " + AmericanAirlines_lst_Result1Page_CurrentlySelected.get(0).getText().replace("\r", " ").replace("\n", " ") );

		// select next day result for departing flight
		System.out.println("DEBUG:    Selecting next day result from departing option");
		
		// if min 2 days in first row
		if (1 != AmericanAirlines_lst_Result1Page_WeeklyFlightTableRows.get(1).findElements(By.cssSelector("span[style='visibility: visible; display: block;']")).size()){
			//  fdct_bgrd_selectedDate
			List<WebElement> AmericanAirlines_lst_Row1_Elements = AmericanAirlines_lst_Result1Page_WeeklyFlightTableRows.get(1).findElements(By.cssSelector("td[class*='fdct_bgrd']"));
			boolean AmericanAirlines_boolean_local 				= false;
			for (WebElement AmericanAirlines_OneElement : AmericanAirlines_lst_Row1_Elements){
				if (AmericanAirlines_boolean_local){
					if (! AmericanAirlines_OneElement.getAttribute("style").contains("visibility: hidden; display: none;")){
						AmericanAirlines_OneElement.click();
						break;}}
				if (AmericanAirlines_OneElement.getAttribute("class").contains("fdct_bgrd_selectedDate") ){
					AmericanAirlines_boolean_local = true;}
			}
		}else{  // if only 1 day in current row then go to next row and click on first option
			AmericanAirlines_lst_Result1Page_WeeklyFlightTableRows.get(2).findElement(By.cssSelector("span[style='visibility: visible; display: block;']")).click();
		}
		
		
		try{
			objWait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div[class='loadingDialogContainer']")) );
		}catch (Exception e){System.out.println("DEBUG:    This exception to be ignored!");}
	
		AmericanAirlines_lnk_Result1Page_Select.click();
		objWait.until(ExpectedConditions.textToBePresentInElement(objLocal_PageAmericanAirlinesResult2SelectFlight.AmericanAirlines_Result2Page_CurrentStep, "2"));   
		
		if(objLocal_PageAmericanAirlinesResult2SelectFlight.AmericanAirlines_lst_Result2Page_Error_Type2_Heading.size() >0 ){
			String strErrorText = "";
			if (objLocal_PageAmericanAirlinesResult2SelectFlight.AmericanAirlines_Result2Page_Error_Type2_Text.isDisplayed()){
				strErrorText = objLocal_PageAmericanAirlinesResult2SelectFlight.AmericanAirlines_Result2Page_Error_Type2_Text.getText();
			}
			System.out.println("ERROR:    Error occured in search results for TYPE1_CASE4 - upto select flight page: " + strErrorText);
			objSoftAssert.fail("ERROR:    Error occured in search results for TYPE1_CASE4 - upto select flight page: " + strErrorText);
			bAmericanAirlines_ThisElementValidationStatus = false;
		}

		return bAmericanAirlines_ThisElementValidationStatus;
	}

	public boolean AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE1_CASE5(){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;
		
		System.out.println("DEBUG:    Booking ticket for default highlighted date with no passanger changes");
		AmericanAirlines_lnk_Result1Page_Select.click();
		objWait.until(ExpectedConditions.textToBePresentInElement(objLocal_PageAmericanAirlinesResult2SelectFlight.AmericanAirlines_Result2Page_CurrentStep, "2"));   

		if(objLocal_PageAmericanAirlinesResult2SelectFlight.AmericanAirlines_lst_Result2Page_Error_Type2_Heading.size() >0 ){
			String strErrorText = "";
			if (objLocal_PageAmericanAirlinesResult2SelectFlight.AmericanAirlines_Result2Page_Error_Type2_Text.isDisplayed()){
				strErrorText = objLocal_PageAmericanAirlinesResult2SelectFlight.AmericanAirlines_Result2Page_Error_Type2_Text.getText();
			}
			System.out.println("ERROR:    Error occured in search results for TYPE1_CASE5 - upto select flight page: " + strErrorText);
			objSoftAssert.fail("ERROR:    Error occured in search results for TYPE1_CASE5 - upto select flight page: " + strErrorText);
			bAmericanAirlines_ThisElementValidationStatus = false;
		}

		return bAmericanAirlines_ThisElementValidationStatus;
	}
	
	public boolean AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE3_CASE1(){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;
		
		System.out.println("DEBUG:    Booking ticket for default highlighted date with no passanger changes");
		AmericanAirlines_lnk_Result1Page_Select.click();
		objWait.until(ExpectedConditions.textToBePresentInElement(objLocal_PageAmericanAirlinesResult2SelectFlight.AmericanAirlines_Result2Page_CurrentStep, "2"));   

		if(objLocal_PageAmericanAirlinesResult2SelectFlight.AmericanAirlines_lst_Result2Page_Error_Type2_Heading.size() >0 ){
			String strErrorText = "";
			if (objLocal_PageAmericanAirlinesResult2SelectFlight.AmericanAirlines_Result2Page_Error_Type2_Text.isDisplayed()){
				strErrorText = objLocal_PageAmericanAirlinesResult2SelectFlight.AmericanAirlines_Result2Page_Error_Type2_Text.getText();
			}
			System.out.println("ERROR:    Error occured in search results for TYPE3_CASE1 - upto select flight page: " + strErrorText);
			objSoftAssert.fail("ERROR:    Error occured in search results for TYPE3_CASE1 - upto select flight page: " + strErrorText);
			bAmericanAirlines_ThisElementValidationStatus = false;
		}

		return bAmericanAirlines_ThisElementValidationStatus;
	}	
	
	public boolean AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE3_CASE2(){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;
		
		System.out.println("DEBUG:    Booking ticket for default highlighted date with no passanger changes");
		AmericanAirlines_lnk_Result1Page_Select.click();
		objWait.until(ExpectedConditions.textToBePresentInElement(objLocal_PageAmericanAirlinesResult2SelectFlight.AmericanAirlines_Result2Page_CurrentStep, "2"));   

		if(objLocal_PageAmericanAirlinesResult2SelectFlight.AmericanAirlines_lst_Result2Page_Error_Type2_Heading.size() >0 ){
			String strErrorText = "";
			if (objLocal_PageAmericanAirlinesResult2SelectFlight.AmericanAirlines_Result2Page_Error_Type2_Text.isDisplayed()){
				strErrorText = objLocal_PageAmericanAirlinesResult2SelectFlight.AmericanAirlines_Result2Page_Error_Type2_Text.getText();
			}
			System.out.println("ERROR:    Error occured in search results for TYPE3_CASE2 - upto select flight page: " + strErrorText);
			objSoftAssert.fail("ERROR:    Error occured in search results for TYPE3_CASE2 - upto select flight page: " + strErrorText);
			bAmericanAirlines_ThisElementValidationStatus = false;
		}

		return bAmericanAirlines_ThisElementValidationStatus;
	}
	
	public boolean AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE3_CASE3(){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;
		
		System.out.println("DEBUG:    Booking ticket for default highlighted date with no passanger changes");
		AmericanAirlines_lnk_Result1Page_Select.click();
		objWait.until(ExpectedConditions.textToBePresentInElement(objLocal_PageAmericanAirlinesResult2SelectFlight.AmericanAirlines_Result2Page_CurrentStep, "2"));   

		if(objLocal_PageAmericanAirlinesResult2SelectFlight.AmericanAirlines_lst_Result2Page_Error_Type2_Heading.size() >0 ){
			String strErrorText = "";
			if (objLocal_PageAmericanAirlinesResult2SelectFlight.AmericanAirlines_Result2Page_Error_Type2_Text.isDisplayed()){
				strErrorText = objLocal_PageAmericanAirlinesResult2SelectFlight.AmericanAirlines_Result2Page_Error_Type2_Text.getText();
			}
			System.out.println("ERROR:    Error occured in search results for TYPE3_CASE3 - upto select flight page: " + strErrorText);
			objSoftAssert.fail("ERROR:    Error occured in search results for TYPE3_CASE3 - upto select flight page: " + strErrorText);
			bAmericanAirlines_ThisElementValidationStatus = false;
		}

		return bAmericanAirlines_ThisElementValidationStatus;
	}
	
	public boolean AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE3_CASE4(){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;
		
		System.out.println("DEBUG:    Booking ticket for default highlighted date with no passanger changes");
		AmericanAirlines_lnk_Result1Page_Select.click();
		objWait.until(ExpectedConditions.textToBePresentInElement(objLocal_PageAmericanAirlinesResult2SelectFlight.AmericanAirlines_Result2Page_CurrentStep, "2"));   

		if(objLocal_PageAmericanAirlinesResult2SelectFlight.AmericanAirlines_lst_Result2Page_Error_Type2_Heading.size() >0 ){
			String strErrorText = "";
			if (objLocal_PageAmericanAirlinesResult2SelectFlight.AmericanAirlines_Result2Page_Error_Type2_Text.isDisplayed()){
				strErrorText = objLocal_PageAmericanAirlinesResult2SelectFlight.AmericanAirlines_Result2Page_Error_Type2_Text.getText();
			}
			System.out.println("ERROR:    Error occured in search results for TYPE3_CASE4 - upto select flight page: " + strErrorText);
			objSoftAssert.fail("ERROR:    Error occured in search results for TYPE3_CASE4 - upto select flight page: " + strErrorText);
			bAmericanAirlines_ThisElementValidationStatus = false;
		}

		return bAmericanAirlines_ThisElementValidationStatus;
	}
	
	public boolean AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE3_CASE5(){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;
		
		System.out.println("DEBUG:    Booking ticket for default highlighted date with no passanger changes");
		AmericanAirlines_lnk_Result1Page_Select.click();
		objWait.until(ExpectedConditions.textToBePresentInElement(objLocal_PageAmericanAirlinesResult2SelectFlight.AmericanAirlines_Result2Page_CurrentStep, "2"));   

		if(objLocal_PageAmericanAirlinesResult2SelectFlight.AmericanAirlines_lst_Result2Page_Error_Type2_Heading.size() >0 ){
			String strErrorText = "";
			if (objLocal_PageAmericanAirlinesResult2SelectFlight.AmericanAirlines_Result2Page_Error_Type2_Text.isDisplayed()){
				strErrorText = objLocal_PageAmericanAirlinesResult2SelectFlight.AmericanAirlines_Result2Page_Error_Type2_Text.getText();
			}
			System.out.println("ERROR:    Error occured in search results for TYPE3_CASE5 - upto select flight page: " + strErrorText);
			objSoftAssert.fail("ERROR:    Error occured in search results for TYPE3_CASE5 - upto select flight page: " + strErrorText);
			bAmericanAirlines_ThisElementValidationStatus = false;
		}

		return bAmericanAirlines_ThisElementValidationStatus;
	}

	public boolean AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE4_CASE1(){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;
		Select AmericanAirlines_drpdwn_Infants = new Select(AmericanAirlines_drpdwn_Result1Page_Infants);
		
		System.out.println("DEBUG:    Modifying search results and adding two infants.");
		AmericanAirlines_btn_Result1Page_ModifyYourSearch.click();
		objWait.until(ExpectedConditions.textToBePresentInElement(AmericanAirlines_labl_Result1Page_ModifyYourSearch_Header, "Modify Your Search") );

		AmericanAirlines_drpdwn_Infants.selectByVisibleText("2");
		AmericanAirlines_btn_Result1Page_ModifyYourSearch_SearchAgain.click();
		
		System.out.println("DEBUG:    Handling the error message for wronng infant count");
		if(! (AmericanAirlines_lst_Result1Page_Error_Type2_Heading.get(0).isDisplayed() || AmericanAirlines_Result1Page_Error_Type2_Text.isDisplayed() ) ){
			System.out.println("ERROR:    No error message is shown for wrong infant person count selection");
			objSoftAssert.fail("ERROR:    No error message is shown for wrong infant person count selection");			
			return false;
		}

		AmericanAirlines_drpdwn_Infants.selectByVisibleText("1");
		AmericanAirlines_btn_Result1Page_ModifyYourSearch_SearchAgain.click();
		objWait.until(ExpectedConditions.visibilityOf(AmericanAirlines_btn_Result1Page_ModifyYourSearch));
		
		
		AmericanAirlines_lnk_Result1Page_Select.click();
		objWait.until(ExpectedConditions.textToBePresentInElement(objLocal_PageAmericanAirlinesResult2SelectFlight.AmericanAirlines_Result2Page_CurrentStep, "2"));   

		if(objLocal_PageAmericanAirlinesResult2SelectFlight.AmericanAirlines_lst_Result2Page_Error_Type2_Heading.size() >0 ){
			String strErrorText = "";
			if (objLocal_PageAmericanAirlinesResult2SelectFlight.AmericanAirlines_Result2Page_Error_Type2_Text.isDisplayed()){
				strErrorText = objLocal_PageAmericanAirlinesResult2SelectFlight.AmericanAirlines_Result2Page_Error_Type2_Text.getText();
			}
			System.out.println("ERROR:    Error occured in search results for TYPE4_CASE1 - upto select flight page: " + strErrorText);
			objSoftAssert.fail("ERROR:    Error occured in search results for TYPE4_CASE1 - upto select flight page: " + strErrorText);
			bAmericanAirlines_ThisElementValidationStatus = false;
		}

		return bAmericanAirlines_ThisElementValidationStatus;
	}
	
	public boolean AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE4_CASE2(){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;
		Select AmericanAirlines_drpdwn_Children 				= new Select(AmericanAirlines_drpdwn_Result1Page_Children);
		Select AmericanAirlines_drpdwn_FlightRangeFlexibility 	= new Select(AmericanAirlines_lst_Result1Page_FlightRangeFlexibility.get(0));

		System.out.println("DEBUG:    Modifying search and adding 1 child");
		AmericanAirlines_btn_Result1Page_ModifyYourSearch.click();
		objWait.until(ExpectedConditions.textToBePresentInElement(AmericanAirlines_labl_Result1Page_ModifyYourSearch_Header, "Modify Your Search") );

		AmericanAirlines_drpdwn_Children.selectByVisibleText("1");
		AmericanAirlines_drpdwn_FlightRangeFlexibility.selectByIndex(2);
		
		AmericanAirlines_btn_Result1Page_ModifyYourSearch_SearchAgain.click();
		objWait.until(ExpectedConditions.visibilityOf(AmericanAirlines_btn_Result1Page_ModifyYourSearch));
		
		AmericanAirlines_lnk_Result1Page_Select.click();
		objWait.until(ExpectedConditions.textToBePresentInElement(objLocal_PageAmericanAirlinesResult2SelectFlight.AmericanAirlines_Result2Page_CurrentStep, "2"));   

		if(objLocal_PageAmericanAirlinesResult2SelectFlight.AmericanAirlines_lst_Result2Page_Error_Type2_Heading.size() >0 ){
			String strErrorText = "";
			if (objLocal_PageAmericanAirlinesResult2SelectFlight.AmericanAirlines_Result2Page_Error_Type2_Text.isDisplayed()){
				strErrorText = objLocal_PageAmericanAirlinesResult2SelectFlight.AmericanAirlines_Result2Page_Error_Type2_Text.getText();
			}
			System.out.println("ERROR:    Error occured in search results for TYPE4_CASE2 - upto select flight page: " + strErrorText);
			objSoftAssert.fail("ERROR:    Error occured in search results for TYPE4_CASE2 - upto select flight page: " + strErrorText);
			bAmericanAirlines_ThisElementValidationStatus = false;
		}

		return bAmericanAirlines_ThisElementValidationStatus;
	}
	
	public boolean AmericanAirlines_Validate_EndToEnd_Search_Scenario__TYPE4_CASE3(){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;
		
		System.out.println("DEBUG:    Booking ticket for default highlighted date with no passanger changes");
		AmericanAirlines_lnk_Result1Page_Select.click();
		objWait.until(ExpectedConditions.textToBePresentInElement(objLocal_PageAmericanAirlinesResult2SelectFlight.AmericanAirlines_Result2Page_CurrentStep, "2"));   

		if(objLocal_PageAmericanAirlinesResult2SelectFlight.AmericanAirlines_lst_Result2Page_Error_Type2_Heading.size() >0 ){
			String strErrorText = "";
			if (objLocal_PageAmericanAirlinesResult2SelectFlight.AmericanAirlines_Result2Page_Error_Type2_Text.isDisplayed()){
				strErrorText = objLocal_PageAmericanAirlinesResult2SelectFlight.AmericanAirlines_Result2Page_Error_Type2_Text.getText();
			}
			System.out.println("ERROR:    Error occured in search results for TYPE4_CASE3 - upto select flight page: " + strErrorText);
			objSoftAssert.fail("ERROR:    Error occured in search results for TYPE4_CASE3 - upto select flight page: " + strErrorText);
			bAmericanAirlines_ThisElementValidationStatus = false;
		}

		return bAmericanAirlines_ThisElementValidationStatus;
	}
	
	public boolean AmericanAirlines_Validate_EndToEnd_Search_Scenario__Until_Payment_Section(){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;
		
		System.out.println("DEBUG:    Booking ticket for default highlighted date with no passanger changes");
		AmericanAirlines_lnk_Result1Page_Select.click();
		objWait.until(ExpectedConditions.textToBePresentInElement(objLocal_PageAmericanAirlinesResult2SelectFlight.AmericanAirlines_Result2Page_CurrentStep, "2"));   

		if(objLocal_PageAmericanAirlinesResult2SelectFlight.AmericanAirlines_lst_Result2Page_Error_Type2_Heading.size() >0 ){
			String strErrorText = "";
			if (objLocal_PageAmericanAirlinesResult2SelectFlight.AmericanAirlines_Result2Page_Error_Type2_Text.isDisplayed()){
				strErrorText = objLocal_PageAmericanAirlinesResult2SelectFlight.AmericanAirlines_Result2Page_Error_Type2_Text.getText();
			}
			System.out.println("ERROR:    Error occured in search results for until payment section scenario - upto select flight page: " + strErrorText);
			objSoftAssert.fail("ERROR:    Error occured in search results for until payment section scenario - upto select flight page: " + strErrorText);
			bAmericanAirlines_ThisElementValidationStatus = false;
		}

		return bAmericanAirlines_ThisElementValidationStatus;
	}

	public boolean AmericanAirlines_Perform_SimpleActivity_and_NavigateToNextPage(){

		boolean bAmericanAirlines_ThisElementValidationStatus 		= true;

		AmericanAirlines_lnk_Result1Page_Select.click();
		objWait.until(ExpectedConditions.textToBePresentInElement(objLocal_PageAmericanAirlinesResult2SelectFlight.AmericanAirlines_Result2Page_CurrentStep, "2"));   

		if(objLocal_PageAmericanAirlinesResult2SelectFlight.AmericanAirlines_lst_Result2Page_Error_Type2_Heading.size() >0 ){
			String strErrorText = "";
			if (objLocal_PageAmericanAirlinesResult2SelectFlight.AmericanAirlines_Result2Page_Error_Type2_Text.isDisplayed()){
				strErrorText = objLocal_PageAmericanAirlinesResult2SelectFlight.AmericanAirlines_Result2Page_Error_Type2_Text.getText();
			}
			System.out.println("ERROR:    Error occured in performing simple activity - upto select flight page: " + strErrorText);
			objSoftAssert.fail("ERROR:    Error occured in performing simple activity - upto select flight page: " + strErrorText);
			bAmericanAirlines_ThisElementValidationStatus = false;
		}

		return bAmericanAirlines_ThisElementValidationStatus;
	}	
	
	
	
	
	
	
	
}
