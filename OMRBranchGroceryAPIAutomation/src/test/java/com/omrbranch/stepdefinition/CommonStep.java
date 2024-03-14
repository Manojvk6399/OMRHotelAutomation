package com.omrbranch.stepdefinition;

import org.junit.Assert;
import io.cucumber.java.en.*;

public class CommonStep {
	

	@Then("User should verify the status code is {int}")
	public void userShouldVerifyTheStatusCodeIs(Integer expectedStatusCode) {
	   
	    int actualStatusCode = TC1_LoginStep.globalDatas.getStatusCode();
		Assert.assertEquals("verify status code",200, actualStatusCode);
	}


}
