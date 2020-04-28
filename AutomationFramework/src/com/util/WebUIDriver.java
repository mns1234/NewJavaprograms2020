package com.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebUIDriver {


	public static WebDriver getDriver(ConfigUtils config) {
		WebDriver driver=null;
		
		switch(config.BROWSER.toLowerCase()) {
		case "firefox":
			driver= new FirefoxDriver();
			break;
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\niles\\git\\NewJavaprograms2020\\AutomationFramework\\Resources\\chromedriver.exe");
			driver= new ChromeDriver();
			break;
		case "ie":
			driver= new InternetExplorerDriver();
			break;
		case "htmlunit":
			driver= new HtmlUnitDriver();
			break;
			default:
				driver= new FirefoxDriver();
			driver.get(config.URL);			
		
		}

		return driver;
	}
}
