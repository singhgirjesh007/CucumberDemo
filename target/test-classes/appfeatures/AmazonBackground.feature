Feature: Amazon order page

In orde to check my order details
As a registered user
I want to specify the fatures of the order detail page

Background:
Given login
When user enter user name password
Then user clicks on navigation order page

Scenario: Check previous order details
Then user checks previous order details


Scenario: Check open order details
Then user checks open order details

Scenario: Check canceled order details
Then user checks cancelled order details