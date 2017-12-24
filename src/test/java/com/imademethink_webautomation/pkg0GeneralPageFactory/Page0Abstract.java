package com.imademethink_webautomation.pkg0GeneralPageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.imademethink_webautomation.UtilGeneral.ClsGeneralConstants;

public class Page0Abstract extends ClsGeneralConstants{

	protected 	WebDriver objWebDriverAbstract;
	
	public Page0Abstract(WebDriver objWebDriver){
		objWebDriverAbstract 			= objWebDriver;
		objWebDriverAbstractGeneralUse  = objWebDriver;
		//System.out.println("DEBUG:    Page0Abstract added to PageFactory");
		PageFactory.initElements(objWebDriver, this);
	}

	public void navigate_To_URL(String strURLTemp){
		System.out.println("INFO:     Navigating to URL: " + strURLTemp);
		//with navigate() you can forward, back, refresh
		//with get() you can't do that
		
		objWebDriverAbstract.manage().window().maximize();
		objWebDriverAbstract.manage().deleteAllCookies();
		// to avoid opening any default page, first navigate to blank page explicitly
		objWebDriverAbstract.navigate().to(strURLTemp);
		
		objWebDriverAbstract.manage().timeouts().implicitlyWait(
				// Getting the timeout value from properties file directly
				Integer.parseInt(objPropMngr.single_Property_Getter("nWebsiteLoadTime")),
				TimeUnit.SECONDS);
		strCurrentPageURL 	= objWebDriverAbstract.getCurrentUrl() ;
		strCurrentPageTitle = objWebDriverAbstract.getTitle();
	}
	

	
}
