package soni.Practice.base;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePageObject {

	WebDriver driver;
	WebDriverWait wait;

	protected BasePageObject(WebDriver driver) {
		this.driver = driver;
		wait=new WebDriverWait(driver,60);
	}

	public void typeOnElement(By locator, String value) {
		findElementSafelyByLocator(locator).sendKeys(value);
	}

	public void clickOnElement(By locator) {
		findElementSafelyByLocator(locator).click();
	}
	
	
	//////

	
	
	public String getTextOfElement(By locator) {
		return findElementSafelyByLocator(locator).getText();
	}

	public WebElement elementClickable (By locator) {

		//findElementSafelyByLocator(locator).click();
		
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	public WebElement elementVisible (By locator) {
		
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator)) ;  
	}

	public Boolean elementInvisible (By locator) {
		
		return wait.until(ExpectedConditions.invisibilityOfElementLocated(locator)) ;
	}
	
	
	public void selectValuesFromDropDown(By locator, String ByMethod, String Value) {
		WebElement delm = findElementSafelyByLocator(locator);
		Select s= new Select(delm);

		switch(ByMethod) {

		case "selectByIndex":
			s.selectByIndex(Integer.parseInt(Value));

		case "selectByValue":
			s.selectByValue(Value);

		case "selectByVisibleText":
			s.selectByVisibleText(Value);
		}
	}


	public WebElement findElementSafelyByLocator(By locator) {

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(120, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(StaleElementReferenceException.class, NoSuchElementException.class);

		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(locator);
			}
		});
		return foo;

	}

	public void frameSwitching(String frameName) {
		driver.switchTo().frame(frameName);
	}
}