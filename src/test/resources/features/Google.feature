Feature: Google search functionality

  Scenario: Search for a car on Google
    Given User is on the Google homepage
    When User enters "car" in the search box
    And Clicks on the search button
    Then User is on Robot check page
