package com.autotest.crm.leads;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.autotest.crm.genericlib.BaseClass;
import com.autotest.crm.genericlib.Webdrivercommonlib;
import com.autotest.crm.objectrepositorylib.CreatingNewLead;
import com.autotest.crm.objectrepositorylib.HomePage;
import com.autotest.crm.objectrepositorylib.Leads;


/**
 * 
 * @author waquar
 *
 */
/*To take screenshot where there is a failure*/
@Listeners(com.autotest.crm.genericlib.ListImplements.class)
public class Lead_Test extends BaseClass {
	
	public Webdrivercommonlib wlib = new Webdrivercommonlib();
	/*To Create Leads*/
	@Test
	public void test_Create_Leads() throws Exception
	{
		Reporter.log("Creating leads started",true);
		HomePage Home = PageFactory.initElements(driver, HomePage.class);
		Leads Lead = PageFactory.initElements(driver, Leads.class);
		CreatingNewLead NewLead = PageFactory.initElements(driver, CreatingNewLead.class);
		/*Homepage should be displayed*/
		Reporter.log("Homepage is displayed",true);
		String exptitle = flib.getExcelData("Sheet1", 1, 3);
		/*Navigate to Leads page*/
		Home.Leads();
		Reporter.log("Leads page is displayed",true);
		/* Navigate to Create new lead page*/
		Lead.CreateLead();
		Reporter.log("Creating new lead page is displayed",true);
		/*Lastname should be entered*/
		NewLead.LeadsDetails(flib.getExcelData("Sheet1", 1, 1), flib.getExcelData("Sheet1", 1, 2));
		Reporter.log("Last name and Company is entered",true);
		/* Administrator should be selected from assigned drop down*/
		wlib.selectbytext(flib.getExcelData("Sheet1", 1, 4), NewLead.getAssignedto());
		Reporter.log("Administrator is selected from assigned drop down",true);
		/*Data should be saved successfully*/
		NewLead.SaveButton();
		Reporter.log("Lead created and saved sucessfully",true);
		String acttitle = Lead.getLeadinfotitle().getText();
		boolean stat = acttitle.contains(exptitle);
		Assert.assertTrue(stat);	
		Reporter.log("Leader Information is verified",true);
		Reporter.log("Creating leads ended",true);
	}
	/*To create leads with last name and company name*/
	@Test
	public void test_Create_Leads_With_Last_Name_And_Company_Name() throws Exception 
	{
		Reporter.log("Creating leads with last name and company name started");
		HomePage Home = PageFactory.initElements(driver, HomePage.class);
		CreatingNewLead NewLead = PageFactory.initElements(driver, CreatingNewLead.class);
		Leads Lead = PageFactory.initElements(driver, Leads.class);
		/*Homepage should be displayed*/
		Reporter.log("Homepage is displayed",true);
		String expTitle = flib.getExcelData("Sheet1", 3, 3);
		/*Mouse pointer should be over Leads Tab*/
		wlib.action(Home.getLeads());
		Reporter.log("Mouse pointer is over leads tab",true);
		/*Navigate to Leads page*/
		Home.Leads();
		Reporter.log("Leads page is displayed",true);
		/*Navigate to create new Leads page */
		Lead.CreateLead();
		Reporter.log("Creating new Lead page is displayed",true);
		/*Lastname and Company name should be entered*/
		NewLead.LeadsDetails(flib.getExcelData("Sheet1", 3, 1), flib.getExcelData("Sheet1", 3, 2));
		Reporter.log("Lastname and Company name is entered",true);
		/*Data should be saved succesfully*/
		NewLead.SaveButton();
		Reporter.log("New lead is created and saved succesfully",true);
		String actTitle = Lead.getLeadinfotitle().getText();
		System.out.println(actTitle);
		boolean stat = actTitle.contains(expTitle);
		Assert.assertTrue(stat);
		Reporter.log("Leader Information Verified");
		Reporter.log("Creating leads with last name and company name ended");
	}
	/*To create leads with selecting Engineering in Industry drop down*/
	@Test
	public void test_Create_Leads_With_Industry() throws Exception
	{
		Reporter.log("Creating leads with selecting Engineering in Industry drop down");
		HomePage Home = PageFactory.initElements(driver, HomePage.class);
		Leads Lead = PageFactory.initElements(driver, Leads.class);
		CreatingNewLead NewLead = PageFactory.initElements(driver, CreatingNewLead.class);
		/*HomePage should be dispalayed*/
		Reporter.log("Homepage is displayed");
		String expTitle = flib.getExcelData("Sheet1", 2, 3);
		/*Mouse cursor should be over the leads tab*/
		wlib.action(Home.getLeads());
		/*Navigate to Leads page*/
		Home.Leads();
		Reporter.log("Leads page displayed");
		/*Navigate to create new Lead page*/
		Lead.CreateLead();
		Reporter.log("Create new lead page is displayed");
		/*Last name and Company name should be entered*/
		NewLead.LeadsDetails(flib.getExcelData("Sheet1", 2, 1), flib.getExcelData("Sheet1", 2, 2));
		Reporter.log("Lastname and Company name is entered");
		/*Engineering should be selected in Industry drop down*/
		wlib.selectbyvalue(flib.getExcelData("Sheet1", 2, 4), NewLead.getIndustry());
		Reporter.log("Engineering is selected from Industry drop down");
		/*Data should be saved successfully*/
		NewLead.SaveButton();
		Reporter.log("New lead is created successfully");
		String actTitle = Lead.getLeadinfotitle().getText();
		System.out.println(actTitle);
		boolean stat = actTitle.contains(expTitle);
		Assert.assertTrue(stat);
		Reporter.log("Leader Information verified");
		Reporter.log("Creating leads with selecting Engineering in Industry drop down ended");
	}	
	/*To create lead and selecting cold call in LeadSource drop down only*/
	@Test
	public void test_Create_Leads_With_Lead_Source_Only() throws Exception
	{
		Reporter.log("Creating leads with selecting cold call in LeadSource drop down started");
		HomePage Home = PageFactory.initElements(driver, HomePage.class);
		Leads Lead = PageFactory.initElements(driver, Leads.class);
		CreatingNewLead NewLead = PageFactory.initElements(driver, CreatingNewLead.class);
		/*Homepage should be displayed*/
		Reporter.log("Homepage is displayed");
		String expTitle = flib.getExcelData("Sheet1", 4, 3);
		/*Mouse pointer should be over leads tab*/
		wlib.action(Home.getLeads());
		/*Navigate to Leads page*/
		Home.Leads();
		Reporter.log("Leads page is displayed");
		/*Navigate to create new lead page*/
		Lead.CreateLead();
		Reporter.log("Create user page is displayed");
		/*Cold call should be selected from industry drop down*/
		wlib.selectbyvalue(flib.getExcelData("Sheet1", 4, 4), NewLead.getLeadsource());
		Reporter.log("Cold call is selected from industry drop down");
		/*Last name cannot be empty should be dispalyed in alert pop up*/
		NewLead.SaveButton();
		Reporter.log("Last name cannot be empty");
		/*Getting text from alert popup*/
		String actTitle =wlib.AlertPopupText();
		wlib.AlertPopup();
		boolean stat = actTitle.contains(expTitle);
		Assert.assertTrue(stat);
		Reporter.log("Error message is verified");
		Reporter.log("Creating leads with selecting cold call in LeadSource drop down ended");
		}	
}
