package manageUtils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extentmanagerr {

	public static ExtentReports extent;
	public static ExtentSparkReporter spark;
	public static ExtentTest test;

	public static void setExtent() {
		spark = new ExtentSparkReporter("spark.html");
		extent = new ExtentReports();

		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("Astrolok.com");

		extent.attachReporter(spark);

		extent.setSystemInfo("HostName", "MyHost");
		extent.setSystemInfo("ProjectName", "astrolok");
		extent.setSystemInfo("Tester", "balmukund");
		extent.setSystemInfo("OS", "Win10");
		extent.setSystemInfo("Browser", "Chrome");
	}

	public static void endReport() {
		extent.flush();
		// ExtentManager.endReport();

	}
}
