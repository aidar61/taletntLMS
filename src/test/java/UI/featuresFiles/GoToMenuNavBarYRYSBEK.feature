@goto
Feature: Test GoTo NavBar menu

  Background: Login to the system
    Given admin logins into the system

  Scenario: GoTo navBar menu test
    When admin hovers on GoTo button from NavBar menu
    And admin clicks on Home button
    Then admin should see Home text as "Home"
    When admin hovers on GoTo button from NavBar menu
    And admin clicks on Users button
    Then admin should see Users text as "Home / Users"
    When admin hovers on GoTo button from NavBar menu
    And admin clicks on Courses button
    Then admin should see Courses text as "Home / Courses"
    When admin hovers on GoTo button from NavBar menu
    And admin clicks on Course Store button
    Then admin should see Course Store text as "Home / Course Store"
    When admin hovers on GoTo button from NavBar menu
    And admin clicks on Categories button
    Then admin should see Categories text as "Home / Categories"
    When admin hovers on GoTo button from NavBar menu
    And admin clicks on Groups button
    Then admin should see Groups text as "Home / Groups"
    When admin hovers on GoTo button from NavBar menu
    And admin clicks on Branches button
    Then admin should see Branches text as "Home / Branches"
    When admin hovers on GoTo button from NavBar menu
    And admin clicks on Reports button
    Then admin should see Reports text as "Home / Reports"
    When admin hovers on GoTo button from NavBar menu
    And admin clicks on Import-Export button
    Then admin should see Import-Export text as "Home / Import"
    When admin hovers on GoTo button from NavBar menu
    And admin clicks on Events engine button
    Then admin should see Events engine text as "Home / Notifications"
    When admin hovers on GoTo button from NavBar menu
    And admin clicks on Account & Settings button
    Then admin should see Account & Settings text as "Home / Account & Settings"
    When admin hovers on GoTo button from NavBar menu
    And admin clicks on Add user button
    Then admin should see Add user text as "Home / Users / Add user"
    When admin hovers on GoTo button from NavBar menu
    And admin clicks on Add course button
    Then admin should see Add course text as "Home / Courses / Add course"


