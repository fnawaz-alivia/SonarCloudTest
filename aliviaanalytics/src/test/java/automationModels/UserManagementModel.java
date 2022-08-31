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

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'menuitem') and (text() = 'Logout' or . = 'Logout')]")

	public WebElement LogoutButton;
	
	
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'textfield') and @type = 'password' and @name = 'oldpassword']")

	public WebElement oldpassword;
	
	@FindBy(how = How.XPATH, using = "//*[@id = 'password-cid-inputEl' and @type = 'password' and @name = 'newpassword']")

	public WebElement newpassword;
	
	@FindBy(how = How.XPATH, using = "//*[@id = 'cpassword-cid-inputEl' and @type = 'password' and @name = 'cnewpassword']")

	public WebElement cnewpassword;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button') and (text() = 'Submit Password' or . = 'Submit Password')]")

	public WebElement SubmitPassword;
	
	

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'menuitem-') and (text() = 'Admin View' or . = 'Admin View')]")

	public WebElement AdminView;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class, 'x-panel-default-framed') and not(contains(@class,'x-hidden-offsets'))]")

	List<WebElement> UserScreen;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button-') and (text() = 'Users' or . = 'Users')]")

	public WebElement Users;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'textfield-') and @type = 'text' and @name = 'userName']/parent::div")

	WebElement userNameEmailID_Div;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'textfield-') and @type = 'text' and @name = 'userName']")

	WebElement userNameEmailID_Input;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'textfield-') and @type = 'text' and @name = 'title']/parent::div")

	WebElement title_Div;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'textfield-') and @type = 'text' and @name = 'title']")

	WebElement title_Input;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'textfield-') and @type = 'text' and @name = 'firstName']/parent::div")

	WebElement firstName_Div;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-default') and not(contains(@class,'x-hidden-offsets'))]//a//span[text()='Create']")

	WebElement CreateModuleButton;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'textfield-') and @type = 'text' and @name = 'firstName']")

	WebElement firstName_Input;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'textfield-') and @type = 'text' and @name = 'lastName']/parent::div")

	WebElement lastName_Div;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'textfield-') and @type = 'text' and @name = 'lastName']")

	WebElement lastName_Input;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'textfield-') and @type = 'text' and @name = 'phoneNumber']/parent::div")

	WebElement phoneNumber_Div;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'textfield-') and @type = 'text' and @name = 'phoneNumber']")

	WebElement phoneNumber_Input;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'textfield-') and @type = 'text' and @name = 'externalID']/parent::div")

	WebElement externalID_Div;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'textfield-') and @type = 'text' and @name = 'externalID']")

	WebElement externalID_input;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'password-') and @type = 'password' and @name = 'password']/parent::div")

	WebElement password_Div;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'password-') and @type = 'password' and @name = 'password']")

	WebElement password_input;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'cpassword-') and @type = 'password' and @name = 'cpassword']/parent::div")

	WebElement cpassword_Div;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'cpassword-') and @type = 'password' and @name = 'cpassword']")

	WebElement cpassword_input;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'combo-') and @type = 'text' and @name = 'preferredLanguage']/parent::div")

	WebElement prefferedLanguage_Div;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'combo-') and @type = 'text' and @name = 'preferredLanguage']")

	WebElement prefferedLanguage_input;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-default') and not(contains(@class,'x-hidden-offsets'))]//a//span[text()='Cancel']")

	WebElement Cancel;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'tagfield-') and @type = 'text' and @name = 'ugTags']/parent::li")

	WebElement userGroup_Div;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'tagfield-') and @type = 'text' and @name = 'ugTags']")

	WebElement userGroup_Input;

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
		utilityMethods.visible(this.MenuButton,
				"Verify that Profile button is present on Get Started screen.");
		this.MenuButton.click();
		Actions actions = new Actions(driver);
		actions.moveToElement(this.ProfilePicture).build().perform();
		utilityMethods.time(1000);
		utilityMethods.list_Visible(this.AdminView, 500, this.UserScreen, 
				"Verify that user navigate to the Admin view screen.");
	}
	public void UserProfile() {
		// User Name Email ID
		utilityMethods.visible(this.userNameEmailID_Div, 
				"Admin View:Verify that User Name Email ID field is present.");
		utilityMethods.clickable(this.userNameEmailID_Input,
				"Admin View:Verify that User Name Email ID field is clickable.");
		utilityMethods.sendKeys_Input(this.userNameEmailID_Div, 500, "includeChar",
				"Admin View:Verify that User Name Email ID field allow user input alphabets, characters and special character.");
		// Title
		utilityMethods.visible(this.title_Div, 
				"Admin View:Verify that Title field is present.");
		utilityMethods.clickable(this.userNameEmailID_Input,
				"Admin View:Verify that Title field is clickable.");
		utilityMethods.sendKeys_Input(this.userNameEmailID_Div, 500, "includeChar",
				"Admin View:Verify that Title field allow user input alphabets, characters and special character.");
		// First Name
		utilityMethods.visible(this.firstName_Div, 
				"Admin View:Verify that First Name field is present.");
		utilityMethods.clickable(this.firstName_Input,
				"Admin View:Verify that First Name field is clickable.");
		utilityMethods.sendKeys_Input(this.firstName_Input, 500, "includeChar",
				"Admin View:Verify that First Name field allow user input alphabets, characters and special character.");
		// Last Name
		utilityMethods.visible(this.lastName_Div, 
				"Admin View:Verify that Last Name field is present.");
		utilityMethods.clickable(this.lastName_Input,
				"Admin View:Verify that Last Name field is clickable.");
		utilityMethods.sendKeys_Input(this.lastName_Input, 500, "includeChar",
				"Admin View:Verify that Last Name field allow user input alphabets, characters and special character.");
		// Phone Number
		utilityMethods.visible(this.phoneNumber_Div, 
				"Admin View:Verify that Phone Number field is present.");
		utilityMethods.clickable(this.phoneNumber_Input,
				"Admin View:Verify that Phone Number field is clickable.");
		utilityMethods.sendKeys_Input(this.phoneNumber_Input, 500, "onlyInt",
				"Admin View:Verify that Phone Number field allow user input only integer");
		// External ID
		utilityMethods.visible(this.externalID_Div, 
				"Admin View:Verify that External ID field is present.");
		utilityMethods.clickable(this.externalID_input,
				"Admin View:Verify that External ID field is clickable.");
		utilityMethods.sendKeys_Input(this.externalID_input, 500, "includeChar",
				"Admin View:Verify that External ID field allow user input alphabets, characters and special character.");
		// Password
		utilityMethods.visible(this.password_Div, 
				"Admin View:Verify that Password field is present.");
		utilityMethods.clickable(this.externalID_input,
				"Admin View:Verify that Password field is clickable.");
		utilityMethods.sendKeys_Input(this.externalID_input, 500, "includeChar",
				"Admin View:Verify that Password field allow user input alphabets, characters and special character.");
		
		
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
		this.userNameEmailID_Input.sendKeys(userName + "@gmail.com");
		this.firstName_Input.sendKeys(userName);
		this.lastName_Input.sendKeys("lastName");
		this.password_input.sendKeys("Alivia21!");
		this.cpassword_input.sendKeys("Alivia21!");
		this.prefferedLanguage_input.click();
		this.prefferedLanguage_input.sendKeys(Keys.ENTER);
		Actions action = new Actions(driver);
		action.moveToElement(this.userGroup_Input, 75, 0).click().build().perform();
		Thread.sleep(2000);
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
		this.Create.click();
	}
	public void SelectComboOption(String Option) throws InterruptedException {
		for (WebElement el : ComboOptionsList) {
			if (el.getText().equals(Option)) {
				el.click();
				break;
			}
		}
	}
	
	public void ValidationModule(String value,WebElement Module,String Option) throws InterruptedException {
		utilityMethods.visible(Module, 
				"Admin View:Verify that"+ Module+ "button is visible");
		utilityMethods.clickable(Module, 
				"Admin View:Verify that"+ Module+ "button is clickable");
		utilityMethods.clickable(Module, 
				"Admin View:Verify that"+ Module+ "button is clickable");
		
		Module.click();
		Thread.sleep(2000);
		int BeforeCreate=this.ModuleList.size();
		System.out.println(BeforeCreate+ "BeforeCreate");
		this.Create.click();
		Thread.sleep(2000);
		this.NameField.sendKeys(value);
		this.DescriptionField.sendKeys(value);
		this.combooption.click();
		this.SelectComboOption(Option);
		this.CreateModuleButton.click();
		Thread.sleep(2000);
	}
	public boolean CreateModule(String value,WebElement Module,String Option) throws InterruptedException {
		Module.click();
		Thread.sleep(2000);
		int BeforeCreate=this.ModuleList.size();
		System.out.println(BeforeCreate+ "BeforeCreate");
		this.Create.click();
		Thread.sleep(2000);
		this.NameField.sendKeys(value);
		this.DescriptionField.sendKeys(value);
		this.combooption.click();
		this.SelectComboOption(Option);
		this.CreateModuleButton.click();
		Thread.sleep(2000);
		int AfterCreate=this.ModuleList.size();
		System.out.println(AfterCreate+ "AfterCreate");
		if (AfterCreate>BeforeCreate) {
			
			return true; 
		}
		return false;
	}
	
	public boolean CreateOrganization(String value) throws InterruptedException {
		this.Organization.click();
		Thread.sleep(2000);
		int BeforeCreate=this.ModuleList.size();
		System.out.println(BeforeCreate+ "BeforeCreate");
		this.Create.click();
		Thread.sleep(2000);
		this.NameField.sendKeys(value);
		this.DescriptionField.sendKeys(value);
		this.CreateModuleButton.click();
		int AfterCreate=this.ModuleList.size();
		System.out.println(AfterCreate+ "AfterCreate");
		if (AfterCreate>BeforeCreate) {
			
			return true; 
		}
		return false;
	}
	
		
	public boolean Remove(String value, WebElement Module,List<WebElement>  List) throws InterruptedException {
		
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
		this.Remove.click();
		Thread.sleep(2000);
		this.Yes.click();
		Thread.sleep(2000);
		int AfterDelete=this.ModuleList.size();
		System.out.println(AfterDelete+ "AfterDelete");
if (AfterDelete<BeforeDelete) {
			
			return true; 
		}
		return false;
		
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
