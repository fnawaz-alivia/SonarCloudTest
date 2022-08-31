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

	public void LoginUser(String uname, String pw) {
		username.clear();
		username.sendKeys(uname);
		password.clear();
		password.sendKeys(pw);
		loginbutton.click();
	}
}