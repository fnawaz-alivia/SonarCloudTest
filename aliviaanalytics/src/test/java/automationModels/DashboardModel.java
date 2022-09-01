package automationModels;

import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import automationUtils.utilityMethods;
import configuration.Configuration;

public class DashboardModel extends Configuration{
	public static ExtentTest test;
	String  DBNameValue = RandomStringUtils.randomAlphabetic(10);
	  String RenameDashboardName = RandomStringUtils.randomAlphabetic(10);
	@FindBy(how = How.XPATH, using = "//*[(text() = 'Dashboard' or . = 'Dashboard')]")

	public WebElement Dashboard;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class, 'dashboard-savedDashboards-grid-022')]//child::input")

	public WebElement SearchTabDashboard;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class, 'x-window x-message-box x-layer x-window-default x-closable x-window-closable x-window-default-closable x-border-box')]")

	public WebElement ErrorAlertMessage;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'menuitem') and (text() = 'Delete' or . = 'Delete')]")

	public WebElement RightDeleteOption;
	@FindBy(how = How.XPATH, using = "//div[text()='Configure Subject']/following::span[text()='OK']")

	public WebElement OKButtonConfigureSubject;
	
	@FindBy(how = How.XPATH, using = "//span[contains(@class,'fa-tasks')]")

	public WebElement createbutton;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'menuitem') and (text() = 'Rename' or . = 'Rename')]")

	public WebElement RightRenameOption;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'menuitem') and (text() = 'Add KPI Item' or . = 'Add KPI Item')]")

	public WebElement AddKPIItem;
	
	@FindBy(how = How.XPATH, using = "//*[@data-qtip = 'Add KPI' and @aria-label = 'Add KPI']")

	public WebElement AddKPIInWidget;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'combo-') and @type = 'text' and @placeholder = 'Please select data source']")

	public WebElement PleaseSelectDataSource;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class, 'dashboard-kpiWin-grid-028')]//child::table[1]//tr//td[4]")

	public WebElement MappedColumn;
	
	@FindBy(how = How.XPATH, using = "//*[(text() = 'amountpaid' or . = 'amountpaid')]")

	public WebElement AmountPaid;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class, 'dashboard-kpiWin-grid-028')]//child::table[1]//tr//td[5]")

	public WebElement Aggregation;
	
	@FindBy(how = How.XPATH, using = "//*[(text() = 'Average' or . = 'Average')]")

	public WebElement Average;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Enter Name ... ']")

	public WebElement InitiativeName;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Enter value']")

	public WebElement SelectTopValue;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Save Initiative']")

	public WebElement SaveInitiativeButton;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-text')]")

	public WebElement InitiativeResultText;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-text')]/following::span[text()='OK']")

	public WebElement OkButtonInitiativeResultText;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button-') and (text() = 'Apply' or . = 'Apply')]")

	public WebElement Apply;
	

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'menuitem-') and (text() = 'Add Data Source Item' or . = 'Add Data Source Item')]")

	public WebElement AddDataSourceItem;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'menuitem-') and (text() = 'Create Initiative' or . = 'Create Initiative')]")

	public WebElement CreateInitiative;
	@FindBy(how = How.XPATH, using = "//a[contains(@class, 'x-btn dashboard-panecenter-tBar-clearAll-btn-75')]")

	public WebElement ClearAllDashboard;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class, 'dashboard-kpiWin-grid-028')]//child::table[1]//tr//td[3]")

	public WebElement LabelKPI;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'textfield-') and @type = 'text' and @placeholder = 'Please enter KPI title']")

	public WebElement PleaseEnterKPITitle;
	
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
	
	@FindBy(how = How.XPATH, using = "//*[(text() = 'Sum' or . = 'Sum')]")

	public WebElement Li_Sum;
	
	@FindBy(how = How.XPATH, using = "//*[(text() = 'Min' or . = 'Min')]")

	public WebElement Li_Min;
	
	@FindBy(how = How.XPATH, using = "//*[(text() = 'Max' or . = 'Max')]")

	public WebElement Li_Max;
	
	
	@FindBy(how = How.XPATH, using = "//*[(text() = 'Count' or . = 'Count')]")

	public WebElement Li_Count;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'dashboard-savedDashboards-grid-022')]//child::table//tr//td[2]//div")

	public List<WebElement> DashboardList;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'dashboard-itemsWin-grid-026')]//child::table//tr//td[2]//div")

	public List<WebElement> AddDashboardItemsList;
	
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'tool-') and (text() = '' or . = '') and @data-qtip = 'KPI Items Setup']")

	public List<WebElement>KPIItemsSetupList;
	
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
	
	public void CreateDashboardAndAddKPIInWidgets(String item) throws InterruptedException {
		
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		QueryBuilderModel QBM = PageFactory.initElements(driver, automationModels.QueryBuilderModel.class);
		PM.GetStarted.click();
		
		test = report.createTest("Side Pane: Verify that Dashboard Button is present in side pane");
		if (this.Dashboard.isDisplayed()) {
			test.log(Status.PASS, " The Dashboard Button is present in side pane");
		} else {
			test.log(Status.FAIL, " The Dashboard Button is not present in side pane");
		}
		test = report.createTest("Side Pane: Verify that Dashboard Button is clickable");
		if (this.Dashboard.isEnabled()) {
			test.log(Status.PASS, " Dashboard Button is clickable");
		} else {
			test.log(Status.FAIL, "Dashboard Button is not clickable");
		}
		
		test = report.createTest("Side Pane: Verify that clicking on Dashboard Button navigates Dashboard screen");
		this.Dashboard.click();
		Thread.sleep(2000);
		if (this.LoadDashboardItemsButton.isDisplayed()) {
			test.log(Status.PASS, " clicking on Charting Button navigates to Charting screen");
		} else {
			test.log(Status.FAIL, " clicking on Charting Button doesn't navigate to Charting screen");
		}
		
		Thread.sleep(2000);
		test = report.createTest("Verify that Load Dashboard items works.");
		this.LoadDashboardItemsButton.click();
		test.log(Status.PASS, "Load Dashboard items works");
		test = report.createTest("Dashboard Items - Verify that Add KPI item button work");
		this.AddKPIItem.click();
		test.log(Status.PASS, "The Add KPI item button works");
		test = report.createTest("Add Dashboard Item - Verify that Select Item type drop down list works.");
		this.SearchTabOnAddDashboardItemWidow.click();
		test.log(Status.PASS, "Select Item type drop down list works.");
		test = report.createTest("Add Dashboard Item - Verify that Select Item type search for items work.");
		this.SearchTabOnAddDashboardItemWidow.sendKeys(item);
		test.log(Status.PASS, "Select Item type search for items work.");
		Thread.sleep(2000);
		test = report.createTest("Add Dashboard Item - KPI - Verify that KPI Widget can be dragged and dropped in workspace.");
		test = report.createTest("Add Dashboard Item - KPI - Verify that Add Guage KPI can be dragged and dropped in workspace.");
		test = report.createTest("Add Dashboard Item - KPI - Verify that Add Text KPI can be dragged and dropped in workspace.");
		this.DragItemDropOnDashboardCanvas(item);
		test.log(Status.PASS, "The User is able to drag and drop the items");
		test = report.createTest("Verfy the User is able to add KPI in KPI widget ");
		this.AddKPIInWidget.click();
		test.log(Status.PASS, "The User is able to add KPI in KPI widget ");
		this.AddKPIInWidget.click();
		this.AddKPIInWidget.click();
		this.AddKPIInWidget.click();
		this.AddKPIInWidget.click();
		Thread.sleep(2000);
		test = report.createTest("Verfy KPI - Configure KPI Input window open clicking on configurations button ");
		this.KPIItemsSetupList.get(1).click();
		test.log(Status.PASS, "Configure KPI Input window opens");
		Thread.sleep(2000);
		test = report.createTest("KPI - Configure KPI Input - Verify KPI Label is editable");
		this.PleaseEnterKPITitle.sendKeys("lableKPIAvrg");
		test.log(Status.PASS, "KPI Label is editable");
		test = report.createTest("KPI - Configure KPI Input - Verify Data Sources are available in drop down list.");
		this.PleaseSelectDataSource.sendKeys("Automation1 - Dental01");
		test.log(Status.PASS, "Data Sources are available in drop down list");
		test = report.createTest("KPI - Configure KPI Input - Verify Data Source can be selected.");
		this.PleaseSelectDataSource.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		test.log(Status.PASS, "The User is able to select the Data Source");
		test = report.createTest("KPI - Configure KPI Input - Label can be edited.");
		this.LabelKPI.click();
		utilityMethods.SetTextwithActionClass(this.LabelKPI, "lableKPIAvrg");
		Thread.sleep(2000);
		test.log(Status.PASS, "Label can be edited");
		utilityMethods.doubleClick(this.MappedColumn);
		this.AmountPaid.click();
		test = report.createTest("KPI - Configure KPI Input - Aggregation drop down list contain all the aggregated functions.");
		utilityMethods.doubleClick(this.Aggregation);
		test.log(Status.PASS, "Aggregation drop down list contain all the aggregated functions");
		test = report.createTest("KPI - Configure KPI Input -Verify the user can select average aggregation function.");
		this.Average.click();
		test.log(Status.PASS, "the user is able to select average aggregation function.");
		test = report.createTest("KPI - Configure KPI Input - Verify the apply button works.");
		this.Apply.click();
		test.log(Status.PASS, "The apply button works");
		this.KPIItemsSetupList.get(2).click();
		Thread.sleep(2000);
		this.PleaseEnterKPITitle.sendKeys("lableKPICount");
		this.PleaseSelectDataSource.sendKeys("Automation1 - Dental01");
		this.PleaseSelectDataSource.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		this.LabelKPI.click();
		utilityMethods.SetTextwithActionClass(this.LabelKPI, "lableKPICount");
		Thread.sleep(2000);
		utilityMethods.doubleClick(this.MappedColumn);
		this.AmountPaid.click();
		utilityMethods.doubleClick(this.Aggregation);
		test = report.createTest("KPI - Configure KPI Input -Verify the user can select count aggregation function.");
		this.Li_Count.click();
		test.log(Status.PASS, "the user is able to select count aggregation function.");
		this.Apply.click();
		this.KPIItemsSetupList.get(3).click();
		Thread.sleep(2000);
		this.PleaseEnterKPITitle.sendKeys("lableKPISum");
		this.PleaseSelectDataSource.sendKeys("Automation1 - Dental01");
		this.PleaseSelectDataSource.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		this.LabelKPI.click();
		utilityMethods.SetTextwithActionClass(this.LabelKPI, "lableKPISum");
		Thread.sleep(2000);
		utilityMethods.doubleClick(this.MappedColumn);
		this.AmountPaid.click();
		utilityMethods.doubleClick(this.Aggregation);
		test = report.createTest("KPI - Configure KPI Input -Verify the user can select sum aggregation function.");
		this.Li_Sum.click();
		test.log(Status.PASS, "the user is able to select sum aggregation function.");
		this.Apply.click();
		this.KPIItemsSetupList.get(4).click();
		Thread.sleep(2000);
		this.PleaseEnterKPITitle.sendKeys("lableKPIMin");
		this.PleaseSelectDataSource.sendKeys("Automation1 - Dental01");
		this.PleaseSelectDataSource.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		this.LabelKPI.click();
		utilityMethods.SetTextwithActionClass(this.LabelKPI, "lableKPIMin");
		Thread.sleep(2000);
		utilityMethods.doubleClick(this.MappedColumn);
		this.AmountPaid.click();
		utilityMethods.doubleClick(this.Aggregation);
		test = report.createTest("KPI - Configure KPI Input -Verify the user can select min aggregation function.");
		this.Li_Min.click();
		test.log(Status.PASS, "the user is able to select min aggregation function.");
		this.Apply.click();
		this.KPIItemsSetupList.get(5).click();
		Thread.sleep(2000);
		this.PleaseEnterKPITitle.sendKeys("lableKPIMax");
		this.PleaseSelectDataSource.sendKeys("Automation1 - Dental01");
		this.PleaseSelectDataSource.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		this.LabelKPI.click();
		utilityMethods.SetTextwithActionClass(this.LabelKPI, "lableKPIMax");
		Thread.sleep(2000);
		utilityMethods.doubleClick(this.MappedColumn);
		this.AmountPaid.click();
		utilityMethods.doubleClick(this.Aggregation);
		test = report.createTest("KPI - Configure KPI Input -Verify the user can select max aggregation function.");
		this.Li_Max.click();
		test.log(Status.PASS, "the user is able to select max aggregation function.");
		this.Apply.click();
		test = report.createTest("KPI - Configure KPI Input -Verify the user can save dashboard.");
	    new Actions(driver).moveToElement(this.saveButton).moveByOffset(-10, 0).click().perform();	
	    
		this.InputNameDashboard.sendKeys(DBNameValue);	
		System.out.println(DBNameValue);
		utilityMethods.waitForVisibility(QBM.OkButtonQB);
		QBM.OkButtonQB.click();
		utilityMethods.waitForVisibility(QBM.OkButtonQB);
		QBM.OkButtonQB.click();
		test.log(Status.PASS, "The user is able to save the dashoboard ");
		this.SearchTabDashboard.click();
		Thread.sleep(1000);
		test = report.createTest("Verify the search tab works for saved dashboads");
		this.SearchTabDashboard.sendKeys(DBNameValue);
		Thread.sleep(2000);
		test.log(Status.PASS, "the search tab works for saved dashboads");
		System.out.println(this.DashboardList.size());
		
	}
	
	public void DeleteDashboard() throws InterruptedException {
	try {	
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		QueryBuilderModel QBM = PageFactory.initElements(driver, automationModels.QueryBuilderModel.class);
		this.SearchTabDashboard.click();
		this.SearchTabDashboard.clear();
		Thread.sleep(1000);
		this.SearchTabDashboard.sendKeys(RenameDashboardName);
		System.out.println(RenameDashboardName);
		Thread.sleep(2000);
		int listSizebeforeDelete= this.DashboardList.size();
        this.RightClickOnDashboardName(RenameDashboardName);
        Thread.sleep(2000);
        this.RightDeleteOption.click();
        Thread.sleep(4000);
        PM.YesButton.click();
		Thread.sleep(2000);
		utilityMethods.waitForVisibility(QBM.OkButtonQB);
		QBM.OkButtonQB.click();
        test = report.createTest("Verify the user is able to delete the dashbaord ");
        int listSizeafterdelete= this.DashboardList.size();
        
       if (listSizebeforeDelete> listSizeafterdelete) {
    	   test.log(Status.PASS, "The user is able to delete the dashbaord");
    	   System.out.println("The user is  able to delete the dashbaord");
       }
       
       else {
    	   test.log(Status.FAIL, "The user is not able to delete the dashbaord");  
    	   System.out.println("The user is not  able to delete the dashbaord");
       }
	}
	catch(Exception e)
	{
	    test = report.createTest("Verify the user is able to delete the dashbaord ");
		System.out.println("The user is not  able to delete the dashbaord");
		test.log(Status.FAIL, "The user is not able to delete the dashbaord"); 
	}
	
	}
	
public void ReNameDashboard() throws InterruptedException {
	    QueryBuilderModel QBM = PageFactory.initElements(driver, automationModels.QueryBuilderModel.class);
	
		this.SearchTabDashboard.click();
		this.SearchTabDashboard.clear();
		Thread.sleep(1000);
		this.SearchTabDashboard.sendKeys(DBNameValue);
		Thread.sleep(2000);
        this.RightClickOnDashboardName(DBNameValue);
        Thread.sleep(2000);
         this.RightRenameOption.click();
        Thread.sleep(2000);
        test = report.createTest("Verify the user is able to rename the dashbaord ");
        this.InputNameDashboard.clear();
        Thread.sleep(2000);
         this.InputNameDashboard.sendKeys(RenameDashboardName);
         QBM.OkButtonQB.click();
         Thread.sleep(2000);
         
	try {
			
			boolean ErrorAlertBox = this.ErrorAlertMessage.isDisplayed();
			String ErrorAlertBoxText =this.ErrorAlertMessage.getText();
			System.out.println(ErrorAlertBoxText);
			if (ErrorAlertBox==true) {
				test.log(Status.FAIL, "The user is not able to  rename the dashboad ");
				QBM.OkButtonQB.click();	
			}
			
		}
		catch(Exception e)
		{
			System.out.println("No Error alert is shown for renamed dashboard");
		}
         this.SearchTabDashboard.click();
         this.SearchTabDashboard.clear();
 		Thread.sleep(1000);
 		this.SearchTabDashboard.sendKeys(RenameDashboardName);
 		Thread.sleep(5000);
 		System.out.println(this.DashboardList.size());
       
	}
	
	public void RightClickOnDashboardName(String DBName) {

		for (WebElement el : DashboardList) {

			if (el.getText().equals(DBName)) {
				  new Actions(driver).contextClick(el).perform();

			        break;
			    }
			}

	}
	public void LoadDashboard(String DBName) {

		for (WebElement el : DashboardList) {

			if (el.getText().equals(DBName)) {
				  new Actions(driver).doubleClick(el).perform();

			        break;
			    }
			}

	}
	
public void CreateDashboardForInitiative(String OutputDSName,String OutputDSName1,String DashboardName, String InitiativeName , String SelectTop) throws InterruptedException {
		
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		QueryBuilderModel QBM = PageFactory.initElements(driver, automationModels.QueryBuilderModel.class);
		PM.GetStarted.click();
		
		this.Dashboard.click();
		Thread.sleep(2000);
		this.LoadDashboardItemsButton.click();

		this.AddDataSourceItem.click();

		this.SearchTabOnAddDashboardItemWidow.click();

		this.SearchTabOnAddDashboardItemWidow.sendKeys(OutputDSName);

		Thread.sleep(2000);

		this.DragItemDropOnDashboardCanvas(OutputDSName);
		
		this.SearchTabOnAddDashboardItemWidow.click();
		this.SearchTabOnAddDashboardItemWidow.clear();
		this.SearchTabOnAddDashboardItemWidow.sendKeys(OutputDSName1);

		Thread.sleep(2000);

		this.DragItemDropOnDashboardCanvas(OutputDSName1);
		
	    new Actions(driver).moveToElement(this.saveButton).moveByOffset(-10, 0).click().perform();	
	    
		this.InputNameDashboard.sendKeys(DashboardName);	
		System.out.println(DashboardName);
		utilityMethods.waitForVisibility(QBM.OkButtonQB);
		QBM.OkButtonQB.click();
		utilityMethods.waitForVisibility(QBM.OkButtonQB);
		QBM.OkButtonQB.click();
	
		this.SearchTabDashboard.click();
		Thread.sleep(1000);
	
		this.SearchTabDashboard.sendKeys(DashboardName);
		Thread.sleep(2000);

		System.out.println(this.DashboardList.size());
		this.LoadDashboard(DashboardName);
		Thread.sleep(2000);
		Dimension d1 = new Dimension(1560, 978);
		driver.manage().window().setSize(d1);
		Thread.sleep(2000);
		this.createbutton.click();
		this.CreateInitiative.click();
		Dimension d = new Dimension(1360, 978);
		// Resize the current window to the given dimension
		driver.manage().window().setSize(d);
		Thread.sleep(5000);
		utilityMethods.waitForVisibility(this.OKButtonConfigureSubject);
		this.OKButtonConfigureSubject.click();
		Thread.sleep(2000);
		this.InitiativeName.clear();
		this.InitiativeName.sendKeys(InitiativeName);
		this.SelectTopValue.sendKeys(SelectTop);
		Thread.sleep(2000);
		this.SaveInitiativeButton.click();
		utilityMethods.waitForVisibility(this.InitiativeResultText);
		System.out.println(this.InitiativeResultText.getText());
		this.OkButtonInitiativeResultText.click();
		
	}

}
