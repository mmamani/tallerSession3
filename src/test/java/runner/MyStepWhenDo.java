package runner;

import activity.whendo.MainScreenTask;
import activity.whendo.TaskScreen;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.net.MalformedURLException;

/**
 * @autor : eynar.pari
 * @date : 31/10/2020.
 **/
public class MyStepWhenDo {

    MainScreenTask  mainScreenTask= new MainScreenTask();
    TaskScreen taskScreen = new TaskScreen();

    @Given("^I have access to WhenDo App$")
    public void iHaveAccessToWhenDoApp() {

    }

    @When("^I click on Add Button in main screen$")
    public void iClickOnAddButtonInMainScreen() throws MalformedURLException {
        mainScreenTask.addButton.click();
    }

    @And("^I type the '(.*)' in (title|note) textbox on note screen$")
    public void iTypeTheNOTAInTitleTextboxOnNoteScreen(String value,String control) throws MalformedURLException {
        if (control.equals("title"))
            taskScreen.titleTextBox.type(value);
        else
            taskScreen.notesTextBox.type(value);

    }

    @And("^I click on Save Button on note screen$")
    public void iClickOnSaveButtonOnNoteScreen() throws MalformedURLException {
        taskScreen.saveButton.click();
    }

    @Then("^The note : '(.*)' is displayed$")
    public void theNoteNOTAIsDisplayed(String expectedResult) {
        Assert.assertTrue("ERROR, la nota no fue creada",mainScreenTask.isDisplayedTheNote(expectedResult));
    }
}
