$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resource/Airlines_GoAir.feature");
formatter.feature({
  "id": "airlines-website-validation---goair",
  "tags": [
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "Airlines website validation - GoAir",
  "keyword": "Feature",
  "line": 2
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 6198791852,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 8076013341,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-home-page-functionality,-look-n-feel-validation;;2",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@homepage",
      "line": 10
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Home page functionality, look-n-feel validation",
  "keyword": "Scenario Outline",
  "line": 18,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates home page attribute from \"home page URL\" with \"https://www.goair.in\"",
  "keyword": "When ",
  "line": 12,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 13
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 14
});
formatter.match({
  "arguments": [
    {
      "val": "home page URL",
      "offset": 47
    },
    {
      "val": "https://www.goair.in",
      "offset": 68
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_home_page_attribute_from_with(String,String)"
});
formatter.result({
  "duration": 279732,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 102226,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 103509,
  "status": "passed"
});
formatter.after({
  "duration": 810458956,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4688564551,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 7813843106,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-home-page-functionality,-look-n-feel-validation;;3",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@homepage",
      "line": 10
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Home page functionality, look-n-feel validation",
  "keyword": "Scenario Outline",
  "line": 19,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates home page attribute from \"home page title\" with \"Cheapest Domestic Flight Tickets\"",
  "keyword": "When ",
  "line": 12,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 13
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 14
});
formatter.match({
  "arguments": [
    {
      "val": "home page title",
      "offset": 47
    },
    {
      "val": "Cheapest Domestic Flight Tickets",
      "offset": 70
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_home_page_attribute_from_with(String,String)"
});
formatter.result({
  "duration": 232254,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 104792,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 156120,
  "status": "passed"
});
formatter.after({
  "duration": 556888105,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4381548343,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 8784998276,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-home-page-functionality,-look-n-feel-validation;;4",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@homepage",
      "line": 10
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Home page functionality, look-n-feel validation",
  "keyword": "Scenario Outline",
  "line": 20,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates home page attribute from \"home page logo\" with \"default GoAir logo\"",
  "keyword": "When ",
  "line": 12,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 13
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 14
});
formatter.match({
  "arguments": [
    {
      "val": "home page logo",
      "offset": 47
    },
    {
      "val": "default GoAir logo",
      "offset": 69
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_home_page_attribute_from_with(String,String)"
});
formatter.result({
  "duration": 987993369,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 4684858,
  "status": "failed",
  "error_message": "java.lang.AssertionError: The following asserts failed:\n\tRESULT::OVERALL *****FAIL***** for current test scenario\r\n\tat org.testng.asserts.SoftAssert.assertAll(SoftAssert.java:43)\r\n\tat com.trialgroupid.gidPgFact.aidPgFact.pkgAirlines_GoAir.clsGoAir.GoAir_Validate_Test_Result(clsGoAir.java:732)\r\n\tat com.trialgroupid.gidPgFact.aidPgFact.pkg0GeneralPageFactory.StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage(StepDefGoAir.java:161)\r\n\tat ✽.Then GoAir Test result should be successful or log the error meessage(src/test/resource/Airlines_GoAir.feature:13)\r\n"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 558642200,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4662660749,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 8004274243,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-home-page-functionality,-look-n-feel-validation;;5",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@homepage",
      "line": 10
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Home page functionality, look-n-feel validation",
  "keyword": "Scenario Outline",
  "line": 21,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates home page attribute from \"home page loading time\" with \"general home page loading time\"",
  "keyword": "When ",
  "line": 12,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 13
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 14
});
formatter.match({
  "arguments": [
    {
      "val": "home page loading time",
      "offset": 47
    },
    {
      "val": "general home page loading time",
      "offset": 77
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_home_page_attribute_from_with(String,String)"
});
formatter.result({
  "duration": 5388561300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 84261,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 70147,
  "status": "passed"
});
formatter.after({
  "duration": 408942334,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4556148143,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 17556865436,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-home-page-functionality,-look-n-feel-validation;;6",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@homepage",
      "line": 10
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Home page functionality, look-n-feel validation",
  "keyword": "Scenario Outline",
  "line": 22,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates home page attribute from \"important home page elements\" with \"btn__HOME __ hover__Plan my trip __ btn__GoBusiness __ btn__GoHolidays __ btn__Careers\"",
  "keyword": "When ",
  "line": 12,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 13
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 14
});
formatter.match({
  "arguments": [
    {
      "val": "important home page elements",
      "offset": 47
    },
    {
      "val": "btn__HOME __ hover__Plan my trip __ btn__GoBusiness __ btn__GoHolidays __ btn__Careers",
      "offset": 83
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_home_page_attribute_from_with(String,String)"
});
formatter.result({
  "duration": 651443696,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 121901,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 73569,
  "status": "passed"
});
formatter.after({
  "duration": 436669949,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4416175996,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 107338414120,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-home-page-functionality,-look-n-feel-validation;;7",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@homepage",
      "line": 10
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Home page functionality, look-n-feel validation",
  "keyword": "Scenario Outline",
  "line": 23,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates home page attribute from \"important home page elements\" with \"hover__Promotions __ hover__Services __ hover__About Us __ btn__Partner Login __ slider__image sliders\"",
  "keyword": "When ",
  "line": 12,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 13
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 14
});
formatter.match({
  "arguments": [
    {
      "val": "important home page elements",
      "offset": 47
    },
    {
      "val": "hover__Promotions __ hover__Services __ hover__About Us __ btn__Partner Login __ slider__image sliders",
      "offset": 83
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_home_page_attribute_from_with(String,String)"
});
formatter.result({
  "duration": 955867470,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 384951,
  "status": "failed",
  "error_message": "java.lang.AssertionError: The following asserts failed:\n\tERROR:    Validation failed for following web element: slider__image sliders,\n\tRESULT::OVERALL *****FAIL***** for current test scenario\r\n\tat org.testng.asserts.SoftAssert.assertAll(SoftAssert.java:43)\r\n\tat com.trialgroupid.gidPgFact.aidPgFact.pkgAirlines_GoAir.clsGoAir.GoAir_Validate_Test_Result(clsGoAir.java:732)\r\n\tat com.trialgroupid.gidPgFact.aidPgFact.pkg0GeneralPageFactory.StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage(StepDefGoAir.java:161)\r\n\tat ✽.Then GoAir Test result should be successful or log the error meessage(src/test/resource/Airlines_GoAir.feature:13)\r\n"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 497003368,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4719592055,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 18569640686,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-home-page-functionality,-look-n-feel-validation;;8",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@homepage",
      "line": 10
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Home page functionality, look-n-feel validation",
  "keyword": "Scenario Outline",
  "line": 24,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates home page attribute from \"important home page elements\" with \"tab__Book Flights __ tab__Web Check-in __ tab__Manage Booking __ tab__Flight Status __ tab__Flight Schedule __ tab__Route Map\"",
  "keyword": "When ",
  "line": 12,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 13
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 14
});
formatter.match({
  "arguments": [
    {
      "val": "important home page elements",
      "offset": 47
    },
    {
      "val": "tab__Book Flights __ tab__Web Check-in __ tab__Manage Booking __ tab__Flight Status __ tab__Flight Schedule __ tab__Route Map",
      "offset": 83
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_home_page_attribute_from_with(String,String)"
});
formatter.result({
  "duration": 1037958766,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 85972,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 73997,
  "status": "passed"
});
formatter.after({
  "duration": 518531984,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4661014869,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 8358639890,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-home-page-functionality,-look-n-feel-validation;;9",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@homepage",
      "line": 10
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Home page functionality, look-n-feel validation",
  "keyword": "Scenario Outline",
  "line": 25,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates home page attribute from \"important home page elements\" with \"slider__fare offer sliders __ img__Carry More for less __ img__Pre book preferred seats __ btn__Smart SME\"",
  "keyword": "When ",
  "line": 12,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 13
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 14
});
formatter.match({
  "arguments": [
    {
      "val": "important home page elements",
      "offset": 47
    },
    {
      "val": "slider__fare offer sliders __ img__Carry More for less __ img__Pre book preferred seats __ btn__Smart SME",
      "offset": 83
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_home_page_attribute_from_with(String,String)"
});
formatter.result({
  "duration": 1669672852,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 92389,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 73568,
  "status": "passed"
});
formatter.after({
  "duration": 617520503,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4405581708,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 8447673996,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-home-page-functionality,-look-n-feel-validation;;10",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@homepage",
      "line": 10
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Home page functionality, look-n-feel validation",
  "keyword": "Scenario Outline",
  "line": 26,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates home page attribute from \"important home page elements\" with \"tab__Air Inclusive Deals __ tab__Honeymoon __ tab__Hill Station __ tab__Popular __ tab__Beaches\"",
  "keyword": "When ",
  "line": 12,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 13
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 14
});
formatter.match({
  "arguments": [
    {
      "val": "important home page elements",
      "offset": 47
    },
    {
      "val": "tab__Air Inclusive Deals __ tab__Honeymoon __ tab__Hill Station __ tab__Popular __ tab__Beaches",
      "offset": 83
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_home_page_attribute_from_with(String,String)"
});
formatter.result({
  "duration": 11330464020,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 94954,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 68436,
  "status": "passed"
});
formatter.after({
  "duration": 550600140,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4235550425,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 18175081845,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-home-page-functionality,-look-n-feel-validation;;11",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@homepage",
      "line": 10
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Home page functionality, look-n-feel validation",
  "keyword": "Scenario Outline",
  "line": 27,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates home page attribute from \"important home page elements\" with \"labl__GoAir Customer Care __ labl__Call: 092 - 2322 - 2111/020 - 2566 - 2111 __ labl__Fog Helpline: __ labl__020 - 6689 - 5050\"",
  "keyword": "When ",
  "line": 12,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 13
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 14
});
formatter.match({
  "arguments": [
    {
      "val": "important home page elements",
      "offset": 47
    },
    {
      "val": "labl__GoAir Customer Care __ labl__Call: 092 - 2322 - 2111/020 - 2566 - 2111 __ labl__Fog Helpline: __ labl__020 - 6689 - 5050",
      "offset": 83
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_home_page_attribute_from_with(String,String)"
});
formatter.result({
  "duration": 424139784,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 83406,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 67153,
  "status": "passed"
});
formatter.after({
  "duration": 487596869,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4484095950,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 16228821048,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-home-page-functionality,-look-n-feel-validation;;12",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@homepage",
      "line": 10
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Home page functionality, look-n-feel validation",
  "keyword": "Scenario Outline",
  "line": 28,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates home page attribute from \"pop up\" with \"no_popup __ no_screenshot\"",
  "keyword": "When ",
  "line": 12,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 13
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 14
});
formatter.match({
  "arguments": [
    {
      "val": "pop up",
      "offset": 47
    },
    {
      "val": "no_popup __ no_screenshot",
      "offset": 61
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_home_page_attribute_from_with(String,String)"
});
formatter.result({
  "duration": 26618528,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 126178,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 111636,
  "status": "passed"
});
formatter.after({
  "duration": 474781412,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4574295603,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 8654810309,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-home-page-functionality,-look-n-feel-validation;;13",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@homepage",
      "line": 10
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Home page functionality, look-n-feel validation",
  "keyword": "Scenario Outline",
  "line": 29,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates home page attribute from \"sign up\" with \"NA\"",
  "keyword": "When ",
  "line": 12,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 13
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 14
});
formatter.match({
  "arguments": [
    {
      "val": "sign up",
      "offset": 47
    },
    {
      "val": "NA",
      "offset": 62
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_home_page_attribute_from_with(String,String)"
});
formatter.result({
  "duration": 237387,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 60737,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 64586,
  "status": "passed"
});
formatter.after({
  "duration": 614115823,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4306020040,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 9315887625,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-home-page-functionality,-look-n-feel-validation;;14",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@homepage",
      "line": 10
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Home page functionality, look-n-feel validation",
  "keyword": "Scenario Outline",
  "line": 30,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates home page attribute from \"sign in\" with \"NA\"",
  "keyword": "When ",
  "line": 12,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 13
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 14
});
formatter.match({
  "arguments": [
    {
      "val": "sign in",
      "offset": 47
    },
    {
      "val": "NA",
      "offset": 62
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_home_page_attribute_from_with(String,String)"
});
formatter.result({
  "duration": 383668,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 155692,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 153125,
  "status": "passed"
});
formatter.after({
  "duration": 549363590,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4727854392,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 18393318443,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-home-page-functionality,-look-n-feel-validation;;15",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@homepage",
      "line": 10
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Home page functionality, look-n-feel validation",
  "keyword": "Scenario Outline",
  "line": 31,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates home page attribute from \"social plugin facebook\" with \"social_plugin__ facebook\"",
  "keyword": "When ",
  "line": 12,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 13
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 14
});
formatter.match({
  "arguments": [
    {
      "val": "social plugin facebook",
      "offset": 47
    },
    {
      "val": "social_plugin__ facebook",
      "offset": 77
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_home_page_attribute_from_with(String,String)"
});
formatter.result({
  "duration": 153914227,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 84262,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 68864,
  "status": "passed"
});
formatter.after({
  "duration": 478659583,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4292930412,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 8721041182,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-home-page-functionality,-look-n-feel-validation;;16",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@homepage",
      "line": 10
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Home page functionality, look-n-feel validation",
  "keyword": "Scenario Outline",
  "line": 32,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates home page attribute from \"social plugin twitter\" with \"social_plugin__ twitter\"",
  "keyword": "When ",
  "line": 12,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 13
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 14
});
formatter.match({
  "arguments": [
    {
      "val": "social plugin twitter",
      "offset": 47
    },
    {
      "val": "social_plugin__ twitter",
      "offset": 76
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_home_page_attribute_from_with(String,String)"
});
formatter.result({
  "duration": 176347051,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 90250,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 76563,
  "status": "passed"
});
formatter.after({
  "duration": 565164558,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4634913459,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 15728411289,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-home-page-functionality,-look-n-feel-validation;;17",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@homepage",
      "line": 10
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Home page functionality, look-n-feel validation",
  "keyword": "Scenario Outline",
  "line": 33,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates home page attribute from \"social plugin googleplus\" with \"social_plugin__ googleplus\"",
  "keyword": "When ",
  "line": 12,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 13
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 14
});
formatter.match({
  "arguments": [
    {
      "val": "social plugin googleplus",
      "offset": 47
    },
    {
      "val": "social_plugin__ googleplus",
      "offset": 79
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_home_page_attribute_from_with(String,String)"
});
formatter.result({
  "duration": 166143703,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 489316,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 69291,
  "status": "passed"
});
formatter.after({
  "duration": 430038949,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4647512488,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 8530826045,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-home-page-functionality,-look-n-feel-validation;;18",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@homepage",
      "line": 10
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Home page functionality, look-n-feel validation",
  "keyword": "Scenario Outline",
  "line": 34,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates home page attribute from \"social plugin instagram\" with \"social_plugin__ instagram\"",
  "keyword": "When ",
  "line": 12,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 13
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 14
});
formatter.match({
  "arguments": [
    {
      "val": "social plugin instagram",
      "offset": 47
    },
    {
      "val": "social_plugin__ instagram",
      "offset": 78
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_home_page_attribute_from_with(String,String)"
});
formatter.result({
  "duration": 186688127,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 100088,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 74851,
  "status": "passed"
});
formatter.after({
  "duration": 640206967,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4608571240,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 9436490305,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-home-page-functionality,-look-n-feel-validation;;19",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@homepage",
      "line": 10
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Home page functionality, look-n-feel validation",
  "keyword": "Scenario Outline",
  "line": 35,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates home page attribute from \"home page other web elements\" with \"broken links __ broken images __ all frame title\"",
  "keyword": "When ",
  "line": 12,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 13
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 14
});
formatter.match({
  "arguments": [
    {
      "val": "home page other web elements",
      "offset": 47
    },
    {
      "val": "broken links __ broken images __ all frame title",
      "offset": 83
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_home_page_attribute_from_with(String,String)"
});
formatter.result({
  "duration": 37673542896,
  "status": "failed",
  "error_message": "org.openqa.selenium.StaleElementReferenceException: Element not found in the cache - perhaps the page has changed since it was looked up\nCommand duration or timeout: 20.12 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/stale_element_reference.html\nBuild info: version: \u00272.48.2\u0027, revision: \u002741bccdd10cf2c0560f637404c2d96164b67d9d67\u0027, time: \u00272015-10-09 13:08:06\u0027\nSystem info: host: \u0027Shrikant-PC\u0027, ip: \u0027192.168.1.2\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.7.0_15\u0027\nSession ID: ff2e523e-bfdb-41e4-a368-5ab55af637e6\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{platform\u003dWINDOWS, acceptSslCerts\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, databaseEnabled\u003dtrue, browserName\u003dfirefox, handlesAlerts\u003dtrue, nativeEvents\u003dfalse, webStorageEnabled\u003dtrue, rotatable\u003dfalse, locationContextEnabled\u003dtrue, applicationCacheEnabled\u003dtrue, takesScreenshot\u003dtrue, version\u003d42.0}]\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:647)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:326)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.getAttribute(RemoteWebElement.java:149)\r\n\tat com.trialgroupid.gidPgFact.aidPgFact.UtilWebDriver.ClsUtilWebDriver.check_Broken_Links(ClsUtilWebDriver.java:329)\r\n\tat com.trialgroupid.gidPgFact.aidPgFact.pkgAirlines_GoAir.clsGoAir.GoAir_Validate_HomePage_Other_WebElements(clsGoAir.java:867)\r\n\tat com.trialgroupid.gidPgFact.aidPgFact.pkgAirlines_GoAir.clsGoAir.GoAir_Validate_Home_Page_Attributes(clsGoAir.java:117)\r\n\tat com.trialgroupid.gidPgFact.aidPgFact.pkg0GeneralPageFactory.StepDefGoAir.GoAir_User_validates_home_page_attribute_from_with(StepDefGoAir.java:14)\r\n\tat ✽.When GoAir User validates home page attribute from \"home page other web elements\" with \"broken links __ broken images __ all frame title\"(src/test/resource/Airlines_GoAir.feature:12)\r\nCaused by: org.openqa.selenium.StaleElementReferenceException: Element not found in the cache - perhaps the page has changed since it was looked up\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/stale_element_reference.html\nBuild info: version: \u00272.48.2\u0027, revision: \u002741bccdd10cf2c0560f637404c2d96164b67d9d67\u0027, time: \u00272015-10-09 13:08:06\u0027\nSystem info: host: \u0027Shrikant-PC\u0027, ip: \u0027192.168.1.2\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.7.0_15\u0027\nDriver info: driver.version: unknown\r\n\tat \u003canonymous class\u003e.fxdriver.cache.getElementAt(resource://fxdriver/modules/web-element-cache.js:9351)\r\n\tat \u003canonymous class\u003e.Utils.getElementAt(file:///C:/Users/Shrikant/AppData/Local/Temp/anonymous5799563632104148004webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:8978)\r\n\tat \u003canonymous class\u003e.WebElement.getElementAttribute(file:///C:/Users/Shrikant/AppData/Local/Temp/anonymous5799563632104148004webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12019)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.executeInternal_/h(file:///C:/Users/Shrikant/AppData/Local/Temp/anonymous5799563632104148004webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12534)\r\n\tat \u003canonymous class\u003e.fxdriver.Timer.prototype.setTimeout/\u003c.notify(file:///C:/Users/Shrikant/AppData/Local/Temp/anonymous5799563632104148004webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:621)\r\n"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 527334109,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4688388756,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 7611918178,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-home-page-functionality,-look-n-feel-validation;;20",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@homepage",
      "line": 10
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Home page functionality, look-n-feel validation",
  "keyword": "Scenario Outline",
  "line": 36,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates home page attribute from \"mobile app download check\" with \"ios __ android\"",
  "keyword": "When ",
  "line": 12,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 13
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 14
});
formatter.match({
  "arguments": [
    {
      "val": "mobile app download check",
      "offset": 47
    },
    {
      "val": "ios __ android",
      "offset": 80
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_home_page_attribute_from_with(String,String)"
});
formatter.result({
  "duration": 21996583343,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 105647,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 572294,
  "status": "passed"
});
formatter.after({
  "duration": 1528671174,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4651399212,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 8335017566,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-airlines-home-page-gui-options-validation;;2",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Airlines home page GUI options validation",
  "keyword": "Scenario Outline",
  "line": 47,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates airlines home page elements from \"Book Flight\" with \"btn__Return __ btn__One way __ labl__Group bookings __ txtbox__Adult count\" with \u003cexpected GUI options value\u003e",
  "keyword": "When ",
  "line": 41,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 42
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 43
});
formatter.match({
  "arguments": [
    {
      "val": "Book Flight",
      "offset": 55
    },
    {
      "val": "btn__Return __ btn__One way __ labl__Group bookings __ txtbox__Adult count",
      "offset": 74
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_airlines_home_page_elements_from_with_with_expected_GUI_options_value(String,String)"
});
formatter.result({
  "duration": 373241521,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 78701,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 76562,
  "status": "passed"
});
formatter.after({
  "duration": 605276913,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4602852147,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 17922896390,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-airlines-home-page-gui-options-validation;;3",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Airlines home page GUI options validation",
  "keyword": "Scenario Outline",
  "line": 48,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates airlines home page elements from \"Book Flight\" with \"txtbox__Children count __ txtbox__Infant count __ drpdwn__Select promo __ btn__Book Now\" with \u003cexpected GUI options value\u003e",
  "keyword": "When ",
  "line": 41,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 42
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 43
});
formatter.match({
  "arguments": [
    {
      "val": "Book Flight",
      "offset": 55
    },
    {
      "val": "txtbox__Children count __ txtbox__Infant count __ drpdwn__Select promo __ btn__Book Now",
      "offset": 74
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_airlines_home_page_elements_from_with_with_expected_GUI_options_value(String,String)"
});
formatter.result({
  "duration": 868432624,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 74424,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 65869,
  "status": "passed"
});
formatter.after({
  "duration": 697229377,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4811491909,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 15896155107,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-airlines-home-page-gui-options-validation;;4",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Airlines home page GUI options validation",
  "keyword": "Scenario Outline",
  "line": 49,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates airlines home page elements from \"Book Flight\" with \"drpdwn__From city __ drpdwn__To city __ drpdwn__Depart date __ drpdwn__Arrive date\" with \u003cexpected GUI options value\u003e",
  "keyword": "When ",
  "line": 41,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 42
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 43
});
formatter.match({
  "arguments": [
    {
      "val": "Book Flight",
      "offset": 55
    },
    {
      "val": "drpdwn__From city __ drpdwn__To city __ drpdwn__Depart date __ drpdwn__Arrive date",
      "offset": 74
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_airlines_home_page_elements_from_with_with_expected_GUI_options_value(String,String)"
});
formatter.result({
  "duration": 2436604079,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 74851,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 396500,
  "status": "passed"
});
formatter.after({
  "duration": 487936053,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4613167559,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 16422364302,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-airlines-home-page-gui-options-validation;;5",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Airlines home page GUI options validation",
  "keyword": "Scenario Outline",
  "line": 50,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates airlines home page elements from \"Book Flight\" with \"btn__Adult count arrows __ btn__Children count arrows __ btn__Infant count arrows\" with \u003cexpected GUI options value\u003e",
  "keyword": "When ",
  "line": 41,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 42
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 43
});
formatter.match({
  "arguments": [
    {
      "val": "Book Flight",
      "offset": 55
    },
    {
      "val": "btn__Adult count arrows __ btn__Children count arrows __ btn__Infant count arrows",
      "offset": 74
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_airlines_home_page_elements_from_with_with_expected_GUI_options_value(String,String)"
});
formatter.result({
  "duration": 1265672438,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 71429,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 56887,
  "status": "passed"
});
formatter.after({
  "duration": 496100016,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4615183421,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 7339101044,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-airlines-home-page-gui-options-validation;;6",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Airlines home page GUI options validation",
  "keyword": "Scenario Outline",
  "line": 51,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates airlines home page elements from \"Web Check-in\" with \"txtbox__Last name __ txtbox__PNR __ tickbox__Permission box __ btn__Login\" with \u003cexpected GUI options value\u003e",
  "keyword": "When ",
  "line": 41,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 42
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 43
});
formatter.match({
  "arguments": [
    {
      "val": "Web Check-in",
      "offset": 55
    },
    {
      "val": "txtbox__Last name __ txtbox__PNR __ tickbox__Permission box __ btn__Login",
      "offset": 75
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_airlines_home_page_elements_from_with_with_expected_GUI_options_value(String,String)"
});
formatter.result({
  "duration": 7387895334,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 70575,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 55176,
  "status": "passed"
});
formatter.after({
  "duration": 463616540,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4610604211,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 16935851713,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-airlines-home-page-gui-options-validation;;7",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Airlines home page GUI options validation",
  "keyword": "Scenario Outline",
  "line": 52,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates airlines home page elements from \"Manage Bookings\" with \"txtbox__Last name __ txtbox__PNR __ btn__Retrieve booking\" with \u003cexpected GUI options value\u003e",
  "keyword": "When ",
  "line": 41,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 42
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 43
});
formatter.match({
  "arguments": [
    {
      "val": "Manage Bookings",
      "offset": 55
    },
    {
      "val": "txtbox__Last name __ txtbox__PNR __ btn__Retrieve booking",
      "offset": 78
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_airlines_home_page_elements_from_with_with_expected_GUI_options_value(String,String)"
});
formatter.result({
  "duration": 1052637814,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 72713,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 108215,
  "status": "passed"
});
formatter.after({
  "duration": 445138877,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4623108285,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 7328157734,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-airlines-home-page-gui-options-validation;;8",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Airlines home page GUI options validation",
  "keyword": "Scenario Outline",
  "line": 53,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates airlines home page elements from \"Flight Status\" with \"drpdwn__Flight date __ btn__Departure __ btn__Arrival __ btn__Flight Number\" with \u003cexpected GUI options value\u003e",
  "keyword": "When ",
  "line": 41,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 42
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 43
});
formatter.match({
  "arguments": [
    {
      "val": "Flight Status",
      "offset": 55
    },
    {
      "val": "drpdwn__Flight date __ btn__Departure __ btn__Arrival __ btn__Flight Number",
      "offset": 76
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_airlines_home_page_elements_from_with_with_expected_GUI_options_value(String,String)"
});
formatter.result({
  "duration": 7784553016,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 69291,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 90677,
  "status": "passed"
});
formatter.after({
  "duration": 445025958,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4123558250,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 14975583394,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-airlines-home-page-gui-options-validation;;9",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Airlines home page GUI options validation",
  "keyword": "Scenario Outline",
  "line": 54,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates airlines home page elements from \"Flight Status\" with \"btn__By City __ drpdwn__Flight code __ btn__SHOW ALL\" with \u003cexpected GUI options value\u003e",
  "keyword": "When ",
  "line": 41,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 42
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 43
});
formatter.match({
  "arguments": [
    {
      "val": "Flight Status",
      "offset": 55
    },
    {
      "val": "btn__By City __ drpdwn__Flight code __ btn__SHOW ALL",
      "offset": 76
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_airlines_home_page_elements_from_with_with_expected_GUI_options_value(String,String)"
});
formatter.result({
  "duration": 759286095,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 67581,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 56460,
  "status": "passed"
});
formatter.after({
  "duration": 529947501,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4557370577,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 15091841256,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-airlines-home-page-gui-options-validation;;10",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Airlines home page GUI options validation",
  "keyword": "Scenario Outline",
  "line": 55,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates airlines home page elements from \"Flight Schedule\" with \"btn__Flight Schedule\" with \u003cexpected GUI options value\u003e",
  "keyword": "When ",
  "line": 41,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 42
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 43
});
formatter.match({
  "arguments": [
    {
      "val": "Flight Schedule",
      "offset": 55
    },
    {
      "val": "btn__Flight Schedule",
      "offset": 78
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_airlines_home_page_elements_from_with_with_expected_GUI_options_value(String,String)"
});
formatter.result({
  "duration": 264306288,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 70575,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 56460,
  "status": "passed"
});
formatter.after({
  "duration": 483315783,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4272437742,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 8261754916,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-airlines-home-page-gui-options-validation;;11",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Airlines home page GUI options validation",
  "keyword": "Scenario Outline",
  "line": 56,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates airlines home page elements from \"Route Map\" with \"btn__Route Map\" with \u003cexpected GUI options value\u003e",
  "keyword": "When ",
  "line": 41,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 42
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 43
});
formatter.match({
  "arguments": [
    {
      "val": "Route Map",
      "offset": 55
    },
    {
      "val": "btn__Route Map",
      "offset": 72
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_airlines_home_page_elements_from_with_with_expected_GUI_options_value(String,String)"
});
formatter.result({
  "duration": 277261611,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 66725,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 49616,
  "status": "passed"
});
formatter.after({
  "duration": 571952961,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4609273563,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 16657486149,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-airlines-home-page-gui-options-validation;;12",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Airlines home page GUI options validation",
  "keyword": "Scenario Outline",
  "line": 57,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates airlines home page elements from \"Book Flight\" with \"special__from city name list __ special__to city name list __ special__select promo list\" with \u003cexpected GUI options value\u003e",
  "keyword": "When ",
  "line": 41,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 42
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 43
});
formatter.match({
  "arguments": [
    {
      "val": "Book Flight",
      "offset": 55
    },
    {
      "val": "special__from city name list __ special__to city name list __ special__select promo list",
      "offset": 74
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_airlines_home_page_elements_from_with_with_expected_GUI_options_value(String,String)"
});
formatter.result({
  "duration": 1005494966,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 60309,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 48333,
  "status": "passed"
});
formatter.after({
  "duration": 468584551,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4332435827,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 18000500009,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-airlines-home-page-gui-options-validation;;13",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Airlines home page GUI options validation",
  "keyword": "Scenario Outline",
  "line": 58,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates airlines home page elements from \"Book Flight\" with \"special__calender depart date __ special__calender arrive date\" with \u003cexpected GUI options value\u003e",
  "keyword": "When ",
  "line": 41,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 42
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 43
});
formatter.match({
  "arguments": [
    {
      "val": "Book Flight",
      "offset": 55
    },
    {
      "val": "special__calender depart date __ special__calender arrive date",
      "offset": 74
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_airlines_home_page_elements_from_with_with_expected_GUI_options_value(String,String)"
});
formatter.result({
  "duration": 2516193191,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 59454,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 50044,
  "status": "passed"
});
formatter.after({
  "duration": 452972209,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4432553108,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 8837881604,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-airlines-home-page-gui-options-validation;;14",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Airlines home page GUI options validation",
  "keyword": "Scenario Outline",
  "line": 59,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates airlines home page elements from \"Bottom options bar\" with \"btn__BOOK FLIGHTS __ btn__WEB CHEC-IN __ btn__MANAGE BOOKING\" with \u003cexpected GUI options value\u003e",
  "keyword": "When ",
  "line": 41,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 42
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 43
});
formatter.match({
  "arguments": [
    {
      "val": "Bottom options bar",
      "offset": 55
    },
    {
      "val": "btn__BOOK FLIGHTS __ btn__WEB CHEC-IN __ btn__MANAGE BOOKING",
      "offset": 81
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_airlines_home_page_elements_from_with_with_expected_GUI_options_value(String,String)"
});
formatter.result({
  "duration": 6715109938,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 112063,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 47905,
  "status": "passed"
});
formatter.after({
  "duration": 482286252,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4225612693,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 18960451813,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-airlines-home-page-gui-options-validation;;15",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Airlines home page GUI options validation",
  "keyword": "Scenario Outline",
  "line": 60,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates airlines home page elements from \"Bottom options bar\" with \"btn__FLIGHT STATUS __ btn__FLIGHT SCHEDULE __ btn__ROUTE MAP\" with \u003cexpected GUI options value\u003e",
  "keyword": "When ",
  "line": 41,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 42
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 43
});
formatter.match({
  "arguments": [
    {
      "val": "Bottom options bar",
      "offset": 55
    },
    {
      "val": "btn__FLIGHT STATUS __ btn__FLIGHT SCHEDULE __ btn__ROUTE MAP",
      "offset": 81
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_airlines_home_page_elements_from_with_with_expected_GUI_options_value(String,String)"
});
formatter.result({
  "duration": 426888336,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 59882,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 49188,
  "status": "passed"
});
formatter.after({
  "duration": 457681019,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4448954173,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 8219315317,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-airlines-plan-my-trip-sub-page-gui-options-validation;;2",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Airlines Plan my trip sub page GUI options validation",
  "keyword": "Scenario Outline",
  "line": 71,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates airlines Plan my trip sub page elements from \"Manage Bookings\" with \"txtbox__Last name __ txtbox__PNR __ btn__Retrieve booking\"",
  "keyword": "When ",
  "line": 65,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 66
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 67
});
formatter.match({
  "arguments": [
    {
      "val": "Manage Bookings",
      "offset": 67
    },
    {
      "val": "txtbox__Last name __ txtbox__PNR __ btn__Retrieve booking",
      "offset": 90
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_airlines_Plan_my_trip_sub_page_elements_from_with(String,String)"
});
formatter.result({
  "duration": 6104015128,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 60309,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 46195,
  "status": "passed"
});
formatter.after({
  "duration": 3516570015,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4686747153,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 11626064283,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-airlines-plan-my-trip-sub-page-gui-options-validation;;3",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Airlines Plan my trip sub page GUI options validation",
  "keyword": "Scenario Outline",
  "line": 72,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates airlines Plan my trip sub page elements from \"Web Check-In\" with \"txtbox__Last name __ txtbox__PNR __ tickbox__Permission box __ btn__Continue\"",
  "keyword": "When ",
  "line": 65,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 66
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 67
});
formatter.match({
  "arguments": [
    {
      "val": "Web Check-In",
      "offset": 67
    },
    {
      "val": "txtbox__Last name __ txtbox__PNR __ tickbox__Permission box __ btn__Continue",
      "offset": 87
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_airlines_Plan_my_trip_sub_page_elements_from_with(String,String)"
});
formatter.result({
  "duration": 10714166379,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 113775,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 109925,
  "status": "passed"
});
formatter.after({
  "duration": 872315071,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4388320920,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 15700128060,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-airlines-plan-my-trip-sub-page-gui-options-validation;;4",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Airlines Plan my trip sub page GUI options validation",
  "keyword": "Scenario Outline",
  "line": 73,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates airlines Plan my trip sub page elements from \"Flight Status\" with \"drpdwn__Flight date __ btn__Departure __ btn__Arrival __ btn__Flight Number\"",
  "keyword": "When ",
  "line": 65,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 66
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 67
});
formatter.match({
  "arguments": [
    {
      "val": "Flight Status",
      "offset": 67
    },
    {
      "val": "drpdwn__Flight date __ btn__Departure __ btn__Arrival __ btn__Flight Number",
      "offset": 88
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_airlines_Plan_my_trip_sub_page_elements_from_with(String,String)"
});
formatter.result({
  "duration": 4973570526,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 62020,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 129600,
  "status": "passed"
});
formatter.after({
  "duration": 452783583,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4366262781,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 8130244000,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-airlines-plan-my-trip-sub-page-gui-options-validation;;5",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Airlines Plan my trip sub page GUI options validation",
  "keyword": "Scenario Outline",
  "line": 74,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates airlines Plan my trip sub page elements from \"Flight Status\" with \"btn__By City __ drpdwn__Flight code __ btn__SHOW ALL\"",
  "keyword": "When ",
  "line": 65,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 66
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 67
});
formatter.match({
  "arguments": [
    {
      "val": "Flight Status",
      "offset": 67
    },
    {
      "val": "btn__By City __ drpdwn__Flight code __ btn__SHOW ALL",
      "offset": 88
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_airlines_Plan_my_trip_sub_page_elements_from_with(String,String)"
});
formatter.result({
  "duration": 9152559199,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 111636,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 229260,
  "status": "passed"
});
formatter.after({
  "duration": 827708196,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4558805162,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 9052391873,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-airlines-plan-my-trip-sub-page-gui-options-validation;;6",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Airlines Plan my trip sub page GUI options validation",
  "keyword": "Scenario Outline",
  "line": 75,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates airlines Plan my trip sub page elements from \"Travel Guide\" with \"lnk__Bengaluru __ lnk__Mumbai __ lnk__Chennai __ lnk__Delhi __ lnk__Kolkata\"",
  "keyword": "When ",
  "line": 65,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 66
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 67
});
formatter.match({
  "arguments": [
    {
      "val": "Travel Guide",
      "offset": 67
    },
    {
      "val": "lnk__Bengaluru __ lnk__Mumbai __ lnk__Chennai __ lnk__Delhi __ lnk__Kolkata",
      "offset": 87
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_airlines_Plan_my_trip_sub_page_elements_from_with(String,String)"
});
formatter.result({
  "duration": 8244355972,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 59881,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 45767,
  "status": "passed"
});
formatter.after({
  "duration": 451958931,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4148402153,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 16928453805,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-airlines-plan-my-trip-sub-page-gui-options-validation;;7",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Airlines Plan my trip sub page GUI options validation",
  "keyword": "Scenario Outline",
  "line": 76,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates airlines Plan my trip sub page elements from \"Route Map\" with \"labl__Route Map __ img_shockwave adobe image\"",
  "keyword": "When ",
  "line": 65,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 66
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 67
});
formatter.match({
  "arguments": [
    {
      "val": "Route Map",
      "offset": 67
    },
    {
      "val": "labl__Route Map __ img_shockwave adobe image",
      "offset": 84
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_airlines_Plan_my_trip_sub_page_elements_from_with(String,String)"
});
formatter.result({
  "duration": 5591044835,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 56032,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 46194,
  "status": "passed"
});
formatter.after({
  "duration": 468992172,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4577406437,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 7938831236,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-airlines-plan-my-trip-sub-page-gui-options-validation;;8",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Airlines Plan my trip sub page GUI options validation",
  "keyword": "Scenario Outline",
  "line": 77,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates airlines Plan my trip sub page elements from \"Group Bookings\" with \"txtbox__Username __ txtbox__Password __ btn__Login\"",
  "keyword": "When ",
  "line": 65,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 66
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 67
});
formatter.match({
  "arguments": [
    {
      "val": "Group Bookings",
      "offset": 67
    },
    {
      "val": "txtbox__Username __ txtbox__Password __ btn__Login",
      "offset": 89
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_airlines_Plan_my_trip_sub_page_elements_from_with(String,String)"
});
formatter.result({
  "duration": 16113091425,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 59881,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 47050,
  "status": "passed"
});
formatter.after({
  "duration": 1604465093,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4548230550,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 15297534858,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-airlines-plan-my-trip-sub-page-gui-options-validation;;9",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Airlines Plan my trip sub page GUI options validation",
  "keyword": "Scenario Outline",
  "line": 78,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates airlines Plan my trip sub page elements from \"Flight Schedule\" with \"btn__Download Full Schedule __ lnk__Jaipur __ lnk__Goa\"",
  "keyword": "When ",
  "line": 65,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 66
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 67
});
formatter.match({
  "arguments": [
    {
      "val": "Flight Schedule",
      "offset": 67
    },
    {
      "val": "btn__Download Full Schedule __ lnk__Jaipur __ lnk__Goa",
      "offset": 90
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_airlines_Plan_my_trip_sub_page_elements_from_with(String,String)"
});
formatter.result({
  "duration": 5861867921,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 69292,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 48332,
  "status": "passed"
});
formatter.after({
  "duration": 1159290286,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4640008075,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 8908575346,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-airlines-plan-my-trip-sub-page-gui-options-validation;;10",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Airlines Plan my trip sub page GUI options validation",
  "keyword": "Scenario Outline",
  "line": 79,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates airlines Plan my trip sub page elements from \"Charters\" with \"labl__groupdesk@goair.in\"",
  "keyword": "When ",
  "line": 65,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 66
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 67
});
formatter.match({
  "arguments": [
    {
      "val": "Charters",
      "offset": 67
    },
    {
      "val": "labl__groupdesk@goair.in",
      "offset": 83
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_airlines_Plan_my_trip_sub_page_elements_from_with(String,String)"
});
formatter.result({
  "duration": 7012946768,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 62875,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 46194,
  "status": "passed"
});
formatter.after({
  "duration": 441377903,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4272832960,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 7315612171,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-airlines-promotions-sub-page-gui-options-validation;;2",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Airlines Promotions sub page GUI options validation",
  "keyword": "Scenario Outline",
  "line": 90,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates airlines Promotions sub page elements from \"Defence Promotion\" with \"labl__Few Terms \u0026 Conditions\"",
  "keyword": "When ",
  "line": 84,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 85
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 86
});
formatter.match({
  "arguments": [
    {
      "val": "Defence Promotion",
      "offset": 65
    },
    {
      "val": "labl__Few Terms \u0026 Conditions",
      "offset": 90
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_airlines_Promotions_sub_page_elements_from_with(String,String)"
});
formatter.result({
  "duration": 6327622224,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 59454,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 46194,
  "status": "passed"
});
formatter.after({
  "duration": 452243795,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4823314619,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 16930484209,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-airlines-promotions-sub-page-gui-options-validation;;3",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Airlines Promotions sub page GUI options validation",
  "keyword": "Scenario Outline",
  "line": 91,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates airlines Promotions sub page elements from \"Additional Flight\" with \"labl__Additional flights table\"",
  "keyword": "When ",
  "line": 84,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 85
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 86
});
formatter.match({
  "arguments": [
    {
      "val": "Additional Flight",
      "offset": 65
    },
    {
      "val": "labl__Additional flights table",
      "offset": 90
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_airlines_Promotions_sub_page_elements_from_with(String,String)"
});
formatter.result({
  "duration": 7129193082,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 56459,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 46194,
  "status": "passed"
});
formatter.after({
  "duration": 433864082,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4653287612,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 18409559539,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-airlines-services-sub-page-gui-options-validation;;2",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Airlines Services sub page GUI options validation",
  "keyword": "Scenario Outline",
  "line": 102,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates airlines Services page elements from \"SMS Services\" with \"labl__SMS information\"",
  "keyword": "When ",
  "line": 96,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 97
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 98
});
formatter.match({
  "arguments": [
    {
      "val": "SMS Services",
      "offset": 59
    },
    {
      "val": "labl__SMS information",
      "offset": 79
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_airlines_Services_page_elements_from_with(String,String)"
});
formatter.result({
  "duration": 7129958708,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 57743,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 47906,
  "status": "passed"
});
formatter.after({
  "duration": 452463645,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4596882407,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 7695986840,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-airlines-services-sub-page-gui-options-validation;;3",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Airlines Services sub page GUI options validation",
  "keyword": "Scenario Outline",
  "line": 103,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates airlines Services page elements from \"Inflight Menu\" with \"labl__Food menu details\"",
  "keyword": "When ",
  "line": 96,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 97
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 98
});
formatter.match({
  "arguments": [
    {
      "val": "Inflight Menu",
      "offset": 59
    },
    {
      "val": "labl__Food menu details",
      "offset": 80
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_airlines_Services_page_elements_from_with(String,String)"
});
formatter.result({
  "duration": 6917097313,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 58171,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 49188,
  "status": "passed"
});
formatter.after({
  "duration": 433687432,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4542821129,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 7321695684,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-airlines-services-sub-page-gui-options-validation;;4",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Airlines Services sub page GUI options validation",
  "keyword": "Scenario Outline",
  "line": 104,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates airlines Services page elements from \"Priority Check-in\" with \"labl__Priority Check-in charges information\"",
  "keyword": "When ",
  "line": 96,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 97
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 98
});
formatter.match({
  "arguments": [
    {
      "val": "Priority Check-in",
      "offset": 59
    },
    {
      "val": "labl__Priority Check-in charges information",
      "offset": 84
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_airlines_Services_page_elements_from_with(String,String)"
});
formatter.result({
  "duration": 6602883798,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 59026,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 47050,
  "status": "passed"
});
formatter.after({
  "duration": 431913661,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4193650186,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 8547488022,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-airlines-services-sub-page-gui-options-validation;;5",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Airlines Services sub page GUI options validation",
  "keyword": "Scenario Outline",
  "line": 105,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates airlines Services page elements from \"Pre-Book Seats\" with \"labl__Pre-Book Seats charges information\"",
  "keyword": "When ",
  "line": 96,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 97
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 98
});
formatter.match({
  "arguments": [
    {
      "val": "Pre-Book Seats",
      "offset": 59
    },
    {
      "val": "labl__Pre-Book Seats charges information",
      "offset": 81
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_airlines_Services_page_elements_from_with(String,String)"
});
formatter.result({
  "duration": 6325059303,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 57315,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 45766,
  "status": "passed"
});
formatter.after({
  "duration": 446327094,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4454263507,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 18275621290,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-airlines-gui-sub-options-validation",
  "description": "",
  "name": "GoAir Airlines GUI sub options validation",
  "keyword": "Scenario",
  "line": 109,
  "type": "scenario",
  "comments": [
    {
      "value": "#\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d",
      "line": 107
    },
    {
      "value": "#\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d",
      "line": 108
    }
  ]
});
formatter.step({
  "name": "GoAir User validates airlines GoBusiness sub page elements for \"labl__Go Business related information\"",
  "keyword": "When ",
  "line": 110
});
formatter.step({
  "name": "GoAir User validates airlines GoHolidays sub page elements for \"url__Subpages __ tab__Honeymoon\"",
  "keyword": "And ",
  "line": 111
});
formatter.step({
  "name": "GoAir User validates airlines Careers sub page elements for \"lnk__General Openings\"",
  "keyword": "And ",
  "line": 112
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 113
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 114
});
formatter.match({
  "arguments": [
    {
      "val": "labl__Go Business related information",
      "offset": 64
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_airlines_GoBusiness_sub_page_elements_for(String)"
});
formatter.result({
  "duration": 6505102316,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "url__Subpages __ tab__Honeymoon",
      "offset": 64
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_airlines_GoHolidays_sub_page_elements_for(String)"
});
formatter.result({
  "duration": 5367398388,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "lnk__General Openings",
      "offset": 61
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_airlines_Careers_sub_page_elements_for(String)"
});
formatter.result({
  "duration": 4799928399,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 73568,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 48760,
  "status": "passed"
});
formatter.after({
  "duration": 3303791171,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4233674001,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 19277490015,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-ticket-flight-booking-search-result-information-validation;;2",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Ticket flight booking search result information validation",
  "keyword": "Scenario Outline",
  "line": 128,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User performs simple valid flight search with default parameters for one way flight type",
  "keyword": "When ",
  "line": 121
});
formatter.step({
  "name": "GoAir Basic search result information from \"pop up__book return ticket\" should be shown",
  "keyword": "Then ",
  "line": 122,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 123
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 124
});
formatter.match({
  "location": "StepDefGoAir.GoAir_User_performs_simple_valid_flight_search_with_default_parameters_for_one_way_flight_type()"
});
formatter.result({
  "duration": 53315516360,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pop up__book return ticket",
      "offset": 44
    }
  ],
  "location": "StepDefGoAir.GoAir_Basic_search_result_information_from_should_be_shown(String)"
});
formatter.result({
  "duration": 453814,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 66725,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 74424,
  "status": "passed"
});
formatter.after({
  "duration": 552266979,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4653433894,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 17741850794,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-ticket-flight-booking-search-result-information-validation;;3",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Ticket flight booking search result information validation",
  "keyword": "Scenario Outline",
  "line": 129,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User performs simple valid flight search with default parameters for one way flight type",
  "keyword": "When ",
  "line": 121
});
formatter.step({
  "name": "GoAir Basic search result information from \"General_options__ btn__Change search __ pop_up__Change search __ labl__Short Summary __ lnk__Prev Day __  lnk__Next day\" should be shown",
  "keyword": "Then ",
  "line": 122,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 123
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 124
});
formatter.match({
  "location": "StepDefGoAir.GoAir_User_performs_simple_valid_flight_search_with_default_parameters_for_one_way_flight_type()"
});
formatter.result({
  "duration": 50477795153,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "General_options__ btn__Change search __ pop_up__Change search __ labl__Short Summary __ lnk__Prev Day __  lnk__Next day",
      "offset": 44
    }
  ],
  "location": "StepDefGoAir.GoAir_Basic_search_result_information_from_should_be_shown(String)"
});
formatter.result({
  "duration": 2029694716,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 59454,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 62875,
  "status": "passed"
});
formatter.after({
  "duration": 502667713,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4647007773,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 8275593060,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-ticket-flight-booking-search-result-information-validation;;4",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Ticket flight booking search result information validation",
  "keyword": "Scenario Outline",
  "line": 130,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User performs simple valid flight search with default parameters for one way flight type",
  "keyword": "When ",
  "line": 121
});
formatter.step({
  "name": "GoAir Basic search result information from \"General_options__ tab__Economy __ tab__Premium __ labl__Depart Arrival Time City Terminal __ labl__Duration __ labl__Stops\" should be shown",
  "keyword": "Then ",
  "line": 122,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 123
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 124
});
formatter.match({
  "location": "StepDefGoAir.GoAir_User_performs_simple_valid_flight_search_with_default_parameters_for_one_way_flight_type()"
});
formatter.result({
  "duration": 56571257910,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "General_options__ tab__Economy __ tab__Premium __ labl__Depart Arrival Time City Terminal __ labl__Duration __ labl__Stops",
      "offset": 44
    }
  ],
  "location": "StepDefGoAir.GoAir_Basic_search_result_information_from_should_be_shown(String)"
});
formatter.result({
  "duration": 164049568,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 62020,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 49616,
  "status": "passed"
});
formatter.after({
  "duration": 532128892,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4667103087,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 9651589122,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-ticket-flight-booking-search-result-information-validation;;5",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Ticket flight booking search result information validation",
  "keyword": "Scenario Outline",
  "line": 131,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User performs simple valid flight search with default parameters for one way flight type",
  "keyword": "When ",
  "line": 121
});
formatter.step({
  "name": "GoAir Basic search result information from \"General_options__ labl__Ticket Fare Types for GoValue GoPromo GoSmart GoLite __ btn__Go back __ btn__Continue __ lnk__Chat with expert\" should be shown",
  "keyword": "Then ",
  "line": 122,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 123
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 124
});
formatter.match({
  "location": "StepDefGoAir.GoAir_User_performs_simple_valid_flight_search_with_default_parameters_for_one_way_flight_type()"
});
formatter.result({
  "duration": 58655449756,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "General_options__ labl__Ticket Fare Types for GoValue GoPromo GoSmart GoLite __ btn__Go back __ btn__Continue __ lnk__Chat with expert",
      "offset": 44
    }
  ],
  "location": "StepDefGoAir.GoAir_Basic_search_result_information_from_should_be_shown(String)"
});
formatter.result({
  "duration": 1621666857,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 59453,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 47906,
  "status": "passed"
});
formatter.after({
  "duration": 546719830,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4639848535,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 18403770299,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-ticket-flight-booking-search-result-information-validation;;6",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Ticket flight booking search result information validation",
  "keyword": "Scenario Outline",
  "line": 132,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User performs simple valid flight search with default parameters for one way flight type",
  "keyword": "When ",
  "line": 121
});
formatter.step({
  "name": "GoAir Basic search result information from \"General_options__ labl__Total fare __ labl__Booking Summary __ lnk__Show full Tax breakdown __ hoover__Any fare details hoover\" should be shown",
  "keyword": "Then ",
  "line": 122,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 123
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 124
});
formatter.match({
  "location": "StepDefGoAir.GoAir_User_performs_simple_valid_flight_search_with_default_parameters_for_one_way_flight_type()"
});
formatter.result({
  "duration": 52332041893,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "General_options__ labl__Total fare __ labl__Booking Summary __ lnk__Show full Tax breakdown __ hoover__Any fare details hoover",
      "offset": 44
    }
  ],
  "location": "StepDefGoAir.GoAir_Basic_search_result_information_from_should_be_shown(String)"
});
formatter.result({
  "duration": 20972286927,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 65014,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 47905,
  "status": "passed"
});
formatter.after({
  "duration": 574864476,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4272068189,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 15226117834,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-ticket-booking-end-to-end-scenario-validation-type-first;;2",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Ticket booking End-To-End scenario validation type first",
  "keyword": "Scenario Outline",
  "line": 144,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User performs simple valid flight search with default parameters for one way flight type",
  "keyword": "When ",
  "line": 137
});
formatter.step({
  "name": "GoAir User validates end to end ticket booking case type first from \"type_first_01 Select first search result and enter user details and continue\"",
  "keyword": "And ",
  "line": 138,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 139
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 140
});
formatter.match({
  "location": "StepDefGoAir.GoAir_User_performs_simple_valid_flight_search_with_default_parameters_for_one_way_flight_type()"
});
formatter.result({
  "duration": 52156550716,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "type_first_01 Select first search result and enter user details and continue",
      "offset": 69
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_end_to_end_ticket_booking_case_type_first_from(String)"
});
formatter.result({
  "duration": 13500173656,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 83406,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 73568,
  "status": "passed"
});
formatter.after({
  "duration": 590955441,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4655474564,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 7612419470,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-ticket-booking-end-to-end-scenario-validation-type-first;;3",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Ticket booking End-To-End scenario validation type first",
  "keyword": "Scenario Outline",
  "line": 145,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User performs simple valid flight search with default parameters for one way flight type",
  "keyword": "When ",
  "line": 137
});
formatter.step({
  "name": "GoAir User validates end to end ticket booking case type first from \"type_first_02 Modify search and book return ticket and select first search result and cancel the same\"",
  "keyword": "And ",
  "line": 138,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 139
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 140
});
formatter.match({
  "location": "StepDefGoAir.GoAir_User_performs_simple_valid_flight_search_with_default_parameters_for_one_way_flight_type()"
});
formatter.result({
  "duration": 59159484046,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "type_first_02 Modify search and book return ticket and select first search result and cancel the same",
      "offset": 69
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_end_to_end_ticket_booking_case_type_first_from(String)"
});
formatter.result({
  "duration": 26364784140,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 121046,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 103936,
  "status": "passed"
});
formatter.after({
  "duration": 615360070,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4741173281,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 8581996768,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-ticket-booking-end-to-end-scenario-validation-type-first;;4",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Ticket booking End-To-End scenario validation type first",
  "keyword": "Scenario Outline",
  "line": 146,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User performs simple valid flight search with default parameters for one way flight type",
  "keyword": "When ",
  "line": 137
});
formatter.step({
  "name": "GoAir User validates end to end ticket booking case type first from \"type_first_03 Select first search result and select special seat and book the ticket until payment section\"",
  "keyword": "And ",
  "line": 138,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 139
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 140
});
formatter.match({
  "location": "StepDefGoAir.GoAir_User_performs_simple_valid_flight_search_with_default_parameters_for_one_way_flight_type()"
});
formatter.result({
  "duration": 57837509912,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "type_first_03 Select first search result and select special seat and book the ticket until payment section",
      "offset": 69
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_end_to_end_ticket_booking_case_type_first_from(String)"
});
formatter.result({
  "duration": 39349028511,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 91960,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 76135,
  "status": "passed"
});
formatter.after({
  "duration": 540739397,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4581678541,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 8592668901,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-ticket-booking-end-to-end-scenario-validation-type-first;;5",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Ticket booking End-To-End scenario validation type first",
  "keyword": "Scenario Outline",
  "line": 147,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User performs simple valid flight search with default parameters for one way flight type",
  "keyword": "When ",
  "line": 137
});
formatter.step({
  "name": "GoAir User validates end to end ticket booking case type first from \"type_first_04 Select first search result from Premium quota and cancel the same\"",
  "keyword": "And ",
  "line": 138,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 139
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 140
});
formatter.match({
  "location": "StepDefGoAir.GoAir_User_performs_simple_valid_flight_search_with_default_parameters_for_one_way_flight_type()"
});
formatter.result({
  "duration": 59300234222,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "type_first_04 Select first search result from Premium quota and cancel the same",
      "offset": 69
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_end_to_end_ticket_booking_case_type_first_from(String)"
});
formatter.result({
  "duration": 10231867724,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 87683,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 81695,
  "status": "passed"
});
formatter.after({
  "duration": 540539222,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4598232732,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 17983366254,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-ticket-booking-end-to-end-scenario-validation-type-first;;6",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Ticket booking End-To-End scenario validation type first",
  "keyword": "Scenario Outline",
  "line": 148,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User performs simple valid flight search with default parameters for one way flight type",
  "keyword": "When ",
  "line": 137
});
formatter.step({
  "name": "GoAir User validates end to end ticket booking case type first from \"type_first_05 Navigate to next day and select first search result from Premium quota and cancel the same\"",
  "keyword": "And ",
  "line": 138,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 139
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 140
});
formatter.match({
  "location": "StepDefGoAir.GoAir_User_performs_simple_valid_flight_search_with_default_parameters_for_one_way_flight_type()"
});
formatter.result({
  "duration": 50069635126,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "type_first_05 Navigate to next day and select first search result from Premium quota and cancel the same",
      "offset": 69
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_end_to_end_ticket_booking_case_type_first_from(String)"
});
formatter.result({
  "duration": 15750879187,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 59454,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 47049,
  "status": "passed"
});
formatter.after({
  "duration": 535566080,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4554385493,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 18731913918,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-ticket-booking-end-to-end-scenario-validation-type-third;;2",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Ticket booking End-To-End scenario validation type third",
  "keyword": "Scenario Outline",
  "line": 162,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User performs simple valid flight search with default parameters for one way flight type",
  "keyword": "When ",
  "line": 155
});
formatter.step({
  "name": "GoAir User validates end to end ticket booking case type third from \"type_third_01 Sort results by departure time in ascending order and book first ticket until payment section\"",
  "keyword": "And ",
  "line": 156,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 157
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 158
});
formatter.match({
  "location": "StepDefGoAir.GoAir_User_performs_simple_valid_flight_search_with_default_parameters_for_one_way_flight_type()"
});
formatter.result({
  "duration": 52914787177,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "type_third_01 Sort results by departure time in ascending order and book first ticket until payment section",
      "offset": 69
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_end_to_end_ticket_booking_case_type_third_from(String)"
});
formatter.result({
  "duration": 62120462387,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 90677,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 75707,
  "status": "passed"
});
formatter.after({
  "duration": 586846727,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4610256899,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 8653874022,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-ticket-booking-end-to-end-scenario-validation-type-third;;3",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Ticket booking End-To-End scenario validation type third",
  "keyword": "Scenario Outline",
  "line": 163,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User performs simple valid flight search with default parameters for one way flight type",
  "keyword": "When ",
  "line": 155
});
formatter.step({
  "name": "GoAir User validates end to end ticket booking case type third from \"type_third_02 Sort results by GoSmart in descending order and book last ticket from until payment section\"",
  "keyword": "And ",
  "line": 156,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 157
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 158
});
formatter.match({
  "location": "StepDefGoAir.GoAir_User_performs_simple_valid_flight_search_with_default_parameters_for_one_way_flight_type()"
});
formatter.result({
  "duration": 57769325625,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "type_third_02 Sort results by GoSmart in descending order and book last ticket from until payment section",
      "offset": 69
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_end_to_end_ticket_booking_case_type_third_from(String)"
});
formatter.result({
  "duration": 48785620186,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 123184,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 103081,
  "status": "passed"
});
formatter.after({
  "duration": 588132037,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4760212545,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 18828001615,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-ticket-booking-end-to-end-scenario-validation-type-third;;4",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Ticket booking End-To-End scenario validation type third",
  "keyword": "Scenario Outline",
  "line": 164,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User performs simple valid flight search with default parameters for one way flight type",
  "keyword": "When ",
  "line": 155
});
formatter.step({
  "name": "GoAir User validates end to end ticket booking case type third from \"type_third_03 Sort results by duration in ascending order and book first ticket and choose middle seat\"",
  "keyword": "And ",
  "line": 156,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 157
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 158
});
formatter.match({
  "location": "StepDefGoAir.GoAir_User_performs_simple_valid_flight_search_with_default_parameters_for_one_way_flight_type()"
});
formatter.result({
  "duration": 50224547233,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "type_third_03 Sort results by duration in ascending order and book first ticket and choose middle seat",
      "offset": 69
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_end_to_end_ticket_booking_case_type_third_from(String)"
});
formatter.result({
  "duration": 40425825871,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 126179,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 105648,
  "status": "passed"
});
formatter.after({
  "duration": 645424340,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4646274228,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 18041877998,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-ticket-booking-end-to-end-scenario-validation-type-third;;5",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Ticket booking End-To-End scenario validation type third",
  "keyword": "Scenario Outline",
  "line": 165,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User performs simple valid flight search with default parameters for one way flight type",
  "keyword": "When ",
  "line": 155
});
formatter.step({
  "name": "GoAir User validates end to end ticket booking case type third from \"type_third_04 For next day sort results by duration in descending order and enter user details\"",
  "keyword": "And ",
  "line": 156,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 157
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 158
});
formatter.match({
  "location": "StepDefGoAir.GoAir_User_performs_simple_valid_flight_search_with_default_parameters_for_one_way_flight_type()"
});
formatter.result({
  "duration": 51668009861,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "type_third_04 For next day sort results by duration in descending order and enter user details",
      "offset": 69
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_end_to_end_ticket_booking_case_type_third_from(String)"
});
formatter.result({
  "duration": 41367463402,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 97521,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 75280,
  "status": "passed"
});
formatter.after({
  "duration": 569504670,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4647406412,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 16109996415,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-ticket-booking-end-to-end-scenario-validation-type-third;;6",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Ticket booking End-To-End scenario validation type third",
  "keyword": "Scenario Outline",
  "line": 166,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User performs simple valid flight search with default parameters for one way flight type",
  "keyword": "When ",
  "line": 155
});
formatter.step({
  "name": "GoAir User validates end to end ticket booking case type third from \"type_third_05 Sort results by stops in ascending order and go to next day book first ticket until payment section\"",
  "keyword": "And ",
  "line": 156,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 157
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 158
});
formatter.match({
  "location": "StepDefGoAir.GoAir_User_performs_simple_valid_flight_search_with_default_parameters_for_one_way_flight_type()"
});
formatter.result({
  "duration": 51251751315,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "type_third_05 Sort results by stops in ascending order and go to next day book first ticket until payment section",
      "offset": 69
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_end_to_end_ticket_booking_case_type_third_from(String)"
});
formatter.result({
  "duration": 67889638308,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 68436,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 48332,
  "status": "passed"
});
formatter.after({
  "duration": 565764226,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4332950378,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 7570440102,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-ticket-booking-end-to-end-scenario-validation-type-third;;7",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Ticket booking End-To-End scenario validation type third",
  "keyword": "Scenario Outline",
  "line": 167,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User performs simple valid flight search with default parameters for one way flight type",
  "keyword": "When ",
  "line": 155
});
formatter.step({
  "name": "GoAir User validates end to end ticket booking case type third from \"type_third_06 Sort results by stops in descending order and book last ticket and choose seat from highest quota\"",
  "keyword": "And ",
  "line": 156,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 157
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 158
});
formatter.match({
  "location": "StepDefGoAir.GoAir_User_performs_simple_valid_flight_search_with_default_parameters_for_one_way_flight_type()"
});
formatter.result({
  "duration": 56956522316,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "type_third_06 Sort results by stops in descending order and book last ticket and choose seat from highest quota",
      "offset": 69
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_end_to_end_ticket_booking_case_type_third_from(String)"
});
formatter.result({
  "duration": 68459131430,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 64158,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 47905,
  "status": "passed"
});
formatter.after({
  "duration": 554769590,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4310036793,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 7618246350,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-ticket-booking-end-to-end-scenario-validation-type-third;;8",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Ticket booking End-To-End scenario validation type third",
  "keyword": "Scenario Outline",
  "line": 168,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User performs simple valid flight search with default parameters for one way flight type",
  "keyword": "When ",
  "line": 155
});
formatter.step({
  "name": "GoAir User validates end to end ticket booking case type third from \"type_third_07 Sort results by non sold out category of price in ascending order and change search\"",
  "keyword": "And ",
  "line": 156,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 157
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 158
});
formatter.match({
  "location": "StepDefGoAir.GoAir_User_performs_simple_valid_flight_search_with_default_parameters_for_one_way_flight_type()"
});
formatter.result({
  "duration": 57259002942,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "type_third_07 Sort results by non sold out category of price in ascending order and change search",
      "offset": 69
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_end_to_end_ticket_booking_case_type_third_from(String)"
});
formatter.result({
  "duration": 62834970517,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 129600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 109069,
  "status": "passed"
});
formatter.after({
  "duration": 522202280,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4608967740,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 17023997009,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-ticket-booking-end-to-end-scenario-validation-type-third;;9",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Ticket booking End-To-End scenario validation type third",
  "keyword": "Scenario Outline",
  "line": 169,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User performs simple valid flight search with default parameters for one way flight type",
  "keyword": "When ",
  "line": 155
});
formatter.step({
  "name": "GoAir User validates end to end ticket booking case type third from \"type_third_08 Sort business class results by price in descending order and book first ticket until payment section\"",
  "keyword": "And ",
  "line": 156,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 157
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 158
});
formatter.match({
  "location": "StepDefGoAir.GoAir_User_performs_simple_valid_flight_search_with_default_parameters_for_one_way_flight_type()"
});
formatter.result({
  "duration": 51738163389,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "type_third_08 Sort business class results by price in descending order and book first ticket until payment section",
      "offset": 69
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_end_to_end_ticket_booking_case_type_third_from(String)"
});
formatter.result({
  "duration": 61030210979,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 63303,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 48761,
  "status": "passed"
});
formatter.after({
  "duration": 545481998,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4773168295,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 10399588444,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-ticket-booking-end-to-end-scenario-validation-type-third;;2",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Ticket booking End-To-End scenario validation type third",
  "keyword": "Scenario Outline",
  "line": 183,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User performs simple valid flight search with default parameters until payment section",
  "keyword": "When ",
  "line": 176
});
formatter.step({
  "name": "GoAir Use payment type from \"Credit_card_type__ Amex __ Visa __ Master Card\"",
  "keyword": "And ",
  "line": 177,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 178
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 179
});
formatter.match({
  "location": "StepDefGoAir.GoAir_User_performs_simple_valid_flight_search_with_default_parameters_until_payment_section()"
});
formatter.result({
  "duration": 77051697250,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Credit_card_type__ Amex __ Visa __ Master Card",
      "offset": 29
    }
  ],
  "location": "StepDefGoAir.GoAir_Use_payment_type_from(String)"
});
formatter.result({
  "duration": 27990851418,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 60736,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 49616,
  "status": "passed"
});
formatter.after({
  "duration": 870292366,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4713325047,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 18135951972,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-ticket-booking-end-to-end-scenario-validation-type-third;;3",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Ticket booking End-To-End scenario validation type third",
  "keyword": "Scenario Outline",
  "line": 184,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User performs simple valid flight search with default parameters until payment section",
  "keyword": "When ",
  "line": 176
});
formatter.step({
  "name": "GoAir Use payment type from \"Debit_card_type__ Visa __ RuPay __ Mastero Card\"",
  "keyword": "And ",
  "line": 177,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 178
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 179
});
formatter.match({
  "location": "StepDefGoAir.GoAir_User_performs_simple_valid_flight_search_with_default_parameters_until_payment_section()"
});
formatter.result({
  "duration": 70123113846,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Debit_card_type__ Visa __ RuPay __ Mastero Card",
      "offset": 29
    }
  ],
  "location": "StepDefGoAir.GoAir_Use_payment_type_from(String)"
});
formatter.result({
  "duration": 26943149962,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 76562,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 63731,
  "status": "passed"
});
formatter.after({
  "duration": 868874035,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4569523918,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 7643419172,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-ticket-booking-end-to-end-scenario-validation-type-third;;4",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Ticket booking End-To-End scenario validation type third",
  "keyword": "Scenario Outline",
  "line": 185,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User performs simple valid flight search with default parameters until payment section",
  "keyword": "When ",
  "line": 176
});
formatter.step({
  "name": "GoAir Use payment type from \"Netbanking_type_top_banks__ SBI Bank\"",
  "keyword": "And ",
  "line": 177,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 178
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 179
});
formatter.match({
  "location": "StepDefGoAir.GoAir_User_performs_simple_valid_flight_search_with_default_parameters_until_payment_section()"
});
formatter.result({
  "duration": 76565803150,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Netbanking_type_top_banks__ SBI Bank",
      "offset": 29
    }
  ],
  "location": "StepDefGoAir.GoAir_Use_payment_type_from(String)"
});
formatter.result({
  "duration": 16209501198,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 112064,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 118480,
  "status": "passed"
});
formatter.after({
  "duration": 528592044,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4323375784,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 16069370793,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-ticket-booking-end-to-end-scenario-validation-type-third;;5",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Ticket booking End-To-End scenario validation type third",
  "keyword": "Scenario Outline",
  "line": 186,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User performs simple valid flight search with default parameters until payment section",
  "keyword": "When ",
  "line": 176
});
formatter.step({
  "name": "GoAir Use payment type from \"Netbanking_type_top_banks__ Axis Corporate Bank\"",
  "keyword": "And ",
  "line": 177,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 178
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 179
});
formatter.match({
  "location": "StepDefGoAir.GoAir_User_performs_simple_valid_flight_search_with_default_parameters_until_payment_section()"
});
formatter.result({
  "duration": 70397182927,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Netbanking_type_top_banks__ Axis Corporate Bank",
      "offset": 29
    }
  ],
  "location": "StepDefGoAir.GoAir_Use_payment_type_from(String)"
});
formatter.result({
  "duration": 16520922960,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 125323,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 103509,
  "status": "passed"
});
formatter.after({
  "duration": 613306569,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4387341004,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 8243912423,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-ticket-booking-end-to-end-scenario-validation-type-third;;6",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Ticket booking End-To-End scenario validation type third",
  "keyword": "Scenario Outline",
  "line": 187,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User performs simple valid flight search with default parameters until payment section",
  "keyword": "When ",
  "line": 176
});
formatter.step({
  "name": "GoAir Use payment type from \"Netbanking_type_top_banks__ ICICI Bank\"",
  "keyword": "And ",
  "line": 177,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 178
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 179
});
formatter.match({
  "location": "StepDefGoAir.GoAir_User_performs_simple_valid_flight_search_with_default_parameters_until_payment_section()"
});
formatter.result({
  "duration": 75054376084,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Netbanking_type_top_banks__ ICICI Bank",
      "offset": 29
    }
  ],
  "location": "StepDefGoAir.GoAir_Use_payment_type_from(String)"
});
formatter.result({
  "duration": 18206468209,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 111209,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 115913,
  "status": "passed"
});
formatter.after({
  "duration": 628116074,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4636610239,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 8852365183,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-ticket-booking-end-to-end-scenario-validation-type-third;;7",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Ticket booking End-To-End scenario validation type third",
  "keyword": "Scenario Outline",
  "line": 188,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User performs simple valid flight search with default parameters until payment section",
  "keyword": "When ",
  "line": 176
});
formatter.step({
  "name": "GoAir Use payment type from \"Netbanking_type_top_banks__ HDFC Bank\"",
  "keyword": "And ",
  "line": 177,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 178
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 179
});
formatter.match({
  "location": "StepDefGoAir.GoAir_User_performs_simple_valid_flight_search_with_default_parameters_until_payment_section()"
});
formatter.result({
  "duration": 74338620711,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Netbanking_type_top_banks__ HDFC Bank",
      "offset": 29
    }
  ],
  "location": "StepDefGoAir.GoAir_Use_payment_type_from(String)"
});
formatter.result({
  "duration": 28208736855,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 60309,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 46622,
  "status": "passed"
});
formatter.after({
  "duration": 622669013,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4651750801,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 9141505964,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-home-page-offers-check;;2",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@offers",
      "line": 192
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Home page offers check",
  "keyword": "Scenario Outline",
  "line": 200,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates GoAir offers from \"offer_01__ Verify special fare offers from image sliders\"",
  "keyword": "When ",
  "line": 194,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 195
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 196
});
formatter.match({
  "arguments": [
    {
      "val": "offer_01__ Verify special fare offers from image sliders",
      "offset": 40
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_GoAir_offers_from(String)"
});
formatter.result({
  "duration": 82174574564,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 68863,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 54321,
  "status": "passed"
});
formatter.after({
  "duration": 502212615,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4598003472,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 7997598332,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-home-page-offers-check;;3",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@offers",
      "line": 192
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Home page offers check",
  "keyword": "Scenario Outline",
  "line": 201,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates GoAir offers from \"offer_02__ Verify first Honeymoon deal\"",
  "keyword": "When ",
  "line": 194,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 195
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 196
});
formatter.match({
  "arguments": [
    {
      "val": "offer_02__ Verify first Honeymoon deal",
      "offset": 40
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_GoAir_offers_from(String)"
});
formatter.result({
  "duration": 8717983813,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 56887,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 46194,
  "status": "passed"
});
formatter.after({
  "duration": 553388042,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4328163295,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 17342734557,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-support-functionality-validation;;2",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Support functionality validation",
  "keyword": "Scenario Outline",
  "line": 212,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates support functionality from \"labl__GoAir Customer Care numbers __ labl__Tele Check-in\"",
  "keyword": "When ",
  "line": 206,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 207
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 208
});
formatter.match({
  "arguments": [
    {
      "val": "labl__GoAir Customer Care numbers __ labl__Tele Check-in",
      "offset": 49
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_support_functionality_from(String)"
});
formatter.result({
  "duration": 252403593,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 60309,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 46622,
  "status": "passed"
});
formatter.after({
  "duration": 426984573,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4679882188,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 7308306223,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-support-functionality-validation;;3",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Support functionality validation",
  "keyword": "Scenario Outline",
  "line": 213,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates support functionality from \"labl__GoAir Marquee scrolling text user checkin advice\"",
  "keyword": "When ",
  "line": 206,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 207
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 208
});
formatter.match({
  "arguments": [
    {
      "val": "labl__GoAir Marquee scrolling text user checkin advice",
      "offset": 49
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_support_functionality_from(String)"
});
formatter.result({
  "duration": 176435163,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 60310,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 49616,
  "status": "passed"
});
formatter.after({
  "duration": 577285392,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4313148055,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 8747462101,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-support-functionality-validation;;4",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Support functionality validation",
  "keyword": "Scenario Outline",
  "line": 214,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates support functionality from \"Support_Functionality__ lnk__Validate Web Check-in\"",
  "keyword": "When ",
  "line": 206,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 207
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 208
});
formatter.match({
  "arguments": [
    {
      "val": "Support_Functionality__ lnk__Validate Web Check-in",
      "offset": 49
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_support_functionality_from(String)"
});
formatter.result({
  "duration": 11509804282,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 58170,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 48761,
  "status": "passed"
});
formatter.after({
  "duration": 3376400260,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4350188498,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 9144512006,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-support-functionality-validation;;5",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Support functionality validation",
  "keyword": "Scenario Outline",
  "line": 215,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates support functionality from \"Support_Functionality__ lnk__Manage Bookings\"",
  "keyword": "When ",
  "line": 206,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 207
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 208
});
formatter.match({
  "arguments": [
    {
      "val": "Support_Functionality__ lnk__Manage Bookings",
      "offset": 49
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_support_functionality_from(String)"
});
formatter.result({
  "duration": 11712203127,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 63303,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 49188,
  "status": "passed"
});
formatter.after({
  "duration": 2875304860,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4563181204,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 7292025349,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-support-functionality-validation;;6",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Support functionality validation",
  "keyword": "Scenario Outline",
  "line": 216,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates support functionality from \"Support_Functionality__ lnk__Flight Status\"",
  "keyword": "When ",
  "line": 206,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 207
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 208
});
formatter.match({
  "arguments": [
    {
      "val": "Support_Functionality__ lnk__Flight Status",
      "offset": 49
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_support_functionality_from(String)"
});
formatter.result({
  "duration": 28962986503,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 59881,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 47050,
  "status": "passed"
});
formatter.after({
  "duration": 462897965,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4600216086,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 17544439207,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-specific-other-items-validation;;2",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Specific other items validation",
  "keyword": "Scenario Outline",
  "line": 229,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates GoAir specific other items from \"Validate__ Smart SME\"",
  "keyword": "When ",
  "line": 223,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 224
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 225
});
formatter.match({
  "arguments": [
    {
      "val": "Validate__ Smart SME",
      "offset": 54
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_GoAir_specific_other_items_from(String)"
});
formatter.result({
  "duration": 19153238424,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 122757,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 49188,
  "status": "passed"
});
formatter.after({
  "duration": 515058868,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4310731416,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 14979848655,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-specific-other-items-validation;;3",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Specific other items validation",
  "keyword": "Scenario Outline",
  "line": 230,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates GoAir specific other items from \"Validate__ Carry More For Less\"",
  "keyword": "When ",
  "line": 223,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 224
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 225
});
formatter.match({
  "arguments": [
    {
      "val": "Validate__ Carry More For Less",
      "offset": 54
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_GoAir_specific_other_items_from(String)"
});
formatter.result({
  "duration": 13786623626,
  "status": "failed",
  "error_message": "org.openqa.selenium.TimeoutException: Timed out after 10 seconds waiting for title to contain \"Extra Baggage\". Current title: \"GoAir - Route Map\"\nBuild info: version: \u00272.48.2\u0027, revision: \u002741bccdd10cf2c0560f637404c2d96164b67d9d67\u0027, time: \u00272015-10-09 13:08:06\u0027\nSystem info: host: \u0027Shrikant-PC\u0027, ip: \u0027192.168.1.2\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.7.0_15\u0027\nSession ID: 3de14f5e-d349-4a28-b370-37c821fbf545\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{platform\u003dWINDOWS, acceptSslCerts\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, databaseEnabled\u003dtrue, browserName\u003dfirefox, handlesAlerts\u003dtrue, nativeEvents\u003dfalse, webStorageEnabled\u003dtrue, rotatable\u003dfalse, locationContextEnabled\u003dtrue, applicationCacheEnabled\u003dtrue, takesScreenshot\u003dtrue, version\u003d42.0}]\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:80)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:261)\r\n\tat com.trialgroupid.gidPgFact.aidPgFact.pkgAirlines_GoAir.PageGoAir99General.GoAir_Validate_SpecificOtherItem_CarryMoreForLess(PageGoAirResult99General.java:333)\r\n\tat com.trialgroupid.gidPgFact.aidPgFact.pkgAirlines_GoAir.PageGoAir99General.GoAir_Validate_Specific_Other_Item(PageGoAirResult99General.java:214)\r\n\tat com.trialgroupid.gidPgFact.aidPgFact.pkgAirlines_GoAir.clsGoAir.GoAir_User_Validates_Specific_Other_Items(clsGoAir.java:653)\r\n\tat com.trialgroupid.gidPgFact.aidPgFact.pkg0GeneralPageFactory.StepDefGoAir.GoAir_User_validates_GoAir_specific_other_items_from(StepDefGoAir.java:110)\r\n\tat ✽.When GoAir User validates GoAir specific other items from \"Validate__ Carry More For Less\"(src/test/resource/Airlines_GoAir.feature:223)\r\n"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 633622589,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4606874033,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 6890493755,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-specific-other-items-validation;;4",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Specific other items validation",
  "keyword": "Scenario Outline",
  "line": 231,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates GoAir specific other items from \"Validate__ Pre-Book Preferred Seats\"",
  "keyword": "When ",
  "line": 223,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 224
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 225
});
formatter.match({
  "arguments": [
    {
      "val": "Validate__ Pre-Book Preferred Seats",
      "offset": 54
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_GoAir_specific_other_items_from(String)"
});
formatter.result({
  "duration": 6426344271,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 57743,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 47905,
  "status": "passed"
});
formatter.after({
  "duration": 417281662,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4324185464,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 7979184399,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-specific-other-items-validation;;5",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Specific other items validation",
  "keyword": "Scenario Outline",
  "line": 232,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates GoAir specific other items from \"Validate__ Partner Registration\"",
  "keyword": "When ",
  "line": 223,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 224
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 225
});
formatter.match({
  "arguments": [
    {
      "val": "Validate__ Partner Registration",
      "offset": 54
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_GoAir_specific_other_items_from(String)"
});
formatter.result({
  "duration": 28333312660,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 57743,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 45338,
  "status": "passed"
});
formatter.after({
  "duration": 437637887,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4306680445,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 7147388875,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-specific-other-items-validation;;6",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Specific other items validation",
  "keyword": "Scenario Outline",
  "line": 233,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates GoAir specific other items from \"Validate__ Advertise With Us\"",
  "keyword": "When ",
  "line": 223,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 224
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 225
});
formatter.match({
  "arguments": [
    {
      "val": "Validate__ Advertise With Us",
      "offset": 54
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_GoAir_specific_other_items_from(String)"
});
formatter.result({
  "duration": 7482471456,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 62020,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 64586,
  "status": "passed"
});
formatter.after({
  "duration": 418391177,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4575014606,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 18372508831,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-consistancy-of-elements-across-pages-validation;;2",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Consistancy of elements across pages validation",
  "keyword": "Scenario Outline",
  "line": 246,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User navigates between different pages by selecting different options from \"navigate_01__ Plan my trip and Manage Booking screen\"",
  "keyword": "When ",
  "line": 238,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "GoAir User validates consistancy of common web elements \"btn__Home __ img__GoAir_logo __ lnk__Download App\"",
  "keyword": "And ",
  "line": 239
});
formatter.step({
  "name": "GoAir User validates consistancy of common web elements \"btn__BOOK FLIGHTS at bottom bar __ btn__Partner Login\"",
  "keyword": "And ",
  "line": 240
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 241
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 242
});
formatter.match({
  "arguments": [
    {
      "val": "navigate_01__ Plan my trip and Manage Booking screen",
      "offset": 82
    }
  ],
  "location": "StepDefGoAir.GoAir_User_navigates_between_different_pages_by_selecting_different_options_from(String)"
});
formatter.result({
  "duration": 3599501788,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "btn__Home __ img__GoAir_logo __ lnk__Download App",
      "offset": 57
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_consistancy_of_common_web_elements(String)"
});
formatter.result({
  "duration": 261321204,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "btn__BOOK FLIGHTS at bottom bar __ btn__Partner Login",
      "offset": 57
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_consistancy_of_common_web_elements(String)"
});
formatter.result({
  "duration": 254347170,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 62020,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 48333,
  "status": "passed"
});
formatter.after({
  "duration": 437567313,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4278688069,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 15174143419,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-consistancy-of-elements-across-pages-validation;;3",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Consistancy of elements across pages validation",
  "keyword": "Scenario Outline",
  "line": 247,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User navigates between different pages by selecting different options from \"navigate_02__ Go Business screen\"",
  "keyword": "When ",
  "line": 238,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "GoAir User validates consistancy of common web elements \"btn__Home __ img__GoAir_logo __ lnk__Download App\"",
  "keyword": "And ",
  "line": 239
});
formatter.step({
  "name": "GoAir User validates consistancy of common web elements \"btn__BOOK FLIGHTS at bottom bar __ btn__Partner Login\"",
  "keyword": "And ",
  "line": 240
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 241
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 242
});
formatter.match({
  "arguments": [
    {
      "val": "navigate_02__ Go Business screen",
      "offset": 82
    }
  ],
  "location": "StepDefGoAir.GoAir_User_navigates_between_different_pages_by_selecting_different_options_from(String)"
});
formatter.result({
  "duration": 3929491034,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "btn__Home __ img__GoAir_logo __ lnk__Download App",
      "offset": 57
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_consistancy_of_common_web_elements(String)"
});
formatter.result({
  "duration": 220900033,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "btn__BOOK FLIGHTS at bottom bar __ btn__Partner Login",
      "offset": 57
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_consistancy_of_common_web_elements(String)"
});
formatter.result({
  "duration": 290894020,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 59881,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 47049,
  "status": "passed"
});
formatter.after({
  "duration": 465161051,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4561456622,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 15255649161,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-consistancy-of-elements-across-pages-validation;;4",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Consistancy of elements across pages validation",
  "keyword": "Scenario Outline",
  "line": 248,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User navigates between different pages by selecting different options from \"navigate_03__ Promotions screen\"",
  "keyword": "When ",
  "line": 238,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "GoAir User validates consistancy of common web elements \"btn__Home __ img__GoAir_logo __ lnk__Download App\"",
  "keyword": "And ",
  "line": 239
});
formatter.step({
  "name": "GoAir User validates consistancy of common web elements \"btn__BOOK FLIGHTS at bottom bar __ btn__Partner Login\"",
  "keyword": "And ",
  "line": 240
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 241
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 242
});
formatter.match({
  "arguments": [
    {
      "val": "navigate_03__ Promotions screen",
      "offset": 82
    }
  ],
  "location": "StepDefGoAir.GoAir_User_navigates_between_different_pages_by_selecting_different_options_from(String)"
});
formatter.result({
  "duration": 4055815801,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "btn__Home __ img__GoAir_logo __ lnk__Download App",
      "offset": 57
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_consistancy_of_common_web_elements(String)"
});
formatter.result({
  "duration": 264053503,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "btn__BOOK FLIGHTS at bottom bar __ btn__Partner Login",
      "offset": 57
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_consistancy_of_common_web_elements(String)"
});
formatter.result({
  "duration": 303500747,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 55176,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 49616,
  "status": "passed"
});
formatter.after({
  "duration": 685339942,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4636103386,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 7147281089,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-consistancy-of-elements-across-pages-validation;;5",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    }
  ],
  "description": "",
  "name": "GoAir Consistancy of elements across pages validation",
  "keyword": "Scenario Outline",
  "line": 249,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User navigates between different pages by selecting different options from \"navigate_04__ Services screen\"",
  "keyword": "When ",
  "line": 238,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "GoAir User validates consistancy of common web elements \"btn__Home __ img__GoAir_logo __ lnk__Download App\"",
  "keyword": "And ",
  "line": 239
});
formatter.step({
  "name": "GoAir User validates consistancy of common web elements \"btn__BOOK FLIGHTS at bottom bar __ btn__Partner Login\"",
  "keyword": "And ",
  "line": 240
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 241
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 242
});
formatter.match({
  "arguments": [
    {
      "val": "navigate_04__ Services screen",
      "offset": 82
    }
  ],
  "location": "StepDefGoAir.GoAir_User_navigates_between_different_pages_by_selecting_different_options_from(String)"
});
formatter.result({
  "duration": 5678667881,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "btn__Home __ img__GoAir_logo __ lnk__Download App",
      "offset": 57
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_consistancy_of_common_web_elements(String)"
});
formatter.result({
  "duration": 277613627,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "btn__BOOK FLIGHTS at bottom bar __ btn__Partner Login",
      "offset": 57
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_consistancy_of_common_web_elements(String)"
});
formatter.result({
  "duration": 313349513,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 59454,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 54321,
  "status": "passed"
});
formatter.after({
  "duration": 429023105,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4568061530,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 7739920478,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-home-page-functionality-other-items-validation;;2",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    },
    {
      "name": "@homepageother",
      "line": 253
    }
  ],
  "description": "",
  "name": "GoAir Home page functionality other items validation",
  "keyword": "Scenario Outline",
  "line": 261,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates home page other attribute from \"Contact Us\" with \"lnk__Refunds __ lnk__Customer Feedback __ lnk__Call Centre __ lnk__Grievance Redressal\"",
  "keyword": "When ",
  "line": 255,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 256
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 257
});
formatter.match({
  "arguments": [
    {
      "val": "Contact Us",
      "offset": 53
    },
    {
      "val": "lnk__Refunds __ lnk__Customer Feedback __ lnk__Call Centre __ lnk__Grievance Redressal",
      "offset": 71
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_home_page_other_attribute_from_with(String,String)"
});
formatter.result({
  "duration": 186487,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 44055,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 44483,
  "status": "passed"
});
formatter.after({
  "duration": 585317187,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "GoAir.in website functionality validation",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "Init \"firefox\" browser",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "GoAir website under test \"https://www.goair.in\" and short name is \"GoAir\"",
  "keyword": "Given ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 6
    }
  ],
  "location": "StepDef0General.Init_webdriver(String)"
});
formatter.result({
  "duration": 4613081159,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goair.in",
      "offset": 26
    },
    {
      "val": "GoAir",
      "offset": 67
    }
  ],
  "location": "StepDefGoAir.GoAir_website_under_test(String,String)"
});
formatter.result({
  "duration": 16198892367,
  "status": "passed"
});
formatter.scenario({
  "id": "airlines-website-validation---goair;goair-home-page-functionality-other-items-validation;;3",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@airlines",
      "line": 1
    },
    {
      "name": "@GoAir",
      "line": 1
    },
    {
      "name": "@homepageother",
      "line": 253
    }
  ],
  "description": "",
  "name": "GoAir Home page functionality other items validation",
  "keyword": "Scenario Outline",
  "line": 262,
  "type": "scenario"
});
formatter.step({
  "name": "GoAir User validates home page other attribute from \"TravelGuide\" with \"lnk__Bengaluru detail __ lnk__Pune detail\"",
  "keyword": "When ",
  "line": 255,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "GoAir Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 256
});
formatter.step({
  "name": "GoAir Quit the test scenario",
  "keyword": "And ",
  "line": 257
});
formatter.match({
  "arguments": [
    {
      "val": "TravelGuide",
      "offset": 53
    },
    {
      "val": "lnk__Bengaluru detail __ lnk__Pune detail",
      "offset": 72
    }
  ],
  "location": "StepDefGoAir.GoAir_User_validates_home_page_other_attribute_from_with(String,String)"
});
formatter.result({
  "duration": 164674,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.GoAir_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 44911,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGoAir.Quit_the_test_scenario()"
});
formatter.result({
  "duration": 45767,
  "status": "passed"
});
formatter.after({
  "duration": 490065263,
  "status": "passed"
});
});