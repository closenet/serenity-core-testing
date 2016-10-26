package serenity.test.suite.steps.services;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import serenity.test.suite.steps.serenity.services.*;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;

public class getPortfolio  {

@Steps
profileSteps profileClass;

    @Before
    public void setUp ()
    {
        profileClass.setUp();

    }

    @When("^the client gets the getPortfolio api using partyId (.*)$")
     public void the_client_gets_the_getPortfolio_api_using_partyId_pid(String Id) //throws Throwable
    {
        profileClass.getProfileResponse(Id);
        System.out.println("pass");
     //   throw new PendingException();

    }


    @Then("^assert the profile result$")
    public void assert_the_profile_result()
    {

        profileClass.assertProfile();
        System.out.println("pass");


    }

    @And("^print out the results")
    public void print_out_the_results ()
    {

        profileClass.printResponse();
        System.out.println("pass");


    }
}
