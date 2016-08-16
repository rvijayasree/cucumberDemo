package se.thinkcode;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features =".",tags = "@valid")
public class RunCukesTest {
}
