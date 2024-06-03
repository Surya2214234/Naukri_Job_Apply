package reusableComponents;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import testBase.ObjectRepo;

public class ExtentReport extends ObjectRepo{

	public static ExtentReports extentreports() {
		
		
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyy HH-mm-ss");
		Date date = new Date();
		String Currentdate = format.format(date);
		
		String Path = System.getProperty("user.dir")+"/target/ExecutionReport_"+Currentdate+".html";
		ExtentSparkReporter sparkreport = new ExtentSparkReporter(Path);
		report = new ExtentReports();
		report.attachReporter(sparkreport);
		
		sparkreport.config().setDocumentTitle("DocumentTitle");
		sparkreport.config().setTheme(Theme.DARK);
		sparkreport.config().setReportName("ReportName");
		
		return report;
		
		}
}
