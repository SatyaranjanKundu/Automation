package captureScreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import projectLib.TakeScreenshot;

public class Facebook {
	
	@Test
	public void capturescreenshot() throws Exception{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		TakeScreenshot.captureScreenshot(driver, "facebookHomeScreen");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Satyaranjan");
		/*TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./Screenshot/facebook.png") );*/
		
		TakeScreenshot.captureScreenshot(driver, "firstName");
		driver.quit();
	}

}
