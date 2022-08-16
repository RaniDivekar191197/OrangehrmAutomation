package com.Practice;

import java.util.Map;

import org.openqa.selenium.By;

import com.OrangeHRM_Automation1.BaseClass;
import com.OrangeHrm.pages.EmpListPage;
import com.OrangeHrm.pages.LoginPage;

public class AddEmpTestCase extends BaseClass {
	
	

	public static void main(String[] args) throws Exception {
		launchBrowser("chrome");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		LoginPage loginPage = new LoginPage();
		loginPage.login("Admin", "admin123");
		EmpListPage empListPage=new EmpListPage(); 
		Map<String,Object> empDetails=empListPage.addEmp("cyber"," ","success", false, null, null);
		empListPage.searchEmp(empDetails);
		empListPage.deleteEmp();
		
		}
}
		
        
        
        
        
	
		
	

