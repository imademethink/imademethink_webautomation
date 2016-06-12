package com.imademethink_webautomation.pkg0GeneralPageFactory;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		//features 		= {"src/test/resource/Airlines_AmericanAirlines.feature"},
		//features 		= {"src/test/resource/Airlines_GoAir.feature"},
		//features 		= {"src/test/resource/TktTravel_cleartrip.feature"},
		features 		= {"src/test/resource/TktTravel_redBus.feature"},
		
		tags 			= {
							//"@AmericanAirlines"
							//"@GoAir"
				            //"@cleartrip"
				            "@redbus"
						  },

		dryRun 			= false,
		strict 			= false,
		monochrome 		= true,
		
		format 			= {"pretty", "json:target/json/testreport.json", 
                                     "html:target/html/index.html",
                                    "junit:target/junit/testreport.xml"},

		glue 			= "com.imademethink_webautomation.pkg0GeneralPageFactory"
	)
public class TestNGPagefactoryRunnerTest {

}
