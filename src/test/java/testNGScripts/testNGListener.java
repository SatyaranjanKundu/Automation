package testNGScripts;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class testNGListener implements ITestListener{

	public void onTestStart(ITestResult result) {
		
		System.out.println("Test started and Test details are"+result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test successed and Test details are"+result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test failed and Test details are"+result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		
		System.out.println("Test skipped and Test details are"+result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	public void onStart(ITestContext context) {
		System.out.println("Test on start and Test details are"+context.getName());
		
	}

	public void onFinish(ITestContext context) {
		
		System.out.println("Test on finish and Test details are"+context.getName());
	}

}
