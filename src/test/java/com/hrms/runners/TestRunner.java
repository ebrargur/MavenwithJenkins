package com.hrms.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/login.feature",
        glue = "com/hrms/stepdefinitions",
        dryRun = false,
        tags = {"@login"},//or @login
        strict= false,
        plugin = {"pretty",
        "html:target/cucumber-default-reports",
        "rerun:target/FailedTests.txt",
                "json:target/cucumber.json"}
)
//dry run checks if all the steps  have step defitinion
public class TestRunner {


}
