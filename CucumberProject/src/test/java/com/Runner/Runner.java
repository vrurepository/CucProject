package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions(features="src/test/resources/Features",glue={"com.StepDefinition"}, monochrome=true, plugin= {"html:target/cucumber-reports/report.html"}, dryRun=false)
//"pretty"
//"json:target/cucumber-reports/report.html", "junit:target/cucumber-reports/report.html", "message:target/cucumber-reports/report.html"
// right click on report.html-->open with-->Web Browser
//strict has been decommissioned starting from Cucumber 7.0.0

public class Runner {

}
