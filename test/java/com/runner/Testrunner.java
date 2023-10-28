package com.runner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.report.Reporting;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(tags =(""),stepNotifications = true,snippets = SnippetType.CAMELCASE,publish = true,monochrome = false,dryRun = false,plugin={"pretty","json:target\\index.json"},features = "src\\test\\resources",glue = "com.omrbranch.stepdefinition")
public class Testrunner {
	@AfterClass
	public static void afterclass() throws FileNotFoundException, IOException {
		Reporting.generatingJVMreport("C:\\Users\\ganes\\eclipse-workspace\\Cucumber\\target\\index.json");
	}


}