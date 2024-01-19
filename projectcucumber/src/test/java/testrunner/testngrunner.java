package testrunner;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import driver.maindriver;
import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=".//src/test/resources/features",
		glue={"stepdefinitions"},
		dryRun =false,
		monochrome=true,
	//*********Run as testng
		 plugin= {"pretty",  //"html:targetreport/report.html",
					//"json:targetreport/report.json",
					//"junit:targetreport/report.xml",
					// "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
	              // "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
             }
		
				)

public class testngrunner extends AbstractTestNGCucumberTests {
	/*public maindriver dd;
	@Parameters("browsertype")
	@BeforeClass
	public  void beforeclass(String browser) {
		
		dd= new maindriver(browser);
		
	}*/
	
}
