$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/webshop.feature");
formatter.feature({
  "line": 1,
  "name": "Testing Demo Webshop",
  "description": "",
  "id": "testing-demo-webshop",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate Registration",
  "description": "",
  "id": "testing-demo-webshop;validate-registration",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "intialize the browser with chrome Driver",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Navigate to \"http://demowebshop.tricentis.com/\"",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "click on Register in home page to land on secure Registration page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user enters registration details and clicks on Register",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "verify that user is able register or not",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "application should be closed",
  "keyword": "Then "
});
formatter.match({
  "location": "ValidateRegistation.intialize_the_browser_with_chrome_Driver()"
});
formatter.result({
  "duration": 14651253300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://demowebshop.tricentis.com/",
      "offset": 13
    }
  ],
  "location": "ValidateRegistation.navigate_to(String)"
});
formatter.result({
  "duration": 4093164800,
  "status": "passed"
});
formatter.match({
  "location": "ValidateRegistation.click_on_Register_in_home_page_to_land_on_secure_Registration_page()"
});
formatter.result({
  "duration": 1069269700,
  "status": "passed"
});
formatter.match({
  "location": "ValidateRegistation.user_enters_registration_details_and_clicks_on_Register()"
});
formatter.result({
  "duration": 4942504300,
  "status": "passed"
});
formatter.match({
  "location": "ValidateRegistation.verify_that_user_is_able_register_or_not()"
});
formatter.result({
  "duration": 463476000,
  "status": "passed"
});
formatter.match({
  "location": "ValidateRegistation.application_should_be_closed()"
});
formatter.result({
  "duration": 121332700,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 13,
  "name": "positive test validating login",
  "description": "",
  "id": "testing-demo-webshop;positive-test-validating-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 14,
  "name": "intialize the browser with chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "navigate to \"http://demowebshop.tricentis.com/\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "click on login in home page to land on secure sign in page",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user enters \u003cusername\u003e and \u003cpassword\u003e and login",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "verify that user is successfully login or not",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Application should be closed",
  "keyword": "Then "
});
formatter.examples({
  "line": 21,
  "name": "",
  "description": "",
  "id": "testing-demo-webshop;positive-test-validating-login;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 22,
      "id": "testing-demo-webshop;positive-test-validating-login;;1"
    },
    {
      "cells": [
        "ambatisrikanth463@gmail.com",
        "ambatisrikanth"
      ],
      "line": 23,
      "id": "testing-demo-webshop;positive-test-validating-login;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 23,
  "name": "positive test validating login",
  "description": "",
  "id": "testing-demo-webshop;positive-test-validating-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 14,
  "name": "intialize the browser with chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "navigate to \"http://demowebshop.tricentis.com/\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "click on login in home page to land on secure sign in page",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user enters ambatisrikanth463@gmail.com and ambatisrikanth and login",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "verify that user is successfully login or not",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Application should be closed",
  "keyword": "Then "
});
formatter.match({
  "location": "ValidateLogin.intialize_the_browser_with_chrome()"
});
formatter.result({
  "duration": 9554279200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://demowebshop.tricentis.com/",
      "offset": 13
    }
  ],
  "location": "ValidateLogin.navigate_to(String)"
});
formatter.result({
  "duration": 2826494900,
  "status": "passed"
});
formatter.match({
  "location": "ValidateLogin.click_on_login_in_home_page_to_land_on_secure_sign_in_page()"
});
formatter.result({
  "duration": 807087600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ambatisrikanth463@gmail.com",
      "offset": 12
    },
    {
      "val": "ambatisrikanth",
      "offset": 44
    }
  ],
  "location": "ValidateLogin.user_enters_and_and_login(String,String)"
});
formatter.result({
  "duration": 2012500600,
  "status": "passed"
});
formatter.match({
  "location": "ValidateLogin.verify_that_user_is_successfully_login_or_not()"
});
formatter.result({
  "duration": 605418900,
  "status": "passed"
});
formatter.match({
  "location": "ValidateLogin.application_should_be_closed()"
});
formatter.result({
  "duration": 185332200,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Validate Text and Validate image",
  "description": "",
  "id": "testing-demo-webshop;validate-text-and-validate-image",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 26,
  "name": "Intialize the browser with chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "user enter \"http://demowebshop.tricentis.com/\" navigated to home page",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "verify that user is able to see the Feature Products text is present in the home page or not",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "verify that user is able to see the demo webshop image is present in the home page or not",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "application Should be closed",
  "keyword": "Then "
});
formatter.match({
  "location": "ValidateTextAndImage.intialize_the_browser_with_chrome()"
});
formatter.result({
  "duration": 9829240400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://demowebshop.tricentis.com/",
      "offset": 12
    }
  ],
  "location": "ValidateTextAndImage.user_enter_navigated_to_home_page(String)"
});
formatter.result({
  "duration": 3855856300,
  "status": "passed"
});
formatter.match({
  "location": "ValidateTextAndImage.verify_that_user_is_able_to_see_the_Feature_Products_text_is_present_in_the_home_page_or_not()"
});
formatter.result({
  "duration": 73088500,
  "status": "passed"
});
formatter.match({
  "location": "ValidateTextAndImage.verify_that_user_is_able_to_see_the_demo_webshop_image_is_present_in_the_home_page_or_not()"
});
formatter.result({
  "duration": 486591800,
  "status": "passed"
});
formatter.match({
  "location": "ValidateTextAndImage.application_should_be_closed()"
});
formatter.result({
  "duration": 118795200,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "validate Book page navigation",
  "description": "",
  "id": "testing-demo-webshop;validate-book-page-navigation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 33,
  "name": "intialize the browser with chrome driver",
  "keyword": "Given "
});
formatter.step({
  "line": 34,
  "name": "user enters \"http://demowebshop.tricentis.com/\" navigated to home page",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "user clicks on book link",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "verify that user is able to navigated to webshop book page or not",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "application should be Closed",
  "keyword": "Then "
});
formatter.match({
  "location": "BookNavigationPages.intialize_the_browser_with_chrome_driver()"
});
formatter.result({
  "duration": 9655458000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://demowebshop.tricentis.com/",
      "offset": 13
    }
  ],
  "location": "BookNavigationPages.user_enters_something_navigated_to_home_page(String)"
});
formatter.result({
  "duration": 4049372800,
  "status": "passed"
});
formatter.match({
  "location": "BookNavigationPages.user_clicks_on_book_link()"
});
formatter.result({
  "duration": 1262401700,
  "status": "passed"
});
formatter.match({
  "location": "BookNavigationPages.verify_that_user_is_able_to_navigated_to_webshop_book_page_or_not()"
});
formatter.result({
  "duration": 423244000,
  "status": "passed"
});
formatter.match({
  "location": "BookNavigationPages.application_should_be_closed()"
});
formatter.result({
  "duration": 223595400,
  "status": "passed"
});
});