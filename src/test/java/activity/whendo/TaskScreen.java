package activity.whendo;

import controlAppium.Button;
import controlAppium.TextBox;
import org.openqa.selenium.By;

/**
 * @autor : eynar.pari
 * @date : 31/10/2020.
 **/
public class TaskScreen {
    public TextBox titleTextBox= new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
    public TextBox notesTextBox= new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextNotes"));
    public Button saveButton = new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));

    public TaskScreen(){}

}

