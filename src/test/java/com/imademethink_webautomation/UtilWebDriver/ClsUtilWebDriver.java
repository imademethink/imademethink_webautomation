package com.imademethink_webautomation.UtilWebDriver;

import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.imademethink_webautomation.UtilGeneral.ClsGeneralInitTerminateAndOtherUtil;
import com.imademethink_webautomation.pkg0GeneralPageFactory.Page0Abstract;
import com.imademethink_webautomation.pkgAirlines_AmericanAirlines.PageAmericanAirlines99General;
import com.imademethink_webautomation.pkgAirlines_AmericanAirlines.PageAmericanAirlinesMain;
import com.imademethink_webautomation.pkgAirlines_AmericanAirlines.PageAmericanAirlinesResult0InProgress;
import com.imademethink_webautomation.pkgAirlines_AmericanAirlines.PageAmericanAirlinesResult1SelectDate;
import com.imademethink_webautomation.pkgAirlines_AmericanAirlines.PageAmericanAirlinesResult2SelectFlight;
import com.imademethink_webautomation.pkgAirlines_AmericanAirlines.PageAmericanAirlinesResult3Price;
import com.imademethink_webautomation.pkgAirlines_AmericanAirlines.PageAmericanAirlinesResult4PassengerDetail;
import com.imademethink_webautomation.pkgAirlines_AmericanAirlines.PageAmericanAirlinesResult5Payment;
import com.imademethink_webautomation.pkgAirlines_GoAir.PageGoAir0PlanMyTrip;
import com.imademethink_webautomation.pkgAirlines_GoAir.PageGoAir1Promotions;
import com.imademethink_webautomation.pkgAirlines_GoAir.PageGoAir2Services;
import com.imademethink_webautomation.pkgAirlines_GoAir.PageGoAir99General;
import com.imademethink_webautomation.pkgAirlines_GoAir.PageGoAirMain;
import com.imademethink_webautomation.pkgAirlines_GoAir.PageGoAirResult0InProgress;
import com.imademethink_webautomation.pkgAirlines_GoAir.PageGoAirResult2SelectDate;
import com.imademethink_webautomation.pkgAirlines_GoAir.PageGoAirResult3ServicesAndPassengerDetail;
import com.imademethink_webautomation.pkgAirlines_GoAir.PageGoAirResult4SeatAssignment;
import com.imademethink_webautomation.pkgAirlines_GoAir.PageGoAirResult5Payment;
import com.imademethink_webautomation.pkgTktTravel_cleartrip.Pagecleartrip99General;
import com.imademethink_webautomation.pkgTktTravel_cleartrip.PagecleartripMain;
import com.imademethink_webautomation.pkgTktTravel_cleartrip.PagecleartripResult1SelectFlight;
import com.imademethink_webautomation.pkgTktTravel_cleartrip.PagecleartripResult2SimpleSteps;
import com.imademethink_webautomation.pkgTktTravel_cleartrip.PagecleartripResult3Payment;
import com.imademethink_webautomation.pkgTktTravel_redBus.PageredBus0Offers;
import com.imademethink_webautomation.pkgTktTravel_redBus.PageredBus1SupportFunctionality;
import com.imademethink_webautomation.pkgTktTravel_redBus.PageredBus99General;
import com.imademethink_webautomation.pkgTktTravel_redBus.PageredBusMain;
import com.imademethink_webautomation.pkgTktTravel_redBus.PageredBusResult1SelectTravelsnSeat;
import com.imademethink_webautomation.pkgTktTravel_redBus.PageredBusResult2UserDetailnPayment;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class ClsUtilWebDriver extends ClsGeneralInitTerminateAndOtherUtil{

	public ClsUtilWebDriver() {
		// empty for now
	}

	// REAL Webdriver
	protected static WebDriver REAL_WEB_DRIVER = null;

	public void initilize_Web_Driver(String strUserInputBrowserType) {

		//System.out.println("DEBUG:    Initilize webdriver of type: " + strUserInputBrowserType);

		// init static driver type
		strGlobalDriverType = strUserInputBrowserType.toLowerCase();

		// Webdriver init
		REAL_WEB_DRIVER 	= instanciate_Web_Driver();
	}

	public void initilize_Abstact_Page_Object() {

		//System.out.println("DEBUG:    Initilize abstract page object");

		// Page objects and page factory init
		objPage0Abstract 	= new Page0Abstract(REAL_WEB_DRIVER);
	}
	
	public void initilize_Specific_Page_Objects_For(String strWebsiteName) {

		//System.out.println("DEBUG:    Initilize specific page objects for: " + strWebsiteName + "<--");

		strWebsiteName 		= strWebsiteName.toLowerCase();

		switch (strWebsiteName) {
		case "americanairlines":
		case "AmericanAirlines":
			objPageAmericanAirlinesMain						= new PageAmericanAirlinesMain(REAL_WEB_DRIVER);
			objPageAmericanAirlines99General				= new PageAmericanAirlines99General(REAL_WEB_DRIVER);
			objPageAmericanAirlinesResult0InProgress		= new PageAmericanAirlinesResult0InProgress(REAL_WEB_DRIVER);
			objPageAmericanAirlinesResult1SelectDate		= new PageAmericanAirlinesResult1SelectDate(REAL_WEB_DRIVER);
			objPageAmericanAirlinesResult2SelectFlight		= new PageAmericanAirlinesResult2SelectFlight(REAL_WEB_DRIVER);
			objPageAmericanAirlinesResult3Price				= new PageAmericanAirlinesResult3Price(REAL_WEB_DRIVER);
			objPageAmericanAirlinesResult4PassengerDetail	= new PageAmericanAirlinesResult4PassengerDetail(REAL_WEB_DRIVER);
			objPageAmericanAirlinesResult5Payment			= new PageAmericanAirlinesResult5Payment(REAL_WEB_DRIVER);
			break;
		case "goair":
		case "GoAir":
			objPageGoAirMain								= new PageGoAirMain(REAL_WEB_DRIVER);
			objPageGoAirPage0PlanMyTrip						= new PageGoAir0PlanMyTrip(REAL_WEB_DRIVER);
			objPageGoAirPage1Promotions						= new PageGoAir1Promotions(REAL_WEB_DRIVER);
			objPageGoAirPage2Services						= new PageGoAir2Services(REAL_WEB_DRIVER);
			objPageGoAir99General							= new PageGoAir99General(REAL_WEB_DRIVER);
			objPageGoAirResult0InProgress					= new PageGoAirResult0InProgress(REAL_WEB_DRIVER);
			objPageGoAirResult2SelectDate					= new PageGoAirResult2SelectDate(REAL_WEB_DRIVER);
			objPageGoAirResult3ServicesAndPassengerDetail	= new PageGoAirResult3ServicesAndPassengerDetail(REAL_WEB_DRIVER);
			objPageGoAirResult4SeatAssignment				= new PageGoAirResult4SeatAssignment(REAL_WEB_DRIVER);
			objPageGoAirResult5Payment						= new PageGoAirResult5Payment(REAL_WEB_DRIVER);
			break;
		case "cleartrip":
			objPagecleartripMain							= new PagecleartripMain(REAL_WEB_DRIVER);
			objPagecleartripResult1SelectFlight				= new PagecleartripResult1SelectFlight(REAL_WEB_DRIVER);
			objPagecleartripResult2SimpleSteps				= new PagecleartripResult2SimpleSteps(REAL_WEB_DRIVER);
			objPagecleartripResult3Payment					= new PagecleartripResult3Payment(REAL_WEB_DRIVER);
			objPagecleartrip99General						= new Pagecleartrip99General(REAL_WEB_DRIVER);
			break;
		case "redbus":
		case "redBus":
			objPageredBusMain								= new PageredBusMain(REAL_WEB_DRIVER);
			objPageredBusResult1SelectTravelsnSeat			= new PageredBusResult1SelectTravelsnSeat(REAL_WEB_DRIVER);
			objPageredBusResult2UserDetailnPayment			= new PageredBusResult2UserDetailnPayment(REAL_WEB_DRIVER);
			objPageredBus0Offers							= new PageredBus0Offers(REAL_WEB_DRIVER);
			objPageredBus1SupportFunctionality				= new PageredBus1SupportFunctionality(REAL_WEB_DRIVER);
			objPageredBus99General							= new PageredBus99General(REAL_WEB_DRIVER);
			break;
		default:
			System.out.println("ERROR:    Unsupported website to initilize specific page objects: " + strWebsiteName);
			break;
		}
	}

	public static WebDriver instanciate_Web_Driver() {

		//System.out.println("DEBUG:    Instanciating web driver for type: " + strGlobalDriverType);

		String browserDriverBasePath = new File("").getAbsoluteFile().toString() + 
																	File.separator + "src" +
																	File.separator + "test" +
																	File.separator + "browserDriver" +
																	File.separator;

		int nnDriverInitTryCount = 0;
		for (; nnDriverInitTryCount < 1 ; nnDriverInitTryCount++){
			try{
				if (null != REAL_WEB_DRIVER) {return REAL_WEB_DRIVER;}

				if (strGlobalDriverType.contains("chrome")) {
					    String browserDriverBasePathChrome 	= browserDriverBasePath + "chromedriver.exe";
						File chromeDriverExecutable 					= new File(browserDriverBasePathChrome);
					    chromeDriverExecutable.setExecutable(true);
						System.setProperty("webdriver.chrome.driver",browserDriverBasePathChrome);
						
						ChromeOptions objChromeOptions 		= new ChromeOptions();
						objChromeOptions.addArguments("--incognito");
						DesiredCapabilities chromeCapabilities = DesiredCapabilities.chrome();
						chromeCapabilities.setCapability(ChromeOptions.CAPABILITY, objChromeOptions);
						REAL_WEB_DRIVER 									= new ChromeDriver(chromeCapabilities);
						
				} else if (strGlobalDriverType.contains("internet explorer")) {
					    String browserDriverBasePathIE 			= browserDriverBasePath + "iedriver.exe";
					    DesiredCapabilities ieCapabilities 				= DesiredCapabilities.internetExplorer();
					    ieCapabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
					    System.setProperty("webdriver.ie.driver", browserDriverBasePathIE);
					    REAL_WEB_DRIVER 									= new InternetExplorerDriver(ieCapabilities);
				} else if (strGlobalDriverType.contains("safari")) {
						// REAL_WEB_DRIVER 	= new SafariDriver();
				} else if (strGlobalDriverType.contains("opera")) {
						// REAL_WEB_DRIVER 	= new OperaDriver();
				} else if (strGlobalDriverType.contains("html unit driver")) {
						// Unit driver or headless driver
						REAL_WEB_DRIVER 	= new HtmlUnitDriver();
				} else if (strGlobalDriverType.contains("android")) {
						// REAL_WEB_DRIVER 	= new androidDriver();
				}

			}catch(Exception e){
				System.out.println("DEBUG:    Exception occurred while invoking specific browser. Trial # " + (nnDriverInitTryCount + 1));
			}
		}

		if (null == REAL_WEB_DRIVER){
			System.out.println("INFO:    UNABLE TO INVKOE SPECIFIC BROWSER IN 3 ATTEMPTS. THIS TEST IS STOPPED.");
			Assert.fail();
		}
		return REAL_WEB_DRIVER;
	}	

	public void terminate_Specific_Page_Objects_For(String strPortalName) {

		//System.out.println("DEBUG:    Terminate specific page objects");

		strPortalName 		= strPortalName.toLowerCase();

		// This is difficult to track as there can be many page objects
		// Need to think of any other simple way to do that
//		switch (strPortalName) {
//		case "paytm":
//			System.out.println("DEBUG:    Terminate specific page objects for: " + strPortalName);
//			objPagePaytmMain 			= null;
//			objPagePaytmRecharge 		= null;
//			objPagePaytmSellonpaytm 	= null;
//			break;
//		case "quikr":
//			System.out.println("DEBUG:    Terminate specific page objects for: " + strPortalName);
//			objPageQuikrMain 			= null;
//			objPageQuikrSearchResult 	= null;
//			break;
//		default:
//			System.out.println("ERROR:    Unsupported website to terminate specific page objects: " + strPortalName);
//			break;
//		}
	}
	
	public void terminate_Abstact_Page_Object() {

		//System.out.println("DEBUG:    Terminate abstract page object");

		// Terminate abstract page object
		objPage0Abstract 	= null;
	}
	
	public void terminate_Webdriver() {

		//System.out.println("DEBUG:    Terminate webdriver");

		// accidentally if web driver is not initialized then return
		if (null == REAL_WEB_DRIVER) { System.out.println("ERROR:    Null web driver instance found");return; }

		// Webdriver terminate
		REAL_WEB_DRIVER.manage().deleteAllCookies();
		
		if (strGlobalDriverType.contains("internet explorer")) {
			// session clean up
			// ieCapabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION,
			// true);
		}
		REAL_WEB_DRIVER.close();
		REAL_WEB_DRIVER.quit();
		REAL_WEB_DRIVER = null;
		
		// Finally to increase readibility add extra lines
		System.out.println("===================================================\n\n\n");
	}
	
	// calculates home page load time and compares with reference value
	public boolean compare_Actual_and_Reference_HomePage_Load_Time(){
		System.out.println("DEBUG:    Calculating home page load time for: " + strCurrentWebsiteUnderTest);
		
		boolean bLocalTestResultStatus = false;
		// convert to milliseconds
		long nlRefHomePageLoadTime	= 1000 * Integer.parseInt(objPropMngr.single_Property_Getter("nWebsiteLoadTime"));
		
		WebDriverWait objLocalWait	= new WebDriverWait( objWebDriverAbstractGeneralUse, (nlRefHomePageLoadTime * 2) );
		
		long 	nlTimeCounterStart = System.currentTimeMillis();
		//objWebDriverAbstractGeneralUse.get(strCurrentWebsiteUnderTest);
		objWebDriverAbstractGeneralUse.get(strCurrentPageURL);
		objLocalWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(     (By.cssSelector("*"))             )             );
		long 	nlTimeCounterEnd = System.currentTimeMillis();
		
		long nlCurrentHomePageLoadTime	= nlTimeCounterEnd - nlTimeCounterStart;
		
		if ( nlRefHomePageLoadTime >= nlCurrentHomePageLoadTime ){
			System.out.println("DEBUG:    Website loaded with all elements within reference time: " + nlRefHomePageLoadTime/1000 + " seconds");
			System.out.println("RESULT::PASS");	bLocalTestResultStatus = true;
			
		}else{
			objSoftAssert.fail("ERROR:    Total time to load homw page is NOT within reference limit. Time taken is: " + nlCurrentHomePageLoadTime);
			System.out.println("RESULT::FAIL");
			System.out.println("ERROR:    Total time to load homw page is NOT within reference limit. Time taken is: " + nlCurrentHomePageLoadTime);
		}
		
		return bLocalTestResultStatus;
    }
	
	public boolean handle_General_Popup(String strPopupType_and_Action){
		
		System.out.println("DEBUG:    Popup handling begins");
		String strPopupType   			= splitThisString(strPopupType_and_Action," __ ")[0];
		String strPopupAction 			= splitThisString(strPopupType_and_Action," __ ")[1];

		if(strPopupType.contains("no_popup") && (objWebDriverAbstractGeneralUse.getWindowHandles().size() == 1)  ){
			System.out.println("DEBUG:    No actual popup windows found.");
			return true;
		}

		// pop up types may be required in future
//		case "New Browser Window":
//		case "New Browser Tab":
//		case "New Message Window":
//		case "Java Script Alert":
//		case "Java Script Delayed Alert":
		
		boolean bLocalTestResultStatus 		= false;
		String strMainWindowHandle        	= objWebDriverAbstractGeneralUse.getWindowHandle();
		Set<String> strSetMainWindowHandles = objWebDriverAbstractGeneralUse.getWindowHandles();
		Iterator<String> strIteratorPopup 	= strSetMainWindowHandles.iterator();

		while ( strIteratorPopup.hasNext() ) {
		    String strCurrentWindowHandle = strIteratorPopup.next();
		    if(!strMainWindowHandle.equals(strCurrentWindowHandle))     	strSetMainWindowHandles.add(strCurrentWindowHandle); 
		}

		switch (strPopupAction){
			case "save_screenshot_remove_all_popup":
				// coming soon
				// System.out.println("DEBUG:    Pop up screen shot saved");
				// System.out.println("DEBUG:    Removed single pop up");
				// iterate through each handle, take screen shot and close each handle one by one
				// objWebDriverAbstractGeneralUse.close();
				bLocalTestResultStatus = true;
				break;
			case "no_screenshot":   // in case remove pop up is not mentioned
			case "no_screenshot_remove_all_popup":
				// coming soon
				// System.out.println("DEBUG:    Removed single pop up");
				// iterate through each handle, NO screen shot and close each handle one by one
				// objWebDriverAbstractGeneralUse.close();
				bLocalTestResultStatus = true;
				break;
			default:
				objSoftAssert.fail("ERROR:    This popup action is not supported: " + strPopupAction);
				System.out.println("ERROR:    This popup action is not supported: " + strPopupAction);
				break;
		}
		    
		return bLocalTestResultStatus;
	}

	public boolean check_Broken_Links(){
		System.out.println("DEBUG:    Verifying broken links for URLs and images");

		URL objOneUrl 						= null;
		HttpURLConnection objHttpConnection = null;
		int nHttpResponseCode				= -1;
		int nToalBrokenKinks				= 0;
		List<WebElement> lstWebElementsLinks	  = objWebDriverAbstractGeneralUse.findElements(By.tagName("a"));
		                 lstWebElementsLinks.addAll(objWebDriverAbstractGeneralUse.findElements(By.tagName("img")));
		System.out.println("DEBUG:    Total number of links found are: " + lstWebElementsLinks.size());
		
        for (WebElement objOneLink : lstWebElementsLinks){
        	nHttpResponseCode = -1;
        	if(objOneLink.getAttribute("href") != null){
        		try {
        			//Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("43.88.64.10",8080));
					objOneUrl 			= new URL(objOneLink.getAttribute("href").trim());
					//objHttpConnection 	= (HttpURLConnection) objOneUrl.openConnection(proxy);
					objHttpConnection 	= (HttpURLConnection) objOneUrl.openConnection();
					objHttpConnection.setRequestMethod("GET");
					objHttpConnection.connect();
					nHttpResponseCode  	= objHttpConnection.getResponseCode();	        
				    objHttpConnection.disconnect();
				} catch (Exception e) {}

        		if (nHttpResponseCode != 200){
        			nToalBrokenKinks++;
        			System.out.println("ERROR:     Following URL is either incorrect or malformed: " + nHttpResponseCode + " " +
        								objOneLink.getAttribute("href").toString());
        		}
        		
        		objHttpConnection		= null;
        		objOneUrl 				= null;
        	}
        }
        
        // objSoftAssert.fail("");
		System.out.println("DEBUG:    Total number of broken links found are: " + nToalBrokenKinks + " out of " + lstWebElementsLinks.size() );
		return true;
    }
	
	public boolean check_Broken_Images(){
		System.out.println("DEBUG:    Verifying broken images");

		URL objOneUrl 							= null;
		HttpURLConnection objHttpConnection 	= null;
		int nHttpResponseCode					= -1;
		int nToalBrokenImages 					= 0;
		List<WebElement> lstWebElementsImages	= objWebDriverAbstractGeneralUse.findElements(By.tagName("img"));
		System.out.println("DEBUG:    Total number of images found are: " + lstWebElementsImages.size());
		
        for (WebElement objOneImage : lstWebElementsImages){
        	nHttpResponseCode = -1;
        	if(objOneImage.getAttribute("src") != null){
        		try {
        			//Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("43.88.64.10",8080));
					objOneUrl 			= new URL(objOneImage.getAttribute("src").trim());
					//objHttpConnection 	= (HttpURLConnection) objOneUrl.openConnection(proxy);
					objHttpConnection 	= (HttpURLConnection) objOneUrl.openConnection();
					objHttpConnection.setRequestMethod("GET");
					objHttpConnection.connect();
					nHttpResponseCode  	= objHttpConnection.getResponseCode();	        
				    objHttpConnection.disconnect();
				} catch (Exception e) {}

        		if (nHttpResponseCode != 200){
        			nToalBrokenImages++;
        			System.out.println("ERROR:     Following image is either incorrect or malformed: " + nHttpResponseCode + " " + 
        								objOneImage.getAttribute("src").toString());
        		}
        		
        		objHttpConnection		= null;
        		objOneUrl 				= null;
        	}
        }
        
        // objSoftAssert.fail("");
		System.out.println("DEBUG:    Total number of broken broken images found are: " + nToalBrokenImages + " out of " + lstWebElementsImages.size() );
		return true;
    }

	public boolean check_All_Frame_Titles(){
		
		System.out.println("DEBUG:    Verifying titles of all frames");

        List<WebElement> lst_iFrames = objWebDriverAbstractGeneralUse.findElements(By.tagName("iframe"));
        System.out.println("DEBUG:    Total number of iFrames found are: " + lst_iFrames.size());
    	
    	for (WebElement oneFrame: lst_iFrames){
    		objWebDriverAbstractGeneralUse.switchTo().frame(oneFrame);
    		System.out.println("DEBUG:     Title of current iFrame is: " + objWebDriverAbstractGeneralUse.getTitle());
    		objWebDriverAbstractGeneralUse.switchTo().defaultContent();
    	}
        // objSoftAssert.fail("");
		return true;
	}
	
	public boolean AmericanAirlines_Verify_MobileAppWebsite_Navigation_and_Download_Installer(
			String strAppDownloadSectionURL, String strMobileAppType){
		System.out.println("DEBUG:    Verifying navigation to mobile app site and download for AmericanAirlines");
				
		boolean bLocalTestResultStatus = false;
		objWebDriverAbstractGeneralUse.navigate().to(strAppDownloadSectionURL);
		objWebDriverAbstractGeneralUse.manage().timeouts().implicitlyWait( 
				Integer.parseInt(objPropMngr.single_Property_Getter("nWebsiteLoadTime")),
				TimeUnit.SECONDS);

		// REMEMBER THERE SHOULD NOT BE ANY BREAK STATEMENTS since need to validate all cases
		switch (strMobileAppType){
			case "ios":
				if(objWebDriverAbstractGeneralUse.findElement(By.partialLinkText("Download from iTunes")).isDisplayed()){
					objWebDriverAbstractGeneralUse.navigate().to(
							objWebDriverAbstractGeneralUse.findElement(By.partialLinkText("Download from iTunes")).getAttribute("href")  );
					objWebDriverAbstractGeneralUse.manage().timeouts().implicitlyWait( 
							Integer.parseInt(objPropMngr.single_Property_Getter("nWebsiteLoadTime")),
							TimeUnit.SECONDS);
					if (objWebDriverAbstractGeneralUse.getCurrentUrl().contains("itunes.apple.com") &&
							objWebDriverAbstractGeneralUse.findElement(By.xpath("//div[contains(@id, 'title')]/div/h1")).getText().contains("American Airlines")){
						System.out.println("DEBUG:    Corresponding mobile application is found in Apple store");
						// coming soon
						// Mobile application downloading procedure
						bLocalTestResultStatus = true;
					}else{
						objSoftAssert.fail("ERROR:    Unable to navigate to Apple app store");
						System.out.println("ERROR:    Unable to navigate to Apple app store");
					}
					// navigate back to earlier page
					objWebDriverAbstractGeneralUse.navigate().back();
					objWebDriverAbstractGeneralUse.manage().timeouts().implicitlyWait( 
							Integer.parseInt(objPropMngr.single_Property_Getter("nWebsiteLoadTime")),
							TimeUnit.SECONDS);
					
				}else{
					objSoftAssert.fail("ERROR:    Link to Apple store mobile app is not found");
					System.out.println("ERROR:    Link to Apple store mobile app is not found");
				}
				//REMEMBER THERE SHOULD NOT BE ANY BREAK STATEMENTS since need to validate all cases
				break;
			case "android":
				if(objWebDriverAbstractGeneralUse.findElement(By.partialLinkText("Download from GooglePlay")).isDisplayed()){
					objWebDriverAbstractGeneralUse.navigate().to(
							objWebDriverAbstractGeneralUse.findElement(By.partialLinkText("Download from GooglePlay")).getAttribute("href")  );
					objWebDriverAbstractGeneralUse.manage().timeouts().implicitlyWait( 
							Integer.parseInt(objPropMngr.single_Property_Getter("nWebsiteLoadTime")),
							TimeUnit.SECONDS);
					if (objWebDriverAbstractGeneralUse.getCurrentUrl().contains("play.google.com") &&
							objWebDriverAbstractGeneralUse.findElement(By.className("id-app-title")).getText().contains("American Airlines")){
						System.out.println("DEBUG:    Corresponding mobile application is found in Google store");
						// coming soon
						// Mobile application downloading procedure
						bLocalTestResultStatus = true;
					}else{
						objSoftAssert.fail("ERROR:    Unable to navigate to Google app store");
						System.out.println("ERROR:    Unable to navigate to Google app store");
					}
					// navigate back to earlier page
					objWebDriverAbstractGeneralUse.navigate().back();
					objWebDriverAbstractGeneralUse.manage().timeouts().implicitlyWait( 
							Integer.parseInt(objPropMngr.single_Property_Getter("nWebsiteLoadTime")),
							TimeUnit.SECONDS);
				}else{
					objSoftAssert.fail("ERROR:    Link to Google store mobile app is not found");
					System.out.println("ERROR:    Link to Google store mobile app is not found");
				}
				break;
			default:
				objSoftAssert.fail("ERROR:    Mobile application navigation test for following website is not supported: "+ strMobileAppType);
				System.out.println("ERROR:    Mobile application navigation test for following website is not supported: "+ strMobileAppType);
				break;
		}
		
		// navigate back to home page
		objWebDriverAbstractGeneralUse.navigate().back();
		objWebDriverAbstractGeneralUse.manage().timeouts().implicitlyWait( 
				Integer.parseInt(objPropMngr.single_Property_Getter("nWebsiteLoadTime")),
				TimeUnit.SECONDS);
		return bLocalTestResultStatus;
    }
	
	public boolean GoAir_Verify_MobileAppWebsite_Navigation_and_Download_Installer(
			String strAppDownloadSectionURL, String strMobileAppType){
		System.out.println("DEBUG:    Verifying navigation to mobile app site and download for GoAir");
				
		boolean bLocalTestResultStatus = false;
		// 	this is a generalised method. strAppDownloadSectionURL is not used for GoAir
		switch (strMobileAppType){
			case "ios":
				if(objWebDriverAbstractGeneralUse.findElement(By.cssSelector("a[href='https://itunes.apple.com/us/app/go-airlines/id947310396?mt=8']")).isDisplayed()){
					objWebDriverAbstractGeneralUse.navigate().to(
							objWebDriverAbstractGeneralUse.findElement(By.cssSelector("a[href='https://itunes.apple.com/us/app/go-airlines/id947310396?mt=8']")).getAttribute("href")  );
					objWebDriverAbstractGeneralUse.manage().timeouts().implicitlyWait( 
							Integer.parseInt(objPropMngr.single_Property_Getter("nWebsiteLoadTime")),
							TimeUnit.SECONDS);
					if (objWebDriverAbstractGeneralUse.getCurrentUrl().contains("itunes.apple.com") &&
							objWebDriverAbstractGeneralUse.findElement(By.xpath("//div[contains(@id, 'title')]/div/h1")).getText().contains("Go Airlines")){
						System.out.println("DEBUG:    Corresponding mobile application is found in Apple store");
						// coming soon
						// Mobile application downloading procedure
						bLocalTestResultStatus = true;
					}else{
						objSoftAssert.fail("ERROR:    Unable to navigate to Apple app store");
						System.out.println("ERROR:    Unable to navigate to Apple app store");
					}
					// navigate back to earlier page
					objWebDriverAbstractGeneralUse.navigate().back();
					objWebDriverAbstractGeneralUse.manage().timeouts().implicitlyWait( 
							Integer.parseInt(objPropMngr.single_Property_Getter("nWebsiteLoadTime")),
							TimeUnit.SECONDS);
					
				}else{
					objSoftAssert.fail("ERROR:    Link to Apple store mobile app is not found");
					System.out.println("ERROR:    Link to Apple store mobile app is not found");
				}
				break;
			case "android":
				if(objWebDriverAbstractGeneralUse.findElement(By.cssSelector("a[href='https://play.google.com/store/apps/details?id=com.ezy.goair']")).isDisplayed()){
					objWebDriverAbstractGeneralUse.navigate().to(
							objWebDriverAbstractGeneralUse.findElement(By.cssSelector("a[href='https://play.google.com/store/apps/details?id=com.ezy.goair']")).getAttribute("href")  );
					objWebDriverAbstractGeneralUse.manage().timeouts().implicitlyWait(  
							Integer.parseInt(objPropMngr.single_Property_Getter("nWebsiteLoadTime")),
							TimeUnit.SECONDS);
					if (objWebDriverAbstractGeneralUse.getCurrentUrl().contains("play.google.com") &&
							objWebDriverAbstractGeneralUse.findElement(By.className("id-app-title")).getText().contains("Go Airlines")){
						System.out.println("DEBUG:    Corresponding mobile application is found in Google store");
						// coming soon
						// Mobile application downloading procedure
						bLocalTestResultStatus = true;
					}else{
						objSoftAssert.fail("ERROR:    Unable to navigate to Google app store");
						System.out.println("ERROR:    Unable to navigate to Google app store");
					}
					// navigate back to earlier page
					objWebDriverAbstractGeneralUse.navigate().back();
					objWebDriverAbstractGeneralUse.manage().timeouts().implicitlyWait( 
							Integer.parseInt(objPropMngr.single_Property_Getter("nWebsiteLoadTime")),
							TimeUnit.SECONDS);
				}else{
					objSoftAssert.fail("ERROR:    Link to Google store mobile app is not found");
					System.out.println("ERROR:    Link to Google store mobile app is not found");
				}
				break;
			default:
				System.out.println("ERROR:    Mobile application navigation test for following website is not supported: "+ strMobileAppType);
				break;
		}

		return bLocalTestResultStatus;
    }

	public boolean cleartrip_Verify_MobileAppWebsite_Navigation_and_Download_Installer(
			String strAppDownloadSectionURL, String strMobileAppType){
		System.out.println("DEBUG:    Verifying navigation to mobile app site and download for cleartrip");

		boolean bLocalTestResultStatus 	= false;
		int nWebsiteLoadTimeTemp 		= Integer.parseInt(objPropMngr.single_Property_Getter("nWebsiteLoadTime"));
		
		objWebDriverAbstractGeneralUse.navigate().to(strAppDownloadSectionURL);
		objWebDriverAbstractGeneralUse.manage().timeouts().implicitlyWait(nWebsiteLoadTimeTemp,TimeUnit.SECONDS);

		switch (strMobileAppType){
			case "ios":
				if(objWebDriverAbstractGeneralUse.findElement(By.cssSelector("a[href='http://bit.ly/11uEicM']")).isDisplayed()){
					objWebDriverAbstractGeneralUse.navigate().to(
							objWebDriverAbstractGeneralUse.findElement(By.cssSelector("a[href='http://bit.ly/11uEicM']")).getAttribute("href")  );
					objWebDriverAbstractGeneralUse.manage().timeouts().implicitlyWait(nWebsiteLoadTimeTemp,TimeUnit.SECONDS);
					if (objWebDriverAbstractGeneralUse.getCurrentUrl().contains("itunes.apple.com") &&
							objWebDriverAbstractGeneralUse.findElement(By.xpath("//div[contains(@id, 'title')]/div/h1")).getText().contains("Cleartrip - Flights, Hotels, Trains (IRCTC) & Activities")){
						System.out.println("DEBUG:    Corresponding mobile application is found in Apple store");
						// coming soon
						// Mobile application downloading procedure
						bLocalTestResultStatus = true;
					}else{
						objSoftAssert.fail("ERROR:    Unable to navigate to Apple app store");
						System.out.println("ERROR:    Unable to navigate to Apple app store");
					}
					// navigate back to earlier page
					objWebDriverAbstractGeneralUse.navigate().back();
					objWebDriverAbstractGeneralUse.manage().timeouts().implicitlyWait(nWebsiteLoadTimeTemp,TimeUnit.SECONDS);
				}else{
					objSoftAssert.fail("ERROR:    Link to Apple store mobile app is not found");
					System.out.println("ERROR:    Link to Apple store mobile app is not found");
				}
				break;
			case "android":
				if(objWebDriverAbstractGeneralUse.findElement(By.cssSelector("a[href='http://bit.ly/1yb6ZFI']")).isDisplayed()){
					objWebDriverAbstractGeneralUse.navigate().to(
							objWebDriverAbstractGeneralUse.findElement(By.cssSelector("a[href='http://bit.ly/1yb6ZFI']")).getAttribute("href")  );
					objWebDriverAbstractGeneralUse.manage().timeouts().implicitlyWait(nWebsiteLoadTimeTemp,TimeUnit.SECONDS);
					if (objWebDriverAbstractGeneralUse.getCurrentUrl().contains("play.google.com") &&
							objWebDriverAbstractGeneralUse.findElement(By.className("id-app-title")).getText().contains("Cleartrip-Hotels IRCTC Flights")){
						System.out.println("DEBUG:    Corresponding mobile application is found in Google store");
						// coming soon
						// Mobile application downloading procedure
						bLocalTestResultStatus = true;
					}else{
						objSoftAssert.fail("ERROR:    Unable to navigate to Google app store");
						System.out.println("ERROR:    Unable to navigate to Google app store");
					}
					// navigate back to earlier page
					objWebDriverAbstractGeneralUse.navigate().back();
					objWebDriverAbstractGeneralUse.manage().timeouts().implicitlyWait(nWebsiteLoadTimeTemp,TimeUnit.SECONDS);
				}else{
					objSoftAssert.fail("ERROR:    Link to Google store mobile app is not found");
					System.out.println("ERROR:    Link to Google store mobile app is not found");
				}
				break;
			case "windows":
				if(objWebDriverAbstractGeneralUse.findElement(By.cssSelector("a[href='http://bit.ly/1xwlcjS']")).isDisplayed()){
					objWebDriverAbstractGeneralUse.navigate().to(
							objWebDriverAbstractGeneralUse.findElement(By.cssSelector("a[href='http://bit.ly/1xwlcjS']")).getAttribute("href")  );
					objWebDriverAbstractGeneralUse.manage().timeouts().implicitlyWait(nWebsiteLoadTimeTemp,TimeUnit.SECONDS);
					if (objWebDriverAbstractGeneralUse.getCurrentUrl().contains("microsoft.com/en-us/store/apps") &&
							objWebDriverAbstractGeneralUse.findElement(By.cssSelector("#page-title")).getText().contains("Cleartrip")){
						System.out.println("DEBUG:    Corresponding mobile application is found in Windows store");
						// coming soon
						// Mobile application downloading procedure
						bLocalTestResultStatus = true;
					}else{
						objSoftAssert.fail("ERROR:    Unable to navigate to Windows app store");
						System.out.println("ERROR:    Unable to navigate to Windows app store");
					}
					// navigate back to earlier page
					objWebDriverAbstractGeneralUse.navigate().back();
					objWebDriverAbstractGeneralUse.manage().timeouts().implicitlyWait(nWebsiteLoadTimeTemp,TimeUnit.SECONDS);
				}else{
					objSoftAssert.fail("ERROR:    Link to Windows app store mobile app is not found");
					System.out.println("ERROR:    Link to Windows app store mobile app is not found");
				}
				break;
			case "blackberry":
				if(objWebDriverAbstractGeneralUse.findElement(By.cssSelector("a[href='http://blck.by/1ukgLVr']")).isDisplayed()){
					objWebDriverAbstractGeneralUse.navigate().to(
							objWebDriverAbstractGeneralUse.findElement(By.cssSelector("a[href='http://blck.by/1ukgLVr']")).getAttribute("href")  );
					objWebDriverAbstractGeneralUse.manage().timeouts().implicitlyWait(nWebsiteLoadTimeTemp,TimeUnit.SECONDS);
					if (objWebDriverAbstractGeneralUse.getCurrentUrl().contains("appworld.blackberry.com/webstore") &&
							objWebDriverAbstractGeneralUse.findElement(By.cssSelector("h1[class='awwsProductDetailsContentItemTitle']")).getText().contains("Cleartrip for BlackBerry 10")){
						System.out.println("DEBUG:    Corresponding mobile application is found in Blackberry store");
						// coming soon
						// Mobile application downloading procedure
						bLocalTestResultStatus = true;
					}else{
						objSoftAssert.fail("ERROR:    Unable to navigate to Blackberry app store");
						System.out.println("ERROR:    Unable to navigate to Blackberry app store");
					}
					// navigate back to earlier page
					objWebDriverAbstractGeneralUse.navigate().back();
					objWebDriverAbstractGeneralUse.manage().timeouts().implicitlyWait(nWebsiteLoadTimeTemp,TimeUnit.SECONDS);
				}else{
					objSoftAssert.fail("ERROR:    Link to Blackberry app store mobile app is not found");
					System.out.println("ERROR:    Link to Blackberry app store mobile app is not found");
				}
				break;
			default:
				System.out.println("ERROR:    Mobile application navigation test for following website is not supported: "+ strMobileAppType);
				break;
		}

		return bLocalTestResultStatus;
    }

	public boolean redBus_Verify_MobileAppWebsite_Navigation_and_Download_Installer(
			String strAppDownloadSectionURL, String strMobileAppType){
		System.out.println("DEBUG:    Verifying navigation to mobile app site and download for redBus");

		boolean bLocalTestResultStatus 	= false;
		int nWebsiteLoadTimeTemp 		= Integer.parseInt(objPropMngr.single_Property_Getter("nWebsiteLoadTime"));
		
		objWebDriverAbstractGeneralUse.navigate().to(strAppDownloadSectionURL);
		objWebDriverAbstractGeneralUse.manage().timeouts().implicitlyWait(nWebsiteLoadTimeTemp,TimeUnit.SECONDS);

		switch (strMobileAppType){
			case "ios":
				if(objWebDriverAbstractGeneralUse.findElements(By.cssSelector("a[href='https://itunes.apple.com/in/app/redbus/id733712604?mt=8']")).get(0).isDisplayed()){
					objWebDriverAbstractGeneralUse.navigate().to(
							objWebDriverAbstractGeneralUse.findElements(By.cssSelector("a[href='https://itunes.apple.com/in/app/redbus/id733712604?mt=8']")).get(0).getAttribute("href")  );
					objWebDriverAbstractGeneralUse.manage().timeouts().implicitlyWait(nWebsiteLoadTimeTemp,TimeUnit.SECONDS);
					if (objWebDriverAbstractGeneralUse.getCurrentUrl().contains("itunes.apple.com") &&
							objWebDriverAbstractGeneralUse.findElement(By.xpath("//div[contains(@id, 'title')]/div/h1")).getText().contains("redBus")){
						System.out.println("DEBUG:    Corresponding mobile application is found in Apple store");
						// coming soon
						// Mobile application downloading procedure
						bLocalTestResultStatus = true;
					}else{
						objSoftAssert.fail("ERROR:    Unable to navigate to Apple app store");
						System.out.println("ERROR:    Unable to navigate to Apple app store");
					}
					// navigate back to earlier page
					objWebDriverAbstractGeneralUse.navigate().back();
					objWebDriverAbstractGeneralUse.manage().timeouts().implicitlyWait(nWebsiteLoadTimeTemp,TimeUnit.SECONDS);
				}else{
					objSoftAssert.fail("ERROR:    Link to Apple store mobile app is not found");
					System.out.println("ERROR:    Link to Apple store mobile app is not found");
				}
				break;
			case "android":
				if(objWebDriverAbstractGeneralUse.findElements(By.cssSelector("a[href='https://play.google.com/store/apps/details?id=in.redbus.android&hl=en']")).get(0).isDisplayed()){
					objWebDriverAbstractGeneralUse.navigate().to(
							objWebDriverAbstractGeneralUse.findElements(By.cssSelector("a[href='https://play.google.com/store/apps/details?id=in.redbus.android&hl=en']")).get(0).getAttribute("href")  );
					objWebDriverAbstractGeneralUse.manage().timeouts().implicitlyWait(nWebsiteLoadTimeTemp,TimeUnit.SECONDS);
					if (objWebDriverAbstractGeneralUse.getCurrentUrl().contains("play.google.com") &&
							objWebDriverAbstractGeneralUse.findElement(By.className("id-app-title")).getText().contains("redBus - Bus Ticket Booking")){
						System.out.println("DEBUG:    Corresponding mobile application is found in Google store");
						// coming soon
						// Mobile application downloading procedure
						bLocalTestResultStatus = true;
					}else{
						objSoftAssert.fail("ERROR:    Unable to navigate to Google app store");
						System.out.println("ERROR:    Unable to navigate to Google app store");
					}
					// navigate back to earlier page
					objWebDriverAbstractGeneralUse.navigate().back();
					objWebDriverAbstractGeneralUse.manage().timeouts().implicitlyWait(nWebsiteLoadTimeTemp,TimeUnit.SECONDS);
				}else{
					objSoftAssert.fail("ERROR:    Link to Google store mobile app is not found");
					System.out.println("ERROR:    Link to Google store mobile app is not found");
				}
				break;
			case "windows":
				if(objWebDriverAbstractGeneralUse.findElements(By.cssSelector("a[href='http://www.windowsphone.com/en-in/store/app/redbus-in/b3803839-bfdd-428e-89cb-88c0fdfe2429']")).get(0).isDisplayed()){
					objWebDriverAbstractGeneralUse.navigate().to(
							objWebDriverAbstractGeneralUse.findElements(By.cssSelector("a[href='http://www.windowsphone.com/en-in/store/app/redbus-in/b3803839-bfdd-428e-89cb-88c0fdfe2429']")).get(0).getAttribute("href")  );
					objWebDriverAbstractGeneralUse.manage().timeouts().implicitlyWait(nWebsiteLoadTimeTemp,TimeUnit.SECONDS);
					if (objWebDriverAbstractGeneralUse.getCurrentUrl().contains("microsoft.com/en-us/store/apps") &&
							objWebDriverAbstractGeneralUse.findElement(By.cssSelector("#page-title")).getText().contains("redBus")){
						System.out.println("DEBUG:    Corresponding mobile application is found in Windows store");
						// coming soon
						// Mobile application downloading procedure
						bLocalTestResultStatus = true;
					}else{
						objSoftAssert.fail("ERROR:    Unable to navigate to Windows app store");
						System.out.println("ERROR:    Unable to navigate to Windows app store");
					}
					// navigate back to earlier page
					objWebDriverAbstractGeneralUse.navigate().back();
					objWebDriverAbstractGeneralUse.manage().timeouts().implicitlyWait(nWebsiteLoadTimeTemp,TimeUnit.SECONDS);
				}else{
					objSoftAssert.fail("ERROR:    Link to Windows app store mobile app is not found");
					System.out.println("ERROR:    Link to Windows app store mobile app is not found");
				}
				break;
			default:
				System.out.println("ERROR:    Mobile application navigation test for following website is not supported: "+ strMobileAppType);
				break;
		}

		return bLocalTestResultStatus;
    }
	
	
	
	
	
	
	
	
	
//	public boolean verify_MobileAppWebsite_Navigation_and_Download_Installer(
//	String strAppDownloadSectionURL, String strMobileAppType){
//System.out.println("DEBUG:    Verifying navigation to mobile app site and download");
//
//if (null == strCurrentWebsiteUnderTest){ System.out.println("ERROR:    No short name found for currnt website under test");	return false; }
//
//if ( !strMobileAppType.matches("ios|android|blackberry|windows") ){
//				 objSoftAssert.fail("ERROR:    Unsupported mobile application type");
//				 System.out.println("ERROR:    Unsupported mobile application type");	return false; }
//		
//boolean bLocalTestResultStatus = true;
//
//switch (strCurrentWebsiteUnderTest){
//	case "AmericanAirlines":
//		if (!AmericanAirlines_Verify_MobileAppWebsite_Navigation_and_Download_Installer(strAppDownloadSectionURL,strMobileAppType)){
//			System.out.println("RESULT::FAIL");
//			objSoftAssert.fail("ERROR:    Verifying navigation to mobile app site and download failed for: " + strCurrentWebsiteUnderTest);
//			System.out.println("ERROR:    Verifying navigation to mobile app site and download failed for: " + strCurrentWebsiteUnderTest);
//			bLocalTestResultStatus = false;
//		}
//		break;
//	case "GoAir":
//		if (!GoAir_Verify_MobileAppWebsite_Navigation_and_Download_Installer(strAppDownloadSectionURL,strMobileAppType)){
//			System.out.println("RESULT::FAIL");
//			objSoftAssert.fail("ERROR:    Verifying navigation to mobile app site and download failed for: " + strCurrentWebsiteUnderTest);
//			System.out.println("ERROR:    Verifying navigation to mobile app site and download failed for: " + strCurrentWebsiteUnderTest);
//			bLocalTestResultStatus = false;
//		}
//		break;
//	case "cleartrip":
//		if (!cleartrip_Verify_MobileAppWebsite_Navigation_and_Download_Installer(strAppDownloadSectionURL,strMobileAppType)){
//			System.out.println("RESULT::FAIL");
//			objSoftAssert.fail("ERROR:    Verifying navigation to mobile app site and download failed for: " + strCurrentWebsiteUnderTest);
//			System.out.println("ERROR:    Verifying navigation to mobile app site and download failed for: " + strCurrentWebsiteUnderTest);
//			bLocalTestResultStatus = false;
//		}
//		break;
//	case "":			
//	default:
//		System.out.println("ERROR:    Mobile application navigation test for following website is not supported: "+ strCurrentWebsiteUnderTest);
//		break;
//}
//		
//return bLocalTestResultStatus;
//}	
	
}