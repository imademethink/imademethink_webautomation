$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resource/TktTravel_cleartrip.feature");
formatter.feature({
  "id": "travel-ticket-booking-website-validation---cleartrip",
  "tags": [
    {
      "name": "@tkt_flight",
      "line": 1
    },
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    }
  ],
  "description": "",
  "name": "Travel ticket booking website validation - cleartrip",
  "keyword": "Feature",
  "line": 2
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 6063415840,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 14985264435,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-home-page-functionality,-look-n-feel-validation;;2",
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
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Home page functionality, look-n-feel validation",
  "keyword": "Scenario Outline",
  "line": 18,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User validates home page attribute from \"home page URL\" with \"http://www.cleartrip.com\"",
  "keyword": "When ",
  "line": 12,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 13
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 14
});
formatter.match({
  "arguments": [
    {
      "val": "home page URL",
      "offset": 51
    },
    {
      "val": "http://www.cleartrip.com",
      "offset": 72
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_home_page_attribute_from_with(String,String)"
});
formatter.result({
  "duration": 294703,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 114202,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 106931,
  "status": "passed"
});
formatter.after({
  "duration": 704491416,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4413736142,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 10859995236,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-home-page-functionality,-look-n-feel-validation;;3",
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
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Home page functionality, look-n-feel validation",
  "keyword": "Scenario Outline",
  "line": 19,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User validates home page attribute from \"home page title\" with \"Cleartrip\"",
  "keyword": "When ",
  "line": 12,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 13
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 14
});
formatter.match({
  "arguments": [
    {
      "val": "home page title",
      "offset": 51
    },
    {
      "val": "Cleartrip",
      "offset": 74
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_home_page_attribute_from_with(String,String)"
});
formatter.result({
  "duration": 218140,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 62020,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 61593,
  "status": "passed"
});
formatter.after({
  "duration": 482387340,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4299117303,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 14327822805,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-home-page-functionality,-look-n-feel-validation;;4",
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
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Home page functionality, look-n-feel validation",
  "keyword": "Scenario Outline",
  "line": 20,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User validates home page attribute from \"home page loading time\" with \"general home page loading time\"",
  "keyword": "When ",
  "line": 12,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 13
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 14
});
formatter.match({
  "arguments": [
    {
      "val": "home page loading time",
      "offset": 51
    },
    {
      "val": "general home page loading time",
      "offset": 81
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_home_page_attribute_from_with(String,String)"
});
formatter.result({
  "duration": 4649106118,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 174084,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 141577,
  "status": "passed"
});
formatter.after({
  "duration": 745533799,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4302939029,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 14652831179,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-home-page-functionality,-look-n-feel-validation;;5",
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
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Home page functionality, look-n-feel validation",
  "keyword": "Scenario Outline",
  "line": 21,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User validates home page attribute from \"important home page elements\" with \"lnk__Home __ btn__Flights __ btn__Hotels __ btn__Flight+Hotel __ btn__Trains __ btn__Buses\"",
  "keyword": "When ",
  "line": 12,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 13
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 14
});
formatter.match({
  "arguments": [
    {
      "val": "important home page elements",
      "offset": 51
    },
    {
      "val": "lnk__Home __ btn__Flights __ btn__Hotels __ btn__Flight+Hotel __ btn__Trains __ btn__Buses",
      "offset": 87
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_home_page_attribute_from_with(String,String)"
});
formatter.result({
  "duration": 1787109129,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 92816,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 75280,
  "status": "passed"
});
formatter.after({
  "duration": 475140818,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4353801131,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 10700395090,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-home-page-functionality,-look-n-feel-validation;;6",
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
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Home page functionality, look-n-feel validation",
  "keyword": "Scenario Outline",
  "line": 22,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User validates home page attribute from \"important home page elements\" with \"btn__Activities __ btn__Weekend_getaways __ btn__Mobile __ btn_Manage_trip __ btn__More\"",
  "keyword": "When ",
  "line": 12,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 13
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 14
});
formatter.match({
  "arguments": [
    {
      "val": "important home page elements",
      "offset": 51
    },
    {
      "val": "btn__Activities __ btn__Weekend_getaways __ btn__Mobile __ btn_Manage_trip __ btn__More",
      "offset": 87
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_home_page_attribute_from_with(String,String)"
});
formatter.result({
  "duration": 1791431721,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 89823,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 67152,
  "status": "passed"
});
formatter.after({
  "duration": 468451194,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4410334015,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 12097098782,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-home-page-functionality,-look-n-feel-validation;;7",
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
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Home page functionality, look-n-feel validation",
  "keyword": "Scenario Outline",
  "line": 23,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User validates home page attribute from \"important home page elements\" with \"More_button_Options__ Planner __ Collections __ Waytogo __ Air_fare_calendar __ Air_fare_graphs __ Air_Fare_alert\"",
  "keyword": "When ",
  "line": 12,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 13
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 14
});
formatter.match({
  "arguments": [
    {
      "val": "important home page elements",
      "offset": 51
    },
    {
      "val": "More_button_Options__ Planner __ Collections __ Waytogo __ Air_fare_calendar __ Air_fare_graphs __ Air_Fare_alert",
      "offset": 87
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_home_page_attribute_from_with(String,String)"
});
formatter.result({
  "duration": 8516829495,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 84690,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 71430,
  "status": "passed"
});
formatter.after({
  "duration": 488981582,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4268221419,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 10198955580,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-home-page-functionality,-look-n-feel-validation;;8",
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
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Home page functionality, look-n-feel validation",
  "keyword": "Scenario Outline",
  "line": 24,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User validates home page attribute from \"important home page elements\" with \"lnk__Tell_us_what_you_think __ btn__Currency __ btn__Country_Selection\"",
  "keyword": "When ",
  "line": 12,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 13
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 14
});
formatter.match({
  "arguments": [
    {
      "val": "important home page elements",
      "offset": 51
    },
    {
      "val": "lnk__Tell_us_what_you_think __ btn__Currency __ btn__Country_Selection",
      "offset": 87
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_home_page_attribute_from_with(String,String)"
});
formatter.result({
  "duration": 924442749,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 75707,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 58171,
  "status": "passed"
});
formatter.after({
  "duration": 519122530,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4464985763,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 11684307913,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-home-page-functionality,-look-n-feel-validation;;9",
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
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Home page functionality, look-n-feel validation",
  "keyword": "Scenario Outline",
  "line": 25,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User validates home page attribute from \"important home page elements\" with \"labl__DEALS __ lnk__Rewards_Know_More\"",
  "keyword": "When ",
  "line": 12,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 13
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 14
});
formatter.match({
  "arguments": [
    {
      "val": "important home page elements",
      "offset": 51
    },
    {
      "val": "labl__DEALS __ lnk__Rewards_Know_More",
      "offset": 87
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_home_page_attribute_from_with(String,String)"
});
formatter.result({
  "duration": 152995638,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 82979,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 64586,
  "status": "passed"
});
formatter.after({
  "duration": 487729202,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4225663605,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 14226349249,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-home-page-functionality,-look-n-feel-validation;;10",
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
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Home page functionality, look-n-feel validation",
  "keyword": "Scenario Outline",
  "line": 26,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User validates home page attribute from \"pop up\" with \"no_popup __ no_screenshot\"",
  "keyword": "When ",
  "line": 12,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 13
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 14
});
formatter.match({
  "arguments": [
    {
      "val": "pop up",
      "offset": 51
    },
    {
      "val": "no_popup __ no_screenshot",
      "offset": 65
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_home_page_attribute_from_with(String,String)"
});
formatter.result({
  "duration": 11305208,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 72286,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 53038,
  "status": "passed"
});
formatter.after({
  "duration": 528246767,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4511861037,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 11686862289,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-home-page-functionality,-look-n-feel-validation;;11",
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
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Home page functionality, look-n-feel validation",
  "keyword": "Scenario Outline",
  "line": 27,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User validates home page attribute from \"sign up\" with \"sign up link\"",
  "keyword": "When ",
  "line": 12,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 13
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 14
});
formatter.match({
  "arguments": [
    {
      "val": "sign up",
      "offset": 51
    },
    {
      "val": "sign up link",
      "offset": 66
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_home_page_attribute_from_with(String,String)"
});
formatter.result({
  "duration": 665831889,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 82978,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 53038,
  "status": "passed"
});
formatter.after({
  "duration": 450782716,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4360595975,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 15840357938,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-home-page-functionality,-look-n-feel-validation;;12",
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
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Home page functionality, look-n-feel validation",
  "keyword": "Scenario Outline",
  "line": 28,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User validates home page attribute from \"sign in\" with \"sign in link\"",
  "keyword": "When ",
  "line": 12,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 13
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 14
});
formatter.match({
  "arguments": [
    {
      "val": "sign in",
      "offset": 51
    },
    {
      "val": "sign in link",
      "offset": 66
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_home_page_attribute_from_with(String,String)"
});
formatter.result({
  "duration": 470697180,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 84262,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 102654,
  "status": "passed"
});
formatter.after({
  "duration": 479894557,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4376391872,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 14159983815,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-home-page-functionality,-look-n-feel-validation;;13",
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
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Home page functionality, look-n-feel validation",
  "keyword": "Scenario Outline",
  "line": 29,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User validates home page attribute from \"social plugin facebook\" with \"social_plugin__ facebook\"",
  "keyword": "When ",
  "line": 12,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 13
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 14
});
formatter.match({
  "arguments": [
    {
      "val": "social plugin facebook",
      "offset": 51
    },
    {
      "val": "social_plugin__ facebook",
      "offset": 81
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_home_page_attribute_from_with(String,String)"
});
formatter.result({
  "duration": 173312591,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 118480,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 82978,
  "status": "passed"
});
formatter.after({
  "duration": 485496475,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4210446849,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 10883393094,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-home-page-functionality,-look-n-feel-validation;;14",
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
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Home page functionality, look-n-feel validation",
  "keyword": "Scenario Outline",
  "line": 30,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User validates home page attribute from \"social plugin twitter\" with \"social_plugin__ twitter\"",
  "keyword": "When ",
  "line": 12,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 13
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 14
});
formatter.match({
  "arguments": [
    {
      "val": "social plugin twitter",
      "offset": 51
    },
    {
      "val": "social_plugin__ twitter",
      "offset": 80
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_home_page_attribute_from_with(String,String)"
});
formatter.result({
  "duration": 204736288,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 87256,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 127035,
  "status": "passed"
});
formatter.after({
  "duration": 439586150,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4135354107,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 10698539190,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-home-page-functionality,-look-n-feel-validation;;15",
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
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Home page functionality, look-n-feel validation",
  "keyword": "Scenario Outline",
  "line": 31,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User validates home page attribute from \"home page other web elements\" with \"broken links __ broken images __ all frame title\"",
  "keyword": "When ",
  "line": 12,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 13
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 14
});
formatter.match({
  "arguments": [
    {
      "val": "home page other web elements",
      "offset": 51
    },
    {
      "val": "broken links __ broken images __ all frame title",
      "offset": 87
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_home_page_attribute_from_with(String,String)"
});
formatter.result({
  "duration": 67581635442,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 88539,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 53893,
  "status": "passed"
});
formatter.after({
  "duration": 467490095,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4271366912,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 11141337557,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-home-page-functionality,-look-n-feel-validation;;16",
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
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Home page functionality, look-n-feel validation",
  "keyword": "Scenario Outline",
  "line": 32,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User validates home page attribute from \"mobile app download check\" with \"ios __ android __ windows __ blackberry\"",
  "keyword": "When ",
  "line": 12,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 13
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 14
});
formatter.match({
  "arguments": [
    {
      "val": "mobile app download check",
      "offset": 51
    },
    {
      "val": "ios __ android __ windows __ blackberry",
      "offset": 84
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_home_page_attribute_from_with(String,String)"
});
formatter.result({
  "duration": 46191605548,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 1203191,
  "status": "failed",
  "error_message": "java.lang.AssertionError: The following asserts failed:\nERROR:    Unable to navigate to Blackberry app store, ERROR:    Mobile App webite navigation and download test failed for: blackberry, RESULT::OVERALL *****FAIL***** for current test scenario\r\n\tat org.testng.asserts.SoftAssert.assertAll(SoftAssert.java:38)\r\n\tat com.trialgroupid.gidPgFact.aidPgFact.pkgTktTravel_cleartrip.clscleartrip.cleartrip_Validate_Test_Result(clscleartrip.java:533)\r\n\tat com.trialgroupid.gidPgFact.aidPgFact.pkg0GeneralPageFactory.StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage(StepDefcleartrip.java:124)\r\n\tat ✽.Then cleartrip Test result should be successful or log the error meessage(src/test/resource/TktTravel_cleartrip.feature:13)\r\n"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 927665231,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4643240293,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 14806593728,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-ticket-booking-gui-options-validation;;2",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Ticket booking GUI options validation",
  "keyword": "Scenario Outline",
  "line": 43,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User validates ticket booking GUI options from \"List of names under from city\" with \"As available from DB or excel file\"",
  "keyword": "When ",
  "line": 37,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 38
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 39
});
formatter.match({
  "arguments": [
    {
      "val": "List of names under from city",
      "offset": 58
    },
    {
      "val": "As available from DB or excel file",
      "offset": 95
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_ticket_booking_GUI_options_from_with(String,String)"
});
formatter.result({
  "duration": 405999305802,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 529951,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 56460,
  "status": "passed"
});
formatter.after({
  "duration": 550540238,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4322084014,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 11029206369,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-ticket-booking-gui-options-validation;;3",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Ticket booking GUI options validation",
  "keyword": "Scenario Outline",
  "line": 44,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User validates ticket booking GUI options from \"List of names under to city\" with \"As available from DB or excel file\"",
  "keyword": "When ",
  "line": 37,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 38
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 39
});
formatter.match({
  "arguments": [
    {
      "val": "List of names under to city",
      "offset": 58
    },
    {
      "val": "As available from DB or excel file",
      "offset": 93
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_ticket_booking_GUI_options_from_with(String,String)"
});
formatter.result({
  "duration": 406050488697,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 88112,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 508566,
  "status": "passed"
});
formatter.after({
  "duration": 507674034,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4728957732,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 10940981604,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-ticket-booking-gui-options-validation;;4",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Ticket booking GUI options validation",
  "keyword": "Scenario Outline",
  "line": 45,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User validates ticket booking GUI options from \"Common options for person count\" with \"drp_dwn__Adults __ drp_dwn__Children __ drp_dwn__Infants\"",
  "keyword": "When ",
  "line": 37,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 38
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 39
});
formatter.match({
  "arguments": [
    {
      "val": "Common options for person count",
      "offset": 58
    },
    {
      "val": "drp_dwn__Adults __ drp_dwn__Children __ drp_dwn__Infants",
      "offset": 97
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_ticket_booking_GUI_options_from_with(String,String)"
});
formatter.result({
  "duration": 1223028389,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 62020,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 63731,
  "status": "passed"
});
formatter.after({
  "duration": 811461242,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4295893538,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 10452374282,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-ticket-booking-gui-options-validation;;5",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Ticket booking GUI options validation",
  "keyword": "Scenario Outline",
  "line": 46,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User validates ticket booking GUI options from \"Onward journey date selection\" with \"Check__current_date_month_year __ Check__two_months_drop_down_at_a_time\"",
  "keyword": "When ",
  "line": 37,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 38
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 39
});
formatter.match({
  "arguments": [
    {
      "val": "Onward journey date selection",
      "offset": 58
    },
    {
      "val": "Check__current_date_month_year __ Check__two_months_drop_down_at_a_time",
      "offset": 95
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_ticket_booking_GUI_options_from_with(String,String)"
});
formatter.result({
  "duration": 1112424180,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 59882,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 48333,
  "status": "passed"
});
formatter.after({
  "duration": 471896522,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4157150563,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 13912463873,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-ticket-booking-gui-options-validation;;6",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Ticket booking GUI options validation",
  "keyword": "Scenario Outline",
  "line": 47,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User validates ticket booking GUI options from \"Return journey date drop down\" with \"Check__two_months_drop_down_at_a_time\"",
  "keyword": "When ",
  "line": 37,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 38
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 39
});
formatter.match({
  "arguments": [
    {
      "val": "Return journey date drop down",
      "offset": 58
    },
    {
      "val": "Check__two_months_drop_down_at_a_time",
      "offset": 95
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_ticket_booking_GUI_options_from_with(String,String)"
});
formatter.result({
  "duration": 1349211638,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 61165,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 47905,
  "status": "passed"
});
formatter.after({
  "duration": 603257385,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4319426985,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 10918487529,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-ticket-booking-gui-options-validation;;7",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Ticket booking GUI options validation",
  "keyword": "Scenario Outline",
  "line": 48,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User validates ticket booking GUI options from \"Multicity journey options\" with \"text_box__each_for_from_and_to_city __ Check__two_months_drop_down_at_a_time\"",
  "keyword": "When ",
  "line": 37,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 38
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 39
});
formatter.match({
  "arguments": [
    {
      "val": "Multicity journey options",
      "offset": 58
    },
    {
      "val": "text_box__each_for_from_and_to_city __ Check__two_months_drop_down_at_a_time",
      "offset": 91
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_ticket_booking_GUI_options_from_with(String,String)"
});
formatter.result({
  "duration": 2742175300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 70147,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 82551,
  "status": "passed"
});
formatter.after({
  "duration": 583071316,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4354352896,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 11106481365,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-ticket-booking-gui-options-validation;;8",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Ticket booking GUI options validation",
  "keyword": "Scenario Outline",
  "line": 49,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User validates ticket booking GUI options from \"Multicity journey options\" with \"btn__Add_one_more __ btn__Remove_last_city __ drpdown__class_of_travel\"",
  "keyword": "When ",
  "line": 37,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 38
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 39
});
formatter.match({
  "arguments": [
    {
      "val": "Multicity journey options",
      "offset": 58
    },
    {
      "val": "btn__Add_one_more __ btn__Remove_last_city __ drpdown__class_of_travel",
      "offset": 91
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_ticket_booking_GUI_options_from_with(String,String)"
});
formatter.result({
  "duration": 1324070371,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 71002,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 58598,
  "status": "passed"
});
formatter.after({
  "duration": 529330194,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4397681045,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 10506382303,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-ticket-booking-gui-options-validation;;9",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Ticket booking GUI options validation",
  "keyword": "Scenario Outline",
  "line": 50,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User validates ticket booking GUI options from \"Flight+Hotel\" with \"txt_box__Depart_on __ txt_box__Return_on __ Check__two_months_drop_down_at_a_time\"",
  "keyword": "When ",
  "line": 37,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 38
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 39
});
formatter.match({
  "arguments": [
    {
      "val": "Flight+Hotel",
      "offset": 58
    },
    {
      "val": "txt_box__Depart_on __ txt_box__Return_on __ Check__two_months_drop_down_at_a_time",
      "offset": 78
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_ticket_booking_GUI_options_from_with(String,String)"
});
formatter.result({
  "duration": 7608361859,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 75280,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 56032,
  "status": "passed"
});
formatter.after({
  "duration": 487581637,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4674686232,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 19530075292,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-ticket-booking-gui-options-validation;;10",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Ticket booking GUI options validation",
  "keyword": "Scenario Outline",
  "line": 51,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User validates ticket booking GUI options from \"Class of travel\" with \"lnk__More options Class of travel __ Airline preference\"",
  "keyword": "When ",
  "line": 37,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 38
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 39
});
formatter.match({
  "arguments": [
    {
      "val": "Class of travel",
      "offset": 58
    },
    {
      "val": "lnk__More options Class of travel __ Airline preference",
      "offset": 81
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_ticket_booking_GUI_options_from_with(String,String)"
});
formatter.result({
  "duration": 952345838,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 60309,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 46622,
  "status": "passed"
});
formatter.after({
  "duration": 707496186,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4617994233,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 10715905693,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-ticket-booking-gui-options-validation;;11",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Ticket booking GUI options validation",
  "keyword": "Scenario Outline",
  "line": 52,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User validates ticket booking GUI options from \"Invalid city name error check\" with \"error_message__ Sorry, but we can\u0027t continue until you fix everything that\u0027s marked in RED\"",
  "keyword": "When ",
  "line": 37,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 38
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 39
});
formatter.match({
  "arguments": [
    {
      "val": "Invalid city name error check",
      "offset": 58
    },
    {
      "val": "error_message__ Sorry, but we can\u0027t continue until you fix everything that\u0027s marked in RED",
      "offset": 95
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_ticket_booking_GUI_options_from_with(String,String)"
});
formatter.result({
  "duration": 1789526205,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 61592,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 47478,
  "status": "passed"
});
formatter.after({
  "duration": 458388955,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4444179921,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 16417776435,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-ticket-booking-search-scenarions-combination-validation;;2",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Ticket booking search scenarions combination validation",
  "keyword": "Scenario Outline",
  "line": 63,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User validates search scenario with \"valid\" and \"valid\" and \"next friday\" with \"valid flight result\"",
  "keyword": "When ",
  "line": 57,
  "matchedColumns": [
    0,
    1,
    2,
    3
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 58
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 59
});
formatter.match({
  "arguments": [
    {
      "val": "valid",
      "offset": 47
    },
    {
      "val": "valid",
      "offset": 59
    },
    {
      "val": "next friday",
      "offset": 71
    },
    {
      "val": "valid flight result",
      "offset": 90
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_search_scenario_with_and_and_search_date_with(String,String,String,String)"
});
formatter.result({
  "duration": 22532783649,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 61165,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 50044,
  "status": "passed"
});
formatter.after({
  "duration": 534339714,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4648486772,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 11426515719,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-ticket-booking-search-scenarions-combination-validation;;3",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Ticket booking search scenarions combination validation",
  "keyword": "Scenario Outline",
  "line": 64,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User validates search scenario with \"valid\" and \"invalid\" and \"next friday\" with \"error_message__ Sorry, but we can\u0027t continue until you fix everything that\u0027s marked in RED\"",
  "keyword": "When ",
  "line": 57,
  "matchedColumns": [
    0,
    1,
    2,
    3
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 58
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 59
});
formatter.match({
  "arguments": [
    {
      "val": "valid",
      "offset": 47
    },
    {
      "val": "invalid",
      "offset": 59
    },
    {
      "val": "next friday",
      "offset": 73
    },
    {
      "val": "error_message__ Sorry, but we can\u0027t continue until you fix everything that\u0027s marked in RED",
      "offset": 92
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_search_scenario_with_and_and_search_date_with(String,String,String,String)"
});
formatter.result({
  "duration": 2178997916,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 61165,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 53037,
  "status": "passed"
});
formatter.after({
  "duration": 591555247,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4582619638,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 12488685168,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-ticket-booking-search-scenarions-combination-validation;;4",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Ticket booking search scenarions combination validation",
  "keyword": "Scenario Outline",
  "line": 65,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User validates search scenario with \"invalid\" and \"valid\" and \"next friday\" with \"error_message__ Sorry, but we can\u0027t continue until you fix everything that\u0027s marked in RED\"",
  "keyword": "When ",
  "line": 57,
  "matchedColumns": [
    0,
    1,
    2,
    3
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 58
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 59
});
formatter.match({
  "arguments": [
    {
      "val": "invalid",
      "offset": 47
    },
    {
      "val": "valid",
      "offset": 61
    },
    {
      "val": "next friday",
      "offset": 73
    },
    {
      "val": "error_message__ Sorry, but we can\u0027t continue until you fix everything that\u0027s marked in RED",
      "offset": 92
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_search_scenario_with_and_and_search_date_with(String,String,String,String)"
});
formatter.result({
  "duration": 1803796832,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 81267,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 47478,
  "status": "passed"
});
formatter.after({
  "duration": 477784161,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4187050702,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 12129118300,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-ticket-booking-search-scenarions-combination-validation;;5",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Ticket booking search scenarions combination validation",
  "keyword": "Scenario Outline",
  "line": 66,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User validates search scenario with \"invalid\" and \"invalid\" and \"next friday\" with \"error_message__ Sorry, but we can\u0027t continue until you fix everything that\u0027s marked in RED\"",
  "keyword": "When ",
  "line": 57,
  "matchedColumns": [
    0,
    1,
    2,
    3
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 58
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 59
});
formatter.match({
  "arguments": [
    {
      "val": "invalid",
      "offset": 47
    },
    {
      "val": "invalid",
      "offset": 61
    },
    {
      "val": "next friday",
      "offset": 75
    },
    {
      "val": "error_message__ Sorry, but we can\u0027t continue until you fix everything that\u0027s marked in RED",
      "offset": 94
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_search_scenario_with_and_and_search_date_with(String,String,String,String)"
});
formatter.result({
  "duration": 2076224502,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 57743,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 45766,
  "status": "passed"
});
formatter.after({
  "duration": 474115133,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4385328337,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 15531317407,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-ticket-booking-search-scenarions-combination-validation;;6",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Ticket booking search scenarions combination validation",
  "keyword": "Scenario Outline",
  "line": 67,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User validates search scenario with \"valid\" and \"valid\" and \"long date from today\" with \"error_message_long_date__ Sorry, there aren\u0027t any flights available for your search __ btn__Try_searching_again\"",
  "keyword": "When ",
  "line": 57,
  "matchedColumns": [
    0,
    1,
    2,
    3
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 58
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 59
});
formatter.match({
  "arguments": [
    {
      "val": "valid",
      "offset": 47
    },
    {
      "val": "valid",
      "offset": 59
    },
    {
      "val": "long date from today",
      "offset": 71
    },
    {
      "val": "error_message_long_date__ Sorry, there aren\u0027t any flights available for your search __ btn__Try_searching_again",
      "offset": 99
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_search_scenario_with_and_and_search_date_with(String,String,String,String)"
});
formatter.result({
  "duration": 52758990894,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 139010,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 102654,
  "status": "passed"
});
formatter.after({
  "duration": 518615248,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4594785857,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 14207436518,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-ticket-booking-search-result-information-validation;;2",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Ticket booking search result information validation",
  "keyword": "Scenario Outline",
  "line": 79,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User performs simple valid flight search with default parameters for one way flight type",
  "keyword": "When ",
  "line": 72
});
formatter.step({
  "name": "cleartrip Basic search result information from \"General_options__ Modify search __ List and Calender __ From To route name __ Booking day date month passener count\" should be shown",
  "keyword": "And ",
  "line": 73,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 74
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 75
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_User_performs_simple_valid_flight_search_with_default_parameters_for_one_way_flight_type()"
});
formatter.result({
  "duration": 33322468112,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "General_options__ Modify search __ List and Calender __ From To route name __ Booking day date month passener count",
      "offset": 48
    }
  ],
  "location": "StepDefcleartrip.cleartrip_Basic_search_result_information_from_should_be_shown(String)"
});
formatter.result({
  "duration": 15756483567,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 116341,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 58170,
  "status": "passed"
});
formatter.after({
  "duration": 591177994,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4206515198,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 10776417707,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-ticket-booking-search-result-information-validation;;3",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Ticket booking search result information validation",
  "keyword": "Scenario Outline",
  "line": 80,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User performs simple valid flight search with default parameters for one way flight type",
  "keyword": "When ",
  "line": 72
});
formatter.step({
  "name": "cleartrip Basic search result information from \"General_options__ icon__Flights __ icon__Hotels __ icon__Packages __ icon_Trains __ icon__Buses __ lnk__Feedback\" should be shown",
  "keyword": "And ",
  "line": 73,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 74
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 75
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_User_performs_simple_valid_flight_search_with_default_parameters_for_one_way_flight_type()"
});
formatter.result({
  "duration": 33825832813,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "General_options__ icon__Flights __ icon__Hotels __ icon__Packages __ icon_Trains __ icon__Buses __ lnk__Feedback",
      "offset": 48
    }
  ],
  "location": "StepDefcleartrip.cleartrip_Basic_search_result_information_from_should_be_shown(String)"
});
formatter.result({
  "duration": 352002118,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 71858,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 61165,
  "status": "passed"
});
formatter.after({
  "duration": 558688834,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4265787234,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 15637171727,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-ticket-booking-search-result-information-validation;;4",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Ticket booking search result information validation",
  "keyword": "Scenario Outline",
  "line": 81,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User performs simple valid flight search with default parameters for one way flight type",
  "keyword": "When ",
  "line": 72
});
formatter.step({
  "name": "cleartrip Basic search result information from \"General_options__ labl__n_out_of_total_flights __ lnk__Set a fare alert __ labl__Flexible with dates?\" should be shown",
  "keyword": "And ",
  "line": 73,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 74
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 75
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_User_performs_simple_valid_flight_search_with_default_parameters_for_one_way_flight_type()"
});
formatter.result({
  "duration": 33784678794,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "General_options__ labl__n_out_of_total_flights __ lnk__Set a fare alert __ labl__Flexible with dates?",
      "offset": 48
    }
  ],
  "location": "StepDefcleartrip.cleartrip_Basic_search_result_information_from_should_be_shown(String)"
});
formatter.result({
  "duration": 1227045585,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 63303,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 47905,
  "status": "passed"
});
formatter.after({
  "duration": 528162504,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4234744214,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 16328107242,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-ticket-booking-search-result-information-validation;;5",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Ticket booking search result information validation",
  "keyword": "Scenario Outline",
  "line": 82,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User performs simple valid flight search with default parameters for one way flight type",
  "keyword": "When ",
  "line": 72
});
formatter.step({
  "name": "cleartrip Basic search result information from \"General_options__ slider__Price_Range __ tick_box__Show only refundable fares __ tick_box__Stops\" should be shown",
  "keyword": "And ",
  "line": 73,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 74
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 75
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_User_performs_simple_valid_flight_search_with_default_parameters_for_one_way_flight_type()"
});
formatter.result({
  "duration": 33675033116,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "General_options__ slider__Price_Range __ tick_box__Show only refundable fares __ tick_box__Stops",
      "offset": 48
    }
  ],
  "location": "StepDefcleartrip.cleartrip_Basic_search_result_information_from_should_be_shown(String)"
});
formatter.result({
  "duration": 254291261,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 106076,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 57315,
  "status": "passed"
});
formatter.after({
  "duration": 490764769,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4446560212,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 16417964207,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-ticket-booking-search-result-information-validation;;6",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Ticket booking search result information validation",
  "keyword": "Scenario Outline",
  "line": 83,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User performs simple valid flight search with default parameters for one way flight type",
  "keyword": "When ",
  "line": 72
});
formatter.step({
  "name": "cleartrip Basic search result information from \"General_options__ tick_box__Airlines __ slider__Departure time __ slider__Trip duration __ slider__Layover duration\" should be shown",
  "keyword": "And ",
  "line": 73,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 74
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 75
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_User_performs_simple_valid_flight_search_with_default_parameters_for_one_way_flight_type()"
});
formatter.result({
  "duration": 33137781449,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "General_options__ tick_box__Airlines __ slider__Departure time __ slider__Trip duration __ slider__Layover duration",
      "offset": 48
    }
  ],
  "location": "StepDefcleartrip.cleartrip_Basic_search_result_information_from_should_be_shown(String)"
});
formatter.result({
  "duration": 367740272,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 60310,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 47050,
  "status": "passed"
});
formatter.after({
  "duration": 513423518,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4741357916,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 11158663427,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-ticket-booking-search-result-information-validation;;7",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Ticket booking search result information validation",
  "keyword": "Scenario Outline",
  "line": 84,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User performs simple valid flight search with default parameters for one way flight type",
  "keyword": "When ",
  "line": 72
});
formatter.step({
  "name": "cleartrip Basic search result information from \"Sortby_options__ Airline __ Depart __ Arrive __ Duration __ Price\" should be shown",
  "keyword": "And ",
  "line": 73,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 74
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 75
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_User_performs_simple_valid_flight_search_with_default_parameters_for_one_way_flight_type()"
});
formatter.result({
  "duration": 33415227193,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sortby_options__ Airline __ Depart __ Arrive __ Duration __ Price",
      "offset": 48
    }
  ],
  "location": "StepDefcleartrip.cleartrip_Basic_search_result_information_from_should_be_shown(String)"
});
formatter.result({
  "duration": 14919355383,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 63303,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 55604,
  "status": "passed"
});
formatter.after({
  "duration": 866230615,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4266703850,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 11617747435,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-ticket-booking-search-result-information-validation;;8",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Ticket booking search result information validation",
  "keyword": "Scenario Outline",
  "line": 85,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User performs simple valid flight search with default parameters for one way flight type",
  "keyword": "When ",
  "line": 72
});
formatter.step({
  "name": "cleartrip Basic search result information from \"General_options_individual_flight__ lnk__Deals Know more __ img__Airlines_logo_main __ labl__Depart_time __ labl__Arrive_time __ labl_Duration\" should be shown",
  "keyword": "And ",
  "line": 73,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 74
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 75
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_User_performs_simple_valid_flight_search_with_default_parameters_for_one_way_flight_type()"
});
formatter.result({
  "duration": 33929652015,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "General_options_individual_flight__ lnk__Deals Know more __ img__Airlines_logo_main __ labl__Depart_time __ labl__Arrive_time __ labl_Duration",
      "offset": 48
    }
  ],
  "location": "StepDefcleartrip.cleartrip_Basic_search_result_information_from_should_be_shown(String)"
});
formatter.result({
  "duration": 1031614034,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 66297,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 47905,
  "status": "passed"
});
formatter.after({
  "duration": 537406505,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4717971179,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 11691613034,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-ticket-booking-search-result-information-validation;;9",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Ticket booking search result information validation",
  "keyword": "Scenario Outline",
  "line": 86,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User performs simple valid flight search with default parameters for one way flight type",
  "keyword": "When ",
  "line": 72
});
formatter.step({
  "name": "cleartrip Basic search result information from \"General_options_individual_flight__ lnk__Flight itinerary __ lnk__Fare rules __ lnk__Baggage Information\" should be shown",
  "keyword": "And ",
  "line": 73,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 74
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 75
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_User_performs_simple_valid_flight_search_with_default_parameters_for_one_way_flight_type()"
});
formatter.result({
  "duration": 33648695930,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "General_options_individual_flight__ lnk__Flight itinerary __ lnk__Fare rules __ lnk__Baggage Information",
      "offset": 48
    }
  ],
  "location": "StepDefcleartrip.cleartrip_Basic_search_result_information_from_should_be_shown(String)"
});
formatter.result({
  "duration": 1010422810,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 63303,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 88967,
  "status": "passed"
});
formatter.after({
  "duration": 482074245,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4361645613,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 15103953080,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-ticket-booking-search-result-information-validation;;10",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Ticket booking search result information validation",
  "keyword": "Scenario Outline",
  "line": 87,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User performs simple valid flight search with default parameters for one way flight type",
  "keyword": "When ",
  "line": 72
});
formatter.step({
  "name": "cleartrip Basic search result information from \"General_options_individual_flight__ img__Long layover optional __ labl__Fare value __ btn__Book\" should be shown",
  "keyword": "And ",
  "line": 73,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 74
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 75
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_User_performs_simple_valid_flight_search_with_default_parameters_for_one_way_flight_type()"
});
formatter.result({
  "duration": 33709604872,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "General_options_individual_flight__ img__Long layover optional __ labl__Fare value __ btn__Book",
      "offset": 48
    }
  ],
  "location": "StepDefcleartrip.cleartrip_Basic_search_result_information_from_should_be_shown(String)"
});
formatter.result({
  "duration": 1071713712,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 60309,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 47050,
  "status": "passed"
});
formatter.after({
  "duration": 517882127,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4434731895,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 11027783326,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-ticket-booking-search-result-information-validation;;11",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Ticket booking search result information validation",
  "keyword": "Scenario Outline",
  "line": 88,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User performs simple valid flight search with default parameters for one way flight type",
  "keyword": "When ",
  "line": 72
});
formatter.step({
  "name": "cleartrip Basic search result information from \"General_options_individual_flight__ lnk__Deals more info __ labl__City Name From and To __ labl__Journey date\" should be shown",
  "keyword": "And ",
  "line": 73,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 74
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 75
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_User_performs_simple_valid_flight_search_with_default_parameters_for_one_way_flight_type()"
});
formatter.result({
  "duration": 33432567605,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "General_options_individual_flight__ lnk__Deals more info __ labl__City Name From and To __ labl__Journey date",
      "offset": 48
    }
  ],
  "location": "StepDefcleartrip.cleartrip_Basic_search_result_information_from_should_be_shown(String)"
});
formatter.result({
  "duration": 1069682872,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 73141,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 49188,
  "status": "passed"
});
formatter.after({
  "duration": 566674038,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4357425675,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 13996656471,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-ticket-booking-search-result-information-validation;;12",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Ticket booking search result information validation",
  "keyword": "Scenario Outline",
  "line": 89,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User performs simple valid flight search with default parameters for one way flight type",
  "keyword": "When ",
  "line": 72
});
formatter.step({
  "name": "cleartrip Basic search result information from \"General_options_individual_flight__ labl__Airlines name __ labl__Flight number __ labl__Journey class __ img__Airlines logo\" should be shown",
  "keyword": "And ",
  "line": 73,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 74
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 75
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_User_performs_simple_valid_flight_search_with_default_parameters_for_one_way_flight_type()"
});
formatter.result({
  "duration": 33386599964,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "General_options_individual_flight__ labl__Airlines name __ labl__Flight number __ labl__Journey class __ img__Airlines logo",
      "offset": 48
    }
  ],
  "location": "StepDefcleartrip.cleartrip_Basic_search_result_information_from_should_be_shown(String)"
});
formatter.result({
  "duration": 885902986,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 68008,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 51755,
  "status": "passed"
});
formatter.after({
  "duration": 508026908,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4299338437,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 9829042037,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-ticket-booking-end-to-end-scenario-validation-type-third;;2",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Ticket booking End-To-End scenario validation type third",
  "keyword": "Scenario Outline",
  "line": 103,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User performs simple valid flight search with default parameters for one way flight type",
  "keyword": "When ",
  "line": 96
});
formatter.step({
  "name": "cleartrip User validates end to end ticket booking case type third from \"type_third_01 Sort results by airlines in ascending order and book the first ticket until payment section\"",
  "keyword": "When ",
  "line": 97,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 98
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 99
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_User_performs_simple_valid_flight_search_with_default_parameters_for_one_way_flight_type()"
});
formatter.result({
  "duration": 33398948822,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "type_third_01 Sort results by airlines in ascending order and book the first ticket until payment section",
      "offset": 73
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_end_to_end_ticket_booking_case_type_third_from(String)"
});
formatter.result({
  "duration": 78581148691,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 181355,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 75280,
  "status": "passed"
});
formatter.after({
  "duration": 626647544,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4665214254,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 14025861129,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-ticket-booking-end-to-end-scenario-validation-type-third;;3",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Ticket booking End-To-End scenario validation type third",
  "keyword": "Scenario Outline",
  "line": 104,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User performs simple valid flight search with default parameters for one way flight type",
  "keyword": "When ",
  "line": 96
});
formatter.step({
  "name": "cleartrip User validates end to end ticket booking case type third from \"type_third_02 Sort results by airlines in descending order and for second result check baggage information\"",
  "keyword": "When ",
  "line": 97,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 98
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 99
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_User_performs_simple_valid_flight_search_with_default_parameters_for_one_way_flight_type()"
});
formatter.result({
  "duration": 33680558900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "type_third_02 Sort results by airlines in descending order and for second result check baggage information",
      "offset": 73
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_end_to_end_ticket_booking_case_type_third_from(String)"
});
formatter.result({
  "duration": 24202431704,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 70574,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 47905,
  "status": "passed"
});
formatter.after({
  "duration": 525108546,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4434674580,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 14264227321,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-ticket-booking-end-to-end-scenario-validation-type-third;;4",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Ticket booking End-To-End scenario validation type third",
  "keyword": "Scenario Outline",
  "line": 105,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User performs simple valid flight search with default parameters for one way flight type",
  "keyword": "When ",
  "line": 96
});
formatter.step({
  "name": "cleartrip User validates end to end ticket booking case type third from \"type_third_03 Sort results by departure time in ascending order and for last flight check cash back offer\"",
  "keyword": "When ",
  "line": 97,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 98
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 99
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_User_performs_simple_valid_flight_search_with_default_parameters_for_one_way_flight_type()"
});
formatter.result({
  "duration": 33725494440,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "type_third_03 Sort results by departure time in ascending order and for last flight check cash back offer",
      "offset": 73
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_end_to_end_ticket_booking_case_type_third_from(String)"
});
formatter.result({
  "duration": 28113983667,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 65870,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 52611,
  "status": "passed"
});
formatter.after({
  "duration": 576169968,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4352412307,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 9937822425,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-ticket-booking-end-to-end-scenario-validation-type-third;;5",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Ticket booking End-To-End scenario validation type third",
  "keyword": "Scenario Outline",
  "line": 106,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User performs simple valid flight search with default parameters for one way flight type",
  "keyword": "When ",
  "line": 96
});
formatter.step({
  "name": "cleartrip User validates end to end ticket booking case type third from \"type_third_04 Sort results by departure time in descending order and modify search for maximum adults\"",
  "keyword": "When ",
  "line": 97,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 98
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 99
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_User_performs_simple_valid_flight_search_with_default_parameters_for_one_way_flight_type()"
});
formatter.result({
  "duration": 33161245177,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "type_third_04 Sort results by departure time in descending order and modify search for maximum adults",
      "offset": 73
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_end_to_end_ticket_booking_case_type_third_from(String)"
});
formatter.result({
  "duration": 50478569037,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 63731,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 48760,
  "status": "passed"
});
formatter.after({
  "duration": 592545860,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4392631747,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 15021279762,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-ticket-booking-end-to-end-scenario-validation-type-third;;6",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Ticket booking End-To-End scenario validation type third",
  "keyword": "Scenario Outline",
  "line": 107,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User performs simple valid flight search with default parameters for one way flight type",
  "keyword": "When ",
  "line": 96
});
formatter.step({
  "name": "cleartrip User validates end to end ticket booking case type third from \"type_third_05 Sort results by arrival time in ascending order and click on calender and select any date in next month calender\"",
  "keyword": "When ",
  "line": 97,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 98
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 99
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_User_performs_simple_valid_flight_search_with_default_parameters_for_one_way_flight_type()"
});
formatter.result({
  "duration": 33891306868,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "type_third_05 Sort results by arrival time in ascending order and click on calender and select any date in next month calender",
      "offset": 73
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_end_to_end_ticket_booking_case_type_third_from(String)"
});
formatter.result({
  "duration": 44792897963,
  "status": "failed",
  "error_message": "org.openqa.selenium.StaleElementReferenceException: Element not found in the cache - perhaps the page has changed since it was looked up\nCommand duration or timeout: 20.26 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/stale_element_reference.html\nBuild info: version: \u00272.48.2\u0027, revision: \u002741bccdd10cf2c0560f637404c2d96164b67d9d67\u0027, time: \u00272015-10-09 13:08:06\u0027\nSystem info: host: \u0027Shrikant-PC\u0027, ip: \u0027192.168.1.2\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.7.0_15\u0027\nSession ID: cb580526-5f98-4ca0-baf7-e4155877449c\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{platform\u003dWINDOWS, acceptSslCerts\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, databaseEnabled\u003dtrue, browserName\u003dfirefox, handlesAlerts\u003dtrue, nativeEvents\u003dfalse, webStorageEnabled\u003dtrue, rotatable\u003dfalse, locationContextEnabled\u003dtrue, applicationCacheEnabled\u003dtrue, takesScreenshot\u003dtrue, version\u003d42.0}]\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:57)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:525)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:647)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:326)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.isDisplayed(RemoteWebElement.java:367)\r\n\tat com.trialgroupid.gidPgFact.aidPgFact.pkgTktTravel_cleartrip.PagecleartripResult1SelectFlight.cleartrip_Validate_EndToEnd_Search_Scenario__TYPE3_CASE5(PagecleartripResult1SelectFlight.java:374)\r\n\tat com.trialgroupid.gidPgFact.aidPgFact.pkgTktTravel_cleartrip.clscleartrip.cleartrip_User_Validates_End_To_End_Valid_Flight_Search__TYPE3__With_Default_Paameters(clscleartrip.java:276)\r\n\tat com.trialgroupid.gidPgFact.aidPgFact.pkg0GeneralPageFactory.StepDefcleartrip.cleartrip_User_validates_end_to_end_ticket_booking_case_type_third_from(StepDefcleartrip.java:44)\r\n\tat ✽.When cleartrip User validates end to end ticket booking case type third from \"type_third_05 Sort results by arrival time in ascending order and click on calender and select any date in next month calender\"(src/test/resource/TktTravel_cleartrip.feature:97)\r\nCaused by: org.openqa.selenium.StaleElementReferenceException: Element not found in the cache - perhaps the page has changed since it was looked up\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/stale_element_reference.html\nBuild info: version: \u00272.48.2\u0027, revision: \u002741bccdd10cf2c0560f637404c2d96164b67d9d67\u0027, time: \u00272015-10-09 13:08:06\u0027\nSystem info: host: \u0027Shrikant-PC\u0027, ip: \u0027192.168.1.2\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.7.0_15\u0027\nDriver info: driver.version: unknown\r\n\tat \u003canonymous class\u003e.fxdriver.cache.getElementAt(resource://fxdriver/modules/web-element-cache.js:9351)\r\n\tat \u003canonymous class\u003e.Utils.getElementAt(file:///C:/Users/Shrikant/AppData/Local/Temp/anonymous603871855681882184webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:8978)\r\n\tat \u003canonymous class\u003e.WebElement.isElementDisplayed(file:///C:/Users/Shrikant/AppData/Local/Temp/anonymous603871855681882184webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12062)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.executeInternal_/h(file:///C:/Users/Shrikant/AppData/Local/Temp/anonymous603871855681882184webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12534)\r\n\tat \u003canonymous class\u003e.fxdriver.Timer.prototype.setTimeout/\u003c.notify(file:///C:/Users/Shrikant/AppData/Local/Temp/anonymous603871855681882184webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:621)\r\n"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 536463370,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4426151726,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 10900157788,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-ticket-booking-end-to-end-scenario-validation-type-third;;7",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Ticket booking End-To-End scenario validation type third",
  "keyword": "Scenario Outline",
  "line": 108,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User performs simple valid flight search with default parameters for one way flight type",
  "keyword": "When ",
  "line": 96
});
formatter.step({
  "name": "cleartrip User validates end to end ticket booking case type third from \"type_third_06 Sort results by arrival time in descending order and uncheck all stops tick box\"",
  "keyword": "When ",
  "line": 97,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 98
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 99
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_User_performs_simple_valid_flight_search_with_default_parameters_for_one_way_flight_type()"
});
formatter.result({
  "duration": 33123659669,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "type_third_06 Sort results by arrival time in descending order and uncheck all stops tick box",
      "offset": 73
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_end_to_end_ticket_booking_case_type_third_from(String)"
});
formatter.result({
  "duration": 23591870054,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 64159,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 47050,
  "status": "passed"
});
formatter.after({
  "duration": 544447719,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4626813930,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 9775202111,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-ticket-booking-end-to-end-scenario-validation-type-third;;8",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Ticket booking End-To-End scenario validation type third",
  "keyword": "Scenario Outline",
  "line": 109,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User performs simple valid flight search with default parameters for one way flight type",
  "keyword": "When ",
  "line": 96
});
formatter.step({
  "name": "cleartrip User validates end to end ticket booking case type third from \"type_third_07 Sort results by duration in ascending order and for third result check cash back offer in detailed view\"",
  "keyword": "When ",
  "line": 97,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 98
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 99
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_User_performs_simple_valid_flight_search_with_default_parameters_for_one_way_flight_type()"
});
formatter.result({
  "duration": 33628668546,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "type_third_07 Sort results by duration in ascending order and for third result check cash back offer in detailed view",
      "offset": 73
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_end_to_end_ticket_booking_case_type_third_from(String)"
});
formatter.result({
  "duration": 28075201384,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 64586,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 315234,
  "status": "passed"
});
formatter.after({
  "duration": 697572958,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4611963307,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 14734132353,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-ticket-booking-end-to-end-scenario-validation-type-third;;9",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Ticket booking End-To-End scenario validation type third",
  "keyword": "Scenario Outline",
  "line": 110,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User performs simple valid flight search with default parameters for one way flight type",
  "keyword": "When ",
  "line": 96
});
formatter.step({
  "name": "cleartrip User validates end to end ticket booking case type third from \"type_third_08 Sort results by any three types in ascending order\"",
  "keyword": "When ",
  "line": 97,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 98
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 99
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_User_performs_simple_valid_flight_search_with_default_parameters_for_one_way_flight_type()"
});
formatter.result({
  "duration": 33645902028,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "type_third_08 Sort results by any three types in ascending order",
      "offset": 73
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_end_to_end_ticket_booking_case_type_third_from(String)"
});
formatter.result({
  "duration": 69503469494,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 126606,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 97949,
  "status": "passed"
});
formatter.after({
  "duration": 675815854,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4230345486,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 14271373327,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-ticket-booking-end-to-end-scenario-validation-type-third;;10",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Ticket booking End-To-End scenario validation type third",
  "keyword": "Scenario Outline",
  "line": 111,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User performs simple valid flight search with default parameters for one way flight type",
  "keyword": "When ",
  "line": 96
});
formatter.step({
  "name": "cleartrip User validates end to end ticket booking case type third from \"type_third_09 Sort results by price in ascending order and reduce price slider bar slightly\"",
  "keyword": "When ",
  "line": 97,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 98
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 99
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_User_performs_simple_valid_flight_search_with_default_parameters_for_one_way_flight_type()"
});
formatter.result({
  "duration": 32947071557,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "type_third_09 Sort results by price in ascending order and reduce price slider bar slightly",
      "offset": 73
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_end_to_end_ticket_booking_case_type_third_from(String)"
});
formatter.result({
  "duration": 45828175892,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 73141,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 48760,
  "status": "passed"
});
formatter.after({
  "duration": 569008562,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4617840680,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 24707139463,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-ticket-booking-end-to-end-scenario-validation-type-third;;11",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Ticket booking End-To-End scenario validation type third",
  "keyword": "Scenario Outline",
  "line": 112,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User performs simple valid flight search with default parameters for one way flight type",
  "keyword": "When ",
  "line": 96
});
formatter.step({
  "name": "cleartrip User validates end to end ticket booking case type third from \"type_third_10 Sort results by price in descending order and use ny two sliders to refine search\"",
  "keyword": "When ",
  "line": 97,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 98
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 99
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_User_performs_simple_valid_flight_search_with_default_parameters_for_one_way_flight_type()"
});
formatter.result({
  "duration": 32862487163,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "type_third_10 Sort results by price in descending order and use ny two sliders to refine search",
      "offset": 73
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_end_to_end_ticket_booking_case_type_third_from(String)"
});
formatter.result({
  "duration": 44894739364,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 65014,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 48760,
  "status": "passed"
});
formatter.after({
  "duration": 538563502,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4614694332,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 11093497335,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-ticket-booking-end-to-end-scenario-validation-type-third;;12",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Ticket booking End-To-End scenario validation type third",
  "keyword": "Scenario Outline",
  "line": 113,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User performs simple valid flight search with default parameters for one way flight type",
  "keyword": "When ",
  "line": 96
});
formatter.step({
  "name": "cleartrip User validates end to end ticket booking case type third from \"type_third_11 Sign in and select any search result and book any ticket with any combination until payment section\"",
  "keyword": "When ",
  "line": 97,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 98
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 99
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_User_performs_simple_valid_flight_search_with_default_parameters_for_one_way_flight_type()"
});
formatter.result({
  "duration": 33517696494,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "type_third_11 Sign in and select any search result and book any ticket with any combination until payment section",
      "offset": 73
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_end_to_end_ticket_booking_case_type_third_from(String)"
});
formatter.result({
  "duration": 189927692178,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 73141,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 47477,
  "status": "passed"
});
formatter.after({
  "duration": 668154866,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4628786598,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 14537998904,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-payment-scenario-validation;;2",
  "tags": [
    {
      "name": "@payment",
      "line": 117
    },
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Payment scenario validation",
  "keyword": "Scenario Outline",
  "line": 126,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User performs simple valid flight search with default parameters for one way flight type until payment section",
  "keyword": "When ",
  "line": 119
});
formatter.step({
  "name": "cleartrip Use payment type from \"Credit_card_type__ Visa __ Master Card\"",
  "keyword": "And ",
  "line": 120,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 121
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 122
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_User_performs_simple_valid_flight_search_with_default_parameters_for_one_way_flight_type_until_payment_section()"
});
formatter.result({
  "duration": 54948065163,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Credit_card_type__ Visa __ Master Card",
      "offset": 33
    }
  ],
  "location": "StepDefcleartrip.cleartrip_Use_payment_type_from(String)"
});
formatter.result({
  "duration": 88682944752,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 135162,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 100944,
  "status": "passed"
});
formatter.after({
  "duration": 783341296,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4390137253,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 11132674408,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-payment-scenario-validation;;3",
  "tags": [
    {
      "name": "@payment",
      "line": 117
    },
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Payment scenario validation",
  "keyword": "Scenario Outline",
  "line": 127,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User performs simple valid flight search with default parameters for one way flight type until payment section",
  "keyword": "When ",
  "line": 119
});
formatter.step({
  "name": "cleartrip Use payment type from \"Credit_card_type__ Diners Club __ Amex\"",
  "keyword": "And ",
  "line": 120,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 121
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 122
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_User_performs_simple_valid_flight_search_with_default_parameters_for_one_way_flight_type_until_payment_section()"
});
formatter.result({
  "duration": 52405796705,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Credit_card_type__ Diners Club __ Amex",
      "offset": 33
    }
  ],
  "location": "StepDefcleartrip.cleartrip_Use_payment_type_from(String)"
});
formatter.result({
  "duration": 96520955333,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 70574,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 49188,
  "status": "passed"
});
formatter.after({
  "duration": 631648937,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4646845590,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 23912020322,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-payment-scenario-validation;;4",
  "tags": [
    {
      "name": "@payment",
      "line": 117
    },
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Payment scenario validation",
  "keyword": "Scenario Outline",
  "line": 128,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User performs simple valid flight search with default parameters for one way flight type until payment section",
  "keyword": "When ",
  "line": 119
});
formatter.step({
  "name": "cleartrip Use payment type from \"Debit_card_type__ Visa __ Mastero Card\"",
  "keyword": "And ",
  "line": 120,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 121
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 122
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_User_performs_simple_valid_flight_search_with_default_parameters_for_one_way_flight_type_until_payment_section()"
});
formatter.result({
  "duration": 53874624297,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Debit_card_type__ Visa __ Mastero Card",
      "offset": 33
    }
  ],
  "location": "StepDefcleartrip.cleartrip_Use_payment_type_from(String)"
});
formatter.result({
  "duration": 20481694425,
  "status": "failed",
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"link text\",\"selector\":\"Debit Card\"}\nCommand duration or timeout: 20.48 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.48.2\u0027, revision: \u002741bccdd10cf2c0560f637404c2d96164b67d9d67\u0027, time: \u00272015-10-09 13:08:06\u0027\nSystem info: host: \u0027Shrikant-PC\u0027, ip: \u0027192.168.1.2\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.7.0_15\u0027\n*** Element info: {Using\u003dlink text, value\u003dDebit Card}\nSession ID: c6f34132-ca3b-4c48-968c-8c0a137ba580\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{platform\u003dWINDOWS, acceptSslCerts\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, databaseEnabled\u003dtrue, browserName\u003dfirefox, handlesAlerts\u003dtrue, nativeEvents\u003dfalse, webStorageEnabled\u003dtrue, rotatable\u003dfalse, locationContextEnabled\u003dtrue, applicationCacheEnabled\u003dtrue, takesScreenshot\u003dtrue, version\u003d42.0}]\r\n\tat sun.reflect.GeneratedConstructorAccessor35.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:525)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:647)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByLinkText(RemoteWebDriver.java:418)\r\n\tat org.openqa.selenium.By$ByLinkText.findElement(By.java:246)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:345)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.click(Unknown Source)\r\n\tat com.trialgroupid.gidPgFact.aidPgFact.pkgTktTravel_cleartrip.PagecleartripResult3Payment.cleartrip_Validate_Payment_Methods_CardPayment(PagecleartripResult3Payment.java:236)\r\n\tat com.trialgroupid.gidPgFact.aidPgFact.pkgTktTravel_cleartrip.clscleartrip.cleartrip_User_Initiats_Payment_Method(clscleartrip.java:383)\r\n\tat com.trialgroupid.gidPgFact.aidPgFact.pkg0GeneralPageFactory.StepDefcleartrip.cleartrip_Use_payment_type_from(StepDefcleartrip.java:56)\r\n\tat ✽.And cleartrip Use payment type from \"Debit_card_type__ Visa __ Mastero Card\"(src/test/resource/TktTravel_cleartrip.feature:120)\r\nCaused by: org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"link text\",\"selector\":\"Debit Card\"}\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.48.2\u0027, revision: \u002741bccdd10cf2c0560f637404c2d96164b67d9d67\u0027, time: \u00272015-10-09 13:08:06\u0027\nSystem info: host: \u0027Shrikant-PC\u0027, ip: \u0027192.168.1.2\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.7.0_15\u0027\nDriver info: driver.version: unknown\r\n\tat \u003canonymous class\u003e.FirefoxDriver.prototype.findElementInternal_(file:///C:/Users/Shrikant/AppData/Local/Temp/anonymous6021196885796569552webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:10659)\r\n\tat \u003canonymous class\u003e.fxdriver.Timer.prototype.setTimeout/\u003c.notify(file:///C:/Users/Shrikant/AppData/Local/Temp/anonymous6021196885796569552webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:621)\r\n"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 614411606,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4375639503,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 11648758377,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-payment-scenario-validation;;5",
  "tags": [
    {
      "name": "@payment",
      "line": 117
    },
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Payment scenario validation",
  "keyword": "Scenario Outline",
  "line": 129,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User performs simple valid flight search with default parameters for one way flight type until payment section",
  "keyword": "When ",
  "line": 119
});
formatter.step({
  "name": "cleartrip Use payment type from \"Debit_card_type__ RuPay __ Visa\"",
  "keyword": "And ",
  "line": 120,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 121
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 122
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_User_performs_simple_valid_flight_search_with_default_parameters_for_one_way_flight_type_until_payment_section()"
});
formatter.result({
  "duration": 56488311337,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Debit_card_type__ RuPay __ Visa",
      "offset": 33
    }
  ],
  "location": "StepDefcleartrip.cleartrip_Use_payment_type_from(String)"
});
formatter.result({
  "duration": 94332453359,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 73141,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 59026,
  "status": "passed"
});
formatter.after({
  "duration": 739612797,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4657057532,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 10805707053,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-payment-scenario-validation;;6",
  "tags": [
    {
      "name": "@payment",
      "line": 117
    },
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Payment scenario validation",
  "keyword": "Scenario Outline",
  "line": 130,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User performs simple valid flight search with default parameters for one way flight type until payment section",
  "keyword": "When ",
  "line": 119
});
formatter.step({
  "name": "cleartrip Use payment type from \"Netbanking_type_top_banks__ SBI Bank\"",
  "keyword": "And ",
  "line": 120,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 121
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 122
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_User_performs_simple_valid_flight_search_with_default_parameters_for_one_way_flight_type_until_payment_section()"
});
formatter.result({
  "duration": 52458157984,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Netbanking_type_top_banks__ SBI Bank",
      "offset": 33
    }
  ],
  "location": "StepDefcleartrip.cleartrip_Use_payment_type_from(String)"
});
formatter.result({
  "duration": 44508379353,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 121901,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 108215,
  "status": "passed"
});
formatter.after({
  "duration": 687118496,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4685037612,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 11340778178,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-payment-scenario-validation;;7",
  "tags": [
    {
      "name": "@payment",
      "line": 117
    },
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Payment scenario validation",
  "keyword": "Scenario Outline",
  "line": 131,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User performs simple valid flight search with default parameters for one way flight type until payment section",
  "keyword": "When ",
  "line": 119
});
formatter.step({
  "name": "cleartrip Use payment type from \"Netbanking_type_top_banks__ Axis Corporate Bank\"",
  "keyword": "And ",
  "line": 120,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 121
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 122
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_User_performs_simple_valid_flight_search_with_default_parameters_for_one_way_flight_type_until_payment_section()"
});
formatter.result({
  "duration": 50618761145,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Netbanking_type_top_banks__ Axis Corporate Bank",
      "offset": 33
    }
  ],
  "location": "StepDefcleartrip.cleartrip_Use_payment_type_from(String)"
});
formatter.result({
  "duration": 20227674769,
  "status": "failed",
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"link text\",\"selector\":\"Net Banking\"}\nCommand duration or timeout: 20.23 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.48.2\u0027, revision: \u002741bccdd10cf2c0560f637404c2d96164b67d9d67\u0027, time: \u00272015-10-09 13:08:06\u0027\nSystem info: host: \u0027Shrikant-PC\u0027, ip: \u0027192.168.1.2\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.7.0_15\u0027\n*** Element info: {Using\u003dlink text, value\u003dNet Banking}\nSession ID: d77bd5d4-27c6-4850-8d78-4ff1a2556911\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{platform\u003dWINDOWS, acceptSslCerts\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, databaseEnabled\u003dtrue, browserName\u003dfirefox, handlesAlerts\u003dtrue, nativeEvents\u003dfalse, webStorageEnabled\u003dtrue, rotatable\u003dfalse, locationContextEnabled\u003dtrue, applicationCacheEnabled\u003dtrue, takesScreenshot\u003dtrue, version\u003d42.0}]\r\n\tat sun.reflect.GeneratedConstructorAccessor35.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:525)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:647)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByLinkText(RemoteWebDriver.java:418)\r\n\tat org.openqa.selenium.By$ByLinkText.findElement(By.java:246)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:345)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.click(Unknown Source)\r\n\tat com.trialgroupid.gidPgFact.aidPgFact.pkgTktTravel_cleartrip.PagecleartripResult3Payment.cleartrip_Validate_Payment_Methods_BankTransfer(PagecleartripResult3Payment.java:308)\r\n\tat com.trialgroupid.gidPgFact.aidPgFact.pkgTktTravel_cleartrip.clscleartrip.cleartrip_User_Initiats_Payment_Method(clscleartrip.java:387)\r\n\tat com.trialgroupid.gidPgFact.aidPgFact.pkg0GeneralPageFactory.StepDefcleartrip.cleartrip_Use_payment_type_from(StepDefcleartrip.java:56)\r\n\tat ✽.And cleartrip Use payment type from \"Netbanking_type_top_banks__ Axis Corporate Bank\"(src/test/resource/TktTravel_cleartrip.feature:120)\r\nCaused by: org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"link text\",\"selector\":\"Net Banking\"}\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.48.2\u0027, revision: \u002741bccdd10cf2c0560f637404c2d96164b67d9d67\u0027, time: \u00272015-10-09 13:08:06\u0027\nSystem info: host: \u0027Shrikant-PC\u0027, ip: \u0027192.168.1.2\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.7.0_15\u0027\nDriver info: driver.version: unknown\r\n\tat \u003canonymous class\u003e.FirefoxDriver.prototype.findElementInternal_(file:///C:/Users/Shrikant/AppData/Local/Temp/anonymous4336664758186022053webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:10659)\r\n\tat \u003canonymous class\u003e.fxdriver.Timer.prototype.setTimeout/\u003c.notify(file:///C:/Users/Shrikant/AppData/Local/Temp/anonymous4336664758186022053webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:621)\r\n"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 567218960,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4353992325,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 11752644305,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-payment-scenario-validation;;8",
  "tags": [
    {
      "name": "@payment",
      "line": 117
    },
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Payment scenario validation",
  "keyword": "Scenario Outline",
  "line": 132,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User performs simple valid flight search with default parameters for one way flight type until payment section",
  "keyword": "When ",
  "line": 119
});
formatter.step({
  "name": "cleartrip Use payment type from \"Netbanking_type_top_banks__ HDFC Bank\"",
  "keyword": "And ",
  "line": 120,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 121
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 122
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_User_performs_simple_valid_flight_search_with_default_parameters_for_one_way_flight_type_until_payment_section()"
});
formatter.result({
  "duration": 52965953064,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Netbanking_type_top_banks__ HDFC Bank",
      "offset": 33
    }
  ],
  "location": "StepDefcleartrip.cleartrip_Use_payment_type_from(String)"
});
formatter.result({
  "duration": 44640477187,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 139438,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 104793,
  "status": "passed"
});
formatter.after({
  "duration": 635072878,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4576016842,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 11306004109,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-home-page-offers-check;;2",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@offers",
      "line": 136
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Home page offers check",
  "keyword": "Scenario Outline",
  "line": 144,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User validates cleartrip offers from \"offer_01__ App Offer\"",
  "keyword": "When ",
  "line": 138,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 139
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 140
});
formatter.match({
  "arguments": [
    {
      "val": "offer_01__ App Offer",
      "offset": 48
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_offers_from(String)"
});
formatter.result({
  "duration": 85715131939,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 79557,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 54749,
  "status": "passed"
});
formatter.after({
  "duration": 516822651,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4633426135,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 14363483977,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-home-page-offers-check;;3",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@offers",
      "line": 136
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Home page offers check",
  "keyword": "Scenario Outline",
  "line": 145,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User validates cleartrip offers from \"offer_02__ Activities offer\"",
  "keyword": "When ",
  "line": 138,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 139
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 140
});
formatter.match({
  "arguments": [
    {
      "val": "offer_02__ Activities offer",
      "offset": 48
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_offers_from(String)"
});
formatter.result({
  "duration": 44278867931,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 67581,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 47477,
  "status": "passed"
});
formatter.after({
  "duration": 520400573,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4564179971,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 13600867256,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-support-functionality-validation;;2",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Support functionality validation",
  "keyword": "Scenario Outline",
  "line": 156,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User validates support functionality from \"Support_Functionality__ Cancel and change flights\"",
  "keyword": "When ",
  "line": 150,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 151
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 152
});
formatter.match({
  "arguments": [
    {
      "val": "Support_Functionality__ Cancel and change flights",
      "offset": 53
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_support_functionality_from(String)"
});
formatter.result({
  "duration": 7432706188,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 62876,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 46195,
  "status": "passed"
});
formatter.after({
  "duration": 589330649,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4257023143,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 13839721055,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-support-functionality-validation;;3",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Support functionality validation",
  "keyword": "Scenario Outline",
  "line": 157,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User validates support functionality from \"Support_Functionality__ Check flight status\"",
  "keyword": "When ",
  "line": 150,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 151
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 152
});
formatter.match({
  "arguments": [
    {
      "val": "Support_Functionality__ Check flight status",
      "offset": 53
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_support_functionality_from(String)"
});
formatter.result({
  "duration": 7623355771,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 109070,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 56887,
  "status": "passed"
});
formatter.after({
  "duration": 537427891,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4242007418,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 26454198958,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-support-functionality-validation;;4",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Support functionality validation",
  "keyword": "Scenario Outline",
  "line": 158,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User validates support functionality from \"Support_Functionality__ Check PNR Status\"",
  "keyword": "When ",
  "line": 150,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 151
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 152
});
formatter.match({
  "arguments": [
    {
      "val": "Support_Functionality__ Check PNR Status",
      "offset": 53
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_support_functionality_from(String)"
});
formatter.result({
  "duration": 125763467894,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 72285,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 47905,
  "status": "passed"
});
formatter.after({
  "duration": 564597859,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4335487643,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 12880304061,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-user-profile-and-user-managemennt-validation;;2",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip User profile and user managemennt validation",
  "keyword": "Scenario Outline",
  "line": 169,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User validates user management case from \"Sign_up__ with dummy users and dummy details\"",
  "keyword": "When ",
  "line": 163,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 164
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 165
});
formatter.match({
  "arguments": [
    {
      "val": "Sign_up__ with dummy users and dummy details",
      "offset": 52
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_user_management_case_from(String)"
});
formatter.result({
  "duration": 107526996525,
  "status": "failed",
  "error_message": "org.openqa.selenium.TimeoutException: Timed out after 5 seconds waiting for element to be clickable: By.cssSelector: #password\nBuild info: version: \u00272.48.2\u0027, revision: \u002741bccdd10cf2c0560f637404c2d96164b67d9d67\u0027, time: \u00272015-10-09 13:08:06\u0027\nSystem info: host: \u0027Shrikant-PC\u0027, ip: \u0027192.168.1.2\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.7.0_15\u0027\nSession ID: 2a66c92a-48d7-4cbd-9149-f0aaf16db4a8\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{platform\u003dWINDOWS, acceptSslCerts\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, databaseEnabled\u003dtrue, browserName\u003dfirefox, handlesAlerts\u003dtrue, nativeEvents\u003dfalse, webStorageEnabled\u003dtrue, rotatable\u003dfalse, locationContextEnabled\u003dtrue, applicationCacheEnabled\u003dtrue, takesScreenshot\u003dtrue, version\u003d42.0}]\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:80)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:261)\r\n\tat com.trialgroupid.gidPgFact.aidPgFact.pkgTktTravel_cleartrip.PagecleartripMain.cleartrip_Validate_SignUp(PagecleartripMain.java:1360)\r\n\tat com.trialgroupid.gidPgFact.aidPgFact.pkgTktTravel_cleartrip.clscleartrip.cleartrip_Validate_SignUp(clscleartrip.java:616)\r\n\tat com.trialgroupid.gidPgFact.aidPgFact.pkgTktTravel_cleartrip.clscleartrip.cleartrip_User_Validates_User_Management_Case_From(clscleartrip.java:431)\r\n\tat com.trialgroupid.gidPgFact.aidPgFact.pkg0GeneralPageFactory.StepDefcleartrip.cleartrip_User_validates_user_management_case_from(StepDefcleartrip.java:74)\r\n\tat ✽.When cleartrip User validates user management case from \"Sign_up__ with dummy users and dummy details\"(src/test/resource/TktTravel_cleartrip.feature:163)\r\n"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 539422802,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4321038226,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 11886723791,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-user-profile-and-user-managemennt-validation;;3",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip User profile and user managemennt validation",
  "keyword": "Scenario Outline",
  "line": 170,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User validates user management case from \"Sign_in__ with pre regstered user and sign out\"",
  "keyword": "When ",
  "line": 163,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 164
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 165
});
formatter.match({
  "arguments": [
    {
      "val": "Sign_in__ with pre regstered user and sign out",
      "offset": 52
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_user_management_case_from(String)"
});
formatter.result({
  "duration": 108709326422,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 66725,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 46622,
  "status": "passed"
});
formatter.after({
  "duration": 551979962,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4210229992,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 14719164533,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-user-profile-and-user-managemennt-validation;;4",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip User profile and user managemennt validation",
  "keyword": "Scenario Outline",
  "line": 171,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User validates user management case from \"Edit_profile__ update few details and conform\"",
  "keyword": "When ",
  "line": 163,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 164
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 165
});
formatter.match({
  "arguments": [
    {
      "val": "Edit_profile__ update few details and conform",
      "offset": 52
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_user_management_case_from(String)"
});
formatter.result({
  "duration": 123991915136,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 73569,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 47905,
  "status": "passed"
});
formatter.after({
  "duration": 829298244,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4705902908,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 13643759979,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-specific-other-items-validation;;2",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Specific other items validation",
  "keyword": "Scenario Outline",
  "line": 182,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User validates cleartrip specific other items from \"Cheap air tickets\"",
  "keyword": "When ",
  "line": 176,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 177
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 178
});
formatter.match({
  "arguments": [
    {
      "val": "Cheap air tickets",
      "offset": 62
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_cleartrip_specific_other_items_from(String)"
});
formatter.result({
  "duration": 4846045829,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 115486,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 97522,
  "status": "passed"
});
formatter.after({
  "duration": 501898887,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4329095288,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 10001339636,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-specific-other-items-validation;;3",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Specific other items validation",
  "keyword": "Scenario Outline",
  "line": 183,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User validates cleartrip specific other items from \"Flight tickets\"",
  "keyword": "When ",
  "line": 176,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 177
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 178
});
formatter.match({
  "arguments": [
    {
      "val": "Flight tickets",
      "offset": 62
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_cleartrip_specific_other_items_from(String)"
});
formatter.result({
  "duration": 4625591919,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 80840,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 68008,
  "status": "passed"
});
formatter.after({
  "duration": 438572869,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4672433830,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 10878844663,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-specific-other-items-validation;;4",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Specific other items validation",
  "keyword": "Scenario Outline",
  "line": 184,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User validates cleartrip specific other items from \"India hotels\"",
  "keyword": "When ",
  "line": 176,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 177
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 178
});
formatter.match({
  "arguments": [
    {
      "val": "India hotels",
      "offset": 62
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_cleartrip_specific_other_items_from(String)"
});
formatter.result({
  "duration": 4804116343,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 62448,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 47906,
  "status": "passed"
});
formatter.after({
  "duration": 470032066,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4305021624,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 10328898534,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-specific-other-items-validation;;5",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Specific other items validation",
  "keyword": "Scenario Outline",
  "line": 185,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User validates cleartrip specific other items from \"IRCTC Railway Reservation\"",
  "keyword": "When ",
  "line": 176,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 177
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 178
});
formatter.match({
  "arguments": [
    {
      "val": "IRCTC Railway Reservation",
      "offset": 62
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_cleartrip_specific_other_items_from(String)"
});
formatter.result({
  "duration": 4030342835,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 72285,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 47477,
  "status": "passed"
});
formatter.after({
  "duration": 445401504,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4601897646,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 11899899869,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-specific-other-items-validation;;6",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Specific other items validation",
  "keyword": "Scenario Outline",
  "line": 186,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User validates cleartrip specific other items from \"Cheap Domestic Air Tickets\"",
  "keyword": "When ",
  "line": 176,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 177
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 178
});
formatter.match({
  "arguments": [
    {
      "val": "Cheap Domestic Air Tickets",
      "offset": 62
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_cleartrip_specific_other_items_from(String)"
});
formatter.result({
  "duration": 6220067247,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 65014,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 45767,
  "status": "passed"
});
formatter.after({
  "duration": 494920548,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4316692537,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 11539528449,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-specific-other-items-validation;;7",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Specific other items validation",
  "keyword": "Scenario Outline",
  "line": 187,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User validates cleartrip specific other items from \"Domestic Flights\"",
  "keyword": "When ",
  "line": 176,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 177
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 178
});
formatter.match({
  "arguments": [
    {
      "val": "Domestic Flights",
      "offset": 62
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_cleartrip_specific_other_items_from(String)"
});
formatter.result({
  "duration": 5991877496,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 94099,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 76135,
  "status": "passed"
});
formatter.after({
  "duration": 447657754,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4241196879,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 10200020617,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-specific-other-items-validation;;8",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Specific other items validation",
  "keyword": "Scenario Outline",
  "line": 188,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User validates cleartrip specific other items from \"Travel guide\"",
  "keyword": "When ",
  "line": 176,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 177
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 178
});
formatter.match({
  "arguments": [
    {
      "val": "Travel guide",
      "offset": 62
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_cleartrip_specific_other_items_from(String)"
});
formatter.result({
  "duration": 3540612306,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 115058,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 106076,
  "status": "passed"
});
formatter.after({
  "duration": 525679131,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4593467608,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 15269927188,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-specific-other-items-validation;;9",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Specific other items validation",
  "keyword": "Scenario Outline",
  "line": 189,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User validates cleartrip specific other items from \"Holiday Packages\"",
  "keyword": "When ",
  "line": 176,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 177
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 178
});
formatter.match({
  "arguments": [
    {
      "val": "Holiday Packages",
      "offset": 62
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_cleartrip_specific_other_items_from(String)"
});
formatter.result({
  "duration": 4492166853,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 107359,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 53466,
  "status": "passed"
});
formatter.after({
  "duration": 517752525,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4267188463,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 14194349834,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-specific-other-items-validation;;10",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Specific other items validation",
  "keyword": "Scenario Outline",
  "line": 190,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User validates cleartrip specific other items from \"Bus Booking\"",
  "keyword": "When ",
  "line": 176,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 177
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 178
});
formatter.match({
  "arguments": [
    {
      "val": "Bus Booking",
      "offset": 62
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_cleartrip_specific_other_items_from(String)"
});
formatter.result({
  "duration": 3837981068,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 62020,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 87256,
  "status": "passed"
});
formatter.after({
  "duration": 1153955882,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4586349830,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 14298415834,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-consistancy-of-elements-across-pages-validation;;2",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Consistancy of elements across pages validation",
  "keyword": "Scenario Outline",
  "line": 204,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User navigates between different pages by selecting different options from \"navigate_01 Change flight screen\"",
  "keyword": "When ",
  "line": 195,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "cleartrip User validates consistancy of common web elements \"btn__Home __ txtbox_Find Cities\"",
  "keyword": "And ",
  "line": 196
});
formatter.step({
  "name": "cleartrip User validates consistancy of common web elements \"lnk__Sign Up __ lnk__Sign In\"",
  "keyword": "And ",
  "line": 197
});
formatter.step({
  "name": "cleartrip User validates consistancy of common web elements \"lnk__About Us __ icon_Transportbooking icons\"",
  "keyword": "And ",
  "line": 198
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 199
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 200
});
formatter.match({
  "arguments": [
    {
      "val": "navigate_01 Change flight screen",
      "offset": 86
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_navigates_between_different_pages_by_selecting_different_options_from(String)"
});
formatter.result({
  "duration": 5612932959,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "btn__Home __ txtbox_Find Cities",
      "offset": 61
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_consistancy_of_common_web_elements(String)"
});
formatter.result({
  "duration": 1305625571,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "lnk__Sign Up __ lnk__Sign In",
      "offset": 61
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_consistancy_of_common_web_elements(String)"
});
formatter.result({
  "duration": 738958806,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "lnk__About Us __ icon_Transportbooking icons",
      "offset": 61
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_consistancy_of_common_web_elements(String)"
});
formatter.result({
  "duration": 489303231,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 62447,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 45766,
  "status": "passed"
});
formatter.after({
  "duration": 499599435,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4163329910,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 13719667538,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-consistancy-of-elements-across-pages-validation;;3",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Consistancy of elements across pages validation",
  "keyword": "Scenario Outline",
  "line": 205,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User navigates between different pages by selecting different options from \"navigate_01 Check PNR status screen\"",
  "keyword": "When ",
  "line": 195,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "cleartrip User validates consistancy of common web elements \"btn__Home __ txtbox_Find Cities\"",
  "keyword": "And ",
  "line": 196
});
formatter.step({
  "name": "cleartrip User validates consistancy of common web elements \"lnk__Sign Up __ lnk__Sign In\"",
  "keyword": "And ",
  "line": 197
});
formatter.step({
  "name": "cleartrip User validates consistancy of common web elements \"lnk__About Us __ icon_Transportbooking icons\"",
  "keyword": "And ",
  "line": 198
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 199
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 200
});
formatter.match({
  "arguments": [
    {
      "val": "navigate_01 Check PNR status screen",
      "offset": 86
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_navigates_between_different_pages_by_selecting_different_options_from(String)"
});
formatter.result({
  "duration": 5853129388,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "btn__Home __ txtbox_Find Cities",
      "offset": 61
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_consistancy_of_common_web_elements(String)"
});
formatter.result({
  "duration": 1688013725,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "lnk__Sign Up __ lnk__Sign In",
      "offset": 61
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_consistancy_of_common_web_elements(String)"
});
formatter.result({
  "duration": 749959045,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "lnk__About Us __ icon_Transportbooking icons",
      "offset": 61
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_consistancy_of_common_web_elements(String)"
});
formatter.result({
  "duration": 484031944,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 66726,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 46622,
  "status": "passed"
});
formatter.after({
  "duration": 501608889,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4234842591,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 16063728935,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-consistancy-of-elements-across-pages-validation;;4",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    }
  ],
  "description": "",
  "name": "cleartrip Consistancy of elements across pages validation",
  "keyword": "Scenario Outline",
  "line": 206,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User navigates between different pages by selecting different options from \"navigate_01 Print ticket screen\"",
  "keyword": "When ",
  "line": 195,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "cleartrip User validates consistancy of common web elements \"btn__Home __ txtbox_Find Cities\"",
  "keyword": "And ",
  "line": 196
});
formatter.step({
  "name": "cleartrip User validates consistancy of common web elements \"lnk__Sign Up __ lnk__Sign In\"",
  "keyword": "And ",
  "line": 197
});
formatter.step({
  "name": "cleartrip User validates consistancy of common web elements \"lnk__About Us __ icon_Transportbooking icons\"",
  "keyword": "And ",
  "line": 198
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 199
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 200
});
formatter.match({
  "arguments": [
    {
      "val": "navigate_01 Print ticket screen",
      "offset": 86
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_navigates_between_different_pages_by_selecting_different_options_from(String)"
});
formatter.result({
  "duration": 4786351627,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "btn__Home __ txtbox_Find Cities",
      "offset": 61
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_consistancy_of_common_web_elements(String)"
});
formatter.result({
  "duration": 1150154259,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "lnk__Sign Up __ lnk__Sign In",
      "offset": 61
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_consistancy_of_common_web_elements(String)"
});
formatter.result({
  "duration": 809939823,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "lnk__About Us __ icon_Transportbooking icons",
      "offset": 61
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_consistancy_of_common_web_elements(String)"
});
formatter.result({
  "duration": 627156538,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 69719,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 48333,
  "status": "passed"
});
formatter.after({
  "duration": 518432181,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4201835027,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 15194719816,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-home-page-functionality-other-items-validation;;2",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    },
    {
      "name": "@homepageother",
      "line": 210
    }
  ],
  "description": "",
  "name": "cleartrip Home page functionality other items validation",
  "keyword": "Scenario Outline",
  "line": 218,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User validates home page other attribute from \"About cleartrip\" with \"lnk__About lnk__Investors lnk__People lnk__Press Info lnk__Contact lnk__Jobs lnk__Support lnk__Blog\"",
  "keyword": "When ",
  "line": 212,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 213
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 214
});
formatter.match({
  "arguments": [
    {
      "val": "About cleartrip",
      "offset": 57
    },
    {
      "val": "lnk__About lnk__Investors lnk__People lnk__Press Info lnk__Contact lnk__Jobs lnk__Support lnk__Blog",
      "offset": 80
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_home_page_other_attribute_from_with(String,String)"
});
formatter.result({
  "duration": 174084,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 45339,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 117197,
  "status": "passed"
});
formatter.after({
  "duration": 435894880,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4361751689,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 12677572522,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-home-page-functionality-other-items-validation;;3",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    },
    {
      "name": "@homepageother",
      "line": 210
    }
  ],
  "description": "",
  "name": "cleartrip Home page functionality other items validation",
  "keyword": "Scenario Outline",
  "line": 219,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User validates home page other attribute from \"Careers\" with \"url__Careers\"",
  "keyword": "When ",
  "line": 212,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 213
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 214
});
formatter.match({
  "arguments": [
    {
      "val": "Careers",
      "offset": 57
    },
    {
      "val": "url__Careers",
      "offset": 72
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_home_page_other_attribute_from_with(String,String)"
});
formatter.result({
  "duration": 174085,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 56460,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 53466,
  "status": "passed"
});
formatter.after({
  "duration": 462141389,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4192708224,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 15672190026,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-home-page-functionality-other-items-validation;;4",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    },
    {
      "name": "@homepageother",
      "line": 210
    }
  ],
  "description": "",
  "name": "cleartrip Home page functionality other items validation",
  "keyword": "Scenario Outline",
  "line": 220,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User validates home page other attribute from \"FAQs\" with \"lnk__within India lnk__International lnk__Hotel Bookings lnk__Fare Alerts\"",
  "keyword": "When ",
  "line": 212,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 213
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 214
});
formatter.match({
  "arguments": [
    {
      "val": "FAQs",
      "offset": 57
    },
    {
      "val": "lnk__within India lnk__International lnk__Hotel Bookings lnk__Fare Alerts",
      "offset": 69
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_home_page_other_attribute_from_with(String,String)"
});
formatter.result({
  "duration": 143288,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 48333,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 47905,
  "status": "passed"
});
formatter.after({
  "duration": 536796141,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4338122859,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 15547769006,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-home-page-functionality-other-items-validation;;5",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    },
    {
      "name": "@homepageother",
      "line": 210
    }
  ],
  "description": "",
  "name": "cleartrip Home page functionality other items validation",
  "keyword": "Scenario Outline",
  "line": 221,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User validates home page other attribute from \"Support\" with \"url__Support\"",
  "keyword": "When ",
  "line": 212,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 213
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 214
});
formatter.match({
  "arguments": [
    {
      "val": "Support",
      "offset": 57
    },
    {
      "val": "url__Support",
      "offset": 72
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_home_page_other_attribute_from_with(String,String)"
});
formatter.result({
  "duration": 157403,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 49616,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 47905,
  "status": "passed"
});
formatter.after({
  "duration": 571935059,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4332274571,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 10885227608,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-home-page-functionality-other-items-validation;;6",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    },
    {
      "name": "@homepageother",
      "line": 210
    }
  ],
  "description": "",
  "name": "cleartrip Home page functionality other items validation",
  "keyword": "Scenario Outline",
  "line": 222,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User validates home page other attribute from \"Blog\" with \"url__Blog\"",
  "keyword": "When ",
  "line": 212,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 213
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 214
});
formatter.match({
  "arguments": [
    {
      "val": "Blog",
      "offset": 57
    },
    {
      "val": "url__Blog",
      "offset": 69
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_home_page_other_attribute_from_with(String,String)"
});
formatter.result({
  "duration": 177078,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 45766,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 46622,
  "status": "passed"
});
formatter.after({
  "duration": 487993108,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4341166553,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 10624453742,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-home-page-functionality-other-items-validation;;7",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    },
    {
      "name": "@homepageother",
      "line": 210
    }
  ],
  "description": "",
  "name": "cleartrip Home page functionality other items validation",
  "keyword": "Scenario Outline",
  "line": 223,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User validates home page other attribute from \"Cleartrip for Business\" with \"lnk__Track \u0026 save lnk__Manage travellers lnk__Take control lnk_Streamline payments\"",
  "keyword": "When ",
  "line": 212,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 213
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 214
});
formatter.match({
  "arguments": [
    {
      "val": "Cleartrip for Business",
      "offset": 57
    },
    {
      "val": "lnk__Track \u0026 save lnk__Manage travellers lnk__Take control lnk_Streamline payments",
      "offset": 87
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_home_page_other_attribute_from_with(String,String)"
});
formatter.result({
  "duration": 150132,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 47050,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 46622,
  "status": "passed"
});
formatter.after({
  "duration": 468404999,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "cleartrip.com website functionality validation",
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
  "name": "cleartrip website under test \"http://www.cleartrip.com\" and short name is \"cleartrip\"",
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
  "duration": 4329451583,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.cleartrip.com",
      "offset": 30
    },
    {
      "val": "cleartrip",
      "offset": 75
    }
  ],
  "location": "StepDefcleartrip.cleartrip_website_under_test(String,String)"
});
formatter.result({
  "duration": 9693005707,
  "status": "passed"
});
formatter.scenario({
  "id": "travel-ticket-booking-website-validation---cleartrip;cleartrip-home-page-functionality-other-items-validation;;8",
  "tags": [
    {
      "name": "@desktop",
      "line": 1
    },
    {
      "name": "@cleartrip",
      "line": 1
    },
    {
      "name": "@tkt_flight",
      "line": 1
    },
    {
      "name": "@homepageother",
      "line": 210
    }
  ],
  "description": "",
  "name": "cleartrip Home page functionality other items validation",
  "keyword": "Scenario Outline",
  "line": 224,
  "type": "scenario"
});
formatter.step({
  "name": "cleartrip User validates home page other attribute from \"Mobile\" with \"lnk__ios lnk__android lnk__windows lnk__blackberry\"",
  "keyword": "When ",
  "line": 212,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "cleartrip Test result should be successful or log the error meessage",
  "keyword": "Then ",
  "line": 213
});
formatter.step({
  "name": "cleartrip Quit the test scenario",
  "keyword": "And ",
  "line": 214
});
formatter.match({
  "arguments": [
    {
      "val": "Mobile",
      "offset": 57
    },
    {
      "val": "lnk__ios lnk__android lnk__windows lnk__blackberry",
      "offset": 71
    }
  ],
  "location": "StepDefcleartrip.cleartrip_User_validates_home_page_other_attribute_from_with(String,String)"
});
formatter.result({
  "duration": 196753,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Test_result_should_be_successful_or_log_the_error_meessage()"
});
formatter.result({
  "duration": 46194,
  "status": "passed"
});
formatter.match({
  "location": "StepDefcleartrip.cleartrip_Quit_the_test_scenario()"
});
formatter.result({
  "duration": 46195,
  "status": "passed"
});
formatter.after({
  "duration": 493323849,
  "status": "passed"
});
});