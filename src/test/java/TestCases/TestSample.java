package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSample {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Jar Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		System.out.println(driver.getTitle());

	}

}
