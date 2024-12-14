package OrangeHrm.library;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Utils.AppsUtils;

public class Users extends AppsUtils
{
@Test
	public boolean AddUser(String role,String empname,String uname,String upsw) throws InterruptedException
	{
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.linkText("User Management")).click();
		driver.findElement(By.linkText("Users")).click();
		
		driver.findElement(By.id("btnAdd")).click();
		
		Select roleList = new Select(driver.findElement(By.id("systemUser_userType")));
		roleList.selectByVisibleText(role);
		
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(empname);
		driver.findElement(By.id("systemUser_userName")).sendKeys(uname);
		driver.findElement(By.id("systemUser_password")).sendKeys(upsw);
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(upsw);
		
		Thread.sleep(2000);
		driver.findElement(By.id("btnSave")).click();
	
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys(uname);
		driver.findElement(By.id("searchBtn")).click();
		
	WebElement user_Table =	 driver.findElement(By.id("search-results"));
	List<WebElement> rows =   user_Table.findElements(By.tagName("tr"));
	
	boolean Userexist= false;
	for(int i=1;1<rows.size(); i++)
	{
	  List<WebElement> colms =rows.get(i).findElements(By.tagName("td"));
	  if(colms.get(1).getText(). equals(uname))
	  {
		  Userexist = true;
		  break;
	  }
	
	}
	
	return Userexist;
	
	}
}
		
	
	
	
	
	
	


