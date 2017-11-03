package com.tikkle.scripts;

import org.testng.annotations.Test;

import com.kirwa.nxgreport.NXGReports;
import com.tikkle.Library.BaseLib;
import com.tikkle.Library.GenericLib;
import com.tikkle.pom.BuzzScreen;
import com.tikkle.pom.LoginScreen;

public class VerifyingLogout extends BaseLib
{
	@Test(priority=5)
	public void VerifySucessfullLogout() throws InterruptedException
	{
		
		buzzScreen=new BuzzScreen();
		loginScreen=new LoginScreen(driver);
		//buzzScreen.BuzzMenuItem().click();
		buzzScreen.MoreOption.click();
		String are = buzzScreen.Settings.getText();
		GenericLib.addSteps("Click on MoreOption", "Setting",are);
		buzzScreen.Settings.click();
		String aLogout = buzzScreen.LogoutButton.getText();
		GenericLib.addSteps("Click on Settings\nLogout Button should be present", "Logout",aLogout);
		GenericLib.SwipeDown(driver);
		buzzScreen.LogoutButton.click();
		String aSignin=loginScreen.WelcomeLabel().getText();
		GenericLib.addSteps("Click on Logout Button\n Login Screen should display That is Welcome subtitle should be present", "welcome",aSignin);

	}
}
