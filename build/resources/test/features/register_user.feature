Feature: the user login of page
  i want to create a new register
  to access as a user

  Scenario: Successfull user creation
    Given user in the home page
    When user create an account filling all field
    Then User sees its username
