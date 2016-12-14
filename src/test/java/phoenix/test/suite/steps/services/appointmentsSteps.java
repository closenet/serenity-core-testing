package phoenix.test.suite.steps.services;

import io.restassured.response.Response;
import net.thucydides.core.annotations.Step;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;


public class appointmentsSteps {

    private Response response;

    @Step
    public void setup() {

        baseURI = "http://appointments-service-e05.cf.dev-paas.bskyb.com";
        port = 80;

    }

    @Step
    public Response retrieve_available_appointments(String earliestDate, String intentionCode, String partyId) {

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

}

