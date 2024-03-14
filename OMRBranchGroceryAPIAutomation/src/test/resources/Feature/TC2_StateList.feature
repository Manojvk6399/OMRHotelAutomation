@StateList
Feature: State Module API Automation

  Scenario: Verify user Get StateList through API
    Given User add headers for to stateList
    When User send "get" request for stateList endpoint
    Then User should verify the status code is 200
    And User should verify the stateList response message matches "Tamil Nadu" and saved stateId
