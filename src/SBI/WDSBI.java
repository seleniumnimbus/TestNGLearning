package SBI;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Base.BaseSBITest;

public class WDSBI extends BaseSBITest{
	
	@BeforeClass(alwaysRun=true)
	@Parameters({"userName","password"})
	public void loginSBI(String userName,String password) {
		System.out.println("Login to SBI");
		System.out.println("User Name is " + userName);
		System.out.println("Password is " + password);
	}
	
	@AfterClass(alwaysRun=true)
	public void logoutSBI() {
		System.out.println("Logout from SBI");
	}
	
	@BeforeMethod(alwaysRun=true)
	public void clickWDLink() {
		System.out.println("Click WD Link");
	}
	
	@AfterMethod(alwaysRun=true)
	public void clickBack() {
		System.out.println("Click back button");
	}
	
	@Test(priority=2)
	public void wd1SBI() {
		System.out.println("Withdrawals SBI 1");
	}
	
	@Test(priority=1)
	public void wd2SBI() {
		System.out.println("Withdrawals SBI 2");
	}

}
