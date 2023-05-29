package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag5DependsOn {
  @Test(description = "Login TestCase!!")
  public void loginMethod() {
	  
	  Reporter.log("login performed!!!", true);
	  
	  
  }
  
  @Test(description = "CreateUser TestCase",dependsOnMethods = "loginMethod")
  public void createUser() {
	  
	  Reporter.log("user Created!!", true);
	  
  }
  
  @Test(description = "Logout TestCase",dependsOnMethods = "createUser")
  public void logoutMethod() {
	  
	  Reporter.log("logout Performed!!!", true);
	  
  }
}

