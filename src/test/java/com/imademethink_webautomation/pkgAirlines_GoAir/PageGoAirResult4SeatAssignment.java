package com.imademethink_webautomation.pkgAirlines_GoAir;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.imademethink_webautomation.pkg0GeneralPageFactory.Page0Abstract;

public class PageGoAirResult4SeatAssignment extends Page0Abstract{
	
	//private PageGoAirResult0InProgress 					objLocal_PageGoAirResult0InProgress = null;
	//private PageGoAirResult2SelectDate 					objLocal_PageGoAirResult2SelectDate = null;
	//private PageGoAirResult3ServicesAndPassengerDetail 	objLocal_PageGoAirResult3ServicesAndPassengerDetail = null;
	private PageGoAirResult5Payment 						objLocal_PageGoAirResult5Payment = null;
	//private PageGoAir99General 						objLocal_PageGoAirResult99General = null;

	public PageGoAirResult4SeatAssignment(WebDriver driver) {
		super(driver);
		//System.out.println("DEBUG:    PageGoAirResult4SeatAssignment constructor");
		PageFactory.initElements(driver, this);
		//objLocal_PageGoAirResult0InProgress					= new PageGoAirResult0InProgress(driver);
		//objLocal_PageGoAirResult2SelectDate					= new PageGoAirResult2SelectDate(driver);
		//objLocal_PageGoAirResult3ServicesAndPassengerDetail	= new PageGoAirResult3ServicesAndPassengerDetail(driver);
		objLocal_PageGoAirResult5Payment  					= new PageGoAirResult5Payment(driver);
		//objLocal_PageGoAirResult99General						= new PageGoAir99General(driver);
	}
	
	// public elements so that other class can also access
	@FindBy(css="div[class='step active']")
	public WebElement GoAir_Result4Page_CurrentStep;
	
	@FindBy(css=".flightSeatMap")
	private List<WebElement> GoAir_lst_lnk_Result4Page_flightSeatMap;
	@FindBy(css=".seatAvailable")
	private List<WebElement> GoAir_lst_btn_Result4Page_seatAvailable;
	@FindBy(css=".availablePrice0")
	private List<WebElement> GoAir_lst_btn_Result4Page_Rs200_availablePrice0;
	@FindBy(css=".availablePrice1")
	private List<WebElement> GoAir_lst_btn_Result4Page_Rs300_availablePrice1;
	@FindBy(css=".availablePrice2")
	private List<WebElement> GoAir_lst_btn_Result4Page_Rs600_availablePrice2;
	@FindBy(css=".preblocked")
	private List<WebElement> GoAir_lst_btn_Result4Page_preblocked;
	@FindBy(css=".unavailable")
	private List<WebElement> GoAir_lst_btn_Result4Page_unavailable;
	@FindBy(css="div[class*='selected'][class*='available']")
	private List<WebElement> GoAir_lst_btn_Result4Page_selected;
	@FindBy(css="div[class*='selected']")
	private List<WebElement> GoAir_lst_btn_Result4Page_BusinessClass_SelectedSeats;
	@FindBy(css=".skip-flight-seating")
	public WebElement GoAir_btn_Result4Page_SkipSeatSelection;
	@FindBy(css="#seats-dialog-continue")
	public WebElement GoAir_btn_Result4Page_SkipSeatSelection_Popup_Continue;
	@FindBy(css="input[value='Continue']")
	private WebElement GoAir_lnk_Result4Page_Continue;

	
   // every page object has it's local private wait with fixed 10 sec delay
	private WebDriverWait objWait = new WebDriverWait(this.objWebDriverAbstract, 10);  

	
	public boolean GoAir_Validate_Common_Seat_Assignment_Scenario_BusinessClass(){

		boolean bGoAir_ThisElementValidationStatus 		= true;
		
		System.out.println("DEBUG:    Selecting seat type: " + "business class");
		int nNumberOfStops = GoAir_lst_lnk_Result4Page_flightSeatMap.size();
		
		if ( nNumberOfStops > 1){
			System.out.println("DEBUG:    Multiple stop count for this journey are: " + (nNumberOfStops-1) );
		}
		
		for (int nLocal=0; nLocal < nNumberOfStops; nLocal++){
			int nGoAir_Result4Page_BusinessClass_SeatAvailable = GoAir_lst_lnk_Result4Page_flightSeatMap.get(nLocal).findElements(By.cssSelector("div[class*='seatAvailable']")).size();
			
			if(			nGoAir_Result4Page_BusinessClass_SeatAvailable > 0){
							GoAir_lst_lnk_Result4Page_flightSeatMap.get(nLocal).findElements(By.cssSelector("div[class*='seatAvailable']")).get(0).click();
							continue;
			}
		}
		
		System.out.println("DEBUG:    Selected following business class seat(s): ");
		for (WebElement GoAir_OneWebElement : GoAir_lst_btn_Result4Page_BusinessClass_SelectedSeats){
			if (GoAir_OneWebElement.findElements(By.cssSelector("input[class='seatData']")).size() > 0){
				System.out.println("DEBUG:    " + GoAir_OneWebElement.findElements(By.cssSelector("input[class='seatData']")).get(0).
						getAttribute("value").replace("#", " ").replace("null", "") );
			}
		}
		
		GoAir_lnk_Result4Page_Continue.click();
		objWait.until(ExpectedConditions.textToBePresentInElement(objLocal_PageGoAirResult5Payment.GoAir_Result5Page_CurrentStep, "5"));
		
		return bGoAir_ThisElementValidationStatus;
	}	

	public boolean GoAir_Validate_Common_Seat_Assignment_Scenario(){

		boolean bGoAir_ThisElementValidationStatus 		= true;
		
		System.out.println("DEBUG:    Selecting seat type: " + "any special category");
		int nNumberOfStops = GoAir_lst_lnk_Result4Page_flightSeatMap.size();
		
		if ( nNumberOfStops > 1){
			System.out.println("DEBUG:    Multiple stop count for this journey are: " + (nNumberOfStops-1) );
		}
		
		for (int nLocal=0; nLocal < nNumberOfStops; nLocal++){
			int nGoAir_Result4Page_Rs600_availablePrice2 = GoAir_lst_lnk_Result4Page_flightSeatMap.get(nLocal).findElements(By.cssSelector(".availablePrice2")).size();
			int nGoAir_Result4Page_Rs300_availablePrice1 = GoAir_lst_lnk_Result4Page_flightSeatMap.get(nLocal).findElements(By.cssSelector(".availablePrice1")).size();
			int nGoAir_Result4Page_Rs200_availablePrice0 = GoAir_lst_lnk_Result4Page_flightSeatMap.get(nLocal).findElements(By.cssSelector(".availablePrice0")).size();
			
			if(			nGoAir_Result4Page_Rs600_availablePrice2 > 0){
							GoAir_lst_lnk_Result4Page_flightSeatMap.get(nLocal).findElements(By.cssSelector(".availablePrice2")).get(0).click();
							try {
								objWait.until(ExpectedConditions.alertIsPresent());
								Alert objAlert_GoAir_HomePage 					= this.objWebDriverAbstract.switchTo().alert();
							    System.out.println("DEBUG:    Medical assistance  alert is acceped with message: " + objAlert_GoAir_HomePage.getText());
							    objAlert_GoAir_HomePage.accept();
							}catch(Exception e){}
							continue;
			}else if(   nGoAir_Result4Page_Rs300_availablePrice1> 0 ){
							GoAir_lst_lnk_Result4Page_flightSeatMap.get(nLocal).findElements(By.cssSelector(".availablePrice1")).get(0).click();
							continue;
			}else if (  nGoAir_Result4Page_Rs200_availablePrice0 > 0){
							GoAir_lst_lnk_Result4Page_flightSeatMap.get(nLocal).findElements(By.cssSelector(".availablePrice0")).get(0).click();
							continue;
			}
		}
	
//		if (nNumberOfStops != GoAir_lst_btn_Result4Page_selected.size()){
//			System.out.println("ERROR:    Unable to select any special category seat or they are not available");
//			objSoftAssert.fail("ERROR:    Unable to select any special category seat or they are not available");
//			return false;
//		}

		System.out.println("DEBUG:    Selected following special category seat(s): ");
		for (int nnLocal=0; nnLocal < nNumberOfStops; nnLocal++){
			System.out.println("DEBUG:    " + GoAir_lst_btn_Result4Page_selected.get(nnLocal).findElement(By.cssSelector("input[class='seatData']"))
													.getAttribute("value").replace("#", " "));
		}

		GoAir_lnk_Result4Page_Continue.click();
		objWait.until(ExpectedConditions.textToBePresentInElement(objLocal_PageGoAirResult5Payment.GoAir_Result5Page_CurrentStep, "5"));
		
		return bGoAir_ThisElementValidationStatus;
	}
	
	public boolean GoAir_Validate_EndToEnd_Search_Scenario__TYPE1_CASE3(){

		return GoAir_Validate_Common_Seat_Assignment_Scenario();
	}
	
	public boolean GoAir_Validate_EndToEnd_Search_Scenario__TYPE3_CASE1(){

		return GoAir_Validate_Common_Seat_Assignment_Scenario();
	}
	
	public boolean GoAir_Validate_EndToEnd_Search_Scenario__TYPE3_CASE2(){

		return GoAir_Validate_Common_Seat_Assignment_Scenario();
	}

	public boolean GoAir_Validate_EndToEnd_Search_Scenario__TYPE3_CASE3(){

		boolean bGoAir_ThisElementValidationStatus 		= true;
		
		System.out.println("DEBUG:    Selecting seat type: " + "any special category" + " and approximately middle row seat");
		int nNumberOfStops = GoAir_lst_lnk_Result4Page_flightSeatMap.size();
		
		if ( nNumberOfStops > 1){
			System.out.println("DEBUG:    Multiple stop count for this journey are: " + (nNumberOfStops-1) );
		}
		
		for (int nLocal=0; nLocal < nNumberOfStops; nLocal++){
			int nGoAir_Result4Page_Rs600_availablePrice2 = GoAir_lst_lnk_Result4Page_flightSeatMap.get(nLocal).findElements(By.cssSelector(".availablePrice2")).size();
			int nGoAir_Result4Page_Rs300_availablePrice1 = GoAir_lst_lnk_Result4Page_flightSeatMap.get(nLocal).findElements(By.cssSelector(".availablePrice1")).size();
			int nGoAir_Result4Page_Rs200_availablePrice0 = GoAir_lst_lnk_Result4Page_flightSeatMap.get(nLocal).findElements(By.cssSelector(".availablePrice0")).size();

			if(			nGoAir_Result4Page_Rs600_availablePrice2 > 0){
							int nMiddleSeatIndex =GoAir_lst_lnk_Result4Page_flightSeatMap.get(nLocal).findElements(By.cssSelector(".availablePrice2")).size() / 2;
							GoAir_lst_lnk_Result4Page_flightSeatMap.get(nLocal).findElements(By.cssSelector(".availablePrice2")).get(nMiddleSeatIndex).click();
							try {
								objWait.until(ExpectedConditions.alertIsPresent());
								Alert objAlert_GoAir_HomePage 					= this.objWebDriverAbstract.switchTo().alert();
							    System.out.println("DEBUG:    Medical assistance  alert is acceped with message: " + objAlert_GoAir_HomePage.getText());
							    objAlert_GoAir_HomePage.accept();
							}catch(Exception e){}
							continue;
			}else if(   nGoAir_Result4Page_Rs300_availablePrice1> 0 ){
							int nMiddleSeatIndex =GoAir_lst_lnk_Result4Page_flightSeatMap.get(nLocal).findElements(By.cssSelector(".availablePrice1")).size() / 2;
							GoAir_lst_lnk_Result4Page_flightSeatMap.get(nLocal).findElements(By.cssSelector(".availablePrice1")).get(nMiddleSeatIndex).click();
							continue;
			}else if (  nGoAir_Result4Page_Rs200_availablePrice0 > 0){
							int nMiddleSeatIndex =GoAir_lst_lnk_Result4Page_flightSeatMap.get(nLocal).findElements(By.cssSelector(".availablePrice0")).size() / 2;
							GoAir_lst_lnk_Result4Page_flightSeatMap.get(nLocal).findElements(By.cssSelector(".availablePrice0")).get(nMiddleSeatIndex).click();
							continue;
			}
		}
		
		if (nNumberOfStops != GoAir_lst_btn_Result4Page_selected.size()){
			System.out.println("ERROR:    Unable to select any special category seat or they are not available");
			objSoftAssert.fail("ERROR:    Unable to select any special category seat or they are not available");
			return false;
		}

		System.out.println("DEBUG:    Selected following special category seat(s): ");
		for (int nnLocal=0; nnLocal < nNumberOfStops; nnLocal++){
			System.out.println("DEBUG:    " + GoAir_lst_btn_Result4Page_selected.get(nnLocal).findElement(By.cssSelector("input[class='seatData']"))
													.getAttribute("value").replace("#", " "));
		}

		GoAir_lnk_Result4Page_Continue.click();
		objWait.until(ExpectedConditions.textToBePresentInElement(objLocal_PageGoAirResult5Payment.GoAir_Result5Page_CurrentStep, "5"));
		
		return bGoAir_ThisElementValidationStatus;
	}	
	
	public boolean GoAir_Validate_EndToEnd_Search_Scenario__TYPE3_CASE5(){

		return GoAir_Validate_Common_Seat_Assignment_Scenario();
	}	
	
	public boolean GoAir_Validate_EndToEnd_Search_Scenario__TYPE3_CASE6(){

		boolean bGoAir_ThisElementValidationStatus 		= true;
		
		System.out.println("DEBUG:    Selecting seat type: " + "highest special category");
		int nNumberOfStops = GoAir_lst_lnk_Result4Page_flightSeatMap.size();
		
		if ( nNumberOfStops > 1){
			System.out.println("DEBUG:    Multiple stop count for this journey are: " + (nNumberOfStops-1) );
		}
		
		for (int nLocal=0; nLocal < nNumberOfStops; nLocal++){
			int nGoAir_Result4Page_Rs600_availablePrice2 = GoAir_lst_lnk_Result4Page_flightSeatMap.get(nLocal).findElements(By.cssSelector(".availablePrice2")).size();

			if(			nGoAir_Result4Page_Rs600_availablePrice2 > 0){
							GoAir_lst_lnk_Result4Page_flightSeatMap.get(nLocal).findElements(By.cssSelector(".availablePrice2")).get(0).click();
							try{
								objWait.until(ExpectedConditions.alertIsPresent());
								Alert objAlert_GoAir_HomePage 					= this.objWebDriverAbstract.switchTo().alert();
							    System.out.println("DEBUG:    Medical assistance  alert is acceped with message: " + objAlert_GoAir_HomePage.getText());
							    objAlert_GoAir_HomePage.accept();
							    objWait.until(ExpectedConditions.not(ExpectedConditions.alertIsPresent()));
							}catch(Exception e){}
							continue;
			}
		}
		
		if (nNumberOfStops != GoAir_lst_btn_Result4Page_selected.size()){
			System.out.println("ERROR:    Unable to select any special category seat or they are not available");
			objSoftAssert.fail("ERROR:    Unable to select any special category seat or they are not available");
			return false;
		}

		System.out.println("DEBUG:    Selected following special category seat(s): ");
		for (int nnLocal=0; nnLocal < nNumberOfStops; nnLocal++){
			System.out.println("DEBUG:    " + GoAir_lst_btn_Result4Page_selected.get(nnLocal).findElement(By.cssSelector("input[class='seatData']"))
													.getAttribute("value").replace("#", " "));
		}

		GoAir_lnk_Result4Page_Continue.click();
		objWait.until(ExpectedConditions.textToBePresentInElement(objLocal_PageGoAirResult5Payment.GoAir_Result5Page_CurrentStep, "5"));
		
		return bGoAir_ThisElementValidationStatus;
	}	
	
	public boolean GoAir_Validate_EndToEnd_Search_Scenario__TYPE3_CASE8(){

		return GoAir_Validate_Common_Seat_Assignment_Scenario_BusinessClass();
	}
	
	public boolean GoAir_Validate_Skip_Seat_Selection_Scenario(){

		boolean bGoAir_ThisElementValidationStatus 		= true;

		System.out.println("DEBUG:    Skipping seat selection");

		GoAir_btn_Result4Page_SkipSeatSelection.click();
		// this is intermediate screen button before going to payment screen
		objWait.until(ExpectedConditions.visibilityOf(GoAir_btn_Result4Page_SkipSeatSelection_Popup_Continue));

		GoAir_btn_Result4Page_SkipSeatSelection_Popup_Continue.click();
		objWait.until(ExpectedConditions.textToBePresentInElement(objLocal_PageGoAirResult5Payment.GoAir_Result5Page_CurrentStep, "5"));
		
		return bGoAir_ThisElementValidationStatus;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
