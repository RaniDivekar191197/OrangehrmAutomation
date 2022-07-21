package com.OrangeHRM_Automation1;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class KeywordUsed extends BaseClass {

	public static void main(String[] args) throws Exception {
		launchBrowser("chrome");
		driver.get("https://www.amazon.in/");
		Actions act= new Actions(driver);
		
		WebElement bestseller=driver.findElement(By.xpath("//a[@class='nav-a  '] "));
		act.contextClick(bestseller).build().perform();
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
		robot.keyRelease(KeyEvent.VK_ENTER);

		
		String parentTabId =driver.getWindowHandle();
		System.out.println(parentTabId);
		Set<String>windowsId=driver.getWindowHandles();
		for(String id:windowsId)
		{
			if(!id.equals(parentTabId))
			{
				System.out.println(id);
			driver.switchTo().window(id);
				System.out.println(driver.getTitle());
				driver.close();
				driver.switchTo().window(parentTabId);
		}
	}
		System.out.println(driver.getTitle());
		driver.quit();
	}
	
}

	

		
		
		
	


