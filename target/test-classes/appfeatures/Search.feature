#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Amazon Search

Scenario: Search a product ipad

Given I have a search field
When I search for a product with "ipad" and price 500
Then Product with name "ipad" should be displayed

Scenario: Search a product mackbook

Given I have a search field
When I search for a product with "Apple mac" and price 1000
Then Product with name "Apple mac" should be displayed