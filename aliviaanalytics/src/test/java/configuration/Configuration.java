package configuration;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
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
	
	 static String username;
	 static String password;
	public  static void  BConfiguration()   {
		
		try {JSONParser jsonParser = new JSONParser();
		FileReader reader = new FileReader(System.getProperty("user.dir") + "\\src\\datafiles\\login.json");
		Object obj = jsonParser.parse(reader);
		 JSONObject jsonObject =  (JSONObject) obj;
         String url = (String) jsonObject.get("url");
          username = (String) jsonObject.get("username");
          password = (String) jsonObject.get("password");
	    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\datafiles\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setCapability("ACCEPT_INSECURE_CERTS", true);
		options.addArguments("--headless");
		 driver = new ChromeDriver(options);
		Dimension d = new Dimension(1360, 978);
		//Resize the current window to the given dimension
		driver.manage().window().setSize(d);	
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
		
		LoginModel LM = PageFactory.initElements(driver, automationModels.LoginModel.class);
		LM.LoginFormFill(username, password );
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
