Feature: Verfying OMRlogin Module
  Scenario Outline: Verfying OMRlogin with valid credentials
    Given user is on the omrbranch page
    When user enter "<email>" and "<password>"
    And user click the login button
    Then user should verify after login succes message

    Examples: 
      | email                  | password |
      | palpandi0601@gmail.com | Pal@1234 |