package serenity.test.suite.steps.serenity.services;

import static io.restassured.RestAssured.*;

import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.Matchers.*;
import static org.assertj.core.api.Assertions.assertThat;


public class profileSteps {


    Response response;
    String responseAsString;


    @Step
    public void setUp ()
    {
        baseURI = "http://e05-identity.mcs.bskyb.com/mcs-identity";
        port = 80;
        basePath = "";
        registerParser("text/json", Parser.JSON);

    }

    @Step
    public void getProfileResponse(String partyId) {

        response = given().get("/contact/"+ partyId).then().extract().response();
        responseAsString = response.then().extract().asString();
    }


    @Step
    public void assertProfile ()
    {
        String dob = response.path("dateOfBirth");
        response.then().assertThat().body("title",equalTo("MRS"));
        assertThat(dob).contains("12");
    }

    @Step
    public void printResponse ()
    {

        System.out.println( responseAsString  +   " \n \n ----------- Full Json Response ---------- \n \n ");
        System.out.println( "   \n \n ----------- End of Test GetProfile ---------- \n \n ");

    }

}












