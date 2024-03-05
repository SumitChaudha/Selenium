package commonUtils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerImplimentation implements ITestListener{

	private ExtentReports report;

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		//System.out.println("Testscript execution is started");
				String methodName = result.getMethod().getMethodName();
				Reporter.log(methodName+"Testscript excution is started",true);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		//System.out.println("Testscript execution is Passed");
				String methodName = result.getMethod().getMethodName();
				Reporter.log(methodName+"Testscript excution is Passed",true);
			
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		//System.out.println("Testscript execution is failed");	
				String message = result.getThrowable().toString();
				String methodName = result.getMethod().getMethodName();
				Reporter.log(methodName+"Testscript excution is failed"+message,true);
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		//System.out.println("Testscript execution is skipped");
				String methodName = result.getMethod().getMethodName();
				Reporter.log(methodName+"Testscript excution is skipped",true);
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) { 
		// TODO Auto-generated method stub
		//System.out.println("To start the execution");
				//Reporter.log("To start the execution",true);
		
	//  Use ExtentReport class just to configure ExtentReport	
		
		JavaUtil jUtil = new JavaUtil();
		
	    ExtentSparkReporter reporter = new ExtentSparkReporter("./extentreport/report"+jUtil.getRandomNumber()+".html");
		reporter.config().setDocumentTitle("vtigercrm");
		reporter.config().setTheme(Theme.STANDARD);
		reporter.config().setReportName("Pune");
		
	//	Use ExtentReport to generate extentReport
		
		ExtentReports report = new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("OS","Window");
		report.setSystemInfo("Browser","Chrome");
		report.setSystemInfo("Chromeversion","121");
		report.setSystemInfo("Author","Sumit");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		//System.out.println("To finish the execution");
				//Reporter.log("To finish the execution",true);
		report.flush();
	}

}
