Feature: Sign in functionality on Rediff

  This feature tests the Sign In functionality on Rediff.com.

  Background: 
    Given User is on the Rediff homepage

  Scenario: Sign in with credentials
    Given User is on the Sign In page
    When User enters "<userName>" and "<passWord>"
    And User clicks the Sign In button
    Then Security capcha should appear
    
    Examples:
    | userName | passWord |
    | user1   | password1   |
    #| user2    | password2  |
    #| user3    | password3   |