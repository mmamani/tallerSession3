package runner;

import activity.calculator.MainCalculatorScreen;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.net.MalformedURLException;

public class MyStepCalculator {

    MainCalculatorScreen mainCalculatorScreen = new MainCalculatorScreen();

    @Given("^I have open the calculator$")
    public void iHaveOpenTheCalculator() {
    }

    @When("^I click on \\[(one|plus|two|equal)\\] button in calculator$")
    public void iClickOnOneButtonInCalcualtor(String typeButton) throws MalformedURLException {
        switch (typeButton){
            case "one":
                mainCalculatorScreen.oneButton.click();
               break;
            case "plus":
                mainCalculatorScreen.plusButton.click();
                break;
            case "two":
                mainCalculatorScreen.twoButton.click();
                break;
            case "equal":
                mainCalculatorScreen.equalButton.click();
                break;
        }
    }


    @Then("^I expected the result is : (.*)$")
    public void iExpectedTheResultIs(String expectedResult) throws MalformedURLException {
        String actualResult=mainCalculatorScreen.resultTextBox.getValue();
        Assert.assertEquals("ERROR La suma fue incorrecta",expectedResult,actualResult);
    }
}
