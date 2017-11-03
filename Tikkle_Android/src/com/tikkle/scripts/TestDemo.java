package com.tikkle.scripts;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.tikkle.Library.BaseLib;
import com.tikkle.Library.GenericLib;

public class TestDemo extends BaseLib
{
	DateFormat df;
	@Test()
	public void ScreenshotDemo() throws IOException, InterruptedException
	{
		/*String clsnam = this.getClass().getName();
		System.out.println(clsnam);
		
		String className = this.getClass().getSimpleName();
		System.out.println(className);
		//Get method name using Thread.currentThread().getStackTrace()
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
		//Get method name using StackTraceElement.getMethodName()
		StackTraceElement stackTraceElements[] = (new Throwable()).getStackTrace();*/
		Thread.sleep(5000);
		GenericLib.CaptureScreenShot(driver);
		
		/*Thread.sleep(5000);
		//Folder Name
		String folderName = "screenshot";
		
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Date Format
		df=new SimpleDateFormat("dd-mm-yyyy_hh_mm_ssaa");
		//Creating a folder
		new File(folderName).mkdir();
		//setting screenshot name
		String FileName=df.format(new Date())+".png";
		//copy screenshot file into screenshot folder
		FileUtils.copyFile(f, new File(folderName +"/"+FileName));*/
	}
	
	
	
	
}
	


