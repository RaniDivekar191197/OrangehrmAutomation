package com.AgileCrm.pages;

//import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;

import com.OrangeHRM_Automation1.BaseClass;

public class AgileCrmCompaniespage extends BaseClass {


	public void addCompany(String comName,String url) {
		driver.findElement(By.xpath("//i[@class='material-icons business']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-primary-imp btn-lg-imp btn-sm btn-addon pull-left m-r-sm']")).click();
		driver.findElement(By.id("company_name")).sendKeys(comName);
		driver.findElement(By.id("company_url")).sendKeys(url);
		driver.findElement(By.id("company_validate")).click();
		
	}
	public void update(String compName,String url) {
		driver.findElement(By.id("company_name")).sendKeys(compName);
		driver.findElement(By.id("company_url")).sendKeys(url);
		driver.findElement(By.id("continue-company")).click();
		
		
		driver.findElement(By.id("company_name")).sendKeys();
		driver.findElement(By.id("company_url")).sendKeys();
		driver.findElement(By.id("tags-new-person")).sendKeys();
		driver.findElement(By.id("email")).sendKeys();
		driver.findElement(By.id("phone")).sendKeys();
		driver.findElement(By.id("website")).sendKeys();
		driver.findElement(By.id("address")).sendKeys();
		driver.findElement(By.id("city")).sendKeys();
		driver.findElement(By.id("state")).sendKeys();
		driver.findElement(By.id("zip")).sendKeys();
		driver.findElement(By.id("country")).sendKeys();
		driver.findElement(By.id("")).sendKeys();

	}
	public void delete() {
		driver.findElement(By.id("//i[@class='material-icons more_vert v-middle']")).click();
		
	}
}


