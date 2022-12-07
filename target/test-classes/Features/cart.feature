Feature: Saucedemo cart testing.

  Background:
    Given homepage is open
    And Username is filled with 'standard_user'
    And Password is filled with 'secret_sauce'
    And Login button is clicked


  Scenario Outline: Verifying Total
    Given '<item>' is added to my cart
    And cart is displayed
    And checkout button is clicked
    And the first name is filled with 'drsnake'
    And the last name is filled with 'mahfoudh'
    And the zip code is filled with '2074'
    When continue button is clicked
    Then '<total>' is shown
    Examples:
      | item | total |
      | Sauce Labs Backpack    | Total: $32.39    |
      | Sauce Labs Bike Light  | Total: $10.79  |
      | Sauce Labs Backpack,Sauce Labs Bike Light   |  Total: $43.18  |
      | Sauce Labs Bolt T-Shirt,Sauce Labs Fleece Jacket,Sauce Labs Onesie | Total: $79.89 |
      | Sauce Labs Bolt T-Shirt,Sauce Labs Fleece Jacket,Sauce Labs Onesie,Test.allTheThings() T-Shirt (Red) | Total: $97.16  |


  Scenario: Total of Sauce Backpack
    Given Sauce Labs Backpack is added to my cart
    And cart is displayed
    And checkout button is clicked
    And the first name is filled with 'skander'
    And the last name is filled with 'mahfoudh'
    And the zip code is filled with '4024'
    When continue button is clicked
    Then 'Total: $32.39' is shown