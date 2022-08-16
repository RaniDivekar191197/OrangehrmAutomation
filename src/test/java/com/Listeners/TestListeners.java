package com.Listeners;

import java.io.File;
import java.io.FileInputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TestListeners implements ITestListener,ISuiteListener{
	ExtentSparkReport;
	ExtentReports extentReport;
	public void onStart(ISuite suite) {
		System.out.println("This is a onStart suite methode....");
		String reportFolderPath = System.getProperty("user.dir") + "/ExtentReport";
		createFolder(reportFolderPath);
		//EexecutionReport_6_8_2022_16_40 dd_mm_yyyy_HH_mm
		DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd_MM_yyyy_HH_mm");
		String datetime = formatter.format(LocalDateTime.now());
		String reportPath = "EexecutionReport_" + datetime;
		EexecutionReports = reportFolderPath + "/" + reportPath;
			createrFolder(EexecutionReports);
			ExtentSparkReporter = new ExtentSparkReporter(reportFolderPath + "/" +reportPath + "/AutomationReport.htn");
			extentReport =new  ExtentReports();
			extentReport.attachReporter(sparkReporter);
			extentReport.setSystemInfo("System", "Window");
			extentReport.setSystemInfo("User", "System");
			extentReport.setSystemInfo("Env", "Test");
	}

	public void onFinish(ISuite suite) {
		System.out.println(" this is a onFinish suite method....");
	}
	
	public void onStart(ITestContext context) {
		System.out.println(" this is a onTest Start  method...." + context.getName());
	}
	
	public void onFinish(ITestContext context) {
		System.out.println(" this is a onTest Finish  method...." + context.getName());
	}
	
	public void onTestStart(ITestResult result) {
		System.out.println("Test Execution started for method:" + result.getName());
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("Method execution completed successfully for: " + result.getName());
	}
	public void onTestFailure(ITestResult result) {
		System.out.println("Method execution failed for: " + result.getName());
		System.out.println("Failure Reason: " + result.getThrowable());
	}
	public void onTestSkipped(ITestResult result) {
		System.out.println("Method Skipped and name is : " + result.getName());
	}
	
	public void createFolder(String filePath) {
		File file = new File(filePath);
		if (!file.exists()) {
			file.mkdir();
		}
	}

}
