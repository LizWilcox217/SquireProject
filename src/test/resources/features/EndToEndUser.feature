Feature: End to End Test for GoRest's User Api

  Scenario: Test End to End user functionality
    When A user is created
    And User is sent to server
    Then Verify user has been created
    When User information is updated
    Then Verify user has been updated
    When User is deleted
    Then Verify user has been deleted

   Scenario: User can add or modify favorite city and country
     Given A user is created
     And User is sent to server
     Then User can add modify favorite city and country

