package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features = "src/test/java/feature/createLead.feature",
//                 dryRun = true,
                 snippets = SnippetType.CAMELCASE,
                 glue = {"stepDefinition.sdpackage1"}
		         )

public class RunnerClass extends AbstractTestNGCucumberTests{

}
