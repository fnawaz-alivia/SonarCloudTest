package automationModels;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

import automationUtils.utilityMethods;

public class LoginModel {
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'brand-login')]")

	public List<WebElement> loginScreen;

	@FindBy(how = How.XPATH, using = "//*[@id = 'username-id-inputEl']")

	public WebElement username;

	@FindBy(how = How.XPATH, using = "//*[@id = 'password-id-inputEl']")

	public WebElement password;

	@FindBy(how = How.XPATH, using = "//*[@id = 'loginBtn-btnEl']")

	public WebElement loginbutton;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-component x-window-text x-box-item x-component-default')]")

	public WebElement LoginFailuretext;
	
	@FindBy(how = How.XPATH, using = "//table[(text() = 'Get Started' or . = 'Get Started')]")

	public WebElement GetStarted;

	@Test

	public void LoginUser(String uname, String pw) {
		utilityMethods.visible(username, "Login Screen :Verify that User Name Field is present.");
		utilityMethods.clickable(username, "Login Screen:Verify that User Name Field is clickable.");
		username.clear();
		username.sendKeys(uname);
		utilityMethods.visible(password, "Login Screen:Verify that password Field is present.");
		utilityMethods.clickable(password, "Login Screen:Verify that password Field is clickable.");
		password.clear();
		password.sendKeys(pw);
		utilityMethods.visible(loginbutton, "Login Screen:Verify that Profile Button is present.");
		utilityMethods.clickable(loginbutton, "Login Screen:Verify that Profile Button is clickable.");
		loginbutton.click();
		
	}
	public boolean LoginUser2(String uname, String pw) {
		username.clear();
		username.sendKeys(uname);
		password.clear();
		password.sendKeys(pw);
		loginbutton.click();
		utilityMethods.time(1000);
		if(GetStarted.isDisplayed()==true) {
			return true;
		}
		return false;
		
		/*
		 * try { String ActualLoginFailureText = LoginFailuretext.getText();
		 * System.out.println(ActualLoginFailureText);
		 * 
		 * if (LoginFailuretext.isDisplayed() == true) {
		 * System.out.println("Login failure window is being shown"); Okbutton.click();
		 * } } catch (Exception e) {
		 * System.out.println("There is an issue with login scenario"); }
		 */
	}
}