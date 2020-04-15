 Feature: Create account of Facebook1
 As a user you need to open facebook home page and do the validations

 Scenario: Validate create user multiple field11
 
 Given User need to be on Facebook login page
 When User enters following data
 
 |Usename |User surname |Mobile|
 |Tom     |Hanks        |1234  |
 |Jack    |Daniel       |5678  |
 
 Then close browser
  
 
  
 