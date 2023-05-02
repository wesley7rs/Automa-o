package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith (Cucumber.class)
@CucumberOptions (features = "src/teste/resources/Feature", glue = "steps", tags = "@tag1", plugin = {"preatty", "html: target/report.html"}, 
monochrome = true, dryRun = false)
	
	 
	public class runner {
	
}

