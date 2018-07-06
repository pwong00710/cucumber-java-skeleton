import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"H:/Projects/Source/home/cucumber-java-skeleton/src/test/resources/skeleton/searchWikipedia.feature"},
        plugin = {"json:H:/Projects/Source/home/cucumber-java-skeleton/target/2.json", "html:H:/Projects/Source/home/cucumber-java-skeleton/target/2"},
        monochrome = false,
        tags = {},
        glue = {"skeleton"})
public class Parallel02IT {
}
