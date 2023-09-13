package com.example.testrunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // Path to feature files
        glue = "com.example", // Package containing step definitions
        plugin = {
                "pretty", // Prints the Gherkin steps in a human-readable format
        }
)

public class TestRunner {

}
