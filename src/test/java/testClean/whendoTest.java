package testClean;

import activity.whendo.CreateTask;
import activity.whendo.MainTaskScreen;
import org.junit.After;
import org.junit.Test;
import session.Session;

import java.net.MalformedURLException;

public class whendoTest {

    CreateTask createTask = new CreateTask();
    MainTaskScreen mainTaskScreen = new MainTaskScreen();

    @Test
    public void verifyAddTask() throws MalformedURLException{
        mainTaskScreen.addTaskButton.click();
        createTask.titleTextBox.type("NOTA1");
        createTask.noteTextBox.type("NOTE1");
        createTask.saveButton.click();

    }

    @After
    public void after() throws MalformedURLException {
        Session.getInstance().killSession();
    }
}
