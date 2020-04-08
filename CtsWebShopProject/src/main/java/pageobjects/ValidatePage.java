package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValidatePage {
	public WebDriver driver;


	public ValidatePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[1]/strong")
	WebElement title;
   
	public WebElement getTitle() {
		return title;
	}
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[1]/div[1]/a/img")
	WebElement img;
	
	public WebElement getimg() {
		return img;
	}

}
