package runner;

import activity.contactManager.CreateContactScreen;
import activity.contactManager.MainContactManagerScreen;
import activity.contactManager.UpdateDialog;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.net.MalformedURLException;

public class MyStepContactManager {
    CreateContactScreen createContactScreen = new CreateContactScreen();
    MainContactManagerScreen mainContactManagerScreen= new MainContactManagerScreen();
    UpdateDialog updateDialog= new UpdateDialog();


    @Given("^yo tengo acceso a la android app de ContactManager$")
    public void yoTengoAccesoALaAndroidAppDeContactManager() {
    }

    @When("^yo hago click en el boton de OK en dialog de Update$")
    public void yoHagoClickEnElBotonDeOKEnDialogDeUpdate() throws MalformedURLException {
        updateDialog.okButton.click();
    }

    @And("^yo hago click en el boton de Add Contact en la pantalla principal$")
    public void yoHagoClickEnElBotonDeAddContactEnLaPantallaPrincipal() throws MalformedURLException {
        mainContactManagerScreen.addContactButton.click();
    }

    @And("^yo lleno el textbox (Name|Phone|Email) Contact con el valor : (.*)$")
    public void yoLlenoElTextboxNameContactConElValorREMOVE(String typeControl, String value) throws MalformedURLException {
       switch ( typeControl){
           case "Name":
               createContactScreen.nameContactTextBox.type(value);
               break;
           case "Phone":
               createContactScreen.phoneContactTextBox.type(value);
               break;
           case "Email":
               createContactScreen.emailContactTextBox.type(value);
               break;
       }
    }

    @And("^yo hago click en el boton de Save$")
    public void yoHagoClickEnElBotonDeSave() throws MalformedURLException {
        createContactScreen.saveButton.click();
    }

    @Then("^el nuevo contacto (.*) es mostrado$")
    public void elNuevoContactoREMOVEEsMostrado(String expectedResult) {
        Assert.assertTrue("ERROR CONTACTO NO CREADO",mainContactManagerScreen.contactIsCreated(expectedResult));

    }
}
