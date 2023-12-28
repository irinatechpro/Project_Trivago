@US_06
Feature: House Details Page Functionality

 Background: go_Homepage
   Given go to the "url"
  @US_06_TC_01
  Scenario: Users see detailed information about prices, room types and amenities.
      When select Landmark, Check in, Check out from dropdown menu and click on Search button
    Then click on Property type menu, select Entire House Apartment
   Then Check accurate pricing
   And Check accurate amenities
    And Check accurate room types

  @US_06_TC_02
  Scenario: Verify that buttons and links on the page are functional
    When select Landmark, Check in, Check out from dropdown menu and click on Search button
    Then click on Property type menu, select Entire House Apartment
    When select Guest rating,  Location from dropdown menu
   Then click on  View Map button
    Then click on Return to list button
    And select  Distance &Recommended from  Sort by dropdown menu
