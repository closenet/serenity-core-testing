Feature: Open the sign up page
  In order to join have a sky account
  As a customer
  I want to make sure I can sign up


  Scenario: open sky sign up page
    Given The user open the sky Sign Up page
    And add his first name Euros
    And add his last name Rees
    And confirm his email address Mohmmed.al-Nuaimi@sky.uk
    And confirm his password ILoveMCS
    And agree to the confirmation page
    #And Agree to sky contact policy
    # Then Submit the page

