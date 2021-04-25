import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)          // Test runner specifier
@CucumberOptions(                 // telling the cucumber where is the feature files are
        features = {"features"},
        glue = {"stepDefinitions"},//telling the cucumber where is the step definitions are
        plugin = {"json:report/json/cucumber.json"}
)

public class TestRunner {
}

