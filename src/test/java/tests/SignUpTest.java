package tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SignUpPage;

public class SignUpTest extends BaseTest {
	SignUpPage Acc;

	@BeforeMethod
	public void setup() throws IOException {
		openBrowser();
		navigateToHomePage();
		Acc = new SignUpPage(driver);
	}

	@Test(priority = 0, groups = {"Homepage"})
	public void Signup() throws IOException {
		Acc.SignUp();
	}

	@Test(priority = 1)
	public void UpdateAddress() throws IOException {
		Acc.SignUp();
		Acc.UpdateAddress();
	}

	@AfterMethod
	public void tearDown() {
		quit();
	}
}
