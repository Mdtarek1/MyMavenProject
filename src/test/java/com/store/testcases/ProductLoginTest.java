package com.store.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductLoginTest {
	
	@Test
	public static void loginTest() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		
		driver.get("https://www.demoblaze.com/"); 
		
		driver.findElement(By.id("login2")).click();
		driver.findElement(By.id("loginusername")).sendKeys("Mdtarek");
		driver.findElement(By.id("loginpassword")).sendKeys("Bangladesh1@");
        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
        
         WebElement welcome = driver.findElement(By.xpath("//a[contains(text(),'Welcome Mdtarek')]"));
         String actualText = welcome.getText();
         System.out.println(actualText);
         String expectedText = "Welcome Mdtarek";
         
         Assert.assertEquals(actualText, expectedText, "Login failed");
         
         driver.quit();
         
         
        
	}

}

