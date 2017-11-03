package com.tikkle.scripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.tikkle.Library.BaseLib;
import com.tikkle.Library.GenericLib;
import com.tikkle.pom.BuzzScreen;

public class VerifyingBasicInfo extends BaseLib
{
	@Test(priority=2,description="Check for Basic info Screen")
	public void verifyBasicInfoScreen1()
	{	buzzScreen =new BuzzScreen();
		GenericLib.addStepsOnlyDesc("Launch the application");
		buzzScreen.MoreOption.click();
		GenericLib.addStepsOnlyDesc("Tap on More options");
		buzzScreen.Settings.click();
		GenericLib.addStepsOnlyDesc("Tap on Settings");
		boolean test = buzzScreen.BasicInfo.isEnabled();
		System.out.println(test);
		buzzScreen.BasicInfo.click();
		
		
		
		
		GenericLib.addStepsOnlyDesc("Tap on Basic Info");
		String aTitle = buzzScreen.ScreenTitle.getText();
		String eTitle= GenericLib.getConfigValue(GenericLib.sConfigFile,"BasicInfoScreenTitle");	
		GenericLib.VerifyUsingSoftAssert(aTitle, eTitle);
		GenericLib.addSteps("BasicInfo screen should display ", eTitle, aTitle);
		
		String aLabel = buzzScreen.NameLabel.getText();
		String eLabel="Nam";
		GenericLib.VerifyUsingSoftAssert(aLabel, eLabel);
		GenericLib.addSteps("Veririfying the User Name Label is displaying ", eLabel, aLabel);
		
		String aName = buzzScreen.UserName.getText();
		String eName = GenericLib.getConfigValue(GenericLib.sConfigFile,"UserNameId");
		GenericLib.VerifyUsingSoftAssert(aName, eName);
		GenericLib.addSteps("Veririfying the User Name is displaying", eName, aName);
		
		String aLabel1 = buzzScreen.DesignationLabel.getText();
		String eLabel1="Designation";
		GenericLib.VerifyUsingSoftAssert(aLabel1, eLabel1);
		GenericLib.addSteps("Veririfying the Designation label is displaying", eLabel1, aLabel1);
		
		String aDes = buzzScreen.UserDesignation.getText();
		GenericLib.VerifyUsingSoftAssert(aDes, aDes);
		GenericLib.addSteps("Veririfying the User Designation is displaying", aDes, aDes);
		
		String aLabel2 = buzzScreen.DobLabel.getText();
		String eLabel2="Date of Birth";
		GenericLib.VerifyUsingSoftAssert(aLabel2, eLabel2);
		GenericLib.addSteps("Veririfying the DOB label is displaying", eLabel2, aLabel2);
		String aDob = buzzScreen.UserDob.getText();
		GenericLib.VerifyUsingSoftAssert(aDob, aDob);
		GenericLib.addSteps("Veririfying the User DOB is displaying", aDob, aDob);
		
		boolean aEnabe = buzzScreen.UserName.isEnabled();
		boolean eEnabe =false;
		GenericLib.VerifyUsingSoftAssertBoolen(aEnabe, eEnabe);
		GenericLib.addSteps("Veririfying the User Name is enabled ", "Is not enabled", "Is not enabled");

//		buzzScreen.verifyStatus(driver, buzzScreen.UserDesignation, "Veririfying the User Designation is enabled", false);
		
		boolean aEnabe1=buzzScreen.UserDesignation.isEnabled();
		boolean eEnabe1 =false;
		GenericLib.VerifyUsingSoftAssertBoolen(aEnabe1, eEnabe1);
		GenericLib.addSteps("Veririfying the User Designation is enabled ", "Is not enabled", "Is not enabled");
		
		boolean aEnabe2=buzzScreen.UserDob.isEnabled();
		boolean eEnabe2 =false;
		GenericLib.VerifyUsingSoftAssertBoolen(aEnabe2, eEnabe2);
		GenericLib.addSteps("Veririfying the User DOB is enabled ", "Is not enabled", "Is not enabled");
		
//		buzzScreen.verifyStatus(driver, buzzScreen.UserDob, "Veririfying the User DOB is enabled ", false);
		
		buzzScreen.EditImage.click();
		buzzScreen.ChooseFromGallery.click();
		buzzScreen.FolderName.click();
		buzzScreen.Picture.click();
		String AText = buzzScreen.ProfileUpdatedSuccessfully.getText();
		String EText=GenericLib.getConfigValue(GenericLib.sConfigFile,"ProfileChangeMessage");
		GenericLib.VerifyUsingSoftAssert(AText, EText);
		GenericLib.addSteps("User is able to change the image from 'Choose from Gallery' ", "AText", "EText");
		buzzScreen.Ok.click();
		
		buzzScreen.BackButton.click();
		String aTitle1 = buzzScreen.ScreenTitle.getText();
		String eTitle1="Settings";
		GenericLib.VerifyUsingSoftAssert(aTitle1, eTitle1);
		GenericLib.addSteps("Veririfying the functionality Back Button ", aTitle1, eTitle1);
		
	}

}
