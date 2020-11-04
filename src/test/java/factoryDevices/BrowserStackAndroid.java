package factoryDevices;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @autor : eynar.pari
 * @date : 31/10/2020.
 **/
public class BrowserStackAndroid implements  IDevice{

    @Override
    public AppiumDriver create() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();

        // Set your access credentials
        caps.setCapability("browserstack.user", "gamersite1");
        caps.setCapability("browserstack.key", "iq8NKxgpVmPZL7uZeqF5");

        // Set URL of the application under test
        caps.setCapability("app", "bs://668def451fc1aecb17d3dc384e2e088c2f1e54b8");

        // Specify device and os_version for testing
        caps.setCapability("device", "Google Pixel 3");
        caps.setCapability("os_version", "9.0");

        // Set other BrowserStack capabilities
        caps.setCapability("project", "JBGroup Movile");
        caps.setCapability("build", "1.0 Contact Manager");
        caps.setCapability("name", "ContactManager CRUD");


        // Initialise the remote Webdriver using BrowserStack remote URL
        // and desired capabilities defined above
        AppiumDriver driver = new AndroidDriver<AndroidElement>(
                new URL("http://hub.browserstack.com/wd/hub"), caps);

        return  driver;
    }
}
