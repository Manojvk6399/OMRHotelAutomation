package com.omrbranch.stepdefinition;

import java.util.ArrayList;

import org.junit.Assert;

import com.omrbranch.base.BaseClassAPI;
import com.omrbranch.endpoints.EndPoints;
import com.omrbranch.pojo.address.State;
import com.omrbranch.pojo.address.StateList_Output_Pojo;

import io.cucumber.java.en.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC2_StateListStep extends BaseClassAPI {
	Response response ;
	int stateNum ;
	String stateIdNum ;
	

	@Given("User add headers for to stateList")
	public void userAddHeadersForToStateList() {
		
	RequestSpecification reqSpec = header("accept", "application/json");
		
	}
	@When("User send {string} request for stateList endpoint")
	public void userSendRequestForStateListEndpoint(String type) {
		response = requestType(type,EndPoints.STATELIST);

		int statusCode = statusCode(response);
		TC1_LoginStep.globalDatas.setStatusCode(statusCode);
		
	}
	@Then("User should verify the stateList response message matches {string} and saved stateId")
	public void userShouldVerifyTheStateListResponseMessageMatchesAndSavedStateId(String expStateName) {
		
		StateList_Output_Pojo stateList_Output_Pojo = response.as(StateList_Output_Pojo.class);
		ArrayList<State> data = stateList_Output_Pojo.getData();

		for (State eachStateList : data) {
			// Get the state Name
			String actStateName = eachStateList.getName();
			if (actStateName.equals(expStateName)) {
				stateNum = eachStateList.getId();
				stateIdNum = String.valueOf(stateNum);
				TC1_LoginStep.globalDatas.setStateIdNum(stateIdNum);
				System.out.println(stateNum);
				TC1_LoginStep.globalDatas.setStateNum(stateNum);
				Assert.assertEquals("Verify State name success msg",expStateName,actStateName );

				
			}
		}
	}




}
