package YesBank;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseYesBank;



public class LoanYesBank extends BaseYesBank {
	
	@BeforeClass(alwaysRun=true)
	public void loginYesBank() {
		System.out.println("Login to YesBank");
	}
	
	@AfterClass(alwaysRun=true)
	public void logoutYesBank() {
		System.out.println("Logout from YesBank");
	}
	
	@BeforeMethod(alwaysRun=true)
	public void clickLoanLink() {
		System.out.println("Click Loan Link");
	}
	
	@AfterMethod(alwaysRun=true)
	public void clickBack() {
		System.out.println("Click back button");
	}
	
	@Test
	public void loan1YesBank() {
		System.out.println("Loan YesBank 1");
	}
	
	@Test
	public void loan2YesBank() {
		System.out.println("Loan YesBank 2");
	}

}
