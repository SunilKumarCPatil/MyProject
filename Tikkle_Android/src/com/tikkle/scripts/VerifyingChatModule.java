package com.tikkle.scripts;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.tikkle.Library.BaseLib;
import com.tikkle.Library.GenericLib;
import com.tikkle.pom.ChatScreen;

public class VerifyingChatModule extends BaseLib
{
	ChatScreen chatscreen;
	@Test(priority=3,description="Verifying the Chat Module")
	public void TestChatModule() throws InterruptedException
	{
		chatscreen=new ChatScreen(driver);
		Thread.sleep(5000);
		GenericLib.addSteps("Launch the Application","" , "");
		chatscreen.ChatMenuItem().click();
		chatscreen.MoreOption().click();
		String ANewChatText = chatscreen.NewChat().getText();
		String ENewChatText="New Chat";
		GenericLib.VerifyUsingAssert(ANewChatText, ENewChatText);
		GenericLib.addSteps("Tap On Chats Module", "Should Navigate to Chat screen-Verify", "New Chat\n New Private group\n New Public group");
	}
	@Test(priority=4,description="Verifying User can send a text message to Other User")
	public void NewChat() throws InterruptedException
	{
		chatscreen=new ChatScreen(driver);
		GenericLib.addSteps("Launch the Application","" , "");
		chatscreen.ChatMenuItem().click();
		GenericLib.addSteps("Tap On Chat Module","" , "");
		chatscreen.MoreOption().click();
		GenericLib.addSteps("Tap on More Options", "", "");
		chatscreen.NewChat().click();
		String AscreenTitle = chatscreen.ScreenTitle().getText();
		String EscreenTitle="New Chat";
		GenericLib.VerifyUsingAssert(AscreenTitle, EscreenTitle);
		GenericLib.addSteps("Tap on Chat", AscreenTitle, EscreenTitle);
		chatscreen.SearchButton().click();
		String ASearchText = chatscreen.SearchTextField().getText();
		String ESearchText="Search";
		GenericLib.VerifyUsingAssert(ASearchText, ESearchText);
		GenericLib.addSteps("Tap on Search Icon",ASearchText,ESearchText );
		chatscreen.SearchTextField().sendKeys("Android User 1");
		Thread.sleep(5000);
		GenericLib.addSteps("Enter User Name", "Android User 1", "Android User 1");
		chatscreen.SelectUser().click();
		String aUser = chatscreen.ScreenTitle().getText();
		String eUser="Android User 1";
		GenericLib.VerifyUsingAssert(aUser, eUser);
		GenericLib.addSteps("Tap on User", aUser, eUser);
		chatscreen.MessageTextEditor().sendKeys("Automation testing using Appium");
		GenericLib.addSteps("Enter a text", "Automation testing using Appium", "Automation testing using Appium");
		chatscreen.SendButtonMessage().click();
		GenericLib.addSteps("Tap on Send Button", "", "");
		
	}
	
	
	
}


