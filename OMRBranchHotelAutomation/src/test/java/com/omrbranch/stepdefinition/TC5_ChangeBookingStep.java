package com.omrbranch.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.omrbranch.pagemanager.PageObjectManager;

import io.cucumber.java.en.*;


public class TC5_ChangeBookingStep {
	PageObjectManager pom = new PageObjectManager();
	

	
	

	@When("User change the Book Hotel CheckinDate {string}")
	public void userChangeTheBookHotelCheckinDate(String checkInDate) throws InterruptedException {
		pom.getMyBookingPage().modifyCheckInDate(checkInDate);
		Thread.sleep(5000);
		
		pom.getMyBookingPage().btnconformkey();
		
		
	}
	
	@Then("User should verify after change the checkinDate success message {string}")
	public void userShouldVerifyAfterChangeTheCheckinDateSuccessMessage(String expTxtUpdateSuccess) {
		
	String actTxtUpdateSuccess = pom.getMyBookingPage().bookingUpdateSuccessMsg();
	System.out.println(actTxtUpdateSuccess);
	System.out.println(expTxtUpdateSuccess);
	Assert.assertEquals("Verify success message",expTxtUpdateSuccess, actTxtUpdateSuccess);
		
	}

	@When("User search the existing orderId")
	public void userSearchTheExistingOrderId() {
		  pom.getMyBookingPage().navigateToMyBookingPage();
	}

	@When("User search the {string}")
	public void userSearchThe(String OrderId) throws InterruptedException {
		Thread.sleep(3000);
		pom.getMyBookingPage().searchOrderId(OrderId);
	}
	

	@When("User go to MyBookingPage")
	public void userGoToMyBookingPage() {
		pom.getMyBookingPage().btnMyBooking();
	}


	









}
