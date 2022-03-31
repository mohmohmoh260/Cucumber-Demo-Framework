package com.test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class CucumberRun {

	@CucumberOptions(
			plugin = {"pretty",
					"html:target/cucumber-reports/cucumber.html",
					"json:target/cucumber-reports/cucumber.json",
					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
			},
			features = {"src/test/resources/features"},
			glue = {"com.test.stepDefinitions"},
			tags = "@RunTest"
	)

	public static class TestRunner extends AbstractTestNGCucumberTests {

	}

}
