Feature:Successful login and transactions of member

  @Regression
  Scenario Outline:To check that the user is able to login into his account
    Given user is on the Sign In Page
    When User Navigate to Sign Up Page
    And user enters login details and logins into the portal
      |USERNAME  |<USERNAME> |
      |PASSWORD  |<PASSWORD>|
    Then user is successfully able to login into the account

  Examples:
    |USERNAME                  |PASSWORD  |
    |somyaoct1993@gmail.com    | somi123  |


