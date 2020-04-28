package com.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.base.BasePage;

public class Homepage extends BasePage {
  String Slinks="/html/body/header/div[1]/div/ul/li/a/";
  String loginbtn= "loginButton";
	public Homepage(WebDriver driver) {
		super(driver);
	}

	/*
	 * public void open() { driver.get("http://whiteboxqa.com/");
	 * driver.manage().window().maximize(); }
	 */

	public int getsociallinks() {
		int count = 0;
		List<WebElement> sociallinks = driver.findElements(By.xpath(Slinks));
		if(sociallinks !=null)
		count = sociallinks.size();
		return count;

	}

	public String login() {
		driver.findElement(By.id(loginbtn)).click();
		String s= driver.getCurrentUrl();
		return s;

	}

	public boolean IsSliderpresent() {
		boolean isSliderPresent = driver.findElements(By.xpath("/html//div[@id='promo-slider']")).isEmpty() ? false: true;
		return isSliderPresent;

	}
}
