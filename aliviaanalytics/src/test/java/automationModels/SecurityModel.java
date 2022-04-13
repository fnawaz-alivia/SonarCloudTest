package automationModels;

import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import configuration.Configuration;

public class SecurityModel  extends Configuration{
	
	@FindBy(how = How.XPATH, using = "//img[contains(@class, 'toolbar-mainOptionsMenuButton-029')]")

	public WebElement MenuButton;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'menuitem') and (text() = 'Logout' or . = 'Logout')]")

	public WebElement LogoutButton;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'menuitem-') and (text() = 'Admin View' or . = 'Admin View')]")

	public WebElement AdminView;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button-') and (text() = 'Users' or . = 'Users')]")

	public WebElement Users;
	
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
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button-') and (text() = 'Organization' or . = 'Organization')]")

	public WebElement Organization;
	
	@FindBy(how = How.XPATH, using = "//*[(text() = 'Admin Group' or . = 'Admin Group')]")

	public WebElement li_AdminGroup;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button-') and (text() = 'Region' or . = 'Region')]")

	public WebElement Region;
	
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
	
	
	public void LandingOnAdminViewPage() {
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		PM.GetStarted.click();
		this.MenuButton.click();
		this.AdminView.click();
		
	}
	
	public void CreateUser(String userName) throws InterruptedException {
		this.Users.click();
		Thread.sleep(2000);
		this.userNameEmailID.sendKeys(userName+"@gmail.com");
		this.firstName.sendKeys(userName);
		this.lastName.sendKeys("lastName");
		this.Password.sendKeys("Alivia21!");
		this.ConfirmPassword.sendKeys("Alivia21!");
		this.preferredLanguage.click();
		this.preferredLanguage.sendKeys(Keys.ENTER);
		 Actions action = new Actions(driver);
         action.moveToElement(this.UsersGroups, 75, 0).click().build().perform();
         this.li_AdminGroup.click();
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

