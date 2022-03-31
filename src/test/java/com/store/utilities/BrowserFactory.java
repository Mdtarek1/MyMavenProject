package com.store.utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
	// public webDriver driver;
	
	
	public static WebDriver openApplication(WebDriver driver, String browser, String url) {
		if(browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			
		}else if (browser.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver(); 
			 }else if (browser.equalsIgnoreCase("Edge")) {
				 WebDriverManager.edgedriver().setup();
					 driver = new EdgeDriver(); 
			 }
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		
		driver.get(url);
		
		return driver;
	}
	
	public static void quiteBrowser(WebDriver driver) {
		driver.quit();
		
		}
	}
	
	
	


