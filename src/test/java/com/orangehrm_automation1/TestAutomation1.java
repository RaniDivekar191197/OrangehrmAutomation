package com.orangehrm_automation1;

import org.testng.annotations.Test;

import com.OrangeHRM_Automation1.BaseClass;
import com.OrangeHrm.pages.EmpListPage;
import com.OrangeHrm.pages.LoginPage;

public class TestAutomation1 extends BaseClass {
	LoginPage loginpage = new LoginPage();

  @Test(priority = 1)
  public void login() {
	  //login code
		launchBrowser("chrome"); 
		driver.get("https://opensource-demo.orangehrmlive.com/");
		loginpage.login("Admin","admin123");
  }
@Test(priority = 2,dependsOnMethods="login")
  public void addEmp() {
	EmpListPage empListPage = new EmpListPage();
	//code to add the emp
	empListPage.addEmp(null, null, null, false, null, null);
	  
  }
@Test(priority = 3,dependsOnMethods={"login","addEmp"})
public void logout() {
	//code to perform logout
	 loginpage.logout();
	  loginpage.login("Admin@#$","admin123$#@!%");
	
}

  
}

