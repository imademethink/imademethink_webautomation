package com.imademethink_webautomation.pkg0GeneralPageFactory;

import com.imademethink_webautomation.UtilWebDriver.ClsUtilWebDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;

public class StepDef0General extends ClsUtilWebDriver{
	
	@Given("^Init \"([^\"]*)\" browser$")
	public void Init_webdriver(String strBrowserType) throws Throwable {
		System.out.println("\n===================================================");
		System.out.println("INFO :: Initiliazing browser for type: " + strBrowserType);
		initilize_Web_Driver(strBrowserType);
	}
	
	// will execute after last step of every scenario
	@After
	public void Quit_the_test_scenario() throws Throwable {
		System.out.println("INFO :: Final quit");
		// Terminate order should be same during initializing 
		terminate_Abstact_Page_Object();
		terminate_General_Supporting_Items("all");
		terminate_Webdriver();
	}
}
