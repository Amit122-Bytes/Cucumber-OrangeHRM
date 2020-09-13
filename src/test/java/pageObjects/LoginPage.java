package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver localdriver;
	
	public LoginPage(WebDriver remotedriver)
	{
		localdriver=remotedriver;
		PageFactory.initElements(remotedriver, this);
	}
	@FindBy(name="txtUsername")
	WebElement Username;
	
	@FindBy(name="txtPassword")
	WebElement Password;
	
	@FindBy(name="Submit")
	WebElement Login;
	
	
	@FindBy(xpath="//*[@id='welcome']")
	WebElement dropdown;
	
	@FindBy(xpath="//*[@id='welcome-menu']/ul/li[3]/a")
	WebElement logout;
	
	public void sendusername(String uname)
	{
		Username.clear();
		Username.sendKeys(uname);
	}
	
	public void sendpassword(String pass)
	{
		Password.clear();
		Password.sendKeys(pass);
	}
	
	public void clickbutton()
	{
		Login.click();
	}
	
	public void logoutoperation() throws InterruptedException
	{
		dropdown.click();
		Thread.sleep(3000);
		logout.click();
	}
	

}
