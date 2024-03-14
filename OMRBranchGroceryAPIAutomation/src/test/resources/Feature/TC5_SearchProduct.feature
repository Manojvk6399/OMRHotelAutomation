@Product
Feature: Search product in API Automation

  Scenario Outline: Verify search product to the application api
    Given User add header for to get cityList
    When User add request body to search "<productname>"
    And User send "post" request to search product endpoint
    Then User should verify the status code is 200
    And User should verify the posted search product body product text message matches "Tata Sampann 100% Iranian Pistachios Roasted & Salted in Fruit & Nuts"

    Examples: 
      | productname |
      | nuts        |
