package com.qa.Pages;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.TestBase;

public class HomePage extends TestBase {

	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement SearchBox;
	
	@FindBy(xpath="//input[@type='submit' and @value='Go']")
	WebElement SearchBtn;
	
	public void Search() {
		SearchBox.sendKeys("abc");
		SearchBtn.click();
	}
	
	public HomePage() throws FileNotFoundException{
		PageFactory.initElements(driver,this);
	}
}
