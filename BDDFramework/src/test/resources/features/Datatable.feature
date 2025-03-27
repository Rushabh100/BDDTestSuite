Feature: Testing Contact List App

  Scenario: Testing Login Functionality using Datatable
    Given User is on loginpage
    When User enters username & password
      | rushabh@gmail.com | Rushabh@12345 |
    Then User clicks on submit button
    And User verifies the title
    Then User click on add new contact button
    And User enters personal information
      | First Name | Madhuri       |
      | Last Name  | Jadhav        |
      | DOB        | 12/09/2000    |
      | Email      | abc@gmail.com |
      | Phone      |    9876543210 |