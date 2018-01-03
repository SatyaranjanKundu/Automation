package testNGScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {
	
	@Test(priority=1, description="This test case will launchURL")
	public void launchURL(){
		System.out.println("This will open the URL");
		
	}
	
	@Test(priority=2, description="This test cases will select an element")
	public void selectItems(){
		System.out.println("This will select one item");
		Assert.assertEquals(12,13);
		
	}
	
	@Test(priority=-3, description="This test will find one element", dependsOnMethods="selectItems")
	public void findElement(){
		System.out.println("This will find one item");
		
	}

}
