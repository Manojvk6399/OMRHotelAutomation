@EploreHotel
Feature: Verifying OMR Explore hotel Automation
	
  Scenario Outline: Enter all field and verify Select Hotel(Including All Options)
    Given User on the OMR Branch Hotel page
    When User login "<userName>" and "<password>"
    Then User should Verify success message after login "Welcome Manoj"
    When User Search Hotel with all fileds "<selectState>","<selectCity>","<selectRoomType>","<checkIn>","<CheckOut>","<no.OfRoom>","<no.OfAdults>" and "<no.OfChild>"
    Then User should verify after search hotel success message "Select Hotel"

    Examples: 
      | userName            | password   | selectState | selectCity | selectRoomType | checkIn    | CheckOut   | no.OfRoom | no.OfAdults | no.OfChild |
      | manojvk97@gmail.com | manojVK@97 | Tamil Nadu  | Chennai    | Deluxe         | 2023-08-30 | 2023-08-31 | 5-Five    | 5-Five      |          3 |
	
  Scenario Outline: Enter only mandatory field and verify Select Hotel
    Given User on the OMR Branch Hotel page
    When User login "<userName>" and "<password>"
    Then User should Verify success message after login "Welcome Manoj"
    When User Search Hotel with only mandatory fileds "<selectState>","<selectCity>","<checkIn>","<CheckOut>","<no.OfRoom>" and "<no.OfAdults>"
    Then User should verify after search hotel success message "Select Hotel"

    Examples: 
      | userName            | password   | selectState | selectCity | checkIn    | CheckOut   | no.OfRoom | no.OfAdults |
      | manojvk97@gmail.com | manojVK@97 | Tamil Nadu  | Chennai    | 2023-08-30 | 2023-08-31 | 5-Five    | 5-Five      |
	
  Scenario Outline: Without Enter all field and verify Error Message
    Given User on the OMR Branch Hotel page
    When User login "<userName>" and "<password>"
    Then User should Verify success message after login "Welcome Manoj"
    When User Search Hotel with out enter fileds
    Then User should verify after Search hotel field error message "Please select state","Please select city","Please select Check-in date","Please select Check-out date","Please select no. of rooms" and "Please select no. of adults"

    Examples: 
      | userName            | password   |
      | manojvk97@gmail.com | manojVK@97 |

  
  Scenario Outline: Enter all field and verify Select Hotel and  Filter Room
    Given User on the OMR Branch Hotel page
    When User login "<userName>" and "<password>"
    Then User should Verify success message after login "Welcome Manoj"
    When User Search Hotel with all fileds and all roomtype "<selectState>","<selectCity>","<selectRoomType>","<checkIn>","<CheckOut>","<no.OfRoom>","<no.OfAdults>" and "<no.OfChild>"
    Then User should verify after search hotel success message "Select Hotel"
    And User should verify room types "<selectRoomType>"

    Examples: 
      | userName            | password   | selectState | selectCity | selectRoomType                      | checkIn    | CheckOut   | no.OfRoom | no.OfAdults | no.OfChild |
      | manojvk97@gmail.com | manojVK@97 | Tamil Nadu  | Chennai    | Standard/Deluxe/Suite/Luxury/Studio | 2023-08-30 | 2023-08-31 | 5-Five    | 5-Five      |          3 |
	
  Scenario Outline: Verifying sort Hotel Name by Ascending order
    Given User on the OMR Branch Hotel page
    When User login "<userName>" and "<password>"
    Then User should Verify success message after login "Welcome Manoj"
    When User Search Hotel with all fileds "<selectState>","<selectCity>","<selectRoomType>","<checkIn>","<CheckOut>","<no.OfRoom>","<no.OfAdults>" and "<no.OfChild>"
    Then User should verify after search hotel success message "Select Hotel"
    When User click Name Ascending in sort by filter
    Then User should verify hotels name are Ascending order in the display

    Examples: 
      | userName            | password   | selectState | selectCity | selectRoomType | checkIn    | CheckOut   | no.OfRoom | no.OfAdults | no.OfChild |
      | manojvk97@gmail.com | manojVK@97 | Tamil Nadu  | Chennai    | Standard       | 2023-08-30 | 2023-08-31 | 5-Five    | 5-Five      |          3 |
	
  Scenario Outline: Verifying sort Hotel sort by high to low
    Given User on the OMR Branch Hotel page
    When User login "<userName>" and "<password>"
    Then User should Verify success message after login "Welcome Manoj"
    When User Search Hotel with all fileds "<selectState>","<selectCity>","<selectRoomType>","<checkIn>","<CheckOut>","<no.OfRoom>","<no.OfAdults>" and "<no.OfChild>"
    Then User should verify after search hotel success message "Select Hotel"
    When User click Price high to low in sort by filter
    Then User should verify hotel price are high to low in the display

    Examples: 
      | userName            | password   | selectState | selectCity | selectRoomType | checkIn    | CheckOut   | no.OfRoom | no.OfAdults | no.OfChild |
      | manojvk97@gmail.com | manojVK@97 | Tamil Nadu  | Chennai    | Standard       | 2023-08-30 | 2023-08-31 | 5-Five    | 5-Five      |          3 |
