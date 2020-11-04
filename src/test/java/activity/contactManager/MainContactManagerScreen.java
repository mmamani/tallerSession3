package activity.contactManager;

import controlAppium.Button;
import controlAppium.TextBox;
import org.openqa.selenium.By;

/**
 * @autor : eynar.pari
 * @date : 17/10/2020.
 **/
public class MainContactManagerScreen {
    public Button addContactButton = new Button(By.id("com.example.android.contactmanager:id/addContactButton"));

    public MainContactManagerScreen(){}

    public boolean contactIsCreated(String nameContact){
        TextBox contact = new TextBox(By.xpath("//android.widget.TextView[@text='"+nameContact+"']"));
        return contact.isControlDisplayed();
    }


}
