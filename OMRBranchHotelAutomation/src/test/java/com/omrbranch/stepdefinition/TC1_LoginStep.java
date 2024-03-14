package com.omrbranch.stepdefinition;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.omrbranch.base.BaseClass;
import com.omrbranch.pagemanager.PageObjectManager;

import io.cucumber.java.en.*;

public class TC1_LoginStep extends BaseClass{
	 
		PageObjectManager pom = new PageObjectManager();
		
	@Given("User on the OMR Branch Hotel page")
	public static void userOnTheOMRBranchHotelPage() throws FileNotFoundException, IOException {
		
	}
	@When("User login {string} and {string}")
	public void userLoginAnd(String userName, String password) {
		pom.getLoginpage().login(userName, password);
	   
	}
	@Then("User should Verify success message after login {string}")
	public void userShouldVerifySuccessMessageAfterLogin(String expLoginSuccessMsg) {
	 String actLoginSuccessMsg = pom.getExploreHotelPage().getLoginSuccessMsg();
	 Assert.assertEquals("Verify Success Msg",expLoginSuccessMsg,actLoginSuccessMsg);
	}
	
	@When("User login {string} and {string} with ENTER key")
	public void userLoginAndWithENTERKey(String username, String password) throws AWTException {
		pom.getLoginpage().loginWithEnterKey(username, password);
	}

	@Then("User should Verify error message after login {string}")
	public void userShouldVerifyErrorMessageAfterLogin(String exploginErrorMsg) throws InterruptedException {
		String actloginErrorMsg = pom.getLoginpage().loginErrorMsg();
		boolean b = actloginErrorMsg.contains(exploginErrorMsg);
		Thread.sleep(5000);
		Assert.assertTrue("Varify after login", b);
		
	}











}
