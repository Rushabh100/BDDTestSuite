Feature: Testing Contact List App

  Scenario: Testing Login Functionality
    Given user is on login page
    When user enters username
    And user enters password
    Then user click on login button
    And user verifies the title of the page
