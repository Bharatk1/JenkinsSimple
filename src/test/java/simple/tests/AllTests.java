package simple.tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(monochrome = true, features = "src/test/resources/features", 
glue = { "simple.stepdefs" }, plugin = {"pretty", "json:target/cucumber-reports/cucumber.json" }, tags = {"@satya30"})

public class AllTests {

}
