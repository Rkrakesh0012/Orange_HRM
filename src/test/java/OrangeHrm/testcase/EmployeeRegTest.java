package OrangeHrm.testcase;



import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import OrangeHrm.library.AdminUtils;
import OrangeHrm.library.Employee;

public class EmployeeRegTest extends AdminUtils

{
	@Parameters({"fname","lname"})
	@Test
	public void CheckEmpreg(String fname, String lname)
	{
		Employee emp = new Employee();
		boolean res = emp.addEmployee(fname ,lname);
		Assert.assertTrue(res);
		//throw new SkipException("Skip the statement");
	
	}
	
	

}
