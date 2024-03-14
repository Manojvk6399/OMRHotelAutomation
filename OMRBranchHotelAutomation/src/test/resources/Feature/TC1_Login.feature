@Login
Feature: verifey OMR Branch Hotel Automation
	
  Scenario Outline: Verifying login with vaild credentials
    Given User on the OMR Branch Hotel page
    When User login "<userName>" and "<password>"
    Then User should Verify success message after login "Welcome Manoj"

    Examples: 
      | userName            | password   |
      | manojvk97@gmail.com | manojVK@97 |

  Scenario Outline: Verifying login with vaild credentials using ENTER key
    Given User on the OMR Branch Hotel page
    When User login "<userName>" and "<password>" with ENTER key
    Then User should Verify success message after login "Welcome Manoj"

    Examples: 
      | userName            | password   |
      | manojvk97@gmail.com | manojVK@97 |

  
  Scenario Outline: Verifying login with Invaild credentials
    Given User on the OMR Branch Hotel page
    When User login "<userName>" and "<password>"
    Then User should Verify error message after login "Invalid Login details or Your Password might have expired. "

    Examples: 
      | userName            | password    |
      | manojvk97@gmail.com | manojVK@123 |
