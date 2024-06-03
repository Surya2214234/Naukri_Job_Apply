package testBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.Filters;
import pageObjects.Landing_Page;
import pageObjects.NaukriLoginpage;



public class TestBase extends ObjectRepo{
	

	public static 	WebDriver driver;
	@SuppressWarnings("deprecation")
	public void LaunchBrowser() {
		String browser="chrome";
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver();
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver();
			driver=new FirefoxDriver();
			}
		else if(browser.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver();
			driver=new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/nlogin/login");
	}
	
	@BeforeMethod
	public void setup() {
		LaunchBrowser();
		loginpage = new NaukriLoginpage();
		landing_page=new Landing_Page();
		filters = new Filters();
		report = new ExtentReports();
	}
	
	public void getUrl() {
		driver.getCurrentUrl();
	}
	
	@AfterMethod
	public void cleanUp() {
		driver.quit();
	}
}
