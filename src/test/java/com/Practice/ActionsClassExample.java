package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.OrangeHRM_Automation1.BaseClass;
import com.OrangeHRM_Automation1.Util;

public class ActionsClassExample extends BaseClass {

	public static void main(String[] args) {
         launchBrowser("Chrome");
         driver.get("https://realestateautomation.agilecrm.com/");
         driver.findElement(By.name("email")).sendKeys("automation@yopmail.com");
         driver.findElement(By.name("password")).sendKeys("Test1234");
         
         driver.findElement(By.xpath("//input[@value='Sign In']")).submit();
         
         driver.findElement(By.id("dealsmenu")).click();
         
         Util.waitforElementToClick(By.id("5003049292070912"));
         
         WebElement deal= driver.findElement(By.id("5003049292070912"));
         
         WebElement prospect =driver.findElement(By.xpath("//div[@milestone='Prospect']"));
         
         Actions act = new Actions(driver);
         
         act.clickAndHold(deal).release(prospect).build().perform();


	}

		
	}


