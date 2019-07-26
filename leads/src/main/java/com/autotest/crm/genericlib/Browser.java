package com.autotest.crm.genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
/*
 * To fetch and execute which browser is to be launched
 */
	public static WebDriver driver;
	
	public void launchBrowser() throws Exception
	{
		FileUtils flib = new FileUtils();
		String BROWSER = flib.getPropertyData("browser");
		System.out.println("Browser launched");
		if(BROWSER.equals("chrome")) {
		   driver = new ChromeDriver();
		   
		   
		}else if(BROWSER.equals("firefox")) {
			driver = new FirefoxDriver();
		}
	}
/*
 * To close the browser
 */
		public static void closeBrowser()
		{
			System.out.println("Close Browser");
			driver.close();
		}
}
