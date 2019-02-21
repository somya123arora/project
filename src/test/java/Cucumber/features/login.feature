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


  Scenario :To check that the user profile updation works
    Given user is on the dashboard page
    When user clicks on <name> dropdown
    And  selects My Account option from the dropdown
    And  the user navigates to My profile page
    Then the user validates that all the details are pre-filled
    When the user selects the state from the state dropdown
    And  uploads his/her image
    And  clicks on the Save results buttons
    Then user validates that the new information persists successfully