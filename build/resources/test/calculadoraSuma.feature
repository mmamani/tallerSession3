Feature: Calculadora

  @CalculadoraTestSuite
  Scenario: Como usuario
  yo quiero sumar dos numero
  para que el resultado sea mostrado en el label de la calculadora

    Given I have open the calculator
    When I click on [one] button in calculator
    And I click on [plus] button in calculator
    And I click on [two] button in calculator
    And I click on [equal] button in calculator
    Then I expected the result is : 3