package crossbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VerifyTitle {
	
	WebDriver driver;
	
	@Test
	@Parameters("Browser")
	public void verifyPageTitle(String BrowserName){
		if(BrowserName.equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
		}
		else if(BrowserName.equalsIgnoreCase("chrome")){
			driver = new ChromeDriver();
		}
		else if(BrowserName.equalsIgnoreCase("ie")){
			driver = new InternetExplorerDriver();
		}
		driver.get("http://google.com/");
		String CurrentTitle = driver.getTitle();
		//System.out.println(CurrentTitle);
		String ActualTitle = "Google";
        Assert.assertEquals(CurrentTitle, ActualTitle);
        driver.quit();
		
	}

}
