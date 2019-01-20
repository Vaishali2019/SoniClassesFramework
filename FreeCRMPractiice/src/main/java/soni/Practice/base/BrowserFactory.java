package soni.Practice.base;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserFactory {

	static String rootFolder = System.getProperty("user.dir");
	
	/*String projectFolder=System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver", projectFolder+"/Drivers/chromedriver.exe");*/
	
	static WebDriver driver;

	public static WebDriver initializeBrowser(String browserType, String appURL) {

		if (browserType.equalsIgnoreCase("Chrome")) {
			
			Map<String, Object> prefs = new HashMap<String,Object>();
			prefs.put("profile.defkault_content_setting_values.notifications", 2);
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);
			
			System.setProperty("webdriver.chrome.driver", rootFolder + "/Drivers/chromedriver.exe");
			driver = new ChromeDriver(options);
			driver.get(appURL);
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		}

		else if (browserType.equalsIgnoreCase("FireFox")) {

		}

		else if (browserType.equalsIgnoreCase("IE")) {

		}

		return driver;
	}
}