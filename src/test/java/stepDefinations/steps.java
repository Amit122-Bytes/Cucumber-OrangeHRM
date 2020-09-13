package stepDefinations;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import pageObjects.LoginPage;
import pageObjects.editpersonaldetails;
import pageObjects.searchCustomer;
import utilities.Elements;
public class steps extends Baseclass {
	
	@Before
	public void setup() throws IOException
	{
		configProp=new Properties();
		FileInputStream configPropfile=new FileInputStream("config.properties");
		configProp.load(configPropfile);
		
		logger=Logger.getLogger("OrangeHRM");
		PropertyConfigurator.configure("Log4j.properties" );
		
		String br=configProp.getProperty("browser");
		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",configProp.getProperty("chromedriver"));
		    driver=new ChromeDriver();
		   
		}
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",configProp.getProperty("firefox"));
		    driver=new FirefoxDriver();
		   
		}
		else if(br.equals("ide"))
		{
			System.setProperty("webdriver.ie.driver",configProp.getProperty("ide"));
		    driver=new InternetExplorerDriver(); 
		    
		}
		logger.info("*****************Launching URL****************");
	}
	
	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() 
	{
	    lp=new LoginPage(driver);
	} 

	@When("^User opens URL \"([^\"]*)\"$")
	public void user_opens_URL(String URL) throws Throwable {
	   logger.info("*****************Opening URL****************");
	   driver.get(URL);
	}

	@When("^User enters Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void user_enters_Username_as_and_Password_as(String email, String password) throws Throwable {
		logger.info("*****************User Informartion****************");
		lp.sendusername(email);
	    lp.sendpassword(password);
	}
	
	@And("Click on Login")
	public void click_on_Login() 
	{
		logger.info("*****************Click on Login****************");
	    lp.clickbutton();
	}

	@Then("^Page title shoud be \"([^\"]*)\"$")
	public void page_title_shoud_be(String title) throws Throwable {
		boolean res=driver.getPageSource().contains("Invalid credentials");
		if(res==true)
		{
			driver.close();
			logger.info("*****************Login Passed ****************");
			Assert.assertTrue(false);	
		}
		else
		{
			logger.info("*****************Login Failed ****************");
			Assert.assertEquals(title, driver.getTitle());	
		}
	}

	@When("click on Logout")
	public void click_on_Logout() throws InterruptedException {
	    
		Thread.sleep(3000);
		logger.info("*****************Click on Logout ****************");
		lp.logoutoperation();
	
	}

	@Then("Close Browser")
	public void close_Browser() {
		logger.info("*****************Closing Browser ****************");
		driver.quit();
	}
	
	//Edit details.........................//
	
	@Then("^User can view Dashboard$")
	public void user_can_view_Dashboard() throws Throwable {
	    
		changdata=new editpersonaldetails(driver);
	    Assert.assertEquals("OrangeHRM", changdata.getPageTitle());
	    Thread.sleep(2000);
	    driver.manage().window().maximize();
	}

	@When("^User click on My Info$")
	public void user_click_on_My_Info() throws Throwable {
		logger.info("*****************Click on Myinfo ****************");
		changdata.myinfoclick();
		Thread.sleep(2000);
	}

	@When("^Click on Edit button$")
	public void click_on_Edit_button() throws Throwable {
	   
		logger.info("*****************Click on Edit button ****************");
		changdata.editdetails();
	}

	@Then("^User Edit details$")
	public void user_Edit_details() throws Throwable {
		logger.info("*****************Change first name ****************");
		changdata.firstnamechange();
		logger.info("*****************Change last name ****************");
		changdata.lasttnamechange();
		logger.info("*****************ID change ****************");
		changdata.changeotherID();
		logger.info("*****************Change date ****************");
		changdata.changedate();
		logger.info("*****************Choose Gender ****************");
		changdata.choosegender();
		logger.info("*****************Change material status ****************");
		Elements.materialstatus(driver, "Single");
		logger.info("*****************Change nationality ****************");
		Elements.natioanlity(driver, "Indian");
	}

	@Then("^Click on Save button$")
	public void click_on_Save_button() throws Throwable {
	   
	  logger.info("*****************Click on save ****************");
	  changdata.savedetails();
	  Thread.sleep(5000);
	}
	
	//Search for a Customer using Name----------------------//
	
	@Then("^Click on Directory$")
	public void click_on_Directory() throws InterruptedException  {
	   
		logger.info("*****************Go to directory ****************");
		search=new searchCustomer(driver);
		search.clickondirectory();
	}

	@Then("^Enter customer name$")
	public void enter_customer_name()  {
		logger.info("*****************Enter Name for search****************");
		search.setName("Suman Das");
	}

	@When("^Click on search button$")
	public void click_on_search_button() throws InterruptedException {
		logger.info("*****************Searching ****************");
		search.searchbutton();
	}

	@Then("^User should found Name in the search table$")
	public void user_should_found_Name_in_the_search_table(){
		
		logger.info("*****************Name found ****************");
		search.searchbyName("Suman Das");
		
	}

}
