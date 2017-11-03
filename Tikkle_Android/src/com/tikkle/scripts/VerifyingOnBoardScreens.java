package com.tikkle.scripts;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.kirwa.nxgreport.NXGReports;
import com.kirwa.nxgreport.logging.LogAs;
import com.kirwa.nxgreport.selenium.reports.CaptureScreen;
import com.sun.corba.se.impl.protocol.AddressingDispositionException;
import com.tikkle.Library.BaseLib;
import com.tikkle.Library.GenericLib;
import com.tikkle.pom.OnboardScreens;

public class VerifyingOnBoardScreens extends BaseLib
{
	@Test(priority=1)
	public void VerifyOnboardScreen()
	{
		onboardScreens=new OnboardScreens(driver);
		try{
		//*************Buzz****************
		String aBuzzTitle = onboardScreens.Title().getText();
		/*String eBuzzTitle="Buzz"; */
		assertEquals(aBuzzTitle,GenericLib.getConfigValue(GenericLib.sConfigFile,"eBuzzTitle"));
		
		
		GenericLib.addSteps("Verified BuzzTitle", GenericLib.getConfigValue(GenericLib.sConfigFile,"eBuzzTitle"), aBuzzTitle);
		String aBuzzDesc = onboardScreens.Description().getText();
		/*String eBuzzDesc="Stay Updated! The news feed style.\nStart discussions.\nThen and There.";*/
		assertEquals(aBuzzDesc, GenericLib.getConfigValue(GenericLib.sConfigFile,"eBuzzDesc"));
		GenericLib.addSteps("Verified Buzz Description", GenericLib.getConfigValue(GenericLib.sConfigFile,"eBuzzDesc"), aBuzzDesc);
		boolean aBuzzNext = onboardScreens.Next().isDisplayed();
		assertEquals(aBuzzNext, true);
		GenericLib.addSteps("Verified Buzz Next Button", "True", "True");

		boolean aBuzzSkip = onboardScreens.Skip().isDisplayed();
		assertEquals(aBuzzSkip, true);
		GenericLib.addSteps("Verified Buzz Skip Button", "true", "true");
		
		onboardScreens.Next().click();
		GenericLib.addSteps("Click On Next Button", "-", "-");
		//*************Chat****************
		String aChatTitle = onboardScreens.Title().getText();
		assertEquals(aChatTitle, GenericLib.getConfigValue(GenericLib.sConfigFile,"eChatTitle" ));
		GenericLib.addSteps("Verified Chat Title", GenericLib.getConfigValue(GenericLib.sConfigFile,"eChatTitle" ), aChatTitle);
		
		String aChatDesc = onboardScreens.Description().getText();
		assertEquals(aChatDesc,GenericLib.getConfigValue(GenericLib.sConfigFile,"eChatDesc"));
		GenericLib.addSteps("Verified Chat Description", GenericLib.getConfigValue(GenericLib.sConfigFile,"eChatDesc" ), aChatDesc);
		
		boolean aChatNext = onboardScreens.Next().isDisplayed();
		assertEquals(aChatNext, true);
		GenericLib.addSteps("Verified Chat Next Button", "True", "True");

		boolean aChatSkip = onboardScreens.Skip().isDisplayed();
		assertEquals(aChatSkip, true);
		GenericLib.addSteps("Verified Chat Skip Button", "true", "true");
		
		//*************iCan****************
		onboardScreens.Next().click();
		GenericLib.addSteps("Click On Next Button", "-", "-");
		
		String aiCanTitle = onboardScreens.Title().getText();
		assertEquals(aiCanTitle, GenericLib.getConfigValue(GenericLib.sConfigFile,"eiCanTitle" ));
		GenericLib.addSteps("Verified iCan Title", GenericLib.getConfigValue(GenericLib.sConfigFile,"eChatTitle" ), aiCanTitle);
		
		String aiCanDesc = onboardScreens.Description().getText();
		assertEquals(aiCanDesc,GenericLib.getConfigValue(GenericLib.sConfigFile,"eiCanDesc"));
		GenericLib.addSteps("Verified iCan Description", GenericLib.getConfigValue(GenericLib.sConfigFile,"eiCanDesc" ), aiCanDesc);
		
		boolean aiCanNext = onboardScreens.Next().isDisplayed();
		assertEquals(aiCanNext, true);
		GenericLib.addSteps("Verified iCan Next Button", "True", "True");

		boolean aiCanSkip = onboardScreens.Skip().isDisplayed();
		assertEquals(aiCanSkip, true);
		GenericLib.addSteps("Verified iCan Skip Button", "true", "true");
		
		onboardScreens.Next().click();
		GenericLib.addSteps("Click On Next Button", "-", "-");
		
		
		}
		catch (Exception e) 
		{
			e.getLocalizedMessage();
			NXGReports.addStep(e.getLocalizedMessage(), LogAs.FAILED,null);
		}

	
	}
	
	
}
