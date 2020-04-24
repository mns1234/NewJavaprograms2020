package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;



public abstract class BaseTest {
	public WebDriver driver;
 
	@BeforeSuite
	public void beforeSuite() {
		/*
		 * System.setProperty(WebDriver.Chrome.driver,
		 * "C:\\Users\\mshah\\eclipse-workspace\\AutomationFramework\\Resources\\chromedriver.exe"
		 * );
		 */
		this.driver = new ChromeDriver();
	}

	@AfterSuite
	public void afterSuite() {
		driver.quit();
	}
}
