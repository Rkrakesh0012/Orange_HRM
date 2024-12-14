package OrangeHrm.library;

import org.openqa.selenium.By;

import Utils.AppsUtils;

public class LogInPage extends AppsUtils
{
	public void login(String uid,String pwd)
	{
		driver.findElement(By.id("txtUsername")).sendKeys(uid);
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		driver.findElement(By.id("btnLogin")).click();

	}
	public boolean isAdmidModuleDisplyed()
	{
		if(driver.findElement(By.linkText("Admin")).isDisplayed())
		{
			return true;
		}else
		{
			return false;
		}
	}
	public void logout() throws Throwable
	{
		driver.findElement(By.partialLinkText("Welcome")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
	}
	public Boolean isErrSmsDispyed()
	{
		String Errsms = driver.findElement(By.id("spanMessage")).getText().toLowerCase();
		if(Errsms.contains("invalid")|| Errsms.contains("empty"))
		{
			return true;
		}else
		{
			return false;
		}
	}
		public boolean IsEmpModulDisplayed()
		{
			try
			{
				driver.findElement(By.linkText("Admin")).isDisplayed();
						return  false;
			
			}catch(Exception e)
			{
						return true;
			}
		
	
	}
}





