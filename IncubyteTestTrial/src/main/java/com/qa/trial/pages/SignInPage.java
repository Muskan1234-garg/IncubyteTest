package com.qa.trial.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.qa.trial.base.TestBase;

public class SignInPage extends TestBase{
	
	WebElement emailId;
	WebElement submitBtn;
	WebElement password;
	WebElement logo;
	WebElement moreApp;
	WebElement gmailOpen;
	
	
	public void signIn() throws InterruptedException
	{
		emailId=driver.findElement(By.id("identifierId"));
		emailId.sendKeys(prop.getProperty("email"));
		submitBtn=driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
		submitBtn.click();
		Thread.sleep(4000);
		password=driver.findElement(By.name("password"));
		password.sendKeys(prop.getProperty("password"));
		Thread.sleep(4000);
		submitBtn=driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
		submitBtn.click();	
		Thread.sleep(10000);
		moreApp=driver.findElement(By.xpath("//a[@aria-label='Google apps']"));
		moreApp.click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@role='presentation']")));
		gmailOpen=driver.findElement(By.xpath("//span[contains(text(),'Gmail')]"));
		gmailOpen.click();
		Thread.sleep(15000);
		
		String winHandleBefore = driver.getWindowHandle();

		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		
	}
	
	
	
	public boolean verifyPageLogo()
	{
		logo=driver.findElement(By.xpath(".//a[@class='gb_ee gb_pc gb_ce']"));
		return logo.isDisplayed();
	}

}
