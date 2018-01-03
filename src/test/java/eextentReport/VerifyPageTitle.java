package eextentReport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class VerifyPageTitle {

	@Test
	public void verifyTitle() {
		  ExtentReports logger = ExtentReports.get(VerifyPageTitle.class);
		  logger.init("./ExtentReports/Report1.html", true);
		  logger.startTest("Verify Page Title");
          WebDriver driver = new ChromeDriver();
          logger.log(LogStatus.INFO, " Browser is up and running");
          driver.get("http://www.google.com");
          logger.log(LogStatus.INFO, "Page opened successfully");
          String Title = driver.getTitle();
          Assert.assertTrue(Title.contains("Google"));
          
	}

}
