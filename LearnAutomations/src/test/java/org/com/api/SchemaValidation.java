package org.com.api;

import static io.restassured.RestAssured.*;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;

public class SchemaValidation {
	@Test
	public void validationSchema() {
		File input = new File("src/test/resources/input.json");
		given()
		 .baseUri("http://localhost:3000/")
		 .header("content-Type","application/json")
		 .body(input)
		.when()
			.post("data")
		.then()
			.body(JsonSchemaValidator.matchesJsonSchemaInClasspath("Schema.json"));
		 
	}

}
