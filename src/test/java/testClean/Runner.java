package testClean;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import session.Session;

import java.net.MalformedURLException;

/**
 * @autor : eynar.pari
 * @date : 24/10/2020.
 **/
@RunWith(Cucumber.class)
public class Runner {

    // HOOKS ---- cucumber
    @Before
    public void beforeCucumber(){
        System.out.println(" ---- Before cucumber ----");
    }

    @After
    public void afterCucumber(Scenario scenario) throws MalformedURLException {
          // screenshot movile app
        if (scenario.isFailed()){
            byte[] screenShoot=Session.getInstance().getDriver().getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenShoot,"image/png");
        }

        System.out.println(" ---- After cucumber ----");
        Session.getInstance().killSession();
    }


}
