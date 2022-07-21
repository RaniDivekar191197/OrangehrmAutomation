package com.OrangeHRM_Automation1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownExamples extends BaseClass {

	public static void main(String[] args) throws Exception {
		launchBrowser("chrome");
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
        LoginTestCases.login("Admin","admin123");
        driver.findElement(By.id("menu_pim_viewPimModule")).click();
        
        //locate emp1 status dropdown
        WebElement empStatusDropDown = driver.findElement(By.id("empsearch_employee_status"));
        
        //create instance of select class and pass the referance of dropdown to the constructor
        Select select=new Select(empStatusDropDown);
        
        //select the dropdown value by index
        select.selectByIndex(1);
        
        //select the dropdown value by Text
        select.selectByVisibleText("Full-Time Contract");
        
        //select the dropdown value by value attribute value
       // select.selectByValue("4");
        
        //select.deselectAll();
        
        //select.deselectByIndex(1);
        
        //select.deselectByValue(null);
                
        //select.deselectByVisibleText(null);
        
        List<WebElement> allSelectedOptions=select.getAllSelectedOptions();
        List<org.openqa.selenium.WebElement> element;
		for(WebElement element1:allSelectedOptions){
        	System.out.println(element1.getText());
        }
        List<WebElement> allDropDownValues=select.getOptions();
        for(WebElement element1:allDropDownValues) {
        	System.out.println(element1.getText());
        	/*if(element1.getText().equals("Freelance")) {
        		throw new Exception("Freelance value is present in the Employee Status Dropdown");
        		}*/
        }    
        
	}

}
