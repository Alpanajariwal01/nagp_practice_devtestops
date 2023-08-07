package tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends BaseTest{
	LoginPage login;
	
	@BeforeMethod
	public void setup() throws IOException {
		openBrowser();
		navigateToHomePage();
		login = new LoginPage(driver);
	}
	
	@Test(priority = 0, groups = {"Homepage"})
	public void login() throws IOException{
		login.login();		
	}
	
	@Test(priority = 1, groups = {"Homepage"})
	public void signout() throws IOException{
		login.login();
		login.signout();		
	}
	
	
	@AfterMethod
	public void tearDown() {
		quit();
	}
}
