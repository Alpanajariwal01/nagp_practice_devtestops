package nagpfirst;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class Listener implements ITestListener{
	
	
	  
		public void onTestStart(ITestResult result) {
	    //System.out.println("on Test Start");
	    System.out.println(result.getName()+"on Test Start");
	  }

	 
		public void onTestSuccess(ITestResult result) {
			System.out.println("on Test Success");
	  }

	 
		public void onTestFailure(ITestResult result) {
			System.out.println("on Test Failure");
	  }

	 
		public void onTestSkipped(ITestResult result) {
			System.out.println("on Test Skipped");
	  }

	  
		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			System.out.println("on Test FailedButWithinSuccessPercentage");
	  }

	 
		public void onTestFailedWithTimeout(ITestResult result) {
	    onTestFailure(result);
	  }
		public void onStart(ITestContext context) {
			System.out.println("on Start");
	  }

	 
		public void onFinish(ITestContext context) {
			System.out.println("on Finish");
	  }
	}


