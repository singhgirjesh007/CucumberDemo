@All
Feature: Book a cab


@Smoke @qa-ready @US-1001 @Epic-900
Scenario: Booking cab sedan
Given User want to select a car type "sedan" from uber application
When User selects car "sedan" and pick up a point "Bangalore" to "Pune"
Then Driver starts journey
And Drive ends the journet
Then CUstomer pay 1000 USD

@Smoke
Scenario: Booking cab suv
Given User want to select a car type "suv" from uber application
When User selects car "sedan" and pick up a point "Bangalore" to "Pune"
Then Driver starts journey
And Drive ends the journet
Then CUstomer pay 1000 USD

@Prod
Scenario: Booking cab mini
Given User want to select a car type "mini" from uber application
When User selects car "sedan" and pick up a point "Bangalore" to "Pune"
Then Driver starts journey
And Drive ends the journet
Then CUstomer pay 1000 USD