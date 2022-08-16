package com.orangehrm_automation1;

import org.testng.annotations.Test;

import com.OrangeHRM_Automation1.BaseClass;
import com.OrangeHrm.pages.LoginPage;

public class LoginTestCases extends BaseClass {
	LoginPage loginpage = new LoginPage();
  @Test
  public void login() {
	launchBrowser("chrome"); 
	driver.get("https://opensource-demo.orangehrmlive.com/");
	loginpage.login("Admin","admin123");
  }
  @Test
  public void loginWithInvalidDetails() {
	  loginpage.logout();
	  loginpage.login("Admin@#$","admin123$#@!%");

  }
}
