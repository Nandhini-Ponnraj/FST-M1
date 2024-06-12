package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:/Users/003SVN744/IdeaProjects/FST_CUCUMBER/src/test/java/Features",
        glue = {"StepDefinitions"},
        tags = "@activity5"
)


public class Activity5 {
}
