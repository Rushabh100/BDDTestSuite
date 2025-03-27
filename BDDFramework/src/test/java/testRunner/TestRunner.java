package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		// locate the feature file
		features = { "Hooks.feature" },

		// locate the step definition file
		glue = { "Hooks.java" },

		dryRun = false,

		monochrome = true,
		
		plugin = {"pretty",
				"html:target/report.html",
				"pdf:target/report1.pdf",
				"txt:target/report2.txt"}
		
		
		

)

public class TestRunner {

}
