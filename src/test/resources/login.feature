@login
Feature: Login
  As a end user
  I want to login
  so that i can access website

  Background:
    Given I navigate to login page

  @valid
  Scenario Outline: Valid login
    When I fill "<username>" and "<password>"
    When I click login
    Then I should be succesfully login
    And I see "<username>" on right top corner
    Examples: Valid Logins
      | username                  | password | username     |
      | cmahesh_mudiraj@yahoo.com | Ganesh23 | mahesh kumar |

  @invalid
  Scenario Outline: InValid login
    When I fill "<username>" and "<password>"
    When I click login
    Then I should be able to see "<message>"
    Examples: Valid Logins
      | email                  | password | username              | message |
      | vidhya_ame@yahoo.co.in |          | vijayasree ravulapati | failure |

