package org.com.api;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class Get {
	@Test
	public void getAllEmployee() {
//		RestAssured.baseURI="https://reqres.in/api/users";
//		RequestSpecification requestSpecification = RestAssured.given();
//		
//		Response request = requestSpecification.request(Method.GET,"7");
//		
//		System.out.println(request.asPrettyString());
//		System.out.println(request.getStatusCode());
//		
		RestAssured.baseURI="http://localhost:3000/";
		Response respones =RestAssured
		.given()
			.param("", "")
			.header("","")
			
		.when()
			.get("data");
		
		
			
		System.out.println(respones.asPrettyString());
		
			
		

	}

}
