package StepDefinition19;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses

({
    TestRunnerSmoke.class,
    TestRunnerSanity.class,
    TestRunnerRegression.class
})

public class TestRunnerMaster {

}
