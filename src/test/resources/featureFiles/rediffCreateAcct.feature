Feature: Create Account functionality on Rediff

  This feature is to tests the Create Account functionality

  Background: 
    Given User is on the Rediff homepage

  Scenario: Create a new account
    When User clicks on the create new account link
    And User fills in all the required details
    And User clicks the submit button
		Then User created the account