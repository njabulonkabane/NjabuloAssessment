package runner;

import io.cucumber.junit.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/features",
        glue={"utility","stepDefinitions"},
        plugin={"pretty","html:target/cucumber-html-report" }
)
public class runner {
}
