package com.omrbranch.runner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.omrbranch.base.BaseClass;
import com.omrbranch.reports.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun=false,tags="@CancelBooking",plugin= {"pretty", "json:target\\index.json"},snippets=SnippetType.CAMELCASE,features="src\\test\\resources\\Feature",glue="com.omrbranch.stepdefinition")



public class TestRunnerClass extends BaseClass {
	@AfterClass
	public static void afterClass() throws FileNotFoundException, IOException {
		Reporting.generateJvmReport(getProjectPath()+getPropertyFileValue("jsonPath"));
	}

}
