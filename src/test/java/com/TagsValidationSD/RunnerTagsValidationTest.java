package com.TagsValidationSD;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/com/TagsMessageValidationFF/"},
		glue={"com.TagsValidationSD"},
		//dryRun=false,
		//monochrome=true,
		tags="@smoke and @Regression",
		plugin={"pretty",
				"html:target/cucumber-htmlreport.html",
				"json:target/cucumber-report6.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:target/ExtentReport1.html"
		}
		)
public class RunnerTagsValidationTest {

}
