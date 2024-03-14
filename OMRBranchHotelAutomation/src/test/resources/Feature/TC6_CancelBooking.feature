@CancelBooking
Feature: Verifying OMR Branch Cancel Booking Hotel

  Scenario Outline: Booking,change Booking,Cancel Booking
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
    And User Add the payment details Select credit card "<CardType>"
      | SelectCard | CardNumber       | Name On Card | Month   | Year | cvv |
      | Visa       | 5555555555552223 | Manojkumar   | October | 2026 | 348 |
      | MasterCard | 5555555555552284 | Manojkumar   | May     | 2025 | 334 |
      | Amex       | 5555555555555245 | Manojkumar   | June    | 2030 | 342 |
      | Discover   | 5555555555555245 | Manojkumar   | July    | 2035 | 345 |
    Then User should verify after payment success message "Booking is Confirmed"
    And User should verify after payment Hotel Name print or not
    When User go to MyBookingPage
    When User search the "<OrderId>"
    And User change the Book Hotel CheckinDate "<changeCheckInDate>"
    Then User should verify after change the checkinDate success message "Booking updated successfully"
    And User cancel the BookHotel
    Then User should Verify after cancel the Booking Hotel success message "Your booking cancelled successfully"

    Examples: 
      | userName            | password   | selectState | selectCity | selectRoomType | checkIn    | CheckOut   | no.OfRoom | no.OfAdults | no.OfChild | userTitle | firstName | lastName | mobileNo   | email               | registrationNo | companyName            | companyAddress | specialRequests  | CardType    | changeCheckInDate | OrderId    |
      | manojvk97@gmail.com | manojVK@97 | Tamil Nadu  | Chennai    | Deluxe         | 2023-08-30 | 2023-08-31 | 5-Five    | 5-Five      |          3 | Mr.       | Manoj     | Kumar    | 8012936323 | manojvk97@gmail.com |     9043592058 | Greens Tech OMR Branch | Thoraipakkam   | I want somkeroom | credit Card | 2023-09-15        | IOBVW94481 |

  Scenario Outline: Cancel the existing Order Id
    Given User on the OMR Branch Hotel page
    When User login "<userName>" and "<password>"
    Then User should Verify success message after login "Welcome Manoj"
    When User search the existing orderId
    When User search the "<OrderId>"
    And User cancel the BookHotel
    Then User should Verify after cancel the Booking Hotel success message "Your booking cancelled successfully"

    Examples: 
      | userName            | password   | OrderId    |
      | manojvk97@gmail.com | manojVK@97 | OYIKF43509 |
