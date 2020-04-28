package com.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.BaseTest;
import com.page.Loginpage;

public class LoginpageTest extends BaseTest{
private Loginpage lp;
@BeforeClass
public void beforeClass()
{
	lp=new Loginpage(driver);
}
@Test
public void testuserlogin() {
	assertEquals(lp.checkUserLogin(), "QA/QE/SDET Training.");
}
}
