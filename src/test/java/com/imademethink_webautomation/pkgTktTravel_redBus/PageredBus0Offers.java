package com.imademethink_webautomation.pkgTktTravel_redBus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.imademethink_webautomation.pkg0GeneralPageFactory.Page0Abstract;

public class PageredBus0Offers extends Page0Abstract{

	public PageredBus0Offers(WebDriver driver) {
		super(driver);
		//System.out.println("DEBUG:    PageredBus0Offers constructor");
		PageFactory.initElements(driver, this);
		//objLocal_PagecleartripResult2SelectFlight	= new PagecleartripResult2SelectFlight(driver);
		//objLocal_PagecleartripResult3Price		= new PagecleartripResult3Price(driver);
		//objLocal_PagecleartripResult99General 	= new PagecleartripResult99General(driver);
	}
	
	
}