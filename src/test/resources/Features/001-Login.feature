Feature: Login functionality

  @test
  Scenario: 001-Login
    Given   User On Login Page
    When    User Input Username
    And     User Input Password
    And     User click Button Login
    Then    User Success Login And User Redirect To Dashboard Page
