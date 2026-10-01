Feature: LeafTaps CreateLead login functionality

Scenario: CreateLead with mandatory functionality

    Given Open the browser
    When Load the application url 'http://leaftaps.com/opentaps'
    When Enter userName as 'DemoCSR'
    When Enter passWord as 'crmsfa123'
    And Click on login button
    Then Login should be success

Scenario: CreateLead Login with negative credential

    Given Open the browser
    When Load the application url 'http://leaftaps.com/opentaps'
    When Enter userName as 'DemoCSR'
    When Enter passWord as 'crmsfa12'
    And  Click on login button
    But  Login should be fail
    
    