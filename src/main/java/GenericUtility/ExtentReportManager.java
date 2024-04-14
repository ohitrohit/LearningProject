package GenericUtility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentReportManager implements ITestListener {

    private ExtentReports extent;
    private ExtentTest test;

    public void onStart(ITestContext testContext) {
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        String repName = "Test-Report-" + timeStamp + ".html";
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(".\\Reports\\" + repName);
        sparkReporter.config().setReportName("LearningProject");
        sparkReporter.config().setTheme(Theme.DARK);
        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
        extent.setSystemInfo("Application", "LearningProject");
        extent.setSystemInfo("Operating System", System.getProperty("os.name"));
        extent.setSystemInfo("User Name", System.getProperty("user.name"));
        
        // Add dynamic environment information
        String environment = System.getProperty("environment");
        if (environment == null || environment.isEmpty()) {
            environment = "dev"; // Default environment
        }
        extent.setSystemInfo("Environment", environment);
        
        extent.setSystemInfo("User", "Rohit");
    }

    // The method below has been updated to handle all test results
    public void onTestSuccess(ITestResult result) {
        test = extent.createTest(result.getName());
        test.log(Status.PASS, "Test Passed");
    }

    // The method below has been updated to handle all test results
    public void onTestFailure(ITestResult result) {
        test = extent.createTest(result.getName());
        test.log(Status.FAIL, "Test Failed");
        test.log(Status.FAIL, result.getThrowable().getMessage());
    }

    // The method below has been updated to handle all test results
    public void onTestSkipped(ITestResult result) {
        test = extent.createTest(result.getName());
        test.log(Status.SKIP, "Test Skipped");
        test.log(Status.SKIP, result.getThrowable().getMessage());
    }

    public void onFinish(ITestContext testContext) {
        extent.flush();
    }

    // Implement other methods of the ITestListener interface if needed
}
