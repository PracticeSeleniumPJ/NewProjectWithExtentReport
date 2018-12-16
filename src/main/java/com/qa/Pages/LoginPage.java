package com.qa.Pages;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.TestBase;

public class LoginPage extends TestBase {
	
	
	public LoginPage() throws FileNotFoundException {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//a[@class='nav-a nav-a-2']")
	WebElement LoginLink;
	
	@FindBy(xpath="//a[@class='nav-a nav-a-2']//span[@class='nav-line-3']")
	WebElement LoginLink1;
	
	@FindBy(xpath="//input[@class='a-button-input' and @type='submit']")
	WebElement continuebtn;
	
	
	
	public NewLoginPage clickLogin() throws FileNotFoundException {
		
		continuebtn.click();
		//Actions act = new Actions(driver);
		//act.click(LoginLink);
		LoginLink.click();
		
		return new NewLoginPage();
	}
	

}
