 Feature: Create account of Facebook5
 As a user you need to open facebook home page and do the validations
 
 
 Scenario Outline: Validate create user multiple fields51
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
  
 
  
 