package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2Enabled {
	
	//Method or Annotations is Enabled or Disabled
	
  @Test(enabled = true,description = "Login Method")
  public void method1() {
	  
	  Reporter.log("Login Perform!!",true);
  }
  
  @Test(enabled = true,description = "Logout Method")
  public void method2() {
	  Reporter.log("Logout Perform!!",true);
  }
}
