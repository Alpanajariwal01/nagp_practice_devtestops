package tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.CheckoutPage;

public class CheckoutTest extends BaseTest {
	CheckoutPage Cart;

	@BeforeMethod
	public void setup() throws IOException {
		openBrowser();
		navigateToHomePage();
		sign();
		Cart = new CheckoutPage(driver);
	}

	@Test
	public void CheckOut() throws IOException, InterruptedException {
		Cart.ShowingCart();
		Thread.sleep(20);
		Cart.Checkingout();
	}

	@AfterMethod
	public void tearDown() {
		quit();
	}
}
