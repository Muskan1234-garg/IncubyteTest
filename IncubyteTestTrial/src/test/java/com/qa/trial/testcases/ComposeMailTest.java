package com.qa.trial.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.trial.base.TestBase;
import com.qa.trial.pages.ComposeMail;
import com.qa.trial.pages.SignInPage;

public class ComposeMailTest extends TestBase{

	
	SignInPage sPage;
	ComposeMail cmPage;
	
	
	public ComposeMailTest()
	{
		super();
	}
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		Initialization();
		sPage=new SignInPage();
		sPage.signIn();
		cmPage=new ComposeMail();
		cmPage.composeMail();
	}
	
	
	@Test()
	public void verifyMsgSent()
	{
		boolean b=cmPage.msgSent();
		Assert.assertEquals(b, true,"Message has been sent successfully");
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
