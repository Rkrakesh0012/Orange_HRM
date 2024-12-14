package OrangeHrm.library;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Utils.AppsUtils;

public class AdminUtils extends AppsUtils
{

	public LogInPage lp;
	public String Adminuid= "Admin";
	public String Adminpsw= "Qedge123!@#";
	
	@BeforeTest
	public void AdminLogin()
	{
		
		lp = new LogInPage();
		lp.login(Adminuid, Adminpsw);
		
	}
	@AfterTest
	public void AdminLogOut() throws Throwable
	{
		lp.logout();
	}
	
}
