package com.autotest.crm.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.autotest.crm.genericlib.BaseClass;

public class CreatingNewLead extends BaseClass {
	/*
	 * Enter lastname and companyname
	 */
	@FindBy(name="lastname")
	private WebElement lastname;
	
	@FindBy(name="company")
	private WebElement companyname;
	
	public void LeadsDetails(String Lastname,String Companyname)
	{
		lastname.sendKeys(Lastname);
		companyname.sendKeys(Companyname);
	}
	/*
	 * Click on Assigned to button
	 */
	@FindBy(name="assigned_user_id")
	private WebElement assignedto;
	
	public WebElement getAssignedto() {
		return assignedto;
	}
	/*
	 * Save button
	 */
	@FindBy(css="input[type='submit']")
	private WebElement savebutton;
	
	public void SaveButton() throws Exception
	{
		savebutton.click();
	}
	/*
	 * To select Industry in create leads page
	 */
	@FindBy(name="industry")
	private WebElement industry;

	public WebElement getIndustry() {
		return industry;
	}
	/*
	 * To select Leadsource in create leads page
	 */
	@FindBy(name="leadsource")
	private WebElement leadsource;
	
	public WebElement getLeadsource() {
		return leadsource;
	}

}
