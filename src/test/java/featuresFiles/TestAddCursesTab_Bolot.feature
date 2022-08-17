Feature: Test add Courses tab

  Background:
    Given user is on Home page TalentLMS

  @addCourse
  Scenario:
      When ser clicks on Add course button
      Then user should see courses credentials
      When user writes course credentialse and clicks on save and select user button
      Then user navigate on user page to add them in course
      When user clicks on courseButton
      Then user navigate back to add course page
#      When user clicks on submitButton
#      Then user navigate to Courses page
