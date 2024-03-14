@Address
Feature: Address ModulePI Automation
	@Address
  Scenario Outline: Verify add user address to the application through api
    Given User add header and bearer authorization for accersing address endpoint
    When User add request body for add new  address "<first_name>","<last_name>","<mobile>","<appartment>","<state>","<city>","<country>","<zipcode>","<address>" and "<address_type>"
    And User send "post" request for add user Address endpoint
    Then User should verify the status code is 200
    And User should verify the addUserAddress response message matches "Address added successfully"

    Examples: 
      | first_name | last_name | mobile     | appartment | state | city | country | zipcode | address | address_type |
      | Manoj      | Kumar     | 8012936323 | VMK        |    35 | 3648 |      12 |  625513 | chennai | Work         |
	
  Scenario Outline: Verify UpdateUpdate to the application through api
    Given User add header and bearer authorization for accersing address endpoint
    When User add request body for add new  address "<addressId>","<first_name>","<last_name>","<mobile>","<appartment>","<state>","<city>","<country>","<zipcode>","<address>" and "<address_type>"    
    And User send "put" request for update user Address endpoint
    Then User should verify the status code is 200
    And User should verify the updateUserAddress response message matches "Address updated successfully"

    Examples: 
      | first_name | last_name | mobile     | appartment | state | city | country | zipcode | address | address_type |
      | Manoj      | Kumar     | 8012936323 | VMK        |    35 | 3648 |      12 |  625513 | chennai | Work         |

  Scenario: Verify getUserAddress to the application through api
    Given User add header and bearer authorization for accersing getAddress endpoint
    When User send "get" request for get user Address endpoint
    Then User should verify the status code is 200
    And User should verify the getUserAddress response body countryname present as "India"

  Scenario: verify userDeletedAdress to the application through api
    Given User add header and bearer authorization for accersing address endpoint
    When User add request body addressId for delete address
    And User send "delete" request for deleteUserAddress endpoint
    Then User should verify the status code is 200
    And User should verify the deleteUserAddress response message matches "Address deleted successfully"
