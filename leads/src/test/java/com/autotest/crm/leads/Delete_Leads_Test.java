package com.autotest.crm.leads;


import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.autotest.crm.genericlib.BaseClass;
import com.autotest.crm.genericlib.Webdrivercommonlib;
import com.autotest.crm.objectrepositorylib.HomePage;
import com.autotest.crm.objectrepositorylib.Leads;

/**
 * 
 * @author waquar
 *
 */
/*To take screenshot where there is a failure*/
@Listeners(com.autotest.crm.genericlib.ListImplements.class)
public class Delete_Leads_Test extends BaseClass {
	/*
	 * To delete lead from leads page
	 */
	@Test
	public void test_Delete_Leads() throws InterruptedException
	{
		Reporter.log("Deleting leads started");
		Webdrivercommonlib wlib = new Webdrivercommonlib();
		/*Homepage should be displayed*/
		HomePage Home = PageFactory.initElements(driver, HomePage.class);
		Leads Lead = PageFactory.initElements(driver, Leads.class);
		 /*Leads page should be displayed*/
		Home.Leads();
		Reporter.log("Navigate to leads page");
		/*Lead should be selected*/
		Lead.SelectLeads();
		Reporter.log("Lead is selected");;
		/*User should be deleted*/
		Reporter.log("User is deleted");
		Reporter.log("");
		Lead.DeleteLeads();
		wlib.AlertPopup();
		Thread.sleep(2000);
		Reporter.log("Deleting leads ended");
	}

}
