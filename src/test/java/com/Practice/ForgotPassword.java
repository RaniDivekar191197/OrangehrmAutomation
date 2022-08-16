package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import com.OrangeHRM_Automation1.BaseClass;

public class ForgotPassword extends BaseClass 
{
	public static void forgot(String username)
	{
		driver.findElement(By.id("securityAuthentication_userName")).sendKeys(username);
	
		driver.findElement(By.id("btnSearchValues")).click();
		try 
		{			
			System.out.println("password reset request send to system");
			driver.findElement(By.id("securityAuthentication_userName")).clear();


		} 
		catch (Exception e) 
		{
			driver.navigate().refresh();
		}
	}
	public static void main(String[] args) 
	{
		
		ForgotPassword obj=new ForgotPassword();
		
		obj.launchBrowser("chrome");
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.partialLinkText("Forgot your")).click();
		forgot("Admins");
		forgot("");
				
		
	}
}



		
		
       

