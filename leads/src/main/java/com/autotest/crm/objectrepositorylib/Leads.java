package com.autotest.crm.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.autotest.crm.genericlib.BaseClass;

public class Leads extends BaseClass {
	
	
	/*
	 * Create leads image
	 */
	@FindBy(css="img[title='Create Lead...']")
	private WebElement createleadsimg;
	
	public void CreateLead()
	{
		createleadsimg.click();
	}
	/*
	 * Fetch Title After creating leads
	 */
	@FindBy(xpath="//td[@class='showPanelBg']/div/table/tbody/tr/td/span")
	private WebElement leadinfotitle;
	
	public WebElement getLeadinfotitle() {
		return leadinfotitle;
	}
	/*
	 * To select leads
	 */
	@FindBy(xpath="(//input[@name='selected_id'])[1]")
	private WebElement selectleads;

	public void SelectLeads()
	{
		selectleads.click();
	}
	/*
	 * To delete leads
	 */
	@FindBy(css="input[value='Delete']")
	private WebElement deleteleads;
	
	public void DeleteLeads()
	{
		deleteleads.click();
	}
	
	
	

}
