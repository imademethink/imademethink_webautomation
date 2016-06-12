package com.imademethink_webautomation.pkgAirlines_GoAir;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.imademethink_webautomation.pkg0GeneralPageFactory.Page0Abstract;

public class PageGoAir2Services extends Page0Abstract{

	public PageGoAir2Services(WebDriver driver) {
		super(driver);
		//System.out.println("DEBUG:    PageGoAir2Services constructor");
		PageFactory.initElements(driver, this);
	}
	
	
	// home page buttons
	@FindBy(linkText = "Services")
	private WebElement GoAir_hover_Services;
	@FindBy(css=".cms-top-title")
	private WebElement GoAir_labl_Services_SubOptionHeading;
	
	// services  sub elements
	@FindBy(linkText = "SMS Services")
	private WebElement GoAir_lnk_Services_SMSServices;
	@FindBy(linkText = "Inflight Menu")
	private WebElement GoAir_lnk_Services_InflightMenu;
	@FindBy(linkText = "Priority Check-in")
	private WebElement GoAir_lnk_Services_PriorityCheckIn;
	@FindBy(linkText = "Pre-Book Seats")
	private WebElement GoAir_lnk_Services_PreBookSeats;

	// elements under sms services sub option
	@FindBy(css = ".menu-page-content>div>p>strong>span")
	private List<WebElement> GoAir_Services_SMS_Services_TextInformationHeaders;
	
	// elements under in flight menu sub option
	@FindBy(css = ".menu-page-content>div>table>tbody>tr>td>img")
	private List<WebElement> GoAir_lst_Services_InFlightMenu_FoodImages;

	// elements under priority check in sub option
	@FindBy(css = ".menu-page-content>div>p>img")
	private WebElement GoAir_Services_PriorityCheckIn_Img;
	
	@FindBy(css = ".menu-page-content>div>table>tbody>tr>td>p>strong")
	private List<WebElement> GoAir_Services_SMS_PreBookSeats_TextInformationHeaders;
	
	
    // every page object has it's local private wait with fixed 10 sec delay
    private WebDriverWait objWait = new WebDriverWait(this.objWebDriverAbstract, 10); 
    

    
    public boolean GoAir_Validate_ServicesSubPageElements_for_SMSServices(String strGUIOptionListForSMSServices){

		boolean bGoAir_ThisElementValidationStatus 		= true;
		boolean bSpportedElementFound					= false;
		Actions GoAir_actn_bldr_PageServices 			= new Actions(this.objWebDriverAbstract);
		
		// mouse hover on services and click on sms services to proceed
		GoAir_actn_bldr_PageServices
						.moveToElement(GoAir_hover_Services)
						.click(GoAir_lnk_Services_SMSServices)
						.build()
						.perform();

		objWait.until(ExpectedConditions.textToBePresentInElement(GoAir_labl_Services_SubOptionHeading, "SMS Services"));
		
		if (strGUIOptionListForSMSServices.contains("labl__SMS information")){
			bSpportedElementFound = true;
			if (!  (
					GoAir_Services_SMS_Services_TextInformationHeaders.get(0).getText().contains("1. Flight Status")	&&
					GoAir_Services_SMS_Services_TextInformationHeaders.get(1).getText().contains("2. Flight Schedules")	&&
					GoAir_Services_SMS_Services_TextInformationHeaders.get(2).getText().contains("3. Lowest Fare Enquiry")	&&
					GoAir_Services_SMS_Services_TextInformationHeaders.get(3).getText().contains("4. Promotional Offers")	&&
					GoAir_Services_SMS_Services_TextInformationHeaders.get(4).getText().contains("5. Feedback")	&&
					GoAir_Services_SMS_Services_TextInformationHeaders.get(5).getText().contains("6. Help")
				   )
				) {
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "labl__SMS information");
				System.out.println("ERROR:    Following element not found: " + "labl__SMS information");
				bGoAir_ThisElementValidationStatus = false;}
		}
		
		
		if (!bSpportedElementFound){
			objSoftAssert.fail("ERROR:    Atleast one unsuported element NOT found in following category: " + "SMS Services");
			System.out.println("ERROR:    Atleast one unsuported element NOT found in following category: " + "SMS Services");
			return bSpportedElementFound;
		}
		if (bGoAir_ThisElementValidationStatus) System.out.println("RESULT::PASS");
		else{
			System.out.println("RESULT::FAIL");
			objSoftAssert.fail("ERROR:    Atleast one supported element NOT found in following category: " + "SMS Services");
			System.out.println("ERROR:    Atleast one supported element NOT found in following category: " + "SMS Services");
		}
		
		return bGoAir_ThisElementValidationStatus;
	}
    
    public boolean GoAir_Validate_ServicesSubPageElements_for_InflightMenu(String strGUIOptionListForInflightMenu){

		boolean bGoAir_ThisElementValidationStatus 		= true;
		boolean bSpportedElementFound					= false;
		Actions GoAir_actn_bldr_PageServices 			= new Actions(this.objWebDriverAbstract);
		
		// mouse hover on services and click on in flight menu to proceed
		GoAir_actn_bldr_PageServices
						.moveToElement(GoAir_hover_Services)
						.click(GoAir_lnk_Services_InflightMenu)
						.build()
						.perform();

		objWait.until(ExpectedConditions.textToBePresentInElement(GoAir_labl_Services_SubOptionHeading, "Inflight Menu"));
		
		if (strGUIOptionListForInflightMenu.contains("labl__Food menu details")){
			bSpportedElementFound = true;
			if (!  (
					GoAir_lst_Services_InFlightMenu_FoodImages.get(0).isDisplayed()	&&
					GoAir_lst_Services_InFlightMenu_FoodImages.get(1).isDisplayed()	&&
					GoAir_lst_Services_InFlightMenu_FoodImages.get(2).isDisplayed()	&&
					GoAir_lst_Services_InFlightMenu_FoodImages.get(3).isDisplayed()	&&
					GoAir_lst_Services_InFlightMenu_FoodImages.get(4).isDisplayed()	&&
					GoAir_lst_Services_InFlightMenu_FoodImages.get(5).isDisplayed()	&&
					GoAir_lst_Services_InFlightMenu_FoodImages.get(6).isDisplayed()	&&
					GoAir_lst_Services_InFlightMenu_FoodImages.get(7).isDisplayed()
				   )
				) {
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "labl__Food menu details");
				System.out.println("ERROR:    Following element not found: " + "labl__Food menu details");
				bGoAir_ThisElementValidationStatus = false;}
		}
		
		
		if (!bSpportedElementFound){
			objSoftAssert.fail("ERROR:    Atleast one unsuported element NOT found in following category: " + "Inflight Menu");
			System.out.println("ERROR:    Atleast one unsuported element NOT found in following category: " + "Inflight Menu");
			return bSpportedElementFound;
		}
		if (bGoAir_ThisElementValidationStatus) System.out.println("RESULT::PASS");
		else{
			System.out.println("RESULT::FAIL");
			objSoftAssert.fail("ERROR:    Atleast one supported element NOT found in following category: " + "Inflight Menu");
			System.out.println("ERROR:    Atleast one supported element NOT found in following category: " + "Inflight Menu");
		}
		
		return bGoAir_ThisElementValidationStatus;
	}
    
    public boolean GoAir_Validate_ServicesSubPageElements_for_PriorityCheckIn(String strGUIOptionListForPriorityCheckIn){

		boolean bGoAir_ThisElementValidationStatus 		= true;
		boolean bSpportedElementFound					= false;
		Actions GoAir_actn_bldr_PageServices 			= new Actions(this.objWebDriverAbstract);
		
		// mouse hover on services and click on priority check in to proceed
		GoAir_actn_bldr_PageServices
						.moveToElement(GoAir_hover_Services)
						.click(GoAir_lnk_Services_PriorityCheckIn)
						.build()
						.perform();

		objWait.until(ExpectedConditions.textToBePresentInElement(GoAir_labl_Services_SubOptionHeading, "Priority Check-in"));

		if (strGUIOptionListForPriorityCheckIn.contains("labl__Priority Check-in charges information")){
			bSpportedElementFound = true;
			if (!  GoAir_Services_PriorityCheckIn_Img.isDisplayed()) {
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "labl__Priority Check-in charges information");
				System.out.println("ERROR:    Following element not found: " + "labl__Priority Check-in charges information");
				bGoAir_ThisElementValidationStatus = false;}
		}
		
		
		if (!bSpportedElementFound){
			objSoftAssert.fail("ERROR:    Atleast one unsuported element NOT found in following category: " + "Priority Check-in");
			System.out.println("ERROR:    Atleast one unsuported element NOT found in following category: " + "Priority Check-in");
			return bSpportedElementFound;
		}
		if (bGoAir_ThisElementValidationStatus) System.out.println("RESULT::PASS");
		else{
			System.out.println("RESULT::FAIL");
			objSoftAssert.fail("ERROR:    Atleast one supported element NOT found in following category: " + "Priority Check-in");
			System.out.println("ERROR:    Atleast one supported element NOT found in following category: " + "Priority Check-in");
		}
		
		return bGoAir_ThisElementValidationStatus;
	}
    
    public boolean GoAir_Validate_ServicesSubPageElements_for_PreBookSeats(String strGUIOptionListForPreBookSeats){

		boolean bGoAir_ThisElementValidationStatus 		= true;
		boolean bSpportedElementFound					= false;
		Actions GoAir_actn_bldr_PageServices 			= new Actions(this.objWebDriverAbstract);
		
		// mouse hover on services and click on pre book seats to proceed
		GoAir_actn_bldr_PageServices
						.moveToElement(GoAir_hover_Services)
						.click(GoAir_lnk_Services_PreBookSeats)
						.build()
						.perform();

		objWait.until(ExpectedConditions.textToBePresentInElement(GoAir_labl_Services_SubOptionHeading, "Pre-Book Seats"));
		
		if (strGUIOptionListForPreBookSeats.contains("labl__Pre-Book Seats charges information")){
			bSpportedElementFound = true;
			if (!  (
					GoAir_Services_SMS_PreBookSeats_TextInformationHeaders.get(0).getText().contains("Sr. No.")	&&
					GoAir_Services_SMS_PreBookSeats_TextInformationHeaders.get(1).getText().contains("Row")	&&
					GoAir_Services_SMS_PreBookSeats_TextInformationHeaders.get(2).getText().contains("Window Seat")	&&
					GoAir_Services_SMS_PreBookSeats_TextInformationHeaders.get(3).getText().contains("Middle Seat")	&&
					GoAir_Services_SMS_PreBookSeats_TextInformationHeaders.get(4).getText().contains("Aisle Seat")
				   )
				) {
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "Pre-Book Seats");
				System.out.println("ERROR:    Following element not found: " + "Pre-Book Seats");
				bGoAir_ThisElementValidationStatus = false;}
		}
		
		
		if (!bSpportedElementFound){
			objSoftAssert.fail("ERROR:    Atleast one unsuported element NOT found in following category: " + "Pre-Book Seats");
			System.out.println("ERROR:    Atleast one unsuported element NOT found in following category: " + "Pre-Book Seats");
			return bSpportedElementFound;
		}
		if (bGoAir_ThisElementValidationStatus) System.out.println("RESULT::PASS");
		else{
			System.out.println("RESULT::FAIL");
			objSoftAssert.fail("ERROR:    Atleast one supported element NOT found in following category: " + "Pre-Book Seats");
			System.out.println("ERROR:    Atleast one supported element NOT found in following category: " + "Pre-Book Seats");
		}
		
		return bGoAir_ThisElementValidationStatus;
	}
    
}
