Feature: Guru99
  I want to use this template for my feature file

  @tag1
  Scenario: Add Customer
   Given User Should be in Telecom home page
  And User Click Add Customer in the Home Page
  When User Enter the Reqiured details for registration
  And User Click Submit Button
  Then User Should Be in the
  @tag2
  Scenario: Add Customer
    Given User Should be in Telecom home page
    And User Click Add Customer in the Home Page
    When User Enter the Reqiured details for registration Enter Table
      | Nelson | M | jose@yahooo.com | Ashok Layland | 9076547894 |
    And User Click Submit Button
    Then User Should Be in the submition Page
