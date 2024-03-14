package com.omrbranch.runner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.omrbranch.base.BaseClassAPI;
import com.omrbranch.report.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun=true,tags="@Login or @StateList or @CityList or @Address or @Product",plugin= {"pretty", "json:target\\index.json"},snippets=SnippetType.CAMELCASE,features="src\\test\\resources",glue="com.omrbranch.stepdefinition")

public class TestRunnerClass extends BaseClassAPI {
	@AfterClass
	public static void afterClass() throws FileNotFoundException, IOException {
		Reporting.generateJvmReport(getProjectPath()+getPropertyFileValue("jsonPath"));
	}

}
