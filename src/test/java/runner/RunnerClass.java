package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/featuresFiles",
        glue = "stepDefinitions",
        tags = "",
        dryRun = true,
        monochrome = true,
        publish = true,
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports",
                "json:target/cucumber.json"
        }
)
public class RunnerClass {

}
