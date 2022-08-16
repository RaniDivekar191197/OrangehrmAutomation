package com.Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.OrangeHRM_Automation1.BaseClass;

public class LoginTestCases extends BaseClass{
	
	
	public static void login(String username,String password)
	{
	driver.findElement(By.id("txtUsername")).sendKeys(username);
	driver.findElement(By.id("txtPassword")).sendKeys(password);
	driver.findElement(By.id("btnLogin")).click();
	try
	{
	driver.findElement(By.id("menu_dashboard_index")).isDisplayed();
	
	System.out.println("User successfully login");
	}
	catch(Exception e)
	{
		System.out.println("invalid Credential");
	}
	}
	
	public static void Logout()
	{
		try
		{
		driver.findElement(By.id("welcome")).click();
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Logout")));
        driver.findElement(By.linkText("Logout")).click();
		}
		catch(Exception e)
		{
			System.out.println("invalid Credential");
	
		}
	}
	
	public static void forpassword(String username)
	{
		//driver.findElement(By.linkText("Forgot your password")).click();
		driver.findElement(By.partialLinkText("Forgot your")).click();
		
		driver.findElement(By.id("securityAuthentication_userName")).clear();
		
		
		driver.findElement(By.id("securityAuthentication_userName")).sendKeys(username);
		
		driver.findElement(By.id("btnSearchValues")).click();
		driver.findElement(By.id("securityAuthentication_userName")).click();
		driver.findElement(By.id("btnSearchValues")).click();

		driver.findElement(By.id("resetBtn")).click();
	 
		try 
		{
		driver.findElement(By.className("message warning fadable")).isDisplayed();
		
		System.out.println("there is a password reset request already in the System");
		
		}
	catch(Exception e)	
		{
		System.out.println("request not send or invalid credential");	
	 
		}
		}
	public static void cancleButton()
	{
	driver.findElement(By.id("btnCancel")).click();
	try
	{
	driver.findElement(By.id("btnLogin")).isDisplayed();
		
	System.out.println("cancel button working Properly");	
	
	}
	catch(Exception e)
	{
		System.out.println("cancle buttonn is not working properly");
	}
}
	public static void main(String[] args)
	{
		launchBrowser("chrome1");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		login("Admin","admin123");
		Logout();
		
		login(" ","admin123");
		Logout();

		login("Admin"," ");
		Logout();
		
		login("Admin1234@#$%\r\n", "admin123@#$%");
		Logout();

		forpassword("Admin");
			
	}

	public static void loginAdmin(String string, String string2) {
		// TODO Auto-generated method stub
		
	}	
}





