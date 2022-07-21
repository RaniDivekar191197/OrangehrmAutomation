package com.OrangeHrm.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.OrangeHRM_Automation1.BaseClass;

public class LoginPage extends BaseClass {
	
	public static void login(String userName,String passWord) {
		//locate userName text box field
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		
		//locate password field and enter passsword in the password textbox
		driver.findElement(By.id("txtPassword")).sendKeys(passWord);
		
		// locate login button and click on the same
		driver.findElement(By.id("btnLogin")).click();
		
	}
	
	public void logout() {
		driver.findElement(By.id("welcome")).click();
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Logout")));
        driver.findElement(By.linkText("Logout")).click();
	}
}


