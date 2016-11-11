Feature: Client should get the portfolio of the sky customer returned

  In order to see the customer portfolio
  As a client
  I want to get the customer portfolio


  Scenario: client gets customer portfolio
    When the client gets the getPortfolio api using partyId pid-12295302022840184581662
    Then assert the profile result
    And print out the results