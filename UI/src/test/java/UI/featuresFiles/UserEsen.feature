Feature: Events Engine test
  Background: Given Admin Login User Page
    Given admin into the system
@SmokeEsen
    Scenario: Add notifications
  When admin click on add notifications buttons
  Then user input all field
  And user click on Create notification button
  Then user delete notification
  Then user click on history button
  And user click on Pending notifications button


  


