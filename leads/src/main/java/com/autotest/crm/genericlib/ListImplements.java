package com.autotest.crm.genericlib;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListImplements implements ITestListener {

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		try
		{
			String testName=result.getMethod().getMethodName();
			System.out.println("Take screenshot");
			EventFiringWebDriver driver = new EventFiringWebDriver(Browser.driver);
			File src = driver.getScreenshotAs(OutputType.FILE);
			File dst = new File("./screen/" +testName+".png");
				FileUtils.copyFile(src, dst);
			} catch (Exception e) {
				e.printStackTrace();
			}
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
		
}
	