package session;

import factoryDevices.FactoryDevices;
import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;

/**
 * @autor : eynar.pari
 * @date : 17/10/2020.
 **/
public class Session {
    //1 attributo de la misma instancia
    private static Session mySession=null;
    private AppiumDriver driver;

    //2 contructor privado -  NO publico
    private Session() throws MalformedURLException {
        driver = FactoryDevices.make("android").create();
    }

    //3 metodo statico publico para el acceso a la instancia
    public static Session getInstance() throws MalformedURLException {
        if (mySession == null) {
            mySession = new Session();
        }

        return mySession;
    }

    public AppiumDriver getDriver(){
        return driver;
    }

    public void killSession(){
        driver.quit();
        mySession=null;
    }

}