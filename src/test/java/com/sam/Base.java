package com.sam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public WebDriver driver;
	
	public static ThreadLocal<WebDriver> tdriver = new ThreadLocal<WebDriver>();
	
	
	public WebDriver inti() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println(driver);
		tdriver.set(driver);
		return getdriver();
	}
	
	public static synchronized WebDriver getdriver() {
		
		return tdriver.get();
	}
	
	

}
