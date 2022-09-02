package automationModels;

import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import automationUtils.utilityMethods;
import configuration.Configuration;

public class UserManagementModel extends Configuration {

	@FindBy(how = How.XPATH, using = "//img[contains(@class, 'toolbar-mainOptionsMenuButton-029')]")

	public WebElement MenuButton;

	@FindBy(how = How.XPATH, using = "//div[@role='menu' and @aria-expanded='true']//a")

	List<WebElement> DropdownListA;

	@FindBy(how = How.XPATH, using = "//*[text() = 'Logout' or . = 'Logout']")

	public WebElement LogoutButton;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'textfield') and @type = 'password' and @name = 'oldpassword']")

	public WebElement oldPassword_Input;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'combo-') and @class = 'x-form-error-msg x-form-invalid-icon x-form-invalid-icon-default' and (text() = 'This field is required' or . = 'This field is required')]")

	public WebElement comboboxexclamationmark ;

	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'textfield') and @type = 'password' and @name = 'oldpassword']")

	public WebElement oldPassword_Div;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'textfield') and @type = 'password' and @name = 'oldpassword']/following::div[1]/div")

	public WebElement oldPassword_Error;

	@FindBy(how = How.XPATH, using = "//*[@id = 'password-cid-inputEl' and @type = 'password' and @name = 'newpassword']")

	public WebElement newPassword_Input;
	
	@FindBy(how = How.XPATH, using = "//*[@id = 'password-cid-inputEl' and @type = 'password' and @name = 'newpassword']/parent::div")

	public WebElement newPassword_Div;
	
	@FindBy(how = How.XPATH, using = "//*[@id = 'password-cid-inputEl' and @type = 'password' and @name = 'newpassword']/following::div[1]/div")

	public WebElement newPassword_Error;

	@FindBy(how = How.XPATH, using = "//*[@id = 'cpassword-cid-inputEl' and @type = 'password' and @name = 'cnewpassword']")

	public WebElement cNewPassword_Input;
	
	@FindBy(how = How.XPATH, using = "//*[@id = 'cpassword-cid-inputEl' and @type = 'password' and @name = 'cnewpassword']/parent::div")

	public WebElement cNewPassword_Div;
	
	@FindBy(how = How.XPATH, using = "//*[@id = 'cpassword-cid-inputEl' and @type = 'password' and @name = 'cnewpassword']/following::div[1]/div")

	public WebElement cNewPassword_Error;

	@FindBy(how = How.XPATH, using = "//a[starts-with(@id, 'button') and (text() = 'Submit Password' or . = 'Submit Password') and contains(@class,'x-btn-disabled')]")

	public WebElement SubmitPasswordDisabled;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button') and (text() = 'Submit Password' or . = 'Submit Password')]")

	public WebElement SubmitPassword;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'menuitem-') and (text() = 'Admin View' or . = 'Admin View')]")

	public WebElement AdminView;

	@FindBy(how = How.XPATH, using = "//div[contains(@class, 'x-panel-default-framed') and not(contains(@class,'x-hidden-offsets'))]")

	List<WebElement> AdminScreen;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button-') and (text() = 'Users' or . = 'Users')]")

	public WebElement Users;

	@FindBy(how = How.XPATH, using = "//div[@class='x-panel x-fit-item x-panel-default' and not(contains(@class,'x-hidden-offsets'))]//div[text()='User Details']")

	List<WebElement> UsersScreen;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'textfield-') and @type = 'text' and @name = 'userName']/parent::div")

	WebElement userNameEmailID_Div;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'textfield-') and @type = 'text' and @name = 'userName']")

	WebElement userNameEmailID_Input;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'textfield-') and @type = 'text' and @name = 'userName']/following::div[1]/div")

	WebElement userNameEmailID_Error_Div;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'textfield-') and @type = 'text' and @name = 'userName']/following::div[1]/div/ul")

	List<WebElement> userNameEmailID_Error;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'textfield-') and @type = 'text' and @name = 'title']/parent::div")

	WebElement title_Div;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'textfield-') and @type = 'text' and @name = 'title']")

	WebElement title_Input;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'textfield-') and @type = 'text' and @name = 'title']/following::div[1]/div")

	WebElement title_Error_Div;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'textfield-') and @type = 'text' and @name = 'title']/following::div[1]/div/ul")

	List<WebElement> title_Error;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'textfield-') and @type = 'text' and @name = 'firstName']/parent::div")

	WebElement firstName_Div;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-default') and not(contains(@class,'x-hidden-offsets'))]//a//span[text()='Create']")

	WebElement CreateModuleButton;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'textfield-') and @type = 'text' and @name = 'firstName']")

	WebElement firstName_Input;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'textfield-') and @type = 'text' and @name = 'firstName']/following::div[1]/div")

	WebElement firstName_Error_Div;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'textfield-') and @type = 'text' and @name = 'firstName']/following::div[1]/div/ul")

	List<WebElement> firstName_Error;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'textfield-') and @type = 'text' and @name = 'lastName']/parent::div")

	WebElement lastName_Div;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'textfield-') and @type = 'text' and @name = 'lastName']")

	WebElement lastName_Input;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'textfield-') and @type = 'text' and @name = 'lastName']/following::div[1]/div")

	WebElement lastName_Error_Div;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'textfield-') and @type = 'text' and @name = 'lastName']/following::div[1]/div/ul")

	List<WebElement> lastName_Error;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'textfield-') and @type = 'text' and @name = 'phoneNumber']/parent::div")

	WebElement phoneNumber_Div;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'textfield-') and @type = 'text' and @name = 'phoneNumber']")

	WebElement phoneNumber_Input;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'textfield-') and @type = 'text' and @name = 'phoneNumber']/following::div[1]/div")

	WebElement phoneNumber_Error_Div;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'textfield-') and @type = 'text' and @name = 'phoneNumber']/following::div[1]/div/ul")

	List<WebElement> phoneNumber_Error;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'textfield-') and @type = 'text' and @name = 'externalID']/parent::div")

	WebElement externalID_Div;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'textfield-') and @type = 'text' and @name = 'externalID']")

	WebElement externalID_input;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'textfield-') and @type = 'text' and @name = 'externalID']/following::div[1]/div")

	WebElement externalID_Error_Div;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'textfield-') and @type = 'text' and @name = 'externalID']/following::div[1]/div/ul")

	List<WebElement> externalID_Error;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'password-') and @type = 'password' and @name = 'password']/parent::div")

	WebElement password_Div;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'password-') and @type = 'password' and @name = 'password']")

	WebElement password_Input;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'password-') and @type = 'password' and @name = 'password']/following::div[1]/div")

	WebElement password_Error_Div;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'password-') and @type = 'password' and @name = 'password']/following::div[1]/div/ul")

	List<WebElement> password_Error;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'cpassword-') and @type = 'password' and @name = 'cpassword']/parent::div")

	WebElement cpassword_Div;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'cpassword-') and @type = 'password' and @name = 'cpassword']")

	WebElement cpassword_Input;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'cpassword-') and @type = 'password' and @name = 'cpassword']/following::div[1]/div")

	WebElement cpassword_Error_Div;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'cpassword-') and @type = 'password' and @name = 'cpassword']/following::div[1]/div/ul")

	List<WebElement> cpassword_Error;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'combo-') and @type = 'text' and @name = 'preferredLanguage']/parent::div[1]")

	WebElement prefferedLanguage_Div;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'combo-') and @type = 'text' and @name = 'preferredLanguage']/following::div[1]")

	WebElement prefferedLanguage_Dropdown;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'combo-') and @type = 'text' and @name = 'preferredLanguage']")

	WebElement prefferedLanguage_input;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'combo-') and @type = 'text' and @name = 'preferredLanguage']/following::div[2]/div")

	WebElement prefferedLanguage_Error_Div;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-default') and not(contains(@class,'x-hidden-offsets'))]//a//span[text()='Cancel']")

	WebElement Cancel;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'tagfield-') and @type = 'text' and @name = 'ugTags']/parent::li")

	WebElement userGroup_Div;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'tagfield-') and @type = 'text' and @name = 'ugTags']/following::div")

	WebElement userGroup_Dropdown;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'tagfield-') and @type = 'text' and @name = 'ugTags']")

	WebElement userGroup_Input;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'tagfield-') and @type = 'text' and @name = 'ugTags']/following::div[2]/div")

	WebElement userGroup_Error_Div;

	@FindBy(how = How.XPATH, using = "//ul[@data-ref='itemList']/li/div[1]")

	WebElement selectedUserGroup_Input;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-boundlist-floating')]//ul[@aria-hidden='false']/li")

	List<WebElement> DropdownListLi;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'checkbox') and @class = 'x-form-cb-label x-form-cb-label-default x-form-cb-label-after  ' and (text() = 'User Locked' or . = 'User Locked')]")

	WebElement UserLocked;

	@FindBy(how = How.XPATH, using = "//div[@id='checkbox-1982' and not(contains(@class,'checked'))]")

	WebElement UnselectedUserLocked;

	@FindBy(how = How.XPATH, using = "//div[@id='checkbox-1982' and contains(@class,'checked')]")

	WebElement SelectedUserLocked;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'checkbox') and @class = 'x-form-cb-label x-form-cb-label-default x-form-cb-label-after  ' and (text() = 'Force Password Change' or . = 'Force Password Change')]")

	WebElement ForcePasswordChange;

	@FindBy(how = How.XPATH, using = "//div[@id='checkbox-1983' and not(contains(@class,'checked'))]")

	WebElement UnselectedForcePasswordChange;

	@FindBy(how = How.XPATH, using = "//div[@id='checkbox-1983' and contains(@class,'checked')]")

	WebElement SelectedForcePasswordChange;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'checkbox') and @class = 'x-form-cb-label x-form-cb-label-default x-form-cb-label-after  ' and (text() = 'Make Security Admin' or . = 'Make Security Admin')]")

	WebElement MakeSecurityAdmin;

	@FindBy(how = How.XPATH, using = "//div[@id='checkbox-1984' and not(contains(@class,'checked'))]")

	WebElement UnselectedMakeSecurityAdmin;

	@FindBy(how = How.XPATH, using = "//div[@id='checkbox-1984' and contains(@class,'checked')]")

	WebElement SelectedMakeSecurityAdmin;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'checkbox') and @class = 'x-form-cb-label x-form-cb-label-default x-form-cb-label-after  ' and (text() = 'Make Database Admin' or . = 'Make Database Admin')]")

	WebElement MakeDatabaseAdmin;

	@FindBy(how = How.XPATH, using = "//div[@id='checkbox-1985' and not(contains(@class,'checked'))]")

	WebElement UnselectedMakeDatabaseAdmin;

	@FindBy(how = How.XPATH, using = "//div[@id='checkbox-1985' and contains(@class,'checked')]")

	WebElement SelectedMakeDatabaseAdmin;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button-') and (text() = 'Create' or . = 'Create')]")

	public WebElement Create;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button-') and (text() = 'Groups' or . = 'Groups')]")

	public WebElement Groups;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'textfield') and @type = 'text' and @name = 'name']")

	public WebElement NameField;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'textfield') and @type = 'text' and @name = 'description']")

	public WebElement DescriptionField;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button-') and (text() = 'Remove' or . = 'Remove')]")

	public WebElement Remove;

	@FindBy(how = How.XPATH, using = "//span[starts-with(@id, 'button-') and (text() = 'Yes' or . = 'Yes')]")

	public WebElement Yes;
	

	@FindBy(how = How.XPATH, using = "//span[starts-with(@id, 'button-') and (text() = 'No' or . = 'No')]")

	public WebElement No;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button-') and (text() = 'Division' or . = 'Division')]")

	public WebElement Division;

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
	
	@FindBy(how = How.XPATH, using = "//*[text() = 'Change Password' or . = 'Change Password']")

	public List<WebElement> ChangePasswordScreen;
	
	@FindBy(how = How.XPATH, using = "//*[text() = 'Password has been changed successfully...']")

	public List<WebElement> ChangedPasswordScreen;

	@FindBy(how = How.XPATH, using = "//*[@class = 'toolbar-mainOptionsMenuButton-029 ai-image-center sch-user-avatar']")

	public WebElement VerifyProfilePicture;

	@FindBy(how = How.XPATH, using = "//*[(text() = 'Admin Group' or . = 'Admin Group')]")

	public WebElement li_AdminGroup;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button-') and (text() = 'Region' or . = 'Region')]")

	public WebElement Region;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button-') and (text() = 'User View' or . = 'User View')]")

	public WebElement UserView;



	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button') and (text() = 'Department' or . = 'Department')]")

	public WebElement Department;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'combo') and @type = 'text' and @name = 'combooption' and @placeholder = 'Choose item ...']")

	public WebElement combooption;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'admin-usersPane-grid-034')]//child::table//td[4]//div")

	public List<WebElement> UsersList;

	@FindBy(how = How.XPATH, using = "//div[contains(@class, 'admin-divisionPane-grid-035')]//child::table//tr//td[2]")

	public List<WebElement> DivisionList;
	@FindBy(how = How.XPATH, using = "//div[@class='x-panel x-panel-default-framed x-fit-item']/div/div[2]/div[not(contains(@class,'x-hidden-offsets'))]//div[contains(@role,'grid')]//table//tr//td[2]")

	public List<WebElement> ModuleList;
	@FindBy(how = How.XPATH, using = "//div[contains(@class, 'admin-regionPane-grid-036')]//child::table//tr//td[2]")

	public List<WebElement> RegionList;
	@FindBy(how = How.XPATH, using = "//div[contains(@class, 'admin-departmentPane-grid-046')]//child::table//tr//td[2]")

	public List<WebElement> DepartmentList;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-boundlist x-boundlist-floating x-layer x-boundlist-default x-border-box')]//child::li")

	public List<WebElement> ComboOptionsList;

	@FindBy(how = How.XPATH, using = "//div[contains(@class, 'admin-view-group-left-panel-078')]//child::table//tr//td[2]//div")

	public List<WebElement> GroupsList;

	public void LandingOnAdminViewPage() {
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		PM.GetStarted.click();
		utilityMethods.visible(this.MenuButton, "GetStarted:Verify that Profile Button is present.");
		utilityMethods.clickable(this.MenuButton, "Get Started:Verify that Profile Button is clickable.");
		utilityMethods.list_Visible(this.MenuButton, 500, this.DropdownListA,
				"Get Started:Verify that dropdown list is present when click on Profile Button.");
		Actions actions = new Actions(driver);
		actions.moveToElement(this.ProfilePicture).build().perform();
		utilityMethods.time(1000);
		utilityMethods.list_Visible(this.AdminView, 500, this.AdminScreen,
				"Get Started:Verify that user navigate to the Admin view screen when click on Admin View Button.");
	}

	public void UserDetailFormValidation() {

		String userName = utilityMethods.randomString(6);
		// User
		utilityMethods.visible(this.Users, "Admin View:Verify that Users Button is present.");
		utilityMethods.clickable(this.Users, "Admin View:Verify that Users Button clickable.");
		utilityMethods.list_Visible(this.Users, 500, this.UsersScreen,
				"Admin View:Verfiy that user Navigates to the user screen when click on Users Button.");

		// User Name Email ID
		utilityMethods.visible(this.userNameEmailID_Div, "Admin View:Verify that User Name Email ID field is present.");
		utilityMethods.clickable(this.userNameEmailID_Input,
				"Admin View:Verify that User Name Email ID field is clickable.");
		utilityMethods.sendKeys_Input(this.userNameEmailID_Input, 500, "includeChar",
				"Admin View:Verify that User Name Email ID field allow user input alphabets, characters and special character.");

		// ... Email Validation .... //
		utilityMethods.verifyValidationFields("Invalid_Info", this.userNameEmailID_Input, userName,
				this.userNameEmailID_Error,
				"Admin View:Verify that error appear on the field when enter invalid Email 1 { " + userName + " }.");
		utilityMethods.verifyValidationFields("Invalid_Info", this.userNameEmailID_Input, userName + "@",
				this.userNameEmailID_Error,
				"Admin View:Verify that error appear on the field when enter invalid Email 2 { " + userName + "@ }.");
		utilityMethods.verifyValidationFields("Invalid_Info", this.userNameEmailID_Input, userName + "@gmail",
				this.userNameEmailID_Error,
				"Admin View:Verify that error appear on the field when enter invalid Email 3 { " + userName
						+ "@gmail }.");
		utilityMethods.verifyValidationFields("Invalid_Info", this.userNameEmailID_Input, userName + "@gmail.c",
				this.userNameEmailID_Error,
				"Admin View:Verify that error appear on the field when enter invalid Email 3 { " + userName
						+ "@gmail.c }.");
		utilityMethods.verifyValidationFields("Valid_Info", this.userNameEmailID_Input, userName + "@gmail.com",
				this.userNameEmailID_Error,
				"Admin View:Verify that No error appear on the field when enter valid Email { " + userName
						+ "@gmail.com }.");

		utilityMethods.verifyfieldmandatory(this.userNameEmailID_Input, 500, this.userNameEmailID_Error_Div,
				"Admin View:Verify that error appear on the field when field of UserName/Email is empty.");

		// Title
		utilityMethods.visible(this.title_Div, "Admin View:Verify that Title field is present.");
		utilityMethods.clickable(this.title_Input, "Admin View:Verify that Title field is clickable.");
		utilityMethods.sendKeys_Input(this.title_Input, 500, "includeChar",
				"Admin View:Verify that Title field allow user input alphabets, characters and special character.");

		// ... Title Validation ... //
		utilityMethods.verifyValidationFields("Invalid_Info", this.title_Input, userName + "!@", this.title_Error,
				"Admin View:Verify that error appear on the field when enter invalid Title.");
		utilityMethods.verifyValidationFields("Valid_Info", this.title_Input, userName, this.title_Error,
				"Admin View:Verify that No error appear on the field when enter valid Title.");

		// First Name
		utilityMethods.visible(this.firstName_Div, "Admin View:Verify that First Name field is present.");
		utilityMethods.clickable(this.firstName_Input, "Admin View:Verify that First Name field is clickable.");
		utilityMethods.sendKeys_Input(this.firstName_Input, 500, "includeChar",
				"Admin View:Verify that First Name field allow user input alphabets, characters and special character.");

		// ... First Name Validation ... //
		utilityMethods.verifyValidationFields("Invalid_Info", this.firstName_Input, userName + "!@",
				this.firstName_Error,
				"Admin View:Verify that error appear on the field when enter invalid First Name.");
		utilityMethods.verifyValidationFields("Valid_Info", this.firstName_Input, userName, this.firstName_Error,
				"Admin View:Verify that No error appear on the field when enter valid First Name.");

		utilityMethods.verifyfieldmandatory(this.firstName_Input, 500, this.firstName_Error_Div,
				"Admin View:Verify that error appear on the field when field of First Name is empty.");

		// Last Name
		utilityMethods.visible(this.lastName_Div, "Admin View:Verify that Last Name field is present.");
		utilityMethods.clickable(this.lastName_Input, "Admin View:Verify that Last Name field is clickable.");
		utilityMethods.sendKeys_Input(this.lastName_Input, 500, "includeChar",
				"Admin View:Verify that Last Name field allow user input alphabets, characters and special character.");

		// ... Last Name Validation ... //
		utilityMethods.verifyValidationFields("Invalid_Info", this.lastName_Input, userName + "!@", this.lastName_Error,
				"Admin View:Verify that error appear on the field when enter invalid Last Name.");
		utilityMethods.verifyValidationFields("Valid_Info", this.lastName_Input, userName, this.lastName_Error,
				"Admin View:Verify that No error appear on the field when enter valid Last Name.");

		utilityMethods.verifyfieldmandatory(this.lastName_Input, 500, this.lastName_Error_Div,
				"Admin View:Verify that error appear on the field when field of Last Name is empty.");

		// ... Phone Number
		utilityMethods.visible(this.phoneNumber_Div, "Admin View:Verify that Phone Number field is present.");
		utilityMethods.clickable(this.phoneNumber_Input, "Admin View:Verify that Phone Number field is clickable.");
		utilityMethods.sendKeys_Input(this.phoneNumber_Input, 500, "onlyInt",
				"Admin View:Verify that Phone Number field allow user input only integer");

		// ... Phone Number Validation ... //
		utilityMethods.verifyValidationFields("Invalid_Info", this.phoneNumber_Input, userName, this.phoneNumber_Error,
				"Admin View:Verify that error appear on the field when enter invalid Phone Number.");
		utilityMethods.verifyValidationFields("Valid_Info", this.phoneNumber_Input, "303", this.phoneNumber_Error,
				"Admin View:Verify that No error appear on the field when enter valid Phone Number.");

		// External ID
		utilityMethods.visible(this.externalID_Div, "Admin View:Verify that External ID field is present.");
		utilityMethods.clickable(this.externalID_input, "Admin View:Verify that External ID field is clickable.");
		utilityMethods.sendKeys_Input(this.externalID_input, 500, "includeChar",
				"Admin View:Verify that External ID field allow user input alphabets, characters and special character.");

		// Password
		utilityMethods.visible(this.password_Div, "Admin View:Verify that Password field is present.");
		utilityMethods.clickable(this.password_Input, "Admin View:Verify that Password field is clickable.");
		utilityMethods.sendKeys_Input(this.password_Input, 500, "includeChar",
				"Admin View:Verify that Password field allow user input alphabets, characters and special character.");

		// ... Password Validation ... //
		utilityMethods.verifyValidationFields("Valid_Info", this.password_Input, userName + "testA12!", this.password_Error,
				"Admin View:Verify that No error appear on the field when enter valid Password.");

		utilityMethods.verifyfieldmandatory(this.password_Input, 500, this.password_Error_Div,
				"Admin View:Verify that error appear on the field when field of Password is empty.");

		// Confirm Password
		utilityMethods.visible(this.cpassword_Div, "Admin View:Verify that Confirm Password field is present.");
		utilityMethods.clickable(this.cpassword_Input, "Admin View:Verify that Confirm Password field is clickable.");
		utilityMethods.sendKeys_Input(this.cpassword_Input, 500, "includeChar",
				"Admin View:Verify that Confirm Password field allow user input alphabets, characters and special character.");

		// ... Confirm Password Validation ... //
		utilityMethods.verifyValidationFields("Valid_Info", this.cpassword_Input, userName + "testA12!",
				this.cpassword_Error,
				"Admin View:Verify that No error appear on the field when enter valid Confirm Password.");

		utilityMethods.verifyfieldmandatory(this.cpassword_Input, 500, this.cpassword_Error_Div,
				"Admin View:Verify that error appear on the field when field of Confirm Password is empty.");

		// Prefered Language
		utilityMethods.visible(this.prefferedLanguage_Div,
				"Admin View:Verify that Preferred Language field is present.");
		utilityMethods.clickable(this.prefferedLanguage_Dropdown,
				"Admin View:Verify that Preffered Language field is clickable.");

		utilityMethods.verifyDropdownManadatory(this.prefferedLanguage_Dropdown, 500, this.userNameEmailID_Input,
				this.prefferedLanguage_Error_Div,
				"Admin View:Verify that error appear when field of Preffered Language Dropdown is empty.");

		utilityMethods.list_Visible(this.prefferedLanguage_Dropdown, 500, this.DropdownListLi,
				"Admin View:Verify that Preffered Language dropdown list is present when click on its dropdown.");
		utilityMethods.verifyDropdownOptionSelected(this.DropdownListLi, this.prefferedLanguage_input,
				"Admin View:Verify that selected dropdown option is present in the input field of Prefferd Language.");

		// User Group
		utilityMethods.visible(this.userGroup_Div, 
				"Admin View:Verify that User Group field is present.");
		utilityMethods.clickable(this.userGroup_Dropdown, 
				"Admin View:Verify that User Group field is clickable.");

		utilityMethods.verifyDropdownManadatory(this.userGroup_Dropdown, 500, this.userNameEmailID_Input,
				this.userGroup_Error_Div,
				"Admin View:Verify that error appear when field of User Group Dropdown is empty.");

		utilityMethods.list_Visible(this.userGroup_Dropdown, 500, this.DropdownListLi,
				"Admin View:Verify that User Group dropdown list is present when click on its dropdown.");
		utilityMethods.verifyDropdownOptionSelectedLi(this.DropdownListLi, this.selectedUserGroup_Input,
				"Admin View:Verify that selected dropdown option is present in the input field of UserGroup.");

		// User Locked

		utilityMethods.visible(this.UserLocked, "Admin View:Verify that User Locked checkbox is present.");
		utilityMethods.clickable(this.UserLocked, "Admin View:Verify that User Locked checkbox is clickable.");
		utilityMethods.clicked_elementVisible(this.UserLocked, 500, this.SelectedUserLocked,
				"Admin View:Verify that User Locked checkbox is selected when click on it.");
		utilityMethods.clicked_elementVisible(this.UserLocked, 500, this.UnselectedUserLocked,
				"Admin View:Verify that User Locked checkbox is unSelected when click selected one.");

		// Force Password Change

		utilityMethods.visible(this.ForcePasswordChange,
				"Admin View:Verify that Force Password Change checkbox is present.");
		utilityMethods.clickable(this.ForcePasswordChange,
				"Admin View:Verify that Force Password Change checkbox is clickable.");
		utilityMethods.clicked_elementVisible(this.ForcePasswordChange, 500, this.SelectedForcePasswordChange,
				"Admin View:Verify that Force Password Change checkbox is selected when click on it.");
		utilityMethods.clicked_elementVisible(this.ForcePasswordChange, 500, this.UnselectedForcePasswordChange,
				"Admin View:Verify that Force Password Change checkbox is unSelected when click selected one.");

		// Make Security Admin

		utilityMethods.visible(this.MakeSecurityAdmin,
				"Admin View:Verify that Make Security Admin checkbox is present.");
		utilityMethods.clickable(this.MakeSecurityAdmin,
				"Admin View:Verify that Make Security Admin checkbox is clickable.");
		utilityMethods.clicked_elementVisible(this.MakeSecurityAdmin, 500, this.SelectedMakeSecurityAdmin,
				"Admin View:Verify that Make Security Admin checkbox is selected when click on it.");
		utilityMethods.clicked_elementVisible(this.MakeSecurityAdmin, 500, this.UnselectedMakeSecurityAdmin,
				"Admin View:Verify that Make Security Admin checkbox is unSelected when click selected one.");

		// Make DataBase Admin

		utilityMethods.visible(this.MakeDatabaseAdmin,
				"Admin View:Verify that Make DataBase Admin checkbox is present.");
		utilityMethods.clickable(this.MakeDatabaseAdmin,
				"Admin View:Verify that Make DataBase Admin checkbox is clickable.");
		utilityMethods.clicked_elementVisible(this.MakeDatabaseAdmin, 500, this.SelectedMakeDatabaseAdmin,
				"Admin View:Verify that Make DataBase Admin checkbox is selected when click on it.");
		utilityMethods.clicked_elementVisible(this.MakeDatabaseAdmin, 500, this.UnselectedMakeDatabaseAdmin,
				"Admin View:Verify that Make DataBase Admin checkbox is unSelected when click selected one.");
		

	}

	public boolean ChangePasswordWindow() {
		this.oldPassword_Input.sendKeys("Alivia21!");
		this.newPassword_Input.sendKeys("Alivia2120!");
		this.cNewPassword_Input.sendKeys("Alivia2120!");
		this.SubmitPassword.click();
		this.Okbutton.click();
		utilityMethods.time(1000);
		if(this.ChangedPasswordScreen.size()==1) {
			return true;
		}
		return false;
	}

	public boolean CreateUser(String userName, String UserLocked, String ForcePasswordChange, String MakeSecurityAdmin,
			String MakeDatabaseAdmin)  {

		this.Users.click();
		utilityMethods.time(2000);
		this.userNameEmailID_Input.sendKeys(userName + "@gmail.com");
		this.firstName_Input.sendKeys(userName);
		this.lastName_Input.sendKeys("lastName");
		this.password_Input.sendKeys("Alivia21!");
		this.cpassword_Input.sendKeys("Alivia21!");
		this.prefferedLanguage_input.click();
		this.prefferedLanguage_input.sendKeys(Keys.ENTER);
		Actions action = new Actions(driver);
		action.moveToElement(this.userGroup_Input, 75, 0).click().build().perform();
		utilityMethods.time(2000);
		this.li_AdminGroup.click();
		this.userNameEmailID_Input.click();

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

		int BeforeCreate = this.ModuleList.size();
		System.out.println(BeforeCreate + "BeforeCreate");

		this.Create.click();
		utilityMethods.time(1000);

		int AfterCreate = this.ModuleList.size();
		System.out.println(AfterCreate + "AfterCreate");

		if (AfterCreate < BeforeCreate) {
			return true;
		}
		return false;
	}

	public void SelectComboOption(String Option) throws InterruptedException {
		for (WebElement el : ComboOptionsList) {
			if (el.getText().equals(Option)) {
				el.click();
				break;
			}
		}
	}

	public void ValidationModule(String ModuleValue, WebElement Module, String Option) throws InterruptedException {
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		
		utilityMethods.visible(Module, 
				"Admin View:Verify that" + ModuleValue + "button is visible");
		utilityMethods.clickable(Module, 
				"Admin View:Verify that" + ModuleValue + "button is clickable");
		utilityMethods.list_Visible(Module, 2000, ModuleList,
				"Admin View:Verify that clicking by " + ModuleValue + "list shows");

		int BeforeCreate = this.ModuleList.size();
		System.out.println(BeforeCreate + "BeforeCreate");



		utilityMethods.visible(Create, 
				"Admin View:Verify that create button is visible for " + ModuleValue);
		utilityMethods.clickable(Create, 
				"Admin View:Verify that create button is clickable for " + ModuleValue);
		utilityMethods.clicked_Single(Create, 2000, NameField,
				"verify that Create" + ModuleValue + "screen shows clciking on create button");
		utilityMethods.visible(NameField, 
				"Create " + ModuleValue + "Screen:verify that name filed is visisble");
		utilityMethods.clickable(NameField, 
				"Create " + ModuleValue + " Screen:verify that name filed is clickable");
		utilityMethods.verifyfieldmandatory(NameField, 500, PM.exclamationmark,
				"Create " + ModuleValue + "Screen:verify that name filed is mandatory");
		utilityMethods.sendKeys_Input(NameField,500,"includeChar",
				"Create " + ModuleValue + "Screen:verify that name filed let users input alphabets,numerics and special charcters.");
		utilityMethods.visible(DescriptionField,
				"Create " + ModuleValue + " Screen:verify that description filed is visisble");
		utilityMethods.clickable(DescriptionField,
				"Create " + ModuleValue + " Screen:verify that description filed is clickable");
		utilityMethods.verifyfieldmandatory(DescriptionField, 500, PM.exclamationmark,
				"Create " + ModuleValue + "Screen:verify that name description is mandatory");
		utilityMethods.verifyFieldInputs(DescriptionField);

		utilityMethods.visible(combooption, 
				"Create " + ModuleValue + " Screen:verify that dropdown is visisble");
		utilityMethods.clickable(combooption, 
				"Create " + ModuleValue + " Screen:verify that dropdown is clickable");

		
		utilityMethods.verifyDropdownManadatory(combooption, 500, DescriptionField, this.comboboxexclamationmark, 
				"Create "+ModuleValue+"Screen:verify that dropdown value is mandatory");
		this.combooption.click();
		this.SelectComboOption(Option);
		utilityMethods.visible(combooption, 
				"Create " + ModuleValue + " Screen:verify that create button is visisble");
		utilityMethods.clickable(combooption, 
				"Create " + ModuleValue + " Screen:verify that create button clickable");
		utilityMethods.visible(Cancel, 
				"Create " + ModuleValue + " Screen:verify that cancel button visisble");
		utilityMethods.clickable(Cancel, 
				"Create " + ModuleValue + "Screen:verify that cancel button clickable");
		utilityMethods.list_Visible(Cancel, 2000, ModuleList,
				"Create " + ModuleValue + " Screen:verify that " + ModuleValue + "list shows clicking cancel button");

	}

	public boolean CreateModule(String value, WebElement Module, String Option) throws InterruptedException {
		Module.click();
		Thread.sleep(2000);
		int BeforeCreate = this.ModuleList.size();
		System.out.println(BeforeCreate + "BeforeCreate");
		this.Create.click();
		Thread.sleep(2000);
		this.NameField.sendKeys(value);
		this.DescriptionField.sendKeys(value);
		this.combooption.click();
		this.SelectComboOption(Option);
		this.CreateModuleButton.click();
		Thread.sleep(2000);
		int AfterCreate = this.ModuleList.size();
		System.out.println(AfterCreate + "AfterCreate");
		if (AfterCreate > BeforeCreate) {

			return true;
		}
		return false;
	}

	public boolean CreateOrganization(String value) throws InterruptedException {
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		utilityMethods.visible(Organization, 
				"Admin View:Verify that Organization button is visible");
		utilityMethods.clickable(Organization, 
				"Admin View:Verify thatbutton is clickable");
		
		utilityMethods.list_Visible(Organization, 2000, ModuleList, "Admin View:Verify that clicking by Organization list shows");
		int BeforeCreate=this.ModuleList.size();
		System.out.println(BeforeCreate+ "BeforeCreate");
		Thread.sleep(2000);
		utilityMethods.visible(Create, 
				"Admin View:Verify that create button is visible for Organization");
		utilityMethods.clickable(Create, 
				"Admin View:Verify that create button is clickable for Organization");
		utilityMethods.clicked_Single(Create, 2000, NameField, "verify that Create Organization screen shows clciking on create button");
		utilityMethods.visible(NameField, 
				"Create Organization Screen:verify that name filed is visisble");
		utilityMethods.clickable(NameField, 
				"Create Organization Screen:verify that name filed is clickable");
		utilityMethods.verifyfieldmandatory(NameField, 500,PM.exclamationmark , "Create Organization Screen:verify that name filed is mandatory");
		utilityMethods.verifyFieldInputs(NameField);
	
		utilityMethods.visible(DescriptionField, 
				"Create Organization Screen:verify that description filed is visisble");
		utilityMethods.clickable(DescriptionField, 
				"Create Organization Screen:verify that description filed is clickable");
		utilityMethods.verifyfieldmandatory(DescriptionField, 500,PM.exclamationmark , "Create Organization Screen:verify that name description is mandatory");
		utilityMethods.verifyFieldInputs(DescriptionField);
		utilityMethods.visible(Cancel, 
				"Create Organization Screen:verify that cancel button visisble");
		utilityMethods.clickable(Cancel, 
				"Create Organization Screen:verify that cancel button clickable");
		this.NameField.clear();
		this.NameField.sendKeys(value);
		this.DescriptionField.clear();
		this.DescriptionField.sendKeys(value);
		utilityMethods.visible(CreateModuleButton, 
				"Create Organization Screen:verify that create button visisble");
		utilityMethods.clickable(CreateModuleButton, 
				"Create Organization Screen:verify that create button clickable");
		utilityMethods.list_Visible(CreateModuleButton, 2000, ModuleList, "Create Organization Screen:verify that Organization list shows clicking create button");
	
		int AfterCreate=this.ModuleList.size();
		System.out.println(AfterCreate+ "AfterCreate");
		if (AfterCreate>BeforeCreate) {
			
			return true; 
		}
		return false;
	}

	
		
	public boolean Remove(String value,String ModuleValue, WebElement Module,List<WebElement>  List) throws InterruptedException {
		
			Module.click();
			Thread.sleep(2000);
			int BeforeDelete=this.ModuleList.size();
			System.out.println(BeforeDelete+ "BeforeDelete");
			for (WebElement el : List) {
				if (el.getText().equals(value)) {
					el.click();
					break;
				}
			}
			utilityMethods.visible(Remove, 
					"Admin View:Verify that remove button is visible for "+ ModuleValue);
			utilityMethods.clickable(Remove, 
					"Admin View:Verify that remove button is clickable for "+ ModuleValue);
			utilityMethods.clicked_Single(Remove, 2000, Yes, "verify that confirmation window opens clicking remove button for"+ ModuleValue);
			utilityMethods.visible(No, 
					"confirmation window:Verify that NO button is visible for "+ ModuleValue);
			utilityMethods.clickable(No, 
					"confirmation window:Verify that NO button is clickable for "+ ModuleValue);
			utilityMethods.visible(Yes, 
					"confirmation window:Verify that NO button is visible for "+ ModuleValue);
			utilityMethods.clickable(Yes, 
					"confirmation window:Verify that NO button is clickable for "+ ModuleValue);
			utilityMethods.list_Visible(Yes, 2000, this.ModuleList, "verify that "+ ModuleValue+" list shows clicking on yes button");
			int AfterDelete=this.ModuleList.size();
			System.out.println(AfterDelete+ "AfterDelete");
			if (AfterDelete<BeforeDelete) {
			
			return true; 
		}
		return false;

	}

	public boolean LogoutUser() {
		LoginModel LM = PageFactory.initElements(driver, automationModels.LoginModel.class);
		Dimension d1 = new Dimension(1560, 978);
		driver.manage().window().setSize(d1);
		utilityMethods.time(300);
		this.UserView.click();
		utilityMethods.time(300);
		this.MenuButton.click();
		utilityMethods.time(300);
		this.LogoutButton.click();
		utilityMethods.time(1000);
		if(LM.loginScreen.size()==1) {
			return true;
		}
		return false;

	}

	public int CountDivisionList() throws InterruptedException {
		this.Division.click();
		Thread.sleep(2000);
		return this.ModuleList.size();
	}

	public int CountOrganizationList() throws InterruptedException {
		this.Organization.click();
		Thread.sleep(2000);
		return this.ModuleList.size();
	}

	public int CountRegionList() throws InterruptedException {
		this.Region.click();
		Thread.sleep(2000);
		return this.ModuleList.size();
	}

	public int CountDepartmentList() throws InterruptedException {
		this.Department.click();
		Thread.sleep(2000);
		return this.ModuleList.size();
	}

	public int CountGroupsList() throws InterruptedException {
		this.Groups.click();
		Thread.sleep(2000);
		return this.ModuleList.size();
	}

}
