package com.autotest.crm.genericlib;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Webdrivercommonlib extends BaseClass{
	/*
	 * Navigate to Alert Popup and click OK  
	 */
	public void AlertPopup()
	{
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}
	/*
	 * Get Text from Alert Popup 
	 */
	public String AlertPopupText()
	{
		Alert alt = driver.switchTo().alert();
		return alt.getText();
	}
	/*
	 * Select by Index 
	 */
	public void selectbyindex(int index ,WebElement webelement)
	{
		Select select = new Select(webelement);
		select.selectByIndex(index);
	}
	/*
	 * Select by Value 
	 */
	public void selectbyvalue(String value ,WebElement webelement)
	{
		Select select = new Select(webelement);
		select.selectByValue(value);
	}
	/*
	 * Select by VisibleText 
	 */
	public void selectbytext(String text ,WebElement webelement)
	{
		Select select = new Select(webelement);
		select.selectByVisibleText(text);
	}
	/*
	 * Action class
	 */
	public void action(WebElement element)
	{
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		
	}	
	
	
	public void implicitwait()
	{
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
}
