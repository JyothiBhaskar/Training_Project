
@tag
Feature: Testing Amazon login Feature

  @tag1
  Scenario: Verify login to the application
    Given I want to access the application
    When I enter user name and password
    And click on login button
    Then user displayed with Homepage dashboard
    

  