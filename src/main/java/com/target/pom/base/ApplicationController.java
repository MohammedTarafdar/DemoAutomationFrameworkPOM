package com.target.pom.base;

import org.openqa.selenium.WebDriver;

import com.target.pom.pages.CreateAccountPage;
import com.target.pom.pages.HomePage;
import com.target.pom.pages.SignInPage;

public class ApplicationController {
	
	private WebDriver driver;
	private HomePage homePage;
	private SignInPage signInPage;
	private CreateAccountPage createAccountPage;
	
	// constructor
	public ApplicationController(WebDriver driver) {
		this.driver = driver;
		
		homePage = new HomePage();
		signInPage = new SignInPage();
		createAccountPage = new CreateAccountPage();
		
	}
	

}
