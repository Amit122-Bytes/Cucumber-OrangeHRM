package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitHelper;

public class searchCustomer {

	public WebDriver ldriver;
	
	WaitHelper waithelper;
	
	public searchCustomer(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
		waithelper=new WaitHelper(ldriver);
	}
	
	@FindBy(how=How.ID, using="menu_directory_viewDirectory")
	@CacheLookup
	WebElement directory;
	
	@FindBy(how=How.ID, using="searchDirectory_emp_name_empName")
	@CacheLookup
	WebElement entername;
	
	@FindBy(how=How.ID, using="searchBtn")
	@CacheLookup
	WebElement clickonsearch;
	
	@FindBy(how=How.ID, using="resultBox")
	@CacheLookup
	WebElement results;
	
	
	public void clickondirectory() throws InterruptedException
	{
		Thread.sleep(2000);
		directory.click();
		
	}
	public void setName(String Name) 
	{
		waithelper.waitforElement(entername, 10);
		entername.clear();
		entername.sendKeys(Name);
	}
	public void searchbutton() throws InterruptedException
	{
		Thread.sleep(2000);
		clickonsearch.click();
		
	}
	
	public void searchbyName(String Name)
	{
		String name=results.getText();
		System.out.println(Name);
		if(name.equals(Name))
		{
			 Assert.assertTrue(true);
		}
		else
		{
			 Assert.assertTrue(false);
		}
		
	}
	
}
