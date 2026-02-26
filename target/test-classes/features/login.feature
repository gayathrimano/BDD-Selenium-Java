Feature: Login functionality of Saucedemo

  Scenario: Successful login with valid credentials
    Given user is on the saucedemo login page
    When user enters username "standard_user" and password "secret_sauce"
    Then user should be logged in successfully
