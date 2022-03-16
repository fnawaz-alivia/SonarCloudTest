package automationModels;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import configuration.Configuration;

public class SecurityModel  extends Configuration{
	
	@FindBy(how = How.XPATH, using = "//img[contains(@class, 'toolbar-mainOptionsMenuButton-029')]")

	public WebElement MenuButton;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'menuitem') and (text() = 'Logout' or . = 'Logout')]")

	public WebElement LogoutButton;
	
	
	
}
