package API.runnerAPI;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/API/featuresFiles",
        glue = "src/test/java/API/stepDefinitions",
        tags = "@SignUp",
        dryRun = true,
        monochrome = true,
        publish = true,
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports",
                "json:target/cucumber.json"
        })
public class Runner {
}
