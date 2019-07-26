package com.autotest.crm.genericlib;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.autotest.crm.objectrepositorylib.HomePage;
import com.autotest.crm.objectrepositorylib.Login;

/*
 * 
 * @author waquar
 *
 */
public class BaseClass extends Browser{

	public FileUtils flib = new FileUtils();
	public  static Webdrivercommonlib wlib = new Webdrivercommonlib();
	
	/**
	 * To launch a Browser
	 * @throws Exception
	 */
	@BeforeClass
	public void configBC() throws Exception
	{
		launchBrowser();
		wlib.implicitwait();
		
	}
	/**
	 * To login in to the webpage
	 * @throws Exception
	 */
	@BeforeMethod
	public void configBM() throws Exception
	{
		System.out.println("Logged in");
		Login LoginPage = PageFactory.initElements(driver, Login.class);
		LoginPage.loginToApp();
	}
	/**
	 * To log out of the webpage
	 * 
	 */
	@AfterMethod
	public void configAM()
	{
		System.out.println("Logged out");
		HomePage Home = PageFactory.initElements(driver, HomePage.class);
		Home.logoutFromApp();



	}
	/**
	 * To close the Browser
	 */
	@AfterClass
	public void configAC()
	{
		closeBrowser();
	}
}
