Feature: Hotel Details Page

  Background:
    Given go to the "url"
    When login as a user

  Scenario: TC_01 Confirm that hotel details pages provide accurate information
  When Choose a place as destination and select all the necessary steps than click on Search
  Then Click on a hotel from the search results
  Then Check if the details include accurate pricing
  Then Check if the details include accurate amenities
  Then Verify that buttons and links on the page are functional

  Scenario: TC_02 Hotel details page is working as expected
  When Choose a place as destination and click on Search
  Then Click on a hotel from the search results page
  Then Click on View Deal button
  Then Click on See description
  Then Click on See all services
  Then Click on See the rates and Pricing conditions
  Then Verify that buttons and links on the page are functional
