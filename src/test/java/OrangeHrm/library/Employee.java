package OrangeHrm.library;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.AppsUtils;

public class Employee extends AppsUtils
    {
	
		public Boolean addEmployee(String fname, String lname)
		{
			driver.findElement(By.linkText("PIM")).click();;
			driver.findElement(By.linkText("Add Employee")).click();
			driver.findElement(By.id("firstName")).sendKeys(fname);
			driver.findElement(By.id("lastName")).sendKeys(lname);
			String empid = driver.findElement(By.id("employeeId")).getAttribute("value");
			driver.findElement(By.id("btnSave")).click();
			
			
		driver.findElement(By.linkText("Employee List")).click();
		driver.findElement(By.id("empsearch_id")).sendKeys(empid);
		driver.findElement(By.id("searchBtn")).click();
		   WebElement emptable= driver.findElement(By.id("search-results"));
		   List<WebElement> row= emptable.findElements(By.tagName("tr"));
		   boolean isempexist = false;
		   for(int i=1;i<row.size();i++)
		   {
			   List<WebElement> col = row.get(i).findElements(By.tagName("tr"));
 
			  {
				  isempexist = true;
				  break;
			  }
		   }
		  return isempexist;
		   
		   
		
		}
		
		
		
	}


