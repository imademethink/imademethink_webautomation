package com.imademethink_webautomation.pkg0GeneralPageFactory;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features 		= {"src/test/resources/TktTravel_redBus.feature"},
		tags 			    = {
				                    //"@redbus"
				                    "@demoredbus"},
		dryRun 			= false,
		strict 			    = false,
		monochrome = true,
		format 			= {
   									"pretty",
   									"html:target/cucumber",
   									"json:target/cucumber/cucumber.json"
   									},
		glue 			    = {"com.imademethink_webautomation.pkg0GeneralPageFactory"}
)

public class TestNGPagefactoryRunnerTest {

}
