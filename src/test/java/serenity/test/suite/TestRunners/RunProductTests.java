package serenity.test.suite.TestRunners;


import cucumber.api.CucumberOptions;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import cucumber.api.java.Before;
import org.junit.runner.RunWith;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/services/uk/getProducts.feature")
public class RunProductTests {


}
