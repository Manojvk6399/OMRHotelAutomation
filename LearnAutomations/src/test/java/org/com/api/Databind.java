package org.com.api;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;


public class Databind {
	@Test
	public void serilication() {
		Map<String, Object> jsonObject= new HashMap<String,Object>();
		List<String> skills = new ArrayList<String>();
		jsonObject.put("FirstName", "Manoj");
		jsonObject.put("LastName", "Kumar");
		jsonObject.put("Email","manojvk@97@gmail.com");
		
		skills.add("Java");
		skills.add("python");
		skills.add("SQL");
		
		jsonObject.put("Skills", skills);
		
		System.out.println(jsonObject);
		given()
			.baseUri("http://localhost:3000/")
			.header("content-Type","application/json")
			.body(jsonObject)
			.log()
			.all()
		.when()
			.post("data")
		.then()
			.log()
			.all();
			
			
			
		
}
}
