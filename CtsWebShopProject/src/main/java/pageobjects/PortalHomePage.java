package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PortalHomePage {

	public PortalHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="small-searchterms")
	WebElement search;
	
	public WebElement getsearch() {
		return search;
	}
	
}
