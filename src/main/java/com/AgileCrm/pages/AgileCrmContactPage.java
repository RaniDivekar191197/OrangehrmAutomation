package com.AgileCrm.pages;

import org.openqa.selenium.By;

import com.OrangeHRM_Automation1.BaseClass;

public class AgileCrmContactPage extends BaseClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		public void contact(String Ramu,String Rastuki,String Softwaretesting,String CyberCodex,String Ramesh) {
			driver.findElement(By.id("//i[@class='material-icons business']")).click();
			driver.findElement(By.xpath("//button[@class='btn btn-default btn-primary-imp btn-lg-imp btn-sm btn-addon pull-left m-r-sm ']")).click();
			
			driver.findElement(By.id("fname")).sendKeys(Ramu);
			driver.findElement(By.id("lname")).sendKeys(Rastuki);
			
			driver.findElement(By.id("job_title")).sendKeys(Softwaretesting);
			driver.findElement(By.id("contact_company")).sendKeys(CyberCodex);
			driver.findElement(By.id("email")).sendKeys();
//			driver.findElement(By.id("phone")).sendKeys(9876543210);
			driver.findElement(By.id("tags-new-person")).sendKeys(Ramesh);
			driver.findElement(By.id("person_validate")).click();

		}
	  public void existingConctactadd (String number) {
		 driver.findElement(By.xpath("//a[@class='add-existing-contact btn btn-default btn-sm m-t-xs']")).click();
		 driver.findElement(By.id("relates_to")).sendKeys(number); 
	  }
	  public void deleteContact() {
		  
	  }
	  

	}

}
