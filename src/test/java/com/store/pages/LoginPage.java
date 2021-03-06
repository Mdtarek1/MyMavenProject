package com.store.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage {
	WebDriver driver;

	
	public LoginPage(WebDriver ldriver) {
		this.driver = ldriver;

    }
	
	@FindBy(xpath ="//a[text()='Log in']") WebElement login;
	@FindBy(id ="loginusername") WebElement uName;
	@FindBy(id ="loginpassword") WebElement uPass;
	@FindBy(xpath ="//button[text()='Log in']") WebElement loginBtn;
	@FindBy(xpath ="//a[text()='Welcome Mdtarek']") WebElement welcome;


	public void loginToStore(String name, String pass) {
		if(login.isDisplayed() && login.isEnabled());
		login.click();
		
		if(uName.isDisplayed() && uName.isEnabled());
		uName.sendKeys(name);
		
		if(uPass.isDisplayed() && uPass.isEnabled());
		uPass.sendKeys(pass);
		
		if(login.isDisplayed() && login.isEnabled());
		loginBtn.click();
	}
	
	public void validateLandingpage() {
		String actualText = welcome.getText();
		String expectedText = "Welcome Mdtarek";
		Assert.assertTrue(actualText.contains(expectedText));
	
	
	
	}
	
	
	
}
