package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='ico-register']")
	WebElement register;
	
	@FindBy(id = "gender-male")
	WebElement gender;
	
	@FindBy(id = "FirstName")
	WebElement firstname;
	
	@FindBy(id = "LastName")
	WebElement lastname;
	
	@FindBy(name = "Email")
	WebElement email;
	
	@FindBy(name = "Password")
	WebElement password;
	
	@FindBy(id = "ConfirmPassword")
	WebElement confirmpassword;
	
	@FindBy(id = "register-button")
	WebElement submit;
	
	@FindBy(xpath = "//li[text()='The specified email already exists']")
	WebElement text;

	
	//methods
	public void ClickOnrRegister() {
		register.click();;
	}
	
	public String GetText() {
		return text.getText();
	}
	
	//METHOD TO FILL THE REGISTRATION DETAILS
	public void RegisterDetails(String[] data) {
		
		register.click();
		firstname.sendKeys(data[0]);
		lastname.sendKeys(data[1]);
		email.sendKeys(data[2]);
		password.sendKeys(data[3]);
		confirmpassword.sendKeys(data[4]);
		submit.click();
	}
	

}
