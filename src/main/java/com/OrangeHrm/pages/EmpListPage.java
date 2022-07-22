package com.OrangeHrm.pages;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.OrangeHRM_Automation1.BaseClass;
import com.OrangeHRM_Automation1.Util;


public class EmpListPage extends BaseClass {
	
	public Map<String,Object> addEmp(String fName,String mName,String lName,boolean isUser,String uName,String pwd){
		Map<String,Object> empDetails=new HashMap<>();
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("firstName")).sendKeys(fName);
		driver.findElement(By.id("middleName")).sendKeys(mName);
		driver.findElement(By.id("lastName")).sendKeys(lName);
		String empId=driver.findElement(By.xpath("employeeId")).getAttribute("value");
		empDetails.put("empID", empId);
		empDetails.put("firstName",fName );
		empDetails.put("middleName",mName );
		empDetails.put("lastName",lName );
		if(isUser) {
			driver.findElement(By.id("chklogic")).click();
			driver.findElement(By.id("user_name")).sendKeys(uName);
			driver.findElement(By.id("user_Password")).sendKeys(pwd);
			driver.findElement(By.id("re_password")).sendKeys(pwd);
		}
		Util.waitforElementToClick(By.xpath("//input[@id=\"btnSave\"]"));
		driver.findElement(By.id("btnSave")).click();
        return empDetails;
	}
	public void searchEmp(Map<String,Object> empDetails ) throws Exception{
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		Util.waitForElementToVisible(driver.findElement(By.id("empsearch_id")));	
		driver.findElement(By.id("empsearch_id")).clear();
		driver.findElement(By.id("empsearch_id")).sendKeys(empDetails.get("empId").toString());
		driver.findElement(By.id("searchBtn")).click();
		WebElement searchResult=driver.findElement(By.xpath("//tr[@class='odd']/td[2]/a"));
		Util.waitForElementToVisible(searchResult);
		Util.validate(searchResult.getText(), empDetails.get("empId").toString());
	}

   public void deleteEmp() {
	driver.findElement(By.xpath(""));
	driver.findElement(By.id("btnDelete")).click();
	
	driver.findElement(By.id("ohrmList_chkSelectRecord_102")).click();
	driver.findElement(By.id("dialogDeleteBtn")).click();
	driver.findElement(By.id("btnDelete")).click();
	



	
}
}

