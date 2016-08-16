@login
Feature: Login
  As a end user
  I want to login
  so that i can access website

  Background:
    Given I navigate to login page

  @valid
  Scenario Outline: Valid login
    When I fill "<email>" and "<password>"
    When I click login
    Then I should be succesfully login
    And I see "<username>" on right top corner

    Examples: Valid Logins
      | email                     | password | username     |
      | cmahesh_mudiraj@yahoo.com | Ganesh23 | mahesh kumar |
