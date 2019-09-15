package com.synchronisys.testng.listener;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.synchronisys.framework.utility.WebUtil;


public class TestNgITestListener implements ITestListener {



	@Test
	public void onTestStart(ITestResult result) {
		System.out.println("TestCase started: "+result.getName());


	}

	@Test
	public void onTestSuccess(ITestResult result) {
		System.out.println("TestCase Successfully passed: "+result.getName());

	}

	@Test
	public void onTestFailure(ITestResult result) {
		File screenshotFile = ((TakesScreenshot) WebUtil.driver).getScreenshotAs(OutputType.FILE);
		File destfile=new File("Screenshots\\"+result.getName()+"_screenshot.png");
		try {
			FileUtils.copyFileToDirectory(screenshotFile, destfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Screenshot Not capture");
		}

		System.out.println("TestCase Failed: "+result.getName());


	}


	public void onTestSkipped(ITestResult result) {
		System.out.println("TestCase start "+result.getName());

	}


	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("TestCase start "+result);

	}


	public void onStart(ITestContext context) {

		System.out.println("TestCase start "+context);
	}


	public void onFinish(ITestContext context) {
		System.out.println("TestCase start "+context);


	}

}
