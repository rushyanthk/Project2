package stepDefinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import pageobjects.RegisterPage;
import resources.Base;
import resources.ExcelUtilities;


@RunWith(Cucumber.class)
public class ValidateRegistation extends Base {
	Logger log= LogManager.getLogger(ValidateLogin.class.getName());
	static String[] data = null;
	@Given("^intialize the browser with chrome Driver$")
	public void intialize_the_browser_with_chrome_Driver() throws Throwable {
		log.debug("setting chrome driver property");
		driver=intializebrowser();
		log.info("chrome driver intialized successfully");
	}

	@Given("^Navigate to \"([^\"]*)\"$")
	public void navigate_to(String arg1) throws Throwable {
		log.debug("hitting the demo web shop website url");
		driver.get(arg1);
		log.info("landed on the home page");
	}

	@Given("^click on Register in home page to land on secure Registration page$")
	public void click_on_Register_in_home_page_to_land_on_secure_Registration_page() throws Throwable {
		RegisterPage rp = new RegisterPage(driver);
		log.info("clicking on register button");
		rp.register().click();
		log.info("navigated to register page successfully");
	}

	@When("^user enters registration details and clicks on Register$")
	public void user_enters_registration_details_and_clicks_on_Register() throws Throwable {
		RegisterPage rp = new RegisterPage(driver);
		ExcelUtilities xl=new ExcelUtilities();
		int j=0;
		data=new String[5]; 
		for(int i=1;i<=5;i++)
		{
			data[j]=xl.readXL("src\\main\\java\\resources\\webshops.xlsx", i, 1);
			System.out.println(data[j]);
			j++;
		}
		log.debug("entering the registation details");
		rp.details(data);
		log.info("the details are submitted successfully");
		
	   
	}

	@Then("^verify that user is able register or not$")
	public void verify_that_user_is_able_register_or_not() throws Throwable {
	    RegisterPage rp=new RegisterPage(driver);
	    String actualText=rp.GetText().getText();
	    String expectedText="The specified email already exists";
	    if(actualText.equals(expectedText))
	    {
	    	log.error(" the specified email is already exist");
	    }
	    else
	    {
	    	log.info("the registration was successful");
	    }
	    log.debug("taking screenshot");
	    screenShot("ScreenShots\\InValidRegister.png");
	    log.info("the image screen shot taken successfully");
	}
	@Then("^application should be closed$")
    public void application_should_be_closed() throws Throwable {
		driver.close();
		log.info("application closed successfully");
		driver=null;
    }

    }
