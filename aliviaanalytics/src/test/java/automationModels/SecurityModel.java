package automationModels;

import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import configuration.Configuration;

public class SecurityModel extends Configuration {

	@FindBy(how = How.XPATH, using = "//img[contains(@class, 'toolbar-mainOptionsMenuButton-029')]")

	public WebElement MenuButton;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'menuitem') and (text() = 'Logout' or . = 'Logout')]")

	public WebElement LogoutButton;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'menuitem-') and (text() = 'Admin View' or . = 'Admin View')]")

	public WebElement AdminView;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button-') and (text() = 'Users' or . = 'Users')]")

	public WebElement Users;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'textfield') and @type = 'password' and @name = 'oldpassword']")

	public WebElement oldpassword;
	
	@FindBy(how = How.XPATH, using = "//*[@id = 'password-cid-inputEl' and @type = 'password' and @name = 'newpassword']")

	public WebElement newpassword;
	
	@FindBy(how = How.XPATH, using = "//*[@id = 'cpassword-cid-inputEl' and @type = 'password' and @name = 'cnewpassword']")

	public WebElement cnewpassword;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button') and (text() = 'Submit Password' or . = 'Submit Password')]")

	public WebElement SubmitPassword;
	

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'textfield-') and @type = 'text' and @name = 'firstName']")

	public WebElement firstName;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'textfield') and @type = 'text' and @name = 'lastName']")

	public WebElement lastName;

	@FindBy(how = How.XPATH, using = "//*[@id = 'password-id-inputEl' and @type = 'password' and @name = 'password']")

	public WebElement Password;

	@FindBy(how = How.XPATH, using = "//*[@id = 'cpassword-id-inputEl' and @type = 'password' and @name = 'cpassword']")

	public WebElement ConfirmPassword;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'combo-') and @type = 'text' and @name = 'preferredLanguage']")

	public WebElement preferredLanguage;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'tagfield-') and @type = 'text' and @name = 'ugTags']")

	public WebElement UsersGroups;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'textfield-') and @type = 'text' and @name = 'userName']")

	public WebElement userNameEmailID;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button-') and (text() = 'Create' or . = 'Create')]")

	public WebElement Create;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button-') and (text() = 'Remove' or . = 'Remove')]")

	public WebElement Remove;

	@FindBy(how = How.XPATH, using = "//span[starts-with(@id, 'button-') and (text() = 'Yes' or . = 'Yes')]")

	public WebElement Yes;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button-') and (text() = 'Division' or . = 'Division')]")

	public WebElement Division;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'checkbox') and @class = 'x-form-cb-label x-form-cb-label-default x-form-cb-label-after  ' and (text() = 'Make Security Admin' or . = 'Make Security Admin')]")

	public WebElement MakeSecurityAdmin;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'checkbox') and @class = 'x-form-cb-label x-form-cb-label-default x-form-cb-label-after  ' and (text() = 'Make Database Admin' or . = 'Make Database Admin')]")

	public WebElement MakeDatabaseAdmin;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'checkbox') and @class = 'x-form-cb-label x-form-cb-label-default x-form-cb-label-after  ' and (text() = 'Force Password Change' or . = 'Force Password Change')]")

	public WebElement ForcePasswordChange;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'checkbox') and @class = 'x-form-cb-label x-form-cb-label-default x-form-cb-label-after  ' and (text() = 'User Locked' or . = 'User Locked')]")

	public WebElement UserLocked;
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button-') and (text() = 'OK' or . = 'OK')]")

	public WebElement Okbutton;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button-') and (text() = 'Organization' or . = 'Organization')]")

	public WebElement Organization;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'menuitem') and (text() = 'Profile Picture' or . = 'Profile Picture')]")

	public WebElement ProfilePicture;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@data-errorqtip,'Only Database Admin can access this database')]")

	public WebElement WarrningMessageforDBAccess;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class, 'x-btn x-form-file-btn x-unselectable x-btn-default-small')]//child::input")

	public WebElement UploadProfilePicture;
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button') and (text() = 'Done' or . = 'Done')]")

	public WebElement DoneButton;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'menuitem') and (text() = 'Change Password' or . = 'Change Password')]")

	public WebElement ChangePassword;
	@FindBy(how = How.XPATH, using = "//*[@class = 'toolbar-mainOptionsMenuButton-029 ai-image-center sch-user-avatar']")

	public WebElement VerifyProfilePicture;
	
	

	@FindBy(how = How.XPATH, using = "//*[(text() = 'Admin Group' or . = 'Admin Group')]")

	public WebElement li_AdminGroup;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button-') and (text() = 'Region' or . = 'Region')]")

	public WebElement Region;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button-') and (text() = 'User View' or . = 'User View')]")

	public WebElement UserView;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-component x-window-text x-box-item x-component-default')]")

	public WebElement LoginFailuretext;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button') and (text() = 'Department' or . = 'Department')]")

	public WebElement Department;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'admin-usersPane-grid-034')]//child::table//td[4]//div")

	public List<WebElement> UsersList;

	@FindBy(how = How.XPATH, using = "//div[contains(@class, 'admin-divisionPane-grid-035')]//child::table//tr//td[2]")

	public List<WebElement> DivisionList;
	@FindBy(how = How.XPATH, using = "//div[contains(@class, 'admin-organizationPane-grid-037')]//child::table//tr//td[2]")

	public List<WebElement> OrganizationList;
	@FindBy(how = How.XPATH, using = "//div[contains(@class, 'admin-regionPane-grid-036')]//child::table//tr//td[2]")

	public List<WebElement> RegionList;
	@FindBy(how = How.XPATH, using = "//div[contains(@class, 'admin-departmentPane-grid-046')]//child::table//tr//td[2]")

	public List<WebElement> DepartmentList;

	public void LandingOnAdminViewPage() throws InterruptedException {
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		PM.GetStarted.click();
		this.MenuButton.click();
		Actions actions = new Actions(driver);
		actions.moveToElement(this.ProfilePicture).build().perform();
		Thread.sleep(1000);
		this.AdminView.click();

	}
	
	public void ChangePasswordWindow() {
		this.oldpassword.sendKeys("Alivia21!");
		this.newpassword.sendKeys("Alivia2120!");
		this.cnewpassword.sendKeys("Alivia2120!");
		this.SubmitPassword.click();
		this.Okbutton.click();
	}

	public void CreateUser(String userName, String UserLocked, String ForcePasswordChange, String MakeSecurityAdmin,
			String MakeDatabaseAdmin) throws InterruptedException {

		this.Users.click();
		Thread.sleep(2000);
		this.userNameEmailID.sendKeys(userName + "@gmail.com");
		this.firstName.sendKeys(userName);
		this.lastName.sendKeys("lastName");
		this.Password.sendKeys("Alivia21!");
		this.ConfirmPassword.sendKeys("Alivia21!");
		this.preferredLanguage.click();
		this.preferredLanguage.sendKeys(Keys.ENTER);
		Actions action = new Actions(driver);
		action.moveToElement(this.UsersGroups, 75, 0).click().build().perform();
		Thread.sleep(2000);
		this.li_AdminGroup.click();
		this.userNameEmailID.click();
		
		if (UserLocked.equalsIgnoreCase("UserLocked")) {
			this.UserLocked.click();
		}
		if (ForcePasswordChange.equalsIgnoreCase("ForcePasswordChange")) {
			this.ForcePasswordChange.click();
		}
		if (MakeSecurityAdmin.equalsIgnoreCase("MakeSecurityAdmin")) {
			this.MakeSecurityAdmin.click();
		}
		if (MakeDatabaseAdmin.equalsIgnoreCase("MakeDatabaseAdmin")) {
			this.MakeDatabaseAdmin.click();
		}
		this.Create.click();
	}

	public void RemoveUser(String user) throws InterruptedException {
		this.Users.click();
		Thread.sleep(2000);
		for (WebElement el : UsersList) {
			if (el.getText().equals(user)) {
				el.click();
				break;
			}
		}
		this.Remove.click();
		Thread.sleep(2000);
		this.Yes.click();
	}
	public void LogoutUser() throws InterruptedException {
		Dimension d1 = new Dimension(1560, 978);
		driver.manage().window().setSize(d1);
		Thread.sleep(3000);
		this.UserView.click();
		Thread.sleep(3000);
		this.MenuButton.click();
		this.LogoutButton.click();
		
	}
	public int CountDivisionList() throws InterruptedException {
		this.Division.click();
		Thread.sleep(2000);
		return this.DivisionList.size();
	}

	public int CountOrganizationList() throws InterruptedException {
		this.Organization.click();
		Thread.sleep(2000);
		return this.OrganizationList.size();
	}

	public int CountRegionList() throws InterruptedException {
		this.Region.click();
		Thread.sleep(2000);
		return this.RegionList.size();
	}

	public int CountDepartmentList() throws InterruptedException {
		this.Department.click();
		Thread.sleep(2000);
		return this.DepartmentList.size();
	}

}
