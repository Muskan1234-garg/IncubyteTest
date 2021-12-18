package com.qa.trial.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.trial.base.TestBase;
import com.qa.trial.pages.SignInPage;

public class SignInPageTest extends TestBase{
	
	

	SignInPage sPage;

	public SignInPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		Initialization();
		sPage=new SignInPage();
		sPage.signIn();
	}
	
	@Test
	public void verifyLogoAfterSignIn() throws InterruptedException
	{
		
		boolean b=sPage.verifyPageLogo();
		Assert.assertEquals(b, true);
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
