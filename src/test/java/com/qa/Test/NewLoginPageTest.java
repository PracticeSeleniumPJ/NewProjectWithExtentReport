package com.qa.Test;

import java.io.FileNotFoundException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Pages.LoginPage;
import com.qa.Pages.NewLoginPage;
import com.qa.testbase.TestBase;

public class NewLoginPageTest extends TestBase {
public NewLoginPageTest() throws FileNotFoundException {
		super();
		// TODO Auto-generated constructor stub
	}



public NewLoginPage NLP;
public LoginPage LP;

@BeforeMethod
public void start() throws FileNotFoundException {
	initialization();
	LP = new LoginPage();
	NLP = new NewLoginPage();
}
	

@Test
	public void LoginNow() throws FileNotFoundException {
	LP.clickLogin();
	
	NLP.Login();
	}

@AfterMethod
public void stop() {
	//driver.quit();
}
}
