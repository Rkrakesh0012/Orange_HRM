package OrangeHrm.testcase;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import OrangeHrm.library.AdminUtils;
import OrangeHrm.library.Users;

public class UserRegTest extends AdminUtils
{
	@Parameters({"role","empname","uname","upsw"})
	@Test
	public void CheckUserReg(String role, String empname, String uname, String upsw) throws InterruptedException
	{
		Users us = new Users();
	boolean res = us.AddUser(role,empname,uname,upsw);
		Assert.assertTrue(res);
		
	}
	
	

}
