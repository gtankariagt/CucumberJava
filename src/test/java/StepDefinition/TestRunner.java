package StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/resources/Features",glue= {"StepDefinition"},
monochrome=true,
plugin={"pretty","html:target/HtmlReports","json:target/JsonReports/jreport.json","junit:target/xmlReports/xreport.xml"},
tags="@smokeTest")
public class TestRunner {

}
