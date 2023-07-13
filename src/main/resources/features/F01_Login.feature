Feature:  # Given - When - Then - And - But -- Data driven Testing
  Scenario:
    When  i enter username "standard_user"
    And   i enter password "secret_sauce"
    And   i will click on login button

  Scenario:
    When  i enter username "standard_user"
    And   i enter password "password"
    And   i will click on login button
