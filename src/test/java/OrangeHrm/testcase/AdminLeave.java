package OrangeHrm.testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Utils.AppsUtils;

public class AdminLeave extends AppsUtils {
@Test
	public void CheckAdminLeave(String uid,String pwd) {
		driver.findElement(By.id("txtUsername")).sendKeys(uid);
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.linkText("Leave")).click();
		driver.findElement(By.linkText("My Leave")).click();
		//driver.findElement(By.id("calFromDate")).sendKeys(24-01-04).click();;
	}
}
