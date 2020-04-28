package com.page;

import org.openqa.selenium.By;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.base.BasePage;
public class Loginpage extends BasePage{
	
	
	public Loginpage(WebDriver driver) {
		super(driver);
		
	}

	public String checkUserLogin() {
		     driver.findElement(By.id("login")).click();
			 driver.findElement(By.id("username")).sendKeys("ms.mrinalshah@gmail.com");
			 driver.findElement(By.id("password")).sendKeys("Sunflower1");
			 driver.findElement(By.id("login")).submit();
			 return driver.getTitle();
		

		}

	
}
