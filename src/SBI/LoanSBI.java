package SBI;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.BaseSBITest;

public class LoanSBI extends BaseSBITest {

	@BeforeClass(alwaysRun=true)
	public void loginSBI() {
		System.out.println("Login to SBI");
	}

	@AfterClass(alwaysRun=true)
	public void logoutSBI() {
		System.out.println("Logout from SBI");
	}

	@BeforeMethod(alwaysRun=true)
	public void clickLoanLink() {
		System.out.println("Click Loan Link");
	}

	@AfterMethod(alwaysRun=true)
	public void clickBack() {
		System.out.println("Click back button");
	}

	@Test(groups= {"smokeTest"},dataProvider="loanDetails")
	public void loan1SBI(String loanPeriod,String emiAmount) {
		System.out.println("Loan SBI 1");
		System.out.println("Loan Period " + loanPeriod);
		System.out.println("EMI amount " + emiAmount);
		Assert.assertTrue(true, "Loan process is not completed");
	}

	@Test(dependsOnMethods="loan1SBI")
	public void loan2SBI() {
		System.out.println("Loan SBI 2");
		Assert.assertTrue(true, "Loan process is not completed");
	}


	@DataProvider
	public static Object[][] loanDetails() {

		return new Object[][] { { "20 Years", "20K" }, { "30 Years", "15K" }};

	}

}
