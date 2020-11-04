package customReport;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * @autor : eynar.pari
 * @date : 31/10/2020.
 **/
public class RunnerGradle {
    public static void main (String[]args){
        Result result= JUnitCore.runClasses(ReportSuite.class);

        for (Failure failure:result.getFailures()
             ) {
            System.out.println("ERROR el reporte no fue generado");
        }

        System.out.println("REPORT GENERATOR");
    }

}
