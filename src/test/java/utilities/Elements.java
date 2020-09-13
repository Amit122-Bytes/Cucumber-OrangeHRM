package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Elements {

	public static void materialstatus(WebDriver driver,String status)
	{
		Select text = new Select(driver.findElement(By.name("personal[cmbMarital]")));
		text.selectByVisibleText(status);
	}
	public static void natioanlity(WebDriver driver,String countrian)
	{
		Select text = new Select(driver.findElement(By.name("personal[cmbNation]")));
		text.selectByVisibleText(countrian);
	}
}
