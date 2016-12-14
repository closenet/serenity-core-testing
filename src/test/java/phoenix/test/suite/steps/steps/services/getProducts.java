package phoenix.test.suite.steps.steps.services;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import phoenix.test.suite.steps.services.productSteps;


public class getProducts {

    @Steps
    productSteps productClass;

@When("^the client sends a request$")
    public void the_client_sends_a_request()
    {
        productClass.setup();
    }


 @And("^gets a response contains all products$")
public void gets_a_response_contains_all_products ()
 {

     productClass.getProductResponse();

 }


    @Then("^assert the products list$")
    public void assert_the_products_list()
    {

    productClass.assertProfile();
    }


    @And("^print the product response$")
    public void print_the_product_response()
    {
        productClass.printResponse();

    }
}
