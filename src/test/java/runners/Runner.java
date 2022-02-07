package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
//"json:target/json-reports/cucumber.json"
//html:target/cucumber-reports
@CucumberOptions (
        plugin={"html:target/cucumber-reports.html",
                "json:target/cucumber-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},

        features="src/test/resourses/features",
        glue="stepDefinitions" ,
        tags=  "@test",

        dryRun= false
)

public class Runner {

}