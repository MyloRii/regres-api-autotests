Feature: Users

  Scenario: Creating user

    Given New user is created
    Then Status code is: 201 and body and job as expected