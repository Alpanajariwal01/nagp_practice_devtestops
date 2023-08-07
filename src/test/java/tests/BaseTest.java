package tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BasePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.PropertyFileReader;

public class BaseTest {
	public WebDriver driver;
	
	BasePage signin;
	
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public void navigateToHomePage() throws IOException {
		driver.get(PropertyFileReader.getdata("url"));
	}
   public void sign() {
		driver.findElement(By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]")).click();
		driver.findElement(By.id("email")).sendKeys("abhishakkhajuria728@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Abhi728#");
		driver.findElement(By.id("send2")).click();
		System.out.println("Login Succesfully");
   }
	public void quit() {
		driver.quit();
	}
}
