package captureScreenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import projectLib.TakeScreenshot;

public class ScreenshotIfTestFails {
	
	WebDriver driver;
	@Test
	public void facebookLogin(){
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Satya");
		
	}
	
	@AfterMethod
	public void tearDown(ITestResult result){
		if(ITestResult.FAILURE == result.getStatus()){
			TakeScreenshot.captureScreenshot(driver, result.getName());
		}
	}

}
