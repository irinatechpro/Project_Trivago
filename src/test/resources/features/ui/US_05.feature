Feature: Hotel Details Page

  Background:
    Given go to the "url"


  Scenario: TC_01 Verify Hotel Detail Buttons
  When Go to the requested hotel
  Then Click on Overview
  Then Click Info
  Then Click on Photos
  Then Click on Review
  Then Click on prices
  And Verify that buttons on the page are clickable