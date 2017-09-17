package com.sep16;//import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-html-report","junit:target/cucumber-junit.xml",
                "json:target/cucumber.json","pretty:target/cucumber-pretty.txt"},
               // ,"usage:target/cucumber-usage.json"},
        features = {"src\\test\\resources\\com.sep16\\"},
        tags = {"@testSearch","~@wip"}

)
public class RunCukeTest {
}
