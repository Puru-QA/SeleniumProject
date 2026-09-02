package Reports;

import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {

	public static ExtentReports getReportObject() {

		String path = System.getProperty("user.dir")

				+ "/reports/ExtentReport.html";

		ExtentSparkReporter reporter =

				new ExtentSparkReporter(path);

		reporter.config().setReportName("Automation Test Report");

		reporter.config().setDocumentTitle("Test Execution Report");

		ExtentReports extent = new ExtentReports();

		extent.attachReporter(reporter);

		return extent;

	}

}
