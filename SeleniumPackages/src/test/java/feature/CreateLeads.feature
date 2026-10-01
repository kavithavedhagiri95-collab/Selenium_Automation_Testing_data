Feature: Leaftaps CreateLeads login functionality
  
  Scenario Outline: CreateLeads with mandatory functionality
    Given Open the browser
    When Load the application url 'http://leaftaps.com/opentaps'
    When User login the appliction with "<userName>" and "<passWord>"
    And  Click login button
    Then Login is sucessful

    Examples: 
      | userName  | passWord |
      | DemoCSR |crmsfa123 | 
      | DemoSalesManager |crmsfa| 