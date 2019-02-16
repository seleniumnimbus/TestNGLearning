package Base;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseYesBank extends BaseSuite{
	
	@BeforeTest(alwaysRun=true)
	public void navigatetoYesBank() {
		System.out.println("Navigate To YesBank");
	}
	
	@AfterTest(alwaysRun=true)
	public void closeBrowser() {
		System.out.println("Close browser");
	}

}
