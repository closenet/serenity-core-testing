package phoenix.test.suite.tests;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
import phoenix.test.suite.utilities.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.*;


@RunWith(SerenityRunner.class)
public class appointments_post {

    @Steps
    appointmentsUtils appointmentClass;

    String partyId = "13824472694041890451075";
    String intentionCode = "STB_GATEWAY_1";
    String earliestDate = "2016-12-12";


    @Test
    @Title("Assert an Appointment dates come back for a customer")
    public void WhenSABBCustomerBuysQThenCanGetAppointmentsBack ()
    {
        //when
        appointmentClass.setup();
        Response response = appointmentClass.retrieve_available_appointments(earliestDate , intentionCode, partyId );

        //then
        response.then().assertThat().body("online", equalTo(true));
        response.then().assertThat().contentType("application/json;charset=UTF-8");
        response.then().assertThat().statusCode(200);
        response.then().assertThat().body("appointments.start.size", is(64));

        //and
         JsonPath responseAsjson = response.then().extract().jsonPath();
        System.out.println( responseAsjson.prettify() + "   ----------- Full Json Response ----------   ");

    }
}
