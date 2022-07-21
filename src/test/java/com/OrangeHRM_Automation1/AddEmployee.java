package com.OrangeHRM_Automation1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddEmployee extends BaseClass{
	
	public static void addEmp(String firstname,String lastname) 
	{
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("firstName")).sendKeys(firstname);
		driver.findElement(By.id("lastName")).sendKeys(lastname);
		driver.findElement(By.id("btnSave")).click();
		empSerch(firstname);
	}
	
	public static void empSerch(String firstname)
	{
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        
        wait.until(ExpectedConditions.elementToBeClickable(By.id("empsearch_employee_name_empName")));

		driver.findElement(By.id("empsearch_employee_name_empName")).clear();
		driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys(firstname);
		
		driver.findElement(By.id("searchBtn")).click();	
	}
	public static void main(String[] args)
	{	
		launchBrowser("chrome1");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		LoginTestCases.login("Admin","admin123");
		addEmp("Eklavya","Raju");	
	}
}
