package com.qa.Test;

import java.io.FileNotFoundException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.Pages.HomePage;
import com.qa.Pages.LoginPage;
import com.qa.Pages.NewLoginPage;
import com.qa.testbase.TestBase;

public class HomePageTest extends TestBase{
	
	public LoginPage LP;
	public NewLoginPage NLP;
	public HomePage HP;
	
	public HomePageTest() throws FileNotFoundException {
		super();
	}
	
	@BeforeMethod
	public void start() throws FileNotFoundException  {
		initialization();
		LP = new LoginPage();
		NLP = new NewLoginPage();
		HP = new HomePage();
		
	}
	
	

	@Test
	public void SearchSomething() throws FileNotFoundException {
		LP.clickLogin();
		NLP.Login();
		HP.Search();
	}
	
	@AfterMethod
	public void stop() {
	//	driver.quit();
	}

}
