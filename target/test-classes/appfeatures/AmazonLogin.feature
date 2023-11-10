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
@tag
Feature: 

  #Scenario Outline: Amazon Login Page
    #Given User is on Amazon landing Pgae
    #Given Sign button is present on screen
    #When user click on Sing in button
    #Then user can see Login Screen
    #When user eneter "<userName>" in username filed
    #When user enters "<password>" in password filed
    #When user click on Sing in button
    #Then user is on Home page
    #Then Title of Home Page is "<title>"

  Scenario Outline: Amazon Login Page
    Given User is on Amazon landing Pgae
    And Sign button is present on screen
    When user click on Sing in button
    Then user can see Login Screen
    When user eneter "<userName>" in username filed
    And user enters "<password>" in password filed
    And user click on Sing in button
    Then user is on Home page
    And Title of Home Page is "<title>"
    But Sign button is not present

    Examples: 
      | userName        | password  | title  |
      | singhgirjesh007 | bingo@007 | amazon |
