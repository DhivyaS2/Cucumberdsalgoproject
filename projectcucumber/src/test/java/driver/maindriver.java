package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

//import org.openqa.selenium.safari.SafariDriver;


public class maindriver {
	public static WebDriver cdriver=new ChromeDriver();
	 WebDriver driver;
public maindriver() {
	driver= cdriver ; 
}
/*public maindriver(String broswer) {
if(broswer.equals("chrome")) {
driver=new ChromeDriver();

}	
if(broswer.equals("edge")) {
	driver=new EdgeDriver();
	
	}	
if(broswer.equals("firefox")) {
	driver=new FirefoxDriver();
	
	}	
}*/

public WebDriver driver() {
	driver.get("https://dsportalapp.herokuapp.com/"); 
	return driver;
}
	
}
