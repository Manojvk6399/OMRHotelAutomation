@CityList
Feature: City Module API Automation

  Scenario: Verify user Get cityList through API
    Given User add header for to get cityList
    When User add request body stateId for get cityList
    And User send "post" request for cityList endpoint
    Then User should verify the status code is 200
    And User verify the cityList response message matches "Adikaratti" and saved cityId
