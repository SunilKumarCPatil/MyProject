package com.tikkle.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tikkle.Library.BaseLib;
import com.tikkle.Library.GenericLib;

import io.appium.java_client.android.AndroidDriver;

public class BuzzScreen 
{
	
	public BuzzScreen() 
	{
		PageFactory.initElements(BaseLib.driver, this);
	}
	//More Options
	@FindBy(xpath="//android.widget.ImageView[@content-desc='More options']")
	public WebElement MoreOption;
	/*	ScreenTitle
	 *	BackButton
	*/
	//ScreenTitle
	@FindBy(id="com.tikkle.myaccount.qa:id/toolbar_title")
	public WebElement ScreenTitle;
	
	//BackButton
	@FindBy(xpath="//android.widget.ImageButton")
	public WebElement BackButton;
	
	/*  Setting
	 *  UserName
	 *  UserDesignation
	 *  Basic Info
	 *  Interests
	 *  BlockedUsers
	 *  About Us
	 *  Privacy Policy
	 *  LogOut
	*/
	//Setting
	@FindBy(id="com.tikkle.myaccount.qa:id/title")
	public WebElement Settings;
	
	@FindBy(id="com.tikkle.myaccount.qa:id/user_name")
	public WebElement UserName;
	
	@FindBy(id="com.tikkle.myaccount.qa:id/user_designation")
	public WebElement UserDesignation;
	
	//Basic Info
	@FindBy(xpath="//android.widget.TextView[@text='Basic Info']")
	public WebElement BasicInfo;
			/* 	name_label
			 * 	designation_label
			 * 	dob_label
			 * 	user_dob
			*/
			//name_label
			@FindBy(id="com.tikkle.myaccount.qa:id/name_label")
			public WebElement NameLabel;
			//designation_label
			@FindBy(id="com.tikkle.myaccount.qa:id/designation_label")
			public WebElement DesignationLabel;
			//dob_label
			@FindBy(id="com.tikkle.myaccount.qa:id/dob_label")
			public WebElement DobLabel;
			//user_dob
			@FindBy(id="com.tikkle.myaccount.qa:id/user_dob")
			public WebElement UserDob;
			
			
			@FindBy(id="com.tikkle.myaccount.qa:id/edit_image")
			public WebElement EditImage;
			@FindBy(id="com.tikkle.myaccount.qa:id/user_image_thumbnail")
			public WebElement UserImageThumbnail;
			//ChooseFromGallery
			@FindBy(xpath="//android.widget.TextView[@text='Choose from Gallery']")
			public WebElement ChooseFromGallery;
			
			@FindBy(xpath="//android.widget.TextView[@text='Abc']")
			public WebElement FolderName;
			
			@FindBy(xpath="//android.view.ViewGroup[1]")
			public WebElement Picture;
			
			@FindBy(id="android:id/message")
			public WebElement ProfileUpdatedSuccessfully;
			
			@FindBy(id="android:id/button1")
			public WebElement Ok;
			//Take from Camera
			@FindBy(xpath="//android.widget.TextView[@text='Take from Camera']")
			public WebElement TakeFromCamera;
			
	
	@FindBy(xpath="//android.widget.TextView[@text='Interests']")
	public WebElement Interests;
	
	@FindBy(xpath="//android.widget.TextView[@text='Blocked Users']")
	public WebElement BlockedUsers;
	
	@FindBy(xpath="//android.widget.TextView[@text='About Us']")
	public WebElement AboutUs;
	
	@FindBy(xpath="//android.widget.TextView[@text='Privacy Policy']")
	public WebElement PrivacyPolicy;
	//logout button 
	@FindBy(id="com.tikkle.myaccount.qa:id/logout")
	public WebElement LogoutButton;
	//com.tikkle.myaccount.qa:id/toolbar_title
	

	//BuzzMenuItem
	@FindBy(id="com.tikkle.myaccount.qa:id/menuItem1")
	public WebElement BuzzMenuItem;
	
	/*public void verifyStatus(WebDriver driver, WebElement ele,String message,boolean status ){
		System.out.println("starts");
	boolean actual=ele.isEnabled();
	boolean excpected =status;
	GenericLib.VerifyUsingSoftAssertBoolen(actual, excpected);
	GenericLib.addSteps(message, "Is not enabled", "Is not enabled");
	System.out.println("ends");
}*/
}


