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
import org.openqa.selenium.Keys;

import base.BasePage;
import utils.PropertyFileReader;

public class CheckoutPage extends BasePage{
	WebDriver driver;
	
	@FindBy(xpath = "//a[@class='action showcart']")
	WebElement Showcart;
	
	@FindBy(xpath = "//*[@id=\"minicart-content-wrapper\"]/div[2]/div[5]/div/a/span")
	WebElement ViewAndEdit;
	
	@FindBy(xpath = "//button[@id='update-cart-item-106405']")
	WebElement UpdateQty;
	
	@FindBy(xpath = "//*[@id=\"top-cart-btn-checkout\"]")
	WebElement Checkout;
	
	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void ShowingCart() throws InterruptedException {
		Showcart.click();
		Thread.sleep(20);
}
	
	public void Checkingout() throws InterruptedException {
         Checkout.click();
		System.out.println("Checkout successful");
	}
}