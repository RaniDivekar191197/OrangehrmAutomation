package com.AgileCrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.OrangeHRM_Automation1.BaseClass;
import com.OrangeHRM_Automation1.Util;

public class AgileCrmLoginPage extends BaseClass {
	
	  
	public void login(String userName,String password) {
		driver.findElement(By.name("email")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Sign In']")).submit();
	}
	public void logout() {
		driver.findElement(By.id("fat-menu")).click();
		WebElement element=driver.findElement(By.xpath("//i[@class='material-icons lock_open logout-icon']"));
		Util.waitForElementToVisible(element);
		element.click();	
	}

}


