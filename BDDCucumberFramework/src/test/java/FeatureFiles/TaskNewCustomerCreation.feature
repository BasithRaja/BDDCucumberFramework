@Smoke
Feature: Creation of new Customer

  Background: 
    Given user opens the browser URL
    And user enters the username as "mngr664067"
    And user enters the password as "bYqYhat"
    When user clicks on login button
    Then user is on the homepage of the application

  Scenario: Create new customer with all details
    And user navigates into New Customer Page
    And user entered below details in the respective fields
      | Name        | DOB        | Address | City    | State      | PIN    | Phone      | Email             | Password |
      | Basith Raja | 01/01/1995 | Chennai | Chennai | Tamil Nadu | 600001 | 9876543210 | basith64567225727@gmail.com | test123  |
    And User clicks on Gender button
    And User clicks on Submit button
    Then Customer should be created successfully
    And User captures and stores the Customer ID in Excel and saves it