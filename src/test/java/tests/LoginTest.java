package tests;

import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends TestBase {
	
	LoginPage Loginobj; 
	
  @Test(priority = 0 , alwaysRun = true)
  public void usercanlogin() {
	  Loginobj=new LoginPage(driver);
	  Loginobj.loginPage();
	  
  }
  
  @Test(dependsOnMethods = {"usercanlogin"})
  public void UserCanLogOut()
  {
	
	  Loginobj.Logout();
  }
  
}
