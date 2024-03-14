package com.omrbranch.stepdefinition;

import org.openqa.selenium.WebElement;

import com.omrbranch.base.BaseClass;
import com.omrbranch.pagemanager.PageObjectManager;

import io.cucumber.java.en.*;

public class TC3_SelectHotelStep extends BaseClass{
	PageObjectManager pom = new PageObjectManager();
	
	
	
	
	@When("User Select first hotel and save hotel name,price")
	public void userSelectFirstHotelAndSaveHotelNamePrice() {
		  pom.getSelectHotelPage().getFirstHotelName();
		  pom.getSelectHotelPage().getFirstHotelPrice();
		
	}
	@When("User accept the alert box")
	public void userAcceptTheAlertBox() {
		pom.getSelectHotelPage().clickContinue();
		acceptAlert();
		
	}
	@Then("User should verify success message after accept the alert box {string}")
	public void userShouldVerifySuccessMessageAfterAcceptTheAlertBox(String string) {
		
	}

	@When("User dismiss the alert box")
	public void userDismissTheAlertBox() {
		pom.getSelectHotelPage().clickContinue();
		dismissAlert();
	}







}
