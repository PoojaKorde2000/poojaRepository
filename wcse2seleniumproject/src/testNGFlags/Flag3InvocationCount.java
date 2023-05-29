package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag3InvocationCount {
	
	//use to execute annotation or method multiple times..
	
  @Test(invocationCount = 100)
  public void method1() {
	  
	  Reporter.log("Login Test Case!!!", true);
  }
}
