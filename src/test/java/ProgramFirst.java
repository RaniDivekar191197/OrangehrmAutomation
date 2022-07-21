import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.chrome.ChromeDriver;

import com.OrangeHRM_Automation1.BaseClass;

public class ProgramFirst extends BaseClass {
	

	private static By driver;

	public static void login(String username,String password)
	{
		driver.findElement((SearchContext) By.id("txtUsername")).sendKeys(username);
	driver.findElement((SearchContext) By.id("txtPassword")).sendKeys(password);
	driver.findElement((SearchContext) By.id("btnLogin")).click();
	
	}

}
