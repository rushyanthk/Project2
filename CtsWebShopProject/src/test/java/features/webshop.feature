Feature: Testing Demo Webshop

Scenario: Validate Registration
Given intialize the browser with chrome Driver
When user enters "http://demowebshop.tricentis.com/" Navigate to Home page
And click on Register in home page to land on secure Registration page
And user enters registration details and clicks on Register
Then verify that user is able register or not
Then application should be closed


Scenario Outline: positive test validating login
Given intialize the browser with chrome
When User enter "http://demowebshop.tricentis.com/" navigate to Home Page
And click on login in home page to land on secure sign in page
And user enters <username> and <password> and login
Then verify that user is successfully login or not
Then Application should be closed

Examples:
|username                     |password       |
|ambatisrikanth463@gmail.com  |ambatisrikanth |

Scenario: Validate Text and Validate image
Given Intialize the browser with chrome 
When  user enter "http://demowebshop.tricentis.com/" navigated to home page
Then  verify that user is able to see the Feature Products text is present in the home page or not
Then  verify that user is able to see the demo webshop image is present in the home page or not
Then application Should be closed

Scenario: validate Book page navigation
Given intialize the browser with chrome driver
When user enters "http://demowebshop.tricentis.com/" navigated to home page
When user clicks on book link
Then verify that user is able to navigated to webshop book page or not
Then application should be Closed

Scenario: validate sort by filter
Given intialize The browser with chrome driver
When user Enters "http://demowebshop.tricentis.com/" navigated to home page
And  user clicks on digital link
And  selecting low to high price filter in Sort By drop down
Then veryfy that the displayed products in low to high price or not
Then Application Should Be Closed