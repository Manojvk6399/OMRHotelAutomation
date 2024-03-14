package com.omrbranch.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.omrbranch.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HooksClass extends BaseClass {
	@Before
	public void beforeScenario() throws FileNotFoundException, IOException {
		browserLaunch(getPropertyFileValue("browser"));
		openUrl(getPropertyFileValue("url"));
		maximizeWindow();
		implicitWait();

	}
	@After
	public void afterScenario(Scenario scenario) {
		if(!scenario.isFailed()) {
			scenario.attach(byteScreenShot(), "images/png", "Every Scenario");
		}
		quit();
		
	}

}
