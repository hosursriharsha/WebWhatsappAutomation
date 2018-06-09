package com.webwhatsapptest.runner;

/**
 * @author H Sri Harsha
 * This class implements ITestListener
 */
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {

  public void onFinish(ITestContext arg0) {
    // TODO Auto-generated method stub
    
  }

  public void onStart(ITestContext arg0) {
    System.out.println("Starting...");
    
  }

  public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
    // TODO Auto-generated method stub
    
  }

  public void onTestFailure(ITestResult arg0) {
    System.out.println("Testcase failed");    
  }

  public void onTestSkipped(ITestResult arg0) {
    // TODO Auto-generated method stub
    
  }

  public void onTestStart(ITestResult arg0) {
    System.out.println("Testcase started");
    
  }

  public void onTestSuccess(ITestResult arg0) {
    System.out.println("Testcase passed");
    
  }

}
