package stepDefinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.LandingPage;
import pageobjects.LoginPage;
import pageobjects.PortalHomePage;
import resources.Base;

public class ValidateLogin extends Base {

	final static Logger log = LogManager.getLogger(ValidateLogin.class.getName());

	@Given("^intialize the browser with chrome$")
	public void intialize_the_browser_with_chrome() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		log.debug("setting chrome driver property");
		driver=intializebrowser();
		log.info("chrome driver intialized successfully");

	}

	@When("^User enter \"([^\"]*)\" navigate to Home Page$")
	public void user_enter_navigate_to_Home_Page(String arg1) throws Throwable {
		log.debug("hitting the demo web shop website url");
		driver.get(arg1);	    
	}

	@When("^click on login in home page to land on secure sign in page$")
	public void click_on_login_in_home_page_to_land_on_secure_sign_in_page() throws Throwable {
		
		LandingPage l = new LandingPage(driver);
		log.debug("clickig on login button");
		l.loginbuttonClick();
		log.info("navigated to login page");
	}

	@When("^user enters (.+) and (.+) and login$")
	public void user_enters_and_and_login(String username, String password) throws Throwable {
		LoginPage lp = new LoginPage(driver);
		log.debug("entering the login details");
		lp.enterEmail(username);
		lp.enterPassword(password);
		lp.submitLogin();
		log.info("login successfully");
	}

	@Then("^verify that user is successfully login or not$")
	public void verify_that_user_is_successfully_login_or_not() throws Throwable {
		PortalHomePage ph=new PortalHomePage(driver);
		Assert.assertTrue(ph.getsearch().isDisplayed());
		log.debug("taking screenshot");
		screenShot("ScreenShots\\validatelogin.png");
		log.info("the image screen shot taken successfully");
	}

	@Then("^Application should be closed$")
	public void application_should_be_closed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.close();
		log.info("application closed successfully");
		driver=null;
	}

}
