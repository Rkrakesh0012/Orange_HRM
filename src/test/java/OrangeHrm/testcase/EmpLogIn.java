package OrangeHrm.testcase;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import OrangeHrm.library.LogInPage;
import Utils.AppsUtils;

public class EmpLogIn extends AppsUtils
{
	@Test
	public void CheckEmpLogIn() throws Throwable
	{
		LogInPage lp = new LogInPage();
    lp.login("Rakesh06", "Rakesh0012@");
    boolean res= lp.IsEmpModulDisplayed();
    Assert.assertTrue(res);
    lp.logout();
    //throw new SkipException("skip the statement");
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
				
		
		
	}
	

}
