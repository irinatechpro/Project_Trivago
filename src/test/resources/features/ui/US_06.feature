@US_06
Feature: House Details Page Functionality

 Background: go_Homepage
   Given go to the "url"
  @US_06_TC01
  Scenario: Users see detailed information about prices, room types and amenities.
      When select Landmark, Check in, Check out from dropdown menu and click on Search button
    Then click on Property type menu, select Entire House Apartment
   Then verify Price menu is selectable
#    And verify Filters menu is selectable

#  @US06_TC02
#  Scenario: User should be able to click any button and link and get the information they need.
#    When
#    Then
#    Then
#    And
#    And
#    Then
#    And
#    Then