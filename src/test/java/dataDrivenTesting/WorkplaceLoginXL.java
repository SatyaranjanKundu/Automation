package dataDrivenTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import projectLib.ExcelDataConfig;

public class WorkplaceLoginXL {
	
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
		
		ExcelDataConfig obj1 = new ExcelDataConfig("F:\\Maven Project\\selenium-java\\TestData\\InputData.xlsx");
		
		int rows = obj1.getRowCount(0);
		
		Object[][] data = new Object[rows][2];
		
		for(int i=0; i < rows; i++){
			data[i][0] = obj1.getData(0, i, 0);
			data[i][1] = obj1.getData(0, i, 1);
		}
		
		return data;		
	}

}
