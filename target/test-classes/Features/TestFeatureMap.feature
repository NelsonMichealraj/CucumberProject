@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Add Tarif Plan
    Given User should be in Telecom Home Page
    And User Should click on Add Tarif Plan
    When User Should fild the reqiured fields
      | Rent        | 6758 |
      | LocMin      | 1200 |
      | InterMin    |  100 |
      | SMSPack     | 1000 |
      | LocPerMin   |    2 |
      | InterPerMin |    5 |
      | SMSPerChar  |    1 |
    And User should click the Submit
    Then User Should Display the Submition Page
