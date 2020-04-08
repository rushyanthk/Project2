package stepDefinations;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import pageobjects.ValidatePage;
import resources.Base;

@RunWith(Cucumber.class)
public class ValidateTextAndImage extends Base {
	Logger log= LogManager.getLogger(ValidateLogin.class.getName());
	@Given("^Intialize the browser with chrome$")
	public void intialize_the_browser_with_chrome() throws Throwable {
	    log.debug("setting chrome driver property");
		driver=intializebrowser();
		log.info("chrome driver intialized successfully");
	}

	@When("^user enter \"([^\"]*)\" navigated to home page$")
	public void user_enter_navigated_to_home_page(String arg1) throws Throwable {
	    log.debug("hitting the demo web shop website url");
		driver.get(arg1);
		log.info("landed on the home page");
	}

	@Then("^verify that user is able to see the Feature Products text is present in the home page or not$")
	public void verify_that_user_is_able_to_see_the_Feature_Products_text_is_present_in_the_home_page_or_not() throws Throwable {
		ValidatePage vp=new ValidatePage(driver);
	 	String actualtitle=vp.getTitle().getText();
	 	log.debug("validating specified text");
	 	assertEquals(actualtitle, "FEATURED PRODUCTS");
	 	log.info("the specified text is present");
	}

	@Then("^verify that user is able to see the demo webshop image is present in the home page or not$")
	public void verify_that_user_is_able_to_see_the_demo_webshop_image_is_present_in_the_home_page_or_not() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ValidatePage vp=new ValidatePage(driver);
		log.debug("validating image");
	 	assertTrue(vp.getimg().isDisplayed());
		log.info("the specified image is present");
		log.debug("taking screenshot");
	 	screenShot("ScreenShots\\ValidateTextAndImage.png");
		log.info("the image screen shot taken successfully");
	}
	@Then("^application Should be closed$")
    public void application_should_be_closed() throws Throwable {
		driver.close();
		log.info("application closed successfully");
		driver=null;
    }
 
}

