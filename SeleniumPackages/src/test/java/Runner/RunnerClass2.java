package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features = "src/test/java/feature/CreateLeads.feature",
//                 dryRun = true,
                 snippets = SnippetType.CAMELCASE,
                 glue = "stepDefinition"
		         )

public class RunnerClass2 extends AbstractTestNGCucumberTests{

}
