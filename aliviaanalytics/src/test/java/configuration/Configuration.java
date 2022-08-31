package configuration;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import automationModels.LoginModel;
import automationModels.ProjectModel;
import automationUtils.utilityMethods;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Configuration {

	public static WebDriver driver;
	public static ExtentReports report;

	public static String username;
	public static String url;
	public static String password;
	public static String test1username;
	public static String test1password;
	public static String instanceName;
	public static void BConfiguration() {

		try {
			JSONParser jsonParser = new JSONParser();
			FileReader reader = new FileReader(System.getProperty("user.dir") + "\\src\\datafiles\\login.json");
			Object obj = jsonParser.parse(reader);
			JSONObject jsonObject = (JSONObject) obj;
			url = (String) jsonObject.get("url");
			System.out.println(url);
			username = (String) jsonObject.get("username");
			System.out.println(username);
			password = (String) jsonObject.get("password");
			System.out.println(password);
			test1username = (String) jsonObject.get("test1username");
			System.out.println(test1username);
			test1password = (String) jsonObject.get("test1password");
			System.out.println(test1password);
			instanceName = (String) jsonObject.get("instanceName");
			System.out.println(instanceName);
			
     //	  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\datafiles\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.setCapability("ACCEPT_INSECURE_CERTS", true);
			options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			options.addArguments("--headless");
			driver = new ChromeDriver(options);
			Dimension d = new Dimension(1360, 978);
			// Resize the current window to the given dimension
			driver.manage().window().setSize(d);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
			driver.get(url);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public static void LoginApplication() throws InterruptedException {
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		
		LoginModel LM = PageFactory.initElements(driver, automationModels.LoginModel.class);
		LM.LoginUser(username, password);
		System.out.println("User clicks on login button");
		utilityMethods.waitForVisibility(PM.GetStarted);
		if(PM.GetStarted.isDisplayed()) {
			System.out.println("The User is logged in successfully");
		}
		else {
			
			System.out.println("The User is not able to login");
		}
		
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		Configuration.driver = driver;
	}

	@BeforeSuite(alwaysRun = true)
	public static void startTest() {
		report = new ExtentReports();
		String PATH = "./Reports";
		File directory = new File(PATH);
		    if (! directory.exists()){
		        directory.mkdir();
		        // If you require it to make the entire directory path including parents,
		        // use directory.mkdirs(); here instead.
		    }
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/FWA.html");
		
		report.attachReporter(reporter);
	}

	@AfterSuite(alwaysRun = true)
	public static void endTest() {

		report.flush();
	}

}
