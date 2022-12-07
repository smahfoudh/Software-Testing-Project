Feature: Checkout Testing.

  Background:
    Given homepage is open
    And Username is filled with 'standard_user'
    And Password is filled with 'secret_sauce'
    And Login button is clicked
    And cart is displayed


  Scenario: Correct Information Entered
    Given checkout button is clicked
    And the first name is filled with 'Skander'
    And the last name is filled with 'Mahfoudh'
    And the zip code is filled with '2074'
    When continue button is clicked
    Then checkout overview page is displayed


  Scenario Outline: Incorrect Information Entered
    Given checkout button is clicked
    And the first name is filled with '<firstName>'
    And the last name is filled with '<lastName>'
    And the zip code is filled with '<zipCode>'
    When continue button is clicked
    Then '<errorMsg>' is displayed
    Examples:
      |   firstName  |  lastName  |  zipCode   | errorMsg |
      |   Skander    |            |     4072   |  Error: Last Name is required    |
      |   Skander    |  Mahfoudh  |            |  Error: Postal Code is required  |
      |              |  Mahfoudh  |            |  Error: First Name is required   |
      |              |            |            |  Error: First Name is required   |