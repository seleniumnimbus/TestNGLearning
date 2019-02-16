package SBI;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseSBITest;

public class AllocationSBI  extends BaseSBITest {
	
	@BeforeClass(alwaysRun=true)
	public void loginSBI() {
		System.out.println("Login to SBI");
	}
	
	@AfterClass(alwaysRun=true)
	public void logoutSBI() {
		System.out.println("Logout from SBI");
	}
	
	@BeforeMethod(alwaysRun=true)
	public void clickAllocationLink() {
		System.out.println("Click Allocation Link");
	}
	
	@AfterMethod(alwaysRun=true)
	public void clickBack() {
		System.out.println("Click back button");
	}
	
	@Test(groups= {"smokeTest"})
	public void allocation1SBI() {
		System.out.println("Allocation SBI 1");
	}
	
	@Test
	public void allocation2SBI() {
		System.out.println("Allocation SBI 2");
	}

}
