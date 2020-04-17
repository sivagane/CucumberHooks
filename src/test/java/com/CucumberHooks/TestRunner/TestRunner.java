package com.CucumberHooks.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\sivag\\eclipse-workspace\\CucumberHooks\\src\\main\\java\\com\\CucumberHooks\\Feature\\Cucumber.feature",
glue= {"com.CucumberHooks.StepDefinition"},
monochrome=false,
strict=false,
dryRun=false)
public class TestRunner {

}
