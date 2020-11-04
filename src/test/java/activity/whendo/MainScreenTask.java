package activity.whendo;

import controlAppium.Button;
import controlAppium.Label;
import org.openqa.selenium.By;

/**
 * @autor : eynar.pari
 * @date : 31/10/2020.
 **/
public class MainScreenTask {
    public Button  addButton = new Button(By.id("com.vrproductiveapps.whendo:id/fab"));

    public MainScreenTask(){}

    public boolean isDisplayedTheNote(String value){
        Label taskLabel= new Label(By.xpath("//android.widget.TextView[@text='"+value+"']"));
        return taskLabel.isControlDisplayed();
    }
}
