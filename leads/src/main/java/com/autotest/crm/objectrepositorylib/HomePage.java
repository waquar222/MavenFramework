package com.autotest.crm.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.autotest.crm.genericlib.BaseClass;
import com.autotest.crm.genericlib.Webdrivercommonlib;

public class HomePage extends BaseClass {
	Webdrivercommonlib wlib = new Webdrivercommonlib();
	/*
	 * SignOut
	 */
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement preferenceImg;
	
	@FindBy(linkText="Sign Out")
	private WebElement logout;
	
	public void logoutFromApp()
	{
		wlib.action(preferenceImg);
		logout.click();
	}
	/*
	 * Navigate to Leads Tab
	 */
	@FindBy(xpath="//table[@class='hdrTabBg']/tbody/tr/td[2]/table/tbody/tr/td[4]/a")
	private WebElement Leads;
	
	public void Leads()
	{
		Leads.click();
	}

	public WebElement getLeads() {
		return Leads;
	}
	
	

}
