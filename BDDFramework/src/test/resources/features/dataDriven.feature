Feature: Testing contact list app

  Scenario Outline: Testing validity of credentials
    Given User is on LoginPage
    When User is providing "<Username>" & "<Password>"
    Then User is clicking on submitButton
    Then User is Verifying the title of the Page 

    Examples: 
      | Username          | Password      |
      | rushabh@gmail.com | Rushabh@12345 | #PositiveScenario
      | rushabh@gmail.com |      12345678 |	#NegativeScenario
      | abc@gmail.com     | Rushabh@12345 | #NegativeScenario
