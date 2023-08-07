package tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SearchPage;

public class SearchTest extends BaseTest{
	SearchPage search;
	
	@BeforeMethod
	public void setup() throws IOException {
		openBrowser();
		navigateToHomePage();
		sign();
		search = new SearchPage(driver);
	}
	
	@Test(priority = 0)
	public void search() throws IOException{
		search.Search();	
		
	}
	
	@Test(priority = 1)
	public void review() throws IOException{
		search.Search();
		search.AddReview();	
	}
	
	
	@AfterMethod
	public void tearDown() {
		quit();
	}
}
