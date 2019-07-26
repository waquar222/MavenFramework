package com.autotest.crm.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.autotest.crm.genericlib.BaseClass;
import com.autotest.crm.genericlib.FileUtils;

public class Login extends BaseClass  {
	/*
	 * To fetch Username , Password and Login
	 */
	@FindBy(name="user_name")
	private WebElement username;
	
	@FindBy(name="user_password")
	private WebElement password;
	
	@FindBy(id="submitButton")
	private WebElement login;
	
		public void loginToApp() throws Exception {
			FileUtils flib = new FileUtils();
			driver.get(flib.getPropertyData("url"));
			username.sendKeys(flib.getPropertyData("username"));
			password.sendKeys(flib.getPropertyData("password"));
			login.click();
		}
		
		
		
}
