@Sanity
Feature: Creation of new Account ID

  Background: 
    Given user opens the browser URL
    And user enters the username as "mngr664067"
    And user enters the password as "bYqYhat"
    When user clicks on login button
    Then user is on the homepage of the application

  Scenario: Account ID creation
    Given user navigates into New Account Page
    And user fetch customer ID from excel and enter into customer ID field
    And user enter initial deposit amount value
    And User clicks on Submit button in Account Page
    Then Account ID should be created successfully
    And User captures and stores the Account ID in Excel and saves it
