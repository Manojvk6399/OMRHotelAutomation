package com.omrbranch.stepdefinition;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import com.omrbranch.base.BaseClassAPI;
import com.omrbranch.endpoints.EndPoints;
import com.omrbranch.payloadmanager.PayloadObjectManager;
import com.omrbranch.pojo.address.State;
import com.omrbranch.pojo.address.StateList_Output_Pojo;

import io.cucumber.java.en.*;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;


public class TC3_CityListStep extends BaseClassAPI{
	Response response;
	
	PayloadObjectManager pom = new PayloadObjectManager();
	
	@Given("User add header for to get cityList")
	public void userAddHeaderForToGetCityList() {
		List<Header> listHeaders = new ArrayList<>();

		Header h1 = new Header("accept", "application/json");
		Header h2 = new Header("Content-Type", "application/json");
		listHeaders.add(h1);
		listHeaders.add(h2);

		Headers headers = new Headers(listHeaders);
		addHeader(headers);
		
	}
	@When("User add request body stateId for get cityList")
	public void userAddRequestBodyStateIdForGetCityList() {
		System.out.println(TC1_LoginStep.globalDatas.getStateIdNum());
		body(pom.getAddressPayload().getCityListPayload(TC1_LoginStep.globalDatas.getStateIdNum()));
	
	}
	@When("User send {string} request for cityList endpoint")
	public void userSendRequestForCityListEndpoint(String type) {
		response = requestType(type,EndPoints.CITYLIST );
		
		int statusCode = statusCode(response);
		System.out.println(statusCode);
		TC1_LoginStep.globalDatas.setStatusCode(statusCode);
		
	}
	@Then("User verify the cityList response message matches {string} and saved cityId")
	public void userVerifyTheCityListResponseMessageMatchesAndSavedCityId(String expCityName) {
		
		StateList_Output_Pojo as = response.as(StateList_Output_Pojo.class);
		ArrayList<State> data = as.getData();
		for (State eachCityList : data) {

			String actCityName = eachCityList.getName();
			if (actCityName.equals(expCityName)) {
				int cityId = eachCityList.getId();
				System.out.println(cityId);
				TC1_LoginStep.globalDatas.setCityId(cityId);
				Assert.assertEquals("Verify cityList success", expCityName,actCityName);
				break;
		
	}

		}
		}


		}
