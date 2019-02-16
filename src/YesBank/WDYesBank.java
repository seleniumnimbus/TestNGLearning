package YesBank;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseYesBank;



public class WDYesBank extends BaseYesBank{
	
	@BeforeClass(alwaysRun=true)
	public void loginYesBank() {
		System.out.println("Login to YesBank");
	}
	
	@AfterClass(alwaysRun=true)
	public void logoutYesBank() {
		System.out.println("Logout from YesBank");
	}
	
	@BeforeMethod(alwaysRun=true)
	public void clickWDLink() {
		System.out.println("Click WD Link");
	}
	
	@AfterMethod(alwaysRun=true)
	public void clickBack() {
		System.out.println("Click back button");
	}
	
	@Test
	public void wd1YesBank() {
		System.out.println("Withdrawals YesBank 1");
	}
	
	@Test(groups= {"smokeTest"})
	public void wd2YesBank() {
		System.out.println("Withdrawals YesBank 2");
	}

}
