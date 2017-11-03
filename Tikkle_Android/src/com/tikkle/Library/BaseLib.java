package com.tikkle.Library;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.kirwa.nxgreport.NXGReports;
import com.kirwa.nxgreport.logging.LogAs;
import com.tikkle.pom.BuzzScreen;
import com.tikkle.pom.LoginScreen;
import com.tikkle.pom.OnboardScreens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseLib 
{
	{
	System.setProperty("KIRWA.reporter.config", "KIRWA.properties");
	}
	public OnboardScreens onboardScreens;
	public BuzzScreen buzzScreen;
	public LoginScreen loginScreen;
	public static  AndroidDriver driver;
	
	
	@BeforeSuite
	public void runAppiumServer()
	{
		AppiumDriverLocalService service = AppiumDriverLocalService
				.buildService(new AppiumServiceBuilder().usingDriverExecutable(new File("C:\\Program Files\\nodejs\\node.exe"))
				.withAppiumJS(new File("C:\\Program Files (x86)\\Appium\\node_modules\\appium\\bin\\appium.js"))
				.withLogFile(new File("./AppiumServerlog.txt")));
		service.start();
		
	
	}
	@BeforeMethod
	public void initialSetUp()
	{
		
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability("automationName","Appium");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion",GenericLib.getConfigValue(GenericLib.sConfigFile,"platformVersion"));
		capabilities.setCapability("deviceName",GenericLib.getConfigValue(GenericLib.sConfigFile,"deviceName"));
		capabilities.setCapability("appPackage",GenericLib.getConfigValue(GenericLib.sConfigFile,"appPackage"));
		capabilities.setCapability("appActivity",GenericLib.getConfigValue(GenericLib.sConfigFile,"appActivity"));
		try 
		{
			driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			NXGReports.addStep(" Launch the Application","-", "-", "-", LogAs.INFO,null);
		} 
		catch (MalformedURLException e) 
		{
			e.printStackTrace();
		}
	}
	@AfterMethod
	public void end() 
	{
	
			driver.quit();
	}

}
