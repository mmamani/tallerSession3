package activity.calculator;

import controlAppium.Button;
import controlAppium.TextBox;
import org.openqa.selenium.By;

/**
 * @autor : eynar.pari
 * @date : 17/10/2020.
 **/
public class MainCalculatorScreen {
    public Button oneButton = new Button(By.id("com.android.calculator2:id/digit_1"));
    public Button twoButton = new Button(By.id("com.android.calculator2:id/digit_2"));
    public Button plusButton = new Button(By.id("com.android.calculator2:id/op_add"));
    public Button equalButton = new Button(By.id("com.android.calculator2:id/eq"));
    public TextBox resultTextBox = new TextBox(By.id("com.android.calculator2:id/formula"));
    public MainCalculatorScreen(){
    }
}
