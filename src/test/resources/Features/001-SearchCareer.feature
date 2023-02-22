Feature: Landing page, Search career input text 'J'

  @test
  Scenario: 001-SearchCareer
    Given   User On landing page
    When    User click career
    And     User Input J for search career
    Then    User Success Search J
