package com.qa.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.testbase.TestBase;

public class TestUtils extends TestBase{

	
	public TestUtils() throws FileNotFoundException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static long ImplicitWait_Timeout=60;
	public static long PageLoad_Wait=60;
	
	public static void captureScreenshot(WebDriver driver, String screenshotname) {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE)	;
		try {
			FileUtils.copyFile(src, new File("C:\\Users\\priya\\eclipse-workspace\\Testing\\src\\main\\java\\"+screenshotname + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
