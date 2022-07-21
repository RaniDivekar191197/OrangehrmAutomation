package com.OrangeHRM_Automation1;

import org.openqa.selenium.By;

public class DeleteUser extends BaseClass
{
	public static void deleteUser()
	{
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		//AddEmployee.empSearch("Raju");
	}
	public static void main(String[] args) 
	{
		launchBrowser("chrome");
		
		//launchBrowser("chrome");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		LoginTestCases.login("Admin","admin123");
		deleteUser();
		//AddEmployee.empSerch("Rju");
		
	}

}
