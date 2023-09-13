package com.example.extent;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportManager {
    private static ExtentReports extent;
    private static ExtentHtmlReporter htmlReporter;

    public static ExtentReports getInstance() {
        if (extent == null) {
            extent = new ExtentReports();
            htmlReporter = new ExtentHtmlReporter("reports\\extent-report.html");
            extent.attachReporter(htmlReporter);
        }
        return extent;
    }
}
