Feature: Google search functionality

  Scenario: Search for a car on Google
    Given User is on the Google homepage
    When User searches "car" in the search box
    Then User is on Robot check page
