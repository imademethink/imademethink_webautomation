package com.imademethink_webautomation.pkgAirlines_GoAir;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.imademethink_webautomation.pkg0GeneralPageFactory.Page0Abstract;

public class PageGoAir99General extends Page0Abstract{

	public PageGoAir99General(WebDriver driver) {
		super(driver);
		//System.out.println("DEBUG:    PageGoAir99General constructor");
		PageFactory.initElements(driver, this);
	}
	
	// This page contains general elements for non ticket booking pages e.g. intermediate wait i.e. in progress message, payment progress etc
	
	
	
	
	// home page button
	@FindBy(css=".home")
	private WebElement GoAir_btn_Home;
	@FindBy(css=".logo")
	private WebElement GoAir_img_HomePageLogo_Actual;

	// home page other buttons
	@FindBy(linkText = "GoBusiness")
	private WebElement GoAir_btn_GoBusiness;
	@FindBy(linkText = "GoHolidays")
	private WebElement GoAir_btn_GoHolidays;
	@FindBy(linkText = "Careers")
	private WebElement GoAir_btn_Careers;
	@FindBy(css = ".top-bar>ul>li>p>span>a>img")
	private List<WebElement> GoAir_lst_img_Mobile_Apps;
	@FindBy(css = "#footer-book-btn")
	private WebElement GoAir_tab_Book_Flights_Bottom;
	
	
	// sub page title common header
	@FindBy(css=".cms-top-title")
	private WebElement GoAir_labl_SubOptionHeading;
	
	// elements under go business sub option
	@FindBy(css = ".menu-page-content>div>p>strong")
	private List<WebElement> GoAir_lst_GoBusiness_TextInformationHeaders;
	
	// elements under go holidays sub option
	@FindBy(css = ".social-icon-wrapper>a>img")
	private WebElement GoAir_GoHolidays_Top_Image;
	@FindBy(linkText="Honeymoon")
	private WebElement GoAir_GoHolidays_tab_Honeymoon;
	
	// elements under careers option
	@FindBy(css = "html>body>table>tbody>tr>td>table>tbody>tr>td>a>img")
	private List<WebElement> GoAir_lst_Careers_MenuOptions;	
	
	// elements for specific other item - SME
	@FindBy(css = "a[href='/bottom-menu/smart-sme']")
	private WebElement GoAir_SpecificOtherItem_SmartSME;
	@FindBy(css = "a[href='https://goair.booksecure.net/login.aspx']")
	private WebElement GoAir_SpecificOtherItem_SmartSME_SignIn;
	@FindBy(css = "a[href='/bottom-menu/sme-sign-up']")
	private WebElement GoAir_SpecificOtherItem_SmartSME_SignUp;
	@FindBy(linkText = "sme.helpdesk@goair.in")
	private WebElement GoAir_SpecificOtherItem_SmartSME_email;

	// elements for specific other item - Carry More For Less
	@FindBy(css="img[src*='Excess-Baggage.jpg']")
	private WebElement GoAir_img_SpecificOtherItem_CarryMoreForLess; 
	@FindBy(css = "#class>table>tbody>tr>td")
	private List<WebElement> GoAir_labl_SpecificOtherItem_CarryMoreForLess_TableCell;
	
	// elements for specific other item - Pre book seats
	@FindBy(css="img[src*='prebook.png']")
	private WebElement GoAir_img_SpecificOtherItem_PreBookPreferredSeats;
	@FindBy(css=".menu-page-content>div>table>tbody>tr")
	private List<WebElement> GoAir_lst_labl_SpecificOtherItem_PreBookPreferredSeats_Table_Header;

	// elements for specific other item - Partner Registration
	@FindBy(linkText="Partner Registration")
	private WebElement GoAir_lnk_SpecificOtherItem_PartnerRegistration;
	@FindBy(css="#RadioButtonList1_0")
	private WebElement GoAir_radiobtn_SpecificOtherItem_PartnerRegistration_Corporate;
	@FindBy(css="#RadioButtonList1_1")
	private WebElement GoAir_radiobtn_SpecificOtherItem_PartnerRegistration_Retail;

	// elements for specific other item - Partner Registration
	@FindBy(linkText="• Advertise With Us")
	private WebElement GoAir_lnk_SpecificOtherItem_AdvertiseWithUs;
	@FindBy(css=".menu-page-content>div>table>tbody>tr")
	private List<WebElement> GoAir_lst_labl_SpecificOtherItem_AdvertiseWithUs_Table_Header;
	
	
	
	
	
	
    // every page object has it's local private wait with fixed 10 sec delay
	private WebDriverWait objWait 		= new WebDriverWait(this.objWebDriverAbstract, 10); 
	private WebDriverWait objWaitShort 	= new WebDriverWait(this.objWebDriverAbstract, 3);


    public boolean GoAir_Validate_GoBusinessSubPageElements(String strGUIOptionListForGoBusiness){

		boolean bGoAir_ThisElementValidationStatus 		= true;

		// click on go business to proceed
		GoAir_btn_GoBusiness.click();
		objWait.until(ExpectedConditions.textToBePresentInElement(GoAir_labl_SubOptionHeading, "GoBusiness"));
		
		if (!  (
				GoAir_lst_GoBusiness_TextInformationHeaders.get(0).getText().contains("The comfort of Business Class at the price of Economy.")	&&
				GoAir_lst_GoBusiness_TextInformationHeaders.get(1).getText().contains("Terms & Conditions:")
			   )
			) {
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + strGUIOptionListForGoBusiness);
				System.out.println("ERROR:    Following element not found: " + strGUIOptionListForGoBusiness);
				bGoAir_ThisElementValidationStatus = false;}
		
		if (bGoAir_ThisElementValidationStatus) System.out.println("RESULT::PASS");
		else{
			System.out.println("RESULT::FAIL");
			objSoftAssert.fail("ERROR:    Atleast one supported element NOT found in following category: " + "Go Business");
			System.out.println("ERROR:    Atleast one supported element NOT found in following category: " + "Go Business");
		}
		
		GoAir_btn_Home.click();
		objWait.until(ExpectedConditions.urlContains("https://www.goair.in"));
		
		return bGoAir_ThisElementValidationStatus;
	}
    
    public boolean GoAir_Validate_GoHolidaysSubPageElements(String strGUIOptionListForGoHolidays){

		boolean bGoAir_ThisElementValidationStatus 		= true;

		// since go holidays page opens in new tab, we will open it in same window
		this.objWebDriverAbstract.navigate().to(GoAir_btn_GoHolidays.getAttribute("href"));
		objWait.until(ExpectedConditions.visibilityOf(GoAir_GoHolidays_Top_Image));

		if (!  (
				GoAir_GoHolidays_tab_Honeymoon.isDisplayed()						&&
				this.objWebDriverAbstract.getTitle().contains("GoAir Holidays")  	&&
				this.objWebDriverAbstract.getCurrentUrl().contains("holidays")
			   )
			) {
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + strGUIOptionListForGoHolidays);
				System.out.println("ERROR:    Following element not found: " + strGUIOptionListForGoHolidays);
				bGoAir_ThisElementValidationStatus = false;}
		
		if (bGoAir_ThisElementValidationStatus) System.out.println("RESULT::PASS");
		else{
			System.out.println("RESULT::FAIL");
			objSoftAssert.fail("ERROR:    Atleast one supported element NOT found in following category: " + "Go Holidays");
			System.out.println("ERROR:    Atleast one supported element NOT found in following category: " + "Go Holidays");
		}

		// navigate back to home page
		this.objWebDriverAbstract.navigate().back();

		return bGoAir_ThisElementValidationStatus;
	}
    
    public boolean GoAir_Validate_CareersSubPageElements(String strGUIOptionListForCareers){

		boolean bGoAir_ThisElementValidationStatus 		= true;

		// since careers page opens in new tab, we will open it in same window
		this.objWebDriverAbstract.navigate().to(GoAir_btn_Careers.getAttribute("href"));
		objWait.until(ExpectedConditions.urlContains("goteam"));

		if (!  GoAir_lst_Careers_MenuOptions.get(2).isDisplayed()) {
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + strGUIOptionListForCareers);
				System.out.println("ERROR:    Following element not found: " + strGUIOptionListForCareers);
				bGoAir_ThisElementValidationStatus = false;}
		
		if (bGoAir_ThisElementValidationStatus) System.out.println("RESULT::PASS");
		else{
			System.out.println("RESULT::FAIL");
			objSoftAssert.fail("ERROR:    Atleast one supported element NOT found in following category: " + "Careers");
			System.out.println("ERROR:    Atleast one supported element NOT found in following category: " + "Careers");
		}
		
		// navigate back to home page
		this.objWebDriverAbstract.navigate().back();

		return bGoAir_ThisElementValidationStatus;
	}

    public boolean GoAir_Validate_Specific_Other_Item(String strSpecificOtherItems){

		boolean bGoAir_ThisElementValidationStatus 		= false;

		switch(strSpecificOtherItems){
		case "Smart SME":
			bGoAir_ThisElementValidationStatus = GoAir_Validate_SpecificOtherItem_Smart_SME();
			break;
		case "Carry More For Less":
			bGoAir_ThisElementValidationStatus = GoAir_Validate_SpecificOtherItem_CarryMoreForLess();
			break;
		case "Pre-Book Preferred Seats":
			bGoAir_ThisElementValidationStatus = GoAir_Validate_SpecificOtherItem_PreBookPreferredSeats();
			break;
		case "Partner Registration":
			bGoAir_ThisElementValidationStatus = GoAir_Validate_SpecificOtherItem_PartnerRegistration();
			break;
		case "Advertise With Us":
			bGoAir_ThisElementValidationStatus = GoAir_Validate_SpecificOtherItem_AdvertiseWithUs();
			break;
		default :
			System.out.println("ERROR:    Unsupported specific other item to validate: " + strSpecificOtherItems);
			objSoftAssert.fail("ERROR:    Unsupported specific other item to validate: " + strSpecificOtherItems);
			break;
		}

		return bGoAir_ThisElementValidationStatus;
    }
    
	public boolean GoAir_validate_This_Element(String strThisElement){

		boolean bGoAir_ThisElementValidationStatus 		= false;
		
		switch (strThisElement){
			case "btn__HOME":
			case "btn__Home":
				if ( GoAir_btn_Home.isDisplayed()    )     				bGoAir_ThisElementValidationStatus = true;
				break;
			case "img__GoAir_logo":
				if ( GoAir_img_HomePageLogo_Actual.isDisplayed()    )   bGoAir_ThisElementValidationStatus = true;
				break;
			case "lnk__Download App":
				if ( GoAir_lst_img_Mobile_Apps.get(0).isDisplayed() &&  GoAir_lst_img_Mobile_Apps.get(1).isDisplayed()  )     	
																		bGoAir_ThisElementValidationStatus = true;
				break;
			case "btn__BOOK FLIGHTS at bottom bar":
				if ( GoAir_tab_Book_Flights_Bottom.isDisplayed()    ) 	bGoAir_ThisElementValidationStatus = true;
				break;
			case "btn__Partner Login":
				if ( GoAir_lnk_SpecificOtherItem_PartnerRegistration.isDisplayed() )   		
																		bGoAir_ThisElementValidationStatus = true;
				break;

	    	default:
				objSoftAssert.fail("ERROR:    Unsupported common webelement to validate: " + strThisElement);
				System.out.println("ERROR:    Unsupported common webelement to validate: " + strThisElement);
	    		break;
		}
		
		return bGoAir_ThisElementValidationStatus;
	}

	
	
	
    
    
    
    
    
    
    
    
    
    // helper methods
    private boolean GoAir_Validate_SpecificOtherItem_Smart_SME(){
    	
    	boolean bGoAir_ThisElementValidationStatus 		= true;

    	GoAir_SpecificOtherItem_SmartSME.click();
    	objWait.until(ExpectedConditions.visibilityOf(GoAir_SpecificOtherItem_SmartSME_email));
    	
    	if (!(  GoAir_SpecificOtherItem_SmartSME_SignIn.isDisplayed() && 
    			GoAir_SpecificOtherItem_SmartSME_SignUp.isDisplayed() && 
    			GoAir_SpecificOtherItem_SmartSME_email.isDisplayed())){
			System.out.println("ERROR:    Specific other item validation failed for: " + "Smart SME");
			objSoftAssert.fail("ERROR:    Specific other item validation failed for: " + "Smart SME");
			return false;
		}

	    GoAir_SpecificOtherItem_SmartSME_SignUp.click();
	    objWait.until(ExpectedConditions.titleContains("SME Sign Up"));
	    this.objWebDriverAbstract.navigate().back();
    	objWait.until(ExpectedConditions.visibilityOf(GoAir_SpecificOtherItem_SmartSME_SignIn));

    	GoAir_SpecificOtherItem_SmartSME_SignIn.click();
		String strMainWindowHandle        	= this.objWebDriverAbstract.getWindowHandle();
		Set<String> strSetWindowHandles 	= this.objWebDriverAbstract.getWindowHandles();
		if (strSetWindowHandles.size() <= 1){
			System.out.println("ERROR:    Specific other item validation failed for:" + "Smart SME - Sign Up link");
			objSoftAssert.fail("ERROR:    Specific other item validation failed for:" + "Smart SME - Sign Up link");
			return false;
		}

		Iterator<String> strIteratorPopup 	= strSetWindowHandles.iterator();
		while ( strIteratorPopup.hasNext() ) {
		    String strCurrentWindowHandle 	= strIteratorPopup.next();
		    if(strMainWindowHandle.contains(strCurrentWindowHandle)) continue;

		    // switch to another window
		    this.objWebDriverAbstract.switchTo().window(strCurrentWindowHandle);
		    this.objWebDriverAbstract.manage().window().maximize();
		    
		    objWait.until(ExpectedConditions.titleContains("Log In"));

	    	this.objWebDriverAbstract.close();		    	
	    	break;    		    
		}
		this.objWebDriverAbstract.switchTo().window(strMainWindowHandle);

    	return bGoAir_ThisElementValidationStatus;
    }
    
    private boolean GoAir_Validate_SpecificOtherItem_CarryMoreForLess(){
    	
    	boolean bGoAir_ThisElementValidationStatus 		= true;

    	GoAir_img_SpecificOtherItem_CarryMoreForLess.click();
	    objWait.until(ExpectedConditions.titleContains("Extra Baggage"));

		System.out.println("DEBUG:    Carry more for less - details");
		for (int nCnt=0; nCnt < GoAir_labl_SpecificOtherItem_CarryMoreForLess_TableCell.size(); nCnt+=2){
			System.out.println("DEBUG:     " + GoAir_labl_SpecificOtherItem_CarryMoreForLess_TableCell.get(nCnt) + "		" + GoAir_labl_SpecificOtherItem_CarryMoreForLess_TableCell.get(nCnt+1));
		}

    	return bGoAir_ThisElementValidationStatus;
    }
    
    private boolean GoAir_Validate_SpecificOtherItem_PreBookPreferredSeats(){
    	
    	boolean bGoAir_ThisElementValidationStatus 		= true;

    	GoAir_img_SpecificOtherItem_PreBookPreferredSeats.click();
    	objWait.until(ExpectedConditions.titleContains("Pre-Book Seats"));

		System.out.println("DEBUG:    Pre book preferred seats - details");
		for (int nCnt=0; nCnt < GoAir_lst_labl_SpecificOtherItem_PreBookPreferredSeats_Table_Header.size(); nCnt++){
			WebElement GoAir_PreBookPreferredSeats_OneRowofTable 	=	GoAir_lst_labl_SpecificOtherItem_PreBookPreferredSeats_Table_Header.get(nCnt);
			
			System.out.print("DEBUG:     ");
			for (WebElement GoAir_OneElement : GoAir_PreBookPreferredSeats_OneRowofTable.findElements(By.cssSelector("p[align*='center']"))){
				System.out.print(GoAir_OneElement.getText().replace("\t", "") + "\t\t");
			}
			System.out.print("\n");
		}
		
    	return bGoAir_ThisElementValidationStatus;
    }
    
    private boolean GoAir_Validate_SpecificOtherItem_PartnerRegistration(){
    	
    	boolean bGoAir_ThisElementValidationStatus 		= true;
		Actions GoAir_actn_bldr_HomePage 				= new Actions(this.objWebDriverAbstract);

    	GoAir_lnk_SpecificOtherItem_PartnerRegistration.click();
	    try{objWaitShort.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("zzzzzzzzzzzzzzzz")));}
	    catch(Exception e){}

		String strMainWindowHandle        	= this.objWebDriverAbstract.getWindowHandle();
		Set<String> strSetWindowHandles 	= this.objWebDriverAbstract.getWindowHandles();
		if (strSetWindowHandles.size() <= 1){
			System.out.println("ERROR:    Specific other item validation failed for:" + "Partner Registration");
			objSoftAssert.fail("ERROR:    Specific other item validation failed for:" + "Partner Registration");
			return false;
		}

		Iterator<String> strIteratorPopup 	= strSetWindowHandles.iterator();
		while ( strIteratorPopup.hasNext() ) {
		    String strCurrentWindowHandle 	= strIteratorPopup.next();
		    if(strMainWindowHandle.contains(strCurrentWindowHandle)) continue;

		    // switch to another window
		    this.objWebDriverAbstract.switchTo().window(strCurrentWindowHandle);
		    
			Point GoAir_point_BookFlights_OneWay_Btn 	= null;
			
			GoAir_point_BookFlights_OneWay_Btn 			= this.objWebDriverAbstract.findElements(By.cssSelector("input[type='radio']")).get(0).getLocation();
		    GoAir_actn_bldr_HomePage.moveByOffset(GoAir_point_BookFlights_OneWay_Btn.x, GoAir_point_BookFlights_OneWay_Btn.y).click().click().click().build().perform();
			GoAir_point_BookFlights_OneWay_Btn 			= this.objWebDriverAbstract.findElements(By.cssSelector("input[type='radio']")).get(1).getLocation();
		    GoAir_actn_bldr_HomePage.moveByOffset(GoAir_point_BookFlights_OneWay_Btn.x, GoAir_point_BookFlights_OneWay_Btn.y).click().click().click().build().perform();
		    
	    	this.objWebDriverAbstract.close();		    	
	    	break;    		    
		}
		this.objWebDriverAbstract.switchTo().window(strMainWindowHandle);
		
    	return bGoAir_ThisElementValidationStatus;
    }

    private boolean GoAir_Validate_SpecificOtherItem_AdvertiseWithUs(){
    	
    	boolean bGoAir_ThisElementValidationStatus 		= true;

    	GoAir_lnk_SpecificOtherItem_AdvertiseWithUs.click();
    	objWait.until(ExpectedConditions.titleContains("Advertise With Us"));

		System.out.println("DEBUG:    Advertise With Us - details");
		for (int nCnt=2; nCnt < GoAir_lst_labl_SpecificOtherItem_AdvertiseWithUs_Table_Header.size(); nCnt++){
			WebElement GoAirAdvertiseWithUs_OneRowofTable 	=	GoAir_lst_labl_SpecificOtherItem_AdvertiseWithUs_Table_Header.get(nCnt);
			
			for (WebElement GoAir_OneElement : GoAirAdvertiseWithUs_OneRowofTable.findElements(By.cssSelector("strong"))){
				System.out.println("DEBUG:     " + GoAir_OneElement.getText());
			}
			System.out.print("\n");
		}
		
    	return bGoAir_ThisElementValidationStatus;
    }
    
    
    
    
    
    

    
    
    
    
    
}
