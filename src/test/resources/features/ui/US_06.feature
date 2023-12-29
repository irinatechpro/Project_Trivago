@US_06
Feature: House Details Page Functionality

Background: go_Homepage
  Given go to the "url"

  @US_06_TC_01
Scenario: Users see detailed information about prices, room types and amenities.
  Then select Landmark, Check in, Check out from dropdown menu and click on Search button
  Then click on Property type menu, select Entire House Apartment
  Then Check accurate pricing
  When user clicks the house name
  Then user clicks the overview button
   And check accurate amenities
#  And Check accurate room types

  @US_06_TC_02
 Scenario: Verify that buttons and links on the page are functional
   When select Landmark, Check in, Check out from dropdown menu and click on Search button
    Then click on Property type menu, select Entire House Apartment
    And verify Sort by dropdown menu is functional
#   When select Guest rating,  Location from dropdown menu
#   Then click on  View Map button
#   Then click on Return to list button


