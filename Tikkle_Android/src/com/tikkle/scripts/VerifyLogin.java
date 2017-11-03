package com.tikkle.scripts;

import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;

import com.kirwa.nxgreport.NXGReports;
import com.kirwa.nxgreport.logging.LogAs;
import com.tikkle.Library.BaseLib;
import com.tikkle.Library.GenericLib;
import com.tikkle.pom.BuzzScreen;
import com.tikkle.pom.LoginScreen;
import com.tikkle.pom.OnboardScreens;

public class VerifyLogin extends BaseLib
{
	
	@Test(priority=2)
	public void VerifyLoginScreen() throws InterruptedException
	{
		loginScreen=new LoginScreen(driver);
		buzzScreen=new BuzzScreen();
		onboardScreens=new OnboardScreens(driver);
		if(onboardScreens.Skip().isDisplayed())
		{
			onboardScreens.Skip().click();
		}
		
		loginScreen.EmailTextField().sendKeys("cbtcrowd2000+52@gmail.com");
		NXGReports.addStep("Enter the Username", "cbtcrowd2000+52@gmail.com", LogAs.PASSED, null);
		loginScreen.PasswordTextField().sendKeys("654321");
		NXGReports.addStep("Enter the Password", "654321", LogAs.PASSED, null);
		loginScreen.SiginButton().click();
		Thread.sleep(5000);
		buzzScreen.MoreOption.click();
		String aSetting = buzzScreen.Settings.getText();
		GenericLib.addSteps("Tap on Sigin Button ", "Buzz screen should display that is settings", aSetting);
		
	
	 }
}
