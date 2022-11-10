Feature: Filter
  As User
  I have be able to filter products
  So I can buy product based on categories

  Scenario: User filter products by categories
    Given I am on home page
    When I click categories button
    And I select categories option
    Then I see filtered products

  Scenario: User clear filter categories
    Given I am on home page
    And I filtered products
    When I click clear button
    Then I see all products
