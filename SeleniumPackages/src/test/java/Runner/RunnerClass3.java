package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features = "src/test/java/feature/login.feature",
                 dryRun = true,
                 snippets = SnippetType.CAMELCASE
//                 glue = {"stepDefinition.stepDefinition1"}
		         )

public class RunnerClass3 extends AbstractTestNGCucumberTests{

}
