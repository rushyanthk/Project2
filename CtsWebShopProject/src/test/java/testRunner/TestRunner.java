package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\java\\features\\webshop.feature",
		glue= "stepDefinations",
		plugin= {"pretty","html:Reports\\cucumberHTMLReport","json:Reports\\cucumberHTMLReport\\jsonreport",
		"com.cucumber.listener.ExtentCucumberFormatter:Reports\\ExtentReports\\extentreport.html"},
		monochrome=true)

public class TestRunner {
	}
