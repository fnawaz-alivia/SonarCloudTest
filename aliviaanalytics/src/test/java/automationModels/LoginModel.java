package automationModels;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;
public class LoginModel {
	
	@FindBy(how = How.XPATH, using = "//*[@id = 'username-id-inputEl']")
	
	public WebElement username;
	
	@FindBy(how = How.XPATH, using = "//*[@id = 'password-id-inputEl']")
	
	public WebElement password;

	@FindBy(how = How.XPATH, using = "//*[@id = 'loginBtn-btnEl']")
	
	public WebElement loginbutton;
	
@Test

public void LoginFormFill(String uname, String pw) {
	username.sendKeys(uname);
	password.sendKeys(pw);

}
}