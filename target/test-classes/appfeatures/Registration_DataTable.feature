Feature: User registration

Scenario: user regisration with diffrent data

Given User is on registration page
When User enters following user details
|naven| automation | naveen@gmail.com|9999| Banagalor |
|tome| maual| tom@gmail.com|768869| London|
Then user regeustration successful


Scenario: user regisration with diffrent data with hashmap

Given User is on registration page
When User enters following user details with hashmap
|fName|jobFiled|emalID|empID|city|
|naven| automation | naveen@gmail.com|9999| Banagalor |
|tome| maual| tom@gmail.com|768869| London|
Then user regeustration successful