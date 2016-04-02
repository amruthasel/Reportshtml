package bnbmbnm;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class extentreportgeneration {
@Test
public void reports() throws IOException
{
	ExtentReports reports=new ExtentReports("D:\\salman\\bnbmbnm\\src\\com\\qedge\\reports\\p.html",true);
	ExtentTest test=reports.startTest("my sample test");
	FirefoxDriver driver=new FirefoxDriver();
	test.log(LogStatus.INFO,"launch browser");
	driver.get("http://google.com");
	test.log(LogStatus.INFO,"navigate");
	File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(srcfile,new File("D:\\salman\\bnbmbnm\\src\\com\\qedge\\screenshots\\p.png"));
test.addScreenCapture("D:\\salman\\bnbmbnm\\src\\com\\qedge\\screenshots\\p.png");
reports.endTest(test);
reports.flush();
}
}
