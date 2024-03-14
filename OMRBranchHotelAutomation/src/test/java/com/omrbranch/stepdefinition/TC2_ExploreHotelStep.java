package com.omrbranch.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.omrbranch.base.BaseClass;
import com.omrbranch.pagemanager.PageObjectManager;

import io.cucumber.java.en.*;

public class TC2_ExploreHotelStep extends BaseClass {

	PageObjectManager pom  = new PageObjectManager();
	

	@When("User Search Hotel with all fileds {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void userSearchHotelWithAllFiledsAnd(String state, String city, String roomType, String checkInDate, String checkOutDate, String noOfRoom, String noOfAdults, String noOfChild) {
	    pom.getExploreHotelPage().exploreHotels(state, city, roomType, checkInDate, checkOutDate, noOfRoom, noOfAdults, noOfChild);
	}
	@Then("User should verify after search hotel success message {string}")
	public void userShouldVerifyAfterSearchHotelSuccessMessage(String expSuccessMsg) {
		String actSuccessMsg = pom.getSelectHotelPage().selectHotelSuccessMsg();
		System.out.println(expSuccessMsg);
		System.out.println(actSuccessMsg);
		Assert.assertEquals("Verify Success Message ", actSuccessMsg, expSuccessMsg);
	    
	}

	@When("User Search Hotel with only mandatory fileds {string},{string},{string},{string},{string} and {string}")
	public void userSearchHotelWithOnlyMandatoryFiledsAnd(String state, String city, String checkInDate, String checkOutDate, String noOfRoom, String noOfAdults) {
	   pom.getExploreHotelPage().exploreHotelWithMandary(state, city, checkInDate, checkOutDate, noOfRoom, noOfAdults);
	}

	@When("User Search Hotel with out enter fileds")
	public void userSearchHotelWithOutEnterFileds() {
		pom.getExploreHotelPage().ClickSearchHotel();
		
	}
	@Then("User should verify after Search hotel field error message {string},{string},{string},{string},{string} and {string}")
	public void userShouldVerifyAfterSearchHotelFieldErrorMessageAnd(String expStateErrorMsg, String expCityErrorMsg, String expCheckInErrorMsg, String expCheckOutErrorMsg, String expNoOfRoomErrorMsg, String expNoOfAdultErrorMsg) throws InterruptedException {
		returnFromFrame();
		String actStateErrorMsg = pom.getExploreHotelPage().StateErrorMsg();
		String actCityErrorMsg = pom.getExploreHotelPage().getCityErrorMsg();
		String actCheckInErrorMsg = pom.getExploreHotelPage().getCheckInErrorMsg();
		String actCheckOutErrorMsg = pom.getExploreHotelPage().getCheckOutErrorMsg();
		String actNoOfRoomErrorMsg = pom.getExploreHotelPage().getNoOfRoomErrorMsg();
		String actNoOfAdultErrorMsg = pom.getExploreHotelPage().getNoOfAdultErrorMsg();
		Assert.assertEquals("Verify success message", expStateErrorMsg, actStateErrorMsg);
		Assert.assertEquals("Verify success message", expCityErrorMsg, actCityErrorMsg);
		Assert.assertEquals("Verify success message", expCheckInErrorMsg, actCheckInErrorMsg);
		Assert.assertEquals("Verify success message", expCheckOutErrorMsg, actCheckOutErrorMsg);
		Assert.assertEquals("Verify success message", expNoOfRoomErrorMsg, actNoOfRoomErrorMsg);
		Assert.assertEquals("Verify success message", expNoOfAdultErrorMsg, actNoOfAdultErrorMsg);
		
	
	}


	@When("User Search Hotel with all fileds and all roomtype {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void userSearchHotelWithAllFiledsAndAllRoomtypeAnd(String state, String city, String roomType, String checkInDate, String checkOutDate, String noOfRoom, String noOfAdults, String noOfChild) throws InterruptedException {
		pom.getExploreHotelPage().selectAllRoomType(state, city, roomType, checkInDate, checkOutDate, noOfRoom, noOfAdults, noOfChild);
	
	}

	@Then("User should verify room types {string}")
	public void userShouldVerifyRoomTypes(String expAllRoomTypeSuccessMsg) {
		String actAllRoomTypeSuccessMsg = pom.getExploreHotelPage().getAllRoomTypeSuccessMsg();
		Assert.assertEquals("Verify success message", expAllRoomTypeSuccessMsg, actAllRoomTypeSuccessMsg);
		
		
	}

	@When("User click Name Ascending in sort by filter")
	public void userClickNameAscendingInSortByFilter() throws InterruptedException {
		pom.getExploreHotelPage().btnClickNameAsc();
	}
	@Then("User should verify hotels name are Ascending order in the display")
	public void userShouldVerifyHotelsNameAreAscendingOrderInTheDisplay() {
		boolean sortByHotelNameAsc = pom.getExploreHotelPage().sortByHotelNameAsc();
		Assert.assertTrue("Verify success message",sortByHotelNameAsc );
	}

	@When("User click Price high to low in sort by filter")
	public void userClickPriceHighToLowInSortByFilter() throws InterruptedException {
		pom.getExploreHotelPage().btnClickPriceAsc();
	
	}
	@Then("User should verify hotel price are high to low in the display")
	public void userShouldVerifyHotelPriceAreHighToLowInTheDisplay() {
		boolean sortByHotelPriceAsc = pom.getExploreHotelPage().sortByHotelPriceAsc();
		Assert.assertTrue("Verify success message",sortByHotelPriceAsc );
	}



















}
