package automationModels;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import automationUtils.utilityMethods;
import configuration.Configuration;

public class DashboardModel extends Configuration{
	
	@FindBy(how = How.XPATH, using = "//*[(text() = 'Dashboard' or . = 'Dashboard')]")

	public WebElement Dashboard;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class, 'dashboard-savedDashboards-grid-022')]//child::input")

	public WebElement SearchTabDashboard;
	
	@FindBy(how = How.XPATH, using = "//a[contains(@class, 'x-btn dashboard-panecenter-tBar-clearAll-btn-75')]")

	public WebElement ClearAllDashboard;
	
	@FindBy(how = How.XPATH, using = "//a[contains(@class, 'dashboard-panecenter-topbar-loadItemsButton-023')]")

	public WebElement LoadDashboardItemsButton;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'menuitem-') and (text() = 'Add Chart Item' or . = 'Add Chart Item')]")

	public WebElement AddChartItem;

	@FindBy(how = How.XPATH, using = "//a[contains(@class, 'dashboard-panecenter-topbar-saveButton-024')]")

	public WebElement saveButton;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class, 'dashboard-itemsWin-grid-026')]//child::input")

	public WebElement SearchTabOnAddDashboardItemWidow;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'messagebox-') and @type = 'text']")

	public WebElement InputNameDashboard;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'dashboard-savedDashboards-grid-022')]//child::table//tr//td[2]//div")

	public List<WebElement> DashboardList;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'dashboard-itemsWin-grid-026')]//child::table//tr//td[2]//div")

	public List<WebElement> AddDashboardItemsList;
	
	public int CountDashboard() throws InterruptedException {
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		PM.GetStarted.click();
		this.Dashboard.click();
		Thread.sleep(2000);
		this.ClearAllDashboard.click();
		Thread.sleep(2000);
		this.SearchTabDashboard.click();
		Thread.sleep(1000);
		this.SearchTabDashboard.sendKeys("AutoCreatedDashboard");
		Thread.sleep(2000);
		return this.DashboardList.size();
	}
	
	public void DragItemDropOnDashboardCanvas(String item) {
		for (WebElement el : AddDashboardItemsList) {

			if (el.getText().equals(item)) {
				Actions builder = new Actions(driver);

				Action dragAndDrop = builder.clickAndHold(el).moveByOffset(150, 0).release().build();
				dragAndDrop.perform();

				break;
			}
		}

	}
	
	public void CreateDashboardwithChartItem(String item) throws InterruptedException {
		
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		QueryBuilderModel QBM = PageFactory.initElements(driver, automationModels.QueryBuilderModel.class);
		
		PM.GetStarted.click();
		this.Dashboard.click();
		Thread.sleep(2000);
		this.LoadDashboardItemsButton.click();
		this.AddChartItem.click();
		this.SearchTabOnAddDashboardItemWidow.click();
		this.SearchTabOnAddDashboardItemWidow.sendKeys(item);
		Thread.sleep(2000);
		this.DragItemDropOnDashboardCanvas(item);
		new Actions(driver).moveToElement(this.saveButton).moveByOffset(-10, 0).click().perform();		
		this.InputNameDashboard.sendKeys("AutoCreatedDashboard");	
		utilityMethods.waitForVisibility(QBM.OkButtonQB);
		QBM.OkButtonQB.click();
		utilityMethods.waitForVisibility(QBM.OkButtonQB);
		QBM.OkButtonQB.click();
	}
	

}
