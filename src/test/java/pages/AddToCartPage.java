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

public class AddToCartPage extends BasePage {

	WebDriver driver;
	@FindBy(xpath = "//span[normalize-space()='Women']")
	WebElement Womensection;

	@FindBy(xpath = "//a[contains(text(),'Tops')]")
	WebElement womenTops;

	@FindBy(xpath = "//a[normalize-space()='Breathe-Easy Tank']")
	WebElement whiteTop;

	@FindBy(xpath = "//*[@id=\"option-label-size-143-item-168\"]")
	WebElement size;

	@FindBy(id = "option-label-color-93-item-57")
	WebElement color;

	@FindBy(xpath = "//span[normalize-space()='Add to Cart']")
	WebElement addtocartbtn;

	@FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
	WebElement addtocartmessage;

	public AddToCartPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void addtocart() {
		Womensection.click();
		womenTops.click();
		whiteTop.click();
		size.click();
		color.click();
		addtocartbtn.click();
		System.out.println("Add to cart successfully");
	}

	public void validateAddtocartmessage() throws IOException {
		// using explicitWait for the visibility of addtocartmessage post title element
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// Implicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")));

		// Taking a screenshot of addtocartmessage post title element
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("./AddedtoCart.jpg"));
		System.out.println("Screenshot captured");
		// TestNG Assertions
		Assert.assertEquals(addtocartmessage.getText(), "You added Breathe-Easy Tank to your shopping cart.");	
	}
}
