Feature: Testing demo webshop login feature

  Scenario: User enters Username and Password
    Given the login page is opened
    When user enters aiswarya@gmail.com as username
    And user enters aish@123 as password
    Then user will click on login button
    Then demo webshop home page appears

    
    