package Base;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseSBITest extends BaseSuite{
	
	@BeforeTest(alwaysRun=true)
	public void navigatetoSBI() {
		System.out.println("Navigate To SBI");
	}
	
	@AfterTest(alwaysRun=true)
	public void closeBrowser() {
		System.out.println("Close browser");
	}

}
