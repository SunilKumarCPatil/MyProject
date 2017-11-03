package com.tikkle.Library;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.asserts.SoftAssert;
import com.kirwa.nxgreport.NXGReports;
import com.kirwa.nxgreport.logging.LogAs;
import io.appium.java_client.android.AndroidDriver;

public class GenericLib 
{
	static public String sDirPath = System.getProperty("user.dir");
	public static String sConfigFile = sDirPath+"\\Config.properties";
	static ITestResult testResult;
	static DateFormat dateFormat;
	public static String MethodName = Thread.currentThread().getStackTrace()[1].getMethodName();
	public static String getConfigValue(String sFile, String sKey)
	{
		Properties prop=new Properties();
		String sValue=null;

		try 
		{
			InputStream input = new FileInputStream(sFile);
			prop.load(input);
			sValue=prop.getProperty(sKey);
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("eeeee");
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			System.out.println("aaaaa");
			e.printStackTrace();
		}
		return sValue;
	}
	
	public static void addSteps(String desc,String eValue,String aValue)
	{
		NXGReports.addStep(desc, eValue, aValue, LogAs.PASSED, null);
	}
	public static void addStepsOnlyDesc(String desc)
	{
		NXGReports.addStep(desc, "--", "--", LogAs.PASSED, null);
	}

	
	public static void swiping(AndroidDriver driver) throws InterruptedException 
	{
		 //Get the size of screen.
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		  
		  //Find swipe start and end point from screen's with and height.
		  //Find startx point which is at right side of screen.
		  int startx = (int) (size.width * 0.80);
		  //Find endx point which is at left side of screen.
		  int endx = (int) (size.width * 0.20);
		  //Find vertical point where you wants to swipe. It is in middle of screen height.
		  int starty = size.height / 2;
		  System.out.println("startx = " + startx + " ,endx = " + endx + " , starty = " + starty);

		  //Swipe from Right to Left.
		  driver.swipe(startx, starty, endx, starty, 3000);
		  Thread.sleep(2000);

	/*	  //Swipe from Left to Right.
		  driver.swipe(endx, starty, startx, starty, 3000);
		  Thread.sleep(2000);*/
		 }
	
	public static void SwipeDown(AndroidDriver driver) throws InterruptedException
	{
		Thread.sleep(2000);
		Dimension size = driver.manage().window().getSize();
		int starty = (int) (size.height * 0.80);
		int endy = (int) (size.height * 0.20);
		int startx = size.width / 2;
		driver.swipe(startx, starty, startx, endy, 3000);
		Thread.sleep(2000);
	}
	
	public static void SearchUser(List<WebElement> ListOfUser)
	{
		for(int i=0;i<ListOfUser.size();i++)
		{
			System.out.println(ListOfUser.get(0).getText());
			ListOfUser.get(0).click();
		}
	}
	
	public static void VerifyUsingAssert(String actual,String expected)
	{
		assertEquals(actual, expected);
	}
	
	public static void VerifyUsingSoftAssert(String actual,String expected)
	{
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(actual, expected);
		sa.assertAll();
	}

	public static void VerifyUsingSoftAssertBoolen(boolean actual, boolean expected) 
	{
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(actual, expected);
		sa.assertAll();
		
	}
	public static void CaptureScreenShot(AndroidDriver driver) throws IOException
	{
		//Setting a Folder Name
		String FolderName = "ScreenShots";
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//set date formate
		dateFormat=new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss_");
		//creating a folder
		new File(FolderName).mkdir();
		//setting screenshot name
		String FileName=dateFormat.format(new Date())+".png";
		//copy screenshot file into screenshot folder
		FileUtils.copyFile(file, new File(FolderName +"/"+FileName));		
	}
	
	




	

	
}
