@SelectHotel
Feature: Verifying OMR Select Hotel Automation


  Scenario Outline: Select hotel and verify navigate to book upon accepting the Alert
    Given User on the OMR Branch Hotel page
    When User login "<userName>" and "<password>"
    Then User should Verify success message after login "Welcome Manoj"
    When User Search Hotel with all fileds "<selectState>","<selectCity>","<selectRoomType>","<checkIn>","<CheckOut>","<no.OfRoom>","<no.OfAdults>" and "<no.OfChild>"
    Then User should verify after search hotel success message "Select Hotel"
    When User Select first hotel and save hotel name,price
    And User accept the alert box
    Then User should verify success message after accept the alert box "Book Hotel"

    Examples: 
      | userName            | password   | selectState | selectCity | selectRoomType | checkIn    | CheckOut   | no.OfRoom | no.OfAdults | no.OfChild |
      | manojvk97@gmail.com | manojVK@97 | Tamil Nadu  | Chennai    | Deluxe         | 2023-08-30 | 2023-08-31 | 5-Five    | 5-Five      |          3 |
	
  Scenario Outline: Select hotel and verify navigate to book upon accepting the Alert
    Given User on the OMR Branch Hotel page
    When User login "<userName>" and "<password>"
    Then User should Verify success message after login "Welcome Manoj"
    When User Search Hotel with all fileds "<selectState>","<selectCity>","<selectRoomType>","<checkIn>","<CheckOut>","<no.OfRoom>","<no.OfAdults>" and "<no.OfChild>"
    Then User should verify after search hotel success message "Select Hotel"
    When User Select first hotel and save hotel name,price
    And User dismiss the alert box
    Then User should verify after search hotel success message "Select Hotel"

    Examples: 
      | userName            | password   | selectState | selectCity | selectRoomType | checkIn    | CheckOut   | no.OfRoom | no.OfAdults | no.OfChild |
      | manojvk97@gmail.com | manojVK@97 | Tamil Nadu  | Chennai    | Deluxe         | 2023-08-30 | 2023-08-31 | 5-Five    | 5-Five      |          3 |
