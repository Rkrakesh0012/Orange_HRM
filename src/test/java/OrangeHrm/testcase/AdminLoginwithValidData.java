
package OrangeHrm.testcase;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import OrangeHrm.library.LogInPage;
import Utils.AppsUtils;

public class  AdminLoginwithValidData extends AppsUtils
{
	@Parameters({"uname", "pswd"})
	@Test
	public void CheckAdminLogin(String uid, String pwd) throws Throwable
	{
		LogInPage lp = new LogInPage();
		lp.login(uid,pwd);
		boolean res= lp.isAdmidModuleDisplyed();
		org.testng.Assert.assertTrue(res);
		lp.logout();
	}
	
	
}
