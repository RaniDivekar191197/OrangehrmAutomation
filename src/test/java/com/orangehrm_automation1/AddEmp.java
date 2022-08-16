package com.orangehrm_automation1;

import java.util.Map;

import org.testng.annotations.Test;

import com.OrangeHRM_Automation1.BaseClass;
import com.OrangeHrm.pages.EmpListPage;
import com.OrangeHrm.pages.LoginPage;

public class AddEmp extends BaseClass {
	 EmpListPage emplistPage = new EmpListPage();
  @Test
  public void addEmpTestCases() throws Exception {
	launchBrowser("chrome"); 
	driver.get("https://opensource-demo.orangehrmlive.com/");
	LoginPage loginPage=new LoginPage();
	loginPage.login("Admin","admin123");
	Map<String,Object> empDetails=emplistPage.addEmp("Raju","Manju","Anuja",false,null,null);
	emplistPage.searchEmp(empDetails);
  }
  
  @Test
  public void updateTestCase() throws Exception {
	  
  Map<String,Object> empDetails =emplistPage.addEmp("Raju","Raju","Raju",false,null,null);
  emplistPage.searchEmp(empDetails);
  String fName = emplistPage.updateEmpDetails("Raju");
  } 
  
  public void deleteTestCases() throws Exception {
	  Map<String,Object> empDetails=emplistPage.addEmp("Raju","Raju","raju",false,null,null);
	  emplistPage.searchEmp(empDetails);
	  emplistPage.deleteEmp();  
  }
}
