package com.qa.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.Pages.LoginPage;
import com.qa.testbase.TestBase;

@Listeners(customListener.class)
public class LoginPageTest extends TestBase {

	public LoginPageTest() throws FileNotFoundException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public LoginPage LP;
	
	
	@BeforeMethod
	public void start() throws IOException {
		initialization();
		LP = new LoginPage();
	}
	
	@AfterMethod
	public void stop() {
		driver.quit();
		
	}
	
	@Test(priority=1)
	public void PreLogin() throws FileNotFoundException {
		log.info("this is pre login test");
		LP.clickLogin();
	}
	
	

}
