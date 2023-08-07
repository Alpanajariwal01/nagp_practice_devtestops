package base;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utils.PropertyFileReader;

public class BasePage {
	public static WebDriver driver;
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
	public void openurl() throws IOException {
		driver.get(PropertyFileReader.getdata("url"));

		System.out.println("URL is opened Successfulyy");
	}
	
	public void loginintoapplication() {
		driver.findElement(By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]")).click();
		driver.findElement(By.id("email")).sendKeys("abhishakkhajuria728@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Abhi728#");
		driver.findElement(By.id("send2")).click();
		System.out.println("Login Succesfully");
	}
}
