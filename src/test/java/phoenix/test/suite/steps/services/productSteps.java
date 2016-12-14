package phoenix.test.suite.steps.services;

import io.restassured.parsing.Parser;
import net.thucydides.core.annotations.Step;

import static io.restassured.RestAssured.*;
import static org.assertj.core.api.Assertions.assertThat;


public class productSteps {


String response;
  boolean assertValue;


@Step
  public void setup()
    {

    baseURI = "http://e04-commerce.mcs.bskyb.com/commerce-crm";
    port = 80;
    basePath = "";
    registerParser("text/plain", Parser.TEXT);
        //given().with().parameters( "operation", "getPortfolio" , "partyId" ,"14684834764293503452301").get("");



//param( "partyId", "12295302022840184581662")

//.given().get("  ?operation=getPortfolio&=");
    }

    @Step
    public void getProductResponse() {
        response= given().params("operation", "getPortfolio" , "partyId" ,"14684834764293503452301").get("/customerServlet").asString();

    }


    @Step
    public void assertProfile ()
    {
     // String dob = response.path("dateOfBirth");
      //response.then().assertThat().body("portfolio.id",equalTo("14684834767933503452319"));

        assertThat(response.contains("id:14684834767933503452319")).isTrue();

      // assertThat(dob).contains("12");
    }

    @Step
    public void printResponse ()
    {

        System.out.println(      " \n \n ----------- Full Json Response ---------- \n \n ");
        System.out.println( "   \n \n ----------- End of Test GetProduct ---------- \n \n ");

    }




}
