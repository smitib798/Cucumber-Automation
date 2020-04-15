 @Important
 Feature: Create account of Facebook7
 As a user you need to open facebook home page and do the validations
 
 @Database
 Scenario Outline: Validate create user multiple fields71
 Given User need to be on Facebook login page
 When User enters user "<user>" first name
 And  User enters user "<surname>" surname
 Then User checks user "<user>" first name is present inside textbox
 But  User Mobile field should be blank
 Then close browser
  Examples:
  | user | surname |
  | Tom  | Jerry   |
  |Loren | Hardik  |
  
 @Smoke
 Scenario: Validate First Name field72
 Given User need to be on Facebook login page
 When User enters user "David" first name
 Then User checks user "David" first name is present inside textbox
 Then close browser
 
 @Smoke @Regression
 Scenario: Validate First Name field73
 Given User need to be on Facebook login page
 When User enters user "David" first name
 Then User checks user "David" first name is present inside textbox
 Then close browser
 
 @Regression
 Scenario: Validate First Name field74
 Given User need to be on Facebook login page
 When User enters user "David" first name
 Then User checks user "David" first name is present inside textbox
 Then close browser
 
 Scenario: Validate First Name field75
 Given User need to be on Facebook login page
 When User enters user "David" first name
 Then User checks user "David" first name is present inside textbox
 Then close browser
 
 @Smoke
 Scenario: Validate First Name field76
 Given User need to be on Facebook login page
 When User enters user "David" first name
 Then User checks user "David" first name is present inside textbox
 Then close browser
 
 @Regression
 Scenario: Validate First Name field77
 Given User need to be on Facebook login page
 When User enters user "David" first name
 Then User checks user "David" first name is present inside textbox
 Then close browser
 
  
 