Feature: WhenDo

  @WhenDo
  Scenario: As user
  I want to create a new note
  So that I can manage my task

    Given I have access to WhenDo App
    When I click on Add Button in main screen
    And  I type the 'NOTA1' in title textbox on note screen
    And  I type the 'NOTE1' in note textbox on note screen
    And I click on Save Button on note screen
    Then The note : 'NOTA1' is displayed
