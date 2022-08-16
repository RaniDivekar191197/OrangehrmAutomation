package com.agilecrm.automation1;

import org.testng.annotations.Test;

import com.AgileCrm.pages.AgileCrmLoginPage;
import com.OrangeHRM_Automation1.BaseClass;
import com.OrangeHRM_Automation1.PropertyHandling;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class AddCompanyTestCase extends BaseClass {
	PropertyHandling prop;
	@BeforeClass
	@Parameters({"browser"})
	
	public void beforeClass(String browser) {
	String configFilePath=System.getProperty("user.dir")+"/config.Properties";
	prop =new PropertyHandling(configFilePath);
 	launchBrowser("chrome"); 
 	driver.get(prop.getProperty("agileCrmUrl"));
 	AgileCrmLoginPage loginPage =new AgileCrmLoginPage();
 	String username = prop.getProperty("agileCrmUsername");
 	String password = prop.getProperty("agileCrmpassword");
 	loginPage.login(username, password);
	}

@Test
  public void addcompany() {
	  driver.findElement(By.id("companiesmenu")).click();
	  driver.findElement(By.xpath("//div[@id='view-list']/button[1]")).click();
	  driver.findElement(By.id("company_name")).sendKeys("Google");
	  driver.findElement(By.id("company_url")).sendKeys("www.google.com");
	  driver.findElement(By.id("company_validate")).click();
  }
}
