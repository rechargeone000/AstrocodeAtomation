package baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;

import org.apache.log4j.xml.DOMConfigurator;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.itextpdf.text.DocumentException;

import io.github.bonigarcia.wdm.WebDriverManager;
import manageUtils.ConvertEx;
import manageUtils.Extentmanagerr;
import manageUtils.newconvert;

public class BaseTestclass {
	// public static ExtentReports extent = new ExtentReports();
	// public static ExtentSparkReporter spark = new
	// ExtentSparkReporter("spark.html");
	// commited
	// again committed
	public static WebDriver driver;

	public Properties prop;

	@BeforeSuite
	public void beforessuit() {
		Extentmanagerr.setExtent();
		//DOMConfigurator.configure("log4j.xml");

	}

	@BeforeClass
	public void dataconfig() {

		try {
			DOMConfigurator.configure("log4j.xml");
			System.out.println(System.getProperty("user.dir") + "\\Configuration\\config.properties");
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "\\Configuration\\config.properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void loadConfig() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.manage().deleteAllCookies();

		driver.get(prop.getProperty("lmsurl"));

	}

	public void setup() {
		System.out.println(".");
	}

	@AfterClass
	public void aftsetup() {

		System.out.println("afterclass");

	}

	public void qutdriver() {

		driver.quit();

	}

	@AfterSuite
	public void afterlast() {
		Extentmanagerr.endReport();

	}

}
