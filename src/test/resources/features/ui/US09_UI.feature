@US09
Feature: US_09_Error_Handling

  Background: send a message
    Given go to the "url"
    When login as a user


  Scenario Outline: send a message
    When user enters destination "<Destination>"
    And user enters checkIn "<CheckIn>"
    And user enter checkOut "<CheckOut>"
    And user click on search button
    Then validate error message

    And close application
    Examples:
      | Destination | CheckIn  | CheckOut |
      | gdfgjldfgj  | 02/02/24 | 02/02/24 |
      | Lisbon      | 12/12/01 | 14/12/01 |