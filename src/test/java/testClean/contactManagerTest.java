package testClean;

import activity.contactManager.CreateContactScreen;
import activity.contactManager.MainContactManagerScreen;
import activity.contactManager.UpdateDialog;
import org.junit.After;
import org.junit.Test;
import session.Session;

import java.net.MalformedURLException;

/**
 * @autor : eynar.pari
 * @date : 17/10/2020.
 **/
public class contactManagerTest {

    CreateContactScreen createContactScreen = new CreateContactScreen();
    MainContactManagerScreen mainContactManagerScreen= new MainContactManagerScreen();
    UpdateDialog updateDialog= new UpdateDialog();

    @Test
    public void verifyAddContact() throws MalformedURLException {
        updateDialog.okButton.click();
        mainContactManagerScreen.addContactButton.click();
        createContactScreen.nameContactTextBox.type("REMOVE");
        createContactScreen.phoneContactTextBox.type("55555555");
        createContactScreen.emailContactTextBox.type("abc@abc.com");
        createContactScreen.saveButton.click();
    }

    @After
    public void after() throws MalformedURLException {
        Session.getInstance().killSession();
    }
}
