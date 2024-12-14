package Utils;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class AppsUtils {

	public static WebDriver driver;
	public static String url = "http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login";

	@BeforeSuite
	public static void LaunchApps()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
	}

	@AfterSuite
	public static void CloseApps() {
		driver.close();
	}

}
