package customReport;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @autor : eynar.pari
 * @date : 31/10/2020.
 **/



@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                GenerateHTML.class
        }
)
public class ReportSuite {
}
