Feature: As a google user, I want to search for cucumber so that I can find it correctly

 @testSearch
  Scenario: Searching for cucumber correctly
    Given I goto the search site
    When I search for "Cucumber"
    Then I should find the first link for "Cucumber" official site

  @testSearch
  Scenario: Searching for cucumber NOT Correctly
    Given I goto the search site
    When I search for "Cucumber"
    Then I should find the first link for "Cucumber1" official site

  @testSearch
  Scenario: Searching for cucumber correctly another way
    Given I goto the search site
    When I search for "Cucumber"
    Then I should find the first link for "Cucumber" official site
