package com.omrbranch.stepdefinition;

import org.junit.Assert;

import com.omrbranch.base.BaseClass;
import com.omrbranch.pagemanager.PageObjectManager;

import io.cucumber.java.en.*;


public class TC6_CancelBookingStep extends BaseClass {
	
	PageObjectManager pom = new PageObjectManager();

	
	@Then("User should Verify after cancel the Booking Hotel success message {string}")
	public void userShouldVerifyAfterCancelTheBookingHotelSuccessMessage(String expCancelBookinSuccessMsg) {
		String actCancelBookinSuccessMsg = pom.getMyBookingPage().cancelBookinSuccessMsg();
		System.out.println(expCancelBookinSuccessMsg);
		System.out.println(actCancelBookinSuccessMsg);
		Assert.assertEquals("Verify success message",expCancelBookinSuccessMsg , actCancelBookinSuccessMsg);
	}


	@When("User cancel the BookHotel")
	public void userCancelTheBookHotel() {
	  pom.getMyBookingPage().cancelOrderId();
	  
	  
	}







}
