package testNGScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(testNGListener.class) :Class level listener
public class GmailLogin {
	
	WebDriver driver;
	@BeforeClass
	public void launchBrowser(){
		driver = new ChromeDriver();
	}
    
	@Test(priority=1, description="This test will check the gmail url navigation")
	public void navigateToUrl(){
		driver.get("https://www.google.com/gmail/about/");
		String currentURL = driver.getCurrentUrl();
		Assert.assertTrue(currentURL.contains("gmail/about/"));
	}
	
	@Test(priority=2, description="This test checks the Sign In page navigation", dependsOnMethods="navigateToUrl")
	public void gmailSignInPage(){
		driver.findElement(By.xpath("//a[@data-g-label='Sign in']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//p[@id='headingSubtext']")).isDisplayed());
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test(priority=3, description="This test checks the gmail login")
	public void gmailLogin(){
		driver.findElement(By.id("identifierId")).sendKeys("satya.kundu@gmail.com");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		driver.findElement(By.name("password")).sendKeys("Iamlost@123");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		
	}
	@Test(priority=4, description="This test checks the gmail logout")
	public void gmailLogout(){
		
	}
	@Test
	public void dumyTest(){
		Assert.assertEquals(12,13);
	}
	@AfterClass
	public void closeBrowser(){
		//driver.quit();
	}
	
}
