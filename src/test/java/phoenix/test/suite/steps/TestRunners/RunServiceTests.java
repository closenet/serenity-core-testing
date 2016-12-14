package phoenix.test.suite.steps.TestRunners;


import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features= {"src/test/resources/features/services/uk/getPortfolio.feature"} )
public class RunServiceTests {
}
