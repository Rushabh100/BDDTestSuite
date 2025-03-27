Feature: Testing Contact List App

  Background: Setting up test case env
    Given User is on the LoginPage
    When User click on Signup button

  Scenario: Testing Signup functionality-Scenario1
    And User enters fname & lname
    And User click on the Submitbutton

  Scenario: Testing Signup Functionality-Scenario2
    And User enters email & password
    Then User clicks on Cancel button
