@BookHotel
Feature: Verifying OMR Book Hotel Automation

  Scenario Outline: Book Hotel including GST card(debit card - Visa) with special request
    Given User on the OMR Branch Hotel page
    When User login "<userName>" and "<password>"
    Then User should Verify success message after login "Welcome Manoj"
    When User Search Hotel with all fileds "<selectState>","<selectCity>","<selectRoomType>","<checkIn>","<CheckOut>","<no.OfRoom>","<no.OfAdults>" and "<no.OfChild>"
    Then User should verify after search hotel success message "Select Hotel"
    When User Select first hotel and save hotel name,price
    And User accept the alert box
    Then User should verify success message after accept the alert box "Book Hotel"
    When User enter the Guest details "<userTitle>","<firstName>","<lastName>","<mobileNo>" and "<email>"
    And User enter the GST details "<registrationNo>","<companyName>" and "<companyAddress>"
    And User Add the special request "<specialRequest>"
    And User Add the payment details Select debit card "<CardType>"
      | SelectCard | CardNumber       | Name On Card | Month   | Year | cvv |
      | Visa       | 5555555555552222 | Manojkumar   | October | 2026 | 348 |
      | MasterCard | 5555555555552284 | Manojkumar   | May     | 2025 | 334 |
      | Amex       | 5555555555555245 | Manojkumar   | June    | 2030 | 342 |
      | Discover   | 5555555555555245 | Manojkumar   | July    | 2035 | 345 |
    Then User should verify after payment success message "Booking is Confirmed"
    And User should verify after payment Hotel Name print or not

    Examples: 
      | userName            | password   | selectState | selectCity | selectRoomType | checkIn    | CheckOut   | no.OfRoom | no.OfAdults | no.OfChild | userTitle | firstName | lastName | mobileNo   | email               | registrationNo | companyName            | companyAddress | specialRequests  | CardType   |
      | manojvk97@gmail.com | manojVK@97 | Tamil Nadu  | Chennai    | Deluxe         | 2023-08-30 | 2023-08-31 | 5-Five    | 5-Five      |          3 | Mr.       | Manoj     | Kumar    | 8012936323 | manojvk97@gmail.com |     9043592058 | Greens Tech OMR Branch | Thoraipakkam   | I want somkeroom | Debit Card |

  
  Scenario Outline: Book Hotel including GST card(credit card - Visa) with special request
    Given User on the OMR Branch Hotel page
    When User login "<userName>" and "<password>"
    Then User should Verify success message after login "Welcome Manoj"
    When User Search Hotel with all fileds "<selectState>","<selectCity>","<selectRoomType>","<checkIn>","<CheckOut>","<no.OfRoom>","<no.OfAdults>" and "<no.OfChild>"
    Then User should verify after search hotel success message "Select Hotel"
    When User Select first hotel and save hotel name,price
    And User accept the alert box
    Then User should verify success message after accept the alert box "BookHotel"
    When User enter the Guest details "<userTitle>","<firstName>","<lastName>","<mobileNo>" and "<email>"
    And User enter the GST details "<registrationNo>","<companyName>" and "<companyAddress>"
    And User Add the special request "<specialRequest>"
    And User Add the payment details Select credit card "<CardType>"
      | SelectCard | CardNumber       | Name On Card | Month   | Year | cvv |
      | Visa       | 5555555555552223 | Manojkumar   | October | 2026 | 348 |
      | MasterCard | 5555555555552284 | Manojkumar   | May     | 2025 | 334 |
      | Amex       | 5555555555555245 | Manojkumar   | June    | 2030 | 342 |
      | Discover   | 5555555555555245 | Manojkumar   | July    | 2035 | 345 |
    Then User should verify after payment success message "Booking is Confirmed"
    And User should verify after payment Hotel Name print or not

    Examples: 
      | userName            | password   | selectState | selectCity | selectRoomType | checkIn    | CheckOut   | no.OfRoom | no.OfAdults | no.OfChild | userTitle | firstName | lastName | mobileNo   | email               | registrationNo | companyName            | companyAddress | specialRequests  | CardType    |
      | manojvk97@gmail.com | manojVK@97 | Tamil Nadu  | Chennai    | Deluxe         | 2023-08-30 | 2023-08-31 | 5-Five    | 5-Five      |          3 | Mr.       | Manoj     | Kumar    | 8012936323 | manojvk97@gmail.com |     9043592058 | Greens Tech OMR Branch | Thoraipakkam   | I want somkeroom | credit Card |

  Scenario Outline: Book Hotel including GST card(debit card - Visa) without special request
    Given User on the OMR Branch Hotel page
    When User login "<userName>" and "<password>"
    Then User should Verify success message after login "Welcome Manoj"
    When User Search Hotel with all fileds "<selectState>","<selectCity>","<selectRoomType>","<checkIn>","<CheckOut>","<no.OfRoom>","<no.OfAdults>" and "<no.OfChild>"
    Then User should verify after search hotel success message "Select Hotel"
    When User Select first hotel and save hotel name,price
    And User accept the alert box
    Then User should verify success message after accept the alert box "Book Hotel"
    When User enter the Guest details "<userTitle>","<firstName>","<lastName>","<mobileNo>" and "<email>"
    And User enter the GST details "<registrationNo>","<companyName>" and "<companyAddress>"
    When User enter without special request
    And User Add the payment details Select debit card "<CardType>"
      | SelectCard | CardNumber       | Name On Card | Month   | Year | cvv |
      | Visa       | 5555555555552222 | Manojkumar   | October | 2026 | 348 |
      | MasterCard | 5555555555552284 | Manojkumar   | May     | 2025 | 334 |
      | Amex       | 5555555555555245 | Manojkumar   | June    | 2030 | 342 |
      | Discover   | 5555555555555245 | Manojkumar   | July    | 2035 | 345 |
    Then User should verify after payment success message "Booking is Confirmed"
    And User should verify after payment Hotel Name print or not

    Examples: 
      | userName            | password   | selectState | selectCity | selectRoomType | checkIn    | CheckOut   | no.OfRoom | no.OfAdults | no.OfChild | userTitle | firstName | lastName | mobileNo   | email               | registrationNo | companyName            | companyAddress | CardType   |
      | manojvk97@gmail.com | manojVK@97 | Tamil Nadu  | Chennai    | Deluxe         | 2023-08-30 | 2023-08-31 | 5-Five    | 5-Five      |          3 | Mr.       | Manoj     | Kumar    | 8012936323 | manojvk97@gmail.com |     9043592058 | Greens Tech OMR Branch | Thoraipakkam   | Debit Card |

  Scenario Outline: Book Hotel including GST card(credit card - Visa) without special request
    Given User on the OMR Branch Hotel page
    When User login "<userName>" and "<password>"
    Then User should Verify success message after login "Welcome Manoj"
    When User Search Hotel with all fileds "<selectState>","<selectCity>","<selectRoomType>","<checkIn>","<CheckOut>","<no.OfRoom>","<no.OfAdults>" and "<no.OfChild>"
    Then User should verify after search hotel success message "Select Hotel"
    When User Select first hotel and save hotel name,price
    And User accept the alert box
    Then User should verify success message after accept the alert box "Book Hotel"
    When User enter the Guest details "<userTitle>","<firstName>","<lastName>","<mobileNo>" and "<email>"
    And User enter the GST details "<registrationNo>","<companyName>" and "<companyAddress>"
    When User enter without special request
    And User Add the payment details Select credit card "<CardType>"
      | SelectCard | CardNumber       | Name On Card | Month   | Year | cvv |
      | Visa       | 5555555555552223 | Manojkumar   | October | 2026 | 348 |
      | MasterCard | 5555555555552284 | Manojkumar   | May     | 2025 | 334 |
      | Amex       | 5555555555555245 | Manojkumar   | June    | 2030 | 342 |
      | Discover   | 5555555555555245 | Manojkumar   | July    | 2035 | 345 |
    Then User should verify after payment success message "Booking is Confirmed"
    And User should verify after payment Hotel Name print or not

    Examples: 
      | userName            | password   | selectState | selectCity | selectRoomType | checkIn    | CheckOut   | no.OfRoom | no.OfAdults | no.OfChild | userTitle | firstName | lastName | mobileNo   | email               | registrationNo | companyName            | companyAddress | CardType    |
      | manojvk97@gmail.com | manojVK@97 | Tamil Nadu  | Chennai    | Deluxe         | 2023-08-30 | 2023-08-31 | 5-Five    | 5-Five      |          3 | Mr.       | Manoj     | Kumar    | 8012936323 | manojvk97@gmail.com |     9043592058 | Greens Tech OMR Branch | Thoraipakkam   | credit Card |

  Scenario Outline: Book Hotel without GST card(Debit card - Visa) with special request
    Given User on the OMR Branch Hotel page
    When User login "<userName>" and "<password>"
    Then User should Verify success message after login "Welcome Manoj"
    When User Search Hotel with all fileds "<selectState>","<selectCity>","<selectRoomType>","<checkIn>","<CheckOut>","<no.OfRoom>","<no.OfAdults>" and "<no.OfChild>"
    Then User should verify after search hotel success message "Select Hotel"
    When User Select first hotel and save hotel name,price
    And User accept the alert box
    Then User should verify success message after accept the alert box "Book Hotel"
    When User enter the Guest details "<userTitle>","<firstName>","<lastName>","<mobileNo>" and "<email>"
    When User enter with out GST
    And User Add the special request "<specialRequest>"
    And User Add the payment details Select debit card "<CardType>"
      | SelectCard | CardNumber       | Name On Card | Month   | Year | cvv |
      | Visa       | 5555555555552222 | Manojkumar   | October | 2026 | 348 |
      | MasterCard | 5555555555552284 | Manojkumar   | May     | 2025 | 334 |
      | Amex       | 5555555555555245 | Manojkumar   | June    | 2030 | 342 |
      | Discover   | 5555555555555245 | Manojkumar   | July    | 2035 | 345 |
    Then User should verify after payment success message "Booking is Confirmed"
    And User should verify after payment Hotel Name print or not

    Examples: 
      | userName            | password   | selectState | selectCity | selectRoomType | checkIn    | CheckOut   | no.OfRoom | no.OfAdults | no.OfChild | userTitle | firstName | lastName | mobileNo   | email               | specialRequests  | CardType   |
      | manojvk97@gmail.com | manojVK@97 | Tamil Nadu  | Chennai    | Deluxe         | 2023-08-30 | 2023-08-31 | 5-Five    | 5-Five      |          3 | Mr.       | Manoj     | Kumar    | 8012936323 | manojvk97@gmail.com | I want somkeroom | Debit Card |

  Scenario Outline: Book Hotel without GST card(credit card - Visa) with special request
    Given User on the OMR Branch Hotel page
    When User login "<userName>" and "<password>"
    Then User should Verify success message after login "Welcome Manoj"
    When User Search Hotel with all fileds "<selectState>","<selectCity>","<selectRoomType>","<checkIn>","<CheckOut>","<no.OfRoom>","<no.OfAdults>" and "<no.OfChild>"
    Then User should verify after search hotel success message "Select Hotel"
    When User Select first hotel and save hotel name,price
    And User accept the alert box
    Then User should verify success message after accept the alert box "Book Hotel"
    When User enter the Guest details "<userTitle>","<firstName>","<lastName>","<mobileNo>" and "<email>"
    When User enter with out GST
    And User Add the special request "<specialRequest>"
    And User Add the payment details Select credit card "<CardType>"
      | SelectCard | CardNumber       | Name On Card | Month   | Year | cvv |
      | Visa       | 5555555555552223 | Manojkumar   | October | 2026 | 348 |
      | MasterCard | 5555555555552284 | Manojkumar   | May     | 2025 | 334 |
      | Amex       | 5555555555555245 | Manojkumar   | June    | 2030 | 342 |
      | Discover   | 5555555555555245 | Manojkumar   | July    | 2035 | 345 |
    Then User should verify after payment success message "Booking is Confirmed"
    And User should verify after payment Hotel Name print or not

    Examples: 
      | userName            | password   | selectState | selectCity | selectRoomType | checkIn    | CheckOut   | no.OfRoom | no.OfAdults | no.OfChild | userTitle | afirstName | lastName | mobileNo   | email               | specialRequests  | CardType    |
      | manojvk97@gmail.com | manojVK@97 | Tamil Nadu  | Chennai    | Deluxe         | 2023-08-30 | 2023-08-31 | 5-Five    | 5-Five      |          3 | Mr.       | Manoj      | Kumar    | 8012936323 | manojvk97@gmail.com | I want somkeroom | credit Card |

  Scenario Outline: Book Hotel without entering any payment details and verify error message
    Given User on the OMR Branch Hotel page
    When User login "<userName>" and "<password>"
    Then User should Verify success message after login "Welcome Manoj"
    When User Search Hotel with all fileds "<selectState>","<selectCity>","<selectRoomType>","<checkIn>","<CheckOut>","<no.OfRoom>","<no.OfAdults>" and "<no.OfChild>"
    Then User should verify after search hotel success message "Select Hotel"
    When User Select first hotel and save hotel name,price
    And User accept the alert box
    Then User should verify success message after accept the alert box "Book Hotel"
    When User enter the Guest details "<userTitle>","<firstName>","<lastName>","<mobileNo>" and "<email>"
    And User enter the GST details "<registrationNo>","<companyName>" and "<companyAddress>"
    And User Add the special request "<specialRequest>"
    When User without entering any payment details
    Then User should verify after payment error message "Please select your card type","Please select your card","Please provide your card number","Please provide name on your card"."Please provide your Card Expiry Date" and "Please provide your Card's security code"

    Examples: 
      | userName            | password   | selectState | selectCity | selectRoomType | checkIn    | CheckOut   | no.OfRoom | no.OfAdults | no.OfChild | userTitle | firstName | lastName | mobileNo   | email               | registrationNo | companyName            | companyAddress | specialRequests  |
      | manojvk97@gmail.com | manojVK@97 | Tamil Nadu  | Chennai    | Deluxe         | 2023-08-30 | 2023-08-31 | 5-Five    | 5-Five      |          3 | Mr.       | Manoj     | Kumar    | 8012936323 | manojvk97@gmail.com |     9043592058 | Greens Tech OMR Branch | Thoraipakkam   | I want somkeroom |
