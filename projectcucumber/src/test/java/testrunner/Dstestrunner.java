package testrunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=".//src/test/resources/features",
		glue={"stepdefinitions"},
		dryRun =false,
		monochrome=true,
//*********Run in pom.xml using maven 
		 plugin= {"pretty",  "html:targetreport/report.html",
					"json:targetreport/report.json",
					"junit:targetreport/report.xml",
					 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
	               "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
             }
		
				)
/*Parallel testing
 * <parallel>methods</parallel>
			 <threadCount>15</threadCount>*/
public class Dstestrunner {
	
	
}


