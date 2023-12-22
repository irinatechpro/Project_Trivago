Feature: Location-Based Filtering in Trivago Application

  Scenario: Apply location-based filters to search for accommodations

    Given I open the Trivago application url
    When I perform a search for hotels or accommodations in a specific location
    And I apply location-based filters (e.g., city, neighborhood)
    Then I verify that the search results are updated to include only accommodations in the specified location
