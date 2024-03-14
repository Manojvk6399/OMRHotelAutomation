package com.omrbranch.stepdefinition;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;


import com.omrbranch.base.BaseClassAPI;
import com.omrbranch.endpoints.EndPoints;
import com.omrbranch.payloadmanager.PayloadObjectManager;
import com.omrbranch.pojo.address.AddUserAddress_Output_Pojo;
import com.omrbranch.pojo.address.Data;
import com.omrbranch.pojo.address.DeleteAddress_Output_Pojo;
import com.omrbranch.pojo.address.GetUserAddress_Output_Pojo;
import com.omrbranch.pojo.address.UpdateUserAddress_Output_Pojo;

import io.cucumber.java.en.*;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class TC4_AddressStep extends BaseClassAPI{
	Response response;
	PayloadObjectManager pom = new PayloadObjectManager();


	@Given("User add header and bearer authorization for accersing address endpoint")
	public void userAddHeaderAndBearerAuthorizationForAccersingAddressEndpoint() {
		List<Header> listHeaders = new ArrayList<>();

		Header h1 = new Header("accept", "application/json");
		Header h2 = new Header("Authorization", "Bearer " +TC1_LoginStep.globalDatas.getLogtoken());
		Header h3 = new Header("Content-Type", "application/json");
		listHeaders.add(h1);
		listHeaders.add(h2);
		listHeaders.add(h3);

		Headers headers = new Headers(listHeaders);
		addHeader(headers);

		
	}
	@When("User add request body for add new  address {string},{string},{string},{string},{string},{string},{string},{string},{string} and {string}")
	public void userAddRequestBodyForAddNewAddressAnd(String first_name, String last_name, String mobile, String apartment, String state, String city, String country, String zipcode, String address, String address_type) {
		int countryId = Integer.parseInt(country);
		
		body(pom.getAddressPayload().addAddressPayload(first_name, last_name, mobile, apartment,TC1_LoginStep.globalDatas.getStateNum() ,TC1_LoginStep.globalDatas.getCityId(), countryId, zipcode, address, address_type));
		
		
		
	}
	@When("User send {string} request for add user Address endpoint")
	public void userSendRequestForAddUserAddressEndpoint(String type) {
		
		response = requestType(type,EndPoints.ADDADDRESS );

		int statusCode = statusCode(response);
		System.out.println(statusCode);
		TC1_LoginStep.globalDatas.setStatusCode(statusCode);
	
		
		
		
	}
	@Then("User should verify the addUserAddress response message matches {string}")
	public void userShouldVerifyTheAddUserAddressResponseMessageMatches(String expAddMessage) {
		AddUserAddress_Output_Pojo address_Output_Pojo = response.as(AddUserAddress_Output_Pojo.class);
		String actAddMessage = address_Output_Pojo.getMessage();
		int address_id = address_Output_Pojo.getAddress_id();
		String addressIdText = String.valueOf(address_id);
		TC1_LoginStep.globalDatas.setAddressId(address_id);
		TC1_LoginStep.globalDatas.setAddressIdText(addressIdText);
		
		Assert.assertEquals("Verify AddAddress success", expAddMessage,actAddMessage);
	}
	

	@When("User add request body for add new  address {string},{string},{string},{string},{string},{string},{string},{string},{string},{string} and {string}")
	public void userAddRequestBodyForAddNewAddressAnd(String address_id, String first_name, String last_name, String mobile, String apartment, String state, String city, String country, String zipcode, String address, String address_type) {
		int countryId = Integer.parseInt(country);
		int stateId = Integer.parseInt(state);
		int cityId = Integer.parseInt(city);
		body(pom.getAddressPayload().updateAddressPayload(TC1_LoginStep.globalDatas.getAddressIdText(), first_name, last_name, mobile, apartment, stateId, cityId, countryId, zipcode, address, address_type));
		
	}
	@When("User send {string} request for update user Address endpoint")
	public void userSendRequestForUpdateUserAddressEndpoint(String type) {
		response = requestType(type,EndPoints.UPDATEADDRESS );
		int statusCode = statusCode(response);
		System.out.println(statusCode);
		TC1_LoginStep.globalDatas.setStatusCode(statusCode);
		
	}



	@Then("User should verify the updateUserAddress response message matches {string}")
	public void userShouldVerifyTheUpdateUserAddressResponseMessageMatches(String expUpdateAddress) {


		UpdateUserAddress_Output_Pojo address_Output_Pojo = response.as(UpdateUserAddress_Output_Pojo.class);
		String actUpdateAddress = address_Output_Pojo.getMessage();

		Assert.assertEquals("verify update Address successfully",expUpdateAddress,actUpdateAddress);		
		
	}
	
	@Given("User add header and bearer authorization for accersing getAddress endpoint")
	public void userAddHeaderAndBearerAuthorizationForAccersingGetAddressEndpoint() {
	    
		List<Header> listHeaders = new ArrayList<>();

		Header h1 = new Header("accept", "application/json");
		Header h2 = new Header("Authorization", "Bearer " +TC1_LoginStep.globalDatas.getLogtoken() );

		listHeaders.add(h1);
		listHeaders.add(h2);

		Headers headers = new Headers(listHeaders);
		addHeader(headers);

		
	}
	@When("User send {string} request for get user Address endpoint")
	public void userSendRequestForGetUserAddressEndpoint(String type) {
	  
		response = requestType(type, EndPoints.GETAADDRESS);
		int statusCode = statusCode(response);
		System.out.println(statusCode);
		TC1_LoginStep.globalDatas.setStatusCode(statusCode);
		
	}
	@Then("User should verify the getUserAddress response body countryname present as {string}")
	public void userShouldVerifyTheGetUserAddressResponseBodyCountrynamePresentAs(String expCountry) {
	 GetUserAddress_Output_Pojo getUserAddress_Output_Pojo = response.as(GetUserAddress_Output_Pojo.class);
	 ArrayList<Data> data = getUserAddress_Output_Pojo.getData();
	 for (Data eachdata : data) {
		String actCountry = eachdata.getCountry();
		if (actCountry.equals(expCountry)) {
			System.out.println(actCountry);
			Assert.assertEquals("verify get Address successfully",expCountry,actCountry);		
			
		}
	}

	}


	@When("User add request body addressId for delete address")
	public void userAddRequestBodyAddressIdForDeleteAddress() {
	 body(pom.getAddressPayload().deleteAddressPayload(TC1_LoginStep.globalDatas.getAddressIdText()));
	}
	@When("User send {string} request for deleteUserAddress endpoint")
	public void userSendRequestForDeleteUserAddressEndpoint(String type) {
		response = requestType(type,EndPoints.DELETEADDRESS );
		int statusCode = statusCode(response);
		System.out.println(statusCode);
		TC1_LoginStep.globalDatas.setStatusCode(statusCode);
		
	}
	@Then("User should verify the deleteUserAddress response message matches {string}")
	public void userShouldVerifyTheDeleteUserAddressResponseMessageMatches(String expDeleteAddress) {
	  DeleteAddress_Output_Pojo deleteAddress_Output_Pojo = response.as(DeleteAddress_Output_Pojo.class);
	  String actDeleteAddress = deleteAddress_Output_Pojo.getMessage();
	  Assert.assertEquals("Verify success",expDeleteAddress,actDeleteAddress);

	}



	




}
	
	

	


