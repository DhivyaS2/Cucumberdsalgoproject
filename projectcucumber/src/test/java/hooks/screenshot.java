package hooks;


import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class screenshot {
	public WebDriver driver;
	@After
	
	public void takeScraenshotOnFailure(Scenario scenario, WebDriver driver) {
		
		
		if (scenario.isFailed()) {
String name= scenario.getName();
		TakesScreenshot ts = (TakesScreenshot) driver;

		byte[] src = ts.getScreenshotAs(org.openqa.selenium.OutputType.BYTES);
		scenario.attach(src, "image/png", name);
		}

		}
}
