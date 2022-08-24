package API.runnerAPI;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/Users/Esen/IdeaProjects/taletntLMS/API/src/test/java/API/featuresFiles/users/esen",
        glue = "API/stepDefinitions/Esen",
        tags = "@EsenTudaSuda",
        dryRun = false,
        monochrome = true,
        publish = true,
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports",
                "json:target/cucumber.json"
        })
public class Runner {
}
