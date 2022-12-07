Feature:Testing login feature.

  Background:
  Given homepage is open

  Scenario: Correct Login
    Given Username is filled with 'standard_user'
    And Password is filled with 'secret_sauce'
    When Login button is clicked
    Then Product page is opened