package com.OrangeHRM_Automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class javaScriptExample extends BaseClass {

	public static void main(String[] args) {
		launchBrowser("chrome");
		driver.get("https://realestateautomation.agilecrm.com");
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.name("email")).sendKeys("automation@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("Test1234");
		WebElement signInButton=driver.findElement(By.xpath("//input[@value='Sign In']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",signInButton);
		System.out.println(js.executeScript("return document.domain;"));
		System.out.println(js.executeScript("return document.URL;"));
		Util.waitForElementToVisible(driver.findElement(By.id("add-portlet")));
		js.executeScript("window.scrollBy(0,1000);");
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

}
