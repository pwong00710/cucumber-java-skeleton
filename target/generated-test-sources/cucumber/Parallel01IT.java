import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"/Users/keithwong/Projects/cucumber-java-skeleton/src/test/resources/skeleton/belly.feature"},
        plugin = {"json:/Users/keithwong/Projects/cucumber-java-skeleton/target/1.json", "html:/Users/keithwong/Projects/cucumber-java-skeleton/target/1"},
        monochrome = false,
        tags = {},
        glue = {"skeleton"})
public class Parallel01IT {
}
