package com.tikkle.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class LoginScreen 
{
	public AndroidDriver driver;
	public LoginScreen(AndroidDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	// *****brand_logo*******
	@FindBy(id="brand_logo")
	private WebElement brand_logo;
	public WebElement BrandLogo()
	{
		return brand_logo;	
	}
	//welcome_label  //android.widget.TextView[@resource-id='com.tikkle.myaccount.qa:id/welcome_label' and @text='Welcome']
	@FindBy(xpath="//android.widget.TextView[@text='Welcome']")
	private WebElement welcome_label;
	public WebElement WelcomeLabel()
	{
		return welcome_label;	
	}
	//EmailTest Field
	@FindBy(xpath="//android.widget.EditText[@resource-id='com.tikkle.myaccount.qa:id/user_email']")
	private WebElement emailTextField;
	public WebElement EmailTextField()
	{
		return emailTextField;	
	}
	//PasswordTextField
	@FindBy(xpath="//android.widget.EditText[@resource-id='com.tikkle.myaccount.qa:id/user_password']")
	private WebElement passwordTextField;
	public WebElement PasswordTextField()
	{
		return passwordTextField;
	}
	
	//SiginButton 
	@FindBy(xpath="//android.widget.Button[@resource-id='com.tikkle.myaccount.qa:id/login_button' and @text='Sign In']")
	private WebElement siginButton;
	public WebElement SiginButton()
	{
		return siginButton;
	}
	
	//forgot_password
	@FindBy(id="forgot_password")
	private WebElement forgotPassword;
	public WebElement ForgotPassword()
	{
		return forgotPassword;
	}
	
	//*************forget password screen**************
	//brandlogo
	
	//welcome_label //Forgot Password?
	@FindBy(xpath="//android.widget.TextView[@resource-id='com.tikkle.myaccount.qa:id/instructions']")
	private WebElement welcome_Label_Forgot_PasswordScreen;
	public WebElement Welcome_Label_Forgot_PasswordScreen()
	{
		return welcome_Label_Forgot_PasswordScreen;	
	}
	
	//Please enter your email below to receive your password reset instructions

	@FindBy(xpath="//android.widget.TextView[@resource-id='com.tikkle.myaccount.qa:id/welcome_label']")
	private WebElement instructions_Forgot_PasswordScreen;
	public WebElement Instructions_Forgot_PasswordScreen()
	{
		return instructions_Forgot_PasswordScreen;	
	}
	
	//Send Now button
	@FindBy(xpath="//android.widget.Button[@resource-id='com.tikkle.myaccount.qa:id/forgot_password_button']")
	private WebElement sendNowButton;
	public WebElement SendNowButton()
	{
		return sendNowButton;	
	}
	//Invalid email! Error message
	@FindBy(xpath="//android.widget.TextView[@resource-id='com.tikkle.myaccount.qa:id/error_view']")
	private WebElement invalidEmailErrMess;
	public WebElement InvalidEmailErrMess()
	{
		return invalidEmailErrMess;	
	}
	
	//**********Reset Password screen*********
	
	
	
	

}
