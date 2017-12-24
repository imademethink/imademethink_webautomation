package com.imademethink_webautomation.pkgAirlines_GoAir;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.imademethink_webautomation.pkg0GeneralPageFactory.Page0Abstract;

public class PageGoAirResult0InProgress extends Page0Abstract{

//	private PageGoAirResult2SelectDate 					objLocal_PageGoAirResult1SelectDate = null;
//	private PageGoAirResult3ServicesAndPassengerDetail 	objLocal_PageGoAirResult2ServicesAndPassengerDetail = null;
//	private PageGoAirResult4SeatAssignment 				objLocal_PageGoAirResult3SeatAssignment = null;
//	private PageGoAirResult5Payment 					objLocal_PageGoAirResult4Payment = null;
//	private PageGoAir99General 					objLocal_PageGoAirResult99General = null;

	public PageGoAirResult0InProgress(WebDriver driver) {
		super(driver);
		//System.out.println("DEBUG:    PageGoAirResult0InProgress constructor");
		PageFactory.initElements(driver, this);
//		objLocal_PageGoAirResult1SelectDate					= new PageGoAirResult2SelectDate(driver);
//		objLocal_PageGoAirResult2ServicesAndPassengerDetail	= new PageGoAirResult3ServicesAndPassengerDetail(driver);
//		objLocal_PageGoAirResult3SeatAssignment				= new PageGoAirResult4SeatAssignment(driver);
//		objLocal_PageGoAirResult4Payment  					= new PageGoAirResult5Payment(driver);
//		objLocal_PageGoAirResult99General					= new PageGoAir99General(driver);
	}

	@FindBy(css=".blockUI.blockMsg.blockPage>p>img")
	public WebElement GoAir_img_FlightSearchInProgress;
	public By GoAir_By_img_FlightSearchInProgress = By.cssSelector(".blockUI.blockMsg.blockPage>p>img");
	
	@FindBy(css="#CLARbtnSearch")
	public List<WebElement> GoAir_lst_btn_MultipleEntryMatch_Continue;
	@FindBy(css=".header")
	public List<WebElement> GoAir_lst_labl_SomethingWentWrong;
	
	
    
    // every page object has it's local private wait with fixed 10 sec delay
    @SuppressWarnings("unused")
	private WebDriverWait objWait = new WebDriverWait(this.objWebDriverAbstract, 10);   
  
	
	
	
	
	
	
}
