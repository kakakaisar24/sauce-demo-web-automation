@web
@login
Feature: Login

  @valid-login
  Scenario: Login menggunakan username dan password yang benar
    Given user is on login page
    When user input username with "standard_user"
    And user input password with "secret_sauce"
    And user click login button
    Then user is on homepage

  @invalid-login
  Scenario: Login menggunakan password yang salah
    Given user is on login page
    When user input username with "standard_user"
    And user input password with "wrong_password"
    And user click login button
    Then user see error message

  @boundary
  Scenario: Login dengan username kosong
    Given user is on login page
    When user input password with "secret_sauce"
    And user click login button
    Then user see error message

  @boundary
  Scenario: Login dengan password kosong
    Given user is on login page
    When user input username with "standard_user"
    And user click login button
    Then user see error message