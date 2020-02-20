package com.Altemetrics.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	
	private WebDriver driver=null;
	
	public WebDriver init(Browsers browserName) {
		
		switch (browserName) {
		case chrome:
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case firefox:
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
		case ie:
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
			break;
		
		}
		return driver;
	}

}
