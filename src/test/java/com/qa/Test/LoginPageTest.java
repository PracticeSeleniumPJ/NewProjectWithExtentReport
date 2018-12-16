package com.qa.Test;

import java.io.FileNotFoundException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Pages.LoginPage;
import com.qa.testbase.TestBase;

public class LoginPageTest extends TestBase {

	public LoginPageTest() throws FileNotFoundException {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public LoginPage LP;
	
	
	@BeforeMethod
	public void start() throws FileNotFoundException {
		initialization();
		LP = new LoginPage();
	}
	
	@AfterMethod
	public void stop() {
		//driver.quit();
		
	}
	
	@Test(priority=1)
	public void PreLogin() throws FileNotFoundException {
		LP.clickLogin();
	}
	
	

}
