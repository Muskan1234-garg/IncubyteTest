package com.qa.trial.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.trial.base.TestBase;

public class ComposeMail extends TestBase {
	
	WebElement composeBtn;
	WebElement sender;	
	WebElement subject;	
	WebElement sendBtn;
	WebElement verifyMsg;
	WebElement body;
	
	public void composeMail() throws InterruptedException
	{
		composeBtn=driver.findElement(By.xpath("//div[@class='T-I T-I-KE L3']"));
		composeBtn.click();
		sender=driver.findElement(By.name("to"));
		sender.sendKeys(prop.getProperty("to"));
		subject=driver.findElement(By.name("subjectbox"));
		subject.sendKeys(prop.getProperty("subject"));
		body=driver.findElement(By.xpath(".//div[@class='Am Al editable LW-avf tS-tW']"));
		body.sendKeys(prop.getProperty("body"));
		sendBtn=driver.findElement(By.xpath(".//div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']"));
		Thread.sleep(3000);
		sendBtn.click();
		Thread.sleep(5000);
	}

	
	public boolean msgSent()
	{
		verifyMsg=driver.findElement(By.xpath("//span[contains(text(),'Message sent')]"));
		return verifyMsg.isDisplayed();
		
	}
}
