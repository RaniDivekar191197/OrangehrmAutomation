package com.OrangeHrm.pages;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.OrangeHRM_Automation1.BaseClass;
import com.OrangeHRM_Automation1.Util;
import com.github.dockerjava.core.dockerfile.DockerfileStatement.Add;


public class EmpListPage extends BaseClass {
	
	By pimMenu = By.id("menu_pim_viewPimModule");
	By addEmpButton = By.id("btnAdd");
	By empFirstName = By.id("firstName");
	By empmiddleName = By.id("middleName");
	By emplastName = By.id("lastName");
	By empIdBy = By.id("employeeId");
	By checkBox = By.id("chklogic");
	By username = By.id("user_name");
	By Password = By.id("user_Password");
	By re_password = By.id("re_password");
	By syaveButton = By.id("btnSave");
	
//Add employeeAdd in orange hrm application	
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
		Util.waitforElementToClick(By.xpath("//input[@id='btnSave']"));
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
	
	public String updateEmpDetails(String fiName) {
	driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]/a")).click();
	driver.findElement(By.id("btnSave")).click();
	driver.findElement(By.id("personal_txtEmpFirstName")).clear();
	driver.findElement(By.id("personal_txtEmpFirstName")).sendKeys(fiName);
	driver.findElement(By.id("btnSave")).click();
	return fiName;
	
	}
	public Object[][] getAllEmpData() {
		driver.findElement(pimMenu).click();
		List<WebElement> totaRows = driver.findElements(By.xpath("//table[@Table']/descendant::tbody/tr"));
		int rowSize = totaRows.size();
		List<WebElement> totaColumn = driver.findElements(By.xpath("//table[@id='resultTable']/descendant::thead/tr/th"));
		int ColumnSize = totaColumn.size();
		Object[][] empData=new Object[rowSize][ColumnSize];
		for (int i = 1; i <= rowSize; i++ ) {
			
			for (int j = 2; j <= ColumnSize; j++) {
				
				String val=driver.findElement(By.xpath("//table[@id='resultTable']/descendant::tbody/tr["+i+"]/td["+j+"]")).getText();
				empData[i][j]=val;
				
			}
		}
		return empData;
		
	}

   public void deleteEmp() {
	driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectAll']"));
	driver.findElement(By.id("btnDelete")).click();
	
	driver.findElement(By.id("dialogDeleteBtn")).click();	
}
}

