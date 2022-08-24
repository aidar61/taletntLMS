Feature: Get Users
@Esens
  Scenario: Get users by user name
    Given perform method GET to get user by user name
    Then status code 200 is returned


  @EsensTest2
  Scenario: Get users status
    Given perform method GET to get users status by user id
    Then status code 200 is returned1
    And user status is online

    @EsenTudaSuda
    Scenario: Delete user
      Given perform method POST to delete user

