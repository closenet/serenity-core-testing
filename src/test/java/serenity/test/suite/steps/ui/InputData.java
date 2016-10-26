package serenity.test.suite.steps.ui;

import cucumber.api.java.en.And;

import cucumber.api.java.en.Given;
import serenity.test.suite.pages.SkySignUpPage;


public class InputData {

    SkySignUpPage signUpPage;

    @Given("^The user open the sky Sign Up page$")
    public void the_user_open_the_sky_Sign_Up_page() {
        // Write code here that turns the phrase above into concrete actions
        signUpPage.open();
    }

    @And("^add his first name (.*)$")
    public void EnterHisFirstName (String InputValue)
    {
        signUpPage.getElementIds("#firstname", InputValue);
    }


    @And("^add his last name (.*)$")
    public void EnterHisLastName (String InputValue)
    {
        signUpPage.getElementIds("#lastname", InputValue);
    }

    @And("^confirm his email address (.*)$")
    public void ConfirmEmail (String InputValue) {
        signUpPage.getElementIds("#confirmEmail", InputValue);
    }


    @And("^confirm his password (.*)$")
    public void ConfirmPassword (String InputValue) {
        signUpPage.getElementIds("#confirmPassword", InputValue);
    }

    @And("^(agree|disagree) to the confirmation page$")
    public void AgreeTerms (String InputValue) {

        if (InputValue.equals("agree")) {
            signUpPage.clickElement("#termsAndConditions");
        }
    }

}
