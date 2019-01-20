package soni.TestScenario;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import soni.Practice.base.BrowserFactory;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=BrowserFactory.initializeBrowser("Chrome", "http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		
		// simple alert
		
		driver.findElement(By.xpath("//button[text()='Simple Alert']")).click();
		
		String alertMsg=driver.switchTo().alert().getText();
		System.out.println(alertMsg);
		driver.switchTo().alert().accept();
		
		Thread.sleep(10000);
		
		//  confirmation popups
		
		driver.findElement(By.xpath("//button[text()='Confirm Pop up']")).click();
		
		String alertMsg1=driver.switchTo().alert().getText();
		System.out.println(alertMsg1);
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(10000);
		
		//prompt popups
		
		
		driver.findElement(By.xpath("//button[text()='Prompt Pop up']")).click();
		
		Alert promptAlert  = driver.switchTo().alert();
		String alertText = promptAlert.getText();
		System.out.println("Alert text is " + alertText);
		//Send some text to the alert
		promptAlert.sendKeys("No");
		Thread.sleep(4000); //This sleep is not necessary, just for demonstration
		//promptAlert .accept();

	}

}
