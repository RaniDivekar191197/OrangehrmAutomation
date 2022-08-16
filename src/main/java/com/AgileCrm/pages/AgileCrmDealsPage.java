package com.AgileCrm.pages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;

import com.OrangeHRM_Automation1.BaseClass;

public class AgileCrmDealsPage extends  BaseClass {

	public static void main(String[] args) {
		
		 public void addeals (String toggleButton,String contact,String Name,String Own,String val,String pro,String pipe,String date,String sour,String relat,String per) {
				driver.findElement(By.id("//a[@data-toggle='tab']")).click();
				driver.findElement(By.id("//a[@class='contact-add-deal btn-default btn-sm btn blue btn-slate-action m-t-xs']")).click();
				driver.findElement(By.id("name")).sendKeys();
				driver.findElement(By.id("owners-list")).sendKeys();
				driver.findElement(By.name("currency_conversion_value")).sendKeys();
				driver.findElement(By.id("probability")).sendKeys();
				driver.findElement(By.id("pipeline_milestone")).sendKeys();
				driver.findElement(By.id("close_date")).sendKeys();
				driver.findElement(By.id("deal_source")).sendKeys();
				driver.findElement(By.id("relates_to")).sendKeys();
				driver.findElement(By.id("tags-new-person")).sendKeys();
				driver.findElement(By.id("opportunity_validate")).click();

			  }
		 public void update() {
		 

	}
		 public  void delete() {
			 
		 }
		 


	
}

