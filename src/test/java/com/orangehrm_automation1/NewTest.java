package com.orangehrm_automation1;

import org.testng.annotations.Test;

import com.OrangeHRM_Automation1.ExcelUtil1;
import com.OrangeHrm.pages.LoginPage;

import org.testng.annotations.DataProvider;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
public class NewTest {
	  ExcelUtil1 excelUtil;
	  
@BeforeClass
	  public void beforeClass() throws IOException {
		  System.out.println("This is before class method....");
		  
	  }

@DataProvider
public Object[][] getTestData() throws IOException {
	String filePath="C:\\Users\\ranid\\eclipse-workspace\\TestData.xlsx";
	  excelUtil =new ExcelUtil1();

  return excelUtil.getExcelData(filePath,"Sheet1");
}

  @Test(dataProvider = "getTestData",enabled=true)
  public void Test1(String username, String password,String status) {
	  LoginPage loginPage=new LoginPage();
		//  loginPage.login(username,password)
		  System.out.println(username + " : " + password+ " : "+ status);
	  }
  public void test3() {
	  String file = "C:\\Users\\ranid\\eclipse-workspace\\TestData.xlsx";
	  excelUtil=new ExcelUnit;
	  excelUtil.setExcelData(filePath,getTestData(),1,2,Header1);
  }
}
     
