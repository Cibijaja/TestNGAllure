package com.sam;

import java.lang.reflect.Field;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import io.qameta.allure.Attachment;


public class Listener  implements ITestListener{
	
	
//	@Attachment
//	public String performedActions(ActionSequence actionSequence) {
//	    return actionSequence.toString();
//	}

	@Attachment(value = "Page screenshot", type = "image/png")
	public byte[] saveScreenshot(WebDriver driver) {
		return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	}

	public void onTestStart(ITestResult result) {
		System.out.println(result.getMethod().getMethodName() +" test started");
		
	}

	public void onTestSuccess(ITestResult result) {
		
		WebDriver driver = Base.getdriver();
		System.out.println(driver);
		saveScreenshot(driver);
		
	}

	public void onTestFailure(ITestResult result) {
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		System.out.println( " started");
		
	}

	public void onFinish(ITestContext context) {
		System.out.println(context.getName() + " Concluded");
		
	}

}
