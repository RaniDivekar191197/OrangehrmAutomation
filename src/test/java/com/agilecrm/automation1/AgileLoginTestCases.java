package com.agilecrm.automation1;

import org.testng.annotations.Test;

import com.AgileCrm.pages.AgileCrmLoginPage;
import com.OrangeHRM_Automation1.BaseClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class AgileLoginTestCases extends BaseClass{
  @Test
  public void  login () {
	  AgileCrmLoginPage loginpage = new  AgileCrmLoginPage();
	  loginpage.login("automation@yopmail.com","Test1234");
	  loginpage.logout();
	  
//	  loginpage.login("automation@yopmail.com123","Test1234!@#");
//	  loginpage.logout(); 
   }
  
  
  @BeforeClass
  public void beforeClass() {
	  launchBrowser("chrome");
	  
	  driver.get("https://realestateautomation.agilecrm.com");  
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
