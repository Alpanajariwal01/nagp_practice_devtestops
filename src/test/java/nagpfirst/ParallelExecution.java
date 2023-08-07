package nagpfirst;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.PropertyFileReader;

public class ParallelExecution {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {

		intializeBrowser(PropertyFileReader.getdata("browser"));
		openurl();
		login();
		teardown();
	}
	private static void login() {
		// TODO Auto-generated method stub
		
	}
	@BeforeTest
	public static void intializeBrowser(String browser) {
		switch (browser) {
		case "chrome":
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			driver = new ChromeDriver(options);
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
		}
	}

	@Test
	public static void openurl() throws IOException {
		driver.get(PropertyFileReader.getdata("URL"));

		System.out.println("URL is opened Successfulyy");
	}
	@Parameters({"author","searchKey"})
	@Test
	public void updateandsearch(String author ,String searchKey) throws IOException {
		WebElement searchText = driver.findElement(By.className("gLFyf"));
		searchText.sendKeys(searchKey);
		
		System.out.println("Welcome ->"+author+"Your search key is  ->"+searchKey);
		searchText.sendKeys(Keys.ENTER);
	}

	@AfterTest
	public static void teardown() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();// close single instance
		System.out.println("closed Successfully");
	}

}
