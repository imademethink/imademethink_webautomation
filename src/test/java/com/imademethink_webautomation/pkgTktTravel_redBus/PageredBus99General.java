package com.imademethink_webautomation.pkgTktTravel_redBus;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.imademethink_webautomation.pkg0GeneralPageFactory.Page0Abstract;

public class PageredBus99General extends Page0Abstract{

	public PageredBus99General(WebDriver driver) {
		super(driver);
		//System.out.println("DEBUG:    PageredBus99General constructor");
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText="Home")	
	private WebElement redBus_lnk_HomePage_Home;
	// home page logo
	@FindAll({
	    @FindBy(css="img[src*='assets/images/logo/redbus_logo.png']"),
	    @FindBy(css="#ctl00_custdiv")
	})
	private WebElement redBus_img_HomePageLogo;
	
	// elements for offers on main page
	@FindBy(css=".top-a")
	private List<WebElement> redBus_lst_img_MainPage_Offers;
	
	// elements for travel smart offer page
	By redBus_ByCssSelector_btn_OffersPage_ClosePopup 		= new ByCssSelector (".close-popup");
	By redBus_ByCssSelector_img_OffersPage_OffersIcon 		= new ByCssSelector (".offer-icn.recent");
	
	// elements for hotels offer page
	By redBus_ByCssSelector_txtbox_OffersPage_HotelSearch	= new ByCssSelector ("#search_key");
	By redBus_ByCssSelector_btn_OffersPage_HotelSearchSubmit= new ByCssSelector ("#search_hotel");	
	
	// elements for ticket cancel
	@FindBy(linkText="Easy Cancel/Refund")
	private WebElement redBus_lnk_TicketCancelRefund;
	@FindBy(css="#ctl00_ContentHolder_TBTicketNo")
	private WebElement redBus_txtbox_TicketCancelRefund_TktNumber;
	@FindBy(css="#ctl00_ContentHolder_TBEMailId")
	private WebElement redBus_txtbox_TicketCancelRefund_EmailId;
	@FindBy(css="#ctl00_ContentHolder_btnSearch")
	private WebElement redBus_btn_TicketCancelRefund_Search;
	@FindBy(css="#ctl00_ContentHolder_Message1")
	private WebElement redBus_btn_TicketCancelRefund_SearchErrorMessage;

	// elements for print ticket
	@FindBy(linkText="Print/SMS Ticket")
	private WebElement redBus_lnk_PrintTkt;
	@FindBy(css="#ctl00_ContentHolder_TBTIN")
	private WebElement redBus_btn_PrintTkt_SearchTicket;
	@FindBy(css="#ctl00_ContentHolder_BtnSubmit")
	private WebElement redBus_btn_PrintTkt_Search;
	@FindBy(css="#ctl00_ContentHolder_Message1_LBMessage")
	private WebElement redBus_btn_PrintTkt_SearchErrorMessage;
	
	// elements for customer care contact
	@FindBy(css=".icon-call.icon-master")
	private WebElement redBus_btn_CustcareContact_MainIcon;
	@FindBy(css="#tollcustcareNum")
	private WebElement redBus_drpdown_CustcareContact_CitiesList;
	
	// elements for top bus routes
	@FindBy(css=".LB.XCN")
	private List<WebElement> redBus_lnk_HomePage_TopBusRoutes;      // first elements in list
	By redBus_ByCssSelector_lnk_HomePage_TopBusRoutes 		= new ByCssSelector (".LB.BMargin");

	// elements for top bus operators
	@FindBy(css=".LB.XCN")
	private List<WebElement> redBus_lnk_HomePage_TopBusOperators;   // second elements in list
	@FindBy(linkText="RTCs>>")
	private WebElement redBus_lnk_HomePage_RTCorGovtBuses;
	By redBus_ByCssSelector_lnk_HomePage_TopBusOpeator 		= new ByCssSelector (".LB.BMargin");	
	
	// elements for RTC or govt buses
	@FindBy(css=".blueTextSmall")
	private List<WebElement> redBus_lst_lnk_HomePage_ActualRTCBusName;
	
	// other elements
    @FindBy(linkText = "Sign Up / Sign In")
	private WebElement redBus_lnk_UserSection_SignUpSignIn;
    @FindBy(linkText = "About redBus")
	private WebElement redBus_lnk_UserSection_AboutredBus;
	@FindBy(css=".ibibogroup-grey")
	private WebElement redBus_lnk_HomePage_ibibogroup;
	@FindBy(css=".goibibo-grey")
	private WebElement redBus_lnk_HomePage_goibibo;
	@FindBy(css=".icon-call.icon-master")
	private WebElement redBus_lnk_HomePage_TollFreeNumber;

    @FindBy(id="zzzzzzz")
    private WebElement redBus_somejunkelement;
    
    // every page object has it's local private wait with fixed 10 sec delay
    private WebDriverWait objWait 		= new WebDriverWait(this.objWebDriverAbstract, 10);
    @SuppressWarnings("unused")
	private WebDriverWait objWaitShort 	= new WebDriverWait(this.objWebDriverAbstract, 3);
	
    private boolean redBus_Validate_OfferSection_TravelSmart(){
    	
		boolean bredBus_ThisElementValidationStatus 		= false;

		WebDriver objWebDriverAbstractTemp 			= objWebDriverAbstractGeneralUse;
		String redBus_ParentWindowHandle 			= objWebDriverAbstractTemp.getWindowHandle();
		Set<String> redBus_set_AllWindowHandles 	= objWebDriverAbstractTemp.getWindowHandles();
		Iterator<String> redBus_itr_WindowHandle 	= redBus_set_AllWindowHandles.iterator();
		
		while (redBus_itr_WindowHandle.hasNext()){
				objWebDriverAbstractTemp.switchTo().window(redBus_itr_WindowHandle.next());
				if (objWebDriverAbstractTemp.getWindowHandle().contains(redBus_ParentWindowHandle)) continue;
				
				objWebDriverAbstractTemp.findElement(redBus_ByCssSelector_btn_OffersPage_ClosePopup).click();
				if (objWebDriverAbstractTemp.findElements(redBus_ByCssSelector_img_OffersPage_OffersIcon).size() > 0 ){
					bredBus_ThisElementValidationStatus = true;
				}

				objWebDriverAbstractTemp.close();
		}
		objWebDriverAbstractTemp.switchTo().window(redBus_ParentWindowHandle);

		return bredBus_ThisElementValidationStatus;
    }
  
    private boolean redBus_Validate_OfferSection_OnHotels(){
    	
 		boolean bredBus_ThisElementValidationStatus 		= true;

 		WebDriver objWebDriverAbstractTemp 			= objWebDriverAbstractGeneralUse;
 		String redBus_ParentWindowHandle 			= objWebDriverAbstractTemp.getWindowHandle();
 		Set<String> redBus_set_AllWindowHandles 	= objWebDriverAbstractTemp.getWindowHandles();
 		Iterator<String> redBus_itr_WindowHandle 	= redBus_set_AllWindowHandles.iterator();
 		
 		while (redBus_itr_WindowHandle.hasNext()){
 				objWebDriverAbstractTemp.switchTo().window(redBus_itr_WindowHandle.next());
 				if (objWebDriverAbstractTemp.getWindowHandle().contains(redBus_ParentWindowHandle)) continue;
 				
 				objWebDriverAbstractTemp.findElement(redBus_ByCssSelector_txtbox_OffersPage_HotelSearch).sendKeys("Hotels in Goa");
 				objWebDriverAbstractTemp.findElement(redBus_ByCssSelector_btn_OffersPage_HotelSearchSubmit).click();
 				
 				objWebDriverAbstractTemp.close();
 		}
 		objWebDriverAbstractTemp.switchTo().window(redBus_ParentWindowHandle);

 		return bredBus_ThisElementValidationStatus;
     }
    
    public boolean redBus_Validate_OfferSection_For(String strOfferSection, String[] strArrRandomDepaartAndArriveCityNames_Global){

		boolean bredBus_ThisElementValidationStatus 		= true;

		switch(strOfferSection){
			case "Travel smart":
				redBus_lst_img_MainPage_Offers.get(0).click();
				bredBus_ThisElementValidationStatus = redBus_Validate_OfferSection_TravelSmart();
				break;
			case "On Hotels":
				redBus_lst_img_MainPage_Offers.get(1).click();
				bredBus_ThisElementValidationStatus = redBus_Validate_OfferSection_OnHotels();
				break;
			default :
				bredBus_ThisElementValidationStatus = false;
				System.out.println("ERROR:    Unsupported offer section to validate: " + strOfferSection);
				objSoftAssert.fail("ERROR:    Unsupported offer section to validate: " + strOfferSection);
				break;
		}

		return bredBus_ThisElementValidationStatus;
	}

    private boolean redBus_Validate_SupportFunctionality_CancelTicketRefund(){
    	
		boolean bredBus_ThisElementValidationStatus 		= true;
		redBus_lnk_TicketCancelRefund.click();
		redBus_txtbox_TicketCancelRefund_TktNumber.sendKeys("ABC0123");
		redBus_txtbox_TicketCancelRefund_EmailId.sendKeys("ABC@DEF.com");
		redBus_btn_TicketCancelRefund_Search.click();

		objWait.until(ExpectedConditions.visibilityOf(redBus_btn_TicketCancelRefund_SearchErrorMessage));
		System.out.println("DEBUG:    Following invalid input following error message shown: " + 
											redBus_btn_TicketCancelRefund_SearchErrorMessage.getText());
	
		return bredBus_ThisElementValidationStatus;
    }
  
    private boolean redBus_Validate_SupportFunctionality_PrintTicketSMS(){
    	
		boolean bredBus_ThisElementValidationStatus 		= true;
		redBus_lnk_PrintTkt.click();
		redBus_btn_PrintTkt_SearchTicket.sendKeys("ABC123");
		redBus_btn_PrintTkt_Search.click();
		objWait.until(ExpectedConditions.visibilityOf(redBus_btn_PrintTkt_SearchErrorMessage));
		System.out.println("DEBUG:    Following invalid input following error message shown: " + 
											redBus_btn_PrintTkt_SearchErrorMessage.getText());
	
		return bredBus_ThisElementValidationStatus;
    }
    
    private boolean redBus_Validate_SupportFunctionality_CustomerCareContact(){
    	
		boolean bredBus_ThisElementValidationStatus 		= true;
		redBus_btn_CustcareContact_MainIcon.click();
		objWait.until(ExpectedConditions.visibilityOf(redBus_drpdown_CustcareContact_CitiesList));
		
		redBus_drpdown_CustcareContact_CitiesList.click();
		redBus_drpdown_CustcareContact_CitiesList.click();
	
		return bredBus_ThisElementValidationStatus;
    }
    
    public boolean redBus_Validate_Support_Functionality_For(String strSupportFunctionalityTitle){
    	
		boolean bredBus_ThisElementValidationStatus 		= true;

		switch(strSupportFunctionalityTitle){
			case "Cancel ticket and refund":
				bredBus_ThisElementValidationStatus = redBus_Validate_SupportFunctionality_CancelTicketRefund();
				break;
			case "Print ticket / SMS":
				bredBus_ThisElementValidationStatus = redBus_Validate_SupportFunctionality_PrintTicketSMS();
				break;
			case "Customer care contact":
				bredBus_ThisElementValidationStatus = redBus_Validate_SupportFunctionality_CustomerCareContact();
				break;
			default :
				bredBus_ThisElementValidationStatus = false;
				System.out.println("ERROR:    Unsupported offer section to validate: " + strSupportFunctionalityTitle);
				objSoftAssert.fail("ERROR:    Unsupported offer section to validate: " + strSupportFunctionalityTitle);
				break;
		}

		return bredBus_ThisElementValidationStatus;
    }
	
    public boolean redBus_Validate_Specific_Other_Items(String strSpecificOtherItems){

		boolean bredBus_ThisElementValidationStatus 		= true;

		switch(strSpecificOtherItems){
		case "lnk__Top Bus routes names":
			bredBus_ThisElementValidationStatus = redBus_Validate_SpecificOtherItem_TopBusRouteNames();
			break;
		case "lnk__Bus operator names list":
			bredBus_ThisElementValidationStatus = redBus_Validate_SpecificOtherItem_RouteOperatorCheckList();
			break;
		case "lnk__RTC or regional transport corporation or government transport agencies list check":
			bredBus_ThisElementValidationStatus = redBus_Validate_SpecificOtherItem_RTCorGovtOperatorCheckList();
			break;
		default :
			bredBus_ThisElementValidationStatus = false;
			System.out.println("ERROR:    Unsupported specific other item to validate: " + strSpecificOtherItems);
			objSoftAssert.fail("ERROR:    Unsupported specific other item to validate: " + strSpecificOtherItems);
			break;
		}

		return bredBus_ThisElementValidationStatus;
    }

	public boolean redBus_validate_This_Element(String strThisElement){

		boolean bredBus_ThisElementValidationStatus 		= false;

		switch (strThisElement){
			case "btn__Home":
				bredBus_ThisElementValidationStatus = redBus_lnk_HomePage_Home.isDisplayed(); 
				break;
			case "img__redBus_logo":
				bredBus_ThisElementValidationStatus = redBus_img_HomePageLogo.isDisplayed(); 
				break;
			case "lnk__Print/SMS_Ticket":
				bredBus_ThisElementValidationStatus = redBus_lnk_PrintTkt.isDisplayed(); 
				break;
			case "lnk__EasyCancel/Refund":
				bredBus_ThisElementValidationStatus = redBus_lnk_TicketCancelRefund.isDisplayed(); 
				break;
//			case "lnk__Sign Up":
//			case "lnk__Sign In":
//				bredBus_ThisElementValidationStatus = redBus_lnk_UserSection_SignUpSignIn.isDisplayed(); 
//				break;
			case "lnk__About redBus":
				bredBus_ThisElementValidationStatus = redBus_lnk_UserSection_AboutredBus.isDisplayed(); 
				break;
			case "labl__ibibo_Group":
				bredBus_ThisElementValidationStatus = redBus_lnk_HomePage_ibibogroup.isDisplayed(); 
				break;
			case "labl_goibibo":
				bredBus_ThisElementValidationStatus = redBus_lnk_HomePage_goibibo.isDisplayed(); 
				break;
			case "drpdwn_Toll_Number_list":
				bredBus_ThisElementValidationStatus = redBus_lnk_HomePage_TollFreeNumber.isDisplayed(); 
				break;
	    	default:
				objSoftAssert.fail("ERROR:    Unsupported common webelement to validate: " + strThisElement);
				System.out.println("ERROR:    Unsupported common webelement to validate: " + strThisElement);
	    		break;
		}
		
		return bredBus_ThisElementValidationStatus;
	}
	

    
    
    
    // helper methods
    private boolean redBus_Validate_SpecificOtherItem_TopBusRouteNames(){
		boolean bredBus_ThisElementValidationStatus 		= true;

		List<WebElement> redBus_lst_lnk_WebElement_General = redBus_lnk_HomePage_TopBusRoutes.get(0).findElements(redBus_ByCssSelector_lnk_HomePage_TopBusRoutes);

		System.out.println("DEBUG:    Top bus route names are: ");

		for (WebElement redBus_lnk_WebElement_General : redBus_lst_lnk_WebElement_General){
			System.out.println("DEBUG:     " + redBus_lnk_WebElement_General.getText());}

		return bredBus_ThisElementValidationStatus;
    }
    
    private boolean redBus_Validate_SpecificOtherItem_RouteOperatorCheckList(){
		boolean bredBus_ThisElementValidationStatus 		= true;

		List<WebElement> redBus_lst_lnk_WebElement_General = redBus_lnk_HomePage_TopBusRoutes.get(1).findElements(redBus_ByCssSelector_lnk_HomePage_TopBusRoutes);

		System.out.println("DEBUG:    Top bus route names are: ");

		for (WebElement redBus_lnk_WebElement_General : redBus_lst_lnk_WebElement_General){
			System.out.println("DEBUG:     " + redBus_lnk_WebElement_General.getText());}

		return bredBus_ThisElementValidationStatus;
    }    
    
    private boolean redBus_Validate_SpecificOtherItem_RTCorGovtOperatorCheckList(){
		boolean bredBus_ThisElementValidationStatus 		= true;
		redBus_lnk_HomePage_RTCorGovtBuses.click();
		
		try{objWait.until(ExpectedConditions.numberOfWindowsToBe(2));
	    // cash back offer window available
		WebDriver objWebDriverAbstractTemp 		= this.objWebDriverAbstract;
		String redBus_ParentWindowHandle 		= objWebDriverAbstractTemp.getWindowHandle();
		Set<String> redBus_set_AllWindowHandles = objWebDriverAbstractTemp.getWindowHandles();
		Iterator<String> redBus_itr_WindowHandle = redBus_set_AllWindowHandles.iterator();
		
		while (redBus_itr_WindowHandle.hasNext()){
				objWebDriverAbstractTemp.switchTo().window(redBus_itr_WindowHandle.next());
				if (objWebDriverAbstractTemp.getWindowHandle().contains(redBus_ParentWindowHandle)) continue;
				
				if(objWebDriverAbstractTemp.getTitle().contains("RTC Bus Operators in India")) {
					System.out.println("DEBUG:    RTC or Govt bus optr check title is: " + objWebDriverAbstractTemp.getTitle());
					
					for (WebElement redBus_General_Element : redBus_lst_lnk_HomePage_ActualRTCBusName){
						System.out.println("DEBUG:     " + redBus_General_Element.getText());
					}
				}

				objWebDriverAbstractTemp.close();
		}
		objWebDriverAbstractTemp.switchTo().window(redBus_ParentWindowHandle);
		}catch(Exception e){
			bredBus_ThisElementValidationStatus = false;
		}

		return bredBus_ThisElementValidationStatus;
    }
    
    
    
    
    
    
	
	
}
