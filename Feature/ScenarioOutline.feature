Feature: Login Funcyionality Testing

  Scenario Outline: Login with multiple sets of test data
    Given User will open the application
    When User clicks on signin link
    When User enters "<username>" and "<password>"
    Then User will click on login button
    Then Demo Webshop home page will display

    Examples: 
      | username                     | password   |
      | aiswarrya.achary12@gmail.com | aish_1234  |
      | aiswaryaachary1233           | aiswarya@1 |
