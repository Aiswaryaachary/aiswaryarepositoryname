 Feature: to register a user
 
 Scenario: User enters Username and Password
    Given the Register page is opened
    When user enters the gender
    And user enters first name
    And user enters last name
    And user enters email
    And user enters password
    And user enters confirm password
    Then user will click on Register button
    Then user will ve registered