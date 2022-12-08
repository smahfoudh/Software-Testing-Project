Feature: Options Menu Test.


  Background:
    Given homepage is open
    And Username is filled with 'standard_user'
    And Password is filled with 'secret_sauce'
    And Login button is clicked


  Scenario: All items test
    Given cart is displayed
    And Options menu is clicked
    When All items option is clicked
    Then Product page is opened


  Scenario: About option test
    Given Product page is opened
    And Options menu is clicked
    When About option is clicked
    Then About page is displayed

  Scenario: Logout option test
    Given Product page is opened
    And Options menu is clicked
    When Logout option is clicked
    Then Login page is displayed


  Scenario: Reset app state test
    Given Sauce Labs Backpack is added to my cart
    And Cart has an icon
    And Options menu is clicked
    When Reset app state is clicked
    Then Cart has no icon