package com.OrangeHRM_Automation1;

import java.time.Duration;

import org.openqa.selenium.By;

public class WaitsExamples extends BaseClass {

	public static void main(String[] args) throws Exception {
		
		BaseClass.launchBrowser("chrome");
		
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	LoginTestCases.login("Admin","admin123");
	
	try {
		if(driver.findElement(By.id("")).isDisplayed() ) {
			
			String errorMessage = driver.findElement(By.id("")).getText();
			System.out.println(errorMessage);
		}
	}
	catch(Exception e) {
		
		System.out.println("The Error Message is not availableb on login screen");	
	}

	}

}
