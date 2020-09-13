package stepDefinations;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import pageObjects.LoginPage;
import pageObjects.editpersonaldetails;
import pageObjects.searchCustomer;

public class Baseclass {

	public WebDriver driver;
	public LoginPage lp;
	public editpersonaldetails changdata;
	public searchCustomer search;
	public static Logger logger;
	public Properties configProp;
}
