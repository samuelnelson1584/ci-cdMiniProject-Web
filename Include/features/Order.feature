Feature: Order
  As user,
  I have be able to order product
  So I can add order to transaction#

  Scenario: User order a product
    #Given I am login with username <username> and password <password>
    Given I am already login
    When I open transaction page
    And I count product transaction
    And I go to homepage
    And I click Beli button on chosen product
    And I click cart button
    And I verify product name
    And I click Bayar button
    Then I am on Transaction page
    And I see my order has been added

	@delete
  Scenario: User delete a product from cart
    #Given I am login with username <username> and password <password>
    Given I am already login
    When I open transaction page
    And I count product transaction
    And I go to homepage
    And I click Beli button on chosen product
    And I click cart button
    And I verify product name
    And I click - button
    Then I can not see Bayar button