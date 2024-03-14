package com.omrbranch.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseClassAPI {
	RequestSpecification reqSpec;
	Response response;
	

	public RequestSpecification pathParam(String key, String value) {
		reqSpec = reqSpec.pathParam(key, value);
		return reqSpec;
	}

	public RequestSpecification header(String key, String value) {
		reqSpec = RestAssured.given().header(key, value);
		return reqSpec;
	}

	public void addHeader(Headers headers) {
		reqSpec = RestAssured.given().headers(headers);
	}

	public void body(String body) {
		reqSpec = reqSpec.body(body);
	}
	public void body(Object body) {
		reqSpec = reqSpec.body(body);
	}

	public Response requestType(String key, String url) {
		switch (key) {
		case "get":
			response = reqSpec.get(url);
			break;
		case "post":
			response = reqSpec.post(url);
			break;
		case "put":
			response = reqSpec.put(url);
			break;
		case "patch":
			response = reqSpec.patch(url);
			break;
		case "delete":
			response = reqSpec.delete(url);
			break;

		default:
			break;
		}
		return response;
	}

	public void addBasiAuth(String username, String password) {
		reqSpec = reqSpec.auth().preemptive().basic(username, password);
	}

	public int statusCode(Response response) {
		int statusCode = response.statusCode();
		return statusCode;
	}

	public String asString(Response response) {
		String asString = response.asString();
		return asString;

	}

	public String aspretty(Response response) {
		String asPrettyString = response.asPrettyString();
		return asPrettyString;
	}
	
	public static String getProjectPath() {
		String path = System.getProperty("user.dir");
		return path;

	}
	public static String getPropertyFileValue(String key) throws FileNotFoundException, IOException {
		Properties properties= new Properties();
		properties.load(new FileInputStream(getProjectPath()+"\\Config\\config.properties"));
		Object object = properties.get(key);
		String value=(String)object;
		return value;
		
	}


}
