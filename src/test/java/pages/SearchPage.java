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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.BasePage;
import utils.PropertyFileReader;

public class SearchPage extends BasePage{
	WebDriver driver;
	
	@FindBy(xpath = "//input[@id='search']")
	WebElement SearchField;
	
	@FindBy(id = "sorter")
	WebElement Dropdown;
	
	@FindBy(id = "mode-list")
	WebElement ChangeMode;
	
	@FindBy(xpath = "//a[normalize-space()='Didi Sport Watch']")
	WebElement SelectWatch;
	
	@FindBy(xpath="//a[normalize-space()='Summit Watch']")
	WebElement selectwatch;
	
	@FindBy(xpath="//label[@id='Rating_4_label']")
	WebElement ratingstar;
	
	@FindBy(id="//input[@id='summary_field']")
	WebElement summary;
	
	@FindBy(xpath="//input[@id='nickname_field']")
	WebElement nickname;
	
	@FindBy(xpath="//textarea[@id='review_field']")
	WebElement putreview;
	 
	@FindBy(xpath = "//button[@title='Search']")
	WebElement clickSearchbtn;
	
	@FindBy(xpath = "//a[normalize-space()='Add Your Review']")
	WebElement Addreview;
	
	@FindBy(xpath="//span[normalize-space()='Submit Review']")
	WebElement submitbtn;
	
	public SearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Search() throws IOException {
		SearchField.click();
		SearchField.sendKeys(PropertyFileReader.getdata("ProductName"));
		//Select select = new Select(Dropdown);
		//select.selectByVisibleText(PropertyFileReader.getdata("Option"));
		clickSearchbtn.click();
		Dropdown.click();
		Dropdown.sendKeys("Price");
		ChangeMode.click();
		selectwatch.click();
		System.out.println("Watch Select successful");
		
	}
	
   public void AddReview() {
	   Addreview.click();
	   ratingstar.click();
	   nickname.sendKeys("Abhi");
	   summary.sendKeys("watch");
	   putreview.sendKeys("watch is awesome");
	   submitbtn.click();
	   System.out.println("Review added Successfully");
  }
}