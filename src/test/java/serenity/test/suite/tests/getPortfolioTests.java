package serenity.test.suite.tests;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;
import serenity.test.suite.steps.serenity.services.profileSteps;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value="src/test/resources/csv/test.csv")
public class getPortfolioTests {
    @Steps
    profileSteps profileClass;

    private String partyId;

    public void assignTestData (String partyId)
    {

         this.partyId = partyId;
    }

    @Test
    @Title("Getting a profile back upon reqeust")
    public void setUp ()
    {
        //given
        profileClass.setUp();
        profileClass.getProfileResponse(partyId);
        //when
        System.out.println("pass");

        //then
        profileClass.assertProfile();
        System.out.println("pass");

        //and
        profileClass.printResponse();
        System.out.println("pass");
    }


}
