Feature: Signup Feature

  @hb
  Scenario: User should be able to create brand new TalTekTC account
    Given user in TalentTek Homepage
    And user clicks on "Create new account" button
    And user enters first and last name
    And user enters valid email address
    And user enters password
    And user enters confirm password
    And user enters month under birthdate
    And user enters day under birthdate
    And user enters year under birthdate
    And user chooses gender
    And user clicks on agreement terms
    When user clicks on Create My Account Button
    Then user should be able to get their studentID


