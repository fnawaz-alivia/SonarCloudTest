package automationUtils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class reportUtil {

	
	static ExtentReports report;
	
	
	

	public static ExtentReports getReport() {
		return report;
	}

	public static void setReport(ExtentReports report) {
		reportUtil.report = report;
	}

	public static void startTest()
	{
	report = new ExtentReports();
	ExtentHtmlReporter reporter=  new ExtentHtmlReporter("./Reports/FWA.html");
	report.attachReporter(reporter);
	}
	
	public static void endTest()
	{

	report.flush();
	}
}
