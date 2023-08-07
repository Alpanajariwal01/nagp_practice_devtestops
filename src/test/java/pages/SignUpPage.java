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

public class SignUpPage extends BasePage {

	WebDriver driver;
	@FindBy(xpath = "//div[@class='panel header']//a[contains(text(),'Create an Account')]")
	WebElement createaccbtn;

	@FindBy(id = "firstname")
	WebElement FirstName;

	@FindBy(id = "lastname")
	WebElement LastName;

	@FindBy(id = "email_address")
	WebElement Email;

	@FindBy(id = "password")
	WebElement Password;
	
	@FindBy(id = "password-confirmation")
	WebElement Passwordconf;

	@FindBy(xpath = "//strong[normalize-space()='Address Book']")
	WebElement Addressbookbtn;
	
	@FindBy(id = "company")
	WebElement CompanyName;
	
	@FindBy(id = "telephone")
	WebElement TelephoneNo;
	
	@FindBy(id = "city")
	WebElement CityName;
	
	@FindBy(id = "street_1")
	WebElement StreetName;
	
	@FindBy(id = "region_id")
	WebElement Region;
	
	@FindBy(id = "zip")
	WebElement ZipCode;
	
	@FindBy(id = "country")
	WebElement CountryName;
	
	@FindBy(xpath = "//button[@title='Save Address']")
	WebElement Savebtn;

	@FindBy(xpath ="//button[@title='Create an Account']//span[contains(text(),'Create an Account')]")
	WebElement Accountbtn;

	public SignUpPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
   }
	public void SignUp() throws IOException {
		createaccbtn.click();
		System.out.println("Acc button is open succesfully");
		FirstName.sendKeys(PropertyFileReader.getdata("FirstName"));
		LastName.sendKeys(PropertyFileReader.getdata("LastName"));
		Email.sendKeys(PropertyFileReader.getdata("email"));
		Password.sendKeys(PropertyFileReader.getdata("password"));
		Passwordconf.sendKeys(PropertyFileReader.getdata("password"));
		Accountbtn.click();
		System.out.println("SignUp successful");
	}
	public void UpdateAddress() throws IOException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//strong[normalize-space()='Address Book']")));
		Addressbookbtn.click();
		CompanyName.sendKeys(PropertyFileReader.getdata("CompanyName"));
		TelephoneNo.sendKeys(PropertyFileReader.getdata("TelephoneNo"));
		CityName.sendKeys(PropertyFileReader.getdata("CityName"));
		StreetName.sendKeys(PropertyFileReader.getdata("StreetName"));
		Region.sendKeys(PropertyFileReader.getdata("Region"));
		ZipCode.sendKeys(PropertyFileReader.getdata("ZipCode"));
		CountryName.sendKeys(PropertyFileReader.getdata("CountryName"));
		System.out.println("Address update Successfully");
	}
}
