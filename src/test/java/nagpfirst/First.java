package nagpfirst;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import utils.PropertyFileReader;

public class First {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {

		intializeBrowser(PropertyFileReader.getdata("browser"));
		openurl();
		login();
		teardown();
	}
   
	public static void intializeBrowser(String browser) {
		switch(browser){
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
  
	public static void openurl() throws IOException {
		driver.get(PropertyFileReader.getdata("url"));

		System.out.println("URL is opened Successfulyy");
	}
	
	//@Parameters({"author","searchkey"})
	//@Test(priority = 0)
	 // public static void Search(String author ,String searchkey) {
		//driver.findElement(By.name("q")).sendKeys(searchkey);
		//System.out.println("welcome"+author+"Your Search key is"+searchkey);
		//driver.findElement(By.id(searchkey)).sendKeys(Keys.ENTER);
	//}
	
	public static void login() throws IOException {
		driver.findElement(By.id("username")).sendKeys(PropertyFileReader.getdata("username"));
		driver.findElement(By.id("password")).sendKeys(PropertyFileReader.getdata("password"));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));//Implicit wait 
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(200));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated((By.id("submit"))));
		driver.findElement(By.id("submit")).click();
		System.out.println("Login Successfully");
	}
    
	public static void teardown() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();// close single instance
		System.out.println("closed Successfully");
	}
	}

