package stepDefinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.SortByPriceLowToHighPage;
import resources.Base;

public class ValidateSortByFiletr extends Base {
	final static Logger log = LogManager.getLogger(BookNavigationPages.class.getName());

	@Given("^intialize The browser with chrome driver$")
	public void intialize_The_browser_with_chrome_driver() throws Throwable {
		log.debug("setting chrome driver property");
		driver = intializebrowser();
		log.info("chrome driver intialized successfully");
	}

	@When("^user Enters \"([^\"]*)\" navigated to home page$")
	public void user_Enters_navigated_to_home_page(String arg1) throws Throwable {
		log.debug("hitting the demo web shop website url");
		driver.get(arg1);
		log.info("landed on the home page");

	}

	@When("^user clicks on digital link$")
	public void user_clicks_on_digital_link() throws Throwable {
		SortByPriceLowToHighPage sb = new SortByPriceLowToHighPage(driver);
		log.debug("licking on book button");
		sb.digitalButtonClick();
		log.info("navigated to book page successfully");
	}

	@When("^selecting low to high price filter in Sort By drop down$")
	public void selecting_low_to_high_price_filter_in_Sort_By_drop_down() throws Throwable {
		SortByPriceLowToHighPage sb = new SortByPriceLowToHighPage(driver);
		log.debug("selecting low to high price filter in sort by drop down");
		sb.SortByDropDownAndSelectLowtoHigh();
		log.info("the low to high price filter have been selected successfully");
		log.debug("taking screenshot");
		screenShot("ScreenShots\\InValidRegister.png");
		log.info("the image screen shot taken successfully");


	}

	@Then("^veryfy that the displayed products in low to high price or not$")
	public void veryfy_that_the_displayed_products_in_low_to_high_price_or_not() throws Throwable {
		SortByPriceLowToHighPage sb = new SortByPriceLowToHighPage(driver);
		String actualfilterUrl = sb.getUrl();
		String expectedfilterurl = "http://demowebshop.tricentis.com/producttag/16/digital?orderby=10";
		log.debug("now validating the  price filter");
		if (actualfilterUrl.equals(expectedfilterurl)) {
			log.info("the products are displyed in low to high price");
		} else {
			log.error("the products are not displaying in low to high price");
		}
		
	}

	@Then("^Application Should Be Closed$")
	public void application_Should_Be_Closed() throws Throwable {
		driver.close();
		log.info("application closed successfully");
		driver = null;
	}

}
