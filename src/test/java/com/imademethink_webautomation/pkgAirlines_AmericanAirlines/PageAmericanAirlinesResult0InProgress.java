package com.imademethink_webautomation.pkgAirlines_AmericanAirlines;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.imademethink_webautomation.pkg0GeneralPageFactory.Page0Abstract;

public class PageAmericanAirlinesResult0InProgress extends Page0Abstract {

	public PageAmericanAirlinesResult0InProgress(WebDriver driver) {
		super(driver);
		//System.out.println("DEBUG:    PageAmericanAirlinesResult0InProgress constructor");
		PageFactory.initElements(driver, this);
	}

	@FindBy(css="p[class='delta']")
	public WebElement AmericanAirlines_labl_FlightSearchInProgress;
	public By AmericanAirlines_By_labl_FlightSearchInProgress = By.className("p[class='delta']");
	@FindBy(css="#CLARbtnSearch")
	public List<WebElement> AmericanAirlines_lst_btn_MultipleEntryMatch_Continue;
	@FindBy(css=".header")
	public List<WebElement> AmericanAirlines_lst_labl_SomethingWentWrong;
	
}
