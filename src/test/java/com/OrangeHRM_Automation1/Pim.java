package com.OrangeHRM_Automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pim extends BaseClass {
    
    public static void pimPage()
    {
    	driver.findElement(By.id("menu_pim_viewPimModule")).click();
    	try
    	{
    	driver.findElement(By.id("menu_pim_viewPimModule")).isDisplayed();

    	}
    	catch(Exception e)
    	{
    	System.out.println("Pim Page is displayed");	
    	}
    }
    
    
    public static void addEmp()
    {
    	
    	
    }
    
    
    
    
    public static void main(String[] args) {
         
         launchBrowser("chrome");
         driver.get("https://opensource-demo.orangehrmlive.com");
 		LoginTestCases.login("Admin","admin123");
 		Pim.pimPage();
    }
}

	
		
	
		
	


