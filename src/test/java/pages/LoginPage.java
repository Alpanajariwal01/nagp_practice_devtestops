package pages;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.BasePage;
import utils.PropertyFileReader;

public class LoginPage extends BasePage{
	WebDriver driver;
	
	@FindBy(xpath = "//div[@class='panel header']//a[contains(text(),'Sign In')]")
	WebElement loginbtn;
	
	@FindBy(id = "email")
	WebElement usernameField;
	
	@FindBy(id = "pass")
	WebElement passwordField;
	
	@FindBy(id = "send2")
	WebElement submitBtn;
	
	@FindBy(className = "post-title")
	WebElement loggedInMessage;
	
	@FindBy(xpath="//div[@class='panel header']//button[@type='button']")
	WebElement dropdown;
	
	@FindBy(xpath="//div[@aria-hidden='false']//a[normalize-space()='Sign Out']")
	WebElement signoutbtn;
	
	@FindBy(xpath = "//div[@class = 'post-content']//strong")
	WebElement loggedInSubMessage;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Login into application
	public void login() throws IOException {
		loginbtn.click();
		usernameField.sendKeys(PropertyFileReader.getdata("email"));
		passwordField.sendKeys(PropertyFileReader.getdata("password"));
		submitBtn.click();
		System.out.println("Login successful");
	}
	public void signout() {
		dropdown.click();
		signoutbtn.click();
		System.out.println("Signout successfully");
	}
}