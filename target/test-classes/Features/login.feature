#Author: Vikash Kumar Sah
#Date:  12--08-2021
Feature: To test Login functionality

  @smokeTest
  Scenario: Verify the login Page with title
    Given open the browser
    Given Open the url "https://www.icicibank.com/"
    Then Verify the page title
    Then Close the browser
