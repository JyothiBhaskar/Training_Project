package runner.com;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFiles",
glue={"stepDefinition","hooks.com"},
tags="@smoke",
//plugin= {"html:target/cucumber.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
plugin= {"html:target/cucumber.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class RunnerClass {
	
	

}
