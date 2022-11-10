Feature: Authentication
  As user,
  I need to authenticate
  So I can logged in with my account

  @login
  Scenario Outline: User login with valid account
    Given I am on home page
    When I go to Login page
    And I input username <username>
    And I input password <password>
    And I click Login button
    Then I am on homepage

    Examples: 
      | username        | password |
      | ujang@umail.com | ujang123 |

  @login-inv
  Scenario Outline: User login with invalid password
    Given I am on home page
    When I go to Login page
    And I input username <username>
    And I input password <password>
    And I click Login button
    Then I am on Login page

    Examples: 
      | username        | password |
      | ujang@umail.com | 12311232 |

  @register
  Scenario Outline: User sucessfully register
    Given I am on home page
    When I go to Login page
    And I click Register page button
    And I input new fullname <fullname>
    And I input new username <username>
    And I input new password <password>
    And I click Register button
    Then I am on Login page

    Examples: 
      | fullname | username         | password  |
      | Benzyy   | Benzyy@bmail.com | Benzyy123 |

  @register-inv
  Scenario Outline: User register with existing account
    Given I am on home page
    When I go to Login page
    And I click Register page button
    And I input new fullname <fullname>
    And I input new username <username>
    And I input new password <password>
    And I click Register button
    Then I am on Register page

    Examples: 
      | fullname | username        | password |
      | Ujang    | ujang@umail.com | ujang123 |

	@logout
  Scenario: User Logout from an account
    Given I am already login
    When I click Account button
    And I click Logout button
    Then I am on Login page
      