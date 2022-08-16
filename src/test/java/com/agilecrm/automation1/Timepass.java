package com.agilecrm.automation1;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.AgileCrm.pages.AgileCrmLoginPage;
import com.OrangeHRM_Automation1.BaseClass;



public class Timepass extends BaseClass{
 
  @BeforeClass
  public void beforeClass(String username,String password,String browser,String url) {
	  launchBrowser(browser);
	  driver.get(url);
	  AgileCrmLoginPage loginPage =new AgileCrmLoginPage();
	  loginPage.login(username, password);
  }
  
  
  @Test
  public void addCompany (String Google,String url ) {
	  driver.findElement(By.xpath("//i[@class='material-icons business']")).click();
	  driver.findElement(By.xpath("//button[@class='btn btn-default btn-primary-imp btn-lg-imp btn-sm btn-addon pull-left m-r-sm ']")).click();
	  driver.findElement(By.id("company_name")).sendKeys(Google);
	  driver.findElement(By.id("company_url")).sendKeys(url);
	  driver.findElement(By.id("company_validate")).click();  
  }
  
  
  public void addContact(String Ramu,String Rastuki,String Softwaretesting,String CyberCodex,String Ramesh) {
		driver.findElement(By.id("//i[@class='material-icons business']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-primary-imp btn-lg-imp btn-sm btn-addon pull-left m-r-sm ']")).click();
		
		driver.findElement(By.id("fname")).sendKeys(Ramu);
		driver.findElement(By.id("lname")).sendKeys(Rastuki);
		
		driver.findElement(By.id("job_title")).sendKeys(Softwaretesting);
		driver.findElement(By.id("contact_company")).sendKeys(CyberCodex);
		driver.findElement(By.id("email")).sendKeys();
//		driver.findElement(By.id("phone")).sendKeys(9876543210);
		driver.findElement(By.id("tags-new-person")).sendKeys(Ramesh);
		driver.findElement(By.id("person_validate")).click();

	}
  public void addExistingConctact(String number) {
	 driver.findElement(By.xpath("//a[@class='add-existing-contact btn btn-default btn-sm m-t-xs']")).click();
	 driver.findElement(By.id("relates_to")).sendKeys(number); 
  }
  public void deleteContact() {
	  
  }
  
  
  
  public void addDeals() {
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
	driver.findElement(By.id("opportunity_validate")).sendKeys();

  }
  
  public delete() {
	  
  }
  

  
  public void addNotes(String subject,String description,String note_related_to ) {
	  driver.findElement(By.id("//a[@data-toggle='tab']")).click();
	  driver.findElement(By.id("//a[@class='btn m-t-xs btn-default btn-sm btn-slate-action contact-add-note']")).click();

	  driver.findElement(By.id("subject")).sendKeys(subject);
	 driver.findElement(By.id("description")).sendKeys(description);
	 driver.findElement(By.id("note_related_to")).sendKeys(note_related_to);
	 driver.findElement(By.id("note_validate")).click();	  
  }
   
  public void addEvents() {
	  driver.findElement(By.id("//a[@data-toggle='tab']")).click();
	  driver.findElement(By.id("btn blue btn-slate-action btn-default btn-sm m-t-xs contact-add-event")).click();
	  driver.findElement(By.id("title")).sendKeys();
	  driver.findElement(By.id("color")).sendKeys();
	  driver.findElement(By.id("status")).sendKeys();
	  driver.findElement(By.id("event-owners-list")).sendKeys();
	  driver.findElement(By.id("event-date-1")).sendKeys();
	  driver.findElement(By.id("event-time-1")).sendKeys();
	  driver.findElement(By.id("event-date-2")).sendKeys();
	  driver.findElement(By.id("event-time-2")).sendKeys();
	  driver.findElement(By.id("event_related_to")).sendKeys();
	  driver.findElement(By.id("event_relates_to_deals")).sendKeys();
	  driver.findElement(By.id("task_event_validate")).sendKeys();  
  }
  public void addTasks() {
	  driver.findElement(By.xpath("//ul[@id='contactDetailsTab']/li[6]/a")).click();
	  driver.findElement(By.xpath("//a[@class='btn blue btn-slate-action btn-default btn-sm contact-add-task m-t-xs']")).click();
	  driver.findElement(By.id("subject")).sendKeys();
	  driver.findElement(By.id("type")).sendKeys();
	  driver.findElement(By.id("task-date-1")).sendKeys();
	  driver.findElement(By.id("task_ending_time")).click();
	  driver.findElement(By.id("owners-list")).sendKeys();
	  driver.findElement(By.id("priority_type")).sendKeys();
	  driver.findElement(By.id("status")).sendKeys();
	  driver.findElement(By.id("task_related_to")).sendKeys();
	  driver.findElement(By.id("task_relates_to_deals")).sendKeys();
	  driver.findElement(By.id("task_event_validate")).sendKeys();	  
  }
public void Documents() {
	  driver.findElement(By.id("//ul[@id='contactDetailsTab']/li[7]/a")).click();
	  driver.findElement(By.id("//a[@class='btn btn-default btn-sm add-document-select m-t-xs']")).click();
	  driver.findElement(By.id("")).click();
	  driver.findElement(By.id("")).click();
	  driver.findElement(By.id("")).click();
	  driver.findElement(By.id("")).click();
	  driver.findElement(By.id("")).click();
  
  }
 
  @AfterClass
  public void afterClass() {
	  driver.quit();

  }

}
