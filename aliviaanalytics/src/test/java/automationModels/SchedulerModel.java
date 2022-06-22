package automationModels;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import automationUtils.utilityMethods;
import configuration.Configuration;

public class SchedulerModel extends Configuration{
	public int index;
	public static ExtentTest test;
	@FindBy(how = How.XPATH, using = "//*[(text() = 'Scheduler' or . = 'Scheduler')]")

	public WebElement Scheduler;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button-') and (text() = 'Process' or . = 'Process')]")

	public WebElement Process;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'textfield-') and @type = 'text' and @placeholder = 'Enter Name']")

	public WebElement ProcessEditorEnterName;
	
	@FindBy(how = How.XPATH, using = "//*[(text() = 'Tasks' or . = 'Tasks')]")

	public WebElement Tasks;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'combo-') and @type = 'text' and @placeholder = 'Choose Task Type ...']")

	public WebElement ChooseTaskType;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'ext-') and (text() = 'Model' or . = 'Model')]")

	public WebElement Li_Model;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'combo-') and @type = 'text' and @placeholder = 'Choose Task Item ...']")

	public WebElement ChooseTaskItem;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button') and (text() = 'Add to List' or . = 'Add to List')]")

	public WebElement AddtoList;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button-') and (text() = 'Save' or . = 'Save')]")

	public WebElement ProcessEditorSave;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'gridcolumn-') and (text() = 'Last Executed On' or . = 'Last Executed On')]")

	public WebElement LastExecutedOn;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class, 'processSchedulerleft')]//child::table//tr//td[2]//div")

	public List<WebElement> SchedulersList;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button-') and (text() = 'Execute Now' or . = 'Execute Now')]")

	public WebElement ExecuteNow;
	
	@FindBy(how = How.XPATH, using = "//a[contains(@class, 'schedule-scheduleEditorWindow-removeButton-048')]")

	public WebElement ProcessEditorRemove;
	
	public void LandingOnSchedulerPage() throws InterruptedException {
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		PM.GetStarted.click();
		Thread.sleep(2000);
		test = report.createTest("Verify the user is able to access scheduler screen ");
		this.Scheduler.click();
		Thread.sleep(2000);
		test.log(Status.PASS, "The user is able to access scheduler screen ");
	}
	
	public void GetIndexOfScheduler(String Scheduler) {
		List<String> AllSchedulers = new ArrayList<String>();

		for (int i = 0; i < SchedulersList.size(); i++) {

			AllSchedulers.add(SchedulersList.get(i).getText());
		}
		 index = AllSchedulers.indexOf(Scheduler);
		System.out.println(index);
	}
	
	public void CreateProcess() throws InterruptedException {
		QueryBuilderModel QBM = PageFactory.initElements(driver, automationModels.QueryBuilderModel.class);
		new Actions(driver).moveToElement(this.Scheduler).moveByOffset(150, 0).click().perform();
		this.Process.click();
		Thread.sleep(2000);
		String schdularname = RandomStringUtils.randomAlphabetic(10);
		test = report.createTest("Verify the user is able to enter scheduler name ");
		this.ProcessEditorEnterName.sendKeys(schdularname);
		test.log(Status.PASS, "The user is able to enter scheduler name ");
		test = report.createTest("Process Editor- Verify Window switches to tasks clicking on tasks ");
		this.Tasks.click();
		test.log(Status.PASS, "Window switches to tasks clicking on tasks ");
		test = report.createTest("Process Editor- Verify Drop down Task type works ");
		this.ChooseTaskType.click();
		test.log(Status.PASS, "The Drop down Task type works  ");
		test = report.createTest("Verify the user is able to select Model Type ");
		this.Li_Model.click();
		test.log(Status.PASS, "The user is able to select Model Type");
		test = report.createTest("Process Editor- verify the user can choose the task item");
		this.ChooseTaskItem.click();
		this.ChooseTaskItem.sendKeys("R Operator");
		this.ChooseTaskItem.sendKeys(Keys.ENTER);
		test.log(Status.PASS, "The user can choose the task item");
		test = report.createTest("Process Editor-  Verify the add to list button works ");
		this.AddtoList.click();
		test.log(Status.PASS, "The add to list button works");
		Thread.sleep(2000);
		test = report.createTest("Process Editor-  verify the save button works  ");
		this.ProcessEditorSave.click();
		test.log(Status.PASS, "The save button works ");
		Thread.sleep(2000);
		test = report.createTest("Verify the process are sorting by clicking on last execution column");
		this.LastExecutedOn.click();
		test.log(Status.PASS, "The process are sorted by clicking on last execution column");
		test = report.createTest("Verify the user is able to access Process configure window ");
		WebElement ele = driver.findElement(By.xpath(("//div[contains(@class, 'processSchedulerleft')]//child::table['"+index+"'+'"+1+"']//tr//td[6]//div//img[2]")));
		new Actions(driver).moveToElement(ele).click().perform();
		Thread.sleep(5000);
		test.log(Status.PASS, " The user is able to access Process configure window ");
		test = report.createTest("Verify the user is able to execute the process");
		this.ExecuteNow.click();
		test.log(Status.PASS, "The user is able to execute the process");
		Thread.sleep(10000);
		utilityMethods.waitForVisibility(QBM.OkButtonQB);
		QBM.OkButtonQB.click();
		this.LastExecutedOn.click();
		test = report.createTest("Verify the Processs execution result");
		WebElement ele1 = driver.findElement(By.xpath(("//div[contains(@class, 'processSchedulerleft')]//child::table['"+index+"'+'"+1+"']//tr//td[5]//div")));
		System.out.println(ele1.getText());
		
		while (ele1.getText().equals("Running")) {
			Thread.sleep(2000);
		}

		System.out.println(ele1.getText());
		if (ele1.getText().equals("Success")) {
			test.log(Status.PASS, "The Process is executed scuccessfully");
		}
		else if (ele1.getText().equals("Error")) {
			test.log(Status.FAIL, "There is an issue in execution of proces");
		}
		
	}
	
	
}
