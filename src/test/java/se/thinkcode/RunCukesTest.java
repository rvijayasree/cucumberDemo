package se.thinkcode;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(strict = false, features =".", format = { "pretty", "html:target/site/cucumber-pretty", "json:target/cucumber.json"}, tags = "@valid")

public class RunCukesTest {
}
