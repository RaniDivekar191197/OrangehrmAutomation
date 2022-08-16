package com.agilecrm.automation1;

import org.testng.annotations.Test;

public class TestAutomation {
  @Test(priority = 1)
  public void login() {
	  //login code
	  System.out.println("Login is successfully");
	  
  }
@Test(priority = 2,dependsOnMethods="login")
  public void addEmp() {
	//code to add the emp
	System.out.println("Add emp successfully");
	  
  }
@Test(priority = 3)
public void logout() {
	//code to perform logout
	System.out.println("logout is successfully ");
	
	}
}

  

