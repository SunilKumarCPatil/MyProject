package com.tikkle.pom;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class OnboardScreens 
{
	public AndroidDriver driver;
	public OnboardScreens(AndroidDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//android.widget.TextView[@resource-id='com.tikkle.myaccount.qa:id/title_text']")
	private WebElement title;
	public WebElement Title()
	{
		return title;	
	}
	@FindBy(xpath="//android.widget.TextView[@resource-id='com.tikkle.myaccount.qa:id/message_text']")
	private WebElement descrip;
	public WebElement Description()
	{
		return descrip;	
	}
	@FindBy(xpath="//android.widget.Button[@resource-id='com.tikkle.myaccount.qa:id/skip_previous']")
	private WebElement skip;
	public WebElement Skip()
	{
		return skip;	
	}
	@FindBy(xpath="//android.widget.Button[@resource-id='com.tikkle.myaccount.qa:id/next']")
	private WebElement next;
	public WebElement Next()
	{
		return next;	
	}
	
	

}
