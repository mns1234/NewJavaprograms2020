package com.base;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {
	public WebDriver driver;

//creating the dependency by passing the object thro' constructor
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
}
