
@All
Feature: Scennario outline functionality
  I want to use this template for my feature file

  @Smoke
  Scenario: Basic feature file
    Given I want to write a step with precondition
    And some other precondition
    When I complete action
    

  @Regression
  Scenario Outline: Feature file with scenario outline
    Given I want to write a step with "<userName>"
    When I check for the "<password>" in step
    Then I verify the "<status>" in step

    Examples: 
      | userName  | password | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
