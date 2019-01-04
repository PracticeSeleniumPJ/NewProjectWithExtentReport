package com.qa.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import com.qa.Pages.HomePage;
import com.qa.Pages.LoginPage;
import com.qa.Pages.NewLoginPage;
import com.qa.testbase.TestBase;
import com.qa.utility.TestUtils;


@Listeners(customListener.class)
public class HomePageTest extends TestBase{
	
	public LoginPage LP;
	public NewLoginPage NLP;
	public HomePage HP;
	
	public HomePageTest() throws FileNotFoundException {
		super();
	}
	
	@BeforeMethod
	public void start() throws IOException  {
		
		initialization();
		LP = new LoginPage();
		NLP = new NewLoginPage();
		HP = new HomePage();
		log.info("entering application URL");
		log.warn("Hey this just a warning message");
		log.fatal("hey this is just fatal error message");
		log.debug("this is debug message");
		
	}
	
	

	@Test
	public void SearchSomething() throws FileNotFoundException {
		log.info("Hi this is test method search something");
		LP.clickLogin();
		NLP.Login();
		HP.Search();
	}
	
	@AfterMethod
	
		public void stop(ITestResult result){
		/*	if(ITestResult.FAILURE==result.getStatus())
			{
			TestUtils.captureScreenshot(driver, result.getName());
			}*/
		driver.quit();
			}
	
	

}
