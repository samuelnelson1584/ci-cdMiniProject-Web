Feature: Transaction
  As user
  I have be able to see transaction history
  So I can check bought product

  Scenario: User view transaction history
    Given I am already login
    When I click profile button
    And I click Transaction button
    Then I see transaction history

	@rows
  Scenario: User select rows per page option on transaction history
    Given I am already login
    When I click profile button
    And I click Transaction button
    And I click rows per page button
    And I click 15 rows per page option
    Then I see 15 rows per page on transaction history 
    
  @next
  Scenario: User select next on transaction history
    Given I am already login
    When I click profile button
    And I click Transaction button
    And I click next page button
    Then I see second page of transaction history 
    
  @product  
  Scenario: User sort transaction history by product
    Given I am already login
    When I click profile button
    And I click Transaction button
    And I click product column header
    Then I see sorted transaction history by product

  @price  
  Scenario: User sort transaction history by price
    Given I am already login
    When I click profile button
    And I click Transaction button
    And I click price column header
    Then I see sorted transaction history by price
  
  @quantity  
  Scenario: User sort transaction history by quantity
    Given I am already login
    When I click profile button
    And I click Transaction button
    And I click quantity column header
    Then I see sorted transaction history by quantity
    
  @subtotal
  Scenario: User sort transaction history by subtotal
    Given I am already login
    When I click profile button
    And I click Transaction button
    And I click subtotal column header
    Then I see sorted transaction history by subtotal