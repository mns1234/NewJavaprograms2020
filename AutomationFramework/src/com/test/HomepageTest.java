package com.test;

import org.testng.annotations.Test;

import com.base.BaseTest;
import com.page.Homepage;

public class HomepageTest extends BaseTest {
	
	Homepage hp;
	
	public void beforeClass() {
		hp= new Homepage(driver);
	}

	@Test
	public void testsocialLinks() {
		
	}
	@Test
	public void testloginLink() {
		
	}
}
