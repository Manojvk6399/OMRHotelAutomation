package com.omrbranch.stepdefinition;

import java.util.ArrayList;


import org.testng.Assert;

import com.omrbranch.base.BaseClassAPI;
import com.omrbranch.endpoints.EndPoints;
import com.omrbranch.payloadmanager.PayloadObjectManager;
import com.omrbranch.pojo.product.ProductList;
import com.omrbranch.pojo.product.ProductList_Output_Pojo;

import io.cucumber.java.en.*;
import io.restassured.response.Response;

public class TC5_SearchProductStep extends BaseClassAPI{
	Response response;
	PayloadObjectManager pom = new PayloadObjectManager();


	@When("User add request body to search {string}")
	public void userAddRequestBodyToSearch(String product) {
	 body(pom.getProductPayload().searchProductPayload(product));
	}
	@When("User send {string} request to search product endpoint")
	public void userSendRequestToSearchProductEndpoint(String type) {
		response = requestType(type,EndPoints.SEARCHPRODUCT);

		int statusCode = statusCode(response);
		System.out.println(statusCode);
		TC1_LoginStep.globalDatas.setStatusCode(statusCode);
	}


	@Then("User should verify the posted search product body product text message matches {string}")
	public void userShouldVerifyThePostedSearchProductBodyProductTextMessageMatches(String expProductName) {
		ProductList_Output_Pojo productList_Output_Pojo = response.as(ProductList_Output_Pojo.class);
		ArrayList<ProductList> listOfProduct = productList_Output_Pojo.getData();
		
		for (ProductList productList : listOfProduct) {
			
			int productId = productList.getId();
				if (productId==20) {
					
					String actProductName = productList.getText();
					System.out.println(actProductName);
					Assert.assertEquals("Verify success",expProductName,actProductName);
				}
			}
}
		
	}






