Feature:Saving personal details
Scenario :To check that the user profile updation works
  Given user is on the dashboard page
  When user clicks on <name> dropdown
  And  selects My Account option from the dropdown
  And  the user navigates to My profile page
  Then the user validates that all the details are pre-filled
  When the user selects the state from the state dropdown
  And  uploads his/her image
  And  clicks on the Save results buttons
  Then user validates that the new information is persisted successfully


