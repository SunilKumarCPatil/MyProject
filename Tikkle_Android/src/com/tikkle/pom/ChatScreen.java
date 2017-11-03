package com.tikkle.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class ChatScreen 
{
	public AndroidDriver driver;
	public ChatScreen(AndroidDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	/* ScreenTitle
	 * Back Button
	 * SearchButton
	 * Search TextField
	 */
	//ScreenTitle
	@FindBy(xpath="//android.widget.TextView[1]")
	private WebElement screenTitle;
	public WebElement ScreenTitle()
	{
		return screenTitle;	
	}
	
	//Back Button
	@FindBy(xpath="//android.widget.ImageButton")
	private WebElement backButton;
	public WebElement BackButton()
	{
		return backButton;	
	}
	
	//SearchButton
	@FindBy(id="com.tikkle.myaccount.qa:id/ib_search_button")
	private WebElement searchButton;
	public WebElement SearchButton()
	{
		return searchButton;	
	}
	
	//Search TextField
	@FindBy(xpath="//android.widget.EditText[@resource-id='com.tikkle.myaccount.qa:id/et_search_bar']")
	private WebElement searchTextField;
	public WebElement SearchTextField()
	{
		return searchTextField;	
	}
	
	
	
	//Chat Menu Item 
	@FindBy(id="com.tikkle.myaccount.qa:id/menuItem2")
	private WebElement chatMenuItem;
	public WebElement ChatMenuItem()
	{
		return chatMenuItem;	
	}
	
	//MoreOption
	@FindBy(xpath="//android.widget.ImageView[@content-desc='More options']")
	private WebElement moreOption;
	public WebElement MoreOption()
	{
		return moreOption;	
	}
	
	//New Chat
	@FindBy(xpath="//android.widget.TextView[@text='New Chat']")
	private WebElement newChat;
	public WebElement NewChat()
	{
		return newChat;	
	}

	//List of User
	@FindBy(id="com.tikkle.myaccount.qa:id/tv_username")
	private List<WebElement> listOfUser;
	public List<WebElement> ListOfUser()
	{
		return listOfUser;	
	}
	
	//Message Text Editor 
	@FindBy(id="com.tikkle.myaccount.qa:id/message_edittext")
	private WebElement messageTextEditor ;
	public WebElement MessageTextEditor()
	{
		return messageTextEditor;	
	}
	
	//SendButtonMessage
	@FindBy(id="com.tikkle.myaccount.qa:id/ib_chat_send_button")
	private WebElement sendButtonMessage ;
	public WebElement SendButtonMessage()
	{
		return sendButtonMessage;	
	}
	//Select User
	@FindBy(id="com.tikkle.myaccount.qa:id/tv_username")
	private WebElement selectUser;
	public WebElement SelectUser()
	{
		return selectUser;	
	}
   
	//Smilies com.tikkle.myaccount.qa:id/ib_smile_panel_imagebutton
	@FindBy(id="com.tikkle.myaccount.qa:id/ib_smile_panel_imagebutton")
	private WebElement smilies ;
	public WebElement Smilies()
	{
		return smilies;	
	}
	//selectEmojiconIcon  com.tikkle.myaccount.qa:id/emojicon_icon
	@FindBy(id="com.tikkle.myaccount.qa:id/emojicon_icon")
	private List<WebElement> selectEmojiconIcon;
	public List<WebElement> SelectEmojiconIcon()
	{
		return selectEmojiconIcon;	
	}
	//Attachment button
	@FindBy(id="com.tikkle.myaccount.qa:id/ib_attach_file")
	private WebElement attachment;
	public WebElement Attachment()
	{
		return attachment;
	}
	
	
	//DocFile
	@FindBy(xpath="//android.widget.TextView[@resource-id='android:id/title' and @text='docDoc.doc']")
	private WebElement addDocFile;
	public WebElement DocFile()
	{
		if(Abc().isDisplayed())
		{
			Abc().click();
			return addDocFile;
		}
		return addDocFile;
	}
	
	//DocxFile
	@FindBy(xpath="//android.widget.TextView[@resource-id='android:id/title' and @text='docxDoc.docx']")
	private WebElement docxFile;
	public WebElement DocxFile()
	{
		if(Abc().isDisplayed())
		{
			Abc().click();
			return docxFile;
		}
		return docxFile;
	}
	//PdfFile
	@FindBy(xpath="//android.widget.TextView[@resource-id='android:id/title' and @text='pdfdoc.pdf']")
	private WebElement pdfFile;
	public WebElement PdfFile()
	{
		if(Abc().isDisplayed())
		{
			Abc().click();
			return pdfFile;
		}
		return pdfFile;
	}
	//pngFile
	@FindBy(xpath="//android.widget.TextView[@resource-id='android:id/title' and @text='241.png']")
	private WebElement pngFile;
	public WebElement PngFile()
	{
		if(Abc().isDisplayed())
		{
			Abc().click();
			return pngFile;
		}
		return pngFile;
	}
	
	//JpgFile
	@FindBy(xpath="//android.widget.TextView[@resource-id='android:id/title' and @text='jpgfile.jpg']")
	private WebElement jpgFile;
	public WebElement JpgFile()
	{
		if(Abc().isDisplayed())
		{
			Abc().click();
			return jpgFile;
		}
		return jpgFile;
	}
	//GroupIconPic
	@FindBy(xpath="//android.view.ViewGroup")
	private WebElement groupIconPic;
	public WebElement GroupIconPic()
	{
		if(Abc().isDisplayed())
		{
			Abc().click();
			return groupIconPic;
		}
		return groupIconPic;
	}
	
	
	//FoldeName//android.widget.TextView[@resource-id='android:id/title' and @text='Abc']
	@FindBy(xpath="//android.widget.TextView[@text='Abc']")
	private WebElement abc;
	public WebElement Abc()
	{
		return abc;
	}
	
	
	//Uploading
	@FindBy(xpath="//android.widget.TextView[@resource-id='com.tikkle.myaccount.qa:id/tv_progress_message' and @text='Uploading...']")
	private WebElement uploading;
	public WebElement Uploading()
	{
		return uploading;
	}
	
	
	/*
	 * 
	 * 
	*/
	//New Private group
	@FindBy(xpath="//android.widget.TextView[@text='New Private Group']")
	private WebElement newPrivateGroup;
	public WebElement NewPrivateGroup()
	{
		return newPrivateGroup;	
	}
	
	
	//Enter Group Name---> id-- com.tikkle.myaccount.qa:id/et_group_name
	@FindBy(id="com.tikkle.myaccount.qa:id/et_group_name")
	private WebElement enterGroupName;
	public WebElement EnterGroupName()
	{
		return enterGroupName;
	}
	
	//Next Button PrivateG-->id-- com.tikkle.myaccount.qa:id/bt_newgrp_next
	@FindBy(id="com.tikkle.myaccount.qa:id/bt_newgrp_next")
	private WebElement nextButtonPrivateG;
	public WebElement NextButtonPrivateG()
	{
		return nextButtonPrivateG;
	}
	
	//profile picture ---> id--com.tikkle.myaccount.qa:id/ci_group_icon
	@FindBy(id="com.tikkle.myaccount.qa:id/ci_group_icon")
	private WebElement profilePicturePrivateG;
	public WebElement ProfilePicturePrivateG()
	{
		return profilePicturePrivateG;
	}
	//Choose from Gallery---> xpath-- //android.widget.TextView[@text='Choose from Gallery']
	@FindBy(xpath="//android.widget.TextView[@text='Choose from Gallery']")
	private WebElement chooseFromGallery;
	public WebElement ChooseFromGallery()
	{
		
		return chooseFromGallery;
	}
	
	//Check box com.tikkle.myaccount.qa:id/iv_list_selector
	@FindBy(id="com.tikkle.myaccount.qa:id/iv_list_selector")
	private WebElement checkBox;
	public WebElement CheckBox()
	{
		
		return checkBox;
	}
	//Selected User id=com.tikkle.myaccount.qa:id/cv_selected_users
	@FindBy(id="com.tikkle.myaccount.qa:id/cv_selected_users")
	private List<WebElement> selectedUser;
	public List<WebElement> SelectedUser()
	{
		
		return selectedUser;
	}
	//Done Button com.tikkle.myaccount.qa:id/rl_button_done
	@FindBy(id="com.tikkle.myaccount.qa:id/rl_button_done")
	private WebElement doneButton;
	public WebElement DoneButton()
	{
		
		return doneButton;
	}
	//New Public group
	@FindBy(xpath="//android.widget.TextView[@text='New Public Group']")
	private WebElement newPublicGroup;
	public WebElement NewPublicGroup()
	{
		return newPublicGroup;	
	}
	
	
	
	
	
	
	
	
	
	

}
