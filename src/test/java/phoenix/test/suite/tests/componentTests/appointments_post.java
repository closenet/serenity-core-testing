package phoenix.test.suite.tests.componentTests;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
import phoenix.test.suite.steps.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.*;


@RunWith(SerenityRunner.class)
public class appointments_post {

    @Steps
    appointmentsSteps appointmentClass;

    String partyId = "13824472694041890451075";
    String intentionCode = "STB_GATEWAY_1";
    String earliestDate = "2016-12-12";


    @Test
    @Title("Assert an Appointment dates come back for a customer")
    public void WhenSABBCustomerBuysQThenCanGet64AppointmentsBack ()
    {
        //When
        Response response = appointmentClass.Request_To_Retrieve_Available_Appointments(earliestDate , intentionCode, partyId );

        //Then assert that the number of dateas is 64
         appointmentClass.Assert_That_Number_Of_Dates_64().then().assertThat().body("appointments.start.size", is(64));


        //And print the results
        appointmentClass.Print_The_Response();

    }
}



//        response.then().assertThat().body("online", equalTo(true));
//        response.then().assertThat().contentType("application/json;charset=UTF-8");
//        response.then().assertThat().statusCode(200);
//        response.then().assertThat().body("appointments.start.size", is(64));