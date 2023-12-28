@US03
Feature: Trivago Search Functionality

  Background:
    Given go to the "url"
    When login as a user
  @US03_TC01
  Scenario: Apply location-based filters to search for accommodations (TC_03_01)
    When I perform a search for hotels or accommodations in a specific location
    And I apply location-based filters (e.g., city, neighborhood)
    Then I verify that the search results are updated to include only accommodations in the specified location

  @US03_TC02
  Scenario: Apply Filters Based on Price and Amenities (TC_03_02)
    When I perform a search for hotels or accommodations
    And I apply filters based on price range and desired amenities
    Then I confirm that the search results are refined based on the selected filters

  @US03_TC03
  Scenario: Test Sorting Options (TC_03_03)
    When I perform a search for hotels or accommodations
    And I observe the available sorting options
    Then I test each sorting option
    And verify that the search results are accurately sorted according to the selected criterion

  @US03_TC04
  Scenario: Apply Invalid Location Filter and Unreasonable Price Range (TC_03_04)
    When I perform a search
    And I attempt to apply invalid Location and Price filters
    Then I verify the behavior of the application
