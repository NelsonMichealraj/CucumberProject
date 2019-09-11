@tag
Feature: Telecommunication
  Template for Automation Testing

  @tag1
  Scenario: Add Customer by Manual
    Given User should be in the Telecom Home page G
    And User should click on the Add Customer
    When User should enter the reqiured Fields
    And User should click on the submit button
    Then User should be displayed with Successfuly Page

  @tag2
  Scenario: Add Customer by List 2D
    Given User should be in the Telecom Home page
    And User should click on the Add Customer
    When User should enter the reqiured Fields using list
      | James | G | Ronold@google.com | No8 Russai | 3487269860 |
    And User should click on the submit button
    Then User should be displayed with Successfuly Page

  @tag3
  Scenario: Add Customer by List 2D
    Given User should be in the Telecom Home page G
    And User should click on the Add Customer
    When User should enter the reqiured Fields using list TwoDimen
      | James | G | Ronold@google.com | No8 Russai  |  3487269860 |
      | Evans | K | kellan@gmail.com  | No3 UAE     |  6967239880 |
      | Amber | A | ammber@yahoo.com  | No4 America | 92378274832 |
    And User should click on the submit button
    Then User should be displayed with Successfuly Page

  @tag4
  Scenario: Add Customer by Map One Dimen
    Given User should be in the Telecom Home page
    And User should click on Add Tarif Plan
    When User should enter the reqiured Fields using MAP OneDimen
      | Rent        | 6758 |
      | LocMin      | 1200 |
      | InterMin    |  100 |
      | SMSPack     | 1000 |
      | LocPerMin   |    2 |
      | InterPerMin |    5 |
      | SMSPerChar  |    1 |
    And User should click on the submit button
    Then User should be displayed Added Tarif Plans

  @tag5
  Scenario: Add Customer by MAP two Dimen
    Given User should be in the Telecom Home page G
    And User should click on Add Tarif Plan
    When User should enter the reqiured Fields using MAP TwoDimen
      | Rent     | LocMin | InterMin | SMSPack | LocPerMin | InterPerMin | SMSPerChar |
      |    74646 |      2 |        5 |       1 |         4 |           3 |       9023 |
      |     2333 |     32 |       31 |       4 |        34 |          23 |      65435 |
      |    13123 |     12 |       32 |       3 |         5 |          54 |       2342 |
      | 12313123 |     12 |       34 |       3 |         4 |           4 |      13411 |
      |  1231231 |     42 |        4 |       6 |        45 |           5 |      63534 |
    And User should click on the submit button
    Then User should be displayed Added Tarif Plans
