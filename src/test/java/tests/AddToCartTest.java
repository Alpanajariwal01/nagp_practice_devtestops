package tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.AddToCartPage;


public class AddToCartTest extends BaseTest{
	AddToCartPage Cart;
	
	@BeforeMethod
	public void setup() throws IOException {
		openBrowser();
		navigateToHomePage();
		sign();
		Cart = new AddToCartPage(driver);
	}
	
	@Test
	public void Addtocart() throws IOException{
		Cart.addtocart();		
	}
	
	@Test
	public void validateAddtocartmessage() throws IOException{
		Cart.addtocart();	
		Cart.validateAddtocartmessage();
	
	}
	
	@AfterMethod
	public void tearDown() {
		quit();
	}
}
