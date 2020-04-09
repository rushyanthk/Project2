package stepDefinations;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import pageobjects.BookNavigationPage;
import resources.Base;

@RunWith(Cucumber.class)
public class BookNavigationPages extends Base {
	final static Logger log = LogManager.getLogger(BookNavigationPages.class.getName());
	
    @Given("^intialize the browser with chrome driver$")
    public void intialize_the_browser_with_chrome_driver() throws Throwable {
    	log.debug("setting chrome driver property");
    	driver=intializebrowser();
    	log.info("chrome driver intialized successfully");
    }

    @When("^user enters \"([^\"]*)\" navigated to home page$")
    public void user_enters_something_navigated_to_home_page(String strArg1) throws Throwable {
    	log.debug("hitting the demo web shop website url");
    	driver.get(strArg1);
    	log.info("landed on the home page");
    }

    @When("^user clicks on book link$")
    public void user_clicks_on_book_link() throws Throwable {
       BookNavigationPage bp=new BookNavigationPage(driver);
       log.debug("licking on book button");
  	   bp.navigatetobookpageClick();
       log.info("navigated to book page successfully");
    }

    @Then("^verify that user is able to navigated to webshop book page or not$")
    public void verify_that_user_is_able_to_navigated_to_webshop_book_page_or_not() throws Throwable {
        String actualbookpageTitle=driver.getTitle();
        assertEquals(actualbookpageTitle,"Demo Web Shop. Books");
        log.debug("taking screenshot");
        screenShot("ScreenShots\\booknavigation.png");
        log.info("the image screen shot taken successfully");
    }
    @Then("^application should be Closed$")
    public void application_should_be_closed() throws Throwable {
		driver.close();
		log.info("application closed successfully");
		driver=null;
    }

}
