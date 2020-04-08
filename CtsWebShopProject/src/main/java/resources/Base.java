package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
    public WebDriver driver;
	public Properties prop;
	


	public WebDriver intializebrowser() throws IOException {

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("src\\main\\java\\resources\\DataDriven.properties");
		prop.load(fis); 
		String browserName = prop.getProperty("browser");
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "DriverResources\\Drivers\\chromedriver.exe");
			System.setProperty("webdriver.chrome.silentOutput", "true");
			driver = new ChromeDriver();
		}
        else if(browserName.equalsIgnoreCase("firefox")){
			
			System.setProperty("webdriver.gecko.driver", "DriverResources\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		else if(browserName.equals("IE")){
			System.setProperty("webdriver.ie.driver", "DriverResources\\Drivers\\IEDriverServer.exe");
			 driver = new FirefoxDriver();
			 }
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

     return driver;

	}

/*	public void getscreenshot(String result) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		org.apache.commons.io.FileUtils.copyFile(src, new File(
				"C:\\Users\\User\\eclipse-workspace\\CtsWebShopProject\\ScreenShots\\" + result + "screenshot.png"));
	} */
	
	public void screenShot(String path) throws IOException{
		File Sshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Sshot, new File(path));
	}

}
