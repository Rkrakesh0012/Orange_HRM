package OrangeHrm.testcase;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import OrangeHrm.library.LogInPage;
import Utils.AppsUtils;

public class AdminLogInWithInvalidData extends AppsUtils

{
	@Parameters({"yname", "posw"})
	@Test
	public void CheckAdminLogin(String uid, String pwd)
	{
		LogInPage lp = new LogInPage();
		lp.login(uid, pwd);
		boolean res = lp.isErrSmsDispyed();
		Assert.assertTrue(res);
	}
	
	

}
