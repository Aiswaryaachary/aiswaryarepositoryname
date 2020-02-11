package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
//@CucumberOptions(features="Feature\\Cucumber.feature",glue= {"stepdev"},plugin= {"html:target//report.html"})

@CucumberOptions(features= {"Feature"}, glue= {"stepdev"})
public class TestRunner {

}
