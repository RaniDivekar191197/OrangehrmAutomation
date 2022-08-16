package com.Practice;

import java.util.Set;

import org.openqa.selenium.By;

import com.OrangeHRM_Automation1.BaseClass;

public class WindowHandling  extends BaseClass{

	public static void main(String[] args) {
		launchBrowser("chrome");
		driver.get("https://www.redbus.in/");
		driver.findElement(By.linkText("Help")).click();
		//driver.findElement(By.className("icon-close")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/i")).click();
		String parentTabId =driver.getWindowHandle();
		System.out.println(parentTabId);
		Set<String> windowsId=driver.getWindowHandles();
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

	}

}
