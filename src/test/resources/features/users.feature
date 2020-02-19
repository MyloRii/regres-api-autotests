Feature: Users

  Scenario: Creating user

    When New user is created
    Then Following message is received: 'A resource was successfully created in response to a POST request. The Location header contains the URL pointing to the newly created resource.'