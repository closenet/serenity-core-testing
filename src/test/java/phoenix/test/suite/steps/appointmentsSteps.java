package phoenix.test.suite.steps;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import net.thucydides.core.annotations.Step;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;


public class appointmentsSteps {

    private Response response;


    @Step
    public Response Request_To_Retrieve_Available_Appointments(String earliestDate, String intentionCode, String partyId) {

        baseURI = "http://appointments-service-e05.cf.dev-paas.bskyb.com";
        port = 80;

        Map<String, Object> jsonAsMap = new HashMap<>();
        jsonAsMap.put("partyId", partyId);
        jsonAsMap.put("earliestDate", earliestDate);
        jsonAsMap.put("intentionCodes", Arrays.asList(intentionCode));

        response = given().contentType("application/json")
                .body(jsonAsMap)
                .when()
                .post("/appointments");

        return response;
    }

    @Step
    public Response Assert_That_Number_Of_Dates_64()
    {
        return response;

    }


    @Step
    public void Print_The_Response ()
    {
        JsonPath responseAsjson = response.then().extract().jsonPath();
        System.out.println( responseAsjson.prettify() + "   ----------- Full Json Response ----------   ");

    }




}

