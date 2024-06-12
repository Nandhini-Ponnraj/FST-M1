package testRunner;



import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:/Users/003SVN744/IdeaProjects/FST_CUCUMBER/src/test/java/Features",
        glue = {"StepDefinitions"},
        tags = "@activity1"
)

public class ActivitiesRunner {
    //empty
}