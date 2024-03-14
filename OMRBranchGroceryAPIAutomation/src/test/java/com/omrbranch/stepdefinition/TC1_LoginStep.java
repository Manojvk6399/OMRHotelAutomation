package com.omrbranch.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;

import com.omrbranch.base.BaseClassAPI;
import com.omrbranch.endpoints.EndPoints;
import com.omrbranch.globaldatas.GlobalDatas;
import com.omrbranch.pojo.login.Login_OutPut_Pojo;

import io.cucumber.java.en.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC1_LoginStep extends BaseClassAPI {
	Response response;
	static GlobalDatas globalDatas = new GlobalDatas();

	@Given("User add header")
	public void userAddHeader() {
		RequestSpecification header = header("accept", "application/json");
	  
		
	}
	@When("User add basic authentication for login")
	public void userAddBasicAuthenticationForLogin() throws FileNotFoundException, IOException {
		addBasiAuth(getPropertyFileValue("username"), getPropertyFileValue("password")
			);
	  
	}
	@When("User send {string} request for login endpoint")
	public void userSendRequestForLoginEndpoint(String string) {
		response = requestType("post", EndPoints.LOGIN);
		int statusCode = statusCode(response);
		globalDatas.setStatusCode(statusCode);
		
	    
	}
	
	@Then("User should verify the login response body firstname present as {string} and get the logtoken saved")
	public void userShouldVerifyTheLoginResponseBodyFirstnamePresentAsAndGetTheLogtokenSaved(String expectedFirstname) {
	   Login_OutPut_Pojo login_OutPut_Pojo = response.as(Login_OutPut_Pojo.class);
	   String ActFirstname = login_OutPut_Pojo.getData().getFirst_name();
	   System.out.println(ActFirstname);
	   System.out.println(expectedFirstname);
	   String logtoken = login_OutPut_Pojo.getData().getLogtoken();
	   globalDatas.setLogtoken(logtoken);
	   
	   Assert.assertEquals("Verify success",expectedFirstname,ActFirstname);
		
	}




}
