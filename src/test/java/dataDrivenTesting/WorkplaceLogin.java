package dataDrivenTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WorkplaceLogin {
	
	WebDriver driver;
	@Test(dataProvider = "Credentials")
	public void gmailLogin(String UserName, String Password) throws InterruptedException{
		driver = new ChromeDriver();
		driver.get("https://www.google.com/gmail/about/");
		driver.findElement(By.xpath("//a[@data-g-label='Sign in']")).click();
		driver.findElement(By.id("identifierId")).sendKeys(UserName);
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("password")).sendKeys(Password);
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		Assert.assertTrue(driver.getTitle().contains("Gmail"), "User not able to login");
		System.out.println("User ia bale to login");
		driver.quit();
	}
	
		
	@DataProvider(name="Credentials")
	public Object[][] passData(){
		Object[][] data = new Object[3][2];
		data[0][0] = "satyaranjan.kundu@gmail.com";
		data[0][1] = "abcd";
		
	    data[1][0] = "satya.kundu@gmail.com";
		data[1][1] = "I12345";
		
		data[2][0] = "satya.kundu@gmail.com";
		data[2][1] = "I67895";
		
		return data;
				
	}

}
