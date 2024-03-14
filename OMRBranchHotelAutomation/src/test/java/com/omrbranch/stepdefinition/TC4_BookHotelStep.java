package com.omrbranch.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.omrbranch.base.BaseClass;
import com.omrbranch.pagemanager.PageObjectManager;

import io.cucumber.java.en.*;

public class TC4_BookHotelStep extends BaseClass{
	PageObjectManager pom = new PageObjectManager();
	

	@When("User enter the Guest details {string},{string},{string},{string} and {string}")
	public void userEnterTheGuestDetailsAnd(String userTitle, String firstName, String lastName, String phone, String email) {
		pom.getBookHotelPage().getBtnRadio();
		pom.getBookHotelPage().addGuestDetails(userTitle, firstName, lastName, phone, email);
		
		
	}
	

	@When("User enter with out GST")
	public void userEnterWithOutGST() {
		pom.getBookHotelPage().nextBtn();
	}




	@When("User enter the GST details {string},{string} and {string}")
	public void userEnterTheGSTDetailsAnd(String gstNo, String companyName, String companyAdd) throws InterruptedException {
		pom.getBookHotelPage().getBtnGST();
		pom.getBookHotelPage().addGSTDetails(gstNo, companyName, companyAdd);
		Thread.sleep(3000);
		pom.getBookHotelPage().nextBtn();
		
	}

	@When("User enter without special request")
	public void userEnterWithoutSpecialRequest() {
		pom.getBookHotelPage().next1Btn();
	}



	
	@When("User Add the special request {string}")
	public void userAddTheSpecialRequest(String specialRequests) {
		pom.getBookHotelPage().textSpecialRequest(specialRequests);
		pom.getBookHotelPage().next1Btn();
		
		
	}
	@When("User Add the payment details Select debit card {string}")
	public void userAddThePaymentDetailsSelectDebitCard(String cardType, io.cucumber.datatable.DataTable dataTable) {
	   
	 List<Map<String,String>> asMaps = dataTable.asMaps();
	 Map<String, String> map = asMaps.get(0);
	 String selectCard = map.get("SelectCard");
	 String cardNo = map.get("CardNumber");
	 String cardName = map.get("Name On Card");
	 String month = map.get("Month");
	 String year = map.get("Year");
	 String cvv = map.get("cvv");
	 
	 pom.getBookHotelPage().addPayment(cardType, selectCard, cardNo, cardName, month, year, cvv);
	 
	 pom.getBookHotelPage().bookSubmitBtn();
	 
	}
	@Then("User should verify after payment success message {string}")
	public void userShouldVerifyAfterPaymentSuccessMessage(String expBookingConfirmation) throws InterruptedException {
		Thread.sleep(5000);
		String actBookingConfirmation = pom.getBookingConfirmedPage().BookingSuccessMsg();
		Assert.assertEquals("verify success message", expBookingConfirmation, actBookingConfirmation);
	}
	@Then("User should verify after payment Hotel Name print or not")
	public void userShouldVerifyAfterPaymentHotelNamePrintOrNot() {
		String actBookHotelName = pom.getBookingConfirmedPage().BookHotelName();
		System.out.println(actBookHotelName);
		System.out.println(pom.getSelectHotelPage().FirstHotelName);
		boolean contains = pom.getSelectHotelPage().FirstHotelName.contains(pom.getBookingConfirmedPage().BookHotelName());
		Assert.assertTrue("Verify success message", contains);
		
	}

	@When("User Add the payment details Select credit card {string}")
	public void userAddThePaymentDetailsSelectCreditCard(String cardType, io.cucumber.datatable.DataTable dataTable) {
			pom.getBookHotelPage().getBtnGST();
		 List<Map<String,String>> asMaps = dataTable.asMaps();
		 Map<String, String> map = asMaps.get(0);
		 String selectCard = map.get("SelectCard");
		 String cardNo = map.get("CardNumber");
		 String cardName = map.get("Name On Card");
		 String month = map.get("Month");
		 String year = map.get("Year");
		 String cvv = map.get("cvv");
		 
		 pom.getBookHotelPage().addPayment(cardType, selectCard, cardNo, cardName, month, year, cvv);
		 pom.getBookHotelPage().bookSubmitBtn();
	}
	

	@When("User without entering any payment details")
	public void userWithoutEnteringAnyPaymentDetails() throws InterruptedException {
	    pom.getBookHotelPage().clickCardType();
		pom.getBookHotelPage().bookSubmitBtn();
	    Thread.sleep(4000);
	    
	}



	@Then("User should verify after payment error message {string},{string},{string},{string}.{string} and {string}")
	public void userShouldVerifyAfterPaymentErrorMessageAnd(String expCardOptionErrorMsg, String expCardTypeErrorMsg, String expCardNoErrorMsg, String expCardNameErrorMsg, String expCardMonthErrorMsg, String expCardCVV) {
		
		String actCardOptionErrorMsg = pom.getBookHotelPage().getCardOptionErrorMsg();
		System.out.println(actCardOptionErrorMsg);
		String actCardTypeErrorMsg = pom.getBookHotelPage().getCardTypeErrorMsg();
		System.out.println(actCardTypeErrorMsg);
		String actCardNoErrorMsg = pom.getBookHotelPage().getCardNoErrorMsg();
		System.out.println(actCardNoErrorMsg);
		String actCardNameErrorMsg = pom.getBookHotelPage().getCardNameErrorMsg();
		System.out.println(actCardNameErrorMsg);
		String actCardMonthErrorMsg = pom.getBookHotelPage().getCardMonthErrorMsg();
		System.out.println(actCardMonthErrorMsg);
		String actCardCVV = pom.getBookHotelPage().getCardCVV();
		System.out.println(actCardCVV);
		Assert.assertEquals("Verify success message", expCardOptionErrorMsg, actCardOptionErrorMsg);
		Assert.assertEquals("Verify success message", expCardTypeErrorMsg, actCardTypeErrorMsg);
		Assert.assertEquals("Verify success message", expCardNoErrorMsg, actCardNoErrorMsg);
		Assert.assertEquals("Verify success message", expCardNameErrorMsg, actCardNameErrorMsg);
		Assert.assertEquals("Verify success message", expCardMonthErrorMsg, actCardMonthErrorMsg);
		Assert.assertEquals("Verify success message", expCardCVV, actCardCVV);
		
		
	}








	

}
