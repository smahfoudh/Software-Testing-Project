Feature:Testing login feature.

  Background:
  Given homepage is open

  Scenario: Correct Login
    Given Username is filled with 'standard_user'
    And Password is filled with 'secret_sauce'
    When Login button is clicked
    Then Product page is opened

  Scenario Outline: Invalid Login Info
    Given Username is filled with '<username>'
    And Password is filled with '<password>'
    When Login button is clicked
    Then a '<msg>' is displayed
    Examples:
      | username | password | msg |
      |          |          | Epic sadface: Username is required |
      | standard_user |  | Epic sadface: Password is required |
      |  | secret_sauce| Epic sadface: Username is required   |
      | locked_out_user  | secret_sauce | Epic sadface: Sorry, this user has been locked out.|

  Scenario: Problem User Login
    Given Username is filled with 'problem_user'
    And Password is filled with 'secret_sauce'
    When Login button is clicked
    Then Product page is opened

  Scenario: Performance Glitch User Login
    Given Username is filled with 'performance_glitch_user'
    And Password is filled with 'secret_sauce'
    When Login button is clicked
    Then Product page is opened


  Scenario Outline: Incorrect Login Info
    Given Username is filled with '<username>'
    And Password is filled with '<password>'
    When Login button is clicked
    Then an error msg for incorrect info is shown
    Examples:
      | username | password |
      | standard_user | whatsthepassword? |
      | whatstheusername | secret_sauce  |
      | problem_user | wrongpasswordduh? |
      | idktheusername | forgotmypassword |