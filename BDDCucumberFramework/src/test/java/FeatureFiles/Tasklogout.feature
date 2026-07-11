@Regression
Feature: Logging Out

  Background: 
    Given user opens the browser URL
    And user enters the username as "mngr664067"
    And user enters the password as "bYqYhat"
    When user clicks on login button
    Then user is on the homepage of the application

  Scenario: Logging out after the Process
    Given user scroll into log out
    When user clicks log out
    Then user successfully logged out
