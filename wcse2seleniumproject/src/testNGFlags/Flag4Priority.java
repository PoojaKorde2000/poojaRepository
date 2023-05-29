package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4Priority {
	
	//execute the annotations & method according to priority..
  @Test
  public void f() {
	  
	  Reporter.log("f method", true);
  }
  
  @Test
  public void a() {
	  
	  Reporter.log("a method", true);
	  
  }
  
  @Test
  public void k() {
	  
	  Reporter.log("k method", true);
  }
  
  @Test
  public void p() {
	  
	  Reporter.log("p method", true);
  }
  
  @Test(priority = -1)
  public void d() {
	  
	  Reporter.log("d method", true);
  }
  
  @Test
  public void z() {
	  
	  Reporter.log("z method", true);
  }
  
  @Test
  public void m() {
	  
	  Reporter.log("m method", true);
  }
  
  @Test(priority = 1)
  public void y() {
	  
	  Reporter.log("y method", true);
  }
  
  @Test
  public void r() {
	  
	  Reporter.log("r method", true);
  }
}
