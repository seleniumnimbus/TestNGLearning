package Base;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseSuite {
	
	@BeforeSuite(alwaysRun=true)
	public void createWebDriver() {
		System.out.println("Create WebDriver");
	}
	
	@AfterSuite(alwaysRun=true)
	public void closeAllConnection() {
		System.out.println("Close all connection");
	}
	
	
}
