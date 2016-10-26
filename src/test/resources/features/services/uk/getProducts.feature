Feature: Client should get sky products returned
  In order to see product
  As a client
  I want to get sky product


  Scenario: client gets all product
    When the client sends a request
    And gets a response contains all products
    Then assert the products list
    And print the product response