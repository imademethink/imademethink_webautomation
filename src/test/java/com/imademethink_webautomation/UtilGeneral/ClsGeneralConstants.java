package com.imademethink_webautomation.UtilGeneral;

import java.util.Properties;

import org.json.JSONObject;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
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

public class ClsGeneralConstants {

	protected static String 			strCurrentWebsiteUnderTest 	= null;
	public static String 				strCurrentPageURL 			= "";
	public static String 				strCurrentPageTitle			= "";
	
	// need to add any missing supported web driver
	protected static String[] 			arrStrDriverTypeNames = { 
											"firefox", "internet explorer", "chrome", 
											"safari","android", "html unit driver", 
											"opera" };
	// date variables
	public static int					nCurrentYear_YYYY;
	public static int					nCurrentMonth_MM;
	public static int					nCurrentDate_DD;
	
	// Other variables
	protected static String 			strGlobalDriverType 		= null;
	protected static String 			strPropertiesFilePath 		= "src/test/java/parameters.properties";
	public String 						strSinglePropertyValue 		= "";
	public static int 					nnVerticalPixelOffsetCount_Firefox	= 80;
	
	// Temporary browser handle 
	public static WebDriver 			objWebDriverAbstractGeneralUse = null;;
	
	// Properties class instance                                                           // for non user defined class object, call constructer here only
	public static Properties  			objProperties				= new Properties();
	
	// Property file manager
	public static ClsPropertyManager 	objPropMngr					= null;

	// Property file elements are read into JSON object i.e. as key value pair             // for non user defined class object, call constructer here only
	public JSONObject 					objJsonFormateProperty 		= new JSONObject();
	
	// soft assert object for general purpose												// for non user defined class object, call constructer here only
	public SoftAssert 					objSoftAssert               = new SoftAssert();
	
	
	
	
	// Page objects
	// Abstract page object
	public Page0Abstract 				objPage0Abstract			= null;
		
	// AmericanAirlines website page objects
	public PageAmericanAirlinesMain						objPageAmericanAirlinesMain						= null;
	public PageAmericanAirlinesResult0InProgress		objPageAmericanAirlinesResult0InProgress 		= null;
	public PageAmericanAirlinesResult1SelectDate		objPageAmericanAirlinesResult1SelectDate 		= null;
	public PageAmericanAirlinesResult2SelectFlight		objPageAmericanAirlinesResult2SelectFlight 		= null;
	public PageAmericanAirlinesResult3Price				objPageAmericanAirlinesResult3Price 			= null;
	public PageAmericanAirlinesResult4PassengerDetail	objPageAmericanAirlinesResult4PassengerDetail 	= null;
	public PageAmericanAirlinesResult5Payment			objPageAmericanAirlinesResult5Payment 			= null;
	public PageAmericanAirlines99General 				objPageAmericanAirlines99General				= null;
	
	// GoAir website page objects
	public PageGoAir0PlanMyTrip							objPageGoAirPage0PlanMyTrip		= null;
	public PageGoAir1Promotions							objPageGoAirPage1Promotions		= null;
	public PageGoAir2Services							objPageGoAirPage2Services		= null;
	public PageGoAir99General							objPageGoAir99General			= null;
	public PageGoAirMain								objPageGoAirMain				= null;
	public PageGoAirResult0InProgress					objPageGoAirResult0InProgress					= null;
	public PageGoAirResult2SelectDate					objPageGoAirResult2SelectDate					= null;
	public PageGoAirResult3ServicesAndPassengerDetail	objPageGoAirResult3ServicesAndPassengerDetail	= null;
	public PageGoAirResult4SeatAssignment				objPageGoAirResult4SeatAssignment				= null;
	public PageGoAirResult5Payment						objPageGoAirResult5Payment						= null;

	// cleartrip website page objects
	public PagecleartripMain								objPagecleartripMain					= null;
	public PagecleartripResult1SelectFlight					objPagecleartripResult1SelectFlight		= null;
	public PagecleartripResult2SimpleSteps					objPagecleartripResult2SimpleSteps		= null;
	public PagecleartripResult3Payment						objPagecleartripResult3Payment			= null;
	public Pagecleartrip99General							objPagecleartrip99General				= null;

	// redBus website page objects
	public PageredBusMain									objPageredBusMain						= null;
	public PageredBusResult1SelectTravelsnSeat 				objPageredBusResult1SelectTravelsnSeat	= null;
	public PageredBusResult2UserDetailnPayment 				objPageredBusResult2UserDetailnPayment	= null;
	public PageredBus0Offers 								objPageredBus0Offers					= null;
	public PageredBus1SupportFunctionality 					objPageredBus1SupportFunctionality		= null;
	public PageredBus99General 								objPageredBus99General					= null;
	
	

		
	
}
