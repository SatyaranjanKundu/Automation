package projectLib;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenshot {
	
	public static void captureScreenshot(WebDriver driver, String screenshotFileName){
		
		try {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./Screenshot/"+screenshotFileName+".png"));
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
		
	}

}
