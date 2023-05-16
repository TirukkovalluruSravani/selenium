package configuratio;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentreports {
	
	public static ExtentReports getreports()
	{
		String path=System.getProperty("user.dir")+"\\Reports\\Index.html";
		ExtentSparkReporter reporter= new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("New Tours Page");
		reporter.config().setReportName("Automation Testing");
		ExtentReports extent= new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "D Sekhar");
		extent.setSystemInfo("Browser", "Chrome");
		return extent;
		
	}

}
