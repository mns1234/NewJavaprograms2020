package com.test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

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
		assertEquals(hp.getsociallinks(),6);
	}
	@Test
	public void testloginLink() {
		assertEquals(hp.login(), "http://whiteboxqa.com/");
	}

	@Test
	public void testSlider() {

		assertTrue(hp.IsSliderpresent());

	}
}