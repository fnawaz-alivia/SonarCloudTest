package configuration;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import automationModels.LoginModel;



public class Configuration {
	
	public static  WebDriver driver;
	public static ExtentReports report;
	
	public  static void  BConfiguration() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setCapability("ACCEPT_INSECURE_CERTS", true);
		//options.addArguments("--headless");
		 driver = new ChromeDriver(options);
		Dimension d = new Dimension(1360, 978);
		//Resize the current window to the given dimension
		driver.manage().window().setSize(d);	
		 driver.get("http://localhost:8080/ai-web/application.jsp");
		
		
	}

	public static void LoginApplication() throws InterruptedException {
		LoginModel LM = PageFactory.initElements(driver, automationModels.LoginModel.class);
		LM.LoginFormFill("admin@gmail.com", "Faisal@464");
		LM.loginbutton.click();
		
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		Configuration.driver = driver;
	}
	@BeforeSuite(alwaysRun = true)
	public static void startTest()
	{
	report = new ExtentReports();
	ExtentHtmlReporter reporter=  new ExtentHtmlReporter("./Reports/FWA.html");
	report.attachReporter(reporter);
	}
	@AfterSuite(alwaysRun = true)
	public static void endTest()
	{

	report.flush();
	}

}
