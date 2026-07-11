package StepDefinition19;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions

(features = "src/test/java/FeatureFiles/", 
glue = {"StepDefinition19" }, 
tags = "@Regression",
dryRun = false, 
monochrome = false,
plugin = { "pretty", "html:target/HtmlReports/index.html","json:target/cucumber.json", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }

)

public class TestRunnerRegression {

}
