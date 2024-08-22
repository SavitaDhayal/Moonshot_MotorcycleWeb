package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
	
	
	private BrowserFactory() {}
	private static BrowserFactory instance=new BrowserFactory();
	
	public static BrowserFactory getInstance() {
		return instance;
	}
	
	
	public ThreadLocal<WebDriver> driver =new ThreadLocal<WebDriver>();  // implements MultiThreading concept
	public void SetDriver(String browserType) {
		
		if (browserType.equalsIgnoreCase("chrome")) {
//	WebDriverManager.chromedriver().setup();
		driver.set(new ChromeDriver());	 }
	}
	
	public WebDriver getDriver() {		
		return  driver.get();
	}
	
	public void closeBrowser() {
		getDriver().close();
		driver.remove();
	}

}
