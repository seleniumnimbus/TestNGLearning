package YesBank;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseYesBank;


public class AllocationYesBank  extends BaseYesBank {
	
	@BeforeClass(alwaysRun=true)
	public void loginYesBank() {
		System.out.println("Login to YesBank");
	}
	
	@AfterClass(alwaysRun=true)
	public void logoutYesBank() {
		System.out.println("Logout from YesBank");
	}
	
	@BeforeMethod(alwaysRun=true)
	public void clickAllocationLink() {
		System.out.println("Click Allocation Link");
	}
	
	@AfterMethod(alwaysRun=true)
	public void clickBack() {
		System.out.println("Click back button");
	}
	
	@Test
	public void allocation1YesBank() {
		System.out.println("Allocation YesBank 1");
	}
	
	@Test(groups= {"smokeTest"})
	public void allocation2YesBank() {
		System.out.println("Allocation YesBank 2");
	}

}
