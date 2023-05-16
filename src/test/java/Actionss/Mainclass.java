package Actionss;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import configuratio.extentreports;

public class Mainclass extends Register implements ITestListener {
	ExtentTest test;
	ExtentReports extent= extentreports.getreports();
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		test=extent.createTest(result.getMethod().getMethodName());
		System.out.println("Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Success");
		test.log(Status.PASS, MarkupHelper.createLabel(Status.PASS+"Test is Passed", ExtentColor.RED));
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		test.fail(result.getThrowable());
		List<String> list=new ArrayList<>();
		list.add("sekhar");
		list.add("venky");
		list.add("Ravi");
		test.log(Status.FAIL, MarkupHelper.createOrderedList(list));
		test.log(Status.FAIL, MarkupHelper.createLabel(Status.FAIL+"Failed test case", ExtentColor.PINK));
		String filepath = null;
		try {
			filepath = getscreenshot(result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		test.addScreenCaptureFromPath(filepath, result.getMethod().getMethodName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("skiped");
		test.log(Status.SKIP, MarkupHelper.createLabel(Status.SKIP+"Test is skiped", ExtentColor.BROWN));
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
	
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();
		
	}
	
	

}
