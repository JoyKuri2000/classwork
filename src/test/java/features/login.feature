Feature: Login Feature

  Scenario: User should be able to login with valid credentials
    Given user in TalentTek Homepage
    And user enter valid email address
    And user enter valid password
    When user clicks on login button
    Then user should be able to successfully log in

  Scenario: User should not be able to login with valid email and invalid password
    Given User in TalentTEK Homepage
    And User enter valid email address
    And User enter invalid password
    When User clicks on Log In button
    Then User should be able to see " You have entered an incorrect email or student ID."