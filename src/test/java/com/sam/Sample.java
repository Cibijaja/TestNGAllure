package com.sam;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.FileFileFilter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Flaky;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class Sample extends Base{
	
	public String val  = "asdd";
	public WebDriver driver;
	
	@BeforeClass
	private void be() throws IOException, Exception {	
		File f = new File("C:\\Users\\CIBI\\eclipse-workspace\\TestNg\\allure-results");
		
		Thread.sleep(5000);
		FileUtils.cleanDirectory(f);
		//String[] list1 = f.list();
	//	System.out.println(list1.length);
	}
	@BeforeMethod
	private void bfr() {
		driver = inti();
	}
	@AfterMethod
	private void afr() {
		driver.quit();
	}
	@Feature("3")
	@Story("asd")
	@Description("Android")
	@Test(description = "Goooooooooo")
	@Epic("Andro")
	private void google() {
		driver.get("https://www.google.com");
		System.out.println(driver);
	}
	
	
	@Flaky
	@Story("as")
	@Epic("2B")
	@Feature("1")
	@Severity(SeverityLevel.BLOCKER)
	@Test(description = "Amaaaaaaa")
	private void amazon() {	
		driver.get("https://www.amazon.com");
	}
	@Severity(SeverityLevel.CRITICAL)
	@Story("a")
	@Epic("Genos")
	@Feature("2")
	@Test(description = "flippppppppp")
	private void flip() {	
		driver.get("https://www.flipkart.com");	
	}

}
