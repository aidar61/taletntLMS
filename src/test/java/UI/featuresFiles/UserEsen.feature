Feature: Events Engine test
  Background: Given Admin Login User Page
    Given admin into the system
@SmokeEsen
    Scenario: Add notifications
  When admin click on add notifications buttons
  Then юзер вводит имя в name input field
  Then user select Event
  And user select Recipient
  Then user full body
  And user click on Create notification button
  


