Feature: Rating
  As user,
  I have be able to add rating
  So I can see product rating

  Scenario: User add product rating
    Given I am already login
    When I click detail on product
    And I click star rating button
    Then I see product rating
