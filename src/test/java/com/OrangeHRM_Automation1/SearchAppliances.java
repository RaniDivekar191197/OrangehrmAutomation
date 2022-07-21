package com.OrangeHRM_Automation1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SearchAppliances extends BaseClass{

	public static void main(String[] args) {
		launchBrowser("chrome");
		driver.get("https://www.amazon.in/");
		WebElement searchDropdown=driver.findElement(By.id("searchDropdownBox"));
		Select select=new Select(searchDropdown);
		select.selectByVisibleText("Appliances");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("washing machine");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Util.waitforElementToClick(By.xpath("//div[starts-with(@cel_widget_id,'MAIN-SEARCH_RESULTS')]/descendant::div/h2/a/span"));
		List<WebElement> result=driver.findElements(By.xpath("//div[starts-with(@cel_widget_id,'MAIN-SEARCH_RESULTS')]/descendant::div/h2/a/span"));
		for(WebElement element:result) {
			
			String resultDetails=element.getText();
			System.out.println(resultDetails);
			System.out.println("---------------------------------------------------------------------------------------------------------------------");
		}

	}

}
