package com.store.testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import com.store.pages.BaseClass;
import com.store.pages.LoginPage;

public class LoginTest extends BaseClass{
	
	
	
	@Test
	public  void testLogin() {
		
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.loginToStore(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
		loginpage.validateLandingpage();
		
	}
	

}
