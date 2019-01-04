package com.qa.Pages;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.testbase.TestBase;
import com.qa.utility.TestUtils;

public class NewLoginPage extends TestBase {

	public NewLoginPage() throws FileNotFoundException {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@type='email']")
	WebElement Username;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement Password;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement Submit;
	
	
	
	public HomePage Login() throws FileNotFoundException {
		Username.sendKeys("priya.invincible@gmail.com");
		Password.sendKeys("Iamshopping@1234");
		Submit.click();
	//	TestUtils.captureScreenshot(driver, "NewLoginPage");
		return new HomePage();
	}
	
	
}
