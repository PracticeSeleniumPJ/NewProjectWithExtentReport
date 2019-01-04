package com.qa.testbase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.utility.TestUtils;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public Logger log = Logger.getLogger(TestBase.class);
	public TestBase() throws FileNotFoundException {

		prop = new Properties();
		FileInputStream fis  = new FileInputStream("C:\\Users\\priya\\eclipse-workspace\\Testing\\src\\main\\java\\com\\qa\\config\\config.properties");
		
		
			try {
				prop.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}
	
	public static void initialization() throws IOException {
		
		
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\priya\\eclipse\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
					
		}
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtils.PageLoad_Wait, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtils.ImplicitWait_Timeout, TimeUnit.SECONDS);
		driver.get(prop.getProperty("URL"));
		
		
		}
		
	public void failed(String testMethodName) {
		
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("C:\\Users\\priya\\eclipse-workspace\\Testing\\src\\main\\java\\Screenshot\\"+testMethodName+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	

}
