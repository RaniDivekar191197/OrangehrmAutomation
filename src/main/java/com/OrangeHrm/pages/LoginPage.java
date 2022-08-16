package com.OrangeHrm.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.OrangeHRM_Automation1.BaseClass;
import com.OrangeHRM_Automation1.Util;

public class LoginPage extends BaseClass {
	//initialize WebElements
	//pageFactory.initElements(driver,this);	
/*@FindBy(id="txtUsername")
public WebElement username;

@FindBy(id="txtPassword")
public WebElement password;

@FindBy(id="btnLogin")
public WebElement loginButton;
@FindBy(id="welcome")
public WebElement welcome;
@FindBy(linkText = "Logout")
public WebElement logoutButton;*/
	public By username = By.id("txtUsername");
	public By password = By.id("txtPassword");
	public By loginButton = By.id("btnLogin"); 
	
	public void login(String username,String passWord) {
		driver.findElement(this.username).sendKeys(username);
		driver.findElement(this.password).sendKeys();
		driver.findElement(this.loginButton).click();

		//locate userName text box field
	//	driver.findElement(By.id("txtUsername")).sendKeys(userName);
		//username.sendKeys(userName);

		//locate password field and enter passsword in the password textbox
	//	driver.findElement(By.id("txtPassword")).sendKeys(passWord);
	//	password.sendKeys(passWord);

		// locate login button and click on the same
	//	driver.findElement(By.id("btnLogin")).click();
	//	loginButton.click();
	}

	public void logout() {
		driver.findElement(By.id("welcome")).click();
		Util.waitforElementToClick((By.linkText("Logout")));
        driver.findElement(By.linkText("Logout")).click();
	
}
	}
	



